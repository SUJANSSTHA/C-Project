#include<stdio.h>

void bubbleshort(int arr[],int n)
{
    int temp,i,j;
    for(i=0;i<n-1;i++)
    {
        fpr(j=0;i<n-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        printf
    }

}
int main()
{
    int num[]={23,454,22,77,433,77,11,1,22,0,1,2,4};
    int i;
    printf("before sorting............\n");
    for(i=0;i<10;i++)
    printf("%d\t",num[i]);
    bubbleshort(num[i]);
    printf("after sorting,,,,,,,\n");
    for(i=0;i<10;i++)
      printf("%d\t",num[i]);


}