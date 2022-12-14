package vn.techmaster.jobhunt.request;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public record EmployerRequest(
        String id,

        @Size(min = 5, max = 30, message = "Name must between 5 and 30") String name,

        @NotBlank(message = "Web site cannot null") String website,

        @NotBlank(message = "Email cannot null") @Email(message = "Invalid email") String email,

        MultipartFile logo_path) {
}