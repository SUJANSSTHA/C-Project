#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define MAX 5
struct queue
{
   int item[MAX];
   int front;
   int rear;
};
void enqueue(struct queue*q,int n)//insert item into thequeue
{
   if(q->rear==MAX-1)
   {
      printf("Queue is full.");
      return;
   }
   q->rear++;
   q->item[q->rear]=n;
   printf("Item added.");
}
int dequeue(struct queue*q)
{
   if(q->rear<q->front)
   {
      printf("Queue is empty.");
      getch();
      exit(0);
   }
   return q->front++;
}
void display(struct queue q)
{
   int i;
   if(q.rear<q.front)
   {
      printf("Queue is empty.");
   }
   else
   {
      printf("Queue contains:\n");
      for(i=q.front;i<=q.rear;i++)
	printf("%d\t",q.item[i]);
   }
}
void main()
{
   struct queue q;
   int item;
   char ch;
   q.front=0;
   q.rear=-1;
   do{
    //   clrscr();
      printf("Select your choice:\n");
      printf("1. Insert\n2. Remove\n3. Display\n4. Exit\n");
      ch=getche();
      switch(ch)
      {
	 case '1':
		printf("Enter your number");
		scanf("%d",&item);
		enqueue(&q,item);break;
	 case '2':
		printf("%d was dequeued.",dequeue(&q));break;
	 case '3':
		display(q);break;
	 case '4':
		return;
      }
      getch();
   }while(1);
}