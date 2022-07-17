# 이진 탐색이란?
데이터가 정렬돼 있는 배열에서 특정한 값을 찾아내는 알고리즘이다. 일반적으로 배열의 중간에 있는 임의의 값을 기준으로 탐색 범위를 좁혀나가는 탐색 방법이다.

## 1. 사용 근거
탐색 범위가 너무 넓어서 완전 탐색을 하기 어려운 상황일 경우. (메모리 초과)
log(N)의 시간복잡도를 요구하는 문제

## 2. 주의사항
이진 탐색의 필요충분 조건의 종료조건이다.

## 3. 예시
### 완전 탐색
<pre><code>
target = 25
answer = 0
m_list = [30, 94, 27, 92, 21, 37, 25, 47, 25, 53, 98, 19, 32, 32, 7]
length = len(m_list)

for i in range(0, length):
    if m_list[i] == 25:
        answer = i
        break
print("tartget의 인덱스 : ", answer)
</code></pre>

### 정방향 이진 탐색
<pre><code>
target = 25
m_list = [30, 94, 27, 92, 21, 37, 25, 47, 25, 53, 98, 19, 32, 32, 7]
length = len(m_list)

m_list.sort()
left = 0 
right = length-1

while left<=right:
    mid = (left+right)//2
    if m_list[mid] == target:
        print(mid+1)
        break
    elif m_list[mid]>target:
        right = mid-1
    else :
        left = mid+1
</code></pre>

### 재귀적 이진 탐색
<pre><code>
def binarySearch(array, target, left, right):
    middle_idx = (left+right)//2
    print(middle_idx)
    middle = array[middle_idx]
    if target == middle:
        print('answer {}'.format(middle_idx))
    elif middle > target:
        binarySearch(array, target,left,middle_idx-1)
    elif middle < target:
        binarySearch(array, target,middle_idx+1,right)
    else: 
        return False

target = 25
m_list = [30, 94, 27, 92, 21, 37, 25, 47, 25, 53, 98, 19, 32, 32, 7]
length = len(m_list)

m_list.sort()
left = 0 
right = length-1

binarySearch(m_list,target,0,right)
</code></pre>
