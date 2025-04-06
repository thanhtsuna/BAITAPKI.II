#include <iostream>
#include <random>
using namespace std;

void inputArr(int *&arr, int n) {
	random_device rd;
	mt19937 gen(rd());
	uniform_int_distribution<> dis(1, 100);
	for (int i = 0; i < n; i++) {
		*(arr + i) = dis(gen);
	}
}
void pirntArr(int *&arr, int n) {
	for (int i = 0; i < n; i++) {
		cout << *(arr + i) << " ";
	}
}
int removeOllNum(int*& arr, int n,int *&newArr) {
	int count = 0;
	for (int i = 0; i < n; i++) {
		if (*(arr+i) % 2 == 0)
		count++;
	}
	newArr = new int[count];
	int j = 0;
	for (int i = 0; i < n; i++) {
		if (*(arr + i) % 2 == 0)
		newArr[j++] = arr[i];
	}
	return count;
}
int main()
{
	int n;
	cin >> n;
	int *arr = new int[n];
	inputArr(arr, n);
	pirntArr(arr, n);
	int* newArr ;
	int newSize = removeOllNum(arr, n, newArr);
	cout << endl;
	pirntArr( newArr,newSize);
}

