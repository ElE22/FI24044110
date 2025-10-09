public interface MyStackInterface <Type> {
    
    //add item
    void push(Type item);
    
    //remove & return last item of array 
    Type pop();
    
    //get last item of array
    Type peek();
    //validation if it's empty
    boolean empyt();
    //get lenght
    int size();
}