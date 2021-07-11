package interviews.chapter1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Q1Test {

    private Q1 q;

    @Before
    public void SetUp() {
        this.q = new Q1();
    }

    @Test
    public void Main() {
        Assert.assertFalse(q.isDuplicate("ta"));
        Assert.assertFalse(q.isDuplicate("asdfghjk"));
        Assert.assertTrue(q.isDuplicate("asdffgh"));
        Assert.assertFalse(q.isDuplicate("tvsg47569rhkyi"));
    }
}
