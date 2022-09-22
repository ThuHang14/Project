package vn.techmaster.jobhunt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.techmaster.jobhunt.model.Applicant;
import vn.techmaster.jobhunt.model.Skill;
import vn.techmaster.jobhunt.repository.ApplicantRepository;
import vn.techmaster.jobhunt.request.ApplicantRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/applicant")
public class ApplicantController {

    @Autowired
    private ApplicantRepository repo;

    @GetMapping("/list")
    public String homeApplicant(Model model) {
        model.addAttribute("applicants", repo.getAll());
        return "applicant_list";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable String id) {
        repo.removeById(id);
        return "redirect:/applicant/list";
    }

    @GetMapping("/update/{id}")
    public String getUpdateById(Model model, @PathVariable String id) {
        Applicant applicant = repo.getId(id);
        model.addAttribute("upApplicant", applicant);
        model.addAttribute("skill", Skill.values());
        return "applicant_update";
    }

    @PostMapping("/update/{id}")
    public String updateById(@PathVariable String id, @ModelAttribute ApplicantRequest request) {
        Applicant applicantNew = new Applicant(id, request.job_id(), request.name(), request.email(), request.phone(), request.skills());
        repo.update(applicantNew);
        return "redirect:/applicant/list";
    }

    @GetMapping("/add")
    public String homeAdd(Model model) {
        model.addAttribute("applicant", new Applicant());
        model.addAttribute("skill", Skill.values());
        return "applicant_add";
    }

    @PostMapping("/add")
    public String postApplicant(@ModelAttribute ApplicantRequest request, Model model) {
        String id = UUID.randomUUID().toString();
        Applicant applicant = new Applicant(id, request.job_id(), request.name(), request.name(), request.phone(), request.skills());
        repo.addAppli(applicant);
        return "redirect:/applicant/list";
    }


}
