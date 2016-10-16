package in.codingninjas.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SMSReciever extends BroadcastReceiver {
    public SMSReciever() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //// TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
       // throw new UnsupportedOperationException("Not yet implemented");
        Log.i("Onreceive","SMS RECEIVED");
        Toast.makeText(context,"SMS RECEIVED",Toast.LENGTH_LONG);
    }
}
