package com.example.myappdesign3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

/**
 * Created by imam-pc on 04/07/2016.
 */
public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder> {

    private List<Contact> contactList;
    private Context ctx;

    public RecyclerviewAdapter(List<Contact> contactList, Context ctx) {
        this.ctx = ctx;
        this.contactList = contactList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.txtNama.setText(contact.getNama());
        holder.txtStatus.setText(contact.getStatus());
        holder.txtdes.setText(contact.getTxtdes());
        holder.txtWaktu.setText(contact.getWaktu());

        Glide.with(ctx).load(contact.getPhotoPic()).apply(RequestOptions.circleCropTransform().circleCrop()).into(holder.imgView);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNama, txtStatus, txtWaktu,txtdes;
        public ImageView imgView;

        public MyViewHolder(View view) {
            super(view);
            txtNama = view.findViewById(R.id.txtNama);
            txtStatus = view.findViewById(R.id.txtStatus);
            txtdes=view.findViewById(R.id.txtdes);
            txtWaktu = view.findViewById(R.id.txtWaktu);
            imgView = view.findViewById(R.id.imgView);
        }
    }
}