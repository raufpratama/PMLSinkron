package com.example.lenovo.androidmysql;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main_Ui_Fragment_Activity extends AppCompatActivity {
    Intent i;
    String terimatampung1, terimatampung2, terimatampung3;
    Fragment frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__ui__fragment);
        i = getIntent();
        terimatampung1 = i.getStringExtra("objek");

        if(terimatampung1.length() != 0 && terimatampung1.equals("profil")) {
            frag = new MenuProfilFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frame_L,frag);
            ft.commit();
        } else if (terimatampung1.length() != 0 && terimatampung1.equals("laundry")) {
            frag = new MenuLaundryFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frame_L,frag);
            ft.commit();
        } else if (terimatampung1.length() != 0 && terimatampung1.equals("order")) {
            frag = new MenuOrderFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frame_L, frag);
            ft.commit();
        } else if (terimatampung1.length() != 0 && terimatampung1.equals("help")) {
            frag = new MenuHelpFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.frame_L, frag);
            ft.commit();
        }
    }
}
