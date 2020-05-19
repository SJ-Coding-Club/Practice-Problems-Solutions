#include <iostream>
using namespace std;

int main() {
	const double monthly_rate = 1.00417;
	
	double monthly_saving_amt;
	cout << "Enter monthly saving amount: " << endl;
	cin >> monthly_saving_amt;

	// time = 0
	double current_amt = 0;
	// after first month
	current_amt = monthly_saving_amt * monthly_rate;
	// t = 2
	current_amt = (current_amt + monthly_saving_amt) * monthly_rate;
	// t = 3
	current_amt = (current_amt + monthly_saving_amt) * monthly_rate;
	// t = 4
	current_amt = (current_amt + monthly_saving_amt) * monthly_rate;
	// t = 5
	current_amt = (current_amt + monthly_saving_amt) * monthly_rate;
	// t = 6
	current_amt = (current_amt + monthly_saving_amt) * monthly_rate;
	cout << "After the sixth month, the account value is $" << current_amt << endl;
	return 0;
}