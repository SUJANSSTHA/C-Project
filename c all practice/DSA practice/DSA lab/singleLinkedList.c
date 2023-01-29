#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct node
{
   int info;
   struct node* next;
};
struct node*header;
struct node* GetNode(int num)
{
   struct node* ptrnew;
   ptrnew=(struct node*)malloc(sizeof(struct node));
   if(ptrnew==NULL)
   {
      printf("Memory allocation failed.");
      getch();
      exit(0);
   }
   ptrnew->next=NULL;
   ptrnew->info=num;
   return ptrnew;
}
void InsertAtFront()
{
   int num;
   struct node*ptrnew;
   printf("Enter a number to be added");
   scanf("%d",&num);
   ptrnew=GetNode(num);//now we have required node to be inserted.
   if(header==NULL)
      header=ptrnew;
   else
   {
      ptrnew->next=header;//new node's next field is set to current front node
      header=ptrnew;//now new node becomes front node
   }
   printf("Item inserted at the front.");
}
void InsertAtRear()
{
   int num;
   struct node*ptrnew,*ptrthis;
   printf("Enter a number to be added");
   scanf("%d",&num);
   ptrnew=GetNode(num);//now we have required node to be inserted.
   if(header==NULL)
      header=ptrnew;
   else
   {
      ptrthis=header;//start from front node
      while(ptrthis->next!=NULL)
	ptrthis=ptrthis->next;//move to next node until next node is empty
      ptrthis->next=ptrnew;
   }
   printf("Item inserted at the rear.");
}
void InsertAfter()
{
   int num,key;
   struct node*ptrnew,*ptrthis;
   if(header==NULL)
      printf("List is empty.");
   else
   {
      printf("Enter a number after which you want to insert:");
      scanf("%d",&key);
      ptrthis=header;//start from front node
      while(ptrthis->info!=key)
      {
	ptrthis=ptrthis->next;//move to next node until next node is empty
	if(ptrthis==NULL)
	{
	   printf("Key not found.");
	   return;
	}
      }
      printf("Enter a number to be added");
      scanf("%d",&num);
      ptrnew=GetNode(num);//now we have required node to be inserted.
      ptrnew->next=ptrthis->next;
      ptrthis->next=ptrnew;
      printf("Item inserted after %d.",key);
   }
}
//insert before is left as exercise
void RemoveFromFront()
{
   struct node* ptrthis;
   if(header==NULL)
     printf("List is empty.");
   else
   {
      ptrthis=header;
      header=header->next;
      free(ptrthis);
      printf("Item removed from front.");
   }
}
void RemoveFromRear()
{
   struct node*ptrthis,*prev;
   if(header==NULL)
     printf("List is empty.");
   else if(header->next==NULL){
      ptrthis=header;
      header=NULL;
      free(ptrthis);
      printf("Item removed from last.");
   }
   else
   {
      ptrthis=header;
      while(ptrthis->next!=NULL)
      {
	 prev=ptrthis;
	 ptrthis=ptrthis->next;
      }
      prev->next=NULL;
      free(ptrthis);
      printf("Item removed from last.");
   }
}
void RemoveAny()
{
    int key;
    struct node*ptrthis,*prev;
    if(header==NULL)
       printf("Nothing to remove.");
    else
    {
       printf("Enter your key to remove");
       scanf("%d",&key);
       ptrthis=header;
       while(ptrthis->info!=key)
       {
	  prev=ptrthis;
	  ptrthis=ptrthis->next;
	  if(ptrthis==NULL)
	  {
	     printf("Key does not exist.");
	     return;
	  }
       }
       if(ptrthis==header)//if first node is to be removed
	  header=header->next;
       else//other than first node
	  prev->next=ptrthis->next;
       free(ptrthis);
       printf("Item removed.");
    }
}
void Display()
{
   struct node*ptrthis;
   if(header==NULL)
      printf("List is empty.");
   else
   {
      printf("List contains:\n");
      for(ptrthis=header;ptrthis!=NULL;ptrthis=ptrthis->next)
	 printf("%d\t",ptrthis->info);
   }
}
void main()
{
   char choice;
   header=NULL;//initially list is empty
   while(1)
   {
      //system("cls");
    //   clrscr();
      printf("Select your choice:\n");
      printf("1. Insert at front\n2. Insert at rear\n3. Insert After\n");
      printf("4. Remove from front\n5. Remove from rear\n6. Remove Any\n");
      printf("7. Display\n8. Exit");
      choice=getche();
      switch(choice)
      {
	 case '1':InsertAtFront();break;
	 case '2':InsertAtRear();break;
	 case '3':InsertAfter();break;
	 case '4':RemoveFromFront();break;
	 case '5':RemoveFromRear();break;
	 case '6':RemoveAny();break;
	 case '7':Display();break;
	 case '8':
		printf("Good bye");
		getch();
		exit(0);
	 default: printf("Invalid choice. Try again!");
      }
      getch();
   }
}
