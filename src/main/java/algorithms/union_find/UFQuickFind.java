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
        int pvalue = data[p];
        int qvalue = data[q];
        for (int i = 0; i < data.length; i++) {
            if (data[i] == pvalue) {
                data[i] = qvalue;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            sb.append(i).append('[').append(data[i]).append(']');
            sb.append(", ");
        }
        //sb.delete()
        return sb.toString();
    }
}
