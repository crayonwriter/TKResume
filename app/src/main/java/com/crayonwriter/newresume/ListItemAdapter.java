package com.crayonwriter.newresume;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ViewHolder> {

    private String[] company_name;
    private String[] description_text;
    private String[] description2_text;
    private String[] description3_text;

    public ListItemAdapter(String[] company_name, String[] description_text, String[]description2_text, String[] description3_text) {
        this.company_name = company_name;
        this.description_text = description_text;
        this.description2_text = description2_text;
        this.description3_text = description3_text;
    }

    @Override
    public int getItemCount() {
        return company_name.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View company, description, description2, description3;

        public ViewHolder(View view) {
            super(view);
            company = view.findViewById(R.id.company_name);
            description = view.findViewById(R.id.description_text);
            description2 = view.findViewById(R.id.description2_text);
            description3 = view.findViewById(R.id.description3_text);
        }
    }

    @Override
    public ListItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_layout, parent, false);
        return new ViewHolder(itemView);
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        View itemView = holder.itemView;
        TextView nameView = itemView.findViewById(R.id.company_name);
        nameView.setText(company_name[position]);
        TextView descriptionView = itemView.findViewById(R.id.description_text);
        descriptionView.setText(description_text[position]);
        TextView description2View = itemView.findViewById(R.id.description2_text);
        description2View.setText(description2_text[position]);
    }
}
