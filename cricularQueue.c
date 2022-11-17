#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define SIZE 5

struct cqueue{
    int item[SIZE];
    int rear;
    int front;
};

int count= 0;
typedef struct cqueue qu;
void insert(qu*);
void delet(qu*);
void display(qu*);

int main()
{
    int ch;
    qu *q;
    q->rear=SIZE-1;
    q->front=SIZE-1;
    printf("Menu for program:\n");
    printf("1: Enqueue \n 2: Dequeue \n 3: Display \n 4: Exit\n");
    do{
        printf("Enter Your choice:\n");
        scanf("%d", &ch);
        switch(ch)
        {
            case 1: 
                    insert (q);
                    break;
            case 2: 
                   delet (q);
                    break;
            case 3: 
                    display (q);
                    break;
            case 4: 
                    exit(1);
                    break;
            default:
            printf("Your choice is worng\n");
            
        }
    }while(ch<5);
    return 0;

}

// insert fuction 
void insert(qu *q)
{
    int d;
    if(count==SIZE)
    printf("Queue is full\n");
    else{
        q->rear=(q->rear+1)%SIZE;
        printf("Enter data to be inserted \n");
        scanf("%d", &d);
        q->item[q->rear]=d;
        count++;
    }
}


// delete function 
void delet (qu *q)
{
    if(count==0)
    printf("Queue is empty\n");
    else{
        q->front=(q->front+1)%SIZE;
        printf("Deleted item is:");
        printf("%d\n", q->item[q->front]);
        count--;
    }
}

// display function 
void display(qu *q)
{
    int i;
    if(q->rear==q->front)
    printf("Queue is empty\n");
    else{
        printf("Item of  queue are:\n");
        for(i=(q->front+1)%SIZE;i!=q->rear;i=(i+1)%SIZE)
        {
            printf("%d\t",q->item[i]);

        }
        printf("%d\t", q->item[q->rear]);
    }
}