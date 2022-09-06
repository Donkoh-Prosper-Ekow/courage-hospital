package com.hospital.couragehospital.model;

import java.sql.Timestamp;
import java.util.Date;

public class Staff {
  private String firstname;
  private String lastname;
  private Gender gender;
  private String DoB;
  private Role role;
  private int contact;
  private String Password;
  private String sid;

  public Staff(String firstname, String lastname, String doB, Gender valueOf, Role role, String contact, String password) {}

  public Staff (String sid, String firstname,String lastname, Gender gender, String DoB,Role role, int contact, String password){
    this.firstname = firstname;
    this.lastname = lastname;
    this.gender = gender;
    this.role = role;
    this.contact = contact;
    this.DoB = DoB;
    this.sid=sid;
  }

  public Staff(String firstname, String lastname, String doB, Gender valueOf, Role role, int contact, String password) {
  }

  public Staff() {

  }

  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getDoB() {
    return DoB;
  }

  public void setDoB(String doB) {
    DoB = doB;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public int getContact() {
    return contact;
  }

  public void setContact(int contact) {
    this.contact = contact;
  }

  public String getPassword() {
    return Password;
  }

  public void setPassword(String password) {
    Password = password;
  }



  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }



  @Override
  public String toString() {
    return "Staff{" +
        ", firstname='" + firstname + '\'' +
        ", lastname='" + lastname + '\'' +
        ", gender=" + gender +
        ", role=" + role +
        ", date of birth=" + DoB +
        ", contact='" + contact + '\'' +
        ", Password=" + Password +
        '}';
  }
}
