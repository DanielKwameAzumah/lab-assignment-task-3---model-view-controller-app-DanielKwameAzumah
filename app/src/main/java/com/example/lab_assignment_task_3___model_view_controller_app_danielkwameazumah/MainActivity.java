package com.example.lab_assignment_task_3___model_view_controller_app_danielkwameazumah;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText redvalue, greenvalue, bluevalue;
    RGB_color color;
    private int redcolor, greencolor, bluecolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        color = new RGB_color(255, 255, 255);
        setContentView(R.layout.activity_main);

        redvalue = (EditText) findViewById(R.id.color_1);
        greenvalue =(EditText) findViewById(R.id.color_3);
        bluevalue = (EditText) findViewById(R.id.color_2);

        TextChangeHandler tch = new TextChangeHandler();
        redvalue.addTextChangedListener(tch);
        greenvalue.addTextChangedListener(tch);
        bluevalue.addTextChangedListener(tch);
    }
    public void colorchange(){
        String redstring = redvalue.getText().toString();
        String greenstring = greenvalue.getText().toString();
        String bluestring = bluevalue.getText().toString();

        TextView Label = (TextView) findViewById(R.id.color_text);

        try{
            int red = Integer.parseInt(redstring);
            int green = Integer.parseInt(greenstring);
            int blue = Integer.parseInt(bluestring);

            color.setredcolor(red);
            color.setgreencolor(green);
            color.setbluecolor(blue);

            redcolor = color.getRedcolor();
            greencolor = color.getGreencolor();
            bluecolor = color.getBluecolor();

            Label.setBackgroundColor(Color.rgb(redcolor, greencolor, bluecolor));
        }
        catch (NumberFormatException nfe){ }
}
    private class TextChangeHandler implements TextWatcher{

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2){}

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

        @Override
        public void afterTextChanged(Editable s) {
            colorchange();
        }
    }

}
