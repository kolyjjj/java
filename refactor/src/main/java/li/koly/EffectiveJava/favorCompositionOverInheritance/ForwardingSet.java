package li.koly.EffectiveJava.favorCompositionOverInheritance;

import java.util.Collection;
import java.util.Set;

public class ForwardingSet<E> {
    private final Set<E> s;

    public ForwardingSet(Set<E> s) {

        this.s = s;
    }

    public boolean add(E e) {
        return s.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        return s.addAll(c);
    }
}
