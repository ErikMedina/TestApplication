package com.erikmedina.testapplication.domain.interactor.result;

import com.erikmedina.testapplication.domain.service.ServiceManager;
import com.erikmedina.testapplication.domain.service.WebService;
import com.erikmedina.testapplication.model.ResultInfo;
import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by erik on 18/03/17.
 */

public class GetResultInfoInteractorImpl implements GetResultInfoInteractor {

  private WebService webService;

  public GetResultInfoInteractorImpl() {
    webService = ServiceManager.createWebService();
  }

  @Override
  public void execute(int page, int results, final OnGetResultInfoListener listener) {
    Call<ResultInfo> call = webService.getResultInfo(page, results);
    call.enqueue(new Callback<ResultInfo>() {
      @Override
      public void onResponse(Call<ResultInfo> call, Response<ResultInfo> response) {
        if (response.isSuccessful()) {
          Realm realm = Realm.getDefaultInstance();
          try{
            realm.beginTransaction();
            realm.copyToRealmOrUpdate(response.body());
            realm.commitTransaction();
          }finally {
            realm.close();
          }
          listener.onGetResultInfoSuccess(response.body());
        }
      }

      @Override
      public void onFailure(Call<ResultInfo> call, Throwable t) {
        listener.onGetResultInfoError(t.toString());
      }
    });
  }
}
