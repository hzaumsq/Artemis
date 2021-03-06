/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 08 17:39:33 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTKeyStroke;
import java.awt.Graphics2D;
import java.awt.datatransfer.Clipboard;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryChangeEvent;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.EntryGroupChangeEvent;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FeatureChangeEvent;
import uk.ac.sanger.artemis.FeaturePatternPredicate;
import uk.ac.sanger.artemis.FeaturePredicate;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.SelectionChangeEvent;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.SimpleGotoEventSource;
import uk.ac.sanger.artemis.components.BasePlotGroup;
import uk.ac.sanger.artemis.components.FeatureList;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.GenbankStreamSequence;
import uk.ac.sanger.artemis.sequence.AminoAcidSequence;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.Marker;
import uk.ac.sanger.artemis.sequence.MarkerRange;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FeatureList_ESTest extends FeatureList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("P");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "B43=_X<F6");
      Clipboard clipboard0 = new Clipboard("B43=_X<F6");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowUserDefinedQualifier("similarity");
      StringVector stringVector0 = featureList0.getShowUserDefinedQualifier();
      assertEquals("[similarity]", stringVector0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      Clipboard clipboard0 = new Clipboard("^NM|");
      Selection selection0 = new Selection(clipboard0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowQualifiers(true);
      boolean boolean0 = featureList0.getShowQualifiers();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Clipboard clipboard0 = new Clipboard("4PYv<'>R_n$!5>");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowProducts(true);
      boolean boolean0 = featureList0.getShowProducts();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      int int0 = featureList0.getLineHeight();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "");
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      // Undeclared exception!
      try { 
        featureList0.selectionChanged((SelectionChangeEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.FeatureList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Clipboard clipboard0 = new Clipboard("l$8>yewLk/");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      // Undeclared exception!
      try { 
        featureList0.getViewport();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.FeatureList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Clipboard clipboard0 = new Clipboard("2gN{F Rw8*HVhcOm4");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = null;
      try {
        featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "B43=_X_F6");
      Clipboard clipboard0 = new Clipboard("B43=_X_F6");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      AWTKeyStroke aWTKeyStroke0 = AWTKeyStroke.getAWTKeyStroke((-2147483647), 256);
      SelectionChangeEvent selectionChangeEvent0 = new SelectionChangeEvent(aWTKeyStroke0, 0);
      featureList0.selectionChanged(selectionChangeEvent0);
      assertEquals(1, SelectionChangeEvent.SELECTION_CHANGED);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "B43=_X_F6");
      Clipboard clipboard0 = new Clipboard("B43=_X_F6");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      Entry entry0 = filteredEntryGroup0.createEntry();
      EntryChangeEvent entryChangeEvent0 = new EntryChangeEvent(entry0, (Feature) null, true, 7);
      featureList0.entryChanged(entryChangeEvent0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "");
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(filteredEntryGroup0, (Entry) null, 3022);
      featureList0.entryGroupChanged(entryGroupChangeEvent0);
      assertTrue(featureList0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Clipboard clipboard0 = new Clipboard("4PYv<'>R_n$!5>");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      StringVector stringVector0 = featureList0.getListStrings();
      assertEquals(0, stringVector0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource((EntryGroup) null);
      Clipboard clipboard0 = new Clipboard("^NM|");
      Selection selection0 = new Selection(clipboard0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      AminoAcidSequence aminoAcidSequence0 = AminoAcidSequence.getTranslation("^NM|", false);
      MarkerRange markerRange0 = aminoAcidSequence0.findMatch(bases0, (Marker) null, true, true, true);
      selection0.setMarkerRange(markerRange0);
      SelectionChangeEvent selectionChangeEvent0 = new SelectionChangeEvent(emblStreamSequence0, 2199);
      featureList0.selectionChanged(selectionChangeEvent0);
      assertEquals(1, SelectionChangeEvent.SELECTION_CHANGED);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "B43=_X_F6");
      Clipboard clipboard0 = new Clipboard("B43=_X_F6");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      SelectionChangeEvent selectionChangeEvent0 = new SelectionChangeEvent(featureList0, 4);
      featureList0.selectionChanged(selectionChangeEvent0);
      assertFalse(featureList0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "");
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.featureChanged((FeatureChangeEvent) null);
      assertFalse(featureList0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Clipboard clipboard0 = new Clipboard("4PYv<'>R_n$!5>");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowProducts(true);
      featureList0.setShowProducts(false);
      assertFalse(featureList0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowProducts(false);
      assertFalse(featureList0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Clipboard clipboard0 = new Clipboard("4PYv<'>R_n$!5>");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowQualifiers(true);
      featureList0.setShowQualifiers(false);
      assertFalse(featureList0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      Clipboard clipboard0 = new Clipboard("^NM|");
      Selection selection0 = new Selection(clipboard0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowQualifiers(false);
      assertFalse(featureList0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Clipboard clipboard0 = new Clipboard("4PYv<'>R_n$!5>");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      StringVector stringVector0 = featureList0.getShowUserDefinedQualifier();
      assertNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "B43=_X<F6");
      Clipboard clipboard0 = new Clipboard("B43=_X<F6");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowUserDefinedQualifier("");
      StringVector stringVector0 = featureList0.getShowUserDefinedQualifier();
      assertNotNull(stringVector0);
      assertEquals("[]", stringVector0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Clipboard clipboard0 = new Clipboard("4PYv<'>R_n$!5>");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowSystematicID(true);
      boolean boolean0 = featureList0.getShowSysID();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Clipboard clipboard0 = new Clipboard("4PYv<'>R_n$!5>");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowSystematicID(false);
      assertFalse(featureList0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "");
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowGenes(true);
      boolean boolean0 = featureList0.getShowGenes();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "H");
      Clipboard clipboard0 = new Clipboard("H");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setShowGenes(false);
      assertTrue(featureList0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      Clipboard clipboard0 = new Clipboard("^NM|");
      Selection selection0 = new Selection(clipboard0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setCorrelationScores(true);
      boolean boolean0 = featureList0.getCorrelationScores();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource((EntryGroup) null);
      Clipboard clipboard0 = new Clipboard("^NM|");
      Selection selection0 = new Selection(clipboard0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.setCorrelationScores(false);
      assertFalse(featureList0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("4PYv<'>R_n$!5>");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      Clipboard clipboard0 = new Clipboard("4PYv<'>R_n$!5>");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(simpleEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      boolean boolean0 = featureList0.getShowProducts();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "");
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      boolean boolean0 = featureList0.getShowSysID();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "");
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      boolean boolean0 = featureList0.getShowQualifiers();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "");
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      boolean boolean0 = featureList0.getCorrelationScores();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("p4J]R$C|F&5");
      Bases bases0 = new Bases(genbankStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      AminoAcidSequence aminoAcidSequence0 = AminoAcidSequence.getSpacedTranslation(bases0.letter_index, false);
      FeaturePatternPredicate featurePatternPredicate0 = new FeaturePatternPredicate(aminoAcidSequence0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featurePatternPredicate0, "p4J]R$C|F&5");
      Clipboard clipboard0 = new Clipboard("p4J]R$C|F&5");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      featureList0.stopListening();
      assertFalse(featureList0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence("");
      Bases bases0 = new Bases(emblStreamSequence0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup(bases0);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, (FeaturePredicate) null, "");
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      SimpleGotoEventSource simpleGotoEventSource0 = new SimpleGotoEventSource(simpleEntryGroup0);
      FeatureList featureList0 = new FeatureList(filteredEntryGroup0, selection0, simpleGotoEventSource0, (BasePlotGroup) null);
      BufferedImage bufferedImage0 = new BufferedImage(2, 5, 1);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      // Undeclared exception!
      try { 
        featureList0.paintComponent(graphics2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.FeatureList", e);
      }
  }
}
