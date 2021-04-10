package com.example.sizzlingbiteapprebuild.slidingNav.fragments.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sizzlingbiteapprebuild.R;

import java.util.ArrayList;

public class DashBoardFragment extends Fragment implements UpdateRecyclerView{

    StaticRvAdapter staticRvAdapter;
    DynamicRvAdapter dynamicRvAdapter;
    RecyclerView rvStatic, rvDynamic;

    ArrayList<StaticRvModel> itemsStatic;
    ArrayList<DynamicRvModel> itemsDynamic;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.dashboard_fragment,
                container, false);

        itemsStatic = new ArrayList<>();
        itemsStatic.add(new StaticRvModel( R.drawable.ic_cheese_burger, "Burger"));
        itemsStatic.add(new StaticRvModel( R.drawable.ic_pizza_static, "Pizza"));
        itemsStatic.add(new StaticRvModel( R.drawable.ic_french_fries_static, "Fries"));
        itemsStatic.add(new StaticRvModel( R.drawable.ic_sandwich_static, "Sandwich"));
        itemsStatic.add(new StaticRvModel( R.drawable.ic_ice_cream_cup_static, "Ice Cream"));

        rvStatic = root.findViewById(R.id.rcv_static);
        staticRvAdapter = new StaticRvAdapter(itemsStatic, this, getActivity());
        rvStatic.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,
                false));
        rvStatic.setAdapter(staticRvAdapter);

        rvDynamic = root.findViewById(R.id.rcv_dynamic);

        itemsDynamic = new ArrayList<>();
        itemsDynamic.add(new DynamicRvModel("Burger 1", R.drawable.ic_hamburger_dynamic, 0));
        itemsDynamic.add(new DynamicRvModel("Burger 2", R.drawable.ic_hamburger_dynamic, 0));
        itemsDynamic.add(new DynamicRvModel("Burger 3", R.drawable.ic_hamburger_dynamic, 0));
        itemsDynamic.add(new DynamicRvModel("Burger 4", R.drawable.ic_hamburger_dynamic, 0));
        itemsDynamic.add(new DynamicRvModel("Burger 5", R.drawable.ic_hamburger_dynamic, 0));
        itemsDynamic.add(new DynamicRvModel("Burger 6", R.drawable.ic_hamburger_dynamic, 0));
        itemsDynamic.add(new DynamicRvModel("Burger 8", R.drawable.ic_hamburger_dynamic, 0));
        itemsDynamic.add(new DynamicRvModel("Burger 9", R.drawable.ic_hamburger_dynamic, 0));
        itemsDynamic.add(new DynamicRvModel("Burger 10", R.drawable.ic_hamburger_dynamic, 0));

        dynamicRvAdapter = new DynamicRvAdapter(itemsDynamic);
        rvDynamic.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,
                false));
        rvDynamic.setAdapter(dynamicRvAdapter);


        return root;
    }

    @Override
    public void callback(int position, ArrayList<DynamicRvModel> items) {
        dynamicRvAdapter = new DynamicRvAdapter(items);
        rvDynamic.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,
                false));
        dynamicRvAdapter.notifyDataSetChanged();
        rvDynamic.setAdapter(dynamicRvAdapter);

    }
}
