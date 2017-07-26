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
    String[] num = new String[24]; //数字を文字データに変換

    int[] number = new int[24];

    boolean switch1, switch2, switch3, switch4, switch5, switch6, switch7, switch8, switch9, switch10, switch11, switch12, switch13,
    switch14, switch15, switch16, switch17, switch18, switch19, switch20, switch21, switch22, switch23, switch24;

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

        num[0] = String.valueOf(number[0]);
        button1.setText(num[0]);
        num[1] = String.valueOf(number[1]);
        button2.setText(num[1]);
        num[2] = String.valueOf(number[2]);
        button3.setText(num[2]);
        num[3] = String.valueOf(number[3]);
        button4.setText(num[3]);
        num[4] = String.valueOf(number[4]);
        button5.setText(num[4]);
        num[5] = String.valueOf(number[5]);
        button6.setText(num[5]);
        num[6] = String.valueOf(number[6]);
        button7.setText(num[6]);
        num[7] = String.valueOf(number[7]);
        button8.setText(num[7]);
        num[8] = String.valueOf(number[8]);
        button9.setText(num[8]);
        num[9] = String.valueOf(number[9]);
        button10.setText(num[9]);
        num[10] = String.valueOf(number[10]);
        button11.setText(num[10]);
        num[11] = String.valueOf(number[11]);
        button12.setText(num[11]);
        num[12] = String.valueOf(number[12]);
        button13.setText(num[12]);
        num[13] = String.valueOf(number[13]);
        button14.setText(num[13]);
        num[14] = String.valueOf(number[14]);
        button15.setText(num[14]);
        num[15] = String.valueOf(number[15]);
        button16.setText(num[15]);
        num[16] = String.valueOf(number[16]);
        button17.setText(num[16]);
        num[17] = String.valueOf(number[17]);
        button18.setText(num[17]);
        num[18] = String.valueOf(number[18]);
        button19.setText(num[18]);
        num[19] = String.valueOf(number[19]);
        button20.setText(num[19]);
        num[20] = String.valueOf(number[20]);
        button21.setText(num[20]);
        num[21] = String.valueOf(number[21]);
        button22.setText(num[21]);
        num[22] = String.valueOf(number[22]);
        button23.setText(num[22]);
        num[23] = String.valueOf(number[23]);
        button24.setText(num[23]);
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
            if (!switch2) {
                button2.setBackgroundColor(Color.rgb(25, 25, 112));
                button2.setTextColor(0xFFFFFFFF);
                switch2 = true;
            } else {
                button2.setBackgroundColor(Color.rgb(255, 255, 255));
                button2.setTextColor(Color.rgb(0, 0, 0));
                switch2 = false;
            }
        } else if (v.getId() == R.id.button3) {
            if (!switch3) {
                button3.setBackgroundColor(Color.rgb(25, 25, 112));
                button3.setTextColor(0xFFFFFFFF);
                switch3 = true;
            } else {
                button3.setBackgroundColor(Color.rgb(255, 255, 255));
                button3.setTextColor(Color.rgb(0, 0, 0));
                switch3 = false;
            }
        } else if (v.getId() == R.id.button4) {
            if (!switch4) {
                button4.setBackgroundColor(Color.rgb(25, 25, 112));
                button4.setTextColor(0xFFFFFFFF);
                switch4 = true;
            } else {
                button4.setBackgroundColor(Color.rgb(255, 255, 255));
                button4.setTextColor(Color.rgb(0, 0, 0));
                switch4 = false;
            }
        } else if (v.getId() == R.id.button5) {
            if (!switch5) {
                button5.setBackgroundColor(Color.rgb(25, 25, 112));
                button5.setTextColor(0xFFFFFFFF);
                switch5 = true;
            } else {
                button5.setBackgroundColor(Color.rgb(255, 255, 255));
                button5.setTextColor(Color.rgb(0, 0, 0));
                switch5 = false;
            }
        } else if (v.getId() == R.id.button6) {
            if (!switch6) {
                button6.setBackgroundColor(Color.rgb(25, 25, 112));
                button6.setTextColor(0xFFFFFFFF);
                switch6 = true;
            } else {
                button6.setBackgroundColor(Color.rgb(255, 255, 255));
                button6.setTextColor(Color.rgb(0, 0, 0));
                switch6 = false;
            }
        } else if (v.getId() == R.id.button7) {
            if (!switch7) {
                button7.setBackgroundColor(Color.rgb(25, 25, 112));
                button7.setTextColor(0xFFFFFFFF);
                switch7 = true;
            } else {
                button7.setBackgroundColor(Color.rgb(255, 255, 255));
                button7.setTextColor(Color.rgb(0, 0, 0));
                switch7 = false;
            }
        } else if (v.getId() == R.id.button8) {
            if (!switch8) {
                button8.setBackgroundColor(Color.rgb(25, 25, 112));
                button8.setTextColor(0xFFFFFFFF);
                switch8 = true;
            } else {
                button8.setBackgroundColor(Color.rgb(255, 255, 255));
                button8.setTextColor(Color.rgb(0, 0, 0));
                switch8 = false;
            }
        } else if (v.getId() == R.id.button9) {
            if (!switch9) {
                button9.setBackgroundColor(Color.rgb(25, 25, 112));
                button9.setTextColor(0xFFFFFFFF);
                switch9 = true;
            } else {
                button9.setBackgroundColor(Color.rgb(255, 255, 255));
                button9.setTextColor(Color.rgb(0, 0, 0));
                switch9 = false;
            }
        } else if (v.getId() == R.id.button10) {
            if (!switch10) {
                button10.setBackgroundColor(Color.rgb(25, 25, 112));
                button10.setTextColor(0xFFFFFFFF);
                switch10 = true;
            } else {
                button10.setBackgroundColor(Color.rgb(255, 255, 255));
                button10.setTextColor(Color.rgb(0, 0, 0));
                switch10 = false;
            }
        } else if (v.getId() == R.id.button11) {
            if (!switch11) {
                button11.setBackgroundColor(Color.rgb(25, 25, 112));
                button11.setTextColor(0xFFFFFFFF);
                switch11 = true;
            } else {
                button11.setBackgroundColor(Color.rgb(255, 255, 255));
                button11.setTextColor(Color.rgb(0, 0, 0));
                switch11 = false;
            }
        } else if (v.getId() == R.id.button12) {
            if (!switch12) {
                button12.setBackgroundColor(Color.rgb(25, 25, 112));
                button12.setTextColor(0xFFFFFFFF);
                switch12 = true;
            } else {
                button12.setBackgroundColor(Color.rgb(255, 255, 255));
                button12.setTextColor(Color.rgb(0, 0, 0));
                switch12 = false;
            }
        } else if (v.getId() == R.id.button13) {
            if (!switch13) {
                button13.setBackgroundColor(Color.rgb(25, 25, 112));
                button13.setTextColor(0xFFFFFFFF);
                switch13 = true;
            } else {
                button13.setBackgroundColor(Color.rgb(255, 255, 255));
                button13.setTextColor(Color.rgb(0, 0, 0));
                switch13 = false;
            }
        } else if (v.getId() == R.id.button14) {
            if (!switch14) {
                button14.setBackgroundColor(Color.rgb(25, 25, 112));
                button14.setTextColor(0xFFFFFFFF);
                switch14 = true;
            } else {
                button14.setBackgroundColor(Color.rgb(255, 255, 255));
                button14.setTextColor(Color.rgb(0, 0, 0));
                switch14 = false;
            }
        } else if (v.getId() == R.id.button15) {
            if (!switch15) {
                button15.setBackgroundColor(Color.rgb(25, 25, 112));
                button15.setTextColor(0xFFFFFFFF);
                switch15 = true;
            } else {
                button15.setBackgroundColor(Color.rgb(255, 255, 255));
                button15.setTextColor(Color.rgb(0, 0, 0));
                switch15 = false;
            }
        } else if (v.getId() == R.id.button16) {
            if (!switch16) {
                button16.setBackgroundColor(Color.rgb(25, 25, 112));
                button16.setTextColor(0xFFFFFFFF);
                switch16 = true;
            } else {
                button16.setBackgroundColor(Color.rgb(255, 255, 255));
                button16.setTextColor(Color.rgb(0, 0, 0));
                switch16 = false;
            }
        } else if (v.getId() == R.id.button17) {
            if (!switch17) {
                button17.setBackgroundColor(Color.rgb(25, 25, 112));
                button17.setTextColor(0xFFFFFFFF);
                switch17 = true;
            } else {
                button17.setBackgroundColor(Color.rgb(255, 255, 255));
                button17.setTextColor(Color.rgb(0, 0, 0));
                switch17 = false;
            }
        } else if (v.getId() == R.id.button18) {
            if (!switch18) {
                button18.setBackgroundColor(Color.rgb(25, 25, 112));
                button18.setTextColor(0xFFFFFFFF);
                switch18 = true;
            } else {
                button18.setBackgroundColor(Color.rgb(255, 255, 255));
                button18.setTextColor(Color.rgb(0, 0, 0));
                switch18 = false;
            }
        } else if (v.getId() == R.id.button19) {
            if (!switch19) {
                button19.setBackgroundColor(Color.rgb(25, 25, 112));
                button19.setTextColor(0xFFFFFFFF);
                switch19 = true;
            } else {
                button19.setBackgroundColor(Color.rgb(255, 255, 255));
                button19.setTextColor(Color.rgb(0, 0, 0));
                switch19 = false;
            }
        } else if (v.getId() == R.id.button20) {
            if (!switch20) {
                button20.setBackgroundColor(Color.rgb(25, 25, 112));
                button20.setTextColor(0xFFFFFFFF);
                switch20 = true;
            } else {
                button20.setBackgroundColor(Color.rgb(255, 255, 255));
                button20.setTextColor(Color.rgb(0, 0, 0));
                switch20 = false;
            }
        } else if (v.getId() == R.id.button21) {
            if (!switch21) {
                button21.setBackgroundColor(Color.rgb(25, 25, 112));
                button21.setTextColor(0xFFFFFFFF);
                switch21 = true;
            } else {
                button21.setBackgroundColor(Color.rgb(255, 255, 255));
                button21.setTextColor(Color.rgb(0, 0, 0));
                switch21 = false;
            }
        } else if (v.getId() == R.id.button22) {
            if (!switch22) {
                button22.setBackgroundColor(Color.rgb(25, 25, 112));
                button22.setTextColor(0xFFFFFFFF);
                switch22 = true;
            } else {
                button22.setBackgroundColor(Color.rgb(255, 255, 255));
                button22.setTextColor(Color.rgb(0, 0, 0));
                switch22 = false;
            }
        } else if (v.getId() == R.id.button23) {
            if (!switch23) {
                button23.setBackgroundColor(Color.rgb(25, 25, 112));
                button23.setTextColor(0xFFFFFFFF);
                switch23 = true;
            } else {
                button23.setBackgroundColor(Color.rgb(255, 255, 255));
                button23.setTextColor(Color.rgb(0, 0, 0));
                switch23 = false;
            }
        } else if (v.getId() == R.id.button24) {
            if (!switch24) {
                button24.setBackgroundColor(Color.rgb(25, 25, 112));
                button24.setTextColor(0xFFFFFFFF);
                switch24 = true;
            } else {
                button24.setBackgroundColor(Color.rgb(255, 255, 255));
                button24.setTextColor(Color.rgb(0, 0, 0));
                switch24 = false;
            }
        } else {
            button1.setBackgroundColor(Color.rgb(255, 255, 255));
            button1.setTextColor(Color.rgb(0, 0, 0));
            button2.setBackgroundColor(Color.rgb(255, 255, 255));
            button2.setTextColor(Color.rgb(0, 0, 0));
            button3.setBackgroundColor(Color.rgb(255, 255, 255));
            button3.setTextColor(Color.rgb(0, 0, 0));
            button4.setBackgroundColor(Color.rgb(255, 255, 255));
            button4.setTextColor(Color.rgb(0, 0, 0));
            button5.setBackgroundColor(Color.rgb(255, 255, 255));
            button5.setTextColor(Color.rgb(0, 0, 0));
            button6.setBackgroundColor(Color.rgb(255, 255, 255));
            button6.setTextColor(Color.rgb(0, 0, 0));
            button7.setBackgroundColor(Color.rgb(255, 255, 255));
            button7.setTextColor(Color.rgb(0, 0, 0));
            button8.setBackgroundColor(Color.rgb(255, 255, 255));
            button8.setTextColor(Color.rgb(0, 0, 0));
            button9.setBackgroundColor(Color.rgb(255, 255, 255));
            button9.setTextColor(Color.rgb(0, 0, 0));
            button10.setBackgroundColor(Color.rgb(255, 255, 255));
            button10.setTextColor(Color.rgb(0, 0, 0));
            button11.setBackgroundColor(Color.rgb(255, 255, 255));
            button11.setTextColor(Color.rgb(0, 0, 0));
            button12.setBackgroundColor(Color.rgb(255, 255, 255));
            button12.setTextColor(Color.rgb(0, 0, 0));
            button13.setBackgroundColor(Color.rgb(255, 255, 255));
            button13.setTextColor(Color.rgb(0, 0, 0));
            button14.setBackgroundColor(Color.rgb(255, 255, 255));
            button14.setTextColor(Color.rgb(0, 0, 0));
            button15.setBackgroundColor(Color.rgb(255, 255, 255));
            button15.setTextColor(Color.rgb(0, 0, 0));
            button16.setBackgroundColor(Color.rgb(255, 255, 255));
            button16.setTextColor(Color.rgb(0, 0, 0));
            button17.setBackgroundColor(Color.rgb(255, 255, 255));
            button17.setTextColor(Color.rgb(0, 0, 0));
            button18.setBackgroundColor(Color.rgb(255, 255, 255));
            button18.setTextColor(Color.rgb(0, 0, 0));
            button19.setBackgroundColor(Color.rgb(255, 255, 255));
            button19.setTextColor(Color.rgb(0, 0, 0));
            button20.setBackgroundColor(Color.rgb(255, 255, 255));
            button20.setTextColor(Color.rgb(0, 0, 0));
            button21.setBackgroundColor(Color.rgb(255, 255, 255));
            button21.setTextColor(Color.rgb(0, 0, 0));
            button22.setBackgroundColor(Color.rgb(255, 255, 255));
            button22.setTextColor(Color.rgb(0, 0, 0));
            button23.setBackgroundColor(Color.rgb(255, 255, 255));
            button23.setTextColor(Color.rgb(0, 0, 0));
            button24.setBackgroundColor(Color.rgb(255, 255, 255));
            button24.setTextColor(Color.rgb(0, 0, 0));
            numbersGenerator();
        }
    }
}
