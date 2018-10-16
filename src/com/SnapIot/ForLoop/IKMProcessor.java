package com.SnapIot.ForLoop;

import java.util.ArrayList;
import java.util.List;

public class IKMProcessor {
    public List<String> queueSequence;
    public void setUp() {
        try {
            establishQueueSequence();
        }
        finally {
            cleanupQueueSequence();
            System.out.println("Queue sequence successfully cleaned up");
        }
    }
    private void cleanupQueueSequence() {
        if (queueSequence.size() > 0) {
            System.out.println("Queue size > 0");
        }
    }
    private void establishQueueSequence() {
        if (true) {
            throw new IllegalArgumentException();
        }
        queueSequence = new ArrayList<String>();
    }

    public static void main(String[] args) {
        IKMProcessor processor = new IKMProcessor();
        processor.setUp();
        System.out.println("Processing complete");
    }
}

