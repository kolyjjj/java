package li.koly.ReplaceInheritanceWIthDelegation;

public class MyStack extends Vector {

    public void push(Object element){
        insertElementAt(element, 0);
    }

    public Object pop(){
        Object result = firstElement();
        removeElementAt(0);
        return result;
    }
}
