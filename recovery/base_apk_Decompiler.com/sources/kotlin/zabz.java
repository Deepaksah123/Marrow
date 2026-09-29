package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivity;
import com.marrow.ui.activities.learn.video.LessonVideoActivity;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.main.viewmodel.HomeSharedViewModel;
import com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.DataBufferRef;
import kotlin.Metadata;
import kotlin.StreetViewPanoramaFragmentzza;
import kotlin.SupportStreetViewPanoramaFragmentzzb;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.createStringSparseArray;
import kotlin.getAttachment;
import kotlin.getAutofillClient;
import kotlin.getClassId;
import kotlin.getDefaultBindFlags;
import kotlin.getSubMeshCount;
import kotlin.isAtLeastKitKatWatch;
import kotlin.isAtLeastV;
import kotlin.maybeSignOut;
import kotlin.onDataRangeChanged;
import kotlin.onDataRangeInserted;
import kotlin.onDataRangeMoved;
import kotlin.packageManager;
import kotlin.releaseProcessedFrames;
import kotlin.setTempDir;
import kotlin.setTokenBinding;
import kotlin.shouldEscapeCharacter;
import kotlin.transformFutureAsync;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class zabz extends zaO implements TabLayout.AudioAttributesCompatParcelizer {
    private static int $10 = 0;
    private static int $11 = 1;
    private final RenewEligible IconCompatParcelizer;
    private final RenewEligible read;
    private static final byte[] $$E = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 23, -13, 96, 67, -55, 4, -13, TarConstants.LF_SYMLINK, -35, 7, 20, -17, 37, -49, 17, 2, 3, -11, 80, -81, 7, 11, -9, 17, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -21, -49, 11, 33, -26, 13, -22, 22, -11, 43, -34, -1, 6, 43, -42, 4, -1, 3, 3, 11, -7, -4, 42, -27, -8, 1, 17, -7, 11, -11, 47, -49, 6, 17, -11, 6, 15, -9, 27, -36, 13, -4, 14, 5, -13, 13, 8, 25, -19, -10, 13, 0, 5, TarConstants.LF_LINK, -24, -10, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$F = 85;
    private static final byte[] $$m = {10, -58, 112, 6, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$n = 165;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int[] AudioAttributesCompatParcelizer = {472023589, 1553013334, 133950730, -319634041, -1244940510, -991253990, -478033657, -1154937603, 636597806, 900047790, -158891106, 1999890814, -1954890856, 869159444, -1964555711, -7414838, -1896675163, -1670255349};
    private static int AudioAttributesImplApi26Parcelizer = 1000326195;
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> write = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.zacn
        @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
        public final void IconCompatParcelizer(Object obj) {
            zabz.RemoteActionCompatParcelizer((ActivityResult) obj);
        }
    });
    private final RenewEligible RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.zacs
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return zabz.MediaBrowserCompatItemReceiver();
        }
    });

    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[addApi.values().length];
            try {
                iArr[addApi.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[addApi.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~i;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i | i6);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i6)) | (~(i7 | i9)) | (~(i9 | i6));
        int i14 = i6 + i5 + i4 + (669352129 * i3) + (266941808 * i2);
        int i15 = i14 * i14;
        int i16 = (720661947 * i6) + 1572077568 + ((-1243901369) * i5) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i4) + ((-1100480512) * i3) + ((-1249902592) * i2) + ((-491520000) * i15);
        int i17 = (i6 * 1617402437) + 56426783 + (i5 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i4 * 1617401855) + (i3 * 1244927807) + (i2 * (-404665712)) + (i15 * (-45350912));
        switch (i16 + (i17 * i17 * 1565261824)) {
            case 1:
                return IconCompatParcelizer(objArr);
            case 2:
                return read(objArr);
            case 3:
                return RemoteActionCompatParcelizer(objArr);
            case 4:
                return AudioAttributesCompatParcelizer(objArr);
            case 5:
                final zabz zabzVar = (zabz) objArr[0];
                int i18 = 2 % 2;
                zabz zabzVar2 = zabzVar;
                CmcdConfigurationRequestConfig.read(zabzVar2, zabzVar.new write(null));
                CmcdConfigurationRequestConfig.read(zabzVar2, zabzVar.new AudioAttributesCompatParcelizer(null));
                CmcdConfigurationRequestConfig.read(zabzVar2, zabzVar.new IconCompatParcelizer(null));
                CmcdConfigurationRequestConfig.read(zabzVar2, zabzVar.new AudioAttributesImplApi26Parcelizer(null));
                CmcdConfigurationRequestConfig.read(zabzVar2, zabzVar.new AudioAttributesImplApi21Parcelizer(null));
                CmcdConfigurationRequestConfig.read(zabzVar2, zabzVar.new MediaBrowserCompatItemReceiver(null));
                CmcdConfigurationRequestConfig.read(zabzVar2, zabzVar.new AudioAttributesImplBaseParcelizer(null));
                zabzVar.getSupportFragmentManager().IconCompatParcelizer("gt_nudge_action", zabzVar, new _addFields() { // from class: o.zact
                    @Override // kotlin._addFields
                    public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                        zabz.AudioAttributesCompatParcelizer(this.write, str, bundle);
                    }
                });
                int i19 = MediaBrowserCompatCustomActionResultReceiver + 93;
                AudioAttributesImplBaseParcelizer = i19 % 128;
                int i20 = i19 % 2;
                return null;
            case 6:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 7:
                return MediaBrowserCompatItemReceiver(objArr);
            case 8:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 9:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 10:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 11:
                return RatingCompat(objArr);
            case 12:
                return MediaDescriptionCompat(objArr);
            case 13:
                return MediaBrowserCompatSearchResultReceiver(objArr);
            case 14:
                return MediaMetadataCompat(objArr);
            case 15:
                return MediaBrowserCompatMediaItem(objArr);
            case 16:
                return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(objArr);
            case 17:
                return onCustomAction(objArr);
            case 18:
                return handleMediaPlayPauseIfPendingOnHandler(objArr);
            case 19:
                return onAddQueueItem(objArr);
            default:
                return write(objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void s(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = 114 - r7
            int r0 = r6 + 4
            byte[] r1 = kotlin.zabz.$$m
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = -1
            if (r1 != 0) goto L13
            r4 = r6
            r7 = r8
            r3 = r2
            goto L29
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L27:
            r4 = r1[r7]
        L29:
            int r8 = r8 + r4
            int r8 = r8 + r2
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabz.s(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void t(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r5 + 20
            byte[] r1 = kotlin.zabz.$$E
            int r7 = 136 - r7
            int r6 = 111 - r6
            byte[] r0 = new byte[r0]
            int r5 = r5 + 19
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + 2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabz.t(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.zabz$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zabz$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$IconCompatParcelizer.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$IconCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zabz$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$write.getRead();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$write = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zabz$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$write.getRead();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$write = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zabz$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ MediaBrowserCompatMediaItem $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$AudioAttributesCompatParcelizer.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zabz$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ MediaBrowserCompatMediaItem $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$read.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$read = mediaBrowserCompatMediaItem;
        }
    }

    public zabz() {
        zabz zabzVar = this;
        this.IconCompatParcelizer = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(HomeUIActivityViewModel.class), new AnonymousClass2(zabzVar), new AnonymousClass4(zabzVar), new AnonymousClass1(zabzVar));
        this.read = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(HomeSharedViewModel.class), new AnonymousClass3(zabzVar), new AnonymousClass5(zabzVar), new AnonymousClass7(zabzVar));
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        List<? extends DataBuffer> list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 31;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        zabzVar.RemoteActionCompatParcelizer(list);
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(zabz zabzVar, DataBuffer dataBuffer) throws IllegalAccessException, InstantiationException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 27;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.read(dataBuffer);
        int i4 = AudioAttributesImplBaseParcelizer + 85;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 31;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.IconCompatParcelizer(fFloatValue);
        int i4 = AudioAttributesImplBaseParcelizer + 31;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void IconCompatParcelizer(zabz zabzVar, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 69;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        zabzVar.read(i);
        if (i4 != 0) {
            int i5 = 67 / 0;
        }
        int i6 = AudioAttributesImplBaseParcelizer + 117;
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        HomeSharedViewModel homeSharedViewModel;
        zabz zabzVar = (zabz) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 29;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {zabzVar};
        int i4 = getClassId.AudioAttributesCompatParcelizer.read();
        int i5 = getClassId.AudioAttributesCompatParcelizer.read();
        int i6 = getClassId.AudioAttributesCompatParcelizer.read();
        int i7 = getClassId.AudioAttributesCompatParcelizer.read();
        if (i3 != 0) {
            homeSharedViewModel = (HomeSharedViewModel) RemoteActionCompatParcelizer(i4, objArr2, i7, i6, i5, -884567868, 884567885);
            int i8 = 4 / 0;
        } else {
            homeSharedViewModel = (HomeSharedViewModel) RemoteActionCompatParcelizer(i4, objArr2, i7, i6, i5, -884567868, 884567885);
        }
        int i9 = MediaBrowserCompatCustomActionResultReceiver + 75;
        AudioAttributesImplBaseParcelizer = i9 % 128;
        if (i9 % 2 != 0) {
            return homeSharedViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(zabz zabzVar, DataBuffer dataBuffer) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 39;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.IconCompatParcelizer(dataBuffer);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 61;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(zabz zabzVar, boolean z) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 109;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.read(z);
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
    }

    public static final /* synthetic */ r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 onFastForward(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 71;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = zabzVar.write;
        if (i3 == 0) {
            return r8lambdaibk6u1hk7j3awkl_wn934v2uvi8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onPlayFromSearch(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 11;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.onAddQueueItem();
        int i4 = AudioAttributesImplBaseParcelizer + 77;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean onPlayFromUri(zabz zabzVar) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 117;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {zabzVar};
        int i4 = getClassId.AudioAttributesCompatParcelizer.read();
        int i5 = getClassId.AudioAttributesCompatParcelizer.read();
        int i6 = getClassId.AudioAttributesCompatParcelizer.read();
        int i7 = getClassId.AudioAttributesCompatParcelizer.read();
        if (i3 == 0) {
            zBooleanValue = ((Boolean) RemoteActionCompatParcelizer(i4, objArr, i7, i6, i5, 91692388, -91692373)).booleanValue();
            int i8 = 3 / 0;
        } else {
            zBooleanValue = ((Boolean) RemoteActionCompatParcelizer(i4, objArr, i7, i6, i5, 91692388, -91692373)).booleanValue();
        }
        int i9 = AudioAttributesImplBaseParcelizer + 57;
        MediaBrowserCompatCustomActionResultReceiver = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 58 / 0;
        }
        return zBooleanValue;
    }

    public static final /* synthetic */ HomeUIActivityViewModel onPrepareFromMediaId(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 53;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        HomeUIActivityViewModel homeUIActivityViewModelRatingCompat = zabzVar.RatingCompat();
        int i4 = AudioAttributesImplBaseParcelizer + 89;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return homeUIActivityViewModelRatingCompat;
    }

    public static final /* synthetic */ void onPrepareFromSearch(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 117;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        zabzVar.onMediaButtonEvent();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 3;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void read(zabz zabzVar, maybeSignOut maybesignout) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 57;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.write(maybesignout);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 49;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        zabzVar.onPlayFromMediaId();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 47;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ void write(zabz zabzVar, disambiguate4gAnd5gNsa disambiguate4gand5gnsa) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 87;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int i4 = getClassId.AudioAttributesCompatParcelizer.read();
        int i5 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i4, new Object[]{zabzVar, disambiguate4gand5gnsa}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i5, 774791317, -774791304);
        int i6 = MediaBrowserCompatCustomActionResultReceiver + 63;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private final HomeUIActivityViewModel RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 29;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        HomeUIActivityViewModel homeUIActivityViewModel = (HomeUIActivityViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 101;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return homeUIActivityViewModel;
    }

    private static /* synthetic */ Object onCustomAction(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 33;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = zabzVar.read.RemoteActionCompatParcelizer();
        if (i3 == 0) {
            return (HomeSharedViewModel) objRemoteActionCompatParcelizer;
        }
        throw null;
    }

    private final GradientDrawable MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 101;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        GradientDrawable gradientDrawable = (GradientDrawable) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        int i4 = AudioAttributesImplBaseParcelizer + 57;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return gradientDrawable;
        }
        throw null;
    }

    private static /* synthetic */ Object onAddQueueItem(Object[] objArr) {
        int i = 2 % 2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        int i2 = AudioAttributesImplBaseParcelizer + 75;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return gradientDrawable;
    }

    private static void r(int i, int i2, int i3, char[] cArr, boolean z, Object[] objArr) throws Throwable {
        Object obj;
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i3];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (true) {
            obj = null;
            if (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer >= i3) {
                break;
            }
            int i5 = $11 + 117;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i2 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", "", 0), 23703 - Process.getGidForName(""), 32 - (ViewConfiguration.getTapTimeout() >> 16), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((Process.myPid() >> 22) + 44862), 18944 - KeyEvent.normalizeMetaState(0), 28 - ExpandableListView.getPackedPositionGroup(0L), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 123;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i3 - cleardownloadmanagerhelpers.write);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i3];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                try {
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (View.MeasureSpec.getSize(0) + 44862), 18944 - TextUtils.getTrimmedLength(""), (Process.myPid() >> 22) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = $11 + 79;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static void q(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AudioAttributesCompatParcelizer;
        int i4 = 43695;
        int i5 = -470782045;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i5);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i4 - (ViewConfiguration.getTapTimeout() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 23297, Process.getGidForName("") + 16, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = 43695;
                    i5 = -470782045;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AudioAttributesCompatParcelizer;
        if (iArr6 != null) {
            int i8 = $11 + 85;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr6[i2]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ImageFormat.getBitsPerPixel(i6) + 43696), 23297 - Drawable.resolveOpacity(i6, i6), 15 - TextUtils.getOffsetBefore("", i6), -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr2[i2] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i2++;
                i6 = 0;
            }
            iArr6 = iArr2;
        }
        int i9 = i6;
        System.arraycopy(iArr6, i9, iArr5, i9, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i9;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i9] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i10];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.blue(0) + 23297, 15 - (ViewConfiguration.getScrollBarSize() >> 8), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i10++;
                int i12 = $10 + 75;
                $11 = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i14;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i15 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i16 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr5);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 20126, 21 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i9 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Object[] objArr = {zabz.this};
                int i2 = getClassId.AudioAttributesCompatParcelizer.read();
                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                setUpdatedStatus<maybeSignOut> setupdatedstatusAudioAttributesImplApi21Parcelizer = ((HomeSharedViewModel) zabz.RemoteActionCompatParcelizer(i2, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i3, 608680917, -608680910)).AudioAttributesImplApi21Parcelizer();
                final zabz zabzVar = zabz.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.zabz.write.4

                    /* JADX INFO: renamed from: o.zabz$write$4$read */
                    public static final /* synthetic */ class read {
                        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
                        public static final /* synthetic */ int[] write;

                        static {
                            int[] iArr = new int[isConnectionFailedListenerRegistered.values().length];
                            try {
                                iArr[isConnectionFailedListenerRegistered.read.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[isConnectionFailedListenerRegistered.IconCompatParcelizer.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[isConnectionFailedListenerRegistered.write.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[isConnectionFailedListenerRegistered.RemoteActionCompatParcelizer.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            write = iArr;
                            int[] iArr2 = new int[EnumC0232zao.values().length];
                            try {
                                iArr2[EnumC0232zao.write.ordinal()] = 1;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr2[EnumC0232zao.AudioAttributesCompatParcelizer.ordinal()] = 2;
                            } catch (NoSuchFieldError unused6) {
                            }
                            try {
                                iArr2[EnumC0232zao.read.ordinal()] = 3;
                            } catch (NoSuchFieldError unused7) {
                            }
                            try {
                                iArr2[EnumC0232zao.RemoteActionCompatParcelizer.ordinal()] = 4;
                            } catch (NoSuchFieldError unused8) {
                            }
                            RemoteActionCompatParcelizer = iArr2;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((maybeSignOut) obj2);
                    }

                    private Object write(maybeSignOut maybesignout) {
                        int i4 = read.write[maybesignout.getIconCompatParcelizer().ordinal()];
                        if (i4 == 1) {
                            CmcdConfigurationRequestConfig.read(zabzVar, R.attr.colorSurfaceVariant14);
                        } else if (i4 == 2) {
                            CmcdConfigurationRequestConfig.read(zabzVar, R.attr.practicalCornerColor);
                        } else if (i4 == 3) {
                            zabzVar.getWindow().setStatusBarColor(_isNaN.getColor(zabzVar, R.color.mb_50));
                        } else {
                            if (i4 != 4) {
                                throw new RenewEligibleCreator();
                            }
                            CmcdConfigurationRequestConfig.read(zabzVar, R.attr.colorSurfaceVariant5);
                        }
                        int i5 = read.RemoteActionCompatParcelizer[maybesignout.getRemoteActionCompatParcelizer().getWrite().ordinal()];
                        if (i5 == 1) {
                            zabzVar.AudioAttributesImplApi21Parcelizer().onCustomAction.setClickable(true);
                            ConstraintLayout constraintLayout = zabzVar.AudioAttributesImplApi21Parcelizer().onCustomAction;
                            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
                            constraintLayout.setBackgroundColor(shouldEscapeCharacter.Companion.read(zabzVar, R.attr.colorSurfaceVariant14, new TypedValue(), true));
                        } else if (i5 == 2) {
                            Object[] objArr2 = {zabzVar};
                            int i6 = getClassId.AudioAttributesCompatParcelizer.read();
                            int i7 = getClassId.AudioAttributesCompatParcelizer.read();
                            if (((HomeSharedViewModel) zabz.RemoteActionCompatParcelizer(i6, objArr2, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i7, 608680917, -608680910)).getAudioAttributesImplApi26Parcelizer()) {
                                zabz zabzVar2 = zabzVar;
                                int i8 = getClassId.AudioAttributesCompatParcelizer.read();
                                int i9 = getClassId.AudioAttributesCompatParcelizer.read();
                                Object[] objArr3 = {zabzVar2, Float.valueOf(((HomeSharedViewModel) zabz.RemoteActionCompatParcelizer(i8, new Object[]{zabzVar2}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i9, 608680917, -608680910)).AudioAttributesImplBaseParcelizer().IconCompatParcelizer().floatValue())};
                                int i10 = getClassId.AudioAttributesCompatParcelizer.read();
                                int i11 = getClassId.AudioAttributesCompatParcelizer.read();
                                zabz.RemoteActionCompatParcelizer(i10, objArr3, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i11, 366129225, -366129219);
                            } else {
                                zabzVar.AudioAttributesImplApi21Parcelizer().onCustomAction.setClickable(true);
                                zabzVar.AudioAttributesImplApi21Parcelizer().onCustomAction.setBackgroundColor(0);
                            }
                        } else if (i5 == 3) {
                            zabzVar.AudioAttributesImplApi21Parcelizer().onCustomAction.setClickable(true);
                            ConstraintLayout constraintLayout2 = zabzVar.AudioAttributesImplApi21Parcelizer().onCustomAction;
                            shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
                            constraintLayout2.setBackgroundColor(shouldEscapeCharacter.Companion.read(zabzVar, R.attr.practicalCornerColor, new TypedValue(), true));
                        } else {
                            if (i5 != 4) {
                                throw new RenewEligibleCreator();
                            }
                            zabzVar.AudioAttributesImplApi21Parcelizer().onCustomAction.setClickable(true);
                            ConstraintLayout constraintLayout3 = zabzVar.AudioAttributesImplApi21Parcelizer().onCustomAction;
                            shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
                            constraintLayout3.setBackgroundColor(shouldEscapeCharacter.Companion.read(zabzVar, R.attr.colorSurfaceVariant5, new TypedValue(), true));
                        }
                        zabz.read(zabzVar, maybesignout);
                        zabz.RemoteActionCompatParcelizer(zabzVar, maybesignout.getAudioAttributesCompatParcelizer().getIconCompatParcelizer());
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
            return zabz.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Object[] objArr = {zabz.this};
                int i2 = getClassId.AudioAttributesCompatParcelizer.read();
                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                setUpdatedStatus<Float> setupdatedstatusAudioAttributesImplBaseParcelizer = ((HomeSharedViewModel) zabz.RemoteActionCompatParcelizer(i2, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i3, 608680917, -608680910)).AudioAttributesImplBaseParcelizer();
                final zabz zabzVar = zabz.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.zabz.AudioAttributesCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer(((Number) obj2).floatValue());
                    }

                    private Object AudioAttributesCompatParcelizer(float f) {
                        Object[] objArr2 = {zabzVar};
                        int i4 = getClassId.AudioAttributesCompatParcelizer.read();
                        int i5 = getClassId.AudioAttributesCompatParcelizer.read();
                        if (((HomeSharedViewModel) zabz.RemoteActionCompatParcelizer(i4, objArr2, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i5, 608680917, -608680910)).getAudioAttributesImplApi26Parcelizer()) {
                            Object[] objArr3 = {zabzVar, Float.valueOf(f)};
                            int i6 = getClassId.AudioAttributesCompatParcelizer.read();
                            int i7 = getClassId.AudioAttributesCompatParcelizer.read();
                            zabz.RemoteActionCompatParcelizer(i6, objArr3, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i7, 366129225, -366129219);
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
            throw new PlanDetailsCreator();
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zabz.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Object[] objArr = {zabz.this};
                int i2 = getClassId.AudioAttributesCompatParcelizer.read();
                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                setUpdatedStatus<getApiOptions> setupdatedstatusAudioAttributesCompatParcelizer = ((HomeSharedViewModel) zabz.RemoteActionCompatParcelizer(i2, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i3, 608680917, -608680910)).AudioAttributesCompatParcelizer();
                final zabz zabzVar = zabz.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.zabz.IconCompatParcelizer.2

                    /* JADX INFO: renamed from: o.zabz$IconCompatParcelizer$2$RemoteActionCompatParcelizer */
                    public static final /* synthetic */ class RemoteActionCompatParcelizer {
                        public static final /* synthetic */ int[] write;

                        static {
                            int[] iArr = new int[getApiOptions.values().length];
                            try {
                                iArr[getApiOptions.RemoteActionCompatParcelizer.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[getApiOptions.IconCompatParcelizer.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            write = iArr;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((getApiOptions) obj2);
                    }

                    private Object write(getApiOptions getapioptions) {
                        int i4 = RemoteActionCompatParcelizer.write[getapioptions.ordinal()];
                        if (i4 == 1) {
                            zabz.onPlayFromSearch(zabzVar);
                        } else {
                            if (i4 != 2) {
                                throw new RenewEligibleCreator();
                            }
                            zabz.onPrepareFromSearch(zabzVar);
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
            throw new PlanDetailsCreator();
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zabz.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Object[] objArr = {zabz.this};
                int i2 = getClassId.AudioAttributesCompatParcelizer.read();
                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                setUpdatedStatus<onDataRangeMoved> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = ((HomeSharedViewModel) zabz.RemoteActionCompatParcelizer(i2, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i3, 608680917, -608680910)).MediaBrowserCompatCustomActionResultReceiver();
                final zabz zabzVar = zabz.this;
                this.write = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.zabz.AudioAttributesImplApi26Parcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((onDataRangeMoved) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(onDataRangeMoved ondatarangemoved) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.IconCompatParcelizer.INSTANCE)) {
                            ArrayList arrayList = null;
                            if (ondatarangemoved instanceof onDataRangeMoved.read) {
                                onDataRangeMoved.read readVar = (onDataRangeMoved.read) ondatarangemoved;
                                List<Integer> listIconCompatParcelizer = readVar.IconCompatParcelizer();
                                if (listIconCompatParcelizer != null) {
                                    zabz zabzVar2 = zabzVar;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<T> it = listIconCompatParcelizer.iterator();
                                    while (it.hasNext()) {
                                        View viewFindViewById = zabzVar2.findViewById(((Number) it.next()).intValue());
                                        if (viewFindViewById != null) {
                                            arrayList2.add(viewFindViewById);
                                        }
                                    }
                                    arrayList = arrayList2;
                                }
                                copyToBuffer copytobufferAudioAttributesImplBaseParcelizer = zabzVar.AudioAttributesImplBaseParcelizer();
                                getAttachment.Companion readVar2 = getAttachment.INSTANCE;
                                copytobufferAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(getAttachment.Companion.read(), readVar.getWrite(), readVar.getRemoteActionCompatParcelizer(), arrayList);
                            } else {
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.write.INSTANCE)) {
                                    return getShowPopup.INSTANCE;
                                }
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.RemoteActionCompatParcelizer.INSTANCE)) {
                                    TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer = zabzVar.AudioAttributesImplApi21Parcelizer().write.AudioAttributesCompatParcelizer(zabzVar.AudioAttributesImplApi21Parcelizer().write.AudioAttributesCompatParcelizer());
                                    Object objAudioAttributesCompatParcelizer = mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer != null ? mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() : null;
                                    DataBuffer dataBuffer = objAudioAttributesCompatParcelizer instanceof DataBuffer ? (DataBuffer) objAudioAttributesCompatParcelizer : null;
                                    if (dataBuffer != null) {
                                        zabz.RemoteActionCompatParcelizer(zabzVar, dataBuffer);
                                    }
                                } else {
                                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.AudioAttributesCompatParcelizer.INSTANCE)) {
                                        throw new RenewEligibleCreator();
                                    }
                                    return getShowPopup.INSTANCE;
                                }
                            }
                        }
                        Object[] objArr2 = {zabzVar};
                        ((HomeSharedViewModel) zabz.RemoteActionCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), objArr2, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), 608680917, -608680910)).RemoteActionCompatParcelizer(DataBufferRef.IconCompatParcelizer.INSTANCE);
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

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zabz.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Pair<List<DataBuffer>, Integer>> setupdatedstatus = zabz.onPrepareFromMediaId(zabz.this).read();
                final zabz zabzVar = zabz.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.zabz.AudioAttributesImplApi21Parcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((Pair) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(Pair<? extends List<? extends DataBuffer>, Integer> pair) throws IllegalAccessException, InstantiationException {
                        if (pair == null) {
                            return getShowPopup.INSTANCE;
                        }
                        if (!zabzVar.AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer()) {
                            zabz.AudioAttributesCompatParcelizer(zabzVar, pair.write().get(pair.IconCompatParcelizer().intValue()));
                        }
                        if (pair.write().size() > 1) {
                            if (zabzVar.AudioAttributesImplApi21Parcelizer().write.write() != pair.write().size()) {
                                Object[] objArr = {zabzVar, pair.write()};
                                int i2 = getClassId.AudioAttributesCompatParcelizer.read();
                                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                                zabz.RemoteActionCompatParcelizer(i2, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i3, -589003791, 589003795);
                            }
                            zabz zabzVar2 = zabzVar;
                            int i4 = getClassId.AudioAttributesCompatParcelizer.read();
                            int i5 = getClassId.AudioAttributesCompatParcelizer.read();
                            zabz.RemoteActionCompatParcelizer(zabzVar2, ((HomeSharedViewModel) zabz.RemoteActionCompatParcelizer(i4, new Object[]{zabzVar2}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i5, 608680917, -608680910)).AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().getAudioAttributesCompatParcelizer().getIconCompatParcelizer());
                            zabz.IconCompatParcelizer(zabzVar, pair.IconCompatParcelizer().intValue());
                        } else {
                            zabz.RemoteActionCompatParcelizer(zabzVar, false);
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
            throw new PlanDetailsCreator();
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zabz.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<disambiguate4gAnd5gNsa> setupdatedstatusAudioAttributesCompatParcelizer = zabz.onPrepareFromMediaId(zabz.this).AudioAttributesCompatParcelizer();
                final zabz zabzVar = zabz.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.zabz.MediaBrowserCompatItemReceiver.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((disambiguate4gAnd5gNsa) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(disambiguate4gAnd5gNsa disambiguate4gand5gnsa) {
                        zabz.write(zabzVar, disambiguate4gand5gnsa);
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zabz.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<onDataRangeChanged> setupdatedstatusIconCompatParcelizer = zabz.onPrepareFromMediaId(zabz.this).IconCompatParcelizer();
                final zabz zabzVar = zabz.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.zabz.AudioAttributesImplBaseParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((onDataRangeChanged) obj2);
                    }

                    private Object read(onDataRangeChanged ondatarangechanged) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.AudioAttributesCompatParcelizer.INSTANCE)) {
                            if (ondatarangechanged instanceof onDataRangeChanged.RemoteActionCompatParcelizer) {
                                zabz zabzVar2 = zabzVar;
                                getDefaultBindFlags.Companion readVar = getDefaultBindFlags.INSTANCE;
                                zabzVar2.startActivity(getDefaultBindFlags.Companion.AudioAttributesCompatParcelizer(zabzVar));
                            } else if (ondatarangechanged instanceof onDataRangeChanged.MediaBrowserCompatItemReceiver) {
                                onDataRangeChanged.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = (onDataRangeChanged.MediaBrowserCompatItemReceiver) ondatarangechanged;
                                CmcdConfigurationRequestConfig.write(zabzVar, mediaBrowserCompatItemReceiver.read(), mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer());
                            } else if (ondatarangechanged instanceof onDataRangeChanged.read) {
                                CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(zabzVar, ((onDataRangeChanged.read) ondatarangechanged).read());
                            } else if (ondatarangechanged instanceof onDataRangeChanged.MediaDescriptionCompat) {
                                r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 r8lambdaibk6u1hk7j3awkl_wn934v2uvi8OnFastForward = zabz.onFastForward(zabzVar);
                                PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
                                onDataRangeChanged.MediaDescriptionCompat mediaDescriptionCompat = (onDataRangeChanged.MediaDescriptionCompat) ondatarangechanged;
                                r8lambdaibk6u1hk7j3awkl_wn934v2uvi8OnFastForward.read(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(zabzVar, mediaDescriptionCompat.AudioAttributesCompatParcelizer(), mediaDescriptionCompat.write()));
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.write.INSTANCE)) {
                                TrainingApplication.read().AudioAttributesImplBaseParcelizer().IconCompatParcelizer();
                                TrainingApplication.read().AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer();
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.onCustomAction.INSTANCE)) {
                                if (getTrackName.write(zabzVar)) {
                                    zabz zabzVar3 = zabzVar;
                                    SupportStreetViewPanoramaFragmentzzb.Companion companion = SupportStreetViewPanoramaFragmentzzb.INSTANCE;
                                    zabzVar3.startActivity(SupportStreetViewPanoramaFragmentzzb.Companion.read(zabzVar));
                                } else {
                                    zabz zabzVar4 = zabzVar;
                                    zabz zabzVar5 = zabzVar4;
                                    String string = zabzVar4.getString(R.string.no_internet_message_share);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                    CmcdConfigurationRequestConfig.read(zabzVar5, string, 0);
                                }
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                                zabz zabzVar6 = zabzVar;
                                PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = PlanActivity.RemoteActionCompatParcelizer;
                                zabzVar6.startActivity(PlanActivity.AudioAttributesCompatParcelizer.IconCompatParcelizer(zabzVar));
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE)) {
                                getAutofillClient.Companion companion2 = getAutofillClient.INSTANCE;
                                String string2 = zabzVar.getString(R.string.text_way_to_logout);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                                String string3 = zabzVar.getString(R.string.logout_flush);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                                getAutofillClient.Companion.AudioAttributesCompatParcelizer(string2, "", string3, null, 0, SmsRetrieverStatusCodes.read, false, false, null, 472).show(zabzVar.getSupportFragmentManager(), "");
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                                zabz zabzVar7 = zabzVar;
                                packageManager.Companion audioAttributesCompatParcelizer3 = packageManager.INSTANCE;
                                zabzVar7.startActivity(packageManager.Companion.RemoteActionCompatParcelizer(zabzVar));
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.onAddQueueItem.INSTANCE)) {
                                joinWithSeparator.AudioAttributesCompatParcelizer(zabzVar.getApplicationContext());
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
                                zabz zabzVar8 = zabzVar;
                                isAtLeastKitKatWatch.Companion companion3 = isAtLeastKitKatWatch.INSTANCE;
                                zabzVar8.startActivity(isAtLeastKitKatWatch.Companion.AudioAttributesCompatParcelizer(zabzVar));
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.IconCompatParcelizer.INSTANCE)) {
                                zabz zabzVar9 = zabzVar;
                                getSubMeshCount.Companion companion4 = getSubMeshCount.INSTANCE;
                                zabzVar9.startActivity(getSubMeshCount.Companion.RemoteActionCompatParcelizer(zabzVar, new getCameraMotionListener(0, false, 0, 7, null)));
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.MediaBrowserCompatMediaItem.INSTANCE)) {
                                zabz zabzVar10 = zabzVar;
                                StreetViewPanoramaFragmentzza.Companion companion5 = StreetViewPanoramaFragmentzza.INSTANCE;
                                zabzVar10.startActivity(StreetViewPanoramaFragmentzza.Companion.RemoteActionCompatParcelizer(zabzVar));
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                                zabz zabzVar11 = zabzVar;
                                isAtLeastV.Companion readVar2 = isAtLeastV.INSTANCE;
                                zabzVar11.startActivity(isAtLeastV.Companion.AudioAttributesCompatParcelizer(zabzVar));
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.handleMediaPlayPauseIfPendingOnHandler.INSTANCE)) {
                                zabz zabzVar12 = zabzVar;
                                UpgradePlanActivity.Companion companion6 = UpgradePlanActivity.INSTANCE;
                                zabzVar12.startActivity(UpgradePlanActivity.Companion.AudioAttributesCompatParcelizer(zabzVar, "left_nav"));
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.RatingCompat.INSTANCE)) {
                                copyToBuffer copytobufferAudioAttributesImplBaseParcelizer = zabzVar.AudioAttributesImplBaseParcelizer();
                                getAttachment.Companion readVar3 = getAttachment.INSTANCE;
                                copytobufferAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer((Fragment) getAttachment.Companion.read(), true, false, (List<? extends View>) null);
                            } else if (ondatarangechanged instanceof onDataRangeChanged.AudioAttributesImplApi21Parcelizer) {
                                zabz zabzVar13 = zabzVar;
                                createStringSparseArray.Companion readVar4 = createStringSparseArray.INSTANCE;
                                onDataRangeChanged.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (onDataRangeChanged.AudioAttributesImplApi21Parcelizer) ondatarangechanged;
                                zabzVar13.startActivity(createStringSparseArray.Companion.write(zabzVar, new readList(audioAttributesImplApi21Parcelizer.write(), audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer())));
                            } else if (ondatarangechanged instanceof onDataRangeChanged.MediaMetadataCompat) {
                                setTokenBinding.Companion companion7 = setTokenBinding.INSTANCE;
                                setTokenBinding.Companion.IconCompatParcelizer(zabzVar, ((onDataRangeChanged.MediaMetadataCompat) ondatarangechanged).RemoteActionCompatParcelizer(), 8, null);
                            } else if (ondatarangechanged instanceof onDataRangeChanged.onCommand) {
                                LessonVideoActivity.Companion companion8 = LessonVideoActivity.INSTANCE;
                                Intent intentRemoteActionCompatParcelizer = LessonVideoActivity.Companion.RemoteActionCompatParcelizer(zabzVar, ((onDataRangeChanged.onCommand) ondatarangechanged).IconCompatParcelizer(), 0, false, 24);
                                intentRemoteActionCompatParcelizer.putExtra("_diff_task", true);
                                intentRemoteActionCompatParcelizer.setFlags(603979776);
                                zabzVar.startActivity(intentRemoteActionCompatParcelizer);
                            } else {
                                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangechanged, onDataRangeChanged.onPlayFromMediaId.INSTANCE)) {
                                    throw new RenewEligibleCreator();
                                }
                                Object[] objArr = {zabzVar};
                                int i2 = getClassId.AudioAttributesCompatParcelizer.read();
                                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                                zabz.RemoteActionCompatParcelizer(i2, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i3, -1291647684, 1291647684);
                            }
                        }
                        zabzVar.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer.read();
                        zabz.onPrepareFromMediaId(zabzVar).IconCompatParcelizer(onDataRangeInserted.RatingCompat.INSTANCE);
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zabz.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0080  */
    @Override // kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabz.onCreate(android.os.Bundle):void");
    }

    private final void onPlay() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 73;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        zabz zabzVar = this;
        if (DeviceProperties.isTablet(zabzVar)) {
            int i4 = AudioAttributesImplBaseParcelizer + 33;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            TabLayout tabLayout = AudioAttributesImplApi21Parcelizer().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
            bytesRead.IconCompatParcelizer(zabzVar, tabLayout);
            ConstraintLayout constraintLayoutIconCompatParcelizer = AudioAttributesImplApi21Parcelizer().MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
            bytesRead.write(zabzVar, constraintLayoutIconCompatParcelizer);
            LinearLayout linearLayoutIconCompatParcelizer = AudioAttributesImplApi21Parcelizer().IconCompatParcelizer.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
            bytesRead.write(zabzVar, linearLayoutIconCompatParcelizer);
            ConstraintLayout constraintLayoutIconCompatParcelizer2 = AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer2, "");
            bytesRead.write(zabzVar, constraintLayoutIconCompatParcelizer2);
        }
        int i6 = MediaBrowserCompatCustomActionResultReceiver + 21;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onSeekTo(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 67;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zabzVar.AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver.getTag(), (Object) "backpress")) {
            zabzVar.onBackPressed();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zabzVar.AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver.getTag(), (Object) "menu")) {
            zabzVar.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            zabzVar.RatingCompat().IconCompatParcelizer(setTempDir.AudioAttributesImplApi21Parcelizer.INSTANCE);
            int i4 = AudioAttributesImplBaseParcelizer + 101;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            }
        }
        int i6 = AudioAttributesImplBaseParcelizer + 107;
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onRemoveQueueItem(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 63;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            zabzVar.RatingCompat().IconCompatParcelizer(setTempDir.write.INSTANCE);
            copyToBuffer copytobufferAudioAttributesImplBaseParcelizer = zabzVar.AudioAttributesImplBaseParcelizer();
            releaseProcessedFrames.Companion companion = releaseProcessedFrames.INSTANCE;
            copytobufferAudioAttributesImplBaseParcelizer.IconCompatParcelizer(releaseProcessedFrames.Companion.IconCompatParcelizer());
            return;
        }
        zabzVar.RatingCompat().IconCompatParcelizer(setTempDir.write.INSTANCE);
        copyToBuffer copytobufferAudioAttributesImplBaseParcelizer2 = zabzVar.AudioAttributesImplBaseParcelizer();
        releaseProcessedFrames.Companion companion2 = releaseProcessedFrames.INSTANCE;
        copytobufferAudioAttributesImplBaseParcelizer2.IconCompatParcelizer(releaseProcessedFrames.Companion.IconCompatParcelizer());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void MediaDescriptionCompat() {
        int i = 2 % 2;
        AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver.setImageResource(R.drawable.menu);
        AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver.setTag("menu");
        AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.zaby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.RatingCompat(this.read);
            }
        });
        AudioAttributesImplApi21Parcelizer().MediaBrowserCompatCustomActionResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.zabv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.write(this.write);
            }
        });
        AudioAttributesImplApi21Parcelizer().AudioAttributesImplBaseParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zaco
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 19;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onPrepareFromUri(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 43;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(setTempDir.IconCompatParcelizer.INSTANCE);
        copyToBuffer copytobufferAudioAttributesImplBaseParcelizer = zabzVar.AudioAttributesImplBaseParcelizer();
        transformFutureAsync.Companion companion = transformFutureAsync.INSTANCE;
        copytobufferAudioAttributesImplBaseParcelizer.IconCompatParcelizer(transformFutureAsync.Companion.RemoteActionCompatParcelizer(""));
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 27;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class RemoteActionCompatParcelizer implements DrawerLayout.RemoteActionCompatParcelizer {

        /* JADX INFO: loaded from: classes3.dex */
        public static final /* synthetic */ class read {
            public static final /* synthetic */ int[] read;

            static {
                int[] iArr = new int[isConnectionFailedListenerRegistered.values().length];
                try {
                    iArr[isConnectionFailedListenerRegistered.read.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[isConnectionFailedListenerRegistered.IconCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[isConnectionFailedListenerRegistered.write.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[isConnectionFailedListenerRegistered.RemoteActionCompatParcelizer.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                read = iArr;
            }
        }

        RemoteActionCompatParcelizer() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            Window window = zabz.this.getWindow();
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            window.setStatusBarColor(shouldEscapeCharacter.Companion.read(zabz.this, R.attr.colorSurfaceVariant5, new TypedValue(), true));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(View view) {
            int color;
            toMagicModuleMetaRepoModel.write(view, "");
            if (zabz.onPlayFromUri(zabz.this)) {
                zabz zabzVar = zabz.this;
                int i = getClassId.AudioAttributesCompatParcelizer.read();
                int i2 = getClassId.AudioAttributesCompatParcelizer.read();
                Object[] objArr = {zabzVar, Float.valueOf(((HomeSharedViewModel) zabz.RemoteActionCompatParcelizer(i, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 608680917, -608680910)).AudioAttributesImplBaseParcelizer().IconCompatParcelizer().floatValue())};
                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                int i4 = getClassId.AudioAttributesCompatParcelizer.read();
                zabz.RemoteActionCompatParcelizer(i3, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i4, 366129225, -366129219);
                return;
            }
            Window window = zabz.this.getWindow();
            Object[] objArr2 = {zabz.this};
            int i5 = getClassId.AudioAttributesCompatParcelizer.read();
            int i6 = getClassId.AudioAttributesCompatParcelizer.read();
            int i7 = read.read[((HomeSharedViewModel) zabz.RemoteActionCompatParcelizer(i5, objArr2, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i6, 608680917, -608680910)).AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().getIconCompatParcelizer().ordinal()];
            if (i7 == 1) {
                shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
                Context context = zabz.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().getContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
                color = shouldEscapeCharacter.Companion.read(context, R.attr.colorSurfaceVariant14, new TypedValue(), true);
            } else if (i7 == 2) {
                shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
                Context context2 = zabz.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().getContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
                color = shouldEscapeCharacter.Companion.read(context2, R.attr.practicalCornerColor, new TypedValue(), true);
            } else if (i7 == 3) {
                color = _isNaN.getColor(zabz.this, R.color.mb_50);
            } else {
                if (i7 != 4) {
                    throw new RenewEligibleCreator();
                }
                shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
                Context context3 = zabz.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().getContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context3, "");
                color = shouldEscapeCharacter.Companion.read(context3, R.attr.colorSurfaceVariant5, new TypedValue(), true);
            }
            window.setStatusBarColor(color);
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
        }
    }

    private static final void RemoteActionCompatParcelizer(zabz zabzVar, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 77;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
            zabzVar.RatingCompat().IconCompatParcelizer(setTempDir.AudioAttributesImplApi26Parcelizer.INSTANCE);
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        zabzVar.RatingCompat().IconCompatParcelizer(setTempDir.AudioAttributesImplApi26Parcelizer.INSTANCE);
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 1;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void write(maybeSignOut maybesignout) {
        boolean z;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 41;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup.LayoutParams layoutParams = AudioAttributesImplApi21Parcelizer().MediaBrowserCompatMediaItem.getLayoutParams();
        toMagicModuleMetaRepoModel.read(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        boolean write2 = maybesignout.getWrite().getWrite();
        if (layoutParams2.addObserverForBackInvokerlambda7 == 0) {
            int i4 = AudioAttributesImplBaseParcelizer + 91;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (write2 != z) {
            if (!write2) {
                layoutParams2._init_lambda4 = AudioAttributesImplApi21Parcelizer().onCustomAction.getId();
                layoutParams2.addObserverForBackInvokerlambda7 = -1;
            } else {
                int i6 = MediaBrowserCompatCustomActionResultReceiver + 7;
                AudioAttributesImplBaseParcelizer = i6 % 128;
                int i7 = i6 % 2;
                layoutParams2.addObserverForBackInvokerlambda7 = 0;
                layoutParams2._init_lambda4 = -1;
            }
            AudioAttributesImplApi21Parcelizer().MediaBrowserCompatMediaItem.setLayoutParams(layoutParams2);
        }
    }

    private final void onPlayFromMediaId() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 81;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.video_for_paid_user);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.view_plans);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.go_back);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        Object obj = null;
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, string, string2, string3, 0, SmsRetrieverStatusCodes.RemoteActionCompatParcelizer, false, false, null, 465).show(getSupportFragmentManager(), (String) null);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 15;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void read(final boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 7;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        CardView cardView = AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        CardView cardView2 = cardView;
        if (z) {
            int i5 = MediaBrowserCompatCustomActionResultReceiver + 7;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            i = 8;
        }
        cardView2.setVisibility(i);
        CmcdHeadersFactory1 cmcdHeadersFactory1 = CmcdHeadersFactory1.INSTANCE;
        if (CmcdHeadersFactory1.RemoteActionCompatParcelizer()) {
            InvalidTypeIdException.read(AudioAttributesImplApi21Parcelizer().MediaBrowserCompatMediaItem, new finishBranchObject() { // from class: o.zacp
                @Override // kotlin.finishBranchObject
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    Object[] objArr = {this.write, Boolean.valueOf(z), view, windowInsetsCompat};
                    int i7 = getClassId.AudioAttributesCompatParcelizer.read();
                    int i8 = getClassId.AudioAttributesCompatParcelizer.read();
                    return (WindowInsetsCompat) zabz.RemoteActionCompatParcelizer(i7, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i8, -855180761, 855180773);
                }
            });
        }
    }

    private static final WindowInsetsCompat RemoteActionCompatParcelizer(zabz zabzVar, boolean z, View view, WindowInsetsCompat windowInsetsCompat) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 7;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(windowInsetsCompat, "");
        _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_verifyendarrayforsingle, "");
        ConstraintLayout constraintLayout = zabzVar.AudioAttributesImplApi21Parcelizer().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        ConstraintLayout constraintLayout2 = constraintLayout;
        int i5 = _verifyendarrayforsingle.read;
        int i6 = _verifyendarrayforsingle.IconCompatParcelizer;
        if (z) {
            int i7 = MediaBrowserCompatCustomActionResultReceiver + 5;
            AudioAttributesImplBaseParcelizer = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        } else {
            i = _verifyendarrayforsingle.AudioAttributesCompatParcelizer;
        }
        constraintLayout2.setPadding(i5, 0, i6, i);
        return WindowInsetsCompat.IconCompatParcelizer;
    }

    private static final void onRewind(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 25;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.MediaBrowserCompatSearchResultReceiver.INSTANCE);
        int i4 = AudioAttributesImplBaseParcelizer + 99;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 119;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.MediaMetadataCompat.INSTANCE);
        int i4 = AudioAttributesImplBaseParcelizer + 63;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final void MediaSessionCompatToken(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 21;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.AudioAttributesCompatParcelizer.INSTANCE);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 117;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void MediaSessionCompatResultReceiverWrapper(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 3;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.AudioAttributesImplBaseParcelizer.INSTANCE);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 105;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void ParcelableVolumeInfo(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 115;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.onAddQueueItem.INSTANCE);
        int i4 = AudioAttributesImplBaseParcelizer + 81;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void MediaSessionCompatQueueItem(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 35;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.AudioAttributesImplApi26Parcelizer.INSTANCE);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 93;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void PlaybackStateCompat(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 77;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        HomeUIActivityViewModel homeUIActivityViewModelRatingCompat = zabzVar.RatingCompat();
        onDataRangeInserted.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = onDataRangeInserted.MediaBrowserCompatItemReceiver.INSTANCE;
        if (i3 != 0) {
            homeUIActivityViewModelRatingCompat.IconCompatParcelizer(mediaBrowserCompatItemReceiver);
        } else {
            homeUIActivityViewModelRatingCompat.IconCompatParcelizer(mediaBrowserCompatItemReceiver);
            int i4 = 79 / 0;
        }
    }

    private static final void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 1;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.IconCompatParcelizer.INSTANCE);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 97;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.AudioAttributesImplApi26Parcelizer();
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 103;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
    }

    private static final void ResultReceiver(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 101;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.read.INSTANCE);
        int i4 = AudioAttributesImplBaseParcelizer + 45;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onSetShuffleMode(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 7;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.onCustomAction.INSTANCE);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 117;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onSetRepeatMode(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 21;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final void onSetCaptioningEnabled(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 123;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.AudioAttributesImplApi21Parcelizer.INSTANCE);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 47;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 113;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        HomeUIActivityViewModel homeUIActivityViewModelRatingCompat = zabzVar.RatingCompat();
        if (i3 != 0) {
            homeUIActivityViewModelRatingCompat.IconCompatParcelizer(onDataRangeInserted.write.INSTANCE);
            obj.hashCode();
            throw null;
        }
        homeUIActivityViewModelRatingCompat.IconCompatParcelizer(onDataRangeInserted.write.INSTANCE);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 115;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onSkipToNext(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 23;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        HomeUIActivityViewModel homeUIActivityViewModelRatingCompat = zabzVar.RatingCompat();
        onDataRangeInserted.handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler = onDataRangeInserted.handleMediaPlayPauseIfPendingOnHandler.INSTANCE;
        if (i3 != 0) {
            homeUIActivityViewModelRatingCompat.IconCompatParcelizer(handlemediaplaypauseifpendingonhandler);
            return;
        }
        homeUIActivityViewModelRatingCompat.IconCompatParcelizer(handlemediaplaypauseifpendingonhandler);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void setSessionImpl(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 35;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.MediaBrowserCompatMediaItem.INSTANCE);
        int i4 = AudioAttributesImplBaseParcelizer + 39;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onSkipToPrevious(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.MediaDescriptionCompat.INSTANCE);
        int i4 = AudioAttributesImplBaseParcelizer + 101;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onStop(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 77;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(onDataRangeInserted.RemoteActionCompatParcelizer.INSTANCE);
        int i4 = AudioAttributesImplBaseParcelizer + 101;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onSkipToQueueItem(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        HomeUIActivityViewModel homeUIActivityViewModelRatingCompat = zabzVar.RatingCompat();
        if (i3 == 0) {
            homeUIActivityViewModelRatingCompat.IconCompatParcelizer(onDataRangeInserted.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        homeUIActivityViewModelRatingCompat.IconCompatParcelizer(onDataRangeInserted.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE);
        int i4 = AudioAttributesImplBaseParcelizer + 119;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void PlaybackStateCompatCustomAction(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 65;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zabzVar.RatingCompat().IconCompatParcelizer(setTempDir.AudioAttributesCompatParcelizer.INSTANCE);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 85;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 57;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        String lowerCase = "ZEN_AREA_GO_PRO_BUTTON".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        zabzVar.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(zabzVar, "GoProButton_Homepage", lowerCase));
        int i4 = AudioAttributesImplBaseParcelizer + 99;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onCustomAction() {
        int i = 2 % 2;
        getSegmentIndex getsegmentindex = AudioAttributesImplApi21Parcelizer().read;
        getsegmentindex.onCommand.setOnClickListener(new View.OnClickListener() { // from class: o.zabx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        getsegmentindex.handleMediaPlayPauseIfPendingOnHandler.setOnClickListener(new View.OnClickListener() { // from class: o.zacb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.MediaBrowserCompatSearchResultReceiver(this.read);
            }
        });
        getsegmentindex.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zace
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.onPlayFromMediaId(this.RemoteActionCompatParcelizer);
            }
        });
        getsegmentindex.MediaMetadataCompat.setOnClickListener(new View.OnClickListener() { // from class: o.zacc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.IconCompatParcelizer};
                int i2 = getClassId.AudioAttributesCompatParcelizer.read();
                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                zabz.RemoteActionCompatParcelizer(i2, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i3, -401624866, 401624875);
            }
        });
        getsegmentindex.onPlayFromMediaId.setOnClickListener(new View.OnClickListener() { // from class: o.zacf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        getsegmentindex.RatingCompat.setOnClickListener(new View.OnClickListener() { // from class: o.zacj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.onMediaButtonEvent(this.read);
            }
        });
        getsegmentindex.onAddQueueItem.setOnClickListener(new View.OnClickListener() { // from class: o.zach
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.onCustomAction(this.RemoteActionCompatParcelizer);
            }
        });
        getsegmentindex.MediaBrowserCompatItemReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.zaci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer);
            }
        });
        getsegmentindex.MediaBrowserCompatMediaItem.setOnClickListener(new View.OnClickListener() { // from class: o.zacm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.MediaBrowserCompatMediaItem(this.read);
            }
        });
        getsegmentindex.AudioAttributesImplApi26Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zacl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.onCommand(this.RemoteActionCompatParcelizer);
            }
        });
        getsegmentindex.onFastForward.setOnClickListener(new View.OnClickListener() { // from class: o.zacg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.read(this.write);
            }
        });
        getsegmentindex.MediaDescriptionCompat.setOnClickListener(new View.OnClickListener() { // from class: o.zacq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.handleMediaPlayPauseIfPendingOnHandler(this.AudioAttributesCompatParcelizer);
            }
        });
        getsegmentindex.MediaBrowserCompatSearchResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.zacy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.MediaMetadataCompat(this.read);
            }
        });
        getsegmentindex.MediaBrowserCompatCustomActionResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.zacu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        getsegmentindex.read.setOnClickListener(new View.OnClickListener() { // from class: o.zacw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.onAddQueueItem(this.IconCompatParcelizer);
            }
        });
        getsegmentindex.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.zacx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.RemoteActionCompatParcelizer(this.read);
            }
        });
        getsegmentindex.onCustomAction.setOnClickListener(new View.OnClickListener() { // from class: o.zacz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.AudioAttributesCompatParcelizer);
            }
        });
        getsegmentindex.AudioAttributesImplBaseParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.initialValue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.AudioAttributesCompatParcelizer};
                int i2 = getClassId.AudioAttributesCompatParcelizer.read();
                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                zabz.RemoteActionCompatParcelizer(i2, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i3, 316961511, -316961495);
            }
        });
        getsegmentindex.onPrepare.setOnClickListener(new View.OnClickListener() { // from class: o.zabw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.IconCompatParcelizer};
                int i2 = getClassId.AudioAttributesCompatParcelizer.read();
                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                zabz.RemoteActionCompatParcelizer(i2, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i3, 1517023705, -1517023702);
            }
        });
        AudioAttributesImplApi21Parcelizer().handleMediaPlayPauseIfPendingOnHandler.setOnClickListener(new View.OnClickListener() { // from class: o.zacd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.onPlay(this.RemoteActionCompatParcelizer);
            }
        });
        AudioAttributesImplApi21Parcelizer().onCommand.setOnClickListener(new View.OnClickListener() { // from class: o.zaca
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zabz.MediaBrowserCompatCustomActionResultReceiver(this.write);
            }
        });
        AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer.IconCompatParcelizer(new RemoteActionCompatParcelizer());
        int i2 = AudioAttributesImplBaseParcelizer + 65;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void AudioAttributesCompatParcelizer(String str, Bundle bundle) throws Throwable {
        TrainingApplication trainingApplication;
        int i;
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 79;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("positive_key_press")) {
            int i5 = MediaBrowserCompatCustomActionResultReceiver + 73;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                trainingApplication = TrainingApplication.read();
                i = 0;
            } else {
                trainingApplication = TrainingApplication.read();
                i = 1;
            }
            trainingApplication.logout(i, null);
            int i6 = AudioAttributesImplBaseParcelizer + 3;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private final void onCommand() {
        int i = 2 % 2;
        zabz zabzVar = this;
        getSupportFragmentManager().IconCompatParcelizer(SmsRetrieverStatusCodes.read.getWrite(), zabzVar, new _addFields() { // from class: o.zacr
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                int i2 = getClassId.AudioAttributesCompatParcelizer.read();
                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                zabz.RemoteActionCompatParcelizer(i2, new Object[]{str, bundle}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i3, 32860932, -32860922);
            }
        });
        getSupportFragmentManager().IconCompatParcelizer(SmsRetrieverStatusCodes.RemoteActionCompatParcelizer.getWrite(), zabzVar, new _addFields() { // from class: o.zacv
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                zabz.read(this.write, str, bundle);
            }
        });
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 17;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void write(zabz zabzVar, String str, Bundle bundle) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("positive_key_press")) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 89;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            HomeUIActivityViewModel homeUIActivityViewModelRatingCompat = zabzVar.RatingCompat();
            if (i3 == 0) {
                homeUIActivityViewModelRatingCompat.IconCompatParcelizer(setTempDir.RemoteActionCompatParcelizer.INSTANCE);
                throw null;
            }
            homeUIActivityViewModelRatingCompat.IconCompatParcelizer(setTempDir.RemoteActionCompatParcelizer.INSTANCE);
        }
        int i4 = AudioAttributesImplBaseParcelizer + 53;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    private final void RemoteActionCompatParcelizer(List<? extends DataBuffer> list) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi21Parcelizer().write.MediaBrowserCompatCustomActionResultReceiver();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 119;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        for (Object obj : list) {
            if (i6 < 0) {
                IntermediateLoginResponseBody.read();
            }
            DataBuffer dataBuffer = (DataBuffer) obj;
            View viewInflate = getLayoutInflater().inflate(R.layout.custom_home_tab, (ViewGroup) null);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
            TextView textView = (TextView) viewInflate.findViewById(R.id.title);
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView, dataBuffer.getWrite());
            textView.setText(dataBuffer.getIconCompatParcelizer());
            TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverRemoteActionCompatParcelizer = AudioAttributesImplApi21Parcelizer().write.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(viewInflate);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiverRemoteActionCompatParcelizer, "");
            mediaBrowserCompatCustomActionResultReceiverRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(dataBuffer);
            AudioAttributesImplApi21Parcelizer().write.write(mediaBrowserCompatCustomActionResultReceiverRemoteActionCompatParcelizer);
            i6++;
            int i7 = AudioAttributesImplBaseParcelizer + 89;
            MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 % 4;
            }
        }
    }

    private final void IconCompatParcelizer(DataBuffer dataBuffer) {
        maybeSignOut maybesignoutWrite;
        int i = 2 % 2;
        if (getSupportFragmentManager().findFragmentById(R.id.upperContainer) instanceof getAttachment) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 99;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = getClassId.AudioAttributesCompatParcelizer.read();
                int i4 = getClassId.AudioAttributesCompatParcelizer.read();
                ((HomeSharedViewModel) RemoteActionCompatParcelizer(i3, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i4, -884567868, 884567885)).RemoteActionCompatParcelizer(DataBufferRef.AudioAttributesCompatParcelizer.INSTANCE);
                return;
            }
            int i5 = getClassId.AudioAttributesCompatParcelizer.read();
            int i6 = getClassId.AudioAttributesCompatParcelizer.read();
            ((HomeSharedViewModel) RemoteActionCompatParcelizer(i5, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i6, -884567868, 884567885)).RemoteActionCompatParcelizer(DataBufferRef.AudioAttributesCompatParcelizer.INSTANCE);
            int i7 = 80 / 0;
            return;
        }
        if (dataBuffer != DataBuffer.AudioAttributesCompatParcelizer) {
            maybeSignOut.write writeVar = maybeSignOut.read;
            maybesignoutWrite = maybeSignOut.write.AudioAttributesCompatParcelizer();
        } else {
            int i8 = getClassId.AudioAttributesCompatParcelizer.read();
            int i9 = getClassId.AudioAttributesCompatParcelizer.read();
            if (((HomeSharedViewModel) RemoteActionCompatParcelizer(i8, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i9, -884567868, 884567885)).getAudioAttributesImplApi21Parcelizer()) {
                int i10 = AudioAttributesImplBaseParcelizer + 21;
                MediaBrowserCompatCustomActionResultReceiver = i10 % 128;
                int i11 = i10 % 2;
                int i12 = getClassId.AudioAttributesCompatParcelizer.read();
                int i13 = getClassId.AudioAttributesCompatParcelizer.read();
                int i14 = read.RemoteActionCompatParcelizer[((HomeSharedViewModel) RemoteActionCompatParcelizer(i12, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i13, -884567868, 884567885)).getMediaBrowserCompatCustomActionResultReceiver().ordinal()];
                if (i14 != 1) {
                    int i15 = AudioAttributesImplBaseParcelizer;
                    int i16 = i15 + 125;
                    MediaBrowserCompatCustomActionResultReceiver = i16 % 128;
                    int i17 = i16 % 2;
                    if (i14 != 2) {
                        int i18 = i15 + 101;
                        MediaBrowserCompatCustomActionResultReceiver = i18 % 128;
                        if (i18 % 2 != 0) {
                            int i19 = 2 / 0;
                        }
                        maybesignoutWrite = null;
                    } else {
                        maybeSignOut.write writeVar2 = maybeSignOut.read;
                        maybesignoutWrite = maybeSignOut.write.IconCompatParcelizer(-MediaBrowserCompatMediaItem());
                    }
                } else {
                    maybeSignOut.write writeVar3 = maybeSignOut.read;
                    maybesignoutWrite = maybeSignOut.write.AudioAttributesCompatParcelizer(-MediaBrowserCompatMediaItem());
                }
            } else {
                int i20 = getClassId.AudioAttributesCompatParcelizer.read();
                int i21 = getClassId.AudioAttributesCompatParcelizer.read();
                if (((HomeSharedViewModel) RemoteActionCompatParcelizer(i20, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i21, -884567868, 884567885)).getAudioAttributesImplApi26Parcelizer()) {
                    maybeSignOut.write writeVar4 = maybeSignOut.read;
                    maybesignoutWrite = maybeSignOut.write.write();
                } else {
                    maybeSignOut.write writeVar5 = maybeSignOut.read;
                    maybesignoutWrite = maybeSignOut.write.read();
                }
            }
        }
        if (maybesignoutWrite != null) {
            int i22 = getClassId.AudioAttributesCompatParcelizer.read();
            int i23 = getClassId.AudioAttributesCompatParcelizer.read();
            ((HomeSharedViewModel) RemoteActionCompatParcelizer(i22, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i23, -884567868, 884567885)).RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplBaseParcelizer(maybesignoutWrite));
        }
    }

    private final void read(int i) {
        int i2;
        Object next;
        int i3 = 2 % 2;
        TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer = AudioAttributesImplApi21Parcelizer().write.AudioAttributesCompatParcelizer(i);
        Object obj = null;
        Object objAudioAttributesCompatParcelizer = mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer != null ? mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() : null;
        toMagicModuleMetaRepoModel.read(objAudioAttributesCompatParcelizer, "");
        DataBuffer dataBuffer = (DataBuffer) objAudioAttributesCompatParcelizer;
        if (dataBuffer == DataBuffer.AudioAttributesCompatParcelizer) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 85;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            LinearLayout linearLayout = AudioAttributesImplApi21Parcelizer().handleMediaPlayPauseIfPendingOnHandler;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
            TextView textView = AudioAttributesImplApi21Parcelizer().onAddQueueItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
            List<Fragment> listHandleMediaPlayPauseIfPendingOnHandler = getSupportFragmentManager().handleMediaPlayPauseIfPendingOnHandler();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listHandleMediaPlayPauseIfPendingOnHandler, "");
            Iterator<T> it = listHandleMediaPlayPauseIfPendingOnHandler.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((Fragment) next) instanceof makeGooglePlayServicesAvailable) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            makeGooglePlayServicesAvailable makegoogleplayservicesavailable = (makeGooglePlayServicesAvailable) next;
            if (makegoogleplayservicesavailable != null) {
                makegoogleplayservicesavailable.read();
            }
        } else {
            LinearLayout linearLayout2 = AudioAttributesImplApi21Parcelizer().handleMediaPlayPauseIfPendingOnHandler;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
            AudioAttributesImplApi21Parcelizer().onAddQueueItem.setText(dataBuffer.getRemoteActionCompatParcelizer());
            TextView textView2 = AudioAttributesImplApi21Parcelizer().onAddQueueItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
        }
        IconCompatParcelizer(dataBuffer);
        ImageView imageView = AudioAttributesImplApi21Parcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        imageView.setVisibility(!(dataBuffer.getMediaBrowserCompatCustomActionResultReceiver() ^ true) ? 0 : 8);
        int iWrite = AudioAttributesImplApi21Parcelizer().write.write();
        for (int i6 = 0; i6 < iWrite; i6++) {
            TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer2 = AudioAttributesImplApi21Parcelizer().write.AudioAttributesCompatParcelizer(i6);
            if (mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer2 == null) {
                return;
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer2.write.findViewById(R.id.icon);
            TextView textView3 = (TextView) mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer2.write.findViewById(R.id.title);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer2.write.findViewById(R.id.indicator);
            Object objAudioAttributesCompatParcelizer2 = mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.read(objAudioAttributesCompatParcelizer2, "");
            DataBuffer dataBuffer2 = (DataBuffer) objAudioAttributesCompatParcelizer2;
            zabz zabzVar = this;
            Drawable drawable = _isNaN.getDrawable(zabzVar, dataBuffer2.getWrite());
            toMagicModuleMetaRepoModel.write(appCompatImageView2);
            AppCompatImageView appCompatImageView3 = appCompatImageView2;
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(appCompatImageView3);
            if (mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer() == i) {
                zabz zabzVar2 = this;
                AudioAttributesImplApi21Parcelizer().write.read(zabzVar2);
                mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer2.AudioAttributesImplApi26Parcelizer();
                AudioAttributesImplApi21Parcelizer().write.write((TabLayout.AudioAttributesCompatParcelizer) zabzVar2);
            }
            if (mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer() == i) {
                int i7 = MediaBrowserCompatCustomActionResultReceiver + 53;
                AudioAttributesImplBaseParcelizer = i7 % 128;
                if (i7 % 2 == 0) {
                    CmcdConfigurationRequestConfig.read(zabzVar, R.attr.colorPrimary, R.color.colorPrimary);
                    obj.hashCode();
                    throw null;
                }
                i2 = CmcdConfigurationRequestConfig.read(zabzVar, R.attr.colorPrimary, R.color.colorPrimary);
            } else {
                appCompatImageView3.setVisibility(dataBuffer2.getAudioAttributesImplApi26Parcelizer() ? 0 : 8);
                i2 = CmcdConfigurationRequestConfig.read(zabzVar, R.attr.onBackgroundSurface3, R.color.n_40);
            }
            if (drawable != null) {
                drawable.setTint(i2);
            }
            textView3.setTextColor(i2);
            appCompatImageView.setImageDrawable(drawable);
        }
    }

    private final void read(DataBuffer dataBuffer) throws IllegalAccessException, InstantiationException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 123;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        copyToBuffer copytobufferAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        Class<?> clsWrite = dataBuffer.write();
        if (i3 == 0) {
            copytobufferAudioAttributesImplBaseParcelizer.write(clsWrite);
            int i4 = 20 / 0;
        } else {
            copytobufferAudioAttributesImplBaseParcelizer.write(clsWrite);
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 11;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        NetworkTypeObserverExternalSyntheticLambda0 networkTypeObserverExternalSyntheticLambda0 = (NetworkTypeObserverExternalSyntheticLambda0) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 119;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        buildDownloadCompletedNotification.write(zabzVar.AudioAttributesImplApi21Parcelizer().read.write.AudioAttributesCompatParcelizer, networkTypeObserverExternalSyntheticLambda0.getAudioAttributesCompatParcelizer());
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 103;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object MediaBrowserCompatSearchResultReceiver(java.lang.Object[] r13) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabz.MediaBrowserCompatSearchResultReceiver(java.lang.Object[]):java.lang.Object");
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 39;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        zabz zabzVar = this;
        if (copyAdaptationSets.AudioAttributesCompatParcelizer(zabzVar, "training.db", "backupname.db")) {
            String string = getString(R.string.toast_db_export_success);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            CmcdConfigurationRequestConfig.read(zabzVar, string, 0);
        } else {
            String string2 = getString(R.string.toast_db_export_failed);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            CmcdConfigurationRequestConfig.read(zabzVar, string2, 0);
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 47;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        Object objAudioAttributesCompatParcelizer;
        zabz zabzVar = (zabz) objArr[0];
        int i = 2 % 2;
        if (!((HomeSharedViewModel) RemoteActionCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), -884567868, 884567885)).getAudioAttributesImplApi26Parcelizer()) {
            return false;
        }
        TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer = zabzVar.AudioAttributesImplApi21Parcelizer().write.AudioAttributesCompatParcelizer(zabzVar.AudioAttributesImplApi21Parcelizer().write.AudioAttributesCompatParcelizer());
        if (mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer != null) {
            int i2 = AudioAttributesImplBaseParcelizer + 21;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
                throw null;
            }
            objAudioAttributesCompatParcelizer = mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        } else {
            int i3 = AudioAttributesImplBaseParcelizer + 83;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            int i4 = i3 % 2;
            objAudioAttributesCompatParcelizer = null;
        }
        return ((objAudioAttributesCompatParcelizer instanceof DataBuffer) ^ true ? null : (DataBuffer) objAudioAttributesCompatParcelizer) == DataBuffer.AudioAttributesCompatParcelizer;
    }

    private final void IconCompatParcelizer(float f) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 101;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        float f2 = getQues.read(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        zabz zabzVar = this;
        int i4 = shouldEscapeCharacter.Companion.read(zabzVar, R.attr.colorSurfaceVariant14, new TypedValue(), true);
        int color = _isNaN.getColor(zabzVar, R.color.mb_50);
        int iAudioAttributesCompatParcelizer = _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(i4, (int) (255.0f * f2));
        MediaBrowserCompatSearchResultReceiver().setColors(new int[]{iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer, 0}, new float[]{BitmapDescriptorFactory.HUE_RED, f2, 1.0f});
        if (AudioAttributesImplApi21Parcelizer().onCustomAction.getBackground() != MediaBrowserCompatSearchResultReceiver()) {
            AudioAttributesImplApi21Parcelizer().onCustomAction.setBackground(MediaBrowserCompatSearchResultReceiver());
            int i5 = MediaBrowserCompatCustomActionResultReceiver + 19;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
        }
        AudioAttributesImplApi21Parcelizer().onCustomAction.setClickable(f2 == 1.0f);
        if (f2 < 1.0f) {
            int i7 = MediaBrowserCompatCustomActionResultReceiver + 37;
            AudioAttributesImplBaseParcelizer = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            i4 = color;
        }
        if (getWindow().getStatusBarColor() != i4) {
            int i8 = MediaBrowserCompatCustomActionResultReceiver + 69;
            AudioAttributesImplBaseParcelizer = i8 % 128;
            int i9 = i8 % 2;
            getWindow().setStatusBarColor(i4);
            if (i9 == 0) {
                int i10 = 98 / 0;
            }
        }
    }

    public final int MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 59;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = getClassId.AudioAttributesCompatParcelizer.read();
            int i4 = getClassId.AudioAttributesCompatParcelizer.read();
            ((HomeSharedViewModel) RemoteActionCompatParcelizer(i3, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i4, -884567868, 884567885)).getMediaBrowserCompatItemReceiver();
            throw null;
        }
        int i5 = getClassId.AudioAttributesCompatParcelizer.read();
        int i6 = getClassId.AudioAttributesCompatParcelizer.read();
        if (((HomeSharedViewModel) RemoteActionCompatParcelizer(i5, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i6, -884567868, 884567885)).getMediaBrowserCompatItemReceiver() != null) {
            int i7 = getClassId.AudioAttributesCompatParcelizer.read();
            int i8 = getClassId.AudioAttributesCompatParcelizer.read();
            Integer mediaBrowserCompatItemReceiver = ((HomeSharedViewModel) RemoteActionCompatParcelizer(i7, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i8, -884567868, 884567885)).getMediaBrowserCompatItemReceiver();
            toMagicModuleMetaRepoModel.write(mediaBrowserCompatItemReceiver);
            int iIntValue = mediaBrowserCompatItemReceiver.intValue();
            int height = AudioAttributesImplApi21Parcelizer().onCustomAction.getHeight();
            if (height == 0 || iIntValue == height) {
                return iIntValue;
            }
            int i9 = getClassId.AudioAttributesCompatParcelizer.read();
            int i10 = getClassId.AudioAttributesCompatParcelizer.read();
            ((HomeSharedViewModel) RemoteActionCompatParcelizer(i9, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i10, -884567868, 884567885)).RemoteActionCompatParcelizer(new DataBufferRef.MediaBrowserCompatSearchResultReceiver(height));
            return height;
        }
        int i11 = getClassId.AudioAttributesCompatParcelizer.read();
        int i12 = getClassId.AudioAttributesCompatParcelizer.read();
        ((HomeSharedViewModel) RemoteActionCompatParcelizer(i11, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i12, -884567868, 884567885)).RemoteActionCompatParcelizer(new DataBufferRef.MediaBrowserCompatSearchResultReceiver(AudioAttributesImplApi21Parcelizer().onCustomAction.getHeight()));
        int i13 = getClassId.AudioAttributesCompatParcelizer.read();
        int i14 = getClassId.AudioAttributesCompatParcelizer.read();
        Integer mediaBrowserCompatItemReceiver2 = ((HomeSharedViewModel) RemoteActionCompatParcelizer(i13, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i14, -884567868, 884567885)).getMediaBrowserCompatItemReceiver();
        if (mediaBrowserCompatItemReceiver2 == null) {
            return 0;
        }
        int i15 = MediaBrowserCompatCustomActionResultReceiver + 1;
        AudioAttributesImplBaseParcelizer = i15 % 128;
        int i16 = i15 % 2;
        int iIntValue2 = mediaBrowserCompatItemReceiver2.intValue();
        int i17 = MediaBrowserCompatCustomActionResultReceiver + 95;
        AudioAttributesImplBaseParcelizer = i17 % 128;
        int i18 = i17 % 2;
        return iIntValue2;
    }

    private final void onMediaButtonEvent() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 107;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer.setDrawerLockMode(1);
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver.getTag(), (Object) "backpress")) {
            postOrRun postorrun = postOrRun.INSTANCE;
            ImageView imageView = AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            postOrRun.RemoteActionCompatParcelizer(imageView, "backpress");
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 41;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        TextView textView = AudioAttributesImplApi21Parcelizer().onCommand;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        CardView cardView = AudioAttributesImplApi21Parcelizer().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(cardView);
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) AudioAttributesImplApi21Parcelizer().RatingCompat.getText().toString(), (Object) "Practicals")) {
            postOrRun postorrun2 = postOrRun.INSTANCE;
            TextView textView2 = AudioAttributesImplApi21Parcelizer().RatingCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            postorrun2.read(textView2, "Practicals");
        }
        int i6 = MediaBrowserCompatCustomActionResultReceiver + 33;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onAddQueueItem() {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 105;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer.setDrawerLockMode(0);
        AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver.setImageResource(R.drawable.menu);
        AudioAttributesImplApi21Parcelizer().MediaBrowserCompatItemReceiver.setTag("menu");
        TextView textView = AudioAttributesImplApi21Parcelizer().onCommand;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        TextView textView2 = textView;
        if (RatingCompat().AudioAttributesCompatParcelizer().IconCompatParcelizer().getAudioAttributesImplApi21Parcelizer()) {
            int i6 = MediaBrowserCompatCustomActionResultReceiver + 67;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int i8 = AudioAttributesImplBaseParcelizer + 5;
            MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
            int i9 = i8 % 2;
            i = 8;
        }
        textView2.setVisibility(i);
        CardView cardView = AudioAttributesImplApi21Parcelizer().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        CardView cardView2 = cardView;
        if (!RatingCompat().AudioAttributesCompatParcelizer().IconCompatParcelizer().getOnCustomAction()) {
            int i10 = MediaBrowserCompatCustomActionResultReceiver + 59;
            AudioAttributesImplBaseParcelizer = i10 % 128;
            int i11 = i10 % 2;
            i5 = 8;
        }
        cardView2.setVisibility(i5);
        postOrRun postorrun = postOrRun.INSTANCE;
        TextView textView3 = AudioAttributesImplApi21Parcelizer().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        postorrun.read(textView3, "Marrow");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabz.onResume():void");
    }

    public final boolean MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 9;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            LinearLayout linearLayoutIconCompatParcelizer = AudioAttributesImplApi21Parcelizer().IconCompatParcelizer.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
            if (linearLayoutIconCompatParcelizer.getVisibility() != 0) {
                ConstraintLayout constraintLayoutIconCompatParcelizer = AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
                if (constraintLayoutIconCompatParcelizer.getVisibility() != 0) {
                    ConstraintLayout constraintLayoutIconCompatParcelizer2 = AudioAttributesImplApi21Parcelizer().MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer2, "");
                    if (constraintLayoutIconCompatParcelizer2.getVisibility() != 0) {
                        return false;
                    }
                }
            }
            int i3 = AudioAttributesImplBaseParcelizer + 99;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        LinearLayout linearLayoutIconCompatParcelizer2 = AudioAttributesImplApi21Parcelizer().IconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer2, "");
        linearLayoutIconCompatParcelizer2.getVisibility();
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void onNewIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 81;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(intent, "");
            super.onNewIntent(intent);
            RatingCompat().IconCompatParcelizer(setTempDir.read.INSTANCE);
            int i3 = 65 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(intent, "");
            super.onNewIntent(intent);
            RatingCompat().IconCompatParcelizer(setTempDir.read.INSTANCE);
        }
        int i4 = AudioAttributesImplBaseParcelizer + 97;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.RemoteActionCompatParcelizer
    public final void IconCompatParcelizer(TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatCustomActionResultReceiver, "");
        RatingCompat().IconCompatParcelizer(new setTempDir.MediaBrowserCompatItemReceiver(mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer()));
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011a  */
    @Override // kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabz.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:(27:35|262|36|(3:38|39|(2:41|43)(1:42))(1:43)|79|279|80|(1:82)|83|(3:85|(1:87)|88)(19:89|90|267|91|(1:93)|94|95|260|96|(1:98)|99|100|101|(1:103)|104|(1:106)|107|(1:109)|110)|111|(4:114|(13:287|116|(3:118|(3:121|122|119)|291)|123|280|124|(1:126)|127|128|129|269|130|290)(1:289)|288|112)|286|165|(1:167)|168|(2:170|(4:172|(1:174)|175|176)(3:177|(1:179)|180))(13:182|265|183|184|(1:186)|187|284|188|189|(1:191)|192|(1:194)|195)|181|196|(6:198|199|(1:201)|202|203|204)|205|(1:207)|208|(3:210|(1:212)|213)(14:215|216|(1:218)|219|220|(1:222)|223|275|224|225|(1:227)|228|(1:230)|231)|214|232|(7:234|235|(1:237)|238|239|240|241)(1:292))|282|48|(1:50)|51|273|52|(1:54)|55|79|279|80|(0)|83|(0)(0)|111|(1:112)|286|165|(0)|168|(0)(0)|181|196|(0)|205|(0)|208|(0)(0)|214|232|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0b15, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0b16, code lost:
    
        r8 = new java.lang.Object[1];
        q(11 - android.view.View.resolveSize(0, 0), new int[]{1684882504, 1159597982, 136055990, -1816526766, -1721254974, 58930757}, r8);
        r2 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0b2d, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r4);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0b44, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0b48, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0b57, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0b5b, code lost:
    
        if (r1 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b5d, code lost:
    
        r1 = kotlin.startForeground.read((char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4535), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 6054, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0b85, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0b91, code lost:
    
        r8 = new java.lang.Object[]{-1386573330, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))), (android.util.TypedValue.complexToFraction(0, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.util.TypedValue.complexToFraction(0, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24);
        r4 = kotlin.zabz.$$E[129(0x81, float:1.81E-43)];
        r11 = new java.lang.Object[1];
        t(r4, (byte) (r4 | 21), (short) (kotlin.zabz.$$F - 3), r11);
        r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x09e0 A[Catch: all -> 0x0b15, TryCatch #11 {all -> 0x0b15, blocks: (B:80:0x05f6, B:82:0x05fc, B:83:0x062f, B:85:0x063c, B:87:0x0645, B:88:0x0682, B:111:0x09d6, B:112:0x09da, B:114:0x09e0, B:116:0x09f6, B:119:0x0a03, B:121:0x0a06, B:128:0x0a6e, B:134:0x0aef, B:136:0x0af5, B:137:0x0af6, B:139:0x0af8, B:141:0x0aff, B:142:0x0b00, B:89:0x068d, B:101:0x084c, B:103:0x0852, B:104:0x088d, B:106:0x0934, B:107:0x097a, B:109:0x0990, B:110:0x09d0, B:144:0x0b02, B:146:0x0b09, B:147:0x0b0a, B:149:0x0b0c, B:151:0x0b13, B:152:0x0b14, B:96:0x07bf, B:98:0x07d3, B:99:0x0840, B:91:0x077a, B:93:0x078e, B:94:0x07b8, B:130:0x0a73, B:124:0x0a33, B:126:0x0a39, B:127:0x0a67), top: B:279:0x05f6, outer: #8, inners: #0, #4, #5, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0c61  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0d0f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0fb6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1090  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x10d1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x1121  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x13eb  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05fc A[Catch: all -> 0x0b15, TryCatch #11 {all -> 0x0b15, blocks: (B:80:0x05f6, B:82:0x05fc, B:83:0x062f, B:85:0x063c, B:87:0x0645, B:88:0x0682, B:111:0x09d6, B:112:0x09da, B:114:0x09e0, B:116:0x09f6, B:119:0x0a03, B:121:0x0a06, B:128:0x0a6e, B:134:0x0aef, B:136:0x0af5, B:137:0x0af6, B:139:0x0af8, B:141:0x0aff, B:142:0x0b00, B:89:0x068d, B:101:0x084c, B:103:0x0852, B:104:0x088d, B:106:0x0934, B:107:0x097a, B:109:0x0990, B:110:0x09d0, B:144:0x0b02, B:146:0x0b09, B:147:0x0b0a, B:149:0x0b0c, B:151:0x0b13, B:152:0x0b14, B:96:0x07bf, B:98:0x07d3, B:99:0x0840, B:91:0x077a, B:93:0x078e, B:94:0x07b8, B:130:0x0a73, B:124:0x0a33, B:126:0x0a39, B:127:0x0a67), top: B:279:0x05f6, outer: #8, inners: #0, #4, #5, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x063c A[Catch: all -> 0x0b15, TryCatch #11 {all -> 0x0b15, blocks: (B:80:0x05f6, B:82:0x05fc, B:83:0x062f, B:85:0x063c, B:87:0x0645, B:88:0x0682, B:111:0x09d6, B:112:0x09da, B:114:0x09e0, B:116:0x09f6, B:119:0x0a03, B:121:0x0a06, B:128:0x0a6e, B:134:0x0aef, B:136:0x0af5, B:137:0x0af6, B:139:0x0af8, B:141:0x0aff, B:142:0x0b00, B:89:0x068d, B:101:0x084c, B:103:0x0852, B:104:0x088d, B:106:0x0934, B:107:0x097a, B:109:0x0990, B:110:0x09d0, B:144:0x0b02, B:146:0x0b09, B:147:0x0b0a, B:149:0x0b0c, B:151:0x0b13, B:152:0x0b14, B:96:0x07bf, B:98:0x07d3, B:99:0x0840, B:91:0x077a, B:93:0x078e, B:94:0x07b8, B:130:0x0a73, B:124:0x0a33, B:126:0x0a39, B:127:0x0a67), top: B:279:0x05f6, outer: #8, inners: #0, #4, #5, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x068d A[Catch: all -> 0x0b15, TRY_LEAVE, TryCatch #11 {all -> 0x0b15, blocks: (B:80:0x05f6, B:82:0x05fc, B:83:0x062f, B:85:0x063c, B:87:0x0645, B:88:0x0682, B:111:0x09d6, B:112:0x09da, B:114:0x09e0, B:116:0x09f6, B:119:0x0a03, B:121:0x0a06, B:128:0x0a6e, B:134:0x0aef, B:136:0x0af5, B:137:0x0af6, B:139:0x0af8, B:141:0x0aff, B:142:0x0b00, B:89:0x068d, B:101:0x084c, B:103:0x0852, B:104:0x088d, B:106:0x0934, B:107:0x097a, B:109:0x0990, B:110:0x09d0, B:144:0x0b02, B:146:0x0b09, B:147:0x0b0a, B:149:0x0b0c, B:151:0x0b13, B:152:0x0b14, B:96:0x07bf, B:98:0x07d3, B:99:0x0840, B:91:0x077a, B:93:0x078e, B:94:0x07b8, B:130:0x0a73, B:124:0x0a33, B:126:0x0a39, B:127:0x0a67), top: B:279:0x05f6, outer: #8, inners: #0, #4, #5, #12 }] */
    @Override // kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabz.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 51;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        setSessionImpl(zabzVar);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 1;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void write(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 113;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        onRemoveQueueItem(zabzVar);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 39;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void read(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        onSetShuffleMode(zabzVar);
        int i4 = AudioAttributesImplBaseParcelizer + 73;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(zabz zabzVar, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 71;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(zabzVar, str, bundle);
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 97;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 69;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {activityResult};
        int i4 = getClassId.AudioAttributesCompatParcelizer.read();
        int i5 = getClassId.AudioAttributesCompatParcelizer.read();
        int i6 = getClassId.AudioAttributesCompatParcelizer.read();
        int i7 = getClassId.AudioAttributesCompatParcelizer.read();
        if (i3 != 0) {
            RemoteActionCompatParcelizer(i4, objArr, i7, i6, i5, 1655315494, -1655315476);
        } else {
            RemoteActionCompatParcelizer(i4, objArr, i7, i6, i5, 1655315494, -1655315476);
            int i8 = 69 / 0;
        }
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 79;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        onRewind(zabzVar);
        int i4 = AudioAttributesImplBaseParcelizer + 17;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(zabz zabzVar) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, -401624866, 401624875);
    }

    public static /* synthetic */ void AudioAttributesImplApi21Parcelizer(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 121;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        onPrepareFromUri(zabzVar);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(String str, Bundle bundle) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, new Object[]{str, bundle}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 32860932, -32860922);
    }

    public static /* synthetic */ WindowInsetsCompat write(zabz zabzVar, boolean z, View view, WindowInsetsCompat windowInsetsCompat) {
        Object[] objArr = {zabzVar, Boolean.valueOf(z), view, windowInsetsCompat};
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        return (WindowInsetsCompat) RemoteActionCompatParcelizer(i, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, -855180761, 855180773);
    }

    public static /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 109;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = getClassId.AudioAttributesCompatParcelizer.read();
            int i4 = getClassId.AudioAttributesCompatParcelizer.read();
            RemoteActionCompatParcelizer(i3, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i4, -966334873, 966334875);
            return;
        }
        int i5 = getClassId.AudioAttributesCompatParcelizer.read();
        int i6 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i5, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i6, -966334873, 966334875);
        throw null;
    }

    public static /* synthetic */ void read(zabz zabzVar, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 9;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        write(zabzVar, str, bundle);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void MediaBrowserCompatItemReceiver(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 89;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ParcelableVolumeInfo(zabzVar);
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 101;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void AudioAttributesImplBaseParcelizer(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 39;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4(zabzVar);
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 5;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void AudioAttributesImplApi26Parcelizer(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 119;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int i4 = getClassId.AudioAttributesCompatParcelizer.read();
        int i5 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i4, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i5, -2084439097, 2084439111);
        int i6 = AudioAttributesImplBaseParcelizer + 5;
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void MediaBrowserCompatMediaItem(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 5;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(zabzVar);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 107;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void MediaBrowserCompatSearchResultReceiver(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 125;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int i4 = getClassId.AudioAttributesCompatParcelizer.read();
        int i5 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i4, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i5, 1774610563, -1774610555);
        int i6 = MediaBrowserCompatCustomActionResultReceiver + 115;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void MediaMetadataCompat(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 75;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        onSetCaptioningEnabled(zabzVar);
        int i4 = AudioAttributesImplBaseParcelizer + 43;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void RatingCompat(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 87;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        onSeekTo(zabzVar);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 45;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(zabz zabzVar, NetworkTypeObserverExternalSyntheticLambda0 networkTypeObserverExternalSyntheticLambda0) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        return (getShowPopup) RemoteActionCompatParcelizer(i, new Object[]{zabzVar, networkTypeObserverExternalSyntheticLambda0}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 1420088359, -1420088348);
    }

    public static /* synthetic */ void MediaDescriptionCompat(zabz zabzVar) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 1517023705, -1517023702);
    }

    public static /* synthetic */ void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 13;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        onSkipToPrevious(zabzVar);
        int i4 = AudioAttributesImplBaseParcelizer + 47;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onCommand(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 107;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ResultReceiver(zabzVar);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 103;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void handleMediaPlayPauseIfPendingOnHandler(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 101;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        onSetRepeatMode(zabzVar);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ GradientDrawable MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 41;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int i4 = getClassId.AudioAttributesCompatParcelizer.read();
        int i5 = getClassId.AudioAttributesCompatParcelizer.read();
        GradientDrawable gradientDrawable = (GradientDrawable) RemoteActionCompatParcelizer(i4, new Object[0], getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i5, -1533978462, 1533978481);
        int i6 = AudioAttributesImplBaseParcelizer + 57;
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        int i7 = i6 % 2;
        return gradientDrawable;
    }

    public static /* synthetic */ void onAddQueueItem(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 11;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        onSkipToNext(zabzVar);
        if (i3 == 0) {
            throw null;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 81;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
    }

    public static /* synthetic */ void onCustomAction(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 107;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        PlaybackStateCompat(zabzVar);
        int i4 = AudioAttributesImplBaseParcelizer + 125;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onPlayFromMediaId(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 97;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        MediaSessionCompatToken(zabzVar);
        int i4 = AudioAttributesImplBaseParcelizer + 93;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onMediaButtonEvent(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 7;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        MediaSessionCompatQueueItem(zabzVar);
        int i4 = AudioAttributesImplBaseParcelizer + 17;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onPause(zabz zabzVar) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 316961511, -316961495);
    }

    public static /* synthetic */ void onPlay(zabz zabzVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 111;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        PlaybackStateCompatCustomAction(zabzVar);
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(zabz zabzVar, float f) {
        Object[] objArr = {zabzVar, Float.valueOf(f)};
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, objArr, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 366129225, -366129219);
    }

    public static final /* synthetic */ void write(zabz zabzVar, List list) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, new Object[]{zabzVar, list}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, -589003791, 589003795);
    }

    public static final /* synthetic */ HomeSharedViewModel onPrepare(zabz zabzVar) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        return (HomeSharedViewModel) RemoteActionCompatParcelizer(i, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 608680917, -608680910);
    }

    public static final /* synthetic */ void onRemoveQueueItemAt(zabz zabzVar) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, -1291647684, 1291647684);
    }

    private final HomeSharedViewModel MediaBrowserCompatCustomActionResultReceiver() {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        return (HomeSharedViewModel) RemoteActionCompatParcelizer(i, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, -884567868, 884567885);
    }

    private final boolean handleMediaPlayPauseIfPendingOnHandler() {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        return ((Boolean) RemoteActionCompatParcelizer(i, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 91692388, -91692373)).booleanValue();
    }

    private static final void onSetRating(zabz zabzVar) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 1774610563, -1774610555);
    }

    private static final void onSetPlaybackSpeed(zabz zabzVar) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, -2084439097, 2084439111);
    }

    private static final void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(zabz zabzVar) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, new Object[]{zabzVar}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, -966334873, 966334875);
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int iAudioAttributesCompatParcelizer = parseMicroVideoOffsetFromDescription.AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer(i, new Object[]{this}, getClassId.AudioAttributesCompatParcelizer.read(), parseMicroVideoOffsetFromDescription.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, 84262528, -84262523);
    }

    private static final void write(ActivityResult activityResult) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, new Object[]{activityResult}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 1655315494, -1655315476);
    }

    private final void read(disambiguate4gAnd5gNsa disambiguate4gand5gnsa) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(i, new Object[]{this, disambiguate4gand5gnsa}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 774791317, -774791304);
    }

    private static final getShowPopup IconCompatParcelizer(zabz zabzVar, NetworkTypeObserverExternalSyntheticLambda0 networkTypeObserverExternalSyntheticLambda0) {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        return (getShowPopup) RemoteActionCompatParcelizer(i, new Object[]{zabzVar, networkTypeObserverExternalSyntheticLambda0}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, 967689038, -967689037);
    }

    private static final GradientDrawable onFastForward() {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        return (GradientDrawable) RemoteActionCompatParcelizer(i, new Object[0], getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i2, -1533978462, 1533978481);
    }

    @Override // kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 93;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplBaseParcelizer + 33;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 65;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        onSkipToQueueItem(zabzVar);
        if (i3 != 0) {
            return null;
        }
        int i4 = 45 / 0;
        return null;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 83;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        MediaSessionCompatResultReceiverWrapper(zabzVar);
        if (i3 == 0) {
            return null;
        }
        int i4 = 46 / 0;
        return null;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 19;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesCompatParcelizer(str, bundle);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 105;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        NetworkTypeObserverExternalSyntheticLambda0 networkTypeObserverExternalSyntheticLambda0 = (NetworkTypeObserverExternalSyntheticLambda0) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 81;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = getClassId.AudioAttributesCompatParcelizer.read();
            int i4 = getClassId.AudioAttributesCompatParcelizer.read();
            return (getShowPopup) RemoteActionCompatParcelizer(i3, new Object[]{zabzVar, networkTypeObserverExternalSyntheticLambda0}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i4, 967689038, -967689037);
        }
        int i5 = getClassId.AudioAttributesCompatParcelizer.read();
        int i6 = getClassId.AudioAttributesCompatParcelizer.read();
        getShowPopup getshowpopup = (getShowPopup) RemoteActionCompatParcelizer(i5, new Object[]{zabzVar, networkTypeObserverExternalSyntheticLambda0}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), i6, 967689038, -967689037);
        int i7 = 55 / 0;
        return getshowpopup;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        View view = (View) objArr[2];
        WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) objArr[3];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 33;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(zabzVar, zBooleanValue, view, windowInsetsCompat);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return windowInsetsCompatRemoteActionCompatParcelizer;
    }

    private static /* synthetic */ Object MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Object[] objArr) {
        zabz zabzVar = (zabz) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 89;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onStop(zabzVar);
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object handleMediaPlayPauseIfPendingOnHandler(Object[] objArr) {
        ActivityResult activityResult = (ActivityResult) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 21;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 39;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return null;
    }
}
