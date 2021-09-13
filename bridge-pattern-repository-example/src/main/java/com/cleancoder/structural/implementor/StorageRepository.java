package com.cleancoder.structural.implementor;

import com.cleancoder.structural.entitry.BaseEntity;

public interface StorageRepository {
  public void store(BaseEntity entiy);
}
