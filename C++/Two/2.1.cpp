#include <iostream>
using namespace std;

int main() {
	double celsius;
	cin >> celsius;
	double fahrenheit = (9.0 / 5.0) * celsius + 32;
	cout << celsius << " degress Celsius is equal to " << 
		fahrenheit << " degrees " << "Fahrenheit.";
	return 0;
}