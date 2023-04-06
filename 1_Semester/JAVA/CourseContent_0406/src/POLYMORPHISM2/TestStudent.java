package POLYMORPHISM2;

public class TestStudent {
  public static void main(String[] args) {

    Student[] stds = new Student[5];
    stds[0] = new Student("이재일", "10131501");
    stds[1] = new Student("김지수", "10131499");
    stds[2] = new Student("배지현", "10132573");
    stds[3] = new Student("이다슬", "10111584");
    stds[4] = new Student("박혜경", "10107574");

    ProfessorDescending[] professor = new ProfessorDescending[3];
    professor[0] = new ProfessorDescending("박성철", "123");
    professor[1] = new ProfessorDescending("김종율", "456");
    professor[2] = new ProfessorDescending("정영철", "789");

    Util2.selectionSort(stds);
    Util2.selectionSort(professor);

    for (Student std : stds) {
      System.out.println(std);
    }

  
    for (ProfessorDescending psf : professor) {
      System.out.println(psf);
    }


  }
}
