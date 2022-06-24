#!/usr/bin/env groovy
package com.groovy

class SampleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }
}
