#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int vetor[5],i=0,retir,ultimo = 0;

void inserir(){
	int resp;
	do{
		if(ultimo < 5){
			printf("Digite o valor do vetor de posicao %d: ",ultimo);
			scanf("%d",&vetor[ultimo]);
			ultimo++;
			printf("\nDeseja inserir um novo numero 1-sim 2-nao: ");
			scanf("%d",&resp);
		}
		else{
			printf("Vetor cheio!!!");
			resp = 2;
		}
		printf("\n");
		
	}while(resp == 1);
	//ultimo = i;
}

int respos;
void retira(){
	do{
	//printf("\ndigite o valor a ser retirado: ");
	//scanf("%d",&retir);
	for (int i=0;i<=ultimo;i++){
		vetor[i] = vetor[i+1];
	}
	ultimo--;
	printf("\n\ndeseja retirar outro numero? 1-sim 2-nao  ");
	scanf("%d",&respos);
	}while(respos == 1);
}

void mostrar(){//MOSTRAR
	for(int i=0;i<ultimo;i++){
		printf("\nvetor de posicao %d: %d",i,vetor[i]);
		printf("\n----------------------------------");
	} 
	printf("\n----------------------------------\n\n");
}

void menu(){
	int retorn = 0;
	do{
	
	int op;
	printf("Escolha a opcao desejada: \n1- inserir;\n2- retirar;\n3- mostrar;\n4- sair.");
	scanf("%d",&op);
		if ((op == 1)||(op == 2)||(op == 3)||(op == 4)){
		switch(op){
		case 1:
			inserir();
			retorn = 1;
			break;
		case 2:
			retira();    
			retorn = 1;
			break;
		case 3:
			mostrar();
			retorn = 1;
			break;
		case 4:
			retorn = 2;
			break;

		}
		} else {
			printf("Opção inválida!");
		}
		
	}while(retorn != 2);
}

main(){
	//inserir();
	//retira();
	menu();
	
}
