package com.example.delta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter {
    public SimpleAdapter(List<ListItem> listItems) {
        this.listItems = listItems;
    }

    private List<ListItem> listItems;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ListItemViewHolder viewHolder = (ListItemViewHolder) holder;
        viewHolder.bind(listItems.get(position));
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
}
