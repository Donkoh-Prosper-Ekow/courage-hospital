package com.hospital.couragehospital.model;

//import com.momo.momoappfx.model.MomoTransaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBAccess {
  private final String CONNECTIONDRIVER = "com.mysql.cj.jdbc.Driver";
  private final String DBNAME = "db_couragehospital";
  private final String USERNAME = "root";
  private final String PASSWORD = "Men2802200123";
  private final String HOST = "localhost";

  private Connection connection = null;
  private PreparedStatement prepStatement = null;
  private ResultSet resultSet = null;

  public DBAccess() throws Exception {
    Class.forName(CONNECTIONDRIVER);
    connection = DriverManager.getConnection(getUrl());
  }

  private String getUrl() {
    return "jdbc:mysql://" + USERNAME + ":" + PASSWORD + "@" + HOST + "/" + DBNAME;
  }

  private void close() throws Exception {
    if (!connection.equals(null))
      connection.close();

    if (!prepStatement.equals(null))
      prepStatement.close();

    if (!resultSet.equals(null))
      resultSet.close();
  }



                                    /////////////////////////STAFF
  public int saveStaff(Staff staff) throws SQLException {
    String query = "INSERT INTO staff(firstname,lastname,dob, gender, role, contact, password, confirmpsd) values(?, ?, ?, ?, ?, ?, ?)";
    prepStatement = connection.prepareStatement(query);
    prepStatement.setString(1, staff.getFirstname());
    prepStatement.setString(2, staff.getLastname());
    prepStatement.setString(3, staff.getDoB());
    prepStatement.setString(4, staff.getGender().toString());
    prepStatement.setString(5, staff.getRole().toString());
    prepStatement.setInt(6, staff.getContact());
    prepStatement.setString(7, staff.getPassword());
    return prepStatement.executeUpdate();
  }


  public List<Staff> findAllStaffs() throws SQLException {
    String query = "SELECT * FROM staff";
    prepStatement = connection.prepareStatement(query);
    resultSet = prepStatement.executeQuery();
    return getStaffs();
  }


  private List<Staff> getStaffs() throws SQLException {
    List<Staff> listStaff = new ArrayList<>();
    while (resultSet.next()) {

      Staff staff = new Staff();
      staff.setSid(resultSet.getString("staffId"));
      staff.setFirstname(resultSet.getString("firstname"));
      staff.setLastname(resultSet.getString("lastname"));
      staff.setDoB(resultSet.getString("DoB"));
      staff.setGender(Gender.valueOf(resultSet.getString("gender")));
      staff.setRole(Role.valueOf(resultSet.getString("role")));
      staff.setContact(resultSet.getInt("contact"));
      staff.setPassword(resultSet.getString("password"));


      listStaff.add(staff);
    }
    return listStaff;
  }





  //////////////////////////PHARMACY

  public void savePharmacy(Pharmacy pharmacy) throws SQLException {
    String query = "INSERT INTO pharmacy(drugId,drugName,manuDate, expDate, drugInStock,drugOutOfStock,price) values(?, ?, ?, ?, ?, ?, ?)";
    prepStatement = connection.prepareStatement(query);
    prepStatement.setString(1, pharmacy.getDrugId());
    prepStatement.setString(2, pharmacy.getDrugName());
    prepStatement.setString(3, pharmacy.getManuDate());
    prepStatement.setString(4, pharmacy.getExpDate());
    prepStatement.setString(5, pharmacy.getDrugInStock());
    prepStatement.setString(6, pharmacy.getDrugOutOfStock());
    prepStatement.setString(7, pharmacy.getPrice());
    prepStatement.executeUpdate();
  }

  public List<Pharmacy> findAllPharmacys() throws SQLException {
    String query = "SELECT * FROM pharmacy";
    prepStatement = connection.prepareStatement(query);
    resultSet = prepStatement.executeQuery();
    return getPharmacys();
  }
  private List<Pharmacy> getPharmacys() throws SQLException {
    List<Pharmacy> listStaff = new ArrayList<>();
    List<Pharmacy> listPharmacy = null;
    while (resultSet.next()) {

      Pharmacy pharmacy = new Pharmacy();
      pharmacy.setDrugId(resultSet.getString("drugId"));
      pharmacy.setDrugName(resultSet.getString("drugName"));
      pharmacy.setManuDate(resultSet.getString("manuDate"));
      pharmacy.setExpDate(resultSet.getString("expDate"));
      pharmacy.setDrugInStock(resultSet.getString("drugInStock"));
      pharmacy.setDrugOutOfStock(resultSet.getString("drugOutOfStock"));
      pharmacy.setPrice(resultSet.getString("price"));

      listPharmacy.add(pharmacy);
    }
    return listPharmacy;
  }


  ///////////////////////PATIENT

  public void savePatient(Patient patient) throws SQLException{
    String query = "INSERT INTO patient(name,dob, gender, contact, email, diagnosis) values(?, ?, ?, ?, ?, ?)";
    prepStatement = connection.prepareStatement(query);
    prepStatement.setString(1, patient.getName());
    prepStatement.setString(2, patient.getDob());
    prepStatement.setString(3, patient.getGender().toString());
    prepStatement.setInt(4, patient.getContact());
    prepStatement.setString(5, patient.getEmail());
    prepStatement.setString(6, patient.getDiagnosis());
    prepStatement.executeUpdate();
  }

  public List<Patient> findAllPatients() throws SQLException {
    String query = "SELECT * FROM patient";
    prepStatement = connection.prepareStatement(query);
    resultSet = prepStatement.executeQuery();
    return getPatients();
  }
  private List<Patient> getPatients() throws SQLException {
    List<Patient> listPatient = new ArrayList<>();
    List<Patient> listPatients = null;
    while (resultSet.next()) {


      Patient patient = new Patient();
      patient.setName(resultSet.getString("name"));
      patient.setDob(resultSet.getString("dob"));
      patient.setGender(Gender.valueOf(resultSet.getString("gender")));
      patient.setContact(resultSet.getInt("contact"));
      patient.setEmail(resultSet.getString("email"));
      patient.setDiagnosis(resultSet.getString("diagnosis"));



      listPatient.add(patient);
    }
    return listPatient;
  }


              //////Appointment

  public void saveAppointment(Appointment appointment) throws SQLException {
    String query = "INSERT INTO appointment_tb(appointId,patId, date, time, consultRm, special, diagnosis) values(?, ?, ?, ?, ?, ?)";
    prepStatement = connection.prepareStatement(query);
    prepStatement.setString(1, appointment.getAppointId());
    prepStatement.setString(2, appointment.getPatientId());
    prepStatement.setString(3, appointment.getDate());
    prepStatement.setString(4, appointment.getTime());
    prepStatement.setString(5, appointment.getConsultRoom());
    prepStatement.setString(6, appointment.getSpecialist());
    prepStatement.setString(6, appointment.getDiagnosis());
    prepStatement.executeUpdate();
  }

  public List<Appointment> findAllAppointments() throws SQLException {
    String query = "SELECT * FROM appointment_td";
    prepStatement = connection.prepareStatement(query);
    resultSet = prepStatement.executeQuery();
    return getAppointments();
  }

  private List<Appointment> getAppointments() throws SQLException {
    List<Appointment> listAppointment = new ArrayList<>();
    List<Appointment> listAppointments = null;
    while (resultSet.next()) {


      Appointment appointment = new Appointment();
      appointment.setAppointId(resultSet.getString("appointId"));
      appointment.setPatientId(resultSet.getString("patId"));
      appointment.setDate(resultSet.getString("date"));
      appointment.setTime(resultSet.getString("time"));
      appointment.setConsultRoom(resultSet.getString("consultRm"));
      appointment.setSpecialist(resultSet.getString("Specialist"));
      appointment.setDiagnosis(resultSet.getString("diagnosis"));



      listAppointment.add(appointment);
    }
    return listAppointment;
  }

}