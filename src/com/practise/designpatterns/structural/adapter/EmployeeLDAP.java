package com.practise.designpatterns.structural.adapter;

public class EmployeeLDAP {


    public EmployeeLDAP(String cid, String fName, String lName, String emailAddress) {
        this.cid = cid;
        this.fName = fName;
        this.lName = lName;
        this.emailAddress = emailAddress;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private String cid;
    private String fName;
    private String lName;
    private String emailAddress;

}
