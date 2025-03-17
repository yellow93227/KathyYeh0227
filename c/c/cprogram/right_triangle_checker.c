#include <stdio.h>

int main(void){

    int iLength1,iLength2,iLength3;

    // tell the user to input three lingths of trangle
    puts("Please enter the first lengths of three sides:");
    scanf("%d",&iLength1);
    puts("Please enter the second number lengths of three sides:");
    scanf("%d",&iLength2);
    puts("Please enter the third number lengths of three sides:");
    scanf("%d",&iLength3);

    if(iLength1*iLength1+iLength2*iLength2 == iLength3*iLength3){ //if the case follow the Pythagorean theorem
        printf("A Right Trangle"); //print this case is a right trangle
    }
    else if (iLength3*iLength3+iLength2*iLength2 == iLength1*iLength1){
        printf("A Right Trangle");
    }
    else if (iLength1*iLength1+iLength3*iLength3 == iLength2*iLength2){
        printf("A Right Trangle");
    }
    else{ // if the casenot suits the Pythagorean theorem
        printf("Not a Right Trangle"); //print this case is not a right trangle
    }//end else
}//end main