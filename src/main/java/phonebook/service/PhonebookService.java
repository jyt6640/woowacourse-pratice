package main.java.phonebook.service;

import main.java.phonebook.model.Contact;

import java.util.HashSet;
import java.util.Set;

public class PhonebookService {
    private final Set<Contact> contactSet = new HashSet<>();

    public boolean addContact(Contact contact) {
        return contactSet.add(contact);
    }

    public Set<Contact> getAllContacts() {
        return contactSet;
    }

    public Contact searchContact(String name) {
        for (Contact c : contactSet) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }
}
