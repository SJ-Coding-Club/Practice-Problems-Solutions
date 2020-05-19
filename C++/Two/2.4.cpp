
#include <iostream>
using namespace std;

int main() {
	double pounds;
	cout << "Enter pounds: " << endl;
	cin >> pounds;

	double kilograms = pounds * 0.454;
	cout << pounds << " pounds is equal to " << kilograms << " kilograms." << endl;

	return 0;
}