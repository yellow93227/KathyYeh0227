#include <stdio.h>

int main(void){

    int menuoptions;
    float fCelcius, fFarenheit;


    puts("This program will convert Celcius into Farenheit and vice versa");
    puts("Please enter 1 to convert Celcius into Farenheit or enter 2 to convert Farenheit into Celcius:");
   
    scanf("%d",&menuoptions);

    //transit Celcius into Farenheit
    if (menuoptions == 1){
        puts("Please enter a temperature in Celcius:");
        scanf("%f",&fCelcius);
        fFarenheit = fCelcius*9/5+32;
        printf("Temperature in Farenheit is %f\n", fFarenheit);
    }//end if
    
    //transit Farenheit into Celcius
    else if(menuoptions == 2){
        puts("Please enter a temperature in Farenheit:");
        scanf("%f",&fFarenheit);
        fCelcius = (fFarenheit-32)*5/9;
        printf("Temperature in Celcius is %f\n", fCelcius);
    }//end else if

    //if the user enters an option other than 1 or 2
    else{
        puts("Invalid option");
    } //end else


}// end main