package com.example.sizzlingbiteapprebuild.resdetails;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sizzlingbiteapprebuild.R;

import java.util.ArrayList;

public class ResRv2Adapter extends RecyclerView.Adapter<ResRv2Adapter.ResRv2ViewHolder> {

    ArrayList<ResRv2Model> items;

    Application activity;
    Context context;
    String name;
    int price;

    public ResRv2Adapter(ArrayList<ResRv2Model> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ResRv2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.res_rv2_item, parent,
                false);
        return  new ResRv2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResRv2ViewHolder holder, int position) {
        ResRv2Model current = items.get(position);
        holder.text.setText(current.getName());

//        holder.addItem.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                name = current.getName();
//                price = 200;
//
//                ((UpdateSelectedItems) ApplicationMain.getMyContext()).addItems(name, price);
//
//                holder.addItem.setVisibility(View.INVISIBLE);
//                holder.done.setVisibility(View.VISIBLE);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ResRv2ViewHolder extends RecyclerView.ViewHolder {

        private TextView text, price;
        ImageView addItem, done;

        public ResRv2ViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.name_res);
            price = itemView.findViewById(R.id.price_res);
            addItem = itemView.findViewById(R.id.add_item);
            done = itemView.findViewById(R.id.done);
        }
    }
}
