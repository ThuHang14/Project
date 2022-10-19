package com.example.projectemarketg3.dto.request.rating.command;

import com.example.projectemarketg3.dto.request.base.command.RequestDataCommand;
import com.example.projectemarketg3.dto.mapper.TestRatingBodyById;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DeleteRatingByIdRequestData extends RequestDataCommand {
    private TestRatingBodyById TestRatingBodyById;
}
