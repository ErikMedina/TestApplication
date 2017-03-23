package com.erikmedina.testapplication.ui.main.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.erikmedina.testapplication.R;
import com.erikmedina.testapplication.model.Result;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by erik on 18/03/17.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

  public interface OnItemListener {

    void onRemoveItemListener(int position);

  }

  private List<Result> results;

  private Context context;
  private final OnItemListener onItemListener;
  public UserAdapter(Context context, OnItemListener listener) {
    this.context = context;
    results = new ArrayList<>();
    onItemListener = listener;
  }

  public void setResults(List<Result> results) {
    this.results = results;
    notifyDataSetChanged();
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
    return new ViewHolder(view, context);
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    holder.bind(onItemListener);
    Result result = results.get(position);
    holder.tvName.setText(result.getName().getFirst());
    holder.tvEmail.setText(result.getEmail());
    holder.tvPhone.setText(result.getPhone());
  }

  @Override
  public int getItemCount() {
    return results.size();
  }

  static class ViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.card)
    RelativeLayout card;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_email)
    TextView tvEmail;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.b_remove_user)
    Button bRemoveUser;
    @BindView(R.id.b_favourite)
    Button bFavouriteUser;
    Context context;

    public ViewHolder(View itemView, Context context) {
      super(itemView);
      ButterKnife.bind(this, itemView);
      this.context = context;
    }

    public void bind( final OnItemListener onItemListener) {
      bRemoveUser.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
              onItemListener.onRemoveItemListener(getAdapterPosition());
          }
      });
      bFavouriteUser.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
          itemView.setBackgroundColor(ContextCompat.getColor(context, R.color.green));
        }
      });
    }
  }
}
