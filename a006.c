#include <stdio.h>
#include <stdlib.h>
#include <math.h> 

int main(int argc, char *argv[]) {
	int a , b , c , d , e , x1 , x2;
	scanf("%d %d %d" , &a , &b , &c);
	d = (b*b-4*a*c);
	e = sqrt(d);
	if(d>0)
	{
		x1 = (-b+e)/2*a;
		x2 = (-b-e)/2*a;
		printf("Two different roots x1=%d , x2=%d\n" , x1 , x2);
	}
	else if(d ==0)
	{
		x1 = (-b)/(2*a);
		printf("Two same roots x=%d\n", x1);
	}
	else if(d<0)
	{
		printf("No real root\n");
	}
	return 0;
}
