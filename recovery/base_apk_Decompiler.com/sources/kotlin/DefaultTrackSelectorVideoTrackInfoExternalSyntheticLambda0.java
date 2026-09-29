package kotlin;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0 {
    private static final byte[] $$a;
    private static final int $$b;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $14 = 0;
    private static int $15 = 1;
    private static int $16 = 0;
    private static int $17 = 1;
    public static final Map handleMediaPlayPauseIfPendingOnHandler;
    private static byte[] onFastForward;
    private static Object onMediaButtonEvent;
    public static final Map onPause;
    private static byte[] onPlay;
    private static Object onPlayFromMediaId;
    private static long onPlayFromUri;
    private static int onPrepare;
    private static long onPrepareFromSearch;
    private static int onPrepareFromUri;
    private static int onRemoveQueueItem;
    private static boolean onRemoveQueueItemAt;
    private static long onRewind;
    private static int onSeekTo;
    private static int onSetRating;
    private static byte[] onSetShuffleMode;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, byte r7, int r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.$17
            int r1 = r1 + 19
            int r2 = r1 % 128
            kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.$16 = r2
            int r1 = r1 % r0
            int r8 = r8 + 4
            int r7 = 62 - r7
            byte[] r1 = kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.$$a
            int r6 = 119 - r6
            byte[] r2 = new byte[r7]
            r3 = 0
            if (r1 != 0) goto L1c
            r5 = r7
            r4 = r3
            goto L35
        L1c:
            r4 = r3
        L1d:
            byte r5 = (byte) r6
            r2[r4] = r5
            int r4 = r4 + 1
            if (r4 != r7) goto L33
            java.lang.String r6 = new java.lang.String
            r6.<init>(r2, r3)
            int r7 = kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.$16
            int r7 = r7 + 109
            int r8 = r7 % 128
            kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.$17 = r8
            int r7 = r7 % r0
            return r6
        L33:
            r5 = r1[r8]
        L35:
            int r8 = r8 + 1
            int r6 = r6 + r5
            int r6 = r6 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.$$c(short, byte, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x041f, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0422, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0455, code lost:
    
        r6.append(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x045a, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x045b, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x045e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0473, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0302, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.URL IconCompatParcelizer(java.lang.String r20, android.content.pm.ApplicationInfo r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1165
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.IconCompatParcelizer(java.lang.String, android.content.pm.ApplicationInfo):java.net.URL");
    }

    private DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0() {
    }

    public static Object read(int i) {
        int i2 = 2 % 2;
        int i3 = $11 + 11;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            Integer.valueOf(i ^ onPrepareFromUri);
            throw null;
        }
        Map map = onPause;
        Integer numValueOf = Integer.valueOf(i ^ onPrepareFromUri);
        int i4 = $11;
        int i5 = (i4 ^ 55) + ((i4 & 55) << 1);
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object obj = map.get(numValueOf);
        int i7 = $10;
        int i8 = (i7 ^ 37) + ((i7 & 37) << 1);
        $11 = i8 % 128;
        int i9 = i8 % 2;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x046a, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r29[r9], r29[81], (short) (kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.$$b >>> 2))).getMethod($$c(r29[46], r29[575(0x23f, float:8.06E-43)], (short) 378), null).invoke(r12, null)).booleanValue() != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x1c7e, code lost:
    
        r11 = r48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x1c85, code lost:
    
        r1 = r45.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r1.setAccessible(true);
        kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.onMediaButtonEvent = r1.newInstance(r2, java.lang.Boolean.valueOf(!r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x1cae, code lost:
    
        if (r11 == null) goto L794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x1cb0, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x1cb4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x1cb5, code lost:
    
        r1 = r0;
        r5 = r46;
        r48 = r48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x1cbd, code lost:
    
        if (r46 == 0) goto L799;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x1cbf, code lost:
    
        r5 = r46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x1cc3, code lost:
    
        if (r5 < 26) goto L798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x1ccb, code lost:
    
        r5 = r46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x1cce, code lost:
    
        r2 = new java.lang.Object[]{-1133766888, -323791979};
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(1344538224);
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x1ceb, code lost:
    
        if (r1 != null) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x1ced, code lost:
    
        r1 = -android.text.TextUtils.indexOf("", "");
        r1 = (char) (((r1 | 46412) << 1) - (r1 ^ 46412));
        r3 = -(android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
        r54 = (r3 ^ 12869) + ((r3 & 12869) << 1);
        r3 = (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1));
        r55 = (r3 ^ 27) + ((r3 & 27) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x1d2c, code lost:
    
        r58 = $$c(r3[199(0xc7, float:2.79E-43)], (byte) (-kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.$$a[138(0x8a, float:1.93E-43)]), (short) 1113);
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x1d37, code lost:
    
        r3 = kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.$14 + 27;
        kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.$15 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x1d41, code lost:
    
        if ((r3 % 2) != 0) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x1d44, code lost:
    
        r4 = new java.lang.Class[3];
        r4[0] = java.lang.Integer.TYPE;
        r59 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x1d4e, code lost:
    
        r7 = new java.lang.Class[2];
        r7[0] = java.lang.Integer.TYPE;
        r59 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x1d59, code lost:
    
        r59[1] = java.lang.Integer.TYPE;
        r1 = kotlin.startForeground.read(r1, r54, r55, 778945253, false, r58, r59);
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x1d64, code lost:
    
        r7 = 2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x1d68, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x1d6e, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x1d74, code lost:
    
        r11 = 6;
        r13 = 2;
        r15 = true;
        r30 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x1d82, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x1d84, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x1d88, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x1d89, code lost:
    
        r2 = r1.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x1d8d, code lost:
    
        if (r2 != null) goto L825;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x1d8f, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x1d90, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x1d91, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x1d92, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:1079:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1160:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1229:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1309:? A[Catch: all -> 0x1fe5, SYNTHETIC, TryCatch #111 {all -> 0x1fe5, blocks: (B:947:0x1f98, B:948:0x1f9b, B:823:0x1d89, B:825:0x1d8f, B:826:0x1d90, B:953:0x1fb8, B:955:0x1fbf, B:956:0x1fc0, B:961:0x1fdc, B:963:0x1fe3, B:964:0x1fe4), top: B:1233:0x08e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x067d A[Catch: all -> 0x1fe7, TryCatch #112 {all -> 0x1fe7, blocks: (B:214:0x0677, B:216:0x067d, B:217:0x067e, B:251:0x0815, B:253:0x081b, B:254:0x081c, B:262:0x0829, B:267:0x0889, B:269:0x088f, B:270:0x0890, B:256:0x081e, B:258:0x0825, B:259:0x0826, B:239:0x0742, B:241:0x0748, B:242:0x0749, B:272:0x0892, B:274:0x0899, B:275:0x089a, B:229:0x06ee, B:231:0x06f4, B:232:0x06f5, B:292:0x08e2, B:300:0x0923, B:304:0x095e, B:307:0x099a, B:308:0x09bf, B:310:0x09f8, B:314:0x0a61, B:316:0x0a66, B:318:0x0a6d, B:319:0x0a6e, B:320:0x0a6f, B:322:0x0aa4, B:324:0x0ae6, B:326:0x0aea, B:328:0x0b1b, B:330:0x0b27, B:332:0x0b2e, B:333:0x0b2f, B:334:0x0b30, B:335:0x0b34, B:337:0x0b3a, B:343:0x0b90, B:349:0x0bcf, B:351:0x0bd7, B:354:0x0be3, B:357:0x0c2f, B:359:0x0c74, B:363:0x0c84, B:364:0x0c88, B:373:0x0c97, B:372:0x0c94, B:375:0x0c99, B:377:0x0ca0, B:378:0x0ca1, B:380:0x0ca3, B:382:0x0caa, B:383:0x0cab, B:385:0x0cad, B:387:0x0cb6, B:388:0x0cb7, B:390:0x0cb9, B:392:0x0cc2, B:393:0x0cc3, B:403:0x0d00, B:404:0x0d28, B:283:0x08bc, B:285:0x08c2, B:286:0x08c3, B:234:0x06f8, B:263:0x085c, B:264:0x0886, B:243:0x074a, B:220:0x0689, B:223:0x06a9, B:225:0x06c6, B:224:0x06b8, B:246:0x07cf), top: B:1234:0x0829, inners: #17, #58, #63, #119, #124, #130 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x067e A[Catch: all -> 0x1fe7, TRY_LEAVE, TryCatch #112 {all -> 0x1fe7, blocks: (B:214:0x0677, B:216:0x067d, B:217:0x067e, B:251:0x0815, B:253:0x081b, B:254:0x081c, B:262:0x0829, B:267:0x0889, B:269:0x088f, B:270:0x0890, B:256:0x081e, B:258:0x0825, B:259:0x0826, B:239:0x0742, B:241:0x0748, B:242:0x0749, B:272:0x0892, B:274:0x0899, B:275:0x089a, B:229:0x06ee, B:231:0x06f4, B:232:0x06f5, B:292:0x08e2, B:300:0x0923, B:304:0x095e, B:307:0x099a, B:308:0x09bf, B:310:0x09f8, B:314:0x0a61, B:316:0x0a66, B:318:0x0a6d, B:319:0x0a6e, B:320:0x0a6f, B:322:0x0aa4, B:324:0x0ae6, B:326:0x0aea, B:328:0x0b1b, B:330:0x0b27, B:332:0x0b2e, B:333:0x0b2f, B:334:0x0b30, B:335:0x0b34, B:337:0x0b3a, B:343:0x0b90, B:349:0x0bcf, B:351:0x0bd7, B:354:0x0be3, B:357:0x0c2f, B:359:0x0c74, B:363:0x0c84, B:364:0x0c88, B:373:0x0c97, B:372:0x0c94, B:375:0x0c99, B:377:0x0ca0, B:378:0x0ca1, B:380:0x0ca3, B:382:0x0caa, B:383:0x0cab, B:385:0x0cad, B:387:0x0cb6, B:388:0x0cb7, B:390:0x0cb9, B:392:0x0cc2, B:393:0x0cc3, B:403:0x0d00, B:404:0x0d28, B:283:0x08bc, B:285:0x08c2, B:286:0x08c3, B:234:0x06f8, B:263:0x085c, B:264:0x0886, B:243:0x074a, B:220:0x0689, B:223:0x06a9, B:225:0x06c6, B:224:0x06b8, B:246:0x07cf), top: B:1234:0x0829, inners: #17, #58, #63, #119, #124, #130 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x1079 A[Catch: all -> 0x1ec7, TryCatch #99 {all -> 0x1ec7, blocks: (B:449:0x0f6b, B:493:0x1132, B:477:0x1073, B:479:0x1079, B:480:0x107a, B:483:0x107f), top: B:1211:0x0f6b }] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x107a A[Catch: all -> 0x1ec7, TryCatch #99 {all -> 0x1ec7, blocks: (B:449:0x0f6b, B:493:0x1132, B:477:0x1073, B:479:0x1079, B:480:0x107a, B:483:0x107f), top: B:1211:0x0f6b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x028f A[Catch: Exception -> 0x20e3, TRY_ENTER, TRY_LEAVE, TryCatch #15 {Exception -> 0x20e3, blocks: (B:13:0x00ed, B:15:0x0102, B:17:0x0114, B:50:0x023b, B:1006:0x20da, B:1008:0x20e1, B:1009:0x20e2, B:56:0x028f, B:996:0x20c6, B:998:0x20cd, B:999:0x20ce, B:1001:0x20d0, B:1003:0x20d7, B:1004:0x20d8, B:61:0x0302, B:66:0x0350, B:68:0x0356, B:69:0x0357, B:70:0x0358, B:72:0x03ad, B:74:0x03b8, B:83:0x03f7, B:87:0x0400, B:91:0x0409, B:96:0x0414, B:102:0x041f, B:978:0x2016, B:980:0x201a, B:993:0x20a6, B:981:0x2029, B:982:0x2033, B:987:0x2077, B:989:0x207d, B:990:0x207e, B:62:0x0315, B:983:0x2047, B:984:0x2074, B:58:0x02d9, B:57:0x02a0, B:51:0x025b, B:53:0x0288), top: B:1056:0x00ed, inners: #22, #48, #98, #103, #106 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x1f00 A[Catch: all -> 0x1f84, TryCatch #53 {all -> 0x1f84, blocks: (B:843:0x1dc7, B:848:0x1e27, B:850:0x1e2d, B:851:0x1e2e, B:834:0x1db0, B:836:0x1db6, B:837:0x1db7, B:865:0x1e66, B:867:0x1e6d, B:868:0x1e6e, B:870:0x1e70, B:872:0x1e84, B:873:0x1e85, B:889:0x1eb8, B:891:0x1ec5, B:892:0x1ec6, B:904:0x1ef3, B:906:0x1f00, B:907:0x1f01, B:914:0x1f1c, B:916:0x1f27, B:917:0x1f28, B:924:0x1f4c, B:919:0x1f2a, B:921:0x1f3d, B:922:0x1f3e, B:929:0x1f5c, B:931:0x1f6a, B:932:0x1f6b, B:934:0x1f6d, B:936:0x1f82, B:937:0x1f83, B:844:0x1dfa, B:845:0x1e24, B:418:0x0dcc, B:412:0x0d4c, B:628:0x1660), top: B:1034:0x0dcc, inners: #0, #3, #36, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:907:0x1f01 A[Catch: all -> 0x1f84, TryCatch #53 {all -> 0x1f84, blocks: (B:843:0x1dc7, B:848:0x1e27, B:850:0x1e2d, B:851:0x1e2e, B:834:0x1db0, B:836:0x1db6, B:837:0x1db7, B:865:0x1e66, B:867:0x1e6d, B:868:0x1e6e, B:870:0x1e70, B:872:0x1e84, B:873:0x1e85, B:889:0x1eb8, B:891:0x1ec5, B:892:0x1ec6, B:904:0x1ef3, B:906:0x1f00, B:907:0x1f01, B:914:0x1f1c, B:916:0x1f27, B:917:0x1f28, B:924:0x1f4c, B:919:0x1f2a, B:921:0x1f3d, B:922:0x1f3e, B:929:0x1f5c, B:931:0x1f6a, B:932:0x1f6b, B:934:0x1f6d, B:936:0x1f82, B:937:0x1f83, B:844:0x1dfa, B:845:0x1e24, B:418:0x0dcc, B:412:0x0d4c, B:628:0x1660), top: B:1034:0x0dcc, inners: #0, #3, #36, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:947:0x1f98 A[Catch: all -> 0x1fe5, TRY_ENTER, TryCatch #111 {all -> 0x1fe5, blocks: (B:947:0x1f98, B:948:0x1f9b, B:823:0x1d89, B:825:0x1d8f, B:826:0x1d90, B:953:0x1fb8, B:955:0x1fbf, B:956:0x1fc0, B:961:0x1fdc, B:963:0x1fe3, B:964:0x1fe4), top: B:1233:0x08e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:978:0x2016 A[Catch: Exception -> 0x20e3, TRY_ENTER, TryCatch #15 {Exception -> 0x20e3, blocks: (B:13:0x00ed, B:15:0x0102, B:17:0x0114, B:50:0x023b, B:1006:0x20da, B:1008:0x20e1, B:1009:0x20e2, B:56:0x028f, B:996:0x20c6, B:998:0x20cd, B:999:0x20ce, B:1001:0x20d0, B:1003:0x20d7, B:1004:0x20d8, B:61:0x0302, B:66:0x0350, B:68:0x0356, B:69:0x0357, B:70:0x0358, B:72:0x03ad, B:74:0x03b8, B:83:0x03f7, B:87:0x0400, B:91:0x0409, B:96:0x0414, B:102:0x041f, B:978:0x2016, B:980:0x201a, B:993:0x20a6, B:981:0x2029, B:982:0x2033, B:987:0x2077, B:989:0x207d, B:990:0x207e, B:62:0x0315, B:983:0x2047, B:984:0x2074, B:58:0x02d9, B:57:0x02a0, B:51:0x025b, B:53:0x0288), top: B:1056:0x00ed, inners: #22, #48, #98, #103, #106 }] */
    /* JADX WARN: Removed duplicated region for block: B:991:0x207f  */
    /* JADX WARN: Type inference failed for: r10v83, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v94, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r11v127 */
    /* JADX WARN: Type inference failed for: r11v149 */
    /* JADX WARN: Type inference failed for: r11v156, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r11v160, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r11v177 */
    /* JADX WARN: Type inference failed for: r11v180 */
    /* JADX WARN: Type inference failed for: r11v190 */
    /* JADX WARN: Type inference failed for: r11v301 */
    /* JADX WARN: Type inference failed for: r11v306 */
    /* JADX WARN: Type inference failed for: r11v307 */
    /* JADX WARN: Type inference failed for: r11v308 */
    /* JADX WARN: Type inference failed for: r11v310 */
    /* JADX WARN: Type inference failed for: r11v312 */
    /* JADX WARN: Type inference failed for: r11v53, types: [int, short] */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v70, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r11v80 */
    /* JADX WARN: Type inference failed for: r11v89, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v54, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r13v68, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r14v51, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r3v237, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v144, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v162, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v116, types: [java.lang.Class] */
    static {
        /*
            Method dump skipped, instruction units count: 8462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelectorVideoTrackInfoExternalSyntheticLambda0.<clinit>():void");
    }

    public static Object write(int i, int i2, char c, int i3, boolean z, String str, Class[] clsArr) throws Throwable {
        Object method;
        int i4 = 2 % 2;
        int i5 = $11 + 51;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Map map = onPause;
        Object obj = map.get(Integer.valueOf(i3));
        if (obj != null) {
            return obj;
        }
        Integer numValueOf = Integer.valueOf(i3);
        Object obj2 = onMediaButtonEvent;
        int i7 = $11 + 59;
        $10 = i7 % 128;
        Object obj3 = null;
        if (i7 % 2 != 0) {
            throw null;
        }
        try {
            Object[] objArr = new Object[3];
            objArr[2] = Character.valueOf(c);
            Integer numValueOf2 = Integer.valueOf(i2);
            int i8 = $11;
            int i9 = ((i8 | 91) << 1) - (i8 ^ 91);
            $10 = i9 % 128;
            int i10 = i9 % 2;
            objArr[1] = numValueOf2;
            objArr[0] = Integer.valueOf(i);
            byte[] bArr = $$a;
            String str$$c = $$c(bArr[16], bArr[153], (short) 613);
            int i11 = $11;
            int i12 = (i11 & 55) + (i11 | 55);
            $10 = i12 % 128;
            int i13 = i12 % 2;
            Method method2 = Class.forName(str$$c, true, (ClassLoader) onPlayFromMediaId).getMethod($$c(bArr[0], bArr[49], (short) 669), Integer.TYPE, Integer.TYPE, Character.TYPE);
            int i14 = $11 + 111;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                obj3.hashCode();
                throw null;
            }
            Class cls = (Class) method2.invoke(obj2, objArr);
            if (str == null) {
                method = !z ? cls.getConstructor(clsArr) : cls.getDeclaredConstructor(clsArr);
            } else if (clsArr == null) {
                if (z) {
                    int i15 = $10;
                    int i16 = ((i15 | 33) << 1) - (i15 ^ 33);
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    method = cls.getDeclaredField(str);
                } else {
                    method = cls.getField(str);
                    int i18 = $10 + 57;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                }
            } else if (z) {
                int i20 = $10 + 103;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                method = cls.getDeclaredMethod(str, clsArr);
            } else {
                method = cls.getMethod(str, clsArr);
            }
            map.put(numValueOf, method);
            return method;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object RemoteActionCompatParcelizer(int i, int i2, char c) throws Throwable {
        String str$$c;
        Object obj;
        Class<?> cls;
        char c2;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = ((i4 | 37) << 1) - (i4 ^ 37);
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object obj2 = onMediaButtonEvent;
        int i7 = i4 + 35;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i4 + 123;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        try {
            Object[] objArr = new Object[3];
            objArr[2] = Character.valueOf(c);
            int i11 = $11 + 55;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            objArr[1] = Integer.valueOf(i2);
            objArr[0] = Integer.valueOf(i);
            int i13 = $11 + 63;
            int i14 = i13 % 128;
            $10 = i14;
            int i15 = i13 % 2;
            byte[] bArr = $$a;
            byte b = bArr[16];
            byte b2 = bArr[153];
            int i16 = ((i14 | 51) << 1) - (i14 ^ 51);
            $11 = i16 % 128;
            byte b3 = b2;
            if (i16 % 2 == 0) {
                str$$c = $$c(b, b3, (short) 32415);
                obj = onPlayFromMediaId;
            } else {
                str$$c = $$c(b, b3, (short) 613);
                obj = onPlayFromMediaId;
            }
            Class<?> cls2 = Class.forName(str$$c, true, (ClassLoader) obj);
            String str$$c2 = $$c(bArr[0], bArr[49], (short) 669);
            Class<?>[] clsArr = new Class[3];
            int i17 = $10 + 115;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                clsArr[1] = Integer.TYPE;
                clsArr[0] = Integer.TYPE;
                cls = Character.TYPE;
                c2 = 5;
            } else {
                clsArr[0] = Integer.TYPE;
                clsArr[1] = Integer.TYPE;
                cls = Character.TYPE;
                c2 = 2;
            }
            int i18 = $11;
            int i19 = (i18 ^ 5) + ((5 & i18) << 1);
            $10 = i19 % 128;
            if (i19 % 2 == 0) {
                clsArr[c2] = cls;
                return cls2.getMethod(str$$c2, clsArr).invoke(obj2, objArr);
            }
            clsArr[c2] = cls;
            cls2.getMethod(str$$c2, clsArr).invoke(obj2, objArr);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int IconCompatParcelizer(Object obj) throws Throwable {
        byte b;
        byte b2;
        int i;
        int i2 = 2 % 2;
        Object obj2 = onMediaButtonEvent;
        int i3 = $11 + 7;
        int i4 = i3 % 128;
        $10 = i4;
        if (i3 % 2 != 0) {
            int i5 = 4 / 4;
        }
        int i6 = i4 + 35;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {obj};
            byte[] bArr = $$a;
            int i8 = i4 + 57;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                b = bArr[16];
                b2 = bArr[25570];
                i = 22648;
            } else {
                b = bArr[16];
                b2 = bArr[153];
                i = 613;
            }
            Class<?> cls = Class.forName($$c(b, b2, (short) i), true, (ClassLoader) onPlayFromMediaId);
            byte b3 = bArr[575];
            int i9 = $10;
            int i10 = (i9 & 43) + (i9 | 43);
            $11 = i10 % 128;
            int i11 = i10 % 2;
            String str$$c = $$c(b3, (byte) (-bArr[562]), (short) 1149);
            Class<?>[] clsArr = new Class[1];
            int i12 = $11;
            int i13 = ((i12 | 123) << 1) - (i12 ^ 123);
            $10 = i13 % 128;
            int i14 = i13 % 2;
            clsArr[0] = Object.class;
            Object objInvoke = cls.getMethod(str$$c, clsArr).invoke(obj2, objArr);
            int i15 = $11 + 21;
            $10 = i15 % 128;
            if (i15 % 2 == 0) {
                return ((Integer) objInvoke).intValue();
            }
            ((Integer) objInvoke).intValue();
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int write(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = (i3 & 69) + (i3 | 69);
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Object obj = onMediaButtonEvent;
        int i6 = (i3 & 81) + (i3 | 81);
        $11 = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = $$a;
            byte b = bArr[16];
            byte b2 = bArr[153];
            int i8 = $11;
            int i9 = (i8 & 115) + (i8 | 115);
            $10 = i9 % 128;
            int i10 = i9 % 2;
            Class<?> cls = Class.forName($$c(b, b2, (short) 613), true, (ClassLoader) onPlayFromMediaId);
            int i11 = $11;
            int i12 = ((i11 | 67) << 1) - (i11 ^ 67);
            $10 = i12 % 128;
            int i13 = i12 % 2;
            byte b3 = bArr[23];
            byte b4 = bArr[604];
            int i14 = i11 + 113;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            Method method = cls.getMethod($$c(b3, b4, (short) 1179), Integer.TYPE);
            int i16 = $11;
            int i17 = (i16 ^ 21) + ((i16 & 21) << 1);
            $10 = i17 % 128;
            if (i17 % 2 == 0) {
                return ((Integer) method.invoke(obj, objArr)).intValue();
            }
            ((Integer) method.invoke(obj, objArr)).intValue();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
