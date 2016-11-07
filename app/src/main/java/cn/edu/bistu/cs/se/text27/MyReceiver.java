package cn.edu.bistu.cs.se.text27;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {


    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String message=intent.getStringExtra("broadcastMessage");
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}