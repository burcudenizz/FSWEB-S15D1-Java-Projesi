package com.workintech.mobilePhone;

import java.util.ArrayList;
import java.util.Collections;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (!myContacts.contains(contact)) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }


    public boolean updateContact(Contact previousOne, Contact newOne) {
        if (!myContacts.contains(previousOne)) {
            previousOne.setName(newOne.getName());
            previousOne.setPhoneNumber(newOne.getPhoneNumber());
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String contactName) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(contactName)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }


    public void printContact() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i + " ." + myContacts.get(i).getName() + " ->" + myContacts.get(i).getPhoneNumber());
        }
    }

}
