package jp.techacademy.natsuki.doai.bingo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.graphics.Color;

public class SecondActivity extends AppCompatActivity  implements View.OnClickListener {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
            button11, button12, button13, button14, button15, button16, button17, button18, button19, button20,
            button21, button22, button23, button24, buttonRegenerate;
    String num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, num15, num16, num17,
    num18, num19, num20, num21, num22, num23, num24;

    int[] number = new int[24]; //移動

    boolean switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(this);
        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(this);
        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(this);
        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(this);
        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(this);
        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(this);
        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(this);
        button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(this);
        button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(this);
        button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(this);
        button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(this);
        button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(this);
        button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(this);
        button23 = (Button) findViewById(R.id.button23);
        button23.setOnClickListener(this);
        button24 = (Button) findViewById(R.id.button24);
        button24.setOnClickListener(this);

        buttonRegenerate = (Button) findViewById(R.id.buttonRegenerate);
        buttonRegenerate.setOnClickListener(this);

        Intent intent = getIntent();
        String value = intent.getStringExtra("VALUE");
        setTitle(value + "のビンゴカード");

        numbersGenerator();
    }

    public void numbersGenerator() {
        Math.random();
        Math.random();
        Math.random();

        //24個の重複なしの番号を生成

        for (int i = 0; i < number.length; i++) {
            Loop:
            while (true) {
                int work = (int) (Math.random() * 75) + 1;  //0~9の数値を入れる
                for (int j = 0; j < i; j++) {
                    //その前までの数値のどれかとかぶっていたら数値代入からやり直し
                    if (number[j] == work) continue Loop;
                }
                number[i] = work;
                break;
            }
        }

        num1 = String.valueOf(number[0]);
        button1.setText(num1);
        num2 = String.valueOf(number[1]);
        button2.setText(num2);
        num3 = String.valueOf(number[2]);
        button3.setText(num3);
        num4 = String.valueOf(number[3]);
        button4.setText(num4);
        num5 = String.valueOf(number[4]);
        button5.setText(num5);
        num6 = String.valueOf(number[5]);
        button6.setText(num6);
        num7 = String.valueOf(number[6]);
        button7.setText(num7);
        num8 = String.valueOf(number[7]);
        button8.setText(num8);
        num9 = String.valueOf(number[8]);
        button9.setText(num9);
        num10 = String.valueOf(number[9]);
        button10.setText(num10);
        num11 = String.valueOf(number[10]);
        button11.setText(num11);
        num12 = String.valueOf(number[11]);
        button12.setText(num12);
        num13 = String.valueOf(number[12]);
        button13.setText(num13);
        num14 = String.valueOf(number[13]);
        button14.setText(num14);
        num15 = String.valueOf(number[14]);
        button15.setText(num15);
        num16 = String.valueOf(number[15]);
        button16.setText(num16);
        num17 = String.valueOf(number[16]);
        button17.setText(num17);
        num18 = String.valueOf(number[17]);
        button18.setText(num18);
        num19 = String.valueOf(number[18]);
        button19.setText(num19);
        num20 = String.valueOf(number[19]);
        button20.setText(num20);
        num21 = String.valueOf(number[20]);
        button21.setText(num21);
        num22 = String.valueOf(number[21]);
        button22.setText(num22);
        num23 = String.valueOf(number[22]);
        button23.setText(num23);
        num24 = String.valueOf(number[23]);
        button24.setText(num24);


        /*
        button2.setText(number[1]);
        button3.setText(number[2]);
        button4.setText(number[3]);
        button5.setText(number[4]);
        button6.setText(number[5]);
        button7.setText(number[6]);
        button8.setText(number[7]);
        button9.setText(number[8]);
        button10.setText(number[9]);
        button11.setText(number[10]);
        button12.setText(number[11]);
        button13.setText(number[12]);
        button14.setText(number[13]);
        button15.setText(number[14]);
        button16.setText(number[15]);
        button17.setText(number[16]);
        button18.setText(number[17]);
        button19.setText(number[18]);
        button20.setText(number[19]);
        button21.setText(number[20]);
        button22.setText(number[21]);
        button23.setText(number[22]);
        button24.setText(number[23]);
        */
    }

    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            if (!switch1) {
                button1.setBackgroundColor(Color.rgb(25, 25, 112));
                button1.setTextColor(0xFFFFFFFF);
                switch1 = true;
            } else {
                button1.setBackgroundColor(Color.rgb(255, 255, 255));
                button1.setTextColor(Color.rgb(0, 0, 0));
                switch1 = false;
            }
        } else if (v.getId() == R.id.button2) {
            button2.setBackgroundColor(Color.rgb(25, 25, 112));
            button2.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button3) {
            button3.setBackgroundColor(Color.rgb(25, 25, 112));
            button3.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button4) {
            button4.setBackgroundColor(Color.rgb(25, 25, 112));
            button4.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button5) {
            button5.setBackgroundColor(Color.rgb(25, 25, 112));
            button5.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button6) {
            button6.setBackgroundColor(Color.rgb(25, 25, 112));
            button6.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button7) {
            button7.setBackgroundColor(Color.rgb(25, 25, 112));
            button7.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button8) {
            button8.setBackgroundColor(Color.rgb(25, 25, 112));
            button8.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button9) {
            button9.setBackgroundColor(Color.rgb(25, 25, 112));
            button9.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button10) {
            button10.setBackgroundColor(Color.rgb(25, 25, 112));
            button10.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button11) {
            button11.setBackgroundColor(Color.rgb(25, 25, 112));
            button11.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button12) {
            button12.setBackgroundColor(Color.rgb(25, 25, 112));
            button12.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button13) {
            button13.setBackgroundColor(Color.rgb(25, 25, 112));
            button13.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button14) {
            button14.setBackgroundColor(Color.rgb(25, 25, 112));
            button14.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button15) {
            button15.setBackgroundColor(Color.rgb(25, 25, 112));
            button15.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button16) {
            button16.setBackgroundColor(Color.rgb(25, 25, 112));
            button16.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button17) {
            button17.setBackgroundColor(Color.rgb(25, 25, 112));
            button17.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button18) {
            button18.setBackgroundColor(Color.rgb(25, 25, 112));
            button18.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button19) {
            button19.setBackgroundColor(Color.rgb(25, 25, 112));
            button19.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button20) {
            button20.setBackgroundColor(Color.rgb(25, 25, 112));
            button20.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button21) {
            button21.setBackgroundColor(Color.rgb(25, 25, 112));
            button21.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button22) {
            button22.setBackgroundColor(Color.rgb(25, 25, 112));
            button22.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button23) {
            button23.setBackgroundColor(Color.rgb(25, 25, 112));
            button23.setTextColor(0xFFFFFFFF);
        } else if (v.getId() == R.id.button24) {
            button24.setBackgroundColor(Color.rgb(25, 25, 112));
            button24.setTextColor(0xFFFFFFFF);
        } else {
            numbersGenerator();
        }
    }
}
