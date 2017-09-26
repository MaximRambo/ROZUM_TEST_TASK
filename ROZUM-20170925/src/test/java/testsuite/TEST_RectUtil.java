package testsuite;

import com.epam.test.RectUtil;
import org.junit.Assert;
import org.junit.Test;

public class TEST_RectUtil extends Config{

    @Test(expected = IllegalArgumentException.class)
    public void testRectUtil_WidthOrHeightBelowZero () {
    boolean isOverlapped;

    isOverlapped = RectUtil.isOverlapped(rect1Default, rect2WithHeightLessThanZero);
    }

    @Test
    public void testRectUtil_Disjoint1_Rect1AboveRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default,rect2Disjoint1);
        Assert.assertFalse(isOverlapped);
    }

    @Test
    public void testRectUtil_Disjoint2_Rect1ToTheLeftRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default, rect2Disjoint2);
        Assert.assertFalse(isOverlapped);
    }

    @Test
    public void testRectUtil_Disjoint3_Rect1AboveAndToTheLeftRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default, rect2Disjoint3);
        Assert.assertFalse(isOverlapped);
    }

    @Test
    public void testRectUtil_Touch1_Rect1AboveRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default, rect2Touch1);
        Assert.assertTrue(isOverlapped);
    }

    @Test
    public void testRectUtil_Touch2_Rect1ToTheLeftRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default, rect2Touch2);
        Assert.assertTrue(isOverlapped);
    }

    @Test
    public void testRectUtil_Touch3_Rect1AboveAndToTheLeftRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default, rect2Touch3);
        Assert.assertTrue(isOverlapped);
    }

    @Test
    public void testRectUtil_Overlap1_Rect1IncludePartOfRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default, rect2Overlap1);
        Assert.assertTrue(isOverlapped);
    }

    @Test
    public void testRectUtil_Overlap2_Rect1IncludePartOfRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default, rect2Overlap2);
        Assert.assertTrue(isOverlapped);
    }

    @Test
    public void testRectUtil_Overlap3_Rect1IncludePartOfRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default, rect2Overlap3);
        Assert.assertTrue(isOverlapped);
    }

    @Test
    public void testRectUtil_Overlap4_Rect1FullyIncludeRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default, rect2Overlap4);
        Assert.assertTrue(isOverlapped);
    }

    @Test
    public void testRectUtil_Overlap5_Rect1FullyIncludeRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default, rect2Overlap5);
        Assert.assertTrue(isOverlapped);
    }

    @Test
    public void testRectUtil_Overlap6_Rect1FullyIncludedInRect2 () {
        boolean isOverlapped;

        isOverlapped = RectUtil.isOverlapped(rect1Default, rect2Overlap6);
        Assert.assertTrue(isOverlapped);
    }
}
