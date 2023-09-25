class Solution {
    public:
        double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
            int m = nums1.size();
            int n = nums2.size();
            vector<int>ans(m+n,0);
            int i=0,j=0,k=0;
            while(i<m && j<n)
            {
                if(nums1[i] < nums2[j]) ans[k++]=nums1[i++];
                else ans[k++]=nums2[j++];
            }
            for(;i<m;++i) ans[k++]=nums1[i];
            for(;j<n;++j) ans[k++]=nums2[j];
            if(ans.size() & 1)
            {
                int mid = ans.size()/2;
                return double(ans[mid]);
            }
            int mid = ans.size()/2;
            double sol = (double(ans[mid]+ans[mid-1]))/2;
            return sol;
        }
    };