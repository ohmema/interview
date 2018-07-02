class Solution:
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maxv, maxi, maxj = self.getv(height, 0, 1), 0, 1

        for i, h in enumerate(height):
            if i == 0 or i == 1:
                continue
            v1 = self.getv(height, i - 1, i)
            a = self.getv(height, maxi, i)
            b = self.getv(height, maxj, i)
            if maxv > v1 and maxv > a and maxv > b:
                continue
            if v1 > a and v1 > b:
                maxi = i - 1
                maxj = i
                maxv = v1
            elif a > b:
                maxj = i
                maxv = a
            elif b >= a:
                maxi = maxj
                maxj = i
                maxv = b
        return maxv

    def getv(self, height, i, j):
        return abs(i - j) * min(height[i], height[j])

a=[2,3,10,5,7,8,9]

print(Solution().maxArea(a))