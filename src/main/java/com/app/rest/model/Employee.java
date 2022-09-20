package com.app.rest.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// import javax.persistence.*;

@Entity // The class is a persistant Java class
@Table(name = "employee") // Denote the name of the table in db
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="staffId") // Denote the name of the column in db
    private Integer staffId;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="contactNo")
    private String contactNo;
    @Column(name="password")
    private String password;
    @Column(name="role")
    private String role;
    @Column(name="status")
    private String status;
    @Column(name="isPerm")
    private Short isPerm;
    @Column(name="feesDue")
    private BigDecimal feesDue;

    public Employee() {
    }

    public Employee(String name, String email, String contactNo, String password, String role, String status,
    Short isPerm, BigDecimal feesDue) {
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.password = password;
        this.role = role;
        this.status = status;
        this.isPerm = isPerm;
        this.feesDue = feesDue;
    }

    public Employee(Integer staffId, String name, String email, String contactNo, String password, String role,
            String status, Short isPerm, BigDecimal feesDue) {
        this.staffId = staffId;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.password = password;
        this.role = role;
        this.status = status;
        this.isPerm = isPerm;
        this.feesDue = feesDue;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public Short getIsPerm() {
        return isPerm;
    }

    public BigDecimal getFeesDue() {
        return feesDue;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIsPerm(Short isPerm) {
        this.isPerm = isPerm;
    }

    public void setFeesDue(BigDecimal feesDue) {
        this.feesDue = feesDue;
    }

    @Override
    public String toString() {
        return "Employee [contactNo=" + contactNo + ", email=" + email + ", feesDue=" + feesDue + ", isPerm=" + isPerm
                + ", name=" + name + ", password=" + password + ", role=" + role + ", staffId=" + staffId + ", status="
                + status + "]";
    }
}
