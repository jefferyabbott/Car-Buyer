package com.jefferyabbott.carbuyer;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class DisplayCarInfo extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle b)
    {
        return (li.inflate(R.layout.fragment_display_car_info, vg, false));
    }
}
