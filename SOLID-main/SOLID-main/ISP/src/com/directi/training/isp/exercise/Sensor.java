package com.directi.training.isp.exercise;

import java.util.Random;

import com.directi.training.isp.exercise_refactored.SensingDoor;

public class Sensor
{
    public void register(SensingDoor sensingDoor)
    {
        while (true) {
            if (isPersonClose()) {
                sensingDoor.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
