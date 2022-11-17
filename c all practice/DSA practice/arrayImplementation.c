// complete menu driven program in C to array implementation of stack

#include<stdio.h>

// global variable
int stack[100], i, j, choice=0, n, top = -1;

// void push();
// void pop();

// void display();


 // insert element 
void push()
{
    int val;
    if(top==n)
    printf("\n OverFlow");
    else {
        printf("Enter the value?\t");
        scanf("%d", &val);
        top = top + 1;
        stack[top] = val;
    }
}


// remove top element
void pop()
{
    if(top==-1)
    printf("UnderFlow");
    else
    top = top-1;
}

void display()
{
    for(i=top;i>=0;i--)
    {
        printf("%d\n", stack[i]);
    }
    if(top==-1)
    {
        printf("Stack is empty");
    }
}

int main(){
    // printf("Enter the number of elements in the stack");
    // scanf("%d", &n);
    // printf("----------------Stack operation using array------");
    // printf("\n-----------------------------------------------------\n");

    while("choice!=4")
    {
        printf("Chose one from the below options.\n");
        printf("\n 1. Push \n 2. PoP \n 3. Show \n 4. Exit");
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
            printf("Exitring......");
            
        
        default:
        printf("Please Enter valid choice");

            break;
        }
    }
return 0;
}

//  // insert element 
// void push()
// {
//     int val;
//     if(top==n)
//     printf("\n OverFlow");
//     else {
//         printf("Enter the value?");
//         scanf("%d", &val);
//         top = top + 1;
//         stack[top] = val;
//     }
// }



// void pop()
// {
//     if(top==-1)
//     printf("UnderFlow");
//     else
//     top = top-1;
// }

// void display()
// {
//     for(i=top;i>=0;i--)
//     {
//         printf("%d\n", stack[i]);
//     }
//     if(top==-1)
//     {
//         printf("Stack is empty");
//     }
// }