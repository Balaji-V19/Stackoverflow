package com.example.stackoverflow;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class selecttagadapter extends RecyclerView.Adapter<selecttagadapter.viewholder> {
    List<datas> data;
    Context cts;
    private Onitemclicklistener mlistener;
    public interface Onitemclicklistener{
        void onitemclick(int position);
    }
    public void SetOnitemclicklistener(Onitemclicklistener listener)
    {
        mlistener=listener;
    }

    public selecttagadapter(List<datas> data, Context cts) {
        this.data = data;
        this.cts = cts;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(cts).inflate(R.layout.selectadapter,viewGroup,false);

        return new viewholder(v,mlistener);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder viewholder, int i) {
        viewholder.tv.setText(data.get(i).getTv());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public  class viewholder extends RecyclerView.ViewHolder{
        private TextView tv;

        public viewholder(@NonNull View itemView, final Onitemclicklistener listner) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listner!=null)
                    {
                        int position=getAdapterPosition();
                        if (position!=RecyclerView.NO_POSITION){
                            listner.onitemclick(position);
                        }
                    }
                }
            });
        }
    }
}
