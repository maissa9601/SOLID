/**
 * 
 */
package com.directi.training.ocp.exercise_refactored;

public class Time extends ResourceType {
    private int findFreeTimeSlot() {
        
        return 0; 
    }

    private void markTimeSlotBusy(int resourceId) {
        
    }

    private void markTimeSlotFree(int resourceId) {
        
    }

    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId; 
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId); 
    }

}
