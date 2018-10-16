/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 14:34:22 GMT 2018
 */

package uk.ac.sanger.artemis.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.util.InputStreamProgressEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class InputStreamProgressEvent_ESTest extends InputStreamProgressEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InputStreamProgressEvent inputStreamProgressEvent0 = new InputStreamProgressEvent(0);
      int int0 = inputStreamProgressEvent0.getCharCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InputStreamProgressEvent inputStreamProgressEvent0 = new InputStreamProgressEvent(2036);
      int int0 = inputStreamProgressEvent0.getCharCount();
      assertEquals(2036, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InputStreamProgressEvent inputStreamProgressEvent0 = new InputStreamProgressEvent((-1));
      int int0 = inputStreamProgressEvent0.getCharCount();
      assertEquals((-1), int0);
  }
}