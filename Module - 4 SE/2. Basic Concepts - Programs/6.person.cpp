// 6. Write a C++ program to create a class called Person that has private
// member variables for name, age and country. Implement member
// functions to set and get the values of these variables.

#include<iostream>
using namespace std;

class Person {
	int age;
	string name, country;
	
	public:
		void get() {
			cout << "Enter your name, age & country: ";
			cin >> name >> age >> country;
		}
		
		void display() {
			cout << "Name: " << name << "\nAge: " << age << "\nCountry: " << country;
		}
};

int main() {
	Person obj;
	
	obj.get();
	obj.display();
	
	return 0;
}
