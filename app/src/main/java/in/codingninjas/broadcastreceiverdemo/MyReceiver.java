package in.codingninjas.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    final String TAG="Broadcast Receiver";
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
//        // TODO: This method is called when the BroadcastReceiver is receiving
//        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");
        Log.i(TAG,"Battery Low");
        Toast.makeText(context,"Battery",Toast.LENGTH_SHORT).show();

    }
}
