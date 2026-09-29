package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Html;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import com.marrow.ui.views.CustomTextView;
import com.marrow.ui.views.LottieRatingBar;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.VideoSizeExternalSyntheticLambda0;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B5\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J4\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\"\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040%j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`&H\u0002J\b\u0010'\u001a\u00020\u0018H\u0016J\b\u0010(\u001a\u00020\u0018H\u0016J\u0006\u0010)\u001a\u00020\u0018J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\u0010\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/marrow/ui/fragments/learn/QaRatingDialog2;", "Lcom/marrow/ui/dialogs/BaseDialog;", "Lcom/marrow/databinding/FragmentQaRating2Binding;", "contentType", "", LogCategory.CONTEXT, "Landroid/content/Context;", "lessonId", "defaultRating", "", "slideNumber", "<init>", "(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/marrow/listeners/RatingListener;", "analyticPublisher", "Lcom/marrow/analytics/IAnalyticPublisher;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "crashDataProvider", "Lcom/marrow/dataprovider/crash/ICrashDataProvider;", PaymentConstants.TIMESTAMP, "", "setTimestamp", "", "setListener", "bindView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFeedbackTextChangeListener", "submitFeedback", "hideAnimateSkipView", "recordCrash", "throwable", "", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "dismiss", "onDetachedFromWindow", "showLoading", "showFeedbackSubmitted", "showSubmitButton", "postShowOkayButton", "postShowFinalMessage", "msg", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class setSelectionOverridesFromBundle extends shouldEvaluateQueueSize<getEncryptionIvArray> {
    public static final AudioAttributesCompatParcelizer IconCompatParcelizer;
    private static int MediaBrowserCompatMediaItem;
    private static int MediaBrowserCompatSearchResultReceiver;
    private static int MediaDescriptionCompat;
    private static short[] MediaMetadataCompat;
    private static byte[] RatingCompat;
    private static int onAddQueueItem;
    private parseLongAttr AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private SubtitleDecoderFactory1 AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private getSno MediaBrowserCompatItemReceiver;
    private onRebuffer RemoteActionCompatParcelizer;
    private final int read;
    private final String write;
    private static final byte[] $$c = {79, -100, -79, 21};
    private static final int $$f = 111;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {18, -64, -35, -97, 58, -64, -5, -22, 25, -27, -20, 1, 4, -19, 6, -15, -10, 16, -36, -1, 65, -53, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
    private static final int $$h = 186;
    private static final byte[] $$a = {67, -110, -113, 74, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 158;
    private static int handleMediaPlayPauseIfPendingOnHandler = 0;
    private static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
    private static int onCommand = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, byte r7, short r8) {
        /*
            byte[] r0 = kotlin.setSelectionOverridesFromBundle.$$c
            int r8 = r8 * 3
            int r8 = 112 - r8
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSelectionOverridesFromBundle.$$i(short, byte, short):java.lang.String");
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~((~i3) | i6);
        int i8 = ~((~i) | i6);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i6) | i3)) | i7;
        int i11 = i6 + i3 + i5 + ((-1814252664) * i4) + (2073254503 * i2);
        int i12 = i11 * i11;
        int i13 = ((-223937157) * i6) + 1943797760 + (1745420935 * i3) + (i9 * 1162804602) + (1162804602 * i7) + ((-1162804602) * i10) + ((-1386741760) * i5) + ((-1631584256) * i4) + ((-1368915968) * i2) + ((-1053032448) * i12);
        int i14 = (i6 * (-1919122223)) + 1408767311 + (i3 * (-1919121035)) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + (i5 * (-1919121629)) + (i4 * (-390511720)) + (i2 * 1804971285) + (i12 * 255066112);
        switch (i13 + (i14 * i14 * 379846656)) {
            case 1:
                return RemoteActionCompatParcelizer(objArr);
            case 2:
                return IconCompatParcelizer(objArr);
            case 3:
                return write(objArr);
            case 4:
                final setSelectionOverridesFromBundle setselectionoverridesfrombundle = (setSelectionOverridesFromBundle) objArr[0];
                int i15 = 2 % 2;
                EditText editText = setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
                TextView textView = setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                buildEndStateNotification.RemoteActionCompatParcelizer(editText, textView, new getCreatedOnDateMs() { // from class: o.clearSelectionOverride
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        Object[] objArr2 = {this.RemoteActionCompatParcelizer};
                        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
                        int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
                        return (getShowPopup) setSelectionOverridesFromBundle.AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 1408112802, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), iWrite2, objArr2, -1408112799);
                    }
                }, new getCreatedOnDateMs() { // from class: o.clearOverridesOfType
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setSelectionOverridesFromBundle.write(this.IconCompatParcelizer);
                    }
                });
                int i16 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 57;
                onCommand = i16 % 128;
                int i17 = i16 % 2;
                return null;
            case 5:
                return AudioAttributesCompatParcelizer(objArr);
            case 6:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 7:
                return MediaBrowserCompatItemReceiver(objArr);
            default:
                return read(objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 12
            int r7 = 77 - r7
            int r6 = r6 * 10
            int r0 = r6 + 34
            int r5 = r5 + 4
            byte[] r1 = kotlin.setSelectionOverridesFromBundle.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 33
            r2 = -1
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r5 = r5 + 1
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L29:
            r4 = r1[r5]
        L2b:
            int r7 = r7 + r4
            int r7 = r7 + r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSelectionOverridesFromBundle.a(short, short, int, java.lang.Object[]):void");
    }

    private static void c(short s, int i, int i2, Object[] objArr) {
        int i3 = s * 18;
        int i4 = 111 - (i2 * 29);
        int i5 = 48 - (i * 45);
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[46 - i3];
        int i6 = 45 - i3;
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i4 = (i6 + (-i5)) - 7;
            i5 = i5;
        }
        while (true) {
            int i8 = i5 + 1;
            int i9 = i7 + 1;
            bArr2[i9] = (byte) i4;
            if (i9 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = i9;
            i4 = (i4 + (-bArr[i8])) - 7;
            i5 = i8;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected setSelectionOverridesFromBundle(String str, Context context, String str2, int i, String str3) {
        super(context);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.MediaBrowserCompatCustomActionResultReceiver = str2;
        this.read = i;
        this.AudioAttributesImplApi21Parcelizer = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setSelectionOverridesFromBundle(String str, Context context, String str2, int i, String str3, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        String str4;
        if ((i2 & 16) != 0) {
            int i3 = onCommand + 109;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            str4 = null;
        } else {
            str4 = str3;
        }
        this(str, context, str2, i, str4);
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        setSelectionOverridesFromBundle setselectionoverridesfrombundle = (setSelectionOverridesFromBundle) objArr[0];
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 115;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        getEncryptionIvArray getencryptionivarrayMediaMetadataCompat = setselectionoverridesfrombundle.MediaMetadataCompat();
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 105;
        onCommand = i4 % 128;
        int i5 = i4 % 2;
        return getencryptionivarrayMediaMetadataCompat;
    }

    public final void IconCompatParcelizer(long j) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 75;
        int i3 = i2 % 128;
        onCommand = i3;
        int i4 = i2 % 2;
        this.AudioAttributesImplBaseParcelizer = j;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 57;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        setSelectionOverridesFromBundle setselectionoverridesfrombundle = (setSelectionOverridesFromBundle) objArr[0];
        SubtitleDecoderFactory1 subtitleDecoderFactory1 = (SubtitleDecoderFactory1) objArr[1];
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 53;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setselectionoverridesfrombundle.AudioAttributesImplApi26Parcelizer = subtitleDecoderFactory1;
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private getEncryptionIvArray MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = onCommand + 113;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getEncryptionIvArray getencryptionivarrayWrite = getEncryptionIvArray.write(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getencryptionivarrayWrite, "");
        int i4 = onCommand + 37;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getencryptionivarrayWrite;
    }

    private static void b(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(MediaDescriptionCompat)};
            int i6 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            long j2 = 0;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 24297 - (Process.myTid() >> 22), 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = RatingCompat;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i6] = Integer.valueOf(bArr[i7]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) i6;
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - ExpandableListView.getPackedPositionChild(j2)), 3082 - View.MeasureSpec.getMode(i6), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 128, 2145850993, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i7++;
                        i6 = 0;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i8 = $11 + 9;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    byte[] bArr3 = RatingCompat;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(MediaBrowserCompatSearchResultReceiver)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), 24296 - TextUtils.lastIndexOf("", '0', 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) MediaDescriptionCompat) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) MediaMetadataCompat[i2 + ((int) (((long) MediaBrowserCompatSearchResultReceiver) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) MediaDescriptionCompat) ^ 7899112766888837815L)));
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                int i10 = ((i2 + iIntValue) - 2) + ((int) (((long) MediaBrowserCompatSearchResultReceiver) ^ j));
                if (z) {
                    int i11 = $10 + 37;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                buildresumedownloadsintent.read = i10 + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(MediaBrowserCompatMediaItem), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 34134), 16790648 + Color.rgb(0, 0, 0), 21 - Drawable.resolveOpacity(0, 0), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = RatingCompat;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = $11 + 65;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = RatingCompat;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r1]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = MediaMetadataCompat;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r1]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final void read(setSelectionOverridesFromBundle setselectionoverridesfrombundle, String str) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 61;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver.setText(str);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 49;
        onCommand = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 o.SubtitleDecoderFactory1) = (r1v4 o.SubtitleDecoderFactory1), (r1v11 o.SubtitleDecoderFactory1) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.getShowPopup AudioAttributesImplApi21Parcelizer(kotlin.setSelectionOverridesFromBundle r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.setSelectionOverridesFromBundle.onCommand
            int r1 = r1 + 73
            int r2 = r1 % 128
            kotlin.setSelectionOverridesFromBundle.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            o.SubtitleDecoderFactory1 r1 = r3.AudioAttributesImplApi26Parcelizer
            r2 = 76
            int r2 = r2 / 0
            if (r1 == 0) goto L2b
            goto L1b
        L17:
            o.SubtitleDecoderFactory1 r1 = r3.AudioAttributesImplApi26Parcelizer
            if (r1 == 0) goto L2b
        L1b:
            r1.IconCompatParcelizer()
            int r1 = kotlin.setSelectionOverridesFromBundle.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r1 = r1 + 79
            int r2 = r1 % 128
            kotlin.setSelectionOverridesFromBundle.onCommand = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L2b
            r1 = 3
            int r1 = r1 / r0
        L2b:
            r3.dismiss()
            o.getShowPopup r3 = kotlin.getShowPopup.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSelectionOverridesFromBundle.AudioAttributesImplApi21Parcelizer(o.setSelectionOverridesFromBundle):o.getShowPopup");
    }

    private static final getShowPopup MediaBrowserCompatItemReceiver(setSelectionOverridesFromBundle setselectionoverridesfrombundle) {
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = i2 + 47;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        SubtitleDecoderFactory1 subtitleDecoderFactory1 = setselectionoverridesfrombundle.AudioAttributesImplApi26Parcelizer;
        if (subtitleDecoderFactory1 != null) {
            int i5 = i2 + 51;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
            if (i5 % 2 != 0) {
                subtitleDecoderFactory1.IconCompatParcelizer();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            subtitleDecoderFactory1.IconCompatParcelizer();
        }
        setselectionoverridesfrombundle.dismiss();
        return getShowPopup.INSTANCE;
    }

    private static final getShowPopup AudioAttributesImplApi26Parcelizer(setSelectionOverridesFromBundle setselectionoverridesfrombundle) {
        int i = 2 % 2;
        int i2 = onCommand + 39;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            setselectionoverridesfrombundle.dismiss();
            SubtitleDecoderFactory1 subtitleDecoderFactory1 = setselectionoverridesfrombundle.AudioAttributesImplApi26Parcelizer;
            if (subtitleDecoderFactory1 != null) {
                subtitleDecoderFactory1.read();
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 99;
            onCommand = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 70 / 0;
            }
            return getshowpopup;
        }
        setselectionoverridesfrombundle.dismiss();
        SubtitleDecoderFactory1 subtitleDecoderFactory12 = setselectionoverridesfrombundle.AudioAttributesImplApi26Parcelizer;
        throw null;
    }

    private static final getShowPopup MediaMetadataCompat(setSelectionOverridesFromBundle setselectionoverridesfrombundle) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 25;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        setselectionoverridesfrombundle.RatingCompat();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onCommand + 65;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 7;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        boolean z = false;
        if (objRemoteActionCompatParcelizer == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 13183);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1649;
            int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[17], bArr[53], bArr[5], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cIndexOf, iCombineMeasuredStates, i4, -133433128, false, (String) objArr2[0], null);
        }
        onRebuffer onrebuffer = null;
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c2 = (char) (13184 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int iGreen = Color.green(0) + 1649;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 26;
                Object[] objArr3 = new Object[1];
                a((byte) (-$$a[65]), r13[5], r13[53], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(c2, iGreen, edgeSlop, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b((byte) (97 - KeyEvent.normalizeMetaState(0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 952915499, 29956 - AndroidCharacter.getMirror('0'), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1) - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((byte) ((-75) - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 952915497, TextUtils.lastIndexOf("", '0', 0) - 1730054939, (short) Color.green(0), (Process.myTid() >> 22) - 1, objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, 182046542};
                byte[] bArr2 = $$g;
                byte b = bArr2[11];
                byte b2 = (byte) (b - 1);
                byte b3 = b;
                Object[] objArr7 = new Object[1];
                c(b2, b3, (byte) (b3 - 1), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b4 = bArr2[11];
                byte b5 = b4;
                Object[] objArr8 = new Object[1];
                c(b5, (byte) (b5 - 1), b4, objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13182);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1649;
                    int defaultSize = 26 - View.getDefaultSize(0, 0);
                    Object[] objArr9 = new Object[1];
                    a((byte) (-$$a[65]), r6[5], r6[53], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(c3, pressedStateDuration, defaultSize, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((byte) ((KeyEvent.getMaxKeyCode() >> 16) - 27), KeyEvent.getDeadChar(0, 0) + 952915490, (-1730054924) - View.resolveSize(0, 0), (short) TextUtils.indexOf("", ""), (ViewConfiguration.getFadingEdgeLength() >> 16) - 1, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((byte) (View.combineMeasuredStates(0, 0) - 124), 952915494 - Drawable.resolveOpacity(0, 0), View.MeasureSpec.getSize(0) - 1730054902, (short) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) - 1, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cCombineMeasuredStates = (char) (13183 - View.combineMeasuredStates(0, 0));
                        int trimmedLength = 1649 - TextUtils.getTrimmedLength("");
                        int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                        Object[] objArr12 = new Object[1];
                        a((byte) ($$a[3] + 1), r13[5], r13[53], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cCombineMeasuredStates, trimmedLength, i5, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cGreen = (char) (Color.green(0) + 13183);
                        int i6 = 1650 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 26;
                        byte[] bArr3 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr3[17], bArr3[53], bArr3[5], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cGreen, i6, absoluteGravity, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                    c = 3;
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
        int i7 = ((int[]) objArr[c])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 4535), KeyEvent.keyCodeFromString("") + 6054, 42 - View.MeasureSpec.makeMeasureSpec(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = onCommand + 17;
                int i10 = i9 % 128;
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i10;
                if (i9 % 2 != 0) {
                    int i11 = 3 / 3;
                }
                int i12 = i10 + 87;
                onCommand = i12 % 128;
                int i13 = i12 % 2;
                try {
                    Object[] objArr14 = {339068213, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6030, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24);
                    byte b6 = $$g[11];
                    byte b7 = b6;
                    Object[] objArr15 = new Object[1];
                    c(b7, (byte) (b7 - 1), b6, objArr15);
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
        super.onCreate(savedInstanceState);
        this.RemoteActionCompatParcelizer = new excludeTrack();
        this.MediaBrowserCompatItemReceiver = new getSno();
        onRebuffer onrebuffer2 = this.RemoteActionCompatParcelizer;
        if (onrebuffer2 == null) {
            int i14 = onCommand + 53;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i14 % 128;
            int i15 = i14 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            onrebuffer = onrebuffer2;
        }
        this.AudioAttributesCompatParcelizer = new getPlaylistProtectionSchemes(onrebuffer);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) CourseConfigKeyConstantsKt.KEY_NOTES)) {
            int i16 = onCommand + 31;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i16 % 128;
            int i17 = i16 % 2;
            LottieRatingBar lottieRatingBar = AudioAttributesImplBaseParcelizer().AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lottieRatingBar, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(lottieRatingBar);
            CustomTextView customTextView = AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
            CustomTextView customTextView2 = AudioAttributesImplBaseParcelizer().AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView2);
            ImageView imageView = AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            PlayerControlViewExternalSyntheticLambda1.write(imageView);
            AudioAttributesImplBaseParcelizer().read.setHint(R.string.feedback_et_placeholder);
            LinearLayout linearLayout = AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
        } else {
            ImageView imageView2 = AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView2);
            CustomTextView customTextView3 = AudioAttributesImplBaseParcelizer().AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView3, "");
            PlayerControlViewExternalSyntheticLambda1.write((View) customTextView3);
            CustomTextView customTextView4 = AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView4, "");
            PlayerControlViewExternalSyntheticLambda1.write((View) customTextView4);
            LottieRatingBar lottieRatingBar2 = AudioAttributesImplBaseParcelizer().AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lottieRatingBar2, "");
            PlayerControlViewExternalSyntheticLambda1.write(lottieRatingBar2);
            LinearLayout linearLayout2 = AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            PlayerControlViewExternalSyntheticLambda1.write(linearLayout2);
            AudioAttributesImplBaseParcelizer().AudioAttributesImplApi21Parcelizer.setRating(this.read);
            if (this.read > 0) {
                int i18 = onCommand + 123;
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i18 % 128;
                int i19 = i18 % 2;
                z = true;
            }
            String strRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(R.string.text_rate_video);
            CustomTextView customTextView5 = AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver;
            if (z) {
                strRemoteActionCompatParcelizer2 = "Your rating is";
            }
            customTextView5.setText(strRemoteActionCompatParcelizer2);
            AudioAttributesImplBaseParcelizer().AudioAttributesImplApi21Parcelizer.setRatingChangeAllowed(!z);
            final String str = "Your rating is";
            AudioAttributesImplBaseParcelizer().AudioAttributesImplApi21Parcelizer.setOnRatingBarChangedListener(new RatingBar.OnRatingBarChangeListener() { // from class: o.setAllowAudioMixedChannelCountAdaptiveness
                @Override // android.widget.RatingBar.OnRatingBarChangeListener
                public final void onRatingChanged(RatingBar ratingBar, float f, boolean z2) {
                    setSelectionOverridesFromBundle.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str);
                }
            });
        }
        AudioAttributesCompatParcelizer(VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), -389139182, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), new Object[]{this}, 389139186);
        CustomTextView customTextView6 = AudioAttributesImplBaseParcelizer().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView6, "");
        RemoteActionCompatParcelizer(customTextView6, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setAllowAudioMixedDecoderSupportAdaptiveness
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setSelectionOverridesFromBundle.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
            }
        });
        ImageView imageView3 = AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
        RemoteActionCompatParcelizer(imageView3, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.clearViewportSizeConstraints
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setSelectionOverridesFromBundle.read(this.RemoteActionCompatParcelizer);
            }
        });
        CustomTextView customTextView7 = AudioAttributesImplBaseParcelizer().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView7, "");
        RemoteActionCompatParcelizer(customTextView7, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setAllowAudioMixedSampleRateAdaptiveness
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setSelectionOverridesFromBundle.AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        CustomTextView customTextView8 = AudioAttributesImplBaseParcelizer().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView8, "");
        RemoteActionCompatParcelizer(customTextView8, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.addOverride
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setSelectionOverridesFromBundle.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        setSelectionOverridesFromBundle setselectionoverridesfrombundle = (setSelectionOverridesFromBundle) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand + 121;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().read.setBackgroundResource(R.drawable.drw_edit_text_background_error);
        setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().IconCompatParcelizer.setTextColor(_isNaN.getColor(setselectionoverridesfrombundle.getContext(), R.color.v1_onsurfaceRed));
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = onCommand + 121;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup RatingCompat(setSelectionOverridesFromBundle setselectionoverridesfrombundle) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 111;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().read.setBackgroundResource(R.drawable.drw_edit_text_background);
        setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().IconCompatParcelizer.setTextColor(_isNaN.getColor(setselectionoverridesfrombundle.getContext(), R.color.v1_onbackgroundsurface3));
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 49;
        onCommand = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/setSelectionOverridesFromBundle$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "Lo/setSelectionOverridesFromBundle;", "IconCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;I)Lo/setSelectionOverridesFromBundle;", "p3", "write", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Lo/setSelectionOverridesFromBundle;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static setSelectionOverridesFromBundle IconCompatParcelizer(Context p0, String p1, int p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new setSelectionOverridesFromBundle(CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, p0, p1, p2, null, 16, null);
        }

        public static setSelectionOverridesFromBundle write(Context p0, String p1, int p2, String p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            return new setSelectionOverridesFromBundle(CourseConfigKeyConstantsKt.KEY_NOTES, p0, p1, p2, p3);
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static final SchemaCompletionStatusRSModel AudioAttributesCompatParcelizer(accessgetEmptyStatecp accessgetemptystatecp, MarrowResponse marrowResponse) {
        accessgetEmptyStatecp accessgetemptystatecp2;
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 51;
        onCommand = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(marrowResponse, "");
            accessgetemptystatecp2 = accessgetemptystatecp;
            int i3 = 79 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(marrowResponse, "");
            accessgetemptystatecp2 = accessgetemptystatecp;
        }
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 25;
        onCommand = i4 % 128;
        int i5 = i4 % 2;
        return accessgetemptystatecp2;
    }

    private static final SchemaCompletionStatusRSModel AudioAttributesCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 3;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(obj, "");
        SchemaCompletionStatusRSModel schemaCompletionStatusRSModel = (SchemaCompletionStatusRSModel) getanswermap.invoke(obj);
        int i4 = onCommand + 49;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return schemaCompletionStatusRSModel;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void read(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 39;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        getanswermap.invoke(obj);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = onCommand + 9;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
    }

    private static final getShowPopup write(setSelectionOverridesFromBundle setselectionoverridesfrombundle, boolean z, HashMap map, MarrowResponse marrowResponse) {
        Context context;
        int i;
        int i2 = 2 % 2;
        if (marrowResponse instanceof Success) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) setselectionoverridesfrombundle.write, (Object) CourseConfigKeyConstantsKt.KEY_NOTES)) {
                context = setselectionoverridesfrombundle.getContext();
                i = R.string.text_rating_thank_you;
            } else {
                int i3 = onCommand + 69;
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
                int i4 = i3 % 2;
                context = setselectionoverridesfrombundle.getContext();
                i = R.string.notes_feedback_msg;
            }
            String string = context.getString(i);
            toMagicModuleMetaRepoModel.write((Object) string);
            String string2 = setselectionoverridesfrombundle.getContext().getString(R.string.text_qa_feedback_dlg_body);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            setselectionoverridesfrombundle.MediaBrowserCompatSearchResultReceiver();
            if (!z) {
                int i5 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 101;
                onCommand = i5 % 128;
                int i6 = i5 % 2;
                string = string2;
            }
            setselectionoverridesfrombundle.RemoteActionCompatParcelizer(string);
            setselectionoverridesfrombundle.MediaBrowserCompatItemReceiver();
            setselectionoverridesfrombundle.RemoteActionCompatParcelizer();
            setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().AudioAttributesImplApi21Parcelizer.setRatingChangeAllowed(false);
        } else if (marrowResponse instanceof Failed) {
            setselectionoverridesfrombundle.MediaDescriptionCompat();
            setselectionoverridesfrombundle.write(new ResponseErrorException(((Failed) marrowResponse).getError()), (HashMap<String, String>) map);
        } else {
            if (!(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            setselectionoverridesfrombundle.write(((MarrowError) marrowResponse).getThrowable(), (HashMap<String, String>) map);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0182, code lost:
    
        if (r14 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0185, code lost:
    
        if (r14 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0187, code lost:
    
        AudioAttributesCompatParcelizer("Oops! Your feedback message is empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void RatingCompat() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSelectionOverridesFromBundle.RatingCompat():void");
    }

    private final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onCommand + 93;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        onDraw.write(customTextView);
        int i4 = onCommand + 79;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void write(Throwable th, HashMap<String, String> map) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 113;
        onCommand = i2 % 128;
        parseLongAttr parselongattr = null;
        if (i2 % 2 == 0) {
            parselongattr.hashCode();
            throw null;
        }
        parseLongAttr parselongattr2 = this.AudioAttributesCompatParcelizer;
        if (parselongattr2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            parselongattr = parselongattr2;
        }
        parselongattr.write(th, map);
        int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 111;
        onCommand = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, android.app.Dialog, android.content.DialogInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dismiss() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.setSelectionOverridesFromBundle.onCommand
            int r1 = r1 + 109
            int r2 = r1 % 128
            kotlin.setSelectionOverridesFromBundle.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            o.getSno r1 = r4.MediaBrowserCompatItemReceiver
            r3 = 73
            int r3 = r3 / 0
            if (r1 != 0) goto L22
            goto L1c
        L18:
            o.getSno r1 = r4.MediaBrowserCompatItemReceiver
            if (r1 != 0) goto L22
        L1c:
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r1)
            r1 = r2
        L22:
            r1.read()
            super.dismiss()
            int r4 = kotlin.setSelectionOverridesFromBundle.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r4 = r4 + 15
            int r1 = r4 % 128
            kotlin.setSelectionOverridesFromBundle.onCommand = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L34
            return
        L34:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSelectionOverridesFromBundle.dismiss():void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 123;
        int i3 = i2 % 128;
        onCommand = i3;
        getSno getsno = null;
        if (i2 % 2 != 0) {
            getSno getsno2 = this.MediaBrowserCompatItemReceiver;
            if (getsno2 == null) {
                int i4 = i3 + 69;
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                getsno = getsno2;
            }
            getsno.read();
            super.onDetachedFromWindow();
            return;
        }
        getsno.hashCode();
        throw null;
    }

    private void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = onCommand + 97;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int height = AudioAttributesImplBaseParcelizer().MediaBrowserCompatItemReceiver.getHeight();
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        onDraw.write(customTextView, -height);
        LinearLayout linearLayout = AudioAttributesImplBaseParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        onDraw.write(linearLayout, 0);
        int i4 = onCommand + 39;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        int i2 = onCommand + 115;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int height = AudioAttributesImplBaseParcelizer().MediaBrowserCompatItemReceiver.getHeight();
        LinearLayout linearLayout = AudioAttributesImplBaseParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        onDraw.write(linearLayout, -height);
        LinearLayout linearLayout2 = AudioAttributesImplBaseParcelizer().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
        onDraw.write(linearLayout2, 0);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 119;
        onCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
    }

    private final void MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 73;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        int height = AudioAttributesImplBaseParcelizer().MediaBrowserCompatItemReceiver.getHeight();
        LinearLayout linearLayout = AudioAttributesImplBaseParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        onDraw.write(linearLayout, height);
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        onDraw.write(customTextView, 0);
        int i4 = onCommand + 11;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        new Handler().postDelayed(new Runnable() { // from class: o.clearOverride
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr = {this.RemoteActionCompatParcelizer};
                int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
                int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
                setSelectionOverridesFromBundle.AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 1386571165, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), iWrite2, objArr, -1386571165);
            }
        }, 600L);
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 45;
        onCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        setSelectionOverridesFromBundle setselectionoverridesfrombundle = (setSelectionOverridesFromBundle) objArr[0];
        int i = 2 % 2;
        if (!setselectionoverridesfrombundle.isShowing()) {
            return null;
        }
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 119;
        onCommand = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
            if (setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().MediaBrowserCompatItemReceiver == null) {
                return null;
            }
        } else if (setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().MediaBrowserCompatItemReceiver == null) {
            return null;
        }
        int i4 = onCommand + 103;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        int height = setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().MediaBrowserCompatItemReceiver.getHeight();
        LinearLayout linearLayout = setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        onDraw.write(linearLayout, -height);
        CustomTextView customTextView = setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        onDraw.write(customTextView, 0);
        return null;
    }

    private final void RemoteActionCompatParcelizer(final String str) {
        int i = 2 % 2;
        new Handler().postDelayed(new Runnable() { // from class: o.cloneSelectionOverrides
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr = {this.read, str};
                int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
                int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
                setSelectionOverridesFromBundle.AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 1075942388, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), iWrite2, objArr, -1075942383);
            }
        }, 600L);
        int i2 = onCommand + 61;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IconCompatParcelizer(setSelectionOverridesFromBundle setselectionoverridesfrombundle, String str) {
        int i = 2 % 2;
        int i2 = onCommand + 37;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
            if (!setselectionoverridesfrombundle.isShowing()) {
                return;
            }
        } else if (!setselectionoverridesfrombundle.isShowing()) {
            return;
        }
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 115;
        onCommand = i4 % 128;
        int i5 = i4 % 2;
        if (setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().read != null) {
            onDraw.IconCompatParcelizer(setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer);
            onDraw.read(setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().write);
            setselectionoverridesfrombundle.AudioAttributesImplBaseParcelizer().write.setText(Html.fromHtml(str));
        }
    }

    public static /* synthetic */ getShowPopup write(setSelectionOverridesFromBundle setselectionoverridesfrombundle) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 39;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupRatingCompat = RatingCompat(setselectionoverridesfrombundle);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 11;
        onCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopupRatingCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IconCompatParcelizer(setSelectionOverridesFromBundle setselectionoverridesfrombundle) {
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite3 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 1386571165, iWrite3, iWrite2, new Object[]{setselectionoverridesfrombundle}, -1386571165);
    }

    public static /* synthetic */ SchemaCompletionStatusRSModel IconCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = onCommand + 79;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            AudioAttributesCompatParcelizer(getanswermap, obj);
            throw null;
        }
        SchemaCompletionStatusRSModel schemaCompletionStatusRSModelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getanswermap, obj);
        int i3 = onCommand + 15;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        return schemaCompletionStatusRSModelAudioAttributesCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup read(setSelectionOverridesFromBundle setselectionoverridesfrombundle) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 57;
        onCommand = i2 % 128;
        if (i2 % 2 == 0) {
            MediaBrowserCompatItemReceiver(setselectionoverridesfrombundle);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopupMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(setselectionoverridesfrombundle);
        int i3 = onCommand + 13;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopupMediaBrowserCompatItemReceiver;
    }

    public static /* synthetic */ void write(setSelectionOverridesFromBundle setselectionoverridesfrombundle, String str) {
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite3 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 1075942388, iWrite3, iWrite2, new Object[]{setselectionoverridesfrombundle, str}, -1075942383);
    }

    public static /* synthetic */ SchemaCompletionStatusRSModel write(accessgetEmptyStatecp accessgetemptystatecp, MarrowResponse marrowResponse) {
        int i = 2 % 2;
        int i2 = onCommand + 79;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            AudioAttributesCompatParcelizer(accessgetemptystatecp, marrowResponse);
            throw null;
        }
        SchemaCompletionStatusRSModel schemaCompletionStatusRSModelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(accessgetemptystatecp, marrowResponse);
        int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 25;
        onCommand = i3 % 128;
        if (i3 % 2 != 0) {
            return schemaCompletionStatusRSModelAudioAttributesCompatParcelizer;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(setSelectionOverridesFromBundle setselectionoverridesfrombundle) {
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite3 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 1408112802, iWrite3, iWrite2, new Object[]{setselectionoverridesfrombundle}, -1408112799);
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(setSelectionOverridesFromBundle setselectionoverridesfrombundle) throws Throwable {
        int i = 2 % 2;
        int i2 = onCommand + 29;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            MediaMetadataCompat(setselectionoverridesfrombundle);
            throw null;
        }
        getShowPopup getshowpopupMediaMetadataCompat = MediaMetadataCompat(setselectionoverridesfrombundle);
        int i3 = onCommand + 19;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopupMediaMetadataCompat;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 75;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        read(getanswermap, obj);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(setSelectionOverridesFromBundle setselectionoverridesfrombundle, boolean z, HashMap map, MarrowResponse marrowResponse) {
        int i = 2 % 2;
        int i2 = onCommand + 73;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupWrite = write(setselectionoverridesfrombundle, z, map, marrowResponse);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        int i5 = onCommand + 45;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopupWrite;
    }

    public static /* synthetic */ getShowPopup MediaBrowserCompatCustomActionResultReceiver(setSelectionOverridesFromBundle setselectionoverridesfrombundle) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 45;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(setselectionoverridesfrombundle);
        int i4 = onCommand + 125;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return getshowpopupAudioAttributesImplApi21Parcelizer;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(setSelectionOverridesFromBundle setselectionoverridesfrombundle, String str) {
        int i = 2 % 2;
        int i2 = onCommand + 93;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        read(setselectionoverridesfrombundle, str);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 101;
        onCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
    }

    public static /* synthetic */ getShowPopup AudioAttributesImplBaseParcelizer(setSelectionOverridesFromBundle setselectionoverridesfrombundle) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 57;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(setselectionoverridesfrombundle);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        int i5 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 81;
        onCommand = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopupAudioAttributesImplApi26Parcelizer;
    }

    static {
        onAddQueueItem = 1;
        IconCompatParcelizer();
        IconCompatParcelizer = new AudioAttributesCompatParcelizer(null);
        int i = handleMediaPlayPauseIfPendingOnHandler + 105;
        onAddQueueItem = i % 128;
        int i2 = i % 2;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite3 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), -389139182, iWrite3, iWrite2, new Object[]{this}, 389139186);
    }

    private static final getShowPopup MediaDescriptionCompat(setSelectionOverridesFromBundle setselectionoverridesfrombundle) {
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite3 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 1667036938, iWrite3, iWrite2, new Object[]{setselectionoverridesfrombundle}, -1667036931);
    }

    private static final void MediaBrowserCompatMediaItem(setSelectionOverridesFromBundle setselectionoverridesfrombundle) {
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite3 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 1586381421, iWrite3, iWrite2, new Object[]{setselectionoverridesfrombundle}, -1586381415);
    }

    @getMagicModuleMeta
    public static final setSelectionOverridesFromBundle read(Context context, String str, int i) {
        int i2 = 2 % 2;
        int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 101;
        onCommand = i3 % 128;
        int i4 = i3 % 2;
        setSelectionOverridesFromBundle setselectionoverridesfrombundleIconCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer(context, str, i);
        if (i4 == 0) {
            int i5 = 83 / 0;
        }
        return setselectionoverridesfrombundleIconCompatParcelizer;
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* bridge */ /* synthetic */ getApplicationLabel write() {
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite3 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        return (getApplicationLabel) AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 1927312502, iWrite3, iWrite2, new Object[]{this}, -1927312501);
    }

    public final void read(SubtitleDecoderFactory1 subtitleDecoderFactory1) {
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite3 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 1670008484, iWrite3, iWrite2, new Object[]{this, subtitleDecoderFactory1}, -1670008482);
    }

    static void IconCompatParcelizer() {
        MediaBrowserCompatSearchResultReceiver = -1472788069;
        MediaDescriptionCompat = -819363145;
        MediaBrowserCompatMediaItem = 135932040;
        RatingCompat = new byte[]{-89, -34, 39, -41, 44, -16, -13, 17, 47, -37, 35, -24, 27, 61, -61, 33, -89, 3, -9, 46, -39, -9, 16, 27, -51, 7, 9, -9, 4, 11, 3, -7, -95, 90, -90, 81, 123, -124, 90, -93, TarConstants.LF_GNUTYPE_SPARSE, -88, 116, 119, -23, 86, 19, -104, -87, -88, -81, 92, -92, 95, -72, -53, TarConstants.LF_CONTIG, -58, 59, 56, -49, 32, -35, -52, -63, TarConstants.LF_NORMAL, 60, -58, TarConstants.LF_BLK};
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        setSelectionOverridesFromBundle setselectionoverridesfrombundle = (setSelectionOverridesFromBundle) objArr[0];
        int i = 2 % 2;
        int i2 = onCommand + 117;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite3 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        AudioAttributesCompatParcelizer(iWrite, VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write(), 1586381421, iWrite3, iWrite2, new Object[]{setselectionoverridesfrombundle}, -1586381415);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 9;
        onCommand = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        setSelectionOverridesFromBundle setselectionoverridesfrombundle = (setSelectionOverridesFromBundle) objArr[0];
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 91;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {setselectionoverridesfrombundle};
        int iWrite = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite2 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite3 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        int iWrite4 = VideoSizeExternalSyntheticLambda0.AudioAttributesCompatParcelizer.write();
        if (i3 == 0) {
            throw null;
        }
        getShowPopup getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(iWrite, iWrite4, 1667036938, iWrite3, iWrite2, objArr2, -1667036931);
        int i4 = onCommand + 99;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        setSelectionOverridesFromBundle setselectionoverridesfrombundle = (setSelectionOverridesFromBundle) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onCommand + 97;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(setselectionoverridesfrombundle, str);
        int i4 = onCommand + 7;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
