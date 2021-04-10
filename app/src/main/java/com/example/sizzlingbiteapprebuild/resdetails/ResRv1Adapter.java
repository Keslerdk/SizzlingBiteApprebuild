package com.example.sizzlingbiteapprebuild.resdetails;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sizzlingbiteapprebuild.R;

import java.util.ArrayList;

public class ResRv1Adapter extends RecyclerView.Adapter<ResRv1Adapter.ResRv1ViewHolder> {

    private ArrayList<ResRv1Model> items;
    UpdateRecyclerView updateRecyclerView;
    Activity activity;
    boolean check = true;
    boolean select = true;
    int row_index = -1;

    int pos;

    public ResRv1Adapter(ArrayList<ResRv1Model> items, UpdateRecyclerView updateRecyclerView,
                         Activity activity, int pos) {
        this.items = items;
        this.updateRecyclerView = updateRecyclerView;
        this.activity = activity;
        this.pos = pos;
    }

    @NonNull
    @Override
    public ResRv1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.res_rv1_item,
                parent, false);
        return new ResRv1ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResRv1ViewHolder holder, int position) {
        ResRv1Model current = items.get(position);

        holder.image.setImageResource(current.getImage());
//        holder.text.setText(current.getText());

        if (check) {
            if (pos == 0) {
                ArrayList<ResRv2Model> items = new ArrayList<ResRv2Model>();
                items.add(new ResRv2Model("Burger 1", R.drawable.ic_hamburger_res));
                items.add(new ResRv2Model("Burger 2", R.drawable.ic_hamburger_res));
                items.add(new ResRv2Model("Burger 3", R.drawable.ic_hamburger_res));
                items.add(new ResRv2Model("Burger 4", R.drawable.ic_hamburger_res));
                items.add(new ResRv2Model("Burger 5", R.drawable.ic_hamburger_res));
                items.add(new ResRv2Model("Burger 6", R.drawable.ic_hamburger_res));
                items.add(new ResRv2Model("Burger 8", R.drawable.ic_hamburger_res));
                items.add(new ResRv2Model("Burger 9", R.drawable.ic_hamburger_res));
                items.add(new ResRv2Model("Burger 10", R.drawable.ic_hamburger_res));

                updateRecyclerView.callback(position, items);
                check = false;
            }
            else if (pos==1) {
                ArrayList<ResRv2Model> items = new ArrayList<ResRv2Model>();
                items.add(new ResRv2Model("Pizza 1", R.drawable.ic_pizza_res));
                items.add(new ResRv2Model("Pizza 2", R.drawable.ic_pizza_res));
                items.add(new ResRv2Model("Pizza 3", R.drawable.ic_pizza_res));
                items.add(new ResRv2Model("Pizza 4", R.drawable.ic_pizza_res));
                items.add(new ResRv2Model("Pizza 5", R.drawable.ic_pizza_res));
                items.add(new ResRv2Model("Pizza 6", R.drawable.ic_pizza_res));
                items.add(new ResRv2Model("Pizza 8", R.drawable.ic_pizza_res));
                items.add(new ResRv2Model("Pizza 9", R.drawable.ic_pizza_res));
                items.add(new ResRv2Model("Pizza 10", R.drawable.ic_pizza_res));

                updateRecyclerView.callback(position, items);
                check = false;
            } else if (pos==2) {
                ArrayList<ResRv2Model> items = new ArrayList<ResRv2Model>();
                items.add(new ResRv2Model("Fries 1", R.drawable.ic_french_fries_res));
                items.add(new ResRv2Model("Fries 2", R.drawable.ic_french_fries_res));
                items.add(new ResRv2Model("Fries 3", R.drawable.ic_french_fries_res));
                items.add(new ResRv2Model("Fries 4", R.drawable.ic_french_fries_res));
                items.add(new ResRv2Model("Fries 5", R.drawable.ic_french_fries_res));
                items.add(new ResRv2Model("Fries 6", R.drawable.ic_french_fries_res));
                items.add(new ResRv2Model("Fries 8", R.drawable.ic_french_fries_res));
                items.add(new ResRv2Model("Fries 9", R.drawable.ic_french_fries_res));
                items.add(new ResRv2Model("Fries 10", R.drawable.ic_french_fries_res));

                updateRecyclerView.callback(position, items);
                check = false;
            }
            else if (pos==3) {
                ArrayList<ResRv2Model> items = new ArrayList<ResRv2Model>();
                items.add(new ResRv2Model("Sandwich 1", R.drawable.ic_sandwich_res));
                items.add(new ResRv2Model("Sandwich 2", R.drawable.ic_sandwich_res));
                items.add(new ResRv2Model("Sandwich 3", R.drawable.ic_sandwich_res));
                items.add(new ResRv2Model("Sandwich 4", R.drawable.ic_sandwich_res));
                items.add(new ResRv2Model("Sandwich 5", R.drawable.ic_sandwich_res));
                items.add(new ResRv2Model("Sandwich 6", R.drawable.ic_sandwich_res));
                items.add(new ResRv2Model("Sandwich 8", R.drawable.ic_sandwich_res));
                items.add(new ResRv2Model("Sandwich 9", R.drawable.ic_sandwich_res));
                items.add(new ResRv2Model("Sandwich 10", R.drawable.ic_sandwich_res));

                updateRecyclerView.callback(position, items);
                check = false;
            } else if (pos==4) {
                ArrayList<ResRv2Model> items = new ArrayList<ResRv2Model>();
                items.add(new ResRv2Model("Desert 1", R.drawable.ic_ice_cream_res));
                items.add(new ResRv2Model("Desert 2", R.drawable.ic_ice_cream_res));
                items.add(new ResRv2Model("Desert 3", R.drawable.ic_ice_cream_res));
                items.add(new ResRv2Model("Desert 4", R.drawable.ic_ice_cream_res));
                items.add(new ResRv2Model("Desert 5", R.drawable.ic_ice_cream_res));
                items.add(new ResRv2Model("Desert 6", R.drawable.ic_ice_cream_res));
                items.add(new ResRv2Model("Desert 8", R.drawable.ic_ice_cream_res));
                items.add(new ResRv2Model("Desert 9", R.drawable.ic_ice_cream_res));
                items.add(new ResRv2Model("Desert 10", R.drawable.ic_ice_cream_res));

                updateRecyclerView.callback(position, items);
                check = false;
            }
        }

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clicked", "layout");
                row_index = position;
                notifyDataSetChanged();
                if (position == 0) {
                    ArrayList<ResRv2Model> items = new ArrayList<ResRv2Model>();
                    items.add(new ResRv2Model("Burger 1", R.drawable.ic_hamburger_res));
                    items.add(new ResRv2Model("Burger 2", R.drawable.ic_hamburger_res));
                    items.add(new ResRv2Model("Burger 3", R.drawable.ic_hamburger_res));
                    items.add(new ResRv2Model("Burger 4", R.drawable.ic_hamburger_res));
                    items.add(new ResRv2Model("Burger 5", R.drawable.ic_hamburger_res));
                    items.add(new ResRv2Model("Burger 6", R.drawable.ic_hamburger_res));
                    items.add(new ResRv2Model("Burger 8", R.drawable.ic_hamburger_res));
                    items.add(new ResRv2Model("Burger 9", R.drawable.ic_hamburger_res));
                    items.add(new ResRv2Model("Burger 10", R.drawable.ic_hamburger_res));

                    updateRecyclerView.callback(position, items);
                } else if (position == 1) {
                    ArrayList<ResRv2Model> items = new ArrayList<ResRv2Model>();
                    items.add(new ResRv2Model("Pizza 1", R.drawable.ic_pizza_res));
                    items.add(new ResRv2Model("Pizza 2", R.drawable.ic_pizza_res));
                    items.add(new ResRv2Model("Pizza 3", R.drawable.ic_pizza_res));
                    items.add(new ResRv2Model("Pizza 4", R.drawable.ic_pizza_res));
                    items.add(new ResRv2Model("Pizza 5", R.drawable.ic_pizza_res));
                    items.add(new ResRv2Model("Pizza 6", R.drawable.ic_pizza_res));
                    items.add(new ResRv2Model("Pizza 8", R.drawable.ic_pizza_res));
                    items.add(new ResRv2Model("Pizza 9", R.drawable.ic_pizza_res));
                    items.add(new ResRv2Model("Pizza 10", R.drawable.ic_pizza_res));

                    updateRecyclerView.callback(position, items);
                } else if (position == 2) {
                    ArrayList<ResRv2Model> items = new ArrayList<ResRv2Model>();
                    items.add(new ResRv2Model("Fries 1", R.drawable.ic_french_fries_res));
                    items.add(new ResRv2Model("Fries 2", R.drawable.ic_french_fries_res));
                    items.add(new ResRv2Model("Fries 3", R.drawable.ic_french_fries_res));
                    items.add(new ResRv2Model("Fries 4", R.drawable.ic_french_fries_res));
                    items.add(new ResRv2Model("Fries 5", R.drawable.ic_french_fries_res));
                    items.add(new ResRv2Model("Fries 6", R.drawable.ic_french_fries_res));
                    items.add(new ResRv2Model("Fries 8", R.drawable.ic_french_fries_res));
                    items.add(new ResRv2Model("Fries 9", R.drawable.ic_french_fries_res));
                    items.add(new ResRv2Model("Fries 10", R.drawable.ic_french_fries_res));

                    updateRecyclerView.callback(position, items);
                } else if (position == 3) {
                    ArrayList<ResRv2Model> items = new ArrayList<ResRv2Model>();
                    items.add(new ResRv2Model("Sandwich 1", R.drawable.ic_sandwich_res));
                    items.add(new ResRv2Model("Sandwich 2", R.drawable.ic_sandwich_res));
                    items.add(new ResRv2Model("Sandwich 3", R.drawable.ic_sandwich_res));
                    items.add(new ResRv2Model("Sandwich 4", R.drawable.ic_sandwich_res));
                    items.add(new ResRv2Model("Sandwich 5", R.drawable.ic_sandwich_res));
                    items.add(new ResRv2Model("Sandwich 6", R.drawable.ic_sandwich_res));
                    items.add(new ResRv2Model("Sandwich 8", R.drawable.ic_sandwich_res));
                    items.add(new ResRv2Model("Sandwich 9", R.drawable.ic_sandwich_res));
                    items.add(new ResRv2Model("Sandwich 10", R.drawable.ic_sandwich_res));

                    updateRecyclerView.callback(position, items);
                } else if (position == 4) {
                    ArrayList<ResRv2Model> items = new ArrayList<ResRv2Model>();
                    items.add(new ResRv2Model("Desert 1", R.drawable.ic_ice_cream_res));
                    items.add(new ResRv2Model("Desert 2", R.drawable.ic_ice_cream_res));
                    items.add(new ResRv2Model("Desert 3", R.drawable.ic_ice_cream_res));
                    items.add(new ResRv2Model("Desert 4", R.drawable.ic_ice_cream_res));
                    items.add(new ResRv2Model("Desert 5", R.drawable.ic_ice_cream_res));
                    items.add(new ResRv2Model("Desert 6", R.drawable.ic_ice_cream_res));
                    items.add(new ResRv2Model("Desert 8", R.drawable.ic_ice_cream_res));
                    items.add(new ResRv2Model("Desert 9", R.drawable.ic_ice_cream_res));
                    items.add(new ResRv2Model("Desert 10", R.drawable.ic_ice_cream_res));

                    updateRecyclerView.callback(position, items);
                }


            }
        });

        if (select) {
            if (position == pos) {
                Log.d("pos", String.valueOf(pos));
                holder.layout.setBackgroundResource(R.drawable.res_rv1_selected_bg);
            }
            select = false;
        } else {

            if (row_index == position) {
                Log.d("layout", "change color");
                holder.layout.setBackgroundResource(R.drawable.res_rv1_selected_bg);
            } else {
                holder.layout.setBackgroundResource(R.drawable.res_rv1_bg);
            }
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ResRv1ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        LinearLayout layout;

        public ResRv1ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.res_image);
            layout = itemView.findViewById(R.id.res_lineral_layout);
        }
    }
}
