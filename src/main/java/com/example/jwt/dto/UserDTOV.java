package com.example.jwt.dto;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.jwt.core.User;

public class UserDTOV {

    private Long uid;

    @NotNull(message = "The status is not valid.")
    @Min(value = 0, message = "The status cannot be less than 0 o greather than 1.")
    @Max(1)
    private Integer status;

    @NotNull(message = "The firstName is not valid.")
    @Size(max = 70, message = "The firstName no should be greather than 70 characters.")
    @NotBlank(message = "The firstName is empty.")
    private String firstName;

    @NotNull(message = "The lastName is not valid.")
    @Size(max = 70, message = "The lastName no should be greather than 70 characters.")
    @NotBlank(message = "The lastName is empty.")
    private String lastName;

    @NotNull(message = "The username is not valid.")
    @Size(max = 70, message = "The username no should be greather than 70 characters.")
    @NotBlank(message = "The username is empty.")
    private String username;

    @NotNull(message = "The pasword is not valid.")
    @Size(max = 70, message = "The pasword no should be greather than 70 characters.")
    @NotBlank(message = "The pasword is empty.")
    private String password;

    private Date createDate;

    private Date lastUpdateDate;

    public void copyCoreObject(User object) {
        object.setStatus(status);
        object.setFirstName(firstName);
        object.setLastName(lastName);
        object.setUsername(username);
        object.setPassword(password);
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
