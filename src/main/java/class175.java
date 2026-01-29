import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class175 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "J")
    public static long field3521 = 0L;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Li;")
    private static JString field3525 = class208.method1425(105, "Welcome to RuneScape");

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Li;")
    private static JString field3529 = class208.method1425(105, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Li;")
    public static JString field3527 = field3529;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Li;")
    public static JString field3524 = field3525;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Z")
    public static boolean field3534 = false;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field3530 = 3;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Li;")
    public static JString field3528 = class208.method1425(105, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lkj;")
    public static class119 field3531;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lnb;")
    public static Js5Index field3526;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Z")
    public static boolean field3522;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1258(int arg0, Throwable arg1) throws IOException {
        field3523++;
        String var3;
        if (arg1 instanceof class14) {
            class14 var2 = (class14) arg1;
            arg1 = var2.field215;
            var3 = var2.field210 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        int var6 = 53 / ((arg0 - 36) / 35);
        var5.close();
        String var7 = var4.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var3 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
    public static final void method1259(int arg0, int arg1) {
        field3533++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class165.field3178[arg1];
        int var3 = class217.field4062[arg1];
        int var4 = class53.field994[arg1];
        long var5 = class74.field1352[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var7 = (int) class74.field1352[arg1];
        if (var4 == 31) {
            scene var8 = class244.field4493[var7];
            if (var8 != null) {
                class116.field2102++;
                class207.method1423(3044, 1, 0, var8.field4143[0], var8.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class157.field3019 = 2;
                class147.field2759 = class226.field4241;
                class45.field796 = 0;
                class155.field2999 = class172.field3341;
                Isaac.out.method30(192);
                Isaac.out.p2_alt2(class48.field905);
                Isaac.out.p4_alt1(class209.field3967);
                Isaac.out.p2(class58.field1105);
                Isaac.out.p2(var7);
            }
        }
        if (var4 == 1006) {
            class45.field796 = 0;
            class147.field2759 = class226.field4241;
            class157.field3032++;
            class155.field2999 = class172.field3341;
            class157.field3019 = 2;
            Isaac.out.method30(191);
            Isaac.out.p2(var7);
        }
        if (var4 == 7) {
            class45.field784++;
            class101.method707(0, var3, var5, var2);
            Isaac.out.method30(53);
            Isaac.out.p2((int) (var5 >>> 32) & Integer.MAX_VALUE);
            Isaac.out.p2_alt3(class190.field3681 + var3);
            Isaac.out.p2_alt3(var2 + class223.field4214);
        }
        if (var4 == 15) {
            class174 var9 = class36.method238(var2, var3, true);
            if (var9 != null) {
                EnumType.method363(-86);
                class158.method1066(true, var3, GameShell.method592(1281959627, class80.method530(-881710560, var9)), var2);
                class28.field475 = 0;
                class201.field3837 = class194.method1347(var9, arg0 - 4);
                if (class201.field3837 == null) {
                    class201.field3837 = class42.field710;
                }
                if (var9.field3412) {
                    class28.field464 = class166.method1142(new JString[] { var9.field3459, JString.field1637 }, -3);
                    return;
                }
                class28.field464 = class166.method1142(new JString[] { class12.field182, var9.field3461, JString.field1637 }, arg0 - 5);
            }
            return;
        }
        if (var4 == 30) {
            scene var10 = class244.field4493[var7];
            if (var10 != null) {
                scene.field770++;
                class207.method1423(3044, 1, 0, var10.field4143[0], var10.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class45.field796 = 0;
                class157.field3019 = 2;
                class155.field2999 = class172.field3341;
                class147.field2759 = class226.field4241;
                Isaac.out.method30(65);
                Isaac.out.method314(var7, (byte) 52);
            }
        }
        if (var4 == 40) {
            class58.field1092++;
            Isaac.out.method30(196);
            Isaac.out.p2_alt3(Client.field569);
            Isaac.out.p4(class16.field249);
            Isaac.out.p4_alt2(var3);
            Isaac.out.p2_alt2(var2);
        }
        if (var4 == 34) {
            class191 var11 = class225.field4225[var7];
            if (var11 != null) {
                class207.method1423(3044, 1, 0, var11.field4143[0], var11.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class45.field796 = 0;
                class157.field3019 = 2;
                class155.field2999 = class172.field3341;
                class147.field2759 = class226.field4241;
                Isaac.out.method30(78);
                class199.field3799++;
                Isaac.out.p2_alt2(var7);
            }
        }
        if (var4 == 58) {
            scene var12 = class244.field4493[var7];
            if (var12 != null) {
                class207.method1423(3044, 1, 0, var12.field4143[0], var12.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class45.field796 = 0;
                class157.field3019 = 2;
                class147.field2759 = class226.field4241;
                class218.field4117++;
                class155.field2999 = class172.field3341;
                Isaac.out.method30(151);
                Isaac.out.p2(var7);
            }
        }
        if (var4 == 4) {
            class191 var13 = class225.field4225[var7];
            if (var13 != null) {
                class207.method1423(3044, 1, 0, var13.field4143[0], var13.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class147.field2759 = class226.field4241;
                class242.field4477++;
                class45.field796 = 0;
                class157.field3019 = 2;
                class155.field2999 = class172.field3341;
                Isaac.out.method30(71);
                Isaac.out.p2(var7);
            }
        }
        if (var4 == 39) {
            Isaac.out.method30(35);
            Isaac.out.p2_alt3(var7);
            Isaac.out.p2(Client.field569);
            field3532++;
            Isaac.out.p4_alt3(class16.field249);
            Isaac.out.p2_alt2(var2);
            Isaac.out.p4_alt3(var3);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(-64, var3);
            class93.field1743 = var2;
        }
        if (var4 == 36) {
            Isaac.out.method30(109);
            Isaac.out.p4(var3);
            class246.field4511++;
            class174 var14 = class239.method1581(-64, var3);
            if (var14.field3394 != null && var14.field3394[0][0] == 5) {
                int var15 = var14.field3394[0][1];
                class113.field2052[var15] = 1 - class113.field2052[var15];
                class158.method1070(arg0 ^ 0x42, var15);
            }
        }
        if (var4 == 1001) {
            class174 var16 = class239.method1581(-64, var3);
            if (var16 == null || var16.field3476[var2] < 100000) {
                Isaac.out.method30(191);
                Isaac.out.p2(var7);
                class157.field3032++;
            } else {
                class223.method1501(class166.method1142(new JString[] { class170.method1214(var16.field3476[var2], 51), SeqType.field1975, class71.method472(var7, (byte) -118).field2894 }, -3), 12, 0, class174.field3455);
            }
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(-64, var3);
            class93.field1743 = var2;
        }
        if (var4 == 1) {
            scene var17 = class244.field4493[var7];
            if (var17 != null) {
                class209.field3975++;
                class207.method1423(3044, 1, 0, var17.field4143[0], var17.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class157.field3019 = 2;
                class155.field2999 = class172.field3341;
                class147.field2759 = class226.field4241;
                class45.field796 = 0;
                Isaac.out.method30(47);
                Isaac.out.p2_alt3(var7);
            }
        }
        if (var4 == 21) {
            class207.field3941++;
            Isaac.out.method30(160);
            Isaac.out.p2_alt3(var2);
            Isaac.out.p4_alt1(var3);
            Isaac.out.p2_alt2(var7);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(-64, var3);
            class93.field1743 = var2;
        }
        if (arg0 != 2) {
            return;
        }
        if (var4 == 2) {
            Isaac.out.method30(216);
            Isaac.out.p4_alt3(var3);
            Isaac.out.method314(var2, (byte) 48);
            class16.field245++;
            Isaac.out.p2_alt3(var7);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(arg0 ^ 0xFFFFFFC2, var3);
            class93.field1743 = var2;
        }
        if (var4 == 35) {
            class101.method707(0, var3, var5, var2);
            Isaac.out.method30(13);
            Isaac.out.p2_alt3(Integer.MAX_VALUE & (int) (var5 >>> 32));
            Isaac.out.method314(class223.field4214 + var2, (byte) -120);
            Isaac.out.method314(class190.field3681 + var3, (byte) 11);
            class134.field2504++;
        }
        if (var4 == 51) {
            class159.field3069++;
            class101.method707(0, var3, var5, var2);
            Isaac.out.method30(94);
            Isaac.out.p2_alt2(var2 + class223.field4214);
            Isaac.out.p2(class190.field3681 + var3);
            Isaac.out.p2_alt3(Integer.MAX_VALUE & (int) (var5 >>> 32));
        }
        if (var4 == 29) {
            scene var18 = class244.field4493[var7];
            if (var18 != null) {
                class120.field2203++;
                class207.method1423(3044, 1, 0, var18.field4143[0], var18.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class45.field796 = 0;
                class157.field3019 = 2;
                class147.field2759 = class226.field4241;
                class155.field2999 = class172.field3341;
                Isaac.out.method30(118);
                Isaac.out.p2_alt2(var7);
            }
        }
        if (var4 == 48) {
            class191 var19 = class225.field4225[var7];
            if (var19 != null) {
                class207.method1423(3044, 1, 0, var19.field4143[0], var19.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class147.field2759 = class226.field4241;
                class155.field2999 = class172.field3341;
                class45.field796 = 0;
                class149.field2848++;
                class157.field3019 = 2;
                Isaac.out.method30(30);
                Isaac.out.method314(class58.field1105, (byte) 9);
                Isaac.out.p4_alt2(class209.field3967);
                Isaac.out.method314(var7, (byte) 104);
                Isaac.out.p2_alt3(class48.field905);
            }
        }
        if (var4 == 44) {
            Isaac.out.method30(112);
            class199.field3805++;
            Isaac.out.p2(var2);
            Isaac.out.p4_alt2(var3);
            Isaac.out.p2_alt3(var7);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(-64, var3);
            class93.field1743 = var2;
        }
        if (var4 == 14) {
            class29.method174(-46);
        }
        if (var4 == 17) {
            class191 var20 = class225.field4225[var7];
            if (var20 != null) {
                class207.method1423(3044, 1, 0, var20.field4143[0], var20.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class157.field3019 = 2;
                class45.field796 = 0;
                class227.field4263++;
                class147.field2759 = class226.field4241;
                class155.field2999 = class172.field3341;
                Isaac.out.method30(164);
                Isaac.out.p2(var7);
            }
        }
        if (var4 == 57) {
            class131.field2453++;
            boolean var21 = class207.method1423(arg0 ^ 0xBE6, 0, 0, var3, var2, class240.field4458.field4089[0], 0, 0, 2, false, 0, class240.field4458.field4143[0]);
            if (!var21) {
                class207.method1423(arg0 + 3042, 1, 0, var3, var2, class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
            }
            class155.field2999 = class172.field3341;
            class147.field2759 = class226.field4241;
            class157.field3019 = 2;
            class45.field796 = 0;
            Isaac.out.method30(107);
            Isaac.out.method314(class190.field3681 + var3, (byte) -118);
            Isaac.out.method314(var7, (byte) -97);
            Isaac.out.p2_alt3(class223.field4214 + var2);
        }
        if (var4 == 12) {
            EnumType.method363(-125);
            class174 var23 = class239.method1581(-64, var3);
            class28.field475 = 1;
            class58.field1105 = var2;
            class209.field3967 = var3;
            class48.field905 = var7;
            class200.method1373(65280, var23);
            class78.field1414 = class166.method1142(new JString[] { class136.field2531, class71.method472(var7, (byte) -96).field2894, JString.field1637 }, arg0 - 5);
            if (class78.field1414 == null) {
                class78.field1414 = class180.field3574;
            }
            return;
        }
        if (var4 == 23) {
            scene var24 = class244.field4493[var7];
            if (var24 != null) {
                class207.method1423(3044, 1, 0, var24.field4143[0], var24.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class157.field3019 = 2;
                class155.field2999 = class172.field3341;
                class45.field796 = 0;
                class147.field2759 = class226.field4241;
                class145.field2717++;
                Isaac.out.method30(6);
                Isaac.out.p2_alt3(var7);
                Isaac.out.p2_alt2(Client.field569);
                Isaac.out.p4_alt2(class16.field249);
            }
        }
        if (var4 == 6) {
            class116.field2094++;
            Isaac.out.method30(150);
            Isaac.out.p4_alt3(var3);
            Isaac.out.p2_alt3(var2);
            Isaac.out.p2(var7);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(-64, var3);
            class93.field1743 = var2;
        }
        if (var4 == 10) {
            class50.method374(class149.field2909, var2, var3);
        }
        if (var4 == 1004) {
            class101.method707(0, var3, var5, var2);
            class217.field4063++;
            Isaac.out.method30(97);
            Isaac.out.p2_alt3(class190.field3681 + var3);
            Isaac.out.p2_alt3((int) (var5 >>> 32) & Integer.MAX_VALUE);
            Isaac.out.method314(var2 + class223.field4214, (byte) -121);
        }
        if (var4 == 43 || var4 == 1003) {
            class203.method1392(var7, class201.field3838[arg1], var2, -3655, var3);
        }
        if (var4 == 3) {
            boolean var25 = class207.method1423(arg0 + 3042, 0, 0, var3, var2, class240.field4458.field4089[0], 0, 0, 2, false, 0, class240.field4458.field4143[0]);
            class203.field3866++;
            if (!var25) {
                class207.method1423(3044, 1, 0, var3, var2, class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
            }
            class155.field2999 = class172.field3341;
            class147.field2759 = class226.field4241;
            class157.field3019 = 2;
            class45.field796 = 0;
            Isaac.out.method30(138);
            Isaac.out.p2_alt2(class190.field3681 + var3);
            Isaac.out.p2(var7);
            Isaac.out.p2_alt2(class223.field4214 + var2);
        }
        if (var4 == 8) {
            class227.field4262++;
            Isaac.out.method30(205);
            Isaac.out.method314(var7, (byte) -104);
            Isaac.out.p2_alt2(var2);
            Isaac.out.p4_alt3(var3);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(-64, var3);
            class93.field1743 = var2;
        }
        if (var4 == 13) {
            class135.field2509++;
            Isaac.out.method30(26);
            Isaac.out.p2(var2);
            Isaac.out.p2(var7);
            Isaac.out.p4(var3);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(-64, var3);
            class93.field1743 = var2;
        }
        if (var4 == 41) {
            class39.field685++;
            boolean var27 = class207.method1423(arg0 + 3042, 0, 0, var3, var2, class240.field4458.field4089[0], 0, 0, 2, false, 0, class240.field4458.field4143[0]);
            if (!var27) {
                class207.method1423(3044, 1, 0, var3, var2, class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
            }
            class155.field2999 = class172.field3341;
            class45.field796 = 0;
            class147.field2759 = class226.field4241;
            class157.field3019 = 2;
            Isaac.out.method30(77);
            Isaac.out.p2_alt3(var7);
            Isaac.out.p2_alt3(class190.field3681 + var3);
            Isaac.out.p2(var2 + class223.field4214);
        }
        if (var4 == 1002) {
            class147.field2759 = class226.field4241;
            class45.field796 = 0;
            class155.field2999 = class172.field3341;
            class157.field3019 = 2;
            class191 var29 = class225.field4225[var7];
            if (var29 != null) {
                class126 var30 = var29.field3684;
                if (var30.field2329 != null) {
                    var30 = var30.method864((byte) 28);
                }
                if (var30 != null) {
                    Isaac.out.method30(127);
                    Isaac.out.method314(var30.field2316, (byte) -123);
                    class207.field3937++;
                }
            }
        }
        if (var4 == 49) {
            class110.field2013++;
            Isaac.out.method30(32);
            Isaac.out.p2_alt3(var7);
            Isaac.out.p4(var3);
            Isaac.out.p2_alt3(var2);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(arg0 - 66, var3);
            class93.field1743 = var2;
        }
        if (var4 == 26 && class101.method707(0, var3, var5, var2)) {
            class43.field728++;
            Isaac.out.method30(170);
            Isaac.out.p2_alt2(class190.field3681 + var3);
            Isaac.out.p4(class209.field3967);
            Isaac.out.p2_alt3(var2 + class223.field4214);
            Isaac.out.method314(class58.field1105, (byte) -115);
            Isaac.out.p2_alt2(Integer.MAX_VALUE & (int) (var5 >>> 32));
            Isaac.out.p2_alt3(class48.field905);
        }
        if (var4 == 45) {
            scene var31 = class244.field4493[var7];
            if (var31 != null) {
                class28.field463++;
                class207.method1423(3044, 1, 0, var31.field4143[0], var31.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class45.field796 = 0;
                class147.field2759 = class226.field4241;
                class155.field2999 = class172.field3341;
                class157.field3019 = 2;
                Isaac.out.method30(214);
                Isaac.out.p2_alt2(var7);
            }
        }
        if (var4 == 25) {
            class36.field655++;
            boolean var32 = class207.method1423(3044, 0, 0, var3, var2, class240.field4458.field4089[0], 0, 0, 2, false, 0, class240.field4458.field4143[0]);
            if (!var32) {
                class207.method1423(3044, 1, 0, var3, var2, class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
            }
            class157.field3019 = 2;
            class155.field2999 = class172.field3341;
            class147.field2759 = class226.field4241;
            class45.field796 = 0;
            Isaac.out.method30(84);
            Isaac.out.p2(var2 + class223.field4214);
            Isaac.out.p2(var7);
            Isaac.out.method314(var3 + class190.field3681, (byte) -3);
            Isaac.out.p4_alt1(class16.field249);
            Isaac.out.method314(Client.field569, (byte) -107);
        }
        if (var4 == 22) {
            class202.field3853++;
            boolean var34 = class207.method1423(3044, 0, 0, var3, var2, class240.field4458.field4089[0], 0, 0, 2, false, 0, class240.field4458.field4143[0]);
            if (!var34) {
                class207.method1423(3044, 1, 0, var3, var2, class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
            }
            class157.field3019 = 2;
            class155.field2999 = class172.field3341;
            class147.field2759 = class226.field4241;
            class45.field796 = 0;
            Isaac.out.method30(39);
            Isaac.out.method314(var2 + class223.field4214, (byte) 126);
            Isaac.out.p2_alt2(var7);
            Isaac.out.p2_alt3(class190.field3681 + var3);
        }
        if (var4 == 38) {
            class191 var36 = class225.field4225[var7];
            if (var36 != null) {
                class245.field4503++;
                class207.method1423(3044, 1, 0, var36.field4143[0], var36.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class147.field2759 = class226.field4241;
                class155.field2999 = class172.field3341;
                class157.field3019 = 2;
                class45.field796 = 0;
                Isaac.out.method30(33);
                Isaac.out.method314(var7, (byte) -108);
            }
        }
        if (var4 == 24 && class101.method707(0, var3, var5, var2)) {
            class34.field579++;
            Isaac.out.method30(234);
            Isaac.out.method314(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) 97);
            Isaac.out.method314(Client.field569, (byte) 88);
            Isaac.out.p4_alt3(class16.field249);
            Isaac.out.method314(class223.field4214 + var2, (byte) -124);
            Isaac.out.p2(class190.field3681 + var3);
        }
        if (var4 == 28) {
            class39.field687++;
            Isaac.out.method30(154);
            Isaac.out.p4(var3);
            Isaac.out.p2_alt3(var7);
            Isaac.out.p2_alt3(var2);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(arg0 - 66, var3);
            class93.field1743 = var2;
        }
        if (var4 == 20) {
            Isaac.out.method30(109);
            Isaac.out.p4(var3);
            class246.field4511++;
            class174 var37 = class239.method1581(-64, var3);
            if (var37.field3394 != null && var37.field3394[0][0] == 5) {
                int var38 = var37.field3394[0][1];
                if (class113.field2052[var38] != var37.field3488[0]) {
                    class113.field2052[var38] = var37.field3488[0];
                    class158.method1070(arg0 ^ 0x42, var38);
                }
            }
        }
        if (var4 == 18) {
            class153.field2954++;
            Isaac.out.method30(251);
            Isaac.out.p2(var2);
            Isaac.out.p2_alt2(var7);
            Isaac.out.p4(var3);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(-64, var3);
            class93.field1743 = var2;
        }
        if (var4 == 47 && class53.field967 == null) {
            class203.method1393(var2, false, var3);
            class53.field967 = class36.method238(var2, var3, true);
            class200.method1373(65280, class53.field967);
        }
        if (var4 == 32) {
            class191 var39 = class225.field4225[var7];
            if (var39 != null) {
                class218.field4118++;
                class207.method1423(3044, 1, 0, var39.field4143[0], var39.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class147.field2759 = class226.field4241;
                class157.field3019 = 2;
                class45.field796 = 0;
                class155.field2999 = class172.field3341;
                Isaac.out.method30(195);
                Isaac.out.p2(var7);
            }
        }
        if (var4 == 33) {
            class101.method707(0, var3, var5, var2);
            class28.field469++;
            Isaac.out.method30(169);
            Isaac.out.p2(var3 + class190.field3681);
            Isaac.out.method314(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) -99);
            Isaac.out.p2_alt3(class223.field4214 + var2);
        }
        if (var4 == 11) {
            class174 var40 = class239.method1581(-64, var3);
            boolean var41 = true;
            if (var40.field3441 > 0) {
                var41 = class53.method389(arg0 + 122, var40);
            }
            if (var41) {
                Isaac.out.method30(109);
                class246.field4511++;
                Isaac.out.p4(var3);
            }
        }
        if (var4 == 9) {
            Isaac.out.method30(55);
            Isaac.out.method314(var2, (byte) 91);
            IntHashTable.field1810++;
            Isaac.out.p4_alt1(var3);
            Isaac.out.p2_alt2(var7);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(-64, var3);
            class93.field1743 = var2;
        }
        if (var4 == 5) {
            class233.field4372++;
            boolean var42 = class207.method1423(3044, 0, 0, var3, var2, class240.field4458.field4089[0], 0, 0, 2, false, 0, class240.field4458.field4143[0]);
            if (!var42) {
                class207.method1423(3044, 1, 0, var3, var2, class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
            }
            class45.field796 = 0;
            class157.field3019 = 2;
            class147.field2759 = class226.field4241;
            class155.field2999 = class172.field3341;
            Isaac.out.method30(211);
            Isaac.out.p2_alt3(class223.field4214 + var2);
            Isaac.out.method314(class190.field3681 + var3, (byte) 89);
            Isaac.out.p2_alt3(var7);
        }
        if (var4 == 42) {
            Isaac.out.method30(4);
            Isaac.out.p2(class48.field905);
            class39.field697++;
            Isaac.out.p2_alt2(var7);
            Isaac.out.p2_alt2(class58.field1105);
            Isaac.out.p4_alt2(var3);
            Isaac.out.p2_alt2(var2);
            Isaac.out.p4(class209.field3967);
            class139.field2575 = 0;
            class57.field1091 = class239.method1581(-64, var3);
            class93.field1743 = var2;
        }
        if (var4 == 37) {
            scene var44 = class244.field4493[var7];
            if (var44 != null) {
                class151.field2926++;
                class207.method1423(3044, 1, 0, var44.field4143[0], var44.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class45.field796 = 0;
                class147.field2759 = class226.field4241;
                class155.field2999 = class172.field3341;
                class157.field3019 = 2;
                Isaac.out.method30(114);
                Isaac.out.p2(var7);
            }
        }
        if (var4 == 16) {
            scene var45 = class244.field4493[var7];
            if (var45 != null) {
                class207.method1423(3044, 1, 0, var45.field4143[0], var45.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class45.field796 = 0;
                class147.field2759 = class226.field4241;
                class155.field2999 = class172.field3341;
                class28.field462++;
                class157.field3019 = 2;
                Isaac.out.method30(161);
                Isaac.out.p2_alt2(var7);
            }
        }
        if (var4 == 1005) {
            class227.field4265++;
            class157.field3019 = 2;
            class155.field2999 = class172.field3341;
            class45.field796 = 0;
            class147.field2759 = class226.field4241;
            Isaac.out.method30(166);
            Isaac.out.p2_alt2(var7);
        }
        if (var4 == 50) {
            scene var46 = class244.field4493[var7];
            if (var46 != null) {
                class14.field214++;
                class207.method1423(3044, 1, 0, var46.field4143[0], var46.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class157.field3019 = 2;
                class45.field796 = 0;
                class155.field2999 = class172.field3341;
                class147.field2759 = class226.field4241;
                Isaac.out.method30(204);
                Isaac.out.p2_alt3(var7);
            }
        }
        if (var4 == 19) {
            class191 var47 = class225.field4225[var7];
            if (var47 != null) {
                class207.method1423(3044, 1, 0, var47.field4143[0], var47.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                class45.field796 = 0;
                class147.field2759 = class226.field4241;
                class217.field4065++;
                class157.field3019 = 2;
                class155.field2999 = class172.field3341;
                Isaac.out.method30(145);
                Isaac.out.p4_alt1(class16.field249);
                Isaac.out.method314(var7, (byte) 55);
                Isaac.out.p2(Client.field569);
            }
        }
        if (var4 == 46) {
            class231.field4336++;
            boolean var48 = class207.method1423(arg0 ^ 0xBE6, 0, 0, var3, var2, class240.field4458.field4089[0], 0, 0, 2, false, 0, class240.field4458.field4143[0]);
            if (!var48) {
                class207.method1423(3044, 1, 0, var3, var2, class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
            }
            class157.field3019 = 2;
            class45.field796 = 0;
            class155.field2999 = class172.field3341;
            class147.field2759 = class226.field4241;
            Isaac.out.method30(176);
            Isaac.out.method314(class190.field3681 + var3, (byte) 1);
            Isaac.out.p4_alt3(class209.field3967);
            Isaac.out.method314(class58.field1105, (byte) 106);
            Isaac.out.p2_alt3(class223.field4214 + var2);
            Isaac.out.p2_alt3(class48.field905);
            Isaac.out.method314(var7, (byte) 70);
        }
        if (class28.field475 != 0) {
            class28.field475 = 0;
            class200.method1373(65280, class239.method1581(-64, class209.field3967));
        }
        if (class10.field145) {
            EnumType.method363(arg0 ^ 0xFFFFFF9D);
        }
        if (class57.field1091 != null && class139.field2575 == 0) {
            class200.method1373(65280, class57.field1091);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method1260(boolean arg0) {
        field3526 = null;
        field3529 = null;
        field3525 = null;
        field3531 = null;
        field3527 = null;
        field3524 = null;
        if (!arg0) {
            field3521 = 32L;
        }
        field3528 = null;
    }
}
