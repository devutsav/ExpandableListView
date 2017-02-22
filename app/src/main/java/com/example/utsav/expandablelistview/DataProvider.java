package com.example.utsav.expandablelistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by utsav on 23/2/17.
 */

public class DataProvider {

    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>> Movies_details= new HashMap<String, List<String>>();
        List<String> Action_movie = new ArrayList<>();
        Action_movie.add("The Expendables");
        Action_movie.add("Don");

        List<String> Romantic_movie = new ArrayList<>();
        Romantic_movie.add("DDLJ");
        Romantic_movie.add("Jab Tak Hai Jaan");
        Romantic_movie.add("A love story");

        List<String> Horror_movie = new ArrayList<>();
        Horror_movie.add("Conjuring");
        Horror_movie.add("The Exorcist");

        List<String> Comedy_movie = new ArrayList<>();
        Comedy_movie.add("Hera Pheri");
        Comedy_movie.add("Mr Bean");

        Movies_details.put("Action movies",Action_movie);
        Movies_details.put("Romantic movies",Romantic_movie);
        Movies_details.put("Horror movies",Horror_movie);
        Movies_details.put("Comedy movies",Comedy_movie);

        return Movies_details;

    }
}
