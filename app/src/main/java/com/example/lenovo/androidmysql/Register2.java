package com.example.lenovo.androidmysql;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Register2 extends Fragment {
    String u_name,a,b;
    Bundle bundle,bundle2;
    EditText phone, email;
    public Fragment frag4 = new Register4();
    public Register2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.register_2, container, false);
        Button btNext = (Button)rootView.findViewById(R.id.btNextRegister2);

        TextView welcome = (TextView) rootView.findViewById(R.id.etWelcome);
        phone = (EditText)rootView.findViewById(R.id.etPhoneNumber);
        email = (EditText)rootView.findViewById(R.id.etEmail);
        bundle2 = new Bundle();
        bundle = getArguments();

        u_name = bundle.getString("User");

        welcome.setText("Welcome " + u_name);


        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(phone.getText().length() != 0 && email.getText().length() != 0) {

                    a = phone.getText().toString();
                    b = email.getText().toString();
                    bundle2.putString("NoHp",a);
                    bundle2.putString("email",b);
                    frag4.setArguments(bundle2);


                }

                Fragment frag = new Register3();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragmain, frag);
                ft.commit();
            }
        });
        return rootView;
    }

}
