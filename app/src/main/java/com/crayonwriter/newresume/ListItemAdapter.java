package com.crayonwriter.newresume;

import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ViewHolder> {

    private String[] company_name;
    private String[] description_text;

    public ListItemAdapter(String[] company_name, String[] description_text) {
        this.company_name = company_name;
        this.description_text = description_text;
    }

    @Override
    public int getItemCount() {
        return company_name.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView company, description;

        public ViewHolder(View view) {
            super(view);
            company = (TextView) view.findViewById(R.id.company_name);
            description = view.findViewById(R.id.description_text);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_layout, parent, false);
        return new ViewHolder(itemView);
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        View itemView = holder.itemView;
        TextView nameView = itemView.findViewById(R.id.company_name);
        nameView.setText(company_name[position]);
        TextView descriptionView = itemView.findViewById(R.id.description_text);
        descriptionView.setText(description_text[position]);
    }
}
