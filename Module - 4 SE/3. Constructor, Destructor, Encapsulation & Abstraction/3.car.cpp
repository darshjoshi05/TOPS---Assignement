// 3. Write a C++ program to create a class called Car that has private
// member variables for company, model, and year. Implement member
// functions to get and set these variables.

#include<iostream>
using namespace std;

class car {
	string company, model;
	int year;
	
	public:
		void get() {
			cout << "Enter car company, model & year: ";
			cin >> company >> model >> year;
		}
		
		void display() {
			cout << "Company: " << company << "\nModel: " << model << "\nYear: " << year;
		}
};

int main() {
	car obj;
	obj.get();
	obj.display();
	return 0;
}
