#include<stdio.h>
#include<conio.h>
#default SIZE 20
struct queue{
    int item[SIZE];
    int rear;
    int front;
};
typedef struct queue qu;
void insert(qu *q)
{
    int d;
    printf("Enter data to be inerted /n");
    scanf("%d", &d);
    if(q->rer==SIZE-1)
    {
        printf("queue is full\n");
    }
    else{
        q->rear++;
        q->item[q->rear]=d;

    }
}
void delet(qu *q)
{
    int d;
    if(q->rear->front)
    {
        printf("Queue is empty\n");
    }
    else{
        d=q-item[q->front];
        q->front++;
        printf("Deleted item is : %d\n",d);
        
            }
}
void display(qu *q)
{
    int i;
    if(q->rear<q->front)
    {
        printf("Queue is empty\n");
    }else{
        for(i=q->fronti<q->rear;i++)
        {
            printf("%d\t", q->item[i]);
        }
    }
}

int main()
{
    int ch;
    qu *q;
    q->rear=-1;
    q->front=0;
    printf("Menu for program:\n");
    printf("\n1. insert \n2.delete\n3.display\n4.exit\n");
    do{
        printf("Enter your choice\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:insert(q);break;
            case 2:delete(q);break;
            case 3:display(q);break;
            case 4:exit(1);break;
            default: printf("Your choice is wrong");
        }
    }while(ch<5);
    return 0;
}