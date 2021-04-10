package com.example.sizzlingbiteapprebuild.resdetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.sizzlingbiteapprebuild.R;

import java.util.ArrayList;

public class ResDetailsActivity extends AppCompatActivity implements UpdateRecyclerView{

    ImageView logoRes;

    RecyclerView rv1, rv2;
    ResRv1Adapter resRv1Adapter;
    ResRv2Adapter resRv2Adapter;

    ArrayList<ResRv1Model> items1;
    ArrayList<ResRv2Model> items2;

    int pos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_details);

        logoRes = findViewById(R.id.logo_res);

        Glide.with(this)
                .load(R.drawable.table_dish)
                .into(logoRes);

        rv2 = findViewById(R.id.rv_2_res);

        Intent intent = getIntent();
        pos = intent.getIntExtra("pos", 0);


        items1 = new ArrayList<>();
        items1.add(new ResRv1Model(R.drawable.ic_hamburger_res, "Humburger"));
        items1.add(new ResRv1Model(R.drawable.ic_pizza_res, "Pizza"));
        items1.add(new ResRv1Model(R.drawable.ic_french_fries_res, "Fries"));
        items1.add(new ResRv1Model(R.drawable.ic_sandwich_res, "Sandwich"));
        items1.add(new ResRv1Model(R.drawable.ic_ice_cream_res, "Ice Cream"));

        rv1 = findViewById(R.id.rv_1_res);
        Log.d("pos", String.valueOf(pos));
        resRv1Adapter = new ResRv1Adapter(items1, this, this, pos);
        rv1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,
                false));
        rv1.setAdapter(resRv1Adapter);


        items2 = new ArrayList<>();
    }


    @Override
    public void callback(int position, ArrayList<ResRv2Model> items) {
        resRv2Adapter = new ResRv2Adapter(items, this);
        rv2.setNestedScrollingEnabled(true);
        rv2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false));
        resRv2Adapter.notifyDataSetChanged();
        rv2.setAdapter(resRv2Adapter);
    }
}