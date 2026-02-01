import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.io.IOException;

@OriginalClass("client!ac")
public class class4 extends Linkable2 {

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "Li;")
	private static JString field50 = class208.method1425("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "Li;")
	public static JString field56 = field50;

	@OriginalMember(owner = "client!ac", name = "U", descriptor = "Li;")
	public static JString field63 = class208.method1425(")4l");

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
	public static int field46 = 0;

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "Li;")
	public static JString field62 = class208.method1425("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
	public static int field47;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
	public static int field48;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
	public static int field49;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	private int field51;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
	public static int field52;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
	public int field53;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
	public static int field55;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
	public static int field58;

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
	public static int field59;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
	public static int field60;

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
	public static int field61;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "Li;")
	public static JString field54;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "Li;")
	public JString field57;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILq;)V")
	public static final void method16(int arg0, int arg1, int arg2, IfType arg3) {
		field61++;
		if (ClientScript.field4514 != 0 && ClientScript.field4514 != 3) {
			return;
		}
		int var4 = arg1 - arg3.field3424 / 2;
		int var5 = arg0 - arg3.field3382 / 2;
		int var6 = Ground.field943 + class207.field3932 & 0x7FF;
		int var7 = class173.field3356[var6];
		int var8 = class173.field3361[var6];
		int var9 = (class65.field1185 + 256) * var7 >> 8;
		int var10 = (class65.field1185 + 256) * var8 >> 8;
		if (arg2 != -11537) {
			pUid(null, (byte) 121);
		}
		int var11 = var4 * var10 + var5 * var9 >> 11;
		int var12 = class240.localPlayer.field4138 + var11 >> 7;
		int var13 = var4 * var9 - var5 * var10 >> 11;
		int var14 = class240.localPlayer.field4123 - var13 >> 7;
		boolean var15 = class207.method1423(arg2 ^ 0xFFFFD90B, 0, 0, var14, var12, class240.localPlayer.field4089[0], 0, 0, 1, true, 0, class240.localPlayer.field4143[0]);
		if (!var15) {
			return;
		}
		Isaac.out.p1(var5);
		Isaac.out.p1(var4);
		Isaac.out.p2(class207.field3932);
		Isaac.out.p1(57);
		Isaac.out.p1(Ground.field943);
		Isaac.out.p1(class65.field1185);
		Isaac.out.p1(89);
		Isaac.out.p2(class240.localPlayer.field4138);
		Isaac.out.p2(class240.localPlayer.field4123);
		Isaac.out.p1(class120.tryMoveNearest);
		Isaac.out.p1(63);
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)Z")
	public final boolean method17(int arg0) {
		if (arg0 >= -4) {
			field46 = 99;
		}
		field47++;
		return this.field51 == 115;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V")
	public static void method18(byte arg0) {
		field63 = null;
		field50 = null;
		if (arg0 != -112) {
			field63 = null;
		}
		field56 = null;
		field62 = null;
		field54 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lea;B)V")
	public static final void pUid(Packet arg0, byte arg1) {
		if (arg1 > -81) {
			field50 = null;
		}
		byte[] var2 = new byte[24];
		field55++;
		if (class175.field3531 != null) {
			try {
				class175.field3531.method820((byte) 96, 0L);
				class175.field3531.method812(-16777216, var2);
				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
				}
				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var5) {
				for (int var4 = 0; var4 < 24; var4++) {
					var2[var4] = -1;
				}
			}
		}
		arg0.pdata(var2, 24, 0);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
	public static final void method20(int arg0, int arg1) {
		field59++;
		class177 var2 = (class177) class64.field1163.find((long) arg1);
		if (var2 == null) {
			return;
		}
		for (int var3 = 0; var3 < var2.objId.length; var3++) {
			var2.objId[var3] = -1;
			var2.objCount[var3] = 0;
		}
		if (arg0 != -2) {
			pUid(null, (byte) -120);
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lea;B)V")
	public final void method21(Packet arg0, byte arg1) {
		field49++;
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				if (arg1 <= 20) {
					method18((byte) 115);
					return;
				} else {
					return;
				}
			}
			this.method22(var3, arg0, -97);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILea;I)V")
	private void method22(int arg0, Packet arg1, int arg2) {
		field52++;
		if (arg0 == 1) {
			this.field51 = arg1.g1();
		} else if (arg0 == 2) {
			this.field53 = arg1.g4();
		} else if (arg0 == 5) {
			this.field57 = arg1.gjstr();
		}
		if (arg2 > -60) {
			method18((byte) -78);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V")
	public static final void method23(boolean arg0, int arg1, int arg2) {
		field58++;
		if (!arg0) {
			method23(false, -97, -60);
		}
		if (class65.field1183 != 0 && arg1 != -1) {
			class53.method388(0, class133.field2488, (byte) -116, false, arg1, class65.field1183);
			class110.playingJingle = true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)Z")
	public static final boolean method24(int arg0, int arg1) {
		field60++;
		if (arg1 != 0) {
			field62 = null;
		}
		return arg0 >= 48 && arg0 <= 57;
	}
}
