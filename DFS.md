# DFS

## DFS (Depth-First Search) : 깊이 우선 탐색
- 그래프에서 깊은 부분을 우선적으로 탐색하는 알고리즘
- 특정한 경로로 탐색하다가 특정한 상황에서 최대한 깊숙이 들어가서 노드를 방문한 후, 다시 돌아가 다른 경로로 탐색하는 알고리즘

- DFS 는 **스택 자료구조**를 이용하며 구체적인 동작 과정은 다음과 같다.

① 탐색 시작 노드를 스택에 삽입하고 *`방문 처리`를 한다.

② 스택의 최상단 노드에 방문하지 않은 인접 노드가 있으면 그 인접 노드를 스택에 넣고 방문 처리를 한다. 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼낸다.

③ ②번의 과정을 더 이상 수행할 수 없을 때까지 반복한다.

  * 방문처리 : 스택에 한 번 삽입되어 처리된 노드가 다시 삽입되지 않게 체크하는 것을 의미. 방문 처리를 함으로써 각 노드를 한 번씩만 처리할 수 있다.

## dfs 예제

```
def dfs(graph, v, visited) :
    visited[v] = True
    print(v, end=" ")
    for i in graph[v] :
        if not visited[i] :
            dfs(graph, i, visited)

graph = [
    [],
    [2,3,8],
    [1,7],
    [1,4,5],
    [3,5],
    [3,4],
    [7],
    [2,6,8],
    [1,7]
    ]

visited = [False] * 9

dfs(graph, 1, visited)
# 1 2 7 6 8 3 4 5 
```


## 프로그래머스 문제

### [lv3. 네트워크](https://school.programmers.co.kr/learn/courses/30/lessons/43162?language=python3)
```
def solution(n, computers):
    answer = 0
    graph = [[] for _ in range(n)]
    visited = [0] * n
    for i in range(n) :
        for j in range(n) :
            if i != j and computers[i][j] == 1 :
                graph[i].append(j)
    
    for i in range(n) :
        if dfs(i, graph, visited) == True :
            answer += 1
    return answer

def dfs(n, graph, visited) :
    if visited[n] != 1 :
        visited[n] = 1
        for g in graph[n] :
            if visited[g] != 1 :
                dfs(g, graph, visited)
        return True
    return False
```
