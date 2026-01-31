import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.util.zip.CRC32;

@OriginalClass("client!id")
public class class92 {

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lme;")
	private Linkable2 field1723 = new Linkable2();

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lsf;")
	private class202 order = new class202();

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	private int field1730;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	private int field1731;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lob;")
	private HashTable cache;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[I")
	public static int[] field1721 = new int[4096];

	@OriginalMember(owner = "client!id", name = "o", descriptor = "[I")
	public static int[] field1732;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 field1733;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Li;")
	public static JString field1734;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public static int field1718;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int field1719;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public static int field1720;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public static int field1722;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "I")
	public static int field1724;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	public static int field1725;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	public static int field1726;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public static int field1727;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "[I")
	public static int[] field1735;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(JLme;Z)V")
	public final void put(Linkable2 arg1, long arg0, boolean arg2) {
		field1719++;
		if (this.field1731 == 0) {
			Linkable2 var5 = this.order.method1384(0);
			var5.unlink();
			var5.unlink2(192);
			if (this.field1723 == var5) {
				Linkable2 var6 = this.order.method1384(0);
				var6.unlink();
				var6.unlink2(192);
			}
		} else {
			this.field1731--;
		}
		this.cache.put(arg0, arg1, -1);
		this.order.push(arg1, -20038);
		if (arg2) {
			this.method672(true);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Lg;")
	public final Linkable method665(int arg0) {
		if (arg0 == 0) {
			field1718++;
			return this.cache.method1050((byte) -73);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)Lme;")
	public final Linkable2 find(long key) {
		Linkable2 node = (Linkable2) this.cache.find(key);
		if (node != null) {
			this.order.push(node, -20038);
		}
		return node;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZJ)V")
	public final void method667(boolean arg0, long arg1) {
		field1722++;
		if (!arg0) {
			return;
		}
		Linkable2 var4 = (Linkable2) this.cache.find(arg1);
		if (var4 != null) {
			var4.unlink();
			var4.unlink2(192);
			this.field1731++;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLea;)Ltj;")
	public static final class217 method668(byte arg0, Packet arg1) {
		field1724++;
		if (arg0 != -15) {
			method669(-7, -118, -106, 60);
		}
		class217 var2 = new class217();
		var2.field4060 = arg1.g2();
		var2.field4067 = class168.method1152((byte) 62, var2.field4060);
		return var2;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
	public static final void method669(int arg0, int arg1, int arg2, int arg3) {
		field1726++;
		if (class119.field2174 == arg3 || arg0 == 0 || IfType.field3447 >= 50 || arg2 == -1) {
			return;
		}
		class25.field397[IfType.field3447] = arg2;
		class110.field2018[IfType.field3447] = arg0;
		class8.field116[IfType.field3447] = arg1;
		class237.field4419[IfType.field3447] = null;
		class145.field2728[IfType.field3447] = 0;
		IfType.field3447++;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public static void method670(byte arg0) {
		field1721 = null;
		field1735 = null;
		field1732 = null;
		if (arg0 >= -67) {
			method669(47, -52, 18, -28);
		}
		field1734 = null;
		field1733 = null;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public final void method671(int arg0) {
		if (arg0 <= 1) {
			return;
		}
		while (true) {
			Linkable2 var2 = this.order.method1384(0);
			if (var2 == null) {
				this.field1731 = this.field1730;
				field1725++;
				return;
			}
			var2.unlink();
			var2.unlink2(192);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Lg;")
	public final Linkable method672(boolean arg0) {
		if (!arg0) {
			field1735 = null;
		}
		field1727++;
		return this.cache.method1049(0);
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
	public class92(int arg0) {
		this.field1730 = arg0;
		this.field1731 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.cache = new HashTable(var2);
	}

	static {
		for (int var0 = 0; var0 < 4096; var0++) {
			field1721[var0] = class54.method394(var0, -123);
		}
		field1732 = new int[]{1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0};
		field1733 = new CRC32();
		field1734 = class208.method1425("title_mute");
	}
}
