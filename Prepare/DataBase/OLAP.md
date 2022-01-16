# OLAP

## OLAP Performance
(https://www.itprotoday.com/sql-server/olap-performance)

Which of these helps OLAP speed up queries, in terms of performance?

- Dice
- Aggregation

### Ans - Aggregation

## OLAP Operations - 1
(https://apandre.wordpress.com/data/datacube/)
This OLAP operation involves computing all of the data relationships for one or more dimensions.

- dice
- slice
- pivot
- roll-up

### Ans - roll-up

## OLAP Operations - 2
(https://apandre.wordpress.com/data/datacube/)
This OLAP Operation rotates the data, and delivers an alternative to the original presentation. 

- pivot
- slice
- roll-up
- dice

### Ans - pivot

## OLAP Cube Metadata

What is the source of the cube metadata for OLAP?

- Star Schema
- Snowflake Schema
- Standard Database
- Both star and snowflake schema(s)

### Ans - Both star and snowflake schema(s)

## OLAP Name(s)

Which of these are alternate names for an OLAP Cube? The options in the top row are a and b respecitvely and those in the bottom row are c and d.

- Cube
- Multidimensional Cube
- HyperCube
- Both (B) and (C)

### Both (B) and (C) (Multidimensional Cube, HyperCube)

## The Total View

Which of these provides a total view of the organization?

- OLAP
- OLTP
- Data Warehousing
- Database

### Data Warehousing

## OLAP Operation Types

Consider a fact table DataPoints(D1,D2,D3,x), and the following three queries:

Q1: Select D1,D2,D3,Sum(x) From DataPoints Group By D1,D2,D3

Q2: Select D1,D2,D3,Sum(x) From DataPoints Group By D1,D2,D3 WITH CUBE

Q3: Select D1,D2,D3,Sum(x) From DataPoints Group By D1,D2,D3 WITH ROLLUP
Suppose attributes D1, D2, and D3 have n1, n2, and n3 different values respectively, and assume that each possible combination of values appears at least once in the table DataPoints. The number of tuples in the result of each of the three queries above can be specified as an arithmetic formula involving n1, n2, and n3. Pick the one tuple (a,b,c,d,e,f) in the list below such that when n1=a, n2=b, and n3=c, then the result sizes of queries Q1, Q2, and Q3 are d, e, and f respectively.

- (2, 2, 2, 6, 18, 8)
- (2, 2, 2, 8, 64, 15)
- (5, 10, 10, 500, 1000, 550)
- (4, 7, 3, 84, 160, 117)

Explaination - 
Input format - (a,b,c)
Output format - (a,b,c) will need to find (d,e,f)

Q1 - d = a*b*c
Q2 - e = (a+1)(b+1)(c+1)
Q3 - f = d + a(b+1)+1

### Ans - (4, 7, 3, 84, 160, 117)





