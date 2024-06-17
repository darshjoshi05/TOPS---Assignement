// 2. Define a class to represent a bank account

#include<iostream>
using namespace std;

class bank {
	int balance, accountNumber, amount;
	string name, typeOfAccount;
	
	public:
		void get() {
			cout << "Enter your name, account number, type of account & balance.\n";
			cin >> name >> accountNumber >> typeOfAccount >> balance;
		}
		
		void withdraw() {
			cout << "Enter the amount you want to withdraw: ";
			cin >> amount;
			if (amount > balance) {
				cout << "Your balance is insufficient.";
			} else {
				balance -= amount;
				cout << "Name: " << name << "\nBalance: " << balance;
			}
		}
		
		void deposit() {
			cout << "Enter the amount you want to deposit: ";
			cin >> amount;
			balance += amount;
			cout << "Name: " << name << "\nBalance: " << balance;
		}
};

int main() {
	int choice;
	bank customer;
	customer.get();
	cout << "Choice:\n1. Deposit\n2. Withdraw\n";
	cin >> choice;
	switch (choice) {
		case 1:
			customer.deposit();
			break;
			
		case 2:
			customer.withdraw();
			break;
	}
	return 0;
}
