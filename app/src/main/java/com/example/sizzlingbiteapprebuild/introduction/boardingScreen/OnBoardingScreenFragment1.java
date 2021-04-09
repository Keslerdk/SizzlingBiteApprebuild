package com.example.sizzlingbiteapprebuild.introduction.boardingScreen;

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

public class OnBoardingScreenFragment1 extends Fragment {

    ImageView img_fragment1, tab1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.on_boarding_screen_fragment1,
                container, false);

        img_fragment1 = root.findViewById(R.id.img_fragment1);
        tab1 = root.findViewById(R.id.tab1);

        Glide.with(this)
                .load(R.drawable.img1)
                .into(img_fragment1);

        Glide.with(this)
                .load(R.drawable.tab1)
                .into(tab1);
        return root;
    }
}
