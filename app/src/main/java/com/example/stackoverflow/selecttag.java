package com.example.stackoverflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class selecttag extends AppCompatActivity {
    private RecyclerView recycle;
    private TextView tv1,tv2,tv3,tv4;
    private List<datas> data;
    private Button btn;
    selecttagadapter set;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecttag);
        recycle=findViewById(R.id.recycle);
        tv1=findViewById(R.id.tags1);
        tv2=findViewById(R.id.tags2);
        tv3=findViewById(R.id.tags3);
        tv4=findViewById(R.id.tags4);
        btn=findViewById(R.id.submit);
        data=new ArrayList<>();
        data.add(new datas("#Python"));
        data.add(new datas("#C++"));
        data.add(new datas("#C"));
        data.add(new datas("#javascript"));
        data.add(new datas("#HTML"));
        data.add(new datas("#PHP"));
        data.add(new datas("#Mysql"));
        data.add(new datas("#Jquery"));
        data.add(new datas("#ios"));
        data.add(new datas("#Android"));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(selecttag.this,Navigation.class);
                i.putExtra("key1",tv1.getText().toString());
                i.putExtra("key2",tv2.getText().toString());
                i.putExtra("key3",tv3.getText().toString());
                i.putExtra("key4",tv4.getText().toString());
                startActivity(i);
            }
        });
        set=new selecttagadapter(data,selecttag.this);
        set.SetOnitemclicklistener(new selecttagadapter.Onitemclicklistener() {
            @Override
            public void onitemclick(int position) {
                change(position,"Selected");

            }
        });
        recycle.setAdapter(set);
        recycle.setLayoutManager(new LinearLayoutManager(selecttag.this));


    }

    private void change(int position, String selected) {
        if (tv1.getText().toString().isEmpty())
        {
            tv1.setText(data.get(position).getTv());
        }
        else if (tv2.getText().toString().isEmpty())
        {
            tv2.setText(data.get(position).getTv());
        }
        else if (tv3.getText().toString().isEmpty())
        {
            tv3.setText(data.get(position).getTv());
        }
        else if (tv4.getText().toString().isEmpty())
        {
            tv4.setText(data.get(position).getTv());
        }
        else{
            Toast.makeText(this, "Nothing change", Toast.LENGTH_SHORT).show();
        }
        data.get(position).Changetext(selected);
        set.notifyItemChanged(position);

    }
}
