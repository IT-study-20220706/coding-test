## BFS란?

가까운 노트부터 탐색하는 알고리즘 `너비 우선 탐색`

`큐`를 통해 구현

### 동작과정
1. 탐색 시작 노드를 큐에 삽입하고 방문 처리
2. 큐에서 노드를 꺼내 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리
3. 2번의 과정을 더 이상 수행 할 수 없을 때까지 반복

### BFS 구현 (Python)
```Python
from collections import deque

def bfs(graph, start, visited):
    queue = deque([start])

    visited[start] = True

    while queue:
        v = queue.popleft()
        print(v, end=' ')

        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

graph = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]

visited = [False] * 9

bfs(graph, 1, visited)
```
```
출력 결과 : 1 2 3 8 7 4 5 6
```

### 문제 예시
#### 미로탈출
- 괴물이 있는 부분: 0
- 괴물을 피해 오른쪽 가장 아래 부분(N,M)에 도착할 수 있는 `최소 칸의 갯수`
```
101010
111111
000001
111111
111111
```
```
출력: 10
```




