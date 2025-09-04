package main.java.phonebook.service;

import main.java.phonebook.model.Contact;

import java.util.HashSet;
import java.util.Set;

public class PhonebookService {
    private final Set<Contact> contactSet = new HashSet<>();

    public boolean addService(Contact contact) {
        return contactSet.add(contact);
    }

    public Set<Contact> getAllContactsService() {
        return contactSet;
    }

    public Contact searchService(String name) {
        for (Contact c : contactSet) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public Contact editContact(String name, String phoneNumber, String email) {
        Contact contact = searchService(name);
        if (contact != null) {
            contact.setPhoneNumber(phoneNumber);
            contact.setEmail(email);
        }
        return contact;
    }
}
