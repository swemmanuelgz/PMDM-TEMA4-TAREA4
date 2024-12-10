package com.example.tarea4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class BlueFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blue, container, false);
        view.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
        return view;
    }
}
