package sg.edu.rp.c346.id20010021.demo_riddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        textView3= findViewById(R.id.textView3);
        //textView3.setText("In Second Activity");

        Intent intentReceived = getIntent();
        String questionsSelected =
                intentReceived.getStringExtra("Question");
        textView3.setText(questionsSelected + " answer is: Queue");

    }
}