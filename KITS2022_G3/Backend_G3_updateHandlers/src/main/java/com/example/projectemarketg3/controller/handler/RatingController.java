package com.example.projectemarketg3.controller.handler;

import com.example.projectemarketg3.controller.base.BaseController;
import com.example.projectemarketg3.dto.mapper.TestRatingBodyById;
import com.example.projectemarketg3.dto.response.base.BaseResponse;
import com.example.projectemarketg3.dto.request.rating.command.DeleteRatingByIdRequestData;
import com.example.projectemarketg3.dto.request.rating.query.*;
import com.example.projectemarketg3.dto.request.rating.query.ARatingByIdRequestData;
import com.example.projectemarketg3.dto.request.rating.query.GetRatingByStarRequestData;
import com.example.projectemarketg3.dto.response.rating.command.DeleteRatingByIdResponseData;
import com.example.projectemarketg3.dto.response.rating.query.ARatingByIdResponseData;
import com.example.projectemarketg3.dto.response.rating.query.GetAllProductByRatingId;
import com.example.projectemarketg3.dto.response.rating.query.GetRatingByStarResponseData;
import com.example.projectemarketg3.dto.response.rating.query.RatingGetIdResponseData;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rating")
@AllArgsConstructor
public class RatingController extends BaseController {

    @GetMapping("/product/{id}")
    public ResponseEntity<BaseResponse<RatingGetIdResponseData>> getAllRatingProduct(@PathVariable Long id) {
        return executeQuery(new RatingGetIdRequestData(id));
    }

    @GetMapping("/{star}/star")
    public ResponseEntity<BaseResponse<GetRatingByStarResponseData>> getAllByStar(@PathVariable Integer star) {
        return executeQuery(new GetRatingByStarRequestData(star));
    }

    @GetMapping
    public ResponseEntity<BaseResponse<GetAllProductByRatingId>> getAllRating() {
        return executeQuery(new GetAllRatingRequestData());
    }

    @DeleteMapping
    public ResponseEntity<BaseResponse<DeleteRatingByIdResponseData>> deleteRatingById(@RequestBody TestRatingBodyById bodyById){
        return executeCommand(new DeleteRatingByIdRequestData(bodyById));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse<ARatingByIdResponseData>> getRatingById(@PathVariable Long id) {
        return executeQuery(new ARatingByIdRequestData(id));
    }

}
