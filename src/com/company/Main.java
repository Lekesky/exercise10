// Leke Obayemi
//exercise 10
// 3/21/22


package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ContactCollection book = new ContactCollection();

        for(ContactInfo a : book){      //prints out each contact info in book
            System.out.println(a);
        }
    }
}

class ContactInfo{
    private String name;
    private String email;

    public ContactInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class ContactCollection implements Iterable<ContactInfo>{       //Class with contact info and is iterable
    ArrayList<ContactInfo> myContactCollection = new ArrayList<>();

    public ContactCollection() {
        myContactCollection.add(new ContactInfo("Tom", "tom@gmail.com"));
        myContactCollection.add(new ContactInfo("John", "john@gmail.com"));
        myContactCollection.add(new ContactInfo("Sam", "sam@gmail.com"));
    }

    @Override
    public Iterator iterator() {
        return myContactCollection.iterator();
    }

    @Override
    public String toString() {
        return "ContactCollection{" +
                "myContactCollection=" + myContactCollection +
                '}';
    }
}
