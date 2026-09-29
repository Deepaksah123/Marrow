package kotlin;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.isPendingReset;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes.dex */
public final class setSeekMap implements isPendingReset.write {
    private static final byte[] $$a = {18, -127, -77, -105};
    private static final int $$b = 242;
    private static long AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi21Parcelizer;
    private static char[] AudioAttributesImplBaseParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static final int MediaBrowserCompatMediaItem;
    private static final byte[] MediaBrowserCompatSearchResultReceiver;
    private static long MediaMetadataCompat;
    private final isPendingReset.IconCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private final bandwidthSample MediaBrowserCompatItemReceiver;
    private final getNextChunkIndex RemoteActionCompatParcelizer;
    private final Queue<Integer> read = new LinkedList();
    private final List<Integer> IconCompatParcelizer = Collections.synchronizedList(new ArrayList());
    private final Queue<Integer> write = new ConcurrentLinkedQueue();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = kotlin.setSeekMap.$$a
            int r6 = r6 * 3
            int r6 = 101 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSeekMap.$$c(byte, short, short):java.lang.String");
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) throws Throwable {
        int i;
        onFormatResult onformatresult = new onFormatResult((setSeekMap) objArr[0]);
        try {
            byte[] bArr = MediaBrowserCompatSearchResultReceiver;
            Object[] objArr2 = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a(bArr[365], bArr[35], bArr[30], objArr3);
            int iIntValue = ((Integer) cls.getMethod((String) objArr3[0], null).invoke(null, null)).intValue() >> 16;
            Object[] objArr4 = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a(bArr[1136], (short) (-bArr[193]), bArr[30], objArr5);
            char cIntValue = (char) (((Integer) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr6 = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr[195], (short) (bArr[142] + 1), bArr[30], objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, cIntValue, (((Float) cls3.getMethod((String) objArr7[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls3.getMethod((String) objArr7[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 141, objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(bArr[183], (short) 87, bArr[9], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(bArr[46], (short) 115, bArr[30], objArr10);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, 0)).intValue() + 142;
            Object[] objArr11 = new Object[1];
            a(bArr[777], (short) 121, bArr[9], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            byte b = bArr[1155];
            Object[] objArr12 = new Object[1];
            a(b, (short) (b | 135), bArr[136], objArr12);
            char c = (char) ((((Double) cls5.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, 0)).doubleValue() > 0.0d ? 1 : (((Double) cls5.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, 0)).doubleValue() == 0.0d ? 0 : -1)) + 61096);
            Object[] objArr13 = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            byte b2 = bArr[0];
            Object[] objArr14 = new Object[1];
            a(b2, (short) (b2 | 169), bArr[30], objArr14);
            Object[] objArr15 = new Object[1];
            b(iIntValue2, c, 1 - (((Integer) cls6.getMethod((String) objArr14[0], null).invoke(null, null)).intValue() >> 16), objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            char c2 = 't';
            byte b3 = bArr[116];
            int i2 = MediaBrowserCompatMediaItem;
            char c3 = 301;
            Object[] objArr17 = new Object[1];
            a(b3, (short) i2, bArr[301], objArr17);
            Class<?> cls7 = Class.forName((String) objArr17[0]);
            byte b4 = bArr[136];
            Object[] objArr18 = new Object[1];
            a(b4, (short) (b4 | 216), bArr[365], objArr18);
            String str2 = (String) objArr18[0];
            Object[] objArr19 = new Object[1];
            a(bArr[116], (short) i2, bArr[301], objArr19);
            Object[] objArr20 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr19[0])).invoke(str, objArr16);
            int[] iArr = new int[objArr20.length];
            int i3 = 0;
            while (i3 < objArr20.length) {
                try {
                    Object[] objArr21 = {objArr20[i3]};
                    byte[] bArr2 = MediaBrowserCompatSearchResultReceiver;
                    byte b5 = bArr2[195];
                    Object[] objArr22 = new Object[1];
                    a(b5, (short) (b5 | 208), bArr2[c3], objArr22);
                    Class<?> cls8 = Class.forName((String) objArr22[0]);
                    byte b6 = bArr2[46];
                    Object[] objArr23 = new Object[1];
                    a(b6, (short) (b6 | 234), bArr2[1136], objArr23);
                    String str3 = (String) objArr23[0];
                    byte b7 = bArr2[c2];
                    short s = (short) MediaBrowserCompatMediaItem;
                    byte b8 = bArr2[c3];
                    Object[] objArr24 = new Object[1];
                    a(b7, s, b8, objArr24);
                    Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                    try {
                        byte b9 = bArr2[195];
                        Object[] objArr25 = new Object[1];
                        a(b9, (short) (b9 | 208), bArr2[301], objArr25);
                        Class<?> cls9 = Class.forName((String) objArr25[0]);
                        Object[] objArr26 = new Object[1];
                        a(bArr2[5], (short) 244, bArr2[12], objArr26);
                        iArr[i3] = ((Integer) cls9.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
                        i3++;
                        c2 = 't';
                        c3 = 301;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                } catch (Throwable th3) {
                    th = th3;
                }
                switch (onformatresult.RemoteActionCompatParcelizer(iArr[i4])) {
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i4 = 38;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        onformatresult.RemoteActionCompatParcelizer(23);
                        if (onformatresult.read == 0) {
                            i5 = 32;
                        } else {
                            i4 = 1;
                        }
                        break;
                    case -17:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(3);
                        onformatresult.AudioAttributesCompatParcelizer = onformatresult.AudioAttributesImplBaseParcelizer.hashCode();
                        try {
                            onformatresult.RemoteActionCompatParcelizer(9);
                        } catch (Throwable th4) {
                            th = th4;
                            byte b10 = MediaBrowserCompatSearchResultReceiver[0];
                            Object[] objArr27 = new Object[1];
                            a(b10, (short) (b10 | 235), r8[301], objArr27);
                            if (Class.forName((String) objArr27[0]).isInstance(th) && i4 >= 21 && i4 < 26) {
                                i4 = 43;
                            } else {
                                if (i4 < 34 || i4 >= 38) {
                                    throw th;
                                }
                                i4 = 31;
                            }
                            onformatresult.write = th;
                            onformatresult.RemoteActionCompatParcelizer(26);
                        }
                        break;
                    case -16:
                        onformatresult.RemoteActionCompatParcelizer(7);
                        throw ((Throwable) onformatresult.AudioAttributesImplBaseParcelizer);
                    case -15:
                        i4 = 39;
                        break;
                    case -14:
                        i4 = 41;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        onformatresult.RemoteActionCompatParcelizer(21);
                        i4 = onformatresult.read != 0 ? i5 : 30;
                        break;
                    case -12:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(15);
                        MediaBrowserCompatCustomActionResultReceiver = onformatresult.read;
                        break;
                    case -11:
                        onformatresult.AudioAttributesCompatParcelizer = AudioAttributesImplApi21Parcelizer;
                        i = 9;
                        onformatresult.RemoteActionCompatParcelizer(i);
                        break;
                    case -10:
                        i4 = 7;
                        break;
                    case -9:
                        i4 = 20;
                        break;
                    case -8:
                        onformatresult.RemoteActionCompatParcelizer(17);
                        if (onformatresult.read == 0) {
                            i5 = 19;
                        }
                        break;
                    case -7:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(15);
                        AudioAttributesImplApi21Parcelizer = onformatresult.read;
                        break;
                    case -6:
                        onformatresult.AudioAttributesCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver;
                        i = 9;
                        onformatresult.RemoteActionCompatParcelizer(i);
                        break;
                    case -5:
                        onformatresult.RemoteActionCompatParcelizer(7);
                        return (getShowPopup) onformatresult.AudioAttributesImplBaseParcelizer;
                    case -4:
                        i4 = 21;
                        break;
                    case -3:
                        i4 = 9;
                        break;
                    case -2:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(3);
                        onformatresult.write = ((setSeekMap) onformatresult.AudioAttributesImplBaseParcelizer).MediaBrowserCompatItemReceiver();
                        onformatresult.RemoteActionCompatParcelizer(4);
                        break;
                    case -1:
                        i4 = 4;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th5) {
            Throwable cause3 = th5.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th5;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0337. Please report as an issue. */
    private void AudioAttributesImplApi26Parcelizer() throws Throwable {
        onFormatResult onformatresult = new onFormatResult(this);
        try {
            int i = 0;
            byte[] bArr = MediaBrowserCompatSearchResultReceiver;
            short s = (short) 269;
            Object[] objArr = new Object[1];
            a(bArr[438], s, bArr[9], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b = bArr[46];
            Object[] objArr2 = new Object[1];
            a(b, (short) (b | 794), bArr[12], objArr2);
            String str = (String) objArr2[0];
            short s2 = (short) 304;
            Object[] objArr3 = new Object[1];
            a(bArr[438], s2, bArr[301], objArr3);
            int iIntValue = 1235 - ((Integer) cls.getMethod(str, Class.forName((String) objArr3[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue();
            Object[] objArr4 = new Object[1];
            a(bArr[438], s, bArr[9], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            byte b2 = bArr[46];
            Object[] objArr5 = new Object[1];
            a(b2, (short) (b2 | 794), bArr[12], objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            a(bArr[438], s2, bArr[301], objArr6);
            Object[] objArr7 = new Object[1];
            a(bArr[438], s2, bArr[301], objArr7);
            char cIntValue = (char) (((Integer) cls2.getMethod(str2, Class.forName((String) objArr6[0]), Class.forName((String) objArr7[0])).invoke(null, "", "")).intValue() + 19733);
            Object[] objArr8 = new Object[1];
            a(bArr[1136], (short) 879, bArr[9], objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(bArr[301], (short) 902, bArr[30], objArr9);
            Object[] objArr10 = new Object[1];
            b(iIntValue, cIntValue, (((Float) cls3.getMethod((String) objArr9[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls3.getMethod((String) objArr9[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 81, objArr10);
            String str3 = (String) objArr10[0];
            short s3 = (short) 87;
            Object[] objArr11 = new Object[1];
            a(bArr[183], s3, bArr[9], objArr11);
            Class<?> cls4 = Class.forName((String) objArr11[0]);
            byte b3 = bArr[28];
            Object[] objArr12 = new Object[1];
            a(b3, (short) 913, b3, objArr12);
            int iIntValue2 = 142 - ((Integer) cls4.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr13 = new Object[1];
            a(bArr[183], s3, bArr[9], objArr13);
            Class<?> cls5 = Class.forName((String) objArr13[0]);
            byte b4 = bArr[46];
            Object[] objArr14 = new Object[1];
            a(b4, (short) (b4 | 923), bArr[30], objArr14);
            char cIntValue2 = (char) (61096 - ((Integer) cls5.getMethod((String) objArr14[0], Integer.TYPE).invoke(null, 0)).intValue());
            Object[] objArr15 = {0, 0};
            Object[] objArr16 = new Object[1];
            a(bArr[365], (short) 394, bArr[9], objArr16);
            Class<?> cls6 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a(bArr[12], (short) 933, bArr[30], objArr17);
            Object[] objArr18 = new Object[1];
            b(iIntValue2, cIntValue2, 1 - ((Integer) cls6.getMethod((String) objArr17[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr15)).intValue(), objArr18);
            Object[] objArr19 = {(String) objArr18[0]};
            char c = 't';
            byte b5 = bArr[116];
            int i2 = MediaBrowserCompatMediaItem;
            Object[] objArr20 = new Object[1];
            a(b5, (short) i2, bArr[301], objArr20);
            Class<?> cls7 = Class.forName((String) objArr20[0]);
            byte b6 = bArr[136];
            Object[] objArr21 = new Object[1];
            a(b6, (short) (b6 | 216), bArr[365], objArr21);
            String str4 = (String) objArr21[0];
            Object[] objArr22 = new Object[1];
            a(bArr[116], (short) i2, bArr[301], objArr22);
            Object[] objArr23 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr22[0])).invoke(str3, objArr19);
            int[] iArr = new int[objArr23.length];
            int i3 = 0;
            while (i3 < objArr23.length) {
                Object[] objArr24 = {objArr23[i3]};
                byte[] bArr2 = MediaBrowserCompatSearchResultReceiver;
                byte b7 = bArr2[195];
                Object[] objArr25 = new Object[1];
                a(b7, (short) (b7 | 208), bArr2[301], objArr25);
                Class<?> cls8 = Class.forName((String) objArr25[0]);
                byte b8 = bArr2[46];
                Object[] objArr26 = new Object[1];
                a(b8, (short) (b8 | 234), bArr2[1136], objArr26);
                String str5 = (String) objArr26[0];
                Object[] objArr27 = new Object[1];
                a(bArr2[c], (short) MediaBrowserCompatMediaItem, bArr2[301], objArr27);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr27[0])).invoke(null, objArr24);
                byte b9 = bArr2[195];
                Object[] objArr28 = new Object[1];
                a(b9, (short) (b9 | 208), bArr2[301], objArr28);
                Class<?> cls9 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                a(bArr2[5], (short) 244, bArr2[12], objArr29);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr29[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = 't';
            }
            while (true) {
                int i4 = i + 1;
                switch (onformatresult.RemoteActionCompatParcelizer(iArr[i])) {
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i4 = 14;
                        i = i4;
                        break;
                    case -12:
                        i4 = 26;
                        i = i4;
                        break;
                    case -11:
                        onformatresult.RemoteActionCompatParcelizer(21);
                        if (onformatresult.read == 0) {
                            i4 = 25;
                        }
                        i = i4;
                        break;
                    case -10:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(15);
                        MediaBrowserCompatCustomActionResultReceiver = onformatresult.read;
                        i = i4;
                        break;
                    case -9:
                        onformatresult.AudioAttributesCompatParcelizer = AudioAttributesImplApi21Parcelizer;
                        onformatresult.RemoteActionCompatParcelizer(9);
                        i = i4;
                        break;
                    case -8:
                        break;
                    case -7:
                        i = 1;
                        break;
                    case -6:
                        i = 16;
                        break;
                    case -5:
                        onformatresult.AudioAttributesCompatParcelizer = 2;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(3);
                        bandwidthSample bandwidthsample = (bandwidthSample) onformatresult.AudioAttributesImplBaseParcelizer;
                        onformatresult.RemoteActionCompatParcelizer(3);
                        bandwidthSample.RemoteActionCompatParcelizer(-207938581, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 207938584, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{bandwidthsample, (getCreatedOnDateMs) onformatresult.AudioAttributesImplBaseParcelizer}, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer());
                        i = i4;
                        break;
                    case -4:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(3);
                        final setSeekMap setseekmap = (setSeekMap) onformatresult.AudioAttributesImplBaseParcelizer;
                        onformatresult.write = new getCreatedOnDateMs() { // from class: o.onLengthKnown
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                Object[] objArr30 = {this.IconCompatParcelizer};
                                return (getShowPopup) setSeekMap.RemoteActionCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), 1747616779, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), objArr30, -1747616778, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer());
                            }
                        };
                        onformatresult.RemoteActionCompatParcelizer(4);
                        i = i4;
                        break;
                    case -3:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(3);
                        bandwidthSample.RemoteActionCompatParcelizer(-332918724, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 332918729, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{(bandwidthSample) onformatresult.AudioAttributesImplBaseParcelizer}, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer());
                        i = i4;
                        break;
                    case -2:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(3);
                        onformatresult.write = ((setSeekMap) onformatresult.AudioAttributesImplBaseParcelizer).MediaBrowserCompatItemReceiver;
                        onformatresult.RemoteActionCompatParcelizer(4);
                        i = i4;
                        break;
                    case -1:
                        i = 10;
                        break;
                    default:
                        i = i4;
                        break;
                }
                return;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private void AudioAttributesImplApi26Parcelizer(int i) throws Throwable {
        onFormatResult onformatresult = new onFormatResult(this, i);
        try {
            Object[] objArr = {0, Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(BitmapDescriptorFactory.HUE_RED)};
            int i2 = 0;
            byte[] bArr = MediaBrowserCompatSearchResultReceiver;
            Object[] objArr2 = new Object[1];
            a(bArr[603], (short) 943, bArr[9], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a(bArr[195], (short) 965, bArr[136], objArr3);
            int i3 = (((Float) cls.getMethod((String) objArr3[0], Integer.TYPE, Float.TYPE, Float.TYPE).invoke(null, objArr)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls.getMethod((String) objArr3[0], Integer.TYPE, Float.TYPE, Float.TYPE).invoke(null, objArr)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1317;
            Object[] objArr4 = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a(bArr[195], (short) 981, bArr[30], objArr5);
            char cIntValue = (char) (((Integer) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr6 = {0, 0};
            Object[] objArr7 = new Object[1];
            a(bArr[195], (short) 365, bArr[9], objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(bArr[12], (short) 997, bArr[247], objArr8);
            Object[] objArr9 = new Object[1];
            b(i3, cIntValue, 187 - ((Integer) cls3.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr6)).intValue(), objArr9);
            String str = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a(bArr[438], (short) 644, bArr[9], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            byte b = bArr[9];
            Object[] objArr11 = new Object[1];
            a(b, (short) (b | 1007), bArr[247], objArr11);
            int iIntValue = 142 - ((Integer) cls4.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr12 = new Object[1];
            a(bArr[172], (short) 832, bArr[9], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a(bArr[134], (short) 849, bArr[30], objArr13);
            String str2 = (String) objArr13[0];
            byte b2 = bArr[116];
            int i4 = MediaBrowserCompatMediaItem;
            Object[] objArr14 = new Object[1];
            a(b2, (short) i4, bArr[301], objArr14);
            char cIntValue2 = (char) (61095 - ((Integer) cls5.getMethod(str2, Class.forName((String) objArr14[0])).invoke(null, "")).intValue());
            Object[] objArr15 = {"", '0', 0};
            Object[] objArr16 = new Object[1];
            a(bArr[438], (short) 269, bArr[9], objArr16);
            Class<?> cls6 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a(bArr[12], (short) 864, bArr[246], objArr17);
            String str3 = (String) objArr17[0];
            Object[] objArr18 = new Object[1];
            a(bArr[438], (short) 304, bArr[301], objArr18);
            Class<?>[] clsArr = {Class.forName((String) objArr18[0]), Character.TYPE, Integer.TYPE};
            Object[] objArr19 = new Object[1];
            b(iIntValue, cIntValue2, -((Integer) cls6.getMethod(str3, clsArr).invoke(null, objArr15)).intValue(), objArr19);
            Object[] objArr20 = {(String) objArr19[0]};
            Object[] objArr21 = new Object[1];
            a(bArr[116], (short) i4, bArr[301], objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            byte b3 = bArr[136];
            Object[] objArr22 = new Object[1];
            a(b3, (short) (b3 | 216), bArr[365], objArr22);
            String str4 = (String) objArr22[0];
            Object[] objArr23 = new Object[1];
            a(bArr[116], (short) i4, bArr[301], objArr23);
            Object[] objArr24 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr23[0])).invoke(str, objArr20);
            int[] iArr = new int[objArr24.length];
            for (int i5 = 0; i5 < objArr24.length; i5++) {
                Object[] objArr25 = {objArr24[i5]};
                byte[] bArr2 = MediaBrowserCompatSearchResultReceiver;
                byte b4 = bArr2[195];
                Object[] objArr26 = new Object[1];
                a(b4, (short) (b4 | 208), bArr2[301], objArr26);
                Class<?> cls8 = Class.forName((String) objArr26[0]);
                byte b5 = bArr2[46];
                Object[] objArr27 = new Object[1];
                a(b5, (short) (b5 | 234), bArr2[1136], objArr27);
                String str5 = (String) objArr27[0];
                Object[] objArr28 = new Object[1];
                a(bArr2[116], (short) MediaBrowserCompatMediaItem, bArr2[301], objArr28);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr28[0])).invoke(null, objArr25);
                byte b6 = bArr2[195];
                Object[] objArr29 = new Object[1];
                a(b6, (short) (b6 | 208), bArr2[301], objArr29);
                Class<?> cls9 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                a(bArr2[5], (short) 244, bArr2[12], objArr30);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr30[0], null).invoke(objInvoke, null)).intValue();
            }
            while (true) {
                int i6 = i2 + 1;
                int i7 = 44;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (onformatresult.RemoteActionCompatParcelizer(iArr[i2])) {
                    case -23:
                        i2 = 53;
                        break;
                    case -22:
                        try {
                            onformatresult.RemoteActionCompatParcelizer(23);
                            int i8 = onformatresult.read;
                            i6 = (i8 == 2 || i8 != 48) ? 14 : 43;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i2 >= i7 || i2 >= 48) {
                                throw th;
                            }
                            onformatresult.write = th;
                            onformatresult.RemoteActionCompatParcelizer(26);
                            i2 = 42;
                        }
                        break;
                    case -21:
                        i2 = 48;
                        break;
                    case -20:
                        onformatresult.RemoteActionCompatParcelizer(23);
                        int i9 = onformatresult.read;
                        if (i9 == 9 || i9 != 44) {
                            i2 = 1;
                        } else {
                            i6 = 26;
                        }
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        onformatresult.RemoteActionCompatParcelizer(7);
                        throw ((Throwable) onformatresult.AudioAttributesImplBaseParcelizer);
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i2 = 54;
                        break;
                    case -17:
                        i2 = 56;
                        break;
                    case -16:
                        onformatresult.RemoteActionCompatParcelizer(17);
                        if (onformatresult.read == 0) {
                            i6 = 41;
                        }
                        break;
                    case -15:
                        onformatresult.RemoteActionCompatParcelizer(76);
                        i2 = onformatresult.read == 0 ? 30 : i6;
                        break;
                    case -14:
                        i2 = 49;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i2 = 51;
                        break;
                    case -12:
                        onformatresult.RemoteActionCompatParcelizer(17);
                        if (onformatresult.read == 0) {
                            i6 = 25;
                        }
                        break;
                    case -11:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(15);
                        AudioAttributesImplApi21Parcelizer = onformatresult.read;
                        break;
                    case -10:
                        onformatresult.AudioAttributesCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver;
                        onformatresult.RemoteActionCompatParcelizer(9);
                        break;
                    case -9:
                        i2 = 16;
                        break;
                    case -8:
                        return;
                    case -7:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        try {
                            onformatresult.RemoteActionCompatParcelizer(3);
                            ((isPendingReset.IconCompatParcelizer) onformatresult.AudioAttributesImplBaseParcelizer).write();
                        } catch (Throwable th3) {
                            th = th3;
                            if (i2 >= i7) {
                            }
                            throw th;
                        }
                        break;
                    case -6:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(3);
                        onformatresult.write = ((setSeekMap) onformatresult.AudioAttributesImplBaseParcelizer).AudioAttributesImplApi26Parcelizer;
                        onformatresult.RemoteActionCompatParcelizer(4);
                        break;
                    case -5:
                        i2 = 31;
                        break;
                    case -4:
                        i2 = 7;
                        break;
                    case -3:
                        i2 = 6;
                        break;
                    case -2:
                        onformatresult.RemoteActionCompatParcelizer(76);
                        i7 = onformatresult.read;
                        if (i7 == 0) {
                            i6 = 5;
                        }
                        break;
                    case -1:
                        i2 = 11;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0425  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesImplBaseParcelizer(int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSeekMap.AudioAttributesImplBaseParcelizer(int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x033a. Please report as an issue. */
    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) throws Throwable {
        int i = 0;
        onFormatResult onformatresult = new onFormatResult((setSeekMap) objArr[0], ((Number) objArr[1]).intValue());
        try {
            byte[] bArr = MediaBrowserCompatSearchResultReceiver;
            short s = (short) 832;
            Object[] objArr2 = new Object[1];
            a(bArr[172], s, bArr[9], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a(bArr[134], (short) 849, bArr[30], objArr3);
            String str = (String) objArr3[0];
            byte b = bArr[116];
            int i2 = MediaBrowserCompatMediaItem;
            Object[] objArr4 = new Object[1];
            a(b, (short) i2, bArr[301], objArr4);
            int iIntValue = 2263 - ((Integer) cls.getMethod(str, Class.forName((String) objArr4[0])).invoke(null, "")).intValue();
            Object[] objArr5 = new Object[1];
            a(bArr[172], s, bArr[9], objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr[195], (short) AnalyticsListener.EVENT_VIDEO_DISABLED, bArr[30], objArr6);
            char cIntValue = (char) (37733 - ((((Integer) cls2.getMethod((String) objArr6[0], Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6));
            Object[] objArr7 = {0};
            short s2 = (short) 1267;
            Object[] objArr8 = new Object[1];
            a(bArr[152], s2, bArr[9], objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            byte b2 = bArr[28];
            Object[] objArr9 = new Object[1];
            a(b2, (short) (b2 | X5455_ExtendedTimestamp.ACCESS_TIME_BIT), bArr[30], objArr9);
            Object[] objArr10 = new Object[1];
            b(iIntValue, cIntValue, ((Integer) cls3.getMethod((String) objArr9[0], Integer.TYPE).invoke(null, objArr7)).intValue() + 53, objArr10);
            String str2 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            a(bArr[152], s2, bArr[9], objArr11);
            Class<?> cls4 = Class.forName((String) objArr11[0]);
            byte b3 = bArr[28];
            Object[] objArr12 = new Object[1];
            a(b3, (short) (b3 | X5455_ExtendedTimestamp.ACCESS_TIME_BIT), bArr[30], objArr12);
            int iIntValue2 = 141 - ((Integer) cls4.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr13 = new Object[1];
            a(bArr[438], (short) 269, bArr[9], objArr13);
            Class<?> cls5 = Class.forName((String) objArr13[0]);
            byte b4 = bArr[46];
            Object[] objArr14 = new Object[1];
            a(b4, (short) (b4 | 794), bArr[12], objArr14);
            String str3 = (String) objArr14[0];
            short s3 = (short) 304;
            Object[] objArr15 = new Object[1];
            a(bArr[438], s3, bArr[301], objArr15);
            Object[] objArr16 = new Object[1];
            a(bArr[438], s3, bArr[301], objArr16);
            char cIntValue2 = (char) (61096 - ((Integer) cls5.getMethod(str3, Class.forName((String) objArr15[0]), Class.forName((String) objArr16[0]), Integer.TYPE).invoke(null, "", "", 0)).intValue());
            Object[] objArr17 = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr17);
            Class<?> cls6 = Class.forName((String) objArr17[0]);
            Object[] objArr18 = new Object[1];
            a(bArr[902], (short) 1308, bArr[30], objArr18);
            Object[] objArr19 = new Object[1];
            b(iIntValue2, cIntValue2, (((Long) cls6.getMethod((String) objArr18[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls6.getMethod((String) objArr18[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr19);
            Object[] objArr20 = {(String) objArr19[0]};
            Object[] objArr21 = new Object[1];
            a(bArr[116], (short) i2, bArr[301], objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            byte b5 = bArr[136];
            Object[] objArr22 = new Object[1];
            a(b5, (short) (b5 | 216), bArr[365], objArr22);
            String str4 = (String) objArr22[0];
            Object[] objArr23 = new Object[1];
            a(bArr[116], (short) i2, bArr[301], objArr23);
            Object[] objArr24 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr23[0])).invoke(str2, objArr20);
            int[] iArr = new int[objArr24.length];
            for (int i3 = 0; i3 < objArr24.length; i3++) {
                Object[] objArr25 = {objArr24[i3]};
                byte[] bArr2 = MediaBrowserCompatSearchResultReceiver;
                byte b6 = bArr2[195];
                Object[] objArr26 = new Object[1];
                a(b6, (short) (b6 | 208), bArr2[301], objArr26);
                Class<?> cls8 = Class.forName((String) objArr26[0]);
                byte b7 = bArr2[46];
                Object[] objArr27 = new Object[1];
                a(b7, (short) (b7 | 234), bArr2[1136], objArr27);
                String str5 = (String) objArr27[0];
                Object[] objArr28 = new Object[1];
                a(bArr2[116], (short) MediaBrowserCompatMediaItem, bArr2[301], objArr28);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr28[0])).invoke(null, objArr25);
                byte b8 = bArr2[195];
                Object[] objArr29 = new Object[1];
                a(b8, (short) (b8 | 208), bArr2[301], objArr29);
                Class<?> cls9 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                a(bArr2[5], (short) 244, bArr2[12], objArr30);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr30[0], null).invoke(objInvoke, null)).intValue();
            }
            while (true) {
                int i4 = i + 1;
                switch (onformatresult.RemoteActionCompatParcelizer(iArr[i])) {
                    case -9:
                        i = 6;
                        break;
                    case -8:
                        i = 17;
                        break;
                    case -7:
                        onformatresult.RemoteActionCompatParcelizer(17);
                        if (onformatresult.read == 0) {
                            i4 = 16;
                        }
                        i = i4;
                        break;
                    case -6:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(15);
                        AudioAttributesImplApi21Parcelizer = onformatresult.read;
                        i = i4;
                        break;
                    case -5:
                        onformatresult.AudioAttributesCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver;
                        onformatresult.RemoteActionCompatParcelizer(9);
                        i = i4;
                        break;
                    case -4:
                        break;
                    case -3:
                        i = 1;
                        break;
                    case -2:
                        i = 8;
                        break;
                    case -1:
                        i = 2;
                        break;
                    default:
                        i = i4;
                        break;
                }
                return null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x05c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0439 A[Catch: all -> 0x05bc, TryCatch #7 {all -> 0x05bc, blocks: (B:20:0x033e, B:21:0x034d, B:24:0x0359, B:25:0x036c, B:26:0x0370, B:27:0x0387, B:33:0x0396, B:34:0x03aa, B:36:0x03bd, B:55:0x0433, B:57:0x0439, B:58:0x043a, B:61:0x0442, B:63:0x04b3, B:65:0x04ba, B:67:0x04c0, B:68:0x04c1, B:69:0x04c2, B:74:0x04d7, B:77:0x04f1, B:78:0x04f9, B:79:0x0508, B:84:0x051b, B:85:0x0522, B:86:0x0523, B:87:0x052b, B:88:0x053a, B:93:0x054c, B:62:0x0457), top: B:159:0x033e, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x043a A[Catch: all -> 0x05bc, TryCatch #7 {all -> 0x05bc, blocks: (B:20:0x033e, B:21:0x034d, B:24:0x0359, B:25:0x036c, B:26:0x0370, B:27:0x0387, B:33:0x0396, B:34:0x03aa, B:36:0x03bd, B:55:0x0433, B:57:0x0439, B:58:0x043a, B:61:0x0442, B:63:0x04b3, B:65:0x04ba, B:67:0x04c0, B:68:0x04c1, B:69:0x04c2, B:74:0x04d7, B:77:0x04f1, B:78:0x04f9, B:79:0x0508, B:84:0x051b, B:85:0x0522, B:86:0x0523, B:87:0x052b, B:88:0x053a, B:93:0x054c, B:62:0x0457), top: B:159:0x033e, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(int r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSeekMap.IconCompatParcelizer(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x041c A[Catch: all -> 0x0461, TryCatch #1 {all -> 0x0461, blocks: (B:44:0x0405, B:52:0x0416, B:54:0x041c, B:55:0x041d, B:58:0x0424, B:63:0x0442), top: B:164:0x0405 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x041d A[Catch: all -> 0x0461, TryCatch #1 {all -> 0x0461, blocks: (B:44:0x0405, B:52:0x0416, B:54:0x041c, B:55:0x041d, B:58:0x0424, B:63:0x0442), top: B:164:0x0405 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ kotlin.getShowPopup MediaBrowserCompatItemReceiver() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSeekMap.MediaBrowserCompatItemReceiver():o.getShowPopup");
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~((~i) | i8);
        int i10 = i | i8;
        int i11 = i2 + i4 + i6 + ((-189913888) * i3) + ((-1809372279) * i5);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i2) - 1671495680) + (10634006 * i4) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i6) + (952107008 * i3) + (1092222976 * i5) + ((-70844416) * i12);
        int i14 = (i2 * 986545540) + 223666697 + (i4 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i6 * 986544659) + (i3 * 1843362976) + (i5 * (-1872984789)) + (i12 * (-2050686976));
        int i15 = i13 + (i14 * i14 * 1179713536);
        return i15 != 1 ? i15 != 2 ? IconCompatParcelizer(objArr) : read(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x058f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x059c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03fd A[Catch: all -> 0x0468, TryCatch #5 {all -> 0x0468, blocks: (B:39:0x03e6, B:47:0x03f7, B:49:0x03fd, B:50:0x03fe, B:51:0x03ff, B:54:0x0416, B:56:0x0436, B:57:0x0450), top: B:136:0x03e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03fe A[Catch: all -> 0x0468, TryCatch #5 {all -> 0x0468, blocks: (B:39:0x03e6, B:47:0x03f7, B:49:0x03fd, B:50:0x03fe, B:51:0x03ff, B:54:0x0416, B:56:0x0436, B:57:0x0450), top: B:136:0x03e6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSeekMap.read(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x069c A[Catch: all -> 0x0783, TryCatch #1 {all -> 0x0783, blocks: (B:25:0x034a, B:26:0x034c, B:33:0x035c, B:38:0x036f, B:49:0x03d4, B:57:0x03e1, B:59:0x03e8, B:60:0x03e9, B:63:0x03f1, B:65:0x045f, B:66:0x0463, B:68:0x0469, B:70:0x0470, B:71:0x0471, B:73:0x0476, B:74:0x0489, B:76:0x04f3, B:78:0x04fa, B:80:0x0501, B:81:0x0502, B:83:0x0507, B:85:0x0548, B:87:0x054d, B:89:0x0554, B:90:0x0555, B:96:0x05a4, B:101:0x05af, B:103:0x05b6, B:104:0x05b7, B:107:0x05bd, B:112:0x05d8, B:114:0x061e, B:116:0x0623, B:118:0x062a, B:119:0x062b, B:120:0x062c, B:129:0x0688, B:137:0x0695, B:139:0x069c, B:140:0x069d, B:143:0x06a3, B:144:0x06be, B:145:0x06d5, B:147:0x0743, B:149:0x074a, B:151:0x0751, B:152:0x0752, B:157:0x075f, B:158:0x0767, B:159:0x0776, B:28:0x0351, B:30:0x0358, B:31:0x0359, B:113:0x05e5, B:64:0x0405, B:146:0x06e9, B:84:0x0512, B:24:0x0329, B:75:0x0499), top: B:251:0x035c, inners: #0, #2, #3, #8, #11, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x069d A[Catch: all -> 0x0783, TryCatch #1 {all -> 0x0783, blocks: (B:25:0x034a, B:26:0x034c, B:33:0x035c, B:38:0x036f, B:49:0x03d4, B:57:0x03e1, B:59:0x03e8, B:60:0x03e9, B:63:0x03f1, B:65:0x045f, B:66:0x0463, B:68:0x0469, B:70:0x0470, B:71:0x0471, B:73:0x0476, B:74:0x0489, B:76:0x04f3, B:78:0x04fa, B:80:0x0501, B:81:0x0502, B:83:0x0507, B:85:0x0548, B:87:0x054d, B:89:0x0554, B:90:0x0555, B:96:0x05a4, B:101:0x05af, B:103:0x05b6, B:104:0x05b7, B:107:0x05bd, B:112:0x05d8, B:114:0x061e, B:116:0x0623, B:118:0x062a, B:119:0x062b, B:120:0x062c, B:129:0x0688, B:137:0x0695, B:139:0x069c, B:140:0x069d, B:143:0x06a3, B:144:0x06be, B:145:0x06d5, B:147:0x0743, B:149:0x074a, B:151:0x0751, B:152:0x0752, B:157:0x075f, B:158:0x0767, B:159:0x0776, B:28:0x0351, B:30:0x0358, B:31:0x0359, B:113:0x05e5, B:64:0x0405, B:146:0x06e9, B:84:0x0512, B:24:0x0329, B:75:0x0499), top: B:251:0x035c, inners: #0, #2, #3, #8, #11, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x08d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03e8 A[Catch: all -> 0x0783, TryCatch #1 {all -> 0x0783, blocks: (B:25:0x034a, B:26:0x034c, B:33:0x035c, B:38:0x036f, B:49:0x03d4, B:57:0x03e1, B:59:0x03e8, B:60:0x03e9, B:63:0x03f1, B:65:0x045f, B:66:0x0463, B:68:0x0469, B:70:0x0470, B:71:0x0471, B:73:0x0476, B:74:0x0489, B:76:0x04f3, B:78:0x04fa, B:80:0x0501, B:81:0x0502, B:83:0x0507, B:85:0x0548, B:87:0x054d, B:89:0x0554, B:90:0x0555, B:96:0x05a4, B:101:0x05af, B:103:0x05b6, B:104:0x05b7, B:107:0x05bd, B:112:0x05d8, B:114:0x061e, B:116:0x0623, B:118:0x062a, B:119:0x062b, B:120:0x062c, B:129:0x0688, B:137:0x0695, B:139:0x069c, B:140:0x069d, B:143:0x06a3, B:144:0x06be, B:145:0x06d5, B:147:0x0743, B:149:0x074a, B:151:0x0751, B:152:0x0752, B:157:0x075f, B:158:0x0767, B:159:0x0776, B:28:0x0351, B:30:0x0358, B:31:0x0359, B:113:0x05e5, B:64:0x0405, B:146:0x06e9, B:84:0x0512, B:24:0x0329, B:75:0x0499), top: B:251:0x035c, inners: #0, #2, #3, #8, #11, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03e9 A[Catch: all -> 0x0783, TryCatch #1 {all -> 0x0783, blocks: (B:25:0x034a, B:26:0x034c, B:33:0x035c, B:38:0x036f, B:49:0x03d4, B:57:0x03e1, B:59:0x03e8, B:60:0x03e9, B:63:0x03f1, B:65:0x045f, B:66:0x0463, B:68:0x0469, B:70:0x0470, B:71:0x0471, B:73:0x0476, B:74:0x0489, B:76:0x04f3, B:78:0x04fa, B:80:0x0501, B:81:0x0502, B:83:0x0507, B:85:0x0548, B:87:0x054d, B:89:0x0554, B:90:0x0555, B:96:0x05a4, B:101:0x05af, B:103:0x05b6, B:104:0x05b7, B:107:0x05bd, B:112:0x05d8, B:114:0x061e, B:116:0x0623, B:118:0x062a, B:119:0x062b, B:120:0x062c, B:129:0x0688, B:137:0x0695, B:139:0x069c, B:140:0x069d, B:143:0x06a3, B:144:0x06be, B:145:0x06d5, B:147:0x0743, B:149:0x074a, B:151:0x0751, B:152:0x0752, B:157:0x075f, B:158:0x0767, B:159:0x0776, B:28:0x0351, B:30:0x0358, B:31:0x0359, B:113:0x05e5, B:64:0x0405, B:146:0x06e9, B:84:0x0512, B:24:0x0329, B:75:0x0499), top: B:251:0x035c, inners: #0, #2, #3, #8, #11, #17 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(int... r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSeekMap.write(int[]):void");
    }

    public static boolean write() throws Throwable {
        long jLongValue;
        onFormatResult onformatresult = new onFormatResult();
        try {
            byte[] bArr = MediaBrowserCompatSearchResultReceiver;
            byte b = bArr[170];
            Object[] objArr = new Object[1];
            a(b, (short) (b | 544), bArr[9], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[438], (short) 606, bArr[30], objArr2);
            int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], Long.TYPE).invoke(null, 0L)).intValue() + 561;
            Object[] objArr3 = new Object[1];
            a(bArr[365], (short) 394, bArr[9], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[172], (short) 627, bArr[116], objArr4);
            char cIntValue = (char) (((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 0)).intValue() + 49290);
            Object[] objArr5 = {0};
            Object[] objArr6 = new Object[1];
            a(bArr[438], (short) 644, bArr[9], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            byte b2 = bArr[8];
            byte b3 = b2;
            Object[] objArr7 = new Object[1];
            a(b3, (short) (b3 | 664), b2, objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, cIntValue, 154 - ((Integer) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).intValue(), objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(bArr[438], (short) 269, bArr[9], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(bArr[28], (short) 290, bArr[30], objArr10);
            String str2 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            a(bArr[438], (short) 304, bArr[301], objArr11);
            int iIntValue2 = ((Integer) cls4.getMethod(str2, Class.forName((String) objArr11[0]), Integer.TYPE).invoke(null, "", 0)).intValue() + 142;
            char c = 195;
            Object[] objArr12 = new Object[1];
            a(bArr[195], (short) 365, bArr[9], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a(bArr[246], (short) 381, bArr[30], objArr13);
            char cIntValue2 = (char) (61096 - ((Integer) cls5.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue());
            Object[] objArr14 = {'0'};
            Object[] objArr15 = new Object[1];
            a(bArr[183], (short) 668, bArr[9], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            byte b4 = bArr[30];
            Object[] objArr16 = new Object[1];
            a(b4, (short) 696, b4, objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue2, cIntValue2, '1' - ((Character) cls6.getMethod((String) objArr16[0], Character.TYPE).invoke(null, objArr14)).charValue(), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            byte b5 = bArr[116];
            int i = MediaBrowserCompatMediaItem;
            Object[] objArr19 = new Object[1];
            a(b5, (short) i, bArr[301], objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            byte b6 = bArr[136];
            Object[] objArr20 = new Object[1];
            a(b6, (short) (b6 | 216), bArr[365], objArr20);
            String str3 = (String) objArr20[0];
            Object[] objArr21 = new Object[1];
            a(bArr[116], (short) i, bArr[301], objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str, objArr18);
            int[] iArr = new int[objArr22.length];
            int i2 = 0;
            while (i2 < objArr22.length) {
                Object[] objArr23 = {objArr22[i2]};
                byte[] bArr2 = MediaBrowserCompatSearchResultReceiver;
                byte b7 = bArr2[c];
                Object[] objArr24 = new Object[1];
                a(b7, (short) (b7 | 208), bArr2[301], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                byte b8 = bArr2[46];
                Object[] objArr25 = new Object[1];
                a(b8, (short) (b8 | 234), bArr2[1136], objArr25);
                String str4 = (String) objArr25[0];
                Object[] objArr26 = new Object[1];
                a(bArr2[116], (short) MediaBrowserCompatMediaItem, bArr2[301], objArr26);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                byte b9 = bArr2[195];
                Object[] objArr27 = new Object[1];
                a(b9, (short) (b9 | 208), bArr2[301], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a(bArr2[5], (short) 244, bArr2[12], objArr28);
                iArr[i2] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i2++;
                c = 195;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int iRemoteActionCompatParcelizer = onformatresult.RemoteActionCompatParcelizer(iArr[i3]);
                i3 = 17;
                switch (iRemoteActionCompatParcelizer) {
                    case -20:
                        i3 = 42;
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        onformatresult.RemoteActionCompatParcelizer(23);
                        int i5 = onformatresult.read;
                        if (i5 != 0 && i5 == 1) {
                            i4 = 11;
                        } else {
                            i3 = 19;
                        }
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i3 = 1;
                        break;
                    case -17:
                        i3 = 41;
                        break;
                    case -16:
                        onformatresult.RemoteActionCompatParcelizer(17);
                        if (onformatresult.read == 0) {
                            i4 = 40;
                        }
                        break;
                    case -15:
                        i3 = 9;
                        break;
                    case -14:
                        i3 = 30;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        onformatresult.RemoteActionCompatParcelizer(17);
                        if (onformatresult.read == 0) {
                            i4 = 29;
                        }
                        break;
                    case -12:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(15);
                        AudioAttributesImplApi21Parcelizer = onformatresult.read;
                        break;
                    case -11:
                        onformatresult.AudioAttributesCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver;
                        onformatresult.RemoteActionCompatParcelizer(9);
                        break;
                    case -10:
                        i3 = 31;
                        break;
                    case -9:
                        onformatresult.RemoteActionCompatParcelizer(55);
                        return onformatresult.read != 0;
                    case -8:
                        break;
                    case -7:
                        i3 = 43;
                        break;
                    case -6:
                        i3 = 45;
                        break;
                    case -5:
                        onformatresult.RemoteActionCompatParcelizer(54);
                        i3 = onformatresult.read != 0 ? i4 : 8;
                        break;
                    case -4:
                        jLongValue = 600000;
                        onformatresult.IconCompatParcelizer = jLongValue;
                        onformatresult.RemoteActionCompatParcelizer(51);
                        break;
                    case -3:
                        jLongValue = AudioAttributesCompatParcelizer;
                        onformatresult.IconCompatParcelizer = jLongValue;
                        onformatresult.RemoteActionCompatParcelizer(51);
                        break;
                    case -2:
                        byte[] bArr3 = MediaBrowserCompatSearchResultReceiver;
                        Object[] objArr29 = new Object[1];
                        a(bArr3[116], (short) 704, bArr3[301], objArr29);
                        Class<?> cls10 = Class.forName((String) objArr29[0]);
                        byte b10 = bArr3[195];
                        Object[] objArr30 = new Object[1];
                        a(b10, (short) (b10 | 705), bArr3[136], objArr30);
                        jLongValue = ((Long) cls10.getMethod((String) objArr30[0], null).invoke(null, null)).longValue();
                        onformatresult.IconCompatParcelizer = jLongValue;
                        onformatresult.RemoteActionCompatParcelizer(51);
                        break;
                    case -1:
                        i3 = 13;
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x03fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0404  */
    @Override // o.isPendingReset.write
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSeekMap.AudioAttributesCompatParcelizer(int):void");
    }

    @Override // o.isPendingReset.write
    public final void RemoteActionCompatParcelizer() throws Throwable {
        onFormatResult onformatresult = new onFormatResult(this);
        try {
            int i = 0;
            byte[] bArr = MediaBrowserCompatSearchResultReceiver;
            byte b = bArr[170];
            Object[] objArr = new Object[1];
            a(b, (short) (b | 544), bArr[9], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[438], (short) 606, bArr[30], objArr2);
            int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], Long.TYPE).invoke(null, 0L)).intValue() + 2316;
            short s = (short) 644;
            Object[] objArr3 = new Object[1];
            a(bArr[438], s, bArr[9], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b2 = bArr[9];
            Object[] objArr4 = new Object[1];
            a(b2, (short) (b2 | 1007), bArr[247], objArr4);
            char cIntValue = (char) (52421 - ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 0)).intValue());
            Object[] objArr5 = {0};
            Object[] objArr6 = new Object[1];
            a(bArr[603], (short) 943, bArr[9], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr[246], (short) 1332, bArr[136], objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, cIntValue, (((Float) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 151, objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(bArr[902], (short) 1308, bArr[30], objArr10);
            int i2 = (((Long) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 141;
            Object[] objArr11 = new Object[1];
            a(bArr[183], (short) 668, bArr[9], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            byte b3 = bArr[30];
            Object[] objArr12 = new Object[1];
            a(b3, (short) 696, b3, objArr12);
            char cCharValue = (char) (((Character) cls5.getMethod((String) objArr12[0], Character.TYPE).invoke(null, '0')).charValue() + 61048);
            Object[] objArr13 = {0};
            Object[] objArr14 = new Object[1];
            a(bArr[438], s, bArr[9], objArr14);
            Class<?> cls6 = Class.forName((String) objArr14[0]);
            byte b4 = bArr[9];
            Object[] objArr15 = new Object[1];
            a(b4, (short) (b4 | 1007), bArr[247], objArr15);
            Object[] objArr16 = new Object[1];
            b(i2, cCharValue, ((Integer) cls6.getMethod((String) objArr15[0], Integer.TYPE).invoke(null, objArr13)).intValue() + 1, objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            char c = 't';
            byte b5 = bArr[116];
            int i3 = MediaBrowserCompatMediaItem;
            char c2 = 301;
            Object[] objArr18 = new Object[1];
            a(b5, (short) i3, bArr[301], objArr18);
            Class<?> cls7 = Class.forName((String) objArr18[0]);
            byte b6 = bArr[136];
            Object[] objArr19 = new Object[1];
            a(b6, (short) (b6 | 216), bArr[365], objArr19);
            String str2 = (String) objArr19[0];
            Object[] objArr20 = new Object[1];
            a(bArr[116], (short) i3, bArr[301], objArr20);
            Object[] objArr21 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr20[0])).invoke(str, objArr17);
            int[] iArr = new int[objArr21.length];
            int i4 = 0;
            while (i4 < objArr21.length) {
                Object[] objArr22 = {objArr21[i4]};
                byte[] bArr2 = MediaBrowserCompatSearchResultReceiver;
                byte b7 = bArr2[195];
                Object[] objArr23 = new Object[1];
                a(b7, (short) (b7 | 208), bArr2[c2], objArr23);
                Class<?> cls8 = Class.forName((String) objArr23[0]);
                byte b8 = bArr2[46];
                Object[] objArr24 = new Object[1];
                a(b8, (short) (b8 | 234), bArr2[1136], objArr24);
                String str3 = (String) objArr24[0];
                byte b9 = bArr2[c];
                short s2 = (short) MediaBrowserCompatMediaItem;
                byte b10 = bArr2[c2];
                Object[] objArr25 = new Object[1];
                a(b9, s2, b10, objArr25);
                Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                byte b11 = bArr2[195];
                Object[] objArr26 = new Object[1];
                a(b11, (short) (b11 | 208), bArr2[301], objArr26);
                Class<?> cls9 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a(bArr2[5], (short) 244, bArr2[12], objArr27);
                iArr[i4] = ((Integer) cls9.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
                i4++;
                c2 = 301;
                c = 't';
            }
            while (true) {
                int i5 = i + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (onformatresult.RemoteActionCompatParcelizer(iArr[i])) {
                    case -20:
                        i = 43;
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        onformatresult.RemoteActionCompatParcelizer(23);
                        int i6 = onformatresult.read;
                        if (i6 != 0 && i6 == 1) {
                            i5 = 34;
                        } else {
                            i = 1;
                        }
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        onformatresult.RemoteActionCompatParcelizer(7);
                        throw ((Throwable) onformatresult.AudioAttributesImplBaseParcelizer);
                    case -17:
                        i = 44;
                        break;
                    case -16:
                        i = 46;
                        break;
                    case -15:
                        onformatresult.RemoteActionCompatParcelizer(17);
                        if (onformatresult.read == 0) {
                            i5 = 32;
                        }
                        break;
                    case -14:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(15);
                        AudioAttributesImplApi21Parcelizer = onformatresult.read;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        onformatresult.AudioAttributesCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver;
                        try {
                            onformatresult.RemoteActionCompatParcelizer(9);
                        } catch (Throwable th2) {
                            th = th2;
                            if (i < 40 || i >= 43) {
                                throw th;
                            }
                            onformatresult.write = th;
                            onformatresult.RemoteActionCompatParcelizer(26);
                            i = 33;
                        }
                        break;
                    case -12:
                        i = 11;
                        break;
                    case -11:
                        i = 22;
                        break;
                    case -10:
                        onformatresult.RemoteActionCompatParcelizer(21);
                        i = onformatresult.read != 0 ? i5 : 21;
                        break;
                    case -9:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(15);
                        MediaBrowserCompatCustomActionResultReceiver = onformatresult.read;
                        break;
                    case -8:
                        onformatresult.AudioAttributesCompatParcelizer = AudioAttributesImplApi21Parcelizer;
                        onformatresult.RemoteActionCompatParcelizer(9);
                        break;
                    case -7:
                        return;
                    case -6:
                        i = 23;
                        break;
                    case -5:
                        i = 13;
                        break;
                    case -4:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(3);
                        bandwidthSample.RemoteActionCompatParcelizer(-829923494, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 829923496, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{(bandwidthSample) onformatresult.AudioAttributesImplBaseParcelizer}, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer());
                        break;
                    case -3:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(3);
                        bandwidthSample.RemoteActionCompatParcelizer(-453977428, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 453977428, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{(bandwidthSample) onformatresult.AudioAttributesImplBaseParcelizer}, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer());
                        break;
                    case -2:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(3);
                        onformatresult.write = ((setSeekMap) onformatresult.AudioAttributesImplBaseParcelizer).MediaBrowserCompatItemReceiver;
                        onformatresult.RemoteActionCompatParcelizer(4);
                        break;
                    case -1:
                        i = 8;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0348. Please report as an issue. */
    @Override // o.isPendingReset.write
    public final void RemoteActionCompatParcelizer(int i) throws Throwable {
        onFormatResult onformatresult = new onFormatResult(this, i);
        try {
            byte[] bArr = MediaBrowserCompatSearchResultReceiver;
            Object[] objArr = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr);
            int i2 = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[201], (short) 1094, bArr[30], objArr2);
            int iIntValue = (((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() >> 24) + 1932;
            short s = (short) 269;
            Object[] objArr3 = new Object[1];
            a(bArr[438], s, bArr[9], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b = bArr[46];
            Object[] objArr4 = new Object[1];
            a(b, (short) (b | 794), bArr[12], objArr4);
            String str = (String) objArr4[0];
            short s2 = (short) 304;
            Object[] objArr5 = new Object[1];
            a(bArr[438], s2, bArr[301], objArr5);
            char cIntValue = (char) (((Integer) cls2.getMethod(str, Class.forName((String) objArr5[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue() + 35591);
            Object[] objArr6 = {0};
            short s3 = (short) 644;
            Object[] objArr7 = new Object[1];
            a(bArr[438], s3, bArr[9], objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            byte b2 = bArr[8];
            byte b3 = b2;
            Object[] objArr8 = new Object[1];
            a(b3, (short) (b3 | 664), b2, objArr8);
            Object[] objArr9 = new Object[1];
            b(iIntValue, cIntValue, 102 - ((Integer) cls3.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).intValue(), objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr[195], (short) 981, bArr[30], objArr11);
            int iIntValue2 = (((Integer) cls4.getMethod((String) objArr11[0], null).invoke(null, null)).intValue() >> 16) + 142;
            Object[] objArr12 = new Object[1];
            a(bArr[438], s3, bArr[9], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            byte b4 = bArr[9];
            Object[] objArr13 = new Object[1];
            a(b4, (short) (b4 | 1119), bArr[247], objArr13);
            char cIntValue2 = (char) ((-16716120) - ((Integer) cls5.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0)).intValue());
            Object[] objArr14 = {"", '0', 0};
            Object[] objArr15 = new Object[1];
            a(bArr[438], s, bArr[9], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr[12], (short) 864, bArr[246], objArr16);
            String str3 = (String) objArr16[0];
            Object[] objArr17 = new Object[1];
            a(bArr[438], s2, bArr[301], objArr17);
            Object[] objArr18 = new Object[1];
            b(iIntValue2, cIntValue2, -((Integer) cls6.getMethod(str3, Class.forName((String) objArr17[0]), Character.TYPE, Integer.TYPE).invoke(null, objArr14)).intValue(), objArr18);
            Object[] objArr19 = {(String) objArr18[0]};
            char c = 't';
            byte b5 = bArr[116];
            int i3 = MediaBrowserCompatMediaItem;
            Object[] objArr20 = new Object[1];
            a(b5, (short) i3, bArr[301], objArr20);
            Class<?> cls7 = Class.forName((String) objArr20[0]);
            byte b6 = bArr[136];
            Object[] objArr21 = new Object[1];
            a(b6, (short) (b6 | 216), bArr[365], objArr21);
            String str4 = (String) objArr21[0];
            Object[] objArr22 = new Object[1];
            a(bArr[116], (short) i3, bArr[301], objArr22);
            Object[] objArr23 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr22[0])).invoke(str2, objArr19);
            int[] iArr = new int[objArr23.length];
            int i4 = 0;
            while (i4 < objArr23.length) {
                Object[] objArr24 = {objArr23[i4]};
                byte[] bArr2 = MediaBrowserCompatSearchResultReceiver;
                byte b7 = bArr2[195];
                Object[] objArr25 = new Object[1];
                a(b7, (short) (b7 | 208), bArr2[301], objArr25);
                Class<?> cls8 = Class.forName((String) objArr25[0]);
                byte b8 = bArr2[46];
                Object[] objArr26 = new Object[1];
                a(b8, (short) (b8 | 234), bArr2[1136], objArr26);
                String str5 = (String) objArr26[0];
                Object[] objArr27 = new Object[1];
                a(bArr2[c], (short) MediaBrowserCompatMediaItem, bArr2[301], objArr27);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr27[0])).invoke(null, objArr24);
                byte b9 = bArr2[195];
                Object[] objArr28 = new Object[1];
                a(b9, (short) (b9 | 208), bArr2[301], objArr28);
                Class<?> cls9 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                a(bArr2[5], (short) 244, bArr2[12], objArr29);
                iArr[i4] = ((Integer) cls9.getMethod((String) objArr29[0], null).invoke(objInvoke, null)).intValue();
                i4++;
                c = 't';
            }
            while (true) {
                int i5 = i2 + 1;
                switch (onformatresult.RemoteActionCompatParcelizer(iArr[i2])) {
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i2 = 1;
                        break;
                    case -12:
                        i2 = 32;
                        break;
                    case -11:
                        onformatresult.RemoteActionCompatParcelizer(21);
                        if (onformatresult.read == 0) {
                            i5 = 31;
                        }
                        i2 = i5;
                        break;
                    case -10:
                        i2 = 8;
                        break;
                    case -9:
                        i2 = 20;
                        break;
                    case -8:
                        onformatresult.RemoteActionCompatParcelizer(21);
                        if (onformatresult.read == 0) {
                            i5 = 19;
                        }
                        i2 = i5;
                        break;
                    case -7:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(15);
                        MediaBrowserCompatCustomActionResultReceiver = onformatresult.read;
                        i2 = i5;
                        break;
                    case -6:
                        onformatresult.AudioAttributesCompatParcelizer = AudioAttributesImplApi21Parcelizer;
                        onformatresult.RemoteActionCompatParcelizer(9);
                        i2 = i5;
                        break;
                    case -5:
                        break;
                    case -4:
                        i2 = 21;
                        break;
                    case -3:
                        i2 = 10;
                        break;
                    case -2:
                        onformatresult.AudioAttributesCompatParcelizer = 2;
                        onformatresult.RemoteActionCompatParcelizer(2);
                        onformatresult.RemoteActionCompatParcelizer(3);
                        setSeekMap setseekmap = (setSeekMap) onformatresult.AudioAttributesImplBaseParcelizer;
                        onformatresult.RemoteActionCompatParcelizer(15);
                        setseekmap.IconCompatParcelizer(onformatresult.read);
                        i2 = i5;
                        break;
                    case -1:
                        i2 = 5;
                        break;
                    default:
                        i2 = i5;
                        break;
                }
                return;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getDisplayCues
    public final void read() throws Throwable {
        onFormatResult onformatresult = new onFormatResult(this);
        try {
            int i = 0;
            byte[] bArr = MediaBrowserCompatSearchResultReceiver;
            Object[] objArr = new Object[1];
            a(bArr[365], (short) 394, bArr[9], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[172], (short) 627, bArr[116], objArr2);
            int iIntValue = 1610 - ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr3 = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[365], bArr[35], bArr[30], objArr4);
            char cIntValue = (char) ((((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16) + 12282);
            Object[] objArr5 = {0, 0};
            Object[] objArr6 = new Object[1];
            a(bArr[195], (short) 365, bArr[9], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr[246], (short) 381, bArr[30], objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, cIntValue, 71 - ((Integer) cls3.getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr5)).intValue(), objArr8);
            String str = (String) objArr8[0];
            short s = (short) 644;
            Object[] objArr9 = new Object[1];
            a(bArr[438], s, bArr[9], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            byte b = bArr[8];
            Object[] objArr10 = new Object[1];
            a(b, (short) (b | 860), bArr[9], objArr10);
            int iIntValue2 = 142 - ((Integer) cls4.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0, 0)).intValue();
            byte b2 = bArr[170];
            Object[] objArr11 = new Object[1];
            a(b2, (short) (b2 | 544), bArr[9], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a(bArr[902], (short) 1070, bArr[30], objArr12);
            char c = (char) (61096 - (((Long) cls5.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, 0)).longValue() > 0L ? 1 : (((Long) cls5.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, 0)).longValue() == 0L ? 0 : -1)));
            Object[] objArr13 = {0};
            Object[] objArr14 = new Object[1];
            a(bArr[438], s, bArr[9], objArr14);
            Class<?> cls6 = Class.forName((String) objArr14[0]);
            byte b3 = bArr[8];
            byte b4 = b3;
            Object[] objArr15 = new Object[1];
            a(b4, (short) (b4 | 664), b3, objArr15);
            Object[] objArr16 = new Object[1];
            b(iIntValue2, c, 1 - ((Integer) cls6.getMethod((String) objArr15[0], Integer.TYPE).invoke(null, objArr13)).intValue(), objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            byte b5 = bArr[116];
            int i2 = MediaBrowserCompatMediaItem;
            char c2 = 301;
            Object[] objArr18 = new Object[1];
            a(b5, (short) i2, bArr[301], objArr18);
            Class<?> cls7 = Class.forName((String) objArr18[0]);
            byte b6 = bArr[136];
            Object[] objArr19 = new Object[1];
            a(b6, (short) (b6 | 216), bArr[365], objArr19);
            String str2 = (String) objArr19[0];
            Object[] objArr20 = new Object[1];
            a(bArr[116], (short) i2, bArr[301], objArr20);
            Object[] objArr21 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr20[0])).invoke(str, objArr17);
            int[] iArr = new int[objArr21.length];
            int i3 = 0;
            while (i3 < objArr21.length) {
                Object[] objArr22 = {objArr21[i3]};
                byte[] bArr2 = MediaBrowserCompatSearchResultReceiver;
                byte b7 = bArr2[195];
                Object[] objArr23 = new Object[1];
                a(b7, (short) (b7 | 208), bArr2[c2], objArr23);
                Class<?> cls8 = Class.forName((String) objArr23[0]);
                byte b8 = bArr2[46];
                Object[] objArr24 = new Object[1];
                a(b8, (short) (b8 | 234), bArr2[1136], objArr24);
                String str3 = (String) objArr24[0];
                byte b9 = bArr2[116];
                short s2 = (short) MediaBrowserCompatMediaItem;
                byte b10 = bArr2[c2];
                Object[] objArr25 = new Object[1];
                a(b9, s2, b10, objArr25);
                Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                byte b11 = bArr2[195];
                Object[] objArr26 = new Object[1];
                a(b11, (short) (b11 | 208), bArr2[301], objArr26);
                Class<?> cls9 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a(bArr2[5], (short) 244, bArr2[12], objArr27);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c2 = 301;
            }
            while (true) {
                int i4 = i + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (onformatresult.RemoteActionCompatParcelizer(iArr[i])) {
                    case -12:
                        i = 19;
                        break;
                    case -11:
                        onformatresult.RemoteActionCompatParcelizer(23);
                        int i5 = onformatresult.read;
                        i = (i5 != 0 && i5 == 1) ? 5 : 16;
                        break;
                    case -10:
                        onformatresult.RemoteActionCompatParcelizer(7);
                        throw ((Throwable) onformatresult.AudioAttributesImplBaseParcelizer);
                    case -9:
                        i = 20;
                        break;
                    case -8:
                        i = 22;
                        break;
                    case -7:
                        onformatresult.RemoteActionCompatParcelizer(17);
                        if (onformatresult.read == 0) {
                            i4 = 14;
                        }
                        i = i4;
                        break;
                    case -6:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        try {
                            onformatresult.RemoteActionCompatParcelizer(2);
                            onformatresult.RemoteActionCompatParcelizer(15);
                            AudioAttributesImplApi21Parcelizer = onformatresult.read;
                            i = i4;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i >= 17) {
                            }
                            throw th;
                        }
                        break;
                    case -5:
                        onformatresult.AudioAttributesCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver;
                        try {
                            onformatresult.RemoteActionCompatParcelizer(9);
                            i = i4;
                        } catch (Throwable th3) {
                            th = th3;
                            if (i >= 17 || i >= 19) {
                                throw th;
                            }
                            onformatresult.write = th;
                            onformatresult.RemoteActionCompatParcelizer(26);
                            i = 15;
                        }
                        break;
                    case -4:
                        return;
                    case -3:
                        i = 1;
                        break;
                    case -2:
                        i = 7;
                        break;
                    case -1:
                        i = 2;
                        break;
                    default:
                        i = i4;
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    @Override // o.isPendingReset.write
    public final void read(int i) throws Throwable {
        onFormatResult onformatresult = new onFormatResult(this, i);
        try {
            byte[] bArr = MediaBrowserCompatSearchResultReceiver;
            Object[] objArr = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr);
            int i2 = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b = bArr[0];
            Object[] objArr2 = new Object[1];
            a(b, (short) (b | 1185), bArr[30], objArr2);
            int iIntValue = 2174 - (((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr3 = new Object[1];
            a(bArr[438], (short) 325, bArr[9], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[247], (short) 346, bArr[46], objArr4);
            char c = (char) ((((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 61251);
            Object[] objArr5 = new Object[1];
            a(bArr[1136], (short) 1219, bArr[9], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr[246], (short) 1242, bArr[9], objArr6);
            String str = (String) objArr6[0];
            byte b2 = bArr[116];
            int i3 = MediaBrowserCompatMediaItem;
            Object[] objArr7 = new Object[1];
            a(b2, (short) i3, bArr[301], objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, c, 89 - ((Integer) cls3.getMethod(str, Class.forName((String) objArr7[0])).invoke(null, "")).intValue(), objArr8);
            String str2 = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(bArr[438], (short) 269, bArr[9], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            byte b3 = bArr[46];
            Object[] objArr10 = new Object[1];
            a(b3, (short) (b3 | 794), bArr[12], objArr10);
            String str3 = (String) objArr10[0];
            short s = (short) 304;
            Object[] objArr11 = new Object[1];
            a(bArr[438], s, bArr[301], objArr11);
            Object[] objArr12 = new Object[1];
            a(bArr[438], s, bArr[301], objArr12);
            int iIntValue2 = 142 - ((Integer) cls4.getMethod(str3, Class.forName((String) objArr11[0]), Class.forName((String) objArr12[0]), Integer.TYPE).invoke(null, "", "", 0)).intValue();
            Object[] objArr13 = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr13);
            Class<?> cls5 = Class.forName((String) objArr13[0]);
            byte b4 = bArr[0];
            Object[] objArr14 = new Object[1];
            a(b4, (short) (b4 | 1185), bArr[30], objArr14);
            char cIntValue = (char) ((((Integer) cls5.getMethod((String) objArr14[0], null).invoke(null, null)).intValue() >> 16) + 61096);
            Object[] objArr15 = new Object[1];
            a(bArr[156], bArr[13], bArr[9], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr[134], (short) 1255, bArr[30], objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue2, cIntValue, 1 - (((Integer) cls6.getMethod((String) objArr16[0], null).invoke(null, null)).intValue() >> 16), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            Object[] objArr19 = new Object[1];
            a(bArr[116], (short) i3, bArr[301], objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            byte b5 = bArr[136];
            Object[] objArr20 = new Object[1];
            a(b5, (short) (b5 | 216), bArr[365], objArr20);
            String str4 = (String) objArr20[0];
            Object[] objArr21 = new Object[1];
            a(bArr[116], (short) i3, bArr[301], objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
            int[] iArr = new int[objArr22.length];
            for (int i4 = 0; i4 < objArr22.length; i4++) {
                Object[] objArr23 = {objArr22[i4]};
                byte[] bArr2 = MediaBrowserCompatSearchResultReceiver;
                byte b6 = bArr2[195];
                Object[] objArr24 = new Object[1];
                a(b6, (short) (b6 | 208), bArr2[301], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                byte b7 = bArr2[46];
                Object[] objArr25 = new Object[1];
                a(b7, (short) (b7 | 234), bArr2[1136], objArr25);
                String str5 = (String) objArr25[0];
                Object[] objArr26 = new Object[1];
                a(bArr2[116], (short) MediaBrowserCompatMediaItem, bArr2[301], objArr26);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                byte b8 = bArr2[195];
                Object[] objArr27 = new Object[1];
                a(b8, (short) (b8 | 208), bArr2[301], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a(bArr2[5], (short) 244, bArr2[12], objArr28);
                iArr[i4] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
            }
            while (true) {
                int i5 = i2 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (onformatresult.RemoteActionCompatParcelizer(iArr[i2])) {
                    case -12:
                        i2 = 25;
                        break;
                    case -11:
                        onformatresult.RemoteActionCompatParcelizer(23);
                        int i6 = onformatresult.read;
                        i2 = (i6 == 0 || i6 != 1) ? 21 : 7;
                        break;
                    case -10:
                        onformatresult.RemoteActionCompatParcelizer(7);
                        throw ((Throwable) onformatresult.AudioAttributesImplBaseParcelizer);
                    case -9:
                        i2 = 26;
                        break;
                    case -8:
                        i2 = 28;
                        break;
                    case -7:
                        onformatresult.RemoteActionCompatParcelizer(21);
                        if (onformatresult.read == 0) {
                            i5 = 19;
                        }
                        i2 = i5;
                        break;
                    case -6:
                        onformatresult.AudioAttributesCompatParcelizer = 1;
                        try {
                            onformatresult.RemoteActionCompatParcelizer(2);
                            onformatresult.RemoteActionCompatParcelizer(15);
                            MediaBrowserCompatCustomActionResultReceiver = onformatresult.read;
                            i2 = i5;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i2 >= 22 || i2 >= 25) {
                                throw th;
                            }
                            onformatresult.write = th;
                            onformatresult.RemoteActionCompatParcelizer(26);
                            i2 = 20;
                        }
                        break;
                    case -5:
                        onformatresult.AudioAttributesCompatParcelizer = AudioAttributesImplApi21Parcelizer;
                        try {
                            onformatresult.RemoteActionCompatParcelizer(9);
                            i2 = i5;
                        } catch (Throwable th3) {
                            th = th3;
                            if (i2 >= 22) {
                            }
                            throw th;
                        }
                        break;
                    case -4:
                        return;
                    case -3:
                        i2 = 1;
                        break;
                    case -2:
                        i2 = 9;
                        break;
                    case -1:
                        i2 = 2;
                        break;
                    default:
                        i2 = i5;
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    @setSdkPayload
    public setSeekMap(isPendingReset.IconCompatParcelizer iconCompatParcelizer, getNextChunkIndex getnextchunkindex, bandwidthSample bandwidthsample) {
        this.RemoteActionCompatParcelizer = getnextchunkindex;
        this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = bandwidthsample;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i3 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(AudioAttributesImplBaseParcelizer[i + i3])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Drawable.resolveOpacity(0, 0) + 2340, 28 - (ViewConfiguration.getScrollBarSize() >> 8), 480654850, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i3), Long.valueOf(MediaMetadataCompat), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.getGidForName("") + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 9701, TextUtils.getOffsetBefore("", 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 23785 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 33 - Color.argb(0, 0, 0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 23784 - KeyEvent.normalizeMetaState(0), ((Process.getThreadPriority(0) + 20) >> 6) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public static /* synthetic */ getShowPopup read(setSeekMap setseekmap) {
        int iAudioAttributesCompatParcelizer = SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer();
        return (getShowPopup) RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer, 1747616779, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), new Object[]{setseekmap}, -1747616778, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2);
    }

    @Override // o.isPendingReset.write
    public final void IconCompatParcelizer() {
        int iAudioAttributesCompatParcelizer = SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer, -1192856289, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), new Object[]{this}, 1192856291, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2);
    }

    @Override // o.isPendingReset.write
    public final void write(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        RemoteActionCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), -1183921712, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), objArr, 1183921712, SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer(), SimpleBasePlayerExternalSyntheticLambda26.AudioAttributesCompatParcelizer());
    }

    static {
        byte[] bArr = new byte[1350];
        System.arraycopy("\u0010\u009bäÉî\u0005íþ\u0001\u00001³\bÿéDÓèÿé/Ïü\u0003øýíþ\fè\u0006õüýì\u001cëìþþû#Úú\u0000ç\u0004ó+Úô\u0006ãýì\u001cëìþþû%Üê'àøú\u001cÊþ\fè\u0006õüýì\u001cëìþþû!Ï\u0004\u0001ê\u0006õüî\u0005íþ\u0001\u00001³\bÿéDÓèÿéNÒãÿéùþ\b\rÞ\u0006ýýì\"Ù\u0006úî\u0005íþ\u0001\u00001µ\nô\u0002ð\u0003ôüðFÆúò\u0007.æÚò\u0007\u0019Ùôû\u001bØ\u0007ýè\u0006õüïüó\fîù\u001e×\u000fêù\u001céý\nà&Úý\u001aÚùð\bûíýì+Ðõ\u000eñ\u0002\fîì\u0017æ÷\u0003ñõü\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002þÿþð\u0004æ\u0010.½\u0006î\u00024àÖõ\nùýî\u0010ðò\u000b\u0011äöõ\u0019ððò\u000b\u0004æ\u0010.½\u0006î\u00024äÈ\u0010ùð÷\u0006õüî\u0005íþ\u0001\u00001µ\nèÿAÕêèÿ\u001aÜ\u0006øôýì äûî\tì-Øúòø\b\u0004æ\u0010.½\u0006î\u00024æÖ\u0002ê\u001aéï÷\u000bò\u0006ùî\u0005íþ\u0001\u00001º÷@ÖÕ\u0001ú\nó%Òø\u0007óô\u0006ìø\tü\rèÿðó\u0006÷\u0003\u0012èîú÷î\u0005íþ\u0001\u00001³\bÿéDÓèÿéýì+Úú\u0000ç\u0004ó\u001cåê\u0010î\u0005íþ\u0001\u00001³\bÿéDÞáç/Ê\fòõýì\"Ù\u0006öþøÿî ãì\u000e\tÚ\u000eè\n\u0013çé\u0003\u0004æ\u0010.´ü\u0006ø9èÊû\fã(Þñú\u0004æ\u0010.´ü\u0006ø9èÚêúý\fùê,Ïþû\u0002ýê\u0006õüøû\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýê\u0004æ\u0010.´ü\u0006ø9Ø×\u000bë\u000bð\nî\fè\u0000ø\u0004æ\u0010.´ü\u0006ø9àÐ\nî\fè\u0000ø\u0002é äèÿ\u0004èÿ\u0004æ\u0010.½\u0006î\u00024ÛÔ\u0003\u0006øî\u0004æ\u0010.´ü\u0006ø9ÝÞñúî\u0005íþ\u0001\u00001²\t\u0000øýìAäÈ\u0003\nî\u0005þúñ\u0002\u0014Þñú\u0019èÿéýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü\"Ðþõ\u0000úø\u0000\u0007ðþê\u0010\u0013ãì\u000e\tÚ\u000eè\nî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@æÏþøøñò\u000bî\u0005íþ\u0001\u00001µ\nèÿAèÎ\u0005íþ\u0001\u0000\u001cÖ\u0002ê\fùê\nîýì\"ßòûþø\u0004æ\u0010.½\u0006î\u00024ÖÕ\u0001ú\nóéþû\bòõ\u001bæ÷\u0003\u0013ßøûþñýì äûî\tì.Öí\nîýì\"çä\n÷ó\u0003\"Õþö\u0002\fìôø\u0007õðöýì$áç\"èð\u0006ÿè\u001bæ÷\u0003ñõüýì*Üøý\râøúö\u0005úè$äñ)Óø÷öýì\u001fÙ\bíû\tü\fÚ\u000eè\n\u001cÊþ\fè\u0006õüî\u0005íþ\u0001\u00001º÷@ÙÙþ\u0007ùíûýì(Ù\u0000\u0019Òø\u001fèï\u0003ê\u0006\u0000\u0006éú&Ö\u0005úè$ä\bóùô\fî\u0005íþ\u0001\u00001¼\u0003üö\u0003.èÇ\föõ\u0016Ý\fùóýì\"ßö\u0013âþò\u0003\u0003\u0007ñ\u0001\u0013ãÿéùþ\b\rÞ\u0006ýýì\u001cåê\u0010ýì+Úÿø\u001cÖ\u0002êî\u0005íþ\u0001\u00001´ü\u0006ø9ÕÖ\u0004\u0006ü\tððò\u000bïýøÿ\u0002è\u001fà$Ï\fùê\u0006õüýì$áç\"èð\u0006ÿè+Úô\u0006ã\bíÿþñ\f\råê\u0010\büýì\u001bàõ\rö\u0010âøúýì\u001bçñ\bÿø\u000fÙ\u0004õø\u0004ðöð÷\u0003\u0002\u0004æ\u0010.½\u0006î\u00024àØû\u0002ù\u0001ð\u0014Ú\u000eè\n\u001bÈ\u0010ùð÷\u0006õüýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü#Òø&Ðþõ\u0000ýì\"çä\n÷ó\u0003$Í\få\tö\u0002\u001fÝùöþ\råê\u0010\u0006\u0000\u0001ç1Ï\u0006ú\u001aÏþý\u0015Úý\u0004ö\u0002\u0000÷\u0006÷\u0003\u0013ßøûþñýì\u0018éö\u0005ðó\u001eàõ\rö\u0010âøúýì\u0015æûý%Ïüõýþþô\u001aæ÷\u0003ñõüýì\u001cëìþþû%Üê\u001aåê\u0010ýì)àøöö\u0002\u001dÜøý\u0014âò\u0002î\u0007î\u0005íþ\u0001\u00001³\bÿéDÜÙö\u0006õü$Ê\fòõä\nñ(Ïþý\u0015Úý\u0004ö\u0002ýì\u001bîì\u0017æ÷\u0003ñõüî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@à×\u0007õý\u001aÒø\u0000\u0007èýì-Ôðü\u001eæî\u001dâì\u000eôýì(Öø\büð&Ùê\u0006õü\u001eáç æ÷\u0003ñõüïýøÿ\u0002è\u001fà$Õø\tè".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 1350);
        MediaBrowserCompatSearchResultReceiver = bArr;
        MediaBrowserCompatMediaItem = 203;
        AudioAttributesCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver = 0;
        AudioAttributesImplApi21Parcelizer = 1;
    }

    static void AudioAttributesCompatParcelizer() {
        char[] cArr = new char[2467];
        ByteBuffer.wrap("Ü!íÓ¿üI÷\u001b\u0098%\u0087÷ª\u0081¢SQ\u001da/lù\u0003\u008b\bU,g$0ÓÂØ\u008cî^\u0088h\u008a:¹Ä¿\u0096T Crj<\u001eÎ\u0011\u0098&ª({Ë\u0005Ù×òáý³\u0090}¼\u000f·ÙGëFµiGz\u0011\u0010#?í7¾ÚHÕ\u001aì$äö\u0093\u0080\u0094R®\u001c]._øx\u008agT\tf\u001e00Áß\u0093Ñ]æoè9\u0097Ë\u0099\u0095¯§ qS\u0003hÍj\u009f\u0005©\u0013{4\u0005?ÖÈàþ²í|\u0087\u000e\u0096Ø¶êº´NF@\u0010s\"\u0004ì\n¾9H;\u0019Ë+Âõñ\u0087\u0083Q\u0094cº-©ÿK\u0089][rea7\u0013Á&\u0093*\\ÅnÆ8õÊü\u0094\u0090¦ p²\u0002ZÌI\u009ek¨\u007fz\u0012\u0004\u001aÖ.çÝ±ÕCø\rçß\u0089é\u0096»°E@\u0017T!zói½\u000bO\u0011\u00192+>ô×\u0086üPëb\u0085,\u0093þ´\u0088£ZMdd6lÀ\u001b\u0092\u0015\\,2\u0088Uéd\u001b64À#\u0092N¬N~b\bqÚ\u0098\u0094¨¦½pÒ\u0002ÞÜêîì¹\u001bK\u0017\u0005&×JáW³pMq\u001f\u0080)\u008aû¹µÎGÄ\u0011ó#ùò\u001e\u008c\r^ h(:Yôj\u0086bP\u0091b\u0095<¼Î«\u0098Ìªödå7\u0007Á\u0000\u0093!\u00ad3\u007fZ\tWÛ~\u0095\u0094§\u009dq©\u0003®ÝÃïÐ¹øH\u0017\u001a\u0019Ô.æ °_BQ\u001cg.hø\u009c\u008a´D£\u0016Í Ðòü\u008c÷_\u0018i7;9õM\u0087@Qacw=\u009aÏ\u0089\u0099»«ÈeÂ7ñÁó\u0090\u0004¢\n|\"\u000eVØEêo¤~v\u009e\u0000\u0093Ò®ì¨¾ÇHé\u001aûÕ\u0010ç\u0011±#C*\u001dY/kù~\u008b\u0092E\u009f\u0017«!¬óÛ\u008dÕ_ýn\u00148\u001dÊ(\u0084.V]`W2lÌ\u0096\u009e\u0085¨¯zµ4ÞÆÍ\u0090ä¢ô}\u0006\u000f5Ù<ëM¥Nwc\u0001rÓ\u0098í·¿ºIÌ\u001bÀÕÿçò¶\u0005@\b\u00128,OþB\u0088mZn\u0014\u0083&\u0095ð¸\u0082×\\Únê8àË\u001f\u0085\u0012W#a(3[Ít\u009fc©\u008e{\u00945¼Çµ\u0091Ç£ö}å\f\fÞ\u001bè>º6tZ\u0006IÐxâ\u0080¼\u0082N±\u0018°*ÉäÊ¶áA\u0016\u0013\u001e-2ÿ!\u0089A[P\u0015z'vñ\u009a\u0083´]¼oÌ9ÎËá\u0085òT\u0018f,0$ÂS\u009c_®~xt\n\u0086Ä\u0088\u0096» ÌrÂ\fêÞîé\u001d»\u0015u%\u0007VÑZãn½`O\u0080\u0019\u0090+ºåµ·ÞAô\u0013ø\"\u0010ü\u000f\u008e#X7jX$wö{\u0080\u008cR\u0080l¦>±ÈÚ\u009aÕTûg\u00141\u001aÃ.\u009d.¯AyR\u000bxÅ\u0097\u0097\u009b¡\u00ads \rÀßÐéú»õJ\u001e\u00044Ö#àO²VL|\u001ek(\u0087ú¯´¤FÓ\u0010ß\"äüì\u008f\u0002Y\u0014k&%L÷]\u0081pStm\u009c?\u008bÉ§\u009bÖUÅgí1ûÀ\u001e\u0092\u0014¬\"~(\b[Új\u0094b¦\u0088p\u0097\u0002¼Ü«îÇ¸âJä\u0005\u000f×\u001aá>³-ME\u001f])fû\u0095µ\u009aG¬\u0011®#ÝýÒ\u008få^\u0016h\u0005:*ô=\u0086^PMbe<vÎ\u0086\u0098¬ª¸dÐ6ÓÀá\u0092ê\u00ad\u0005\u007f(\t$ÛJ\u0095Y§~qm\u0003\u0085Ý\u0097ï¦¹ÉKØ\u0005ð×ïæ\u0004°\u0014B8\u001cW.\\øm\u008a`D\u009f\u0016\u0094 ¢ò¨\u008cÇ^ìhú;\u0010õ\u000f\u0087$Q3cX=nÏ\u007f\u0099\u0092«\u0081e¦7¶ÁÚ\u0093Ð\u00adò|\u0014\u000e\u0003Ø(ê4¤\\vK\u0000`Ò\u008dì\u0084¾ªHµ\u001aÞÔÍæâ°üC\u0006\u001d-/>ùP\u008bOEd\u0017~!\u0098ó·\u008d¼_ÇiÀ;àõô\u0084\u001aV\t`?2HÌB\u009en¨wz\u009c4\u008bÆ¡\u0090Ê¢Ä|ó\u000eùÙ\u0003ë\f¥;w1\u0001[\u001c«-Y\u007fv\u0089aÛ\få\f7?A7\u0093ÚÝõïþ9\u0090K\u009b\u0095¢§®ðA\u0002ULd\u009e\u0017¨\u0019ú2\u0004-VÄ`È²ûü\u008f\u000e\u0086X®jº»\\ÅO\u0017l!js\u001a½/Ï \u0019Ó+Ùuþ\u0087ðÑ\u0086ã´-»~H\u0088BÚfän6\u0019@\u0017\u00928ÜÖîÔ8òJí\u0094\u008b¦\u0088ð»\u0001IS[\u009dp¯{ù\u0006\u000b\u000eU%g7±ÄÃë\rþ_\u0092i\u0091»¡Å¨\u0016G lrf¼\u0011Î\u001f\u0018\"*.tÅ\u0086ÐÐäâ\u0097,\u009d~\u00ad\u0088¬Ù_ëU5bG\u0014\u0091\u0007£-í;?ÜIÏ\u009bå¥ó÷\u0084\u0001·S½\u009cO®Løg\nsT\u001af)°9ÂÐ\fß^ähîº\u0099Ä\u0097\u0016º'Vq^\u0083nÍl\u001f\u0003)\u0010{:\u0085Õ×Ûáê3â}\u009d\u008f\u0093Ù£ëª4EFk\u0090t¢\u0012ì\r>#H<\u009aÚ¤õöû\u0000\u0085R\u0082\u009c¢®¶ÿX\tK[ze\n·\u0000Á,\u00135]ÞoÉ¹äË\u0088Ü!íÓ¿üI÷\u001b\u0098%\u0087÷ª\u0081¢SQ\u001da/lù\u001b\u008b\u0010U6g%0ËÂÀ\u008cï^\u0086h\u008a:¥Ä¦\u0096U Yrp<\u001fÎ\u0018\u0098:ª){Ã\u0005Ä×óáý³\u0092}¼\u000f«ÙEë[µtG\u007f\u0011\u0010#?í1¾ÄHÈ\u001a÷$ùö\u008d\u0080\u0080R¯\u001cA.Røx\u008agT\tf\u001b00Áß\u0093Ñ]àoè9\u008eË\u0098\u0095²§½qV\u0003|Íp\u009f\u0018©\u0007{)\u00059ÖÐàê²ì|\u009b\u000e\u0095Ø¢ê¤´LF\\\u0010n\"\u0002ì\u0016¾8H?\u0019À+Âõñ\u0087\u0083Q\u0099cº-©ÿH\u0089X[rey7\u001bÁ<\u00937\\ÍnÆ8éÊú\u0094\u0090¦¿p²\u0002GÌH\u009ek¨~z\u0012\u0004\u0001Ö0çÂ±ÊCù\røß\u008bé\u0082»±E@\u0017T!zói½\bO\u001d\u00192+=ôÎ\u0086ýP÷b\u0086,\u0086þµ\u0088¿ZOd~6rÀ\u0004\u0092\b\\,n8?ÒÉÁ\u009bó¥\u0084w\u008a\u0001¹Ó¸\u009dN¯Byj\u000b\u0003Õ\fç'±5BÖ\fÙÞìèàº\u0096D¥\u0016ª YòX¼oNb\u0018\u000e*\"ô,\u0085ÇWÐaö3åý\u008c\u008f\u0094Y®k]5TÇm\u0091f£\u0015m\u001d?,ÈÞ\u009aÍ¤ävñ\u0000\u0096Ò\u0099\u009c²®¡xU\n|Ôkæ\f°\u0006B.\f<ÝÐïä¹óK\u009a\u0015\u0092'¶ñ¥\u0083MM]\u001fn)\u001dû\u0015\u0085&W&`Õ2Ýüï\u008e\u009eX\u008dj¥4°ÆV\u0090^¢jl`>\u000fÈ#\u009a3«ØuÜ\u0007íÑâã\u0091\u00ad¡\u007fµ\tZÛIåi·~A\u0012\u0013\u001aÝ4îÜ¸ËJç\u0014ý&\u0094ð\u0098\u0082«L^\u001eM(eús\u0084\u0016V\u0005`-24ÃÎ\u008dâ_òi\u0098;\u0087Å«\u0097·¡Ps`=uÏ\u001a\u0099\t«)u1¤P\u0095¢Ç\u008d1\u0086cé]ö\u008fÛùÓ+ e\u0010W\u001d\u0081jóa-G\u001fTHºº±ô\u009e&÷\u0010ûBÔ¼×î$Ø(\n\u0001Dn¶iàKÒX\u0003²}µ¯\u009e\u0099\u0091Ëþ\u0005ÐwÇ¡)\u0093-Í\u0011?\u0013i`[R\u0095@Æ«0¸b\u009a\\\u008b\u008eãøë*Êd-V!\u0080\u001dò\u0017,d\u001enH^¹¯ë¼%\u0096\u0017\u0081Aç³ôíÞßÈ\t?{\u0010µ\u001bçhÑj\u0003_}S® \u0098\u0092Ê\u0086\u0004ëvø Ò\u0092ÕÌ=>-h\u001fZs\u0094gÆI0Na±S³\u008d\u0080ÿò)é\u001bËUÇ\u0087;ñ5#\u0018\u001d\fO\u007f¹LëF$°\u0016·@\u0084²\u008eìôÞÏ\bÆz5´9æ\u001fÐ\f\u0002c|p®A\u009f±É»;\u0094u\u008d§å\u0091òÃß=2o=Y\n\u008b\u0007Åy7uaBSO\u008c þ\u008d(\u009a\u001a÷Tï\u0086ÅðÎ\"!\u001c\u000eN\u0000¸qêy$\\\u0016JG£±«ã\u009fÝì\u000fæyÒ«×å$×-\u0001\u0018so\u00adf\u009fSÉY:ºtª¦\u0083\u0090\u008cÂç<ÍnÚX7\u008a-Ä\u00056\u000e`{RO\u008c\\ýµ/¢\u0019\u0087K\u0094\u0085ý÷å!ß\u0013,M%¿\u001cé\u0017Ûd\u0015mGY°¯â Ü\u008b\u000e\u0098xùªõäÂÖÎ\u0000?r\u0013¬\u0005\u009eiÈv:ZtO¥¡\u0097\u0095Á\u009d3êmæ_Ú\u0089Õû\"5.g\u0001Qm\u0083zýV/H\u0018¥J²\u0084\u009eö÷ ý\u0012ÕLÀ¾'è4Ú\u001c\u0014\bF\u007f°SâCÓ©\r¶\u007f\u009a©\u008a\u009báÕÎ\u0007Âq1£9\u009d\u0019Ï\f9ckp¥@\u0096¶À»2\u0097l\u008f^å\u0088òúÞ44\u00914 Æòé\u0004âV\u008dh\u0092º¿Ì·\u001eDPtby´\u0012Æ\u001d\u0018\"*/}Ç\u008fÈÁû\u0013\u0088%\u0087w\u00ad\u0089²ÛXíW?dq\u0011\u0083\u0019Õ1ç!6ÃHÏ\u009aû¬õþ\u00820½B¿\u0094L¦Høa\nc\\\u0005n* -óÏ\u0005ÜWöiñ»\u009cÍ\u008c\u001f»QTcJµmÇn\u0019\u0019+\u0017}$\u008cÖÞÅ\u0010ï\"ãt\u009f\u0086\u0091Øºê\u00ad<[Nh\u0080bÒ\u0010ä\u00136 H*\u009bÛ\u00adëÿø1\u0092C\u0082\u0095£§°ùZ\u000bJÜ!íÓ¿üIð\u001b\u008c%\u0086÷ª\u0081ºSP\u001d\u007f/rù\u001a\u008b\tU)g$0ÓÂØ\u008cî^\u009dh\u0093:¸Ä»\u0096T Crj<\u001eÎ\r\u0098!ª({×\u0005Ð×òáþ³\u0092}¼\u000f±ÙEëFµuGw\u0011\u0010#*í,¾ÛHÜ\u001aö$åö\u008f\u0080\u009cR®\u001cG.Qøx\u008a{T\nf\u00020(ÁÇ\u0093Ì]ûoõ9\u008bË\u0084\u0095¬§¼qN\u0003aÍr\u009f\u0018©\u0007{)\u0005<ÖÐàÿ²ñ|\u0085\u000e\u0088Ø·ê¹´JF@\u0010t\"\bì\n¾&H>\u0019Ô+Ãõí\u0087\u0087Q\u008cc»-·ÿV\u0089E[je`7\u000fÁ!\u00936\\ØnÝ8àÊâ\u0094\u008d¦£p¬\u0002BÌV\u009ev¨yz\n\u0004\u0000Ö/çÁ±×Cø\røß\u0088é\u0082»\u00adEF\u0017L!{óu½\fO\u0004\u00193+=ôÕ\u0086üPëb\u0085,\u0092þ´\u0088£ZMdk6lÀ\u000e\u0092\b\\-n1?ÒÉÔ\u009bò¥\u009cw\u0090\u0001¸Ó§\u009d@¯Byq\u000b\u0000Õ\u0010ç:±<BË\fÄÞóèþº\u0093D¼\u0016¾ FòF¼uN|\u0018\r*>ô-\u0085ÄWÖaö3ðý\u008d\u008f\u0080Y¯kB5UÇx\u0091r£\fm\u0002?1ÈÀ\u009aÓÜ!íÓ¿üIþ\u001b\u0081%\u0086÷µ\u0081¼SP\u001d\u007f/sù\u001a\u008b\u001cU,g$0ÓÂØ\u008cî^\u009dh\u0093:¸Ä§\u0096N Brn<\u0002Î\f\u0098'ª2{Ö\u0005Þ×òáá³\u0095}¼\u000f¾ÙXëGµnGb\u0011\u0011#*í,¾ÎHÕ\u001aö$ùö\u0087\u0080\u0080R³\u001cD.Jøy\u008asT\u0014f\u001f0*ÁÞ\u0093Í]çoô9\u0096Ë\u0085\u0095¯§½qN\u0003}Íw\u009f\u0006©\u0006{5\u0005?ÖÏàþ²ø|\u0083\u000e\u0088Ø·êº´RF^\u0010p\"\u001cì\u0010¾$H&\u0019Õ+Ýõð\u0087\u009fQ\u0091c¢-¨ÿH\u0089\\[rea7\u0013Á%\u0093*\\Ænß8ôÊã\u0094\u008d¦§óÛÂ)\u0090\u0006f\u00114|\n|ØW®X|°2\u0084\u0000\u0097Öÿ¤òzØHÞ\u001f)í\"£\u0014qgGi\u0015BëH¹µ\u008f¸]\u0092\u0013ýáö·Á\u0085ÈT,*#ø\u0012Î\u001a\u009cuR] Pö£Ä¨\u009a\u008eh\u0099>ÿ\fÄÂ×\u0091=g.5\f\u000b\nÙh¯n}@3¦\u0001±×\u009a¥\u009c{ïIå\u001f×î$¼(r\u0018@\u0012\u0016mäcºV\u0088Z^ª,\u009fâ\u0090°ã\u0086áTÐ\rs<\u0081n®\u0098¹ÊÔôÔ&çPï\u0082\u0002Ì-þ&(HZG\u0084d¶wá\u0099\u0013\u0092]½\u008fÔ¹Øëþ\u0015áG\u0006q\u0011£9íL\u001fDI|{zª\u0085Ô\u0082\u0006 0³bÉ¬îÞù\b\u0017:\bd&\u00961À_òq<~o\u0089\u0099\u0087Ëºõ¶'ÞQÊ\u0083üÍ\u001bÿ\u0005)*[+\u0085S·Pá|\u0010\u0095B\u009e\u008c¶¾¢èÄ\u001aÃDþvò \u001dÒ3\u001c'NJxUª{Ôh\u0007\u00821±c¾\u00adÉßÇ\tý;öe\u0001\u0097\u000fÁ&óN=Yow\u0099oÈ\u0086ú\u0089$¢VÖ\u0080Þ²éüç.\u0010X\u0016\u008a4´2æ]\u0010sBc\u008d\u008a¿\u0095é»\u001b¥EÂwø¡ãÓ\b\u001d\u0007O9y6«]ÕL\u0007|6\u0096`\u0081\u0092ªÜµ\u000eØ8Ìjâ\u0094\u0011Æ\u0004ð(\";lZ\u009eKÈ`ús%\u0082W°\u0081¸³ËýÊ/ùYð\u008b\u0003µ2ç&\u0011HC[\u008dz¿vî\u0081\u0018\u008dJ¼tÏ¦ÀÐê\u0002éL\u0006~\u0011¨;ÚL\u0004_6r`z\u0093\u0090Ý\u0083\u000f 9³kÇ\u0095îÇâñ\u001e#\u0014m=\u009f/ÉBûv%~T\u0089\u0086\u0084°½â¶,Á^Ì\u0088æº\u000eä\u0019\u00164@/rF¼Qî\u007f\u0019\u0099K\u009eu½§¥ÑÄ\u0003ÎMù\u007fò©\u001dÛ0\u0005$7JaI\u0093|Ýp\f\u0083>²hª\u009aÈÄÛöú ãR\u0000\u009c\u0013Î#øR*XTk\u0086k±\u009aã\u0090-£_Ó\u0089Ã»èåï\u0017\u001cA\u0016s!½-ïB\u0019nKbz\u0092¤\u0094Ö§\u0000¯2Ü|ì®ÿØ\u0017\n\u00054$f#\u0090YÂR\f}?\u0091i\u0080\u009bªÅ¡÷Ü!ÐSã\u009d\u0013Ï\u0006W'fÕ4úÂñ\u0090\u009e®\u009a|¦\n¤ØW\u0096f¤jr\u001d\u0000\u0011Þ0ì:»ÈIÆ\u0007ñÕ\u008eã\u008c±¿O¸\u001dR+Pùv·\u0019E\u0013\u0013<!/ðÊ\u008eÂ\\ájý8\u0088ö§\u0084²R^`]>mÌd\u009a\u000b¨ f*5ÝÃÕ\u0091ð¯ÿ}\u008e\u000b\u0086Ù©\u0097N¥Ls\u007f\u0001uß\u0012í\u0005»+JÄ\u0018ÊÖýäó²\u008c@\u0082\u001eµ,¼úH\u0088gFp\u0014\u001e\"\u001dð/\u008e$]Îkæ9ê÷\u0081\u0085\u0096S°a£?OÍF\u009bv©\u0006g\f5#Ã8\u0092Ò Å~ë\f\u0085Ú\u008aè½¦³tN\u0002BÐuî{¼\u0017J:\u0018-×ÃåßÜ!íÓ¿üIþ\u001b\u0081%\u0086÷µ\u0081¼SP\u001d\u007f/sù\u001a\u008b\u0010U*g$0ËÂÔ\u008cî^\u009dh\u0092:¸Ä²\u0096T Cri<\u001eÎ\r\u0098 ª({Ã\u0005Ð×òáõ³\u009b}¼\u000f²ÙAëFµuGy\u0011\u0010##í6¾ÚHÉ\u001aâ$äö\u0093\u0080\u0095R®\u001c].Wød\u008afT\u0015f\u001f0,ÁÞ\u0093Í]çoõ9\u0096Ë\u0099\u0095®§¼qN\u0003aÍt\u009f\u0018©\u001e{-\u0005\"ÖÑàã²ò|\u009a\u000e\u0095Ø¬ê¤´SF]\u0010q\"\u001cì\u000b¾%H>\u0019Ô+Ãõí\u0087\u0087Q\u008cc»-µÿL\u0089D[fey7\u000eÁ=\u00934\\ØnØ8êÊâ\u0094\u0091¦£p·\u0002ZÌR\u009ev¨ez\r\u0004\u0000Ö/çÁ±ÞCø\rûß\u0088é\u009f»°E_\u0017Q!oóh½\u000bO\u0018\u0019,+ ôÏ\u0086áPÿb\u0098,\u0087þ©\u0088¸ZPd\u007f6qÀ\u00003e\u0002\u0097P¸¦¯ôÂÊÂ\u0018înú¼\u0014ò$À4\u0016^dQºj\u0088`ß\u008c-\u0084c«±Ç\u0087ÎÕè+ây\u0011O\u001e\u009d4Ó[!Qw~Ex\u0094\u008fê\u00808£\u000e±\\Ê\u0092åàñ6\u001c\u0004\u001fZ(¨&þUÌ`\u0002hQ\u0080§\u0090õ²Ë½\u0019ÎoÄ½ëó\u0003Á\u000e\u0017=e6»P\u0089Gßa.\u009a|\u0089²£\u0080°ÖÒ$ÔzöHù\u009e\u0016ì'\".pFFB\u0094qê~9\u0094\u000f»]µ\u0093ÃáÌ7ì\u0005ø[\u0016©\u0005ÿ7ÍF\u0003NQb§{ö\u0090Ä\u0087\u001a©hÄOD~¶,\u0099Ú\u008e\u0088ã¶ãdÏ\u0012ÛÀ5\u008e\u0006¼\u0013j\u007f\u0018wÆSô@£¨Q¥\u001f\u009fÍùûî©ÅWÃ\u000503>á\u0015¯f]u\u000bG9Mè¦\u0096´D\u0097r\u009d òîÙ\u009cÎJ'x#&\fÔ\u001d\u0082u°Z~R-¿Û¬\u0089\u0087·\u0081eö\u0013ðÁË\u008f8½:\u0010ä!\u0016s9\u00852×]éB;oMg\u009f\u0094Ñ¤ã©5ÂGÍ\u0099ò«ÿü\u0017\u000e\u0004@3\u0092Y¤Nöd\bcZ\u0088l\u0087¾¯ðÛ\u0002ÈTåfí·\u0007É\u0001\u001b6->\u007fK±xÃ{\u0015\u009d'\u009ey\u00ad\u008b¾ÝÕïæ!÷r\u001f\u0084\u0015Ö*è!:VLP\u009ekÐ\u0084â\u00954½F¢\u0098ÌªÛüõ\r\u001a_\u0014\u0091\"£-õR\u0007\\Yike½\u008aÏ¤\u0001±SÝeÂ·ìÉø\u001a\u0015,&~5°EÂM\u0014n&~x\u0097\u008a\u0098Ü³îÙ Îrà\u0084ûÕ\u0011ç\u00199)K[\u009dT¯gám3\u0092E\u009c\u0097®©¥ûÊ\rä_õ\u0090\u001d¢\u0002ô,\u0006<XUjz¼tÎ\u008b\u0000\u008dR®d¡¶ÖÈÛ\u001aë+\u0018}\u0010\u008f=Á>\u0013Q%Fwk\u0089\u009bÛ\u0088í§?\u00adqÎ\u0083ÝÕìçå8\u0011J9\u009c.®DàC2pDz\u0096\u0080¨»ú·\fÆ^Í\u0090ò¢ÿó\u000b\u0005\u0005W5iA»OÍ|\u001f}Q\u008d".getBytes(CharsetNames.ISO_8859_1)).asCharBuffer().get(cArr, 0, 2467);
        AudioAttributesImplBaseParcelizer = cArr;
        MediaMetadataCompat = 7345293777325649378L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.setSeekMap.MediaBrowserCompatSearchResultReceiver
            int r8 = r8 + 97
            int r7 = r7 + 4
            int r1 = r6 + 3
            byte[] r1 = new byte[r1]
            int r6 = r6 + 2
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-5)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSeekMap.a(short, short, int, java.lang.Object[]):void");
    }
}
