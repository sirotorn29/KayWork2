package janyaporn.kaywork2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class p2 extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    TextView textView3;
    String name;
    String pass;
    String number;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(p2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            name=bundle.getString("name");
            textView.setText(name);
            pass=bundle.getString("pass");
            textView2.setText(pass);
            number=bundle.getString("number");
            textView3.setText(number);
        }
    }
}
