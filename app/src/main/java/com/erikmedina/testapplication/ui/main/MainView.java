package com.erikmedina.testapplication.ui.main;

import com.erikmedina.testapplication.model.Result;
import java.util.List;

/**
 * Created by erik on 18/03/17.
 */

public interface MainView {

  void setResults(List<Result> results);

  void addResults(List<Result> results);

}
