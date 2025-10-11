import java.util.ArrayList;


public class MyStackChar implements MyStackInterface<Character>  {
    private ArrayList<Character>  stack = new ArrayList<Character>();

    public void push(Character item){ stack.add(item);}

    public Character pop(){ return !stack.isEmpty() ?  stack.removeLast() : '^'; };

    public Character peek(){ return !stack.isEmpty() ?  stack.getLast(): '^'; };

    public boolean empty(){ return stack.isEmpty();};
 
    public int size(){ return stack.size();};

    public ArrayList<Character> getStack() {
        return stack;
    }
    
}
