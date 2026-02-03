package com.app.bookstore.catalog;

import org.springframework.boot.SpringApplication;

public class TestCatalogApplication {

  public static void main(String[] args) {
    SpringApplication.from(CatalogApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
