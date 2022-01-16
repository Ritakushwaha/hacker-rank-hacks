# Set And Algebra

## Databases - Relational Calculus

We execute the following query (in Relational Calculus) on a set of integers S.
For the given set S, what will be the answer? Fill up the answer box with the required integer.

relational.png

S = {4,5,6,7,10,11,19,18,3}

### Ans - 19

## Databases - Keys

A database table with three fields (bookname, author, language) has been created. If the table is as provided below, which of these three fields may be used as the primary key?

bookname-author-language
A Tale of Two Cities, Charles Dickens, English
Oliver Twist, Charles Dickens, English
Godaan, Premchand, Hindi
Chandrakanta, Devaki Nandan Khatri, Hindi
Hamlet, William Shakespeare, English
The Merchant of Venice, William Shakespeare, English
Output Format

Only fill in the name of the field which may be used as the primary key. Grading is case-sensitive.

### Ans - bookname

## Databases - Natural Joins

Relation R(A,C) has the following tuples:

A : C
3,3
16,4
12,3
3,15
27,1

Relation S(B,C,D) has the following tuples:

B : C : D
50,1,6
1,55,8
4,3,9

The following tuple is in the result of the natural join between R and S where tuples are structured as (A,B,C,D):

27, X, Y, Z

In the answer box, fill up the values of the integers X, Y and Z in three separate lines. e.g.

10
20
30  

Explaination -
```
-- create
CREATE Table R(
  A int,
  C int
);

CREATE Table S(
  B int,
  C int,
  D int
);

-- insert
INSERT INTO R values(3,3);
INSERT INTO R values(16,4);
INSERT INTO R values(12,13);
INSERT INTO R values(3,15);
INSERT INTO R values(27,1);

INSERT INTO S values(50,1,6);
INSERT INTO S values(1,55,8);
INSERT INTO S values(4,3,9);

select R.A,S.B,R.C,S.D from R, S where R.C = S.C and R.A = 27;
```

### Ans - 50	1	6

## Databases - Differences

Relation R(A,B,C) has the following tuples:

A B C
1 2 3
4 2 3
4 5 6
2 5 3
1 2 6

and relation S(A,B,C) has the following tuples:

A B C
2 5 3
2 5 4
4 5 6
1 2 3

The differences (R-S) is computed and the following tuple is found to be present in the result. Assume that the schema of the result is (A,B,C).

4, b, c

Find the integers b and c. Fill in the values in the answer box, each on a new line.

Output Format

Two integers, corresponding to b and c, each on a new line. For example:

4  
5  

Explaination -
```
-- create
CREATE Table R(
  A int,
  B int,
  C int
);

CREATE Table S(
  A int,
  B int,
  C int
);

-- insert
INSERT INTO R values(1,2,3);
INSERT INTO R values(4,2,3);
INSERT INTO R values(4,5,6);
INSERT INTO R values(2,5,3);
INSERT INTO R values(1,2,6);

INSERT INTO S values(2,5,3);
INSERT INTO S values(2,5,4);
INSERT INTO S values(4,5,6);
INSERT INTO S values(1,2,3);

SELECT * FROM R where R.A = 4
EXCEPT
SELECT * FROM S;
```

### Ans - 2 3