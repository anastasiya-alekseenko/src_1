package com.yourcompany;

import com.yourcompany.group.StudyGroup;
import com.yourcompany.stream.Stream;
import com.yourcompany.controller.Controller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        StudyGroup group1 = new StudyGroup("Group 1");
        StudyGroup group2 = new StudyGroup("Group 2");
        StudyGroup group3 = new StudyGroup("Group 3");

        
        Stream stream1 = new Stream();
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream();
        stream2.addGroup(group1);
        stream2.addGroup(group2);
        stream2.addGroup(group3);

        
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        
        Controller controller = new Controller();
        controller.sortStreams(streams);

        
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getGroups().size() + " groups.");
        }
    }
}


