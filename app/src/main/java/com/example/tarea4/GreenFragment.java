package com.example.tarea4;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GreenFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_green, container, false);
        view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
        return view;
    }
}
