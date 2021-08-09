package com.example.singleton_pattern;

import android.util.Log;
import android.view.View;

public class ChatState {

    private static ChatState instance = null;
    private int num_member = 0;

    private ChatState(){
        //no code
    }

    public static ChatState getInstance() {
        if(instance==null){
            instance = new ChatState();
        }
        return instance;
    }

    public static void printState(){
        Log.d("PrintMyLog", "-----------START CHATTING-----------");
        Log.d("PrintMyLog", "Members: " + instance.num_member);
    }

    public static void addMember(){
        instance.num_member +=1;
        Log.d("PrintMyLog", "MemberAdded");
        Log.d("PrintMyLog", "Members: " + instance.num_member);
    }
}
