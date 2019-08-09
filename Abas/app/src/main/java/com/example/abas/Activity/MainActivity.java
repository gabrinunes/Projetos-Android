package com.example.abas.Activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.abas.Activity.Fragment.EmAltaFragment;
import com.example.abas.Activity.Fragment.BichosFragment;
import com.example.abas.Activity.Fragment.NumerosFragment;
import com.example.abas.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        smartTabLayout = findViewById(R.id.viewPagerTab);

        //Configurar action Bar

        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("Aprenda Inglês");

        //Aplica configurações na Action Bar

        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("Aprenda Inglês");


        //configura as abas

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                 getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                .add("Bichos", BichosFragment.class)
                .add("Números", NumerosFragment.class)
                .add("Vogais",EmAltaFragment.class)
                .create()

        );

        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
    }
}
