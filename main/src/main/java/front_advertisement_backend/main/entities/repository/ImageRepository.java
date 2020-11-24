package front_advertisement_backend.main.entities.repository;

import front_advertisement_backend.main.entities.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import java.util.List;

@Repository
public interface ImageRepository extends CrudRepository<Image, Integer> {
//    void deleteByAdvertisementId(Integer advertisementId);
//    List<Image> findByAdvertisementIdOrderById(Integer advertisementId);
}
