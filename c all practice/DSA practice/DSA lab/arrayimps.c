#include<stdio.h>
#include<conio.h>
#define MAX 10
#define TRUE 1
#define FALSE 0
typedef struct
{
   char name[50];
   int roll;
   char grade[30];
}student;
typedef struct
{
   int rear;
   student std[MAX];
}list;
void addStudent(list*);
void removeStudent(list*);
void listStudent(list*);
void updateStudent(list*);
void main()
{
   list sList;
   char ch;
   sList.rear=-1;
   do{
    //   clrscr();
      printf("Select an option:\n1. Insert\n2. Remove\n3. Update\n4. List\n5. Exit\n");
      ch=getche();
      switch(ch)
      {
	 case '1':addStudent(&sList);break;
	 case '2':removeStudent(&sList);break;
	 case '3':updateStudent(&sList);break;
	 case '4':listStudent(&sList);break;
	 case '5':
		printf("\nThank you for using this app.");getch();return;
      }
      getch();
   }while(TRUE);
}
void addStudent(list*p)
{
   student s;
   if(p->rear==MAX-1)
     printf("\nList is full.");
   else{
      fflush(stdin);
      printf("\nEnter name:");
      gets(s.name);
      fflush(stdin);
      printf("\nEnter roll no.");
      scanf("%d",&s.roll);
      fflush(stdin);
      printf("\nEnter grade name");
      gets(s.grade);
      p->rear++;
      p->std[p->rear]=s;
      printf("\nStudent added.");
   }
}
void removeStudent(list*p)
{
   int i,roll,found=FALSE;
   printf("\nEnter roll no. of student to be removed.");
   scanf("%d",&roll);
   for(i=0;i<=p->rear;i++)
   {
      if(found==TRUE)//if already found then shift all remaining one position left.
	p->std[i-1]=p->std[i];
      else if(p->std[i].roll==roll)//if found
      {
	found=TRUE;
	printf("\nStudent removed. Name: %s\tRoll: %d\tGrade: %s",p->std[i].name,p->std[i].roll,p->std[i].grade);
      }
   }
   if(found==TRUE)
      p->rear--;
   else
      printf("Student not found.");
}
void updateStudent(list *p)
{
   int roll,i,found=FALSE;
   printf("Enter student roll no.");
   scanf("%d",&roll);
   for(i=0;i<=p->rear;i++)
   {
      if(p->std[i].roll==roll)
      {
	 fflush(stdin);
	 printf("\nYour name is %s. Enter new name:",p->std[i].name);
	 gets(p->std[i].name);
	 fflush(stdin);
	 printf("\nYour grade is %s. Enter new grade:",p->std[i].grade);
	 gets(p->std[i].grade);
	 fflush(stdin);
	 printf("\nYour roll no. is %d. Enter roll no.",p->std[i].roll);
	 scanf("%d",&p->std[i].roll);
	 printf("\nUpdated.");
	 found=TRUE;
	 break;
      }
   }
   if(found==FALSE)
    printf("\nStudent not found");
}
void listStudent(list*p)
{
   int i;
   printf("\nRoll No.\tName of Student\tGrade Name\n");
   for(i=0;i<=p->rear;i++)
    printf("%d\t\t%s\t\t%s\n",p->std[i].roll,p->std[i].name,p->std[i].grade);
}
