package com.example.martin.contactapp.contacts;

import java.util.ArrayList;

/**
 * Created by Martin on 2/28/2016.
 */
public class ContactContent {

    public static final ArrayList<ContactItem> CONTACTS = new ArrayList<>();

    static {
        for (int i = 0; i< 30; i++){
            addContact(createContact(i));
        }
    }

    private static void addContact(ContactItem contact){
        CONTACTS.add(contact);

    }

    private static ContactItem createContact(int position){
        return new ContactItem(String.valueOf(position), "contact " + position, "details deftail detail" );
    }

}
