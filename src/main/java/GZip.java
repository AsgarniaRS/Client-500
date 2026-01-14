import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class GZip {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Li;")
    public static class88 field1106 = class208.method1425(105, "compass");

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Li;")
    private static class88 field1108 = class208.method1425(105, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "[Z")
    public static boolean[] field1120 = new boolean[200];

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Li;")
    public static class88 field1117 = field1108;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Li;")
    public static class88 field1119 = class208.method1425(105, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Li;")
    public static class88 field1118 = class208.method1425(105, "zap");

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Li;")
    public static class88 field1113 = class208.method1425(105, "");

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "D")
    public static double field1110;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Lnb;")
    public static Js5Index field1114;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1112;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public GZip() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
    public static final boolean method423(int arg0, int arg1) {
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lea;Z[B)V")
    public final void decompress(Packet arg0, boolean arg1, byte[] arg2) {
        field1109++;
        if (arg0.data[arg0.pos] != 31 || arg0.data[arg0.pos + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1112 == null) {
            this.field1112 = new Inflater(true);
        }
        try {
            this.field1112.setInput(arg0.data, arg0.pos + 10, arg0.data.length - arg0.pos - 18);
            this.field1112.inflate(arg2);
        } catch (Exception var4) {
            this.field1112.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1) {
            method423(3, 37);
        }
        this.field1112.reset();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method425(byte arg0) {
        field1106 = null;
        field1120 = null;
        field1117 = null;
        field1118 = null;
        field1113 = null;
        field1119 = null;
        if (arg0 > -111) {
            method427(38, 61);
        }
        field1108 = null;
        field1114 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
    public static final void method426(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg0 << 16) + arg2);
        field1115++;
        class97 var5 = (class97) class205.pendingPrefetchQueue.get(-1, var3);
        if (var5 != null) {
            class138.field2561.method1390(var5, (byte) 43);
            if (arg1 < 114) {
                field1113 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lwh;")
    public static final class247 method427(int arg0, int arg1) {
        field1107++;
        class247 var2 = (class247) class33.cache.method666((long) arg0, arg1);
        if (var2 != null) {
            return var2;
        }

        byte[] var3 = class18.field300.method941((byte) 56, 0, arg0);
        if (var3 == null) {
            return null;
        }

        class247 script = new class247();

        Packet buf = new Packet(var3);
        buf.pos = buf.data.length - 2;

        int var6 = buf.g2();
        int var7 = buf.data.length - var6 - 2 - 12;
        buf.pos = var7;
        int var8 = buf.g4();
        script.field4528 = buf.g2();
        script.field4519 = buf.g2();
        script.field4522 = buf.g2();
        script.field4520 = buf.g2();
        int var9 = buf.g1();
        if (var9 > 0) {
            script.field4516 = new class154[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = buf.g2();
                class154 var12 = new class154(class184.method1298(true, var11));
                script.field4516[var10] = var12;
                while (var11-- > 0) {
                    int var13 = buf.g4();
                    int var14 = buf.g4();
                    var12.put((long) var13, new class192(var14), ~arg1);
                }
            }
        }
        int var15 = 0;

        buf.pos = 0;
        script.name = buf.fastgstr(arg1 ^ 0x39);

        script.stringOperands = new class88[var8];
        script.instructions = new int[var8];
        script.intOperands = new int[var8];

        while (var7 > buf.pos) {
            int op = buf.g2();
            if (op == 3) {
                script.stringOperands[var15] = buf.gjstr(-128);
            } else if (op >= 100 || op == 21 || op == 38 || op == 39) {
                script.intOperands[var15] = buf.g1();
            } else {
                script.intOperands[var15] = buf.g4();
            }
            script.instructions[var15++] = op;
        }
        class33.cache.put((long) arg0, script, false);
        return script;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(III)V")
    private GZip(int arg0, int arg1, int arg2) {
    }
}
