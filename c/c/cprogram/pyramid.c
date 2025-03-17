#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main(){

int height;
printf("Please enter the height of the pyramid: "); //remind user to enter a number for height
scanf("%d", &height);

    if (height <= 0||height>9) {  //if the number is <0 or >9 ,user have to enter again
        printf("Error: Height must be a positive integer and between 1~9.\n");
    } else {  // if the number is between1~9, this program will print the pyramid
        print_pyramid(height);
    }
}//end main

void print_pyramid(int height) {
    for (int i = 1; i <= height; i++) { //control the height of the diamond
        for (int j = 1; j <= height-i; j++) { // print space
            printf(" ");
        }
        for (int k = 1; k <= (2 * i - 1); k++) { // print numbers
            printf("%d",1);
        }
        printf("\n");
    }
} //end print_pyramid


