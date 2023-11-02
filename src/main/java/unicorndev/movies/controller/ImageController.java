package unicorndev.movies.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;



@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class ImageController {

    private final ResourceLoader resourceLoader;

    @Autowired
    public ImageController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @GetMapping("/images/{fileName:.+}")
    public ResponseEntity<Resource> getImage(@PathVariable String fileName) {
        Resource file = resourceLoader.getResource("classpath:images/" + fileName);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.IMAGE_JPEG_VALUE)
                .body(file);
    }
}


