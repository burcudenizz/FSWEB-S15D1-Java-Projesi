package com.workintech.main;

import com.workintech.mobilePhone.Contact;
import com.workintech.mobilePhone.MobilePhone;

import static com.workintech.bazaar.BazaarCar.consolApp;
import static com.workintech.bazaar.BazaarCar.printSorted;

public class Main {
    public static void main(String[] args) {

        System.out.println("****BazaarCar*****");
        consolApp();

        System.out.println("****MobilePhone*****");

        MobilePhone phone = new MobilePhone("123456789");
        Contact person1 = new Contact("burcu", "123456789123");
        phone.addNewContact(person1);
        phone.addNewContact(new Contact("deniz", "123456756"));
        phone.addNewContact(new Contact("ali", "1234567812"));
        phone.printContact();

        System.out.println("index:" + phone.findContact(person1));
        System.out.println("index with string " + phone.findContact(person1.getName()));
        System.out.println("query:" + phone.queryContact(person1.getName()));
        phone.removeContact(person1);
        phone.printContact();

    }
}