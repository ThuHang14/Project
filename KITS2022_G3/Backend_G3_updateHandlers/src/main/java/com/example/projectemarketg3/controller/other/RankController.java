package com.example.projectemarketg3.controller.other;

import com.example.projectemarketg3.entity.Ranking;
import com.example.projectemarketg3.entity.repository.other.RankingRepository;
import com.example.projectemarketg3.entity.repository.other.UserRepository;
import com.example.projectemarketg3.service.other.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rank")
public class RankController {

    @Autowired
    private RankingRepository rankingRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @GetMapping
    public List<Ranking> getAllRank(){
        return rankingRepository.findAll();
    }


}
