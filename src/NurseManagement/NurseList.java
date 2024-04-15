package NurseManagement;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class NurseList {

    private List<Nurse> nurses;

    public NurseList() {
        nurses = new ArrayList<>();
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

    public boolean isStaffIDUnique(String staffID) {
        for (Nurse nurse : nurses) {
            if (nurse.getStaffID().equals(staffID)) {
                return false;
            }
        }
        return true;
    }

    public List<Nurse> findNurseByName(String name) {
        List<Nurse> foundNurses = new ArrayList<>();
        for (Nurse nurse : nurses) {
            if (nurse.getName().contains(name)) {
                foundNurses.add(nurse);
            }
        }
        return foundNurses;
    }

    public boolean updateNurse(Nurse updatedNurse) {
        for (int i = 0; i < nurses.size(); i++) {
            Nurse nurse = nurses.get(i);
            if (nurse.getStaffID().equals(updatedNurse.getStaffID())) {
                nurses.set(i, updatedNurse);
                return true;
            }
        }
        return false;
    }

    public boolean deleteNurse(String staffID) {
        for (int i = 0; i < nurses.size(); i++) {
            Nurse nurse = nurses.get(i);
            if (nurse.getStaffID().equals(staffID)) {
                nurses.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean hasTasks(Nurse nurse) {
        // Implement logic to check if the nurse has tasks
        return false;
    }

    public List<Nurse> getAllNurses() {
        return nurses;
    }

}
