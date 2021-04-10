package com.example.sizzlingbiteapprebuild.order;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.sizzlingbiteapprebuild.ApplicationMain;
import com.example.sizzlingbiteapprebuild.R;

import java.util.ArrayList;

public class ConfirmOrderActivityAdapter extends RecyclerView.Adapter<ConfirmOrderActivityAdapter.ConfirmOrderViewHolder> {

    ArrayList<OrderListModel> orderListModels;
    Activity activity;

    public ConfirmOrderActivityAdapter(Activity activity) {
        this.orderListModels = ((UpdateSelectedItems) ApplicationMain.getMyContext()).getItems();
        this.activity = activity;
    }


    @NonNull
    @Override
    public ConfirmOrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item, parent, false);
        ConfirmOrderViewHolder covh = new ConfirmOrderViewHolder(view);
        return covh;
    }

    @Override
    public void onBindViewHolder(@NonNull ConfirmOrderViewHolder holder, int position) {
        OrderListModel current = orderListModels.get(position);
        holder.name.setText(current.getName());
    }

    @Override
    public int getItemCount() {
        return orderListModels.size();
    }

    public class ConfirmOrderViewHolder extends RecyclerView.ViewHolder {
        TextView name, price;
        public ConfirmOrderViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_order);
            price = itemView.findViewById(R.id.price);

        }
    }
}
