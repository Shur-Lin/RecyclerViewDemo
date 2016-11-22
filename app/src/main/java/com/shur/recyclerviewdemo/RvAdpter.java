package com.shur.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Shur on 2016/11/3.
 */

public class RvAdpter extends RecyclerView.Adapter<RvAdpter.MyViewHolder> {

    private Context context;
    private List<Integer> datas;

    public RvAdpter(Context context, List<Integer> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public RvAdpter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(contentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RvAdpter.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(datas.get(position));
        holder.tv.setText("分类"+position);
    }

    @Override
    public int getItemCount() {
        return datas==null?0:datas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        public TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv);
            tv = (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
