package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class writeIntegerList extends addObserverForBackInvoker implements SubjectStat {
    private static short[] AudioAttributesImplApi21Parcelizer;
    private final Object IconCompatParcelizer = new Object();
    private boolean RemoteActionCompatParcelizer = false;
    private getSubjectStat read;
    private volatile isHighlighted write;
    private static final byte[] $$c = {64, TarConstants.LF_GNUTYPE_LONGLINK, 61, -128};
    private static final int $$f = 97;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {32, -59, 22, 74, -54, 68, 9, 26, -21, 38, 16, -8, 22, -31, 62, -4, 11, 10, 24, -2, 10, -21, 60, 8, -6, 30, 0, 17, 10, -14, 41, -68, 40, 63, -6, 16, 17, -35, 62, 11, 9, 2, 4, 30, 10, -4, 25, -37, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -2, 7, 14, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 68, 9, 26, -21, 31, 24, 3, 0, 23, -2, 19, 14, -12, 40, 5, -61, 57, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24};
    private static final int $$h = 16;
    private static final byte[] $$a = {3, 113, -44, TarConstants.LF_BLK, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 21;
    private static int RatingCompat = 0;
    private static int MediaMetadataCompat = 1;
    private static int AudioAttributesCompatParcelizer = -1065257500;
    private static int AudioAttributesImplApi26Parcelizer = -819363174;
    private static int MediaBrowserCompatItemReceiver = 1341203528;
    private static byte[] MediaBrowserCompatCustomActionResultReceiver = {79, 65, 77, 59, TarConstants.LF_BLK, 109, 109, -10, TarConstants.LF_GNUTYPE_LONGLINK, -128, 5, TarConstants.LF_FIFO, TarConstants.LF_DIR, TarConstants.LF_BLK, 65, 57, 68, -73, -88, 80, -128, 69, 72, -75, 94, 80, -83, 79, 93, -75, 71, -65, TarConstants.LF_GNUTYPE_SPARSE, 102, 85, -118, 68, 89, 117, -98, 77, 78, -73, 90, -78, 71, 46, -5, -34, -43, 45, -128, TarConstants.LF_NORMAL, 43, -1, TarConstants.LF_BLK, -1, -57, -125, -128, -2, TarConstants.LF_CONTIG, 18, -104, 45, -128, 44, 41, -23, TarConstants.LF_NORMAL, -4, TarConstants.LF_NORMAL, 21, -126, 46, -127, -126, -127, -5, -33, -127, -77, -36, TarConstants.LF_GNUTYPE_LONGNAME, -63, -107, -88, -10, -60, -80, -40, -115, -16, -46, -72, -58, -62, TarConstants.LF_FIFO, -3, 40, TarConstants.LF_FIFO, -33, -22, 28, -58, -40, TarConstants.LF_FIFO, -61, -38, -62, -56, -89, 123, -94, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 93, -89, 112, -96, 9, 77, TarConstants.LF_GNUTYPE_LONGNAME, -54, -85, -32, 121, 10, 9, 116, -91, 125, -92, -22, 14, -35, 26, 7, -42, 127, -28, -45, -48, 15, 3, -35, 11, 125, -121, -103, 124, 127, -102, 127, -123, 112, -124, -73, -73, -73, -73, -73, -73, -73, -73, -73};
    private static long AudioAttributesImplBaseParcelizer = -5511740758716482771L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, int r7, byte r8) {
        /*
            int r7 = r7 * 8
            int r7 = r7 + 104
            int r6 = r6 + 4
            byte[] r0 = kotlin.writeIntegerList.$$c
            int r8 = r8 * 2
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeIntegerList.$$i(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.writeIntegerList.$$a
            int r1 = r6 + 4
            int r5 = 191 - r5
            int r7 = 114 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r3 = r0[r5]
        L25:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            int r5 = r5 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeIntegerList.c(short, byte, int, java.lang.Object[]):void");
    }

    private static void d(int i, byte b, byte b2, Object[] objArr) {
        int i2 = i + 82;
        byte[] bArr = $$g;
        int i3 = b2 * 2;
        int i4 = 93 - b;
        byte[] bArr2 = new byte[i3 + 4];
        int i5 = i3 + 3;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i2 = (i5 + i4) - 11;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i7 = bArr[i4];
                i4++;
                i2 = (i2 + i7) - 11;
            }
        }
    }

    writeIntegerList() {
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.writeIntegerList.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                writeIntegerList.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = RatingCompat + 27;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        MediaMetadataCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
            this.read = getsubjectstatWrite;
            if (!getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                return;
            }
            int i3 = RatingCompat + 17;
            MediaMetadataCompat = i3 % 128;
            int i4 = i3 % 2;
            this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            if (i4 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        getSubjectStat getsubjectstatWrite2 = AudioAttributesImplBaseParcelizer().write();
        this.read = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 77;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesImplBaseParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 12424, View.MeasureSpec.getSize(0) + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.green(0) + 1868, 11 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1983509525, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        int i6 = $11 + 67;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r25, int r26, int r27, short r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeIntegerList.a(byte, int, int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0266  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r41) {
        /*
            Method dump skipped, instruction units count: 3070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeIntegerList.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = RatingCompat + 119;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.read;
        Object obj = null;
        if (getsubjectstat != null) {
            int i4 = MediaMetadataCompat + 63;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = MediaMetadataCompat + 83;
            RatingCompat = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = RatingCompat + 73;
        MediaMetadataCompat = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 21;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        int i4 = RatingCompat + 69;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return objAf_;
        }
        throw null;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = RatingCompat + 65;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.write == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.write == null) {
                    this.write = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.write;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        if (!this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = true;
            int i2 = MediaMetadataCompat + 75;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = RatingCompat + 121;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = RatingCompat + 55;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i3 = RatingCompat + 7;
        MediaMetadataCompat = i3 % 128;
        int i4 = i3 % 2;
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeIntegerList.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0157  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeIntegerList.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0b6e A[Catch: all -> 0x0c26, TryCatch #0 {all -> 0x0c26, blocks: (B:139:0x0b5a, B:141:0x0b6e, B:142:0x0b9a), top: B:260:0x0b5a, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0bad A[Catch: all -> 0x0c1c, TryCatch #11 {all -> 0x0c1c, blocks: (B:143:0x0ba0, B:145:0x0bad, B:146:0x0c14), top: B:279:0x0ba0, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0db6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0e03  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e5d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x123f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x131d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x1366  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x13c1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x1741  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 6527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeIntegerList.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 7;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = RatingCompat + 109;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
