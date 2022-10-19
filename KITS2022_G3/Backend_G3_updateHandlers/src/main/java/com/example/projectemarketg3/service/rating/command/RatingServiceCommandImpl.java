package com.example.projectemarketg3.service.rating.command;

import com.example.projectemarketg3.entity.repository.query.RatingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RatingServiceCommandImpl implements RatingServiceCommand{
    private final RatingRepository repository;

    @Override
    public void deleteRatingById(Long id) {
        repository.deleteById(id);
    }
}
