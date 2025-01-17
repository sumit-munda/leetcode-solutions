package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Introduction {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int i = 0;
        int countMax = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                count++;
            }
            if (nums[i] == 0) {
                countMax = Math.max(countMax, count);
                count = 0;
            }
            i++;
        }
        return Math.max(countMax, count);
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            int digits = 0;
            digits = (int) (Math.log10(i) + 1);
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = (int) (Math.pow(nums[i], 2));
        }
        Arrays.sort(ans);
        return ans;
    }

    public void duplicateZeros(int[] arr) {
        int n = arr.length;

        int countZeros = 0;
        for (int k : arr) {
            if (k == 0) {
                countZeros++;
            }
        }

        int i = n - 1;

        for (int j = n - 1; j >= 0; j--) {
            if (j + countZeros < n) {
                arr[j + countZeros] = arr[j];
            }

            if (arr[j] == 0) {
                countZeros--;
                if (j + countZeros < n) {
                    arr[j + countZeros] = 0;
                }
            }
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < nums1.length; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }

        int lengthGCD = gcd(str1.length(), str2.length());

        return str1.substring(0, lengthGCD);
    }

    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
            if(nums[i] == nums[i+1]) return nums[i];
        return -1;
    }

    public static boolean uniqueSearch(int n, int[] arr) {
        ArrayList<Integer> counts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (!counts.contains(count)) {
                counts.add(count);
            } else {
                return false;
            }
        }
        return true; // if all counts in the list are unique...

    }

    public static ArrayList<Integer> arrIntersection(int[] a, int[] b) {
        ArrayList<Integer> ansList = new ArrayList<>();
//        int j = 0;
        // Math.max returns type based on type of values
        for (int i = 0; i < Math.max(a.length, b.length); i++) {
            for (int k = 0; k < Math.max(a.length, b.length); k++) {
                if (a[i] == b[k]) {
                    ansList.add(a[i]);
                    break;
                }
            }
        }
        return ansList;
    }

}





