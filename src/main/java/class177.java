import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class177 extends Linkable {

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "[I")
	public int[] objCount = new int[1];

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "[I")
	public int[] objId = new int[]{-1};

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Li;")
	private static JString field3552 = class208.method1425("Allocated memory");

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Li;")
	public static JString field3551 = field3552;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "Li;")
	public static JString field3556 = class208.method1425("<img=0>");

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	public static int field3550;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	public static int field3554;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	public static void method1269(byte arg0) {
		field3551 = null;
		field3552 = null;
		field3556 = null;
		if (arg0 <= 61) {
			field3556 = null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
	public static final void set(int arg0, int arg1, int arg2, int arg3, int arg4) {
		class177 var5 = (class177) class64.field1163.find((long) arg1);
		field3554++;
		if (arg0 != 1) {
			field3551 = null;
		}
		if (var5 == null) {
			var5 = new class177();
			class64.field1163.put((long) arg1, var5, arg0 - 2);
		}
		if (var5.objId.length <= arg3) {
			int[] var6 = new int[arg3 + 1];
			int[] var7 = new int[arg3 + 1];
			for (int i = 0; i < var5.objId.length; i++) {
				var7[i] = var5.objId[i];
				var6[i] = var5.objCount[i];
			}
			for (int i = var5.objId.length; i < arg3; i++) {
				var7[i] = -1;
				var6[i] = 0;
			}
			var5.objCount = var6;
			var5.objId = var7;
		}
		var5.objId[arg3] = arg4;
		var5.objCount[arg3] = arg2;
	}
}
