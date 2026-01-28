import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class EnumType extends class136 {

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "Li;")
    private class88 defaultString = class93.field1750;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "Lca;")
    public static class24 field879 = new class24(30);

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field884 = 0;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "Li;")
    public static class88 field881 = class208.method1425(105, "sl_arrows");

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "Li;")
    public static class88 field891 = class208.method1425(105, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public int inputtype;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    private int defaultInt;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public int outputtype;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "Lob;")
    private class154 field871;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "Lrc;")
    public static class188 field887;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLea;)V")
    public final void decode(Packet buf) {
        while (true) {
            int code = buf.g1();
            if (code == 0) {
                return;
            }

            this.decode(buf, code);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBLea;)V")
    private void decode(Packet buf, int code) {
        if (code == 1) {
            this.inputtype = buf.g1();
        } else if (code == 2) {
            this.outputtype = buf.g1();
        } else if (code == 3) {
            this.defaultString = buf.gjstr();
        } else if (code == 4) {
            this.defaultInt = buf.g4();
        } else if (code == 5 || code == 6) {
            int var4 = buf.g2();
            this.field871 = new class154(class184.method1298(true, var4));
            for (int i = 0; i < var4; i++) {
                int var6 = buf.g4();
                Linkable var7;
                if (code == 5) {
                    var7 = new class216(buf.gjstr());
                } else {
                    var7 = new class192(buf.g4());
                }
                this.field871.put((long) var6, var7, -1);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I")
    public final int method356(int arg0, int arg1) {
        if (this.field871 == null) {
            return this.defaultInt;
        } else {
            class192 var3 = (class192) this.field871.get(-1, (long) arg1);
            return var3 == null ? this.defaultInt : var3.field3700;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILnb;Lnb;)V")
    public static final void method357(int arg0, Js5Index arg1, Js5Index arg2) {
        class209.field3970 = arg1;
        class170.field3264 = arg2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILnb;II)Z")
    public static final boolean method358(int arg0, Js5Index arg1, int arg2, int arg3) {
        if (arg0 != 854010832) {
            method359(-5, 0, 41, 16, 98, 4, -115, -87);
        }
        field880++;
        byte[] var4 = arg1.method941((byte) 56, arg3, arg2);
        if (var4 == null) {
            return false;
        } else {
            class244.method1603(64, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field872++;
        int var8 = 2048 - arg3 & 0x7FF;
        if (arg0 > -81) {
            field891 = null;
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = arg5;
        int var12 = 2048 - arg4 & 0x7FF;
        if (var12 != 0) {
            int var13 = class173.field3361[var12];
            int var14 = class173.field3356[var12];
            var10 = -arg5 * var13 >> 16;
            var11 = arg5 * var14 >> 16;
        }
        if (var8 != 0) {
            int var15 = class173.field3361[var8];
            int var16 = class173.field3356[var8];
            var9 = var11 * var15 >> 16;
            var11 = var11 * var16 >> 16;
        }
        class108.field1956 = arg2 - var10;
        class79.field1428 = arg1 - var9;
        class184.field3610 = arg7 - var11;
        class170.field3259 = arg3;
        class207.field3936 = arg4;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Li;")
    public final class88 method360(int arg0, byte arg1) {
        if (this.field871 == null) {
            return this.defaultString;
        }

        class216 var3 = (class216) this.field871.get(-1, (long) arg0);
        return var3 == null ? this.defaultString : var3.field4048;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
    public static void method361(byte arg0) {
        field891 = null;
        field887 = null;
        field879 = null;
        field881 = null;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    public static final void method362(int arg0) {
        if (class43.field732 != null) {
            class17 var1 = class43.field732;
            synchronized (class43.field732) {
                class43.field732 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public static final void method363(int arg0) {
        field870++;
        if (!class10.field145 || arg0 > -79) {
            return;
        }
        class174 var1 = class36.method238(Client.field569, class16.field249, true);
        if (var1 != null && var1.field3442 != null) {
            class39 var2 = new class39();
            var2.field678 = var1;
            var2.field681 = var1.field3442;
            class200.method1375(var2, -876775538);
        }
        class10.field145 = false;
        class200.method1373(65280, var1);
    }
}
