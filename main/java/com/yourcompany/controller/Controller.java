package com.yourcompany.controller;

import com.yourcompany.service.StreamService;
import com.yourcompany.stream.Stream;

import java.util.List;

public class Controller {
    private StreamService streamService;

    public Controller() {
        this.streamService = new StreamService();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}