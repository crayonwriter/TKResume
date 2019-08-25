package com.crayonwriter.newresume;

import android.support.v7.widget.RecyclerView;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ViewHolder> {

    private String[] company_name;
    private String[] description_text;

    public ListItemAdapter(String[] company_name, String[] description_text) {
        this.company_name = company_name;
        this.description_text = description_text;
    }
    

    public static class ViewHolder extends RecyclerView.ViewHolder {

    }
}
