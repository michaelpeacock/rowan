package com.example.Hoth_Radar;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Splash extends Activity
{

    private Button buildButton;
    private Button startButton;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        buildButton = (Button)findViewById(R.id.BuildButton);
        buildButton.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_LONG).show();
            }
        });
        startButton = (Button)findViewById(R.id.StartButton);
        startButton.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_LONG).show();
            }
        });
    }

}
