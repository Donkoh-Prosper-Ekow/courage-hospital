package com.hospital.couragehospital.model;

public class Patient {
    private int patient_id;
    private String Name;
    private String dob;
    private Gender gender;
    private int contact;
    private String email;
    private String diagnosis;

    public Patient() {
    }

    public Patient(String Name, String dob, Gender gender, int contact, String email, String diagnosis) {
        this.Name = Name;
        this.dob = dob;
        this.gender = gender;
        this.contact = contact;
        this.email = email;
        this.diagnosis = diagnosis;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + patient_id +
                ", name='" + Name + '\'' +
                ", date_of_birth=" + dob +
                ", gender=" + gender +
                ", contact=" + contact +
                ", email=" + email +
                ", diagnosis=" + diagnosis +
                '}';
    }
}