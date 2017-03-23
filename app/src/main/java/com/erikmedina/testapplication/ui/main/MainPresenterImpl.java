package com.erikmedina.testapplication.ui.main;

import com.erikmedina.testapplication.domain.interactor.result.GetResultInfoInteractor;
import com.erikmedina.testapplication.domain.interactor.result.GetResultInfoInteractor.OnGetResultInfoListener;
import com.erikmedina.testapplication.domain.interactor.result.GetResultInfoInteractorImpl;
import com.erikmedina.testapplication.model.ResultInfo;

/**
 * Created by erik on 18/03/17.
 */

class MainPresenterImpl implements MainPresenter {

  private MainView view;
  private GetResultInfoInteractor getResultInfoInteractor;

  public MainPresenterImpl(MainView view) {
    this.view = view;
    getResultInfoInteractor= new GetResultInfoInteractorImpl();
  }

  @Override
  public void getResultInfo(int page) {
    getResultInfoInteractor.execute(page, 40, new OnGetResultInfoListener() {
      @Override
      public void onGetResultInfoSuccess(ResultInfo resultInfo) {
        view.setResults(resultInfo.getResults());

      }

      @Override
      public void onGetResultInfoError(String error) {

      }
    });
  }

  @Override
  public void getMoreResultInfo(int page) {
    getResultInfoInteractor.execute(page, 40, new OnGetResultInfoListener() {
      @Override
      public void onGetResultInfoSuccess(ResultInfo resultInfo) {
        view.addResults(resultInfo.getResults());

      }

      @Override
      public void onGetResultInfoError(String error) {

      }
    });
  }
}
