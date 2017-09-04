package com.example.jayvee.navigationdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PlanetDetails extends Fragment {

    TextView txtPName;
    TextView txtDetail;
    ImageView iv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.planetdetails, container, false);
        txtPName = (TextView) view.findViewById(R.id.textView);
        txtDetail = (TextView) view.findViewById(R.id.textView2);
        iv = (ImageView) view.findViewById(R.id.imageView);

        return view;
    }

    public void setMessage(int image, String name, String detail) {
        iv.setImageResource(image);
        txtPName.setText(name);
        txtDetail.setText(detail);
    }
}
