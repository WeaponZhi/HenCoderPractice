package com.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hencoder.hencoderpracticedraw1.R;

import java.util.Locale;

/**
 * Created by WeaponZhi on 2017/8/31.
 */

public class MainFragment extends android.app.Fragment {
    public static final String ARG_MAIN_NUMBER = "planet_number";

    public MainFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        int i = getArguments().getInt(ARG_MAIN_NUMBER);
        String planet = getResources().getStringArray(R.array.planets_array)[i];
        int imageId = getResources().getIdentifier(planet.toLowerCase(Locale.getDefault()), "drawable", getActivity().getPackageName());
        ((ImageView) rootView.findViewById(R.id.image)).setImageResource(imageId);
        getActivity().setTitle(planet);
        return rootView;
    }
}
