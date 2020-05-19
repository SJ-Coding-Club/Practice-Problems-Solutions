#include<iostream>
using namespace std;

int main() {
	long minutes;
	cout << "Enter number of minutes: " << endl;
	cin >> minutes;

	long years = minutes / (365 * 24 * 60);
	long days = (minutes % (365 * 24 * 60)) / (60 * 24);
	cout << minutes << " minutes is approximately " << years << " years and "
		<< days << " days." << endl;
	return 0;
}