#include <stdio.h>

// call the functions
void menu(); //show menu
void displayMatrix(int rows, int cols,int matrix[rows][cols]); 
void DiamondStars(int layers);
double calculate_mean(int x1, int x2, int x3);
double calculate_stddev(int x1, int x2, int x3, double mean);


int main() {
    int iMenuOptions;

    do {
        menu(); // show options
        printf("Please choose which option you want to do:");
        scanf("%d", &iMenuOptions);

        switch (iMenuOptions) {
            case 1: { // Square pattern    
                int rows, cols ;
                int mat[rows][cols];
                printf("Please enter the number of the rows:");
                scanf("%d",&rows);
                printf("Please enter the number of the columns:");
                scanf("%d",&cols);
                printf("Rectangle Pattern :\n"); // show the square pattern
                displayMatrix(rows, cols,mat );
                break;
            } //end case 1
            case 2: { // Diamond pattern with stars
                int layers;
                printf("Please enter the number of layers of the diamond:");
                scanf("%d",&layers);
                if (layers <= 0 ) { 
                    printf("Error:Layers must be positive and odd numbers.\n");
                } 
                else {
                    printf("Diamond pattern with stars\n");
                    DiamondStars(layers);
                }

                break;
            }//end case 2
            case 3: { // Standardize three numbers
                int x1, x2, x3;
                printf("Please enter three integers\n");
                scanf("%d,%d,%d",&x1,&x2,&x3 );
                double mean = calculate_mean( x1, x2, x3);
                double stddev = calculate_stddev(x1, x2, x3, mean);
                printf("Z1= %.3f\n", (x1-mean)/stddev);
                printf("Z2= %.3f\n", (x2-mean)/stddev);
                printf("Z3= %.3f\n", (x3-mean)/stddev);
                break;
            }//end case3
            case 4: // end this program
                printf("Exiting the program. Goodbye!\n");
                break; //end case 4
            default:
                printf("Invalid choice. Please select an option between 1 and 4.\n");
        }
    } while (iMenuOptions != 4); // repeat until user choose to leave

    return 0;
} //end main


void menu() {
    printf("1: Square pattern\n");
    printf("2: Diamond pattern with stars\n");
    printf("3: Standardize three numbers \n");
    printf("4: End programs\n");
} //end menu


void displayMatrix(int rows, int cols,int matrix[rows][cols]) {

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("1");
        } //end for2
        printf("\n");
    }// end for1
} //end displayMatrix

void DiamondStars(int layers) {
    printf("\n ===Diamond pattern with stars===\n");
    for (int i = 1; i <= layers; i++) { //control the later of the diamond
        for (int j = 1; j <= layers-i; j++) { // print space
            printf(" ");
        }
        for (int k = 1; k <= (2 * i - 1); k++) { // print stars
            printf("*");
        }
        printf("\n");
    }
} //end Diamond stars


double calculate_mean(int x1, int x2, int x3){
    return  (x1+x2+x3)/3;
} //end calculate_mean

double calculate_stddev(int x1, int x2, int x3, double mean){
    mean = (x1+x2+x3)/3;
    double a = (x1-mean)*(x1-mean)+(x2-mean)*(x2-mean)+(x3-mean)*(x3-mean);
    return (a/3); //開根號
} //end calculate_stddev

