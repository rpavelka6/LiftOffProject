package org.launchcode.InspectorWorkflow.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Inspector {

    @Id
    @GeneratedValue
    private int inspectorId;

    @NotBlank
//    @NotNull(message = "User Name is required")
    @Size(min = 8, max = 8, message = "User name must be 8 characters")
    private String userName;

    @NotBlank(message = "Password is required")
    @Size(min = 12, max = 12, message = "Password must be 12 characters")
    private String password;

    public Inspector(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Inspector() {
    }

    public int getInspectorId() {
        return inspectorId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
