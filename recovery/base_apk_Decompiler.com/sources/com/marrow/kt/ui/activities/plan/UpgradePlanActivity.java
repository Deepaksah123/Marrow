package com.marrow.kt.ui.activities.plan;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Rating$$ExternalSyntheticLambda0;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.plan.Subscription;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivity;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.C0201setMcqCount;
import kotlin.CmcdHeadersFactoryCmcdRequest;
import kotlin.DefaultHlsPlaylistTracker1;
import kotlin.DefaultHlsPlaylistTrackerExternalSyntheticLambda0;
import kotlin.EventStream;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.PlayerControlViewExternalSyntheticLambda0;
import kotlin.PlayerControlViewExternalSyntheticLambda1;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SessionDescriptionParser;
import kotlin.TopUserCompanion;
import kotlin.buildRemoveAllDownloadsIntent;
import kotlin.clearDownloadManagerHelpers;
import kotlin.createTracker;
import kotlin.downloadMagicModuleMetalambda0;
import kotlin.getAnswerMap;
import kotlin.getColorInfoString;
import kotlin.getCreatedOnDateMs;
import kotlin.getCredentialList;
import kotlin.getFirstOldOverlappingSegment;
import kotlin.getHttpMethodString;
import kotlin.getInternalName;
import kotlin.getMagicModuleMeta;
import kotlin.getMagicModuleStats;
import kotlin.getOrderDetails;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.handlePreambleAddressCode;
import kotlin.isDolbyAudio;
import kotlin.isExtendedWestEuropeanChar;
import kotlin.isResolutionNotSupported;
import kotlin.onRemoveQueueItemAt;
import kotlin.parseStreamFragmentStartTag;
import kotlin.parseTrackTiming;
import kotlin.readShort;
import kotlin.serializeToIntentExtra;
import kotlin.setBitrateKbps;
import kotlin.setCountry;
import kotlin.setSessionInfo;
import kotlin.setTiming;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001%B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u0019\u0010\u0015\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010\u0006J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020(0#H\u0014¢\u0006\u0004\b)\u0010*J'\u0010,\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001bH\u0016¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001bH\u0016¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b/\u0010 J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010 J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010 J\u0017\u00101\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b1\u0010 J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u000202H\u0016¢\u0006\u0004\b%\u00103J\u0017\u00104\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b4\u0010 J\u001d\u0010%\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001b05H\u0016¢\u0006\u0004\b%\u00106J\u0017\u00107\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b7\u0010 J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010 J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b.\u0010 J\u000f\u00108\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u000fH\u0016¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010;\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010<\u001a\u00020\u000fH\u0016¢\u0006\u0004\b<\u0010\u0006J\u000f\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u0010\u0006J\u0017\u0010>\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b>\u0010 J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u000202H\u0016¢\u0006\u0004\b\u0017\u00103R\u001b\u0010!\u001a\u00020?8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010%\u001a\u00020C8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0017\u0010DR\u0014\u0010,\u001a\u00020E8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010F"}, d2 = {"Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivity;", "Lo/convertMessageToByteArray;", "Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityContract$Presenter;", "Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityContract$AudioAttributesCompatParcelizer;", "Lcom/razorpay/PaymentResultListener;", "<init>", "()V", "", "handleMediaPlayPauseIfPendingOnHandler", "()I", "Landroidx/appcompat/widget/Toolbar;", "onCommand", "()Landroidx/appcompat/widget/Toolbar;", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onPrepare", "setSessionImpl", "onPlayFromSearch", "onPostCreate", "Lorg/json/JSONObject;", "AudioAttributesCompatParcelizer", "(Lorg/json/JSONObject;)V", "Lo/readShort$AudioAttributesCompatParcelizer;", "(Lo/readShort$AudioAttributesCompatParcelizer;)V", "", "p1", "onPaymentError", "(ILjava/lang/String;)V", "onPaymentSuccess", "(Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "(Ljava/lang/String;I)V", "", "Lcom/marrow/data/models/plan/Subscription;", "write", "([Lcom/marrow/data/models/plan/Subscription;Ljava/lang/String;)V", "onFastForward", "Lo/handlePreambleAddressCode;", "MediaBrowserCompatCustomActionResultReceiver", "()[Lo/handlePreambleAddressCode;", "p2", "read", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "Landroid/text/SpannableString;", "(Landroid/text/SpannableString;)V", "AudioAttributesImplBaseParcelizer", "", "(Ljava/util/List;)V", "RatingCompat", "onPlay", "onCustomAction", "onPlayFromUri", "onPlayFromMediaId", "onPrepareFromMediaId", "onMediaButtonEvent", "MediaBrowserCompatMediaItem", "Lo/EventStream;", "Lo/setSessionInfo;", "MediaSessionCompatResultReceiverWrapper", "()Lo/EventStream;", "Lo/serializeToIntentExtra;", "Lo/serializeToIntentExtra;", "Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivity$IconCompatParcelizer;", "Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivity$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpgradePlanActivity extends setTiming<UpgradePlanActivityContract.Presenter> implements UpgradePlanActivityContract.AudioAttributesCompatParcelizer, PaymentResultListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatMediaItem;
    private static int MediaMetadataCompat;
    private static /* synthetic */ isResolutionNotSupported<Object>[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private serializeToIntentExtra write;
    private static final byte[] $$s = {36, -60, 17, 26, 67, -55, 4, -13, TarConstants.LF_DIR, -33, -4, -9, 4, 1, 17, 3, 17, -25, -1, 1, 4, 15, 6, -10, 41, -39, -1, 7, 14, -17, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -55, 4, -13, TarConstants.LF_SYMLINK, -35, 7, 20, -17, 37, -49, 17, 2, 3, -11, 80, -81, 7, 11, -9, 17, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$t = 126;
    private static final byte[] $$j = {109, -78, -126, 25, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$k = 166;
    private static int MediaDescriptionCompat = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int RatingCompat = 1;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setSessionInfo RemoteActionCompatParcelizer = parseTrackTiming.write(this, SessionDescriptionParser.RemoteActionCompatParcelizer(), new MediaBrowserCompatCustomActionResultReceiver());

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final IconCompatParcelizer read = new IconCompatParcelizer();

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~((~i3) | i6 | i2);
        int i8 = ~((~i6) | i3);
        int i9 = ~i2;
        int i10 = i8 | (~(i9 | i3));
        int i11 = ~(i9 | i6);
        int i12 = i3 + i6 + i4 + ((-1568348280) * i5) + (1617068012 * i);
        int i13 = i12 * i12;
        int i14 = (((-430874860) * i3) - 739508224) + (1544986862 * i6) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i4) + ((-1885339648) * i5) + (1743781888 * i) + (858456064 * i13);
        int i15 = (i3 * (-973781596)) + 539565670 + (i6 * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + (i4 * (-973780651)) + (i5 * 424585256) + (i * 537576796) + (i13 * 1078394880);
        switch (i14 + (i15 * i15 * 192741376)) {
            case 1:
                return write(objArr);
            case 2:
                return RemoteActionCompatParcelizer(objArr);
            case 3:
                return read(objArr);
            case 4:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 5:
                UpgradePlanActivity upgradePlanActivity = (UpgradePlanActivity) objArr[0];
                Exception exc = (Exception) objArr[1];
                int i16 = 2 % 2;
                int i17 = RatingCompat + 9;
                MediaBrowserCompatSearchResultReceiver = i17 % 128;
                int i18 = i17 % 2;
                toMagicModuleMetaRepoModel.write(exc, "");
                ((UpgradePlanActivityContract.Presenter) upgradePlanActivity.getMPresenter()).read(exc);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                int i19 = MediaBrowserCompatSearchResultReceiver + 119;
                RatingCompat = i19 % 128;
                int i20 = i19 % 2;
                return getshowpopup;
            case 6:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 7:
                return MediaBrowserCompatItemReceiver(objArr);
            case 8:
                UpgradePlanActivity upgradePlanActivity2 = (UpgradePlanActivity) objArr[0];
                int i21 = 2 % 2;
                int i22 = MediaBrowserCompatSearchResultReceiver + 31;
                RatingCompat = i22 % 128;
                int i23 = i22 % 2;
                ((UpgradePlanActivityContract.Presenter) upgradePlanActivity2.getMPresenter()).MediaDescriptionCompat();
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                int i24 = RatingCompat + 21;
                MediaBrowserCompatSearchResultReceiver = i24 % 128;
                int i25 = i24 % 2;
                return getshowpopup2;
            case 9:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 10:
                return AudioAttributesImplBaseParcelizer(objArr);
            default:
                return IconCompatParcelizer(objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.marrow.kt.ui.activities.plan.UpgradePlanActivity.$$j
            int r6 = r6 + 4
            int r7 = r7 + 4
            int r5 = 114 - r5
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r7
            r3 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            r4 = r0[r6]
        L22:
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            int r6 = r6 + 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.plan.UpgradePlanActivity.o(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = 111 - r7
            int r0 = 31 - r5
            byte[] r1 = com.marrow.kt.ui.activities.plan.UpgradePlanActivity.$$s
            int r6 = 77 - r6
            byte[] r0 = new byte[r0]
            int r5 = 30 - r5
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r1[r6]
            int r3 = r3 + 1
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + 2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.plan.UpgradePlanActivity.p(short, byte, byte, java.lang.Object[]):void");
    }

    public static final /* synthetic */ serializeToIntentExtra AudioAttributesImplApi21Parcelizer(UpgradePlanActivity upgradePlanActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = i2 + 89;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        serializeToIntentExtra serializetointentextra = upgradePlanActivity.write;
        int i5 = i2 + 45;
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
        return serializetointentextra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EventStream MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 39;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        EventStream eventStream = (EventStream) this.RemoteActionCompatParcelizer.read(this, RemoteActionCompatParcelizer[0]);
        int i4 = RatingCompat + 27;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return eventStream;
    }

    @Override // kotlin.convertMessageToByteArray
    public final Toolbar onCommand() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 111;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Toolbar toolbar = MediaSessionCompatResultReceiverWrapper().MediaBrowserCompatCustomActionResultReceiver.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        if (i3 != 0) {
            return toolbar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver implements getAnswerMap<UpgradePlanActivity, EventStream> {
        private static EventStream write(UpgradePlanActivity upgradePlanActivity) {
            toMagicModuleMetaRepoModel.write(upgradePlanActivity, "");
            return EventStream.RemoteActionCompatParcelizer(SessionDescriptionParser.AudioAttributesCompatParcelizer(upgradePlanActivity));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [o.EventStream, o.getApplicationLabel] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ EventStream invoke(UpgradePlanActivity upgradePlanActivity) {
            return write(upgradePlanActivity);
        }
    }

    public static final class read extends onRemoveQueueItemAt {
        read() {
            super(true);
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            if (((UpgradePlanActivityContract.Presenter) UpgradePlanActivity.this.getMPresenter()).getAudioAttributesImplApi21Parcelizer() && UpgradePlanActivity.AudioAttributesImplApi21Parcelizer(UpgradePlanActivity.this) != null) {
                serializeToIntentExtra serializetointentextraAudioAttributesImplApi21Parcelizer = UpgradePlanActivity.AudioAttributesImplApi21Parcelizer(UpgradePlanActivity.this);
                if (serializetointentextraAudioAttributesImplApi21Parcelizer == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    serializetointentextraAudioAttributesImplApi21Parcelizer = null;
                }
                if (serializetointentextraAudioAttributesImplApi21Parcelizer.read()) {
                    return;
                }
            }
            setEnabled(false);
            UpgradePlanActivity.this.getIconCompatParcelizer().RemoteActionCompatParcelizer();
        }
    }

    private static void n(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr3 = new char[i3];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr3[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(MediaMetadataCompat)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 23703 - Process.getGidForName(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.red(0) + 44862), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18944, 28 - Color.alpha(0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            int i6 = $10 + 69;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cleardownloadmanagerhelpers.write = i2;
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, 0, cArr4, 0, i3);
            System.arraycopy(cArr4, 0, cArr3, i3 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr4, cleardownloadmanagerhelpers.write, cArr3, 0, i3 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            int i8 = $11 + 17;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2 = new char[i3];
                cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 1;
            } else {
                cArr2 = new char[i3];
                cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            }
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
                cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr3[(i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - View.combineMeasuredStates(0, 0)), 18945 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), AndroidCharacter.getMirror('0') - 20, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    private static void m(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = MediaBrowserCompatCustomActionResultReceiver;
        int i4 = 43695;
        int i5 = -470782045;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 15;
                $11 = i7 % 128;
                int i8 = i7 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i4 - View.resolveSize(0, 0)), Color.green(0) + 23297, (ViewConfiguration.getLongPressTimeout() >> 16) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i6++;
                    i2 = 2;
                    i4 = 43695;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = MediaBrowserCompatCustomActionResultReceiver;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i5);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43694), 23297 - Color.green(0), 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i9++;
                i5 = -470782045;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = 0;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i10 = $11 + 17;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i12];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - KeyEvent.normalizeMetaState(0)), Process.getGidForName("") + 23298, 15 - Gravity.getAbsoluteGravity(0, 0), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i12++;
            }
            int i14 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i14;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i15 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i16 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 48193), 20126 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            int i17 = $11 + 39;
            $10 = i17 % 128;
            int i18 = i17 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ UpgradePlanActivity RemoteActionCompatParcelizer;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                long j = this.write;
                this.AudioAttributesCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(j * C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            ((UpgradePlanActivityContract.Presenter) this.RemoteActionCompatParcelizer.getMPresenter()).AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(int i, UpgradePlanActivity upgradePlanActivity, String str, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = i;
            this.RemoteActionCompatParcelizer = upgradePlanActivity;
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final class IconCompatParcelizer extends isExtendedWestEuropeanChar {
        IconCompatParcelizer() {
        }

        @Override // kotlin.isExtendedWestEuropeanChar
        public final void write(Context context, int i, int i2) {
            toMagicModuleMetaRepoModel.write(context, "");
            if (i == 14) {
                UpgradePlanActivity.this.RemoteActionCompatParcelizer();
                UpgradePlanActivity.this.finish();
            }
        }

        @Override // kotlin.isExtendedWestEuropeanChar, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static final class RemoteActionCompatParcelizer extends ClickableSpan {
        private /* synthetic */ String write;

        RemoteActionCompatParcelizer(String str) {
            this.write = str;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            UpgradePlanActivity.this.RemoteActionCompatParcelizer(this.write);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            toMagicModuleMetaRepoModel.write(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        UpgradePlanActivity upgradePlanActivity = (UpgradePlanActivity) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 9;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ((UpgradePlanActivityContract.Presenter) upgradePlanActivity.getMPresenter()).IconCompatParcelizer();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaBrowserCompatSearchResultReceiver + 101;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    @Override // kotlin.setTiming, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.plan.UpgradePlanActivity.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        final UpgradePlanActivity upgradePlanActivity = (UpgradePlanActivity) objArr[0];
        int i = 2 % 2;
        upgradePlanActivity.write = new serializeToIntentExtra(upgradePlanActivity, new getCreatedOnDateMs() { // from class: o.UdpDataSourceRtpDataChannel
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return UpgradePlanActivity.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            }
        }, new getCreatedOnDateMs() { // from class: o.addMediaDescriptionToSession
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return UpgradePlanActivity.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
            }
        }, new getCreatedOnDateMs() { // from class: o.parseMediaDescriptionLine
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return UpgradePlanActivity.write(this.RemoteActionCompatParcelizer);
            }
        }, new MagicModuleSubmissionRequestBody() { // from class: o.setRtcpChannel
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return UpgradePlanActivity.write(this.RemoteActionCompatParcelizer, (String) obj, (String) obj2);
            }
        }, new getCreatedOnDateMs() { // from class: o.onReceivingFirstPacket
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return UpgradePlanActivity.read(this.RemoteActionCompatParcelizer);
            }
        }, new getCreatedOnDateMs() { // from class: o.DefaultRtpPayloadReaderFactory
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return UpgradePlanActivity.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        }, new MagicModuleSubmissionRequestBody() { // from class: o.UdpDataSourceRtpDataChannelFactory
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return UpgradePlanActivity.read(this.read, (String) obj2);
            }
        }, new getAnswerMap() { // from class: o.RtpAacReader
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return UpgradePlanActivity.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (Exception) obj);
            }
        });
        int i2 = MediaBrowserCompatSearchResultReceiver + 63;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return null;
    }

    private static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(UpgradePlanActivity upgradePlanActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 31;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        ((UpgradePlanActivityContract.Presenter) upgradePlanActivity.getMPresenter()).MediaMetadataCompat();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = RatingCompat + 51;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private static final getShowPopup AudioAttributesImplApi26Parcelizer(UpgradePlanActivity upgradePlanActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 11;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        UpgradePlanActivityContract.Presenter presenter = (UpgradePlanActivityContract.Presenter) upgradePlanActivity.getMPresenter();
        if (i3 == 0) {
            presenter.RatingCompat();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            throw null;
        }
        presenter.RatingCompat();
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        int i4 = MediaBrowserCompatSearchResultReceiver + 89;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopup2;
        }
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup AudioAttributesImplBaseParcelizer(UpgradePlanActivity upgradePlanActivity) {
        int i = 2 % 2;
        int i2 = RatingCompat + 97;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ((UpgradePlanActivityContract.Presenter) upgradePlanActivity.getMPresenter()).MediaBrowserCompatItemReceiver();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaBrowserCompatSearchResultReceiver + 91;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private static final getShowPopup RemoteActionCompatParcelizer(UpgradePlanActivity upgradePlanActivity, String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 125;
        RatingCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            ((UpgradePlanActivityContract.Presenter) upgradePlanActivity.getMPresenter()).IconCompatParcelizer(str, str2);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        ((UpgradePlanActivityContract.Presenter) upgradePlanActivity.getMPresenter()).IconCompatParcelizer(str, str2);
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        int i3 = MediaBrowserCompatSearchResultReceiver + 59;
        RatingCompat = i3 % 128;
        if (i3 % 2 != 0) {
            return getshowpopup2;
        }
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup MediaBrowserCompatSearchResultReceiver(UpgradePlanActivity upgradePlanActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 111;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
        AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, -1176668904, iWrite2, iWrite3, new Object[]{upgradePlanActivity}, 1176668905);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = RatingCompat + 41;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup write(UpgradePlanActivity upgradePlanActivity, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 55;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        ((UpgradePlanActivityContract.Presenter) upgradePlanActivity.getMPresenter()).read();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = RatingCompat + 17;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void setSessionImpl() {
        int i = 2 % 2;
        getIconCompatParcelizer().AudioAttributesCompatParcelizer(this, new read());
        int i2 = MediaBrowserCompatSearchResultReceiver + 101;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: com.marrow.kt.ui.activities.plan.UpgradePlanActivity$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000e"}, d2 = {"Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivity$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "", "p3", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;ZZLjava/lang/String;)Landroid/content/Intent;", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context p0, boolean p1, boolean p2, String p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            Intent intent = new Intent(p0, (Class<?>) UpgradePlanActivity.class);
            intent.putExtra("is_deeplink", true);
            intent.putExtra("is_user_eligible_for_upgrade", p2);
            intent.putExtra("source", p3);
            return intent;
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) UpgradePlanActivity.class);
            intent.putExtra("source", p1);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private final void onPlayFromSearch() {
        int i = 2 % 2;
        int i2 = RatingCompat + 89;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Toolbar toolbar = MediaSessionCompatResultReceiverWrapper().MediaBrowserCompatCustomActionResultReceiver.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        ScrollView scrollView = MediaSessionCompatResultReceiverWrapper().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, false, true, true, true, 0, 49);
        ScrollView scrollView2 = MediaSessionCompatResultReceiverWrapper().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView2, "");
        getHttpMethodString.read((View) scrollView2, false, true, true, true, 0, 49);
        int i4 = MediaBrowserCompatSearchResultReceiver + 111;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.convertMessageToByteArray, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, android.app.Activity
    public final void onPostCreate(Bundle p0) {
        int i = 2 % 2;
        int i2 = RatingCompat + 1;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            super.onPostCreate(p0);
            setTitle(getString(R.string.label_add_videos));
            int i3 = RatingCompat + 9;
            MediaBrowserCompatSearchResultReceiver = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onPostCreate(p0);
        setTitle(getString(R.string.label_add_videos));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(JSONObject p0) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        new Checkout().open(this, p0);
        int i2 = RatingCompat + 1;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(readShort.AudioAttributesCompatParcelizer p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 101;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        serializeToIntentExtra serializetointentextra = this.write;
        if (serializetointentextra != null) {
            if (serializetointentextra == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                serializetointentextra = null;
            }
            serializetointentextra.IconCompatParcelizer(p0);
        }
        int i4 = MediaBrowserCompatSearchResultReceiver + 79;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.razorpay.PaymentResultListener
    public final void onPaymentError(int p0, String p1) {
        int i = 2 % 2;
        int i2 = RatingCompat + 109;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            ((UpgradePlanActivityContract.Presenter) getMPresenter()).read();
            throw null;
        }
        ((UpgradePlanActivityContract.Presenter) getMPresenter()).read();
        if (p0 == 0) {
            String string = getString(R.string.payment_cancelled);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            AudioAttributesCompatParcelizer(string);
        } else {
            write(new ResponseError(p0, p1, false, 4, null));
            int i3 = MediaBrowserCompatSearchResultReceiver + 31;
            RatingCompat = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // com.razorpay.PaymentResultListener
    public final void onPaymentSuccess(String p0) {
        int i = 2 % 2;
        int i2 = RatingCompat + 13;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ((UpgradePlanActivityContract.Presenter) getMPresenter()).onPaymentSuccess(PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(p0));
        int i4 = RatingCompat + 25;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        UpgradePlanActivity upgradePlanActivity = (UpgradePlanActivity) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        Object obj = null;
        C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(upgradePlanActivity), null, null, new AudioAttributesCompatParcelizer(iIntValue, upgradePlanActivity, str, null), 3);
        int i2 = MediaBrowserCompatSearchResultReceiver + 71;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.app.Activity, android.content.Context, com.marrow.kt.base.BaseDaggerActivity, com.marrow.kt.ui.activities.plan.UpgradePlanActivity] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void write(Subscription[] p0, String p1) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        try {
            try {
                ((UpgradePlanActivityContract.Presenter) getMPresenter()).write();
                getCredentialList.Companion iconCompatParcelizer = getCredentialList.INSTANCE;
                startActivity(getCredentialList.Companion.AudioAttributesCompatParcelizer((Context) this, p1, new ArrayList(getOrderDetails.read(p0))));
                int i2 = RatingCompat + 53;
                MediaBrowserCompatSearchResultReceiver = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e) {
                e.printStackTrace();
                ((UpgradePlanActivityContract.Presenter) getMPresenter()).AudioAttributesCompatParcelizer(e);
            }
            setResult(-1);
            finish();
            int i4 = RatingCompat + 27;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            this = i4 % 2;
            if (this != 0) {
                throw null;
            }
        } catch (Throwable th) {
            this.setResult(-1);
            this.finish();
            throw th;
        }
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void onFastForward() {
        int i = 2 % 2;
        isDolbyAudio isdolbyaudio = new isDolbyAudio(this, 14, null, 4, null);
        isdolbyaudio.setTitle(R.string.taking_longer);
        isdolbyaudio.RemoteActionCompatParcelizer();
        isDolbyAudio.read(742101932, new Object[]{isdolbyaudio, Integer.valueOf(R.string.close)}, getColorInfoString.write(), getColorInfoString.write(), getColorInfoString.write(), -742101932, getColorInfoString.write());
        this.AudioAttributesImplApi21Parcelizer = isdolbyaudio;
        this.AudioAttributesImplApi21Parcelizer.show();
        int i2 = RatingCompat + 9;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity
    public final handlePreambleAddressCode[] MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 61;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        handlePreambleAddressCode[] handlepreambleaddresscodeArr = {this.read};
        int i5 = i3 + 3;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return handlepreambleaddresscodeArr;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void read(String p0, String p1, String p2) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p0);
        sb.append(" ");
        sb.append(p1);
        String string = sb.toString();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(p2);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(onSeekTo());
        int length = p0.length() + 1;
        int length2 = string.length();
        TextView textView = MediaSessionCompatResultReceiverWrapper().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(remoteActionCompatParcelizer, length, length2, 18);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, length2, 18);
        textView.setText(spannableStringBuilder);
        MediaSessionCompatResultReceiverWrapper().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = MediaSessionCompatResultReceiverWrapper().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) textView2);
        int i2 = RatingCompat + 79;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(String p0, String p1, String p2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 91;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        RemoteActionCompatParcelizer();
        parseStreamFragmentStartTag.Companion companion = parseStreamFragmentStartTag.INSTANCE;
        parseStreamFragmentStartTag parsestreamfragmentstarttagWrite = parseStreamFragmentStartTag.Companion.write(p0, p1, p2);
        AudioAttributesCompatParcelizer(parsestreamfragmentstarttagWrite);
        parsestreamfragmentstarttagWrite.show(getSupportFragmentManager(), "vpn_dialog");
        int i4 = MediaBrowserCompatSearchResultReceiver + 19;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void AudioAttributesImplApi21Parcelizer(String p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 31;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            MediaSessionCompatResultReceiverWrapper().AudioAttributesImplApi26Parcelizer.setText(p0);
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            MediaSessionCompatResultReceiverWrapper().AudioAttributesImplApi26Parcelizer.setText(p0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void AudioAttributesImplApi26Parcelizer(String p0) {
        int i = 2 % 2;
        int i2 = RatingCompat + 37;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            MediaSessionCompatResultReceiverWrapper().AudioAttributesImplBaseParcelizer.setText(p0);
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            MediaSessionCompatResultReceiverWrapper().AudioAttributesImplBaseParcelizer.setText(p0);
            throw null;
        }
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void MediaBrowserCompatCustomActionResultReceiver(String p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 123;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaSessionCompatResultReceiverWrapper().RatingCompat.setText(p0);
        int i4 = RatingCompat + 67;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void MediaBrowserCompatItemReceiver(String p0) {
        int i = 2 % 2;
        int i2 = RatingCompat + 121;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaSessionCompatResultReceiverWrapper().MediaDescriptionCompat.setText(p0);
        MediaSessionCompatResultReceiverWrapper().MediaDescriptionCompat.setPaintFlags(MediaSessionCompatResultReceiverWrapper().MediaDescriptionCompat.getPaintFlags() | 16);
        int i4 = MediaBrowserCompatSearchResultReceiver + 19;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void write(SpannableString p0) {
        int i = 2 % 2;
        int i2 = RatingCompat + 43;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaSessionCompatResultReceiverWrapper().MediaMetadataCompat.setText(p0);
        int i4 = MediaBrowserCompatSearchResultReceiver + 115;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        UpgradePlanActivity upgradePlanActivity = (UpgradePlanActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 11;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        getFirstOldOverlappingSegment getfirstoldoverlappingsegment = getFirstOldOverlappingSegment.read(LayoutInflater.from(upgradePlanActivity), upgradePlanActivity.MediaSessionCompatResultReceiverWrapper().AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getfirstoldoverlappingsegment, "");
        getfirstoldoverlappingsegment.RemoteActionCompatParcelizer.setText(str);
        upgradePlanActivity.MediaSessionCompatResultReceiverWrapper().AudioAttributesCompatParcelizer.addView(getfirstoldoverlappingsegment.IconCompatParcelizer());
        int i4 = MediaBrowserCompatSearchResultReceiver + 3;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void write(List<String> p0) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        int size = p0.size();
        int i2 = RatingCompat + 3;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < size; i4++) {
            DefaultHlsPlaylistTrackerExternalSyntheticLambda0 defaultHlsPlaylistTrackerExternalSyntheticLambda0AudioAttributesCompatParcelizer = DefaultHlsPlaylistTrackerExternalSyntheticLambda0.AudioAttributesCompatParcelizer(LayoutInflater.from(this), MediaSessionCompatResultReceiverWrapper().AudioAttributesCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultHlsPlaylistTrackerExternalSyntheticLambda0AudioAttributesCompatParcelizer, "");
            defaultHlsPlaylistTrackerExternalSyntheticLambda0AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.setText(p0.get(i4));
            MediaSessionCompatResultReceiverWrapper().AudioAttributesCompatParcelizer.addView(defaultHlsPlaylistTrackerExternalSyntheticLambda0AudioAttributesCompatParcelizer.IconCompatParcelizer());
        }
        int i5 = RatingCompat + 21;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void RatingCompat(String p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 123;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaSessionCompatResultReceiverWrapper().onCommand.setText(p0);
        int i4 = MediaBrowserCompatSearchResultReceiver + 71;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void write(String p0) {
        int i = 2 % 2;
        int i2 = RatingCompat + 31;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        createTracker createtracker = createTracker.read(LayoutInflater.from(this), MediaSessionCompatResultReceiverWrapper().RemoteActionCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createtracker, "");
        createtracker.write.setText(p0);
        MediaSessionCompatResultReceiverWrapper().RemoteActionCompatParcelizer.addView(createtracker.IconCompatParcelizer());
        int i4 = MediaBrowserCompatSearchResultReceiver + 27;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(String p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 115;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        DefaultHlsPlaylistTracker1 defaultHlsPlaylistTracker1AudioAttributesCompatParcelizer = DefaultHlsPlaylistTracker1.AudioAttributesCompatParcelizer(LayoutInflater.from(this), MediaSessionCompatResultReceiverWrapper().RemoteActionCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultHlsPlaylistTracker1AudioAttributesCompatParcelizer, "");
        defaultHlsPlaylistTracker1AudioAttributesCompatParcelizer.write.setText(p0);
        MediaSessionCompatResultReceiverWrapper().RemoteActionCompatParcelizer.addView(defaultHlsPlaylistTracker1AudioAttributesCompatParcelizer.IconCompatParcelizer());
        int i4 = RatingCompat + 45;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void onPlay() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 7;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        CustomTextView customTextView = MediaSessionCompatResultReceiverWrapper().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        LinearLayout linearLayout = MediaSessionCompatResultReceiverWrapper().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView, linearLayout);
        int i4 = MediaBrowserCompatSearchResultReceiver + 99;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void onCustomAction() {
        int i = 2 % 2;
        int i2 = RatingCompat + 89;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        View[] viewArr = new View[2];
        if (i2 % 2 != 0) {
            CustomTextView customTextView = MediaSessionCompatResultReceiverWrapper().AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
            viewArr[1] = customTextView;
            LinearLayout linearLayout = MediaSessionCompatResultReceiverWrapper().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            viewArr[0] = linearLayout;
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(viewArr);
            return;
        }
        CustomTextView customTextView2 = MediaSessionCompatResultReceiverWrapper().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
        viewArr[0] = customTextView2;
        LinearLayout linearLayout2 = MediaSessionCompatResultReceiverWrapper().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
        viewArr[1] = linearLayout2;
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(viewArr);
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void onPlayFromUri() {
        int i = 2 % 2;
        int i2 = RatingCompat + 19;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ProgressBar progressBar = MediaSessionCompatResultReceiverWrapper().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(progressBar);
        EventStream eventStreamMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        eventStreamMediaSessionCompatResultReceiverWrapper.write.setClickable(false);
        eventStreamMediaSessionCompatResultReceiverWrapper.IconCompatParcelizer.setClickable(false);
        CustomButton customButton = eventStreamMediaSessionCompatResultReceiverWrapper.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(customButton, 50);
        CustomButton customButton2 = eventStreamMediaSessionCompatResultReceiverWrapper.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton2, "");
        CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(customButton2, 50);
        int i4 = RatingCompat + 11;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        UpgradePlanActivity upgradePlanActivity = (UpgradePlanActivity) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 9;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ProgressBar progressBar = upgradePlanActivity.MediaSessionCompatResultReceiverWrapper().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(progressBar);
        EventStream eventStreamMediaSessionCompatResultReceiverWrapper = upgradePlanActivity.MediaSessionCompatResultReceiverWrapper();
        eventStreamMediaSessionCompatResultReceiverWrapper.write.setClickable(true);
        eventStreamMediaSessionCompatResultReceiverWrapper.IconCompatParcelizer.setClickable(true);
        CustomButton customButton = eventStreamMediaSessionCompatResultReceiverWrapper.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(customButton, 100);
        CustomButton customButton2 = eventStreamMediaSessionCompatResultReceiverWrapper.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton2, "");
        CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(customButton2, 100);
        int i4 = RatingCompat + 37;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void onPrepareFromMediaId() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 115;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            ScrollView scrollView = MediaSessionCompatResultReceiverWrapper().MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
            PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(scrollView);
        } else {
            View[] viewArr = new View[0];
            ScrollView scrollView2 = MediaSessionCompatResultReceiverWrapper().MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView2, "");
            viewArr[0] = scrollView2;
            PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(viewArr);
        }
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        UpgradePlanActivity upgradePlanActivity = (UpgradePlanActivity) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 67;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ScrollView scrollView = upgradePlanActivity.MediaSessionCompatResultReceiverWrapper().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(scrollView);
        int i4 = RatingCompat + 63;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        UpgradePlanActivity upgradePlanActivity = (UpgradePlanActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompat + 53;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        upgradePlanActivity.MediaSessionCompatResultReceiverWrapper().MediaBrowserCompatSearchResultReceiver.setText(str);
        CustomTextView customTextView = upgradePlanActivity.MediaSessionCompatResultReceiverWrapper().MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(customTextView);
        int i4 = RatingCompat + 19;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        UpgradePlanActivity upgradePlanActivity = (UpgradePlanActivity) objArr[0];
        SpannableString spannableString = (SpannableString) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompat + 41;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(spannableString, "");
        upgradePlanActivity.MediaSessionCompatResultReceiverWrapper().MediaBrowserCompatSearchResultReceiver.setText(spannableString);
        ScrollView scrollView = upgradePlanActivity.MediaSessionCompatResultReceiverWrapper().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(scrollView);
        int i4 = MediaBrowserCompatSearchResultReceiver + 113;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return null;
    }

    @Override // kotlin.setTiming, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 17;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            n(new char[]{2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534}, 247 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 10, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            n(new char[]{2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 204, false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 27, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = RatingCompat + 15;
                MediaBrowserCompatSearchResultReceiver = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 4;
                }
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4536 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 6054 - (Process.myTid() >> 22), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6029, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // kotlin.setTiming, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.plan.UpgradePlanActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc  */
    @Override // kotlin.setTiming, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.plan.UpgradePlanActivity.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(UpgradePlanActivity upgradePlanActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 71;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return MediaBrowserCompatCustomActionResultReceiver(upgradePlanActivity);
        }
        MediaBrowserCompatCustomActionResultReceiver(upgradePlanActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(UpgradePlanActivity upgradePlanActivity, Exception exc) {
        int i = 2 % 2;
        int i2 = RatingCompat + 9;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
        getShowPopup getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, -1268116576, iWrite2, iWrite3, new Object[]{upgradePlanActivity, exc}, 1268116581);
        int i4 = RatingCompat + 7;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup read(UpgradePlanActivity upgradePlanActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 29;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
        getShowPopup getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, -2058207799, iWrite2, iWrite3, new Object[]{upgradePlanActivity}, 2058207807);
        int i4 = MediaBrowserCompatSearchResultReceiver + 9;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup write(UpgradePlanActivity upgradePlanActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 123;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(upgradePlanActivity);
        int i4 = MediaBrowserCompatSearchResultReceiver + 71;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupAudioAttributesImplBaseParcelizer;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(UpgradePlanActivity upgradePlanActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 45;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            int iWrite = Rating$$ExternalSyntheticLambda0.write();
            int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
            int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
            return (getShowPopup) AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, -235760716, iWrite2, iWrite3, new Object[]{upgradePlanActivity}, 235760718);
        }
        int iWrite4 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite5 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite6 = Rating$$ExternalSyntheticLambda0.write();
        throw null;
    }

    public static /* synthetic */ getShowPopup read(UpgradePlanActivity upgradePlanActivity, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 15;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupWrite = write(upgradePlanActivity, str);
        int i4 = MediaBrowserCompatSearchResultReceiver + 95;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupWrite;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(UpgradePlanActivity upgradePlanActivity) {
        int i = 2 % 2;
        int i2 = RatingCompat + 43;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(upgradePlanActivity);
        int i4 = MediaBrowserCompatSearchResultReceiver + 41;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupMediaBrowserCompatSearchResultReceiver;
    }

    public static /* synthetic */ getShowPopup write(UpgradePlanActivity upgradePlanActivity, String str, String str2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 15;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return RemoteActionCompatParcelizer(upgradePlanActivity, str, str2);
        }
        RemoteActionCompatParcelizer(upgradePlanActivity, str, str2);
        throw null;
    }

    public static /* synthetic */ getShowPopup MediaBrowserCompatItemReceiver(UpgradePlanActivity upgradePlanActivity) {
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            AudioAttributesImplApi26Parcelizer(upgradePlanActivity);
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopupAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(upgradePlanActivity);
        int i3 = MediaBrowserCompatSearchResultReceiver + 45;
        RatingCompat = i3 % 128;
        if (i3 % 2 != 0) {
            return getshowpopupAudioAttributesImplApi26Parcelizer;
        }
        obj.hashCode();
        throw null;
    }

    static {
        MediaBrowserCompatMediaItem = 1;
        onPrepareFromSearch();
        RemoteActionCompatParcelizer = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(UpgradePlanActivity.class, "binding", "getBinding()Lcom/marrow/databinding/ActivityUpgradePlanbBinding;", 0))};
        INSTANCE = new Companion(null);
        int i = MediaDescriptionCompat + 23;
        MediaBrowserCompatMediaItem = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent AudioAttributesCompatParcelizer(Context context, boolean z, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 69;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Intent intentAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(context, true, z, str);
        int i4 = MediaBrowserCompatSearchResultReceiver + 97;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return intentAudioAttributesCompatParcelizer;
    }

    private final void onPrepare() {
        AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), setBitrateKbps.AudioAttributesCompatParcelizer.write(), 184027015, Rating$$ExternalSyntheticLambda0.write(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 27215494, new Object[]{this}, -184027006);
    }

    private static final getShowPopup RatingCompat(UpgradePlanActivity upgradePlanActivity) {
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, -2058207799, iWrite2, iWrite3, new Object[]{upgradePlanActivity}, 2058207807);
    }

    private static final getShowPopup IconCompatParcelizer(UpgradePlanActivity upgradePlanActivity, Exception exc) {
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, -1268116576, iWrite2, iWrite3, new Object[]{upgradePlanActivity, exc}, 1268116581);
    }

    private static final getShowPopup MediaDescriptionCompat(UpgradePlanActivity upgradePlanActivity) {
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, -235760716, iWrite2, iWrite3, new Object[]{upgradePlanActivity}, 235760718);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 109;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return R.layout.activity_upgrade_planb;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void onPlayFromMediaId() {
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
        AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, -1176668904, iWrite2, iWrite3, new Object[]{this}, 1176668905);
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void onMediaButtonEvent() {
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
        AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, 1547613627, iWrite2, iWrite3, new Object[]{this}, -1547613623);
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(String p0, int p1) {
        Object[] objArr = {this, p0, Integer.valueOf(p1)};
        AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), Rating$$ExternalSyntheticLambda0.write(), -535160152, Rating$$ExternalSyntheticLambda0.write(), Rating$$ExternalSyntheticLambda0.write(), objArr, 535160155);
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void AudioAttributesImplBaseParcelizer(String p0) {
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
        AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, -839016935, iWrite2, iWrite3, new Object[]{this, p0}, 839016941);
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(SpannableString p0) {
        int iWrite = setBitrateKbps.AudioAttributesCompatParcelizer.write();
        int iWrite2 = setBitrateKbps.AudioAttributesCompatParcelizer.write();
        int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
        AudioAttributesCompatParcelizer(setBitrateKbps.AudioAttributesCompatParcelizer.write(), iWrite, -1647905187, iWrite2, iWrite3, new Object[]{this, p0}, 1647905197);
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer
    public final void MediaBrowserCompatMediaItem(String p0) {
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
        int iWrite3 = Rating$$ExternalSyntheticLambda0.write();
        AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, -1782856462, iWrite2, iWrite3, new Object[]{this, p0}, 1782856469);
    }

    @Override // kotlin.setTiming, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        int iWrite2 = setBitrateKbps.AudioAttributesCompatParcelizer.write();
        int iWrite3 = setBitrateKbps.AudioAttributesCompatParcelizer.write();
        AudioAttributesCompatParcelizer(setBitrateKbps.AudioAttributesCompatParcelizer.write(), iWrite, -1783330690, iWrite2, iWrite3, new Object[]{this}, 1783330690);
    }

    static void onPrepareFromSearch() {
        MediaBrowserCompatCustomActionResultReceiver = new int[]{1564135668, -160693754, -1275584367, -33048573, -297724977, -906783496, 118695593, 2030558924, 1034141219, -2000185740, 435009303, 859036202, 469381717, 2090882154, -927995400, 1571344246, -484899473, 2054974880};
        MediaMetadataCompat = 1000326312;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        UpgradePlanActivity upgradePlanActivity = (UpgradePlanActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 49;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatSearchResultReceiver + 71;
        RatingCompat = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
