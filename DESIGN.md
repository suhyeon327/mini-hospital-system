# 설계 문서

## 기능

1. 환자 등록
2. 환자 조회
3. 환자 삭제
4. 종료

## 데이터 모델

### Patient

- name : String
- age : int

### 저장소

- ArrayList<Patient>

## 클래스 설계

### Patient

#### 역할

- 환자 정보 보관

#### 필드

- name
- age

#### 생성자

- Patient(String name, int age)

#### 메서드

- Patient(String name, int age)
- getName()
- getAge()

### Main

#### 역할

- 프로그램 실행
- 메뉴 출력
- 환자 관리

#### 메서드

- showMenu()
- registerPatient()
- showPatients()
- deletePatient()

## 기능 흐름

### 환자 등록

```text
이름 입력
↓
나이 입력
↓
Patient 객체 생성
↓
ArrayList 저장
↓
등록 완료 출력
```

### 환자 조회

```text
ArrayList 순회
↓
환자 목록 출력
```

### 환자 삭제

```text
삭제할 이름 입력
↓
ArrayList 탐색
↓
Patient 객체 생성
↓
환자 삭제
↓
삭제 완료 출력
```
