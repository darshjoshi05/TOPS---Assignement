// 7. Write a C++ program to implement a class called Date that has private
// member variables for day, month, and year. Include member functions to
// set and get these variables, as well as to validate if the date is valid.

#include<iostream>
using namespace std;

class date {
	int day, month, year;
	
	public:
		void get() {
			cout << "Enter day, month & year for date: ";
			cin >> day >> month >> year;
			
			if (day < 1 || day > 31) {
				cout << "Wrong day. Enter again: ";
				cin >> day;
			}
			
			if (month < 1 || month > 12) {
				cout << "Wrong month. Enter again: ";
				cin >> month;
			}
		}
		
		void display() {
			cout << "Day: " << day << "\nMonth: " << month << "\nYear: " << year;
		}
};

int main() {
	date obj;
	
	obj.get();
	obj.display();
	return 0;
}
