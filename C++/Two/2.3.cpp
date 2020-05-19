#include<iostream>
using namespace std;

int main() {
	double feet;
	cout << "Enter feet: " << endl;
	cin >> feet;

	double meters = feet * 0.305;
	cout << feet << " feet is equal to " << meters << " meters.";

	return 0;
}