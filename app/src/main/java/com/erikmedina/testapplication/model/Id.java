package com.erikmedina.testapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.realm.RealmObject;

/**
 * Created by erik on 18/03/17.
 */

public class Id extends RealmObject{

  @SerializedName("name")
  @Expose
  public String name;
  @SerializedName("value")
  @Expose
  public String value;

}
