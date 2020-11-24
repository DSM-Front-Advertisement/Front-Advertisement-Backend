package front_advertisement_backend.main.entities.repository;

import front_advertisement_backend.main.entities.Enrollment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface EnrollmentRepository extends CrudRepository<Enrollment, Integer> {
    List<Enrollment> findAllByAdvertisementTitleContains(String title);

    Page<Enrollment> findAllBy(Pageable pageable);

    Enrollment findByAdvertisementId(Integer advertisementId);
}
