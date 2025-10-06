# QUESTION: Given a simple arithmetic equation containing a single unknown digit x, find the value of x that makes the equation correct. The unknown digit can appear anywhere in the equation — either on the left-hand side or the right-hand side of the = sign.
# The equation uses one operator from +, -, or *.
# The task is to determine which single-digit number 0–9 should replace x so that the equation is mathematically correct.
"""
Sample equations
equation1 = "x34-146=388" x = 5
equation2 = "15+2x=35"    x = 0
equation3 = "12*125=1x00" x = 5
equation4 = "4*9=3x"      x = 6
"""
# SOLUTION: Long Version

# First split left and right part of the equality sign
def splitEq(equation):
    splitedEquation = equation.split("=")
    lefSp = splitedEquation[0]
    rightSp = splitedEquation[1]
    return lefSp,rightSp
# splitEq = "15+2x","35"

# Finding the operator
def findOperator(lefSp):
    lst = ("+","-","*")
    for i in lefSp:
        if i in lst:
            return i
# lefSp = "15+2x", i = "+"

# Operation part
def operate(num1, num2, operator, secOp=None):  # secOP is used for when we have summarization operation we sned positive value other side which makes it negative.
    num1 = int(num1)
    num2 = int(num2)
    if operator == "+" and secOp == None :
        return num1 + num2
    elif operator == "+" and secOp != None :
        return abs(num1 - num2)
    elif operator == "-" and secOp == None:
        return num1 - num2
    elif operator == "-" and secOp != None:
        return abs(num1 + num2)
    elif operator == "*" and secOp == None:
        return num1 * num2
    elif operator == "*" and secOp != None:
        return abs(num1 / num2)
    else:
        return -1

def findResult(lefSp, rightSp, operator):
    first, sec = lefSp.split(operator)
    if "x" in rightSp:
        return operate(first,sec,operator),rightSp
    elif "x"  in first:
        return operate(sec,rightSp,operator,secOp = True), first
    elif "x"  in sec:
        return operate(first, rightSp, operator, secOp = True), sec
    else:
        return -1
# lefSp = "15+2x", rightSp = "35" operator = "+"
# first = "15", sec = "2x"
# 3rd elif e girecek: abs(15 - 35) = 20

def findUnknownWord(self, equation):
    lefSp,rightSp = splitEq(equation)
    operator = findOperator(lefSp)
    equalTo, target = findResult(lefSp, rightSp, operator)
# equalTo = 20, target = 2x
    for x in range(10):
        sec_replaced = target.replace("x", str(x))
        if int(sec_replaced) == equalTo:
            print(x)
            break

print(findUnknownWord(None, "x34-146=388"))









