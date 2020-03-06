package ph.devops.student.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class EnvDetailsController {

    @Value("${message:Resource Not loaded}")
    private String message;

    @GetMapping("/env")
    public String message() {
        return  message;
    }

}
