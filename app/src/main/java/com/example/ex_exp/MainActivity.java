package com.example.ex_exp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener
{
    CustomKeyboard mCustomKeyboard;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText1);
        mCustomKeyboard = new CustomKeyboard(this, R.id.keyboardview,
                R.xml.hexkbd);

        mCustomKeyboard.registerEditText(R.id.editText1);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
        default:
            break;
        }
    }
}
