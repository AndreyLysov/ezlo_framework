package com.ezlo.automation.framework.model.ezlo;

import java.util.HashMap;
import java.util.Objects;

//@XStreamAlias("contacts")
//@Entity
//@Table(name = "addressbook")
public class CustomerData {
    //  @XStreamOmitField
    //  @Id
    //  @Column(name = "id")
    private int id = Integer.MAX_VALUE;
    //    @Expose
    private String serverName;
    //      @Expose
//      @Column(name = "name")
    private String name;
    //      @Expose
    //  @Column(name = "email")
    //  @Type(type = "text")
    private String email;
    //      @Expose
    //  @Column(name = "phone")
    //  @Type(type = "text")
    private String phone;
    //      @Expose
    //  @Column(name = "address")
    //  @Type(type = "text")
    private String address;
    //      @Expose
    //  @Column(name = "ocs.db.pass")
    private String password;
    //      @Expose
    //  @Column(name = "confirmPassword")
    private String confirmPassword;

    public CustomerData() {
    }

    public CustomerData(HashMap<String, String> customer) {
        this.serverName = customer.get("serverName");
        this.name = customer.get("name");
        this.email = customer.get("email");
        this.phone = customer.get("phone");
        this.address = customer.get("address");
        this.password = customer.get("ocs.db.pass");
        this.confirmPassword = customer.get("confirmPassword");
    }

    public int getId() {
        return id;
    }

    public CustomerData withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomerData withName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CustomerData withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CustomerData withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CustomerData withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CustomerData withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public CustomerData withConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    public String getServerName() {
        return serverName;
    }

    public CustomerData withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    @Override
    public String toString() {
        return "CustomerData{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerData that = (CustomerData) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phone);
    }

}

