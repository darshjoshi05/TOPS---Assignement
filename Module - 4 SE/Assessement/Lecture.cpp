// Assessment: Lecture Management System - Module: 4

#include<iostream>
#include<string>
using namespace std;

int i;

class lecture { // Class has been defined to represent lecture details
	string name[5], subject[5], course[5], details[5];
	int numbers[5];
	
	public:
		lecture() { // Constructor has been used to assign initial values
			for (i = 0; i < 5; i++) {
				cout << "Enter name, subject, course & lecture numbers for lecturer " << i + 1 << ": ";
				getline(cin, name[i]);
            	getline(cin, subject[i]);
            	getline(cin, course[i]);
				cin >> numbers[i];
			}
		}
		
		void lectureDetails() { // Function to add lecture details
			for (i = 0; i < 5; i++) {
				cout << "Enter your course details of lecturer " << i + 1 << ": ";
				getline(cin, details[i]);
			}
		}
		
		void display() { // Function to display name and lecture details
			for (i = 0; i < 5; i++) {
				cout << "Name: " << name[i] << endl;
				cout << "Lecture Details: " << details[i] << endl << endl;
			}
		}
};

int main() {
	lecture obj;
	
	obj.lectureDetails();
	obj.display();
	
	return 0;
}
