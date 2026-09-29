package kotlin;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u000fJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019"}, d2 = {"Lo/convertAlignmentToCss;", "Lo/MarrowTheme;", "Lo/isProtectedContentExtensionSupported;", "p0", "Lo/isSeekPending;", "p1", "Lo/DefaultBandwidthMeter1;", "p2", "<init>", "(Lo/isProtectedContentExtensionSupported;Lo/isSeekPending;Lo/DefaultBandwidthMeter1;)V", "Lo/MarrowTheme$AudioAttributesCompatParcelizer;", "Lo/TypeKt;", "AudioAttributesCompatParcelizer", "(Lo/MarrowTheme$AudioAttributesCompatParcelizer;)Lo/TypeKt;", "", "(Ljava/lang/String;)Ljava/lang/String;", "Lo/ThemeKtExternalSyntheticLambda0;", "(Ljava/lang/String;Lo/ThemeKtExternalSyntheticLambda0;Lo/MarrowTheme$AudioAttributesCompatParcelizer;)Lo/TypeKt;", "", "", "read", "(Ljava/lang/String;ILjava/lang/String;)V", "IconCompatParcelizer", "Lo/isProtectedContentExtensionSupported;", "Lo/isSeekPending;", "Lo/DefaultBandwidthMeter1;", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class convertAlignmentToCss implements MarrowTheme {
    private static final byte[] $$a = {61, 46, 102, -127};
    private static final int $$b = 62;
    private static final int AudioAttributesImplApi21Parcelizer;
    private static long AudioAttributesImplApi26Parcelizer;
    private static final byte[] AudioAttributesImplBaseParcelizer;
    private static char[] MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final isProtectedContentExtensionSupported read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final DefaultBandwidthMeter1 write;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r5, short r6, short r7) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r5 = r5 * 4
            int r5 = 101 - r5
            byte[] r1 = kotlin.convertAlignmentToCss.$$a
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r5 = r6
            r4 = r7
            r3 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
        L29:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertAlignmentToCss.$$c(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0453  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String AudioAttributesCompatParcelizer(java.lang.String r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertAlignmentToCss.AudioAttributesCompatParcelizer(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0539 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x067b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.C0156TypeKt AudioAttributesCompatParcelizer(java.lang.String r18, kotlin.ThemeKtExternalSyntheticLambda0 r19, o.MarrowTheme.AudioAttributesCompatParcelizer r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertAlignmentToCss.AudioAttributesCompatParcelizer(java.lang.String, o.ThemeKtExternalSyntheticLambda0, o.MarrowTheme$AudioAttributesCompatParcelizer):o.TypeKt");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x02ca. Please report as an issue. */
    public static final /* synthetic */ isProtectedContentExtensionSupported read(convertAlignmentToCss convertalignmenttocss) throws Throwable {
        int i;
        WebViewSubtitleOutput2 webViewSubtitleOutput2 = new WebViewSubtitleOutput2(convertalignmenttocss);
        try {
            int i2 = 0;
            byte[] bArr = AudioAttributesImplBaseParcelizer;
            byte b = bArr[33];
            byte b2 = bArr[79];
            Object[] objArr = new Object[1];
            a(b, b2, (short) (b2 | TarConstants.LF_CONTIG), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[125], bArr[61], (short) 333, objArr2);
            char c = (char) ((((Float) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, 0)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, 0)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1250);
            char c2 = 'M';
            byte b3 = bArr[77];
            byte b4 = bArr[79];
            Object[] objArr3 = new Object[1];
            a(b3, b4, (short) (b4 | 346), objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b5 = bArr[26];
            byte b6 = bArr[207];
            Object[] objArr4 = new Object[1];
            a(b5, b6, (short) (b6 | 369), objArr4);
            int iIntValue = (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16) + 100;
            byte b7 = bArr[26];
            byte b8 = bArr[79];
            Object[] objArr5 = new Object[1];
            a(b7, b8, (short) (b8 | 92), objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr[201], bArr[207], (short) 395, objArr6);
            Object[] objArr7 = new Object[1];
            b(c, iIntValue, (((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 16) + 94, objArr7);
            String str = (String) objArr7[0];
            byte b9 = bArr[382];
            byte b10 = bArr[79];
            Object[] objArr8 = new Object[1];
            a(b9, b10, (short) (b10 | 129), objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            byte b11 = bArr[629];
            byte b12 = bArr[207];
            Object[] objArr9 = new Object[1];
            a(b11, b12, (short) (b12 | 401), objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a(bArr[382], bArr[77], (short) 164, objArr10);
            char cIntValue = (char) ((Integer) cls4.getMethod(str2, Class.forName((String) objArr10[0])).invoke(null, "")).intValue();
            byte b13 = bArr[77];
            byte b14 = bArr[79];
            Object[] objArr11 = new Object[1];
            a(b13, b14, (short) (b14 | 346), objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            byte b15 = bArr[201];
            byte b16 = bArr[207];
            Object[] objArr12 = new Object[1];
            a(b15, b16, (short) (b16 | 416), objArr12);
            int iIntValue2 = (((Integer) cls5.getMethod((String) objArr12[0], null).invoke(null, null)).intValue() >> 16) + 99;
            byte b17 = bArr[77];
            byte b18 = bArr[79];
            Object[] objArr13 = new Object[1];
            a(b17, b18, (short) (b18 | 346), objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a(bArr[6], bArr[207], (short) 434, objArr14);
            Object[] objArr15 = new Object[1];
            b(cIntValue, iIntValue2, 1 - (((Integer) cls6.getMethod((String) objArr14[0], null).invoke(null, null)).intValue() >> 16), objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            short s = (short) 245;
            Object[] objArr17 = new Object[1];
            a(bArr[629], bArr[77], s, objArr17);
            Class<?> cls7 = Class.forName((String) objArr17[0]);
            Object[] objArr18 = new Object[1];
            a(bArr[129], bArr[26], (short) 260, objArr18);
            String str3 = (String) objArr18[0];
            Object[] objArr19 = new Object[1];
            a(bArr[629], bArr[77], s, objArr19);
            Object[] objArr20 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr19[0])).invoke(str, objArr16);
            int[] iArr = new int[objArr20.length];
            int i3 = 0;
            while (i3 < objArr20.length) {
                Object[] objArr21 = {objArr20[i3]};
                byte[] bArr2 = AudioAttributesImplBaseParcelizer;
                short s2 = (short) 264;
                Object[] objArr22 = new Object[1];
                a(bArr2[169], bArr2[c2], s2, objArr22);
                Class<?> cls8 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                a(bArr2[81], bArr2[110], (short) 280, objArr23);
                String str4 = (String) objArr23[0];
                byte b19 = bArr2[629];
                byte b20 = bArr2[c2];
                Object[] objArr24 = new Object[1];
                a(b19, b20, s, objArr24);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                Object[] objArr25 = new Object[1];
                a(bArr2[169], bArr2[77], s2, objArr25);
                Class<?> cls9 = Class.forName((String) objArr25[0]);
                byte b21 = bArr2[414];
                byte b22 = bArr2[153];
                Object[] objArr26 = new Object[1];
                a(b21, b22, (short) (b22 | 278), objArr26);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c2 = 'M';
            }
            while (true) {
                int i4 = i2 + 1;
                switch (webViewSubtitleOutput2.read(iArr[i2])) {
                    case -15:
                        i2 = 8;
                        break;
                    case -14:
                        i2 = 30;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        webViewSubtitleOutput2.read(13);
                        if (webViewSubtitleOutput2.read == 0) {
                            i4 = 29;
                        }
                        i2 = i4;
                        break;
                    case -12:
                        webViewSubtitleOutput2.IconCompatParcelizer = 1;
                        webViewSubtitleOutput2.read(2);
                        webViewSubtitleOutput2.read(11);
                        MediaBrowserCompatItemReceiver = webViewSubtitleOutput2.read;
                        i2 = i4;
                        break;
                    case -11:
                        i = write;
                        webViewSubtitleOutput2.IconCompatParcelizer = i;
                        webViewSubtitleOutput2.read(9);
                        i2 = i4;
                        break;
                    case -10:
                        i2 = 1;
                        break;
                    case -9:
                        i2 = 21;
                        break;
                    case -8:
                        webViewSubtitleOutput2.read(24);
                        if (webViewSubtitleOutput2.read == 0) {
                            i4 = 20;
                        }
                        i2 = i4;
                        break;
                    case -7:
                        webViewSubtitleOutput2.IconCompatParcelizer = 1;
                        webViewSubtitleOutput2.read(2);
                        webViewSubtitleOutput2.read(11);
                        write = webViewSubtitleOutput2.read;
                        i2 = i4;
                        break;
                    case -6:
                        i = MediaBrowserCompatItemReceiver;
                        webViewSubtitleOutput2.IconCompatParcelizer = i;
                        webViewSubtitleOutput2.read(9);
                        i2 = i4;
                        break;
                    case -5:
                        break;
                    case -4:
                        i2 = 10;
                        break;
                    case -3:
                        i2 = 22;
                        break;
                    case -2:
                        webViewSubtitleOutput2.IconCompatParcelizer = 1;
                        webViewSubtitleOutput2.read(2);
                        webViewSubtitleOutput2.read(3);
                        webViewSubtitleOutput2.write = ((convertAlignmentToCss) webViewSubtitleOutput2.RemoteActionCompatParcelizer).read;
                        webViewSubtitleOutput2.read(4);
                        i2 = i4;
                        break;
                    case -1:
                        i2 = 4;
                        break;
                    default:
                        i2 = i4;
                        break;
                }
                webViewSubtitleOutput2.read(8);
                return (isProtectedContentExtensionSupported) webViewSubtitleOutput2.RemoteActionCompatParcelizer;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0642  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void read(java.lang.String r18, int r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertAlignmentToCss.read(java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x03d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03c6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void read(kotlin.convertAlignmentToCss r16, java.lang.String r17, int r18, java.lang.String r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertAlignmentToCss.read(o.convertAlignmentToCss, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x03ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ kotlin.DefaultBandwidthMeter1 write(kotlin.convertAlignmentToCss r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertAlignmentToCss.write(o.convertAlignmentToCss):o.DefaultBandwidthMeter1");
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x05d4  */
    @Override // kotlin.MarrowTheme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.C0156TypeKt AudioAttributesCompatParcelizer(o.MarrowTheme.AudioAttributesCompatParcelizer r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertAlignmentToCss.AudioAttributesCompatParcelizer(o.MarrowTheme$AudioAttributesCompatParcelizer):o.TypeKt");
    }

    @setSdkPayload
    public convertAlignmentToCss(isProtectedContentExtensionSupported isprotectedcontentextensionsupported, isSeekPending isseekpending, DefaultBandwidthMeter1 defaultBandwidthMeter1) {
        toMagicModuleMetaRepoModel.write(isprotectedcontentextensionsupported, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(defaultBandwidthMeter1, "");
        this.read = isprotectedcontentextensionsupported;
        this.IconCompatParcelizer = isseekpending;
        this.write = defaultBandwidthMeter1;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super String>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            Exception exc;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            try {
            } catch (Exception e) {
                exc = e;
                HashMap<String, String> mapAudioAttributesCompatParcelizer = VideoTimelineResponseBody.AudioAttributesCompatParcelizer(setAction.write("sync", "false"));
                this.RemoteActionCompatParcelizer = exc;
                this.AudioAttributesCompatParcelizer = 2;
                convertAlignmentToCss.write(convertAlignmentToCss.this).write(exc, "image_token_fetch", mapAudioAttributesCompatParcelizer);
            }
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                obj = convertAlignmentToCss.read(convertAlignmentToCss.this).RemoteActionCompatParcelizer(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    exc = (Exception) this.RemoteActionCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    convertAlignmentToCss.read(convertAlignmentToCss.this, this.write, 9002, DataSpecBuilder.write(exc.getMessage(), "token_fetch_unknown_exception"));
                    return null;
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return (String) obj;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return convertAlignmentToCss.this.new AudioAttributesCompatParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super String> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static void b(char c, int i, int i2, Object[] objArr) throws Throwable {
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i3 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver[i + i3])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (MotionEvent.axisFromString("") + 36622), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2339, Color.blue(0) + 28, 480654850, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i3), Long.valueOf(AudioAttributesImplApi26Parcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.blue(0), 9701 - (Process.myPid() >> 22), Color.alpha(0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23784, 33 - (KeyEvent.getMaxKeyCode() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23784, TextUtils.getTrimmedLength("") + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static {
        byte[] bArr = new byte[866];
        System.arraycopy("\u001e©ºß\u000e÷\u000fþûüËGò\u0014ý»\u0014.÷\u000fþûüà&ú\u0012ð\u0003\u0012ò\u000eÿ\u0010Ú\u001d\n\u0001þ\u0004\u000e÷\u000fþûüËJóü\u0004ÿ\u0010»\u00184ùò\u000e÷þ\u0002\u000búè\u001e\u000b\u0002ã\u0014ý\u0013ÿ\u0010Ý\u0012\u0003\tû\u0000í \u0005÷\fö\u0007\u0000Ù*\u0004Ö,þ\u0007ü\u000e÷\u000fþûüËIôý\u0013¸\u001e\u001b\u0015Í2ð\n\u0007\u0002\u0004üõ\fþ\u0012ìé\u0019\u0010îó\"î\u0014ò\u000e÷\u000fþûüËGò\u0014ý»'\u0012\u0014ýâ ö\u0004\bÿ\u0010Ü\u0018\u0001\u000eó\u0010Ï$\u0002\n\u0004ôø\u0016ìÎ?ö\u000eúÈ\u0016&ú\u0012â\u0013\r\u0005ñ\nö\u0003\u000e÷\u000fþûüËIôý\u0013¸\u001a,ð\u0016ô\f\u0006ÿ\u0010Î\"\u0012ýþ\n\u0000òã,ð\u0016ô\f\u0006ÿ\u0010Ý\u0012\u0003\tû\u0000í \u0005÷\fö\u0007\u0000Ù*\u0004Ò&\u0002\u0004ùø\u0016ìÎ?ö\u000eúÈ&\"ÿø\u0006úþýþ\fø\u0016ìÎ?ö\u000eúÈ\u001c&\u0007ò\u0003ÿ\u000eì\f\nñë\u0018\u0006\u0007ã\f\f\nñø\u0016ìÎ?ö\u000eúÈ\u00184ì\u0003\f\u0005ö\u0007\u0000\u000e÷\u000fþûüËH\u0000ö\u0004Ã'&øö\u0000ó\f\f\nñ\rÿ\u0004ýú\u0014Ý\u001cØ'\u0004ó\u0014\u000e÷\u000fþûüËIôý\u0013¸)\u0014ý\u0013Í-\u0000ù\u0004ÿ\u000fþð\u0014ö\u0007\u0000ÿ\u0010à\u0011\u0010þþ\u0001Ù\"\u0002ü\u0015ø\tÑ\"\bö\u0019ÿ\u0010Ú\u0015\u0018Ô\u001b\u0015Ë-ö\u0002ÿ\u0010á\u001fø\u0005\u0001ù\u0000é\u001a\nú\u000eõÿ\u0010á\u000e\u0010å\u0016\u0005ù\u000b\u0007\u0000ÿ\u0010à\u0011\u0010þþ\u0001× \u0012Õ\u001c\u0004\u0002à2þð\u0014ö\u0007\u0000ÿ\u0010á\u001c\u0007ï\u0006ì\u001a\u0004\u0002\u000e÷\u000fþûüËB\u0005¼##þõ\u0003\u000f\u0001\rÜ\u0016ü\u000e÷\u000fþûüËIôý\u0013¸)\u0014ý\u0013\rÿö\b\u0006øé\u0019ý\u0013\u0003þô\u0000ð\"î\u0014ò\u000f\u000e÷\u000fþûüËGò\bú\fù\b\u0000\f¶6\u0002\nõÎ\u0016\"\nõã#\b\u0001á$õÿ\u0014ö\u0007\u0000\r\u0000\tð\u000e\u0003Þ%í\u0012\u0003à\u0013ÿò\u001cÖ\"ÿâ\"\u0003\fô\u0001\u000fÿ\u0010Ó\u001c\u0004\u0006\u0006úß \u0004ÿè\u001a\nú\u000eõ\u0006÷\u0002\u0014Ø\u0018ÿ\u0010Ú\u0015\u0018ò\u0005\tùØ/ð\u0017ó\u0006úÝ\u001f\u0003\u0006þï\u0017\u0012ì\u000e÷\u000fþûüË:\fð\u0010ù\u0002û\u0011¼\u0016-þ\u0004\u0004\fô\u0001\nÿ\u0010Ú\u001d\u0006ü\u0005\tùÚ'þ\u0006úð\u0010\b\u0004õ\u0007\f\u0006ø\u0016ìÎ?ö\u000eúÈ'\u0015\u000bþ\të\u0002\u000búÿ\u0010Ú\u0019\u000f\u0001ï\u0007ÿÿ\u0010Ò \u0004ÿï\u001a\u0004\u0002ö\u0013\u0002Ö&÷\u0002\u0014Ø\u0018ô\u000fýþ\u000bðï\u0017\u0012ìÝ.÷ð\"î\u0014òÿ\u0010à\u0011\u0010þþ\u0001× \u0012â\u0017\u0012ìÿ\u0010Ü\u0018\u0001\u000eó\u0010Î&\u000fò\u000eöü\u000e÷\u000fþûüË:\fð\u0010ù\u0002û\u0011¼# û\u0006\u0007Óú\nú\u000eõ\f\u0005ùúø\u0016ìÎ?ö\u000eúÈ&\"ÿø\u0006úÜ4õ\u0004ù\u0002\u000e\u0010\u0001ö\n÷ÿ\u0010Ý#ô\u000f\u0001ó\u0000ð\"î\u0014òà2þð\u0014ö\u0007\u0000ô\u0000".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 866);
        AudioAttributesImplBaseParcelizer = bArr;
        AudioAttributesImplApi21Parcelizer = 201;
        write();
        write = 0;
        MediaBrowserCompatItemReceiver = 1;
        INSTANCE = new Companion(null);
    }

    static void write() {
        char[] cArr = new char[1233];
        ByteBuffer.wrap("0\u0081\u0087â^~\u0016àí|¥ú|d4ù\u008byCè\u001avÒì©taê8rðëGp\u001fîÖv®íew=ëôkLð\u0003hÛæ\u0092|jå!yùÿ°b\büß~\u0097ßn_&Æý\\µÂ\fZÄÄ\u009b@S×*WâÁ¹TqÒÈG\u0080ÑWQ/ÒæR¾ÍuMÍÖ\u0084W\\É\u0013UëÇ¢GzÛ1D\u0089Þ@[\u0018ÁïA§¢~ 6½\u008d!E¡\u001c:Ô¸«'c·:7ò¨I+\u0001³Ø/\u0090¥g0?®ö3Nµ\u0005,Ý¶\u0094?l©#)ûº²>\n¥Á%\u0099¾P?(¡ÿ!·\u0082\u000e\u0003Ü ØÃo ¶<þ¢\u0005>M¸\u0094&Ü»c;«ªò4:®A6\u0089¨Ð0\u0018©¯2÷¬>4F¯\u008d5Õ©\u001c)¤²ë*3¤z>\u0082§É8\u0011¼X à½7<\u007f\u009d\u0086\u0002Î\u0080\u0015\u001e]\u0084ä\u0000,\u009bs\u001b»\u008eÂ\u0014\n\u008eQ\u0016\u0099\u008c \bh\u0093¿\u0013Ç\u0099\u000e\fV\u008e\u009d\u001b%\u0089l\t´\u0096û\u0016\u0003\u0085J\u0005\u0092\u009aÙ\u001aa\u0081¨\u0001ð\u009e\u0007\u001fOý\u0096bÞæe~\u00adäôf<ûC{\u008bèÒj\u001a÷¡héë0pxò\u008fo×ò\u001el¦îís5ñ|h\u0084êËw\u0013üZdâæ){qøÜ!kB²ÞúC\u0001ÇI[\u0090ÄØMgØ¯VöÈ>UEÕ\u008dLÔÒ\u001cO«ÅóO:ÓBU\u0089ÌÑV\u0018Ð IïÉ7_~Æ\u0086^ÍÄ\u0015B\\ÛäA3Á{e\u0082þÊb\u0011àY{àå(dwø¿hÆè\u000euUõ\u009dh$òlo»êÃo\nïRy\u0099ì!jhÿ°iÿé\u0007zNú\u0096eÝåe~¬ÿôa\u0003ûK\u001f\u0092\u0081Ú\u0002a\u009c©\u0006ð\u00808\u0019G\u0099\u008f\u000eÖ\u0096\u001e\u0014¥\u008eí\u00134\u008d|\t\u008b\u0090Ó\u0010\u001a\u0093¢\ré\u00931\u0012x\u008a\u0080\u0014Ï\u0090\u0017\u0007^\u0087æ\u001e-\u0084u\u001a¼\u0082Ä\u001c\u0013\u0098[?â¿* q¢¹;À»\b$W§\u009f7&·n(µ¬ý3\u0004³L,\u009b¨#/j¯²0ùµ\u0001+Hµ\u00903ß¨g&®»ö?=¤E<\u008c¹Ô!c¡ªÂòDÜ!kB²ÞúB\u0001ÈI[\u0090ÛØGgØ¯HöÃ>UEÌ\u008dOÔÒ\u001cP«ÏóO:ÏBU\u0089ÌÑJ\u0018Ó IïÉ7]~Æ\u0086]ÍØ\u0015C\\ÃäZ3À{g\u0082ãÊ}\u0011äYgàú(xwì¿wÆî\u000ekUô\u009dk$ílq»ñÃz\nîRl\u0099ñ!whê°qÿö\u0007gNû\u0096eÝüe{¬âôy\u0003ùK\u001f\u0092\u0086Ú\u0002a\u009c©\u001að\u00878\u0004G\u0098\u008f\u0016Ö\u008b\u001e\u000b¥\u0094í\u000b4\u008e|\u0011\u008b\u0091Ó\u0012\u001a\u0091¢\ré\u00941\u0011x\u008a\u0080\u0016Ï\u009d\u0017\u0007^\u0087æ\u0018-\u009cu\u0003¼\u0083Ä\u001c\u0013\u0099[?â¿* q ¹;À¢\b\"W¸\u009f/&®n5µ¬ý'\u0004²L)\u009b¯#/j¯²0ù±\u0001+H²\u00905ß¨g&®»ö?=¤E:\u008c¢Ô8c ªÅò^9ÜAA\u0088ÀÐZ\u001fÀ§XîÎ6V}È\u0085LÌÓ\u0014O£ËëP2ÎzS\u0081ÙÉL\u0010ÊXWçÜ/Hvß¾SÅÅ\r[TÞ\u009cB+ßs^ºÿÂ`\tâQ|\u0098æ boù·yþé\u0006jMõ\u0095jÜédr³ðûn\u0002òJn\u0091ìÙr`õ¨j÷è?vFø\u008efÕü\u001dx¤ãì\u007f;ûC`\u008a\u009eÒ\u0003\u0019\u0089¡\u001cè\u009a0\u0007\u007f\u008c\u0087\u0018Î\u008e\u0016\u000b]\u0095å\r,\u008dt\u0012\u0083\u008cË\u000e\u0012\u008fZ\u000fá\u0093)\u0010p\u008b¸\u0013Ç\u0089\u000f\u0015V\u009f\u009e\u0006%\u0084m\u001a´\u009bü\u0002\u000b\u0080S\u001e\u009a¦\">i¼±\"ø¡\u0000:O¸\u0097%Þ\u00adf6\u00ad\u00adõ+<³D*\u0093\u00adÛ0b®ª0ñ\u00ad93@¾\u0088*×±\u001f4¦§î'5º}$\u0084¾Ì;\u001b¡£9ê@1Þy@\u0080ÆÈ[\u0017Û_GæÃ.Wu×½KÄÀ\fS[ÓãO*ÅrO¹ÏÁR\bÐPK\u009fÓ'QnÈ¶FýÙ\u0005XLÄ\u0094Z#ÛkA²Áú`\u0001ãI}\u0090ýØdgä¯yöå>bEö\u008dtÔë\u001cl«òól:äBo\u0089ïÑr\u0018ó kïë7v~ð\u0086gÍû\u0015q\\ääb3ý{x\u0082àÊ\u0002\u0011\u008bY\u001dà\u009d(\u0004w\u0083¿\u0019Æ\u0099\u000e\nU\u008c\u009d\u0015$\u0095l\u000e»\u0088Ô\u000fclºðòn\tòAm\u0098ìÐwoë§`þø6zMä\u0085}Üý\u0014`£þû`2øJc\u0081ãÙ|\u0010ä¨fçü?ivö\u008e~Åê\u001dpTôìo;ósK\u008aÐÂR\u0019ÉQUèÏ W\u007f×·MÎØ\u0006Z]Ï\u0095],ÅdE³ÞË_\u0002ÞZC\u0091ß)[`Ä¸F÷Û\u000fUFÈ\u009eRÕÊmP¤ÔüO\u000bÏC,\u009a\u00adÒ3i³¡(øª07O·\u0087$Þ§\u0016;\u00ad»å <£t?\u0083¿Û<\u0012¸ª#á£98p¼Ü!kB²ÞúF\u0001ÜIZ\u0090ÄØYgÙ¯HöÖ>MEÌ\u008dSÔÓ\u001cI«ÐóN:×BM\u0089ÍÑS\u0018Ê PïÓ7G~Ç\u0086_ÍÄ\u0015B\\ÙäA3Á{g\u0082þÊe\u0011ãY{àû(awø¿jÆì\u000euUé\u009ds$óle»ðÃv\núRm\u0099í!~hê°pÿý\u0007gNø\u0096qÝäeb¬ÿô}\u0003àK\u0005\u0092\u0082Ú\u001da\u009d©\u0006ð\u00878\u0019G\u0099\u008f\nÖ\u0088\u001e\u0015¥\u008eí\u000e4\u0092|\t\u008b\u008fÓ\u000f\u001a\u008f¢\u0010é\u00931\u000bx\u008b\u0080\u0014Ï\u0090\u0017\u0007^\u009fæ\u0005-\u009au\u0019¼\u0082Ä\u001c\u0013\u009a[?â¿* q¥¹;À¡\b9W¹\u009f*&¬n5µµý.\u0004©L1\u009b\u00ad#3j®²0ù²\u0001+H«\u00904ß¼g'®¿ö%=¹E;\u008c¢Ô c½ªÊò^9ÜAB\u0088ÇÐZ\u001fØ§FîÊ6V}Ô\u0085JÌÍ\u0014R£ÊëP2ÕzP\u0081ÍÉM\u0010ÖXPçÉ/IvÙ¾YÅÅ\r^TÜ\u009cB+Às^ºçÂ~\tçQd\u0098û {oç·`þ÷\u0006wMë\u0095jÜóds³ïûn\u009aþ-\u009dô\u0001¼\u009aG\u001b\u000f\u0084Ö\u0004\u009e\u0098!\u0007é\u0089°\u0016x\u008a\u0003\u0013Ë\u0094\u0092\rZ\u008fí\u0017µ\u0090|\u000b\u0004\u008bÏ\u0013\u0097\u0095^\fæ\u0096©\rq\u00828\u0019À\u009b\u008b\u0001S\u009c\u001a\u001c¢\u0085u\u001f=¹Ä5\u008c¢W\"\u001f°¦%n¼1<ù¨\u0080(H¿\u0013+Û\u00adb0*²ý/\u0085±L,\u0014¯ß3gµ.(ö¨¹7A \b&Ðº\u009b:#¡ê\"²¾E>\rÚÔA\u009cÃ'^ïÜ¶E~Ç\u0001ZÉÑ\u0090IXËãV«ÖrM:ÖÍQ\u0095Ð\\LäÒ¯KwË>UÆ×\u0089JQÃ\u0018Y ÀkN3Üú\\\u0082ÃUK\u001dà¤`lÿ7vÿä\u0086dNø\u0011{Ùè`q(òók»ôBq\nîÝneî,lôò¿rGê\u000ekÖö\u0099o!äèy°û{e\u0003ãÊ}\u0092å%cì\u0000´\u0080\u007f\u001c\u0007\u009bÎ\u0004\u0096\u0084Y\u0018á\u009e¨\bp\u0088;\u0014Ã\u0091\u008a\fR\u0092å\u001b\u00ad\u008ft\r<\u0091Ç\n\u008f\u008cV\u0014\u001e\u008e¡\u000bi\u00970\u0019ø\u0087\u0083\u0001K\u009b\u0012\u001dÚ\u0083m\n5\u009fü8\u0084¹O\"\u0017»Þ8f¥)'ñ¹¸5@©\u000b+Óµ\u009a8\"\u00adõ0½ºD0\f¬×*\u009f³&)î¯±6y¶\u0000&È¬\u0093:[ â<ª¼} \u0005«Ì@\u0094À_]çß®DvÞ9XÁÇ\u0088VPÖ\u001bJ£ÖjT2ÍÅO\u008dÐTM\u001cÑ§LoÉ6TþÔ\u0081IIÉ\u0010XØØcE+Äò\\ºÜMA\u0015ÇÜ`dà/}÷û¾dFä\tyÑþ\u0098h òëu³ëzr\u0002óÕn\u009dò$nìñ·s\u007fì\u0006nÎõ\u0091hYíàx¨øse;àÂ|\u008aü]aåë¬\u0080w\u0000?\u009dÆ\u0016\u008e\u0084Q\u0004\u0019\u0099 \u0012h\u00883\bû\u0092\u0082\u0017J\u008c\u001d\u0017¥\u0096l\u000f4\u0091ÿ\t\u0087\u008fN\u0013\u0016\u008fÙ\ra\u0096(\u0016ð\u0080»\u0004C\u009a\n\u001aÒ\u0084e\u0003-\u009eô\u0004¼¹G!\u000f£Ö;\u009e»!%é½°=x¨\u0003(Ë²\u00924Z¬í,µ¶|7\u0004°Ï0\u0097ª^+".getBytes(CharsetNames.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1233);
        MediaBrowserCompatCustomActionResultReceiver = cArr;
        AudioAttributesImplApi26Parcelizer = -5448397284052472973L;
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
            byte[] r0 = kotlin.convertAlignmentToCss.AudioAttributesImplBaseParcelizer
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
            int r9 = r9 + (-1)
            int r8 = r8 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertAlignmentToCss.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.convertAlignmentToCss$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/convertAlignmentToCss$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static String IconCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            String str = TestGroupLSModel.write((CharSequence) p0, (CharSequence) "?", false) ? "&" : "?";
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append(str);
            sb.append(p1);
            return sb.toString();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
