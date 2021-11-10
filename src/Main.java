import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello main");
        State initialState = new State(0, 3, 0, 3, 'L', 2);

        SpaceSearcher searcher = new SpaceSearcher();

        State terminalState = searcher.BestFSClosedSet(initialState);

        if(terminalState == null) System.out.println("Could not find a solution.");

        else
        {
            // print the path from beggining to start.
            State temp = terminalState; // begin from the end.
            ArrayList<State> path = new ArrayList<State>();
            while(temp.getFather() != null) // if father is null, then we are at the root.
            {
                path.add(temp.getFather());
                temp = temp.getFather();
            }
            // reverse the path and print.
            Collections.reverse(path);
            for(State item: path)
            {
                item.toString();
            }
            System.out.println();

        }


    }

}
