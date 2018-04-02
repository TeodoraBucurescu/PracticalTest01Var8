package practicaltest01var08.eim.systems.cs.pub.ro.practicaltest01var08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var08MainActivity extends AppCompatActivity {

    private final static int SECONDARY_ACTIVITY_REQUEST_CODE = 1;

    private EditText riddleText = null;
    private EditText answerText = null;
    private Button playButton = null;

    final public static String TAG                  = "activitylifecycle";

    private ButtonClickListener buttonClickListener = new ButtonClickListener();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var08_main);

        riddleText = (EditText) findViewById(R.id.riddle);
        answerText = (EditText) findViewById(R.id.answer);

        playButton = (Button) findViewById(R.id.play);
        playButton.setOnClickListener(buttonClickListener);

    }

    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.play:
                    Intent intent = new Intent(getApplicationContext(), PracticalTest01Var02PlayActivity.class);
                    intent.putExtra("riddleText", riddleText.getText().toString());
                    intent.putExtra("answerText", answerText.getText().toString());
                    Log.d(TAG,"AAAA="+riddleText.getText());
                    startActivityForResult(intent,SECONDARY_ACTIVITY_REQUEST_CODE);
                    break;
            }
        }
    }
}
