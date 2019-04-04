package cn.edu.gdpt.topline172038cjw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Timer timer=new Timer(); // 定时器
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            finish();
            }
        };
        timer.schedule(task,3000);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        try{
//            Thread.sleep(3000);
//        }catch (InterruptedException e ){
//            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
//            startActivity(intent);
//            finish();
//        }
//    }
}
