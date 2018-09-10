package com.bootcamp.mdq.tests.amz.exceptions;

public class NotMatchingProductForCriteria extends RuntimeException {

  public NotMatchingProductForCriteria(String ... characteristics) {
    super("Couldn't find a product with the following characteristics '" + characteristics + "'.");
  }

}
