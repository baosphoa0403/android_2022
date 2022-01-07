package com.example.se1417_day01;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyMusicService extends Service {
    MediaPlayer media_player;
    public MyMusicService() {
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        media_player.start();
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onCreate(){
        super.onCreate();
        media_player = MediaPlayer.create(getApplicationContext(), R.raw.abc);
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        media_player.release();
    }
}