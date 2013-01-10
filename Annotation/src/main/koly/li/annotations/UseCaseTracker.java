package koly.li.annotations;

import java.lang.reflect.Method;
import java.util.List;

public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases, Class<?> cl){
        for (Method m : cl.getDeclaredMethods()){
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null){
                System.out.println("Found Use Case" + uc.id() + " " + uc.description());
                useCases.remove(new Integer((uc.id())));
            }
        }
        for (int i : useCases){
            System.out.println("Warning: Missing use case-" + i);
        }
    }
}
