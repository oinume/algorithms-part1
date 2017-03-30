package algorithms.union_find;

import java.util.Arrays;

/**
 * Created by kazuhiro on 2017/03/30.
 */
public class UFQuickFind implements UF {

    private int[] data;

    public UFQuickFind(int n) {
        data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return data[p] == data[q];
    }

    @Override
    public void union(int p, int q) {
        data[p] = q;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == p) {
                data[i] = q;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
