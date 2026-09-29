package kotlin;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import com.marrow.data.models.ResponseError;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.InteractiveVideoElementLSModel;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\t\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0003R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013"}, d2 = {"Lo/MaskingMediaSourcePlaceholderTimeline;", "", "<init>", "()V", "", "write", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer;", "p0", "AudioAttributesCompatParcelizer", "(Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer;)V", "IconCompatParcelizer", "Lo/getResolutionSize;", "Lo/createProgressiveMediaExtractor;", "read", "Lo/getResolutionSize;", "Lo/setDownloadPercent;", "Lo/setDownloadPercent;", "Lo/TopUserCompanion;", "Lo/TopUserCompanion;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MaskingMediaSourcePlaceholderTimeline {
    private static final byte[] $$a = {114, -20, -35, -46};
    private static final int $$b = 146;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final setDownloadPercent write;
    private static char[] AudioAttributesImplApi21Parcelizer;
    private static long AudioAttributesImplApi26Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    public static final MaskingMediaSourcePlaceholderTimeline INSTANCE;
    private static int IconCompatParcelizer;
    private static final int MediaBrowserCompatCustomActionResultReceiver;
    private static final byte[] MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final getResolutionSize<createProgressiveMediaExtractor> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final TopUserCompanion RemoteActionCompatParcelizer;

    static final class read extends getTotalMcq {
        int IconCompatParcelizer;
        /* synthetic */ Object write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return MaskingMediaSourcePlaceholderTimeline.read(MaskingMediaSourcePlaceholderTimeline.this, this);
        }
    }

    static final class write extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return MaskingMediaSourcePlaceholderTimeline.IconCompatParcelizer(MaskingMediaSourcePlaceholderTimeline.this, this);
        }
    }

    private static String $$c(short s, byte b, byte b2) {
        byte[] bArr = $$a;
        int i = 3 - (b2 * 2);
        int i2 = s * 4;
        int i3 = 101 - (b * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            i++;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v117, types: [int] */
    /* JADX WARN: Type inference failed for: r1v153 */
    /* JADX WARN: Type inference failed for: r1v154 */
    private final Object AudioAttributesCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) throws Throwable {
        char c;
        int i;
        char c2;
        int i2;
        char c3;
        Object audioAttributesCompatParcelizer;
        Object objWrite;
        int i3;
        Object objNewInstance;
        int i4;
        Object objIconCompatParcelizer;
        int i5;
        Object objIconCompatParcelizer2;
        ?? r1;
        MergingMediaPeriodForwardingTrackSelection mergingMediaPeriodForwardingTrackSelection = new MergingMediaPeriodForwardingTrackSelection(this, sampleVideos);
        try {
            byte[] bArr = MediaBrowserCompatItemReceiver;
            Object[] objArr = new Object[1];
            a(bArr[4], bArr[9], bArr[43], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[20], bArr[16], (short) 453, objArr2);
            int iIntValue = (((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() >> 16) + 642;
            byte b = bArr[162];
            byte b2 = bArr[9];
            Object[] objArr3 = new Object[1];
            a(b, b2, (short) (b2 | 465), objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[14], bArr[102], (short) 481, objArr4);
            char cIntValue = (char) (41059 - ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0)).intValue());
            Object[] objArr5 = {0};
            byte b3 = bArr[63];
            byte b4 = bArr[9];
            Object[] objArr6 = new Object[1];
            a(b3, b4, (short) (b4 | 499), objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            byte b5 = bArr[109];
            byte b6 = bArr[16];
            Object[] objArr7 = new Object[1];
            a(b5, b6, (short) (b6 | 521), objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            b(iIntValue, cIntValue, ((Integer) cls3.getMethod(str, Integer.TYPE).invoke(null, objArr5)).intValue() + 382, objArr8);
            String str2 = (String) objArr8[0];
            Object[] objArr9 = {0, 0};
            byte b7 = bArr[63];
            byte b8 = bArr[9];
            Object[] objArr10 = new Object[1];
            a(b7, b8, (short) (b8 | 499), objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr[107], bArr[124], (short) 533, objArr11);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr11[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr9)).intValue() + 1;
            byte b9 = bArr[102];
            byte b10 = bArr[9];
            Object[] objArr12 = new Object[1];
            a(b9, b10, (short) (b10 | X5455_ExtendedTimestamp.ACCESS_TIME_BIT), objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            byte b11 = bArr[39];
            byte b12 = bArr[16];
            Object[] objArr13 = new Object[1];
            a(b11, b12, (short) (b12 | 432), objArr13);
            String str3 = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            a(bArr[102], bArr[224], (short) 289, objArr14);
            char cIntValue2 = (char) ((Integer) cls5.getMethod(str3, Class.forName((String) objArr14[0])).invoke(null, "")).intValue();
            byte b13 = bArr[18];
            byte b14 = bArr[9];
            Object[] objArr15 = new Object[1];
            a(b13, b14, (short) (b14 | 547), objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr[41], bArr[124], (short) 564, objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue2, cIntValue2, (((Integer) cls6.getMethod((String) objArr16[0], null).invoke(null, null)).intValue() >> 22) + 97, objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            byte b15 = bArr[39];
            byte b16 = bArr[224];
            Object[] objArr19 = new Object[1];
            a(b15, b16, (short) (b16 | TarConstants.LF_BLK), objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            Object[] objArr20 = new Object[1];
            a(bArr[41], bArr[4], (short) 225, objArr20);
            String str4 = (String) objArr20[0];
            byte b17 = bArr[39];
            byte b18 = bArr[224];
            Object[] objArr21 = new Object[1];
            a(b17, b18, (short) (b18 | TarConstants.LF_BLK), objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
            int[] iArr = new int[objArr22.length];
            for (int i6 = 0; i6 < objArr22.length; i6++) {
                Object[] objArr23 = {objArr22[i6]};
                byte[] bArr2 = MediaBrowserCompatItemReceiver;
                short s = (short) 229;
                Object[] objArr24 = new Object[1];
                a(bArr2[162], bArr2[224], s, objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                byte b19 = bArr2[109];
                byte b20 = bArr2[18];
                Object[] objArr25 = new Object[1];
                a(b19, b20, (short) (b20 | 224), objArr25);
                String str5 = (String) objArr25[0];
                byte b21 = bArr2[39];
                byte b22 = bArr2[224];
                Object[] objArr26 = new Object[1];
                a(b21, b22, (short) (b22 | TarConstants.LF_BLK), objArr26);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a(bArr2[162], bArr2[224], s, objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                byte b23 = bArr2[42];
                byte b24 = bArr2[23];
                Object[] objArr28 = new Object[1];
                a(b23, b24, (short) (b24 | 243), objArr28);
                iArr[i6] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                int i9 = 24;
                switch (mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(iArr[i7])) {
                    case -83:
                        i8 = 180;
                        break;
                    case -82:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(29);
                        i8 = mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer != 0 ? 82 : TsExtractor.TS_STREAM_TYPE_AC3;
                        break;
                    case -81:
                        i8 = 175;
                        break;
                    case -80:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(29);
                        int i10 = mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer;
                        if (i10 != 0 && i10 == 1) {
                            i9 = 16;
                        }
                        i7 = i9;
                        break;
                    case -79:
                        i8 = 170;
                        break;
                    case -78:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(29);
                        int i11 = mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer;
                        i8 = (i11 == 54 || i11 != 87) ? 70 : 149;
                        break;
                    case -77:
                        i8 = 165;
                        break;
                    case -76:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(29);
                        i8 = mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer != 0 ? 6 : 24;
                        break;
                    case -75:
                        i8 = 160;
                        break;
                    case -74:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(29);
                        i7 = mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0 ? 52 : 49;
                        break;
                    case -73:
                        i8 = 68;
                        break;
                    case -72:
                        i8 = 159;
                        break;
                    case -71:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(17);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i8 = 158;
                        }
                        break;
                    case -70:
                        i7 = 41;
                        break;
                    case -69:
                        i8 = TarConstants.CHKSUM_OFFSET;
                        break;
                    case -68:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(24);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i8 = 147;
                        }
                        break;
                    case -67:
                        i8 = 76;
                        break;
                    case -66:
                        i8 = TsExtractor.TS_STREAM_TYPE_DTS;
                        break;
                    case -65:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(24);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i8 = 137;
                        }
                        break;
                    case -64:
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(16);
                        AudioAttributesImplBaseParcelizer = mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer;
                        break;
                    case -63:
                        c = 3;
                        i = IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.read = i;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(11);
                        break;
                    case -62:
                        i8 = 45;
                        break;
                    case -61:
                        i8 = 128;
                        break;
                    case -60:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(17);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i8 = 127;
                        }
                        break;
                    case -59:
                        c = 3;
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(16);
                        IconCompatParcelizer = mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer;
                        break;
                    case -58:
                        c = 3;
                        i = AudioAttributesImplBaseParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.read = i;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(11);
                        break;
                    case -57:
                        i7 = 1;
                        break;
                    case -56:
                        i8 = 117;
                        break;
                    case -55:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(52);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i8 = 105;
                        }
                        break;
                    case -54:
                        c = 3;
                        mergingMediaPeriodForwardingTrackSelection.read = 3;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        NewNumberOtpResendRequest newNumberOtpResendRequest = (NewNumberOtpResendRequest) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = VerifyNewNumberRequest.write(newNumberOtpResendRequest, magicModuleSubmissionRequestBody, (SampleVideos) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(4);
                        break;
                    case -53:
                        c2 = 2;
                        i2 = 4;
                        c3 = 3;
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        audioAttributesCompatParcelizer = (MagicModuleSubmissionRequestBody) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i2);
                        break;
                    case -52:
                        c2 = 2;
                        i2 = 4;
                        c3 = 3;
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer((SampleVideos) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i2);
                        break;
                    case -51:
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        c2 = 2;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        c3 = 3;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = (NewNumberOtpResendRequest) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        i2 = 4;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i2);
                        break;
                    case -50:
                        i7 = 106;
                        break;
                    case -49:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(53);
                        i7 = mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0 ? 90 : i8;
                        break;
                    case -48:
                        mergingMediaPeriodForwardingTrackSelection.read = 2;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        MaskingMediaSourcePlaceholderTimeline maskingMediaSourcePlaceholderTimeline = (MaskingMediaSourcePlaceholderTimeline) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        objWrite = maskingMediaSourcePlaceholderTimeline.write((SampleVideos) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = objWrite;
                        i3 = 4;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i3);
                        break;
                    case -47:
                        i7 = 91;
                        break;
                    case -46:
                        i7 = 82;
                        break;
                    case -45:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(52);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i7 = 81;
                        }
                        break;
                    case ResponseError.CUSTOM_ERR /* -44 */:
                        objWrite = createProgressiveMediaExtractor.RemoteActionCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = objWrite;
                        i3 = 4;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i3);
                        break;
                    case -43:
                        i7 = 181;
                        break;
                    case -42:
                        i7 = 183;
                        break;
                    case -41:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(53);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i7 = 75;
                        }
                        break;
                    case -40:
                        i3 = 4;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = createProgressiveMediaExtractor.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i3);
                        break;
                    case -39:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(9);
                        return mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                    case -38:
                        objNewInstance = getShowPopup.INSTANCE;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = objNewInstance;
                        i4 = 4;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i4);
                        break;
                    case -37:
                        i7 = 171;
                        break;
                    case -36:
                        i7 = 173;
                        break;
                    case -35:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(52);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i7 = 67;
                        }
                        break;
                    case -34:
                        i4 = 4;
                        objIconCompatParcelizer = createProgressiveMediaExtractor.write;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = objIconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i4);
                        break;
                    case -33:
                        i4 = 4;
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        objIconCompatParcelizer = ((getResolutionSize) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer).IconCompatParcelizer();
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = objIconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i4);
                        break;
                    case -32:
                        objNewInstance = AudioAttributesCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = objNewInstance;
                        i4 = 4;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i4);
                        break;
                    case -31:
                        i7 = 114;
                        break;
                    case -30:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(9);
                        throw ((Throwable) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer);
                    case -29:
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        Object[] objArr29 = {mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer};
                        byte[] bArr3 = MediaBrowserCompatItemReceiver;
                        Object[] objArr30 = new Object[1];
                        a(bArr3[23], bArr3[224], (short) 568, objArr30);
                        Class<?> cls10 = Class.forName((String) objArr30[0]);
                        byte b25 = bArr3[39];
                        byte b26 = bArr3[224];
                        Object[] objArr31 = new Object[1];
                        a(b25, b26, (short) (b26 | TarConstants.LF_BLK), objArr31);
                        objNewInstance = cls10.getDeclaredConstructor(Class.forName((String) objArr31[0])).newInstance(objArr29);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = objNewInstance;
                        i4 = 4;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i4);
                        break;
                    case -28:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = "call to 'resume' before 'invoke' with coroutine";
                        i5 = 4;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i5);
                        break;
                    case -27:
                        i7 = 108;
                        break;
                    case -26:
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        SdkPayloadData.IconCompatParcelizer(mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer);
                        break;
                    case -25:
                        i7 = 161;
                        break;
                    case -24:
                        i7 = 163;
                        break;
                    case -23:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(49);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i7 = 48;
                        }
                        break;
                    case -22:
                        i7 = 55;
                        break;
                    case -21:
                        i7 = 119;
                        break;
                    case -20:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(47);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i7 = 44;
                        }
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i7 = 58;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i7 = 139;
                        break;
                    case -17:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(17);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i7 = 40;
                        }
                        break;
                    case -16:
                        i5 = 4;
                        objIconCompatParcelizer2 = getYear.IconCompatParcelizer();
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = objIconCompatParcelizer2;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i5);
                        break;
                    case -15:
                        i5 = 4;
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        objIconCompatParcelizer2 = ((read) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer).write;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = objIconCompatParcelizer2;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i5);
                        break;
                    case -14:
                        mergingMediaPeriodForwardingTrackSelection.read = 2;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        MaskingMediaSourcePlaceholderTimeline maskingMediaSourcePlaceholderTimeline2 = (MaskingMediaSourcePlaceholderTimeline) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = maskingMediaSourcePlaceholderTimeline2.new read((SampleVideos) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(4);
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i7 = 29;
                        break;
                    case -12:
                        mergingMediaPeriodForwardingTrackSelection.read = 2;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        read readVar = (read) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(16);
                        readVar.IconCompatParcelizer = mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer;
                        break;
                    case -11:
                        i7 = 176;
                        break;
                    case -10:
                        i7 = 178;
                        break;
                    case -9:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(17);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i7 = 15;
                        }
                        break;
                    case -8:
                        r1 = -2147483648;
                        mergingMediaPeriodForwardingTrackSelection.read = r1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(11);
                        break;
                    case -7:
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        r1 = ((read) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer).IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.read = r1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(11);
                        break;
                    case -6:
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = (read) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(4);
                        break;
                    case -5:
                        i7 = 166;
                        break;
                    case -4:
                        i7 = 168;
                        break;
                    case -3:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(17);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i7 = 5;
                        }
                        break;
                    case -2:
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        r1 = mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer instanceof read;
                        mergingMediaPeriodForwardingTrackSelection.read = r1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(11);
                        break;
                    case -1:
                        i7 = 110;
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

    /* JADX WARN: Removed duplicated region for block: B:116:0x05f1 A[Catch: all -> 0x06db, TryCatch #13 {all -> 0x06db, blocks: (B:104:0x05d7, B:114:0x05eb, B:116:0x05f1, B:117:0x05f2, B:120:0x05fb, B:125:0x0625, B:127:0x0650, B:126:0x0634, B:128:0x0654, B:130:0x0664, B:131:0x067f, B:136:0x0698, B:139:0x06c4), top: B:309:0x05d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05f2 A[Catch: all -> 0x06db, TryCatch #13 {all -> 0x06db, blocks: (B:104:0x05d7, B:114:0x05eb, B:116:0x05f1, B:117:0x05f2, B:120:0x05fb, B:125:0x0625, B:127:0x0650, B:126:0x0634, B:128:0x0654, B:130:0x0664, B:131:0x067f, B:136:0x0698, B:139:0x06c4), top: B:309:0x05d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x08e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0a27  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void AudioAttributesCompatParcelizer(o.InteractiveVideoElementLSModel.RemoteActionCompatParcelizer r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MaskingMediaSourcePlaceholderTimeline.AudioAttributesCompatParcelizer(o.InteractiveVideoElementLSModel$RemoteActionCompatParcelizer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0426  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object IconCompatParcelizer(kotlin.MaskingMediaSourcePlaceholderTimeline r17, kotlin.SampleVideos r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MaskingMediaSourcePlaceholderTimeline.IconCompatParcelizer(o.MaskingMediaSourcePlaceholderTimeline, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0351. Please report as an issue. */
    @getMagicModuleMeta
    public static final void IconCompatParcelizer() throws Throwable {
        int i;
        char c;
        Object mediaBrowserCompatCustomActionResultReceiver;
        MergingMediaPeriodForwardingTrackSelection mergingMediaPeriodForwardingTrackSelection = new MergingMediaPeriodForwardingTrackSelection();
        try {
            int i2 = 0;
            byte[] bArr = MediaBrowserCompatItemReceiver;
            byte b = bArr[63];
            byte b2 = bArr[9];
            Object[] objArr = new Object[1];
            a(b, b2, (short) (b2 | 678), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[0], bArr[16], (short) 706, objArr2);
            int iCharValue = ((Character) cls.getMethod((String) objArr2[0], Character.TYPE).invoke(null, '0')).charValue() + '!';
            byte b3 = bArr[224];
            byte b4 = bArr[9];
            Object[] objArr3 = new Object[1];
            a(b3, b4, (short) (b4 | 175), objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[162], bArr[16], (short) 714, objArr4);
            char cIntValue = (char) ((((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16) + 4935);
            Object[] objArr5 = {0};
            byte b5 = bArr[48];
            byte b6 = bArr[9];
            Object[] objArr6 = new Object[1];
            a(b5, b6, (short) (b6 | 730), objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr[107], bArr[16], (short) 757, objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            b(iCharValue, cIntValue, 1562 - ((Integer) cls3.getMethod(str, Integer.TYPE).invoke(null, objArr5)).intValue(), objArr8);
            String str2 = (String) objArr8[0];
            byte b7 = bArr[102];
            byte b8 = bArr[9];
            Object[] objArr9 = new Object[1];
            a(b7, b8, (short) (b8 | X5455_ExtendedTimestamp.ACCESS_TIME_BIT), objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(bArr[254], bArr[48], (short) 279, objArr10);
            String str3 = (String) objArr10[0];
            short s = (short) 289;
            Object[] objArr11 = new Object[1];
            a(bArr[102], bArr[224], s, objArr11);
            int i3 = -((Integer) cls4.getMethod(str3, Class.forName((String) objArr11[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, "", '0', 0, 0)).intValue();
            byte b9 = bArr[102];
            byte b10 = bArr[9];
            Object[] objArr12 = new Object[1];
            a(b9, b10, (short) (b10 | X5455_ExtendedTimestamp.ACCESS_TIME_BIT), objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a(bArr[109], bArr[23], (short) 432, objArr13);
            String str4 = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            a(bArr[102], bArr[224], s, objArr14);
            Object[] objArr15 = new Object[1];
            a(bArr[102], bArr[224], s, objArr15);
            char cIntValue2 = (char) ((Integer) cls5.getMethod(str4, Class.forName((String) objArr14[0]), Class.forName((String) objArr15[0])).invoke(null, "", "")).intValue();
            byte b11 = bArr[18];
            byte b12 = bArr[9];
            Object[] objArr16 = new Object[1];
            a(b11, b12, (short) (b12 | 547), objArr16);
            Class<?> cls6 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a(bArr[20], bArr[16], (short) 771, objArr17);
            String str5 = (String) objArr17[0];
            char c2 = '\'';
            byte b13 = bArr[39];
            byte b14 = bArr[224];
            Object[] objArr18 = new Object[1];
            a(b13, b14, (short) (b14 | TarConstants.LF_BLK), objArr18);
            Object[] objArr19 = new Object[1];
            b(i3, cIntValue2, ((Integer) cls6.getMethod(str5, Class.forName((String) objArr18[0])).invoke(null, "")).intValue() + 98, objArr19);
            Object[] objArr20 = {(String) objArr19[0]};
            byte b15 = bArr[39];
            byte b16 = bArr[224];
            Object[] objArr21 = new Object[1];
            a(b15, b16, (short) (b16 | TarConstants.LF_BLK), objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            a(bArr[41], bArr[4], (short) 225, objArr22);
            String str6 = (String) objArr22[0];
            byte b17 = bArr[39];
            byte b18 = bArr[224];
            Object[] objArr23 = new Object[1];
            a(b17, b18, (short) (b18 | TarConstants.LF_BLK), objArr23);
            Object[] objArr24 = (Object[]) cls7.getMethod(str6, Class.forName((String) objArr23[0])).invoke(str2, objArr20);
            int[] iArr = new int[objArr24.length];
            int i4 = 0;
            while (i4 < objArr24.length) {
                Object[] objArr25 = {objArr24[i4]};
                byte[] bArr2 = MediaBrowserCompatItemReceiver;
                short s2 = (short) 229;
                Object[] objArr26 = new Object[1];
                a(bArr2[162], bArr2[224], s2, objArr26);
                Class<?> cls8 = Class.forName((String) objArr26[0]);
                byte b19 = bArr2[109];
                byte b20 = bArr2[18];
                Object[] objArr27 = new Object[1];
                a(b19, b20, (short) (b20 | 224), objArr27);
                String str7 = (String) objArr27[0];
                byte b21 = bArr2[c2];
                byte b22 = bArr2[224];
                Object[] objArr28 = new Object[1];
                a(b21, b22, (short) (b22 | TarConstants.LF_BLK), objArr28);
                Object objInvoke = cls8.getMethod(str7, Class.forName((String) objArr28[0])).invoke(null, objArr25);
                Object[] objArr29 = new Object[1];
                a(bArr2[162], bArr2[224], s2, objArr29);
                Class<?> cls9 = Class.forName((String) objArr29[0]);
                byte b23 = bArr2[42];
                byte b24 = bArr2[23];
                Object[] objArr30 = new Object[1];
                a(b23, b24, (short) (b24 | 243), objArr30);
                iArr[i4] = ((Integer) cls9.getMethod((String) objArr30[0], null).invoke(objInvoke, null)).intValue();
                i4++;
                c2 = '\'';
            }
            while (true) {
                int i5 = i2 + 1;
                switch (mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(iArr[i2])) {
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i5 = 13;
                        i2 = i5;
                        break;
                    case -12:
                        i5 = 25;
                        i2 = i5;
                        break;
                    case -11:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(24);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i5 = 24;
                        }
                        i2 = i5;
                        break;
                    case -10:
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(16);
                        AudioAttributesImplBaseParcelizer = mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer;
                        i2 = i5;
                        break;
                    case -9:
                        mergingMediaPeriodForwardingTrackSelection.read = IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(11);
                        i2 = i5;
                        break;
                    case -8:
                        break;
                    case -7:
                        i2 = 1;
                        break;
                    case -6:
                        i2 = 15;
                        break;
                    case -5:
                        mergingMediaPeriodForwardingTrackSelection.read = 5;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        TopUserCompanion topUserCompanion = (TopUserCompanion) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        CurrentQuery currentQuery = (CurrentQuery) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        getCollegeName getcollegename = (getCollegeName) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(16);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = C0201setMcqCount.IconCompatParcelizer(topUserCompanion, currentQuery, getcollegename, magicModuleSubmissionRequestBody, mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(4);
                        i2 = i5;
                        break;
                    case -4:
                        i = 4;
                        c = 2;
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        mediaBrowserCompatCustomActionResultReceiver = (MagicModuleSubmissionRequestBody) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i);
                        i2 = i5;
                        break;
                    case -3:
                        i = 4;
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        c = 2;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        mediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver((SampleVideos) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(i);
                        i2 = i5;
                        break;
                    case -2:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(4);
                        i2 = i5;
                        break;
                    case -1:
                        i2 = 10;
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

    /* JADX WARN: Removed duplicated region for block: B:74:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0469  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void IconCompatParcelizer(kotlin.MaskingMediaSourcePlaceholderTimeline r17, o.InteractiveVideoElementLSModel.RemoteActionCompatParcelizer r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MaskingMediaSourcePlaceholderTimeline.IconCompatParcelizer(o.MaskingMediaSourcePlaceholderTimeline, o.InteractiveVideoElementLSModel$RemoteActionCompatParcelizer):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0316. Please report as an issue. */
    public static final /* synthetic */ Object read(MaskingMediaSourcePlaceholderTimeline maskingMediaSourcePlaceholderTimeline, SampleVideos sampleVideos) throws Throwable {
        MergingMediaPeriodForwardingTrackSelection mergingMediaPeriodForwardingTrackSelection = new MergingMediaPeriodForwardingTrackSelection(maskingMediaSourcePlaceholderTimeline, sampleVideos);
        try {
            int i = 0;
            byte[] bArr = MediaBrowserCompatItemReceiver;
            byte b = bArr[102];
            byte b2 = bArr[9];
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[41], bArr[16], bArr[18], objArr2);
            int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, 0)).intValue() + 97;
            Object[] objArr3 = new Object[1];
            a(bArr[4], bArr[9], bArr[43], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[162], bArr[63], bArr[191], objArr4);
            String str = (String) objArr4[0];
            byte b3 = bArr[39];
            byte b4 = bArr[224];
            Object[] objArr5 = new Object[1];
            a(b3, b4, (short) (b4 | TarConstants.LF_BLK), objArr5);
            char cIntValue = (char) (30544 - ((Integer) cls2.getMethod(str, Class.forName((String) objArr5[0])).invoke(null, "")).intValue());
            Object[] objArr6 = new Object[1];
            a(bArr[4], bArr[9], bArr[43], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr[162], bArr[63], bArr[191], objArr7);
            String str2 = (String) objArr7[0];
            byte b5 = bArr[39];
            byte b6 = bArr[224];
            Object[] objArr8 = new Object[1];
            a(b5, b6, (short) (b6 | TarConstants.LF_BLK), objArr8);
            int iIntValue2 = ((Integer) cls3.getMethod(str2, Class.forName((String) objArr8[0])).invoke(null, "")).intValue();
            Object[] objArr9 = new Object[1];
            b(iIntValue, cIntValue, iIntValue2, objArr9);
            String str3 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a(bArr[12], bArr[9], bArr[87], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            byte b7 = bArr[43];
            byte b8 = bArr[7];
            Object[] objArr11 = new Object[1];
            a(b7, b8, (short) (b8 | 96), objArr11);
            int i2 = 1 - (((Float) cls4.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, 0)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls4.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, 0)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            byte b9 = bArr[9];
            byte b10 = b9;
            Object[] objArr12 = new Object[1];
            a(b9, b10, (short) (b10 | 111), objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a(bArr[124], bArr[7], (short) 149, objArr13);
            char c = (char) (((Double) cls5.getMethod((String) objArr13[0], Integer.TYPE).invoke(null, 0)).doubleValue() > 0.0d ? 1 : (((Double) cls5.getMethod((String) objArr13[0], Integer.TYPE).invoke(null, 0)).doubleValue() == 0.0d ? 0 : -1));
            byte b11 = bArr[224];
            byte b12 = bArr[9];
            Object[] objArr14 = new Object[1];
            a(b11, b12, (short) (b12 | 175), objArr14);
            Class<?> cls6 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            a(bArr[102], bArr[16], (short) (MediaBrowserCompatCustomActionResultReceiver + 3), objArr15);
            Object[] objArr16 = new Object[1];
            b(i2, c, 98 - (((Long) cls6.getMethod((String) objArr15[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls6.getMethod((String) objArr15[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            byte b13 = bArr[39];
            byte b14 = bArr[224];
            Object[] objArr18 = new Object[1];
            a(b13, b14, (short) (b14 | TarConstants.LF_BLK), objArr18);
            Class<?> cls7 = Class.forName((String) objArr18[0]);
            Object[] objArr19 = new Object[1];
            a(bArr[41], bArr[4], (short) 225, objArr19);
            String str4 = (String) objArr19[0];
            byte b15 = bArr[39];
            byte b16 = bArr[224];
            Object[] objArr20 = new Object[1];
            a(b15, b16, (short) (b16 | TarConstants.LF_BLK), objArr20);
            Object[] objArr21 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr20[0])).invoke(str3, objArr17);
            int[] iArr = new int[objArr21.length];
            for (int i3 = 0; i3 < objArr21.length; i3++) {
                Object[] objArr22 = {objArr21[i3]};
                byte[] bArr2 = MediaBrowserCompatItemReceiver;
                short s = (short) 229;
                Object[] objArr23 = new Object[1];
                a(bArr2[162], bArr2[224], s, objArr23);
                Class<?> cls8 = Class.forName((String) objArr23[0]);
                byte b17 = bArr2[109];
                byte b18 = bArr2[18];
                Object[] objArr24 = new Object[1];
                a(b17, b18, (short) (b18 | 224), objArr24);
                String str5 = (String) objArr24[0];
                byte b19 = bArr2[39];
                byte b20 = bArr2[224];
                Object[] objArr25 = new Object[1];
                a(b19, b20, (short) (b20 | TarConstants.LF_BLK), objArr25);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                Object[] objArr26 = new Object[1];
                a(bArr2[162], bArr2[224], s, objArr26);
                Class<?> cls9 = Class.forName((String) objArr26[0]);
                byte b21 = bArr2[42];
                byte b22 = bArr2[23];
                Object[] objArr27 = new Object[1];
                a(b21, b22, (short) (b22 | 243), objArr27);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
            }
            while (true) {
                int i4 = i + 1;
                switch (mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(iArr[i])) {
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i = 1;
                        break;
                    case -12:
                        i4 = 32;
                        i = i4;
                        break;
                    case -11:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(17);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i4 = 31;
                        }
                        i = i4;
                        break;
                    case -10:
                        i = 9;
                        break;
                    case -9:
                        i4 = 21;
                        i = i4;
                        break;
                    case -8:
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(17);
                        if (mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer == 0) {
                            i4 = 20;
                        }
                        i = i4;
                        break;
                    case -7:
                        mergingMediaPeriodForwardingTrackSelection.read = 1;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(16);
                        IconCompatParcelizer = mergingMediaPeriodForwardingTrackSelection.AudioAttributesCompatParcelizer;
                        i = i4;
                        break;
                    case -6:
                        mergingMediaPeriodForwardingTrackSelection.read = AudioAttributesImplBaseParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(11);
                        i = i4;
                        break;
                    case -5:
                        break;
                    case -4:
                        i4 = 22;
                        i = i4;
                        break;
                    case -3:
                        i = 11;
                        break;
                    case -2:
                        mergingMediaPeriodForwardingTrackSelection.read = 2;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(2);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        MaskingMediaSourcePlaceholderTimeline maskingMediaSourcePlaceholderTimeline2 = (MaskingMediaSourcePlaceholderTimeline) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(3);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer = maskingMediaSourcePlaceholderTimeline2.AudioAttributesCompatParcelizer((SampleVideos<? super getShowPopup>) mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer);
                        mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(4);
                        i = i4;
                        break;
                    case -1:
                        i = 5;
                        break;
                    default:
                        i = i4;
                        break;
                }
                mergingMediaPeriodForwardingTrackSelection.RemoteActionCompatParcelizer(9);
                return mergingMediaPeriodForwardingTrackSelection.IconCompatParcelizer;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private MaskingMediaSourcePlaceholderTimeline() {
    }

    static {
        byte[] bArr = new byte[787];
        System.arraycopy("\u001e©ºß\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À\u001a1\u0002\b\b\u0010ø\u0005\u000e\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼\"\u001f\u0019Ñ6ô\u000e\u000bÿ\u0019Ï1ú\u0006æ1\u0002\u0003ë&\u0003ü\nþü\u001aðÒCú\u0012þÌ*&\u0003ü\nþ\u0012û\u0013\u0002ÿ\u0000ÏL\u0004ú\bÇ+*üú\u0004÷\u0010\u0010\u000eõ\u0011\u0003\b\u0001þ\u0018á Ü+\b÷\u0018\u0012û\u0013\u0002ÿ\u0000ÏKö\fþ\u0010ý\f\u0004\u0010º:\u0006\u000eùÒ\u001a&\u000eùç'\f\u0005å(ù\u0003\u0018ú\u000b\u0004\u0011\u0004\rô\u0012\u0007â)ñ\u0016\u0007ä\u0017\u0003ö Ú&\u0003æ&\u0007\u0010ø\u0005\u0013\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017Ñ1\u0004ý\b\u0003\u0013\u0002ô\u0018ú\u000b\u0004\u0003\u0014ë\u001a\u0005\u0003Û1\u0004\u000b\u0003\u0002\u0002\fæ\u001a\tý\u000f\u000b\u0004\u0002\u0001\u0002\u0010ü\u001aðÒCú\u0012þÌ *\u000bö\u0007\u0003\u0012ð\u0010\u000eõï\u001c\n\u000bç\u0010\u0010\u000eõ\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿+\u0016\u0018\u0001æ$ú\b\fú\u0017\u0006Ú*û\u0006\u0018Ü\u001cü\u001aðÒCú\u0012þÌ\u001a*þ\u0016æ\u0017\u0011\tõ\u000eú\u0007\u0003\u0014Ô#\u0014\bß'ú\u0006\u0010\týþ\u0003\u0014ä\u0015\u0014\u0002\u0002\u0005Ý&\u0006\u0000\u0019ü\rÕ&\fú\u001d\u000f\u000eõ\u0003\u0014Þ'ú\n\u0002\b\u0001\u0012à\u001d\u0014ò÷&ò\u0018öí\u0019\u0017ýü\u001aðÒCú\u0012þÌ\u001c8ð\u0007\u0010\tú\u000b\u0004\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À'$ÿ\n\u000b×þ\u000eþ\u0012ù\u0006\b\u0000ù\u0010\u0002\u0016ðí\u001d\u0014ò÷&ò\u0018ö\nû\u0006\u0018Ü\u001c\u0003\u0014å#ü\t\u0005ý\u0004í\u001e\u000eþ\u0012ù\u0003\u0014Þ\u0019\u001cØ\u001f\u0019Ï1ú\u0006\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017ø\u0013\u0001\u0002\u000fôó\u001b\u0016ðá2ûô&ò\u0018ö\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017².\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003\u0003\u0014ä\u001b\u0016ðù\u000fÿí\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ''\u0002ù\u0007\u0013\u0005\u0011à\u001a\u0000ü\u001aðÒCú\u0012þÌ (\u0005þ\u0007ÿ\u0010ì&ò\u0018öå8ð\u0007\u0010\tú\u000b\u0004\u0003\u0014à\u001c\u0005\u0012÷\u0014Ó(\u0006\u000e\bø\u0003\u0014Þ'ú\u0006\u0016ú\u0000ü\u001aðÒL\u0004ú\bÇ#\"\n\u0002ÿ\u0004é\u001e\u0017úê\u0019\u0014ü\u001aðÒL\u0004ú\bÇ$\u0019\u0014\n\u0004ü\u001aðÒCú\u0012þÌ&\u0018\r\u0000\u0003\u0016\u000f×-\b\t\n\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿\u00182û\u0013\u0002ÿ\u0000ä*þ\u0016ô\u0007\u0016ö\u0012\u0003\u0014Þ!\u000e\u0005\u0002\b\u0003\u0014Û0ý\bé\u0012\u0014é\u001a\tý\u000f\u000b\u0004\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À )ù\u000b\u0003æ.\b\u0000ù\u0018\u0003\u0014Ó,\u0010\u0004â\u001a\u0012ã\u001e\u0014ò\f\u0003\u0014Ø'\u0000ç.\bá\u0018\u0011ý".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 787);
        MediaBrowserCompatItemReceiver = bArr;
        MediaBrowserCompatCustomActionResultReceiver = 201;
        write();
        IconCompatParcelizer = 0;
        AudioAttributesImplBaseParcelizer = 1;
        INSTANCE = new MaskingMediaSourcePlaceholderTimeline();
        AudioAttributesCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(createProgressiveMediaExtractor.IconCompatParcelizer);
        write = setEncryptSalt.AudioAttributesCompatParcelizer(false);
        RemoteActionCompatParcelizer = College.AudioAttributesCompatParcelizer(setMbbsVerificationYear.write().plus(getAltContact.read(null)));
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super InteractiveVideoElementLSModel.RemoteActionCompatParcelizer>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            InteractiveVideoElementLSModel.Companion companion = InteractiveVideoElementLSModel.INSTANCE;
            return InteractiveVideoElementLSModel.Companion.RemoteActionCompatParcelizer();
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super InteractiveVideoElementLSModel.RemoteActionCompatParcelizer> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;
        private /* synthetic */ InteractiveVideoElementLSModel.RemoteActionCompatParcelizer write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            MaskingMediaSourcePlaceholderTimeline.IconCompatParcelizer(MaskingMediaSourcePlaceholderTimeline.INSTANCE, this.write);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(InteractiveVideoElementLSModel.RemoteActionCompatParcelizer remoteActionCompatParcelizer, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = remoteActionCompatParcelizer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i3 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer[i2 + i3])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (ViewConfiguration.getEdgeSlop() >> 16)), 2388 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getPressedStateDuration() >> 16) + 28, 480654850, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i3), Long.valueOf(AudioAttributesImplApi26Parcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 9702, TextUtils.getCapsMode("", 0, 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), 23784 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.lastIndexOf("", '0', 0) + 23785, 34 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<createProgressiveMediaExtractor, SampleVideos<? super Boolean>, Object> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            createProgressiveMediaExtractor createprogressivemediaextractor = (createProgressiveMediaExtractor) this.AudioAttributesCompatParcelizer;
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return QBankStatsResponse.AudioAttributesCompatParcelizer(createprogressivemediaextractor == createProgressiveMediaExtractor.write || createprogressivemediaextractor == createProgressiveMediaExtractor.RemoteActionCompatParcelizer);
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(sampleVideos);
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = obj;
            return audioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(createProgressiveMediaExtractor createprogressivemediaextractor, SampleVideos<? super Boolean> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(createprogressivemediaextractor, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                buildResolutionString.IconCompatParcelizer("QALogs", "startAsync called");
                buildResolutionString.IconCompatParcelizer("QALogs", " Thread ".concat(String.valueOf(Thread.currentThread().getName())));
                this.read = 1;
                if (MaskingMediaSourcePlaceholderTimeline.read(MaskingMediaSourcePlaceholderTimeline.INSTANCE, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #1 {all -> 0x003c, blocks: (B:13:0x0037, B:37:0x00b7, B:40:0x00bf, B:42:0x00c4, B:41:0x00c2), top: B:54:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:13:0x0037, B:37:0x00b7, B:40:0x00bf, B:42:0x00c4, B:41:0x00c2), top: B:54:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MaskingMediaSourcePlaceholderTimeline.write(o.SampleVideos):java.lang.Object");
    }

    static void write() {
        char[] cArr = new char[1644];
        ByteBuffer.wrap("«qB\u0088xº\u0016Â\fä:\u0010Ð.Î2äF\u0092}\u0089\u0083§¸]ÌKËaö\u001f\u00005 #QÙjð\u008eî\u008c\u0084¹²Ã¨ÿF\b|,j+\u0000W>}Õ\u009bÃ¦ùÖ\u0097Î\u008dõ»\u0007Q ODet\u001c\u0096\n\u0093 ¥ÞÄôââ\u0006\u00987¶1¬MZ{q\u0081o±\u0005Ê3î)áÇ\u0019ý?ë^\u0081t¸\u008dV\u0093LªzÀ\u0010á\u000e\u0007$1Ò0ÈHæn\u009d\u009f\u008b¹¡Ö_îuîc\r\u0019=7\\-{Ä\u008cò\u0090è\u00ad\u0086Û¼ûª\u0005@+~R\u0014I\u0002y9\u009f×¾ÍÖûí\u0091ó\u008f\n¥#SAIg`\u0096\u001e\u008fÜ Ü!5Ø\u000fêa\u0092{´M@§~¹b\u0093\u0016å-þÓÐè*\u009c<\u009f\u0016»hKBdT\u0015®;\u0087Ç\u0099ÄóôÅ\u0092ß³1Y\u000bd\u001dbw\u0006I6¢Ñ´è\u008e\u0085à\u0080ú¸ÌU&o8\t\u0012,kÞ}ÝW÷©\u008d\u0083¯\u0095Nï|Á`Û\u001d-+\u0006Ê\u0018õr\u0087D¦^¤°H\u008az\u009c\u0013ö9ÏÈ!Â;æ\r\u0091g\u00adyVSz¥}¿\u0019\u0091*êÎüîÖ\u0099( \u0002º\u0014Hns@\bZ7³Â\u0085Þ\u009fæñ\u0096Ë©ÝU7{\t\u0004c\u0004u3NÎ îº\u0081\u008c½æ£øZÒq$\u0011>7\u0017ÆiÞCåU\u008b¯²\u0081K\u009byí\u001fÇ\u001eÙ02Í\u0004ì\u001e\u008cp¼J \\X¶k\u0088\u000eâ!ûÚÍþ'ù9\u0090\u0013®eG\u007fxQ\u001c«\u001d½'\u0096ÍèìÂ\u008cÔ».¿\u0000Y\u001ajl\u000eF)_Â±þ\u008bü\u009d\u0095÷\u00adÉS#j5\u0007\u000f\u0001a'zÖLè¦\u0095¸»\u0092Bä\\»ÐR)h\u001b\u0006c\u001cE*±À\u008fÞ\u0093ôç\u0082Ü\u0099\"·\u0019Mm[nqJ\u000fº%\u00953äÉÊà6þ5\u0094\u0005¢c¸BV¨l\u0095z\u0093\u0010÷.ÇÅ Ó\u0018éu\u0087q\u009dI«¤A\u009e_úuÐ\f/\u001a30\u0002Î|äYò¦\u0088\u0090¦\u0089¼÷JÛa5\u007f\u0004\u0015j#[9U×¹í\u0082ûþ\u0091É¨-F.\\\nj}\u0000A\u001eº4\u0097Â\u0091ØëöÂ\u008d>\u009b\u0018±wOOeMs¡\t\u009c'â=ÛÔ3â0ø\r\u0096z¬\\º½P\u008bnï\u0004è\u0012Ç)?Ç\u0003ÝtëT\u0081S\u009f·µ\u0080CùYÇp+\u000e,$\u000e2{ÈCæ¹ü\u0088\u008að è¾ÙU(c\u0003yg\u0017T-P;¶Ñ\u0087ïú\u0085Ä\u009c4ª\u0015@\u0015^ytB\u0002¶\u0018\u00896óÌçÚÖñ<\u008f\u001d¥s³JIPg©}\u0081\u000bþ!Ä85Ö\u0015|B\u0095»¯\u0089ÁõÛ×í;\u0007\u0003\u0019\u00003jEQ^±p\u0095\u008aç\u009câ¶ÄÈ1â\u0013ôo\u000eY'½9½S\u008aeò\u007fÅ\u0091;«\u0006½\u001d×déN\u0002©\u0014\u0095.ù@÷ZÆl1\u0086\u0011\u0098w²[Ë¨Ý ÷\u008a\tó#Í54O\u001ea\u001f{x\u008dH¦«¸\u0088ÒùäÃþÒ\u0010**\f<kV[o¿\u0081µ\u009b\u0084\u00adòÇÍÙ5ó\u0019\u0005\u001e\u001fx1IJ´\\\u0088vú\u0088Ü¢Ý´4Î\u000eàlúT\u0013¦%¢?\u0084QõkË}6\u0097\u0001©dÃgÕKî°\u0000\u008f\u001aû,ÇFÁX%r\u0012\u0084k\u009eU· Éºã\u0086õè\u000fÑ!-;\u001aMeg|yK\u0092·¤\u0091¾õÐÄêÂü8\u0016\u001d(sBN[£m\u009c\u0087\u0086\u0099÷³ÖÅ0ß\u001añc\u000bu\u001dD6®H\u008fbàtØ\u008eÛ 2º\tÌmæIÿ¦\u0011\u009d+\u0081=õWÓi1\u0083\u0015\u0095a¯|ÁEÚ±ì\u008f\u0006ö\u0018Ø2\"D8^\npl\u008aN££µ\u009eÏ\u0080áúûÖ\r2'\f9eSceG~·\u0090\u0096ª÷¼ÛÖ#è;\u0002\u000b\u0014o.OG Y\u009fs\u0083\u0085û\u009fÝ±3Ë\u0017Ýf÷@\tG\"³4\u0090Nð`Úz \u008c;¦\u0004¸nÒMë¨ý\u0098\u0017\u009a)ûCÉU-o\t\u0081`\u009b]\u00adAÆ´Ø\u0090òñ\u0004Ë\u001e*0\"J\u001d\\qvS\u008f·¡\u0086»ãÍççËù2\u0013\b%{?_Q^j½|\u008f\u0096ó¨ÊÂ\"Ô#î\u0007\u0000v\u001aW3·E\u009b_âqô\u008bË\u009d/·\u000eÉaã_õ[\u000e¸ \u0088:òLÉf&x\u001c\u0092\u0006¤r¾Q×°é\u009a\u0003æ\u0015ü/ÄA.[\nmk\u0087X\u0099B²¾Ä\u0096ÞìðÎ\n'\u001c\u001d6\u0001HtbQ{±\u008d\u0095§ç¹úÓÅå)ÿ\u000b\u0011o+Y<½V¿h\u0090\u0082í\u0094Ñ®#À\u0005Ú\u0001ì}\u0006W\u001f²1\u0094Kå]ýwÆ\u00894£\fµnÏZà¼ú¸\f\u009f&î8ÉR*d\u001f~\u0003\u0090}ª]Ã³Õ\u0097ïá\u0001Ç\u001bÇ-+G\u0014Yls[\u0084¿\u009e¾°\u009aÊïÜÓö,\b\u0005\"\u00034~NPg¬y\u0089\u0093î¥Ý¿ÁÑ2ë\u0010ýq\u0017U(¦B½T\u0085nñ\u0080Ê\u009a6¬\u0000ÆfØgòK\u000b°\u001d\u008e7ûIÇcÚu$\u008f\u000e¡k»MÌ¸æ»ø\u0098\u0012é$Í>.P\u0003j}|a\u0096R¯²Á\u0091ÛõíÁ\u0007Ù\u0019%3\u0010Em_Vp¸\u008a\u0085\u009c\u009d¶êÈÌâ/ô\u000f\u000e~ `:[Sºe\u0092\u007fì\u0091Ì«Ã½;×\u0010él\u0003C\u0014º.\u009c@\u0099ZðlÎ\u0086/\u0098\t²\u007fÄvÞE÷©\t\u008b#í5ÙO!a;{\n\u008dl§O¸®Ò\u009eä\u0080þý\u0010Û*2<\fVmhc\u0082\\\u009bµ\u00ad\u008cÇêÙÃó=\u0005!\u001f\u00121{KQ\\¯v\u009f\u0088\u0083¢ÿ´ÔÎ3à\u0017úc\fA&G?«Q\u0097kî}Û\u0097?©;Ã\u001aÕoïS\u0000¯\u001a\u0087,\u0083FüXÔr,\u0084\b\u009eb°]ÊAã±õ\u0096\u000fñ!Î;?M?g\u001cyh\u0093R¤¬¾\u0080ÐüêæüÐ\u00167(\u0010BzTDnZ\u0087¤\u0099\u008e³èÅÎß8ñ\"\u000b\u001c\u001dv7LH\u00adb\u0084tý\u008eþ ×º.Ì\u0010ænøG\u0012B+¿=\u0088WîiÏ\u00839\u0095\u001d¯\u001dÁ~ÛMì±\u0006\u0081\u0018ë2áDÅ^4p\u000e\u008au\u009cY¶XÏºá\u0089ûí\rÎ'.9\u001dS\u001aet\u007fN\u0090¬ª\u0081¼ÿÖüèÙ\u0002(\u0014\u0012.o@LY¼s½\u0085\u008a\u009fð±ÉË;Ý\u001f÷\u001a\ty#O4³N\u008e`æzã\u008cÇ¦2¸\u0013Òwä[ý¦\u0017¿)\u008bCïUÊo,\u0081\u001f\u009b\u0018\u00ad}ÇHØ²ò\u008d\u0004à\u001eÜ0ÝJ3\\\rvq\u0088@¡§»¡Í\u0085çôùÈ\u00135%\u0002?\u001bQfkH|·\u0096\u008c¨úÂÇÔÙî+\u0000\u000f\u001aj,OE¿_£q\u009e\u008bü\u009dÓ·,É\u0003ã|õf\u000fQ ¸:\u0090LáfÅxÁ\u0092%¤\u0014¾gÐUé¹\u0003·\u0015\u009a/éAÖ[/m\u001a\u0087|\u0099t³VÄ®Þ\u008bðí\nß\u001cÃ61H\u0015bstW\u008d\u00ad§\u0082¹\u0087ÓðåÔÿ0\u0011\u001a+j=~WDhµ\u0082\u008a\u0094õ®ÙÀ×Ú9Ü!5Ø\u000fêa\u008e{ªMY§\u007f¹|\u0093\bå0þÎÐé*\u009c<\u0080\u0016¾hKBqT\f®:\u0087Þ\u0099ÞóéÅ\u008fß¨1X\u000bd\u001dbw\u0006I8¢Ñ´÷\u008e\u008eà\u0080ú¤ÌW&s8\u0014\u00128kÃ}ÞWè©\u0095\u0083¬\u0095Wï}Á|Û\u0018-+\u0006Ñ\u0018èr\u0085D¿^¥°T\u008av\u009c\u0013ö,ÏÝ!Û;ç\r\u008dg¬yOS{¥a¿\u0018\u00910êÏüëÖ\u008c(¾\u0002¾\u0014Tnr@\u0012Z*³À\u0085Ù\u009fæñ\u008aË\u00adÝN7z\t\u001ec\u0019u=NÎ òº\u0085\u008c¨æ¢øFÒr$\r>6\u0017ÃiØCåU\u008b¯±\u0081I\u009byí\u0006Ç\u001dÙ(2Ì\u0004ì\u001e\u0089p¼J¸\\F¶j\u0088\râ-ûÚÍë'ä9\u0088\u0013°eL\u007fxQ\u0004«\u0002½&\u0096ÒèéÂ\u0096Ôº.¾\u0000\\\u001ajl\u000eF*_Ã±þ\u008bâ\u009d\u0096÷¶ÉR#o5\u0002\u000f\u0001a'zÖLî¦\u0095¸»\u0092AäPþiÐ\u000f*.\u0003À\u0015ýoöA\u0087[´\u00adO\u0087v\u0099\u001aó\u001eÅ;ÞÊ0î\n\u008a\u001c¬v^HB¢u´\u0015\u008e2çÃùüÓà%\u0098?´\u0011Pkt}\u0005W#©$\u0082È\u0094ñî\u008eÀ¸ÚE,\\\u0006g\u0018\rr.KÈ]û·á\u0089\u009aãµõOÏu!\u0006;&\r#fÉxòR\u008b¤·¾]\u0090^ê|ü\u000bÖ(/Í\u0001ú\u001b\u0087m\u009aG©YO³l\u0085\u0003\u009f=ñ;ÊÞÜì6\u0090\b©bOt@Nd \u0015º:\u0093Ôåáÿ\u0082Ñ\u0083+±=M\u0017si\u000fC U!®Û\u0080÷\u009a\u0088ìµÆBØa2d\u0004\b\u001e6wÎIø£\u009cµ\u009a\u008f¹áLûpÍ\u000e'$9 \u0012Ädò~\u0097P´ªX¼f\u0096zè\bÂ,ÛÊ-è\u0007\u009c\u0019\u009fs»EK_d±\u0015\u008b;\u009cÇöÞÈé\"\u00944³\u000eB`}zvL\u0013¦,¿Ð\u0091ëë\u008eý\u0080×¤)R\u0003t\u0015\u0014o$@ÂZÙ¬è\u0086\u0090\u0098§òWÄbÞ~0\u0006\n6cÉuõO\u009b¡§»°\u008dIçtù\u0013Ó%$Ä>Â\u0010æj\u0094|¤VV¨z\u0082y\u0094\u0019î*ÇÎÙí3\u0084\u0005¾\u001f¢qQKp]\u0012·6\u0088ÄâÚôæÎ\u0096 ¬:N\fzf\u0001x\u001eR)«Ð½ì\u0097\u0098é Ã»ÕG/m\u0001\t\u001b\"lÛFÚXå²\u0097\u0084¶\u009eTðxÊ\u0007Ü\u001d6(\u000fÌaë{\u0088M¼§ ¹_\u0093så\u0010ÿ4ÐÃ*ç<ä\u0016\u0088h·BJTx®\u0000\u0080\u001e\u009a3óÌÅìß\u00891»\u000b¿\u001d]wjI\u000e£-´Ã\u008eþàùú\u0088Ì°&K8w\u0012\u001dd\u0018~=WË©ñ\u0083\u008c\u0095®ï_ÁEÛp-\u001b\u00073\u0018ÙrâDÿ^\u0087°´\u008aO\u009cvö\u001aÈ\u001d\";;Ê\rîg\u008ay\u00adS^¥B¿u\u0091\u0015ë2üÊÖà(ô\u0002\u0086\u0014ªnN@kZ\u001a¬>\u0086:\u009fÜñîË\u0092Ý¥7E\tBcsu\fO/ Âºû\u008cáæ\u009fø¶ÒO$`>\u0019\u0010?j=C×Uí¯\u0093\u0081\u00ad\u009bAíAÇ{Ù\u00163,\u0004Õ\u001eûp\u0085J\u009a\\©¶W\u0088fâ\u0018ô<Î8'Ù9ì\u0013\u0090e¬\u007fDQ@«\u007f½\u0013\u0097/èÕÂãÔ\u0086.\u0083\u0000²\u001aUlrF\u0016X&²9\u008bÆ\u009dê÷\u008aÉ¬#Z5e\u000f|a\t{/LÉ¦â¸\u009d\u0092\u0098ä¾þLÐp*\f<!\u0016 oÄAð[\u0094\u00ad´\u0087D\u0099có~Å\bß,0È\nã\u001c\u009cv\u0098H³¢K´q\u008e\u000fà.ùßÓÅ%ö?\u0093\u0011³kY}bW\u007fÏf&\u009f\u001c\u00adrÉhí^\u001e´'ª0\u0080Oöwí\u0088Ã®9Û/Ç\u0005þ{\fQ6GJ½}\u0094\u008c\u008a\u009bà®ÖÈÌí\"\u001f\u0018.\u000e%dAZq±\u0096§«\u009dÜóÓéùß\r5)+H\u0001~x\u0084n\u0098D¯ºË\u0090á\u0086\u0010ü:Ò3ÈA>q\u0015\u008a\u000b\u00adaÝWæMü£\u000e\u00994\u008fMå\u007fÜ\u009b2\u0098(¼\u001eËtìj\u0011@!¶>¬B\u0082lù\u0095ï®ÅÞ;ø\u0011ù\u0007\u0011}*STIm \u0084\u0096\u0086\u008c âÑØè".getBytes(CharsetNames.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1644);
        AudioAttributesImplApi21Parcelizer = cArr;
        AudioAttributesImplApi26Parcelizer = 8645666151014020585L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            byte[] r0 = kotlin.MaskingMediaSourcePlaceholderTimeline.MediaBrowserCompatItemReceiver
            int r7 = 39 - r7
            int r8 = r8 + 97
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r8 = r9
            r5 = r2
            goto L26
        L11:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L15:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r8]
        L26:
            int r9 = r9 + r3
            int r9 = r9 + (-5)
            int r8 = r8 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MaskingMediaSourcePlaceholderTimeline.a(short, short, int, java.lang.Object[]):void");
    }
}
