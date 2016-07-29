#include<stdio.h>
#include<unistd.h>
#include<signal.h>
#include<stdlib.h>
#include<time.h>

#define READY	0
#define	CASTING	1
#define WAITING	2
#define CATCH	3
#define ESCAPED	4
#define EXIT   -1

int count = 0;
int status = READY;
void recvsig(int sig){

    if(sig == SIGINT){

	if(status ==  CASTING){
	    printf("\nCast the fish rod\nBait into water, waiting fish...\n");
	    srand(time(0));
	    int rtime = 1+(5.0*rand()/(RAND_MAX+3.0));
	    alarm(rtime);
	    status = WAITING;
	}else{

	    printf("\nPull the fishing rod\n");

	    if(status == CATCH){
		count++;
		printf("Catch a Fish!!\nTotally caught fished: %d\n", count);
	    }else if(status == ESCAPED){
		printf("The bait is eaten!!\n");
	    }

	    status = READY;
	}

    }

    if(sig == SIGALRM){
	if(status == WAITING){
	    printf("A fish is biting, pull the fishing rod\n");
	    status = CATCH;
	    alarm(3);
	}else if(status == CATCH){
	    printf("The fish was escaped!!\n");
	    status = ESCAPED;
	}
    }

    if(sig == SIGTSTP){
	printf("\nTotally caught fished: %d\n", count);
	status = EXIT;
    }	
}

int main(){

    signal(SIGINT, recvsig);
    signal(SIGALRM, recvsig);
    signal(SIGTSTP, recvsig);

    while (status != EXIT){
        if(status == READY){
            printf("Fishing rod is ready!\n");
	    status = CASTING;
        }
    }
}
