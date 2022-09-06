package com.hospital.couragehospital.App;

import com.hospital.couragehospital.model.*;

import java.sql.SQLException;

public class AppController {

  private static AppController appInstance = null;

  private static DBAccess dao;

  public static void setInstance() {
    if(appInstance == null)
      appInstance = new AppController();
  }

  private AppController() {
    try {
      dao = new DBAccess();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
                    //STAFF
  public static void createStaff(String firstname, String lastname, String DoB, String gender, String role, String contact, String Password ) {
    try {
      Staff staff = new Staff(firstname,lastname,DoB, Gender.valueOf(gender), Role.valueOf(role),contact,Password);
      dao.saveStaff(staff);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void createPatient(String aid, String pid, String dt, String tm, String crm, String sp, String dg) {
  }

  public void createStaff(String fname, String lname, String dob, String gd, String rl, String cont, String psd, String cpsd) {
  }


                  //PATIENT
  public static void createPatient(String Name, String dob, Gender gender, int contact, String email, String diagnosis) throws SQLException {
    Patient patient = new Patient(Name,  dob, gender, contact, email, diagnosis);
    dao.savePatient(patient);
  }
  public static void createPatient(String fn, String db, String gd, String cont, String em, String dg){

  }


                        //APPOINTMENT
 public static void createAppointment(String appointId, String patientId, String date, String time, String consultRoom, String specialist, String diagnosis) {
     try {
         Appointment appointment = new Appointment(appointId, patientId, date, time, consultRoom, specialist, diagnosis);
         dao.saveAppointment(appointment);
     } catch (SQLException e ){
         e.printStackTrace();
     }
  }

  //public static void createAppointment(String aid, String pid, String dt, String tm, String crm, String sp, String dg) {
  //}


                //PHARMACY

  public static void createPharmacy(String drugId, String drugName, String manuDate, String expDate, String drugInStock, String drugOutOfStock,String price) {
    try {
      Pharmacy pharmacy = new Pharmacy(drugId,drugName,manuDate, expDate, drugInStock,drugOutOfStock,price);
      dao.savePharmacy(pharmacy);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void createPharmacy(String did,String dnm, String mdate,String edate,int instock,String outstock,String prc) {
  }

}
