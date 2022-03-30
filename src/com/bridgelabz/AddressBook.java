package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook implements AddressBookInterface {
    ArrayList<ContactPerson> contactList = new ArrayList<ContactPerson>();

    @Override
    public void addContact(ContactPerson person) {
        contactList.add(person);
    }

    @Override
    public void displayContents() {
        Iterator<ContactPerson> iterator =contactList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
