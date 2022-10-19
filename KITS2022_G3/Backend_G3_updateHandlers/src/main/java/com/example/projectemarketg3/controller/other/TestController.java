package com.example.projectemarketg3.controller.other;

import com.example.projectemarketg3.entity.OrderDetail;
import com.example.projectemarketg3.entity.repository.other.OrderDetailRepository;
import com.example.projectemarketg3.service.other.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private MailService mailService;

    @GetMapping("/order")
    public OrderDetail findByProduct_IdAndUser_Id(){
        return orderDetailRepository.findByProduct_IdAndUser_Id(4L,22L);
    }

    @GetMapping("/sendmail")
    public void sendMail(){
        mailService.send("hangthu14mail@gmail.com", "test mail","content");
    }
}
