package rocks.zipcode.passion.springbootrender.repos;


import org.springframework.data.repository.CrudRepository;

import rocks.zipcode.passion.springbootrender.entities.UserSubmission;
import java.util.List;

public interface UserSubmissionRepository extends CrudRepository<UserSubmission, Integer> {

    List<UserSubmission> findByservicename(String servicename);


}
