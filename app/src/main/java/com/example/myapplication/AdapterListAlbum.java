package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListAlbum extends RecyclerView.Adapter<AdapterListAlbum.ViewHolder> {

    private List<AlbumModel> listAlbum;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(AlbumModel album);
    }

    public AdapterListAlbum(List<AlbumModel> listAlbum, OnItemClickListener listener) {
        this.listAlbum = listAlbum;
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;
        TextView tvTracks;
        TextView tvYear;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.nama);
            tvTracks = itemView.findViewById(R.id.tracks);
            tvYear = itemView.findViewById(R.id.year);
            imageView = itemView.findViewById(R.id.ImageView);
        }
    }

    @NonNull
    @Override
    public AdapterListAlbum.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapterabumlayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListAlbum.ViewHolder holder, int position) {
        AlbumModel album = listAlbum.get(position);


        holder.tvNama.setText(album.getNama());
        holder.tvTracks.setText(album.getTracks());
        holder.tvYear.setText(album.getYear());
        holder.imageView.setImageResource(album.getImageUser());

        holder.itemView.setOnClickListener(v -> {
                listener.onItemClick(album);
        });
    }

    @Override
    public int getItemCount() {
        return listAlbum != null ? listAlbum.size() : 0;
    }
}