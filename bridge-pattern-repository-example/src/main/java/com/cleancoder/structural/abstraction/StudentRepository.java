package com.cleancoder.structural.abstraction;

import com.cleancoder.structural.entitry.BaseEntity;
import com.cleancoder.structural.entitry.Student;
import com.cleancoder.structural.implementor.StorageRepository;

public class StudentRepository implements BaseRepository {

  private StorageRepository repository;

  public StudentRepository(StorageRepository repository) {
    this.repository = repository;
  }

  @Override
  public BaseEntity save(BaseEntity student) {
    if (student == null || ((Student) student).getName() == null) {
      return null;
    }
    student.setId(3l);
    repository.store(student);
    return student;
  }

  @Override
  public StorageRepository getRepository() {
    return repository;
  }
}
