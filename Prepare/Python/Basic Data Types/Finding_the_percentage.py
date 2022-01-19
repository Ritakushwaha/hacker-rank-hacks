if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()

avg_score = [(sum(values)/len(values)) for key,values in student_marks.items() if key == query_name][0]
print("%.2f" % avg_score)