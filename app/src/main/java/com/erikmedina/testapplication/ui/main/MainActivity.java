package com.erikmedina.testapplication.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.erikmedina.testapplication.R;
import com.erikmedina.testapplication.model.Result;
import com.erikmedina.testapplication.ui.main.adapter.UserAdapter;
import java.util.List;

public class MainActivity extends AppCompatActivity
    implements MainView {

  MainPresenter presenter;
  Button bMoreResults;
  UserAdapter adapter;
  List<Result> results;
  private int page = 1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    presenter = new MainPresenterImpl(this);
    presenter.getResultInfo(page);
    RecyclerView recycler = (RecyclerView) findViewById(R.id.recycler);
    adapter = new UserAdapter(this, new UserAdapter.OnItemListener() {
      @Override
      public void onRemoveItemListener(int position) {
        removeItem(position);
      }
    });
    recycler.setAdapter(adapter);
    recycler.setLayoutManager(new LinearLayoutManager(this));

    bMoreResults = (Button) findViewById(R.id.b_more_results);
    bMoreResults.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        presenter.getMoreResultInfo(++page);
      }
    });
  }

  private void removeItem(int position) {
    if (position != -1) {
      results.remove(position);
      adapter.notifyItemRemoved(position);
      adapter.notifyItemRangeChanged(position, results.size());
    }
  }

  @Override
  public void setResults(List<Result> results) {
    this.results = results;
    adapter.setResults(this.results);
  }

  @Override
  public void addResults(List<Result> results) {
    for (Result result : results) {
      this.results.add(result);
      adapter.notifyItemInserted(this.results.size());
    }
  }


}
