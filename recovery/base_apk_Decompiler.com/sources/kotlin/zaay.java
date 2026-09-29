package kotlin;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.Snackbar;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.api.models.response.plan.UpgradePlanResponse;
import com.marrow.kt.ui.activities.sync.SyncingActivity;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow.ui.activities.plan.renew.RenewActivity;
import com.marrow.ui.activities.web.payment.PaymentInternalWebActivity;
import com.marrow2.ui.main.viewmodel.HomeBlockingActivityViewModel;
import com.marrow2.ui.main.viewmodel.HomeSharedViewModel;
import com.marrow2.ui.settings.kyc.upload.service.ImageUploadService;
import java.lang.reflect.Method;
import kotlin.BitmapTeleporter;
import kotlin.DataBufferIterator;
import kotlin.DataBufferObserver;
import kotlin.DataBufferRef;
import kotlin.MergingMediaPeriodTimeOffsetSampleStream;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.checkPermissionState;
import kotlin.createStringSparseArray;
import kotlin.getAutofillClient;
import kotlin.hash;
import kotlin.setLogger;
import kotlin.setSmallestDisplacement;
import kotlin.setWatermarkEnabled;
import kotlin.zbi;
import kotlin.zbm;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000f\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J?\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u000f\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0003J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010\"J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010%J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020'H\u0002¢\u0006\u0004\b\u001e\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010.\u001a\u00020\u0006H\u0014¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\u0006H\u0014¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\u0003J\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u0010\u0003J\u001f\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u0010J)\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020 2\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u0003R\u001b\u0010\u001e\u001a\u0002058CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010\u000f\u001a\u00020:8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010=R\u0018\u0010!\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010?R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u0010CR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010CR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010CR\u0014\u0010B\u001a\u00020E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010F"}, d2 = {"Lo/zaay;", "Lo/zabz;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "RatingCompat", "onMediaButtonEvent", "onPlay", "", "p1", "read", "(Ljava/lang/String;Ljava/lang/String;)V", "onPlayFromUri", "onPrepareFromMediaId", "Lcom/marrow/data/api/models/response/plan/UpgradePlanResponse;", "(Lcom/marrow/data/api/models/response/plan/UpgradePlanResponse;)V", "onPrepareFromUri", "", "p2", "p3", "p4", "", "p5", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IJ)V", "onFastForward", "write", "(I)V", "", "IconCompatParcelizer", "(Z)V", "onAddQueueItem", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "onPrepare", "Lo/setLogger$write;", "(Lo/setLogger$write;)V", "onCustomAction", "handleMediaPlayPauseIfPendingOnHandler", "onPlayFromMediaId", "MediaBrowserCompatSearchResultReceiver", "onPrepareFromSearch", "onResume", "onStop", "onPlayFromSearch", "MediaDescriptionCompat", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Z)V", "MediaBrowserCompatCustomActionResultReceiver", "Lcom/marrow2/ui/main/viewmodel/HomeBlockingActivityViewModel;", "AudioAttributesImplApi21Parcelizer", "Lo/RenewEligible;", "onCommand", "()Lcom/marrow2/ui/main/viewmodel/HomeBlockingActivityViewModel;", "Lcom/marrow2/ui/main/viewmodel/HomeSharedViewModel;", "AudioAttributesImplApi26Parcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lcom/marrow2/ui/main/viewmodel/HomeSharedViewModel;", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "AudioAttributesImplBaseParcelizer", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "MediaBrowserCompatItemReceiver", "Lo/GservicesValue;", "Lo/GservicesValue;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zaay extends zabz {
    private static char[] MediaBrowserCompatItemReceiver;
    private static long MediaBrowserCompatSearchResultReceiver;
    private static int RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final RenewEligible read;
    private CountDownTimer IconCompatParcelizer;
    private static final byte[] $$l = {124, -87, 60, -63};
    private static final int $$o = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$v = {79, -100, -79, 21, 59, -63, -4, -21, 42, -55, -3, 11, -25, 5, -12, -5, 27, -34, -9, -6, -3, -16, -32, -18, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -18, -4, 57, -62, -1, -24, -7, 9, -19, -12, 5, -5, 56, -66, 3, -8, -14, -14, -2, -5, 58, -60, -3, -25, 13, -7, -13, -11, 4, TarConstants.LF_NORMAL, -66, 0, -13, TarConstants.LF_BLK, -9, 0, -34, 0, -13, 20, -9, -39, -37, 5, -9, 66, -52, -21, -28, 29, -43, 3, 5, 17, -25, -18, 2, -58, 11, -11, -12, 40, -57, -6, -4, 3, 1, -25, -5, 9, -20, 42, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19};
    private static final int $$w = 20;
    private static final byte[] $$d = {117, -12, 2, 85, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 114;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> AudioAttributesCompatParcelizer = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.zabp
        @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
        public final void IconCompatParcelizer(Object obj) {
            zaay.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> RemoteActionCompatParcelizer = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.zaM
        @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
        public final void IconCompatParcelizer(Object obj) {
            zaay.IconCompatParcelizer(this.IconCompatParcelizer, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> AudioAttributesImplApi26Parcelizer = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.zaN
        @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
        public final void IconCompatParcelizer(Object obj) {
            zaay.AudioAttributesCompatParcelizer(this.read, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> MediaBrowserCompatItemReceiver = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.zaK
        @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
        public final void IconCompatParcelizer(Object obj) {
            zaay.write(this.IconCompatParcelizer, (ActivityResult) obj);
        }
    });

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final GservicesValue AudioAttributesImplBaseParcelizer = new GservicesValue(new getCreatedOnDateMs() { // from class: o.zaL
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            Object[] objArr = {this.RemoteActionCompatParcelizer};
            int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
            return (getShowPopup) zaay.write(objArr, -1872571307, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1872571325, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        }
    }, new getCreatedOnDateMs() { // from class: o.zabq
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return zaay.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
        }
    }, new getCreatedOnDateMs() { // from class: o.zabs
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return zaay.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
        }
    }, new getCreatedOnDateMs() { // from class: o.zabf
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            Object[] objArr = {this.write};
            int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
            return (getShowPopup) zaay.write(objArr, -1959236167, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1959236177, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(short r5, int r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 104
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r5 = r5 * 3
            int r0 = 1 - r5
            byte[] r1 = kotlin.zaay.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r4 = r1[r7]
            int r3 = r3 + 1
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaay.$$r(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 + 65
            byte[] r0 = kotlin.zaay.$$d
            int r7 = 191 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r6
            r8 = r7
            r3 = r2
            goto L26
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L26:
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + (-1)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaay.g(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 111 - r7
            int r9 = 58 - r9
            int r8 = 124 - r8
            byte[] r0 = kotlin.zaay.$$v
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r8 = r9
            r4 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-6)
            r8 = r3
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaay.h(byte, byte, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        String string;
        String string2;
        int i7 = ~i;
        int i8 = ~(i6 | i7);
        int i9 = i3 | i8;
        int i10 = ~i3;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i3)) | (~(i10 | i));
        int i13 = i + i3 + i2 + (513088896 * i5) + ((-1342203445) * i4);
        int i14 = i13 * i13;
        int i15 = (665020156 * i) + 661520384 + (1303681286 * i3) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i2) + ((-771751936) * i5) + (1382285312 * i4) + ((-350355456) * i14);
        int i16 = ((i * (-363642324)) - 614971735) + (i3 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i2 * (-363641803)) + (i5 * (-2127225984)) + (i4 * (-1080704249)) + (i14 * (-1523187712));
        switch (i15 + (i16 * i16 * (-227409920))) {
            case 1:
                return write(objArr);
            case 2:
                zaay zaayVar = (zaay) objArr[0];
                int i17 = 2 % 2;
                int i18 = MediaDescriptionCompat + 65;
                MediaMetadataCompat = i18 % 128;
                int i19 = i18 % 2;
                buildResolutionString.IconCompatParcelizer("Update *** ->", "downloadStarted");
                zaay zaayVar2 = zaayVar;
                String string3 = zaayVar.getString(R.string.toast_update_downloading);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                CmcdConfigurationRequestConfig.read(zaayVar2, string3, 0);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                int i20 = MediaDescriptionCompat + 87;
                MediaMetadataCompat = i20 % 128;
                int i21 = i20 % 2;
                return getshowpopup;
            case 3:
                return AudioAttributesCompatParcelizer(objArr);
            case 4:
                zaay zaayVar3 = (zaay) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i22 = 2 % 2;
                if (iIntValue == 0) {
                    string2 = zaayVar3.getString(R.string.text_head_kyc_failed);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                    string = zaayVar3.getString(R.string.kyc_minor_warning);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                } else {
                    String string4 = zaayVar3.getString(R.string.text_head_kyc_failed_2);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
                    String string5 = zaayVar3.getString(R.string.kyc_major_warning, String.valueOf(iIntValue));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
                    int i23 = MediaDescriptionCompat + 63;
                    MediaMetadataCompat = i23 % 128;
                    int i24 = i23 % 2;
                    string = string5;
                    string2 = string4;
                }
                zbi.Companion writeVar = zbi.INSTANCE;
                zbi.Companion.RemoteActionCompatParcelizer(string2, string).show(zaayVar3.getSupportFragmentManager(), "");
                int i25 = MediaMetadataCompat + 65;
                MediaDescriptionCompat = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 5:
                return IconCompatParcelizer(objArr);
            case 6:
                return read(objArr);
            case 7:
                return RemoteActionCompatParcelizer(objArr);
            case 8:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 9:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 10:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 11:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 12:
                zaay zaayVar4 = (zaay) objArr[0];
                String str = (String) objArr[1];
                Bundle bundle = (Bundle) objArr[2];
                int i27 = 2 % 2;
                int i28 = MediaDescriptionCompat + 25;
                MediaMetadataCompat = i28 % 128;
                int i29 = i28 % 2;
                toMagicModuleMetaRepoModel.write(str, "");
                toMagicModuleMetaRepoModel.write(bundle, "");
                if (!bundle.getBoolean("cta_key_press")) {
                    return null;
                }
                zaayVar4.onCommand().write(new BitmapTeleporter.MediaBrowserCompatItemReceiver(bundle.getBoolean("switch_edition_key_press")));
                int i30 = MediaMetadataCompat + 113;
                MediaDescriptionCompat = i30 % 128;
                int i31 = i30 % 2;
                return null;
            case 13:
                zaay zaayVar5 = (zaay) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i32 = 2 % 2;
                int i33 = MediaDescriptionCompat + 69;
                MediaMetadataCompat = i33 % 128;
                int i34 = i33 % 2;
                zaayVar5.RemoteActionCompatParcelizer(zBooleanValue);
                int i35 = MediaDescriptionCompat + 29;
                MediaMetadataCompat = i35 % 128;
                int i36 = i35 % 2;
                return null;
            case 14:
                return MediaBrowserCompatItemReceiver(objArr);
            case 15:
                return MediaMetadataCompat(objArr);
            case 16:
                return MediaBrowserCompatSearchResultReceiver(objArr);
            case 17:
                return MediaBrowserCompatMediaItem(objArr);
            case 18:
                return MediaDescriptionCompat(objArr);
            default:
                zaay zaayVar6 = (zaay) objArr[0];
                String str2 = (String) objArr[1];
                Bundle bundle2 = (Bundle) objArr[2];
                int i37 = 2 % 2;
                int i38 = MediaMetadataCompat + 87;
                MediaDescriptionCompat = i38 % 128;
                int i39 = i38 % 2;
                MediaBrowserCompatSearchResultReceiver(zaayVar6, str2, bundle2);
                int i40 = MediaDescriptionCompat + 57;
                MediaMetadataCompat = i40 % 128;
                int i41 = i40 % 2;
                return null;
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(MediaBrowserCompatSearchResultReceiver ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $11 + 75;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(MediaBrowserCompatSearchResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 12425, 20 - (ViewConfiguration.getJumpTapTimeout() >> 16), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1868, (-16777206) - Color.rgb(0, 0, 0), 1983509525, false, $$r(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $11 + 31;
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
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    public zaay() {
        zaay zaayVar = this;
        this.write = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(HomeBlockingActivityViewModel.class), new AnonymousClass5(zaayVar), new AnonymousClass2(zaayVar), new AnonymousClass4(zaayVar));
        this.read = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(HomeSharedViewModel.class), new AnonymousClass3(zaayVar), new AnonymousClass1(zaayVar), new AnonymousClass7(zaayVar));
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(zaay zaayVar, int i) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 25;
        MediaMetadataCompat = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {zaayVar, Integer.valueOf(i)};
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(objArr, 205238365, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -205238361, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        int i5 = MediaDescriptionCompat + 17;
        MediaMetadataCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(zaay zaayVar, UpgradePlanResponse upgradePlanResponse) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.read(upgradePlanResponse);
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaDescriptionCompat + 1;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(zaay zaayVar, String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 19;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.RemoteActionCompatParcelizer(str, str2);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(zaay zaayVar, setLogger.write writeVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.write(writeVar);
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaMetadataCompat + 97;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 97;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.AudioAttributesCompatParcelizer(str, zBooleanValue);
        int i4 = MediaDescriptionCompat + 57;
        MediaMetadataCompat = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 75;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.IconCompatParcelizer(zBooleanValue);
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaDescriptionCompat + 121;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void MediaBrowserCompatMediaItem(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 49;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        zaayVar.MediaBrowserCompatCustomActionResultReceiver();
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaMetadataCompat + 39;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void MediaBrowserCompatSearchResultReceiver(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 57;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.handleMediaPlayPauseIfPendingOnHandler();
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaDescriptionCompat + 103;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 61;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.onPlayFromUri();
        int i4 = MediaDescriptionCompat + 121;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void MediaDescriptionCompat(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 59;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.onCustomAction();
        int i4 = MediaDescriptionCompat + 83;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ HomeBlockingActivityViewModel MediaMetadataCompat(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 15;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        HomeBlockingActivityViewModel homeBlockingActivityViewModelOnCommand = zaayVar.onCommand();
        int i4 = MediaDescriptionCompat + 11;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
        return homeBlockingActivityViewModelOnCommand;
    }

    public static final /* synthetic */ void RatingCompat(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 119;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.MediaDescriptionCompat();
        int i4 = MediaDescriptionCompat + 51;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(zaay zaayVar, String str, int i, String str2, String str3, int i2, long j) {
        int i3 = 2 % 2;
        int i4 = MediaMetadataCompat + 125;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {zaayVar, str, Integer.valueOf(i), str2, str3, Integer.valueOf(i2), Long.valueOf(j)};
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(objArr, -663307876, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 663307884, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        int i6 = MediaDescriptionCompat + 21;
        MediaMetadataCompat = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void handleMediaPlayPauseIfPendingOnHandler(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 59;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.onAddQueueItem();
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        int i5 = MediaMetadataCompat + 35;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onAddQueueItem(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 27;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.onFastForward();
        int i4 = MediaMetadataCompat + 51;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onCommand(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 73;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.onPrepareFromMediaId();
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onCustomAction(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 5;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.onPrepare();
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
    }

    public static final /* synthetic */ void onPause(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.onPrepareFromUri();
        int i4 = MediaDescriptionCompat + 89;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onPlay(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 29;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar}, 1974479193, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -1974479192, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        int i4 = MediaDescriptionCompat + 87;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
    }

    public static final /* synthetic */ void read(zaay zaayVar, String str) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 45;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.read(str);
        int i4 = MediaMetadataCompat + 55;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    public static final /* synthetic */ void read(zaay zaayVar, String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 49;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.read(str, str2);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
    }

    public static final /* synthetic */ void write(zaay zaayVar, int i) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 63;
        MediaMetadataCompat = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {zaayVar, Integer.valueOf(i)};
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer4 = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        if (i4 == 0) {
            write(objArr, 368762581, iAudioAttributesCompatParcelizer2, -368762575, iAudioAttributesCompatParcelizer4, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer);
            throw null;
        }
        write(objArr, 368762581, iAudioAttributesCompatParcelizer2, -368762575, iAudioAttributesCompatParcelizer4, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer);
        int i5 = MediaDescriptionCompat + 25;
        MediaMetadataCompat = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final HomeBlockingActivityViewModel onCommand() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        HomeBlockingActivityViewModel homeBlockingActivityViewModel = (HomeBlockingActivityViewModel) this.write.RemoteActionCompatParcelizer();
        int i4 = MediaDescriptionCompat + 79;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
        return homeBlockingActivityViewModel;
    }

    private final HomeSharedViewModel MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 59;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        HomeSharedViewModel homeSharedViewModel = (HomeSharedViewModel) this.read.RemoteActionCompatParcelizer();
        int i4 = MediaDescriptionCompat + 123;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return homeSharedViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: o.zaay$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$read.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$read = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zaay$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$read.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$read = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zaay$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$RemoteActionCompatParcelizer.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zaay$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$AudioAttributesCompatParcelizer.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zaay$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ MediaBrowserCompatMediaItem $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$AudioAttributesCompatParcelizer.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zaay$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $read = null;
        private /* synthetic */ MediaBrowserCompatMediaItem $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$write.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$write = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataBufferIterator> setupdatedstatusIconCompatParcelizer = zaay.MediaMetadataCompat(zaay.this).IconCompatParcelizer();
                final zaay zaayVar = zaay.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.zaay.write.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((DataBufferIterator) obj2);
                    }

                    private Object read(DataBufferIterator dataBufferIterator) throws Throwable {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferIterator, DataBufferIterator.AudioAttributesCompatParcelizer.INSTANCE)) {
                            zaay.onAddQueueItem(zaayVar);
                        } else {
                            if (dataBufferIterator instanceof DataBufferIterator.handleMediaPlayPauseIfPendingOnHandler) {
                                Object[] objArr = {zaayVar, Boolean.valueOf(((DataBufferIterator.handleMediaPlayPauseIfPendingOnHandler) dataBufferIterator).AudioAttributesCompatParcelizer())};
                                int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
                                zaay.write(objArr, -647093311, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 647093325, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
                                zaay.MediaMetadataCompat(zaayVar).write(BitmapTeleporter.write.INSTANCE);
                                return getShowPopup.INSTANCE;
                            }
                            if (dataBufferIterator instanceof DataBufferIterator.write) {
                                DataBufferIterator.write writeVar = (DataBufferIterator.write) dataBufferIterator;
                                if (writeVar.IconCompatParcelizer() && DefaultTrackNameProvider.AudioAttributesCompatParcelizer(zaayVar, ImageUploadService.class)) {
                                    Object[] objArr2 = {zaayVar, false};
                                    int iAudioAttributesCompatParcelizer2 = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
                                    zaay.write(objArr2, -1810286044, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1810286057, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2);
                                } else {
                                    Object[] objArr3 = {zaayVar, Boolean.valueOf(writeVar.IconCompatParcelizer())};
                                    int iAudioAttributesCompatParcelizer3 = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
                                    zaay.write(objArr3, -1810286044, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1810286057, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3);
                                }
                                zaay.MediaMetadataCompat(zaayVar).write(BitmapTeleporter.write.INSTANCE);
                                return getShowPopup.INSTANCE;
                            }
                            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferIterator, DataBufferIterator.IconCompatParcelizer.INSTANCE)) {
                                zaay.handleMediaPlayPauseIfPendingOnHandler(zaayVar);
                                zaay.MediaMetadataCompat(zaayVar).write(BitmapTeleporter.write.INSTANCE);
                            } else if (dataBufferIterator instanceof DataBufferIterator.RemoteActionCompatParcelizer) {
                                zaay.AudioAttributesCompatParcelizer(zaayVar, ((DataBufferIterator.RemoteActionCompatParcelizer) dataBufferIterator).getRemoteActionCompatParcelizer());
                            } else if (dataBufferIterator instanceof DataBufferIterator.AudioAttributesImplBaseParcelizer) {
                                zaay.write(zaayVar, ((DataBufferIterator.AudioAttributesImplBaseParcelizer) dataBufferIterator).getAudioAttributesCompatParcelizer());
                            } else if (dataBufferIterator instanceof DataBufferIterator.MediaBrowserCompatItemReceiver) {
                                DataBufferIterator.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (DataBufferIterator.MediaBrowserCompatItemReceiver) dataBufferIterator;
                                zaay.read(zaayVar, mediaBrowserCompatItemReceiver.IconCompatParcelizer(), mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer());
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferIterator, DataBufferIterator.MediaMetadataCompat.INSTANCE)) {
                                zaay.onCustomAction(zaayVar);
                            } else if (dataBufferIterator instanceof DataBufferIterator.MediaBrowserCompatMediaItem) {
                                zaay.read(zaayVar, ((DataBufferIterator.MediaBrowserCompatMediaItem) dataBufferIterator).read());
                            } else {
                                if (dataBufferIterator instanceof DataBufferIterator.MediaDescriptionCompat) {
                                    DataBufferIterator.MediaDescriptionCompat mediaDescriptionCompat = (DataBufferIterator.MediaDescriptionCompat) dataBufferIterator;
                                    String strWrite = mediaDescriptionCompat.write();
                                    String str = mediaDescriptionCompat.read();
                                    String strRemoteActionCompatParcelizer = mediaDescriptionCompat.RemoteActionCompatParcelizer();
                                    zaay.RemoteActionCompatParcelizer(zaayVar, strWrite, mediaDescriptionCompat.AudioAttributesCompatParcelizer(), strRemoteActionCompatParcelizer, str, mediaDescriptionCompat.AudioAttributesImplBaseParcelizer(), mediaDescriptionCompat.IconCompatParcelizer());
                                    zaay.MediaMetadataCompat(zaayVar).write(BitmapTeleporter.write.INSTANCE);
                                    return getShowPopup.INSTANCE;
                                }
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferIterator, DataBufferIterator.onCommand.INSTANCE)) {
                                    zaay.onPause(zaayVar);
                                } else if (dataBufferIterator instanceof DataBufferIterator.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                                    zaay.AudioAttributesCompatParcelizer(zaayVar, ((DataBufferIterator.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) dataBufferIterator).AudioAttributesCompatParcelizer());
                                    zaay.MediaMetadataCompat(zaayVar).write(BitmapTeleporter.write.INSTANCE);
                                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferIterator, DataBufferIterator.onAddQueueItem.INSTANCE)) {
                                    zaay.onPlay(zaayVar);
                                } else {
                                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferIterator, DataBufferIterator.read.INSTANCE)) {
                                        zaay.RatingCompat(zaayVar);
                                        return getShowPopup.INSTANCE;
                                    }
                                    if (dataBufferIterator instanceof DataBufferIterator.AudioAttributesImplApi21Parcelizer) {
                                        DataBufferIterator.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (DataBufferIterator.AudioAttributesImplApi21Parcelizer) dataBufferIterator;
                                        zaay.AudioAttributesCompatParcelizer(zaayVar, audioAttributesImplApi21Parcelizer.write(), audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer());
                                        return getShowPopup.INSTANCE;
                                    }
                                    if (dataBufferIterator instanceof DataBufferIterator.RatingCompat) {
                                        zaay zaayVar2 = zaayVar;
                                        DataBufferIterator.RatingCompat ratingCompat = (DataBufferIterator.RatingCompat) dataBufferIterator;
                                        String str2 = ratingCompat.read();
                                        boolean zRemoteActionCompatParcelizer = ratingCompat.RemoteActionCompatParcelizer();
                                        ratingCompat.IconCompatParcelizer();
                                        Object[] objArr4 = {zaayVar2, str2, Boolean.valueOf(zRemoteActionCompatParcelizer)};
                                        int iAudioAttributesCompatParcelizer4 = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
                                        zaay.write(objArr4, -1079043106, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1079043115, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer4);
                                    } else if (dataBufferIterator instanceof DataBufferIterator.AudioAttributesImplApi26Parcelizer) {
                                        TrainingApplication.read().logout(((DataBufferIterator.AudioAttributesImplApi26Parcelizer) dataBufferIterator).IconCompatParcelizer(), null);
                                    } else if (dataBufferIterator instanceof DataBufferIterator.MediaBrowserCompatSearchResultReceiver) {
                                        zaay.AudioAttributesCompatParcelizer(zaayVar, ((DataBufferIterator.MediaBrowserCompatSearchResultReceiver) dataBufferIterator).read());
                                    } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferIterator, DataBufferIterator.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                                        throw new RenewEligibleCreator();
                                    }
                                }
                            }
                        }
                        zaay.MediaMetadataCompat(zaayVar).write(BitmapTeleporter.AudioAttributesImplApi26Parcelizer.INSTANCE);
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zaay.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<DataBufferObserver> newNumberOtpResendRequest = zaay.MediaMetadataCompat(zaay.this).read();
                final zaay zaayVar = zaay.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (newNumberOtpResendRequest.write(new getValidationToken() { // from class: o.zaay.read.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((DataBufferObserver) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(DataBufferObserver dataBufferObserver) {
                        if (dataBufferObserver instanceof DataBufferObserver.RemoteActionCompatParcelizer) {
                            zaay.write(zaayVar, ((DataBufferObserver.RemoteActionCompatParcelizer) dataBufferObserver).RemoteActionCompatParcelizer());
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferObserver, DataBufferObserver.IconCompatParcelizer.INSTANCE)) {
                            if (dataBufferObserver instanceof DataBufferObserver.AudioAttributesImplApi21Parcelizer) {
                                CmcdConfigurationRequestConfig.read(zaayVar, ((DataBufferObserver.AudioAttributesImplApi21Parcelizer) dataBufferObserver).read(), 0);
                            } else if (dataBufferObserver instanceof DataBufferObserver.write) {
                                DataBufferObserver.write writeVar = (DataBufferObserver.write) dataBufferObserver;
                                CmcdConfigurationRequestConfig.write(zaayVar, writeVar.AudioAttributesCompatParcelizer(), writeVar.write());
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferObserver, DataBufferObserver.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                                zaay.onCommand(zaayVar);
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferObserver, DataBufferObserver.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                                zaay.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(zaayVar);
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferObserver, DataBufferObserver.AudioAttributesCompatParcelizer.INSTANCE)) {
                                zaay.MediaBrowserCompatMediaItem(zaayVar);
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferObserver, DataBufferObserver.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                                zaay.MediaDescriptionCompat(zaayVar);
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dataBufferObserver, DataBufferObserver.read.INSTANCE)) {
                                zaay.MediaBrowserCompatSearchResultReceiver(zaayVar);
                            }
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
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

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zaay.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static void e(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = MediaBrowserCompatItemReceiver;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 51;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11613, KeyEvent.getDeadChar(0, 0) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.getDefaultSize(0, 0), 11613 - View.MeasureSpec.getMode(0), KeyEvent.getDeadChar(0, 0) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                }
                i7++;
                i = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i9 = $11 + 113;
                $10 = i9 % 128;
                if (i9 % 2 == 0 ? bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1 : bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1) {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31590 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9863, 65 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(obj, objArr4)).charValue();
                } else {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 22959 - View.getDefaultSize(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 44, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(obj, objArr5)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 37822), 9754 - (ViewConfiguration.getEdgeSlop() >> 16), Color.blue(0) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i12 = $11 + 29;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 0, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 % i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 + i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i13 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i13, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i13);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            int i14 = $11 + 35;
            $10 = i14 % 128;
            int i15 = 2;
            int i16 = i14 % 2;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i17 = $11 + 19;
                $10 = i17 % 128;
                int i18 = i17 % i15;
                cArr7[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                i15 = 2;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            int i19 = $10 + 67;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x009a  */
    @Override // kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2069
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaay.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.zaO, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 9;
        int i3 = i2 % 128;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        CountDownTimer countDownTimer = this.IconCompatParcelizer;
        if (countDownTimer != null) {
            int i5 = i3 + 103;
            MediaMetadataCompat = i5 % 128;
            int i6 = i5 % 2;
            countDownTimer.cancel();
            int i7 = MediaDescriptionCompat + 19;
            MediaMetadataCompat = i7 % 128;
            int i8 = i7 % 2;
        }
        super.onDestroy();
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        ActivityResult activityResult = (ActivityResult) objArr[1];
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 55;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(activityResult, "");
            zaayVar.onCommand().write(BitmapTeleporter.read.INSTANCE);
            throw null;
        }
        toMagicModuleMetaRepoModel.write(activityResult, "");
        zaayVar.onCommand().write(BitmapTeleporter.read.INSTANCE);
        int i3 = MediaDescriptionCompat + 83;
        MediaMetadataCompat = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
        return null;
    }

    private static final void AudioAttributesImplBaseParcelizer(zaay zaayVar, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 121;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(activityResult, "");
        zaayVar.onCommand().write(BitmapTeleporter.AudioAttributesCompatParcelizer.INSTANCE);
        int i4 = MediaMetadataCompat + 107;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void RatingCompat() {
        int i = 2 % 2;
        AudioAttributesImplApi21Parcelizer().IconCompatParcelizer.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zabm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zaay.read(this.read);
            }
        });
        int i2 = MediaMetadataCompat + 23;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
    }

    private static /* synthetic */ Object MediaBrowserCompatSearchResultReceiver(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        int i = 2 % 2;
        zaayVar.AudioAttributesCompatParcelizer.read(new Intent(zaayVar, (Class<?>) SsChunkSource.class));
        int i2 = MediaDescriptionCompat + 59;
        MediaMetadataCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onMediaButtonEvent() {
        int i = 2 % 2;
        zaay zaayVar = this;
        CmcdConfigurationRequestConfig.read(zaayVar, new write(null));
        CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(zaayVar, new read(null));
        int i2 = MediaMetadataCompat + 37;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void AudioAttributesImplBaseParcelizer(zaay zaayVar, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (!(!bundle.getBoolean("positive_key_press"))) {
            int i4 = MediaDescriptionCompat + 63;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            HomeBlockingActivityViewModel homeBlockingActivityViewModelOnCommand = zaayVar.onCommand();
            if (i5 == 0) {
                homeBlockingActivityViewModelOnCommand.write(BitmapTeleporter.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
                throw null;
            }
            homeBlockingActivityViewModelOnCommand.write(BitmapTeleporter.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
            int i6 = MediaMetadataCompat + 73;
            MediaDescriptionCompat = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        String str = (String) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("confirmation_key_press")) {
            int i2 = MediaDescriptionCompat + 31;
            MediaMetadataCompat = i2 % 128;
            int i3 = i2 % 2;
            zaayVar.onCommand().write(BitmapTeleporter.RemoteActionCompatParcelizer.INSTANCE);
            return null;
        }
        if (!bundle.getBoolean("terms_key_press")) {
            if (bundle.getBoolean("privacy_key_press")) {
                zaayVar.onCommand().write(BitmapTeleporter.AudioAttributesImplBaseParcelizer.INSTANCE);
            }
            return null;
        }
        int i4 = MediaMetadataCompat + 17;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        zaayVar.onCommand().write(BitmapTeleporter.AudioAttributesImplApi21Parcelizer.INSTANCE);
        return null;
    }

    private static final void MediaBrowserCompatCustomActionResultReceiver(zaay zaayVar, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 39;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (!bundle.getBoolean("positive_key_press")) {
            return;
        }
        int i4 = MediaDescriptionCompat + 63;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
        HomeBlockingActivityViewModel homeBlockingActivityViewModelOnCommand = zaayVar.onCommand();
        if (i5 != 0) {
            homeBlockingActivityViewModelOnCommand.write(BitmapTeleporter.IconCompatParcelizer.INSTANCE);
            return;
        }
        homeBlockingActivityViewModelOnCommand.write(BitmapTeleporter.IconCompatParcelizer.INSTANCE);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void MediaDescriptionCompat(zaay zaayVar, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 87;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
            bundle.getBoolean("positive_key_press");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("positive_key_press")) {
            int i3 = MediaDescriptionCompat + 61;
            MediaMetadataCompat = i3 % 128;
            int i4 = i3 % 2;
            if (zaayVar.onCommand().getOnCommand().length() > 0) {
                PaymentInternalWebActivity.Companion companion = PaymentInternalWebActivity.INSTANCE;
                zaayVar.startActivity(PaymentInternalWebActivity.Companion.read(zaayVar, zaayVar.onCommand().getOnCommand()));
            }
        }
    }

    private final void onPlay() {
        int i = 2 % 2;
        zaay zaayVar = this;
        getSupportFragmentManager().IconCompatParcelizer("kyc_failed_dialog_key", zaayVar, new _addFields() { // from class: o.zabc
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                zaay.AudioAttributesCompatParcelizer(this.read, str, bundle);
            }
        });
        getSupportFragmentManager().IconCompatParcelizer("tnq_dialog_key", zaayVar, new _addFields() { // from class: o.zabe
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                zaay.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, str, bundle);
            }
        });
        getSupportFragmentManager().IconCompatParcelizer("legal_dialog_key", zaayVar, new _addFields() { // from class: o.zabh
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                zaay.read(this.read, str, bundle);
            }
        });
        getSupportFragmentManager().IconCompatParcelizer("new_edition_dialog_key", zaayVar, new _addFields() { // from class: o.zabl
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                zaay.IconCompatParcelizer(this.read, str, bundle);
            }
        });
        getSupportFragmentManager().IconCompatParcelizer(SmsRetrieverStatusCodes.IconCompatParcelizer.getWrite(), zaayVar, new _addFields() { // from class: o.zabj
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                Object[] objArr = {this.RemoteActionCompatParcelizer, str, bundle};
                int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
                zaay.write(objArr, -1976518140, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1976518155, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
            }
        });
        getSupportFragmentManager().IconCompatParcelizer(SmsRetrieverStatusCodes.MediaBrowserCompatItemReceiver.getWrite(), zaayVar, new _addFields() { // from class: o.zabi
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                Object[] objArr = {this.read, str, bundle};
                int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
                zaay.write(objArr, -1186456553, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1186456553, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
            }
        });
        int i2 = MediaDescriptionCompat + 17;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void MediaBrowserCompatSearchResultReceiver(zaay zaayVar, String str, Bundle bundle) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("positive_key_press")) {
            int i2 = MediaMetadataCompat + 113;
            MediaDescriptionCompat = i2 % 128;
            if (i2 % 2 != 0) {
                zaayVar.onCommand().getHandleMediaPlayPauseIfPendingOnHandler();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (zaayVar.onCommand().getHandleMediaPlayPauseIfPendingOnHandler()) {
                zaayVar.finish();
            } else {
                zaayVar.onCommand().write(BitmapTeleporter.read.INSTANCE);
            }
            String strAudioAttributesImplApi21Parcelizer = zaayVar.onCommand().getOnAddQueueItem();
            if (strAudioAttributesImplApi21Parcelizer == null) {
                dispatchTouchEvent.AudioAttributesCompatParcelizer(zaayVar);
                return;
            }
            int i3 = MediaDescriptionCompat + 101;
            MediaMetadataCompat = i3 % 128;
            int i4 = i3 % 2;
            joinWithSeparator.AudioAttributesCompatParcelizer(zaayVar, strAudioAttributesImplApi21Parcelizer);
        }
    }

    private final void read(String p0, String p1) {
        int i = 2 % 2;
        createStringSparseArray.Companion readVar = createStringSparseArray.INSTANCE;
        startActivity(createStringSparseArray.Companion.write(this, new readList(p0, p1)));
        int i2 = MediaDescriptionCompat + 9;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
    }

    private final void onPlayFromUri() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 53;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.RemoteActionCompatParcelizer;
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(PlanActivity.AudioAttributesCompatParcelizer.read(this, "renew_toast"));
        int i4 = MediaDescriptionCompat + 107;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onPrepareFromMediaId() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) SyncingActivity.class));
        finish();
        int i2 = MediaDescriptionCompat + 27;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void read(UpgradePlanResponse p0) {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        String description = p0.getDescription();
        Object obj = null;
        if (description != null) {
            String str4 = parseDolbyChannelConfiguration.read(p0.getPrice());
            StringBuilder sb = new StringBuilder("<b>");
            sb.append(str4);
            sb.append("</b>");
            str = TestGroupLSModel.read(description, "{amount}", sb.toString(), false);
            int i2 = MediaDescriptionCompat + 41;
            MediaMetadataCompat = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = null;
        }
        if (str == null) {
            int i4 = MediaMetadataCompat;
            int i5 = i4 + 95;
            MediaDescriptionCompat = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = i4 + 99;
            MediaDescriptionCompat = i6 % 128;
            int i7 = i6 % 2;
            str2 = "";
        } else {
            str2 = str;
        }
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String title = p0.getTitle();
        String str5 = title == null ? "" : title;
        String bigButtonText = p0.getBigButtonText();
        if (bigButtonText == null) {
            int i8 = MediaMetadataCompat + 43;
            MediaDescriptionCompat = i8 % 128;
            int i9 = i8 % 2;
            str3 = "";
        } else {
            str3 = bigButtonText;
        }
        String smallButtonText = p0.getSmallButtonText();
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(str5, str2, str3, smallButtonText == null ? "" : smallButtonText, R.drawable.ic_upgrade_plan_rocket, SmsRetrieverStatusCodes.IconCompatParcelizer, false, false, null, 448).show(getSupportFragmentManager(), "");
    }

    private final void onPrepareFromUri() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 43;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        checkPermissionState.Companion iconCompatParcelizer = checkPermissionState.INSTANCE;
        checkPermissionState.Companion.write().show(getSupportFragmentManager(), "");
        int i4 = MediaDescriptionCompat + 119;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onPrepareFromMediaId(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 67;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.onCommand().write(BitmapTeleporter.MediaMetadataCompat.INSTANCE);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void IconCompatParcelizer(java.lang.String r16, kotlin.zaay r17, int r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaay.IconCompatParcelizer(java.lang.String, o.zaay, int, java.lang.String, java.lang.String):void");
    }

    private static final void onPrepareFromSearch(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.onCommand().write(BitmapTeleporter.MediaBrowserCompatSearchResultReceiver.INSTANCE);
        int i4 = MediaMetadataCompat + 29;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onSeekTo(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.onCommand().write(BitmapTeleporter.MediaBrowserCompatSearchResultReceiver.INSTANCE);
        int i4 = MediaMetadataCompat + 111;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesImplApi21Parcelizer(java.lang.Object[] r13) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaay.AudioAttributesImplApi21Parcelizer(java.lang.Object[]):java.lang.Object");
    }

    private final void onFastForward() {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8;
        Intent intentAudioAttributesCompatParcelizer;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.AudioAttributesImplApi26Parcelizer;
            setWatermarkEnabled.Companion companion = setWatermarkEnabled.INSTANCE;
            intentAudioAttributesCompatParcelizer = setWatermarkEnabled.Companion.AudioAttributesCompatParcelizer(this, true, true, 2);
        } else {
            r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.AudioAttributesImplApi26Parcelizer;
            setWatermarkEnabled.Companion companion2 = setWatermarkEnabled.INSTANCE;
            intentAudioAttributesCompatParcelizer = setWatermarkEnabled.Companion.AudioAttributesCompatParcelizer(this, false, true, 2);
        }
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(intentAudioAttributesCompatParcelizer);
    }

    private static final void read(zaay zaayVar, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 11;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == 10) {
            int i4 = MediaMetadataCompat + 117;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            zaayVar.finish();
        }
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        ActivityResult activityResult = (ActivityResult) objArr[1];
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 75;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(activityResult, "");
            activityResult.getRemoteActionCompatParcelizer();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == -1) {
            int i3 = MediaDescriptionCompat + 99;
            MediaMetadataCompat = i3 % 128;
            if (i3 % 2 == 0) {
                zaayVar.onCommand().write(BitmapTeleporter.read.INSTANCE);
                int i4 = 24 / 0;
            } else {
                zaayVar.onCommand().write(BitmapTeleporter.read.INSTANCE);
            }
        }
        return null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 9;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = zaayVar.MediaBrowserCompatItemReceiver;
        setSmallestDisplacement.Companion companion = setSmallestDisplacement.INSTANCE;
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(setSmallestDisplacement.Companion.write(zaayVar, iIntValue));
        int i4 = MediaDescriptionCompat + 5;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[PHI: r3
      0x0041: PHI (r3v2 android.os.CountDownTimer) = (r3v1 android.os.CountDownTimer), (r3v6 android.os.CountDownTimer) binds: [B:8:0x003f, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onAddQueueItem() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.zaay.MediaDescriptionCompat
            int r1 = r1 + 61
            int r2 = r1 % 128
            kotlin.zaay.MediaMetadataCompat = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L2b
            o.parsePeriod r1 = r3.AudioAttributesImplApi21Parcelizer()
            o.DashManifestParserRepresentationInfo r1 = r1.MediaBrowserCompatSearchResultReceiver
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.IconCompatParcelizer()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r1, r2)
            android.view.View r1 = (android.view.View) r1
            kotlin.bytesRead.MediaBrowserCompatCustomActionResultReceiver(r1)
            android.os.CountDownTimer r3 = r3.IconCompatParcelizer
            r1 = 24
            int r1 = r1 / 0
            if (r3 == 0) goto L44
            goto L41
        L2b:
            o.parsePeriod r1 = r3.AudioAttributesImplApi21Parcelizer()
            o.DashManifestParserRepresentationInfo r1 = r1.MediaBrowserCompatSearchResultReceiver
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.IconCompatParcelizer()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r1, r2)
            android.view.View r1 = (android.view.View) r1
            kotlin.bytesRead.MediaBrowserCompatCustomActionResultReceiver(r1)
            android.os.CountDownTimer r3 = r3.IconCompatParcelizer
            if (r3 == 0) goto L44
        L41:
            r3.cancel()
        L44:
            int r3 = kotlin.zaay.MediaMetadataCompat
            int r3 = r3 + 73
            int r1 = r3 % 128
            kotlin.zaay.MediaDescriptionCompat = r1
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaay.onAddQueueItem():void");
    }

    private final void RemoteActionCompatParcelizer(boolean p0) {
        int i;
        int i2 = 2 % 2;
        ConstraintLayout constraintLayoutIconCompatParcelizer = AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        ConstraintLayout constraintLayout = constraintLayoutIconCompatParcelizer;
        if (p0) {
            int i3 = MediaMetadataCompat + 33;
            MediaDescriptionCompat = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int i5 = MediaMetadataCompat + 15;
            MediaDescriptionCompat = i5 % 128;
            int i6 = i5 % 2;
            i = 8;
        }
        constraintLayout.setVisibility(i);
        if (p0) {
            AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.onSignOutComplete
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zaay.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
                }
            });
        }
        int i7 = MediaMetadataCompat + 91;
        MediaDescriptionCompat = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 28 / 0;
        }
    }

    private static final void onPrepareFromUri(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 11;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        zaayVar.onCommand().write(BitmapTeleporter.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        int i4 = MediaMetadataCompat + 31;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void read(String p0) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.os_support_title);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.os_support_button_text);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, p0, string2, null, 0, null, false, false, null, TarConstants.SPARSELEN_GNU_SPARSE).show(getSupportFragmentManager(), "");
        int i4 = MediaMetadataCompat + 111;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onPrepare() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 117;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        zbm.Companion companion = zbm.INSTANCE;
        zbm.Companion.IconCompatParcelizer("", "").show(getSupportFragmentManager(), "");
        int i4 = MediaMetadataCompat + 45;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    private final void write(setLogger.write p0) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 83;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        if (getSupportFragmentManager().findFragmentByTag("new_edition_dialog") == null) {
            hash.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = hash.IconCompatParcelizer;
            hash.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0).show(getSupportFragmentManager(), "new_edition_dialog");
        } else {
            int i4 = MediaDescriptionCompat + 93;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void onCustomAction() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 107;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{this}, 984388439, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -984388434, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        onPlayFromMediaId();
        int i4 = MediaMetadataCompat + 19;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 89;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{this}, 984388439, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -984388434, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        zaay zaayVar = this;
        String string = getString(R.string.something_went_wrong);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.read(zaayVar, string, 0);
        int i4 = MediaMetadataCompat + 81;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    private final void onPlayFromMediaId() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 31;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            SyncingActivity.Companion companion = SyncingActivity.INSTANCE;
            Intent intentRemoteActionCompatParcelizer = SyncingActivity.Companion.RemoteActionCompatParcelizer(this);
            intentRemoteActionCompatParcelizer.setFlags(268468224);
            finish();
            startActivity(intentRemoteActionCompatParcelizer);
            return;
        }
        SyncingActivity.Companion companion2 = SyncingActivity.INSTANCE;
        Intent intentRemoteActionCompatParcelizer2 = SyncingActivity.Companion.RemoteActionCompatParcelizer(this);
        intentRemoteActionCompatParcelizer2.setFlags(268468224);
        finish();
        startActivity(intentRemoteActionCompatParcelizer2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        hash hashVar;
        int i = 2 % 2;
        Fragment fragmentFindFragmentByTag = ((zaay) objArr[0]).getSupportFragmentManager().findFragmentByTag("new_edition_dialog");
        if (fragmentFindFragmentByTag instanceof hash) {
            int i2 = MediaMetadataCompat + 65;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            hashVar = (hash) fragmentFindFragmentByTag;
        } else {
            hashVar = null;
        }
        if (hashVar != null) {
            int i4 = MediaMetadataCompat + 23;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            hashVar.dismissAllowingStateLoss();
        }
        return null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 7;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            RenewActivity.Companion companion = RenewActivity.INSTANCE;
            zaayVar.startActivity(RenewActivity.Companion.read(zaayVar));
            return null;
        }
        RenewActivity.Companion companion2 = RenewActivity.INSTANCE;
        zaayVar.startActivity(RenewActivity.Companion.read(zaayVar));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    @Override // kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaay.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onStop() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 41;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
        int i4 = MediaMetadataCompat + 101;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
    }

    private static final getShowPopup onFastForward(zaay zaayVar) {
        int i = 2 % 2;
        buildResolutionString.IconCompatParcelizer("Update *** ->", "downloadSuccessful");
        zaayVar.onCommand().write(new BitmapTeleporter.MediaBrowserCompatMediaItem());
        zaayVar.onPlayFromSearch();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i2 = MediaMetadataCompat + 55;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return getshowpopup;
        }
        throw null;
    }

    private static final getShowPopup onPlayFromUri(zaay zaayVar) {
        int i = 2 % 2;
        buildResolutionString.IconCompatParcelizer("Update *** ->", "downloadInstalled");
        MergingMediaPeriodTimeOffsetSampleStream.Companion companion = MergingMediaPeriodTimeOffsetSampleStream.INSTANCE;
        MergingMediaPeriodTimeOffsetSampleStream.Companion.IconCompatParcelizer("INSTALL_SUCCESS");
        zaayVar.onCommand().write(new BitmapTeleporter.MediaBrowserCompatMediaItem());
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i2 = MediaMetadataCompat + 3;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup onPrepare(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 49;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        buildResolutionString.IconCompatParcelizer("Update *** ->", "downloadFailed");
        MergingMediaPeriodTimeOffsetSampleStream.Companion companion = MergingMediaPeriodTimeOffsetSampleStream.INSTANCE;
        MergingMediaPeriodTimeOffsetSampleStream.Companion.IconCompatParcelizer("INSTALL_FAIL");
        zaay zaayVar2 = zaayVar;
        String string = zaayVar.getString(R.string.toast_update_download_failed);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.read(zaayVar2, string, 0);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaMetadataCompat + 53;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        throw null;
    }

    private static final void onPlayFromSearch(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 77;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        MergingMediaPeriodTimeOffsetSampleStream.Companion companion = MergingMediaPeriodTimeOffsetSampleStream.INSTANCE;
        MergingMediaPeriodTimeOffsetSampleStream.Companion.IconCompatParcelizer("INSTALL_CLICK");
        zaayVar.AudioAttributesImplBaseParcelizer.write();
        int i4 = MediaMetadataCompat + 59;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onPlayFromSearch() {
        int i = 2 % 2;
        Snackbar snackbarAudioAttributesCompatParcelizer = Snackbar.AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, R.string.snack_update_downloaded);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(snackbarAudioAttributesCompatParcelizer, "");
        View viewIconCompatParcelizer = snackbarAudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewIconCompatParcelizer, "");
        viewIconCompatParcelizer.setElevation(BitmapDescriptorFactory.HUE_RED);
        zaay zaayVar = this;
        viewIconCompatParcelizer.setBackgroundColor(_isNaN.getColor(zaayVar, R.color.colorPrimaryLight));
        snackbarAudioAttributesCompatParcelizer.IconCompatParcelizer(R.string.restart, new View.OnClickListener() { // from class: o.zabk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zaay.MediaBrowserCompatItemReceiver(this.read);
            }
        });
        snackbarAudioAttributesCompatParcelizer.IconCompatParcelizer(_isNaN.getColor(zaayVar, R.color.text_color_blue_dark));
        View viewFindViewById = viewIconCompatParcelizer.findViewById(R.id.snackbar_text);
        toMagicModuleMetaRepoModel.read(viewFindViewById, "");
        ((TextView) viewFindViewById).setTextColor(_isNaN.getColor(zaayVar, R.color.pure_white));
        snackbarAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        int i2 = MediaDescriptionCompat + 123;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this);
            throw null;
        }
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this);
        int i3 = MediaMetadataCompat + 59;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void IconCompatParcelizer(zaay zaayVar, String str) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        joinWithSeparator.AudioAttributesCompatParcelizer(zaayVar, str);
        int i4 = MediaDescriptionCompat + 53;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IconCompatParcelizer(boolean p0) {
        int i;
        int i2 = 2 % 2;
        LinearLayout linearLayoutIconCompatParcelizer = AudioAttributesImplApi21Parcelizer().IconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        LinearLayout linearLayout = linearLayoutIconCompatParcelizer;
        if (p0) {
            i = 0;
        } else {
            int i3 = MediaDescriptionCompat + 125;
            MediaMetadataCompat = i3 % 128;
            int i4 = i3 % 2;
            i = 8;
        }
        linearLayout.setVisibility(i);
        int i5 = MediaMetadataCompat + 9;
        MediaDescriptionCompat = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
    }

    private final void RemoteActionCompatParcelizer(String p0, final String p1) {
        int i = 2 % 2;
        Snackbar snackbarIconCompatParcelizer = Snackbar.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, p0, -2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(snackbarIconCompatParcelizer, "");
        snackbarIconCompatParcelizer.IconCompatParcelizer(R.string.upgrade, new View.OnClickListener() { // from class: o.zabd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zaay.RemoteActionCompatParcelizer(this.write, p1);
            }
        });
        snackbarIconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        int i2 = MediaMetadataCompat + 33;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void AudioAttributesCompatParcelizer(String str, boolean z) {
        String str2;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 65;
        int i3 = i2 % 128;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        if (z) {
            int i5 = i3 + 23;
            MediaMetadataCompat = i5 % 128;
            int i6 = i5 % 2;
            str2 = "";
        } else {
            String string = getString(R.string.btn_cancel);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            str2 = string;
        }
        if (z) {
            int i7 = MediaDescriptionCompat + 91;
            MediaMetadataCompat = i7 % 128;
            if (i7 % 2 == 0) {
                FrameLayout frameLayoutIconCompatParcelizer = AudioAttributesImplApi21Parcelizer().IconCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayoutIconCompatParcelizer, "");
                bytesRead.MediaBrowserCompatItemReceiver(frameLayoutIconCompatParcelizer);
                throw null;
            }
            FrameLayout frameLayoutIconCompatParcelizer2 = AudioAttributesImplApi21Parcelizer().IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayoutIconCompatParcelizer2, "");
            bytesRead.MediaBrowserCompatItemReceiver(frameLayoutIconCompatParcelizer2);
        }
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string2 = getString(R.string.update);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        boolean z2 = !z;
        getAutofillClient.Companion.AudioAttributesCompatParcelizer("", str, string2, str2, 0, SmsRetrieverStatusCodes.MediaBrowserCompatItemReceiver, z2, z2, null, 272).show(getSupportFragmentManager(), "");
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplApi26Parcelizer(MediaMetadataCompat()));
        int i2 = MediaDescriptionCompat + 99;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaay.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0750 A[Catch: all -> 0x024b, TryCatch #4 {all -> 0x024b, blocks: (B:203:0x0cec, B:205:0x0cf2, B:206:0x0d1d, B:239:0x10b4, B:241:0x10ba, B:242:0x10de, B:220:0x0ec5, B:222:0x0ee6, B:223:0x0f35, B:170:0x0946, B:172:0x094c, B:173:0x0976, B:127:0x074a, B:129:0x0750, B:130:0x077a, B:21:0x00b9, B:23:0x00bf, B:24:0x00e9, B:26:0x01bc, B:28:0x01ec, B:29:0x0245, B:135:0x080d, B:137:0x0811, B:141:0x081d, B:156:0x08f3, B:158:0x08f9, B:159:0x08fa, B:161:0x08fc, B:163:0x0903, B:164:0x0904, B:149:0x086e, B:151:0x087b, B:152:0x08df, B:145:0x0826, B:147:0x083a, B:148:0x0868), top: B:271:0x00b9, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0072  */
    @Override // kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaay.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ void read(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar}, -997687357, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 997687373, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        int i4 = MediaMetadataCompat + 17;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(zaay zaayVar) {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        return (getShowPopup) write(new Object[]{zaayVar}, -1959236167, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1959236177, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(zaay zaayVar) {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar}, 666626960, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -666626953, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    public static /* synthetic */ void write(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 79;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        onSeekTo(zaayVar);
        int i4 = MediaDescriptionCompat + 63;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 99;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        onPrepareFromUri(zaayVar);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void write(zaay zaayVar, String str, Bundle bundle) {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar, str, bundle}, -1186456553, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1186456553, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(zaay zaayVar, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplBaseParcelizer(zaayVar, str, bundle);
        int i4 = MediaMetadataCompat + 115;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ getShowPopup AudioAttributesImplBaseParcelizer(zaay zaayVar) {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        return (getShowPopup) write(new Object[]{zaayVar}, -1872571307, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1872571325, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    public static /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 37;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        onPrepareFromMediaId(zaayVar);
        int i4 = MediaMetadataCompat + 45;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(zaay zaayVar, String str) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 45;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(zaayVar, str);
        int i4 = MediaDescriptionCompat + 11;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IconCompatParcelizer(zaay zaayVar, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 1;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar, str, bundle}, 1249299006, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -1249298994, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        int i4 = MediaDescriptionCompat + 103;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    public static /* synthetic */ void write(zaay zaayVar, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
            write(new Object[]{zaayVar, activityResult}, 1931411718, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -1931411715, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iAudioAttributesCompatParcelizer2 = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar, activityResult}, 1931411718, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -1931411715, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2);
        int i3 = MediaMetadataCompat + 3;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(zaay zaayVar, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 39;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar, str, bundle}, -1448825524, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1448825535, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        int i4 = MediaDescriptionCompat + 71;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup AudioAttributesImplApi26Parcelizer(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 49;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            onPlayFromUri(zaayVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopupOnPlayFromUri = onPlayFromUri(zaayVar);
        int i3 = MediaDescriptionCompat + 3;
        MediaMetadataCompat = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return getshowpopupOnPlayFromUri;
    }

    public static /* synthetic */ void IconCompatParcelizer(zaay zaayVar, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 13;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplBaseParcelizer(zaayVar, activityResult);
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaMetadataCompat + 113;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(zaay zaayVar, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 43;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        read(zaayVar, activityResult);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
    }

    public static /* synthetic */ getShowPopup AudioAttributesImplApi21Parcelizer(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 63;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return onFastForward(zaayVar);
        }
        onFastForward(zaayVar);
        throw null;
    }

    public static /* synthetic */ void read(zaay zaayVar, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 5;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatCustomActionResultReceiver(zaayVar, str, bundle);
        int i4 = MediaDescriptionCompat + 61;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void MediaBrowserCompatItemReceiver(zaay zaayVar) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 105;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        onPlayFromSearch(zaayVar);
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
    }

    public static /* synthetic */ void MediaBrowserCompatItemReceiver(zaay zaayVar, String str, Bundle bundle) {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar, str, bundle}, -1976518140, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1976518155, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(zaay zaayVar, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar, activityResult}, -2089596032, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 2089596049, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        int i4 = MediaMetadataCompat + 93;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        RatingCompat = 1;
        AudioAttributesImplApi26Parcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatMediaItem + 77;
        RatingCompat = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(zaay zaayVar, boolean z) {
        Object[] objArr = {zaayVar, Boolean.valueOf(z)};
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(objArr, -647093311, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 647093325, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(zaay zaayVar, String str, boolean z) {
        Object[] objArr = {zaayVar, str, Boolean.valueOf(z)};
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(objArr, -1079043106, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1079043115, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    public static final /* synthetic */ void write(zaay zaayVar, boolean z) {
        Object[] objArr = {zaayVar, Boolean.valueOf(z)};
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(objArr, -1810286044, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1810286057, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private static final void onPlayFromMediaId(zaay zaayVar) {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar}, -997687357, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 997687373, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{this}, 984388439, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -984388434, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private static final void AudioAttributesImplApi26Parcelizer(zaay zaayVar, ActivityResult activityResult) {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar, activityResult}, 1931411718, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -1931411715, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private static final void AudioAttributesImplApi21Parcelizer(zaay zaayVar, String str, Bundle bundle) {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar, str, bundle}, -1448825524, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 1448825535, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private static final void AudioAttributesImplApi26Parcelizer(zaay zaayVar, String str, Bundle bundle) {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar, str, bundle}, 1249299006, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -1249298994, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private static final getShowPopup onMediaButtonEvent(zaay zaayVar) {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        return (getShowPopup) write(new Object[]{zaayVar}, -663103756, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 663103758, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private final void write(int p0) {
        Object[] objArr = {this, Integer.valueOf(p0)};
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(objArr, 368762581, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -368762575, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private final void IconCompatParcelizer(int p0) {
        Object[] objArr = {this, Integer.valueOf(p0)};
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(objArr, 205238365, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -205238361, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private final void read(String p0, int p1, String p2, String p3, int p4, long p5) {
        Object[] objArr = {this, p0, Integer.valueOf(p1), p2, p3, Integer.valueOf(p4), Long.valueOf(p5)};
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(objArr, -663307876, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 663307884, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private final void onPrepareFromSearch() {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{this}, 1974479193, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -1974479192, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private static final void MediaBrowserCompatItemReceiver(zaay zaayVar, ActivityResult activityResult) {
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        write(new Object[]{zaayVar, activityResult}, -2089596032, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 2089596049, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    @Override // kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 87;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaMetadataCompat + 109;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void AudioAttributesImplApi26Parcelizer() {
        MediaBrowserCompatItemReceiver = new char[]{44984, 45036, 45030, 45050, 45025, 45027, 45037, 45024, 45049, 45030, 45038, 45027, 45050, 45035, 44981, 45018, 45051, 44996, 45054, 44891, 44861, 44890, 44899, 44898, 44909, 44908, 44890, 44848, 44851, 44849, 44894, 44896, 44896, 44891, 44861, 44869, 44899, 44868, 44860, 44891, 44896, 44894, 44855, 44894, 44888, 44869, 44869, 44861, 44860, 44860, 44869, 44890, 44851, 44888, 44898, 44909, 44909, 44891, 44888, 44890, 44849, 44854, 44849, 44855, 44894, 44896, 45013, 44893, 44923, 44893, 44875, 44880, 44880, 44878, 44873, 44878, 44881, 44923, 44893, 44852, 44882, 44881, 44883, 44923, 44923, 44881, 44879, 44879, 44878, 44878, 44881, 44893, 44853, 44852, 44872, 44876, 44872, 44853, 44852, 44874, 44883, 44882, 44880, 44880, 44874, 44853, 44872, 44879, 44880, 44923, 44920, 44921, 44883, 44882, 44882, 44872, 44879, 44874, 44852, 44873, 44878, 44872, 44878, 44887, 44921, 44920, 44880, 44881, 44880, 44873, 44947, 44987, 44987, 44965, 44984, 44997, 44997, 44997, 44995, 44986, 44991, 44991, 44991, 44984, 44985, 44999, 44992, 44987, 44964, 44995, 44996, 44998, 44995, 44990, 44996, 45038, 45038, 44993, 44995, 44993, 44988, 44990, 44987, 44995, 44998, 44988, 45016, 44874, 44906, 44887, 44886, 44873, 44855, 44907, 44907, 44881, 44907, 44885, 44904, 44899, 44902, 44886, 44986, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 45002, 45036, 45052, 45049, 45030, 45027, 45010, 45021, 45031, 45027, 45037, 45006, 44813, 44803, 44800, 44800, 44801, 44800, 44802, 44803, 44801, 44813};
        MediaBrowserCompatSearchResultReceiver = -4633370506021937505L;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 119;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        onPrepareFromSearch(zaayVar);
        if (i3 == 0) {
            return null;
        }
        int i4 = 58 / 0;
        return null;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 57;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupOnPrepare = onPrepare(zaayVar);
        int i4 = MediaDescriptionCompat + 115;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return getshowpopupOnPrepare;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        String str = (String) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 31;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        MediaDescriptionCompat(zaayVar, str, bundle);
        if (i3 != 0) {
            return null;
        }
        int i4 = 64 / 0;
        return null;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        zaay zaayVar = (zaay) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 49;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        getShowPopup getshowpopup = (getShowPopup) write(new Object[]{zaayVar}, -663103756, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), 663103758, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        int i4 = MediaMetadataCompat + 25;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }
}
