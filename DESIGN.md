# 설계 문서

## 구현 상태

- [x] Patient 클래스 생성
- [x] Main 클래스 생성
- [x] 메뉴 출력 구현
- [ ] 환자 등록 구현
- [ ] 환자 조회 구현
- [ ] 환자 삭제 구현

## 기능

1. 메뉴 출력
2. 환자 등록
3. 환자 조회
4. 환자 삭제
5. 종료

## 데이터 모델

### Patient

| 필드 | 타입 |
|--------|--------|
| name | String |
| age | int |

## 클래스

### Patient

#### 필드

- name : String
- age : int

#### 생성자

- Patient(String name, int age)

#### 메서드

- getName()
- getAge()

### Main

#### 필드

- patients : ArrayList<Patient>
- sc : Scanner

#### 메서드

- showMenu()
- registerPatient()
- showPatients()
- deletePatient()
- start()

## 기능 흐름

### 1. 메뉴 출력

#### 입력
- 없음

#### 처리
- 환자 목록 조회

#### 출력

```text
===== 병원 시스템 =====

1. 환자 등록
2. 환자 조회
3. 환자 삭제
4. 종료
```

## 2. 환자 등록

#### 입력
- 이름(String)
- 나이(int)

#### 처리
- Patient 생성
- 리스트 저장

#### 출력
- 등록 완료

### 3. 환자 조회

#### 입력
- 없음

#### 처리
- 환자 목록 조회

#### 출력
- 환자 목록

### 4. 환자 삭제

#### 입력
- 이름

#### 처리
- 환자 삭제

#### 출력
- 삭제 결과
