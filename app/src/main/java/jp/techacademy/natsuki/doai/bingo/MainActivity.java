package jp.techacademy.natsuki.doai.bingo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText;
    String edit = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("ビンゴカード作成アプリ");
        mEditText = (EditText) findViewById(R.id.editText);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    public void onClick(View v) {
        edit = mEditText.getText().toString();


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE", edit);
        startActivity(intent);

    }
}