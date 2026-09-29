package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import in.juspay.hyper.constants.LogCategory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ICameraUpdateFactoryDelegate;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setWatermarkEnabled;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseUrlTemplate;", "AudioAttributesCompatParcelizer", "Lo/parseUrlTemplate;", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setWatermarkEnabled extends animateCameraWithCallback {
    private static int AudioAttributesImplApi21Parcelizer;
    private static char[] IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long read;
    private static char write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private parseUrlTemplate write;
    private static final byte[] $$l = {28, -38, TarConstants.LF_DIR, -29};
    private static final int $$m = 144;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {33, 74, 31, 28, 64, -77, -1, 21, -13, 4, 8, -12, 14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$k = 37;
    private static final byte[] $$d = {36, 0, 10, -55, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 72;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r6, int r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = kotlin.setWatermarkEnabled.$$l
            int r8 = r8 * 2
            int r8 = 121 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setWatermarkEnabled.$$n(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.setWatermarkEnabled.$$d
            int r7 = r7 + 65
            int r6 = r6 + 4
            int r8 = 191 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r4 = r2
            r8 = r6
            goto L28
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L28:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-1)
            int r8 = r3 + 1
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setWatermarkEnabled.g(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 119 - r6
            int r0 = 47 - r8
            byte[] r1 = kotlin.setWatermarkEnabled.$$j
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r8 = 46 - r8
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L29:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-1)
            int r7 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setWatermarkEnabled.h(short, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.setWatermarkEnabled$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/marrow2/ui/signup/college/SignUpSelectedCollegeActivity$Companion;", "", "<init>", "()V", "IsFromPlanPage", "", "IsFromHomePage", "getIntent", "Landroid/content/Intent;", LogCategory.CONTEXT, "Landroid/content/Context;", "isFromPlanPage", "", "isFromHomePage", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Intent AudioAttributesCompatParcelizer(Context context, boolean z, boolean z2, int i) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return AudioAttributesCompatParcelizer(context, z, z2);
        }

        private static Intent AudioAttributesCompatParcelizer(Context context, boolean z, boolean z2) {
            toMagicModuleMetaRepoModel.write(context, "");
            Intent intent = new Intent(context, (Class<?>) setWatermarkEnabled.class);
            intent.putExtra("isFromHomePage", z2);
            intent.putExtra("isFromPlanPage", z);
            intent.setFlags(4194304);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i3 = $10 + 13;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i5 = $10 + 113;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 38461), 532 - (Process.myTid() >> 22), 8 - TextUtils.getCapsMode("", 0, 0), -735610793, false, $$n(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() - (read + 2192498202983240651L);
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 36621), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2340, (KeyEvent.getMaxKeyCode() >> 16) + 28, 188119637, false, $$n(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 38461), 532 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, -735610793, false, $$n(b5, b6, b6), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).longValue() ^ (read ^ 2192498202983240651L);
                    try {
                        Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 36621), 2340 - View.resolveSize(0, 0), 'L' - AndroidCharacter.getMirror('0'), 188119637, false, $$n(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i8 = $11 + 121;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr6 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer5 == null) {
                byte b9 = (byte) 0;
                byte b10 = b9;
                objRemoteActionCompatParcelizer5 = startForeground.read((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 36621), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2340, Color.argb(0, 0, 0, 0) + 28, 188119637, false, $$n(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = IconCompatParcelizer;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getLongPressTimeout() >> 16) + 7015, View.resolveSizeAndState(0, 0, 0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(write)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), KeyEvent.getDeadChar(0, 0) + 7015, (ViewConfiguration.getTouchSlop() >> 8) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 15;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                i2 = i + 48;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $11 + 49;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48194), 20126 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        int i8 = $10 + 31;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) View.resolveSize(0, 0), TextUtils.indexOf("", "", 0) + 19368, 18 - (ViewConfiguration.getLongPressTimeout() >> 16), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i10 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i10];
                        int i11 = $10 + 115;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            int i13 = $11 + 103;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i15 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i16 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i15];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i16];
                        } else {
                            int i17 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i18 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i17];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i18];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        int i19 = 0;
        while (i19 < i) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
            i19++;
            int i20 = $11 + 27;
            $10 = i20 % 128;
            int i21 = i20 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    @Override // kotlin.animateCameraWithCallback, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        parseUrlTemplate parseurltemplate;
        parseUrlTemplate parseurltemplate2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 11;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 7286, new char[]{4120, 3214, 10543, 17856, 25202, 40685, 48011, 55416, 62686, 4459, 3501, 10938, 18215, 25555, 32836, 48363, 55706, 63011}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 50107, new char[]{4116, 54207, 38738, 23341, 7905}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 62), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25, new char[]{3, '%', '+', 21, 25, '#', ',', 7, '\t', 2, 2, 16, 22, '\r', 25, '(', 18, '$', 27, 19, 24, ',', 25, 29, 0, ','}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f((byte) (8 - ExpandableListView.getPackedPositionType(0L)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, new char[]{15, '+', 13808, 13808, 31, '\'', 27, 21, 13810, 13810, 11, '(', '\t', 1, 25, '(', 24, '#'}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    int i4 = AudioAttributesImplBaseParcelizer + 75;
                    MediaBrowserCompatItemReceiver = i4 % 128;
                    int i5 = i4 % 2;
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            if (baseContext != null) {
                int i6 = AudioAttributesImplBaseParcelizer + 125;
                MediaBrowserCompatItemReceiver = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - TextUtils.lastIndexOf("", '0')), 6054 - (ViewConfiguration.getEdgeSlop() >> 16), 42 - TextUtils.indexOf("", "", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 84), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) + 11, new char[]{'\r', '+', 26, 31, 7, '+', '\t', ',', 19, 15, '/', 15, '!', '\"', '+', '*', 25, 31, '\n', 22, '.', 29, '(', 26, 19, 30, 16, 4, '*', '\b', 17, 31, 31, 11, 18, 28, '$', '\t', '#', 30, '+', ',', 20, '/', 17, 20, '\"', '!'}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(((Process.getThreadPriority(0) + 20) >> 6) + 20807, new char[]{4169, 16733, 45716, 58268, 21842, 34427, 63460, 10430, 39540, 52017, 15579, 28182, 57117, 12499, 25087, 54118, 1128, 30123, 42726, 6149, 18883, 47762, 60503, 23841, 36531, 65447, 20862, 33332, 62340, 9541, 38425, 51152, 14505, 27242, 56181, 3327, 32227, 44808, 192, 29080, 41817, 5137, 17853, 46832, 59433, 22884, 35466, 64532, 11545, 40663, 53138, 8556, 37412, 50163, 13495, 26125, 55241, 2256, 31242, 43847, 7400, 19959, 49016, 4151}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 99), Gravity.getAbsoluteGravity(0, 0) + 64, new char[]{'#', '\t', 0, ',', '\b', 11, '\t', 15, 13925, 13925, '*', '\r', 23, '\t', 13925, 13925, 23, '\t', '#', '\t', 11, '\b', '-', '\b', 18, '!', '/', 14, '*', 15, '\t', 14, 16, 4, 29, '!', 4, 30, '/', 29, '\b', 11, 31, 25, '\t', 11, 23, 3, '*', '+', 30, 5, 14, 21, 1, 15, '\t', '#', ',', ')', 21, '#', 15, 17}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 63), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 31, new char[]{'/', 24, 23, '/', '\t', ' ', 13849, 13849, ',', 0, '(', 11, 15, 27, 22, '#', '#', '-', '\f', '\n', 24, '/', 25, 29, 5, 23, '\t', 1, '\f', 25, '\r', 2, '%', 1, 21, '+', '\f', '.', '%', 1, 25, 29, '\n', '\t', 28, 7, 16, 3, '.', '%', 18, '&', ')', 3, '\'', 18, 24, 19, 17, '\b', 18, 31, 18, 29, '(', 24, 13901}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 32216, new char[]{4160, 28076, 60350, 27068, 59323, 26028}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 95), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26, new char[]{11, '\b', '#', 30, 17, 7, 13741, 13741, 30, 15, 30, 19, '\"', 30, 19, 15, 14, ' ', '!', 15, '&', '\t', 22, 31, '\"', 29, 3, '\t', 29, '!', '\f', 29, '\t', 0, 13742, 13742}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf("", "", 0, 0) + 6030, TextUtils.lastIndexOf("", '0', 0, 0) + 25, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char absoluteGravity = (char) (13183 - Gravity.getAbsoluteGravity(0, 0));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1650;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
            Object[] objArr13 = new Object[1];
            g((byte) ($$d[61] - 1), r0[113], (short) 187, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(absoluteGravity, iIndexOf, longPressTimeout, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 13183);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1649;
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 27;
                byte[] bArr = $$d;
                byte b = bArr[8];
                byte b2 = bArr[1];
                Object[] objArr14 = new Object[1];
                g(b, b2, (short) (b2 | 144), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(scrollBarSize, offsetBefore, packedPositionChild, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 34399, new char[]{4115, 38523, 7369, 33585, 2523, 36858, 13898, 48290, 8966, 43308, 12276, 54849, 23726, 49930, 18806, 53209}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 60270, new char[]{4112, 64370, 50882, 53850, 48561, 35131, 38039, 24585, 19273, 22271, 8796, 3540, 6414, 58549, 61455, 56221}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 1675550444};
                byte[] bArr2 = $$j;
                byte b3 = bArr2[10];
                byte b4 = bArr2[23];
                Object[] objArr18 = new Object[1];
                h(b3, b4, (byte) (b4 | 41), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h(bArr2[23], bArr2[55], bArr2[24], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 13183);
                    int offsetBefore2 = 1649 - TextUtils.getOffsetBefore("", 0);
                    int i8 = 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[8];
                    byte b6 = bArr3[1];
                    Object[] objArr20 = new Object[1];
                    g(b5, b6, (short) (b6 | 144), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(threadPriority, offsetBefore2, i8, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e(63576 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{4120, 59470, 57519, 63744, 61810, 51629, 49675, 55864, 53982, 43819, 41773, 48121, 46124, 35983, 34003, 40235, 38276, 28115, 26199, 32397, 30446, 20319}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(12808 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{4124, 8732, 29706, 34322, 55342, 59953, 15403, 19988, 32852, 53833, 58447, 13934, 18556, 39521, 44130}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cResolveSize = (char) (13183 - View.resolveSize(0, 0));
                        int iArgb = 1649 - Color.argb(0, 0, 0, 0);
                        int offsetBefore3 = TextUtils.getOffsetBefore("", 0) + 26;
                        byte[] bArr4 = $$d;
                        byte b7 = bArr4[8];
                        byte b8 = bArr4[1];
                        Object[] objArr23 = new Object[1];
                        g(b7, b8, (short) (b8 | 111), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cResolveSize, iArgb, offsetBefore3, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char packedPositionType = (char) (13183 - ExpandableListView.getPackedPositionType(0L));
                        int i9 = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                        int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25;
                        Object[] objArr24 = new Object[1];
                        g((byte) ($$d[61] - 1), r2[113], (short) 187, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(packedPositionType, i9, i10, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i11 = ((int[]) objArr[3])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 != i11) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - TextUtils.indexOf("", "", 0, 0)), 6054 - View.resolveSizeAndState(0, 0, 0), 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            parseurltemplate = null;
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-327554063, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Color.argb(0, 0, 0, 0) + 6030, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25);
                Object[] objArr26 = new Object[1];
                h((byte) $$k, r5[52], (byte) ($$j[38] - 1), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } else {
            parseurltemplate = null;
        }
        CmcdConfigurationRequestConfig.write(this, Integer.valueOf(R.style.Theme_Marrow2), 0, R.attr.colorSurfaceVariant5, false, 10);
        super.onCreate(p0);
        parseUrlTemplate parseurltemplate3 = parseUrlTemplate.read(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parseurltemplate3, "");
        this.write = parseurltemplate3;
        if (parseurltemplate3 == null) {
            int i13 = AudioAttributesImplBaseParcelizer + 117;
            MediaBrowserCompatItemReceiver = i13 % 128;
            int i14 = i13 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseurltemplate2 = parseurltemplate;
        } else {
            parseurltemplate2 = parseurltemplate3;
        }
        setContentView(parseurltemplate2.IconCompatParcelizer());
        if (p0 == null) {
            boolean booleanExtra = getIntent().getBooleanExtra("isFromHomePage", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("isFromPlanPage", false);
            ICameraUpdateFactoryDelegate.Companion writeVar = ICameraUpdateFactoryDelegate.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.fragment_container, ICameraUpdateFactoryDelegate.Companion.read(booleanExtra2, booleanExtra));
        }
    }

    @Override // kotlin.animateCameraWithCallback, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f((byte) (71 - TextUtils.lastIndexOf("", '0', 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 10, new char[]{3, '%', '+', 21, 25, '#', ',', 7, '\t', 2, 2, 16, 22, '\r', 25, '(', 18, '$', 27, 19, 24, ',', 25, 29, 0, ','}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 7), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 14, new char[]{15, '+', 13808, 13808, 31, '\'', 27, 21, 13810, 13810, 11, '(', '\t', 1, 25, '(', 24, '#'}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatItemReceiver + 99;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i3 = MediaBrowserCompatItemReceiver + 41;
                AudioAttributesImplBaseParcelizer = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (baseContext != null) {
            int i5 = AudioAttributesImplBaseParcelizer + 25;
            MediaBrowserCompatItemReceiver = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 6054 - TextUtils.getCapsMode("", 0, 0), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 6030 - (ViewConfiguration.getTapTimeout() >> 16), 24 - KeyEvent.getDeadChar(0, 0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    @Override // kotlin.animateCameraWithCallback, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 59;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f((byte) (72 - (Process.myPid() >> 22)), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25, new char[]{3, '%', '+', 21, 25, '#', ',', 7, '\t', 2, 2, 16, 22, '\r', 25, '(', 18, '$', 27, 19, 24, ',', 25, 29, 0, ','}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 18, new char[]{15, '+', 13808, 13808, 31, '\'', 27, 21, 13810, 13810, 11, '(', '\t', 1, 25, '(', 24, '#'}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = AudioAttributesImplBaseParcelizer + 21;
            MediaBrowserCompatItemReceiver = i3 % 128;
            int i4 = i3 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = MediaBrowserCompatItemReceiver + 33;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4536), 6055 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 42 - (ViewConfiguration.getWindowTouchSlop() >> 8), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (AndroidCharacter.getMirror('0') - '0'), 6031 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 24 - View.MeasureSpec.getMode(0), -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i7 = MediaBrowserCompatItemReceiver + 9;
                AudioAttributesImplBaseParcelizer = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0e05  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0ef1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0f3b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0f8c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x11d9  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.animateCameraWithCallback, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setWatermarkEnabled.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi21Parcelizer = 1;
        AudioAttributesImplApi21Parcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 57;
        AudioAttributesImplApi21Parcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.animateCameraWithCallback, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 37;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatItemReceiver + 81;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void AudioAttributesImplApi21Parcelizer() {
        read = 3561793790822351794L;
        IconCompatParcelizer = new char[]{6469, 6839, 6473, 6837, 6838, 6840, 6479, 6425, 6475, 6406, 6426, 6491, 6468, 6832, 6430, 6494, 6416, 6407, 6428, 6417, 6481, 6471, 6490, 6524, 6424, 6472, 6492, 6505, 6431, 6405, 6418, 6834, 6477, 6478, 6842, 6843, 6493, 6474, 6470, 6465, 6833, 6836, 6476, 6427, 6488, 6464, 6835, 6489, 6429};
        write = (char) 11445;
    }
}
