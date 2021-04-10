package com.example.sizzlingbiteapprebuild.slidingNav.fragments.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sizzlingbiteapprebuild.R;

import java.util.ArrayList;

public class DynamicRvAdapter extends RecyclerView.Adapter<DynamicRvAdapter.DynamicViewHolder> {

    ArrayList<DynamicRvModel> items;
    public OnItemClickListener listener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public DynamicRvAdapter(ArrayList<DynamicRvModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public DynamicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dynamic_rv_item, parent,
                false);
        return new DynamicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DynamicViewHolder holder, int position) {
        DynamicRvModel current = items.get(position);

        holder.image.setImageResource(current.getImage());
        holder.text.setText(current.getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class DynamicViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView text;
        public DynamicViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image_dynamic);
            text = itemView.findViewById(R.id.name_dynamic);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });

        }
    }
}
