package front_advertisement_backend.main.controllers;

import front_advertisement_backend.main.services.image.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/image")
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;

    @GetMapping(value = "/{advertisementId}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_GIF_VALUE})
    public byte[] getImages(@PathVariable Integer advertisementId) {
        return imageService.getImage(advertisementId);
    }
}
