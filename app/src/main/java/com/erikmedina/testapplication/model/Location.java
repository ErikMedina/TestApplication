package com.erikmedina.testapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.realm.RealmObject;

/**
 * Created by erik on 18/03/17.
 */

public class Location extends RealmObject {

  @SerializedName("street")
  @Expose
  public String street;
  @SerializedName("city")
  @Expose
  public String city;
  @SerializedName("state")
  @Expose
  public String state;
  @SerializedName("postcode")
  @Expose
  public String postcode;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }
}
