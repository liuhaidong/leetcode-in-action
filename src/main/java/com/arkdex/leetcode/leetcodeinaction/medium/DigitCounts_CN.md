一次循环取余数计算每一位数字，主要分成两类：
K是0的，每10个数字出现1次；需要考虑间隔0的情况；
K不是0的，每10个出现一次，并且10位以上时，会出现以K开头的数字；
再加上一些边界检查就可以了，细节的边界情况比较多。

This code submission beat 98% submissions on 2020/2/10

AcceptedPowered by LintCode FlashJudge

100%
100% test cases passedTotal runtime 169 ms
Your submission beats 98.40% Submissions!
View detail