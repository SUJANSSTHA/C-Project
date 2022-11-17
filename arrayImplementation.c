// Complete menu drive program in C to Array implementation of stack


#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
// declareating global variable
int stack[100], i, j, choice=0, n, top= -1;

void push();
void pop();
void Display();


// main function started 
int main()
{
    // printf("Enter the number of elements in the stack");
    // scanf("%d", &n);

    while (choice!=4)
    {
        printf("\nChose one from the below options. \n");
        printf("\n 1. Push \n 2.PoP \n3. Show \n 4. Exit.\n ");
        printf("Enter YOur choice\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            push();

            break;
        case 2: 
        pop();
        break;
        case 3:
        Display();
        break;
        case 4: 
        exit(0);
        break;
        default:
        printf("\nPlease enter the valid number.\n");
        printf("\n-------------------------------\n");
            break;
        }
    }
}
void push(){
    int val;
    if(top==n)    printf("\n Overflow\n");
    else
    {
        printf("\nEnter the value?\t");
        scanf("%d",&val);
        top = top +1;
        printf("In the Top Elements Successfully Added");
          printf("\n-------------------------------\n");
    }
}

void pop()
{
    if (top== -1)
    printf("\nUnderflow\n");
    else 
    top = top -1;
    printf("Top Element was successfully Deleted.");
     printf("\n-------------------------------\n");
}
void Display(){
    for(i=top;i>=0;i--)
    {
        printf("%d\n", stack[i]);

    }
    if(top == -1)
    {
        printf("\nStack is empty\n");
    }
}
