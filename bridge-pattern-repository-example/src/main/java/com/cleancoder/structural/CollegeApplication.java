package com.cleancoder.structural;

import com.cleancoder.structural.abstraction.StudentRepository;
import com.cleancoder.structural.entitry.Student;
import com.cleancoder.structural.implementor.DatabaseRepository;
import com.cleancoder.structural.implementor.FileRepository;

public class CollegeApplication {

  public static void main(String[] args) {
    // code to store in file
    Student student1 = new Student("Anup");
    StudentRepository fileRepository = new StudentRepository (new FileRepository());
    fileRepository.save(student1);

    // code to store in DataBase
    Student student2 = new Student("Anuj");
    StudentRepository dbRepository = new StudentRepository(new DatabaseRepository());
    dbRepository.save(student2);
  }
}
