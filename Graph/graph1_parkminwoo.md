## [문제 링크] (https://school.programmers.co.kr/learn/courses/30/lessons/49191)
### 문제 이름 : 프로그래머스 - 순위 (Level3)
### 문제 설명
#### (1)구현 : 문제 이해
설명 : 해당 선수의 확실한 순서를 알기 위해서는 해당 선수를 제외한 모든 선수와 비교가 되어야 함
#### (2)플로이드 와샬 알고리즘
설명 : 최단 경로를 구하는 알고리즘 중 하나로 '거쳐가는 정점'을 기준으로 알고리즘을 수행함.

[해당 문제 설명 링크] (https://gom20.tistory.com/178)

#### (3)문제 정답 코드
<pre>
<code>
def solution(n, results):
    answer = 0
    board = [[0]*n for _ in range(n)]
    
    for a,b in results:
        board[a-1][b-1] = 1
        board[b-1][a-1] = -1
        
    for k in range(n):
        for i in range(n):
            for j in range(n):
                if i == j or board[i][j] in [1,-1]:
                    continue
                if board[i][k] == board[k][j] == 1:
                    board[i][j] = 1
                    board[j][i] = board[k][i] = board[j][k] = -1
    for row in board:
        if row.count(0) == 1:
            answer += 1
    return answer
</code>
</pre
