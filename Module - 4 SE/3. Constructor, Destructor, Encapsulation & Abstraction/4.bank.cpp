// 4. Write a C++ program to implement a class called Bank Account that has
// private member variables for account number and balance. Include
// member functions to deposit and withdraw money from the account.

#include<iostream>
using namespace std;

class bankAccount {
	int accountNumber, balance, amount;
	
	public:
		void get() {
			cout << "Enter your account number & balance: ";
			cin >> accountNumber >> balance;
		}
		
		void amountGet() {
			cout << "Enter your amount: ";
			cin >> amount;
		}
		
		void deposit() {
			balance += amount;
		}
		
		void withdraw() {
			balance -= amount;
		}
		
		void display() {
			cout << "Account Number: " << accountNumber << "\nBalance: " << balance;
		}
};

int main() {
	int choice;
	bankAccount obj;
	
	obj.get();
	
	cout << "Enter your choice:\n1. Deposit\n2. Withdraw\n";
	cin >> choice;
	
	obj.amountGet();
	
	switch (choice) {
		case 1:
			obj.deposit();
			obj.display();
			break;
			
		case 2:
			obj.withdraw();
			obj.display();
			break;
			
		default:
			cout << "Invalid Choice.";
	}
	return 0;
}
