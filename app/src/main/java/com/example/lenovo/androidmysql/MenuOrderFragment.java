package com.example.lenovo.androidmysql;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuOrderFragment extends Fragment {
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    TabLayout tabLayout;
    android.support.v7.widget.Toolbar toolbar;

    public MenuOrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_order, container, false);
        getActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.abumuda));
        getActivity().getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        tabLayout = (TabLayout)view.findViewById(R.id.tab_layout_order);
        viewPager = (ViewPager)view.findViewById(R.id.view_pager_order);

        viewPagerAdapter = new ViewPagerAdapter(getFragmentManager());
        viewPagerAdapter.addFragments(new FragmentFragmentOnProcess(),"On Process");
        viewPagerAdapter.addFragments(new FragmentFragmentHistory(),"History");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        toolbar = (android.support.v7.widget.Toolbar) view.findViewById(R.id.toolbar_order);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
    }
}
