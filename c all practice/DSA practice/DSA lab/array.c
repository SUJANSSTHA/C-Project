/*Complete meny dirven program in C to array implementation of stack*/
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int stack[100], i,choice=0,n,top=-1;

void push()
{
    int val;
    if(top==n)
    printf("\n Over flow");
    else 
    {
        printf("Enter the value ?\n");
        scanf("%d", &val);
        top=top+1;
        stack[top]=val;
    }
}
void pop()
{
    int item;
    if(top==-1)
    printf("Underflow");
    else
    item=stack[top];
    // top==top-1;
    top=top-1;
    printf("The popped  item is %d", item);
}

void display()
{
    if(top==-1)
    {
        printf("Stack is empty");

    }
    else
    for(i=top;i>=0;i--)
    {
        printf("%d\n", stack[i]);
        }
        
}

int main()
{
    printf("Enter the number of elements in the stack\t");
    scanf("%d",&n);
    while(choice!=4)
    {
        printf("\n choice one from the below options\n");
        printf("\n 1.Push \n 2. Pop \n3. Display \n 4. Exit ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: push(); break;
            case 2: pop(); break;
            case 3: display(); break;
            case 4: exit(0); break;
            default: printf("Please Enter valid choice");
        }
    }
return 0;
}