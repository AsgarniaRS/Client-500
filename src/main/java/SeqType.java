import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class SeqType extends class136 {

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Z")
    public boolean stretches = false;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public int loops = -1;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public int replaceheldright = -1;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
    public int postanim_move = -1;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "I")
    public int duplicatebehavior = 2;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public int maxloops = 99;

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
    public int prenaim_move = -1;

    @OriginalMember(owner = "client!k", name = "tb", descriptor = "I")
    public int replaceheldleft = -1;

    @OriginalMember(owner = "client!k", name = "sb", descriptor = "I")
    public int priority = 5;

    @OriginalMember(owner = "client!k", name = "mb", descriptor = "Z")
    private boolean field1995 = false;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "[S")
    public static short[] field1970 = new short[256];

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Li;")
    private static JString field1963 = class208.method1425(105, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!k", name = "S", descriptor = "Li;")
    public static JString field1975 = class208.method1425(105, " x ");

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "Li;")
    private static JString field1989 = class208.method1425(105, "Please remove ");

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "Li;")
    public static JString field1984 = class208.method1425(105, "; Expires=");

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "Li;")
    public static JString field1973 = field1989;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "Li;")
    public static JString field1980 = field1989;

    @OriginalMember(owner = "client!k", name = "rb", descriptor = "Li;")
    public static JString field2000 = field1963;

    @OriginalMember(owner = "client!k", name = "nb", descriptor = "Li;")
    public static JString field1996 = class208.method1425(105, "settings");

    @OriginalMember(owner = "client!k", name = "D", descriptor = "Li;")
    public static JString field1961 = class208.method1425(105, ":");

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!k", name = "kb", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!k", name = "lb", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!k", name = "ob", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!k", name = "pb", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!k", name = "qb", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!k", name = "vb", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!k", name = "xb", descriptor = "Lbj;")
    public static Js5Local field2006;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "[I")
    public int[] frames;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "[I")
    private int[] walkmerge;

    @OriginalMember(owner = "client!k", name = "jb", descriptor = "[I")
    public int[] delay;

    @OriginalMember(owner = "client!k", name = "wb", descriptor = "[I")
    private int[] iframes;

    @OriginalMember(owner = "client!k", name = "ub", descriptor = "[[I")
    public int[][] sound;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "[[[B")
    public static byte[][][] field1964;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILcg;I)Lcg;")
    public final class30 method743(int arg0, class30 arg1, int arg2) {
        int var4 = this.frames[arg2];
        class129 var5 = class130.method880(var4 >> 16, -15667);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method185(true, true);
        } else {
            class30 var7 = arg1.method185(!var5.method877(true, var6), !this.field1995);
            var7.method187(var5, var6, this.field1995);
            return arg0 == 8517 ? var7 : null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIZII)I")
    public static final int method744(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        field1993++;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg0;
        }
        if (arg4) {
            field1970 = null;
        }
        if (var7 == 1) {
            return 7 + 1 - arg1 - arg5;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILq;B)V")
    public static final void method745(int arg0, int arg1, int arg2, class174 arg3, byte arg4) {
        if (arg4 != -91) {
            method747(-47, -61, 125, -122, 38);
        }
        if (class247.field4514 < 3) {
            ((class169) EnumType.field887).method1165(arg1, arg2, arg3.field3382, arg3.field3424, EnumType.field887.field3656 / 2, EnumType.field887.field3654 / 2, class207.field3932, 256, arg3.field3404, arg3.field3423);
        } else {
            class72.method491(arg1, arg2, 0, arg3.field3404, arg3.field3423);
        }
        field1997++;
        class211.field4007[arg0] = true;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lea;II)V")
    private void decode(Packet buf, int code) {
        if (code == 1) {
            int var5 = buf.g2();
            this.delay = new int[var5];
            for (int i = 0; i < var5; i++) {
                this.delay[i] = buf.g2();
            }
            this.frames = new int[var5];
            for (int i = 0; i < var5; i++) {
                this.frames[i] = buf.g2();
            }
            for (int i = 0; i < var5; i++) {
                this.frames[i] = (buf.g2() << 16) + this.frames[i];
            }
        } else if (code == 2) {
            this.loops = buf.g2();
        } else if (code == 3) {
            int var9 = buf.g1();
            this.walkmerge = new int[var9 + 1];
            for (int i = 0; i < var9; i++) {
                this.walkmerge[i] = buf.g1();
            }
            this.walkmerge[var9] = 9999999;
        } else if (code == 4) {
            this.stretches = true;
        } else if (code == 5) {
            this.priority = buf.g1();
        } else if (code == 6) {
            this.replaceheldleft = buf.g2();
        } else if (code == 7) {
            this.replaceheldright = buf.g2();
        } else if (code == 8) {
            this.maxloops = buf.g1();
        } else if (code == 9) {
            this.prenaim_move = buf.g1();
        } else if (code == 10) {
            this.postanim_move = buf.g1();
        } else if (code == 11) {
            this.duplicatebehavior = buf.g1();
        } else if (code == 12) {
            int var15 = buf.g1();
            this.iframes = new int[var15];
            for (int i = 0; i < var15; i++) {
                this.iframes[i] = buf.g2();
            }
            for (int i = 0; i < var15; i++) {
                this.iframes[i] = (buf.g2() << 16) + this.iframes[i];
            }
        } else if (code == 13) {
            int var11 = buf.g2();
            this.sound = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = buf.g1();
                if (var13 > 0) {
                    this.sound[var12] = new int[var13];
                    this.sound[var12][0] = buf.g3();
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.sound[var12][var14] = buf.g2();
                    }
                }
            }
        } else if (code == 14) {
            this.field1995 = true;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIII)V")
    public static final void method747(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class230.method1536(arg4 - arg3, arg2, -7, arg3 + arg4, class3.field42[arg1]);
        int var6 = 0;
        int var7 = arg3;
        int var8 = -1;
        int var9 = -arg3;
        while (var6 < var7) {
            var8 += 2;
            var9 += var8;
            var6++;
            if (var9 >= 0) {
                var7--;
                var9 -= var7 << 1;
                int[] var10 = class3.field42[arg1 + var7];
                int[] var11 = class3.field42[arg1 - var7];
                int var12 = arg4 + var6;
                int var13 = arg4 - var6;
                class230.method1536(var13, arg2, -7, var12, var10);
                class230.method1536(var13, arg2, -7, var12, var11);
            }
            int var14 = arg4 + var7;
            int var15 = arg4 - var7;
            int[] var16 = class3.field42[arg1 + var6];
            int[] var17 = class3.field42[arg1 - var6];
            class230.method1536(var15, arg2, -7, var14, var16);
            class230.method1536(var15, arg2, -7, var14, var17);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Z")
    public static final boolean method748(int arg0, int arg1) {
        if (arg0 == 1) {
            field1969++;
            return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BII)I")
    public static final int method749(byte arg0, int arg1, int arg2) {
        field2004++;
        class177 var3 = (class177) class64.field1163.get(arg0 ^ 0x24, (long) arg1);
        if (var3 == null) {
            return 0;
        } else {
            if (arg0 != -37) {
                field1970 = null;
            }
            return arg2 >= 0 && var3.field3553.length > arg2 ? var3.field3553[arg2] : 0;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method750(Component arg0, int arg1) {
        arg0.addMouseListener(class43.field732);
        field1979++;
        arg0.addMouseMotionListener(class43.field732);
        arg0.addFocusListener(class43.field732);
        if (arg1 != 2) {
            field1990 = -112;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLcg;I)Lcg;")
    public final class30 method751(int arg0, boolean arg1, class30 arg2, int arg3) {
        int var5 = this.frames[arg3];
        class129 var6 = class130.method880(var5 >> 16, -15667);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method184(true, true);
        }
        int var8 = arg0 & 0x3;
        class30 var9 = arg2.method184(!var6.method877(arg1, var7), !this.field1995);
        if (var8 == 1) {
            var9.method181();
        } else if (var8 == 2) {
            var9.method190();
        } else if (var8 == 3) {
            var9.method182();
        }
        var9.method187(var6, var7, this.field1995);
        if (var8 == 1) {
            var9.method182();
        } else if (var8 == 2) {
            var9.method190();
        } else if (var8 == 3) {
            var9.method181();
        }
        return var9;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILcg;)Lcg;")
    public final class30 method752(int arg0, int arg1, class30 arg2) {
        int var4 = this.frames[arg1];
        class129 var5 = class130.method880(var4 >> 16, -15667);
        int var6 = var4 & arg0;
        if (var5 == null) {
            return arg2.method184(true, true);
        } else {
            class30 var7 = arg2.method184(!var5.method877(true, var6), !this.field1995);
            var7.method187(var5, var6, this.field1995);
            return var7;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lea;Z)V")
    public final void decode(Packet buf) {
        while (true) {
            int code = buf.g1();
            if (code == 0) {
                return;
            }
            this.decode(buf, code);
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
    public static void method754(int arg0) {
        field1984 = null;
        if (arg0 != 1) {
            field1989 = null;
        }
        field1989 = null;
        field1973 = null;
        field1961 = null;
        field1963 = null;
        field1964 = null;
        field1975 = null;
        field1980 = null;
        field2000 = null;
        field1996 = null;
        field2006 = null;
        field1970 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(IIIII)V")
    public static final void method755(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1998++;
        if (arg1 > arg4) {
            for (int var5 = arg4; var5 < arg1; var5++) {
                class3.field42[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg1; var6 < arg4; var6++) {
                class3.field42[var6][arg3] = arg0;
            }
        }
        int var7 = -16 % ((-arg2 - 41) / 40);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILk;IBLcg;)Lcg;")
    public final class30 method756(int arg0, SeqType arg1, int arg2, byte arg3, class30 arg4) {
        field1966++;
        int var6 = this.frames[arg0];
        class129 var7 = class130.method880(var6 >> 16, -15667);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method752(65535, arg2, arg4);
        }
        int var9 = arg1.frames[arg2];
        class129 var10 = class130.method880(var9 >> 16, arg3 ^ 0xFFFFC29F);
        int var11 = var9 & 0xFFFF;
        if (arg3 != 82) {
            return null;
        } else if (var10 == null) {
            class30 var12 = arg4.method184(!var7.method877(true, var8), !this.field1995);
            var12.method187(var7, var8, this.field1995);
            return var12;
        } else {
            class30 var13 = arg4.method184(!var7.method877(true, var8) & !var10.method877(true, var11), !arg1.field1995 & !this.field1995);
            var13.method189(var7, var8, var10, var11, this.walkmerge, arg1.field1995 | this.field1995);
            return var13;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V")
    public static final void method757(int arg0, int arg1, int arg2) {
        class226 var3 = class153.method1045(15913, arg0);
        field1999++;
        int var4 = var3.field4235;
        if (arg2 < 0) {
            method745(105, 45, -63, null, (byte) -76);
        }
        int var5 = var3.field4236;
        int var6 = var3.field4239;
        int var7 = class101.field1834[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class113.field2052[var4] = class204.method1405(class70.method470(~var8, class113.field2052[var4]), class70.method470(var8, arg1 << var5));
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lu;B)V")
    public static final void method758(class218 arg0, byte arg1) {
        if (arg1 != 12) {
            field2006 = null;
        }
        field1978++;
        int var2 = arg0.field4135 - class117.field2115;
        if (arg0.field4141 == 0) {
            arg0.field4121 = 1024;
        }
        arg0.field4110 = 0;
        if (arg0.field4141 == 1) {
            arg0.field4121 = 1536;
        }
        if (arg0.field4141 == 2) {
            arg0.field4121 = 0;
        }
        if (arg0.field4141 == 3) {
            arg0.field4121 = 512;
        }
        int var3 = arg0.field4096 * 128 + arg0.field4105 * 64;
        arg0.field4123 += (var3 - arg0.field4123) / var2;
        int var4 = arg0.field4115 * 128 + arg0.field4105 * 64;
        arg0.field4138 += (var4 - arg0.field4138) / var2;
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V")
    public final void method759(byte arg0) {
        int var2 = -64 % ((-arg0 - 58) / 42);
        if (this.prenaim_move == -1) {
            if (this.walkmerge == null) {
                this.prenaim_move = 0;
            } else {
                this.prenaim_move = 2;
            }
        }
        if (this.postanim_move == -1) {
            if (this.walkmerge == null) {
                this.postanim_move = 0;
            } else {
                this.postanim_move = 2;
            }
        }
        field1991++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILcg;B)Lcg;")
    public final class30 method760(int arg0, class30 arg1, byte arg2) {
        field1994++;
        int var4 = this.frames[arg0];
        class129 var5 = class130.method880(var4 >> 16, -15667);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method184(true, true);
        }
        if (arg2 != -83) {
            method758(null, (byte) 19);
        }
        class129 var7 = null;
        int var8 = 0;
        if (this.iframes != null && this.iframes.length > arg0) {
            int var9 = this.iframes[arg0];
            var7 = class130.method880(var9 >> 16, -15667);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class30 var11 = arg1.method184(!var5.method877(true, var6), !this.field1995);
            var11.method187(var5, var6, this.field1995);
            return var11;
        } else {
            class30 var10 = arg1.method184(!var5.method877(true, var6) & !var7.method877(true, var8), !this.field1995);
            var10.method187(var5, var6, this.field1995);
            var10.method187(var7, var8, this.field1995);
            return var10;
        }
    }
}
