 left-rotation-of-a-string
TEAM DETAILS:
TEAM NUMBER:25
1)BHAGYASHREE V (1KS18CS128)
2)LIKITHA S (1KS18CS130)
3)SHALINI KP (1KS18CS131)
BASIC PROCEDURE:
for example,if the string is "abcdefghijkl", and m=5,the ouput should be "fghijklabcde".
here we need to rotate a string by left.let m=5 that 5 elements a,b,c,d,e should come at the end and other elements f,g,h,i,j,k,l should come at first.
here we have used decrease and conquer
basically decrease and conquer is a mathematical property.
let us consider the string as X1,X2, where X1 is abcde and X2 is fghijkl
NOTE:WE KNOW THE RELATION REVERSE OF X1X2 IS SAME AS X2 REVERSE PRIME X1.
(X1X2)'=X2;X1'
where X' implies reverse of X
reverse method should be implemented using decrease and conquer.
ex:(abcd)'=dcba
here we need use to use reverse method two times.
by doing the reverse method we need to apply decrease and conquer method and then do the reverse of combine together will get the output.
for example if will reverse the abcde will get as edcba.
REVERSE METHOD
1)str=abcde
2) STEP 1:abcde @SIZE 5,[0......4]
3)STEP 2:bcd @SIZE 3,[1...3]
4)STEP 3:c @ SIZE 1,[2.....2] base case
5)return c
6)return dcb @ SWAP first and last
7)return edcba @ SWAP first and last
X1 is d and X2 is n-d
by using decresae and conquer X1/d and X2/n-d.

