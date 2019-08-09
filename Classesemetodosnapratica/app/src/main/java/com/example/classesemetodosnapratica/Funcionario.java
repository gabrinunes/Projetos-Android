package com.example.classesemetodosnapratica;

 class Funcionario {

     String nome;
     double salario;

      double recuperarSalario(double bonus, double descontoAdicional){
         this.salario = this.salario - (this.salario*0.1);
         return this.salario + bonus - descontoAdicional;
     }
 }
