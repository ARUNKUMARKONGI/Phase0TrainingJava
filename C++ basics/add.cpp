#include <iostream>
#include <cstdint>
using namespace std;

int main() {
    int32_t num1, num2;
    cin >> num1 >> num2;

    int64_t result = (int64_t)num1 + (int64_t)num2;

    if (result > INT32_MAX || result < INT32_MIN) {
        cout << "Overflow occurred: Result exceeds 32-bit range" << endl;
    } else {
        cout << "Result: " << (int32_t)result << endl;
    }
 
    return 0;
}

//ctrl+f8 for run