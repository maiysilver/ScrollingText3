package com.example.scrollingtext2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String texto = "";

    private boolean botoncin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botoncin = false;
    }

    public void añadirComentario(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        if (botoncin == false) {
            button.setText("GUARDAR");
            editText.setText(editText.getText() + "\n\n#");
            editText.setSelection(editText.length());
            editText.setEnabled(true);
            editText.requestFocus();
        } else {
            editText.clearFocus();
            button.setText("ADD COMMENT");
            editText.setEnabled(false);
        }
        botoncin ^= true;
    }
}
