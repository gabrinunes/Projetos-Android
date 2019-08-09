package com.example.classesemetodosnapratica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cao cao = new Cao();
        cao.correr();






        /*Funcionario funcionario = new Funcionario();
        funcionario.nome ="Gabriel";
        funcionario.salario =920;

         double salarioRecuperado = funcionario.recuperarSalario(150,20);
        System.out.println("O Salário do Gabriel é: " + salarioRecuperado);*/

    }
}
