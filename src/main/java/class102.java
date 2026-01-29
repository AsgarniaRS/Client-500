import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class102 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Li;")
    public static JString field1846 = class208.method1425(105, "");

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Li;")
    public static JString field1850 = class208.method1425(105, "(U4");

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Li;")
    private static JString field1854 = class208.method1425(105, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Li;")
    public static JString field1848 = field1854;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
    public static int[] field1853;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method708(int arg0) {
        if (arg0 != -5482) {
            field1854 = null;
        }
        field1846 = null;
        field1854 = null;
        field1848 = null;
        field1853 = null;
        field1850 = null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)Z")
    public static final boolean method709(int arg0) {
        if (arg0 != 100) {
            field1846 = null;
        }
        field1847++;
        return class122.field2232 == 0 ? class31.field503.method1201(22643) : true;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)I")
    public static final int method710(int arg0) {
        field1849++;
        if (class150.field2917 == 3.0D) {
            return 37;
        } else if (class150.field2917 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 0) {
                field1846 = null;
            }
            return class150.field2917 == 6.0D ? 75 : 100;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[B")
    public static synchronized byte[] alloc(int size) {
         if (size == 100 && class17.cacheMinCount > 0) {
            byte[] data = class220.cacheMin[--class17.cacheMinCount];
            class220.cacheMin[class17.cacheMinCount] = null;
            return data;
        } else if (size == 5000 && class142.cacheMidCount > 0) {
            byte[] data = class138.cacheMid[--class142.cacheMidCount];
            class138.cacheMid[class142.cacheMidCount] = null;
            return data;
        } else if (size == 30000 && class157.cacheMaxCount > 0) {
            byte[] data = class126.cacheMax[--class157.cacheMaxCount];
            class126.cacheMax[class157.cacheMaxCount] = null;
            return data;
        } else {
            return new byte[size];
        }
    }
}
