package com.example.classesemetodosnapratica;

class Animal {

 int tamanho;
 String cor;
 double peso;

 public String getCor() {
  return cor;
 }

 public void setCor(String cor) {
  this.cor = cor;
 }

 void dormir(){

  System.out.println("Dormir como um animal");
 }

 void correr(){
  System.out.println("Correr como um");
 }
}
