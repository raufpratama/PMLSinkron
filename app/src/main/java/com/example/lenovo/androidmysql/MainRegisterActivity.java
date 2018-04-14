package com.example.lenovo.androidmysql;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register);
        Window w = getWindow();
        w.setStatusBarColor(getResources().getColor(R.color.birutua));

        Fragment frag = new Register1();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragmain, frag);
        ft.commit();
    }
}
