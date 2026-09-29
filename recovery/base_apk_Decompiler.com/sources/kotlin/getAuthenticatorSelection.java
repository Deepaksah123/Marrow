package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getAuthenticatorSelection extends addObserverForBackInvoker implements SubjectStat {
    private static short[] MediaBrowserCompatMediaItem;
    private boolean AudioAttributesCompatParcelizer;
    private volatile isHighlighted IconCompatParcelizer;
    private getSubjectStat read;
    private final Object write;
    private static final byte[] $$c = {11, 40, -34, 98};
    private static final int $$f = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {10, -79, -66, -51, -67, 74, -2, -24, 10, -7, -11, 9, -17, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, TarConstants.LF_CONTIG, -4, 13, -34, 18, 11, -10, -13, 10, -15, 6, 1, -25, 27, -8, -74, 44, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$h = 88;
    private static final byte[] $$a = {30, 6, -112, TarConstants.LF_FIFO, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 170;
    private static int MediaMetadataCompat = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static long RemoteActionCompatParcelizer = -3498762522182953692L;
    private static int MediaBrowserCompatCustomActionResultReceiver = -136981212;
    private static char AudioAttributesImplBaseParcelizer = 6119;
    private static int AudioAttributesImplApi26Parcelizer = 1855480084;
    private static int AudioAttributesImplApi21Parcelizer = -819363157;
    private static int MediaBrowserCompatItemReceiver = -1639504282;
    private static byte[] MediaDescriptionCompat = {72, -79, 66, -92, 73, 77, 74, TarConstants.LF_GNUTYPE_LONGLINK, -73, -104, 122, -79, -66, 68, -73, 74, -91, 72, -102, -74, -76, TarConstants.LF_GNUTYPE_LONGLINK, -79, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -102, 98, 72, -74, 74, -104, -77, 122, -126, 73, -74, 73, 101, -102, 121, -103, 72, 100, -74, -123, -76, 122, 73, -126, TarConstants.LF_GNUTYPE_LONGNAME, 102, 73, -74, -101, -79, 74, -75, 101, -74, 74, -74, 74, -127, TarConstants.LF_GNUTYPE_LONGNAME, 101, -77, 121, -121, 101, 73, 72, -103, -76, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, -74, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_GNUTYPE_LONGLINK, -66, 123, -124, 124, -75, -73, -75, -100, 72, -65, 74, -74, 123, -124, 102, -103, -77, -73, 73, TarConstants.LF_GNUTYPE_LONGNAME, 73, -66, 72, -73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -98, -78, TarConstants.LF_GNUTYPE_LONGLINK, -75, 74, 111, TarConstants.LF_GNUTYPE_LONGLINK, -77, -100, 101, -124, -74, 121, 73, -102, -75, 72, 72, 97, -99, -80, 122, -73, -124, -75, 72, -74, 99, -102, 100, -122, 121, -121, 74, -78, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_LONGNAME, -75, -104, 99, -122, 73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -124, 124, -124, -74, 124, -124, 121, -77, TarConstants.LF_GNUTYPE_LONGLINK, -103, 97, -102, TarConstants.LF_GNUTYPE_LONGLINK, -80, TarConstants.LF_GNUTYPE_LONGNAME, -76, 77, 98, 72, -101, -80, 72, -75, 72, -74, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -74, -98, 99, -73, -76, -98, -80, TarConstants.LF_GNUTYPE_LONGLINK, 102, -73, -101, 98, -122, -74, 122, -76, -121, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -73, 98, -121, 124, -76, 73, -103, -78, 102, -99, 102, -114, 74, 73, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -98, -69, 65, -76, 73, -75, -80, 112, -103, 101, -103, -68, TarConstants.LF_GNUTYPE_LONGLINK, -73, 72, TarConstants.LF_GNUTYPE_LONGLINK, 72, 98, -122, 72, -65, 70, -74, 77, -111, -110, 112, 78, -70, 66, -119, 122, 92, -94, 64, -74, 66, -101, 108, 66, -91, -82, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -78, -68, 66, -79, -66, -74, TarConstants.LF_GNUTYPE_LONGNAME, 79, -77, 66, -65, -68, TarConstants.LF_GNUTYPE_LONGLINK, -92, 89, 72, 69, -76, -72, 66, -80, 77, 74, -80, TarConstants.LF_GNUTYPE_LONGNAME, -74, 74, -78, TarConstants.LF_GNUTYPE_LONGNAME, -80, 73, -73, -73, -73, -73, -73, -73, -73, -73, -73};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r7, int r8, byte r9) {
        /*
            int r9 = r9 * 9
            int r9 = r9 + 103
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r0 = kotlin.getAuthenticatorSelection.$$c
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAuthenticatorSelection.$$i(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 190 - r5
            int r7 = r7 + 65
            byte[] r0 = kotlin.getAuthenticatorSelection.$$a
            int r1 = 44 - r6
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = -1
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L23:
            int r5 = r5 + 1
            r4 = r0[r5]
        L27:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAuthenticatorSelection.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.getAuthenticatorSelection.$$g
            int r6 = r6 + 4
            int r5 = 46 - r5
            int r7 = 119 - r7
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r5
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r6 = r6 + 1
            r4 = r0[r6]
        L24:
            int r7 = r7 + r4
            int r7 = r7 + 2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAuthenticatorSelection.d(short, int, int, java.lang.Object[]):void");
    }

    getAuthenticatorSelection() {
        this.write = new Object();
        this.AudioAttributesCompatParcelizer = false;
        AudioAttributesImplApi21Parcelizer();
    }

    getAuthenticatorSelection(byte b) {
        super(R.layout.activity_qbank_introduction_marrow2);
        this.write = new Object();
        this.AudioAttributesCompatParcelizer = false;
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.getAuthenticatorSelection.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                getAuthenticatorSelection.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = MediaMetadataCompat + 63;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 73;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = MediaBrowserCompatCustomActionResultReceiver().write();
        this.read = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = MediaMetadataCompat + 23;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            if (i5 == 0) {
                int i6 = 26 / 0;
            }
        }
    }

    private static void a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $11 + 95;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), 22796 - AndroidCharacter.getMirror('0'), 35 - Process.getGidForName(""), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 31370), ExpandableListView.getPackedPositionChild(0L) + 2722, 'V' - AndroidCharacter.getMirror('0'), 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 15713 - TextUtils.indexOf("", "", 0, 0), View.getDefaultSize(0, 0) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40977 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 6122 - (KeyEvent.getMaxKeyCode() >> 16), 28 - ((byte) KeyEvent.getModifierMetaStateMask()), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplBaseParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                int i6 = $11 + 7;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r25, short r26, int r27, int r28, byte r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAuthenticatorSelection.b(int, short, int, int, byte, java.lang.Object[]):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(TextUtils.getTrimmedLength(""), new char[]{0, 0, 0, 0}, new char[]{64866, 57633, 56265, 14238, 38669, 63395, 59998, 16146, 31628, 31778, 49047, 35379, 26591, 56209, 38534, 33638, 'A', 53150}, (char) (11882 - (ViewConfiguration.getTapTimeout() >> 16)), new char[]{17293, 37362, 27293, 47150}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 1876418870, new char[]{0, 0, 0, 0}, new char[]{54750, 5272, 54956, 18800, 3281}, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 25964), new char[]{16688, 10271, 27792, 12389}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                a(KeyEvent.getMaxKeyCode() >> 16, new char[]{0, 0, 0, 0}, new char[]{29722, 47909, 33985, 15423, 12682, 31960, 50849, 56816, 26951, 28809, 6209, 34804, 23468, 15739, 48672, 3174, 60352, 30596, 16789, 30897, 39969, 31534, 9118, 13205, 16167, 58912}, (char) (TextUtils.indexOf("", "") + 51174), new char[]{28265, 42701, 58989, 29895}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b((-10) - (ViewConfiguration.getJumpTapTimeout() >> 16), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 36), (ViewConfiguration.getTouchSlop() >> 8) - 1366205550, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 1582177276, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 115), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getTapTimeout() >> 16) + 4535), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6054, 42 - Color.alpha(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 10, (short) ExpandableListView.getPackedPositionType(0L), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1366205585, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1582177389, (byte) View.getDefaultSize(0, 0), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(36 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-1366205601) - View.MeasureSpec.getSize(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1582177427, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), (-1366205551) - TextUtils.getTrimmedLength(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1582177465, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a((ViewConfiguration.getDoubleTapTimeout() >> 16) - 1260733119, new char[]{0, 0, 0, 0}, new char[]{15873, 34040, 37926, 20631, 39530, 33779, 9195, 15890, 30686, 60404, 63360, 7136, 17055, 53313, 19742, 4607, 444, 46164, 27677, 52515, 11216, 55397, 61371, 30522, 7083, 32185, 11572, 23990, 44000, 56249, 24072, 55348, 46471, 40079, 11029, 228, 38349, 52396, 56412, 52043, 25757, 62414, 24209, 12140, 46560, 53875, 57190, 65140, 29002, 18416, 34322, 860, 38899, 49163, 1018, 25091, 39241, 1474, 44078, 21544, 3650, 34937, 31464, 25037, 37775, 33447, 52897}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 6334), new char[]{16859, 55997, 58036, 9240}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4, new char[]{0, 0, 0, 0}, new char[]{31580, 26408, 33805, 58354, 27847, 57506}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 9325), new char[]{54672, 3466, 30708, 34852}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 101, (short) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 1366205648, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 1582177559, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6031, 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char packedPositionChild = (char) (13182 - ExpandableListView.getPackedPositionChild(0L));
            int size = View.MeasureSpec.getSize(0) + 1649;
            int i2 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25;
            short s = (short) ($$b | 17);
            byte[] bArr = $$a;
            Object[] objArr13 = new Object[1];
            c(s, bArr[5], bArr[140], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(packedPositionChild, size, i2, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i3 = MediaMetadataCompat + 125;
            MediaBrowserCompatSearchResultReceiver = i3 % 128;
            int i4 = i3 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char mode = (char) (View.MeasureSpec.getMode(0) + 13183);
                int iArgb = Color.argb(0, 0, 0, 0) + 1649;
                int doubleTapTimeout = 26 + (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte[] bArr2 = $$a;
                Object[] objArr14 = new Object[1];
                c((short) 144, bArr2[30], bArr2[5], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(mode, iArgb, doubleTapTimeout, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            b(ImageFormat.getBitsPerPixel(0) - 11, (short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) - 1366205543, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 1582177501, (byte) View.resolveSizeAndState(0, 0, 0), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 13, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) - 37), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1366205554, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 1582177577, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i5 = MediaBrowserCompatSearchResultReceiver + 83;
            MediaMetadataCompat = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -1700601726};
                byte[] bArr3 = $$g;
                Object[] objArr18 = new Object[1];
                d((byte) 40, (byte) (-bArr3[27]), (byte) (-bArr3[55]), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d((byte) (bArr3[25] - 1), bArr3[22], bArr3[15], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') + 13135);
                    int iIndexOf = 1649 - TextUtils.indexOf("", "", 0);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 26;
                    byte[] bArr4 = $$a;
                    Object[] objArr20 = new Object[1];
                    c((short) 144, bArr4[30], bArr4[5], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(mirror, iIndexOf, packedPositionGroup, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, new char[]{0, 0, 0, 0}, new char[]{58384, 23464, 38533, 28168, 60063, 3079, 42202, 9969, 7475, 'b', 35189, 46929, 1179, 4865, 57068, 38035, 60489, 42444, 65487, 48856, 62307, 64486}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), new char[]{18997, 20600, 32193, 20659}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 127, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), (-1366205548) - (KeyEvent.getMaxKeyCode() >> 16), 1582177628 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) - 37), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c = (char) (13183 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int threadPriority = 1649 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26;
                        byte[] bArr5 = $$a;
                        Object[] objArr23 = new Object[1];
                        c((short) 111, bArr5[30], bArr5[5], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c, threadPriority, keyRepeatDelay, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c2 = (char) (13183 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int threadPriority2 = 1649 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int iGreen = 26 + Color.green(0);
                        short s2 = (short) ($$b | 17);
                        byte[] bArr6 = $$a;
                        Object[] objArr24 = new Object[1];
                        c(s2, bArr6[5], bArr6[140], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c2, threadPriority2, iGreen, -133433128, false, (String) objArr24[0], null);
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
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (Process.myPid() >> 22) + 6054, Color.red(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {1609473466, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 6030 - (ViewConfiguration.getEdgeSlop() >> 16), MotionEvent.axisFromString("") + 25);
                Object[] objArr26 = new Object[1];
                d(r3[45], (byte) (-$$g[55]), (byte) 37, objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 123;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.read;
        if (getsubjectstat != null) {
            int i4 = MediaMetadataCompat + 101;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 119;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (i3 == 0) {
            ishighlightedMediaBrowserCompatCustomActionResultReceiver.af_();
            throw null;
        }
        Object objAf_ = ishighlightedMediaBrowserCompatCustomActionResultReceiver.af_();
        int i4 = MediaBrowserCompatSearchResultReceiver + 3;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaMetadataCompat + 53;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 39;
        int i3 = i2 % 128;
        MediaBrowserCompatSearchResultReceiver = i3;
        int i4 = i2 % 2;
        if (!this.AudioAttributesCompatParcelizer) {
            int i5 = i3 + 49;
            MediaMetadataCompat = i5 % 128;
            int i6 = i5 % 2;
            this.AudioAttributesCompatParcelizer = true;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 45;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatSearchResultReceiver + 19;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return RemoteActionCompatParcelizer2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0122  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAuthenticatorSelection.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{0, 0, 0, 0}, new char[]{29722, 47909, 33985, 15423, 12682, 31960, 50849, 56816, 26951, 28809, 6209, 34804, 23468, 15739, 48672, 3174, 60352, 30596, 16789, 30897, 39969, 31534, 9118, 13205, 16167, 58912}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 51139), new char[]{28265, 42701, 58989, 29895}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 10, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), (-1366205585) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, 1582177363 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 36), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 91;
            MediaMetadataCompat = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i3 = MediaMetadataCompat + 79;
            MediaBrowserCompatSearchResultReceiver = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6054, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6030, (ViewConfiguration.getFadingEdgeLength() >> 16) + 24, -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(41:0|2|(2:4|(2:(2:7|(1:13)(1:12))(1:14)|(9:16|259|17|(1:19)|20|21|22|(1:24)|25)))(0)|29|(29:275|31|(2:33|(2:35|(2:37|41)(1:38))(2:39|40))(1:41)|77|274|78|(1:80)|81|82|(4:84|85|(1:87)|88)(19:89|90|266|91|(1:93)|94|95|257|96|(1:98)|99|100|101|(1:103)|104|(1:106)|107|(1:109)|110)|111|(4:114|(13:283|116|(3:118|(4:121|122|123|119)|287)|124|280|125|(1:127)|128|129|130|268|131|286)(1:285)|284|112)|282|166|(1:168)|169|(3:171|(1:173)|174)(13:176|260|177|178|(1:180)|181|270|182|183|(1:185)|186|(1:188)|189)|175|190|(6:192|193|(1:195)|196|197|198)|199|(1:201)|202|(3:204|(1:206)|207)(14:209|210|(1:212)|213|214|(1:216)|217|278|218|219|(1:221)|222|(1:224)|225)|208|226|(6:228|229|(1:231)|232|233|234)|235|236)|45|264|46|(1:48)|49|255|50|(1:52)|53|77|274|78|(0)|81|82|(0)(0)|111|(1:112)|282|166|(0)|169|(0)(0)|175|190|(0)|199|(0)|202|(0)(0)|208|226|(0)|235|236|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0e35, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0e36, code lost:
    
        r8 = new java.lang.Object[1];
        b(((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 52, (short) (((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).codePointAt(1) - 49), ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 1366205706, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1582177642, (byte) (((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), r8);
        r5 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0edf, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r4);
        r0.printStackTrace(r6);
        r6.close();
        r2 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0ef6, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0efa, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r2);
        r4.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0f09, code lost:
    
        r2 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0f0d, code lost:
    
        if (r2 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0f0f, code lost:
    
        r2 = kotlin.startForeground.read((char) ((android.util.TypedValue.complexToFraction(0, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.util.TypedValue.complexToFraction(0, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), 6054 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 42 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0f3d, code lost:
    
        r2 = ((java.lang.reflect.Method) r2).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0f49, code lost:
    
        r8 = new java.lang.Object[]{1404137069, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r4 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), 6030 - android.view.View.MeasureSpec.getMode(0), android.view.View.MeasureSpec.getSize(0) + 24);
        r12 = new java.lang.Object[1];
        d(r5[45], (byte) (-kotlin.getAuthenticatorSelection.$$g[55]), (byte) 37, r12);
        r4.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r2, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0cf7 A[Catch: all -> 0x0e35, TryCatch #10 {all -> 0x0e35, blocks: (B:78:0x07bd, B:80:0x07c3, B:81:0x080c, B:85:0x0826, B:87:0x082c, B:88:0x0875, B:111:0x0ced, B:112:0x0cf1, B:114:0x0cf7, B:116:0x0d0e, B:119:0x0d1b, B:122:0x0d28, B:129:0x0d8e, B:135:0x0e0f, B:137:0x0e15, B:138:0x0e16, B:140:0x0e18, B:142:0x0e1f, B:143:0x0e20, B:89:0x0880, B:101:0x0a92, B:103:0x0a98, B:104:0x0ae0, B:106:0x0c43, B:107:0x0c86, B:109:0x0c9d, B:110:0x0ce7, B:145:0x0e22, B:147:0x0e29, B:148:0x0e2a, B:150:0x0e2c, B:152:0x0e33, B:153:0x0e34, B:96:0x09fe, B:98:0x0a13, B:99:0x0a86, B:91:0x09b1, B:93:0x09c6, B:94:0x09f7, B:131:0x0d93, B:125:0x0d57, B:127:0x0d5d, B:128:0x0d87), top: B:274:0x07bd, outer: #2, inners: #1, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0fd0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x1025  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x107c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x14b5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x159b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x15e9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x163b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x1a76  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x07c3 A[Catch: all -> 0x0e35, TryCatch #10 {all -> 0x0e35, blocks: (B:78:0x07bd, B:80:0x07c3, B:81:0x080c, B:85:0x0826, B:87:0x082c, B:88:0x0875, B:111:0x0ced, B:112:0x0cf1, B:114:0x0cf7, B:116:0x0d0e, B:119:0x0d1b, B:122:0x0d28, B:129:0x0d8e, B:135:0x0e0f, B:137:0x0e15, B:138:0x0e16, B:140:0x0e18, B:142:0x0e1f, B:143:0x0e20, B:89:0x0880, B:101:0x0a92, B:103:0x0a98, B:104:0x0ae0, B:106:0x0c43, B:107:0x0c86, B:109:0x0c9d, B:110:0x0ce7, B:145:0x0e22, B:147:0x0e29, B:148:0x0e2a, B:150:0x0e2c, B:152:0x0e33, B:153:0x0e34, B:96:0x09fe, B:98:0x0a13, B:99:0x0a86, B:91:0x09b1, B:93:0x09c6, B:94:0x09f7, B:131:0x0d93, B:125:0x0d57, B:127:0x0d5d, B:128:0x0d87), top: B:274:0x07bd, outer: #2, inners: #1, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0880 A[Catch: all -> 0x0e35, TRY_LEAVE, TryCatch #10 {all -> 0x0e35, blocks: (B:78:0x07bd, B:80:0x07c3, B:81:0x080c, B:85:0x0826, B:87:0x082c, B:88:0x0875, B:111:0x0ced, B:112:0x0cf1, B:114:0x0cf7, B:116:0x0d0e, B:119:0x0d1b, B:122:0x0d28, B:129:0x0d8e, B:135:0x0e0f, B:137:0x0e15, B:138:0x0e16, B:140:0x0e18, B:142:0x0e1f, B:143:0x0e20, B:89:0x0880, B:101:0x0a92, B:103:0x0a98, B:104:0x0ae0, B:106:0x0c43, B:107:0x0c86, B:109:0x0c9d, B:110:0x0ce7, B:145:0x0e22, B:147:0x0e29, B:148:0x0e2a, B:150:0x0e2c, B:152:0x0e33, B:153:0x0e34, B:96:0x09fe, B:98:0x0a13, B:99:0x0a86, B:91:0x09b1, B:93:0x09c6, B:94:0x09f7, B:131:0x0d93, B:125:0x0d57, B:127:0x0d5d, B:128:0x0d87), top: B:274:0x07bd, outer: #2, inners: #1, #6, #7, #14 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 7378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAuthenticatorSelection.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 25;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = MediaMetadataCompat + 103;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
    }
}
