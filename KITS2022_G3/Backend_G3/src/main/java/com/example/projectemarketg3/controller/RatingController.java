package com.example.projectemarketg3.controller;

import com.example.projectemarketg3.base.BaseController;
import com.example.projectemarketg3.base.BaseResponse;
import com.example.projectemarketg3.dto.request.rating.GetAllRatingRequest;
import com.example.projectemarketg3.entity.Rating;
import com.example.projectemarketg3.exception.NotFoundException;
import com.example.projectemarketg3.handler.HandlerFactory;
import com.example.projectemarketg3.repository.query.RatingRepository;
import com.example.projectemarketg3.service.rating.RatingServiceQuery;
import com.example.projectemarketg3.service.rating.RatingServiceQueryImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rating")
@AllArgsConstructor
public class RatingController extends BaseController {

    @Autowired
    private RatingRepository ratingRepository;

    private final HandlerFactory handlerFactory;
private final RatingServiceQuery serviceQuery;

private final RatingServiceQueryImpl serviceQueryImpl;

    //    LAY RA DANH GIA CUA SAN PHAM THEO ID VA DA DUOC ADMIN PUBLIC
    @GetMapping("/product/{id}")
    public ResponseEntity<?> getAllRatingProduct(@PathVariable Long id) {
        List<Rating> ratings = ratingRepository.findByProduct_IdOrderByCreateAtDesc(id);
        List<Rating> ratingList = new ArrayList<>();
        for (Rating r : ratings
        ) {
            if (r.getChecking()) {
                ratingList.add(r);
            }
        }
        return ResponseEntity.ok(ratingList);
    }

    // get all rating rest api
    @GetMapping
    public ResponseEntity<BaseResponse> getAllRating() {
//        return ratingRepository.findAll();
//        return ratingRepository.getByOrderByCreateAtDesc();

        GetAllRatingRequest request = new GetAllRatingRequest();
        return execute(request);
    }

    // get rating by ID rest api
    @GetMapping("/{id}")
    public ResponseEntity<Rating> getRatingById(@PathVariable Long id) {
        Rating rating = ratingRepository.findById(id)
                .orElseThrow(() -> new NotFoundException
                        ("rating not exist with id :" + id));
        return ResponseEntity.ok(rating);
    }


    //    Get product star
    @GetMapping("/{star}/star")
    public List<Rating> getAllByStar(@PathVariable Integer star) {
        return ratingRepository.getByStarOrderByCreateAtDesc(star);
    }

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
