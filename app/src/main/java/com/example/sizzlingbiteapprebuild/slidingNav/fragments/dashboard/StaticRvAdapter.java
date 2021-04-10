package com.example.sizzlingbiteapprebuild.slidingNav.fragments.dashboard;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sizzlingbiteapprebuild.R;

import java.util.ArrayList;

public class StaticRvAdapter extends RecyclerView.Adapter<StaticRvAdapter.StaticViewHolder> {
    private ArrayList<StaticRvModel> items;
    private UpdateRecyclerView updateRecyclerView;
    private Activity activity;
    private boolean select = true;
    private int row_index = -1;

    public StaticRvAdapter(ArrayList<StaticRvModel> items, UpdateRecyclerView updateRecyclerView,
                           Activity activity) {
        this.items = items;
        this.updateRecyclerView = updateRecyclerView;
        this.activity = activity;
    }

    @NonNull
    @Override
    public StaticViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.static_rv_item, parent, false);
        return new StaticViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StaticViewHolder holder, int position) {

        StaticRvModel current = items.get(position);
        holder.image.setImageResource(current.getImage());
        holder.text.setText(current.getText());

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row_index = position;
                notifyDataSetChanged();
                if (position == 0) {
                    ArrayList<DynamicRvModel> items = new ArrayList<DynamicRvModel>();
                    items.add(new DynamicRvModel("Burger 1", R.drawable.ic_hamburger_dynamic, 0));
                    items.add(new DynamicRvModel("Burger 2", R.drawable.ic_hamburger_dynamic, 0));
                    items.add(new DynamicRvModel("Burger 3", R.drawable.ic_hamburger_dynamic, 0));
                    items.add(new DynamicRvModel("Burger 4", R.drawable.ic_hamburger_dynamic, 0));
                    items.add(new DynamicRvModel("Burger 5", R.drawable.ic_hamburger_dynamic, 0));
                    items.add(new DynamicRvModel("Burger 6", R.drawable.ic_hamburger_dynamic, 0));
                    items.add(new DynamicRvModel("Burger 8", R.drawable.ic_hamburger_dynamic, 0));
                    items.add(new DynamicRvModel("Burger 9", R.drawable.ic_hamburger_dynamic, 0));
                    items.add(new DynamicRvModel("Burger 10", R.drawable.ic_hamburger_dynamic, 0));

                    updateRecyclerView.callback(position, items);
                } else if (position == 1) {
                    ArrayList<DynamicRvModel> items = new ArrayList<DynamicRvModel>();
                    items.add(new DynamicRvModel("Pizza 1", R.drawable.ic_pizza_dynamic, 1));
                    items.add(new DynamicRvModel("Pizza 2", R.drawable.ic_pizza_dynamic, 1));
                    items.add(new DynamicRvModel("Pizza 3", R.drawable.ic_pizza_dynamic, 1));
                    items.add(new DynamicRvModel("Pizza 4", R.drawable.ic_pizza_dynamic, 1));
                    items.add(new DynamicRvModel("Pizza 5", R.drawable.ic_pizza_dynamic, 1));
                    items.add(new DynamicRvModel("Pizza 6", R.drawable.ic_pizza_dynamic, 1));
                    items.add(new DynamicRvModel("Pizza 8", R.drawable.ic_pizza_dynamic, 1));
                    items.add(new DynamicRvModel("Pizza 9", R.drawable.ic_pizza_dynamic, 1));
                    items.add(new DynamicRvModel("Pizza 10", R.drawable.ic_pizza_dynamic, 1));

                    updateRecyclerView.callback(position, items);
                } else if (position == 2) {
                    ArrayList<DynamicRvModel> items = new ArrayList<DynamicRvModel>();
                    items.add(new DynamicRvModel("Fries 1", R.drawable.ic_french_fries_dynamic, 2));
                    items.add(new DynamicRvModel("Fries 2", R.drawable.ic_french_fries_dynamic, 2));
                    items.add(new DynamicRvModel("Fries 3", R.drawable.ic_french_fries_dynamic, 2));
                    items.add(new DynamicRvModel("Fries 4", R.drawable.ic_french_fries_dynamic, 2));
                    items.add(new DynamicRvModel("Fries 5", R.drawable.ic_french_fries_dynamic, 2));
                    items.add(new DynamicRvModel("Fries 6", R.drawable.ic_french_fries_dynamic, 2));
                    items.add(new DynamicRvModel("Fries 8", R.drawable.ic_french_fries_dynamic, 2));
                    items.add(new DynamicRvModel("Fries 9", R.drawable.ic_french_fries_dynamic, 2));
                    items.add(new DynamicRvModel("Fries 10", R.drawable.ic_french_fries_dynamic, 2));

                    updateRecyclerView.callback(position, items);
                } else if (position == 3) {
                    ArrayList<DynamicRvModel> items = new ArrayList<DynamicRvModel>();
                    items.add(new DynamicRvModel("Sandwich 1", R.drawable.ic_sandwich_dynamic, 3));
                    items.add(new DynamicRvModel("Sandwich 2", R.drawable.ic_sandwich_dynamic, 3));
                    items.add(new DynamicRvModel("Sandwich 3", R.drawable.ic_sandwich_dynamic, 3));
                    items.add(new DynamicRvModel("Sandwich 4", R.drawable.ic_sandwich_dynamic, 3));
                    items.add(new DynamicRvModel("Sandwich 5", R.drawable.ic_sandwich_dynamic, 3));
                    items.add(new DynamicRvModel("Sandwich 6", R.drawable.ic_sandwich_dynamic, 3));
                    items.add(new DynamicRvModel("Sandwich 8", R.drawable.ic_sandwich_dynamic, 3));
                    items.add(new DynamicRvModel("Sandwich 9", R.drawable.ic_sandwich_dynamic, 3));
                    items.add(new DynamicRvModel("Sandwich 10", R.drawable.ic_sandwich_dynamic, 3));

                    updateRecyclerView.callback(position, items);
                } else if (position == 4) {
                    ArrayList<DynamicRvModel> items = new ArrayList<DynamicRvModel>();
                    items.add(new DynamicRvModel("Ice-Cream 1", R.drawable.ic_ice_cream_dynamic, 4));
                    items.add(new DynamicRvModel("Ice-Cream 2", R.drawable.ic_ice_cream_dynamic, 4));
                    items.add(new DynamicRvModel("Ice-Cream 3", R.drawable.ic_ice_cream_dynamic, 4));
                    items.add(new DynamicRvModel("Ice-Cream 4", R.drawable.ic_ice_cream_dynamic, 4));
                    items.add(new DynamicRvModel("Ice-Cream 5", R.drawable.ic_ice_cream_dynamic, 4));
                    items.add(new DynamicRvModel("Ice-Cream 6", R.drawable.ic_ice_cream_dynamic, 4));
                    items.add(new DynamicRvModel("Ice-Cream 8", R.drawable.ic_ice_cream_dynamic, 4));
                    items.add(new DynamicRvModel("Ice-Cream 9", R.drawable.ic_ice_cream_dynamic, 4));
                    items.add(new DynamicRvModel("Ice-Cream 10", R.drawable.ic_ice_cream_dynamic, 4));

                    updateRecyclerView.callback(position, items);
                }


            }
        });

        if (select) {
            if (position == 0) {
                holder.layout.setBackgroundResource(R.drawable.static_rv_selected_bg);
            }
            select = false;
        } else {

            if (row_index == position) {
                Log.d("layout", "change color");
                holder.layout.setBackgroundResource(R.drawable.static_rv_selected_bg);
            } else {
                holder.layout.setBackgroundResource(R.drawable.static_rv_bg);
            }
        }
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public class StaticViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView text;
        LinearLayout layout;

        public StaticViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_static);
            text = itemView.findViewById(R.id.text_static);
            layout = itemView.findViewById(R.id.lineral_layout_static);
        }
    }
}
