#include<iostream>
using namespace std;

int main() {
	double starting_velocity;
	double ending_velocity;
	double time;
	cout << "Enter starting v, ending v, and time elapsed in seconds: " << endl;
	cin >> starting_velocity;
	cin >> ending_velocity;
	cin >> time;
	double acceleration = (ending_velocity - starting_velocity) / time;
	cout << "The average acceleration is " << acceleration << endl;
	return 0;
}