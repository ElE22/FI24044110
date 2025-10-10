import java.util.ArrayList;


public class MyStackChar implements MyStackInterface<Character>  {
    private ArrayList<Character>  stack = new ArrayList<Character>();

    public void push(Character item){ stack.add(item);}

    public Character pop(){ return !stack.isEmpty() ?  stack.removeLast() : '^'; };
    
    //get last item of array
    public Character peek(){ return !stack.isEmpty() ?  stack.getLast(): '^'; };

    //validation if it's empty
    public boolean empyt(){ return stack.isEmpty();};
    //get lenght
    public int size(){ return stack.size();};

    public ArrayList<Character> getStack() {
        return stack;
    }
    
}
