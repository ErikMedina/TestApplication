package com.erikmedina.testapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.realm.RealmObject;

/**
 * Created by erik on 18/03/17.
 */

public class Name extends RealmObject {

  @SerializedName("title")
  @Expose
  public String title;
  @SerializedName("first")
  @Expose
  public String first;
  @SerializedName("last")
  @Expose
  public String last;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }
}
