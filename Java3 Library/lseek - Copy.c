#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>

int main()
{
    char fname[30];
    int fd=0,ret=0;
    char Data[11];

    printf("enter the file name that you want to open\n");
    scanf("%s",fname);

    fd=open(fname,O_RDWR);
    if(fd==-1)
    {
        printf("unable to open file\n");
        return -1;
    }
    else
    {
        printf("file us succefully opened with fd :%d\n",fd);
    }

    lseek(fd,4,0);

    read(fd,Data,6);

    write(1,Data,6);

    close(fd);
   

    return 0;
}