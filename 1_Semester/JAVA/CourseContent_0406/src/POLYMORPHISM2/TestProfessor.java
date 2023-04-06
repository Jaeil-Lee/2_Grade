package POLYMORPHISM2;

public class TestProfessor {
  public static void main(String[] args) {


    ProfessorDescending[] professor = new ProfessorDescending[3];
    professor[0] = new ProfessorDescending("박성철❤️", "123");
    professor[1] = new ProfessorDescending("김종율", "456");
    professor[2] = new ProfessorDescending("정영철", "789");

  
    Util2.selectionSort(professor);

  
    for (ProfessorDescending psf : professor) {
      System.out.println(psf);
    }


  }
}

