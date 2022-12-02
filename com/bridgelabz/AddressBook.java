package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook 
{
	 static ArrayList<ContactPerson> contactPersons = new ArrayList<ContactPerson>();

	    static void addPerson(ContactPerson person){
	        contactPersons.add(person);
	    }

	    static void editContactPerson(String name, ContactPerson person){
	        for (int i = 0; i < contactPersons.size(); i++){
	            if(contactPersons.get(i).firstName == name){
	                contactPersons.set(i,person);
	            }
	        }
	    }

	    static void showContacts(){
	        for (int i = 0; i < contactPersons.size(); i++)
	            System.out.println(contactPersons.get(i).firstName + " " +contactPersons.get(i).lastName + " -> " + contactPersons.get(i).phoneNumber);
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to Address Book Program");
	        ContactPerson krishnaja = new ContactPerson(
	        		 "krishnaja",
 	                "no last name",
 	                "adepu",
 	                "madhapur",
 	                "hyderabad",
 	                "100062",
 	                "9898989899",
 	                "krishnajaadepu@gmail.com" );

	        ContactPerson saiteja = new ContactPerson(
	        		 "saiteja",
 	                " kumar",
 	                "pettala",
 	                "madhapur",
 	                "hyderabad",
 	                "100832",
 	                "9675339926",
 	                "pettalasaiteja11@gmail.com" );

	        ContactPerson rocky = new ContactPerson(
	                "rocky",
	                "d",
	                "dog",
	                "hanamkonda",
	                "warangal",
	                "333990",
	                "9739211678",
	                "rockydog@gmail.com" );

	        addPerson(krishnaja);
	        addPerson(saiteja);

	        showContacts();

	        editContactPerson("saiteja", rocky);

	        showContacts();
	    }   
}

