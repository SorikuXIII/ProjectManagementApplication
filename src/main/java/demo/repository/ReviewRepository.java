package demo.repository;

import demo.model.Review;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by poo2 on 06/07/2015.
 */
public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {
    Review findByProjectIdAndDeveloperIdAndSpecialityId(Long idProject,
                                                       Long idDeveloper,
                                                       Long idSpeciality);
}
