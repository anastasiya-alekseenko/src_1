package com.yourcompany.service;

import com.yourcompany.stream.Stream;
import com.yourcompany.stream.StreamComparator;

import java.util.Collections;
import java.util.List;

public class StreamService {
    public void sortStreams(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}


