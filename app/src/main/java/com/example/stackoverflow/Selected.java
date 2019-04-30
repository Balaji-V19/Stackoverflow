package com.example.stackoverflow;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Selected extends Fragment {
    private View v;
    private TextView tv,tv2,tv3,tv4;


    public Selected() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_selected, container, false);
        tv=v.findViewById(R.id.selectedtv);
        tv2=v.findViewById(R.id.linktv2);
        tv3=v.findViewById(R.id.linktv3);
        tv4=v.findViewById(R.id.linktv4);
        tv.setText(passdata.getVale1());
        tv2.setText(passdata.getVale2());
        tv3.setText(passdata.getVale3());
        tv4.setText(passdata.getVale4());

        return v;
    }


}
