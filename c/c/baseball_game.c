#include <stdio.h>

// 函式宣告
void printBoard(int size, int board[size][size]);

int main() {
    int size = 3;
    int hit;
    int board[size][size];

    // 初始化 board
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            board[i][j] = 0;
        }
    }

    puts("Welcome to the baseball game!");
    printBoard(size, board);  // 顯示初始的遊戲板

    puts("Enter the number of the grid you hit (1-9), or enter 0 if you missed:");
    scanf("%d", &hit);  // 修正 scanf

    // 根據使用者輸入更新 board
    if (hit >= 1 && hit <= 9) {
        int row = (hit - 1) / size;
        int col = (hit - 1) % size;
        board[row][col] = hit;
    }

    printBoard(size, board);  // 顯示更新後的遊戲板

    return 0;
}

// 列印遊戲板
void printBoard(int size, int board[size][size]) {
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            printf(" %d ", board[i][j]);
            if (j < size - 1) {
                printf("|");  // 分隔列
            }
        }
        printf("\n");
        if (i < size - 1) {
            printf("---|---|---\n");  // 分隔欄
        }
    }
}
