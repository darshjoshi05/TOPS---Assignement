// 1. WAP to create simple calculator using class

#include<iostream>
using namespace std;

class calc {
	int n1, n2;
	public:
		void add(int n1 ,int n2) {
			cout << "Addition: " << n1 + n2;
		} 
		
		void sub(int n1 ,int n2) {
			cout << "Subtraction: " << n1 - n2;
		} 
		
		void mul(int n1 ,int n2) {
			cout << "Multiplication: " << n1 * n2;
		} 
		
		void div(int n1 ,int n2) {
			cout << "Division: " << n1 / n2;
		} 
};

int main() {
	int n1, n2, c;
	calc obj;
	
	printf("Enter two numbers: ");
	cin >> n1 >> n2;
	
	printf("Your Choice?\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
	cin >> c;
	
	switch(c) {
		case 1:
			obj.add(n1, n2);
			break; 
			
		case 2:
			obj.sub(n1, n2);
			break; 
			
		case 3:
			obj.mul(n1, n2);
			break; 
			
		case 4:
			obj.div(n1, n2);
			break; 
	}
	return 0;
}
