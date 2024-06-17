// 6. Write a C++ Program to show access to Private Public and Protected using
// Inheritance

#include<iostream>
using namespace std;

class one {
	private:
		int priv = 2;
		
	protected:
		int prot = 3;
		
	public:
		int pub = 1;
		
		int getPriv() {
			return priv;
		}
};

class two : public one {
	public:
		int getProt() {
			return prot;
		}
};

int main() {
	two obj;
	
	cout << "Public: " << obj.pub;
	cout << "\nPrivate: " << obj.getPriv();
	cout << "\nProtected: " << obj.getProt();
	
	return 0;
}
