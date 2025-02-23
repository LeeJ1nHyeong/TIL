# 세그먼트 트리 생성
def init(start, end, index):
    if start == end:
        segment_tree[index] = numbers[start]
        return segment_tree[index]

    mid = (start + end) // 2

    # 분할정복으로 세그먼트 트리의 각 노드에 구간 합 저장
    segment_tree[index] = init(start, mid, index * 2) + init(mid + 1, end, index * 2 + 1)
    return segment_tree[index]


# 구간 합 구하기
def interval_sum(start, end, index, left, right):
    # 범위 밖에 있을 경우 0 return
    if left > end or right < start:
        return 0

    # 범위 내에 있을 경우 해당 노드의 값 return
    if left <= start and right >= end:
        return segment_tree[index]

    mid = (start + end) // 2

    # 분할정복으로 세그먼트 트리의 구간 합 return
    return interval_sum(start, mid, index * 2, left, right) + interval_sum(mid + 1, end, index * 2 + 1, left, right)


# 값 변경
def change_value(start, end, index, node, value):
    if node < start or node > end:
        return

    segment_tree[index] += value

    if start == end:
        return

    mid = (start + end) // 2

    change_value(start, mid, index * 2, node, value)
    change_value(mid + 1, end, index * 2 + 1, node, value)


numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
segment_tree = [0] * (len(numbers) * 4)

init(0, len(numbers) - 1, 1)  # 세그먼트 트리 생성

print(interval_sum(0, len(numbers) - 1, 1, 0, 9))  # 55 (구간 0 ~ 9 합 == 1 ~ 10 합)
print(interval_sum(0, len(numbers) - 1, 1, 0, 2))  # 6 (구간 0 ~ 2 합 == 1 ~ 3 합)

change_value(0, len(numbers) - 1, 1, 0, 4)  # 0번 인덱스 값에 4 추가
print(interval_sum(0, len(numbers) - 1, 1, 0, 9))  # 59 (구간 0 ~ 9 합 == 1 ~ 10 합 + 4)
print(interval_sum(0, len(numbers) - 1, 1, 0, 2))  # 10 (구간 0 ~ 2 합 == 1 ~ 3 합 + 4)
