package com.example.lenovo.androidmysql;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Register1 extends Fragment {
    Bundle bundle;
    EditText nama_lengkap;
    public Register1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.register_1, container, false);
        Button btNext = (Button)rootView.findViewById(R.id.btNextRegister1);
        nama_lengkap = (EditText) rootView.findViewById(R.id.etFullName);
        bundle = new Bundle();


        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(nama_lengkap.getText().length() != 0) {
                    bundle.putString("User", nama_lengkap.getText().toString());
                    Fragment frag = new Register2();
                    frag.setArguments(bundle);
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.fragmain, frag);
                    ft.commit();
                } else {
                    Snackbar.make(getView(),"Siapa namanya mas ?",Snackbar.LENGTH_SHORT).show();
                }
            }
        });
        return rootView;
    }

}
