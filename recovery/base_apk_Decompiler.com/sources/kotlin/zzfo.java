package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfo extends addObserverForBackInvoker implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private getSubjectStat AudioAttributesCompatParcelizer;
    private volatile isHighlighted RemoteActionCompatParcelizer;
    private static final byte[] $$g = {98, -46, 102, 39, -51, 71, 12, 29, -18, 41, 19, -5, 25, -28, 65, -1, 14, 13, 27, 1, 13, -18, 63, 11, -3, 33, 3, 20, 13, -11, 44, -65, 43, 66, -3, 19, 20, -32, 65, 14, 12, 5, 7, 33, 13, -1, 28, -34, 58, 12, 17, -1, 33, -22, 31, 31, -1, 16, 21, 11, 31, -7, 27, 1, 10, 17, 33, 22, 16, 19, -1, -22, TarConstants.LF_NORMAL, 31, 3, 20, 13, -29, 58, 12, 17, -1, 33, -22, 31, 31, -1, 16, 21, 11, 31, -7, 27, -51, 71, 12, 29, -36, 59, 3, 35, -71, 43, 66, -3, 19, 20, -32, 65, 14, 12, 5, 7, 33, 13, -1, 28, -28, TarConstants.LF_SYMLINK, 17, 10, -28, 45, 32, 0, -7, 31, 31, -1, 16, 21, 11, 31, -7, 27, 9, 5, 25, -1};
    private static final int $$h = 103;
    private static final byte[] $$a = {69, 85, TarConstants.LF_DIR, TarConstants.LF_LINK, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 106;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int IconCompatParcelizer = 1000326198;
    private static char[] MediaBrowserCompatCustomActionResultReceiver = {45000, 44803, 44830, 44802, 44810, 44984, 44995, 45005, 45026, 45050, 44997, 44989, 45016, 45025, 45028, 45029, 45029, 45028, 45052, 45036, 45012, 45031, 45025, 45033, 45032, 45032, 45037, 45027, 45025, 45050, 45030, 44984, 45027, 45037, 45036, 45037, 45027, 45031, 45021, 45010, 45027, 45030, 45049, 45052, 45036, 45002, 45018, 45051, 44996, 44995, 45036, 45030, 45050, 44984, 45026, 45036, 45026, 45051, 45030, 45038, 45009, 45009, 45033, 45036, 45050, 45028, 45025, 45027, 44992, 44827, 44826, 44826, 44805, 44826, 44824, 44830, 44830, 44827, 44826};
    private final Object write = new Object();
    private boolean read = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.zzfo.$$a
            int r7 = r7 + 65
            int r9 = r9 + 4
            int r8 = 191 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r8 = r9
            r5 = r2
            goto L27
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L27:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r3 + 1
            int r8 = r8 + (-1)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzfo.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.zzfo.$$g
            int r5 = r5 + 4
            int r7 = r7 + 82
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r5]
        L25:
            int r7 = r7 + r4
            int r7 = r7 + (-14)
            int r5 = r5 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzfo.d(int, short, short, java.lang.Object[]):void");
    }

    zzfo() {
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.zzfo.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                zzfo.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = AudioAttributesImplApi21Parcelizer + 117;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 61;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = MediaBrowserCompatCustomActionResultReceiver().write();
        this.AudioAttributesCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = AudioAttributesImplBaseParcelizer + 57;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i5 = 1 / 0;
            } else {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
            int i6 = AudioAttributesImplApi21Parcelizer + 43;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r24, boolean r25, char[] r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzfo.a(int, boolean, char[], int, int, java.lang.Object[]):void");
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = MediaBrowserCompatCustomActionResultReceiver;
        if (cArr2 != null) {
            int i7 = $11 + 7;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) Color.red(0), 11613 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), View.getDefaultSize(0, 0) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i9 = $10 + 79;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22959, Color.red(0) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (AndroidCharacter.getMirror('0') + 31541), 9863 - (ViewConfiguration.getLongPressTimeout() >> 16), 65 - (ViewConfiguration.getJumpTapTimeout() >> 16), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - (Process.myTid() >> 22)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9754, TextUtils.indexOf((CharSequence) "", '0') + 28, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i13, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $11 + 37;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i16 = $11 + 33;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i18 = $10 + 77;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] >>> iArr[4]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                } else {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ba  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r34) {
        /*
            Method dump skipped, instruction units count: 2762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzfo.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 51;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.AudioAttributesCompatParcelizer;
        if (getsubjectstat != null) {
            int i4 = AudioAttributesImplBaseParcelizer + 97;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i5 == 0) {
                int i6 = 69 / 0;
            }
            int i7 = AudioAttributesImplApi21Parcelizer + 107;
            AudioAttributesImplBaseParcelizer = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 % 5;
            }
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 89;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (i3 == 0) {
            return ishighlightedMediaBrowserCompatCustomActionResultReceiver.af_();
        }
        ishighlightedMediaBrowserCompatCustomActionResultReceiver.af_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplBaseParcelizer + 1;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = i2 + 101;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
            if (!(!this.read)) {
                return;
            }
        } else if (this.read) {
            return;
        }
        int i5 = i2 + 81;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        this.read = true;
        int i7 = AudioAttributesImplApi21Parcelizer + 67;
        AudioAttributesImplBaseParcelizer = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 125;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = AudioAttributesImplApi21Parcelizer + 39;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00da  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzfo.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 43;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(false, new byte[]{0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0}, new int[]{5, 26, 0, 20}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 29, false, new char[]{11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 8, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = AudioAttributesImplApi21Parcelizer + 9;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = AudioAttributesImplBaseParcelizer + 119;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6054, 42 - TextUtils.indexOf("", ""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.normalizeMetaState(0), Color.rgb(0, 0, 0) + 16783246, ExpandableListView.getPackedPositionType(0L) + 24, -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - ExpandableListView.getPackedPositionGroup(0L)), KeyEvent.normalizeMetaState(0) + 6054, 42 - KeyEvent.keyCodeFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, 23 - TextUtils.lastIndexOf("", '0', 0), -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00d5  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instruction units count: 6118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzfo.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 91;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 71;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
    }
}
