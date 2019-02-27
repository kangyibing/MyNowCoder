# 右上角开始
# -*- coding:utf-8 -*-
class Solution:
    # array 二维列表
    def Find(self, target, array):
        # write code here
        m,n=len(array),len(array[0])
        row=0
        col=n-1
        while(row<m and col>=0):
            if array[row][col]<target:
                row+=1
            elif array[row][col]>target:
                col-=1
            else:
                return True
        return False 