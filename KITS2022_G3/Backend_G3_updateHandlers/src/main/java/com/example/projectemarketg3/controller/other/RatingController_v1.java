package com.example.projectemarketg3.controller.other;

import com.example.projectemarketg3.entity.Rating;
import com.example.projectemarketg3.entity.repository.query.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rating")
public class RatingController_v1 {
    @Autowired
    private RatingRepository ratingRepository;

    //    Get AVG star of product
    @GetMapping("/avg/{nameProduct}")
    public String getAVGStarOfProduct(@PathVariable String nameProduct) {
        return ratingRepository.getAVGStarOfProduct(nameProduct);
    }

    //    Get Count star of products
    @GetMapping("/count/{nameProduct}")
    public String getCountStarOfProduct(@PathVariable String nameProduct) {
        return ratingRepository.getCountStarOfProduct(nameProduct);
    }


    @GetMapping("/userrating/{nameProduct}")
    public List<Rating> getUserRating(@PathVariable String nameProduct) {
        return ratingRepository.getUserRating(nameProduct);
    }
}
