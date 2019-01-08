package moo.ruts.ac.th.lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class mvc extends AppCompatActivity {
    private ImageView imvAnimal;
    private RadioGroup radAnswer;
    private String strAnswer;
    private mvc_dg objMyAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
        initialWidget();

        radAnswer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radCow:
                    strAnswer = "Cow";
                        break;
                    case R.id.radHorse:
                        strAnswer = "Horse";
                        break;
                    case R.id.radPig:
                        strAnswer = "Pig";
                        break;
                    case R.id.radSheep:
                        strAnswer = "Sheep";
                        break;
                    default:
                        strAnswer = null;
                        break;
                }
            }
        });


    }

    private  void initialWidget() {

        imvAnimal = (ImageView) findViewById(R.id.imageView);
        radAnswer = (RadioGroup) findViewById(R.id.radAnswer);

    }


    public  void clickAnswer (View view){

        checkChooseAnswer();


    }

    private void  checkChooseAnswer() {

        if (strAnswer != null) {
            Log.d("masterUNG", "strAnswer = "+ strAnswer);

        } else {
            Log.d("masterUNG", "Please Choose Something");
        }
    }
}
