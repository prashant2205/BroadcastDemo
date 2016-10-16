package in.codingninjas.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class TelephoneReceiver extends BroadcastReceiver {
    public TelephoneReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String state=intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        Log.i("Onreceive","CALL RECEIVED");
        if(state.equals(TelephonyManager.EXTRA_STATE_RINGING))
        {
            Toast.makeText(context,"PHONE Ringing",Toast.LENGTH_LONG).show();
        }
        else if(state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))
        {
            Toast.makeText(context,"PHONE offhook",Toast.LENGTH_LONG).show();
        }
        else if(state.equals(TelephonyManager.EXTRA_STATE_IDLE))
        {
            Toast.makeText(context,"PHONE idle",Toast.LENGTH_LONG).show();
            Intent intent1=new Intent();
            intent1.setClass(context,MainActivity.class);
            intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent1);
        }
        String number=intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
        Toast.makeText(context,number,Toast.LENGTH_LONG).show();
        Log.i("STATE",state);
    }
}
