package com.example.shop;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModularityTests {

  private final ApplicationModules modules = ApplicationModules.of(ShopApplication.class);

  @Test
  void printsModules() {
    modules.forEach(System.out::println);
  }

  @Test
  void printsViolations() {
    modules.detectViolations().getMessages().stream().sorted().distinct().forEach(System.out::println);
  }
}
