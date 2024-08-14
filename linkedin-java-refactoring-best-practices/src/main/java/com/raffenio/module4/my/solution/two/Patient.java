package com.raffenio.module4.my.solution.two;

// We have a legacy healthcare application with a Patient class
// that uses primitive data types to represent patient information.
// Refactor the class to use objects instead of primitives.
// You can create a separate object for Name, Demographics, BloodType,
// and ContactInfo.

public class Patient {

    private Name name;

    private Demographics demographics;

    private BloodType bloodType;

    private ContactInfo contactInfo;

    public Patient(Name name, Demographics demographics, BloodType bloodType, ContactInfo contactInfo) {
        this.name = name;
        this.demographics = demographics;
        this.bloodType = bloodType;
        this.contactInfo = contactInfo;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Demographics getDemographics() {
        return demographics;
    }

    public void setDemographics(Demographics demographics) {
        this.demographics = demographics;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}

