import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class239 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Li;")
	public static JString field4436 = class208.method1425("weiss:");

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Li;")
	public static JString field4444 = class208.method1425("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Li;")
	public static JString field4452 = class208.method1425("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!w", name = "n", descriptor = "[Ljj;")
	public static class108[] spriteBuffer = new class108[100];

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	public static int field4451 = 0;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public int field4437;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public static int field4438;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public static int field4439;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	public static int field4440;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public int field4441;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "I")
	public static int field4443;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	public int field4446;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public static int field4447;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	public int field4453;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "I")
	public static int field4454;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "J")
	public long field4442;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lnc;")
	public class145 field4445;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lnc;")
	public class145 field4448;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "Lnc;")
	public class145 field4450;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static final void method1579(byte arg0) {
		field4438++;
		int var1 = class135.field2514 * 128 + 64;
		int var2 = class171.field3329 * 128 + 64;
		int var3 = Client.getAvH(var1, var2, 2, class149.minusedLevel) - class70.field1264;
		if (class79.field1428 < var1) {
			class79.field1428 += (var1 - class79.field1428) * class160.field3095 / 1000 + class246.field4508;
			if (var1 < class79.field1428) {
				class79.field1428 = var1;
			}
		}
		if (var2 > class184.field3610) {
			class184.field3610 += (var2 - class184.field3610) * class160.field3095 / 1000 + class246.field4508;
			if (var2 < class184.field3610) {
				class184.field3610 = var2;
			}
		}
		if (var1 < class79.field1428) {
			class79.field1428 -= (class79.field1428 - var1) * class160.field3095 / 1000 + class246.field4508;
			if (var1 > class79.field1428) {
				class79.field1428 = var1;
			}
		}
		int var4 = Packet.field848 * 128 + 64;
		if (class184.field3610 > var2) {
			class184.field3610 -= class246.field4508 + (class184.field3610 - var2) * class160.field3095 / 1000;
			if (class184.field3610 < var2) {
				class184.field3610 = var2;
			}
		}
		if (class108.field1956 < var3) {
			class108.field1956 += (var3 - class108.field1956) * class160.field3095 / 1000 + class246.field4508;
			if (class108.field1956 > var3) {
				class108.field1956 = var3;
			}
		}
		if (arg0 > -127) {
			spriteBuffer = null;
		}
		int var5 = class23.field368 * 128 + 64;
		if (var3 < class108.field1956) {
			class108.field1956 -= (class108.field1956 - var3) * class160.field3095 / 1000 + class246.field4508;
			if (class108.field1956 < var3) {
				class108.field1956 = var3;
			}
		}
		int var6 = Client.getAvH(var4, var5, 2, class149.minusedLevel) - class66.field1200;
		int var7 = var4 - class79.field1428;
		int var8 = var6 - class108.field1956;
		int var9 = var5 - class184.field3610;
		int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
		int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
		if (var11 < 128) {
			var11 = 128;
		}
		int var13 = var12 - class170.field3259;
		if (var13 > 1024) {
			var13 -= 2048;
		}
		if (var11 > 383) {
			var11 = 383;
		}
		if (var13 < -1024) {
			var13 += 2048;
		}
		if (class207.field3936 < var11) {
			class207.field3936 += (var11 - class207.field3936) * Isaac.field2744 / 1000 + class9.field130;
			if (class207.field3936 > var11) {
				class207.field3936 = var11;
			}
		}
		if (var13 > 0) {
			class170.field3259 += Isaac.field2744 * var13 / 1000 + class9.field130;
			class170.field3259 &= 0x7FF;
		}
		if (var13 < 0) {
			class170.field3259 -= class9.field130 + -var13 * Isaac.field2744 / 1000;
			class170.field3259 &= 0x7FF;
		}
		if (class207.field3936 > var11) {
			class207.field3936 -= (class207.field3936 - var11) * Isaac.field2744 / 1000 + class9.field130;
			if (class207.field3936 < var11) {
				class207.field3936 = var11;
			}
		}
		int var14 = var12 - class170.field3259;
		if (var14 > 1024) {
			var14 -= 2048;
		}
		if (var14 < -1024) {
			var14 += 2048;
		}
		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			class170.field3259 = var12;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static final void method1580(int arg0) {
		ClientScript.field4530 = null;
		Linkable.field1218 = null;
		class135.field2512 = null;
		class116.field2106 = null;
		field4440++;
		int var1 = -10 % ((arg0 + 5) / 51);
		class27.field456 = null;
		class102.field1853 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	public static void method1582(boolean arg0) {
		field4444 = null;
		if (!arg0) {
			field4452 = null;
			field4436 = null;
			spriteBuffer = null;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z")
	public static final boolean method1583(int arg0, int arg1, int arg2) {
		int var3 = class238.field4431[arg0][arg1][arg2];
		if (-class143.field2629 == var3) {
			return false;
		} else if (class143.field2629 == var3) {
			return true;
		} else {
			int var4 = arg1 << 7;
			int var5 = arg2 << 7;
			if (class104.method720(var4 + 1, class62.field1137[arg0][arg1][arg2], var5 + 1) && class104.method720(var4 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg2], var5 + 1) && class104.method720(var4 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class104.method720(var4 + 1, class62.field1137[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
				class238.field4431[arg0][arg1][arg2] = class143.field2629;
				return true;
			} else {
				class238.field4431[arg0][arg1][arg2] = -class143.field2629;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Li;ZLnb;Li;)[Lrc;")
	public static final class188[] method1584(JString arg0, boolean arg1, Js5 arg2, JString arg3) {
		int var4 = arg2.method966(arg0, (byte) -3);
		if (!arg1) {
			method1585(-86, null, 15, 1);
		}
		field4454++;
		int var5 = arg2.method968(arg3, var4, 74);
		return class34.method230(var5, arg2, -7722, var4);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILnb;II)[Lpf;")
	public static final class169[] method1585(int arg0, Js5 arg1, int arg2, int arg3) {
		field4447++;
		if (arg3 != 1) {
			field4436 = null;
		}
		return EnumType.method358(854010832, arg1, arg2, arg0) ? class34.method229((byte) -69) : null;
	}

}
