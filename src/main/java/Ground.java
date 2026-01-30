import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class Ground extends Linkable {

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public int field954 = 0;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "[I")
    public int[] field957 = new int[5];

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "[Ljj;")
    public class108[] field963 = new class108[5];

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public int z;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    public int level;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public int occludeLevel;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public int x;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "Li;")
    public static JString field938 = class208.method1425("und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field939 = 3353893;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field943 = 0;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "Loe;")
    public class157 field959;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Lpc;")
    public class166 field949;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "Lw;")
    public class239 field948;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "Leg;")
    public Ground field951;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "Lf;")
    public class56 field964;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Lfh;")
    public class64 field956;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "Lih;")
    public class95 field947;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "Z")
    public boolean field944;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "Z")
    public boolean field958;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "Z")
    public boolean field965;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public static void method386(int arg0) {
        if (arg0 == 3353893) {
            field938 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(III)V")
    public Ground(int level, int x, int z) {
        this.z = z;
        this.occludeLevel = this.level = level;
        this.x = x;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)I")
    public static final int method387(int arg0, byte arg1) {
        if (arg1 >= -64) {
            method387(-72, (byte) 93);
        }
        field940++;
        return arg0 & 0x7F;
    }
}
