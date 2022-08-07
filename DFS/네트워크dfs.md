## [문제 링크] (https://school.programmers.co.kr/learn/courses/30/lessons/43162)
### 문제 이름 : 프로그래머스 - 네트워크 (Level2)
### 문제 설명
#### (1)DFS 문제
설명 : 기본적인 dfs 문제이지만 재귀함수의 흐름에 따라서 풀이
#### (2) 해당 노드를 방문했는지 여부를 저장할 것
설명 : 순서에 따라 방문 노드가 달라질 수 있으므로 이 부분을 저장하기 위함.

#### (3)문제 정답 코드
<pre>
<code>
def solution(n, computers):
    answer = 0
    visited = [False for i in range(n)]
    for com in range(n):
        if visited[com] == False:
            DFS(n, computers, com, visited)
            answer += 1 #DFS로 최대한 컴퓨터들을 방문하고 빠져나오게 되면 그것이 하나의 네트워크.
    return answer

def DFS(n, computers, com, visited):
    visited[com] = True
    for connect in range(n):
        if connect != com and computers[com][connect] == 1: #연결된 컴퓨터
            if visited[connect] == False:
                DFS(n, computers, connect, visited)
</code>
</pre>


