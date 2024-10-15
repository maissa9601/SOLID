package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator {

    private static final int INVALID_RESOURCE_ID = -1;

    public int calculallocate(ResourceType resourceType) {
        int resourceId;

        resourceId = resourceType.allocate(); 
        if (resourceId == INVALID_RESOURCE_ID) {
            System.out.println("ERROR: Attempted to allocate invalid resource");
        }
        return resourceId;
    }


    public void calculfree(ResourceType resourceType, int resourceId) {

        resourceType.free(resourceId);
    }
}
