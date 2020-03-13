package org.launchcode.InspectorWorkflow.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Inspector {

    @Entity
    public class User {

        @Id
        @GeneratedValue
        private int propertyId;

        @NotBlank(message = "User Name is required")
        @Size(min = 8, max = 8, message = "User name must be 8 characters")
        private String userName;

        @NotBlank(message = "Password is required")
        @Size(min = 12, max = 12, message = "Password must be 12 characters")
        private String password;

        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        public User() {
        }

        public int getPropertyId() {
            return propertyId;
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
}
