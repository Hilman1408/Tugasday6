package com.example.tugasday6;

import com.example.tugasday6.Item;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private ArrayList<Item> items;

    public ItemAdapter(ArrayList<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Item currentItem = items.get(position);

        holder.namaitem.setText(currentItem.getNamaItem());
        holder.logoitem.setImageResource(currentItem.getLogoitem());

        holder.logoitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Detail.class);
                intent.putExtra("nama_item", currentItem.getNamaItem());
                intent.putExtra("deskripsi_item", currentItem.getDeskripsiItem());
                intent.putExtra("harga_item", currentItem.getHargaItem());
                intent.putExtra("gambar_item", currentItem.getLogoitem());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaitem;
        ImageView logoitem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaitem = itemView.findViewById(R.id.namaitems);
            logoitem = itemView.findViewById(R.id.logoItem);
        }
    }
}
