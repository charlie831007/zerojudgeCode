#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int t , num1 , num2;
	scanf("%d" , &t);
	int arr[20][5] = {0};
	for(num1=0 ; num1<t ; num1++)
	{
		for(num2=0 ; num2<4 ; num2++)
		{
			scanf("%d" , &arr[num1][num2]);
		}
	}
	for(num1=0 ; num1<t ; num1++)
	{
		if(arr[num1][3]-arr[num1][2] == arr[num1][2]-arr[num1][1])
		{
			arr[num1][4] = arr[num1][3]*2-arr[num1][2];
		}
		else if(arr[num1][3]/arr[num1][2] == arr[num1][2]/arr[num1][1])
		{
			arr[num1][4] = arr[num1][3]*arr[num1][3]/arr[num1][2];
		}
	}
	for(num1=0 ; num1<t ; num1++)
	{
		for(num2=0 ; num2<5 ; num2++)
		{
			printf("%d ", arr[num1][num2]);
		}
		printf("\n");
	}
	
	return 0;
}
