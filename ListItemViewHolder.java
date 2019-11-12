package com.example.delta;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListItemViewHolder extends RecyclerView.ViewHolder {

    private final TextView textView;

    public ListItemViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
    }

    public void bind(ListItem listItem) {
        textView.setText(listItem.name);
    }
}
