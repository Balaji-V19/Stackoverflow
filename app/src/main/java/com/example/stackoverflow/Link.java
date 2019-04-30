package com.example.stackoverflow;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Link extends Fragment {

    private View v;
    private TextView tv;
    String val1,val2,val3,val4;

    public Link() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.fragment_link, container, false);
        tv=v.findViewById(R.id.linktv);
        val1=passdata.getVale1();
        val2=passdata.getVale2();
        val3=passdata.getVale3();
        val4=passdata.getVale4();
        if (val1 != null) {

                if (val1.equals("#Python"))
                {
                    tv.setText("Python question");
                    tv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse("http://python.com"));
                            startActivity(i);
                        }
                    });
                }
                if (val1.equals("#HTML"))
                {
                    tv.setText("HTML question");
                    tv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse("http://html.com"));
                            startActivity(i);
                        }
                    });
                }
                if (val1.equals("#C++"))
                {
                    tv.setText("C++ question");
                    tv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse("http://C++.com"));
                            startActivity(i);
                        }
                    });
                }
                if (val1.equals("#javascript"))
                {
                    tv.setText("javascript question");
                    tv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse("http://javascript.com"));
                            startActivity(i);
                        }
                    });
                }
                if (val1.equals("#PHP"))
                {
                    tv.setText("PHP question");
                    tv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse("http://php.com"));
                            startActivity(i);
                        }
                    });
                }
                if (val1.contains("#Jquery"))
                {
                    tv.setText("Jquery question");
                    tv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse("http://jquery.com"));
                            startActivity(i);
                        }
                    });
                }
                if (val1.equals("#Android"))
                {
                    tv.setText("Android question");
                    tv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse("http://android.com"));
                            startActivity(i);
                        }
                    });
                }


        }


        return v;
    }

}