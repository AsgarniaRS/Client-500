import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class ClientScript extends class136 {

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
	public static int field4514 = 0;

	@OriginalMember(owner = "client!wh", name = "V", descriptor = "Lsb;")
	public static class198 field4529 = null;

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "Li;")
	public static JString field4518 = class208.method1425("cookiehost");

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "Li;")
	private static JString field4515 = class208.method1425("Unexpected server response)3");

	@OriginalMember(owner = "client!wh", name = "S", descriptor = "Li;")
	public static JString field4526 = field4515;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "[Z")
	public static boolean[] field4513 = new boolean[112];

	@OriginalMember(owner = "client!wh", name = "X", descriptor = "Li;")
	private static JString field4531 = class208.method1425("Loaded update list");

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "Li;")
	public static JString field4517 = field4531;

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
	public int field4519;

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
	public int stringArgCount;

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
	public int intArgCount;

	@OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
	public static int field4525;

	@OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
	public int field4528;

	@OriginalMember(owner = "client!wh", name = "Y", descriptor = "Li;")
	public JString name;

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "[I")
	public int[] instructions;

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "[I")
	public int[] intOperands;

	@OriginalMember(owner = "client!wh", name = "W", descriptor = "[I")
	public static int[] field4530;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "[Lob;")
	public class154[] field4516;

	@OriginalMember(owner = "client!wh", name = "T", descriptor = "[Lrc;")
	public static class188[] field4527;

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "[Li;")
	public JString[] stringOperands;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
	public static void method1611(byte arg0) {
		field4530 = null;
		if (arg0 != -36) {
			method1611((byte) -7);
		}
		field4529 = null;
		field4513 = null;
		field4527 = null;
		field4526 = null;
		field4515 = null;
		field4531 = null;
		field4518 = null;
		field4517 = null;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lwh;")
	public static final ClientScript get(int arg0, int arg1) {
		ClientScript var2 = (ClientScript) class33.cache.method666((long) arg0, arg1);
		if (var2 != null) {
			return var2;
		}

		byte[] var3 = class18.field300.method941((byte) 56, 0, arg0);
		if (var3 == null) {
			return null;
		}

		ClientScript script = new ClientScript();

		Packet buf = new Packet(var3);
		buf.pos = buf.data.length - 2;

		int var6 = buf.g2();
		int var7 = buf.data.length - var6 - 2 - 12;
		buf.pos = var7;
		int var8 = buf.g4();
		script.field4528 = buf.g2();
		script.field4519 = buf.g2();
		script.intArgCount = buf.g2();
		script.stringArgCount = buf.g2();
		int var9 = buf.g1();
		if (var9 > 0) {
			script.field4516 = new class154[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = buf.g2();
				class154 var12 = new class154(class184.method1298(true, var11));
				script.field4516[var10] = var12;
				while (var11-- > 0) {
					int var13 = buf.g4();
					int var14 = buf.g4();
					var12.put((long) var13, new class192(var14), ~arg1);
				}
			}
		}
		int var15 = 0;

		buf.pos = 0;
		script.name = buf.fastgstr();

		script.stringOperands = new JString[var8];
		script.instructions = new int[var8];
		script.intOperands = new int[var8];

		while (var7 > buf.pos) {
			int op = buf.g2();
			if (op == 3) {
				script.stringOperands[var15] = buf.gjstr();
			} else if (op >= 100 || op == 21 || op == 38 || op == 39) {
				script.intOperands[var15] = buf.g1();
			} else {
				script.intOperands[var15] = buf.g4();
			}
			script.instructions[var15++] = op;
		}
		class33.cache.put((long) arg0, script, false);
		return script;
	}
}
