// Brute force
// Time: O(n²)
// Space: O(1)

// class Solution {
//     public int trap(int[] height) {
//         int n=height.length;
        
//         int ans=0;
//         for(int i=1;i<n-1;i++){
//             int leftmax=0;
//            int rightmax=0;

//           int j=i;
//           int k=i;

//           while(j>=0){
//          leftmax=Math.max(height[j],leftmax);
//          j--;
//           }

//           while(k<n){
//          rightmax=Math.max(height[k],rightmax);
//          k++;
//           }

//           int hei=Math.min(leftmax,rightmax);
//           ans +=hei-height[i];
//         }

//      return ans;
//     }
// }

// class Solution {
//     public int trap(int[] height) {

//         int n = height.length;

//         int[] leftMax = new int[n];
//         int[] rightMax = new int[n];

//         // Left maximum
//         leftMax[0] = height[0];

//         for (int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(leftMax[i - 1], height[i]);
//         }

//         // Right maximum
//         rightMax[n - 1] = height[n - 1];

//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(rightMax[i + 1], height[i]);
//         }

//         // Calculate trapped water
//         int ans = 0;

//         for (int i = 0; i < n; i++) {
//             int waterHeight = Math.min(leftMax[i], rightMax[i]);

//             ans += waterHeight - height[i];
//         }

//         return ans;
//     }
// }

class Solution {
    public int trap(int[] height) {
    
    int leftmax=0;
    int rightmax=0;

    int l=0;
    int r=height.length-1;

    int ans=0;
    while(l<r){
        if(height[l]>leftmax){
            leftmax=Math.max(height[l],leftmax);
            
        }

        if(height[r]>rightmax){
            rightmax=Math.max(height[r],rightmax);
            
        }

        if(leftmax<rightmax){
        ans=ans+leftmax-height[l];
        l++;
        }
        else{
           ans=ans+rightmax-height[r];
        r--; 
        }
    }

    return ans;
    }
}