package com.aueb.MissionariesAndCannibalsProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SpaceSearcher
{
    private ArrayList<State> states;
    private HashSet<State> closedSet;
    private boolean flag=false;
    private ArrayList<State> child;

    SpaceSearcher()
    {
        this.states = null;
        this.closedSet = null;
        this.child=null;
    }

    //BestFS Algorithm Implementation with Closed Set
    public State AStarBestFSClosedSet(State initialState)
    {
        this.states = new ArrayList<State>();
        this.closedSet = new HashSet<State>();
        this.child = new ArrayList<>();
        this.states.add(initialState);
        while(this.states.size() > 0)
        {
            State currentState = this.states.remove(0);
            if(currentState.isFinal())
            {
                return currentState;
            }
            if(currentState.max_steps==0)
            {
                System.out.println("Max moves reached");
                return null;

            }
            if(!closedSet.contains(currentState) )
            {
                this.closedSet.add(currentState);
                this.child=currentState.getChildren();
                for(int i=0;i<child.size(); i++)
                {
                    if(child.get(i).getFather()!=null) {
                        child.get(i).setScore(child.get(i).getFather().getScore());
                    }
                }
                this.states.addAll(this.child);
                Collections.sort(this.states);
            }
        }

        return null;
    }
}
