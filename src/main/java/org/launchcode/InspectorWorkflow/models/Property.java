package org.launchcode.InspectorWorkflow.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Property {

    @Id
    @GeneratedValue
    private int propertyId;

    @NotBlank(message = "Street Address is required")
    @Size(min = 3, max = 255, message="Street Address must be between 3 and 255 characters")
    private String streetAddress;

    @NotBlank(message = "City is required")
    @Size(min = 3, max = 255, message="City must be between 3 and 255 characters")
    private String city;

    @NotBlank(message = "State is required")
    @Size(min = 2, max = 2, message="State must be 2 characters")
    private String state;

    @NotBlank(message = "Zip Code is required")
    @Size(min = 5, max = 5, message="Zip Code must be 5 characters")
    private Integer zipCode;

    @NotBlank(message = "Inspector Name is required")
    @Size(min = 3, message="Inspector Name must be at least 3 characters")
    private String inspector;

    public Property(String streetAddress, String city, String state, Integer zipCode, String inspector) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.inspector = inspector;
    }

    public Property() {}

    public Integer getPropertyId() {
        return propertyId;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }
}
