package kotlin;

import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.marrow.bgservices.BaseIntentService;
import com.marrow.data.api.models.response.sync.SyncResult;
import java.lang.reflect.Method;
import kotlin.isCtrlCode;
import kotlin.maybeFinishPrepare;
import o.maybeFinishPrepare.AudioAttributesCompatParcelizer;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class getExtractedSamplesCount<P extends maybeFinishPrepare.AudioAttributesCompatParcelizer> extends BaseIntentService<P> implements maybeFinishPrepare.IconCompatParcelizer {
    private static final byte[] $$l = {16, 77, -78, 14};
    private static final int $$o = 226;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {61, -4, -83, 58, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20, -58, 64, 5, 22, -25, 27, 20, -1, -4, 19, -6, 15, 10, -16, 36, 1, -65, TarConstants.LF_DIR, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20};
    private static final int $$q = 183;
    private static final byte[] $$d = {34, 127, 65, -22, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 145;
    private static int read = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static long AudioAttributesCompatParcelizer = -5645317091216848448L;
    private static int write = 1000326265;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(short r5, short r6, int r7) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = kotlin.getExtractedSamplesCount.$$l
            int r5 = r5 * 2
            int r1 = 1 - r5
            int r7 = r7 * 2
            int r7 = r7 + 104
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
        L29:
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getExtractedSamplesCount.$$r(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.getExtractedSamplesCount.$$d
            int r1 = 44 - r8
            int r6 = r6 + 4
            int r7 = 114 - r7
            byte[] r1 = new byte[r1]
            int r8 = 43 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getExtractedSamplesCount.g(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 29
            int r6 = r6 + 82
            int r7 = r7 + 4
            int r8 = r8 * 18
            int r0 = 46 - r8
            byte[] r1 = kotlin.getExtractedSamplesCount.$$p
            byte[] r0 = new byte[r0]
            int r8 = 45 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r7
            int r6 = r6 + (-7)
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getExtractedSamplesCount.h(int, short, int, java.lang.Object[]):void");
    }

    public getExtractedSamplesCount() {
        super("BaseSyncService");
    }

    @Override // com.marrow.bgservices.BaseIntentService, android.app.IntentService
    public void onHandleIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = read + 9;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            super.onHandleIntent(intent);
            getPresenter().write();
            int i3 = read + 109;
            RemoteActionCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onHandleIntent(intent);
        getPresenter().write();
        throw null;
    }

    @Override // o.maybeFinishPrepare.IconCompatParcelizer
    public final void IconCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = read + 99;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        isCtrlCode.Companion companion = isCtrlCode.INSTANCE;
        getShowTimeoutMs.write(this, isCtrlCode.Companion.write(i));
        int i5 = RemoteActionCompatParcelizer + 27;
        read = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.maybeFinishPrepare.IconCompatParcelizer
    public final void read(int i, SyncResult syncResult) {
        int i2 = 2 % 2;
        int i3 = read + 99;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(syncResult, "");
        isCtrlCode.Companion companion = isCtrlCode.INSTANCE;
        getShowTimeoutMs.write(this, isCtrlCode.Companion.AudioAttributesCompatParcelizer(i));
        int i5 = RemoteActionCompatParcelizer + 63;
        read = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.maybeFinishPrepare.IconCompatParcelizer
    public final void write(int i, SyncResult syncResult) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 13;
        read = i3 % 128;
        if (i3 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(syncResult, "");
            isCtrlCode.Companion companion = isCtrlCode.INSTANCE;
            getShowTimeoutMs.write(this, isCtrlCode.Companion.read(i));
            int i4 = 43 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(syncResult, "");
            isCtrlCode.Companion companion2 = isCtrlCode.INSTANCE;
            getShowTimeoutMs.write(this, isCtrlCode.Companion.read(i));
        }
        int i5 = RemoteActionCompatParcelizer + 117;
        read = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.maybeFinishPrepare.IconCompatParcelizer
    public final void IconCompatParcelizer(int i, SyncResult syncResult) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 89;
        read = i3 % 128;
        if (i3 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(syncResult, "");
            isCtrlCode.Companion companion = isCtrlCode.INSTANCE;
            getShowTimeoutMs.write(this, isCtrlCode.Companion.RemoteActionCompatParcelizer(i));
        } else {
            toMagicModuleMetaRepoModel.write(syncResult, "");
            isCtrlCode.Companion companion2 = isCtrlCode.INSTANCE;
            getShowTimeoutMs.write(this, isCtrlCode.Companion.RemoteActionCompatParcelizer(i));
            int i4 = 7 / 0;
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 125;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 12424 - (ViewConfiguration.getFadingEdgeLength() >> 16), 20 - (ViewConfiguration.getTapTimeout() >> 16), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), MotionEvent.axisFromString("") + 1869, 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1983509525, false, $$r(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $11 + 59;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    private static void f(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
            int i5 = $11 + 123;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(write)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), AndroidCharacter.getMirror('0') + 23656, View.MeasureSpec.getSize(0) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44863 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 18944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0') + 29, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i8 = $11 + 23;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 / 2;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            int i10 = $10 + 111;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cleardownloadmanagerhelpers.write = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            char[] cArr4 = new char[i];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - View.resolveSize(0, 0)), Color.alpha(0) + 18944, 28 - ((Process.getThreadPriority(0) + 20) >> 6), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            int i12 = $11 + 73;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:0|2|(2:4|(2:(2:7|(2:9|(2:11|(1:17)(1:14))(2:15|16))(0))(1:18)|(9:20|286|21|(1:23)|24|25|26|(1:28)|29)))(0)|33|(29:301|35|(3:37|38|(2:40|42)(1:41))(1:42)|77|305|78|(2:299|80)|84|85|304|(4:87|88|(1:90)|91)(18:93|289|94|(2:278|96)|100|101|276|102|(2:287|104)|108|109|110|(1:112)|113|(1:115)|116|(1:118)|119)|120|(4:123|(2:125|(12:130|(3:132|(3:135|136|133)|314)|137|295|138|(1:140)|141|142|143|280|144|313)(2:159|312))(2:128|(0)(0))|160|121)|311|161|188|(1:190)|191|(3:193|(1:195)|196)(13:198|291|199|200|(1:202)|203|282|204|205|(1:207)|208|(1:210)|211)|197|212|(6:214|215|(1:217)|218|219|220)|221|(1:223)|224|(3:226|(1:228)|229)(14:231|232|(1:234)|235|236|(1:238)|239|307|240|241|(1:243)|244|(1:246)|247)|230|248|(7:250|251|(1:253)|254|255|256|257)(1:315))|297|46|(1:48)|49|284|50|(1:52)|53|77|305|78|(0)|84|85|304|(0)(0)|120|(1:121)|311|161|188|(0)|191|(0)(0)|197|212|(0)|221|(0)|224|(0)(0)|230|248|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0b3a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0b3b, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0b5a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0b5b, code lost:
    
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0b5c, code lost:
    
        r1 = r0;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0a29 A[Catch: all -> 0x0b5a, PHI: r2 r4 r8
      0x0a29: PHI (r2v221 java.lang.Object[]) = (r2v220 java.lang.Object[]), (r2v247 java.lang.Object[]) binds: [B:129:0x0a27, B:126:0x0a11] A[DONT_GENERATE, DONT_INLINE]
      0x0a29: PHI (r4v102 int) = (r4v101 int), (r4v108 int) binds: [B:129:0x0a27, B:126:0x0a11] A[DONT_GENERATE, DONT_INLINE]
      0x0a29: PHI (r8v40 int) = (r8v39 int), (r8v48 int) binds: [B:129:0x0a27, B:126:0x0a11] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #16 {all -> 0x0b5a, blocks: (B:78:0x052d, B:84:0x0577, B:120:0x09e9, B:121:0x09ed, B:130:0x0a29, B:128:0x0a14, B:93:0x05dc, B:110:0x079a, B:113:0x07e8, B:116:0x0982, B:119:0x09e3), top: B:305:0x052d }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0bc9 A[Catch: all -> 0x0308, TryCatch #5 {all -> 0x0308, blocks: (B:182:0x0bc3, B:184:0x0bc9, B:185:0x0bf9, B:215:0x10d9, B:217:0x10df, B:218:0x110d, B:251:0x15c8, B:253:0x15ce, B:254:0x15fe, B:232:0x1349, B:234:0x136b, B:235:0x13c0, B:71:0x0472, B:73:0x0478, B:74:0x04a2, B:21:0x00d4, B:23:0x00da, B:24:0x0101, B:26:0x0277, B:28:0x02a7, B:29:0x0302, B:35:0x0316, B:38:0x0324, B:42:0x0330, B:57:0x0409, B:59:0x040f, B:60:0x0410, B:62:0x0412, B:64:0x0419, B:65:0x041a), top: B:286:0x00d4, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x10b1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x119e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x11f0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x125a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x15a4  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0533 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05dc A[Catch: all -> 0x0b5a, TRY_ENTER, TRY_LEAVE, TryCatch #16 {all -> 0x0b5a, blocks: (B:78:0x052d, B:84:0x0577, B:120:0x09e9, B:121:0x09ed, B:130:0x0a29, B:128:0x0a14, B:93:0x05dc, B:110:0x079a, B:113:0x07e8, B:116:0x0982, B:119:0x09e3), top: B:305:0x052d }] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v164 */
    /* JADX WARN: Type inference failed for: r6v165 */
    /* JADX WARN: Type inference failed for: r6v172 */
    /* JADX WARN: Type inference failed for: r6v173 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    @Override // com.marrow.bgservices.BaseIntentService, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 6467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getExtractedSamplesCount.attachBaseContext(android.content.Context):void");
    }

    @Override // com.marrow.bgservices.BaseIntentService, android.app.IntentService, android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        int i4 = read + 73;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }
}
