package com.erikmedina.testapplication.domain.interactor.result;

import com.erikmedina.testapplication.model.ResultInfo;

/**
 * Created by erik on 18/03/17.
 */

public interface GetResultInfoInteractor {

  interface OnGetResultInfoListener {

    void onGetResultInfoSuccess(ResultInfo resultInfo);

    void onGetResultInfoError(String error);
  }

  void execute(int page, int results, OnGetResultInfoListener listener);

}
