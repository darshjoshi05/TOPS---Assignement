//#include<iostream>
//using namespace std;
//int main() {
//	int n;
//	cout << "Enter any number: ";
//	cin >> n;
//	if (n % 2 == 0) {
//		cout << "Number is even.";
//	} else {
//		cout << "Number is odd.";
//	}
//	return 0;
//}


//#include<iostream>
//using namespace std;
//int main() {
//	char value;
//	cout << "Enter any alphabet: ";
//	cin >> value; 
//	if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u') {
//		cout << "Character is vowel";
//	} else {
//		cout << "Character is consonant.";
//	}
//	return 0;
//}

//#include<iostream>
//using namespace std;
//int main() {
//	int n1, n2, ans, value;
//	cout << "Enter your choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n";
//	cin >> value;
//	cout << "Enter 2 numbers: ";
//	cin >> n1 >> n2;
//	switch (value) {
//		case 1: 
//			ans = n1 + n2;
//			cout << "Addition: " << ans;
//			break;
//			
//		case 2: 
//			ans = n1 - n2;
//			cout << "Subtraction: " << ans;
//			break;
//			
//		case 3: 
//			ans = n1 * n2;
//			cout << "Multiplication: " << ans;
//			break;
//			
//		case 4: 
//			ans = n1 / n2;
//			cout << "Division: " << ans;
//			break;
//			
//		default:
//			cout << "Invalid Operation";
//	}
//	return 0;
//}

//#include<iostream>
//using namespace std;
//int main() {
//	int i, j;
//	for (i = 5; i >= 1; i--) {
//		for  (j = 1; j <= 5; j++) {
//			cout << i;
//		}
//		cout << "\n";
//	}
//	return 0;
//}

//#include<iostream>
//using namespace std;
//int main() {
//	int i, j;
//	for (i = 1; i <= 5; i++) {
//		for (j = 1; j <= i; j++) {
//			if (j % 2 == 0) {
//				cout << "0";
//			} else {
//				cout << "1";
//			}
//		}
//		cout <<"\n";
//	}
//	return 0;
//}

//#include<iostream>
//using namespace std;
//int main() {
//	for (int i = 0; i < 5; i++) {
//		for (int j = 0; j < 5 - 1 - i; j++) {
//			cout << " ";
//		}
//		for (int k = 0; k < i + 1; k++) {
//			cout << 5 - i;
//		}
//		cout << endl;
//	}
//	return 0;
//}

//#include<iostream>
//using namespace std;
//int main() {
//	for (int i = 5; i >= 1; i--) {
//		for (int j = 1; j <= i - 1; j++) {
//			cout << " ";
//		}
//		for (int k = 1; k <= 5 - i + 1; k++) {
//			cout << i;
//		}
//		cout << endl;
//	}
//	return 0;
//}

//#include<iostream>
//using namespace std;
//int main() {
//	int array[5], i, temp;
//	cout << "Enter 5 numbers: ";
//	for (i = 1; i <= 5; i++) {
//		cin >> array[i];
//	}
//	cout << "Numbers before sorting: ";
//	for (i = 1; i <= 5; i++) {
//		cout << array[i] << "\t";
//	}
//	
//	for (i = 0; i < 5; i++) {
//		for (int j = i + 1; j < 5; j++) {
//			if (array[i] > array [j]) {
//				temp = array[i];
//				array[i] = array[j];
//				array[j] = temp;
//			}
//		}
//	}
//	cout << "\nNumbers after sorting: ";
//	for (i = 0; i < 5; i++) {
//		cout << array[i] << "\t";
//	}
//	return 0;
//}

//#include<iostream>
//using namespace std;
//
//class employee{
//	int id;
//	string name;
//	
//	public:
//		void get() {
//			cout << "Enter your ID and name: ";
//			cin >> id >> name;
//		}
//		
//		void display() {
//			cout << "ID: " << id << " Name: " << name;
//		}
//};
//
//int main() {
//	employee e1;
//	e1.get();
//	e1.display();
//	return 0;
//}

//#include<iostream>
//using namespace std;
//
//class calc {
//	int n1, n2, ans;
//	
//	public:
//		void accept() {
//			cout << "Enter 2 numbers for operation: ";
//			cin >> n1 >> n2;
//		}
//		
//		void add() {
//			ans = n1 + n2;
//			cout << "Addition: " << ans;
//		}
//		
//		void sub() {
//			ans = n1 - n2;
//			cout << "Subtraction: " << ans;
//		}
//		
//		void mul() {
//			ans = n1 * n2;
//			cout << "Multiplication: " << ans;
//		}
//		
//		void div() {
//			ans = n1 / n2;
//			cout << "Division: " << ans;
//		}
//		
//		void mod() {
//			ans = n1 % n2;
//			cout << "Modulous: " << ans;
//		}
//};
//
//int main() {
//	calc c1;
//	int choice;
//	c1.accept();
//	cout << "Select:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulous\n";
//	cin >> choice;
//	switch (choice) {
//		case 1:
//			c1.add();
//			break;
//			
//		case 2:
//			c1.sub();
//			break;
//			
//		case 3:
//			c1.mul();
//			break;
//			
//		case 4:
//			c1.div();
//			break;
//			
//		case 5:
//			c1.mod();
//			break;
//	}
//	return 0;
//}

//#include<iostream>
//using namespace std;
//
//class bank {
//	int balance, accountNumber, amount;
//	string name, typeOfAccount;
//	
//	public:
//		void get() {
//			cout << "Enter your name, account number, type of account & balance.\n";
//			cin >> name >> accountNumber >> typeOfAccount >> balance;
//		}
//		
//		void withdraw() {
//			cout << "Enter the amount you want to withdraw.\n";
//			cin >> amount;
//			if (amount > balance) {
//				cout << "Your balance is insufficient.";
//			} else {
//				balance -= amount;
//				cout << "Your remaining balance is " << balance;
//			}
//		}
//		
//		void deposit() {
//			cout << "Enter the amount you want to deposit.\n";
//			cin >> amount;
//			balance += amount;
//			cout << "Your remaining balance is " << balance;
//		}
//};
//
//int main() {
//	int choice;
//	bank customer;
//	customer.get();
//	cout << "Choice:\n1. Deposit\n2.Withdraw\n";
//	cin >> choice;
//	switch (choice) {
//		case 1:
//			customer.deposit();
//			break;
//			
//		case 2:
//			customer.withdraw();
//			break;
//	}
//	return 0;
//}

//#include<iostream>
//using namespace std;
//int n1, n2, ans, choice;
//
//class addition {
//	public:
//		addition(){
//			ans = n1 + n2;
//			cout << "Addition: " << ans;
//		}
//};
//
//class subtraction {
//	public:
//		subtraction(){
//			ans = n1 - n2;
//			cout << "Subtraction: " << ans;
//		}
//};
//
//class multiplication {
//	public:
//		multiplication(){
//			ans = n1 * n2;
//			cout << "Multiplication: " << ans;
//		}
//};
//
//class division {
//	public:
//		division(){
//			ans = n1 / n2;
//			cout << "Division: " << ans;
//		}
//};
//
//int main() {
//	cout << "Enter two values for operation: ";
//	cin >> n1 >> n2;
//	cout << "\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n";
//	cin >> choice;
//	if (choice == 1) {
//		addition o1;
//	} else if (choice == 2) {
//		subtraction o1;
//	} else if (choice == 3) {
//		multiplication o1;
//	} else if (choice == 4) {
//		division o1;
//	} else {
//		cout << "Wrong choice.";
//	}
//	return 0;
//}
