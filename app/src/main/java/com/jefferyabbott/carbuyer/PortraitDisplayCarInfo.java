package com.jefferyabbott.carbuyer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PortraitDisplayCarInfo extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portrait_display_car_info);

        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            String carName = extras.getString("carName");
            String carDetails = extras.getString("carDetails");

            TextView carNameTV = (TextView) findViewById(R.id.carNameDisplay);
            carNameTV.setText("Ford " + carName);

            TextView requestedCarInfoTV = (TextView) findViewById(R.id.carinfoDisplay);
            requestedCarInfoTV.setText(carDetails);

            ImageView carImageIV = (ImageView)findViewById(R.id.carImageView);

            switch (carName)
            {
                case "Fiesta":
                    carImageIV.setImageResource(R.drawable.fiesta);
                    break;
                case "Focus":
                    carImageIV.setImageResource(R.drawable.focus);
                    break;
                case "Fusion":
                    carImageIV.setImageResource(R.drawable.fusion);
                    break;
                case "Mustang":
                    carImageIV.setImageResource(R.drawable.mustang);
                    break;
                case "C-Max":
                    carImageIV.setImageResource(R.drawable.cmax);
                    break;
                case "Taurus":
                    carImageIV.setImageResource(R.drawable.taurus);
                    break;
                case "Escape":
                    carImageIV.setImageResource(R.drawable.escape);
                    break;
                case "Edge":
                    carImageIV.setImageResource(R.drawable.edge);
                    break;
                case "Flex":
                    carImageIV.setImageResource(R.drawable.flex);
                    break;
                case "Explorer":
                    carImageIV.setImageResource(R.drawable.explorer);
                    break;
                case "Expedition":
                    carImageIV.setImageResource(R.drawable.expedition);
                    break;
                case "F-150":
                    carImageIV.setImageResource(R.drawable.f150);
                    break;
                default:
                    break;
            }

        }
    }
}
