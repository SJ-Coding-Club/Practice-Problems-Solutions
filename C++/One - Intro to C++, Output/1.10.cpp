#include <iostream>
using namespace std;

int main() {
	float kilograms = 6.0;
	float hours = 15.0 + 30.0 / 60.0 + (30.0 / 60.0) / 60.0;
	float grams = kilograms * 1000;
	float g_per_hour = grams / hours;
	cout << g_per_hour << " grams per hour." << endl;
	return 0;
}