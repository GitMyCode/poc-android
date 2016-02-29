package com.example.martin.contactapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.martin.contactapp.contacts.ContactItem;

/**
 * Created by Martin on 2/28/2016.
 */
public class ContactListItemViewHolder extends RecyclerView.ViewHolder {

    public final View mView;
    public final TextView mIdView;
    public final TextView mContentView;
    public ContactItem mItem;

    public ContactListItemViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
        mIdView = (TextView) itemView.findViewById(R.id.id);
        mContentView = (TextView) itemView.findViewById(R.id.content);
    }
}
