package com.aueb.MissionariesAndCannibalsProblem;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello main");
        State initialState = new State(  3, 4 ,100);

        SpaceSearcher searcher = new SpaceSearcher();
        long start = System.currentTimeMillis();
        State terminalState = searcher.AStarBestFSClosedSet(initialState);
        long end = System.currentTimeMillis();

        if(terminalState == null) System.out.println("Could not find a solution.");

        else
        {
            // print the path from beggining to start.
            State temp = terminalState; // begin from the end.
            ArrayList<State> path = new ArrayList<State>();
            path.add(temp);
            while(temp.getFather() != null) // if father is null, then we are at the root.
            {
                path.add(temp.getFather());
                temp = temp.getFather();
            }
            // reverse the path and print.
            Collections.reverse(path);
            for(State item: path)
            {
                item.print();
            }


        }
        System.out.println("AStarBestFS with closed set search time: " + (double)(end - start) / 1000 + " sec.");



    }

}
