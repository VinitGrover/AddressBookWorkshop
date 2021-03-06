package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book program");

        AddressBook a1 = new AddressBook();
        a1.newContact();
        a1.newContact();

        System.out.println(a1.list);

        System.out.println("if you want to edit person details, y/n : ");
        String name="";

        if(AddressBook.sc.nextLine().equals("y")) {
            System.out.println("Enter name whose details you want to edit");
            name = AddressBook.sc.nextLine();

            for (Contacts x : a1.list) {
                if (x.getFirstName().equals(name)) {
                    System.out.println("Enter which details you want to edit eg. firstName, lastName etc ");
                    String check = AddressBook.sc.nextLine();
                    switch (check) {
                        case "firstName":
                            System.out.println("Rename first Name to  ");
                            x.setFirstName(AddressBook.sc.nextLine());
                            break;
                        case "lastName":
                            System.out.println("Rename last Name to  ");
                            x.setLastName(AddressBook.sc.nextLine());
                            break;
                        case "address":
                            System.out.println("Rename address to  ");
                            x.setAddress(AddressBook.sc.nextLine());
                            break;
                        case "city":
                            System.out.println("Rename city to  ");
                            x.setCity(AddressBook.sc.nextLine());
                            break;
                        case "zip":
                            System.out.println("Rename zip to  ");
                            x.setZip(AddressBook.sc.nextLine());
                            break;
                        case "phone":
                            System.out.println("Rename phone to  ");
                            x.setPhone(AddressBook.sc.nextLine());
                            break;
                        case "email":
                            System.out.println("Rename email to  ");
                            x.setEmail(AddressBook.sc.nextLine());
                            break;
                        case "state":
                            System.out.println("Rename state to  ");
                            x.setState(AddressBook.sc.nextLine());
                            break;
                        default:
                            System.out.println("invalid entry");
                    }
                }
            }

            System.out.println(a1.list);
        }

        System.out.println("do you want to delete a person details, y/n : ");
        if(AddressBook.sc.nextLine().equals("y")) {
            System.out.println("Delete a contact using name ");
            name = AddressBook.sc.nextLine();

            int count = 0;

            for (Contacts x : a1.list) {
                if (x.getFirstName().equals(name)) {
                    a1.list.remove(count);
                    break;
                }
                count++;
            }
            System.out.println(a1.list);
        }
        Map<Integer,AddressBook> dict = new HashMap<>();
        dict.put(1,a1);
        for(Map.Entry<Integer,AddressBook> x : dict.entrySet()){
            System.out.println(x.getKey()+" : "+x.getValue());
        }


      


    }
}
