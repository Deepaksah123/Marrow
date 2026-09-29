package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0015BO\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010&"}, d2 = {"Lo/rendererSupportsTunneling;", "Lo/shouldEvaluateQueueSize;", "Lo/ServiceDescriptionElement;", "Landroid/content/Context;", "p0", "", "p1", "p2", "Landroid/text/SpannableStringBuilder;", "p3", "p4", "", "p5", "", "p6", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/text/SpannableStringBuilder;Ljava/lang/String;ZLjava/lang/Integer;)V", "", "IconCompatParcelizer", "()V", "Lo/rendererSupportsTunneling$RemoteActionCompatParcelizer;", "read", "(Lo/rendererSupportsTunneling$RemoteActionCompatParcelizer;)V", "RemoteActionCompatParcelizer", "()Lo/ServiceDescriptionElement;", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "write", "AudioAttributesImplApi21Parcelizer", "Landroid/text/SpannableStringBuilder;", "AudioAttributesCompatParcelizer", "Z", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/Integer;", "I", "Lo/rendererSupportsTunneling$RemoteActionCompatParcelizer;", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class rendererSupportsTunneling extends shouldEvaluateQueueSize<ServiceDescriptionElement> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final SpannableStringBuilder RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final Integer AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;
    private final String read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;
    private static final byte[] $$g = {45, -29, -71, -73, 70, -71, 5, 18, -2, -21, -7, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8, -14, -3, 3, 0, 20, 41, -29, -12, 16, -1, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8};
    private static final int $$h = 20;
    private static final byte[] $$a = {47, 110, -5, -26, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 219;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int RatingCompat = 1;
    private static char[] MediaBrowserCompatItemReceiver = {6469, 6474, 6476, 6479, 6466, 6494, 6507, 6477, 6464, 6523, 6488, 6475, 6467, 6470, 6465, 6490, 6471, 6522, 6496, 6468, 6481, 6492, 6473, 6406, 6491};
    private static char MediaBrowserCompatCustomActionResultReceiver = 11447;

    public interface RemoteActionCompatParcelizer {
        boolean read();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 12
            int r7 = r7 + 65
            byte[] r0 = kotlin.rendererSupportsTunneling.$$a
            int r8 = r8 * 10
            int r1 = r8 + 34
            int r6 = 79 - r6
            byte[] r1 = new byte[r1]
            int r8 = r8 + 33
            r2 = -1
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L31
        L17:
            r3 = r2
        L18:
            int r3 = r3 + 1
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L2a:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L31:
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.rendererSupportsTunneling.a(int, byte, int, java.lang.Object[]):void");
    }

    private static void c(short s, int i, short s2, Object[] objArr) {
        int i2 = 111 - s;
        int i3 = i * 2;
        byte[] bArr = $$g;
        int i4 = s2 + 4;
        byte[] bArr2 = new byte[i3 + 6];
        int i5 = i3 + 5;
        int i6 = -1;
        if (bArr == null) {
            i2 = i2 + (-i4) + 5;
            i4++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4;
            i2 = i2 + (-bArr[i4]) + 5;
            i4 = i8 + 1;
            i6 = i7;
        }
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 115;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        ServiceDescriptionElement serviceDescriptionElementRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i4 = RatingCompat + 37;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return serviceDescriptionElementRemoteActionCompatParcelizer;
    }

    private rendererSupportsTunneling(Context context, String str, String str2, SpannableStringBuilder spannableStringBuilder, String str3, boolean z, Integer num) {
        super(context, CmcdConfigurationRequestConfig.read());
        this.write = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = spannableStringBuilder;
        this.AudioAttributesCompatParcelizer = str3;
        this.IconCompatParcelizer = z;
        this.AudioAttributesImplBaseParcelizer = num;
        this.AudioAttributesImplApi26Parcelizer = 1;
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 51;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        this.AudioAttributesImplApi26Parcelizer = 0;
        int i5 = i3 + 21;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
    }

    public final void read(RemoteActionCompatParcelizer p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 11;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        this.MediaBrowserCompatCustomActionResultReceiver = p0;
        int i5 = i3 + 93;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
    }

    private ServiceDescriptionElement RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 51;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        ServiceDescriptionElement serviceDescriptionElementIconCompatParcelizer = ServiceDescriptionElement.IconCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(serviceDescriptionElementIconCompatParcelizer, "");
        int i4 = RatingCompat + 83;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return serviceDescriptionElementIconCompatParcelizer;
    }

    public static final class read {
        private boolean AudioAttributesCompatParcelizer;
        private SpannableStringBuilder AudioAttributesImplBaseParcelizer;
        private final Context IconCompatParcelizer;
        private String MediaBrowserCompatCustomActionResultReceiver;
        private Integer MediaBrowserCompatItemReceiver;
        private RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        private String read;
        private String write;

        public read(Context context) {
            toMagicModuleMetaRepoModel.write(context, "");
            this.IconCompatParcelizer = context;
            this.AudioAttributesCompatParcelizer = true;
        }

        public final read read(Integer num) {
            this.MediaBrowserCompatItemReceiver = num;
            return this;
        }

        public final read write(String str) {
            this.MediaBrowserCompatCustomActionResultReceiver = str;
            return this;
        }

        public final read read(String str) {
            this.write = str;
            return this;
        }

        public final read RemoteActionCompatParcelizer(String str) {
            this.read = str;
            return this;
        }

        public final read AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            return this;
        }

        public final read AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = false;
            return this;
        }

        public final rendererSupportsTunneling write() {
            rendererSupportsTunneling renderersupportstunneling = new rendererSupportsTunneling(this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.write, null, this.read, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, null);
            renderersupportstunneling.read(this.RemoteActionCompatParcelizer);
            return renderersupportstunneling;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x04a0  */
    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.rendererSupportsTunneling.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.getShowPopup write(kotlin.rendererSupportsTunneling r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            o.rendererSupportsTunneling$RemoteActionCompatParcelizer r1 = r5.MediaBrowserCompatCustomActionResultReceiver
            if (r1 == 0) goto L2d
            int r2 = kotlin.rendererSupportsTunneling.MediaBrowserCompatSearchResultReceiver
            int r3 = r2 + 125
            int r4 = r3 % 128
            kotlin.rendererSupportsTunneling.RatingCompat = r4
            int r3 = r3 % r0
            if (r1 == 0) goto L22
            int r2 = r2 + 43
            int r3 = r2 % 128
            kotlin.rendererSupportsTunneling.RatingCompat = r3
            int r2 = r2 % r0
            boolean r0 = r1.read()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L23
        L22:
            r0 = 0
        L23:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == r1) goto L30
        L2d:
            r5.dismiss()
        L30:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.rendererSupportsTunneling.write(o.rendererSupportsTunneling):o.getShowPopup");
    }

    private static void b(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = MediaBrowserCompatItemReceiver;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Process.myTid() >> 22), View.resolveSizeAndState(0, 0, 0) + 7015, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29, -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 7015 - View.MeasureSpec.getSize(0), 29 - TextUtils.indexOf((CharSequence) "", '0', 0), -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 91;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    int i9 = $10 + 111;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write + b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer >> 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer % b);
                    } else {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 48194), TextUtils.indexOf("", "", 0, 0) + 20126, TextUtils.getOffsetBefore("", 0) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 19368 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 18 - Color.blue(0), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i10 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i10];
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i11 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i12 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i11];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i12];
                        } else {
                            int i13 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i14 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i13];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i14];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            int i16 = $10 + 37;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr4[i15] = (char) (cArr4[i15] ^ 24705);
                i15 += 72;
            } else {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                i15++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(rendererSupportsTunneling renderersupportstunneling) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 71;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupWrite = write(renderersupportstunneling);
        int i4 = MediaBrowserCompatSearchResultReceiver + 105;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return getshowpopupWrite;
    }

    public /* synthetic */ rendererSupportsTunneling(Context context, String str, String str2, SpannableStringBuilder spannableStringBuilder, String str3, boolean z, Integer num, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, str, str2, spannableStringBuilder, str3, z, num);
    }
}
