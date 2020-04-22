package org.launchcode.InspectorWorkflow.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

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
    private String zipCode;

    @ManyToOne
    private Inspector inspectorId;

    private LocalDate inspectionDate;

    public Property(String streetAddress, String city, String state, String zipCode, Inspector inspectorId, LocalDate inspectionDate) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.inspectorId = inspectorId;
        this.inspectionDate = inspectionDate;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public Inspector getInspectorId() {
        return inspectorId;
    }

    public void setInspectorId(Inspector inspectorId) {
        this.inspectorId = inspectorId;
    }
}
