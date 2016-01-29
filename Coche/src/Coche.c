/*
 ============================================================================
 Name        : Coche.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

struct Coche{
	char matricula[7];
	char marca [50];
	char modelo [50];
	int cv;
};

int main (void) {
	setbuf(stdout,NULL);
	int num = 3;
	struct Coche taller[num];
	int i=0;
	for (;i<num;i++) {
		printf("\nIntroduce los datos del coche %d", i+1);
		printf("\nMatricula: ");
		gets(taller[i].matricula);
		printf("\nMarca: ");
		gets(taller[i].marca);
		printf("\nModelo: ");
		gets(taller[i].modelo);
		printf("\nCv: ");
		scanf("%d",&taller[i].cv);
		setbuf(stdin,NULL);
	}

i=0;
	for(;i<num;i++){
		printf("\n%s %s %s %d", taller[i].matricula, taller[i].marca, taller[i].modelo, taller[i].cv);
	}






	return EXIT_SUCCESS;
}
