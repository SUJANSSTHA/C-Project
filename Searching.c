#include<stdio.h>
#define MAX 5
int main()
{
    int number [MAX], Key, i, flag=0;
    for(i=0;i<MAX;i++)
    {
        printf("\n Enter the %d elements of array :", i+1);
        scanf("%d, &number[i]");

    }
    printf("\n Enter the key element:");
    scanf("%d", &Key);
    for(i = 0; i < MAX; i++)
    {
        if (Key == number[i]){
            flag=1;break;
        }
       else
       flag = 0;

    }
    if(flag==1)
    printf("\n%d was found at position %d", Key, i+1);
    else
    printf("\n%d was not found", Key);
   return 0;
}