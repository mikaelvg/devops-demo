package ph.devops.ms.configclientsample;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/rest")
@RestController
@RefreshScope
public class MessageResource {

    @Value("${message:Resource Not loaded}")
    private String message;

    @GetMapping("/message")
    public String message() {
        return  message;
    }

}
