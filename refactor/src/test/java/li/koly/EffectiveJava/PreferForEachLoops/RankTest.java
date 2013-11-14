package li.koly.EffectiveJava.PreferForEachLoops;

import org.junit.Test;

import java.util.*;

public class RankTest {

    @Test (expected = NoSuchElementException.class)
    public void should_use_traditional_for_loop(){
        Collection<Suit> suits = Arrays.asList(Suit.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());

        List<Card> cards = new ArrayList<Card>();
        for (Iterator<Suit> i = suits.iterator(); i.hasNext();)
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext();)
                cards.add(new Card(i.next(), j.next()));
    }

    @Test
    public void should_use_for_each(){
        Collection<Suit> suits = Arrays.asList(Suit.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());

        List<Card> cards = new ArrayList<Card>();
        for (Suit suit : suits)
            for (Rank rank : ranks)
                cards.add(new Card(suit, rank));
    }

    @Test
    // only prints six "doubles" (from "ONE ONE" to "SIX SIX")
    public void should_throw_exception(){
        Collection<Face> faces = Arrays.asList(Face.values());

        for (Iterator<Face> i = faces.iterator(); i.hasNext();)
            for (Iterator<Face> j = faces.iterator(); j.hasNext();)
                System.out.println(i.next() + " " + j.next());
    }


    @Test
    public void should_not_throw_exception(){
        Collection<Face> faces = Arrays.asList(Face.values());

        for (Face face : faces)
            for (Face face1 : faces)
                System.out.println(face + " " + face1);
    }
}
