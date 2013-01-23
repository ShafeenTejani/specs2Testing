specs2Testing
=============

An simple sbt project containing a single specs2 specification. This can be used to analyse the total runtime of a specs2 Given/When/Then style test class against the number of test cases in the class.

To do this:

* Simply keep adding more test cases into the Specs2Spec.scala class and measure its runtime. A test case constitutes a single Given/When/Then block as shown below:

  ```
  "Given 1"      ^ one     ^
  "When I add 1" ^ plusOne ^
  "Then I get 2" ^ isTwo   ^ end
  ```

* Be sure to compile the test class first so that the measured runtimes do not include the compilation step.
    
  ````
  specs2Testing> sbt test:compile
  specs2Testing> time sbt test
  ```

The image below shows a graph comparing runtimes against the number of test cases in the class. The runtime appears to increase exponentially with the number of test cases!

![specs2test](https://f.cloud.github.com/assets/1223541/90627/0147eeb6-657d-11e2-9973-2b81da65b39c.jpg)
