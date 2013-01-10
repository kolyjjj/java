package koly.li.annotations;

import koly.li.usage.PasswordUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTrackerTest {
    @Test
    public void testTrackUseCases() throws Exception {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        UseCaseTracker.trackUseCases(useCases, PasswordUtils.class);
        System.out.println("sdf");
    }
}
