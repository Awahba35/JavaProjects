package com.claim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {


	Scanner input = new Scanner(System.in);

	// method to enter records in address book

	public static void addRecord(ArrayList<Person> Persons)



	{
		String firstname,lastname,telephoneNumber, city, street, state, zip;

		Scanner scan = new Scanner(System.in);

		System.out.print(" Enter firstname : ");

		firstname = scan.nextLine();

		System.out.print(" Enter lastname : ");

		lastname = scan.nextLine();

		System.out.print(" Enter street : ");

		street = scan.nextLine();

		System.out.print(" Enter city : ");

		city = scan.nextLine();

		System.out.print(" Enter state : ");

		state = scan.nextLine();

		System.out.print(" Enter zip : ");

		zip = scan.nextLine();

		System.out.print(" Enter phone number : ");

		telephoneNumber = scan.nextLine();

		Address a1 = new Address(street,city,state,zip);

		Persons.add(new Person(firstname,lastname,a1, telephoneNumber));

	}
	// method to search records in address book by firstname

	public static void searchFirstname(ArrayList<Person> person, String firstname)

	{
		int count = 0;

		for(int i=0;i<person.size();i++)

		{
			if(person.get(i).getFirstName().equalsIgnoreCase(firstname))

			{
				System.out.println(person.get(i));

				count++;
			}

		}

		System.out.println("Records matching search criteria: "+count);

	}
	// method to search records in address book by lastname

	public static void searchLastname(ArrayList<Person> persons, String lastname)

	{

		int count = 0;

		for(int i=0;i<persons.size();i++)

		{

			if(persons.get(i).getLastName().equalsIgnoreCase(lastname))

			{     

				System.out.println(persons.get(i));

				count++;
			}

		}
		System.out.println("Records matching search criteria : "+count);

	}

	// method to search records in address book by phone number

	public static void searchPhone(ArrayList<Person> persons, String phone)

	{
		int count = 0 ;

		for(int i=0;i<persons.size();i++)

		{

			if(persons.get(i).getTelephoneNumber().equalsIgnoreCase(phone))

			{

				System.out.println(persons.get(i));

				count++;
			}

		}
		System.out.println("Records matching search criteria : "+count);

	}

	//Delete a person from phone book using their phone number as an identifier2q
	public static void deleteRecord(ArrayList<Person> persons , String telephoneNumber) {

		for(int i = 0; i<persons.size(); i++)

		{
			if(persons.get(i).getTelephoneNumber().equalsIgnoreCase(telephoneNumber)) {

				persons.remove(i);

				break;
			}
		}

	}

	public static void displayAllRecords(ArrayList<Person> persons)

	{
		for(int i = 0; i<persons.size(); i++)

		{

		 System.out.println(persons.get(i));

		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int choice;

		// create an empty address book
		ArrayList<Person> addressBook = new ArrayList<Person>();

		// loop that continues till the user wants
		do

		{
			System.out.println("\t Menu");

			System.out.println(" 1. Add a record in address book");

			System.out.println(" 2. Search record(s) by firstname");

			System.out.println(" 3. Search record(s) by lastname");

			System.out.println(" 4.  Display all records");

			System.out.println(" 5. Search a record by phone number");

			System.out.println(" 6. Delete a records");

			System.out.println(" 7. Quit");

			System.out.print(" Enter your choice(1-6) : ");

			choice = scan.nextInt();

			scan.nextLine();

			//validate the choice

			while(choice < 1 || choice > 7)

			{
				System.out.print(" Invalid choice. Enter your choice(1-7) : ");

				choice = scan.nextInt();

				scan.nextLine();

			}

			// perform the function based on the choice

			switch(choice)

			{

			case 1 : addRecord(addressBook);

			break;

			case 2 : System.out.print(" Enter firstname : ");

			String firstname = scan.nextLine();

			searchFirstname(addressBook,firstname);

			break;

			case 3 : System.out.print(" Enter lastname : ");

			String lastname = scan.nextLine();

			searchLastname(addressBook,lastname);

			break;

			case 4 : for(int i=0;i<addressBook.size();i++)

			{

				System.out.println(addressBook.get(i));

			}

			System.out.println("Total records present in Address Book : "+addressBook.size());

			break;


			case 5: System.out.print(" Enter phone number : ");

			String phone = scan.nextLine();

			searchPhone(addressBook,phone);

			break;


			case 6: System.out.print(" Delete a Record : ");

			String telphone = scan.nextLine();

			deleteRecord(addressBook,telphone);

			break;


			case 7: break;

			}

		}while(choice != 6);

		scan.close();
	}
}
//end of program