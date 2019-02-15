#include<stdio.h>
#include<string.h>
int main(){

	char str[] =  "123456787989";
	printf("%s", str[(strlen(str)-1)-5]);
	return 0;
}