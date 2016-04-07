package com.theironyard.clt;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
        String json = serializer.serialize(s);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        // read json
        Scanner s = new Scanner (f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        Sport s2 = parser.parse(contents, Sport.class);

        System.out.println(s2);

    }

}
