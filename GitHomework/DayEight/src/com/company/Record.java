package com.company;

/**
 * Created by Serhii_Kobzar on 9/21/2016.
 */
public class Record {
    private String lastName;
    private String name;
    private String middleName;
    private String nickName;
    private String comment;
    private String homePhoneNumber;
    private String firstCellPhoneNumber;
    private String secondCellPhoneNumber;
    private String email;
    private String skype;
    private String registrationDate;
    private String changesName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getFirstCellPhoneNumber() {
        return firstCellPhoneNumber;
    }

    public void setFirstCellPhoneNumber(String firstCellPhoneNumber) {
        this.firstCellPhoneNumber = firstCellPhoneNumber;
    }

    public String getSecondCellPhoneNumber() {
        return secondCellPhoneNumber;
    }

    public void setSecondCellPhoneNumber(String secondCellPhoneNumber) {
        this.secondCellPhoneNumber = secondCellPhoneNumber;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getChangesName() {
        return changesName;
    }

    public void setChangesName(String changesName) {
        this.changesName = changesName;
    }

    @Override
    public String toString() {
        return "Record{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comment='" + comment + '\'' +
                ", homePhoneNumber='" + homePhoneNumber + '\'' +
                ", firstCellPhoneNumber='" + firstCellPhoneNumber + '\'' +
                ", secondCellPhoneNumber='" + secondCellPhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", changesName='" + changesName + '\'' +
                '}';
    }
}
