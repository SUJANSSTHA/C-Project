// complete menu driven program in c to array implementation of stack
#include<stdio.h>
#include<conio.h>
int stack [100],i,choice=0,n,top=-1;
void push()
{
    int val;
    if(top==n)
    printf("\n Overflow");
    else
    {printf("Enter tah value");

    scanf("%d",&val);
    top=top+1;
    stack[top]=val;
    }
}
