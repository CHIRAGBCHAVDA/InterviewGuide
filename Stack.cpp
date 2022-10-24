#include<stdlib.h>
#include<iostream>

using namespace std;

#define n 10

int size = 0;

struct stack {
	int items[n];
	int t;
};

typedef struct stack st;

void createEmptyStack(st *s){
	s -> t = -1;
}

int isfull(st *s){
	if(s -> t == n-1)
		return 1;
	else
		return 0;
}

int isempty(st *s){
	if (s -> t == -1)
		return 1;
	else 
		return 0;
}

void push(st *s, int newitem){
	if(isfull(s)){
		cout << "Stack Full";
	}
	else{
		s->t++;
		s->items[s->t] = newitem;
	}
	size++;
}

void pop(st *s){
	if(isempty(s)){
		cout<< "Stack Empty";
	}
	else{
		cout <<"Item popped"<<s->items[s->t];
		s->t--;
	}
	size--;
	cout<<endl;
}


void printStack(st *s){
	printf("Stack:  ");
	for(int i =0; i < size; i++){
		cout<< s->items[i] << " ";
	}
	cout<<endl;
}


void change(st *s,int l, int d){
	for(int i = 0;i< size; i++){
		
		if(i == l){
			s->items[i] = d; 
		
		}
	}
}

int main(){
	int ch;
	st *s = (st *)malloc(sizeof(st));
	
	createEmptyStack(s);
	
	push(s,1);
	push(s,2);
	push(s,3);
	//pop(s);
	push(s,4);
	
	printStack(s);
	
	pop(s);
	
	cout<<"\n After Popping \n:";
	printStack(s);
	
	
	cout<<"\n After Changing value\n:";
	change(s,0,100);
	printStack(s);
	
}
