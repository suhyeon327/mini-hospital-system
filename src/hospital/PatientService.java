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
            System.out.println("이름: " + p.getName() + " 나이: " + p.getAge());
        }
    }

    public void deletePatient(String name) {
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
}
