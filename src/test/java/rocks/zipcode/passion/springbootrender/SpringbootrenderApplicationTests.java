package rocks.zipcode.passion.springbootrender;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import rocks.zipcode.passion.springbootrender.entities.UserSubmission;
import rocks.zipcode.passion.springbootrender.repos.UserSubmissionRepository;

@SpringBootTest
class SpringbootrenderApplicationTests {

	@Autowired
	ApplicationContext context;
	@Test
	public void saveSubmission() {
		UserSubmissionRepository repository = context.getBean(UserSubmissionRepository.class);
		UserSubmission usersub = new UserSubmission();
		usersub.setPersonName("Tom");
		usersub.setEmailId("Tom@email.com");
		usersub.setservicename("Dental");
		//usersub.setPrice(300d);
		usersub.setPrice(20000d);
		usersub.setProviderName("Wilmington dental");
		usersub.setProviderStreet("895 king st");
		usersub.setProviderCity("Wilmington");
		usersub.setProviderState("DE");
		usersub.setProviderZipcode("19809");
		usersub.setProviderRating("1");
		repository.save(usersub);

/*
		repository.findAll().forEach(p->{
			System.out.println(p);
		});
*/
		//	System.out.println(repository.findByservicename("xray"));

	}

}
