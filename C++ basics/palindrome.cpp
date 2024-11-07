#include <iostream>
#include <string>
using namespace std;

bool isPalindrome(const string& s, int start, int end) {
    if (start >= end)
        return true;
    if (s[start] != s[end])
        return false;
    return isPalindrome(s, start + 1, end - 1);
}

int main() {
    string s;
    cout << "Enter a string: ";
    getline(cin, s);  //reads input with spaces
    // cin reads input only until the first whitespace
    
    bool result = isPalindrome(s, 0, s.length() - 1);
    
    if (result)
        cout << s << " is a palindrome." << endl;
    else
        cout << s << " is not a palindrome." << endl;
    
    return 0;
}
