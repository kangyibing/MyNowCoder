#挨个遍历
# -*- coding:utf-8 -*-
class Solution:
    # array 二维列表
    def Find(self, target, array):
        # write code here
        m = len(array)
        n = len(array[0])
        for i in range (m):
            for j in range (n):
                if array[i][j] == target:
                    return True
        return False