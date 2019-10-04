package com.dendickys.myalarmmanagerexpert;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {

    public static final String TYPE_ONE_TIME = "OneTimeAlarm";
    public static final String TYPE_REPEATING = "RepeatingAlarm";
    public static final String EXTRA_MESSAGE = "message";
    public static final String EXTRA_TYPE = "type";

    // Siapkan 2 id untuk 2 macam alarm, onetime dan repeating
    private final int ID_ONETIME = 100;
    private final int ID_REPEATING = 101;

    @Override
    public void onReceive(Context context, Intent intent) {
        
    }
}
