package com.example.projectemarketg3.handler.rating.command;

import com.example.projectemarketg3.dto.mapper.TestRatingBodyById;
import com.example.projectemarketg3.dto.request.rating.command.DeleteRatingByIdRequestData;
import com.example.projectemarketg3.dto.response.rating.command.DeleteRatingByIdResponseData;
import com.example.projectemarketg3.handler.base.HandlerCommand;
import com.example.projectemarketg3.service.rating.command.RatingServiceCommand;
import com.example.projectemarketg3.service.rating.query.RatingServiceQuery;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeleteRatingByIdHandler implements HandlerCommand<DeleteRatingByIdRequestData, DeleteRatingByIdResponseData> {
    private final RatingServiceQuery ratingServiceQuery;
    private final RatingServiceCommand serviceCommand;

    @Override
    public DeleteRatingByIdResponseData handle(DeleteRatingByIdRequestData requestData) {
        TestRatingBodyById test = requestData.getTestRatingBodyById();
//        ratingServiceQuery.getARatingById();
        Long id = test.getId();
        serviceCommand.deleteRatingById(id);
        return new DeleteRatingByIdResponseData(HttpStatus.OK);
    }

}
