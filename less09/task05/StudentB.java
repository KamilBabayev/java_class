package less09.task05;

public class StudentB extends Marks{
    int[] marks;

    public StudentB(int[] marks) {
//        marks = new int[]{0, 0, 0};
        marks = new int[]{4};
    }

    public int getPercentage(int[] marks) {
        return (marks[0] + marks[1] +  marks[2] +  marks[3]) / marks.length;
    }
}
