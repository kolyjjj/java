package koly.li.unintended_recursion;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    //this will cause the infinite recursion
//    public String toString(){
//        return "InfiniteRecursion address: " + this + "\n";
//    }

    public static void main(String[] args){
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }

    //this is the right way
    public String toString(){
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }
}
