/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 22:39:56 GMT 2018
 */

package org.gmod.schema.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gmod.schema.analysis.AnalysisProp;
import org.gmod.schema.cv.CvTerm;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AnalysisProp_ESTest extends AnalysisProp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AnalysisProp analysisProp0 = new AnalysisProp();
      CvTerm cvTerm0 = analysisProp0.getCvTerm();
      assertNull(cvTerm0);
  }
}