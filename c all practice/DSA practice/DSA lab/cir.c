#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define MAX 10
#define TRUE 1
#define FALSE 0
struct queue
{
   int front;
   int rear;
   int item[MAX];
};
int GetNextPosition(int pos)
{
   if(pos==MAX-1)
     return 0;
   else
     return pos+1;
}
int IsFull(struct queue *q)
{
   if(q->front==GetNextPosition(q->rear))
      return TRUE;
   else
      return FALSE;
}
int IsEmpty(struct queue*q)
{
   if(q->front==q->rear)
     return TRUE;
   else
     return FALSE;
}
void enqueue(struct queue*q,int data)
{
   if(IsFull(q))
     printf("Queue is full.");
   else
   {
      q->rear=GetNextPosition(q->rear);
      q->item[q->rear]=data;
      printf("Item inserted.");
   }
}
int dequeue(struct queue*q)
{
   if(IsEmpty(q))
   {
      printf("Queue is empty.");
      exit(0);
   }
   q->front=GetNextPosition(q->front);
   return q->item[q->front];
}
void display(struct queue q)
{
    int i;
    if(IsEmpty(&q))
      printf("Queue is empty.");
    else
    {
       printf("Queue contains:\n");
       i=q.front;
       do{
	  i=GetNextPosition(i);
	  printf("%d\t",q.item[i]);
	}while(i!=q.rear);
    }
}

