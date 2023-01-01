package rocks.zipcode.passion.springbootrender.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import rocks.zipcode.passion.springbootrender.entities.UserSubmission;
import rocks.zipcode.passion.springbootrender.repos.UserSubmissionRepository;
import java.util.List;

@RestController
@RequestMapping("/searchservices")
public class UserSubmissionController {

    @Autowired
    UserSubmissionRepository repository;

 //   ApplicationContext context;
   // UserSubmissionRepository repository = context.getBean(UserSubmissionRepository.class);

/*
    @CrossOrigin
    @GetMapping
    public Iterable<UserSubmission> getServices(){
        return repository.findAll();
    }
*/
//@GetMapping("/api/servicename")
    @CrossOrigin
    @GetMapping
   public List<UserSubmission> getServices(@RequestParam String servicename){
        //System.out.println("I am here" + servicename);
        return repository.findByservicename(servicename);
    }


    @CrossOrigin
    @PostMapping
    public UserSubmission create(@RequestBody UserSubmission usersub) {
        return repository.save(usersub);
    }

}
