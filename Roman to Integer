class Solution(object):
    def romanToInt(self, s):
        value_symbol=[
        (1000, "M"),   # 1000s
        (900,  "CM"),  # 900 (special case)
        (500,  "D"),   # 500s
        (400,  "CD"),  # 400 (special case)
        (100,  "C"),   # 100s
        (90,   "XC"),  # 90 (special case)
        (50,   "L"),   # 50s
        (40,   "XL"),  # 40 (special case)
        (10,   "X"),   # 10s
        (9,    "IX"),  # 9 (special case)
        (5,    "V"),   # 5s
        (4,    "IV"),  # 4 (special case)
        (1,    "I")    ]
        nums=0
        i=0
        while i<len(s):
            for value , symbol in value_symbol:
                if s[i:i+len(symbol)]==symbol:
                    nums+=value
                    i+=len(symbol)
                    break

        return nums
