package com.example.projectemarketg3.dto.response.rating.command;

import com.example.projectemarketg3.dto.response.base.command.ResponseDataCommand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteRatingByIdResponseData extends ResponseDataCommand {
    private HttpStatus httpStatus;
}
