#include <iostream>
using namespace std;

int main() {
	double grams = 5553.0;
	double kilograms = grams / 1000.0;
	double hours = (2.0) + (9.0 / 60.0) + (30 / 60.0) / 60.0;
	cout << "kg per hour = " << kilograms / hours << endl;
	return 0;
}