package com.example.recyclerviewassignment9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    int myImages[];
    String codename[];
    String versionno[];
    String api[];
    String release[];
    Context ct;

    public MyAdapter(MainActivity mainActivity, int[] images, String[] codenames, String[] versionnumbers, String[] apIlevel, String[] releasedate) {
        myImages=images;
        codename=codenames;
        versionno=versionnumbers;
        api=apIlevel;
        release=releasedate;
        ct=mainActivity;

    }


    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ct).inflate(R.layout.myitems,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.iv.setImageResource(myImages[position]);
        holder.tv1.setText(codename[position]);
        holder.tv2.setText(versionno[position]);
        holder.tv3.setText(api[position]);
        holder.tv4.setText(release[position]);
    }

    @Override
    public int getItemCount() {
        return myImages.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv1;
        TextView tv2;
        TextView tv3;
        TextView tv4;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.androidposters);
            tv1 = itemView.findViewById(R.id.codenames);
            tv2 = itemView.findViewById(R.id.version);
            tv3 = itemView.findViewById(R.id.api);
            tv4 = itemView.findViewById(R.id.releasedate);





        }
    }
}
