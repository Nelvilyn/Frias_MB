package com.example.swapperchecker;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText input1;
    EditText input2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button_check);
            input1= (EditText) findViewById(R.id.first_string_edit_text);
            input2 = (EditText) findViewById(R.id.second_string_edit_text);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent intent = new Intent(getApplicationContext(), MyMessage.class);
                String firstintput = input1.getText().toString();
                String secondinput = input2.getText().toString();
                if (firstintput.equalsIgnoreCase(sec)) {
                    intent.putExtra("message", "THE SAME");
                    startActivity(i);

                } else {
                    intent.putExtra("message", "NOT THE SAME");
                    startActivity(i);
                }
            }
        });
    }
        public void onSwap (View view){
        input1 = (EditText) findViewById(R.id.first_string_edit_text);
        input2 = (EditText) findViewById(R.id.second_string_edit_text);
        String getFirstString = String.valueOf(input1.getText());
        String getSecondString = String.valueOf(input2.getText());
           input1.setText(getSecondString);
           input2.setText(getFirstString);
    }
}
