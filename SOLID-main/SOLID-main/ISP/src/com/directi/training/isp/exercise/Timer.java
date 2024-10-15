package com.directi.training.isp.exercise;

import java.util.TimerTask;

import com.directi.training.isp.exercise_refactored.TimedDoor;

public class Timer
{
    public void register(long timeOut, final TimedDoor timedDoor)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                timedDoor.timeOutCallback();
            }
        }, timeOut);
    }
}
