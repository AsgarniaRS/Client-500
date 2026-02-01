import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class114 extends Linkable2 {

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
	public int field2069 = 0;

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
	public static int field2059 = -1;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "Li;")
	private static JString field2062 = class208.method1425("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "Li;")
	public static JString field2066 = field2062;

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "[I")
	public static int[] field2061 = new int[128];

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
	public static volatile int field2070 = 0;

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "Li;")
	private static JString field2057 = class208.method1425("Unable to find ");

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
	public static int rebootTimer = 0;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "Li;")
	public static JString field2065 = field2057;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
	public static int field2056;

	@OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
	public static int field2060;

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
	public static int field2064;

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
	public static int field2067;

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
	public static int field2068;

	@OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
	public static int field2071;

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
	public static int field2072;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "Lej;")
	public static class55 field2058;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lea;B)V")
	public final void method777(Packet arg0, byte arg1) {
		field2056++;
		int var3 = 92 / ((arg1 + 84) / 41);
		while (true) {
			int var4 = arg0.g1();
			if (var4 == 0) {
				return;
			}
			this.method780(var4, arg0, 2842);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
	public static final void method778(boolean arg0) {
		field2071++;
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
		if (arg0) {
			method784(false, -33);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IJ)V")
	public static final void method779(int arg0, long arg1) {
		field2067++;
		int var3 = -110 / ((arg0 - 32) / 42);
		if (arg1 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < Isaac.field2731; var4++) {
			if (class115.field2088[var4] == arg1) {
				class17.field257++;
				Isaac.field2731--;
				for (int var5 = var4; var5 < Isaac.field2731; var5++) {
					class23.field370[var5] = class23.field370[var5 + 1];
					class160.field3094[var5] = class160.field3094[var5 + 1];
					class168.field3240[var5] = class168.field3240[var5 + 1];
					class115.field2088[var5] = class115.field2088[var5 + 1];
					Packet.field845[var5] = Packet.field845[var5 + 1];
					GZip.field1120[var5] = GZip.field1120[var5 + 1];
				}
				class20.field313 = Linkable.transmitNum;
				Isaac.out.method30(121);
				Isaac.out.p8(arg1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILea;I)V")
	private void method780(int arg0, Packet arg1, int arg2) {
		if (arg0 == 2) {
			this.field2069 = arg1.g2();
		}
		if (arg2 != 2842) {
			this.method777(null, (byte) -15);
		}
		field2068++;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
	public static final void method781(int arg0) {
		try {
			if (class129.field2416 == null) {
				class129.field2416 = new class3(NpcType.field2326, class166.method1142(new JString[]{class210.field3985, class170.method1214(NpcType.field2350, arg0 ^ 0xFFFF805F), class49.field915}, -3).method606(true));
			} else {
				byte[] var1 = class129.field2416.method12(true);
				if (var1 != null) {
					Packet var2 = new Packet(var1);
					class104.field1897 = var2.g2();
					class202.field3847 = new class70[class104.field1897];
					for (int var3 = 0; var3 < class104.field1897; var3++) {
						class70 var4 = class202.field3847[var3] = new class70();
						int var5 = var2.g2();
						var4.field1261 = var5 & 0x7FFF;
						var4.field1257 = (var5 & 0x8000) != 0;
						var4.field1262 = var2.gjstr();
						var4.field1255 = var2.g2b();
						var4.field1258 = var3;
						var4.field1260 = class79.method528(var2.g2(), arg0 ^ 0x4030);
					}
					class167.method1145(0, class202.field3847, 1, class202.field3847.length - 1);
					class209.field3961 = true;
					class129.field2416 = null;
				}
			}
		} catch (Exception var7) {
			var7.printStackTrace();
			class129.field2416 = null;
		}
		if (arg0 == 32767) {
			field2072++;
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
	public static void method782(byte arg0) {
		field2062 = null;
		field2065 = null;
		field2066 = null;
		field2058 = null;
		field2057 = null;
		field2061 = null;
		if (arg0 <= 105) {
			method782((byte) 94);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIZIII)V")
	public static final void method783(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
		if (arg4) {
			return;
		}
		field2060++;
		if (arg7 < 1 || arg2 < 1 || arg7 > 102 || arg2 > 102) {
			return;
		}
		if (class245.lowMemory && (class116.mapl[0][arg7][arg2] & 0x2) == 0) {
			int var8 = arg0;
			if ((class116.mapl[arg0][arg7][arg2] & 0x8) != 0) {
				var8 = 0;
			}
			if (class157.field3028 != var8) {
				return;
			}
		}
		int var9 = arg0;
		if (arg0 < 3 && (class116.mapl[1][arg7][arg2] & 0x2) == 2) {
			var9 = arg0 + 1;
		}
		LocType.method991(class166.levelCollisionMap[arg0], 0, arg7, var9, arg1, arg0, arg2);
		if (arg5 >= 0) {
			class223.method1505((byte) 93, false, arg0, false, arg6, arg3, false, arg5, var9, class166.levelCollisionMap[arg0], arg2, arg7);
			return;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)Z")
	public static final boolean method784(boolean arg0, int arg1) {
		if (arg0) {
			return true;
		}
		field2064++;
		if (arg1 >= 97 && arg1 <= 122) {
			return true;
		} else if (arg1 >= 65 && arg1 <= 90) {
			return true;
		} else {
			return arg1 >= 48 && arg1 <= 57;
		}
	}
}
