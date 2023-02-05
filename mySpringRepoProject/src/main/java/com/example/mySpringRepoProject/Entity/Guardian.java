package com.example.mySpringRepoProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable prevent this Guardian's class from being a table on its own in the database, but
// it take the properties of the Guardian's  class and attach it to the properties of
// whatever class its embedded into

/*
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "guardian_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "guardian_email")
        ),
        @AttributeOverride(
                name = "mobile",
                column = @Column(name = "guardian_mobileNumber")
        )

})

 */
@Embeddable
@Data

public class Guardian {

    @Column(name = "guardian_name")
    private String name;
    @Column(name = "guardian_email")
    private String emailId;
    @Column( name = "guardian_phone_number")
    private String mobile;

    public Guardian() {
    }

    public Guardian(String name, String emailId, String mobile) {
        this.name = name;
        this.emailId = emailId;
        this.mobile = mobile;
    }
}
