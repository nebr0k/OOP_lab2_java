import java.util.Random;
import java.util.Arrays;



//public class Main {
//    public static void main(String[] args) {    int arraySize = 26;
//        int rangeMin = -40;
//        int rangeMax = 20;
//
//        Random random = new Random();
//        int[] array = new int[arraySize];
//        for (int i = 0; i < arraySize; i++) {
//            array[i] = random.nextInt(rangeMax - rangeMin + 1) + rangeMin;
//        }
//
//        System.out.println("Array: [" + String.join(", ", Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new)) + "]");
//
//        int count = 0;
//        int total = 0;
//        for (int i = 0; i < arraySize; i++) {
//            if (array[i] <= 0 || i % 2 == 0) {
//                count++;
//                total += array[i];
//            }
//        }
//
//        for (int i = 0; i < arraySize; i++) {
//            if (array[i] <= 0 || i % 2 == 0) {
//                array[i] = 0;
//            }
//        }
//
//        System.out.println("Number of elements that meet the criterion: " + count);
//        System.out.println("Sum of elements that meet the criterion: " + total);
//        System.out.println("Modified array: [" + String.join(", ", Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new)) + "]");
//    }
//}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int Low = 7;
//        int High = 65;
//        int rowCount = 5;
//        int colCount = 9;
//        int[][] a = new int[rowCount][colCount];
//
//        for (int i = 0; i < rowCount; i++) {
//            for (int j = 0; j < colCount; j++) {
//                a[i][j] = Low + random.nextInt(High - Low + 1);
//            }
//        }
//
//        Print(a, rowCount, colCount);
//        Sort(a, rowCount, colCount);
//        Print(a, rowCount, colCount);
//
//        int[] result = new int[2];
//        Calc(a, rowCount, colCount, result);
//
//        System.out.println("S = " + result[0]);
//        System.out.println("k = " + result[1]);
//
//        for (int i = 0; i < rowCount; i++) {
//            Arrays.fill(a[i], 0, colCount, 0);
//        }
//        Arrays.fill(a, 0, rowCount, null);
//    }
//
//    static void Print(int[][] a, int rowCount, int colCount) {
//        System.out.println();
//        for (int i = 0; i < rowCount; i++) {
//            for (int j = 0; j < colCount; j++) {
//                System.out.printf("%4d", a[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//    static void Sort(int[][] a, int rowCount, int colCount) {
//        for (int i0 = 0; i0 < rowCount - 1; i0++) {
//            for (int i1 = 0; i1 < rowCount - i0 - 1; i1++) {
//                if ((a[i1][0] < a[i1 + 1][0])
//                        || (a[i1][0] == a[i1 + 1][0] && a[i1][1] < a[i1 + 1][1])
//                        || (a[i1][0] == a[i1 + 1][0] && a[i1][1] == a[i1 + 1][1] && a[i1][3] > a[i1 + 1][3])) {
//                    Change(a, i1, i1 + 1, colCount);
//                }
//            }
//        }
//    }
//
//    static void Change(int[][] a, int row1, int row2, int colCount) {
//        int tmp;
//        for (int j = 0; j < colCount; j++) {
//            tmp = a[row1][j];
//            a[row1][j] = a[row2][j];
//            a[row2][j] = tmp;
//        }
//    }
//
//    static void Calc(int[][] a, int rowCount, int colCount, int[] result) {
//        int S = 0;
//        int k = 0;
//        for (int i = 0; i < rowCount; i++) {
//            for (int j = 0; j < colCount; j++) {
//                if (!((a[i][j] % 2 != 0) && ((i + j) % 7 == 0) && (i + j != 0))) {
//                    S += a[i][j];
//                    k++;
//                    a[i][j] = 0;
//                }
//            }
//        }
//        result[0] = S;
//        result[1] = k;
//    }
//}




////////////////////////////////////////////////////////////////////////////////////////////////////////////////



//
//public class Main {
//    public static void main(String[] args) {
//        Student[] students = new Student[3];
//
//        students[0] = new Student();
//        students[0].lastName = "Ivanov";
//        students[0].course = 2;
//        students[0].speciality = "Computer Science";
//        students[0].physicsMark = 4;
//        students[0].mathMark = 5;
//        students[0].itMark = 5;
//
//        students[1] = new Student();
//        students[1].lastName = "Petrov";
//        students[1].course = 1;
//        students[1].speciality = "Mathematics";
//        students[1].physicsMark = 5;
//        students[1].mathMark = 5;
//        students[1].itMark = 4;
//
//        students[2] = new Student();
//        students[2].lastName = "Sidorov";
//        students[2].course = 3;
//        students[2].speciality = "Physics";
//        students[2].physicsMark = 5;
//        students[2].mathMark = 5;
//        students[2].itMark = 5;
//
//        printTable(students);
//        System.out.println("Number of students with only 'excellent' marks: " + countExcellentStudents(students));
//    }
//
//    public static void printTable(Student[] students) {
//        System.out.format("| %1$-10s | %2$-5s | %3$-20s | %4$-5s | %5$-5s | %6$-5s |\n", "Last name", "Course", "Speciality", "Physics", "Math", "IT");
//        System.out.println(new String(new char[66]).replace('\0', '-'));
//        for (Student student : students) {
//            System.out.format("| %1$-10s | %2$-5d | %3$-20s | %4$-7d | %5$-4d | %6$-2d |\n", student.lastName, student.course, student.speciality, student.physicsMark, student.mathMark, student.itMark);
//        }
//        System.out.println(new String(new char[66]).replace('\0', '-'));
//    }
//
//    public static int countExcellentStudents(Student[] students) {
//        int count = 0;
//        for (Student student : students) {
//            if (student.physicsMark == 5 && student.mathMark == 5 && student.itMark == 5) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    private static class Student {
//        public String lastName;
//        public int course;
//        public String speciality;
//        public int physicsMark;
//        public int mathMark;
//        public int itMark;
//    }
//}
