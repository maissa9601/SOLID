/**
 * 
 */
package com.directi.training.isp.exercise_refactored;

import java.util.TimerTask;

import com.directi.training.isp.exercise.Door;

public class Timer
{
    public void register(long timeOut, final Door door)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                door.timeOutCallback();
            }
        }, timeOut);
    }
}
