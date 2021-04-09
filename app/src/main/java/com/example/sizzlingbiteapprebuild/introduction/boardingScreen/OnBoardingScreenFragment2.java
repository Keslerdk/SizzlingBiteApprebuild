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

public class OnBoardingScreenFragment2 extends Fragment {

    ImageView img_fragment2, tab2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.on_boarding_screen_fragment2,
                container, false);
        img_fragment2 = root.findViewById(R.id.img_fragment2);
        tab2 = root.findViewById(R.id.tab2);

        Glide.with(this)
                .load(R.drawable.img2)
                .into(img_fragment2);
        Glide.with(this)
                .load(R.drawable.tab2)
                .into(tab2);
        return root;
    }
}
