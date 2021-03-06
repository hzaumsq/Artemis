/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:21:55 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import htsjdk.samtools.SAMRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.alignment.SAMRecordFlagPredicate;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class SAMRecordFlagPredicate_ESTest extends SAMRecordFlagPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SAMRecordFlagPredicate sAMRecordFlagPredicate0 = new SAMRecordFlagPredicate((-1482), false);
      int[] intArray0 = new int[1];
      intArray0[0] = (-1482);
      SAMRecordFlagPredicate.FLAGS = intArray0;
      SAMRecord sAMRecord0 = mock(SAMRecord.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(sAMRecord0).getFlags();
      sAMRecordFlagPredicate0.testPredicate(sAMRecord0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SAMRecordFlagPredicate sAMRecordFlagPredicate0 = new SAMRecordFlagPredicate(2);
      SAMRecord sAMRecord0 = mock(SAMRecord.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(sAMRecord0).getFlags();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      SAMRecordFlagPredicate.FLAGS = intArray0;
      sAMRecordFlagPredicate0.testPredicate(sAMRecord0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SAMRecordFlagPredicate sAMRecordFlagPredicate0 = new SAMRecordFlagPredicate((-2001), false);
      // Undeclared exception!
      try { 
        sAMRecordFlagPredicate0.testPredicate((SAMRecord) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.SAMRecordFlagPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SAMRecordFlagPredicate sAMRecordFlagPredicate0 = new SAMRecordFlagPredicate((-36), false);
      SAMRecord sAMRecord0 = mock(SAMRecord.class, new ViolatedAssumptionAnswer());
      doReturn(32).when(sAMRecord0).getFlags();
      sAMRecordFlagPredicate0.testPredicate(sAMRecord0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SAMRecordFlagPredicate sAMRecordFlagPredicate0 = new SAMRecordFlagPredicate((-32));
      SAMRecord sAMRecord0 = mock(SAMRecord.class, new ViolatedAssumptionAnswer());
      doReturn((-32)).when(sAMRecord0).getFlags();
      sAMRecordFlagPredicate0.testPredicate(sAMRecord0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SAMRecordFlagPredicate sAMRecordFlagPredicate0 = new SAMRecordFlagPredicate((-1758), false);
      SAMRecord sAMRecord0 = mock(SAMRecord.class, new ViolatedAssumptionAnswer());
      doReturn((-1758)).when(sAMRecord0).getFlags();
      boolean boolean0 = sAMRecordFlagPredicate0.testPredicate(sAMRecord0);
      assertFalse(boolean0);
  }
}
