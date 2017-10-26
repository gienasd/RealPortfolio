package pl.pawelprzystarz.RealPortfolio.models.forms;

import lombok.Data;

@Data
public class ContactForm {
    private String name;
    private String email;
    private String phonenumber;
    private String message;
}
