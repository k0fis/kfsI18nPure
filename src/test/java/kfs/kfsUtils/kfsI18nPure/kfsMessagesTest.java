package kfs.kfsUtils.kfsI18nPure;

import java.util.Locale;
import junit.framework.TestCase;

/**
 *
 * @author pavedrim
 */
public class kfsMessagesTest extends TestCase {

    public kfsMessagesTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of get method, of class kfsMesages.
     */
    public void testGet_Locale() {
        assertTrue(true);
    }

    private void printMessages(kfsMsg result) {
        System.out.println(result.msg("admin"));
        System.out.println(result.msg("evaluator"));
        System.out.println(result.msg("viewer"));
    }

    /**
     * Test of get method, of class kfsMesages.
     */
    public void testGet_0args() {
        System.out.println("get");
        kfsMsg result = kfsMsgFactory.get();
        assertNotNull("Cannot get messages", result);
        printMessages(result);
    }

    public void testGet_csCZ() {
        System.out.println("getCZ");
        kfsMsg result = kfsMsgFactory.get(new Locale("cs", "CZ"));
        assertNotNull("Cannot get messages", result);
        printMessages(result);
    }

    public void testGet_DE() {
        System.out.println("getDE");
        kfsMsg result = kfsMsgFactory.get(Locale.GERMAN);
        assertNotNull("Cannot get messages", result);
        printMessages(result);
    }
}
