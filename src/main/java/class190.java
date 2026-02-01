import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class190 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	public static volatile int field3670 = 0;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "[[I")
	public static int[][] field3675 = new int[104][104];

	@OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
	public static int[] field3676 = new int[5];

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int field3671;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	public static int field3672;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	public static int field3673;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public static int field3677;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	public static int field3678;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "I")
	public static int field3679;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "I")
	public static int field3680;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	public static int field3681;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lmf;")
	public static ClientStream field3682;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lbj;")
	public static Js5Local field3674;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
	public static int[] field3669;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lnf;")
	public static final LocType method1323(int arg0, int arg1) {
		field3679++;
		LocType var2 = (LocType) class179.field3560.find((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3 = class200.field3829.getFile(class194.method1346(arg0, -124), class160.method1079(false, arg0));
		LocType var4 = new LocType();
		var4.field2833 = arg0;
		if (arg1 != -12450) {
			field3674 = null;
		}
		if (var3 != null) {
			var4.decode(new Packet(var3));
		}
		var4.postDecode();
		if (!class20.field317 && var4.field2836) {
			var4.op = null;
		}
		if (var4.breakroutefinding) {
			var4.blockwalk = 0;
			var4.blockrange = false;
		}
		class179.field3560.put(var4, (long) arg0, false);
		return var4;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILnb;B)[Lrh;")
	public static final class193[] method1324(int arg0, int arg1, Js5 arg2, byte arg3) {
		field3671++;
		if (EnumType.method358(854010832, arg2, arg0, arg1)) {
			if (arg3 != 24) {
				method1328(40);
			}
			return IfType.method1245((byte) -120);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)[Llj;")
	public static final class130[] method1325(byte arg0) {
		field3677++;
		if (arg0 > -16) {
			method1330(-75);
		}
		class130[] var1 = new class130[class172.field3347];
		for (int var2 = 0; var2 < class172.field3347; var2++) {
			var1[var2] = new class193(class15.field229, class129.field2426, ClientScript.field4530[var2], class135.field2512[var2], class102.field1853[var2], Linkable.field1218[var2], class116.field2106[var2], class27.field456);
		}
		class239.method1580(107);
		return var1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lnb;I)V")
	public static final void method1326(Js5 arg0, int arg1) {
		Client.field567 = arg0;
		field3680++;
		int var2 = -38 % ((55 - arg1) / 40);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBLnb;I)[Llj;")
	public static final class130[] method1327(int arg0, byte arg1, Js5 arg2, int arg3) {
		if (arg1 > -23) {
			field3675 = null;
		}
		field3678++;
		return EnumType.method358(854010832, arg2, arg0, arg3) ? method1325((byte) -54) : null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method1328(int arg0) {
		if (arg0 != 29073) {
			method1326(null, 82);
		}
		field3674 = null;
		field3676 = null;
		field3675 = null;
		field3669 = null;
		field3682 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V")
	public static final void method1329(boolean arg0, boolean arg1) {
		field3673++;
		byte[][] var2 = class45.field774;
		int var3 = class167.field3223.length;
		for (int var4 = 0; var4 < var3; var4++) {
			byte[] var5 = var2[var4];
			if (var5 != null) {
				int var6 = (Isaac.field2733[var4] >> 8) * 64 - class223.field4214;
				int var7 = (Isaac.field2733[var4] & 0xFF) * 64 - field3681;
				class219.method1481(2);
				class18.method85(class166.levelCollisionMap, var5, var6, -109, arg1, var7);
			}
		}
		if (!arg0) {
			method1329(false, false);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static final void method1330(int arg0) {
		field3672++;
		if (arg0 != -25194) {
			method1330(-13);
		}
		if (class245.lowMemory && class157.field3028 != class149.minusedLevel) {
			class120.method822(class149.minusedLevel, class240.localPlayer.field4143[0], class140.field2597, class110.field2016, (byte) 126, class240.localPlayer.field4089[0]);
		} else if (class172.field3338 != class149.minusedLevel) {
			class172.field3338 = class149.minusedLevel;
			class242.method1597(-31422, class149.minusedLevel);
		}
	}
}
