import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class NpcType extends Linkable2 {

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
	public int headicon = -1;

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "S")
	public short field2331 = 0;

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
	public int turnspeed = 32;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
	private int contrast = 0;

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
	public int turnleftanim = -1;

	@OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
	private int resizeh = 128;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
	public int vislevel = -1;

	@OriginalMember(owner = "client!lf", name = "mb", descriptor = "I")
	private int resizev = 128;

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
	public int readyanim = -1;

	@OriginalMember(owner = "client!lf", name = "ib", descriptor = "I")
	public int walkanim_b = -1;

	@OriginalMember(owner = "client!lf", name = "ob", descriptor = "I")
	public int size = 1;

	@OriginalMember(owner = "client!lf", name = "gb", descriptor = "Li;")
	public JString name = class3.field34;

	@OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
	public int walkanim = -1;

	@OriginalMember(owner = "client!lf", name = "sb", descriptor = "I")
	private int multivarbit = -1;

	@OriginalMember(owner = "client!lf", name = "wb", descriptor = "Z")
	public boolean minimap = true;

	@OriginalMember(owner = "client!lf", name = "hb", descriptor = "[Li;")
	public JString[] op = new JString[5];

	@OriginalMember(owner = "client!lf", name = "xb", descriptor = "I")
	private int ambient = 0;

	@OriginalMember(owner = "client!lf", name = "pb", descriptor = "S")
	public short field2352 = 0;

	@OriginalMember(owner = "client!lf", name = "yb", descriptor = "Z")
	public boolean active = true;

	@OriginalMember(owner = "client!lf", name = "tb", descriptor = "Z")
	public boolean walksmooth = true;

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
	public int walkanim_l = -1;

	@OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
	public int turnrightanim = -1;

	@OriginalMember(owner = "client!lf", name = "Cb", descriptor = "Z")
	public boolean alwaysontop = false;

	@OriginalMember(owner = "client!lf", name = "Eb", descriptor = "I")
	private int multivarp = -1;

	@OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
	public int walkanim_r = -1;

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "Li;")
	public static JString field2323 = class208.method1425("Hidden)2use");

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
	public static int field2334 = 0;

	@OriginalMember(owner = "client!lf", name = "rb", descriptor = "[[B")
	public static byte[][] cacheMax = new byte[50][];

	@OriginalMember(owner = "client!lf", name = "nb", descriptor = "I")
	public static int field2350 = 0;

	@OriginalMember(owner = "client!lf", name = "db", descriptor = "Li;")
	public static JString field2340 = class208.method1425("Ablegen");

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
	public static int field2315;

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
	public int index;

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
	public static int field2317;

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
	public static int field2320;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
	public static int field2322;

	@OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
	public static int field2325;

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
	public static int field2330;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
	public static int field2332;

	@OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
	public static int field2336;

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
	public static int field2338;

	@OriginalMember(owner = "client!lf", name = "lb", descriptor = "I")
	public static int field2348;

	@OriginalMember(owner = "client!lf", name = "vb", descriptor = "I")
	public static int field2358;

	@OriginalMember(owner = "client!lf", name = "Db", descriptor = "I")
	public static int field2366;

	@OriginalMember(owner = "client!lf", name = "Fb", descriptor = "I")
	public static int field2368;

	@OriginalMember(owner = "client!lf", name = "jb", descriptor = "Lob;")
	private HashTable field2346;

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "Lqg;")
	public static class181 field2326;

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "[B")
	private byte[] recol_s;

	@OriginalMember(owner = "client!lf", name = "R", descriptor = "[I")
	public int[] multinpc;

	@OriginalMember(owner = "client!lf", name = "Ab", descriptor = "[I")
	private int[] model;

	@OriginalMember(owner = "client!lf", name = "Bb", descriptor = "[I")
	private int[] head;

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "[S")
	private short[] field2318;

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "[S")
	private short[] field2335;

	@OriginalMember(owner = "client!lf", name = "kb", descriptor = "[S")
	private short[] field2347;

	@OriginalMember(owner = "client!lf", name = "ub", descriptor = "[S")
	private short[] retex_s;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)Z")
	public final boolean isMultiNpcVisible() {
		if (this.multinpc == null) {
			return true;
		}

		int var2 = -1;
		if (this.multivarbit != -1) {
			var2 = class142.getVarbit(this.multivarbit);
		} else if (this.multivarp != -1) {
			var2 = class113.var[this.multivarp];
		}

		if (var2 < 0 || var2 >= this.multinpc.length - 1 || this.multinpc[var2] == -1) {
			int var3 = this.multinpc[this.multinpc.length - 1];
			return var3 != -1;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lea;I)V")
	public final void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code, false);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)I")
	public final int method856(int arg0, int arg1, int arg2) {
		field2358++;
		if (this.field2346 == null) {
			return arg1;
		} else if (arg0 == -8931) {
			class192 var4 = (class192) this.field2346.find((long) arg2);
			return var4 == null ? arg1 : var4.field3700;
		} else {
			return 69;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIILnc;IJIIII)Z")
	public static final boolean method857(int arg0, int arg1, int arg2, int arg3, class145 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
		return arg4 == null ? true : class112.method770(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lnb;ILnb;Lnb;Lnb;)V")
	public static final void method858(Js5Index arg0, int arg1, Js5Index arg2, Js5Index arg3, Js5Index arg4) {
		if (arg1 < 9) {
			field2350 = 1;
		}
		class90.field1705 = arg4;
		class65.field1176 = arg0;
		class85.interfaces = arg2;
		class106.field1928 = arg3;
		class78.list = new IfType[class85.interfaces.method942((byte) -42)][];
		class167.open = new boolean[class85.interfaces.method942((byte) -110)];
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZLea;)V")
	private void decode(Packet buf, int code, boolean arg1) {
		if (code == 1) {
			int count = buf.g1();
			this.model = new int[count];
			for (int i = 0; i < count; i++) {
				this.model[i] = buf.g2();
			}
		} else if (code == 2) {
			this.name = buf.gjstr();
		} else if (code == 12) {
			this.size = buf.g1();
		} else if (code == 13) {
			this.readyanim = buf.g2();
		} else if (code == 14) {
			this.walkanim = buf.g2();
		} else if (code == 15) {
			this.turnleftanim = buf.g2();
		} else if (code == 16) {
			this.turnrightanim = buf.g2();
		} else if (code == 17) {
			this.walkanim = buf.g2();
			this.walkanim_b = buf.g2();
			this.walkanim_r = buf.g2();
			this.walkanim_l = buf.g2();
		} else if (code >= 30 && code < 35) {
			this.op[code - 30] = buf.gjstr();
			if (this.op[code - 30].equalsIgnoreCase(class192.HIDDEN)) {
				this.op[code - 30] = null;
			}
		} else if (code == 40) {
			int count = buf.g1();
			this.field2318 = new short[count];
			this.field2335 = new short[count];
			for (int i = 0; i < count; i++) {
				this.field2335[i] = (short) buf.g2();
				this.field2318[i] = (short) buf.g2();
			}
		} else if (code == 41) {
			int count = buf.g1();
			this.field2347 = new short[count];
			this.retex_s = new short[count];
			for (int i = 0; i < count; i++) {
				this.retex_s[i] = (short) buf.g2();
				this.field2347[i] = (short) buf.g2();
			}
		} else if (code == 42) {
			int count = buf.g1();
			this.recol_s = new byte[count];
			for (int i = 0; i < count; i++) {
				this.recol_s[i] = buf.g1b();
			}
		} else if (code == 60) {
			int count = buf.g1();
			this.head = new int[count];
			for (int i = 0; i < count; i++) {
				this.head[i] = buf.g2();
			}
		} else if (code == 93) {
			this.minimap = false;
		} else if (code == 95) {
			this.vislevel = buf.g2();
		} else if (code == 97) {
			this.resizeh = buf.g2();
		} else if (code == 98) {
			this.resizev = buf.g2();
		} else if (code == 99) {
			this.alwaysontop = true;
		} else if (code == 100) {
			this.ambient = buf.g1b();
		} else if (code == 101) {
			this.contrast = buf.g1b() * 5;
		} else if (code == 102) {
			this.headicon = buf.g2();
		} else if (code == 103) {
			this.turnspeed = buf.g2();
		} else if (code == 106 || code == 118) {
			int var14 = -1;
			this.multivarbit = buf.g2();
			if (this.multivarbit == 65535) {
				this.multivarbit = -1;
			}
			this.multivarp = buf.g2();
			if (this.multivarp == 65535) {
				this.multivarp = -1;
			}
			if (code == 118) {
				var14 = buf.g2();
				if (var14 == 65535) {
					var14 = -1;
				}
			}
			int var15 = buf.g1();
			this.multinpc = new int[var15 + 2];
			for (int var16 = 0; var16 <= var15; var16++) {
				this.multinpc[var16] = buf.g2();
				if (this.multinpc[var16] == 65535) {
					this.multinpc[var16] = -1;
				}
			}
			this.multinpc[var15 + 1] = var14;
		} else if (code == 107) {
			this.active = false;
		} else if (code == 109) {
			this.walksmooth = false;
		} else if (code != 111) {
			if (code == 113) {
				buf.g2();
				buf.g2();
			} else if (code == 114) {
				buf.g1b();
				buf.g1b();
			} else if (code == 115) {
				this.field2352 = (short) (buf.g1() * 4);
				this.field2331 = (short) (buf.g1() * 4);
			} else if (code == 119) {
				buf.g1b();
			} else if (code == 249) {
				int var8 = buf.g1();
				if (this.field2346 == null) {
					int var9 = class184.method1298(!arg1, var8);
					this.field2346 = new HashTable(var9);
				}
				for (int var10 = 0; var10 < var8; var10++) {
					boolean var11 = buf.g1() == 1;
					int var12 = buf.g3();
					Linkable var13;
					if (var11) {
						var13 = new class216(buf.gjstr());
					} else {
						var13 = new class192(buf.g4());
					}
					this.field2346.put((long) var12, var13, -1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	public final void postDecode() {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIILnc;IJZ)Z")
	public static final boolean method861(int arg0, int arg1, int arg2, int arg3, int arg4, class145 arg5, int arg6, long arg7, boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		int var10 = arg1 - arg4;
		int var11 = arg2 - arg4;
		int var12 = arg1 + arg4;
		int var13 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				var13 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				var12 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				var11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				var10 -= 128;
			}
		}
		int var14 = var10 / 128;
		int var15 = var11 / 128;
		int var16 = var12 / 128;
		int var17 = var13 / 128;
		return class112.method770(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILi;)Li;")
	public final JString method862(int arg0, int arg1, JString arg2) {
		int var4 = 13 / ((41 - arg1) / 50);
		field2325++;
		if (this.field2346 == null) {
			return arg2;
		} else {
			class216 var5 = (class216) this.field2346.find((long) arg0);
			return var5 == null ? arg2 : var5.field4048;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIB)V")
	public static final void method863(int arg0, int arg1, int arg2, int arg3, byte arg4) {
		for (int var5 = 0; var5 < class206.field3925; var5++) {
			if (arg3 < class81.field1455[var5] + class133.field2487[var5] && arg3 + arg1 > class81.field1455[var5] && arg2 < class132.field2473[var5] + class80.field1447[var5] && class132.field2473[var5] < arg0 + arg2) {
				class225.field4230[var5] = true;
			}
		}
		field2320++;
		if (arg4 >= -114) {
			field2350 = -12;
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)Llf;")
	public final NpcType getMultiNpc() {
		int value = -1;
		if (this.multivarbit != -1) {
			value = class142.getVarbit(this.multivarbit);
		} else if (this.multivarp != -1) {
			value = class113.var[this.multivarp];
		}

		if (value < 0 || this.multinpc.length - 1 <= value || this.multinpc[value] == -1) {
			int var3 = this.multinpc[this.multinpc.length - 1];
			return var3 == -1 ? null : class147.list(var3);
		} else {
			return class147.list(this.multinpc[value]);
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	public static void method865(int arg0) {
		cacheMax = null;
		field2326 = null;
		field2323 = null;
		if (arg0 != -1) {
			field2340 = null;
		}
		field2340 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILk;)Lcg;")
	public final class30 method866(int arg0, int arg1, SeqType arg2) {
		field2315++;
		if (this.multinpc != null) {
			NpcType var4 = this.getMultiNpc();
			return var4 == null ? null : var4.method866(arg0, arg1, arg2);
		} else if (this.head == null) {
			return null;
		} else {
			class30 var5 = (class30) class141.field2608.method135(arg1 - 116, (long) this.index);
			if (arg1 != 0) {
				cacheMax = null;
			}
			if (var5 == null) {
				boolean var6 = false;
				for (int var7 = 0; var7 < this.head.length; var7++) {
					if (!class170.models.requestDownload(this.head[var7], 0)) {
						var6 = true;
					}
				}
				if (var6) {
					return null;
				}
				ModelUnlit[] var8 = new ModelUnlit[this.head.length];
				for (int var9 = 0; var9 < this.head.length; var9++) {
					var8[var9] = ModelUnlit.load(class170.models, this.head[var9], 0);
				}
				ModelUnlit var10;
				if (var8.length == 1) {
					var10 = var8[0];
				} else {
					var10 = new ModelUnlit(var8, var8.length);
				}
				if (this.field2335 != null) {
					for (int var11 = 0; var11 < this.field2335.length; var11++) {
						if (this.recol_s == null || this.recol_s.length <= var11) {
							var10.recolour(this.field2335[var11], this.field2318[var11]);
						} else {
							var10.recolour(this.field2335[var11], class7.field108[this.recol_s[var11] & 0xFF]);
						}
					}
				}
				if (this.retex_s != null) {
					for (int var12 = 0; var12 < this.retex_s.length; var12++) {
						var10.retexture(this.retex_s[var12], this.field2347[var12]);
					}
				}
				var5 = var10.light(64, 768, -50, -10, -50);
				class141.field2608.method130(37, (long) this.index, var5);
			}
			if (arg2 != null) {
				var5 = arg2.method760(arg0, var5, (byte) -83);
			}
			return var5;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILk;IILk;)Lcg;")
	public final class30 method867(int arg0, SeqType arg1, int arg2, int arg3, SeqType arg4) {
		field2338++;
		if (this.multinpc != null) {
			NpcType npc = this.getMultiNpc();
			return npc == null ? null : npc.method867(0, arg1, arg2, arg3, arg4);
		}
		class30 cached = (class30) class106.field1925.method135(-99, (long) this.index);
		if (cached == null) {
			boolean needsModel = false;
			for (int var9 = 0; var9 < this.model.length; var9++) {
				if (!class170.models.requestDownload(this.model[var9], 0)) {
					needsModel = true;
				}
			}
			if (needsModel) {
				return null;
			}
			ModelUnlit[] models = new ModelUnlit[this.model.length];
			for (int i = 0; i < this.model.length; i++) {
				models[i] = ModelUnlit.load(class170.models, this.model[i], 0);
			}
			ModelUnlit model;
			if (models.length == 1) {
				model = models[0];
			} else {
				model = new ModelUnlit(models, models.length);
			}
			if (this.field2335 != null) {
				for (int i = 0; i < this.field2335.length; i++) {
					if (this.recol_s == null || i >= this.recol_s.length) {
						model.recolour(this.field2335[i], this.field2318[i]);
					} else {
						model.recolour(this.field2335[i], class7.field108[this.recol_s[i] & 0xFF]);
					}
				}
			}
			if (this.retex_s != null) {
				for (int i = 0; i < this.retex_s.length; i++) {
					model.retexture(this.retex_s[i], this.field2347[i]);
				}
			}
			cached = model.light(this.ambient + 64, 850 - -this.contrast, -30, -50, -30);
			class106.field1925.method130(37, (long) this.index, cached);
		}

		class30 model;
		if (arg4 != null && arg1 != null) {
			model = arg4.method756(arg3, arg1, arg2, (byte) 82, cached);
		} else if (arg4 != null) {
			model = arg4.method752(arg0 ^ 0xFFFF, arg3, cached);
		} else if (arg1 == null) {
			model = cached.method184(true, true);
		} else {
			model = arg1.method752(65535, arg2, cached);
		}

		if (this.resizeh != 128 || this.resizev != 128) {
			model.resize(this.resizeh, this.resizev, this.resizeh);
		}
		return model;
	}
}
