import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class248 {

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Lg;")
    public Linkable field4536 = new Linkable();

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field4537 = 0;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4547 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Li;")
    public static JString field4549 = class208.method1425(105, "::fpson");

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Li;")
    public static JString field4548 = class208.method1425(105, "leuchten1:");

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Li;")
    public static JString field4550 = class208.method1425(105, " )2> ");

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "Z")
    public static boolean field4551 = false;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "Lnj;")
    public static class151 field4554;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Lbj;")
    public static Js5Local field4552;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lg;")
    private Linkable field4540;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)Lg;")
    public final Linkable method1612(boolean arg0) {
        if (arg0) {
            return null;
        }
        field4541++;
        Linkable var2 = this.field4536.next;
        if (this.field4536 == var2) {
            this.field4540 = null;
            return null;
        } else {
            this.field4540 = var2.next;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[I[III)V")
    public static final void method1613(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field4534++;
        int var5 = arg3;
        if (arg3 > 25) {
            var5 = 25;
        }
        arg3--;
        int var6 = arg2[arg3];
        int var7 = arg1[arg3];
        if (arg0 == 0) {
            Isaac.out.method30(200);
            Isaac.out.p1(var5 + var5 + 3);
            class57.field1087++;
        }
        if (arg0 == 1) {
            Isaac.out.method30(199);
            Isaac.out.p1(var5 + var5 + 17);
            class134.field2496++;
        }
        if (arg0 == 2) {
            Isaac.out.method30(159);
            Isaac.out.p1(var5 + var5 + 3);
            class24.field383++;
        }
        if (arg4 <= 16) {
            field4550 = null;
        }
        Isaac.out.p2(var6 + class190.field3681);
        Isaac.out.method297(class247.field4513[82] ? 1 : 0, 0);
        class116.field2104 = arg1[0];
        class140.field2596 = arg2[0];
        for (int var8 = 1; var8 < var5; var8++) {
            arg3--;
            Isaac.out.p1_alt3(arg1[arg3] - var7);
            Isaac.out.method297(arg2[arg3] - var6, 0);
        }
        Isaac.out.p2_alt2(var7 + class223.field4214);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)Lg;")
    public final Linkable method1614(byte arg0) {
        Linkable var2 = this.field4536.prev;
        if (arg0 != -25) {
            this.method1621(91);
        }
        field4538++;
        if (this.field4536 == var2) {
            this.field4540 = null;
            return null;
        } else {
            this.field4540 = var2.prev;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Lg;")
    public final Linkable method1615(int arg0) {
        int var2 = 92 % ((62 - arg0) / 62);
        field4542++;
        Linkable var3 = this.field4536.next;
        if (this.field4536 == var3) {
            return null;
        } else {
            var3.unlink();
            return var3;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public static void method1616(byte arg0) {
        int var1 = -60 / ((-arg0 - 75) / 42);
        field4554 = null;
        field4548 = null;
        field4549 = null;
        field4550 = null;
        field4547 = null;
        field4552 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILg;)V")
    public final void method1617(int arg0, Linkable arg1) {
        if (arg0 != 24290) {
            field4550 = null;
        }
        if (arg1.prev != null) {
            arg1.unlink();
        }
        arg1.next = this.field4536.next;
        field4533++;
        arg1.prev = this.field4536;
        arg1.prev.next = arg1;
        arg1.next.prev = arg1;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public final void method1618(int arg0) {
        if (arg0 != -3) {
            return;
        }
        field4539++;
        while (true) {
            Linkable var2 = this.field4536.next;
            if (this.field4536 == var2) {
                return;
            }
            var2.unlink();
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)Lg;")
    public final Linkable method1619(byte arg0) {
        if (arg0 > -4) {
            return null;
        }
        Linkable var2 = this.field4540;
        field4544++;
        if (this.field4536 == var2) {
            this.field4540 = null;
            return null;
        } else {
            this.field4540 = var2.prev;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V")
    public static final void method1620(byte arg0) {
        if (arg0 <= 43) {
            field4550 = null;
        }
        field4545++;
        class216.field4049.method671(43);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)Lg;")
    public final Linkable method1621(int arg0) {
        if (arg0 != 82) {
            this.method1618(89);
        }
        field4546++;
        Linkable var2 = this.field4540;
        if (this.field4536 == var2) {
            this.field4540 = null;
            return null;
        } else {
            this.field4540 = var2.next;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lg;BLg;)V")
    public final void method1622(Linkable arg0, byte arg1, Linkable arg2) {
        field4535++;
        if (arg0.prev != null) {
            arg0.unlink();
        }
        arg0.prev = arg2.prev;
        arg0.next = arg2;
        arg0.prev.next = arg0;
        arg0.next.prev = arg0;
        int var4 = -124 % ((-arg1 - 48) / 42);
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)V")
    public static final void method1623(byte arg0) {
        Isaac.out.method30(58);
        class210.field3988++;
        field4553++;
        Isaac.out.p8(0L);
        if (arg0 != -113) {
            method1623((byte) -12);
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class248() {
        this.field4536.next = this.field4536;
        this.field4536.prev = this.field4536;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lg;I)V")
    public final void method1624(Linkable arg0, int arg1) {
        field4543++;
        if (arg0.prev != null) {
            arg0.unlink();
        }
        arg0.prev = this.field4536.prev;
        arg0.next = this.field4536;
        if (arg1 <= 35) {
            field4552 = null;
        }
        arg0.prev.next = arg0;
        arg0.next.prev = arg0;
    }
}
