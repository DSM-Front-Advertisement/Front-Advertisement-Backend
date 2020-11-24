package front_advertisement_backend.main.services.image;

import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Service
public class ImageServiceImpl implements ImageService {
    @Value("${image.upload.dir}")
    private String imageDirPath;

    @SneakyThrows
    @Override
    public byte[] getImage(Integer adId) {
        InputStream inputStream = new FileInputStream(new File(imageDirPath, String.valueOf(adId)));

        return IOUtils.toByteArray(inputStream);
    }


}
