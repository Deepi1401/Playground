#include<stdio.h>
int main()
{
  float P,n,r,SI;
  scanf("%f%f%f",&P,&n,&r);
  SI = (P*n*r) / 100;
  printf("%.6f",SI);
  return 0;
}