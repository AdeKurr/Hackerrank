import java.util.ArrayList;

public class GradingStudents {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        int result;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38) {
                if (grades.get(i)%5 >=3){
                result = (grades.get(i)/5)*5+5;
                grades.set(i, result);
                System.out.println("berubah: "+ grades.get(i));
                }
            }
        }
        System.out.println(grades);
    }
}
