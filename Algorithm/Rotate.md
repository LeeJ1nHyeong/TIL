# 배열 회전

왼쪽 모서리가 (r, c) (0 ≤ r, c < N)인  M X M (1 ≤ M ≤ N)을 회전

### 90도 회전

```python
board = [N X N 배열]
rotate_90 = [[0] * N for _ in range(N)]

for i in range(M):
    for j in range(M):
        rotate_90[r + j][c + (M - 1) - i] = board[r + i][c + j]
```

### 180도 회전

```python
board = [N X N 배열]
rotate_180 = [[0] * N for _ in range(N)]

for i in range(M):
    for j in range(M):
        rotate_180[r + (M - 1) - i][c + (M - 1) - j] = board[r + i][c + j]
```

### 270도 회전

```python
board = [N X N 배열]
rotate_270 = [[0] * N for _ in range(N)]

for i in range(M):
    for j in range(M):
        rotate_270[r + (M - 1) - j][c + i] = board[r + i][c + j]
```

