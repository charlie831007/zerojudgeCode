#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){
int a;
while(scanf("%d", &a)==1)
{
if((a%4==0&a%100!=0)|a%400==0)
printf("閏年\n");
else
printf("平年\n");
}
return 0;
}
