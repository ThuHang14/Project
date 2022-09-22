package vn.techmaster.jobhunt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import vn.techmaster.jobhunt.exception.photoException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class EmployerService {
    @Value("${upload.path}")
   private String path;

    public String uploadFile(MultipartFile file, String id) throws IOException{
        if(file.isEmpty()){
            throw new photoException("Failed to store empty file");
        }

        String extension = file.getOriginalFilename(); //png
        String newFileName = path + id + "." + extension; // path = abc/213454.png
        try {
            var is = file.getInputStream();
            Files.copy(is, Paths.get(newFileName), StandardCopyOption.REPLACE_EXISTING);
           return id+"."+extension;
            } catch (IOException e) {
            var msg = String.format("Failed to store file %s" , extension);
       throw new photoException(msg,e);


        }
    }

    public void deleteFile(String logoPath){
        String filePathToDelete = path + logoPath;
        try {
            Files.deleteIfExists(Paths.get(filePathToDelete));
        } catch (IOException e) {
            var msg = String.format("Failed to delete  %s", filePathToDelete);
            throw new photoException(msg, e);
        }
    }

}
