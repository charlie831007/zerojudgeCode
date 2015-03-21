#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){
int a, b, c;
while(scanf("%d%d", &a, &b)==2)
{
if(((a*2)+b)%3==0)
printf("普通");
else if(((a*2)+b)%3==1)
printf("吉");
else if(((a*2)+b)%3==2)
printf("大吉");
}
return 0;
}
