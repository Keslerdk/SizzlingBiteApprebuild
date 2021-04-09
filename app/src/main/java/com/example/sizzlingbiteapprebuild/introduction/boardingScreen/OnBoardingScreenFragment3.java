package com.example.sizzlingbiteapprebuild.introduction.boardingScreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.sizzlingbiteapprebuild.R;
import com.example.sizzlingbiteapprebuild.login.LoginActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class OnBoardingScreenFragment3 extends Fragment {

    ImageView img_fragment3, tab3;
    FloatingActionButton fab;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.on_boarding_screen_fragment3,
                container, false);

        img_fragment3 = root.findViewById(R.id.img_fragment3);
        tab3 = root.findViewById(R.id.tab3);

        fab = root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        Glide.with(this)
                .load(R.drawable.img3)
                .into(img_fragment3);
        Glide.with(this)
                .load(R.drawable.tab3)
                .into(tab3);
        return root;
    }
}
