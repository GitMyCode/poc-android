package com.example.martin.contactapp;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.martin.contactapp.contacts.ContactContent;
import com.example.martin.contactapp.contacts.ContactItem;

/**
 * A placeholder fragment containing a simple view.
 */
public class ContactDetailFragment extends Fragment {

    private ContactItem mItem;

    public ContactDetailFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


        if (getArguments().containsKey("item_id")) {

            mItem = ContactContent.CONTACTS.get(Integer.parseInt(getArguments().getString("item_id")));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if(appBarLayout != null){
                appBarLayout.setTitle(mItem.content);
            }

        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.contact_detail, container, false);

        if(mItem != null){
            ((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.details);
        }

        return rootView;
    }
}
