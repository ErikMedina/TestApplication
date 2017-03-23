package com.erikmedina.testapplication;

import android.app.Application;
import com.facebook.stetho.Stetho;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;
import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by erik on 18/03/17.
 */

public class MyApplication extends Application{

  @Override
  public void onCreate() {
    super.onCreate();

    configRealm();
    configStetho();
  }

  private void configStetho() {
    Stetho.initialize(
        Stetho.newInitializerBuilder(this)
            .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
            .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
            .build());
  }

  private void configRealm() {
    Realm.init(this);
    RealmConfiguration config = new RealmConfiguration.Builder().build();
    Realm.setDefaultConfiguration(config);
  }
}
