package com.example.ultimate_player_android;

import android.content.Context;
import android.util.Log;

import com.google.android.exoplayer2.ExoPlayer;

public class UltimatePlayerManager {

    private final String TAG = "UltimatePlayerManager";

    public UltimatePlayerManager(){
        Log.e(TAG, "Ultimate Player Manager Contructor");
    }

    public void PrintSomething(){
        Log.i(TAG, "Ultimate Player Manager Print Something");
    }

    public void CreateExoPlayer(Context context) {
        Log.i(TAG, "Ultimate Player Manager Create ExoPlayer");

        ExoPlayer player = new ExoPlayer.Builder(context).build();

        Log.i(TAG, "Ultimate Player Manager Create ExoPlayer Done");
    }

}
