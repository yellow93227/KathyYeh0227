#include<stdio.h>

int main(){
    int size=3;
    int hit;
    int board[size][size];
    puts("Welcome to the baseball game!");
    printBoard(size,board);  //show user the initial game board
    puts("Enter the number of the grid you hit(1-9), or enter 0 if you missed:");//remind user enter the number that just hit
    scanf("%d",hit);
    printBoard(size,board);

}//end main

void printBoard(int size,int board[size][size]){
    for (int i = 0; i < size; i++){
        for (int j = 0;j < size;j++){
            printf(" %d ",board[i][j]);
            if (j < size-1){
                printf("|"); //every row with | to seperate
            }
        }
        printf("\n");
        if (i < size -1){
            printf("---|---|---\n"); //every column with --- to seperate
        }
    }
} // end printBoard