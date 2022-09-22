package vn.techmaster.jobhunt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import vn.techmaster.jobhunt.model.Employer;
import vn.techmaster.jobhunt.repository.EmployerRepository;
import vn.techmaster.jobhunt.request.EmployerRequest;
import vn.techmaster.jobhunt.service.EmployerService;

import javax.validation.Valid;
import java.io.IOException;
import java.util.Objects;

@Controller
@RequestMapping("/employer")
public class EmployerController {
    @Autowired
    private EmployerRepository employerRepository;

    @Autowired
    private EmployerService employerService;


    @GetMapping("/list")
    public String employerList(Model model) {
        model.addAttribute("employers", employerRepository.getEmployers());
        return "employer_list";
    }

    @GetMapping("/add")
    public String addEmployer(Model model) {
        model.addAttribute("employer", new Employer());
        return "employer_add";
    }

//    @PostMapping("/add")
//    public String submitAddEmployer(@ModelAttribute EmployerRequest employerRequest) {
//        String id = UUID.randomUUID().toString();
//        Employer employer = new Employer(id, employerRequest.name(), employerRequest.logo_path(),
//                employerRequest.website(), employerRequest.email());
//        employerRepository.createEmployer(employer);
//        return "redirect:/employer/list";
//    }

    @PostMapping(value = "/add", consumes = {"multipart/form-data"})
    public String submitAddEmployer(@Valid @ModelAttribute("employer") EmployerRequest request,
                                    BindingResult result, Model model) {

        System.out.println("RESULT  " + result.toString());
        // valid logo
        if (Objects.requireNonNull(request.logo_path().getOriginalFilename()).isEmpty()) {
            result.addError(new FieldError("employer", "logo_path", "Logo is required"));
        }
        //valid
        if (result.hasErrors()) {
            System.out.println("ERROR: " + result.toString());
            return "employer_add";
        }

        Employer NewEmployer = employerRepository.add(Employer.builder()
                .name(request.name())
                .website(request.website())
                .email(request.email())
                .build());

        //save name logo
        try {
            String logoFileName =  employerService.uploadFile(request.logo_path(), NewEmployer.getId());
            NewEmployer.setLogo_path(logoFileName);
        } catch (IOException e) {
        }
     employerRepository.createEmployer(NewEmployer);
        return "redirect:/employer/list";
    }

    @GetMapping("/update/{id}")
    public String updateEmployer(Model model, @PathVariable String id) {
        Employer employer = employerRepository.getEmployerById(id);
        model.addAttribute("employer", employer);
        return "employer_update";
    }

    @PostMapping("/update/{id}")
    public String submitUpdateEmployer(@PathVariable String id, @ModelAttribute EmployerRequest employerRequest) {
        String logo = employerRepository.getEmployerById(id).getLogo_path();
        Employer employer = new Employer(id, employerRequest.name(),logo, employerRequest.website(), employerRequest.email());
        employerRepository.updateEmployer(employer);
        return "redirect:/employer/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployer(@PathVariable String id) {
        Employer emp = employerRepository.getEmployerById(id);
        employerRepository.deleteEmployerById(id);
        employerService.deleteFile(emp.getLogo_path());
        return "redirect:/employer/list";
    }

}
