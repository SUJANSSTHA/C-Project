// complete menu driven program in c to array implementation of stack
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int stack [100],i,choice=0,n,top=-1;
void push()
{
    int val;
    if(top==n)
    printf("\n Overflow");
    else
    {
        printf("Enter tah value");

    scanf("%d",&val);
    top=top+1;
    stack[top]=val;
    }
}
void pop()
{
    if(top==-1)
    printf("Underflow");
    else
    top = top-1;
    printf("Popped %d item successfully ", stack[top]);

}
void display()
{
    for(i=top;i>=0;i--)
    {
        printf("%d\t", stack[i]);

    }
    if(top==-1)
    {
        printf("Stack is empty");
    }
}

int main()
{
    printf("Enter the number of elements in the stack");
    scanf("%d",&n);
    while(choice!=4)
    {
        printf("\nChoice one from the below options\n");
        printf("\n 1. Push \n 2. Pop \n 3. Display \n 4. Exit");
        printf("\n Enter your coice\n");
        scanf("%d", &choice);
        switch(choice)
        {
            case 1: push();break;
            case 2: pop();break;
            case 3: display();break;
            case 4: exit(1);break;
            default: printf("You have enter wrong number");
        }
    };
    return 0;
}