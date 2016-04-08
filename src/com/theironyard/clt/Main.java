package com.theironyard.clt;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Sport sport = new Sport();
        Scanner scanner = new Scanner(System.in);

        File f = new File("Sport.json");

        // ask user to give info about Sport
        System.out.println("What is your favorite Sport name?");
        sport.name = scanner.nextLine();

        System.out.println("Is it played Indoor or Outdoor?");
        sport.where = scanner.nextLine();

        System.out.println("What type of player single or team?");
        sport.type = scanner.nextLine();

        System.out.println("What surface is it played on?");
        sport.surface = scanner.nextLine();

        System.out.println("What season is it played in?");
        sport.season = scanner.nextLine();


        // write Sport json
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialze(sport);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        // read Sport json
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        JsonParser parser = new JsonParser();
        Sport sports = parser.parse(contents, Sport.class);

        System.out.println(sports);





    }
}
