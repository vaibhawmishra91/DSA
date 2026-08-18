class Solution {
        public void moveZeroes(int[] nums) {
              int j,temp;
                int n=nums.length;
                         
                j=0;
                for(int i=0;i<n;i++){
                if(nums[i]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                        j++;
                }
                }
                                                  
        }
        }
