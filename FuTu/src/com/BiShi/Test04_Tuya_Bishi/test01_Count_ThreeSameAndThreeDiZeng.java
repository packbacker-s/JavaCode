package com.BiShi.Test04_Tuya_Bishi;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/15
 * @Time:21:13
 */
public class test01_Count_ThreeSameAndThreeDiZeng {

    public int maxGroupNumber(int[] tiles) {
        // write code here
        if (tiles == null) {
            return -1;
        }

        int len = tiles.length;

        if (len < 3) {
            return 0;
        }

        Arrays.sort(tiles);
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < len - 2; i++) {

            if (tiles[i] == tiles[i + 1] && tiles[i + 1] == tiles[i + 2]) {
                if (flag) {
                    i += 2;
                }
                flag = true;
                count++;

            } else {

                if (flag) {
                    i += 2;
                }
                if ((tiles[i] == tiles[i + 1] - 1) && (tiles[i + 1] == tiles[i + 2] - 1)) {
                    flag = true;
                    count++;
                }
            }
        }

        return count;
    }


}
