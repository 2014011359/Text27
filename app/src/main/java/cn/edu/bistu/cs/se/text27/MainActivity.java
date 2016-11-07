package cn.edu.bistu.cs.se.text27;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_send;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_send=(Button)findViewById(R.id.Send_button);

        button_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("android.intent.action.MY_BROADCAST");
                intent.putExtra("broadcastMessage","初因未来");
                sendBroadcast(intent);
            }
        });

    }

}