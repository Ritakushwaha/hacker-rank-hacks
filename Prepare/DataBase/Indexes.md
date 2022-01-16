# Indexes

## Index Architecture Types

How many index architecture type classifications are there in MS SQL Server?

- 1
- 2
- 3
- 4

### Ans - 2

## Indexes - 2
(https://docs.microsoft.com/en-us/sql/relational-databases/sql-server-index-design-guide?view=sql-server-ver15#Nonclustered)

Which of the following statement is true about row locators in non-clustered indexes in MS SQL Server?

- If the table does not have a clustered index, the row locator is the clustered index key for the row.
- If the table has a clustered index, or the index is on an indexed view, the row locator is a pointer to the row.
- If the table has a clustered index, or the index is on an indexed view, the row locator is the clustered index key for the row.
- None of the above-mentioned statement is true.

### Ans - If the table has a clustered index, or the index is on an indexed view, the row locator is the clustered index key for the row.

## Indexes - 3
(https://www.mssqltips.com/sqlservertip/1940/understanding-sql-server-index-fill-factor-setting/)

Consider the following two designs to store the data using clustered indexes in MS SQL Server:
In the first design, the fill factor is 20% and the total number of free rows per page are A.
In the second design, the fill factor is 40% and the total number of free rows per page are B.

Which the followings describes the relation between A and B:
- A = 1.33B
- B = 1.33A
- A = 0.67B
- B = 0.67A

### Ans - A = 1.33B

## Indexes - 4
(https://www.tutorialspoint.com/sql/sql-indexes.htm#:~:text=A%20composite%20index%20is%20an,on%20table_name%20(column1%2C%20column2)%3B)

The correct syntax for creating composite indexes in MS SQL Sever is:

- <p>CREATE INDEX index_name</p> <p>ON table_name(column1), table_name(column2);</p>
- <p>CREATE INDEX index_name</p> <p>ON table_name(column1) and table_name(column2);</p>
- <p>CREATE INDEX index_name</p> <p>ON table_name(column1, column2);</p>
- <p>All the above-mentioned syntax are correct.</p>

### Ans - <p>CREATE INDEX index_name</p> <p>ON table_name(column1, column2);</p>
