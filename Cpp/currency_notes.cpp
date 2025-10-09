//in this code you can find the minimum number of currency notes needed for a given amount.
#include <iostream>
using namespace std;

int main() {
    int notes[] = {2000, 500, 200, 100};
    int amount;
    cout << "Enter amount: ";
    cin >> amount;

    for(int i = 0; i < 4; i++) {
        int count = amount / notes[i];
        amount = amount % notes[i];
        cout << notes[i] << " : " << count << " notes" << endl;
    }
    return 0;
}
