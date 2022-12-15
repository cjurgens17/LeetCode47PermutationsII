import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LeetCode47Test {



    @org.junit.Test
    public void permuteUniq() {
        LeetCode47 leetCode47 = new LeetCode47();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1,1,2));
        expected.add(Arrays.asList(2,1,1));
        expected.add(Arrays.asList(1,2,1));

        List<List<Integer>> actual = leetCode47.permuteUniq(new int[] {1,1,2});

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void permutations() {
        return;
    }
}