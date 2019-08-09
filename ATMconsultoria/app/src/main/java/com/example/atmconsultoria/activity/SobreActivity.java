package com.example.atmconsultoria.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sobre);

        String descricao = "Funções de Negócio são estruturas conceituais idealizadas que servem para descrever a missão de uma Organização. Uma vez que tenham sido definidas e decompostas adequadamente, elas se mantêm estáveis ao longo do tempo, mesmo diante de reorganizações da empresa. Como são perenes, as funções representam um ponto de referência (conceitos comuns) ao se descrever diferentes negócios, que de outra forma exibiriam variações significativas.\n" +
                "Funções (verticais), Processos (horizontais) e Atividades de Negócios\n" +
                "Função de Negócio, Processo de Negócio e seus relacionamentos\n" +
                "\n" +
                "Esta definição é demonstrada, por exemplo, pelo fato de que a contabilidade define o contador, de que a função gerencial define o gerente, etc. Funções de negócio são também alocadas a unidades organizacionais específicas (que exercerão os diferentes papéis) e são envolvidas e invocadas no decorrer do \"comportamento\" do negócio.\n" +
                "\n" +
                "Podemos dizer que uma função corresponde a uma série de atividades relacionadas, envolvendo uma ou mais entidades de dados, realizadas com o objetivo de se cumprir um ou mais objetivos da missão da empresa, gerando um determinado resultado financeiro, ou servindo às necessidades dos clientes da empresa, ou dando origem aos produtos e serviços a serem negociados, ou gerenciando, administrando, monitorando, registrando e relatando as atividades, estados e condições das \"entidades\" da organização. \n";

        View sobre = new AboutPage(this)
         .setImage(R.drawable.logo)
         .setDescription(descricao)
         .addGroup("Fale conosco")
         .addEmail("atmconsultoria@gmail.com","Envie um E-mail")
         .addWebsite("http://www.google.com.br/")
         .addGroup("Redes socias")
         .addFacebook("google","Acesse nosso Facebook")
         .addTwitter("google")
         .addYoutube("google")
         .addInstagram("google")
         .create();

        setContentView(sobre);
    }
}
