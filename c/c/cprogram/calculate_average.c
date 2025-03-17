#include <stdio.h>

int main(void){
    
    int iNum;
    int iCounter = 0;
    int iGrade;
    int iTotal = 0;
    float fAverage;


    puts("Please input the number of students.");
    scanf("%d",&iNum);

    while (iNum <= 0){
        puts("Invaild number. Please input the number >0");
        scanf("%d",&iNum);
    }//end while(iNum<=0)

    while (iCounter < iNum){
        printf("please the grade of stduent %d:",iCounter+1);
        scanf("%d",&iGrade);

        while(iGrade < 0 || iGrade > 100){
            puts("Please enter the grade between 0~100.");
            scanf("%d",&iGrade);
        }//end while(iGrade < 0 || iGrade > 100)

        iTotal = iTotal + iGrade;
        iCounter = iCounter +1;
    }// end while(iCounter<iNum)

    fAverage = (float)iTotal/iNum;
    printf("class average = %f", fAverage);
}//end main