#include <iostream>
using namespace std;

int main() {
	double gratuity_rate;
	double subtotal;
	cout << "Enter subtotal and gratuity rate: " << endl;
	cin >> subtotal;
	cin >> gratuity_rate;
	double gratuity = subtotal * (gratuity_rate / 100.0);
	double total = subtotal + gratuity;
	cout << "The gratuity is " << gratuity << " and total is " << total << endl;

	return 0;
}