package edu.wgu.d387_sample_code.model.response;

import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayMessage {
    private final ResourceBundle resourceBundle;

    public DisplayMessage(Locale locale) {

        // load resource bundle depending on locale
        this.resourceBundle = ResourceBundle.getBundle("Language_Resource", locale);
    }

    public String getWelcomeMessage() {

        // get the message from the bundle
        return resourceBundle.getString("welcome.message");
    }
}