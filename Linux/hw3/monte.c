#include <stdio.h>
#include <time.h>
#include <signal.h>
#include <stdlib.h>
#include <unistd.h>
int n=0;
int sum=0;
int oc;
int g=0;
void format(){
    printf("pi=%f\n",(double)4*sum/n);

        exit(0);
}
int main(int argc,char **argv){
        srand((unsigned)time(NULL));
        double x,y;
        int i=1;
	

        while((oc = getopt(argc, argv, "n:")) != -1){
                switch(oc){
                        case 'n':
                                n=atoi(optarg);
                                break;
                        }
        }

        if(n>1){

         while (g<n){
                x=(double)rand()/RAND_MAX;
                y=(double)rand()/RAND_MAX;
                if((x*x+y*y)<1)sum++;
                g++;
        }
        format();
        }
        else{
	signal(SIGINT,format);
        while(1){
        x=(double)rand()/RAND_MAX;
                y=(double)rand()/RAND_MAX;
                if((x*x+y*y)<1)sum++;
                n++;
        }
        }

        return 0;
}

