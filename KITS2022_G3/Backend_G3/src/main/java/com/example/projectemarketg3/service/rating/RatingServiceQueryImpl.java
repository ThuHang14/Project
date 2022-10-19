package com.example.projectemarketg3.service.rating;

import com.example.projectemarketg3.entity.Rating;
import com.example.projectemarketg3.repository.ProductRepository;
import com.example.projectemarketg3.repository.query.RatingRepository;
import com.example.projectemarketg3.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RatingServiceQueryImpl implements RatingServiceQuery {
    private final RatingRepository repository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    @Override
    public List<Rating> getStarRatings(int star) {
        return repository.getByStarOrderByCreateAtDesc(star);
    }

    @Override
    public List<Rating> getAll() {
        return repository.findAll();
    }

    @Override
    public Rating newRating(Rating rating) {
        return null;
    }
}
