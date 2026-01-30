import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class Linkable {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1207 = 0;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1211 = 1;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1208 = 0;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Li;")
    public static JString field1216 = class208.method1425("Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Z")
    public static boolean field1215 = false;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1206 = 0;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Li;")
    public static JString field1214 = class208.method1425("<)4col>");

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field1221 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "J")
    public long nodeId;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lbj;")
    public static Js5Local field1204;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lg;")
    public Linkable prev;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Lg;")
    public Linkable next;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[I")
    public static int[] field1218;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[S")
    public static short[] field1210;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method457(boolean arg0, Object arg1, int arg2) {
        if (arg2 != 0) {
            field1214 = null;
        }
        field1217++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class179.method1278(var3, true) : var3;
        } else if (arg1 instanceof class1) {
            class1 var4 = (class1) arg1;
            return var4.method1((byte) 118);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lke;")
    public static final class114 method458(int arg0, int arg1) {
        int var2 = 86 / (arg1 / 42);
        class114 var3 = (class114) class17.field251.method666((long) arg0, 0);
        field1213++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = Client.field567.method941((byte) 56, arg0, 5);
        class114 var5 = new class114();
        if (var4 != null) {
            var5.method777(new Packet(var4), (byte) 83);
        }
        class17.field251.put((long) arg0, var5, false);
        return var5;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
    public final boolean isLinked() {
        return this.prev != null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public final void unlink() {
        if (this.prev == null) {
            return;
        }
        this.prev.next = this.next;
        this.next.prev = this.prev;
        this.next = null;
        this.prev = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method461() {
        field1210 = null;
        field1218 = null;
        field1216 = null;
        field1214 = null;
        field1204 = null;
    }
}
