#define _GNU_SOURCE
#include <stdio.h>
#include <unistd.h>
#include <dirent.h>
#include <stdlib.h>
#include <errno.h>
#include <sys/types.h>
#include <fcntl.h>
#include <string.h>
#define  BUF_SIZE 4096

    int inputFd, outputFd;
    ssize_t numIn, numOut;
    char buffer[BUF_SIZE];
    off_t begin=0, end=0;
    int fileSize, blockSize, pos=0;
        
        //ls
   
        
void test(struct dirent* ent,char** argv){

    printf("%s  ",ent->d_name); 
                printf("%d \n",ent->d_type); 
                    chdir(argv[1]);
                    
                    inputFd=open (ent->d_name,O_RDONLY);
                    if(inputFd==-1){
                    perror("cannot open the file for read");exit(1);
                    }
                    
                    chdir("../");
                    chdir(argv[2]);
                    
                    outputFd=open (ent->d_name,O_WRONLY|O_CREAT,S_IRUSR|S_IWUSR);
        
                    if(outputFd==-1){
                    perror("cannot open the file for write");exit(1);}
                    ftruncate(outputFd, 0);
                    fileSize = lseek(inputFd, 0, SEEK_END);
                    lseek(inputFd, 0, SEEK_SET);
                    while (1) {
                        pos = lseek(inputFd, pos, SEEK_DATA);
                        begin = pos;
                        pos = lseek(inputFd, pos, SEEK_HOLE);
                        end = pos;
                        blockSize=end-begin;
                        lseek(inputFd, begin, SEEK_SET);
                        lseek(outputFd, begin, SEEK_SET);
                        while((numIn = read (inputFd, buffer, BUF_SIZE)) > 0) {
                            numOut = write (outputFd, buffer, (ssize_t) numIn);
                            if (numIn != numOut) perror("numIn != numOut");
                            blockSize-=numIn;
                            if (blockSize == 0) break;
                        }
                        if (lseek(outputFd, 0, SEEK_CUR) == fileSize) break;
                    }
                    close (inputFd);
                    close (outputFd);
                    chdir("../");
                        
}
void test2(struct dirent* ent,char** argv){
       printf("%s  ",ent->d_name); 
                         printf("%d \n",ent->d_type); 
                         chdir(argv[2]);
                         mkdir(ent->d_name,0777);
                         chdir("../");
}

int main(int argc,char**argv){
        //cp
            DIR* dir;
        struct dirent* ent;
        dir=opendir(argv[1]);
        ent=readdir(dir);
        
       //pwd
         while(ent!=NULL){    
                if(ent->d_type==8){
                        test(ent,argv);
                        }
                if(ent->d_type==4&&ent->d_name!=".."&&ent->d_name!="."){    
                      test2(ent,argv);
                     }
                close(inputFd);close(outputFd);
        
                ent=readdir(dir);
        }

        closedir(dir);
     
        return 0;
}


