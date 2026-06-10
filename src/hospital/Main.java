package hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Patient> patients = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void showMenu() {
        System.out.println("===== 병원 시스템 =====");
        System.out.println("1. 환자 등록");
        System.out.println("2. 환자 조회");
        System.out.println("3. 환자 삭제");
        System.out.println("4. 종료");
    }

    public void registerPatient() {
        // 입력
        System.out.print("이름 입력: ");
        String name = sc.nextLine();
        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        // 객체 생성
        Patient patient = new Patient(name, age);

        // 저장
        patients.add(patient);

        // 출력
        System.out.println("등록 완료");
    }

    public void showPatients() {
        // 등록된 환자가 없는 경우
        if (patients.isEmpty()) {
            System.out.println("등록된 환자가 없습니다.");
            return;
        }

        // 등록된 환자가 있는 경우
        for (Patient p : patients) {
            System.out.println("이름: " + p.getName() + " 나이: " + p.getAge());
        }
    }

    public void deletePatient() {
        // 입력
        System.out.print("삭제할 이름 입력: ");
        String name = sc.nextLine();

        // 삭제
        for (int i = 0; i < patients.size(); i++) {
            if (name.equals(patients.get(i).getName())) {
                patients.remove(i);
                System.out.println("삭제 완료");
                return;
            }
        }

        // 환자가 존재하지 않는 경우
        System.out.println("해당 환자를 찾을 수 없습니다.");
    }

    public void start() {
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    registerPatient();
                    break;
                case 2:
                    showPatients();
                    break;
                case 3:
                    deletePatient();
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }
}
