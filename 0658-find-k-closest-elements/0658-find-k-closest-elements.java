class Solution {

    public int search(int[] arr, int x) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] == x) {
                return mid;
            } 
            else if (arr[mid] > x) {
                h = mid - 1;
            } 
            else {
                l = mid + 1;
            }
        }

        return l;
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        ArrayList<Integer> list = new ArrayList<>();

        int j = search(arr, x);
        int i = j - 1;

        while (i >= 0 && j < arr.length && list.size() < k) {

            if (Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) {
                list.add(arr[i]);
                i--;
            } 
            else {
                list.add(arr[j]);
                j++;
            }
        }

        while (i >= 0 && list.size() < k) {
            list.add(arr[i]);
            i--;
        }

        while (j < arr.length && list.size() < k) {
            list.add(arr[j]);
            j++;
        }

        Collections.sort(list);

        return list;
    }
}