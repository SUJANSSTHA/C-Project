// complete menu driver program in C to array implementation of stack

#include<stdio.h>
#include<stdlib.h>

// declaration of global variable
int stack[100], i, j, choice = 0, n, top = -1;


// stack 


// inserting element at the top
void push()
{
    int val;
    if(top==n)
    printf("\n Overflow\n");
    else{
        printf("\n Enter the value ?\t");
        scanf("%d", &val);
        top = top + 1;
        stack[top] = val;
    }
}

// remove top element 
void pop()
{
    if(top == -1)
    printf("UnderFlow");
    else
    top = top-1;
}
 // display
 void display()
 {
    for(i=top;i>=0;i--)
    {
        printf("%d\n", stack[i]);
    }
    if(top== -1)
    {
        printf("\n Stack is empty\n");
    }
 }

 // main body start

int main()
{
    while("choice!=4")
    {
        printf("Choice one from the below options.");
        printf("\n 1. Push \n 2. PoP \n3. Show \n 4. Exit");
        printf("\n Enter your choice\t");
        scanf("%d", &choice);


        switch (choice)
        {
        case 1:
        push();
            /* code */
            break;
        case 2:
        pop();
        break;
        case 3:
        display();
        break;
        case 4:
           exit(0); 
           break;
        default:
        printf("You have enter wrong number Plz choise Correct one\n");
            break;
        }
    }
}