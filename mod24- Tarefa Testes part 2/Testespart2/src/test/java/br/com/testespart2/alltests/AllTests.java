package br.com.testespart2.alltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.testespart2.modelstest.ClienteTest;
import br.com.testespart2.servicestest.ClienteServiceTest;
import br.com.testespart2.servicestest.ContratoServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ContratoServiceTest.class, ClienteTest.class })
public class AllTests {

}
