// 8. Write a C++ program to implement a class called Student that has private
// member variables for name, class, roll number, and marks. Include
// member functions to calculate the grade based on the marks and display
// the student's information. Accept address from each student implement
// using of aggregation

//#include<iostream>
//using namespace std;
//
//class student {
//	string name, grade;
//	int standard, rollNumber, marks;
//	
//	public:
//		void get() {
//			cout << "Enter your name, standard, roll number & marks(0-100): ";
//			cin >> name >> standard >> rollNumber >> marks;
//			
//			if (marks >= 0 && marks <= 33) {
//				grade = 'C';
//			} else if (marks > 33 && marks <= 66) {
//				grade = 'B';
//			} else {
//				grade = 'A';
//			}
//		}
//		
//		void display() {
//			cout << "\nName: " << name << "\nStandard: " << standard << "\nRoll Number: " <<
//			rollNumber << "\nMarks: " << marks << "\nGrade: " << grade;
//		}
//		
//};
//
//int main() {
//	student obj;
//	
//	obj.get();
//	obj.display();
//	return 0;
//}

#include <iostream>
using namespace std;

// Class representing an address
class Address {
public:
    string street;
    string city;
    string state;
    string zipcode;

    // Constructor to initialize Address
    Address(const string& street, const string& city, const string& state, const string& zipcode)
        : street(street), city(city), state(state), zipcode(zipcode) {}

    // Function to display address
    void display() const {
        cout << "Address: " << street << ", " << city << ", " << state << " - " << zipcode << endl;
    }
};

// Class representing a student
class student {
    string name, grade;
    int standard, rollNumber, marks;
    Address* address; // Aggregation relationship

public:
    // Constructor to initialize student with an address
    student(Address* addr) : address(addr) {}

    // Function to get student details
    void get() {
        cout << "Enter your name, standard, roll number, marks (0-100), street, city, state, and zipcode: ";
        cin >> name >> standard >> rollNumber >> marks;
        cin.ignore(); // To ignore the newline character left by the previous cin
        getline(cin, address->street);
        getline(cin, address->city);
        getline(cin, address->state);
        cin >> address->zipcode;

        if (marks >= 0 && marks <= 33) {
            grade = 'C';
        } else if (marks > 33 && marks <= 66) {
            grade = 'B';
        } else {
            grade = 'A';
        }
    }

    // Function to display student details
    void display() const {
        cout << "\nName: " << name << "\nStandard: " << standard << "\nRoll Number: " <<
            rollNumber << "\nMarks: " << marks << "\nGrade: " << grade << endl;
        address->display();
    }
};

int main() {
    // Create an Address object
    Address addr("", "", "", "");

    // Create a student object and associate it with the address
    student obj(&addr);

    // Get and display student details
    obj.get();
    obj.display();

    return 0;
}

