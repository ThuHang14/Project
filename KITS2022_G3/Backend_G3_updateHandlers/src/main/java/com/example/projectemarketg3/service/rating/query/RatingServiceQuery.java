package com.example.projectemarketg3.service.rating.query;

import com.example.projectemarketg3.entity.Rating;
import com.example.projectemarketg3.exception.ErrorMessage;

import java.util.List;

public interface RatingServiceQuery {
    List<Rating> getRatingsByStar(int star);
    List<Rating> getAll();

    List<Rating> getRatingById(Long id);

    Rating getARatingById(long id);


}
