package com.example.lenovo.androidmysql;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuHelpFragment extends Fragment {
    String[] pil = {"FAQ","Term And Conditions","Privacy Policy","About App","Rate This App"};
    Toolbar toolbar;
    ListView listView;
    ArrayAdapter adapter;
    public MenuHelpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_help, container, false);
        getActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.abumuda));
        getActivity().getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        listView = (ListView) view.findViewById(R.id.list_option_help);
        toolbar = (Toolbar) view.findViewById(R.id.toolbar_help);

        adapter = new ArrayAdapter<String>(getActivity(), R.layout.resource_list_view,R.id.tv_resource, pil);
        listView.setAdapter(adapter);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });

        itemonclick();
        return view;
    }

    public void itemonclick() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String opsi = String.valueOf(adapterView.getItemAtPosition(i));
                Snackbar.make(getView(),opsi,Snackbar.LENGTH_SHORT).show();

            }
        });
    }

}
