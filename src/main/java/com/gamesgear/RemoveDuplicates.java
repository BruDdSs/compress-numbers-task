package com.gamesgear;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
  public static int[] compressNumbers(int[] nums){
      if (nums == null || nums.length == 0) {
          return new int [0];
      }

      List<Integer> result = new ArrayList<>();
      result.add(nums[0]);
      for (int a = 1; a < nums.length; a++){
          if (nums[a] != nums[a - 1]) {
              result.add(nums[a]);
          }
      }
      int [] compressedArray = new int[result.size()];
      for (int a = 0; a < result.size(); a++){
          compressedArray[a] = result.get(a);
      }
      return compressedArray;
  }


}
