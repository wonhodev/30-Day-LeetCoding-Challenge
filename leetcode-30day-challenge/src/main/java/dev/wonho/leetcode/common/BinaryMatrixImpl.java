package dev.wonho.leetcode.common;

import java.util.List;

public class BinaryMatrixImpl implements BinaryMatrix {

    int[][] mat;

    public BinaryMatrixImpl(int[][] mat) {
        this.mat = mat;
    }

    @Override
    public int get(int x, int y) {
        return mat[x][y];
    }

    @Override
    public List<Integer> dimensions() {
        if (mat.length > 0) {
            return List.of(mat.length, mat[0].length);
        } else {
            return List.of(0, 0);
        }
    }

}
