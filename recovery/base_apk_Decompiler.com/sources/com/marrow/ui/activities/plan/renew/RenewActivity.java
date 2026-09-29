package com.marrow.ui.activities.plan.renew;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.images.zab;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow.ui.activities.plan.renew.RenewActivity;
import java.lang.reflect.Method;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.MediaBrowserCompatMediaItem;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligible;
import kotlin.RtspRequest;
import kotlin.VirtualAnnotatedMember;
import kotlin.VisibilityChecker;
import kotlin.WebvttCueParserElement;
import kotlin._handleUnrecognizedCharacterEscape;
import kotlin._isNaN;
import kotlin._selectSetter;
import kotlin._validJsonValueList;
import kotlin.clearDownloadManagerHelpers;
import kotlin.getCreatedOnDateMs;
import kotlin.getLatestBitrateEstimate;
import kotlin.getShowPopup;
import kotlin.getStreamPositionUsForContent;
import kotlin.hasMixIns;
import kotlin.multiplyFft;
import kotlin.needsStartedService;
import kotlin.parseCue;
import kotlin.parseEac3SupplementalProperties;
import kotlin.parseLineAnchor;
import kotlin.setSdkPayload;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.withFieldVisibility;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\"\u0010\u000e\u001a\u00020\r8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/marrow/ui/activities/plan/renew/RenewActivity;", "Lcom/marrow/ui/activities/base/BaseActivity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "", "MediaBrowserCompatMediaItem", "()I", "handleMediaPlayPauseIfPendingOnHandler", "Lo/getStreamPositionUsForContent;", "preferenceDataProvider", "Lo/getStreamPositionUsForContent;", "getPreferenceDataProvider", "()Lo/getStreamPositionUsForContent;", "setPreferenceDataProvider", "(Lo/getStreamPositionUsForContent;)V", "Lo/parseLineAnchor;", "RemoteActionCompatParcelizer", "Lo/RenewEligible;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/parseLineAnchor;", "write", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RenewActivity extends parseCue {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AudioAttributesCompatParcelizer;
    private static int IconCompatParcelizer;
    private static int RatingCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    @setSdkPayload
    public getStreamPositionUsForContent preferenceDataProvider;
    private static final byte[] $$j = {59, 79, 7, -2, 70, -71, 5, 27, -7, 10, 14, -6, 20, -14, -3, 3, 0, 20, 41, -29, -12, 16, -1, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8, 70, -52, 7, -10, 43, -18, -10, 2, 13, 2, 12, 28, -32, 14, 16, 36, -39, 8, 7, 47, -39, 6, 5, 14, 7, -12, 16, -8, 18, -6, 0, TarConstants.LF_LINK, -15, -8, 18, -1, 7, -8};
    private static final int $$k = 56;
    private static final byte[] $$d = {115, -66, -117, -68, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 222;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaDescriptionCompat = 1;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | (~i6) | i)) | (~(i | i3 | i6));
        int i10 = ~i;
        int i11 = (~(i6 | i3)) | (~(i10 | i6)) | (~(i10 | i3));
        int i12 = i + i3 + i2 + (1698977638 * i5) + (1466394737 * i4);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i) - 490274816) + ((-1116082190) * i3) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i2) + (1553727488 * i5) + (1859780608 * i4) + (925827072 * i13);
        int i15 = ((i * (-1787956080)) - 1478154965) + (i3 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i2 * (-1787955639)) + (i5 * 552005654) + (i4 * (-2013897159)) + (i13 * (-429457408));
        int i16 = i14 + (i15 * i15 * (-402587648));
        return i16 != 1 ? i16 != 2 ? RemoteActionCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : write(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.marrow.ui.activities.plan.renew.RenewActivity.$$d
            int r1 = r7 + 4
            int r6 = 114 - r6
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.renew.RenewActivity.g(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 119 - r8
            int r6 = r6 + 4
            byte[] r0 = com.marrow.ui.activities.plan.renew.RenewActivity.$$j
            int r7 = 39 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r8 = r6
            r3 = r7
            r4 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L28:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r8 + 1
            int r8 = r3 + 5
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.renew.RenewActivity.h(short, short, byte, java.lang.Object[]):void");
    }

    public RenewActivity() {
        RenewActivity renewActivity = this;
        this.write = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(parseLineAnchor.class), new AnonymousClass5(renewActivity), new getCreatedOnDateMs() { // from class: o.getApplicableStyles
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return RenewActivity.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        }, new AnonymousClass1(renewActivity));
    }

    public final getStreamPositionUsForContent getPreferenceDataProvider() {
        int i = 2 % 2;
        getStreamPositionUsForContent getstreampositionusforcontent = this.preferenceDataProvider;
        if (getstreampositionusforcontent == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 1;
        int i3 = i2 % 128;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return getstreampositionusforcontent;
    }

    public final void setPreferenceDataProvider(getStreamPositionUsForContent getstreampositionusforcontent) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 63;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.preferenceDataProvider = getstreampositionusforcontent;
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 5;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends _selectSetter {
        AudioAttributesCompatParcelizer(Bundle bundle) {
            super(RenewActivity.this, bundle);
        }

        @Override // kotlin._selectSetter
        public final <T extends POJOPropertyBuilderWithMember> T read(String str, Class<T> cls, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(cls, "");
            toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
            return new parseLineAnchor(RenewActivity.this.getPreferenceDataProvider());
        }
    }

    private final parseLineAnchor MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 115;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        parseLineAnchor parselineanchor = (parseLineAnchor) this.write.RemoteActionCompatParcelizer();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 73;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return parselineanchor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final VisibilityChecker.RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver(RenewActivity renewActivity) {
        int i = 2 % 2;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = renewActivity.new AudioAttributesCompatParcelizer(renewActivity.getIntent().getExtras());
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 99;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return audioAttributesCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.marrow.ui.activities.plan.renew.RenewActivity$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/ui/activities/plan/renew/RenewActivity$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "read", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent read(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) RenewActivity.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.marrow.ui.activities.plan.renew.RenewActivity$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$write.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$write = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: com.marrow.ui.activities.plan.renew.RenewActivity$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ MediaBrowserCompatMediaItem $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$RemoteActionCompatParcelizer.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    private static void e(boolean z, int i, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr3 = new char[i3];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        int i5 = $10 + 55;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
            int i7 = $11 + 21;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr3[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i2 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i9 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i9]), Integer.valueOf(IconCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - Process.getGidForName("")), ((Process.getThreadPriority(0) + 20) >> 6) + 23704, 31 - TextUtils.lastIndexOf("", '0'), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 44862), 18945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i10 = $10 + 67;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cleardownloadmanagerhelpers.write = i;
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, 0, cArr4, 0, i3);
            System.arraycopy(cArr4, 0, cArr3, i3 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr4, cleardownloadmanagerhelpers.write, cArr3, 0, i3 - cleardownloadmanagerhelpers.write);
        }
        if (!(!z)) {
            int i12 = $11 + 19;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr2 = new char[i3];
                cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 1;
            } else {
                cArr2 = new char[i3];
                cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            }
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
                int i13 = $10 + 123;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr3[(i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (View.resolveSize(0, 0) + 44862), 18944 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 28 - View.getDefaultSize(0, 0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    private static void f(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        char c;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = write;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getOffsetAfter("", 0), 7015 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 30 - View.MeasureSpec.getMode(0), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    int i5 = $10 + 59;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
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
        try {
            Object[] objArr3 = {Integer.valueOf(AudioAttributesCompatParcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
            char c2 = '0';
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getMode(0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 7015, TextUtils.lastIndexOf("", '0', 0, 0) + 31, -626716224, false, "o", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
                while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                    int i7 = $10 + 23;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                    needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                    if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                        c = c2;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((Process.myTid() >> 22) + 48194), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20126, 20 - Color.red(0), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                            int i9 = $11 + 65;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                c = '0';
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) Drawable.resolveOpacity(0, 0), 19368 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 19, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c = '0';
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                            int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            c = '0';
                            if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                                needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                                needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                                int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i12];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                            } else {
                                int i14 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                int i15 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i14];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i15];
                            }
                        }
                    }
                    needsstartedservice.AudioAttributesCompatParcelizer += 2;
                    obj2 = obj;
                    c2 = c;
                }
            }
            int i16 = $11 + 77;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            for (int i18 = 0; i18 < i; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e9  */
    @Override // kotlin.parseCue, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.renew.RenewActivity.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getShowPopup getshowpopup;
        RenewActivity renewActivity = (RenewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 29;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            int iIconCompatParcelizer = zab.IconCompatParcelizer();
            int iIconCompatParcelizer2 = zab.IconCompatParcelizer();
            int iIconCompatParcelizer3 = zab.IconCompatParcelizer();
            getLatestBitrateEstimate.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(((Integer) RemoteActionCompatParcelizer(1857932326, iIconCompatParcelizer2, -1857932324, zab.IconCompatParcelizer(), iIconCompatParcelizer3, new Object[]{renewActivity}, iIconCompatParcelizer)).intValue());
            PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
            renewActivity.startActivity(PlanActivity.AudioAttributesCompatParcelizer.read(renewActivity, "renew_toast"));
            renewActivity.finish();
            getshowpopup = getShowPopup.INSTANCE;
            int i3 = 73 / 0;
        } else {
            int iIconCompatParcelizer4 = zab.IconCompatParcelizer();
            int iIconCompatParcelizer5 = zab.IconCompatParcelizer();
            int iIconCompatParcelizer6 = zab.IconCompatParcelizer();
            getLatestBitrateEstimate.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(((Integer) RemoteActionCompatParcelizer(1857932326, iIconCompatParcelizer5, -1857932324, zab.IconCompatParcelizer(), iIconCompatParcelizer6, new Object[]{renewActivity}, iIconCompatParcelizer4)).intValue());
            PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = PlanActivity.RemoteActionCompatParcelizer;
            renewActivity.startActivity(PlanActivity.AudioAttributesCompatParcelizer.read(renewActivity, "renew_toast"));
            renewActivity.finish();
            getshowpopup = getShowPopup.INSTANCE;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 87;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private static final getShowPopup read(RenewActivity renewActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 99;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            int iIconCompatParcelizer = zab.IconCompatParcelizer();
            int iIconCompatParcelizer2 = zab.IconCompatParcelizer();
            int iIconCompatParcelizer3 = zab.IconCompatParcelizer();
            getLatestBitrateEstimate.MediaBrowserCompatItemReceiver.IconCompatParcelizer(((Integer) RemoteActionCompatParcelizer(1857932326, iIconCompatParcelizer2, -1857932324, zab.IconCompatParcelizer(), iIconCompatParcelizer3, new Object[]{renewActivity}, iIconCompatParcelizer)).intValue());
            renewActivity.finish();
            return getShowPopup.INSTANCE;
        }
        int iIconCompatParcelizer4 = zab.IconCompatParcelizer();
        int iIconCompatParcelizer5 = zab.IconCompatParcelizer();
        int iIconCompatParcelizer6 = zab.IconCompatParcelizer();
        getLatestBitrateEstimate.MediaBrowserCompatItemReceiver.IconCompatParcelizer(((Integer) RemoteActionCompatParcelizer(1857932326, iIconCompatParcelizer5, -1857932324, zab.IconCompatParcelizer(), iIconCompatParcelizer6, new Object[]{renewActivity}, iIconCompatParcelizer4)).intValue());
        renewActivity.finish();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.getShowPopup write(final com.marrow.ui.activities.plan.renew.RenewActivity r10, kotlin._handleUnrecognizedCharacterEscape r11, int r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = r12 & 3
            r2 = 1
            if (r1 == r0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = 0
        Lb:
            r3 = r12 & 1
            boolean r1 = r11.RemoteActionCompatParcelizer(r1, r3)
            if (r1 == 0) goto La0
            boolean r1 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r1 == 0) goto L22
            r1 = -1
            java.lang.String r3 = "com.marrow.ui.activities.plan.renew.RenewActivity.onCreate.<anonymous>.<anonymous> (RenewActivity.kt:46)"
            r4 = -2072010937(0xffffffff847f9f47, float:-3.0048243E-36)
            kotlin._validJsonValueList.AudioAttributesCompatParcelizer(r4, r12, r1, r3)
        L22:
            o.parseLineAnchor r12 = r10.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            boolean r3 = r12.read()
            o.parseLineAnchor r12 = r10.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            o.parseTextAlignment r4 = r12.AudioAttributesCompatParcelizer()
            boolean r12 = r11.IconCompatParcelizer(r10)
            java.lang.Object r1 = r11.onPause()
            r9 = 0
            if (r12 == r2) goto L57
            int r12 = com.marrow.ui.activities.plan.renew.RenewActivity.MediaDescriptionCompat
            int r12 = r12 + 71
            int r2 = r12 % 128
            com.marrow.ui.activities.plan.renew.RenewActivity.MediaBrowserCompatCustomActionResultReceiver = r2
            int r12 = r12 % r0
            if (r12 != 0) goto L51
            o._handleUnrecognizedCharacterEscape$write r12 = kotlin._handleUnrecognizedCharacterEscape.INSTANCE
            java.lang.Object r12 = r12.IconCompatParcelizer()
            if (r1 != r12) goto L5f
            goto L57
        L51:
            o._handleUnrecognizedCharacterEscape$write r10 = kotlin._handleUnrecognizedCharacterEscape.INSTANCE
            r10.IconCompatParcelizer()
            throw r9
        L57:
            o.getTagName r1 = new o.getTagName
            r1.<init>()
            r11.RemoteActionCompatParcelizer(r1)
        L5f:
            r5 = r1
            o.getCreatedOnDateMs r5 = (kotlin.getCreatedOnDateMs) r5
            boolean r12 = r11.IconCompatParcelizer(r10)
            java.lang.Object r1 = r11.onPause()
            if (r12 != 0) goto L74
            o._handleUnrecognizedCharacterEscape$write r12 = kotlin._handleUnrecognizedCharacterEscape.INSTANCE
            java.lang.Object r12 = r12.IconCompatParcelizer()
            if (r1 != r12) goto L7c
        L74:
            o.parseCueText r1 = new o.parseCueText
            r1.<init>()
            r11.RemoteActionCompatParcelizer(r1)
        L7c:
            r6 = r1
            o.getCreatedOnDateMs r6 = (kotlin.getCreatedOnDateMs) r6
            r8 = 0
            r7 = r11
            kotlin.WebvttCueParserElementExternalSyntheticLambda0.AudioAttributesCompatParcelizer(r3, r4, r5, r6, r7, r8)
            boolean r10 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r10 == 0) goto La3
            int r10 = com.marrow.ui.activities.plan.renew.RenewActivity.MediaBrowserCompatCustomActionResultReceiver
            int r10 = r10 + 29
            int r11 = r10 % 128
            com.marrow.ui.activities.plan.renew.RenewActivity.MediaDescriptionCompat = r11
            int r10 = r10 % r0
            if (r10 == 0) goto L99
            kotlin._validJsonValueList.AudioAttributesImplApi21Parcelizer()
            goto La3
        L99:
            kotlin._validJsonValueList.AudioAttributesImplApi21Parcelizer()
            r9.hashCode()
            throw r9
        La0:
            r11.onPrepareFromSearch()
        La3:
            o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.renew.RenewActivity.write(com.marrow.ui.activities.plan.renew.RenewActivity, o._handleUnrecognizedCharacterEscape, int):o.getShowPopup");
    }

    private static final getShowPopup read(final RenewActivity renewActivity, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = MediaDescriptionCompat + 75;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(z, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                int i5 = MediaBrowserCompatCustomActionResultReceiver + 95;
                MediaDescriptionCompat = i5 % 128;
                if (i5 % 2 == 0) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(850077024, i, -1, "com.marrow.ui.activities.plan.renew.RenewActivity.onCreate.<anonymous> (RenewActivity.kt:44)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                _validJsonValueList.AudioAttributesCompatParcelizer(850077024, i, -1, "com.marrow.ui.activities.plan.renew.RenewActivity.onCreate.<anonymous> (RenewActivity.kt:44)");
            }
            renewActivity.getWindow().setStatusBarColor(_isNaN.getColor(renewActivity, R.color.very_dark_blue));
            RtspRequest.IconCompatParcelizer(false, multiplyFft.AudioAttributesCompatParcelizer(-2072010937, true, new MagicModuleSubmissionRequestBody() { // from class: o.newCueForText
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return RenewActivity.IconCompatParcelizer(this.IconCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 48, 1);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                int i6 = MediaBrowserCompatCustomActionResultReceiver + 57;
                MediaDescriptionCompat = i6 % 128;
                int i7 = i6 % 2;
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        RenewActivity renewActivity = (RenewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 121;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        WebvttCueParserElement write2 = renewActivity.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesCompatParcelizer().getWrite();
        if (write2 == null) {
            return 0;
        }
        int iIconCompatParcelizer = parseEac3SupplementalProperties.IconCompatParcelizer(write2.getMediaBrowserCompatItemReceiver());
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 5;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.valueOf(iIconCompatParcelizer);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.parseCue, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaDescriptionCompat + 83;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 19, new char[]{15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2}, KeyEvent.keyCodeFromString("") + 122, (ViewConfiguration.getLongPressTimeout() >> 16) + 26, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(true, 8 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{'\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495}, View.getDefaultSize(0, 0) + TsExtractor.TS_STREAM_TYPE_AC3, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 8, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.getOffsetAfter("", 0)), 6054 - (KeyEvent.getMaxKeyCode() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.myPid() >> 22), (KeyEvent.getMaxKeyCode() >> 16) + 6030, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i4 = MediaDescriptionCompat + 37;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                int i5 = i4 % 2;
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

    @Override // kotlin.parseCue, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 71;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 19, new char[]{15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2}, 122 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 28, new char[]{'\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + TsExtractor.TS_STREAM_TYPE_AC3, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 17, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = MediaDescriptionCompat + 103;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4536 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 6055 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 41 - MotionEvent.axisFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 6030, Gravity.getAbsoluteGravity(0, 0) + 24, -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i5 = 61 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), 6054 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 42 - TextUtils.getTrimmedLength(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.red(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 6031, 24 - Gravity.getAbsoluteGravity(0, 0), -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                }
                int i6 = MediaBrowserCompatCustomActionResultReceiver + 31;
                MediaDescriptionCompat = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:(26:31|(3:33|(3:35|38|(1:40)(1:41))|42)(2:36|(2:38|(0)(0))(1:42))|76|262|77|(1:79)|80|81|(2:83|(4:85|86|(1:88)|89)(3:90|(1:92)|93))(19:94|95|279|96|(1:98)|99|100|274|101|(1:103)|104|105|106|(1:108)|109|(1:111)|112|(1:114)|115)|116|(4:119|(13:286|121|(3:123|(3:126|127|124)|290)|128|264|129|(1:131)|132|133|134|281|135|289)(1:288)|287|117)|285|170|(1:172)|173|(3:175|(1:177)|178)(13:180|276|181|182|(1:184)|185|258|186|187|(1:189)|190|(1:192)|193)|179|194|(6:196|197|(1:199)|200|201|202)|203|(1:205)|206|(3:208|(1:210)|211)(14:213|214|(1:216)|217|218|(1:220)|221|266|222|223|(1:225)|226|(1:228)|229)|212|230|(7:232|233|(1:235)|236|237|238|239)(1:291))|270|44|(1:46)|47|260|48|(1:50)|51|76|262|77|(0)|80|81|(0)(0)|116|(1:117)|285|170|(0)|173|(0)(0)|179|194|(0)|203|(0)|206|(0)(0)|212|230|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0c62, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0c63, code lost:
    
        r7 = new java.lang.Object[1];
        f((byte) (((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 87), ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 24, new char[]{' ', 23, ' ', 30, '!', '\r', 26, 22, '!', '\r', 13760}, r7);
        r2 = (java.lang.String) r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0cb2, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r4);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0cc9, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0ccd, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0cdc, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0ce0, code lost:
    
        if (r1 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0ce2, code lost:
    
        r1 = kotlin.startForeground.read((char) (android.text.TextUtils.getCapsMode("", 0, 0) + 4535), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6054, android.view.View.resolveSizeAndState(0, 0, 0) + 42, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0d0b, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0d17, code lost:
    
        r6 = new java.lang.Object[]{302316560, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 6030 - (android.os.Process.myTid() >> 22), 25 - (android.view.ViewConfiguration.getScrollFriction() > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.view.ViewConfiguration.getScrollFriction() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
        r4 = com.marrow.ui.activities.plan.renew.RenewActivity.$$j;
        r7 = (byte) (r4[9] - 1);
        r12 = new java.lang.Object[1];
        h(r7, (byte) (r7 + 2), (byte) (r4[55] + 1), r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0b2d A[Catch: all -> 0x0c62, TryCatch #2 {all -> 0x0c62, blocks: (B:77:0x0648, B:79:0x064e, B:80:0x068d, B:86:0x06a9, B:88:0x06af, B:89:0x06f8, B:116:0x0b23, B:117:0x0b27, B:119:0x0b2d, B:121:0x0b43, B:124:0x0b50, B:126:0x0b53, B:133:0x0bb6, B:139:0x0c3c, B:141:0x0c42, B:142:0x0c43, B:144:0x0c45, B:146:0x0c4c, B:147:0x0c4d, B:90:0x0706, B:92:0x070f, B:93:0x0757, B:94:0x0762, B:106:0x0946, B:108:0x094c, B:109:0x098e, B:111:0x0a80, B:112:0x0ac4, B:114:0x0adb, B:115:0x0b1d, B:149:0x0c4f, B:151:0x0c56, B:152:0x0c57, B:154:0x0c59, B:156:0x0c60, B:157:0x0c61, B:129:0x0b7c, B:131:0x0b82, B:132:0x0baf, B:101:0x08c0, B:103:0x08d4, B:104:0x093a, B:96:0x086b, B:98:0x087f, B:99:0x08b9, B:135:0x0bbb), top: B:262:0x0648, outer: #3, inners: #4, #9, #12, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0da0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0df5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e51  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x1116  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x11fc  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x124a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x129b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x164d  */
    /* JADX WARN: Removed duplicated region for block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x064e A[Catch: all -> 0x0c62, TryCatch #2 {all -> 0x0c62, blocks: (B:77:0x0648, B:79:0x064e, B:80:0x068d, B:86:0x06a9, B:88:0x06af, B:89:0x06f8, B:116:0x0b23, B:117:0x0b27, B:119:0x0b2d, B:121:0x0b43, B:124:0x0b50, B:126:0x0b53, B:133:0x0bb6, B:139:0x0c3c, B:141:0x0c42, B:142:0x0c43, B:144:0x0c45, B:146:0x0c4c, B:147:0x0c4d, B:90:0x0706, B:92:0x070f, B:93:0x0757, B:94:0x0762, B:106:0x0946, B:108:0x094c, B:109:0x098e, B:111:0x0a80, B:112:0x0ac4, B:114:0x0adb, B:115:0x0b1d, B:149:0x0c4f, B:151:0x0c56, B:152:0x0c57, B:154:0x0c59, B:156:0x0c60, B:157:0x0c61, B:129:0x0b7c, B:131:0x0b82, B:132:0x0baf, B:101:0x08c0, B:103:0x08d4, B:104:0x093a, B:96:0x086b, B:98:0x087f, B:99:0x08b9, B:135:0x0bbb), top: B:262:0x0648, outer: #3, inners: #4, #9, #12, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0762 A[Catch: all -> 0x0c62, TRY_LEAVE, TryCatch #2 {all -> 0x0c62, blocks: (B:77:0x0648, B:79:0x064e, B:80:0x068d, B:86:0x06a9, B:88:0x06af, B:89:0x06f8, B:116:0x0b23, B:117:0x0b27, B:119:0x0b2d, B:121:0x0b43, B:124:0x0b50, B:126:0x0b53, B:133:0x0bb6, B:139:0x0c3c, B:141:0x0c42, B:142:0x0c43, B:144:0x0c45, B:146:0x0c4c, B:147:0x0c4d, B:90:0x0706, B:92:0x070f, B:93:0x0757, B:94:0x0762, B:106:0x0946, B:108:0x094c, B:109:0x098e, B:111:0x0a80, B:112:0x0ac4, B:114:0x0adb, B:115:0x0b1d, B:149:0x0c4f, B:151:0x0c56, B:152:0x0c57, B:154:0x0c59, B:156:0x0c60, B:157:0x0c61, B:129:0x0b7c, B:131:0x0b82, B:132:0x0baf, B:101:0x08c0, B:103:0x08d4, B:104:0x093a, B:96:0x086b, B:98:0x087f, B:99:0x08b9, B:135:0x0bbb), top: B:262:0x0648, outer: #3, inners: #4, #9, #12, #13 }] */
    @Override // kotlin.parseCue, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.renew.RenewActivity.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(RenewActivity renewActivity, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 61;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopupWrite = write(renewActivity, _handleunrecognizedcharacterescape, i);
        int i5 = MediaDescriptionCompat + 31;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return getshowpopupWrite;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(RenewActivity renewActivity, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 19;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopup = read(renewActivity, _handleunrecognizedcharacterescape, i);
        int i5 = MediaDescriptionCompat + 75;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ VisibilityChecker.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(RenewActivity renewActivity) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 23;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return MediaBrowserCompatItemReceiver(renewActivity);
        }
        MediaBrowserCompatItemReceiver(renewActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(RenewActivity renewActivity) {
        int iIconCompatParcelizer = zab.IconCompatParcelizer();
        int iIconCompatParcelizer2 = zab.IconCompatParcelizer();
        int iIconCompatParcelizer3 = zab.IconCompatParcelizer();
        return (getShowPopup) RemoteActionCompatParcelizer(-219841602, iIconCompatParcelizer2, 219841602, zab.IconCompatParcelizer(), iIconCompatParcelizer3, new Object[]{renewActivity}, iIconCompatParcelizer);
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(RenewActivity renewActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 101;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopup = read(renewActivity);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 27;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopup;
        }
        throw null;
    }

    static {
        RatingCompat = 1;
        MediaDescriptionCompat();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatSearchResultReceiver + 103;
        RatingCompat = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private final int MediaBrowserCompatMediaItem() {
        int iIconCompatParcelizer = zab.IconCompatParcelizer();
        int iIconCompatParcelizer2 = zab.IconCompatParcelizer();
        int iIconCompatParcelizer3 = zab.IconCompatParcelizer();
        return ((Integer) RemoteActionCompatParcelizer(1857932326, iIconCompatParcelizer2, -1857932324, zab.IconCompatParcelizer(), iIconCompatParcelizer3, new Object[]{this}, iIconCompatParcelizer)).intValue();
    }

    private static final getShowPopup write(RenewActivity renewActivity) {
        int iIconCompatParcelizer = zab.IconCompatParcelizer();
        int iIconCompatParcelizer2 = zab.IconCompatParcelizer();
        int iIconCompatParcelizer3 = zab.IconCompatParcelizer();
        return (getShowPopup) RemoteActionCompatParcelizer(1758131076, iIconCompatParcelizer2, -1758131075, zab.IconCompatParcelizer(), iIconCompatParcelizer3, new Object[]{renewActivity}, iIconCompatParcelizer);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 77;
        int i3 = i2 % 128;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 117;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return -1;
        }
        throw null;
    }

    @Override // kotlin.parseCue, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 69;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    static void MediaDescriptionCompat() {
        IconCompatParcelizer = 1000326188;
        write = new char[]{6492, 6429, 6465, 6467, 6478, 6490, 6427, 6406, 6418, 6493, 6407, 6416, 6494, 6476, 6470, 6430, 6481, 6488, 6471, 6489, 6426, 6464, 6491, 6475, 6479, 6425, 6473, 6424, 6431, 6468, 6477, 6417, 6469, 6474, 6466, 6428};
        AudioAttributesCompatParcelizer = (char) 11444;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        RenewActivity renewActivity = (RenewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 97;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int iIconCompatParcelizer = zab.IconCompatParcelizer();
        int iIconCompatParcelizer2 = zab.IconCompatParcelizer();
        int iIconCompatParcelizer3 = zab.IconCompatParcelizer();
        getShowPopup getshowpopup = (getShowPopup) RemoteActionCompatParcelizer(1758131076, iIconCompatParcelizer2, -1758131075, zab.IconCompatParcelizer(), iIconCompatParcelizer3, new Object[]{renewActivity}, iIconCompatParcelizer);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 69;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }
}
