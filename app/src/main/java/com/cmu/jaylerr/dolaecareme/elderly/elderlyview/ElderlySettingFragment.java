package com.cmu.jaylerr.dolaecareme.elderly.elderlyview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cmu.jaylerr.dolaecareme.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ElderlySettingFragment extends Fragment {


    public ElderlySettingFragment() {
        // Required empty public constructor
    }

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_elderly_setting, container, false);


        return view;
    }

}
