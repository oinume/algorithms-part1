package algorithms.union_find;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by kazuhiro on 2017/03/30.
 */
public class UFQuickFindTest {

    @Test
    public void testBasicUnion() {
        UF uf = new UFQuickFind(10);
        assertEquals(false, uf.connected(0, 1));

        uf.union(0, 1);
        assertEquals(true, uf.connected(0, 1));
    }

}
