#include <iostream>
using namespace std;

int main() {
	int num;
	cout << "Enter an integer between 0 and 1000: " << endl;
	cin >> num;
	int sum = 0;
	sum += num % 10;
	num /= 10;
	sum += num % 10;
	num /= 10;
	sum += num % 10;
	cout << "Sum = " << sum << endl;
	return 0;
}