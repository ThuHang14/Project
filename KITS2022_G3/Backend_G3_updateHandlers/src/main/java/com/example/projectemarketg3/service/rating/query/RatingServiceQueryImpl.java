package com.example.projectemarketg3.service.rating.query;

import com.example.projectemarketg3.entity.Rating;
import com.example.projectemarketg3.entity.repository.query.RatingRepository;
import com.example.projectemarketg3.exception.CustomEx;
import com.example.projectemarketg3.utils.ExceptionUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RatingServiceQueryImpl implements RatingServiceQuery {
    private final RatingRepository repository;

    @Override
    public List<Rating> getRatingsByStar(int star) {
        ExceptionUtils.checkIf(0,5,star);
//        ExceptionUtils.checkById(getARatingById(star));
        return repository.getByStarOrderByCreateAtDesc(star);
    }

    @Override
    public List<Rating> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Rating> getRatingById(Long id) {
//        ExceptionUtils.checkById(getARatingById(id));
        return repository.findByProduct_IdOrderByCreateAtDesc(id);
    }

    @Override
    public Rating getARatingById(long id) {
        Rating rating = repository.findById(id).get();
        return rating;
    }
}
