package com.theironyard.clt;

import jodd.json.JsonSerializer;

import java.io.File;
import java.io.IOException;

public class ReadWriteJson {
    public static void main(String[] args) throws IOException {
        Sport s = new Sport();
        s.where = "outdoor";
        s.name = "Football";
        s.type = "team";
        s.surface = "grass";
        s.season = "fall";

        File f = new File("sport.json");


        // write json
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer
    }

}
