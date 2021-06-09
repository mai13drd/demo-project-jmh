package de.dagere.peass;

import org.openjdk.jmh.annotations.Benchmark;

public class ExampleBenchmarkClazz {

   @Benchmark
   public void calleeMethod() {
      new Callee().method1();
   }

}