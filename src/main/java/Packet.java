import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class Packet extends Linkable {

    @OriginalMember(owner = "client!ea", name = "ib", descriptor = "[B")
    public byte[] data;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public int pos;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "[I")
    public static int[] crctable = new int[256];

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            crctable[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I)V")
    public Packet(int arg0) {
        this.data = class102.alloc(arg0);
        this.pos = 0;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V")
    public Packet(byte[] arg0) {
        this.pos = 0;
        this.data = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "(II)V")
    public final void p1(int val) {
        this.data[this.pos++] = (byte) val;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(II)V")
    public final void p2(int val) {
        this.data[this.pos++] = (byte) (val >> 8);
        this.data[this.pos++] = (byte) val;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IB)V")
    public final void p3(int val) {
        this.data[this.pos++] = (byte) (val >> 16);
        this.data[this.pos++] = (byte) (val >> 8);
        this.data[this.pos++] = (byte) val;
    }

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "(II)V")
    public final void p4(int val) {
        this.data[this.pos++] = (byte) (val >> 24);
        this.data[this.pos++] = (byte) (val >> 16);
        this.data[this.pos++] = (byte) (val >> 8);
        this.data[this.pos++] = (byte) val;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(JB)V")
    public final void p8(long val) {
        this.data[this.pos++] = (byte) (val >> 56);
        this.data[this.pos++] = (byte) (val >> 48);
        this.data[this.pos++] = (byte) (val >> 40);
        this.data[this.pos++] = (byte) (val >> 32);
        this.data[this.pos++] = (byte) (val >> 24);
        this.data[this.pos++] = (byte) (val >> 16);
        this.data[this.pos++] = (byte) (val >> 8);
        this.data[this.pos++] = (byte) val;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI[BI)V")
    public final void pdata(byte[] arg0, int arg2, int arg1) {
        for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
            this.data[this.pos++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
    public final void psize4(int len) {
        this.data[this.pos - len - 4] = (byte) (len >> 24);
        this.data[this.pos - len - 3] = (byte) (len >> 16);
        this.data[this.pos - len - 2] = (byte) (len >> 8);
        this.data[this.pos - len - 1] = (byte) len;
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)I")
    public final int g3() {
        this.pos += 3;
        return ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos + -1] & 0xFF);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)I")
    public final int g1_alt2() {
        return -this.data[this.pos++] & 0xFF;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BJ)V")
    public final void method296(byte arg0, long arg1) {
        this.p4_alt3((int) (arg1 >> 32));
        this.p4_alt3((int) arg1);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
    public final void method297(int arg0, int arg1) {
        this.data[this.pos++] = (byte) (arg1 - arg0);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Li;")
    public final class88 gjstr() {
        int var2 = this.pos;
        while (this.data[this.pos++] != 0) {
        }
        return class54.method395(var2, (byte) -105, this.data, this.pos - var2 - 1);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)I")
    public final int g4_alt1() {
        this.pos += 4;
        return (this.data[this.pos - 4] & 0xFF) + (((this.data[this.pos - 1] & 0xFF) << 24) + ((this.data[this.pos - 3] & 0xFF) << 8) + ((this.data[this.pos + -2] & 0xFF) << 16));
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)J")
    public final long method300(int arg0, int arg1) {
        int var7 = arg0 - 1;
        if (var7 < 0 || var7 > 7) {
            throw new IllegalArgumentException();
        }
        int var4 = var7 * 8;
        long var5 = 0L;
        while (var4 >= 0) {
            var5 |= ((long) this.data[this.pos++] & 0xFFL) << var4;
            var4 -= 8;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)I")
    public final int g2() {
        this.pos += 2;
        return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)I")
    public final int g2_alt3(int arg0) {
        this.pos += 2;
        return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)B")
    public final byte g1b_alt1() {
        return (byte) (this.data[this.pos++] - 128);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIJ)V")
    public final void method306(int arg0, int arg1, long arg2) {
        int var6 = arg0 - 1;
        if (var6 < 0 || var6 > 7) {
            throw new IllegalArgumentException();
        }
        for (int var5 = var6 * 8; var5 >= 0; var5 -= 8) {
            this.data[this.pos++] = (byte) (arg2 >> var5);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI[BI)V")
    public final void method307(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (!arg0) {
            for (int var5 = arg3; var5 < arg3 + arg1; var5++) {
                arg2[var5] = this.data[this.pos++];
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
    public final void method308(boolean arg0, int arg1) {
        if (arg1 >= 0 && arg1 < 128) {
            this.p1(arg1);
        } else if (arg1 >= 0 && arg1 < 32768) {
            this.p2(arg1 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lnb;ILnb;ZB)Lli;")
    public static final class129 method309(Js5Index arg0, int arg1, Js5Index arg2, boolean arg3, byte arg4) {
        boolean var5 = true;
        int[] var6 = arg2.method950(41, arg1);
        if (arg4 >= -54) {
            method318(85, -41, 86, 89, 124);
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method949(var6[var7], -6, arg1);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg0.method949(var9, -6, 0);
                } else {
                    var10 = arg0.method949(0, -6, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class129(arg2, arg0, arg1, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBI)V")
    public static final void method310(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg2 <= arg1) {
            class230.method1536(arg2, arg4, -7, arg1, class3.field42[arg0]);
        } else {
            class230.method1536(arg1, arg4, arg3 ^ 0xFFFFFFAD, arg2, class3.field42[arg0]);
        }
        field834++;
        if (arg3 != 84) {
            method310(43, -67, 1, (byte) 114, 12);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public final void rsaenc(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.pos;
        byte[] var5 = new byte[var4];
        this.pos = arg2;
        this.method307(false, var4, var5, 0);

        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();

        this.pos = 0;
        this.p1(var8.length);
        this.pdata(var8, var8.length, 0);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)I")
    public final int method312(byte arg0) {
        this.pos += 2;
        int var2 = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)I")
    public final int g4_alt3() {
        this.pos += 4;
        return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF) + ((this.data[this.pos + -3] & 0xFF) << 24) + ((this.data[this.pos + -4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
    public final void method314(int arg0, byte arg1) {
        this.data[this.pos++] = (byte) arg0;
        this.data[this.pos++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([BIII)V")
    public final void method315(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int var6 = arg1 + arg2 - 1; var6 >= arg1; var6--) {
            arg0[var6] = this.data[this.pos++];
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(II)V")
    public final void p4_alt3(int arg0) {
        this.data[this.pos++] = (byte) (arg0 >> 16);
        this.data[this.pos++] = (byte) (arg0 >> 24);
        this.data[this.pos++] = (byte) arg0;
        this.data[this.pos++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)I")
    public final int method317(byte arg0) {
        byte var2 = this.data[this.pos++];
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var3 | var2 & 0x7F) << 7;
            var2 = this.data[this.pos++];
        }
        return var3 | var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
    public static final void method318(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = class156.method1060(Linkable.field1207, class12.field183, -107, arg2 + arg3);
        int var9 = -1;
        int var10 = class156.method1060(Linkable.field1207, class12.field183, -125, arg2 - arg3);
        class230.method1536(var10, arg1, -7, var8, class3.field42[arg4]);
        while (var6 > var5) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (class49.field919 <= var12 && var11 <= class18.field279) {
                    int var13 = class156.method1060(Linkable.field1207, class12.field183, -103, arg2 + var5);
                    int var14 = class156.method1060(Linkable.field1207, class12.field183, -111, arg2 - var5);
                    if (var12 <= class18.field279) {
                        class230.method1536(var14, arg1, -7, var13, class3.field42[var12]);
                    }
                    if (var11 >= class49.field919) {
                        class230.method1536(var14, arg1, -7, var13, class3.field42[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg4 + var5;
            int var16 = arg4 - var5;
            if (class49.field919 <= var15 && class18.field279 >= var16) {
                int var17 = class156.method1060(Linkable.field1207, class12.field183, -122, arg2 + var6);
                int var18 = class156.method1060(Linkable.field1207, class12.field183, -102, arg2 - var6);
                if (var15 <= class18.field279) {
                    class230.method1536(var18, arg1, -7, var17, class3.field42[var15]);
                }
                if (var16 >= class49.field919) {
                    class230.method1536(var18, arg1, -7, var17, class3.field42[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "(I)I")
    public final int g1_alt1() {
        return this.data[this.pos++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "(I)I")
    public final int method320(int arg0) {
        this.pos += 4;
        return ((this.data[this.pos - 1] & 0xFF) << 16) + ((this.data[this.pos - 4] & 0xFF) << 8) + ((this.data[this.pos + -2] & 0xFF) << 24) + (this.data[this.pos + -3] & 0xFF);
    }

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "(I)J")
    public final long method321(int arg0) {
        if (arg0 != 1054632416) {
            field810 = null;
        }
        long var2 = (long) this.g4() & 0xFFFFFFFFL;
        field852++;
        long var4 = (long) this.g4() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[II)V")
    public final void tinydec(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = (arg1 - arg0) / 8;
        field861++;
        int var6 = this.pos;
        this.pos = arg0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.g4();
            int var9 = this.g4();
            int var10 = -1640531527;
            int var11 = -957401312;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= var11 + arg2[var11 >>> 11 & 0x3] ^ (var8 >>> 5 ^ var8 << 4) - -var8;
                var11 -= var10;
                var8 -= (var9 >>> 5 ^ var9 << 4) + var9 ^ arg2[var11 & 0x3] + var11;
            }
            this.pos -= 8;
            this.p4(var8);
            this.p4(var9);
        }
        this.pos = var6;
        if (arg3 != 4) {
            this.pjstr(null, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)I")
    public final int g4() {
        this.pos += 4;
        return ((this.data[this.pos - 4] & 0xFF) << 24) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos + -1] & 0xFF);
    }

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "(I)Li;")
    public final class88 fastgstr() {
        if (this.data[this.pos] == 0) {
            this.pos++;
            return null;
        } else {
            return this.gjstr();
        }
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(II)V")
    public final void p4_alt2(int arg1) {
        this.data[this.pos++] = (byte) (arg1 >> 8);
        this.data[this.pos++] = (byte) arg1;
        this.data[this.pos++] = (byte) (arg1 >> 24);
        this.data[this.pos++] = (byte) (arg1 >> 16);
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(II)V")
    public final void p1_alt3(int arg0) {
        this.data[this.pos++] = (byte) (128 - arg0);
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "(II)V")
    public final void pMidiVarLen(int n) {
        if ((n & 0xFFFFFF80) != 0) {
            if ((n & 0xFFFFC000) != 0) {
                if ((n & 0xFFE00000) != 0) {
                    if ((n & 0xF0000000) != 0) {
                        this.p1(n >>> 28 | 0x80);
                    }
                    this.p1(n >>> 21 | 0x80);
                }
                this.p1(n >>> 14 | 0x80);
            }
            this.p1(n >>> 7 | 0x80);
        }
        this.p1(n & 0x7F);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lnb;BLnb;)I")
    public static final int method330(Js5Index arg0, byte arg1, Js5Index arg2) {
        int var3 = 0;
        field838++;
        if (arg0.method955(0, class110.field2011)) {
            var3++;
        }
        if (arg2.method955(0, class151.field2934)) {
            var3++;
        }
        if (arg2.method955(0, class104.field1898)) {
            var3++;
        }
        if (arg1 != -110) {
            method348(79, -43, -117, (byte) -26, 4, 88, -104, -52, 122);
        }
        if (arg2.method955(0, class157.field3021)) {
            var3++;
        }
        if (arg2.method955(0, class245.field4504)) {
            var3++;
        }
        if (arg2.method955(0, class150.field2914)) {
            var3++;
        }
        arg2.method955(0, class14.field209);
        arg2.method955(0, class8.field119);
        arg2.method955(0, class97.field1785);
        arg2.method955(0, class120.field2197);
        arg2.method955(arg1 ^ 0xFFFFFF92, class226.field4249);
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "(II)V")
    public final void p2_alt2(int arg0) {
        this.data[this.pos++] = (byte) (arg0 >> 8);
        this.data[this.pos++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(B)I")
    public final int method332() {
        int var2 = 0;
        int var3;
        for (var3 = this.gsmart(); var3 == 32767; var3 = this.gsmart()) {
            var2 += 32767;
        }
        return var2 + var3;
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(B)I")
    public final int g2b() {
        this.pos += 2;
        int var2 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "(I)B")
    public final byte g1b_alt2() {
        return (byte) -this.data[this.pos++];
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Li;B)V")
    public final void pjstr(class88 arg0, byte arg1) {
        this.pos += arg0.method612(0, arg0.method604((byte) -53), arg1 ^ 0xFFFFC7B2, this.pos, this.data);
        this.data[this.pos++] = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "(I)I")
    public final int g2b_alt2() {
        this.pos += 2;
        int var2 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "(B)I")
    public final int method340() {
        this.pos += 3;
        return ((this.data[this.pos - 2] & 0xFF) << 16) + (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos + -3] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "(II)V")
    public final void psize1(int len) {
        this.data[this.pos - len - 1] = (byte) len;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)I")
    public final int gsmarts() {
        int var2 = this.data[this.pos] & 0xFF;
        return var2 < 128 ? this.g1() - 64 : this.g2() + -49152;
    }

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "(I)I")
    public final int g2_alt1() {
        this.pos += 2;
        return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(IB)V")
    public final void p2_alt3(int arg0) {
        this.data[this.pos++] = (byte) (arg0 + 128);
        this.data[this.pos++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(IB)I")
    public final int method345(int arg0, byte arg1) {
        int var3 = class231.method1544((byte) 6, arg0, this.data, this.pos);
        this.p4(var3);
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "(I)I")
    public final int g1() {
        return this.data[this.pos++] & 0xFF;
    }

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "(I)B")
    public final byte g1b() {
        return this.data[this.pos++];
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method348(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field822++;
        int var9 = arg7 - arg6;
        int var10 = arg5 - arg8;
        int var11 = (arg1 - arg2 << 16) / var9;
        if (SeqType.field1990 > arg7) {
            var9++;
        }
        int var12 = (arg0 - arg4 << 16) / var10;
        if (scene.field760 > arg5) {
            var10++;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            int var30 = (var13 + 1) * var11 >> 16;
            int var31 = var11 * var13 >> 16;
            int var32 = var30 - var31;
            if (var32 > 0) {
                int var33 = arg2 + var30;
                int var34 = arg2 + var31;
                int var35 = var13 + arg6 >> 6;
                int[][] var36 = class105.field1914[var35];
                byte[][] var37 = class97.field1788[var35];
                byte[][] var38 = class7.field105[var35];
                byte[][] var39 = class220.field4168[var35];
                byte[][] var40 = class208.field3953[var35];
                byte[][] var41 = class216.field4054[var35];
                for (int var42 = 0; var42 < var10; var42++) {
                    int var43 = var12 * var42 >> 16;
                    int var44 = (var42 + 1) * var12 >> 16;
                    int var45 = var44 - var43;
                    if (var45 > 0) {
                        int var46 = arg4 + var43;
                        int var47 = arg8 + var42 >> 6;
                        int var48 = arg8 + var42 & 0x3F;
                        int var49 = arg4 + var44;
                        int var50 = arg6 + var13 & 0x3F;
                        int var51 = (var48 << 6) + var50;
                        int var52;
                        if (var36[var47] == null) {
                            int var53 = var13 + arg6 & 0x4;
                            int var54 = var42 + arg8 & 0x4;
                            if ((var53 >= 2 || var54 <= 2) && (var53 <= 2 || var54 >= 2)) {
                                var52 = class54.field1009[class133.field2491 + 1];
                            } else {
                                var52 = 4936552;
                            }
                        } else {
                            var52 = var36[var47][var51];
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var55 = var38[var47] == null ? 0 : class54.field1009[var38[var47][var51] & 0xFF];
                        int var56 = var40[var47] == null ? 0 : class54.field1009[var40[var47][var51] & 0xFF];
                        if (var55 == 0 && var56 == 0) {
                            class72.method478(var34, var46, var32, var45, var52);
                        } else {
                            if (var55 != 0) {
                                byte var57 = var37[var47] == null ? 0 : var37[var47][var51];
                                int var58 = var57 & 0xFC;
                                if (var55 == -1) {
                                    var55 = 1;
                                }
                                if (var58 == 0 || var32 <= 1 || var45 <= 1) {
                                    class72.method478(var34, var46, var32, var45, var55);
                                } else {
                                    class219.method1484(true, var45, var52, var57 & 0x3, var46, var55, var58 >> 2, var34, (byte) -66, var32, class72.field1331);
                                }
                            }
                            if (var56 != 0) {
                                if (var56 == -1) {
                                    var56 = var52;
                                }
                                byte var59 = var39[var47][var51];
                                int var60 = var59 & 0xFC;
                                if (var60 == 0 || var32 <= 1 || var45 <= 1) {
                                    class72.method478(var34, var46, var32, var45, var56);
                                }
                                class219.method1484(var55 == 0, var45, 0, var59 & 0x3, var46, var56, var60 >> 2, var34, (byte) -66, var32, class72.field1331);
                            }
                        }
                        if (var41[var47] != null) {
                            int var61 = var41[var47][var51] & 0xFF;
                            if (var61 != 0) {
                                int var62;
                                if (var32 == 1) {
                                    var62 = var34;
                                } else {
                                    var62 = var33 - 1;
                                }
                                int var63;
                                if (var45 == 1) {
                                    var63 = var46;
                                } else {
                                    var63 = var49 - 1;
                                }
                                int var64 = 13421772;
                                if (var61 >= 5 && var61 <= 8 || var61 >= 13 && var61 <= 16 || var61 >= 21 && var61 <= 24 || var61 == 27 || var61 == 28) {
                                    var61 -= 4;
                                    var64 = 13369344;
                                }
                                if (var61 == 1) {
                                    class72.method487(var34, var46, var45, var64);
                                } else if (var61 == 2) {
                                    class72.method489(var34, var46, var32, var64);
                                } else if (var61 == 3) {
                                    class72.method487(var62, var46, var45, var64);
                                } else if (var61 == 4) {
                                    class72.method489(var34, var63, var32, var64);
                                } else if (var61 == 9) {
                                    class72.method487(var34, var46, var45, 16777215);
                                    class72.method489(var34, var46, var32, var64);
                                } else if (var61 == 10) {
                                    class72.method487(var62, var46, var45, 16777215);
                                    class72.method489(var34, var46, var32, var64);
                                } else if (var61 == 11) {
                                    class72.method487(var62, var46, var45, 16777215);
                                    class72.method489(var34, var63, var32, var64);
                                } else if (var61 == 12) {
                                    class72.method487(var34, var46, var45, 16777215);
                                    class72.method489(var34, var63, var32, var64);
                                } else if (var61 == 17) {
                                    class72.method489(var34, var46, 1, var64);
                                } else if (var61 == 18) {
                                    class72.method489(var62, var46, 1, var64);
                                } else if (var61 == 19) {
                                    class72.method489(var62, var63, 1, var64);
                                } else if (var61 == 20) {
                                    class72.method489(var34, var63, 1, var64);
                                } else if (var61 == 25) {
                                    for (int var65 = 0; var65 < var45; var65++) {
                                        class72.method489(var34 + var65, -var65 + var63, 1, var64);
                                    }
                                } else if (var61 == 26) {
                                    for (int var66 = 0; var66 < var45; var66++) {
                                        class72.method489(var34 + var66, var46 + var66, 1, var64);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != 78) {
            field859 = 0;
        }
        for (int var14 = 0; var14 < var9; var14++) {
            int var15 = var11 * var14 >> 16;
            int var16 = (var14 + 1) * var11 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg2 + var15;
                byte[][] var19 = class117.field2128[arg6 + var14 >> 6];
                int var10000;
                for (int var20 = 0; var20 < var10; var20++) {
                    int var22 = var12 * var20 >> 16;
                    int var23 = (var20 + 1) * var12 >> 16;
                    int var24 = var23 - var22;
                    if (var24 > 0) {
                        int var25 = ((arg8 + var20 & 0x3F) << 6) + (arg6 + var14 & 0x3F);
                        int var26 = var20 + arg8 >> 6;
                        var10000 = arg4 + var23;
                        int var28 = arg4 + var22;
                        if (var19[var26] != null) {
                            int var29 = var19[var26][var25] & 0xFF;
                            if (var29 != 0) {
                                if (var29 == 47 || var29 == 53) {
                                    class240.field4462[var29 - 1].method1340(var18, var28, var17 * 2 + 1, var24 * 2 + 1);
                                } else {
                                    class240.field4462[var29 - 1].method1340(var18 - var17 / 2, -(var24 / 2) + var28, var17 * 2, var24 * 2);
                                }
                            }
                        }
                    }
                }
                var10000 = arg2 + var16;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)I")
    public final int g2_alt2() {
        this.pos += 2;
        return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "(I)I")
    public final int gsmart() {
        int var1 = this.data[this.pos] & 0xFF;
        return var1 < 128 ? this.g1() : this.g2() - 32768;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(ZI)V")
    public final void p4_alt1(int arg0) {
        this.data[this.pos++] = (byte) arg0;
        this.data[this.pos++] = (byte) (arg0 >> 8);
        this.data[this.pos++] = (byte) (arg0 >> 16);
        this.data[this.pos++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "(I)I")
    public final int g1_alt3(int arg0) {
       return 128 - this.data[this.pos++] & 0xFF;
    }

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "(I)V")
    public static void method354(int arg0) {
        field817 = null;
        field845 = null;
        field810 = null;
    }

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static volatile int field807 = 0;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Li;")
    private static class88 field810 = class208.method1425(105, "Loading title screen )2 ");

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    public static volatile int field833 = 0;

    @OriginalMember(owner = "client!ea", name = "lb", descriptor = "[I")
    public static int[] field845 = new int[200];

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "Li;")
    public static class88 field817 = field810;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field821 = 0;

    @OriginalMember(owner = "client!ea", name = "zb", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!ea", name = "gb", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ea", name = "hb", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ea", name = "kb", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!ea", name = "mb", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ea", name = "nb", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ea", name = "ob", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ea", name = "pb", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ea", name = "qb", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ea", name = "rb", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ea", name = "sb", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!ea", name = "tb", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ea", name = "ub", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ea", name = "vb", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ea", name = "wb", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ea", name = "xb", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ea", name = "yb", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!ea", name = "Ab", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ea", name = "Bb", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ea", name = "Cb", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ea", name = "Db", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ea", name = "Eb", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ea", name = "Fb", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ea", name = "Gb", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ea", name = "Hb", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ea", name = "Ib", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ea", name = "Jb", descriptor = "I")
    public static int field869;
}
