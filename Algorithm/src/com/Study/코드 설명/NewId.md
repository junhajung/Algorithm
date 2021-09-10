# NewId

[문제 보러가기](https://programmers.co.kr/learn/courses/30/lessons/72410)

![image](https://user-images.githubusercontent.com/48474613/132819549-4527ece8-3d2e-422e-968c-9363573adadc.png)

1. 소문자로 치환
```java
new_id = new_id.toLowerCase(); 
```

2. 특정 조건을 제외한 모든 문자 제거 (정규식 활용)
```java
new_id = new_id.replaceAll("[^a-z|0-9|\\-|_|.]", ""); 
```
- 는 역슬래시 두개를 앞에 붙여줘야 마이너스라고 인식

3. 마침표가 두번 이상 연속된 부분을 하나로 치환
```java
new_id = new_id.replaceAll("[.]{2,}", ".");
```

4. 마침표가 처음이나 끝에 위치한다면 제거
```java
new_id = new_id.replaceAll("^[.]|[.]$", "");
```

5. 빈 문자열이라면 a 대입
```java
if(new_id.isEmpty()) {
  new_id = "a";
}
```

6. 16자 이상이면 첫 15개 문자를 제외한 나머지 문자 제거
```java
if(new_id.length() > 15) {
  new_id = new_id.substring(0,15);
  new_id = new_id.replaceAll("[.]$", "");
}
```

* substring(int beginindex) -> beginindex부터 끝까지 문자열 뽑기  
* substring(int beginindex, int endindex) -> beginindex부터 endindex까지 문자열 뽑기


7. 길이가 2자 이하라면 마지막 문자를 길이가 3이 될 때까지 붙인다.
```java
if(new_id.length() < 3) {
  while(new_id.length() < 3) {
    new_id = new_id.concat(new_id.substring(new_id.length()-1));	
  }
}
```
* * *

## 정규식 표현

![image](https://user-images.githubusercontent.com/48474613/132821165-36307a13-1955-4304-88a1-a03873ef4f45.png)
