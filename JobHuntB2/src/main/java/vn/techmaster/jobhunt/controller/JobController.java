package vn.techmaster.jobhunt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.techmaster.jobhunt.model.City;
import vn.techmaster.jobhunt.model.Job;
import vn.techmaster.jobhunt.repository.JobRepository;
import vn.techmaster.jobhunt.request.JobRequest;

import java.time.LocalDateTime;
import java.util.UUID;

@Controller
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobRepository repo;


    @GetMapping("/list")
    public String listJob(Model model){
        model.addAttribute("countries",City.values());
        model.addAttribute("allJob",repo.listjob());
        return "job_list";
    }

    @GetMapping("/delete/{id}")
    public String deleteJob(@PathVariable String id){
        repo.deleteJobById(id);
        return "redirect:/job/list";
    }

    @GetMapping("/update/{id}")
    public String getUpdateJob(Model model,@PathVariable String id){
        Job job = repo.getById(id);
        model.addAttribute("jobUpdate",job);
        model.addAttribute("jobCity", City.values());
        return "job_update";
    }

    @PostMapping("/update/{id}")
    public String updateJob(@PathVariable String id, @ModelAttribute JobRequest request){
        Job job = new Job(id, request.emp_id(), request.title(), request.description(), request.city(), LocalDateTime.now(),LocalDateTime.now());
        repo.updateJob(job);
        return "redirect:/job/list";
    }

    @GetMapping("/add")
    public String createNewJob(Model model){
        model.addAttribute("addJob",new Job());
        model.addAttribute("location",City.values());
        return "job_add";
    }

    @PostMapping("/add")
    public String addNewJob(@ModelAttribute JobRequest request,@RequestBody City city){
        String uuid = UUID.randomUUID().toString();
        Job job = new Job(uuid, request.emp_id(), request.title(), request.description(), city,LocalDateTime.now(),LocalDateTime.now());
        repo.addJob(job);
        return "redirect:/job/list";
    }





}
