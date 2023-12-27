package github;

import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

 @BeforeAll
 static void beforeAll () {
  System.out.println("### @BeforeAll");
 }
 @AfterAll
 static void afterAll () {
  System.out.println("### @AfterAll");
 }
 @BeforeEach
 void beforeEach() {
   System.out.println("###   @BeforeEach\n");
 }

 @AfterEach
 void afterEach() {
   System.out.println("###   @AfterEach\n");
 }
 @Test
 void FirstTest() {
  System.out.println("###      @Test firstTest");
  Assertions.assertTrue(2*2 == 4);
}
 @Test
 void SecondTest() {
  System.out.println("###      @Test SecondTest");
  Assertions.assertTrue( 2 + 2 ==4);
 }
}