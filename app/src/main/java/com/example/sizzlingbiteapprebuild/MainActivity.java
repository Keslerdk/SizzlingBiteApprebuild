package com.example.sizzlingbiteapprebuild;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.sizzlingbiteapprebuild.slidingNav.fragments.AboutUsFragment;
import com.example.sizzlingbiteapprebuild.slidingNav.fragments.DashBoardFragment;
import com.example.sizzlingbiteapprebuild.slidingNav.fragments.MyProfileFragment;
import com.example.sizzlingbiteapprebuild.slidingNav.fragments.NearbyResFragment;
import com.example.sizzlingbiteapprebuild.slidingNav.fragments.SettingsFragment;
import com.example.sizzlingbiteapprebuild.slidingNav.menu.DrawerAdapter;
import com.example.sizzlingbiteapprebuild.slidingNav.menu.DrawerItem;
import com.example.sizzlingbiteapprebuild.slidingNav.menu.SimpleItem;
import com.example.sizzlingbiteapprebuild.slidingNav.menu.SpaceItem;
import com.yarolegovich.slidingrootnav.SlidingRootNav;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements DrawerAdapter.OnItemSelectedListener{

    private static final int POS_DASHBOARD = 0;
    private static final int POS_NEARBY_RES = 1;
    private static final int POS_MY_PROFILE = 2;
    private static final int POS_SETTINGS = 3;
    private static final int POS_ABOUT_US = 4;
    private static final int POS_LOGOUT = 5;

    private String[] screenTitles;
    private Drawable[] screenIcons;

    private SlidingRootNav slidingRootNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        slidingRootNav = new SlidingRootNavBuilder(this)
                .withToolbarMenuToggle(toolbar)
                .withMenuOpened(false)
                .withContentClickableWhenMenuOpened(false)
                .withSavedState(savedInstanceState)
                .withMenuLayout(R.layout.menu_drawer)
                .inject();

        screenIcons = loadScreenIcons();
        screenTitles = loadScreenTitles();

        DrawerAdapter adapter = new DrawerAdapter(Arrays.asList(
                createItomfor(POS_DASHBOARD).setChecked(true),
                createItomfor(POS_NEARBY_RES),
                createItomfor(POS_MY_PROFILE),
                createItomfor(POS_SETTINGS),
                createItomfor(POS_ABOUT_US),
                new SpaceItem(260),
                createItomfor(POS_LOGOUT)
        ));

        adapter.setListener(this);

        RecyclerView list = findViewById(R.id.drawer_list);
        list.setNestedScrollingEnabled(false);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);

        adapter.setSelected(POS_DASHBOARD);

    }

    private DrawerItem createItomfor(int position) {
        return new SimpleItem(screenIcons[position], screenTitles[position])
                .withIconTint(color(R.color.pink))
                .withTextTint(color(R.color.black))
                .withSelectedIconTint(R.color.pink)
                .withSelectedTextTint(color(R.color.pink));
    }

    @ColorInt
    private int color(int res) {
        return ContextCompat.getColor(this, res);
    }


    private String[] loadScreenTitles() {
        return getResources().getStringArray(R.array.id_activityScreenTitles);
    }

    private Drawable[] loadScreenIcons() {
        TypedArray ta = getResources().obtainTypedArray(R.array.id_activityScreenIcons);
        Drawable[] icons = new Drawable[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            int id = ta.getResourceId(i, 0);
            if (id != 0) {
                icons[i] = ContextCompat.getDrawable(this, id);
            }
        }
        ta.recycle();
        return icons;
    }
    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    public void onItemSelected(int position) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if (position == POS_DASHBOARD) {
            DashBoardFragment dashBoardFragment = new DashBoardFragment();
            transaction.replace(R.id.container, dashBoardFragment);
        } else if (position == POS_MY_PROFILE) {
            MyProfileFragment myProf = new MyProfileFragment();
            transaction.replace(R.id.container, myProf);
        } else if (position == POS_NEARBY_RES) {
            NearbyResFragment nearbyRes = new NearbyResFragment();
            transaction.replace(R.id.container, nearbyRes );
        } else if (position == POS_SETTINGS) {
            SettingsFragment settings = new SettingsFragment();
            transaction.replace(R.id.container, settings);
        } else if (position == POS_ABOUT_US) {
            AboutUsFragment aboutUs = new AboutUsFragment();
            transaction.replace(R.id.container, aboutUs);
        }
        else if (position==POS_LOGOUT) {
            finish();
        }

        slidingRootNav.closeMenu();
        transaction.addToBackStack(null);
        transaction.commit();
    }
}