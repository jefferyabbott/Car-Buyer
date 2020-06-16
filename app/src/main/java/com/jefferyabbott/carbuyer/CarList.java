package com.jefferyabbott.carbuyer;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class CarList extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle b)
    {
        final CarBuyer theActivity = (CarBuyer) getActivity();

        Context c = getActivity().getApplicationContext();
        View vw = li.inflate(R.layout.fragment_car_list, vg, false);
        final String cars[] = {"Fiesta", "Focus", "Fusion", "Mustang", "C-Max", "Taurus", "Escape",
                "Edge", "Flex", "Explorer", "Expedition", "F-150"};
        final ListView lv = (ListView)vw.findViewById(R.id.carListView);
        ArrayAdapter<String> ar = new ArrayAdapter<String>(c, R.layout.customlist, cars);
        lv.setAdapter(ar);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str = ((TextView) view).getText().toString();
                theActivity.setSelectedCar(str);
            }
        });

        Button priceButton = (Button)vw.findViewById(R.id.price_button);


        priceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String selectedCar = theActivity.selectedCar;
                displayPrice(selectedCar);
            }

        });


        Button powerButton = (Button)vw.findViewById(R.id.power_button);

        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String selectedCar = theActivity.selectedCar;
                displayHorsepower(selectedCar);
            }

        });


        return vw;
    }




    public void displayPrice(String selectedCar)
    {
        presentInfo("price", selectedCar);
    }


    public void displayHorsepower(String selectedCar)
    {
        presentInfo("power", selectedCar);
    }


    public void presentInfo(String presentInfo, String selectedCar)
    {
        if (selectedCar.equals(""))
        {
            Toast.makeText(getActivity(), "Please select a car model.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            FordModel theCarInfo = new FordModel(selectedCar);
            if (isPortrait())
            {
                Intent i = new Intent(getActivity().getApplicationContext(), PortraitDisplayCarInfo.class);
                i.putExtra("carName", selectedCar);
                if (presentInfo.equals("price"))
                {
                    i.putExtra("carDetails", theCarInfo.getPrice());
                }
                else
                {
                    i.putExtra("carDetails", theCarInfo.getHorsepower());
                }

                startActivity(i);
            }
            else
            {
                TextView carNameTV = (TextView) getActivity().findViewById(R.id.carNameDisplay);
                carNameTV.setText("Ford " + selectedCar);

                TextView requestedCarInfoTV = (TextView)getActivity().findViewById(R.id.carinfoDisplay);
                if (presentInfo.equals("price"))
                {
                    requestedCarInfoTV.setText(theCarInfo.getPrice());
                }
                else
                {
                    requestedCarInfoTV.setText(theCarInfo.getHorsepower());
                }

                ImageView carImageIV = (ImageView)getActivity().findViewById(R.id.carImageView);

                switch (selectedCar)
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



    public boolean isPortrait()
    {
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
