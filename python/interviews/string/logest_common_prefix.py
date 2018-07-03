class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if strs == None or len(strs) < 1:
            return ""

        lcp = strs[0]
        for str_i in strs:
            prefix = ""
            for s in zip(lcp, str_i):
                if s[0] == s[1]:
                    prefix += s[0]
                else:
                    break
            if prefix == "":
                return ""
            else:
                lcp = prefix
        return lcp