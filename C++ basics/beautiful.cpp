#include <iostream>
#include <string>
using namespace std;

bool check_beautiful(int num) {
    string str = to_string(num);
    int count[10] = {0};
    
    for (int i = 0; i < str.length(); i++) {
        int digit = str[i] - '0';
        count[digit]++;
    }
    
    for (int i = 0; i < str.length(); i++) {
        int digit = str[i] - '0';
        if (count[digit] != digit) {
            return false;
        }
    }
    
    return true;
}

int main()
{
    int num;
    cin >> num;
    
    if (check_beautiful(num)) {
        cout << "True" << endl;
    } else {
        cout << "False" << endl;
    }
    return 0;
}
