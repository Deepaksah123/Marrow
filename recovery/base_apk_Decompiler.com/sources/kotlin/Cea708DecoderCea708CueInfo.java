package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.Toolbar;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.ui.activities.blocking.BlockingViewModel;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b;
import java.lang.reflect.Method;
import kotlin.CeaDecoderCeaOutputBuffer;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda50;
import kotlin.DvbDecoder;
import kotlin.Metadata;
import kotlin.ResolvableApiException;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0010R\u001b\u0010\u001b\u001a\u00020\u00178CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lo/Cea708DecoderCea708CueInfo;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "MediaMetadataCompat", "AudioAttributesImplApi26Parcelizer", "", "Landroid/text/SpannableString;", "write", "(Ljava/lang/String;)Landroid/text/SpannableString;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)V", "MediaBrowserCompatSearchResultReceiver", "MediaDescriptionCompat", "onBackPressed", "RatingCompat", "MediaBrowserCompatMediaItem", "RemoteActionCompatParcelizer", "Lo/getIndexUri;", "Lo/setSessionInfo;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/getIndexUri;", "read", "Lcom/marrow/ui/activities/blocking/BlockingViewModel;", "Lo/RenewEligible;", "AudioAttributesImplBaseParcelizer", "()Lcom/marrow/ui/activities/blocking/BlockingViewModel;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Cea708DecoderCea708CueInfo extends setPenAttributes {
    private static char AudioAttributesCompatParcelizer;
    private static char AudioAttributesImplApi21Parcelizer;
    private static char AudioAttributesImplApi26Parcelizer;
    private static char[] AudioAttributesImplBaseParcelizer;
    private static /* synthetic */ isResolutionNotSupported<Object>[] IconCompatParcelizer;
    private static char MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaDescriptionCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setSessionInfo read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;
    private static final byte[] $$c = {41, -117, 87, 37};
    private static final int $$f = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_SYMLINK, -57, 8, -14, -67, TarConstants.LF_CONTIG, -4, 13, -50, 47, -5, -19, 17, -13, 4, -3, -35, 26, 1, -2, -5, 8, 24, 10, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, TarConstants.LF_CONTIG, -4, 13, -50, 35, -7, -20, 17, -37, TarConstants.LF_LINK, -17, -2, -3, 11, -80, 81, -7, -11, 9, -17, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$h = TsExtractor.TS_STREAM_TYPE_AC4;
    private static final byte[] $$a = {98, -46, 102, 39, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 164;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int RatingCompat = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r7, byte r8, byte r9) {
        /*
            int r9 = r9 * 4
            int r9 = 122 - r9
            byte[] r0 = kotlin.Cea708DecoderCea708CueInfo.$$c
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Cea708DecoderCea708CueInfo.$$i(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 114 - r6
            int r7 = r7 + 4
            int r8 = 190 - r8
            byte[] r0 = kotlin.Cea708DecoderCea708CueInfo.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r8]
        L24:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Cea708DecoderCea708CueInfo.c(int, byte, short, java.lang.Object[]):void");
    }

    private static void d(short s, short s2, int i, Object[] objArr) {
        int i2 = 111 - s2;
        byte[] bArr = $$g;
        int i3 = s + 4;
        byte[] bArr2 = new byte[31 - i];
        int i4 = 30 - i;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = i2 + i3 + 2;
            i3 = i3;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            int i7 = i3 + 1;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = i6;
            i2 = i2 + bArr[i7] + 2;
            i3 = i7;
        }
    }

    public Cea708DecoderCea708CueInfo() {
        Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo = this;
        this.read = parseTrackTiming.write(cea708DecoderCea708CueInfo, SessionDescriptionParser.RemoteActionCompatParcelizer(), new IconCompatParcelizer());
        this.IconCompatParcelizer = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(BlockingViewModel.class), new AnonymousClass4(cea708DecoderCea708CueInfo), new AnonymousClass2(cea708DecoderCea708CueInfo), new AnonymousClass1(cea708DecoderCea708CueInfo));
    }

    public static final /* synthetic */ BlockingViewModel AudioAttributesImplApi21Parcelizer(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 41;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        BlockingViewModel blockingViewModelAudioAttributesImplBaseParcelizer = cea708DecoderCea708CueInfo.AudioAttributesImplBaseParcelizer();
        int i4 = MediaBrowserCompatItemReceiver + 125;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return blockingViewModelAudioAttributesImplBaseParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        int i = 2 % 2;
        int i2 = RatingCompat + 53;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        cea708DecoderCea708CueInfo.MediaBrowserCompatMediaItem();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatItemReceiver + 69;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void read(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 97;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            int iRemoteActionCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer();
            RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 284126027, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), new Object[]{cea708DecoderCea708CueInfo, str}, iRemoteActionCompatParcelizer, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -284126026);
            return;
        }
        int iRemoteActionCompatParcelizer2 = DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 284126027, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), new Object[]{cea708DecoderCea708CueInfo, str}, iRemoteActionCompatParcelizer2, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -284126026);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final getIndexUri MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = RatingCompat + 81;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        getIndexUri getindexuri = (getIndexUri) this.read.read(this, IconCompatParcelizer[0]);
        int i4 = RatingCompat + 3;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return getindexuri;
        }
        throw null;
    }

    private final BlockingViewModel AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 101;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        BlockingViewModel blockingViewModel = (BlockingViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        int i4 = MediaBrowserCompatItemReceiver + 27;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return blockingViewModel;
    }

    public static final class IconCompatParcelizer implements getAnswerMap<Cea708DecoderCea708CueInfo, getIndexUri> {
        private static getIndexUri AudioAttributesCompatParcelizer(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
            toMagicModuleMetaRepoModel.write(cea708DecoderCea708CueInfo, "");
            return getIndexUri.read(SessionDescriptionParser.AudioAttributesCompatParcelizer(cea708DecoderCea708CueInfo));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.getIndexUri] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getIndexUri invoke(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
            return AudioAttributesCompatParcelizer(cea708DecoderCea708CueInfo);
        }
    }

    /* JADX INFO: renamed from: o.Cea708DecoderCea708CueInfo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$write.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$write = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.Cea708DecoderCea708CueInfo$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$IconCompatParcelizer.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$IconCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.Cea708DecoderCea708CueInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ MediaBrowserCompatMediaItem $RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$RemoteActionCompatParcelizer.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<DvbDecoder> newNumberOtpResendRequest = Cea708DecoderCea708CueInfo.AudioAttributesImplApi21Parcelizer(Cea708DecoderCea708CueInfo.this).read();
                final Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo = Cea708DecoderCea708CueInfo.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (newNumberOtpResendRequest.write(new getValidationToken() { // from class: o.Cea708DecoderCea708CueInfo.AudioAttributesCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((DvbDecoder) obj2);
                    }

                    private Object write(DvbDecoder dvbDecoder) {
                        if (!(dvbDecoder instanceof DvbDecoder.RemoteActionCompatParcelizer)) {
                            throw new RenewEligibleCreator();
                        }
                        String strAudioAttributesCompatParcelizer = parseDuration.AudioAttributesCompatParcelizer(cea708DecoderCea708CueInfo);
                        Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo2 = cea708DecoderCea708CueInfo;
                        toMagicModuleMetaRepoModel.write((Object) strAudioAttributesCompatParcelizer);
                        DvbDecoder.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (DvbDecoder.RemoteActionCompatParcelizer) dvbDecoder;
                        Cea708DecoderCea708CueInfo.read(cea708DecoderCea708CueInfo2, populateHttpRequestHeaders.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, remoteActionCompatParcelizer.IconCompatParcelizer(), remoteActionCompatParcelizer.read()));
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return Cea708DecoderCea708CueInfo.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[i3] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i4 = $10 + 27;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 5;
            }
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 63;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i6) ^ ((c2 << 4) + ((char) (((long) AudioAttributesImplApi21Parcelizer) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) View.resolveSize(0, 0), TextUtils.lastIndexOf("", '0', 0) + 1505, 21 - Gravity.getAbsoluteGravity(0, 0), 1322448859, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) AudioAttributesCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.getOffsetBefore("", 0) + 1504, 21 - Color.blue(0), 1322448859, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getPressedStateDuration() >> 16) + 9016, (ViewConfiguration.getFadingEdgeLength() >> 16) + 58, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class RemoteActionCompatParcelizer extends ClickableSpan {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            Cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver(Cea708DecoderCea708CueInfo.this);
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = AudioAttributesImplBaseParcelizer;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 29;
                $11 = i8 % 128;
                if (i8 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11613, 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i7 >>>= 1;
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
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Drawable.resolveOpacity(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 11613, 20 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i7++;
                }
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
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), Color.red(0) + 22959, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 31589), 9863 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 64, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (37821 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "") + 9754, 27 - Gravity.getAbsoluteGravity(0, 0), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i11 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i11, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i11);
            int i12 = $11 + 69;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 5 / 5;
            }
        }
        if (!(!z)) {
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX INFO: renamed from: o.Cea708DecoderCea708CueInfo$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/Cea708DecoderCea708CueInfo$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "Landroid/content/Intent;", "read", "(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent read(Context p0, int p1, String p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intentPutExtra = new Intent(p0, (Class<?>) Cea708DecoderCea708CueInfo.class).putExtra("blocking_reason", p1).putExtra("user_email", p2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intentPutExtra, "");
            return intentPutExtra;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static final void MediaBrowserCompatItemReceiver(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        int i = 2 % 2;
        int i2 = RatingCompat + 21;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        cea708DecoderCea708CueInfo.finish();
        int i4 = RatingCompat + 105;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void AudioAttributesImplBaseParcelizer(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        int i = 2 % 2;
        int i2 = RatingCompat + 109;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        cea708DecoderCea708CueInfo.onBackPressed();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void AudioAttributesImplApi26Parcelizer(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        float f;
        int i = 2 % 2;
        cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplBaseParcelizer.setSelected(!cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplBaseParcelizer.isSelected());
        cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().write.setEnabled(cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplBaseParcelizer.isSelected());
        CustomButton customButton = cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().write;
        if (cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplBaseParcelizer.isSelected()) {
            int i2 = MediaBrowserCompatItemReceiver + 21;
            int i3 = i2 % 128;
            RatingCompat = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            MediaBrowserCompatItemReceiver = i5 % 128;
            int i6 = i5 % 2;
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        customButton.setAlpha(f);
    }

    private static final void MediaBrowserCompatMediaItem(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        int i = 2 % 2;
        int i2 = RatingCompat + 55;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1017147417, 1848760977, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 677165140, new Object[]{cea708DecoderCea708CueInfo}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1848760973);
        int i4 = RatingCompat + 75;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void RatingCompat(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 53;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        cea708DecoderCea708CueInfo.AudioAttributesImplBaseParcelizer().IconCompatParcelizer(CeaDecoderCeaOutputBuffer.AudioAttributesCompatParcelizer.INSTANCE);
        int i4 = MediaBrowserCompatItemReceiver + 63;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0141  */
    @Override // kotlin.setPenAttributes, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Cea708DecoderCea708CueInfo.onCreate(android.os.Bundle):void");
    }

    private final void MediaMetadataCompat() {
        int i = 2 % 2;
        CmcdConfigurationRequestConfig.read(this, new AudioAttributesCompatParcelizer(null));
        int i2 = MediaBrowserCompatItemReceiver + 73;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 11;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Toolbar toolbar = MediaBrowserCompatCustomActionResultReceiver().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        int i4 = MediaBrowserCompatItemReceiver + 11;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private final SpannableString write(String p0) {
        String string;
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        if (p0.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append(" ");
            string = sb.toString();
            int i4 = RatingCompat + 97;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
        } else {
            string = "";
        }
        String string2 = getString(R.string.text_block_reasons_with_email, string);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo = this;
        String string3 = getString(R.string.font_roboto_bold);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        return dispatchTouchEvent.IconCompatParcelizer(string2, cea708DecoderCea708CueInfo, string3, string);
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo = (Cea708DecoderCea708CueInfo) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 115;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().read.setTitle(cea708DecoderCea708CueInfo.getString(R.string.request_resolution));
        cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi26Parcelizer.setText(cea708DecoderCea708CueInfo.getString(R.string.text_kyc_head));
        cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatItemReceiver.setText(cea708DecoderCea708CueInfo.write(str));
        CustomTextView customTextView = cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
        cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesCompatParcelizer.setText(cea708DecoderCea708CueInfo.getString(R.string.text_kyc_btn_cont));
        cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatCustomActionResultReceiver.setText(cea708DecoderCea708CueInfo.getString(R.string.text_kyc_head_2));
        CustomTextView customTextView2 = cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer;
        String string = cea708DecoderCea708CueInfo.getString(R.string.text_kyc_desc_2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = cea708DecoderCea708CueInfo.getString(R.string.font_roboto_bold);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = cea708DecoderCea708CueInfo.getString(R.string.legal_marrowmed);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        customTextView2.setText(dispatchTouchEvent.IconCompatParcelizer(string, cea708DecoderCea708CueInfo, string2, string3));
        CustomTextView customTextView3 = cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView3, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) customTextView3);
        cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().RemoteActionCompatParcelizer.setText(cea708DecoderCea708CueInfo.getString(R.string.text_kyc_block_bullets));
        CustomTextView customTextView4 = cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView4, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) customTextView4);
        cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatMediaItem.setText(cea708DecoderCea708CueInfo.getString(R.string.text_kyc_note_red));
        int i4 = RatingCompat + 83;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo = (Cea708DecoderCea708CueInfo) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 33;
        MediaBrowserCompatItemReceiver = i2 % 128;
        cea708DecoderCea708CueInfo.MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatSearchResultReceiver.setDisplayedChild(i2 % 2 == 0 ? 1 : 0);
        int i3 = MediaBrowserCompatItemReceiver + 57;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private final void MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = RatingCompat + 111;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatSearchResultReceiver.setDisplayedChild(0);
        int i4 = RatingCompat + 53;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = RatingCompat + 107;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0 ? MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatSearchResultReceiver.getDisplayedChild() != 1 : MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatSearchResultReceiver.getDisplayedChild() != 0) {
            super.onBackPressed();
            return;
        }
        int i3 = MediaBrowserCompatItemReceiver + 67;
        RatingCompat = i3 % 128;
        if (i3 % 2 != 0) {
            MediaDescriptionCompat();
            return;
        }
        MediaDescriptionCompat();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void RatingCompat() {
        int i = 2 % 2;
        String string = getString(R.string.text_tnc);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.text_marrow_terms, string);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String str = string2;
        SpannableString spannableString = new SpannableString(str);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        int i2 = TestGroupLSModel.read((CharSequence) str, string, 0, false, 6);
        spannableString.setSpan(remoteActionCompatParcelizer, i2, string.length() + i2, 18);
        dispatchTouchEvent.write(spannableString, this, R.color.text_color_blue_dark, i2, string.length() + i2);
        MediaBrowserCompatCustomActionResultReceiver().MediaMetadataCompat.setText(spannableString);
        MediaBrowserCompatCustomActionResultReceiver().MediaMetadataCompat.setMovementMethod(LinkMovementMethod.getInstance());
        int i3 = MediaBrowserCompatItemReceiver + 83;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
        String string = getString(R.string.clickable_text_terms_condition_landing_page);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        startActivity(ResolvableApiException.Companion.read(this, new canceledPendingResult("https://www.marrow.com/home/terms", string, null, 4, null)));
        int i2 = MediaBrowserCompatItemReceiver + 69;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Cea708DecoderCea708CueInfo.read(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    @Override // kotlin.setPenAttributes, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Cea708DecoderCea708CueInfo.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0cbd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0da2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0de4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0e37  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1043  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.setPenAttributes, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Cea708DecoderCea708CueInfo.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        String string;
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = (~(i7 | (~i4) | i2)) | (~(i2 | i6 | i4));
        int i10 = ~i2;
        int i11 = (~(i4 | i6)) | (~(i10 | i4)) | (~(i10 | i6));
        int i12 = i2 + i6 + i + (1698977638 * i3) + (1466394737 * i5);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i2) - 490274816) + ((-1116082190) * i6) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i) + (1553727488 * i3) + (1859780608 * i5) + (925827072 * i13);
        int i15 = ((i2 * (-1787956080)) - 1478154965) + (i6 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i * (-1787955639)) + (i3 * 552005654) + (i5 * (-2013897159)) + (i13 * (-429457408));
        int i16 = i14 + (i15 * i15 * (-402587648));
        if (i16 == 1) {
            Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo = (Cea708DecoderCea708CueInfo) objArr[0];
            String str = (String) objArr[1];
            int i17 = 2 % 2;
            int i18 = RatingCompat + 15;
            MediaBrowserCompatItemReceiver = i18 % 128;
            if (i18 % 2 == 0 ? cea708DecoderCea708CueInfo.getIntent().getIntExtra("blocking_reason", 0) != 1210 : cea708DecoderCea708CueInfo.getIntent().getIntExtra("blocking_reason", 1) != 5570) {
                string = cea708DecoderCea708CueInfo.getString(R.string.unblock_request);
            } else {
                string = cea708DecoderCea708CueInfo.getString(R.string.unblock_request_kyc);
                int i19 = RatingCompat + 79;
                MediaBrowserCompatItemReceiver = i19 % 128;
                int i20 = i19 % 2;
            }
            toMagicModuleMetaRepoModel.write((Object) string);
            scheduleUpdate.AudioAttributesCompatParcelizer(cea708DecoderCea708CueInfo, "legal@marrowmed.com", string, str);
            return null;
        }
        if (i16 == 2) {
            return read(objArr);
        }
        if (i16 == 3) {
            return AudioAttributesCompatParcelizer(objArr);
        }
        if (i16 == 4) {
            return RemoteActionCompatParcelizer(objArr);
        }
        if (i16 == 5) {
            return IconCompatParcelizer(objArr);
        }
        Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo2 = (Cea708DecoderCea708CueInfo) objArr[0];
        int i21 = 2 % 2;
        int i22 = RatingCompat + 51;
        MediaBrowserCompatItemReceiver = i22 % 128;
        int i23 = i22 % 2;
        super.onStart();
        int i24 = MediaBrowserCompatItemReceiver + 77;
        RatingCompat = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    public static /* synthetic */ void write(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        int i = 2 % 2;
        int i2 = RatingCompat + 79;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        RatingCompat(cea708DecoderCea708CueInfo);
        int i4 = MediaBrowserCompatItemReceiver + 87;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void read(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplBaseParcelizer(cea708DecoderCea708CueInfo);
        int i4 = MediaBrowserCompatItemReceiver + 75;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 3;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatItemReceiver(cea708DecoderCea708CueInfo);
        int i4 = MediaBrowserCompatItemReceiver + 49;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        int iRemoteActionCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 219470013, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), new Object[]{cea708DecoderCea708CueInfo}, iRemoteActionCompatParcelizer, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -219470008);
    }

    public static /* synthetic */ void IconCompatParcelizer(Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo) {
        int i = 2 % 2;
        int i2 = RatingCompat + 111;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi26Parcelizer(cea708DecoderCea708CueInfo);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        int i5 = MediaBrowserCompatItemReceiver + 61;
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        MediaDescriptionCompat = 1;
        MediaBrowserCompatItemReceiver();
        IconCompatParcelizer = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(Cea708DecoderCea708CueInfo.class, "binding", "getBinding()Lcom/marrow/databinding/DialogBlockInfoBinding;", 0))};
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatMediaItem + 109;
        MediaDescriptionCompat = i % 128;
        int i2 = i % 2;
    }

    private final void RemoteActionCompatParcelizer(String p0) {
        int iRemoteActionCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 284126027, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), new Object[]{this, p0}, iRemoteActionCompatParcelizer, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -284126026);
    }

    private final void AudioAttributesCompatParcelizer(String p0) {
        RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 1899801005, b.RunnableC0015b.write(), new Object[]{this, p0}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1107750792, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1899801002);
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        RemoteActionCompatParcelizer(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1017147417, 1848760977, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 677165140, new Object[]{this}, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), -1848760973);
    }

    @Override // kotlin.setPenAttributes, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int iRemoteActionCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 1541063492, DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 1824069125, -1541063492);
    }

    @Override // kotlin.setPenAttributes, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() {
        RemoteActionCompatParcelizer(1230549754 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1), -136309466, b.RunnableC0015b.write(), new Object[]{this}, b.RunnableC0015b.write(), DefaultAnalyticsCollectorExternalSyntheticLambda50.AnonymousClass1.RemoteActionCompatParcelizer(), 136309468);
    }

    static void MediaBrowserCompatItemReceiver() {
        AudioAttributesCompatParcelizer = (char) 55769;
        MediaBrowserCompatCustomActionResultReceiver = (char) 49834;
        AudioAttributesImplApi21Parcelizer = (char) 9148;
        AudioAttributesImplApi26Parcelizer = (char) 45413;
        AudioAttributesImplBaseParcelizer = new char[]{44982, 45040, 45049, 45041, 44813, 44831, 44706, 44707, 44731, 44729, 44718, 44710, 44726, 44734, 44735, 44735, 44734, 44731, 44690, 44919, 44703, 44732, 44708, 44679, 44677, 44710, 44728, 44732, 44731, 44709, 44711, 44693, 44896, 44902, 44897, 44903, 44689, 44900, 44714, 44920, 44921, 44714, 44693, 44903, 44896, 44695, 44693, 44896, 44901, 44692, 44714, 44693, 44921, 44903, 44922, 44900, 44694, 44689, 44692, 44695, 44714, 44896, 44901, 44695, 44693, 44714, 44921, 44920, 44901, 44921, 44903, 44692, 44923, 44694, 44695, 44694, 44693, 44922, 44902, 45005, 44807, 44806, 45040, 45046, 44807, 45040, 45044, 44801, 44811, 44807, 45005, 44806, 45047, 44813, 44804, 44802, 44801, 44824, 44815, 44808, 45040, 45047, 44994, 44994, 45017, 44806, 44803, 44807, 44807, 44811, 44806, 44807, 44813, 45044, 44805, 45044, 44994, 44993, 44805, 44994, 44807, 44806, 45044, 44810, 44813, 44808, 44994, 44808, 44803, 45040, 44994, 44812, 44802, 45046, 45005, 45044, 44801, 45040, 44804, 44800, 44806, 45047, 44801, 45040, 44804, 44810, 44947, 44986, 44987, 44984, 44965, 44985, 44681, 44734, 44709, 44718, 44709, 44707, 44714, 44693, 44718, 44714, 44693, 44704, 44916, 44713, 44708, 44694, 44950, 44991, 44985, 44984, 44985, 44989, 44991, 44990, 44988, 44989, 44988, 44946, 44984, 44985, 44991, 44989, 44989, 44990, 44985, 44988, 44990, 44985};
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        Cea708DecoderCea708CueInfo cea708DecoderCea708CueInfo = (Cea708DecoderCea708CueInfo) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 87;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatMediaItem(cea708DecoderCea708CueInfo);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        int i5 = MediaBrowserCompatItemReceiver + 33;
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }
}
