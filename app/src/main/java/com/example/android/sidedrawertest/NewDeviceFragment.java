package com.example.android.sidedrawertest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewDeviceFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_new_device, container, false);
        //Button saveB = (Button) v.findViewById(R.id.addButton);
        //saveB.setOnClickListener(this);
        return v;
    }


    /*@Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.addButton:

                EditText ConsumerName = (EditText)v.findViewById(R.id.device_name);
                String name = ConsumerName.getText().toString();

                EditText ConsumerWatt = (EditText)v.findViewById(R.id.device_watt);
                String watt1 = ConsumerWatt.getText().toString();
                int watt = Integer.parseInt(watt1);

                Consumer test = new Consumer(name, watt, 2, 1);


                TextView anzeige = (TextView)v.findViewById(R.id.anzeiger);

                anzeige.setText(test.getConsumerName() + test.getConsumerWatt());

                break;

        }
    } */
}
