package com.example.andre_uasakb.adapter;

// 13 Agustus 2021
//
//        10118382
//        Andre Burhan
//        IF - 9

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.andre_uasakb.R;
import com.example.andre_uasakb.model.WisataModel;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.imageview.ShapeableImageView;

public class WisataAdapter extends FirebaseRecyclerAdapter<WisataModel,WisataAdapter.myViewHolder> {

    public WisataAdapter(@NonNull FirebaseRecyclerOptions<WisataModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull WisataModel model) {
        holder.nama.setText(model.getNama());
        holder.alamat.setText(model.getAlamat());
        holder.deskripsi.setText(model.getDeskripsi());

        Glide.with(holder.img.getContext())
                .load(model.getFoto())
                .placeholder(R.drawable.common_google_signin_btn_icon_dark)
                .error(R.drawable.common_google_signin_btn_icon_dark_normal)
                .into(holder.img);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        ShapeableImageView img;
        TextView nama,alamat,deskripsi;


        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            img = (ShapeableImageView) itemView.findViewById(R.id.img1);
            nama = (TextView) itemView.findViewById(R.id.nama);
            alamat = (TextView) itemView.findViewById(R.id.alamat);
            deskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
        }
    }
}
