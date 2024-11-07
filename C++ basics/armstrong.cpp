#include <iostream>
#include <cmath>
#include <string>
#include <exception>   
#include <stdexcept>
using namespace std;

int main()
 {
    string input;
    cin >> input;
    int length = input.length();
    long long sum = 0;

    try {
        for (int i = 0; i < length; i++) {
            int digit = input[i] - '0';
            sum += pow(digit, length);
        }

        if (sum == stoll(input)) {
            cout << input << " is an Armstrong number." << endl;
        } else {
            cout << input << " is not an Armstrong number." << endl;
        }
    } catch (const exception& e) {
        cout << "Error: Input beyond the capacity of long integer." << endl;
    }

    return 0;
}

/* in catch const ensures that the exception object will not be modified.
& means the exception is passed by reference, which avoids
 unnecessary copying and improves performance. */