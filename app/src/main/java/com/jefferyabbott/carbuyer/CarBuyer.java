package com.jefferyabbott.carbuyer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class CarBuyer extends Activity
{
    CarList cl = new CarList();

    String selectedCar = "";

    @Override
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.carbuyer);
    }



    public void setSelectedCar(String car)
    {
        selectedCar = car;
    }
}
