package interviews.chapter1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Q2Test {

    private Q2 q;

    @Before
    public void SetUp() {
        this.q = new Q2();
    }

    @Test
    public void Main() {
        Assert.assertTrue(q.isSameSort("ta", "at"));
        Assert.assertFalse(q.isSameSort("abc", "abn"));
        Assert.assertTrue(q.isSameSort("asd", "asd"));
        Assert.assertTrue(q.isSameSort("asdfgh", "hgfdsa"));
    }
}
