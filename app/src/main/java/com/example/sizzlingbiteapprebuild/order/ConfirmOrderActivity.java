package com.example.sizzlingbiteapprebuild.order;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.sizzlingbiteapprebuild.R;

public class ConfirmOrderActivity extends AppCompatActivity {

    Toolbar toolbar;

    RecyclerView orderRv;
    ConfirmOrderActivityAdapter confirmOrderActivityAdapter;
    Activity context;
    UpdateSelectedItems updateSelectedItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        toolbar = findViewById(R.id.toolbar2);
        toolbar.setTitle("Confirm Order");

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        orderRv = findViewById(R.id.oreder_rv);
        confirmOrderActivityAdapter = new ConfirmOrderActivityAdapter(context);
        orderRv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        orderRv.setAdapter(confirmOrderActivityAdapter);
    }
}