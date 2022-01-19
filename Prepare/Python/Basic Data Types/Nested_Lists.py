if __name__ == '__main__':
    pair_list = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        pair_list.append([name,score])
    second_lowest_score = sorted(set([score for name,score in pair_list]))[1]
    print('\n'.join(sorted(name for name, score in pair_list if score == second_lowest_score )))

