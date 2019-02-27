# -*- coding:utf-8 -*-
# 指针法
class Solution:
    # s 源字符串
    def replaceSpace(self, s):
        # write code here
        #计算空格数量
        s=list(s)
        count=0
        for e in s:
            if e == ' ':
                count+=1
        p1=len(s)-1 # p1为原始字符串数组末尾的index
        #求新数组长度
        s+=[None]*(count*2)
        p2=len(s)-1 # p2为新字符串数组末尾的index
        while p1>=0:
            if s[p1]==' ':
                for i in ['0','2','%']:
                    s[p2]=i
                    p2-=1
            else:
                s[p2]=s[p1]
                p2-=1
            p1-=1
        return ''.join(s)


a = Solution()
print a.replaceSpace("we are family")