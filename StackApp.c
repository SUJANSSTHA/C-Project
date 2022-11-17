// DSA-2079
// Third Sem
// Stack ApplicationMaterial details
// Stack Application
// Chandra Prasad Acharya
// •
// Aug 22

// EXPRESSI.C
// Text
// Class comments

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>
#define MAX 100
struct stack
{
   char item[MAX];
   int tos;
};
void push(struct stack *s,char c)
{
   if(s->tos==MAX-1)
   {
     printf("Stack overflow");
     exit(0);
   }
   s->tos++;
   s->item[s->tos]=c;
   return;
}
char pop(struct stack* s)
{
   char val;
   if(s->tos==-1)
   {
      printf("Stack underflow.");
      exit(0);
   }
   val=s->item[s->tos];
   s->tos--;
   return val;
}
int IsEmpty(struct stack s)
{
   if(s.tos==-1)
     return 1;
   else
     return 0;
}
void main()
{
   char exp[MAX],symb,j;
   struct stack s;
   int i,valid=1;
   s.tos=-1;
//    clrscr();1
   printf("Enter your expression:");
   gets(exp);
   for(i=0;i<strlen(exp);i++)
   {
     symb=exp[i];
     if(symb=='('||symb=='{'||symb=='[')
       push(&s,symb);
     if(symb==')'||symb=='}'||symb==']')
     {
	if(IsEmpty(s))
	  valid=0;
	else
	{
	   j=pop(&s);
	   if((symb==')' && j!='(') || (symb==']' && j!='[')||(symb=='}'&&j!='{'))
	     valid=0;
	}
     }
   }
   if(!IsEmpty(s))
     valid=0;
   if(valid==1)
     printf("Expression is valid.");
   else
     printf("Expression is not valid");
   getch();
}
// EXPRESSI.C
// Displaying EXPRESSI.C.