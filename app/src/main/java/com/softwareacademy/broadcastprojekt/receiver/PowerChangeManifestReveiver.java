package com.softwareacademy.broadcastprojekt.receiver;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.softwareacademy.broadcastprojekt.MainActivity;
import com.softwareacademy.broadcastprojekt.R;

/**
 *
 */

public class PowerChangeManifestReveiver extends BroadcastReceiver {

    public static final String POWER_CHANGE_MANIFEST = "PowerChangeManifest";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(POWER_CHANGE_MANIFEST, "I reveived message");
        showNotification(context);
    }


    private void showNotification(Context context) {


        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(context)
                .setSmallIcon(android.R.drawable.ic_dialog_alert)
                .setContentTitle(context.getString(R.string.powerChange))
                .setContentText(context.getString(R.string.battery_change))
                .setColor(ContextCompat.getColor(context, R.color.colorPrimaryDark))
                .setAutoCancel(true)
                .addAction(android.R.drawable.alert_light_frame,"OK",getPendingIntent(context))
                .setContentIntent(getPendingIntent(context));

        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(1234, notificationBuilder.build());
    }


    private PendingIntent getPendingIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return PendingIntent.getActivity(context, 0 /* Request code */, intent,
                PendingIntent.FLAG_ONE_SHOT);
    }
}
