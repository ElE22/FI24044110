public class CustomStack {

    private StackNode _head;

    public CustomStack() {
        _head = null;
    }

    public void push(String word) {
        var node = new StackNode(word);
        if (_head == null) {
            node.setNext(null);
        } else {
            node.setNext(_head);
        }
        _head = node;
        return;
    }

    public String pop() {
        String word = null;

        var current = _head;
        if (current != null) {
            word = current.getWord();
            _head = current.getNext();  
        }
        return word;
    }

    public int size() {
        var length = 0;
        var current = _head;
        while(current != null) {
            length++;
            current = current.getNext();
        }
        return length;
    }

    public String getWords() {
        var builder = new StringBuilder("(" + size() + ") [");
        for (var word = pop(); word != null; word = pop()) {
            builder.append(" " + word);
        }
        builder.append(" ]");
        return builder.toString();
    }
}