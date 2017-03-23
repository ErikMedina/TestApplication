package com.erikmedina.testapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import java.util.List;

/**
 * Created by erik on 18/03/17.
 */

public class ResultInfo extends RealmObject {

  @PrimaryKey
  private int id;
  @SerializedName("results")
  @Expose
  public RealmList<Result> results;
  @SerializedName("info")
  @Expose
  public Info info;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Result> getResults() {
    return results;
  }

  public void setResults(RealmList<Result> results) {
    this.results = results;
  }

  public Info getInfo() {
    return info;
  }

  public void setInfo(Info info) {
    this.info = info;
  }

  @Override
  public String toString() {
    return "ResultInfo{" +
        "results=" + results +
        ", info=" + info +
        '}';
  }
}
