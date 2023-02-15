package com.okta.developer.ADP_Capstone.FormI9.Section1.entity;

//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "section1")
@EntityListeners(AuditingEntityListener.class)
public class Section1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long section1_id;
    private String employee_Fname;
    private String employee_Lname;
    private String employee_MI;
    private String employee_Oname;
    private String employee_Address;
    private int employee_AptNum;
    private String employee_City;
    private String employee_State;
    private String employee_Zip;

    private String employee_DOB;
   private String employee_SSN;
    private String employee_Email;
    private String employee_Phone;

    private int employee_Attestation;
    private int USCISnum;
    private String expirationDate;
    private int formI94_AdmissionNum;
    private int foreignPassportNum;
    private int countryOfInsuance;

    private String preparerCert;

    private String employee_ESign;
    private String preparerLname;
    private String preparerFname;
    private String preparer_Address;
    private String preparer_City;
    private String preparer_State;
    private String preparer_Zip;
    @CreatedDate
    private Date created_At;
    @LastModifiedDate
    private Date modified_At;

    public Section1() {

    }

    public Section1(String employee_Fname, String employee_Lname,
                    String employee_MI, String employee_Oname,
                    String employee_Address, int employee_AptNum, String employee_City,
                    String employee_State, String employee_Zip, String employee_DOB,
                    String employee_SSN, String employee_Email, String employee_Phone,
                    int employee_Attestation, String expirationDate,
                    int USCISnum, int formI94_AdmissionNum,
                    String employee_ESign, String preparerLname,
                    String preparerFname, String preparer_Address,
                    String preparer_City, String preparer_State,
                    String preparer_Zip) {
        this.employee_Fname = employee_Fname;
        this.employee_Lname = employee_Lname;
        this.employee_MI = employee_MI;
        this.employee_Oname = employee_Oname;
        this.employee_Address = employee_Address;
        this.employee_AptNum = employee_AptNum;
        this.employee_City = employee_City;
        this.employee_State = employee_State;
        this.employee_Zip = employee_Zip;
        this.employee_DOB = employee_DOB;
        this.employee_SSN = employee_SSN;
        this.employee_Email = employee_Email;
        this.employee_Phone = employee_Phone;
        this.employee_Attestation = employee_Attestation;
        this.expirationDate = expirationDate;
        this.USCISnum = USCISnum;
        this.formI94_AdmissionNum = formI94_AdmissionNum;
        this.employee_ESign = employee_ESign;
        this.preparerLname = preparerLname;
        this.preparerFname = preparerFname;
        this.preparer_Address = preparer_Address;
        this.preparer_City = preparer_City;
        this.preparer_State = preparer_State;
        this.preparer_Zip = preparer_Zip;
    }

    public void setEmployee_SSN(String employee_SSN){
         this.employee_SSN = employee_SSN;
    }

    public String getEmployee_Fname() {
        return employee_Fname;
    }

    public void setEmployee_Fname(String employee_Fname) {
        this.employee_Fname = employee_Fname;
    }

    public String getEmployee_Lname() {
        return employee_Lname;
    }

    public void setEmployee_Lname(String employee_Lname) {
        this.employee_Lname = employee_Lname;
    }

    public String getEmployee_MI() {
        return employee_MI;
    }

    public void setEmployee_MI(String employee_MI) {
        this.employee_MI = employee_MI;
    }

    public String getEmployee_Oname() {
        return employee_Oname;
    }

    public void setEmployee_Oname(String employee_Oname) {
        this.employee_Oname = employee_Oname;
    }

    public String getEmployee_Address() {
        return employee_Address;
    }

    public void setEmployee_Address(String employee_Address) {
        this.employee_Address = employee_Address;
    }

    public int getEmployee_AptNum() {
        return employee_AptNum;
    }

    public void setEmployee_AptNum(int employee_AptNum) {
        this.employee_AptNum = employee_AptNum;
    }

    public String getEmployee_City() {
        return employee_City;
    }

    public void setEmployee_City(String employee_City) {
        this.employee_City = employee_City;
    }

    public String getEmployee_State() {
        return employee_State;
    }

    public void setEmployee_State(String employee_State) {
        this.employee_State = employee_State;
    }

    public String getEmployee_Zip() {
        return employee_Zip;
    }

    public void setEmployee_Zip(String employee_Zip) {
        this.employee_Zip = employee_Zip;
    }

    public String getEmployee_DOB() {
        return employee_DOB;
    }

    public void setEmployee_DOB(String employee_DOB) {
        this.employee_DOB = employee_DOB;
    }

    public String getEmployee_SSN() {
        return employee_SSN;
    }

    public String getEmployee_Email() {
        return employee_Email;
    }

    public void setEmployee_Email(String employee_Email) {
        this.employee_Email = employee_Email;
    }

    public String getEmployee_Phone() {
        return employee_Phone;
    }

    public void setEmployee_Phone(String employee_Phone) {
        this.employee_Phone = employee_Phone;
    }

    public int getEmployee_Attestation() {
        return employee_Attestation;
    }

    public void setEmployee_Attestation(int employee_Attestation) {
        this.employee_Attestation = employee_Attestation;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getUSCISnum() {
        return USCISnum;
    }

    public void setUSCISnum(int USCISnum) {
        this.USCISnum = USCISnum;
    }

    public int getFormI94_AdmissionNum() {
        return formI94_AdmissionNum;
    }

    public void setFormI94_AdmissionNum(int formI94_AdmissionNum) {
        this.formI94_AdmissionNum = formI94_AdmissionNum;
    }

    public String getEmployee_ESign() {
        return employee_ESign;
    }

    public void setEmployee_ESign(String employee_ESign) {
        this.employee_ESign = employee_ESign;
    }

    public String getPreparerLname() {
        return preparerLname;
    }

    public void setPreparerLname(String preparerLname) {
        this.preparerLname = preparerLname;
    }

    public String getPreparerFname() {
        return preparerFname;
    }

    public void setPreparerFname(String preparerFname) {
        this.preparerFname = preparerFname;
    }

    public String getPreparer_Address() {
        return preparer_Address;
    }

    public void setPreparer_Address(String preparer_Address) {
        this.preparer_Address = preparer_Address;
    }

    public String getPreparer_City() {
        return preparer_City;
    }

    public void setPreparer_City(String preparer_City) {
        this.preparer_City = preparer_City;
    }

    public String getPreparer_State() {
        return preparer_State;
    }

    public void setPreparer_State(String preparer_State) {
        this.preparer_State = preparer_State;
    }

    public String getPreparer_Zip() {
        return preparer_Zip;
    }

    public void setPreparer_Zip(String preparer_Zip) {
        this.preparer_Zip = preparer_Zip;
    }

    public Long getSection1_id() {
        return section1_id;
    }

    public void setSection1_id(Long section1_id) {
        this.section1_id = section1_id;
    }
}
