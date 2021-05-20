package sg.edu.rp.c346.id20010021.demo_riddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        textView= findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        textView.setText(questionsSelected + " answer is: Queue");

    }
}