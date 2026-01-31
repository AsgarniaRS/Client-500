import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.util.Date;

@OriginalClass("client!md")
public class class135 extends class23 {

	@OriginalMember(owner = "client!md", name = "S", descriptor = "I")
	public static int field2508 = -1;

	@OriginalMember(owner = "client!md", name = "U", descriptor = "[I")
	public static int[] field2510 = new int[]{2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2};

	@OriginalMember(owner = "client!md", name = "eb", descriptor = "Li;")
	public static JString field2520 = class208.method1425("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
	public static int field2506;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "I")
	private int field2507;

	@OriginalMember(owner = "client!md", name = "T", descriptor = "I")
	public static int field2509;

	@OriginalMember(owner = "client!md", name = "V", descriptor = "I")
	public static int field2511;

	@OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
	public static int field2514;

	@OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
	public static int field2515;

	@OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
	public static int field2517;

	@OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
	public static int field2518;

	@OriginalMember(owner = "client!md", name = "db", descriptor = "I")
	public static int field2519;

	@OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
	public static int field2521;

	@OriginalMember(owner = "client!md", name = "gb", descriptor = "I")
	private int field2522;

	@OriginalMember(owner = "client!md", name = "hb", descriptor = "I")
	public static int field2523;

	@OriginalMember(owner = "client!md", name = "ib", descriptor = "I")
	private int field2524;

	@OriginalMember(owner = "client!md", name = "ab", descriptor = "Lq;")
	public static IfType field2516;

	@OriginalMember(owner = "client!md", name = "W", descriptor = "[I")
	public static int[] field2512;

