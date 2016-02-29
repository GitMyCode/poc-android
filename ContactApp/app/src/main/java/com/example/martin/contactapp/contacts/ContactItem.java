package com.example.martin.contactapp.contacts;

/**
 * Created by Martin on 2/28/2016.
 */
public class ContactItem {
    public final String id;
    public final String content;
    public final String details;

    public ContactItem(String id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }
}
