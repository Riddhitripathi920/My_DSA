import java.util.ArrayList;

class Solution {
    public int findMin(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int low = 0;
        int high = list.size() - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (list.get(mid) > list.get(high)) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }

        return list.get(low);
    }
}