package com.example.myrecyview;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<message> mlist;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View messageview;
        TextView Name;
        TextView Content;
        View v;
        public ViewHolder(View view){
            super(view);
            messageview = view;
            Name = (TextView) view.findViewById(R.id.textView);
            Content = (TextView) view.findViewById(R.id.textView2);
            v = view;
        }
    }
    public MyAdapter(List<message> list){
        mlist = list;
    }
    public ViewHolder onCreateViewHolder(final ViewGroup parent, int viewtype){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.information,parent,false);
            final ViewHolder holder = new ViewHolder(view);
            holder.messageview.setOnLongClickListener(new View.OnLongClickListener(){
                @Override
                public boolean onLongClick(View v) {
                    int position = holder.getAdapterPosition();
                    message Message = mlist.get(position);
                    String str1 = Message.getName();
                    String str2 = Message.getContent();
                    Intent intent = new Intent(v.getContext(),DetailsActivity.class);
                    intent.putExtra("Mayday",str1);
                    intent.putExtra("July",str2);
                    v.getContext().startActivity(intent);
                    return false;
                }
            });

//            ViewHolder holder = new ViewHolder(view);
            return holder;
    }
    public void onBindViewHolder(ViewHolder holder,int position){
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        layoutParams.height = LinearLayout.LayoutParams.WRAP_CONTENT;
        message message1 = mlist.get(position);
        holder.Name.setText(message1.getName());
        holder.Content.setText(message1.getContent());
        if(position % 2 == 0)
                holder.v.setBackgroundColor(Color.GRAY);
        else{
            holder.v.setBackgroundColor(Color.WHITE);
        }

    }
    public int getItemCount(){
        return mlist.size();
    }
//    public interface OnItemClickListen{
//        void onItemClick(View view,int position);
//    }
//    private OnItemClickListener mOnItemClickListener;
//    public void setmOnItemClickListener(OnItemClickListener mOnItemClickListener){
//        this.mOnItemClickListener = mOnItemClickListener;
//    }


}
