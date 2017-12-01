/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.io.filefilter;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class AndFileFilterTestCase extends ConditionalFileFilterAbstractTestCase {
  
  private static final String DEFAULT_WORKING_PATH = "./AndFileFilterTestCase/";
  private static final String WORKING_PATH_NAME_PROPERTY_KEY = AndFileFilterTestCase.class.getName() + ".workingDirectory";
  
  public static void main(final String[] args) {
    TestRunner.run(suite());
  }
  
  public static TestSuite suite() {
    return new TestSuite(AndFileFilterTestCase.class);
  }
  
  private List testFilters;
  private List testTrueResults;
  private List testFalseResults;
  private List testFileResults;
  private List testFilenameResults;
  
  public AndFileFilterTestCase(final String name) {
    super(name);
  }
  
  public void setUp() throws Exception {
    super.setUp();
    this.setUpTestFilters();
  }
  
  protected IOFileFilter buildFilterUsingAdd(final List filters) {
    AndFileFilter filter = new AndFileFilter();
    for(int i = 0; i < filters.size(); i++) {
      filter.addFileFilter((IOFileFilter) filters.get(i));
    }
    return filter;
  }
  
  protected IOFileFilter buildFilterUsingConstructor(final List filters) {
    return new AndFileFilter(filters);
  }
  
  protected ConditionalFileFilter getConditionalFileFilter() {
    return new AndFileFilter();
  }
  
  protected String getDefaultWorkingPath() {
    return DEFAULT_WORKING_PATH;
  }
  
  protected List getFalseResults() {
    return this.testFalseResults;
  }
  
  protected List getFileResults() {
    return this.testFileResults;
  }
  
  protected List getFilenameResults() {
    return this.testFilenameResults;
  }
  
  protected List getTestFilters() {
    return this.testFilters;
  }
  
  protected List getTrueResults() {
    return this.testTrueResults;
  }
  
  protected String getWorkingPathNamePropertyKey() {
    return WORKING_PATH_NAME_PROPERTY_KEY;
  }
  
  private void setUpTestFilters() {
    // filters
    //tests
    this.testFilters = new ArrayList();
    this.testTrueResults = new ArrayList();
    this.testFalseResults = new ArrayList();
    this.testFileResults = new ArrayList();
    this.testFilenameResults = new ArrayList();

    // test 0 - add empty elements
    {
      testFilters.add(0, null);
      testTrueResults.add(0, null);
      testFalseResults.add(0, null);
      testFileResults.add(0, null);
      testFilenameResults.add(0, null);
    }
      
    // test 1 - Test conditional and with all filters returning true
    {
      // test 1 filters
      List filters = new ArrayList();
      filters.add(trueFilters[1]);
      filters.add(trueFilters[2]);
      filters.add(trueFilters[3]);
      // test 1 true results
      boolean[] trueResults = new boolean[] {true, true, true};
      // test 1 false results
      boolean[] falseResults = new boolean[] {false, false, false};

      testFilters.add(1, filters);
      testTrueResults.add(1, trueResults);
      testFalseResults.add(1, falseResults);
      testFileResults.add(1, Boolean.TRUE);
      testFilenameResults.add(1, Boolean.TRUE);
    }

    // test 2 - Test conditional and with first filter returning false
    {
      // test 2 filters
      List filters = new ArrayList();
      filters.add(falseFilters[1]);
      filters.add(trueFilters[1]);
      filters.add(trueFilters[2]);
      filters.add(trueFilters[3]);
      filters.add(falseFilters[2]);
      filters.add(falseFilters[3]);
      // test 2 true results
      boolean[] trueResults = new boolean[] {false, false, false};
      // test 2 false results
      boolean[] falseResults = new boolean[] {true, false, false};

      testFilters.add(2, filters);
      testTrueResults.add(2, trueResults);
      testFalseResults.add(2, falseResults);
      testFileResults.add(2, Boolean.FALSE);
      testFilenameResults.add(2, Boolean.FALSE);
    }
    
    // test 3 - Test conditional and with second filter returning false
    {
      // test 3 filters
      List filters = new ArrayList();
      filters.add(trueFilters[1]);
      filters.add(falseFilters[1]);
      filters.add(trueFilters[2]);
      filters.add(trueFilters[3]);
      filters.add(falseFilters[2]);
      filters.add(falseFilters[3]);
      // test 3 true results
      boolean[] trueResults = new boolean[] {true, false, false};
      // test 3 false results
      boolean[] falseResults = new boolean[] {true, false, false};

      testFilters.add(3, filters);
      testTrueResults.add(3, trueResults);
      testFalseResults.add(3, falseResults);
      testFileResults.add(3, Boolean.FALSE);
      testFilenameResults.add(3, Boolean.FALSE);
    }
    
    // test 4 - Test conditional and with third filter returning false
    {
      // test 4 filters
      List filters = new ArrayList();
      filters.add(trueFilters[1]);
      filters.add(trueFilters[2]);
      filters.add(falseFilters[1]);
      filters.add(trueFilters[3]);
      filters.add(falseFilters[2]);
      filters.add(falseFilters[3]);
      // test 4 true results
      boolean[] trueResults = new boolean[] {true, true, false};
      // test 4 false results
      boolean[] falseResults = new boolean[] {true, false, false};
    
      testFilters.add(4, filters);
      testTrueResults.add(4, trueResults);
      testFalseResults.add(4, falseResults);
      testFileResults.add(4, Boolean.FALSE);
      testFilenameResults.add(4, Boolean.FALSE);
    }

    // test 5 - Test conditional and with first and third filters returning false
    {
      // test 5 filters
      List filters = new ArrayList();
      filters.add(falseFilters[1]);
      filters.add(trueFilters[1]);
      filters.add(falseFilters[2]);
      filters.add(falseFilters[3]);
      filters.add(trueFilters[2]);
      filters.add(trueFilters[3]);
      // test 5 true results
      boolean[] trueResults = new boolean[] {false, false, false};
      // test 5 false results
      boolean[] falseResults = new boolean[] {true, false, false};
    
      testFilters.add(5, filters);
      testTrueResults.add(5, trueResults);
      testFalseResults.add(5, falseResults);
      testFileResults.add(5, Boolean.FALSE);
      testFilenameResults.add(5, Boolean.FALSE);
    }
    
    // test 6 - Test conditional and with second and third filters returning false
    {
      List filters = new ArrayList();
      filters.add(trueFilters[1]);
      filters.add(falseFilters[1]);
      filters.add(falseFilters[2]);
      filters.add(trueFilters[2]);
      filters.add(trueFilters[3]);
      filters.add(falseFilters[3]);
      // test 6 true results
      boolean[] trueResults = new boolean[] {true, false, false};
      // test 6 false results
      boolean[] falseResults = new boolean[] {true, false, false};
    
      testFilters.add(6, filters);
      testTrueResults.add(6, trueResults);
      testFalseResults.add(6, falseResults);
      testFileResults.add(6, Boolean.FALSE);
      testFilenameResults.add(6, Boolean.FALSE);
    }
    
    // test 7 - Test conditional and with first and second filters returning false
    {
      List filters = new ArrayList();
      filters.add(falseFilters[1]);
      filters.add(falseFilters[2]);
      filters.add(trueFilters[3]);
      filters.add(falseFilters[3]);
      filters.add(trueFilters[2]);
      filters.add(trueFilters[3]);
      // test 7 true results
      boolean[] trueResults = new boolean[] {false, false, false};
      // test 7 false results
      boolean[] falseResults = new boolean[] {true, false, false};
    
      testFilters.add(7, filters);
      testTrueResults.add(7, trueResults);
      testFalseResults.add(7, falseResults);
      testFileResults.add(7, Boolean.FALSE);
      testFilenameResults.add(7, Boolean.FALSE);
    }
    
    // test 8 - Test conditional and with fourth filters returning false
    {
      List filters = new ArrayList();
      filters.add(trueFilters[1]);
      filters.add(trueFilters[2]);
      filters.add(trueFilters[3]);
      filters.add(falseFilters[1]);
      // test 8 true results
      boolean[] trueResults = new boolean[] {true, true, true};
      // test 8 false results
      boolean[] falseResults = new boolean[] {true, false, false};
    
      testFilters.add(8, filters);
      testTrueResults.add(8, trueResults);
      testFalseResults.add(8, falseResults);
      testFileResults.add(8, Boolean.FALSE);
      testFilenameResults.add(8, Boolean.FALSE);
    }

    // test 9 - Test conditional and with all filters returning false
    {
      List filters = new ArrayList();
      filters.add(falseFilters[1]);
      filters.add(falseFilters[2]);
      filters.add(falseFilters[3]);
      // test 9 true results
      boolean[] trueResults = new boolean[] {false, false, false};
      // test 9 false results
      boolean[] falseResults = new boolean[] {true, false, false};
    
      testFilters.add(9, filters);
      testTrueResults.add(9, trueResults);
      testFalseResults.add(9, falseResults);
      testFileResults.add(9, Boolean.FALSE);
      testFilenameResults.add(9, Boolean.FALSE);
    }
  }
}
