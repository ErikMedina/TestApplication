package com.erikmedina.testapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.realm.RealmObject;

/**
 * Created by erik on 18/03/17.
 */

public class Picture extends RealmObject {

  @SerializedName("large")
  @Expose
  public String large;
  @SerializedName("medium")
  @Expose
  public String medium;
  @SerializedName("thumbnail")
  @Expose
  public String thumbnail;

  public String getLarge() {
    return large;
  }

  public void setLarge(String large) {
    this.large = large;
  }

  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }
}