	@OriginalMember(owner = "client!md", name = "X", descriptor = "[[[I")
	public static int[][][] field2513;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	public class135() {
		this(0);
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
	private class135(int arg0) {
		super(0, false);
		this.method901(arg0, (byte) -88);
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
	public static void method898(byte arg0) {
		field2510 = null;
		field2520 = null;
		field2512 = null;
		if (arg0 != -1) {
			method902(12, 76L);
		}
		field2513 = null;
		field2516 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lcg;IIIIII)Lcg;")
	public static final class30 method899(class30 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		++field2506;
		long var7 = (long) arg4;
		class30 var9 = (class30) class108.field1958.method135(-108, var7);
		if (var9 == null) {
			ModelUnlit var10 = ModelUnlit.load(class233.field4367, arg4, 0);
			if (var10 == null) {
				return null;
			}
			var9 = var10.light(64, 768, -50, -10, -50);
			class108.field1958.method130(37, var7, var9);
		}
		int var11 = arg0.method194();
		int var12 = arg0.method196();
		int var13 = arg0.method186();
		int var14 = arg0.method198();
		class30 var15 = var9.method185(true, true);
		if (~arg5 != -1) {
			var15.method188(arg5);
		}
		class125 var16 = (class125) var15;
		if (~arg6 != ~class239.method1586(arg3 + var11, arg2 + var13, arg1 + 21512, class149.field2909) || ~class239.method1586(arg3 + var12, arg2 + var14, 2, class149.field2909) != ~arg6) {
			for (int var17 = 0; var16.field2273 > var17; ++var17) {
				var16.field2288[var17] += class239.method1586(var16.field2266[var17] + arg3, var16.field2289[var17] - -arg2, 2, class149.field2909) - arg6;
			}
			var16.field2260 = false;
		}
		if (arg1 != -21510) {
			field2508 = -30;
		}
		return var15;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lnb;I)V")
	public static final void method900(Js5 arg0, int arg1) {
		class31.field506 = arg0;
		if (arg1 == 28809) {
			++field2511;
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(IB)V")
	private void method901(int arg0, byte arg1) {
		if (arg1 == -88) {
			++field2521;
			this.field2524 = 4080 & arg0 >> 4;
			this.field2522 = (255 & arg0) << 4;
			this.field2507 = arg0 >> 12 & 4080;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IJ)V")
	private static void method902(int arg0, long arg1) {
		if (arg0 <= 53) {
			field2512 = null;
		}
		++field2523;
		if (~arg1 != -1L) {
			++class210.field3988;
			Isaac.out.method30(58);
			Isaac.out.p8(arg1);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLi;)Z")
	public static final boolean method903(byte arg0, JString arg1) {
		++field2518;
		if (arg1 == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < Isaac.field2731; ++var2) {
				if (arg1.equalsIgnoreCase(class23.field370[var2])) {
					return true;
				}
			}
			if (arg0 >= -36) {
				field2514 = -46;
			}
			return arg1.equalsIgnoreCase(class240.field4458.name);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLde;I)V")
	public static void executeScript(class39 req, int arg2) {
		Object[] onop = req.field681;
		int id = (Integer) onop[0];

		ClientScript script = ClientScript.get(id, 0);
		if (script == null) {
			return;
		}

		int isp = 0;
		int ssp = 0;
		class230.fp = 0;
		int pc = -1;
		int[] instructions = script.instructions;
		int[] intOperands = script.intOperands;
		byte var10 = -1;

		try {
			class242.intLocals = new int[script.field4528];
			class153.stringLocals = new JString[script.field4519];
			int stringCount = 0;
			int intCount = 0;

			for (int i = 1; i < onop.length; i++) {
				if (onop[i] instanceof Integer) {
					int op = (Integer) onop[i];

					if (op == -2147483647) {
						op = req.field694;
					} else if (op == -2147483646) {
						op = req.field691;
					} else if (op == -2147483645) {
						op = req.field678 == null ? -1 : req.field678.parentId;
					} else if (~op == 2147483643) {
						op = req.field679;
					} else if (~op == 2147483642) {
						op = req.field678 != null ? req.field678.field3408 : -1;
					} else if (~op == 2147483641) {
						op = req.field676 == null ? -1 : req.field676.parentId;
					} else if (~op == 2147483640) {
						op = req.field676 != null ? req.field676.field3408 : -1;
					} else if (~op == 2147483639) {
						op = req.field682;
					} else if (~op == 2147483638) {
						op = req.field692;
					}

					class242.intLocals[intCount++] = op;
				} else if (onop[i] instanceof JString) {
					JString op = (JString) onop[i];
					if (op.method597(-112, class194.field3709)) {
						op = req.opbase;
					}
					class153.stringLocals[stringCount++] = op;
				}
			}
			int opcount = 0;
			label2553:
			while (true) {
				++opcount;
				if (~arg2 > ~opcount) {
					throw new RuntimeException("slow");
				}
				++pc;
				int opcode = instructions[pc];

				if (opcode < 100) {
					if (opcode == 0) {
						// push_constant_int
						class108.intStack[isp++] = intOperands[pc];
						continue;
					}
					if (opcode == 1) {
						// push_varp
						int var18 = intOperands[pc];
						class108.intStack[isp++] = class113.var[var18];
						continue;
					}
					if (opcode == 2) {
						// pop_varp
						int var19 = intOperands[pc];
						isp--;
						class113.var[var19] = class108.intStack[isp];
						continue;
					}
					if (opcode == 3) {
						// push_constant_string
						class171.stringStack[ssp++] = script.stringOperands[pc];
						continue;
					}
					if (opcode == 6) {
						// branch
						pc += intOperands[pc];
						continue;
					}
					if (opcode == 7) {
						// branch_not
						isp -= 2;
						if (class108.intStack[isp - -1] != class108.intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 8) {
						// branch_equals
						isp -= 2;
						if (class108.intStack[isp + 1] == class108.intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 9) {
						// branch_less_than
						isp -= 2;
						if (class108.intStack[isp + 1] > class108.intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 10) {
						// branch_greater_than
						isp -= 2;
						if (~class108.intStack[isp] < ~class108.intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 21) {
						// return
						if (class230.fp == 0) {
							return;
						}

						class141 frame = class80.frames[--class230.fp];
						class153.stringLocals = frame.field2606;
						class242.intLocals = frame.field2601;
						script = frame.script;
						pc = frame.pc;
						intOperands = script.intOperands;
						instructions = script.instructions;
						continue;
					}
					if (opcode == 25) {
						// push_varbit
						int varbitId = intOperands[pc];
						class108.intStack[isp++] = class142.getVarbit(varbitId);
						continue;
					}
					if (opcode == 27) {
						int var22 = intOperands[pc];
						--isp;
						SeqType.method757(var22, class108.intStack[isp], 68);
						continue;
					}
					if (opcode == 31) {
						// branch_less_than_or_equals
						isp -= 2;
						if (class108.intStack[isp + 1] >= class108.intStack[isp]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 32) {
						// branch_greater_than_or_equals
						isp -= 2;
						if (class108.intStack[isp] >= class108.intStack[isp + 1]) {
							pc += intOperands[pc];
						}
						continue;
					}
					if (opcode == 33) {
						// push_int_local
						class108.intStack[isp++] = class242.intLocals[intOperands[pc]];
						continue;
					}

					if (opcode == 34) {
						// pop_int_local
						int var10001 = intOperands[pc];

						isp--;
						class242.intLocals[var10001] = class108.intStack[isp];
						continue;
					}
					if (opcode == 35) {
						// push_string_local
						class171.stringStack[ssp++] = class153.stringLocals[intOperands[pc]];
						continue;
					}
					if (opcode == 36) {
						// pop_string_local
						int var10001 = intOperands[pc];
						ssp--;
						class153.stringLocals[var10001] = class171.stringStack[ssp];
						continue;
					}
					if (opcode == 37) {
						// join_string
						int var23 = intOperands[pc];
						ssp -= var23;

						JString string = class165.method1135(var23, class171.stringStack, -49, ssp);
						class171.stringStack[ssp++] = string;
						continue;
					}
					if (opcode == 38) {
						// pop_int_discard
						isp--;
						continue;
					}
					if (opcode == 39) {
						// pop_string_discard
						ssp--;
						continue;
					}
					if (opcode == 40) {
						int var25 = intOperands[pc];
						ClientScript proc = ClientScript.get(var25, 0);

						JString[] procStringLocals = new JString[proc.field4519];
						int[] procIntlocals = new int[proc.field4528];

						for (int i = 0; i < proc.intArgCount; i++) {
							procIntlocals[i] = class108.intStack[-proc.intArgCount + i + isp];
						}

						for (int i = 0; i < proc.stringArgCount; i++) {
							procStringLocals[i] = class171.stringStack[-proc.stringArgCount + ssp + i];
						}

						isp -= proc.intArgCount;
						ssp -= proc.stringArgCount;

						class141 frame = new class141();
						frame.script = script;
						frame.field2606 = class153.stringLocals;
						frame.pc = pc;
						frame.field2601 = class242.intLocals;
						if (class230.fp >= class80.frames.length) {
							throw new RuntimeException();
						}
						script = proc;
						pc = -1;
						class80.frames[class230.fp++] = frame;
						instructions = proc.instructions;
						class242.intLocals = procIntlocals;
						intOperands = proc.intOperands;
						class153.stringLocals = procStringLocals;
						continue;
					}
					if (opcode == 42) {
						// push_varc_int
						class108.intStack[isp++] = class119.varcInt[intOperands[pc]];
						continue;
					}
					if (opcode == 43) {
						// pop_varc_int
						int var10001 = intOperands[pc];

						isp--;
						class119.varcInt[var10001] = class108.intStack[isp];
						continue;
					}
					if (opcode == 44) {
						// define_array
						int var32 = intOperands[pc] >> 16;
						--isp;
						int var33 = class108.intStack[isp];
						int var34 = 65535 & intOperands[pc];
						if (var33 >= 0 && var33 <= 5000) {
							class95.field1763[var32] = var33;
							byte var35 = -1;
							if (var34 == 105) {
								var35 = 0;
							}
							int var36 = 0;
							while (true) {
								if (var36 >= var33) {
									continue label2553;
								}
								class16.field247[var32][var36] = var35;
								++var36;
							}
						}
						throw new RuntimeException();
					}
					if (opcode == 45) {
						// push_array_int
						int var37 = intOperands[pc];
						--isp;
						int var38 = class108.intStack[isp];
						if (var38 >= 0 && class95.field1763[var37] > var38) {
							class108.intStack[isp++] = class16.field247[var37][var38];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 46) {
						// pop_array_int
						isp -= 2;
						int var39 = class108.intStack[isp];
						int var40 = intOperands[pc];
						if (var39 >= 0 && ~var39 > ~class95.field1763[var40]) {
							class16.field247[var40][var39] = class108.intStack[isp - -1];
							continue;
						}
						throw new RuntimeException();
					}
					if (opcode == 47) {
						// push_varc_str
						JString var41 = class7.varcStr[intOperands[pc]];
						if (var41 == null) {
							var41 = class14.field207;
						}
						class171.stringStack[ssp++] = var41;
						continue;
					}
					if (opcode == 48) {
						// pop_varc_str
						int var10001 = intOperands[pc];
						ssp--;
						class7.varcStr[var10001] = class171.stringStack[ssp];
						continue;
					}
					if (opcode == 51) {
						HashTable var42 = script.field4516[intOperands[pc]];
						--isp;
						class192 var43 = (class192) var42.find((long) class108.intStack[isp]);
						if (var43 != null) {
							pc += var43.field3700;
						}
						continue;
					}
				}

				boolean secondary;
				if (intOperands[pc] == 1) {
					secondary = true;
				} else {
					secondary = false;
				}

				if (opcode > 300) {
					if (opcode == 100) {
						isp -= 3;
						int var45 = class108.intStack[isp];
						int var46 = class108.intStack[isp + 1];
						int var47 = class108.intStack[isp + 2];
						if (var46 == 0) {
							throw new RuntimeException();
						}

						IfType var48 = class239.method1581(-64, var45);
						if (var48.field3467 == null) {
							var48.field3467 = new IfType[var47 + 1];
						}

						if (var47 >= var48.field3467.length) {
							IfType[] var49 = new IfType[var47 + 1];
							for (int var50 = 0; var48.field3467.length > var50; ++var50) {
								var49[var50] = var48.field3467[var50];
							}
							var48.field3467 = var49;
						}

						if (~var47 < -1 && var48.field3467[var47 - 1] == null) {
							throw new RuntimeException("Gap at:" + (var47 + -1));
						}

						IfType var51 = new IfType();
						var51.v3 = true;
						var51.field3408 = var47;
						var51.type = var46;
						var51.layerId = var51.parentId = var48.parentId;
						var48.field3467[var47] = var51;
						if (secondary) {
							class203.field3873 = var51;
						} else {
							class129.field2428 = var51;
						}
						class200.method1373(65280, var48);
						continue;
					}
					if (~opcode == -102) {
						IfType var52 = !secondary ? class129.field2428 : class203.field3873;
						if (var52.field3408 == -1) {
							if (secondary) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						IfType var53 = class239.method1581(-64, var52.parentId);
						var53.field3467[var52.field3408] = null;
						class200.method1373(65280, var53);
						continue;
					}
					if (opcode == 102) {
						--isp;
						IfType var54 = class239.method1581(-64, class108.intStack[isp]);
						var54.field3467 = null;
						class200.method1373(65280, var54);
						continue;
					}
					if (opcode == 200) {
						isp -= 2;
						int var55 = class108.intStack[isp + 1];
						int var56 = class108.intStack[isp];
						IfType var57 = class36.method238(var55, var56, true);
						if (var57 != null && ~var55 != 0) {
							class108.intStack[isp++] = 1;
							if (!secondary) {
								class129.field2428 = var57;
							} else {
								class203.field3873 = var57;
							}
							continue;
						}
						class108.intStack[isp++] = 0;
						continue;
					}
					if (opcode == 201) {
						--isp;
						int var58 = class108.intStack[isp];
						IfType var59 = class239.method1581(-64, var58);
						if (var59 == null) {
							class108.intStack[isp++] = 0;
						} else {
							class108.intStack[isp++] = 1;
							if (secondary) {
								class203.field3873 = var59;
							} else {
								class129.field2428 = var59;
							}
						}
						continue;
					}
				} else if (~opcode <= -501) {
					if ((opcode < 1000 || ~opcode <= -1101) && (opcode < 2000 || ~opcode <= -2101)) {
						if ((~opcode > -1101 || ~opcode <= -1201) && (~opcode > -2101 || ~opcode <= -2201)) {
							if (opcode >= 1200 && opcode < 1300 || ~opcode <= -2201 && ~opcode > -2301) {
								IfType var60;
								if (opcode >= 2000) {
									opcode -= 1000;
									--isp;
									var60 = class239.method1581(-64, class108.intStack[isp]);
								} else {
									var60 = secondary ? class203.field3873 : class129.field2428;
								}
								class200.method1373(65280, var60);
								if (opcode == 1200 || ~opcode == -1206) {
									isp -= 2;
									int var61 = class108.intStack[isp + 1];
									int var62 = class108.intStack[isp];
									if (~var62 == 0) {
										var60.field3401 = -1;
										var60.model1Id = -1;
										var60.field3432 = 1;
									} else {
										var60.field3401 = var62;
										var60.field3484 = var61;
										class149 var63 = class71.method472(var62, (byte) -122);
										var60.field3367 = var63.field2878;
										var60.field3511 = var63.field2874;
										var60.field3500 = var63.field2872;
										if (~opcode == -1206) {
											var60.field3466 = false;
										} else {
											var60.field3466 = true;
										}
										var60.field3457 = var63.field2875;
										var60.field3519 = var63.field2849;
										var60.field3487 = var63.field2891;
										if (var60.field3470 > 0) {
											var60.field3487 = var60.field3487 * 32 / var60.field3470;
										} else if (~var60.height < -1) {
											var60.field3487 = var60.field3487 * 32 / var60.height;
										}
									}
									continue;
								}
								if (~opcode == -1202) {
									var60.field3432 = 2;
									--isp;
									var60.model1Id = class108.intStack[isp];
									continue;
								}
								if (opcode == 1202) {
									var60.field3432 = 3;
									var60.model1Id = class240.field4458.field768.method1429(108);
									continue;
								}
								if (opcode == 1203) {
									var60.field3432 = 6;
									--isp;
									var60.model1Id = class108.intStack[isp];
									continue;
								}
								if (opcode == 1204) {
									var60.field3432 = 5;
									--isp;
									var60.model1Id = class108.intStack[isp];
									continue;
								}
							} else if ((~opcode > -1301 || opcode >= 1400) && (~opcode > -2301 || opcode >= 2400)) {
								if (opcode >= 1400 && opcode < 1500 || ~opcode <= -2401 && ~opcode > -2501) {
									int[] var64 = null;
									IfType var65;
									if (~opcode > -2001) {
										var65 = !secondary ? class129.field2428 : class203.field3873;
									} else {
										--isp;
										var65 = class239.method1581(-64, class108.intStack[isp]);
										opcode -= 1000;
									}
									--ssp;
									JString var66 = class171.stringStack[ssp];
									if (var66.length() > 0 && ~var66.method599(255, -1 + var66.length()) == -90) {
										--isp;
										int var67 = class108.intStack[isp];
										if (~var67 < -1) {
											var64 = new int[var67];
											while (~(var67--) < -1) {
												--isp;
												var64[var67] = class108.intStack[isp];
											}
										}
										var66 = var66.method623(0, (byte) -107, -1 + var66.length());
									}
									Object[] var68 = new Object[var66.length() - -1];
									for (int var69 = var68.length - 1; var69 >= 1; --var69) {
										if (var66.method599(255, var69 + -1) == 115) {
											--ssp;
											var68[var69] = class171.stringStack[ssp];
										} else {
											--isp;
											var68[var69] = new Integer(class108.intStack[isp]);
										}
									}
									--isp;
									int var70 = class108.intStack[isp];
									if (var70 != -1) {
										var68[0] = new Integer(var70);
									} else {
										var68 = null;
									}
									if (~opcode == -1418) {
										var65.field3473 = var68;
									}
									if (opcode == 1403) {
										var65.field3372 = var68;
									}
									if (opcode == 1421) {
										var65.field3383 = var68;
									}
									if (opcode == 1407) {
										var65.field3483 = var68;
										var65.field3452 = var64;
									}
									if (opcode == 1408) {
										var65.field3460 = var68;
									}
									if (~opcode == -1413) {
										var65.field3512 = var68;
									}
									if (~opcode == -1419) {
										var65.field3520 = var68;
									}
									if (opcode == 1405) {
										var65.field3458 = var68;
									}
									if (opcode == 1402) {
										var65.field3410 = var68;
									}
									if (~opcode == -1421) {
										var65.field3486 = var68;
									}
									if (~opcode == -1401) {
										var65.field3492 = var68;
									}
									if (~opcode == -1426) {
										var65.field3507 = var68;
									}
									if (~opcode == -1405) {
										var65.field3450 = var68;
									}
									if (opcode == 1427) {
										var65.field3428 = var68;
									}
									if (~opcode == -1424) {
										var65.field3436 = var68;
									}
									if (opcode == 1401) {
										var65.field3505 = var68;
									}
									if (~opcode == -1423) {
										var65.field3446 = var68;
									}
									if (~opcode == -1410) {
										var65.field3403 = var68;
									}
									if (~opcode == -1420) {
										var65.field3379 = var68;
									}
									if (opcode == 1414) {
										var65.field3445 = var68;
										var65.field3371 = var64;
									}
									if (~opcode == -1407) {
										var65.field3442 = var68;
									}
									var65.hashook = true;
									if (opcode == 1411) {
										var65.field3454 = var68;
									}
									if (~opcode == -1416) {
										var65.field3400 = var64;
										var65.field3456 = var68;
									}
									if (opcode == 1416) {
										var65.field3449 = var68;
									}
									if (opcode == 1424) {
										var65.field3497 = var68;
									}
									if (~opcode == -1411) {
										var65.field3414 = var68;
									}
									continue;
								}
								if (opcode < 1600) {
									IfType var71 = !secondary ? class129.field2428 : class203.field3873;
									if (~opcode == -1501) {
										class108.intStack[isp++] = var71.field3368;
										continue;
									}
									if (~opcode == -1502) {
										class108.intStack[isp++] = var71.field3443;
										continue;
									}
									if (opcode == 1502) {
										class108.intStack[isp++] = var71.field3382;
										continue;
									}
									if (opcode == 1503) {
										class108.intStack[isp++] = var71.field3424;
										continue;
									}
									if (opcode == 1504) {
										class108.intStack[isp++] = var71.hide ? 1 : 0;
										continue;
									}
									if (opcode == 1505) {
										class108.intStack[isp++] = var71.layerId;
										continue;
									}
								} else if (opcode < 1700) {
									IfType var72 = secondary ? class203.field3873 : class129.field2428;
									if (~opcode == -1601) {
										class108.intStack[isp++] = var72.field3395;
										continue;
									}
									if (opcode == 1601) {
										class108.intStack[isp++] = var72.field3417;
										continue;
									}
									if (~opcode == -1603) {
										class171.stringStack[ssp++] = var72.text;
										continue;
									}
									if (opcode == 1603) {
										class108.intStack[isp++] = var72.field3386;
										continue;
									}
									if (opcode == 1604) {
										class108.intStack[isp++] = var72.scrollHeight;
										continue;
									}
									if (~opcode == -1606) {
										class108.intStack[isp++] = var72.field3487;
										continue;
									}
									if (~opcode == -1607) {
										class108.intStack[isp++] = var72.field3457;
										continue;
									}
									if (~opcode == -1608) {
										class108.intStack[isp++] = var72.field3519;
										continue;
									}
									if (~opcode == -1609) {
										class108.intStack[isp++] = var72.field3511;
										continue;
									}
									if (~opcode == -1610) {
										class108.intStack[isp++] = var72.trans;
										continue;
									}
								} else if (opcode < 1800) {
									IfType var73 = secondary ? class203.field3873 : class129.field2428;
									if (opcode == 1700) {
										class108.intStack[isp++] = var73.field3401;
										continue;
									}
									if (opcode == 1701) {
										if (var73.field3401 == -1) {
											class108.intStack[isp++] = 0;
										} else {
											class108.intStack[isp++] = var73.field3484;
										}
										continue;
									}
									if (opcode == 1702) {
										class108.intStack[isp++] = var73.field3408;
										continue;
									}
								} else if (opcode < 1900) {
									IfType var74 = secondary ? class203.field3873 : class129.field2428;
									if (opcode == 1800) {
										class108.intStack[isp++] = GameShell.method592(1281959627, class80.method530(-881710560, var74));
										continue;
									}
									if (opcode == 1801) {
										--isp;
										int var75 = class108.intStack[isp];
										int var384 = var75 - 1;
										if (var74.opNames != null && var74.opNames.length > var384 && var74.opNames[var384] != null) {
											class171.stringStack[ssp++] = var74.opNames[var384];
											continue;
										}
										class171.stringStack[ssp++] = class81.field1468;
										continue;
									}
									if (~opcode == -1803) {
										if (var74.field3459 != null) {
											class171.stringStack[ssp++] = var74.field3459;
										} else {
											class171.stringStack[ssp++] = class81.field1468;
										}
										continue;
									}
								} else if (opcode < 2600) {
									--isp;
									IfType var76 = class239.method1581(-64, class108.intStack[isp]);
									if (opcode == 2500) {
										class108.intStack[isp++] = var76.field3368;
										continue;
									}
									if (~opcode == -2502) {
										class108.intStack[isp++] = var76.field3443;
										continue;
									}
									if (~opcode == -2503) {
										class108.intStack[isp++] = var76.field3382;
										continue;
									}
									if (~opcode == -2504) {
										class108.intStack[isp++] = var76.field3424;
										continue;
									}
									if (opcode == 2504) {
										class108.intStack[isp++] = var76.hide ? 1 : 0;
										continue;
									}
									if (opcode == 2505) {
										class108.intStack[isp++] = var76.layerId;
										continue;
									}
								} else if (opcode < 2700) {
									--isp;
									IfType var77 = class239.method1581(-64, class108.intStack[isp]);
									if (opcode == 2600) {
										class108.intStack[isp++] = var77.field3395;
										continue;
									}
									if (~opcode == -2602) {
										class108.intStack[isp++] = var77.field3417;
										continue;
									}
									if (~opcode == -2603) {
										class171.stringStack[ssp++] = var77.text;
										continue;
									}
									if (~opcode == -2604) {
										class108.intStack[isp++] = var77.field3386;
										continue;
									}
									if (opcode == 2604) {
										class108.intStack[isp++] = var77.scrollHeight;
										continue;
									}
									if (~opcode == -2606) {
										class108.intStack[isp++] = var77.field3487;
										continue;
									}
									if (~opcode == -2607) {
										class108.intStack[isp++] = var77.field3457;
										continue;
									}
									if (~opcode == -2608) {
										class108.intStack[isp++] = var77.field3519;
										continue;
									}
									if (~opcode == -2609) {
										class108.intStack[isp++] = var77.field3511;
										continue;
									}
									if (opcode == 2609) {
										class108.intStack[isp++] = var77.trans;
										continue;
									}
								} else if (opcode >= 2800) {
									if (~opcode > -2901) {
										--isp;
										IfType var78 = class239.method1581(-64, class108.intStack[isp]);
										if (opcode == 2800) {
											class108.intStack[isp++] = GameShell.method592(1281959627, class80.method530(-881710560, var78));
											continue;
										}
										if (~opcode == -2802) {
											--isp;
											int var79 = class108.intStack[isp];
											int var385 = var79 - 1;
											if (var78.opNames != null && ~var78.opNames.length < ~var385 && var78.opNames[var385] != null) {
												class171.stringStack[ssp++] = var78.opNames[var385];
												continue;
											}
											class171.stringStack[ssp++] = class81.field1468;
											continue;
										}
										if (~opcode == -2803) {
											if (var78.field3459 != null) {
												class171.stringStack[ssp++] = var78.field3459;
											} else {
												class171.stringStack[ssp++] = class81.field1468;
											}
											continue;
										}
									} else if (~opcode <= -3201) {
										if (~opcode > -3301) {
											if (~opcode == -3201) {
												isp -= 3;
												class92.method669(class108.intStack[isp + 1], class108.intStack[isp + 2], class108.intStack[isp], 0);
												continue;
											}
											if (opcode == 3201) {
												--isp;
												class116.method790((byte) -73, class108.intStack[isp]);
												continue;
											}
											if (opcode == 3202) {
												isp -= 2;
												class4.method23(true, class108.intStack[isp], class108.intStack[isp + 1]);
												continue;
											}
										} else if (opcode >= 3400) {
											if (~opcode <= -3501) {
												if (opcode < 3700) {
													if (opcode == 3600) {
														if (~class115.field2080 == -1) {
															class108.intStack[isp++] = -2;
														} else if (class115.field2080 != 1) {
															class108.intStack[isp++] = Isaac.field2731;
														} else {
															class108.intStack[isp++] = -1;
														}
														continue;
													}
													if (opcode == 3601) {
														--isp;
														int var80 = class108.intStack[isp];
														if (~class115.field2080 == -3 && ~var80 > ~Isaac.field2731) {
															class171.stringStack[ssp++] = class23.field370[var80];
															continue;
														}
														class171.stringStack[ssp++] = class81.field1468;
														continue;
													}
													if (~opcode == -3603) {
														--isp;
														int var81 = class108.intStack[isp];
														if (class115.field2080 == 2 && var81 < Isaac.field2731) {
															class108.intStack[isp++] = class160.field3094[var81];
															continue;
														}
														class108.intStack[isp++] = 0;
														continue;
													}
													if (opcode == 3603) {
														--isp;
														int var82 = class108.intStack[isp];
														if (~class115.field2080 == -3 && var82 < Isaac.field2731) {
															class108.intStack[isp++] = Packet.field845[var82];
															continue;
														}
														class108.intStack[isp++] = 0;
														continue;
													}
													if (opcode == 3604) {
														--ssp;
														JString var83 = class171.stringStack[ssp];
														--isp;
														int var84 = class108.intStack[isp];
														class171.method1215(var83, var84, 0);
														continue;
													}
													if (~opcode == -3606) {
														--ssp;
														JString var85 = class171.stringStack[ssp];
														class12.method64(-42, var85.method630(false));
														continue;
													}
													if (opcode == 3606) {
														--ssp;
														JString var86 = class171.stringStack[ssp];
														class114.method779(-16, var86.method630(false));
														continue;
													}
													if (~opcode == -3608) {
														--ssp;
														JString var87 = class171.stringStack[ssp];
														class11.method55(-8, var87.method630(false));
														continue;
													}
													if (~opcode == -3609) {
														--ssp;
														JString var88 = class171.stringStack[ssp];
														Isaac.method975(0, var88.method630(false));
														continue;
													}
													if (~opcode == -3610) {
														--ssp;
														JString var89 = class171.stringStack[ssp];
														if (var89.startsWith(class177.field3556) || var89.startsWith(class164.field3143)) {
															var89 = var89.substring(7);
														}
														class108.intStack[isp++] = !method903((byte) -71, var89) ? 0 : 1;
														continue;
													}
													if (~opcode == -3611) {
														--isp;
														int var90 = class108.intStack[isp];
														if (~class115.field2080 == -3 && Isaac.field2731 > var90) {
															class171.stringStack[ssp++] = class168.field3240[var90];
															continue;
														}
														class171.stringStack[ssp++] = class81.field1468;
														continue;
													}
													if (opcode == 3611) {
														if (class222.field4184 != null) {
															class171.stringStack[ssp++] = class222.field4184.method614((byte) 83);
														} else {
															class171.stringStack[ssp++] = class81.field1468;
														}
														continue;
													}
													if (opcode == 3612) {
														if (class222.field4184 != null) {
															class108.intStack[isp++] = EnumType.field885;
														} else {
															class108.intStack[isp++] = 0;
														}
														continue;
													}
													if (~opcode == -3614) {
														--isp;
														int var91 = class108.intStack[isp];
														if (class222.field4184 != null && EnumType.field885 > var91) {
															class171.stringStack[ssp++] = JString.field1647[var91].field1323.method614((byte) 83);
															continue;
														}
														class171.stringStack[ssp++] = class81.field1468;
														continue;
													}
													if (opcode == 3614) {
														--isp;
														int var92 = class108.intStack[isp];
														if (class222.field4184 != null && ~EnumType.field885 < ~var92) {
															class108.intStack[isp++] = JString.field1647[var92].field1317;
															continue;
														}
														class108.intStack[isp++] = 0;
														continue;
													}
													if (~opcode == -3616) {
														--isp;
														int var93 = class108.intStack[isp];
														if (class222.field4184 != null && ~EnumType.field885 < ~var93) {
															class108.intStack[isp++] = JString.field1647[var93].field1315;
															continue;
														}
														class108.intStack[isp++] = 0;
														continue;
													}
													if (~opcode == -3617) {
														class108.intStack[isp++] = class170.field3303;
														continue;
													}
													if (opcode == 3617) {
														--ssp;
														JString var94 = class171.stringStack[ssp];
														class101.method703(var94, (byte) -121);
														continue;
													}
													if (~opcode == -3619) {
														class108.intStack[isp++] = class143.field2633;
														continue;
													}
													if (opcode == 3619) {
														--ssp;
														JString var95 = class171.stringStack[ssp];
														method902(111, var95.method630(false));
														continue;
													}
													if (~opcode == -3621) {
														class248.method1623((byte) -113);
														continue;
													}
													if (opcode == 3621) {
														if (~class115.field2080 == -1) {
															class108.intStack[isp++] = -1;
														} else {
															class108.intStack[isp++] = Linkable.field1221;
														}
														continue;
													}
													if (opcode == 3622) {
														--isp;
														int var96 = class108.intStack[isp];
														if (class115.field2080 != 0 && var96 < Linkable.field1221) {
															class171.stringStack[ssp++] = class200.method1377(class95.field1765[var96], (byte) 73).method614((byte) 83);
															continue;
														}
														class171.stringStack[ssp++] = class81.field1468;
														continue;
													}
													if (opcode == 3623) {
														--ssp;
														JString var97 = class171.stringStack[ssp];
														if (var97.startsWith(class177.field3556) || var97.startsWith(class164.field3143)) {
															var97 = var97.substring(7);
														}
														class108.intStack[isp++] = !class164.method1132((byte) 66, var97) ? 0 : 1;
														continue;
													}
													if (opcode == 3624) {
														--isp;
														int var98 = class108.intStack[isp];
														if (JString.field1647 != null && EnumType.field885 > var98 && JString.field1647[var98].field1323.equalsIgnoreCase(class240.field4458.name)) {
															class108.intStack[isp++] = 1;
															continue;
														}
														class108.intStack[isp++] = 0;
														continue;
													}
													if (opcode == 3625) {
														if (class225.field4221 == null) {
															class171.stringStack[ssp++] = class81.field1468;
														} else {
															class171.stringStack[ssp++] = class225.field4221.method614((byte) 83);
														}
														continue;
													}
													if (~opcode == -3627) {
														--isp;
														int var99 = class108.intStack[isp];
														if (class222.field4184 != null && EnumType.field885 > var99) {
															class171.stringStack[ssp++] = JString.field1647[var99].field1321;
															continue;
														}
														class171.stringStack[ssp++] = class81.field1468;
														continue;
													}
													if (opcode == 3627) {
														--isp;
														int var100 = class108.intStack[isp];
														if (class115.field2080 == 2 && ~var100 <= -1 && var100 < Isaac.field2731) {
															class108.intStack[isp++] = !GZip.field1120[var100] ? 0 : 1;
															continue;
														}
														class108.intStack[isp++] = 0;
														continue;
													}
													if (~opcode == -3629) {
														--ssp;
														JString var101 = class171.stringStack[ssp];
														if (var101.startsWith(class177.field3556) || var101.startsWith(class164.field3143)) {
															var101 = var101.substring(7);
														}
														class108.intStack[isp++] = class120.method825(var101, 60);
														continue;
													}
												} else if (opcode < 4000) {
													if (~opcode == -3904) {
														--isp;
														int var102 = class108.intStack[isp];
														class108.intStack[isp++] = class9.field140[var102].method884(-126);
														continue;
													}
													if (~opcode == -3905) {
														--isp;
														int var103 = class108.intStack[isp];
														class108.intStack[isp++] = class9.field140[var103].field2457;
														continue;
													}
													if (opcode == 3905) {
														--isp;
														int var104 = class108.intStack[isp];
														class108.intStack[isp++] = class9.field140[var104].field2456;
														continue;
													}
													if (~opcode == -3907) {
														--isp;
														int var105 = class108.intStack[isp];
														class108.intStack[isp++] = class9.field140[var105].field2452;
														continue;
													}
													if (~opcode == -3908) {
														--isp;
														int var106 = class108.intStack[isp];
														class108.intStack[isp++] = class9.field140[var106].field2459;
														continue;
													}
													if (opcode == 3908) {
														--isp;
														int var107 = class108.intStack[isp];
														class108.intStack[isp++] = class9.field140[var107].field2461;
														continue;
													}
													if (~opcode == -3911) {
														--isp;
														int var108 = class108.intStack[isp];
														int var109 = class9.field140[var108].method888((byte) -93);
														class108.intStack[isp++] = var109 != 0 ? 0 : 1;
														continue;
													}
													if (~opcode == -3912) {
														--isp;
														int var110 = class108.intStack[isp];
														int var111 = class9.field140[var110].method888((byte) -93);
														class108.intStack[isp++] = ~var111 != -3 ? 0 : 1;
														continue;
													}
													if (opcode == 3912) {
														--isp;
														int var112 = class108.intStack[isp];
														int var113 = class9.field140[var112].method888((byte) -93);
														class108.intStack[isp++] = var113 != 5 ? 0 : 1;
														continue;
													}
													if (opcode == 3913) {
														--isp;
														int var114 = class108.intStack[isp];
														int var115 = class9.field140[var114].method888((byte) -93);
														class108.intStack[isp++] = ~var115 != -2 ? 0 : 1;
														continue;
													}
												} else if (~opcode > -4101) {
													if (opcode == 4000) {
														isp -= 2;
														int var116 = class108.intStack[isp];
														int var117 = class108.intStack[isp - -1];
														class108.intStack[isp++] = var116 - -var117;
														continue;
													}
													if (opcode == 4001) {
														isp -= 2;
														int var118 = class108.intStack[isp];
														int var119 = class108.intStack[isp + 1];
														class108.intStack[isp++] = -var119 + var118;
														continue;
													}
													if (~opcode == -4003) {
														isp -= 2;
														int var120 = class108.intStack[isp - -1];
														int var121 = class108.intStack[isp];
														class108.intStack[isp++] = var120 * var121;
														continue;
													}
													if (~opcode == -4004) {
														isp -= 2;
														int var122 = class108.intStack[isp];
														int var123 = class108.intStack[isp + 1];
														class108.intStack[isp++] = var122 / var123;
														continue;
													}
													if (opcode == 4004) {
														--isp;
														int var124 = class108.intStack[isp];
														class108.intStack[isp++] = (int) (Math.random() * (double) var124);
														continue;
													}
													if (~opcode == -4006) {
														--isp;
														int var125 = class108.intStack[isp];
														class108.intStack[isp++] = (int) ((double) (var125 + 1) * Math.random());
														continue;
													}
													if (opcode == 4006) {
														isp -= 5;
														int var126 = class108.intStack[isp];
														int var127 = class108.intStack[isp + 1];
														int var128 = class108.intStack[isp + 2];
														int var129 = class108.intStack[isp + 3];
														int var130 = class108.intStack[isp + 4];
														class108.intStack[isp++] = (-var126 + var127) * (-var128 + var130) / (-var128 + var129) + var126;
														continue;
													}
													if (~opcode == -4008) {
														isp -= 2;
														long var131 = (long) class108.intStack[isp + 1];
														long var133 = (long) class108.intStack[isp];
														class108.intStack[isp++] = (int) (var131 * var133 / 100L + var133);
														continue;
													}
													if (~opcode == -4009) {
														isp -= 2;
														int var135 = class108.intStack[isp];
														int var136 = class108.intStack[isp + 1];
														class108.intStack[isp++] = class204.method1405(1 << var136, var135);
														continue;
													}
													if (opcode == 4009) {
														isp -= 2;
														int var137 = class108.intStack[isp - -1];
														int var138 = class108.intStack[isp];
														class108.intStack[isp++] = class70.method470(var138, -1 - (1 << var137));
														continue;
													}
													if (opcode == 4010) {
														isp -= 2;
														int var139 = class108.intStack[isp + 1];
														int var140 = class108.intStack[isp];
														class108.intStack[isp++] = class70.method470(var140, 1 << var139) != 0 ? 1 : 0;
														continue;
													}
													if (~opcode == -4012) {
														isp -= 2;
														int var141 = class108.intStack[isp + 1];
														int var142 = class108.intStack[isp];
														class108.intStack[isp++] = var142 % var141;
														continue;
													}
													if (opcode == 4012) {
														isp -= 2;
														int var143 = class108.intStack[isp];
														int var144 = class108.intStack[isp - -1];
														if (~var143 != -1) {
															class108.intStack[isp++] = (int) Math.pow((double) var143, (double) var144);
														} else {
															class108.intStack[isp++] = 0;
														}
														continue;
													}
													if (opcode == 4013) {
														isp -= 2;
														int var145 = class108.intStack[isp];
														int var146 = class108.intStack[isp - -1];
														if (~var145 != -1) {
															if (var146 == 0) {
																class108.intStack[isp++] = Integer.MAX_VALUE;
															} else {
																class108.intStack[isp++] = (int) Math.pow((double) var145, 1.0D / (double) var146);
															}
														} else {
															class108.intStack[isp++] = 0;
														}
														continue;
													}
													if (~opcode == -4015) {
														isp -= 2;
														int var147 = class108.intStack[isp + 1];
														int var148 = class108.intStack[isp];
														class108.intStack[isp++] = class70.method470(var147, var148);
														continue;
													}
													if (opcode == 4015) {
														isp -= 2;
														int var149 = class108.intStack[isp - -1];
														int var150 = class108.intStack[isp];
														class108.intStack[isp++] = class204.method1405(var150, var149);
														continue;
													}
													if (~opcode == -4017) {
														isp -= 2;
														int var151 = class108.intStack[isp];
														int var152 = class108.intStack[isp - -1];
														class108.intStack[isp++] = var151 < var152 ? var151 : var152;
														continue;
													}
													if (opcode == 4017) {
														isp -= 2;
														int var153 = class108.intStack[isp];
														int var154 = class108.intStack[isp - -1];
														class108.intStack[isp++] = ~var153 >= ~var154 ? var154 : var153;
														continue;
													}
													if (opcode == 4018) {
														isp -= 3;
														long var155 = (long) class108.intStack[isp];
														long var157 = (long) class108.intStack[isp + 1];
														long var159 = (long) class108.intStack[isp + 2];
														class108.intStack[isp++] = (int) (var155 * var159 / var157);
														continue;
													}
												} else if (opcode >= 4200) {
													if (opcode < 4300) {
														if (opcode == 4200) {
															--isp;
															int var161 = class108.intStack[isp];
															class171.stringStack[ssp++] = class71.method472(var161, (byte) -120).field2894;
															continue;
														}
														if (~opcode == -4202) {
															isp -= 2;
															int var162 = class108.intStack[isp];
															int var163 = class108.intStack[isp - -1];
															class149 var164 = class71.method472(var162, (byte) -106);
															if (~var163 <= -2 && ~var163 >= -6 && var164.field2900[var163 + -1] != null) {
																class171.stringStack[ssp++] = var164.field2900[var163 + -1];
																continue;
															}
															class171.stringStack[ssp++] = class81.field1468;
															continue;
														}
														if (opcode == 4202) {
															isp -= 2;
															int var165 = class108.intStack[isp + 1];
															int var166 = class108.intStack[isp];
															class149 var167 = class71.method472(var166, (byte) -119);
															if (var165 >= 1 && var165 <= 5 && var167.field2906[var165 + -1] != null) {
																class171.stringStack[ssp++] = var167.field2906[var165 + -1];
																continue;
															}
															class171.stringStack[ssp++] = class81.field1468;
															continue;
														}
														if (~opcode == -4204) {
															--isp;
															int var168 = class108.intStack[isp];
															class108.intStack[isp++] = class71.method472(var168, (byte) -114).field2856;
															continue;
														}
														if (~opcode == -4205) {
															--isp;
															int var169 = class108.intStack[isp];
															class108.intStack[isp++] = class71.method472(var169, (byte) -105).field2854 == 1 ? 1 : 0;
															continue;
														}
														if (opcode == 4205) {
															--isp;
															int var170 = class108.intStack[isp];
															class149 var171 = class71.method472(var170, (byte) -89);
															if (~var171.field2869 == 0 && ~var171.field2843 <= -1) {
																class108.intStack[isp++] = var171.field2843;
																continue;
															}
															class108.intStack[isp++] = var170;
															continue;
														}
														if (opcode == 4206) {
															--isp;
															int var172 = class108.intStack[isp];
															class149 var173 = class71.method472(var172, (byte) -100);
															if (~var173.field2869 <= -1 && ~var173.field2843 <= -1) {
																class108.intStack[isp++] = var173.field2843;
																continue;
															}
															class108.intStack[isp++] = var172;
															continue;
														}
														if (~opcode == -4208) {
															--isp;
															int var174 = class108.intStack[isp];
															class108.intStack[isp++] = !class71.method472(var174, (byte) -128).field2879 ? 0 : 1;
															continue;
														}
														if (opcode == 4208) {
															isp -= 2;
															int var175 = class108.intStack[isp - -1];
															int var176 = class108.intStack[isp];
															class4 var177 = class216.method1469(var175, (byte) -37);
															if (var177.method17(-19)) {
																class171.stringStack[ssp++] = class71.method472(var176, (byte) -89).method1011(var177.field57, (byte) -121, var175);
															} else {
																class108.intStack[isp++] = class71.method472(var176, (byte) -120).method1012(true, var175, var177.field53);
															}
															continue;
														}
														if (~opcode == -4211) {
															--isp;
															int var178 = class108.intStack[isp];
															--ssp;
															JString var179 = class171.stringStack[ssp];
															class70.method467(0, var178 == 1, var179);
															class108.intStack[isp++] = class204.field3895;
															continue;
														}
														if (opcode == 4211) {
															if (Linkable.field1210 != null && class204.field3895 > class116.field2109) {
																class108.intStack[isp++] = class70.method470(Linkable.field1210[class116.field2109++], 65535);
																continue;
															}
															class108.intStack[isp++] = -1;
															continue;
														}
														if (~opcode == -4213) {
															class116.field2109 = 0;
															continue;
														}
													} else if (opcode < 4400) {
														if (~opcode == -4301) {
															isp -= 2;
															int var180 = class108.intStack[isp];
															int var181 = class108.intStack[isp + 1];
															class4 var182 = class216.method1469(var181, (byte) -77);
															if (!var182.method17(-69)) {
																class108.intStack[isp++] = class147.list(var180).method856(-8931, var182.field53, var181);
															} else {
																class171.stringStack[ssp++] = class147.list(var180).method862(var181, -97, var182.field57);
															}
															continue;
														}
													} else if (opcode >= 4500) {
														if (opcode >= 4600) {
															if (opcode < 5100) {
																if (~opcode == -5001) {
																	class108.intStack[isp++] = Linkable.field1206;
																	continue;
																}
																if (opcode == 5001) {
																	isp -= 3;
																	++class2.field15;
																	Linkable.field1206 = class108.intStack[isp];
																	class10.field142 = class108.intStack[isp - -1];
																	class128.field2410 = class108.intStack[isp + 2];
																	Isaac.out.method30(115);
																	Isaac.out.p1(Linkable.field1206);
																	Isaac.out.p1(class10.field142);
																	Isaac.out.p1(class128.field2410);
																	continue;
																}
																if (~opcode == -5003) {
																	isp -= 2;
																	++class68.field1240;
																	int var183 = class108.intStack[isp];
																	--ssp;
																	JString var184 = class171.stringStack[ssp];
																	int var185 = class108.intStack[isp + 1];
																	Isaac.out.method30(99);
																	Isaac.out.p8(var184.method630(false));
																	Isaac.out.p1(var183 - 1);
																	Isaac.out.p1(var185);
																	continue;
																}
																if (opcode == 5003) {
																	--isp;
																	int var186 = class108.intStack[isp];
																	JString var187 = null;
																	if (~var186 > -101) {
																		var187 = class212.field4021[var186];
																	}
																	if (var187 == null) {
																		var187 = class81.field1468;
																	}
																	class171.stringStack[ssp++] = var187;
																	continue;
																}
																if (~opcode == -5005) {
																	int var188 = -1;
																	--isp;
																	int var189 = class108.intStack[isp];
																	if (~var189 > -101 && class212.field4021[var189] != null) {
																		var188 = class194.field3710[var189];
																	}
																	class108.intStack[isp++] = var188;
																	continue;
																}
																if (~opcode == -5006) {
																	class108.intStack[isp++] = class10.field142;
																	continue;
																}
																if (opcode == 5008) {
																	// chat_sendpublic
																	--ssp;
																	JString message = class171.stringStack[ssp];
																	if (message.startsWith(class120.CHATCOMMAND)) {
																		class97.method684(message, 2);
																		continue;
																	}
																	if (Linkable.field1208 == 0 && (class238.field4430 == 1 || ~class176.field3537 == -2)) {
																		continue;
																	}
																	++class95.field1769;
																	JString colorLower = message.toLowerCase();
																	byte color = 0;
																	if (!colorLower.startsWith(class29.field488)) {
																		if (colorLower.startsWith(class101.field1839)) {
																			color = 1;
																			message = message.substring(class101.field1839.length());
																		} else if (colorLower.startsWith(class138.field2566)) {
																			message = message.substring(class138.field2566.length());
																			color = 2;
																		} else if (colorLower.startsWith(class241.field4469)) {
																			color = 3;
																			message = message.substring(class241.field4469.length());
																		} else if (colorLower.startsWith(class232.field4365)) {
																			message = message.substring(class232.field4365.length());
																			color = 4;
																		} else if (!colorLower.startsWith(class74.field1355)) {
																			if (!colorLower.startsWith(class37.field669)) {
																				if (colorLower.startsWith(class192.field3692)) {
																					color = 7;
																					message = message.substring(class192.field3692.length());
																				} else if (!colorLower.startsWith(class39.field696)) {
																					if (colorLower.startsWith(class200.field3819)) {
																						message = message.substring(class200.field3819.length());
																						color = 9;
																					} else if (!colorLower.startsWith(class160.field3086)) {
																						if (colorLower.startsWith(class192.field3705)) {
																							message = message.substring(class192.field3705.length());
																							color = 11;
																						} else if (NpcType.field2350 != 0) {
																							if (!colorLower.startsWith(class29.field485)) {
																								if (colorLower.startsWith(class101.field1844)) {
																									message = message.substring(class101.field1844.length());
																									color = 1;
																								} else if (colorLower.startsWith(class138.field2563)) {
																									color = 2;
																									message = message.substring(class138.field2563.length());
																								} else if (colorLower.startsWith(class241.field4465)) {
																									color = 3;
																									message = message.substring(class241.field4465.length());
																								} else if (colorLower.startsWith(class232.field4366)) {
																									message = message.substring(class232.field4366.length());
																									color = 4;
																								} else if (colorLower.startsWith(class74.field1354)) {
																									message = message.substring(class74.field1354.length());
																									color = 5;
																								} else if (!colorLower.startsWith(class37.field663)) {
																									if (colorLower.startsWith(class192.field3693)) {
																										color = 7;
																										message = message.substring(class192.field3693.length());
																									} else if (!colorLower.startsWith(class39.field683)) {
																										if (colorLower.startsWith(class200.field3815)) {
																											message = message.substring(class200.field3815.length());
																											color = 9;
																										} else if (!colorLower.startsWith(class160.field3083)) {
																											if (colorLower.startsWith(class192.field3697)) {
																												message = message.substring(class192.field3697.length());
																												color = 11;
																											}
																										} else {
																											color = 10;
																											message = message.substring(class160.field3083.length());
																										}
																									} else {
																										message = message.substring(class39.field683.length());
																										color = 8;
																									}
																								} else {
																									message = message.substring(class37.field663.length());
																									color = 6;
																								}
																							} else {
																								color = 0;
																								message = message.substring(class29.field485.length());
																							}
																						}
																					} else {
																						color = 10;
																						message = message.substring(class160.field3086.length());
																					}
																				} else {
																					message = message.substring(class39.field696.length());
																					color = 8;
																				}
																			} else {
																				message = message.substring(class37.field669.length());
																				color = 6;
																			}
																		} else {
																			message = message.substring(class74.field1355.length());
																			color = 5;
																		}
																	} else {
																		message = message.substring(class29.field488.length());
																		color = 0;
																	}
																	JString var193 = message.toLowerCase();
																	byte var194 = 0;
																	if (!var193.startsWith(class57.field1083)) {
																		if (var193.startsWith(class35.field612)) {
																			message = message.substring(class35.field612.length());
																			var194 = 2;
																		} else if (!var193.startsWith(class71.field1308)) {
																			if (!var193.startsWith(class17.field263)) {
																				if (var193.startsWith(class216.field4052)) {
																					message = message.substring(class216.field4052.length());
																					var194 = 5;
																				} else if (NpcType.field2350 != 0) {
																					if (!var193.startsWith(class57.field1086)) {
																						if (!var193.startsWith(class35.field618)) {
																							if (var193.startsWith(class71.field1313)) {
																								message = message.substring(class71.field1313.length());
																								var194 = 3;
																							} else if (var193.startsWith(class17.field267)) {
																								var194 = 4;
																								message = message.substring(class17.field267.length());
																							} else if (var193.startsWith(class216.field4051)) {
																								var194 = 5;
																								message = message.substring(class216.field4051.length());
																							}
																						} else {
																							message = message.substring(class35.field618.length());
																							var194 = 2;
																						}
																					} else {
																						var194 = 1;
																						message = message.substring(class57.field1086.length());
																					}
																				}
																			} else {
																				var194 = 4;
																				message = message.substring(class17.field263.length());
																			}
																		} else {
																			var194 = 3;
																			message = message.substring(class71.field1308.length());
																		}
																	} else {
																		var194 = 1;
																		message = message.substring(class57.field1083.length());
																	}
																	Isaac.out.method30(189);
																	Isaac.out.p1(0);
																	int var195 = Isaac.out.pos;
																	Isaac.out.p1(color);
																	Isaac.out.p1(var194);
																	class172.method1222(Isaac.out, message, (byte) 113);
																	Isaac.out.psize1(-var195 + Isaac.out.pos);
																	continue;
																}
																if (~opcode == -5010) {
																	ssp -= 2;
																	JString var196 = class171.stringStack[ssp];
																	JString var197 = class171.stringStack[ssp + 1];
																	if (Linkable.field1208 != 0 || ~class238.field4430 != -2 && ~class176.field3537 != -2) {
																		++class176.field3538;
																		Isaac.out.method30(80);
																		Isaac.out.p1(0);
																		int var198 = Isaac.out.pos;
																		Isaac.out.p8(var196.method630(false));
																		class172.method1222(Isaac.out, var197, (byte) 113);
																		Isaac.out.psize1(-var198 + Isaac.out.pos);
																	}
																	continue;
																}
																if (~opcode == -5011) {
																	--isp;
																	int var199 = class108.intStack[isp];
																	JString var200 = null;
																	if (var199 < 100) {
																		var200 = class121.field2208[var199];
																	}
																	if (var200 == null) {
																		var200 = class81.field1468;
																	}
																	class171.stringStack[ssp++] = var200;
																	continue;
																}
																if (opcode == 5011) {
																	JString var201 = null;
																	--isp;
																	int var202 = class108.intStack[isp];
																	if (~var202 > -101) {
																		var201 = class228.field4282[var202];
																	}
																	if (var201 == null) {
																		var201 = class81.field1468;
																	}
																	class171.stringStack[ssp++] = var201;
																	continue;
																}
																if (opcode == 5012) {
																	int var203 = -1;
																	--isp;
																	int var204 = class108.intStack[isp];
																	if (~var204 > -101) {
																		var203 = class133.field2485[var204];
																	}
																	class108.intStack[isp++] = var203;
																	continue;
																}
																if (~opcode == -5016) {
																	JString var205;
																	if (class240.field4458 != null && class240.field4458.name != null) {
																		var205 = class240.field4458.name;
																	} else {
																		var205 = class209.field3969;
																	}
																	class171.stringStack[ssp++] = var205;
																	continue;
																}
																if (opcode == 5016) {
																	class108.intStack[isp++] = class128.field2410;
																	continue;
																}
																if (~opcode == -5018) {
																	class108.intStack[isp++] = class34.field582;
																	continue;
																}
																if (opcode == 5050) {
																	--isp;
																	int var206 = class108.intStack[isp];
																	class171.stringStack[ssp++] = class115.method785(var206, 4).field2130;
																	continue;
																}
																if (opcode == 5051) {
																	--isp;
																	int var207 = class108.intStack[isp];
																	class117 var208 = class115.method785(var207, 4);
																	if (var208.field2118 != null) {
																		class108.intStack[isp++] = var208.field2118.length;
																	} else {
																		class108.intStack[isp++] = 0;
																	}
																	continue;
																}
																if (opcode == 5052) {
																	isp -= 2;
																	int var209 = class108.intStack[isp];
																	int var210 = class108.intStack[isp + 1];
																	class117 var211 = class115.method785(var209, 4);
																	int var212 = var211.field2118[var210];
																	class108.intStack[isp++] = var212;
																	continue;
																}
																if (~opcode == -5054) {
																	--isp;
																	int var213 = class108.intStack[isp];
																	class117 var214 = class115.method785(var213, 4);
																	if (var214.field2123 == null) {
																		class108.intStack[isp++] = 0;
																	} else {
																		class108.intStack[isp++] = var214.field2123.length;
																	}
																	continue;
																}
																if (opcode == 5054) {
																	isp -= 2;
																	int var215 = class108.intStack[isp];
																	int var216 = class108.intStack[isp + 1];
																	class108.intStack[isp++] = class115.method785(var215, 4).field2123[var216];
																	continue;
																}
																if (~opcode == -5056) {
																	--isp;
																	int var217 = class108.intStack[isp];
																	class171.stringStack[ssp++] = class168.method1152((byte) 62, var217).method1412(116);
																	continue;
																}
																if (opcode == 5056) {
																	--isp;
																	int var218 = class108.intStack[isp];
																	class205 var219 = class168.method1152((byte) 62, var218);
																	if (var219.field3918 == null) {
																		class108.intStack[isp++] = 0;
																	} else {
																		class108.intStack[isp++] = var219.field3918.length;
																	}
																	continue;
																}
																if (opcode == 5057) {
																	isp -= 2;
																	int var220 = class108.intStack[isp + 1];
																	int var221 = class108.intStack[isp];
																	class108.intStack[isp++] = class168.method1152((byte) 62, var221).field3918[var220];
																	continue;
																}
																if (opcode == 5058) {
																	class15.field226 = new class217();
																	--isp;
																	class15.field226.field4060 = class108.intStack[isp];
																	class15.field226.field4067 = class168.method1152((byte) 62, class15.field226.field4060);
																	class15.field226.field4070 = new int[class15.field226.field4067.method1409((byte) 19)];
																	continue;
																}
																if (~opcode == -5060) {
																	Isaac.out.method30(197);
																	Isaac.out.p1(0);
																	int var222 = Isaac.out.pos;
																	Isaac.out.p1(0);
																	++class128.field2399;
																	Isaac.out.p2(class15.field226.field4060);
																	class15.field226.field4067.method1416(85, Isaac.out, class15.field226.field4070);
																	Isaac.out.psize1(-var222 + Isaac.out.pos);
																	continue;
																}
																if (opcode == 5060) {
																	++class60.field1135;
																	--ssp;
																	JString var223 = class171.stringStack[ssp];
																	Isaac.out.method30(242);
																	Isaac.out.p1(0);
																	int var224 = Isaac.out.pos;
																	Isaac.out.p8(var223.method630(false));
																	Isaac.out.p2(class15.field226.field4060);
																	class15.field226.field4067.method1416(6, Isaac.out, class15.field226.field4070);
																	Isaac.out.psize1(-var224 + Isaac.out.pos);
																	continue;
																}
																if (~opcode == -5062) {
																	++class128.field2399;
																	Isaac.out.method30(197);
																	Isaac.out.p1(0);
																	int var225 = Isaac.out.pos;
																	Isaac.out.p1(1);
																	Isaac.out.p2(class15.field226.field4060);
																	class15.field226.field4067.method1416(-33, Isaac.out, class15.field226.field4070);
																	Isaac.out.psize1(-var225 + Isaac.out.pos);
																	continue;
																}
																if (opcode == 5062) {
																	isp -= 2;
																	int var226 = class108.intStack[isp - -1];
																	int var227 = class108.intStack[isp];
																	class108.intStack[isp++] = class115.method785(var227, 4).field2121[var226];
																	continue;
																}
																if (opcode == 5063) {
																	isp -= 2;
																	int var228 = class108.intStack[isp + 1];
																	int var229 = class108.intStack[isp];
																	class108.intStack[isp++] = class115.method785(var229, 4).field2132[var228];
																	continue;
																}
																if (opcode == 5064) {
																	isp -= 2;
																	int var230 = class108.intStack[isp];
																	int var231 = class108.intStack[isp + 1];
																	if (~var231 != 0) {
																		class108.intStack[isp++] = class115.method785(var230, 4).method798(var231, 20552);
																	} else {
																		class108.intStack[isp++] = -1;
																	}
																	continue;
																}
																if (opcode == 5065) {
																	isp -= 2;
																	int var232 = class108.intStack[isp];
																	int var233 = class108.intStack[isp - -1];
																	if (var233 == -1) {
																		class108.intStack[isp++] = -1;
																	} else {
																		class108.intStack[isp++] = class115.method785(var232, 4).method794(104, var233);
																	}
																	continue;
																}
																if (~opcode == -5067) {
																	--isp;
																	int var234 = class108.intStack[isp];
																	class108.intStack[isp++] = class168.method1152((byte) 62, var234).method1409((byte) 67);
																	continue;
																}
																if (opcode == 5067) {
																	isp -= 2;
																	int var235 = class108.intStack[isp];
																	int var236 = class108.intStack[isp + 1];
																	int var237 = class168.method1152((byte) 62, var235).method1407((byte) -94, var236);
																	class108.intStack[isp++] = var237;
																	continue;
																}
																if (~opcode == -5069) {
																	isp -= 2;
																	int var238 = class108.intStack[isp + 1];
																	int var239 = class108.intStack[isp];
																	class15.field226.field4070[var239] = var238;
																	continue;
																}
																if (~opcode == -5070) {
																	isp -= 2;
																	int var240 = class108.intStack[isp];
																	int var241 = class108.intStack[isp + 1];
																	class15.field226.field4070[var240] = var241;
																	continue;
																}
																if (~opcode == -5071) {
																	isp -= 3;
																	int var242 = class108.intStack[isp];
																	int var243 = class108.intStack[isp + 1];
																	int var244 = class108.intStack[isp + 2];
																	class205 var245 = class168.method1152((byte) 62, var242);
																	if (~var245.method1407((byte) -105, var243) != -1) {
																		throw new RuntimeException("bad command");
																	}
																	class108.intStack[isp++] = var245.method1414(var244, 24, var243);
																	continue;
																}
															} else if (opcode >= 5200) {
																if (opcode >= 5300) {
																	if (~opcode <= -5401) {
																		if (opcode < 5500) {
																			if (opcode == 5400) {
																				++class10.field146;
																				ssp -= 2;
																				JString var246 = class171.stringStack[ssp];
																				JString var247 = class171.stringStack[ssp - -1];
																				--isp;
																				int var248 = class108.intStack[isp];
																				Isaac.out.method30(85);
																				Isaac.out.p1(class15.method72(var246, 1) - -class15.method72(var247, 1) - -1);
																				Isaac.out.pjstr(var246, (byte) 0);
																				Isaac.out.pjstr(var247, (byte) 0);
																				Isaac.out.p1(var248);
																				continue;
																			}
																			if (opcode == 5401) {
																				isp -= 2;
																				class117.field2110[class108.intStack[isp]] = (short) class234.method1561(class108.intStack[isp - -1], true);
																				class7.method37((byte) 99);
																				class204.method1401((byte) -75);
																				class103.method713(8);
																				HashTable.method1052((byte) -120);
																				class106.method735(0);
																				continue;
																			}
																		}
																	} else if (opcode == 5304) {
																		class108.intStack[isp++] = 0;
																		continue;
																	}
																} else {
																	if (opcode == 5200) {
																		--isp;
																		class43.method277((byte) 53, class108.intStack[isp]);
																		continue;
																	}
																	if (~opcode == -5202) {
																		class108.intStack[isp++] = class102.method710(0);
																		continue;
																	}
																	if (opcode == 5202) {
																		--isp;
																		class86.method581(class108.intStack[isp], true);
																		continue;
																	}
																	if (~opcode == -5204) {
																		--ssp;
																		class130.method881((byte) 119, class171.stringStack[ssp]);
																		continue;
																	}
																	if (opcode == 5204) {
																		class171.stringStack[ssp + -1] = class221.method1494(class171.stringStack[ssp + -1], false);
																		continue;
																	}
																	if (opcode == 5205) {
																		--ssp;
																		class111.method766(class171.stringStack[ssp], true);
																		continue;
																	}
																}
															} else {
																if (opcode == 5100) {
																	if (ClientScript.field4513[86]) {
																		class108.intStack[isp++] = 1;
																	} else {
																		class108.intStack[isp++] = 0;
																	}
																	continue;
																}
																if (~opcode == -5102) {
																	if (!ClientScript.field4513[82]) {
																		class108.intStack[isp++] = 0;
																	} else {
																		class108.intStack[isp++] = 1;
																	}
																	continue;
																}
																if (opcode == 5102) {
																	if (ClientScript.field4513[81]) {
																		class108.intStack[isp++] = 1;
																	} else {
																		class108.intStack[isp++] = 0;
																	}
																	continue;
																}
															}
														} else if (~opcode == -4501) {
															isp -= 2;
															int var249 = class108.intStack[isp + 1];
															int var250 = class108.intStack[isp];
															class4 var251 = class216.method1469(var249, (byte) -2);
															if (!var251.method17(-29)) {
																class108.intStack[isp++] = Js5Local.method106((byte) 124, var250).method1267(-98, var251.field53, var249);
															} else {
																class171.stringStack[ssp++] = Js5Local.method106((byte) 124, var250).method1265(var251.field57, 63, var249);
															}
															continue;
														}
													} else if (~opcode == -4401) {
														isp -= 2;
														int var252 = class108.intStack[isp];
														int var253 = class108.intStack[isp + 1];
														class4 var254 = class216.method1469(var253, (byte) -8);
														if (!var254.method17(-125)) {
															class108.intStack[isp++] = class190.method1323(var252, -12450).method997((byte) -63, var254.field53, var253);
														} else {
															class171.stringStack[ssp++] = class190.method1323(var252, -12450).method1001(-25925, var254.field57, var253);
														}
														continue;
													}
												} else {
													if (~opcode == -4101) {
														--ssp;
														JString var255 = class171.stringStack[ssp];
														--isp;
														int var256 = class108.intStack[isp];
														class171.stringStack[ssp++] = class166.method1142(new JString[]{var255, class170.method1214(var256, 114)}, -3);
														continue;
													}
													if (~opcode == -4102) {
														ssp -= 2;
														JString var257 = class171.stringStack[ssp + 1];
														JString var258 = class171.stringStack[ssp];
														class171.stringStack[ssp++] = class166.method1142(new JString[]{var258, var257}, -3);
														continue;
													}
													if (~opcode == -4103) {
														--ssp;
														JString var259 = class171.stringStack[ssp];
														--isp;
														int var260 = class108.intStack[isp];
														class171.stringStack[ssp++] = class166.method1142(new JString[]{var259, class50.method375((byte) 120, true, var260)}, -3);
														continue;
													}
													if (~opcode == -4104) {
														--ssp;
														JString var261 = class171.stringStack[ssp];
														class171.stringStack[ssp++] = var261.toLowerCase();
														continue;
													}
													if (~opcode == -4105) {
														--isp;
														int var262 = class108.intStack[isp];
														long var263 = ((long) var262 + 11745L) * 86400000L;
														Js5Local.field353.setTime(new Date(var263));
														int var265 = Js5Local.field353.get(5);
														int var266 = Js5Local.field353.get(2);
														int var267 = Js5Local.field353.get(1);
														class171.stringStack[ssp++] = class166.method1142(new JString[]{class170.method1214(var265, 97), class119.field2173, class53.field992[var266], class119.field2173, class170.method1214(var267, 112)}, -3);
														continue;
													}
													if (~opcode == -4106) {
														ssp -= 2;
														JString var268 = class171.stringStack[ssp];
														JString var269 = class171.stringStack[ssp + 1];
														if (class240.field4458.field768 != null && class240.field4458.field768.field3959) {
															class171.stringStack[ssp++] = var269;
															continue;
														}
														class171.stringStack[ssp++] = var268;
														continue;
													}
													if (~opcode == -4107) {
														--isp;
														int var270 = class108.intStack[isp];
														class171.stringStack[ssp++] = class170.method1214(var270, 34);
														continue;
													}
													if (opcode == 4107) {
														ssp -= 2;
														class108.intStack[isp++] = class171.stringStack[ssp].method627((byte) 126, class171.stringStack[ssp + 1]);
														continue;
													}
													if (opcode == 4108) {
														isp -= 2;
														int var271 = class108.intStack[isp];
														--ssp;
														JString var272 = class171.stringStack[ssp];
														int var273 = class108.intStack[isp + 1];
														byte[] var274 = class98.field1795.getFile(0, var273);
														class41 var275 = new class41(var274);
														var275.method149(class34.field587, (int[]) null);
														class108.intStack[isp++] = var275.method163(var272, var271);
														continue;
													}
													if (~opcode == -4110) {
														isp -= 2;
														--ssp;
														JString var276 = class171.stringStack[ssp];
														int var277 = class108.intStack[isp + 1];
														int var278 = class108.intStack[isp];
														byte[] var279 = class98.field1795.getFile(0, var277);
														class41 var280 = new class41(var279);
														var280.method149(class34.field587, (int[]) null);
														class108.intStack[isp++] = var280.method156(var276, var278);
														continue;
													}
													if (opcode == 4110) {
														ssp -= 2;
														JString var281 = class171.stringStack[ssp - -1];
														JString var282 = class171.stringStack[ssp];
														--isp;
														if (~class108.intStack[isp] == -2) {
															class171.stringStack[ssp++] = var282;
														} else {
															class171.stringStack[ssp++] = var281;
														}
														continue;
													}
													if (opcode == 4111) {
														--ssp;
														JString var283 = class171.stringStack[ssp];
														class171.stringStack[ssp++] = class26.method162(var283);
														continue;
													}
													if (~opcode == -4113) {
														--isp;
														int var284 = class108.intStack[isp];
														--ssp;
														JString var285 = class171.stringStack[ssp];
														if (var284 == -1) {
															throw new RuntimeException("null char");
														}
														class171.stringStack[ssp++] = var285.method618(-120, var284);
														continue;
													}
													if (~opcode == -4114) {
														--isp;
														int var286 = class108.intStack[isp];
														class108.intStack[isp++] = class221.method1491(7123, var286) ? 1 : 0;
														continue;
													}
													if (~opcode == -4115) {
														--isp;
														int var287 = class108.intStack[isp];
														class108.intStack[isp++] = class114.method784(false, var287) ? 1 : 0;
														continue;
													}
													if (~opcode == -4116) {
														--isp;
														int var288 = class108.intStack[isp];
														class108.intStack[isp++] = SeqType.method748(1, var288) ? 1 : 0;
														continue;
													}
													if (~opcode == -4117) {
														--isp;
														int var289 = class108.intStack[isp];
														class108.intStack[isp++] = !class4.method24(var289, 0) ? 0 : 1;
														continue;
													}
													if (opcode == 4117) {
														--ssp;
														JString var290 = class171.stringStack[ssp];
														if (var290 == null) {
															class108.intStack[isp++] = 0;
														} else {
															class108.intStack[isp++] = var290.length();
														}
														continue;
													}
													if (~opcode == -4119) {
														isp -= 2;
														--ssp;
														JString var291 = class171.stringStack[ssp];
														int var292 = class108.intStack[isp + 1];
														int var293 = class108.intStack[isp];
														class171.stringStack[ssp++] = var291.method623(var293, (byte) -12, var292);
														continue;
													}
													if (opcode == 4119) {
														--ssp;
														JString var294 = class171.stringStack[ssp];
														JString var295 = class165.method1137(var294.length(), (byte) 119);
														boolean var296 = false;
														for (int var297 = 0; var294.length() > var297; ++var297) {
															int var298 = var294.method599(255, var297);
															if (~var298 == -61) {
																var296 = true;
															} else if (~var298 == -63) {
																var296 = false;
															} else if (!var296) {
																var295.method638(-81, var298);
															}
														}
														var295.method629((byte) -36);
														class171.stringStack[ssp++] = var295;
														continue;
													}
													if (opcode == 4120) {
														isp -= 2;
														--ssp;
														JString var299 = class171.stringStack[ssp];
														int var300 = class108.intStack[isp];
														int var301 = class108.intStack[isp + 1];
														class108.intStack[isp++] = var299.method594((byte) 68, var300, var301);
														continue;
													}
													if (opcode == 4121) {
														ssp -= 2;
														JString var302 = class171.stringStack[ssp + 1];
														--isp;
														int var303 = class108.intStack[isp];
														JString var304 = class171.stringStack[ssp];
														class108.intStack[isp++] = var304.method634(var303, (byte) 41, var302);
														continue;
													}
													if (opcode == 4122) {
														--isp;
														int var305 = class108.intStack[isp];
														class108.intStack[isp++] = class21.method102(-54, var305);
														continue;
													}
													if (opcode == 4123) {
														--isp;
														int var306 = class108.intStack[isp];
														class108.intStack[isp++] = class9.method51(var306, -45);
														continue;
													}
												}
											} else {
												if (~opcode == -3401) {
													isp -= 2;
													int var307 = class108.intStack[isp];
													int var308 = class108.intStack[isp + 1];
													EnumType var309 = class167.method1150(var307, -113);
													class171.stringStack[ssp++] = var309.method360(var308, (byte) -90);
													continue;
												}
												if (opcode == 3408) {
													isp -= 4;
													int var310 = class108.intStack[isp - -1];
													int var311 = class108.intStack[isp + 2];
													int var312 = class108.intStack[isp - -3];
													int var313 = class108.intStack[isp];
													EnumType var314 = class167.method1150(var311, -115);
													if (~var314.inputtype == ~var313 && var314.outputtype == var310) {
														if (var310 != 115) {
															class108.intStack[isp++] = var314.method356(-1339210640, var312);
														} else {
															class171.stringStack[ssp++] = var314.method360(var312, (byte) -115);
														}
														continue;
													}
													if (~var310 != -116) {
														class108.intStack[isp++] = 0;
													} else {
														class171.stringStack[ssp++] = class14.field207;
													}
													continue;
												}
											}
										} else {
											if (opcode == 3300) {
												class108.intStack[isp++] = class117.field2115;
												continue;
											}
											if (opcode == 3301) {
												isp -= 2;
												int var315 = class108.intStack[isp + 1];
												int var316 = class108.intStack[isp];
												class108.intStack[isp++] = class39.method255(var315, false, var316);
												continue;
											}
											if (~opcode == -3303) {
												isp -= 2;
												int var317 = class108.intStack[isp];
												int var318 = class108.intStack[isp + 1];
												class108.intStack[isp++] = SeqType.method749((byte) -37, var317, var318);
												continue;
											}
											if (opcode == 3303) {
												isp -= 2;
												int var319 = class108.intStack[isp - -1];
												int var320 = class108.intStack[isp];
												class108.intStack[isp++] = class246.method1610(var320, 38, var319);
												continue;
											}
											if (~opcode == -3305) {
												--isp;
												int var321 = class108.intStack[isp];
												class108.intStack[isp++] = Linkable.method458(var321, -84).field2069;
												continue;
											}
											if (opcode == 3305) {
												--isp;
												int var322 = class108.intStack[isp];
												class108.intStack[isp++] = class105.field1909[var322];
												continue;
											}
											if (opcode == 3306) {
												--isp;
												int var323 = class108.intStack[isp];
												class108.intStack[isp++] = class217.field4068[var323];
												continue;
											}
											if (~opcode == -3308) {
												--isp;
												int var324 = class108.intStack[isp];
												class108.intStack[isp++] = class179.field3564[var324];
												continue;
											}
											if (~opcode == -3309) {
												int var325 = class149.field2909;
												int var326 = (class240.field4458.field4123 >> 7) + class190.field3681;
												int var327 = (class240.field4458.field4138 >> 7) + class223.field4214;
												class108.intStack[isp++] = (var325 << 28) + (var327 << 14) + var326;
												continue;
											}
											if (opcode == 3309) {
												--isp;
												int var328 = class108.intStack[isp];
												class108.intStack[isp++] = class70.method470(268433753, var328) >> 14;
												continue;
											}
											if (~opcode == -3311) {
												--isp;
												int var329 = class108.intStack[isp];
												class108.intStack[isp++] = var329 >> 28;
												continue;
											}
											if (opcode == 3311) {
												--isp;
												int var330 = class108.intStack[isp];
												class108.intStack[isp++] = class70.method470(var330, 16383);
												continue;
											}
											if (~opcode == -3313) {
												class108.intStack[isp++] = !Linkable.field1215 ? 0 : 1;
												continue;
											}
											if (opcode == 3313) {
												isp -= 2;
												int var331 = class108.intStack[isp + 1];
												int var332 = class108.intStack[isp] + 32768;
												class108.intStack[isp++] = class39.method255(var331, false, var332);
												continue;
											}
											if (opcode == 3314) {
												isp -= 2;
												int var333 = class108.intStack[isp] + 32768;
												int var334 = class108.intStack[isp + 1];
												class108.intStack[isp++] = SeqType.method749((byte) -37, var333, var334);
												continue;
											}
											if (~opcode == -3316) {
												isp -= 2;
												int var335 = class108.intStack[isp] + 32768;
												int var336 = class108.intStack[isp + 1];
												class108.intStack[isp++] = class246.method1610(var335, 33, var336);
												continue;
											}
											if (opcode == 3316) {
												if (~Linkable.field1208 > -3) {
													class108.intStack[isp++] = 0;
												} else {
													class108.intStack[isp++] = Linkable.field1208;
												}
												continue;
											}
											if (~opcode == -3318) {
												class108.intStack[isp++] = class114.field2063;
												continue;
											}
											if (opcode == 3318) {
												class108.intStack[isp++] = class28.field470;
												continue;
											}
											if (opcode == 3321) {
												class108.intStack[isp++] = class240.field4460;
												continue;
											}
											if (opcode == 3322) {
												class108.intStack[isp++] = class199.field3790;
												continue;
											}
											if (~opcode == -3324) {
												if (class29.field479 >= 5 && class29.field479 <= 9) {
													class108.intStack[isp++] = 1;
													continue;
												}
												class108.intStack[isp++] = 0;
												continue;
											}
											if (opcode == 3324) {
												if (~class29.field479 <= -6 && ~class29.field479 >= -10) {
													class108.intStack[isp++] = class29.field479;
													continue;
												}
												class108.intStack[isp++] = 0;
												continue;
											}
											if (~opcode == -3326) {
												if (class6.field72 > 0) {
													class108.intStack[isp++] = 1;
												} else {
													class108.intStack[isp++] = 0;
												}
												continue;
											}
											if (opcode == 3326) {
												class108.intStack[isp++] = class240.field4458.combatLevel;
												continue;
											}
											if (~opcode == -3328) {
												class108.intStack[isp++] = class240.field4458.field768.field3959 ? 1 : 0;
												continue;
											}
											if (~opcode == -3329) {
												class108.intStack[isp++] = class238.field4430;
												continue;
											}
											if (opcode == 3329) {
												class108.intStack[isp++] = class176.field3537;
												continue;
											}
										}
									} else {
										if (~opcode == -3101) {
											--ssp;
											JString var337 = class171.stringStack[ssp];
											class223.method1501(var337, 12, 0, class81.field1468);
											continue;
										}
										if (~opcode == -3102) {
											isp -= 2;
											class226.method1517((byte) -31, class108.intStack[isp], class108.intStack[isp + 1], class240.field4458);
											continue;
										}
										if (opcode == 3103) {
											class29.method174(-4);
											continue;
										}
										if (~opcode == -3105) {
											++class10.field149;
											--ssp;
											JString var338 = class171.stringStack[ssp];
											int var339 = 0;
											if (var338.method621(10)) {
												var339 = var338.method603(false);
											}
											Isaac.out.method30(152);
											Isaac.out.p4(var339);
											continue;
										}
										if (opcode == 3105) {
											++class129.field2420;
											--ssp;
											JString var340 = class171.stringStack[ssp];
											Isaac.out.method30(54);
											Isaac.out.p8(var340.method630(false));
											continue;
										}
										if (~opcode == -3107) {
											++class31.field500;
											--ssp;
											JString var341 = class171.stringStack[ssp];
											Isaac.out.method30(60);
											Isaac.out.p1(1 + var341.length());
											Isaac.out.pjstr(var341, (byte) 0);
											continue;
										}
										if (~opcode == -3108) {
											--isp;
											int var342 = class108.intStack[isp];
											--ssp;
											JString var343 = class171.stringStack[ssp];
											class17.method82(1, var343, var342);
											continue;
										}
										if (~opcode == -3109) {
											isp -= 3;
											int var344 = class108.intStack[isp];
											int var345 = class108.intStack[isp - -1];
											int var346 = class108.intStack[isp + 2];
											IfType var347 = class239.method1581(-64, var346);
											class80.method532(var344, 2, var345, var347);
											continue;
										}
										if (opcode == 3109) {
											isp -= 2;
											int var348 = class108.intStack[isp];
											int var349 = class108.intStack[isp + 1];
											IfType var350 = !secondary ? class129.field2428 : class203.field3873;
											class80.method532(var348, 2, var349, var350);
											continue;
										}
										if (~opcode == -3111) {
											++class217.field4066;
											--isp;
											int var351 = class108.intStack[isp];
											Isaac.out.method30(194);
											Isaac.out.p2(var351);
											continue;
										}
									}
								} else {
									if (~opcode == -2701) {
										--isp;
										IfType var352 = class239.method1581(-64, class108.intStack[isp]);
										class108.intStack[isp++] = var352.field3401;
										continue;
									}
									if (~opcode == -2702) {
										--isp;
										IfType var353 = class239.method1581(-64, class108.intStack[isp]);
										if (var353.field3401 == -1) {
											class108.intStack[isp++] = 0;
										} else {
											class108.intStack[isp++] = var353.field3484;
										}
										continue;
									}
									if (~opcode == -2703) {
										--isp;
										int var354 = class108.intStack[isp];
										class168 var355 = (class168) class128.field2397.find((long) var354);
										if (var355 == null) {
											class108.intStack[isp++] = 0;
										} else {
											class108.intStack[isp++] = 1;
										}
										continue;
									}
									if (~opcode == -2704) {
										--isp;
										IfType var356 = class239.method1581(-64, class108.intStack[isp]);
										if (var356.field3467 == null) {
											class108.intStack[isp++] = 0;
											continue;
										}
										int var357 = var356.field3467.length;
										for (int var358 = 0; var358 < var356.field3467.length; ++var358) {
											if (var356.field3467[var358] == null) {
												var357 = var358;
												break;
											}
										}
										class108.intStack[isp++] = var357;
										continue;
									}
									if (opcode == 2704 || opcode == 2705) {
										isp -= 2;
										int var359 = class108.intStack[isp];
										int var360 = class108.intStack[isp - -1];
										class168 var361 = (class168) class128.field2397.find((long) var359);
										if (var361 != null && var361.field3231 == var360) {
											class108.intStack[isp++] = 1;
											continue;
										}
										class108.intStack[isp++] = 0;
										continue;
									}
								}
							} else {
								IfType var362;
								if (~opcode > -2001) {
									var362 = secondary ? class203.field3873 : class129.field2428;
								} else {
									--isp;
									var362 = class239.method1581(-64, class108.intStack[isp]);
									opcode -= 1000;
								}
								if (opcode == 1300) {
									--isp;
									int var363 = -1 + class108.intStack[isp];
									if (var363 >= 0 && var363 <= 9) {
										--ssp;
										var362.method1255((byte) -127, class171.stringStack[ssp], var363);
										continue;
									}
									--ssp;
									continue;
								}
								if (~opcode == -1302) {
									isp -= 2;
									int var364 = class108.intStack[isp];
									int var365 = class108.intStack[isp + 1];
									var362.field3504 = class36.method238(var365, var364, true);
									continue;
								}
								if (~opcode == -1303) {
									--isp;
									var362.draggablebehavior = class108.intStack[isp] == 1;
									continue;
								}
								if (~opcode == -1304) {
									--isp;
									var362.field3415 = class108.intStack[isp];
									continue;
								}
								if (opcode == 1304) {
									--isp;
									var362.field3477 = class108.intStack[isp];
									continue;
								}
								if (opcode == 1305) {
									--ssp;
									var362.field3459 = class171.stringStack[ssp];
									continue;
								}
								if (opcode == 1306) {
									--ssp;
									var362.targetVerb = class171.stringStack[ssp];
									continue;
								}
								if (opcode == 1307) {
									var362.opNames = null;
									continue;
								}
							}
						} else {
							IfType var366;
							if (~opcode <= -2001) {
								--isp;
								var366 = class239.method1581(-64, class108.intStack[isp]);
								opcode -= 1000;
							} else {
								var366 = !secondary ? class129.field2428 : class203.field3873;
							}
							if (~opcode == -1101) {
								isp -= 2;
								var366.field3395 = class108.intStack[isp];
								if (-var366.field3382 + var366.field3386 < var366.field3395) {
									var366.field3395 = -var366.field3382 + var366.field3386;
								}
								if (var366.field3395 < 0) {
									var366.field3395 = 0;
								}
								var366.field3417 = class108.intStack[isp + 1];
								if (~var366.field3417 < ~(-var366.field3424 + var366.scrollHeight)) {
									var366.field3417 = -var366.field3424 + var366.scrollHeight;
								}
								if (var366.field3417 < 0) {
									var366.field3417 = 0;
								}
								class200.method1373(65280, var366);
								continue;
							}
							if (~opcode == -1102) {
								--isp;
								var366.colour = class108.intStack[isp];
								class200.method1373(65280, var366);
								continue;
							}
							if (~opcode == -1103) {
								--isp;
								var366.fill = class108.intStack[isp] == 1;
								class200.method1373(65280, var366);
								continue;
							}
							if (opcode == 1103) {
								--isp;
								var366.trans = class108.intStack[isp];
								class200.method1373(65280, var366);
								continue;
							}
							if (opcode == 1104) {
								--isp;
								var366.lineWidth = class108.intStack[isp];
								class200.method1373(65280, var366);
								continue;
							}
							if (~opcode == -1106) {
								--isp;
								var366.field3475 = class108.intStack[isp];
								class200.method1373(65280, var366);
								continue;
							}
							if (~opcode == -1107) {
								--isp;
								var366.field3439 = class108.intStack[isp];
								class200.method1373(65280, var366);
								continue;
							}
							if (opcode == 1107) {
								--isp;
								var366.field3422 = class108.intStack[isp] == 1;
								class200.method1373(65280, var366);
								continue;
							}
							if (opcode == 1108) {
								var366.field3432 = 1;
								--isp;
								var366.model1Id = class108.intStack[isp];
								class200.method1373(65280, var366);
								continue;
							}
							if (~opcode == -1110) {
								isp -= 6;
								var366.field3367 = class108.intStack[isp];
								var366.field3500 = class108.intStack[isp + 1];
								var366.field3457 = class108.intStack[isp - -2];
								var366.field3511 = class108.intStack[isp + 3];
								var366.field3519 = class108.intStack[isp - -4];
								var366.field3487 = class108.intStack[isp - -5];
								class200.method1373(65280, var366);
								continue;
							}
							if (opcode == 1110) {
								--isp;
								int var367 = class108.intStack[isp];
								if (var366.modelAnim != var367) {
									var366.field3489 = 0;
									var366.modelAnim = var367;
									var366.field3381 = 0;
									class200.method1373(65280, var366);
								}
								continue;
							}
							if (~opcode == -1112) {
								--isp;
								var366.field3405 = class108.intStack[isp] == 1;
								class200.method1373(65280, var366);
								continue;
							}
							if (~opcode == -1113) {
								--ssp;
								JString var368 = class171.stringStack[ssp];
								if (!var368.method597(-110, var366.text)) {
									var366.text = var368;
									class200.method1373(65280, var366);
								}
								continue;
							}
							if (opcode == 1113) {
								--isp;
								var366.font = class108.intStack[isp];
								class200.method1373(65280, var366);
								continue;
							}
							if (opcode == 1114) {
								isp -= 3;
								var366.hAlign = class108.intStack[isp];
								var366.field3471 = class108.intStack[isp + 1];
								var366.field3398 = class108.intStack[isp + 2];
								class200.method1373(65280, var366);
								continue;
							}
							if (~opcode == -1116) {
								--isp;
								var366.shadow = class108.intStack[isp] == 1;
								class200.method1373(65280, var366);
								continue;
							}
							if (opcode == 1116) {
								--isp;
								var366.field3431 = class108.intStack[isp];
								class200.method1373(65280, var366);
								continue;
							}
							if (~opcode == -1118) {
								--isp;
								var366.field3427 = class108.intStack[isp];
								class200.method1373(65280, var366);
								continue;
							}
							if (opcode == 1118) {
								--isp;
								var366.field3389 = ~class108.intStack[isp] == -2;
								class200.method1373(65280, var366);
								continue;
							}
							if (opcode == 1119) {
								--isp;
								var366.field3485 = class108.intStack[isp] == 1;
								class200.method1373(65280, var366);
								continue;
							}
							if (opcode == 1120) {
								isp -= 2;
								var366.field3386 = class108.intStack[isp];
								var366.scrollHeight = class108.intStack[isp - -1];
								class200.method1373(65280, var366);
								if (~var366.type == -1) {
									class110.method761(false, var366, (byte) 13);
								}
								continue;
							}
							if (opcode == 1121) {
								class200.method1373(65280, var366);
								--isp;
								continue;
							}
							if (~opcode == -1123) {
								--isp;
								var366.field3479 = ~class108.intStack[isp] == -2;
								class200.method1373(65280, var366);
								continue;
							}
						}
					} else {
						IfType var369;
						if (~opcode > -2001) {
							var369 = !secondary ? class129.field2428 : class203.field3873;
						} else {
							opcode -= 1000;
							--isp;
							var369 = class239.method1581(-64, class108.intStack[isp]);
						}
						if (opcode == 1000) {
							var369.field3369 = 0;
							isp -= 2;
							var369.field3368 = var369.field3393 = class108.intStack[isp];
							var369.field3453 = 0;
							var369.field3443 = var369.field3516 = class108.intStack[isp + 1];
							class200.method1373(65280, var369);
							continue;
						}
						if (opcode == 1001) {
							var369.field3465 = 0;
							isp -= 2;
							var369.field3382 = var369.height = class108.intStack[isp];
							var369.field3470 = 0;
							var369.field3396 = 0;
							var369.field3424 = var369.width = class108.intStack[isp + 1];
							var369.field3419 = 0;
							class200.method1373(65280, var369);
							if (var369.type == 0) {
								class110.method761(false, var369, (byte) 120);
							}
							class2.method10(var369, (byte) 126);
							continue;
						}
						if (opcode == 1003) {
							--isp;
							boolean var370 = ~class108.intStack[isp] == -2;
							if (!var369.hide != !var370) {
								var369.hide = var370;
								class200.method1373(65280, var369);
							}
							continue;
						}
						if (~opcode == -1005) {
							isp -= 4;
							var369.field3393 = class108.intStack[isp];
							var369.field3516 = class108.intStack[isp + 1];
							int var371 = class108.intStack[isp + 2];
							int var372 = class108.intStack[isp + 3];
							if (var372 < 0) {
								var372 = 0;
							} else if (~var372 < -3) {
								var372 = 2;
							}
							var369.field3453 = (byte) (var372 + 3);
							if (~var371 > -1) {
								var371 = 0;
							} else if (var371 > 2) {
								var371 = 2;
							}
							var369.field3369 = (byte) (var371 + 3);
							class200.method1373(65280, var369);
							class2.method10(var369, (byte) 102);
							continue;
						}
						if (opcode == 1005) {
							var369.field3369 = 2;
							isp -= 2;
							var369.field3393 = class108.intStack[isp];
							var369.field3453 = 2;
							var369.field3516 = class108.intStack[isp - -1];
							class200.method1373(65280, var369);
							if (~var369.type == -1) {
								class110.method761(false, var369, (byte) -117);
							}
							class2.method10(var369, (byte) 125);
							continue;
						}
					}
				} else {
					if (~opcode == -404) {
						isp -= 2;
						int var373 = class108.intStack[isp];
						if (var373 >= 7) {
							var373 -= 7;
						}
						int var374 = class108.intStack[isp + 1];
						class240.field4458.field768.method1437(var373, (byte) -47, var374);
						continue;
					}
					if (~opcode == -405) {
						isp -= 2;
						int var375 = class108.intStack[isp + 1];
						int var376 = class108.intStack[isp];
						class240.field4458.field768.method1434((byte) -95, var375, var376);
						continue;
					}
					if (~opcode == -411) {
						--isp;
						boolean var377 = ~class108.intStack[isp] != -1;
						class240.field4458.field768.method1436(11, var377);
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (Exception var382) {
			if (script.name != null) {
				JString var379 = class165.method1137(30, (byte) 121);
				var379.method616(class156.field3012, (byte) -62).method616(script.name, (byte) 114);
				for (int var380 = class230.fp + -1; ~var380 <= -1; --var380) {
					var379.method616(Js5Local.field356, (byte) 102).method616(class80.frames[var380].script.name, (byte) -73);
				}
				if (var10 == 40) {
					int var381 = intOperands[pc];
					var379.method616(class134.field2498, (byte) 60).method616(class170.method1214(var381, 62), (byte) 109);
				}
				if (~class115.modewhere != -1) {
					class223.method1501(class166.method1142(new JString[]{class18.field288, script.name}, -3), 12, 0, class81.field1468);
				}
				class221.method1490((byte) 0, "CS2 - scr:" + script.nodeId + " op:" + var10 + new String(var379.method613(-113)), var382);
			} else {
				if (~class115.modewhere != -1) {
					class223.method1501(class179.field3565, 12, 0, class81.field1468);
				}
				class221.method1490((byte) 0, "CS2 - scr:" + script.nodeId + " op:" + var10, var382);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lea;II)V")
	public final void method11(Packet arg0, int arg1, int arg2) {
		if (~arg2 == -1) {
			this.method901(arg0.g3(), (byte) -88);
		}
		if (arg1 != -3) {
			this.field2524 = -112;
		}
		++field2519;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IB)[[I")
	public final int[][] method7(int arg0, byte arg1) {
		++field2515;
		int[][] var3 = super.field364.method1541(true, arg0);
		if (arg1 != 13) {
			return null;
		} else {
			if (super.field364.field4312) {
				int[] var4 = var3[0];
				int[] var5 = var3[2];
				int[] var6 = var3[1];
				for (int var7 = 0; class70.field1276 > var7; ++var7) {
					var4[var7] = this.field2507;
					var6[var7] = this.field2524;
					var5[var7] = this.field2522;
				}
			}
			return var3;
		}
	}
}
