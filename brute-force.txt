1) 브루트 포스란?
*완전 탐색을 의미하며, 대상이 되는 데이터를 처음부터 끝까지 차례대로 순회하며 일일이 비교하는 방식이다.

2) 사용 근거
*직관적인 문제 풀이가 가능할 경우 바로 사용
*리스트, 문자열의 반복탐색의 경우 사용
*보드가 5x5 이하일 경우 사용

3) 주의사항
*단점은 메모리 초과이며, 이 부분에 대해서는 경험론에 의거하여 사용 여부를 결정한다.

4) 예시
1) 프로그래머스 level1 - 소수찾기 (브루트 포스)
def solution(n):
    count = 0
    for I in range(2,n+1)
        for J in range(2,n):
            if I%J == 0:
                break
            else:
                count += 1
    return count
*설명 : 단순 브루트 포스 문제로 소수를 판별하기 위해 for문을 사용하여 모든 해의 적합성을 판별한다.

2) 프로그래머스 level3 - 카드 짝 맞추기
(브루트포스 + dfs)
(위의 코드 생략...)
def solution(board, r, c):
    for i in range(4):
        for j in range(4):
            if board[i][j] != 0:
                dfs(board, r, c, i, j, 0)
    return answer
    
