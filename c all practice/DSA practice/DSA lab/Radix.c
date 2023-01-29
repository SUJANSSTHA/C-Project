#include<stdio.h>
#include<conio.h>
#define MAX 7
int getMaxDigitCount(int arr[],int n)
{
   int i,c=0;
   int max=arr[0];
   for(i=1;i<n;i++)
   {
      if(max<arr[i])
      max=arr[i];
   }
   //max has the highest no. of digits
   while(max>0)
   {
     max=max/10;
     c++;
   }
   return c;
}
void countsort(int arr	[],int n,int pos)
{
   int output[MAX],i;
   int count[10]={0};//counter is initialized to zero
   for(i=0;i<n;i++) //get the count of numbers having same digit at pos position
      count[(arr[i]/pos)%10]++;
   for(i=1;i<10;i++)
     count[i]+=count[i-1];
   for(i=n-1;i>=0;i--)
   {
      output[count[(arr[i]/pos)%10]-1]=arr[i];
      count[(arr[i]/pos)%10]--;
   }
   for(i=0;i<n;i++)
   arr[i]=output[i];

}
void radixsort(int arr[],int n)
{
  int i,pos=1,c=getMaxDigitCount(arr,n);//return 3 in this example. ie. count of digits of 111
  for(i=1;i<=c;i++)
  {
    countsort(arr,n,pos);
    pos*=10;
  }
}
void main()
{
   int arr[MAX]={23,5,7,2,11,111,15},i;
//    clrscr();
   printf("Before sorting....\n");
   for(i=0;i<MAX;i++)
   printf("%d\t",arr[i]);
   radixsort(arr,MAX);
   printf("\nAfter sorting....\n");
   for(i=0;i<MAX;i++)
   printf("%d\t",arr[i]);
   getch();
}