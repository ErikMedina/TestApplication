package com.erikmedina.testapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.realm.RealmObject;

/**
 * Created by erik on 18/03/17.
 */

public class Result extends RealmObject {

  @SerializedName("gender")
  @Expose
  public String gender;
  @SerializedName("name")
  @Expose
  public Name name;
  @SerializedName("location")
  @Expose
  public Location location;
  @SerializedName("email")
  @Expose
  public String email;
  @SerializedName("login")
  @Expose
  public Login login;
  @SerializedName("dob")
  @Expose
  public String dob;
  @SerializedName("registered")
  @Expose
  public String registered;
  @SerializedName("phone")
  @Expose
  public String phone;
  @SerializedName("cell")
  @Expose
  public String cell;
  @SerializedName("id")
  @Expose
  public Id id;
  @SerializedName("picture")
  @Expose
  public Picture picture;
  @SerializedName("nat")
  @Expose
  public String nat;


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Login getLogin() {
    return login;
  }

  public void setLogin(Login login) {
    this.login = login;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getRegistered() {
    return registered;
  }

  public void setRegistered(String registered) {
    this.registered = registered;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getCell() {
    return cell;
  }

  public void setCell(String cell) {
    this.cell = cell;
  }

  public Id getId() {
    return id;
  }

  public void setId(Id id) {
    this.id = id;
  }

  public Picture getPicture() {
    return picture;
  }

  public void setPicture(Picture picture) {
    this.picture = picture;
  }

  public String getNat() {
    return nat;
  }

  public void setNat(String nat) {
    this.nat = nat;
  }
}
