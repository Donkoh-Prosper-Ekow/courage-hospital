package com.hospital.couragehospital.model;

public class Appointment {
    private String appointId;
    private String patientId;
    private String date;
    private String time;
    private String consultRoom;
    private String specialist;
    private String diagnosis;

    public Appointment(){}

    public Appointment(String appointId, String patientId, String date, String time, String consultRoom, String specialist, String diagnosis){
        this.appointId=appointId;
        this.patientId=patientId;
        this.date=date;
        this.time=time;
        this.consultRoom=consultRoom;
        this.specialist=specialist;
        this.diagnosis=diagnosis;
    }

    public String getAppointId() {return appointId;}

    public void setAppointId(String appointId) {
        this.appointId = appointId;
    }

    public String getPatientId(){return patientId;}

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getConsultRoom() {
        return consultRoom;
    }

    public void setConsultRoom(String consultRoom) {
        this.consultRoom = consultRoom;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                ", appointId='" + appointId + '\'' +
                ", patientId='" + patientId +
                ", date='" + date +
                ", time='" + time +
                ", consultRoom=" + consultRoom +
                ", specialist=" + specialist +
                ", diagnosis='" + diagnosis +
                '}';
    }
}
