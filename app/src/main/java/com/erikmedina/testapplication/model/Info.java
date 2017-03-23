package com.erikmedina.testapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.realm.RealmObject;

/**
 * Created by erik on 18/03/17.
 */

public class Info extends RealmObject {

  @SerializedName("seed")
  @Expose
  public String seed;
  @SerializedName("resultInfos")
  @Expose
  public int results;
  @SerializedName("page")
  @Expose
  public int page;
  @SerializedName("version")
  @Expose
  public String version;

  public String getSeed() {
    return seed;
  }

  public void setSeed(String seed) {
    this.seed = seed;
  }

  public int getResults() {
    return results;
  }

  public void setResults(int results) {
    this.results = results;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}
