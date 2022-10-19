package com.example.projectemarketg3.service.rating;

import com.example.projectemarketg3.entity.Rating;

import java.util.List;

public interface RatingServiceQuery {
    List<Rating> getStarRatings(int star);
    List<Rating> getAll();

    Rating newRating(Rating rating);
}
