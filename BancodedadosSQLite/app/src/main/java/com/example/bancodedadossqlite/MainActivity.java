package com.example.bancodedadossqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try{

            //Criação Banco de Dados
            SQLiteDatabase  bancoDados = openOrCreateDatabase("app",MODE_PRIVATE,null);

            //Criar Tabela
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas ( nome VARCHAR , idade INT(3))");

            //Inserir Dados na Tabela
            bancoDados.execSQL("INSERT INTO pessoas (nome,idade) VALUES ('Gabriela',25)");
           // bancoDados.execSQL("INSERT INTO pessoas (nome,idade) VALUES ('Victor',24)");

            //Recuperar as Pessoas

            /*String consulta = "SELECT nome,idade" +
                    " FROM pessoas" +
                    " WHERE nome  = 'Beatriz'AND idade = 25";*/


            /*String consulta = "SELECT nome,idade" +
                    " FROM pessoas" +
                    " WHERE idade >=20";*/


            /*String consulta = "SELECT nome,idade" +
                    " FROM pessoas" +
                    " WHERE nome IN('Gabriel','Beatriz')";*/

            /*String consulta = "SELECT nome,idade" +
                    " FROM pessoas" +
                    " WHERE idade BETWEEN 20 AND 25";*/

            String consulta = "SELECT nome,idade" +
                    " FROM pessoas" +
                    " WHERE nome LIKE 'gab%'";




            Cursor cursor = bancoDados.rawQuery(consulta,null);

            //Indices da Tabela

            int IndiceNome = cursor.getColumnIndex("nome");
            int IndiceIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();

            while (cursor!=null){

                String nome = cursor.getString(IndiceNome);
                String idade = cursor.getString(IndiceIdade);

                Log.i("RESULTADO - nome",nome + " idade: " + idade);
                cursor.moveToNext();
            }



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
