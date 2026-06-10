package hospital;

import java.util.Scanner;

public class Main {
    private Scanner sc = new Scanner(System.in);
    private PatientService service = new PatientService();

    public void start() {
        while (true) {
            showMenu();

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    service.showPatients();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void showMenu() {
        System.out.println("===== 병원 시스템 =====");
        System.out.println("1. 환자 등록");
        System.out.println("2. 환자 조회");
        System.out.println("3. 환자 수정");
        System.out.println("4. 환자 삭제");
        System.out.println("5. 종료");
    }

    public void register() {
        // 입력
        System.out.print("이름 입력: ");
        String name = sc.nextLine();

        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        service.registerPatient(name, age);
    }

    public void update() {
        System.out.print("수정할 ID 입력: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("새 이름 입력: ");
        String name = sc.nextLine();

        System.out.println("새 나이 입력: ");
        int age = sc.nextInt();

        service.updatePatient(id, name, age);
    }

    public void delete() {
        // 입력
        System.out.print("삭제할 ID 입력: ");
        int id = sc.nextInt();

        service.deletePatient(id);
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
