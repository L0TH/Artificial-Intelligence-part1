
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SpaceSearcher
{
    private ArrayList<State> states;
    private HashSet<State> closedSet;

    SpaceSearcher()
    {
        this.states = null;
        this.closedSet = null;
    }

    //BFS Algorithm Implementation


    //BestFS Algorithm Implementation
    //The heuristic parameter chooses among the available heuristics
    public State BestFS(State initialState, int heuristic)
    {
        this.states = new ArrayList<State>();
        this.states.add(initialState);
        while(this.states.size() > 0)
        {
            State currentState = this.states.remove(0);
            if(currentState.isFinal())
            {
                return currentState;
            }
            //We generate the children and calculate the heuristic values
            this.states.addAll(currentState.getChildren());
            //We sort all the children according to their heuristic scores
            Collections.sort(this.states);
        }
        return null;
    }

    //BestFS Algorithm Implementation with Closed Set
    public State BestFSClosedSet(State initialState)
    {
        this.states = new ArrayList<State>();
        this.closedSet = new HashSet<State>();
        this.states.add(initialState);
        while(this.states.size() > 0)
        {
            State currentState = this.states.remove(0);
            if(currentState.isFinal())
            {
                return currentState;
            }
            if(!closedSet.contains(currentState))
            {
                this.closedSet.add(currentState);
                this.states.addAll(currentState.getChildren());
                Collections.sort(this.states);
            }
        }
        return null;
    }
}
