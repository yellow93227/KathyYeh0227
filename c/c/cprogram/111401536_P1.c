#include <stdbool.h>
#include <stdio.h>

int main(void) {

    int iMenuoptions;
    int iDiningTime;
    int iNumberAdult = 0;
    int iNumberChild = 0;
    int iTotalNumber = 0;
    int n = 29;
    int cnt = 0;
    int iIntegers;
    float fPrice;
    puts("Please choose option 1 to calculate Buffet pricing, option 2 to calculate sum of non-prime numbers.");
    scanf("%d",&iMenuoptions);


        switch (iMenuoptions){
            case 1:     //calculate Buffet pricing

                puts("Please enter the dining time period:");
                scanf("%d",&iDiningTime);
                puts("Please enter the number of adults:");
                scanf("%d",&iNumberAdult);
                if(iNumberAdult<0){   //if user enter invalid number,they have to enter again
                    puts("Invaild number,Please enter the number>=0");
                    puts("Please enter the number of adults:");
                    scanf("%d",&iNumberAdult);
                }
                
                puts("Please enter the number if children:");
                scanf("%d",&iNumberChild);
                if(iNumberChild<0){   //if user enter invalid number,they have to enter again
                    puts("Invaild number,Please enter the number>=0");
                    puts("Please enter the number if children:");
                    scanf("%d",&iNumberChild);
                }

                iTotalNumber = iNumberAdult + iNumberChild;   //ensure total amount of customer, if a single purchase of 20 or more people can got 5% off

                switch(iDiningTime){
                    case 1:   //the dining time period in weekday lunch
                        puts("Weekday Lunch $985/person");
                        
                        if(iTotalNumber >= 20){  //if a single purchase of 20 or more people can got 5% off
                            fPrice = 0.95*iNumberAdult*985*1.1+0.95*iNumberChild*985*0.7*1.1;  
                        }
                        else{ //the orginal price plus 10% service charge and children's price is 30%off
                            fPrice = iNumberAdult*985*1.1+iNumberChild*985*0.7*1.1; 
                        }
                        printf("Total Amount to bo paid:%.0f\n",fPrice);
                        puts("<Back to the top menu>");
                        break; //end case 1(weekday lunch)
                    
                    case 2:  //the dining time period in weekday afternoon tea
                        puts("Weekday Afternoon Tea $795/person");
                        if(iTotalNumber >= 20){
                            fPrice = 0.95*iNumberAdult*795*1.1+0.95*iNumberChild*795*0.7*1.1;
                        }
                        else{
                            fPrice = iNumberAdult*795*1.1+iNumberChild*795*0.7*1.1;
                        }
                        printf("Total Amount to bo paid:%.0f\n",fPrice);
                        puts("<Back to the top menu>");
                        break;  //end case 2(weekday afternoon tea)

                    case 3:  //the dining time period in weekday dinner
                        puts("Weekday Dinner $1085/person");
                        if(iTotalNumber >= 20){
                            fPrice = 0.95*iNumberAdult*1085*1.1+0.95*iNumberChild*1085*0.7*1.1;
                        }
                        else{
                            fPrice = iNumberAdult*1085*1.1+iNumberChild*1085*0.7*1.1;
                        }
                        printf("Total Amount to bo paid:%.0f\n",fPrice);
                        puts("<Back to the top menu>");
                        break;  //end case 3(weekday dinner)
                    
                    case 4:   //the dining time period in weekend lunch
                        puts("Weekend Lunch $1085/person");
                        if(iTotalNumber >= 20){
                            fPrice = 0.95*iNumberAdult*1085*1.1+0.95*iNumberChild*1085*0.7*1.1;
                        }
                        else{
                            fPrice = iNumberAdult*1085*1.1+iNumberChild*1085*0.7*1.1;
                        }
                        printf("Total Amount to bo paid:%.0f\n",fPrice);
                        puts("<Back to the top menu>");
                        break;  //end case 4(weekend lunch)

                    case 5:   //the dining time period in weekend afternoon tea
                        puts("Weekend Afternoon Tea $975/person");
                        if(iTotalNumber >= 20){
                            fPrice = 0.95*iNumberAdult*975*1.1+0.95*iNumberChild*975*0.7*1.1;
                        }
                        else{
                            fPrice = iNumberAdult*975*1.1+iNumberChild*975*0.7*1.1;
                        }
                        printf("Total Amount to bo paid:%.0f\n",fPrice);
                        puts("<Back to the top menu>");
                        break;  //end case 5(weekend afternoon tea)

                    case 6:   //the dining time period in weekend dinner
                        puts("Weekend Dinner $1195/person");
                        if(iTotalNumber >= 20){
                            fPrice = 0.95*iNumberAdult*1195*1.1+0.95*iNumberChild*1195*0.7*1.1;
                        }
                        else{
                            fPrice = iNumberAdult*1195*1.1+iNumberChild*1195*0.7*1.1;
                        }
                        printf("Total Amount to bo paid:%.0f\n",fPrice);
                        puts("<Back to the top menu>");
                        break;  //end case 6(weekend dinner)

                    default:  //if user enter invalid number, this program will end
                        puts("Invalid option");
                        break;


            }

            break;  //end case 1(calaulate buffer pricing)

        case 2:     //calculate sum of non-prime numbers
            puts("Please enter the number of integers:");
            scanf("%d",&iIntegers);

            //if number is less than/equal to 1, it is not prime

            if(iIntegers <= 1)
                printf("%d is not a prime\n",iIntegers);
            else{
                for(int i = 1;i <= iIntegers; i++){
                    //check how many number is disvisible
                    //by n 
                    if(iIntegers % i == 0)
                        cnt++;
                    
                }
                //if n is disvisible by more than 2 numbers
                //then it is not prime
                if(cnt > 2)
                    printf("%d is NOT prime\n",iIntegers);

                //else it is prime 
                else
                    printf("%d is prime",iIntegers);
            }

            return 0;
            puts("<back to the top level menu>");

            break;

        default:
            puts("Invalid option");
            break;

    }  //end case 2(calculate sum of non-prime number)
}  //end main