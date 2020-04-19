package com.medtech.lab3;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class FragmentPicker extends Fragment {

    boolean dateOK = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = null;
        if (dateOK) {
            view = inflater.inflate(R.layout.frag_date, container, false);
        }else{
            view = inflater.inflate(R.layout.frag_time, container, false);
        }

        return view;
    }

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        dateOK = args.getBoolean("dateOK");
    }

    public void show(String message){
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

}