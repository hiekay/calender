package com.ecology.calenderproj.receiver;

import com.ecology.calenderproj.ui.ScheduleViewAddActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
        	ScheduleViewAddActivity.setAlart(context);
        }
    }
}

