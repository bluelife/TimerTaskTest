package com.bluelife.mm.timertasktest;

import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    static TimerTask Task;
    static public Handler handler=new Handler();
    static Timer t = new Timer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startBtn=(Button) findViewById(R.id.button);
        Button stopBtn=(Button) findViewById(R.id.button2);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doTask();
            }
        });
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancelTask();
            }
        });
    }

    private void doTask(){
        Task = new TimerTask() {


            public void run() {
                handler.post(new Runnable() {
                    public void run() {

                        Log.d("TIMER", "Timer set on");
                    }
                });
            }
        };
        t.schedule(Task, 0, 4000);
    }
    private void cancelTask(){
        t.cancel();
    }
}
