package edu.wgu.d387_sample_code.model.response;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
@RestController
public class WelcomeController {
    private final DisplayMessage displayMessage;

    public WelcomeController() {
        this.displayMessage = new DisplayMessage(Locale.US);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/welcome")
    public List<String> getWelcomeMessages() {

        String welcomeMessageEn = displayMessage.getWelcomeMessage();

        DisplayMessage displayMessageFr = new DisplayMessage(Locale.CANADA_FRENCH);
        String welcomeMessageFrench = displayMessageFr.getWelcomeMessage();

        return Arrays.asList(welcomeMessageEn, welcomeMessageFrench);
    }
}