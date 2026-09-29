package com.marrow.ui.activities.web.payment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import com.marrow.ui.activities.plan.PlanActivity;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.DownloadService;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.buildSetRequirementsIntent;
import kotlin.computeLine;
import kotlin.getLatestBitrateEstimate;
import kotlin.getMagicModuleMeta;
import kotlin.getStreamPositionUsForContent;
import kotlin.isDvbProfileDeclared;
import kotlin.rendererSupportsTunneling;
import kotlin.setSdkPayload;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.withAdGroupTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00172\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'"}, d2 = {"Lcom/marrow/ui/activities/web/payment/PaymentInternalWebActivity;", "Lo/parseRequiredLong;", "Lcom/razorpay/PaymentResultListener;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/webkit/WebView;", "Landroid/net/Uri;", "p1", "", "p2", "", "AudioAttributesCompatParcelizer", "(Landroid/webkit/WebView;Landroid/net/Uri;Ljava/lang/String;)Z", "Lorg/json/JSONObject;", "read", "(Lorg/json/JSONObject;)V", "onPaymentSuccess", "(Ljava/lang/String;)V", "", "onPaymentError", "(ILjava/lang/String;)V", "Lo/getStreamPositionUsForContent;", "preferenceDataProvider", "Lo/getStreamPositionUsForContent;", "getPreferenceDataProvider", "()Lo/getStreamPositionUsForContent;", "setPreferenceDataProvider", "(Lo/getStreamPositionUsForContent;)V", "Lo/withAdGroupTimeUs;", "decryptionDataProvider", "Lo/withAdGroupTimeUs;", "getDecryptionDataProvider", "()Lo/withAdGroupTimeUs;", "setDecryptionDataProvider", "(Lo/withAdGroupTimeUs;)V", "write_"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentInternalWebActivity extends computeLine implements PaymentResultListener {
    private static long AudioAttributesCompatParcelizer;
    private static int IconCompatParcelizer;
    private static long RemoteActionCompatParcelizer;
    private static char[] read;

    /* JADX INFO: renamed from: write_, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @setSdkPayload
    public withAdGroupTimeUs decryptionDataProvider;

    @setSdkPayload
    public getStreamPositionUsForContent preferenceDataProvider;
    private static final byte[] $$M = {91, -118, -51, -87};
    private static final int $$P = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$N = {11, 40, -34, 98, -64, 58, -1, 16, -47, 38, -4, -17, 20, -34, TarConstants.LF_BLK, -14, 1, 0, 14, -77, 84, -4, -8, 12, -14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -64, 58, -1, 16, -49, 46, -10, 22, -84, 30, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -41, 32, 19, -13, -20, 18, 18, -14, 3, 8, -2, 18, -20, 14, -4, -8, 12, -14};
    private static final int $$O = 254;
    private static final byte[] $$s = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$t = 200;
    private static int MediaDescriptionCompat = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$Q(short r5, short r6, short r7) {
        /*
            int r5 = r5 * 2
            int r5 = 1 - r5
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r6 = r6 + 101
            byte[] r0 = com.marrow.ui.activities.web.payment.PaymentInternalWebActivity.$$M
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r7]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.web.payment.PaymentInternalWebActivity.$$Q(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void A(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 44 - r8
            int r7 = r7 + 4
            int r6 = r6 + 65
            byte[] r1 = com.marrow.ui.activities.web.payment.PaymentInternalWebActivity.$$s
            byte[] r0 = new byte[r0]
            int r8 = 43 - r8
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L29:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            int r6 = r6 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.web.payment.PaymentInternalWebActivity.A(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void B(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = 119 - r7
            int r0 = 43 - r5
            int r6 = r6 * 3
            int r6 = 123 - r6
            byte[] r1 = com.marrow.ui.activities.web.payment.PaymentInternalWebActivity.$$N
            byte[] r0 = new byte[r0]
            int r5 = 42 - r5
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r1[r6]
            int r3 = r3 + 1
        L28:
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.web.payment.PaymentInternalWebActivity.B(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.marrow.ui.activities.web.payment.PaymentInternalWebActivity$write_, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/marrow/ui/activities/web/payment/PaymentInternalWebActivity$write_;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "Landroid/content/Intent;", "read", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent read(Context context, String str) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            Intent intent = new Intent(context, (Class<?>) PaymentInternalWebActivity.class);
            intent.putExtra("extra_web_type", 0);
            intent.putExtra("extra_web_content", str);
            intent.putExtra("android.intent.extra.TITLE", "");
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final getStreamPositionUsForContent getPreferenceDataProvider() {
        int i = 2 % 2;
        getStreamPositionUsForContent getstreampositionusforcontent = this.preferenceDataProvider;
        Object obj = null;
        if (getstreampositionusforcontent != null) {
            int i2 = MediaDescriptionCompat + 3;
            MediaBrowserCompatMediaItem = i2 % 128;
            if (i2 % 2 != 0) {
                return getstreampositionusforcontent;
            }
            throw null;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        int i3 = MediaBrowserCompatMediaItem + 117;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void setPreferenceDataProvider(getStreamPositionUsForContent getstreampositionusforcontent) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.preferenceDataProvider = getstreampositionusforcontent;
        int i4 = MediaBrowserCompatMediaItem + 15;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public final withAdGroupTimeUs getDecryptionDataProvider() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        withAdGroupTimeUs withadgrouptimeus = this.decryptionDataProvider;
        if (withadgrouptimeus != null) {
            return withadgrouptimeus;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        int i3 = MediaBrowserCompatMediaItem + 65;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void setDecryptionDataProvider(withAdGroupTimeUs withadgrouptimeus) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 57;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(withadgrouptimeus, "");
        this.decryptionDataProvider = withadgrouptimeus;
        int i4 = MediaDescriptionCompat + 97;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void z(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 31;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Color.alpha(0) + 12424, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1868 - Color.alpha(0), 9 - TextUtils.indexOf((CharSequence) "", '0'), 1983509525, false, $$Q(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $11 + 123;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        int i8 = $10 + 1;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void y(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = $10 + 37;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(read[i / i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Color.red(0) + 36621), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2340, ((byte) KeyEvent.getModifierMetaStateMask()) + 29, 480654850, false, $$Q(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.red(0), 9701 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {downloadService, downloadService};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), 23783 - TextUtils.indexOf((CharSequence) "", '0'), 33 - View.resolveSize(0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i6 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(read[i + i6])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36621), Color.red(0) + 2340, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, 480654850, false, $$Q(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 9701 - (ViewConfiguration.getTouchSlop() >> 8), 26 - (ViewConfiguration.getEdgeSlop() >> 16), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23783, (Process.myPid() >> 22) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i7 = $11 + 111;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr8 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) View.resolveSize(0, 0), 23785 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.MeasureSpec.getSize(0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
                throw null;
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr9 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 23784 - Color.red(0), 33 - Color.alpha(0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    public static final class RemoteActionCompatParcelizer implements rendererSupportsTunneling.RemoteActionCompatParcelizer {
        RemoteActionCompatParcelizer() {
        }

        @Override // o.rendererSupportsTunneling.RemoteActionCompatParcelizer
        public final boolean read() {
            PaymentInternalWebActivity paymentInternalWebActivity = PaymentInternalWebActivity.this;
            PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
            paymentInternalWebActivity.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(PaymentInternalWebActivity.this, "Pro Subscription Dialog", null));
            PaymentInternalWebActivity.this.finish();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f1  */
    @Override // kotlin.computeLine, kotlin.parseRequiredLong, kotlin.handleChildInline, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.web.payment.PaymentInternalWebActivity.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.parseRequiredLong
    public final boolean AudioAttributesCompatParcelizer(WebView p0, Uri p1, String p2) throws Throwable {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        String string = getString(R.string.app_scheme);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("://upgrade/");
        String string2 = sb.toString();
        List listIconCompatParcelizer = null;
        String string3 = p1 != null ? p1.toString() : null;
        if (string3 != null) {
            boolean zMediaBrowserCompatCustomActionResultReceiver = TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(string3, string2);
            int i2 = MediaDescriptionCompat;
            int i3 = i2 + 45;
            MediaBrowserCompatMediaItem = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 5;
            }
            if (zMediaBrowserCompatCustomActionResultReceiver) {
                int i5 = i2 + 89;
                MediaBrowserCompatMediaItem = i5 % 128;
                int i6 = i5 % 2;
                toMagicModuleMetaRepoModel.write((Object) string3);
                String strSubstring = string3.substring(string2.length(), string3.length());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                String strRemoteActionCompatParcelizer = getDecryptionDataProvider().RemoteActionCompatParcelizer(getPreferenceDataProvider().AudioAttributesImplBaseParcelizer(), strSubstring);
                if (strRemoteActionCompatParcelizer != null) {
                    int i7 = MediaDescriptionCompat + 27;
                    MediaBrowserCompatMediaItem = i7 % 128;
                    int i8 = i7 % 2;
                    listIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer(strRemoteActionCompatParcelizer, new char[]{'&'}, false, 0);
                }
                if (listIconCompatParcelizer != null) {
                    JSONObject jSONObject = new JSONObject();
                    Iterator it = listIconCompatParcelizer.iterator();
                    while (it.hasNext()) {
                        int i9 = MediaDescriptionCompat + 97;
                        MediaBrowserCompatMediaItem = i9 % 128;
                        int i10 = i9 % 2;
                        List listIconCompatParcelizer2 = TestGroupLSModel.IconCompatParcelizer((String) it.next(), new char[]{'='}, false, 0);
                        isDvbProfileDeclared.write(jSONObject, (String) listIconCompatParcelizer2.get(0), (String) listIconCompatParcelizer2.get(1));
                    }
                    read(jSONObject);
                }
                return true;
            }
        }
        return super.AudioAttributesCompatParcelizer(p0, p1, p2);
    }

    private final void read(JSONObject p0) throws Throwable {
        int i = 2 % 2;
        Checkout checkout = new Checkout();
        LoggedUser loggedUser = onRemoveQueueItemAt().getLoggedUser();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("email", true);
            jSONObject.put(NotesDispatchAddressRequestKt.KEY_CONTACT, true);
            p0.put("readonly", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("email", loggedUser.getEmail());
            jSONObject2.put(NotesDispatchAddressRequestKt.KEY_CONTACT, loggedUser.getInfo().getPhoneNumber().asSingleEntity());
            p0.put("prefill", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("email", loggedUser.getEmail());
            jSONObject3.put(NotesDispatchAddressRequestKt.KEY_CONTACT, loggedUser.getInfo().getPhoneNumber().asSingleEntity());
            jSONObject3.put("user_id", loggedUser.getInfo().getId());
            p0.put(CourseConfigKeyConstantsKt.KEY_NOTES, jSONObject3);
            checkout.open(this, p0);
            int i2 = MediaDescriptionCompat + 35;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            Toast.makeText(this, "Error in payment: ".concat(String.valueOf(e.getMessage())), 0).show();
            e.printStackTrace();
        }
    }

    @Override // com.razorpay.PaymentResultListener
    public final void onPaymentSuccess(String p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (p0 == null) {
            p0 = "";
        }
        getLatestBitrateEstimate.AudioAttributesImplApi21Parcelizer.write(p0);
        getPreferenceDataProvider().onCommand(null);
        aj_();
        new rendererSupportsTunneling.read(this).read(getString(R.string.text_upgrade_payment_successful)).RemoteActionCompatParcelizer(getString(R.string.btn_ok)).AudioAttributesCompatParcelizer(new RemoteActionCompatParcelizer()).write().show();
        int i3 = MediaDescriptionCompat + 121;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
    }

    @Override // com.razorpay.PaymentResultListener
    public final void onPaymentError(int p0, String p1) {
        String str;
        int i = 2 % 2;
        str = "";
        if (p0 == 0) {
            getLatestBitrateEstimate.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(p1 != null ? p1 : "");
        } else {
            if (p1 != null) {
                int i2 = MediaDescriptionCompat;
                int i3 = i2 + 113;
                MediaBrowserCompatMediaItem = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 63;
                MediaBrowserCompatMediaItem = i5 % 128;
                int i6 = i5 % 2;
                str = p1;
            }
            getLatestBitrateEstimate.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(str);
        }
        if (p0 == 0) {
            AudioAttributesCompatParcelizer("Payment Cancelled");
            return;
        }
        write(new ResponseError(p0, p1, false, 4, null));
        int i7 = MediaDescriptionCompat + 35;
        MediaBrowserCompatMediaItem = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // kotlin.computeLine, kotlin.parseRequiredLong, kotlin.handleChildInline, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.web.payment.PaymentInternalWebActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
    @Override // kotlin.computeLine, kotlin.parseRequiredLong, kotlin.handleChildInline, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.web.payment.PaymentInternalWebActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x08b2 A[Catch: all -> 0x0334, TryCatch #10 {all -> 0x0334, blocks: (B:126:0x08ac, B:128:0x08b2, B:129:0x08df, B:175:0x0b2e, B:177:0x0b34, B:178:0x0b5f, B:215:0x0f71, B:217:0x0f77, B:218:0x0fa1, B:251:0x130d, B:253:0x1313, B:254:0x1338, B:232:0x113d, B:234:0x115f, B:235:0x11a9, B:16:0x00fe, B:18:0x0104, B:19:0x0132, B:21:0x02a1, B:23:0x02d2, B:24:0x032e), top: B:295:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x098e A[Catch: all -> 0x099f, TryCatch #16 {all -> 0x099f, blocks: (B:135:0x0976, B:141:0x0985, B:145:0x0995, B:146:0x099e, B:143:0x098e, B:161:0x0a70, B:163:0x0a76, B:164:0x0a77, B:166:0x0a79, B:168:0x0a80, B:169:0x0a81, B:154:0x09f2, B:156:0x09ff, B:157:0x0a66, B:150:0x09a4, B:152:0x09b8, B:153:0x09ec), top: B:307:0x0976, outer: #1, inners: #6, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09b8 A[Catch: all -> 0x0a78, TryCatch #11 {all -> 0x0a78, blocks: (B:150:0x09a4, B:152:0x09b8, B:153:0x09ec), top: B:297:0x09a4, outer: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x09ff A[Catch: all -> 0x0a6e, TryCatch #6 {all -> 0x0a6e, blocks: (B:154:0x09f2, B:156:0x09ff, B:157:0x0a66), top: B:287:0x09f2, outer: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0cee  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0f51  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1032  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x107f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x10cd  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x12ed  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0338  */
    @Override // kotlin.computeLine, kotlin.parseRequiredLong, kotlin.handleChildInline, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.web.payment.PaymentInternalWebActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        IconCompatParcelizer = 0;
        onPrepareFromSearch();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 71;
        IconCompatParcelizer = i % 128;
        if (i % 2 != 0) {
            int i2 = 25 / 0;
        }
    }

    @Override // kotlin.computeLine, kotlin.parseRequiredLong, kotlin.handleChildInline, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 55;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatMediaItem + 41;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
    }

    static void onPrepareFromSearch() {
        read = new char[]{23803, 29959, 3864, 8497, 64313, 36172, 42828, 30993, 4973, 9570, 65482, 37307, 43916, 32162, 6067, 10690, 50137, 38346, 56417, 62854, 36799, 41404, 31652, 56429, 62865, 36750, 41383, 31663, 3546, 10202, 63879, 37877, 42487, 32514, 4435, 11049, 64824, 38706, 43352, 17226, 5446, 12142, 49532, 39588, 44171, 18076, 6332, 12965, 50387, 56431, 62922, 36826, 41395, 31651, 3543, 10207, 63947, 37792, 42417, 32577, 4420, 11021, 64829, 38690, 43268, 17164, 5450, 12153, 49461, 39619, 44166, 18056, 6368, 13052, 50385, 40598, 45260, 19115, 7354, 13892, 51281, 57865, 46189, 20092, 24656, 14914, 52336, 59004, 47166, 20880, 27604, 15851, 55272, 59888, 33666, 21952, 28660, 27800, 17768, 16174, 4420, 52048, 48423, 38697, 18750, 8991, 5401, 53170, 41443, 39848, 19920, 10196, 6561, 62382, 42430, 40849, 29082, 10804, 7287, 63096, 43090, 33284, 29734, 11877, '9', 64009, 44104, 34483, 30881, 21243, 1176, 65242, 53413, 56376, 62925, 36819, 41441, 31737, 3461, 10121, 63899, 37805, 42417, 32578, 53198, 58932, 39974, 45599, 26638, 7802, 13427, 60011, 32856, 46671, 27836};
        RemoteActionCompatParcelizer = 4325790659606345215L;
        AudioAttributesCompatParcelizer = 5212032605687718552L;
    }
}
