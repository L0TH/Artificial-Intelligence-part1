package com.aueb.MissionariesAndCannibalsProblem;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*
            N = Number of (N) cannibals and (N) missioners 2N in total
            M = Boat seats
            K = Max steps allowed
         */

        State initialState = new State(  100, 10,80);

        SpaceSearcher searcher = new SpaceSearcher();
        long start = System.currentTimeMillis();
        State terminalState = searcher.AStarBestFSClosedSet(initialState);
        long end = System.currentTimeMillis();

        if(terminalState == null) System.out.println("Could not find a solution.");

        else
        {

            State temp = terminalState;
            ArrayList<State> path = new ArrayList<State>();
            path.add(temp);
            while(temp.getFather() != null)
            {
                path.add(temp.getFather());
                temp = temp.getFather();
            }

            Collections.reverse(path);
            for(State item: path)
            {
                item.print();
            }


        }
        System.out.println("AStarBestFS with closed set search time: " + (double)(end - start) / 1000 + " sec.");



    }

}
