package com.cleancoder.structural.implementor;

import com.cleancoder.structural.entitry.BaseEntity;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileRepository implements StorageRepository {

  @Override
  public void store(BaseEntity entiy) {
    try {
      FileOutputStream fileOut = new FileOutputStream("./file-repository.txt");
      ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
      objectOut.writeObject(entiy);
      objectOut.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
