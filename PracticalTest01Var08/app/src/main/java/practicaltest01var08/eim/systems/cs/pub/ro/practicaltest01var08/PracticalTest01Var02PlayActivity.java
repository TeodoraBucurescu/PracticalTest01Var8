package practicaltest01var08.eim.systems.cs.pub.ro.practicaltest01var08;

import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var02PlayActivity extends AppCompatActivity {

    private EditText riddleValueText = null;
    private EditText answerValueText = null;
    private EditText answerText = null;
    private Button checkButton = null;
    private Button backButton = null;

    final public static String TAG                  = "activitylifecycle";

    private ButtonClickListener buttonClickListener = new ButtonClickListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_play);

        riddleValueText = (EditText) findViewById(R.id.riddle_value);
        answerValueText = (EditText) findViewById(R.id.answer_value);

        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey("riddleText") && intent.getExtras().containsKey("answerText")) {
            String riddle = (String)intent.getStringExtra("riddleText");
            String answer = (String)intent.getStringExtra("answerText");
            Log.d(TAG,"Ridd="+intent.getStringExtra("riddleText"));
            answerValueText.setText(answer);
            riddleValueText.setText(riddle);
        }
    }

    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.check:
                    break;
                case R.id.back:
                    break;
            }
        }
    }
}
