import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("hello main");
        State initialState= new  State(0,3,0,3,'L',2);

        ArrayList<State> a=initialState.getChildren();

        for (int i=0; i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        for (int i=0; i<a.size();i++)
        {
            System.out.println(a.get(i).getChildren());
        }

    }

}
