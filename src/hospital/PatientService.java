package hospital;

import java.util.ArrayList;

public class PatientService {
    private ArrayList<Patient> patients = new ArrayList<>();

    public void registerPatient(String name, int age) {
        Patient patient = new Patient(name, age);
        patients.add(patient);
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
            System.out.println(
                    "ID: " + p.getId() +
                    " | 이름: " + p.getName() +
                    " | 나이: " + p.getAge()
            );
        }
    }

    public void updatePatient(int id, String newName, int newAge) {
        // 찾기
        Patient target = null;

        for (Patient p : patients) {
            if (p.getId() == id) {
                target = p;
                break;
            }
        }

        // 검증 (존재 여부)
        if (target == null) {
            System.out.println("해당 환자를 찾을 수 없습니다.");
            return;
        }

        // 입력값 검증
        if (newName == null || newName.trim().isEmpty()) {
            System.out.println("이름은 비어 있을 수 없습니다.");
            return;
        }

        if (newAge < 0 || newAge > 150) {
            System.out.println("나이는 1~150 사이여야 합니다.");
            return;
        }

        // 업데이트
        target.setName(newName);
        target.setAge(newAge);

        System.out.println("수정 완료");
    }

    public void deletePatient(int id) {
        // 삭제
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId() == id) {
                patients.remove(i);
                System.out.println("삭제 완료");
                return;
            }
        }

        // 환자가 존재하지 않는 경우
        System.out.println("해당 환자를 찾을 수 없습니다.");
    }
}
