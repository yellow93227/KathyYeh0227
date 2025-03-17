#include <stdio.h>

int main(void){

    int iScore;
    int iAverage;
    int iNumber1,iNumber2,iNumber3,iNumber4,iNumber5;

    puts("Please enter the score of three students:"); //tell user to input three score
    scanf("%d %d %d",&iScore ,&iScore ,&iScore); //save the data that user tell us into iScore
    
    if(iScore>=0 & iScore<=100){ //if grede between0-100 will show the grade distribution
        iAverage = iScore/10; 

        if(iAverage == 10 &&iAverage == 9){
            iNumber1=0 +1;
        }
        if(iAverage == 8){
            iNumber2=0 +1;
        }
        if(iAverage == 7){
            iNumber3=0 +1;
        }
        if(iAverage == 6){
            iNumber4=0 +1;
        }
        if(iAverage<6){
            iNumber5=0 +1;
        }
        printf("Grade Distribution\nA (90 and above): %d student(s)\nB (80-89): %d student(s)\nC (70-79): %d student(s)\nD (60-69): %d student(s)\nF (Below 60): %d student(s)",iNumber1,iNumber2,iNumber3,iNumber4,iNumber5);

    }//end if
    else{
        printf("Sorry, all scores must between 0 and 100.");
    }//end else
}//end main