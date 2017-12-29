package com.example.adyun.kosakata;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by adyun on 12/28/17.
 */

public class Fragment5 extends Fragment implements View.OnClickListener {
    TextView txt;
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment5, container, false);
        txt=(TextView) rootView.findViewById(R.id.teks5);
        btn=(Button) rootView.findViewById(R.id.lihat5);

        btn.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        txt.setText("JA-GUNG");
    }
}
