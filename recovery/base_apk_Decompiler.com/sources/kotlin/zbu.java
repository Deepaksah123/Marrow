package kotlin;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.zbn;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u00108CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/zbu;", "Lo/argCount;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lo/zbn;", "write", "Lo/RenewEligible;", "read", "()Lo/zbn;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zbu extends argCount {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static int RemoteActionCompatParcelizer;
    private static long read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible read = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.zbs
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return zbu.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }
    });
    private static final byte[] $$c = {24, -109, -85, -94};
    private static final int $$f = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_CHR, -90, -19, 114, TarConstants.LF_CHR, -71, -12, -29, 36, -59, -3, -35, 71, -43, -66, 3, -19, -20, 32, -65, -14, -12, -5, -7, -33, -13, 1, -28, 28, -50, -17, -10, 28, -45, -32, 0, 7, -31, -31, 1, -16, -21, -11, -31, 7, -27, -9, -5, -25, 1, -33, -22, -16, -19, 1, 22, -48, -31, -3, -20, -13, 29, -58, -12, -17, 1, -33, 22, -31, -31, 1, -16, -21, -11, -31, 7, -27};
    private static final int $$e = 159;
    private static final byte[] $$a = {TarConstants.LF_FIFO, -78, 96, -9, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 243;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r6, short r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r6 = r6 * 4
            int r6 = 103 - r6
            byte[] r1 = kotlin.zbu.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L29:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2e:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbu.$$g(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.zbu.$$a
            int r8 = r8 * 12
            int r8 = 77 - r8
            int r6 = 80 - r6
            int r7 = r7 * 10
            int r1 = 44 - r7
            byte[] r1 = new byte[r1]
            int r7 = 43 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            int r8 = r8 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbu.a(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 49 - r8
            int r7 = 119 - r7
            byte[] r0 = kotlin.zbu.$$d
            int r1 = 43 - r6
            byte[] r1 = new byte[r1]
            int r6 = 42 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-14)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbu.c(int, int, int, java.lang.Object[]):void");
    }

    private static final zbn IconCompatParcelizer(zbu zbuVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 21;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        zbn.Companion companion = zbn.INSTANCE;
        Bundle bundleRequireArguments = zbuVar.requireArguments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bundleRequireArguments, "");
        zbn zbnVarIconCompatParcelizer = zbn.Companion.IconCompatParcelizer(bundleRequireArguments);
        int i4 = AudioAttributesImplApi21Parcelizer + 77;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return zbnVarIconCompatParcelizer;
    }

    private final zbn read() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 57;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        zbn zbnVar = (zbn) this.read.RemoteActionCompatParcelizer();
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return zbnVar;
    }

    /* JADX INFO: renamed from: o.zbu$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zbu$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/zbn;", "p0", "Lo/zbu;", "RemoteActionCompatParcelizer", "(Lo/zbn;)Lo/zbu;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static zbu RemoteActionCompatParcelizer(zbn p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            zbu zbuVar = new zbu();
            zbuVar.setArguments(p0.RemoteActionCompatParcelizer());
            return zbuVar;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i4 = $11 + 35;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.resolveSize(0, 0), 22748 - KeyEvent.getDeadChar(0, 0), 36 - (Process.myTid() >> 22), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31369), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2720, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 38, 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 15713 - (Process.myPid() >> 22), 64 - TextUtils.getOffsetAfter("", 0), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40977 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6122, 29 - TextUtils.indexOf("", "", 0, 0), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (read ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) RemoteActionCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) IconCompatParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 51;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cCombineMeasuredStates = (char) (13183 - View.combineMeasuredStates(0, 0));
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1649;
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 26;
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            a((byte) 76, b, b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cCombineMeasuredStates, maximumDrawingCacheSize, capsMode, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cLastIndexOf = (char) (13182 - TextUtils.lastIndexOf("", '0'));
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1649;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27;
                byte[] bArr = $$a;
                byte b2 = (byte) (-bArr[39]);
                byte b3 = bArr[53];
                Object[] objArr3 = new Object[1];
                a(b2, b3, b3, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cLastIndexOf, scrollDefaultDelay, iIndexOf, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b(KeyEvent.normalizeMetaState(0), new char[]{0, 0, 0, 0}, new char[]{33635, 63524, 13889, 32573, 15446, 43737, 55048, 35321, 49706, 34580, 53923, 1213, 56974, 23582, 4002, 60235}, (char) (AndroidCharacter.getMirror('0') + 21517), new char[]{3933, 8993, 15617, 62804}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(ViewConfiguration.getPressedStateDuration() >> 16, new char[]{0, 0, 0, 0}, new char[]{59689, 42961, 63021, 28428, 16494, 51524, 55131, 57638, 35142, 52323, 21380, 65228, 60944, 29864, 23955, 62807}, (char) (61093 - KeyEvent.getDeadChar(0, 0)), new char[]{33608, 42537, 42476, 8942}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i2 = AudioAttributesImplApi26Parcelizer + 17;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1200712298};
                byte[] bArr2 = $$d;
                byte b4 = bArr2[35];
                Object[] objArr7 = new Object[1];
                c(b4, (byte) (b4 | 8), (byte) ($$e & 119), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b5 = bArr2[35];
                Object[] objArr8 = new Object[1];
                c((byte) 38, b5, (byte) (b5 + 2), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cArgb = (char) (13183 - Color.argb(0, 0, 0, 0));
                    int iMyPid = 1649 - (Process.myPid() >> 22);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 26;
                    byte[] bArr3 = $$a;
                    byte b6 = (byte) (-bArr3[39]);
                    byte b7 = bArr3[53];
                    Object[] objArr9 = new Object[1];
                    a(b6, b7, b7, objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cArgb, iMyPid, iMakeMeasureSpec, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(TextUtils.getOffsetAfter("", 0), new char[]{0, 0, 0, 0}, new char[]{26086, 458, 2673, 15353, 34460, 41065, 24747, 27081, 7790, 5790, 41630, 33764, 54713, 59111, 55419, 33944, 62491, 10071, 54355, 29688, 52245, 34768}, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{60641, 52797, 37197, 28410}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1148260988, new char[]{0, 0, 0, 0}, new char[]{45403, 19275, 37397, 1526, 53715, 60412, 62516, 46405, 26732, 29486, 53843, 12170, 35446, 60631, 444}, (char) (25278 - View.MeasureSpec.makeMeasureSpec(0, 0)), new char[]{32087, 28946, 48708, 62562}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 13183);
                        int tapTimeout = 1649 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 26;
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[5];
                        byte b9 = bArr4[53];
                        Object[] objArr12 = new Object[1];
                        a(b8, b9, b9, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(packedPositionGroup, tapTimeout, iNormalizeMetaState, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 13184);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1649;
                        int offsetBefore = 26 - TextUtils.getOffsetBefore("", 0);
                        byte b10 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a((byte) 76, b10, b10, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cIndexOf, maxKeyCode, offsetBefore, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i4 = ((int[]) objArr[3])[0];
        int i5 = ((int[]) objArr[2])[0];
        if (i5 != i4) {
            long j = -1;
            long j2 = ((long) (i5 ^ i4)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (Color.green(0) + 4535), View.resolveSizeAndState(0, 0, 0) + 6054, 42 - KeyEvent.keyCodeFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i6 = AudioAttributesImplApi26Parcelizer + 51;
                AudioAttributesImplApi21Parcelizer = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr14 = {1760092650, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) View.MeasureSpec.getMode(0), 6031 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    Object[] objArr15 = new Object[1];
                    c((byte) ($$e & 47), (byte) ($$d[8] + 1), r4[35], objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
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
        super.onCreate(p0);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Window window;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 99;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        Dialog dialog = getDialog();
        if (dialog != null) {
            int i4 = AudioAttributesImplApi26Parcelizer + 3;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            int i6 = AudioAttributesImplApi21Parcelizer + 115;
            AudioAttributesImplApi26Parcelizer = i6 % 128;
            int i7 = i6 % 2;
            View decorView = window.getDecorView();
            if (decorView != null) {
                decorView.setElevation(BitmapDescriptorFactory.HUE_RED);
            }
        }
        return setBitrateKbps.AudioAttributesCompatParcelizer(this, multiplyFft.IconCompatParcelizer(-467967126, true, new MagicModuleSubmissionRequestBody() { // from class: o.SmsCodeAutofillClientPermissionState
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return zbu.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    private static final getShowPopup read(zbu zbuVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = AudioAttributesImplApi26Parcelizer + 63;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(z, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-246374934, i, -1, "com.marrow2.ui.dialogs.ProgressDialogFragment.onCreateView.<anonymous>.<anonymous> (ProgressDialogFragment.kt:32)");
            }
            zbv.RemoteActionCompatParcelizer(zbuVar.read().getAudioAttributesCompatParcelizer(), zbuVar.read().getWrite(), (_handleOddName) null, _handleunrecognizedcharacterescape, 0, 4);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                int i5 = AudioAttributesImplApi21Parcelizer + 15;
                AudioAttributesImplApi26Parcelizer = i5 % 128;
                if (i5 % 2 != 0) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    int i6 = 73 / 0;
                } else {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.getShowPopup IconCompatParcelizer(final kotlin.zbu r11, kotlin._handleUnrecognizedCharacterEscape r12, int r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = r13 & 3
            r2 = 0
            r3 = 1
            if (r1 == r0) goto Lb
            r1 = r3
            goto Lc
        Lb:
            r1 = r2
        Lc:
            r4 = r13 & 1
            boolean r1 = r12.RemoteActionCompatParcelizer(r1, r4)
            if (r1 == 0) goto L65
            int r1 = kotlin.zbu.AudioAttributesImplApi21Parcelizer
            int r1 = r1 + 3
            int r4 = r1 % 128
            kotlin.zbu.AudioAttributesImplApi26Parcelizer = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L29
            boolean r1 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            r4 = 36
            int r4 = r4 / r2
            if (r1 == r3) goto L2f
            goto L38
        L29:
            boolean r1 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r1 == 0) goto L38
        L2f:
            r1 = -1
            java.lang.String r2 = "com.marrow2.ui.dialogs.ProgressDialogFragment.onCreateView.<anonymous> (ProgressDialogFragment.kt:31)"
            r4 = -467967126(0xffffffffe41b636a, float:-1.1465635E22)
            kotlin._validJsonValueList.AudioAttributesCompatParcelizer(r4, r13, r1, r2)
        L38:
            r5 = 0
            r6 = 0
            o.zbt r13 = new o.zbt
            r13.<init>()
            r11 = 54
            r1 = -246374934(0xfffffffff1509dea, float:-1.0330206E30)
            o.FastIntegerMathUInt128 r11 = kotlin.multiplyFft.AudioAttributesCompatParcelizer(r1, r3, r13, r12, r11)
            r7 = r11
            o.MagicModuleSubmissionRequestBody r7 = (kotlin.MagicModuleSubmissionRequestBody) r7
            r9 = 384(0x180, float:5.38E-43)
            r10 = 3
            r8 = r12
            com.marrow.designsystem.theme.ThemeKt.read(r5, r6, r7, r8, r9, r10)
            boolean r11 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r11 == 0) goto L68
            kotlin._validJsonValueList.AudioAttributesImplApi21Parcelizer()
            int r11 = kotlin.zbu.AudioAttributesImplApi26Parcelizer
            int r11 = r11 + 59
            int r12 = r11 % 128
            kotlin.zbu.AudioAttributesImplApi21Parcelizer = r12
            int r11 = r11 % r0
            goto L68
        L65:
            r12.onPrepareFromSearch()
        L68:
            o.getShowPopup r11 = kotlin.getShowPopup.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zbu.IconCompatParcelizer(o.zbu, o._handleUnrecognizedCharacterEscape, int):o.getShowPopup");
    }

    public static /* synthetic */ zbn AudioAttributesCompatParcelizer(zbu zbuVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 17;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        zbn zbnVarIconCompatParcelizer = IconCompatParcelizer(zbuVar);
        int i4 = AudioAttributesImplApi21Parcelizer + 123;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return zbnVarIconCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup write(zbu zbuVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 49;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopup = read(zbuVar, _handleunrecognizedcharacterescape, i);
        int i5 = AudioAttributesImplApi26Parcelizer + 89;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(zbu zbuVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 19;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(zbuVar, _handleunrecognizedcharacterescape, i);
        if (i4 == 0) {
            int i5 = 38 / 0;
        }
        int i6 = AudioAttributesImplApi21Parcelizer + 9;
        AudioAttributesImplApi26Parcelizer = i6 % 128;
        int i7 = i6 % 2;
        return getshowpopupIconCompatParcelizer;
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 0;
        AudioAttributesCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatItemReceiver + 73;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        int i2 = i % 2;
    }

    static void AudioAttributesCompatParcelizer() {
        read = -3498762522182953692L;
        RemoteActionCompatParcelizer = 128189171;
        IconCompatParcelizer = (char) 54564;
    }
}
