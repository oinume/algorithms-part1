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

    @Test
    public void testBasicConnected() {
        UF uf = new UFQuickFind(10);

        // 0:0, 1:1, 2:2:, 3:3
        // union(0, 3) -> 0:3, 3:3 -> 0:3, 1:1, 2:2, 3:3
        // union(1, 2) -> 1:2, 2:2 -> 0:3, 1:2, 2:2, 3:3
        // union(3, 1) -> 0:2, 1:2, 2:2, 3:2

        uf.union(0, 3);
        //System.out.println(uf.toString());
        assertEquals(true, uf.connected(0, 3));

        uf.union(1, 2);
        //System.out.println(uf.toString());
        assertEquals(true, uf.connected(1, 2));

        uf.union(3, 1);
        //System.out.println(uf.toString());
        assertEquals(true, uf.connected(3, 1));
        assertEquals(true, uf.connected(0, 1));
        assertEquals(true, uf.connected(2, 3));
    }
}
