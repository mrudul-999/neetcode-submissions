class Solution {
public:
    int maxArea(vector<int>& h) {
        int i=0;
        int j=h.size()-1;

        int max_area = 0;
        int l=0,b=0;

        while(i<j)
        {
            l = min(h[i],h[j]);
            b = j-i;
            max_area = max(l*b,max_area);

            if(h[i]>h[j])
                j--;
            else
                i++;

        }
        return max_area;
    }
};
