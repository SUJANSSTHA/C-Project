//  We will  write a program that generates a random number and asks the players to guess it. if the players guess is higer than the actual number the program diplay " lower number please", Similarly if the user guess is too low, the program prints "higher number plase".
// When the user guesses the correect number the program displays the numbers of guesses the player used to arrive at the number
// Hint : Use loops
            // : use a random number generator

#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main(){
    int num, guess, nguess=1;
    srand(time(0));
    num = rand()%100+1; 
    // printf("The number is %d\n", num);

    // keep runnning the loop until the number is guessed
    do{
        printf("\nGuess the number between 1 to 100\n");
        scanf("%d", &guess);
        if (guess>num)
        {
            printf("Lower number please\n");
        }
        else if (guess<num)
        {
            printf("Higer number please\n");
        }
        else{
            printf("You guessed it is %d attempts\n", nguess);
        }
        nguess++;
    }while(guess!=num);
    return 0;
}