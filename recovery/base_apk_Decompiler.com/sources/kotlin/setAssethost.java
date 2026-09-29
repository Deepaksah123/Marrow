package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setAssethost extends MediaBrowserCompatMediaItem implements SubjectStat {
    private static short[] AudioAttributesImplApi26Parcelizer;
    private volatile isHighlighted IconCompatParcelizer;
    private getSubjectStat write;
    private static final byte[] $$c = {57, 34, -8, 64};
    private static final int $$f = TarConstants.CHKSUM_OFFSET;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {87, 74, -120, 12, -54, 68, 9, 26, -40, 46, 17, 22, 9, 12, -4, 10, -4, 38, 14, 12, 9, -2, 7, 23, -28, TarConstants.LF_BLK, 14, 6, -1, 30, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 68, 9, 26, -21, 38, 16, -8, 22, -31, 62, -4, 11, 10, 24, -2, 10, -21, 60, 8, -6, 30, 0, 17, 10, -14, 41, -68, 40, 63, -6, 16, 17, -35, 62, 11, 9, 2, 4, 30, 10, -4, 25, -37, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -2, 7, 14};
    private static final int $$h = 11;
    private static final byte[] $$a = {85, -29, -43, -21, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 235;
    private static int MediaMetadataCompat = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static int AudioAttributesCompatParcelizer = -79245043;
    private static int MediaBrowserCompatItemReceiver = -819363086;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1972091173;
    private static byte[] AudioAttributesImplApi21Parcelizer = {122, -27, -1, -29, -55, -62, -125, -125, 12, -7, -90, 59, -52, -53, -62, -1, TarConstants.LF_CONTIG, -14, 98, 8, 63, 56, 1, 7, -48, 118, 0, 56, 14, 38, 26, 105, 24, -3, 11, 12, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -63, TarConstants.LF_NORMAL, TarConstants.LF_LINK, 62, 13, 37, 14, TarConstants.LF_GNUTYPE_LONGNAME, -44, -98, -64, -94, -114, -115, 62, -47, -33, -119, -40, -33, -119, -116, -57, -100, -63, -103, -46, -48, -46, 57, -115, -40, -117, -33, -100, -63, -81, 62, -44, -48, -114, -119, -114, -57, -115, -48, -99, 39, -45, -116, -46, -117, -88, -116, -44, 57, -94, -63, -33, -98, -114, 59, -46, -115, -115, -90, 58, -43, -101, -48, -63, 73, 44, 69, 94, 60, -74, 85, 42, -21, -124, -32, 70, 93, 45, 46, 66, 97, 5, 46, 92, 105, 25, 45, 91, 82, 30, 40, -74, 59, 67, 45, 92, 41, -74, 59, 93, 110, -31, 70, 73, 45, 60, 72, 43, 40, 81, 19, -123, -32, 92, 21, 46, 69, 42, 46, 90, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 95, 42, 82, 71, 18, 4, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 43, 71, 91, 118, 42, -68, 21, 21, -69, 104, -54, -25, 26, -127, -55, -36, 44, TarConstants.LF_CONTIG, -5, 32, -5, 19, -33, -36, -6, 35, -50, -60, -55, -36, -56, TarConstants.LF_DIR, -11, 44, -8, 44, -63, -34, -54, -35, -34, -35, -25, 27, -35, 124, 79, -42, 70, -47, -67, -70, -100, -34, 66, -22, -107, -126, -32, 74, -20, 102, -56, 28, -63, -41, 126, -56, 31, -49, 26, -18, -21, 89, -52, -113, 10, 25, 26, 3, TarConstants.LF_FIFO, 30, TarConstants.LF_CHR, 113, 102, 99, 41, 101, 47, 99, 43, 101, 41, 98, 113, 12, -106, -88, 9, 14, -105, 14, -108, 13, -111};
    private static char AudioAttributesImplBaseParcelizer = 5269;
    private static char RatingCompat = 38361;
    private static char MediaDescriptionCompat = 24926;
    private static char MediaBrowserCompatMediaItem = 21204;
    private final Object read = new Object();
    private boolean RemoteActionCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r5, short r6, short r7) {
        /*
            int r6 = r6 * 10
            int r6 = 122 - r6
            int r5 = r5 * 3
            int r0 = r5 + 1
            byte[] r1 = kotlin.setAssethost.$$c
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r7]
        L26:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAssethost.$$i(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.setAssethost.$$a
            int r1 = r5 + 4
            int r6 = 190 - r6
            int r7 = 114 - r7
            byte[] r1 = new byte[r1]
            int r5 = r5 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r5
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAssethost.c(byte, int, byte, java.lang.Object[]):void");
    }

    private static void d(byte b, int i, byte b2, Object[] objArr) {
        int i2 = b2 + 4;
        byte[] bArr = $$g;
        int i3 = 114 - b;
        byte[] bArr2 = new byte[i + 4];
        int i4 = i + 3;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + i3) - 11;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2++;
                i3 = (i3 + bArr[i2]) - 11;
            }
        }
    }

    setAssethost() {
        AudioAttributesCompatParcelizer();
    }

    private void AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.setAssethost.4
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                setAssethost.this.RemoteActionCompatParcelizer();
            }
        });
        int i2 = MediaMetadataCompat + 45;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void read() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 115;
        MediaMetadataCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.write = write().write();
            if (!r1.RemoteActionCompatParcelizer()) {
                return;
            }
            int i3 = MediaMetadataCompat + 5;
            MediaBrowserCompatSearchResultReceiver = i3 % 128;
            int i4 = i3 % 2;
            this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            if (i4 == 0) {
                throw null;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite = write().write();
        this.write = getsubjectstatWrite;
        getsubjectstatWrite.RemoteActionCompatParcelizer();
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[i3] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 33;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i4) ^ ((c2 << 4) + ((char) (((long) MediaDescriptionCompat) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(MediaBrowserCompatMediaItem)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", "", 0), 1504 - View.MeasureSpec.makeMeasureSpec(0, 0), 21 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1322448859, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) AudioAttributesImplBaseParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(RatingCompat)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1504, (ViewConfiguration.getScrollBarSize() >> 8) + 21, 1322448859, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 9016 - (ViewConfiguration.getScrollBarSize() >> 8), 58 - (Process.myTid() >> 22), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i8 = $11 + 105;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r23, int r24, int r25, short r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAssethost.a(byte, int, int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0243  */
    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r39) {
        /*
            Method dump skipped, instruction units count: 2932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAssethost.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.write;
        if (getsubjectstat != null) {
            int i2 = MediaMetadataCompat + 103;
            MediaBrowserCompatSearchResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = MediaBrowserCompatSearchResultReceiver + 87;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 27;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = write().af_();
        int i4 = MediaMetadataCompat + 45;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatSearchResultReceiver + 3;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted write() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        if (!this.RemoteActionCompatParcelizer) {
            int i2 = MediaMetadataCompat + 1;
            MediaBrowserCompatSearchResultReceiver = i2 % 128;
            if (i2 % 2 == 0) {
                this.RemoteActionCompatParcelizer = true;
            } else {
                this.RemoteActionCompatParcelizer = true;
            }
        }
        int i3 = MediaMetadataCompat + 69;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 39;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatSearchResultReceiver + 95;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010d  */
    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAssethost.onResume():void");
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a((byte) (23 - TextUtils.indexOf((CharSequence) "", '0', 0)), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1163773134, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 879711148, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 56), TextUtils.lastIndexOf("", '0', 0) - 69, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 14, new char[]{19524, 53945, 10010, 7380, 62780, 31711, 12540, 39823, 46406, 40123, 20389, 13272, 39943, 43403, 4392, 18848, 59260, 20473}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = MediaBrowserCompatSearchResultReceiver + 37;
            MediaMetadataCompat = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 37;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4534), 6054 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 42 - TextUtils.getOffsetBefore("", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 6030 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 24, -861814097, false, "read", new Class[]{Context.class});
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
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0b4a A[Catch: all -> 0x0496, TryCatch #14 {all -> 0x0496, blocks: (B:140:0x0b44, B:142:0x0b4a, B:143:0x0b7a, B:217:0x12c4, B:219:0x12ca, B:220:0x12f9, B:253:0x1750, B:255:0x1756, B:256:0x177a, B:234:0x14f9, B:236:0x151c, B:237:0x156f, B:184:0x0ddf, B:186:0x0de5, B:187:0x0e0f, B:22:0x010e, B:24:0x0114, B:25:0x013a, B:27:0x0405, B:29:0x0436, B:30:0x0490), top: B:303:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0c48 A[Catch: all -> 0x0d12, TryCatch #11 {all -> 0x0d12, blocks: (B:159:0x0c33, B:161:0x0c48, B:162:0x0c7b), top: B:298:0x0c33, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0c8e A[Catch: all -> 0x0d08, TryCatch #2 {all -> 0x0d08, blocks: (B:163:0x0c81, B:165:0x0c8e, B:166:0x0d00), top: B:281:0x0c81, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0ea6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0ef7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0f5e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x129f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1393  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x13de  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x1430  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x172e  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0c0f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v65, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r12v88 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v91 */
    /* JADX WARN: Type inference failed for: r12v92 */
    /* JADX WARN: Type inference failed for: r12v93 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 6446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAssethost.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 89;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaMetadataCompat + 81;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }
}
