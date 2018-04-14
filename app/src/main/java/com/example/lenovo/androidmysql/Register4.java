package com.example.lenovo.androidmysql;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Register4 extends Fragment {
    EditText full_name_reg4, user_name_reg4, pass_reg4, phone_reg4, email_reg4;
    Button tombol_registrasi;
    String simpanNoHp, simpanEmail;
    Bundle bundle;
    public Register4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.register_4, container, false);
        full_name_reg4 = (EditText)view.findViewById(R.id.et_name_reg4);
        phone_reg4 = (EditText)view.findViewById(R.id.et_phone_reg4);
        user_name_reg4 = (EditText)view.findViewById(R.id.et_username_reg4);
        pass_reg4 = (EditText)view.findViewById(R.id.et_password_reg4);
        email_reg4 = (EditText)view.findViewById(R.id.et_email_reg4);
        tombol_registrasi = (Button)view.findViewById(R.id.button_reg4);
        bundle = getArguments();

        simpanNoHp = bundle.getString("NoHp");
        simpanEmail = bundle.getString("email");

        phone_reg4.setText(simpanNoHp);
        email_reg4.setText(simpanEmail);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
