
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SpaceSearcher
{
    private ArrayList<State> states;
    private HashSet<State> closedSet;
    private boolean flag=false;

    SpaceSearcher()
    {
        this.states = null;
        this.closedSet = null;
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
            if(currentState.max_steps==0)
            {
                flag=true;
            }
            if(!closedSet.contains(currentState) && flag!=true)
            {
                this.closedSet.add(currentState);

                this.states.addAll(currentState.getChildren());
                Collections.sort(this.states);
            }
        }
        if(flag)
        {
            System.out.println("Max moves reached");
        }
        return null;
    }
}
