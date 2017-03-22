package com.example.android.helper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

   /* static int plov=0, lagmon=0, tuxum=0;
    private RadioGroup radioGroup, radioGroup2;
    private RadioButton fiveMin, tenMin, twentyMin, threeIng, fiveIng, sevenIng;
    private Button button;
    private TextView textView;*/


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void Submit(View view) {

        int plov=0, lagmon=0, tuxum=0;

        RadioButton fiveMin = (RadioButton) findViewById(R.id.fiveMin);
        boolean five = fiveMin.isChecked();
        if (five) {
            tuxum += 1;
        }

        RadioButton tenMin = (RadioButton) findViewById(R.id.tenMin);
        boolean ten = tenMin.isChecked();
        if (ten) {
            lagmon =+ 1;
        }

        RadioButton twentyMin = (RadioButton) findViewById(R.id.twentyMin);
        boolean twenty = twentyMin.isChecked();
        if (twenty) {
            plov += 1;
        }

        RadioButton threeIng = (RadioButton) findViewById(R.id.threeIng);
        boolean three = threeIng.isChecked();
        if (three) {
            tuxum += 1;
        }

        RadioButton fiveIng = (RadioButton) findViewById(R.id.fiveIng);
        boolean fiveI = fiveIng.isChecked();
        if (fiveI) {
            lagmon += 1;
        }

        RadioButton sevenIng = (RadioButton) findViewById(R.id.sevenIng);
        boolean seven = sevenIng.isChecked();
        if (seven) {
            plov += 1;
        }

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox1);
        boolean Boil = checkBox.isChecked();
        if (Boil) {
            tuxum += 1;
        }

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        boolean Cook = checkBox2.isChecked();
        if (Cook) {
            lagmon += 1;
        }

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        boolean order = checkBox3.isChecked();
        if (order) {
            tuxum += 1;
        }


        EditText input = (EditText) findViewById(R.id.editText);
        String number=input.getText().toString();
        Integer num = Integer.parseInt(number);
        if (num<3) {
            tuxum+=1;
        }
        else if(num>3 && num<5) {
            lagmon += 1;
        }
        else if(num>5) {
            plov+=1;
        }

        CheckBox checkBoxdietf = (CheckBox) findViewById(R.id.diet_checkBox1);
        boolean d1 = checkBoxdietf.isChecked();
        if (d1) {
            tuxum += 1;
        }

        CheckBox checkBoxdiets = (CheckBox) findViewById(R.id.diet_checkBox2);
        boolean d2 = checkBoxdiets.isChecked();
        if (d2) {
            lagmon += 1;
        }

        CheckBox checkBoxdiett = (CheckBox) findViewById(R.id.diet_checkBox3);
        boolean d3 = checkBoxdiett.isChecked();
        if (d3) {
            plov += 1;
        }

        if(plov<=lagmon && lagmon<tuxum)
            displayToast("tuxum");
        else if(plov>lagmon && tuxum>=plov)
            displayToast("tuxum");
        else if(plov>lagmon && lagmon>=tuxum)
            displayToast("plov");
        else if(plov>lagmon && lagmon<=tuxum)
            displayToast("plov");
        else if(plov<lagmon && plov>=tuxum)
            displayToast("lagmon");
        else if(plov<lagmon && lagmon>=tuxum)
            displayToast("lagmon");



    }

    public void displayToast(String s) {
        String your = "You should prepare "+ s;
        Toast.makeText(this, your, Toast.LENGTH_SHORT).show();
    }


}


/*        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);
        radioGroup2 = (RadioGroup) findViewById(R.id.myRadioGroupSec);




        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.twentyMin) {
                    Toast.makeText(getApplicationContext(), "choice: 20 min",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.fiveMin) {
                    Toast.makeText(getApplicationContext(), "choice: 5 min",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.tenMin){
                    Toast.makeText(getApplicationContext(), "choice: 10 min",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });

        radioGroup2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.threeIng){
                    Toast.makeText(getApplicationContext(), "choice: up to 3 ingredients",
                            Toast.LENGTH_SHORT).show();
                }
                else if(checkedId == R.id.fiveIng){
                    Toast.makeText(getApplicationContext(), "choice: up to 5 ingredients",
                            Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.sevenIng){
                    Toast.makeText(getApplicationContext(), "choice: up to 7 ingredients",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });


        fiveMin = (RadioButton) findViewById(R.id.fiveMin);
        tenMin = (RadioButton) findViewById(R.id.tenMin);
        twentyMin = (RadioButton) findViewById(R.id.twentyMin);

        threeIng= (RadioButton) findViewById(R.id.threeIng);
        fiveIng=(RadioButton) findViewById(R.id.fiveIng);
        sevenIng=(RadioButton)findViewById(R.id.sevenIng);

        textView = (TextView) findViewById(R.id.text);

        Button button2 = (Button)findViewById(R.id.chooseBtn);
        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find which radioButton is checked by id
                if(selectedId == fiveMin.getId()) {
                    tuxum++;
                }

                else if(selectedId == tenMin.getId()) {
                    lagmon++;
                }

                else if(selectedId == twentyMin.getId()){

                    plov++;
                }

                if(selectedId == threeIng.getId()){

                    tuxum++;
                }
                else if(selectedId == fiveIng.getId()){

                    lagmon++;
                }
                else if(selectedId == sevenIng.getId()){

                    plov++;
                }

                if(plov<=lagmon && lagmon<tuxum)
                    textView.setText(tuxum+" "+lagmon+" "+plov);
                else if(plov>lagmon && tuxum>=plov)
                    textView.setText(tuxum+" "+plov+" "+lagmon);
                else if(plov>lagmon && lagmon>=tuxum)
                    textView.setText(plov+" "+lagmon+" "+tuxum);
                else if(plov>lagmon && lagmon<=tuxum)
                    textView.setText(plov+" "+tuxum+" "+lagmon);
                else if(plov<lagmon && plov>=tuxum)
                    textView.setText(lagmon+" "+plov+" "+tuxum);
                else if(plov<lagmon && lagmon>=tuxum)
                    textView.setText(lagmon+" "+tuxum+" "+plov);


            }
        });



    }
*/


