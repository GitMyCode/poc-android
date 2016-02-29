package com.example.martin.contactapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.martin.contactapp.contacts.ContactItem;

import java.util.ArrayList;

/**
 * Created by Martin on 2/28/2016.
 */
public class ContactItemRecyclerViewAdapter extends RecyclerView.Adapter<ContactListItemViewHolder> {

    private ArrayList<ContactItem> contacts;

    ContactItemRecyclerViewAdapter(ArrayList<ContactItem> contacts) {
        this.contacts = contacts;
    }

    @Override
    public ContactListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_contact_list, parent, false);

        return new ContactListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ContactListItemViewHolder holder, int position) {
        holder.mItem = contacts.get(position);
        holder.mIdView.setText(contacts.get(position).id);
        holder.mContentView.setText(contacts.get(position).content);
        holder.mView.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Log.i("montag", "clicker sur contact: "+ holder.mItem.id);
                Context viewContext = v.getContext();
                Intent goToContactDetail = new Intent(viewContext, ContactDetailActivity.class);
                goToContactDetail.putExtra("item_id", holder.mItem.id);

                viewContext.startActivity(goToContactDetail);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}
