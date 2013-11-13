package li.koly.refactor.ReplaceInheritanceWIthDelegation;

public class MyStack{

    private Vector vector = new Vector();

    public void push(Object element){
        vector.insertElementAt(element, 0);
    }

    public Object pop(){
        Object result = vector.firstElement();
        vector.removeElementAt(0);
        return result;
    }
}
