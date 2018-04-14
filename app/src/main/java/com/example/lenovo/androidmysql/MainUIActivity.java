package com.example.lenovo.androidmysql;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MainUIActivity extends Activity {
    CardView cv_laundry,cv_sign_out,cv_profil,cv_help,cv_my_order;
    View view;
    AlertDialog.Builder abd;
    TextView tv_content;
    Context context;
    Intent i;
    Fragment frag = null;
    String tampung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ui);
        Window w = getWindow();
        w.setStatusBarColor(getResources().getColor(R.color.abumuda));
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        cv_laundry = (CardView)findViewById(R.id.cardview_laundry);
        cv_sign_out = (CardView)findViewById(R.id.card_view_signout);
        cv_profil = (CardView)findViewById(R.id.cardview_profil);
        cv_my_order = (CardView)findViewById(R.id.card_view_myorder);
        cv_help = (CardView)findViewById(R.id.card_view_help);
        abd = new AlertDialog.Builder(this);
        tv_content = (TextView)findViewById(R.id.tv_setcontent);

        i = new Intent(MainUIActivity.this,Main_Ui_Fragment_Activity.class);
        signOUT();
        fragment_menu_profil();
        fragment_menu_help();
        fragment_menu_laundry();
        fragment_menu_order();
    }

    public void signOUT() {
        cv_sign_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abd.setNegativeButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                abd.setPositiveButton("TIDAK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                abd.setMessage("Apakah anda yakin ingin keluar ?");
                abd.setTitle("PERINGATAN");
                abd.show();
            }
        });

    }

    public void fragment_menu_profil() {
        cv_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampung = "profil";
                i.putExtra("objek", tampung);
                startActivity(i);
            }
        });
    }

    public void fragment_menu_order() {
        cv_my_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampung = "order";
                i.putExtra("objek", tampung);
                startActivity(i);
            }
        });
    }

    public void fragment_menu_help() {
        cv_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampung = "help";
                i.putExtra("objek", tampung);
                startActivity(i);
            }
        });
    }

    public void fragment_menu_laundry() {
        cv_laundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampung = "laundry";
                i.putExtra("objek", tampung);
                startActivity(i);
            }
        });
    }





}
