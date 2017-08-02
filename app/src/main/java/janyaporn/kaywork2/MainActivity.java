package janyaporn.kaywork2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText usrename;
    EditText password;
    EditText tel;
    Button button;
    String name;
    String pass;
    String number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usrename = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        tel = (EditText)findViewById(R.id.editText3);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=usrename.getText().toString();
                pass=password.getText().toString();
                number=tel.getText().toString();

                Intent intent = new Intent(MainActivity.this,p2.class);
                intent.putExtra("name",name);
                intent.putExtra("pass",pass);
                intent.putExtra("number",number);
                startActivity(intent);
            }
        });

    }
}
