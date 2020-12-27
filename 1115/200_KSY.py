import numpy as np

def numIslands(grid):
    """
    :type grid: List[List[str]]
    :rtype: int
    """
    num = 0
    h, w = len(grid), len(grid[0])
    visited = np.zeros((h, w), bool)
    for i in range(h):
        for j in range(w):
            if not visited[i, j]:
                if grid[i][j] == "1":
                    dfs(grid, visited, (i, j))  # 좌표를 튜플로 저장
                    num += 1

    return num


def dfs(grid, visited, start):
    h, w = len(grid), len(grid[0])
    q = [start]

    dx = [1, 0, -1, 0]
    dy = [0, 1, 0, -1]
    while len(q) > 0:
        e = q.pop()
        visited[e] = True

        for k in range(len(dx)):
            nx, ny = (e[0] + dx[k]), (e[1] + dy[k])
            if (0 <= nx < h and 0 <= ny < w) and (grid[nx][ny] == "1") and (not visited[nx, ny]):
                q.append((nx, ny))


g = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
print(numIslands(g))