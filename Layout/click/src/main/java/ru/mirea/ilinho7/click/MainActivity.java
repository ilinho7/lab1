package ru.mirea.ilinho7.click;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text =(TextView) findViewById(R.id.Text);
        //Button btok = (Button) findViewById(R.id.btOK);
        //Button btcancel = (Button) findViewById(R.id.btCancel);
    }

    public void clickOK(View view) {
        text.setText("Нажали ок");
    }

    public void clickCancel(View view) {
        text.setText("Нажали Cancel");
    }
}
