/*WAP to perform array implementation of stack.*/
#include<stdio.h>
#include<conio.h>
#define MAX 10
struct stack
{
   int item[MAX];
   int tos;
};
void push(struct stack*,int);
int pop(struct stack*);
void display(struct stack);
//int IsEmpty(struct stack);
//int IsFull(struct stack);
void main()
{
   struct stack s;
   char ch;
   int i,data;
   s.tos=-1;//stack initialization
   do{
    //    clrscr();
       printf("1. Push\n2. Pop\n3. Display\n4. Exit");
       printf("\n Select your option:");
       ch=getche();
       switch(ch)
       {
	  case '1':
		   if(s.tos==MAX-1)//stack is full
		     printf("\nStack is full. You cannot push more items.");
		   else//stack is not full, so you can add one more item.
		   {
		      printf("\nEnter your number:");
		      scanf("%d",&data);
		      push(&s,data);
		   }
		   break;
	  case '2':
		   if(s.tos==-1)//stack is empty
		      printf("\nStack is empty. You cannot pop item from the stack.");
		   else
		   {
		      data=pop(&s);
		      printf("\n%d popped from the stack.",data);
		   }
		   break;
	  case '3':
		  display(s);
		  break;
	  case '4':
		  printf("\nSorry to see you go.");
		  getch();
		  return;
       }
       getch();
   }while(1);
}
void push(struct stack *sp,int data)
{
   sp->tos++;
   sp->item[sp->tos]=data;
   printf("\nItem pushed successfully.");
}
void display(struct stack s)
{
   int i;
   printf("\nStack contains:");
   for(i=s.tos;i>=0;i--)
     printf("\t%d",s.item[i]);
}
int pop(struct stack *sp)
{
  //return sp->item[sp->tos--];
  int data=sp->item[sp->tos];
  sp->tos--;
  return data;
}