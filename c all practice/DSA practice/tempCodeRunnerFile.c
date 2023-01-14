 // complete menu drive program in C to array implement of stack

 #include<stdio.h>
 #include<stdlib.h>
//  #include<conio.h>

 // grobal variable declaration
 int stack[100], i,choice=0; n,top=-1;

 // function started

 void push()
 {
    int val;
    if(top==n)
    printf("\n overflow\n");
    else{
        printf("Enter the value ? ");
        scanf("%d", &val);
        stack[top]=val;
    }
 }

//  remove
int pop()
{
    if(top==-1)
    printf("\n Underflow");
    else
    top = top-1;
}

// /display
void display()
{
    for(i=top;i>=0;i--)
    {
        printf("%d\n", stack[i]);
    }
    if(top==-1)
    {
        printf("stack is empty");
    }
}


//  main body 
int main(){
printf("Enter the number of element in the stack");
scanf("%d",&n);
while(choice!=4)
{
    printf("choice one option");
    printf("\n 1. PUSH \n 2. POP \n 3 DISPLAY \n 4EXIT");
    scanf("%d", &choice);
    
    switch(choice)
    {
        case 1:
        push();
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
     

    }
    }
    return 0;
}