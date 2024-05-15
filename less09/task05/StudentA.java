package less09.task05;

public class StudentA extends Marks{

    int[] marks[];


    public StudentA(int[] marks) {
        marks = new int[]{0, 0, 0};
    }

    @Override
    public int getPercentage(int[] marks) {
        return (marks[0] + marks[1] +  marks[2]) / marks.length;
    }
}
