package vn.techmaster.jobhunt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.techmaster.jobhunt.model.Applicant;
import vn.techmaster.jobhunt.model.Employer;
import vn.techmaster.jobhunt.repository.ApplicantRepository;
import vn.techmaster.jobhunt.repository.EmployerRepository;

@Controller
public class sendMailController {
    @Autowired
    JavaMailSender javaMailSender;
    @Autowired  private EmployerRepository employerRepository;
    @Autowired  private ApplicantRepository applicantRepository;

    @GetMapping("employer/sendmail/{id}/{email}")
    public String getEmail(@PathVariable String id, Model model){
        Employer employer = employerRepository.getEmployerById(id);
        model.addAttribute("sendmail", employer);
        return "sendmail";
    }

    @GetMapping("/applicant/sendmail/{id}/{email}")
    public String sendmail(Model model,@PathVariable String id){
        Applicant applicant = applicantRepository.getId(id);
        model.addAttribute("sendmail",applicant);
        return "sendMail";
    }

    @RequestMapping("/sendmail")
    public String sendEmail(@RequestParam("email") String to,
                            @RequestParam("subject") String subject,
                            @RequestParam("content") String content
    ){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setSubject(subject);
        msg.setText(content);
        javaMailSender.send(msg);
        return "mail_success";
    }
}
