package com.cleancoder.structural.abstraction;

import com.cleancoder.structural.implementor.StorageRepository;
import com.cleancoder.structural.entitry.BaseEntity;

public interface BaseRepository {
  public BaseEntity save(BaseEntity entiy);
  public StorageRepository getRepository();
}
