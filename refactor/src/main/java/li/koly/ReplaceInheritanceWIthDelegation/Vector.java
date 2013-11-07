package li.koly.ReplaceInheritanceWIthDelegation;

public class Vector {

    public void insertElementAt(Object element, int position){
        System.out.println("here is the insertion codes");
    }

    public void removeElementAt(int position){
        System.out.println("here is the removal");
    }

    protected Object firstElement() {
        return null;
    }

    public int size(){
        System.out.println("here is the size");
        return 0;
    }

    public boolean isEmpty(){
        return false;
    }

}
