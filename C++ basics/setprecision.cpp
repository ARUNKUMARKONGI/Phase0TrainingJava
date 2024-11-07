#include <iostream>
#include <iomanip> 
using namespace std;

int main() {
    double number = 86.7895434;
    
    cout << fixed << setprecision(2) << number << endl; 
    printf("%2.2f",number);
    
    return 0;
}
