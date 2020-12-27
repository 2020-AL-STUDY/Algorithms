class Solution(object):
    res = []  # list of results (string)
    letter = ["", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"]

    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        self.res = []
        if digits == "": return []
        self.dfs(digits, 0, [])

        return self.res

    def dfs(self, d1, cnt, d2):
        if len(d1) == cnt:
            self.res.append("".join(d2)) # add to list res
        else:
            idx = int(d1[cnt])
            for j in range(len(self.letter[idx])):  # letter
                d2.append(self.letter[idx][j])
                self.dfs(d1, cnt + 1, d2)
                del d2[len(d2) - 1]

s = Solution()
k = s.letterCombinations("23")
print(k)