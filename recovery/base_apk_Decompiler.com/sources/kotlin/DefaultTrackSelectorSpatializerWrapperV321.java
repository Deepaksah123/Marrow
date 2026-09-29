package kotlin;

import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTrackSelectorSpatializerWrapperV321 {
    private static final byte[] $$a;
    private static final int $$b;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $14 = 0;
    private static int $15 = 1;
    private static int $16 = 0;
    private static int $17 = 1;
    public static final Map onAddQueueItem;
    private static Object onFastForward;
    private static byte[] onMediaButtonEvent;
    private static byte[] onPause;
    public static final Map onPlay;
    private static Object onPlayFromMediaId;
    private static int onPlayFromSearch;
    private static long onPrepare;
    private static long onPrepareFromSearch;
    private static long onPrepareFromUri;
    private static int onRemoveQueueItem;
    private static int onRemoveQueueItemAt;
    private static int onRewind;
    private static boolean onSeekTo;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r9 = r12;
        r12 = r10;
        r10 = r6;
        r6 = r1;
        r1 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r10, int r11, byte r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.DefaultTrackSelectorSpatializerWrapperV321.$17
            int r2 = r1 + 33
            int r3 = r2 % 128
            kotlin.DefaultTrackSelectorSpatializerWrapperV321.$16 = r3
            int r2 = r2 % r0
            r2 = 4
            int r10 = r10 + r2
            byte[] r3 = kotlin.DefaultTrackSelectorSpatializerWrapperV321.$$a
            int r12 = r12 + 33
            int r4 = 46 - r11
            byte[] r4 = new byte[r4]
            int r11 = 45 - r11
            r5 = 0
            if (r3 != 0) goto L26
            int r1 = r1 + 91
            int r6 = r1 % 128
            kotlin.DefaultTrackSelectorSpatializerWrapperV321.$16 = r6
            int r1 = r1 % r0
            r1 = r12
            r6 = r5
            r12 = r10
            goto L48
        L26:
            r1 = r5
        L27:
            byte r6 = (byte) r12
            r4[r1] = r6
            if (r1 != r11) goto L32
            java.lang.String r10 = new java.lang.String
            r10.<init>(r4, r5)
            return r10
        L32:
            int r1 = r1 + 1
            r6 = r3[r10]
            int r7 = kotlin.DefaultTrackSelectorSpatializerWrapperV321.$16
            int r7 = r7 + 123
            int r8 = r7 % 128
            kotlin.DefaultTrackSelectorSpatializerWrapperV321.$17 = r8
            int r7 = r7 % r0
            if (r7 != 0) goto L43
            int r7 = r2 % 5
        L43:
            r9 = r12
            r12 = r10
            r10 = r6
            r6 = r1
            r1 = r9
        L48:
            int r10 = -r10
            int r12 = r12 + 1
            int r1 = r1 + r10
            int r10 = r1 + 1
            r1 = r6
            r9 = r12
            r12 = r10
            r10 = r9
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelectorSpatializerWrapperV321.$$c(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0447, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c((short) (r32[237(0xed, float:3.32E-43)] - 1), r32[42], r8 == true ? 1 : 0)).getMethod($$c((short) 380, r32[33], r32[51]), null).invoke(r10, null)).booleanValue() != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x1c01, code lost:
    
        r10 = r48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x1c06, code lost:
    
        r1 = r49.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r1.setAccessible(true);
        kotlin.DefaultTrackSelectorSpatializerWrapperV321.onPlayFromMediaId = r1.newInstance(r3, java.lang.Boolean.valueOf(!r30));
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x1c2f, code lost:
    
        if (r10 == null) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x1c31, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x1c35, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x1c36, code lost:
    
        r1 = r0;
        r3 = r31 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x1c3b, code lost:
    
        r2 = r2;
        r3 = r3;
        r33 = r33;
        r44 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x1c3f, code lost:
    
        if (r31 == false) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x1c41, code lost:
    
        r3 = r31 ? 1 : 0;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x1c45, code lost:
    
        if (r3 < 26) goto L752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x1c48, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x1c4c, code lost:
    
        r3 = r31 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x1c4f, code lost:
    
        r4 = new java.lang.Object[]{-29733824, -1016511376};
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(1344538224);
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x1c6c, code lost:
    
        if (r1 != null) goto L760;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x1c72, code lost:
    
        r1 = android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0);
        r5 = 12868 - (~(-(android.view.KeyEvent.getMaxKeyCode() >> 16)));
        r59 = 27 - (~(-(-(android.media.AudioTrack.getMinVolume() > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.media.AudioTrack.getMinVolume() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)))));
        r8 = kotlin.DefaultTrackSelectorSpatializerWrapperV321.$$a;
        r1 = kotlin.startForeground.read((char) ((r1 ^ 46413) + ((r1 & 46413) << 1)), r5, r59, 778945253, false, $$c((short) 1107, r8[564(0x234, float:7.9E-43)], r8[191(0xbf, float:2.68E-43)]), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x1cc9, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r4);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x1ccf, code lost:
    
        r35 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x1cda, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x1cdc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x1cdf, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x1ce0, code lost:
    
        r4 = r1.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1ce4, code lost:
    
        if (r4 != null) goto L770;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x1ce6, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x1ce7, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x1ce8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x1ce9, code lost:
    
        r1 = r0;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x1cec, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1026:0x0cc8 A[EXC_TOP_SPLITTER, PHI: r2 r3
      0x0cc8: PHI (r2v61 ??) = (r2v58 ??), (r2v105 ??), (r2v108 ??) binds: [B:272:0x08e9, B:281:0x0966, B:387:0x0cc7] A[DONT_GENERATE, DONT_INLINE]
      0x0cc8: PHI (r3v39 ??) = (r3v38 ??), (r3v38 ??), (r3v201 ??) binds: [B:272:0x08e9, B:281:0x0966, B:387:0x0cc7] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1056:0x0f62 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1119:0x1154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1178:0x1a6b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1234:0x1c01 A[EDGE_INSN: B:1234:0x1c01->B:740:0x1c01 BREAK  A[LOOP:4: B:414:0x0e27->B:708:0x1bac], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1250:? A[Catch: all -> 0x1f57, SYNTHETIC, TryCatch #28 {all -> 0x1f57, blocks: (B:889:0x1f12, B:890:0x1f15, B:892:0x1f17, B:894:0x1f2f, B:895:0x1f30, B:900:0x1f48, B:902:0x1f55, B:903:0x1f56, B:388:0x0cc8), top: B:1026:0x0cc8, inners: #131 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0461 A[Catch: all -> 0x0463, TryCatch #36 {all -> 0x0463, blocks: (B:127:0x045b, B:129:0x0461, B:130:0x0462), top: B:1040:0x045b }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0462 A[Catch: all -> 0x0463, TRY_LEAVE, TryCatch #36 {all -> 0x0463, blocks: (B:127:0x045b, B:129:0x0461, B:130:0x0462), top: B:1040:0x045b }] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0d39 A[Catch: all -> 0x1efc, TryCatch #122 {all -> 0x1efc, blocks: (B:394:0x0d34, B:396:0x0d39, B:397:0x0d40), top: B:1186:0x0d34 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0d40 A[Catch: all -> 0x1efc, TRY_LEAVE, TryCatch #122 {all -> 0x1efc, blocks: (B:394:0x0d34, B:396:0x0d39, B:397:0x0d40), top: B:1186:0x0d34 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0e36 A[Catch: all -> 0x1e44, LOOP:5: B:417:0x0e34->B:418:0x0e36, LOOP_END, TRY_ENTER, TryCatch #15 {all -> 0x1e44, blocks: (B:415:0x0e29, B:418:0x0e36, B:419:0x0ee3, B:421:0x0ee6, B:422:0x0f02, B:425:0x0f5e), top: B:1002:0x0e29 }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0ee6 A[Catch: all -> 0x1e44, LOOP:6: B:419:0x0ee3->B:421:0x0ee6, LOOP_END, TryCatch #15 {all -> 0x1e44, blocks: (B:415:0x0e29, B:418:0x0e36, B:419:0x0ee3, B:421:0x0ee6, B:422:0x0f02, B:425:0x0f5e), top: B:1002:0x0e29 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x1069 A[Catch: all -> 0x106b, TryCatch #43 {all -> 0x106b, blocks: (B:453:0x1063, B:455:0x1069, B:456:0x106a), top: B:1053:0x1063 }] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x106a A[Catch: all -> 0x106b, TRY_LEAVE, TryCatch #43 {all -> 0x106b, blocks: (B:453:0x1063, B:455:0x1069, B:456:0x106a), top: B:1053:0x1063 }] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x1087  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x15c9  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x194f  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x1a09  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x1d84 A[Catch: all -> 0x1da8, TRY_ENTER, TryCatch #65 {all -> 0x1da8, blocks: (B:796:0x1d5d, B:799:0x1d84, B:801:0x1da7, B:800:0x1d98), top: B:1090:0x1d5d, outer: #121 }] */
    /* JADX WARN: Removed duplicated region for block: B:800:0x1d98 A[Catch: all -> 0x1da8, TryCatch #65 {all -> 0x1da8, blocks: (B:796:0x1d5d, B:799:0x1d84, B:801:0x1da7, B:800:0x1d98), top: B:1090:0x1d5d, outer: #121 }] */
    /* JADX WARN: Removed duplicated region for block: B:889:0x1f12 A[Catch: all -> 0x1f57, TRY_ENTER, TryCatch #28 {all -> 0x1f57, blocks: (B:889:0x1f12, B:890:0x1f15, B:892:0x1f17, B:894:0x1f2f, B:895:0x1f30, B:900:0x1f48, B:902:0x1f55, B:903:0x1f56, B:388:0x0cc8), top: B:1026:0x0cc8, inners: #131 }] */
    /* JADX WARN: Removed duplicated region for block: B:917:0x1f8d  */
    /* JADX WARN: Type inference failed for: r10v155 */
    /* JADX WARN: Type inference failed for: r10v156 */
    /* JADX WARN: Type inference failed for: r10v167 */
    /* JADX WARN: Type inference failed for: r10v179 */
    /* JADX WARN: Type inference failed for: r10v309 */
    /* JADX WARN: Type inference failed for: r10v310 */
    /* JADX WARN: Type inference failed for: r10v311 */
    /* JADX WARN: Type inference failed for: r10v312 */
    /* JADX WARN: Type inference failed for: r10v313 */
    /* JADX WARN: Type inference failed for: r10v321 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v44, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v67, types: [int] */
    /* JADX WARN: Type inference failed for: r10v75 */
    /* JADX WARN: Type inference failed for: r11v115, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r12v140 */
    /* JADX WARN: Type inference failed for: r12v15, types: [short] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r13v74, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r13v89, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r14v91, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v180, types: [int, short] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v104, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v105, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v110 */
    /* JADX WARN: Type inference failed for: r2v122, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v191 */
    /* JADX WARN: Type inference failed for: r2v192 */
    /* JADX WARN: Type inference failed for: r2v193 */
    /* JADX WARN: Type inference failed for: r2v194 */
    /* JADX WARN: Type inference failed for: r2v195 */
    /* JADX WARN: Type inference failed for: r2v196 */
    /* JADX WARN: Type inference failed for: r2v197 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v46, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [int] */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r3v144 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v197 */
    /* JADX WARN: Type inference failed for: r3v199, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v201 */
    /* JADX WARN: Type inference failed for: r3v203 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v238 */
    /* JADX WARN: Type inference failed for: r3v239 */
    /* JADX WARN: Type inference failed for: r3v240 */
    /* JADX WARN: Type inference failed for: r3v241 */
    /* JADX WARN: Type inference failed for: r3v242 */
    /* JADX WARN: Type inference failed for: r3v243 */
    /* JADX WARN: Type inference failed for: r3v244 */
    /* JADX WARN: Type inference failed for: r3v245 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v73, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v13 */
    /* JADX WARN: Type inference failed for: r44v14 */
    /* JADX WARN: Type inference failed for: r44v15 */
    /* JADX WARN: Type inference failed for: r44v16 */
    /* JADX WARN: Type inference failed for: r44v17 */
    /* JADX WARN: Type inference failed for: r44v18 */
    /* JADX WARN: Type inference failed for: r44v19 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v20 */
    /* JADX WARN: Type inference failed for: r44v21 */
    /* JADX WARN: Type inference failed for: r44v22 */
    /* JADX WARN: Type inference failed for: r44v23 */
    /* JADX WARN: Type inference failed for: r44v24 */
    /* JADX WARN: Type inference failed for: r44v25 */
    /* JADX WARN: Type inference failed for: r44v26 */
    /* JADX WARN: Type inference failed for: r44v27 */
    /* JADX WARN: Type inference failed for: r44v28 */
    /* JADX WARN: Type inference failed for: r44v29 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /* JADX WARN: Type inference failed for: r44v30 */
    /* JADX WARN: Type inference failed for: r44v4 */
    /* JADX WARN: Type inference failed for: r44v5 */
    /* JADX WARN: Type inference failed for: r44v6 */
    /* JADX WARN: Type inference failed for: r44v7 */
    /* JADX WARN: Type inference failed for: r44v8 */
    /* JADX WARN: Type inference failed for: r44v9 */
    /* JADX WARN: Type inference failed for: r4v130, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v132, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v73, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v96, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r8v119 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v220 */
    /* JADX WARN: Type inference failed for: r8v221 */
    /* JADX WARN: Type inference failed for: r8v27, types: [byte] */
    static {
        /*
            Method dump skipped, instruction units count: 8344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelectorSpatializerWrapperV321.<clinit>():void");
    }

    private static URL IconCompatParcelizer(String str, ApplicationInfo applicationInfo) throws Throwable {
        short s;
        byte b;
        byte b2;
        int iMyTid;
        int i;
        int i2;
        int i3;
        short s2;
        byte b3;
        byte b4;
        Class<?> cls;
        Class<?>[] clsArr;
        URL url;
        ZipFile zipFile;
        short s3;
        char c;
        int i4;
        int i5;
        short s4;
        char c2;
        int i6 = 2;
        int i7 = 2 % 2;
        try {
            ArrayList<File> arrayList = new ArrayList();
            byte[] bArr = $$a;
            int i8 = $10;
            int i9 = ((i8 | 31) << 1) - (i8 ^ 31);
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                s = bArr[45];
                b = bArr[103];
            } else {
                s = bArr[69];
                b = bArr[30];
            }
            Class<?> cls2 = Class.forName($$c(s, b, bArr[21]));
            Runtime.getRuntime().totalMemory();
            Process.myPid();
            byte b5 = (byte) 82;
            if (cls2.getField($$c(bArr[419], bArr[338], b5)).get(applicationInfo) != null) {
                int i10 = $10 + 33;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    s4 = bArr[30];
                    c2 = '1';
                } else {
                    s4 = bArr[69];
                    c2 = 30;
                }
                Class<?> cls3 = Class.forName($$c(s4, bArr[c2], bArr[21]));
                int i11 = $11 + 13;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                try {
                    arrayList.add(Class.forName($$c((short) (bArr[237] - 1), bArr[42], (byte) 73)).getDeclaredConstructor(String.class).newInstance(cls3.getField($$c(bArr[419], bArr[338], b5)).get(applicationInfo)));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            short s5 = bArr[69];
            Runtime.getRuntime().freeMemory();
            Runtime.getRuntime().freeMemory();
            if (Class.forName($$c(s5, bArr[30], bArr[21])).getField($$c(bArr[48], bArr[564], b5)).get(applicationInfo) != null) {
                int i13 = $10 + 95;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    s3 = bArr[100];
                    c = '\n';
                } else {
                    s3 = bArr[69];
                    c = 30;
                }
                Object obj = Class.forName($$c(s3, bArr[c], bArr[21])).getField($$c(bArr[48], bArr[564], b5)).get(applicationInfo);
                int i14 = $10 + 91;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                int i16 = 0;
                while (i16 < length) {
                    try {
                        Object[] objArr2 = {objArr[i16]};
                        byte b6 = $$a[237];
                        long jMaxMemory = Runtime.getRuntime().maxMemory();
                        int i17 = $10;
                        int i18 = ((i17 | 35) << 1) - (i17 ^ 35);
                        $11 = i18 % 128;
                        if (i18 % i6 == 0) {
                            i4 = (int) jMaxMemory;
                            i5 = 0 / (b6 * 569);
                        } else {
                            i4 = (int) jMaxMemory;
                            int i19 = -(-(b6 * 569));
                            i5 = (((-569) | i19) << 1) - (i19 ^ (-569));
                        }
                        int i20 = ~(~b6);
                        int i21 = ~i4;
                        int i22 = ~i21;
                        int i23 = (i20 ^ i22) | (i22 & i20);
                        int i24 = ~b6;
                        int i25 = ~((i24 ^ i21) | (i24 & i21));
                        int i26 = (-1136) * ((i23 ^ i25) | (i25 & i23));
                        int i27 = (i5 & i26) + (i26 | i5);
                        int i28 = ~i4;
                        int i29 = ~(i24 | i4);
                        int i30 = (i28 ^ i29) | (i28 & i29);
                        int i31 = (i21 ^ (-1)) | i21;
                        int i32 = ~((i31 & b6) | (i31 ^ b6));
                        int i33 = -(-(((i30 & i32) | (i30 ^ i32)) * (-568)));
                        int i34 = (i27 & i33) + (i27 | i33);
                        int i35 = ((i17 | 27) << 1) - (i17 ^ 27);
                        $11 = i35 % 128;
                        int i36 = i35 % 2;
                        int i37 = ~i4;
                        int i38 = ~((i37 & b6) | (i37 ^ b6));
                        int i39 = ~((i4 & i24) | (i24 ^ i4));
                        arrayList.add(Class.forName($$c((short) ((i34 - (~(-(-(568 * ((i38 & i39) | (i38 ^ i39))))))) - 1), r7[42], (byte) 73)).getDeclaredConstructor(String.class).newInstance(objArr2));
                        i16 = ((i16 | 1) << 1) - (i16 ^ 1);
                        i6 = 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
            for (File file : arrayList) {
                int i40 = $11 + 115;
                $10 = i40 % 128;
                if (i40 % 2 != 0) {
                    try {
                        b2 = $$a[29037];
                        iMyTid = Process.myTid();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                } else {
                    b2 = $$a[237];
                    iMyTid = Process.myTid();
                }
                int i41 = $10;
                int i42 = (i41 & 15) + (i41 | 15);
                $11 = i42 % 128;
                int i43 = i42 % 2;
                int i44 = -(-(b2 * 193));
                int i45 = (((-193) | i44) << 1) - (i44 ^ (-193));
                int i46 = ~iMyTid;
                int i47 = ~b2;
                int i48 = ((i47 & i46) | (i46 ^ i47)) * (-192);
                int i49 = (i45 ^ i48) + ((i48 & i45) << 1);
                int i50 = ~b2;
                int i51 = ~i50;
                int i52 = ~(i50 | i46);
                int i53 = (i49 - (~(-(-(((i52 & i51) | (i51 ^ i52)) * (-384)))))) - 1;
                int i54 = ~b2;
                int i55 = (i54 ^ iMyTid) | (i54 & iMyTid);
                int i56 = ((i41 | 113) << 1) - (i41 ^ 113);
                $11 = i56 % 128;
                if (i56 % 2 == 0) {
                    i2 = ~i55;
                    i3 = b2 | ((-1) ^ b2);
                    int i57 = 37 / 0;
                } else {
                    int i58 = ~i55;
                    int i59 = (i46 & i54) | (i54 ^ i46);
                    int i60 = ~(i59 | (i59 ^ (-1)));
                    i2 = (i58 & i60) | (i58 ^ i60);
                    i3 = b2 | ((-1) ^ b2);
                }
                int i61 = ~((i3 & iMyTid) | (i3 ^ iMyTid));
                short s6 = (short) ((i53 - (~(PsExtractor.AUDIO_STREAM * ((i61 & i2) | (i2 ^ i61))))) - 1);
                byte[] bArr2 = $$a;
                byte b7 = (byte) 73;
                Class<?> cls4 = Class.forName($$c(s6, bArr2[42], b7));
                short s7 = bArr2[51];
                byte b8 = bArr2[770];
                int i62 = -bArr2[738];
                int i63 = $11 + 11;
                $10 = i63 % 128;
                int i64 = i63 % 2;
                if (((Boolean) cls4.getMethod($$c(s7, b8, (byte) i62), null).invoke(file, null)).booleanValue()) {
                    int i65 = $11 + 111;
                    int i66 = i65 % 128;
                    $10 = i66;
                    int i67 = i65 % 2;
                    int i68 = i66 + 21;
                    $11 = i68 % 128;
                    int i69 = i68 % 2;
                    try {
                        Class<?> cls5 = Class.forName($$c((short) (bArr2[237] - 1), bArr2[42], b7));
                        int i70 = $11;
                        int i71 = ((i70 | 19) << 1) - (i70 ^ 19);
                        int i72 = i71 % 128;
                        $10 = i72;
                        int i73 = i71 % 2;
                        short s8 = bArr2[18];
                        int i74 = ((i72 | 53) << 1) - (i72 ^ 53);
                        $11 = i74 % 128;
                        String str2 = (String) cls5.getMethod(i74 % 2 == 0 ? $$c(s8, bArr2[77], bArr2[12515]) : $$c(s8, bArr2[77], bArr2[132]), null).invoke(file, null);
                        try {
                            byte b9 = bArr2[1146];
                            s2 = (short) ((b9 ^ 1) + ((b9 & 1) << 1));
                            int i75 = $10;
                            int i76 = (i75 & 13) + (i75 | 13);
                            int i77 = i76 % 128;
                            $11 = i77;
                            int i78 = i76 % 2;
                            b3 = bArr2[237];
                            b4 = bArr2[105];
                            int i79 = (i77 & 119) + (i77 | 119);
                            $10 = i79 % 128;
                            int i80 = i79 % 2;
                        } catch (Exception unused) {
                        }
                        if (str2.endsWith($$c(s2, b3, b4))) {
                            StringBuilder sb = new StringBuilder();
                            try {
                                sb.append($$c(bArr2[1131], bArr2[338], b7));
                                int i81 = $11 + 83;
                                $10 = i81 % 128;
                                int i82 = i81 % 2;
                                try {
                                    byte b10 = bArr2[237];
                                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                    int i83 = (-254) - (~(-(-(b10 * 253))));
                                    int i84 = ~(~b10);
                                    int i85 = ~b10;
                                    int i86 = ~startElapsedRealtime;
                                    int i87 = ~((i85 ^ i86) | (i85 & i86));
                                    int i88 = (i84 ^ i87) | (i87 & i84);
                                    int i89 = ((-1) ^ b10) | b10;
                                    int i90 = ~(i89 | startElapsedRealtime);
                                    int i91 = (((i83 - (~(((i88 ^ i90) | (i88 & i90)) * (-252)))) - 1) - (~(i89 * (-252)))) - 1;
                                    int i92 = i85 | i86;
                                    int i93 = ~(i92 | (i92 ^ (-1)));
                                    int i94 = ~((i89 & startElapsedRealtime) | (i89 ^ startElapsedRealtime));
                                    int i95 = -(-(((i93 & i94) | (i93 ^ i94)) * 252));
                                    sb.append((String) Class.forName($$c((short) ((i91 ^ i95) + ((i95 & i91) << 1)), bArr2[42], b7)).getMethod($$c((short) 88, bArr2[564], bArr2[132]), null).invoke(file, null));
                                    short s9 = (short) ((-2) - (bArr2[0] ^ (-1)));
                                    try {
                                        byte b11 = bArr2[158];
                                        int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                        int i96 = 1974 - (~(b11 * 989));
                                        int i97 = ((~b11) | startUptimeMillis) * 988;
                                        int i98 = ((i96 | i97) << 1) - (i96 ^ i97);
                                        int i99 = ~b11;
                                        int i100 = -(-((~((i99 ^ (-1)) | i99)) * (-1976)));
                                        int i101 = (i98 ^ i100) + ((i100 & i98) << 1);
                                        int i102 = ~b11;
                                        int i103 = ~((i99 & startUptimeMillis) | (i99 ^ startUptimeMillis));
                                        int i104 = (i103 & i102) | (i102 ^ i103);
                                        int i105 = ~startUptimeMillis;
                                        int i106 = ~((b11 & i105) | (i105 ^ b11));
                                        try {
                                            sb.append($$c(s9, (byte) ((i101 - (~(((i106 & i104) | (i104 ^ i106)) * 988))) - 1), bArr2[69]));
                                            sb.append(str);
                                            try {
                                                Object[] objArr3 = {sb.toString()};
                                                short s10 = (short) (bArr2[0] - 1);
                                                byte b12 = bArr2[42];
                                                int i107 = $10;
                                                int i108 = (i107 & 75) + (i107 | 75);
                                                $11 = i108 % 128;
                                                if (i108 % 2 == 0) {
                                                    cls = Class.forName($$c(s10, b12, (byte) 14));
                                                    clsArr = new Class[1];
                                                } else {
                                                    cls = Class.forName($$c(s10, b12, b7));
                                                    clsArr = new Class[1];
                                                }
                                                int i109 = $10 + 111;
                                                $11 = i109 % 128;
                                                int i110 = i109 % 2;
                                                clsArr[0] = String.class;
                                                url = (URL) cls.getDeclaredConstructor(clsArr).newInstance(objArr3);
                                                zipFile = new ZipFile(file);
                                                try {
                                                } finally {
                                                }
                                            } catch (Throwable th4) {
                                                Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Exception unused3) {
                                    }
                                } catch (Throwable th5) {
                                    Throwable cause5 = th5.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th5;
                                }
                            } catch (Exception unused4) {
                            }
                            if (zipFile.getEntry(str.substring(1)) != null) {
                                zipFile.close();
                                return url;
                            }
                            zipFile.close();
                            int i111 = $10;
                            int i112 = ((i111 | 99) << 1) - (i111 ^ 99);
                            $11 = i112 % 128;
                            int i113 = i112 % 2;
                            i = $10 + 59;
                            $11 = i % 128;
                            int i114 = i % 2;
                        }
                    } catch (Throwable th6) {
                        Throwable cause6 = th6.getCause();
                        if (cause6 != null) {
                            throw cause6;
                        }
                        throw th6;
                    }
                }
                i = $10 + 7;
                $11 = i % 128;
                int i1142 = i % 2;
            }
            return null;
        } catch (Exception unused5) {
            return null;
        }
    }

    private DefaultTrackSelectorSpatializerWrapperV321() {
    }

    public static Object IconCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = (i3 & 71) + (i3 | 71);
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Map map = onPlay;
        int i6 = onRemoveQueueItem;
        Object obj = map.get(Integer.valueOf(((~i) & i6) | ((~i6) & i)));
        int i7 = $10;
        int i8 = (i7 ^ 93) + ((i7 & 93) << 1);
        $11 = i8 % 128;
        int i9 = i8 % 2;
        return obj;
    }

    public static Object IconCompatParcelizer(char c, int i, int i2, int i3, boolean z, String str, Class[] clsArr) throws Throwable {
        Object[] objArr;
        String str$$c;
        Object obj;
        String str$$c2;
        Class<?>[] clsArr2;
        Object method;
        int i4;
        int i5 = 2 % 2;
        Map map = onPlay;
        Object obj2 = map.get(Integer.valueOf(i3));
        if (obj2 != null) {
            return obj2;
        }
        Integer numValueOf = Integer.valueOf(i3);
        Object obj3 = onPlayFromMediaId;
        int i6 = $10;
        int i7 = (i6 ^ 3) + ((i6 & 3) << 1);
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        int i8 = i6 + 111;
        $11 = i8 % 128;
        try {
            if (i8 % 2 == 0) {
                objArr = new Object[4];
                objArr[2] = Integer.valueOf(i2);
            } else {
                objArr = new Object[3];
                objArr[2] = Integer.valueOf(i2);
            }
            objArr[1] = Integer.valueOf(i);
            objArr[0] = Character.valueOf(c);
            short s = (short) 618;
            byte[] bArr = $$a;
            int i9 = $10 + 27;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                str$$c = $$c(s, bArr[19074], (byte) 51);
                obj = onFastForward;
            } else {
                str$$c = $$c(s, bArr[722], (byte) 78);
                obj = onFastForward;
            }
            Class<?> cls = Class.forName(str$$c, true, (ClassLoader) obj);
            short s2 = (short) 696;
            int i10 = bArr[237] - 1;
            int i11 = $10;
            int i12 = (i11 ^ 25) + ((i11 & 25) << 1);
            $11 = i12 % 128;
            byte b = (byte) i10;
            if (i12 % 2 == 0) {
                str$$c2 = $$c(s2, b, (byte) 112);
                clsArr2 = new Class[5];
            } else {
                str$$c2 = $$c(s2, b, (byte) 86);
                clsArr2 = new Class[3];
            }
            clsArr2[0] = Character.TYPE;
            clsArr2[1] = Integer.TYPE;
            clsArr2[2] = Integer.TYPE;
            Class cls2 = (Class) cls.getMethod(str$$c2, clsArr2).invoke(obj3, objArr);
            int i13 = $10;
            int i14 = (i13 & 5) + (i13 | 5);
            int i15 = i14 % 128;
            $11 = i15;
            int i16 = i14 % 2;
            if (str == null) {
                if (!z) {
                    method = cls2.getConstructor(clsArr);
                    int i17 = $11;
                    i4 = ((i17 | 25) << 1) - (i17 ^ 25);
                    $10 = i4 % 128;
                    int i18 = i4 % 2;
                } else {
                    int i19 = i15 + 51;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    method = cls2.getDeclaredConstructor(clsArr);
                    int i21 = $11;
                    int i22 = (i21 ^ 97) + ((i21 & 97) << 1);
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 5 / 4;
                    }
                }
            } else if (clsArr == null) {
                method = z ? cls2.getDeclaredField(str) : cls2.getField(str);
                int i24 = $10;
                int i25 = ((i24 | 33) << 1) - (i24 ^ 33);
                $11 = i25 % 128;
                if (i25 % 2 == 0) {
                    int i26 = 4 / 3;
                }
            } else if (z) {
                int i27 = i13 + 1;
                $11 = i27 % 128;
                int i28 = i27 % 2;
                method = cls2.getDeclaredMethod(str, clsArr);
            } else {
                method = cls2.getMethod(str, clsArr);
                int i29 = $11;
                i4 = (i29 & 1) + (i29 | 1);
                $10 = i4 % 128;
                int i182 = i4 % 2;
            }
            map.put(numValueOf, method);
            int i30 = $11 + 61;
            $10 = i30 % 128;
            if (i30 % 2 != 0) {
                int i31 = 74 / 0;
            }
            return method;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object IconCompatParcelizer(char c, int i, int i2) throws Throwable {
        Object[] objArr;
        String str$$c;
        Object obj;
        Class<?> cls;
        short s;
        int i3;
        String str$$c2;
        Class<?>[] clsArr;
        Class<?> cls2;
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = ((i5 | 113) << 1) - (i5 ^ 113);
        $11 = i6 % 128;
        int i7 = i6 % 2;
        Object obj2 = onPlayFromMediaId;
        int i8 = (i5 & 75) + (i5 | 75);
        $11 = i8 % 128;
        try {
            if (i8 % 2 == 0) {
                objArr = new Object[3];
                objArr[3] = Integer.valueOf(i2);
            } else {
                objArr = new Object[3];
                objArr[2] = Integer.valueOf(i2);
            }
            objArr[1] = Integer.valueOf(i);
            char c2 = 0;
            objArr[0] = Character.valueOf(c);
            short s2 = (short) 618;
            byte[] bArr = $$a;
            int i9 = $11;
            int i10 = (i9 & 97) + (i9 | 97);
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                str$$c = $$c(s2, bArr[17460], (byte) 85);
                obj = onFastForward;
            } else {
                str$$c = $$c(s2, bArr[722], (byte) 78);
                obj = onFastForward;
            }
            ClassLoader classLoader = (ClassLoader) obj;
            int i11 = $10;
            int i12 = (i11 & 5) + (i11 | 5);
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cls = Class.forName(str$$c, true, classLoader);
                s = (short) 599;
                i3 = bArr[11631] / 0;
            } else {
                cls = Class.forName(str$$c, true, classLoader);
                s = (short) 696;
                i3 = bArr[237] - 1;
            }
            int i13 = $10;
            int i14 = (i13 & 89) + (i13 | 89);
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                String str$$c3 = $$c(s, (byte) i3, (byte) 57);
                cls2 = Character.TYPE;
                clsArr = new Class[3];
                str$$c2 = str$$c3;
                c2 = 1;
            } else {
                str$$c2 = $$c(s, (byte) i3, (byte) 86);
                clsArr = new Class[3];
                cls2 = Character.TYPE;
            }
            clsArr[c2] = cls2;
            clsArr[1] = Integer.TYPE;
            clsArr[2] = Integer.TYPE;
            Method method = cls.getMethod(str$$c2, clsArr);
            int i15 = $10 + 49;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            Object objInvoke = method.invoke(obj2, objArr);
            int i17 = $11 + 25;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int read(Object obj) throws Throwable {
        short s;
        byte b;
        int i;
        byte b2;
        int i2;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = ((i4 | 109) << 1) - (i4 ^ 109);
        int i6 = i5 % 128;
        $11 = i6;
        Object obj2 = null;
        if (i5 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        Object obj3 = onPlayFromMediaId;
        int i7 = ((i6 | 123) << 1) - (i6 ^ 123);
        $10 = i7 % 128;
        int i8 = i7 % 2;
        try {
            Object[] objArr = {obj};
            int i9 = i6 + 87;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                s = (short) 618;
                b = $$a[31812];
                i = 59;
            } else {
                s = (short) 618;
                b = $$a[722];
                i = 78;
            }
            String str$$c = $$c(s, b, (byte) i);
            ClassLoader classLoader = (ClassLoader) onFastForward;
            int i10 = $10 + 79;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            Class<?> cls = Class.forName(str$$c, true, classLoader);
            short s2 = (short) 679;
            byte[] bArr = $$a;
            int i12 = $10;
            int i13 = (i12 ^ 29) + ((i12 & 29) << 1);
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                b2 = bArr[237];
                i2 = bArr[32316] - 1;
            } else {
                b2 = bArr[237];
                i2 = bArr[1131] + 1;
            }
            Integer num = (Integer) cls.getMethod($$c(s2, b2, (byte) i2), Object.class).invoke(obj3, objArr);
            int i14 = $11 + 105;
            $10 = i14 % 128;
            if (i14 % 2 == 0) {
                return num.intValue();
            }
            num.intValue();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AudioAttributesCompatParcelizer(int i) throws Throwable {
        short s;
        byte[] bArr;
        char c;
        String str$$c;
        Object obj;
        boolean z;
        byte b;
        byte b2;
        int i2 = 2 % 2;
        int i3 = $11 + 101;
        int i4 = i3 % 128;
        $10 = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        Object obj3 = onPlayFromMediaId;
        int i5 = i4 + 43;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        try {
            Object[] objArr = new Object[1];
            Integer numValueOf = Integer.valueOf(i);
            int i7 = $11;
            int i8 = (i7 & 27) + (i7 | 27);
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                objArr[0] = numValueOf;
                s = (short) 16573;
                bArr = $$a;
                c = 30672;
            } else {
                objArr[0] = numValueOf;
                s = (short) 618;
                bArr = $$a;
                c = 722;
            }
            int i9 = i7 + 89;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                str$$c = $$c(s, bArr[c], (byte) 104);
                obj = onFastForward;
                z = false;
            } else {
                str$$c = $$c(s, bArr[c], (byte) 78);
                obj = onFastForward;
                z = true;
            }
            Class<?> cls = Class.forName(str$$c, z, (ClassLoader) obj);
            short s2 = (short) 1143;
            byte[] bArr2 = $$a;
            int i10 = $11 + 101;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                b = bArr2[110];
                b2 = bArr2[21561];
            } else {
                b = bArr2[126];
                b2 = bArr2[585];
            }
            Integer num = (Integer) cls.getMethod($$c(s2, b, b2), Integer.TYPE).invoke(obj3, objArr);
            int i11 = $10;
            int i12 = (i11 ^ 79) + ((i11 & 79) << 1);
            $11 = i12 % 128;
            if (i12 % 2 != 0) {
                return num.intValue();
            }
            num.intValue();
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
