import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class216 extends Linkable {

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "Li;")
    public JString field4048;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Lid;")
    public static class92 field4049;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Li;")
    private static JString field4055;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Li;")
    public static JString field4051;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "Li;")
    public static JString field4052;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "Li;")
    private static JString field4056;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "Li;")
    public static JString field4053;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "[[[B")
    public static byte[][][] field4054;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)Lac;")
    public static final class4 method1469(int arg0, byte arg1) {
        field4046++;
        if (arg1 > 0) {
            method1470(28);
        }
        class4 var2 = (class4) class158.field3040.method666((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class179.field3567.method941((byte) 56, arg0, 11);
        class4 var4 = new class4();
        if (var3 != null) {
            var4.method21(new Packet(var3), (byte) 24);
        }
        class158.field3040.put((long) arg0, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class216() {
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static void method1470(int arg0) {
        field4052 = null;
        field4055 = null;
        field4051 = null;
        Packet.crctable = null;
        field4056 = null;
        field4053 = null;
        field4054 = null;
        field4049 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Li;)V")
    public class216(JString arg0) {
        this.field4048 = arg0;
    }

    static {

        field4049 = new class92(64);
        field4055 = class208.method1425(105, "slide:");
        field4051 = field4055;
        field4052 = field4055;
        field4056 = class208.method1425(105, "Select");
        field4053 = field4056;
    }
}
