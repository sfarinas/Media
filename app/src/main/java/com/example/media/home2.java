package com.example.media;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class home2 extends AppCompatActivity {
     TextView tvResultMedia;
     TextView tvPassou;
     EditText edNota1;
     EditText edNota2;
     EditText edNota3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        tvResultMedia = findViewById(R.id.tvResltMedia);
        tvPassou = findViewById(R.id.tvPassou);
        edNota1 = findViewById(R.id.edtNota1);
        edNota2 = findViewById(R.id.edtNota2);
        edNota3 = findViewById(R.id.edtNota3);
    }
    public void calcular(View view){

        //System.out.println("LogErro");
         double nota1,nota2,nota3;

         try {
             nota1 = Double.parseDouble(edNota1.getText().toString());
             nota2 = Double.parseDouble(edNota2.getText().toString());
             nota3 = Double.parseDouble(edNota3.getText().toString());

             double soma = nota1 + nota2 + nota3;
             double media = soma / 3;

             tvResultMedia.setText(String.format("%.2f",media));

             if (Double.isNaN(media)){
                 Toast.makeText(getApplicationContext(),"Digite as notas",Toast.LENGTH_LONG).show();
             }else {
                 if (media >= 6) {
                     tvPassou.setText("Aprovado!");
                 } else {
                     tvPassou.setText("Reprovado!");
                 }
             }
         } catch (NumberFormatException e){
             Toast.makeText(getApplicationContext(), "Digite valores válidos para as notas", Toast.LENGTH_LONG).show();
         }
    }
}