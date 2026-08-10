class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        m=[intervals[0]]
        for i,j in intervals[1:]:
            if m[-1][1]>=i:
                m[-1][1]=max(m[-1][1],j)
            else:
                m.append([i,j])
        return m