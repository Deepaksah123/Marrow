package kotlin;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.marrow.R;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivity;
import com.marrow.ui.activities.learn.video.LessonVideoActivity;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.home.HomeViewModelV2;
import com.marrow2.ui.home.ZenAreaViewModel;
import com.marrow2.ui.main.viewmodel.HomeSharedViewModel;
import java.util.List;
import kotlin.DataBufferRef;
import kotlin.GoogleApiClientBuilder;
import kotlin.Metadata;
import kotlin.ResolvableApiException;
import kotlin.SupportStreetViewPanoramaFragmentzzb;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.addAllowedCountryCodes;
import kotlin.addConnectionCallbacks;
import kotlin.createClientSettingsBuilder;
import kotlin.doWrite;
import kotlin.getAutofillClient;
import kotlin.getContextFeatureId;
import kotlin.getMethodTimingTelemetryEnabled;
import kotlin.getRemoteCreator;
import kotlin.makeGooglePlayServicesAvailable;
import kotlin.maybeSignOut;
import kotlin.onDataRangeMoved;
import kotlin.setTokenBinding;
import kotlin.withFieldVisibility;
import kotlin.zaac;
import kotlin.zzfl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020#H\u0002¢\u0006\u0004\b!\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u0004J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020)H\u0002¢\u0006\u0004\b!\u0010*J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u001b\u0010+J\u001d\u0010.\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u001fH\u0002¢\u0006\u0004\b.\u0010+J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\b\u001a\u000200H\u0002¢\u0006\u0004\b'\u00101J\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u0004J\u001f\u0010.\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\b\u001a\u00020 H\u0002¢\u0006\u0004\b.\u00103J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020 H\u0002¢\u0006\u0004\b!\u00104J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020 H\u0002¢\u0006\u0004\b.\u00104J\u000f\u00105\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010\u0004J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\b\u001a\u00020 H\u0002¢\u0006\u0004\b'\u00103J\u000f\u00107\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u0010\u0004J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020 H\u0002¢\u0006\u0004\b'\u00104J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020 H\u0002¢\u0006\u0004\b\u001b\u00104J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020 H\u0002¢\u0006\u0004\b\u0012\u00104J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u000208H\u0002¢\u0006\u0004\b\u0012\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u0004J\u000f\u0010;\u001a\u00020\u000eH\u0002¢\u0006\u0004\b;\u0010\u0004J\u000f\u0010<\u001a\u00020\u000eH\u0002¢\u0006\u0004\b<\u0010\u0004J\u000f\u0010=\u001a\u00020\u000eH\u0002¢\u0006\u0004\b=\u0010\u0004J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020>H\u0002¢\u0006\u0004\b!\u0010?J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020@H\u0016¢\u0006\u0004\b.\u0010AJ\r\u0010!\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0004R\u0018\u0010'\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010CR\u0014\u0010\u0012\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010ER$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020>\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010GR\u0011\u0010.\u001a\u00020B8G¢\u0006\u0006\u001a\u0004\b.\u0010HR\u001b\u0010!\u001a\u00020I8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bK\u0010LR\u001b\u0010\u0014\u001a\u00020M8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b5\u0010J\u001a\u0004\bN\u0010OR\u001b\u0010Q\u001a\u00020P8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\bN\u0010J\u001a\u0004\bQ\u0010RR\u0014\u0010K\u001a\u00020S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010TR\u0014\u0010N\u001a\u00020U8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010VR\u0014\u0010=\u001a\u00020W8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010XR\u0014\u0010:\u001a\u00020Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bQ\u0010ZR\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u0006*\u00020\\0\\0[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010]R\u001e\u00105\u001a\f\u0012\b\u0012\u0006*\u00020 0 0[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010]"}, d2 = {"Lo/makeGooglePlayServicesAvailable;", "Landroidx/fragment/app/Fragment;", "Lo/SignInButtonButtonSize;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPrepareFromMediaId", "write", "onResume", "MediaBrowserCompatItemReceiver", "onDestroyView", "MediaDescriptionCompat", "MediaMetadataCompat", "onPlayFromMediaId", "onPrepareFromSearch", "onMediaButtonEvent", "AudioAttributesCompatParcelizer", "RatingCompat", "onPlayFromSearch", "onAddQueueItem", "", "", "read", "(Z)Ljava/lang/String;", "Lo/getAllClients;", "(Lo/getAllClients;)V", "onPlay", "Lo/addConnectionCallbacks;", "IconCompatParcelizer", "(Lo/addConnectionCallbacks;)V", "Lo/addConnectionCallbacks$write;", "(Lo/addConnectionCallbacks$write;)V", "(Z)V", "", "Lo/getApiFallbackAttributionTag;", "RemoteActionCompatParcelizer", "(Ljava/util/List;)V", "", "(Ljava/lang/String;J)V", "handleMediaPlayPauseIfPendingOnHandler", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "MediaBrowserCompatMediaItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCustomAction", "Lo/setMapper;", "(Lo/setMapper;)V", "MediaBrowserCompatSearchResultReceiver", "onCommand", "onFastForward", "AudioAttributesImplBaseParcelizer", "", "(I)V", "Lo/getContextFeatureId;", "(Lo/getContextFeatureId;)V", "Lo/getNextSegmentHolder;", "Lo/getNextSegmentHolder;", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Lo/getSubscriptionExpiresOn;", "Lo/getSubscriptionExpiresOn;", "()Lo/getNextSegmentHolder;", "Lcom/marrow2/ui/home/HomeViewModelV2;", "Lo/RenewEligible;", "AudioAttributesImplApi26Parcelizer", "()Lcom/marrow2/ui/home/HomeViewModelV2;", "Lcom/marrow2/ui/home/ZenAreaViewModel;", "MediaBrowserCompatCustomActionResultReceiver", "()Lcom/marrow2/ui/home/ZenAreaViewModel;", "Lcom/marrow2/ui/main/viewmodel/HomeSharedViewModel;", "AudioAttributesImplApi21Parcelizer", "()Lcom/marrow2/ui/main/viewmodel/HomeSharedViewModel;", "Lo/queryPackageSignatureVerified;", "Lo/queryPackageSignatureVerified;", "Lo/isRepeatedCommand;", "Lo/isRepeatedCommand;", "Lo/setCaptionMode;", "Lo/setCaptionMode;", "Lo/isCtrlCode;", "Lo/isCtrlCode;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class makeGooglePlayServicesAvailable extends getErrorResolutionIntent implements SignInButtonButtonSize {
    private Pair<Boolean, Integer> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final isCtrlCode MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final isRepeatedCommand MediaBrowserCompatCustomActionResultReceiver;
    private final setCaptionMode AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final RenewEligible MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final RenewEligible read;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final Rect write = new Rect();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getNextSegmentHolder IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final queryPackageSignatureVerified AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: loaded from: classes3.dex */
    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[addApi.values().length];
            try {
                iArr[addApi.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[addApi.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[addApi.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
        }
    }

    public makeGooglePlayServicesAvailable() {
        makeGooglePlayServicesAvailable makegoogleplayservicesavailable = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass9(new AnonymousClass5(makegoogleplayservicesavailable)));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(HomeViewModelV2.class), new AnonymousClass8(renewEligibleWrite), new AnonymousClass7(renewEligibleWrite), new AnonymousClass10(makegoogleplayservicesavailable, renewEligibleWrite));
        RenewEligible renewEligibleWrite2 = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass15(new AnonymousClass11(makegoogleplayservicesavailable)));
        this.MediaBrowserCompatItemReceiver = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(ZenAreaViewModel.class), new AnonymousClass12(renewEligibleWrite2), new AnonymousClass13(renewEligibleWrite2), new AnonymousClass6(makegoogleplayservicesavailable, renewEligibleWrite2));
        this.AudioAttributesImplApi21Parcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(HomeSharedViewModel.class), new AnonymousClass2(makegoogleplayservicesavailable), new AnonymousClass1(makegoogleplayservicesavailable), new AnonymousClass3(makegoogleplayservicesavailable));
        this.AudioAttributesImplApi26Parcelizer = new queryPackageSignatureVerified(this, new getAnswerMap() { // from class: o.showErrorNotification
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return makeGooglePlayServicesAvailable.RemoteActionCompatParcelizer(this.write, ((Integer) obj).intValue());
            }
        });
        this.MediaBrowserCompatCustomActionResultReceiver = new onAddQueueItem();
        this.AudioAttributesImplBaseParcelizer = new handleMediaPlayPauseIfPendingOnHandler();
        this.MediaBrowserCompatSearchResultReceiver = new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.isPlayStorePossiblyUpdating
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                makeGooglePlayServicesAvailable.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.MediaMetadataCompat = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult2 = registerForActivityResult(new _init_lambda4.write(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.GooglePlayServicesManifestException
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                makeGooglePlayServicesAvailable.RemoteActionCompatParcelizer(this.write, (Boolean) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult2, "");
        this.MediaBrowserCompatMediaItem = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult2;
    }

    public final getNextSegmentHolder RemoteActionCompatParcelizer() {
        getNextSegmentHolder getnextsegmentholder = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getnextsegmentholder);
        return getnextsegmentholder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeViewModelV2 AudioAttributesImplApi26Parcelizer() {
        return (HomeViewModelV2) this.read.RemoteActionCompatParcelizer();
    }

    private final ZenAreaViewModel MediaBrowserCompatCustomActionResultReceiver() {
        return (ZenAreaViewModel) this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeSharedViewModel AudioAttributesImplApi21Parcelizer() {
        return (HomeSharedViewModel) this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(makeGooglePlayServicesAvailable makegoogleplayservicesavailable, int i) {
        makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer().write(new getContextFeatureId.onSetCaptioningEnabled(i > 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$11, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass11 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$read;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(Fragment fragment) {
            super(0);
            this.$read = fragment;
        }
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$15, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "RemoteActionCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass15 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "RemoteActionCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    public static final class onAddQueueItem extends isRepeatedCommand {
        onAddQueueItem() {
        }

        @Override // kotlin.isRepeatedCommand
        public final void RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.AudioAttributesCompatParcelizer.INSTANCE);
        }

        @Override // kotlin.isRepeatedCommand, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$12, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass12 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$13, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass13 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass6 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$read = renewEligible;
        }
    }

    public static final class handleMediaPlayPauseIfPendingOnHandler extends setCaptionMode {
        handleMediaPlayPauseIfPendingOnHandler() {
        }

        @Override // kotlin.setCaptionMode
        public final void read() {
            makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.AudioAttributesCompatParcelizer.INSTANCE);
        }

        @Override // kotlin.setCaptionMode, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends isCtrlCode {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            super(0, 1, null);
        }

        @Override // kotlin.isCtrlCode
        public final void read(int i) {
            makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().write(new getContextFeatureId.MediaBrowserCompatSearchResultReceiver(i));
        }

        @Override // kotlin.isCtrlCode
        public final void AudioAttributesCompatParcelizer(int i) {
            makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().write(new getContextFeatureId.onCommand(i));
        }

        @Override // kotlin.isCtrlCode
        public final void write(int i) {
            makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().write(new getContextFeatureId.MediaMetadataCompat(i));
        }

        @Override // kotlin.isCtrlCode, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(makeGooglePlayServicesAvailable makegoogleplayservicesavailable, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(makeGooglePlayServicesAvailable makegoogleplayservicesavailable, Boolean bool) {
        toMagicModuleMetaRepoModel.write(bool, "");
        if (bool.booleanValue()) {
            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer().write(new getContextFeatureId.MediaBrowserCompatMediaItem(bool.booleanValue()));
        } else {
            if (makegoogleplayservicesavailable.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                return;
            }
            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.RemoteActionCompatParcelizer.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.IconCompatParcelizer = getNextSegmentHolder.RemoteActionCompatParcelizer(p0, p1);
        ConstraintLayout constraintLayout = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        onPrepareFromMediaId();
        RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver.setTransitionName("zenContainer");
        RatingCompat();
        MediaMetadataCompat();
        MediaDescriptionCompat();
        onPlayFromMediaId();
        onMediaButtonEvent();
        write();
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$RemoteActionCompatParcelizer.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$IconCompatParcelizer.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$IconCompatParcelizer.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    private final void onPrepareFromMediaId() {
        getChildFragmentManager().IconCompatParcelizer(SmsRetrieverStatusCodes.RemoteActionCompatParcelizer.getWrite(), getViewLifecycleOwner(), new _addFields() { // from class: o.showErrorDialogFragment
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                makeGooglePlayServicesAvailable.write(this.IconCompatParcelizer, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(makeGooglePlayServicesAvailable makegoogleplayservicesavailable, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("positive_key_press")) {
            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.MediaDescriptionCompat.INSTANCE);
        }
    }

    private final void write() {
        AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.write.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new DataBufferRef.MediaBrowserCompatCustomActionResultReceiver(getApiOptions.RemoteActionCompatParcelizer));
        AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.AudioAttributesImplBaseParcelizer.INSTANCE);
        onFastForward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        View view;
        zabz zabzVar;
        if (!isAdded() || isHidden() || (view = getView()) == null || view.getVisibility() != 0) {
            return;
        }
        if (!(AudioAttributesImplApi26Parcelizer().MediaDescriptionCompat().IconCompatParcelizer() instanceof addConnectionCallbacks.write)) {
            if (AudioAttributesImplApi21Parcelizer().getAudioAttributesImplApi26Parcelizer()) {
                HomeSharedViewModel homeSharedViewModelAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
                maybeSignOut.write writeVar = maybeSignOut.read;
                homeSharedViewModelAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplBaseParcelizer(maybeSignOut.write.write()));
                onFastForward();
                return;
            }
            HomeSharedViewModel homeSharedViewModelAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer();
            maybeSignOut.write writeVar2 = maybeSignOut.read;
            homeSharedViewModelAudioAttributesImplApi21Parcelizer2.RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplBaseParcelizer(maybeSignOut.write.read()));
            return;
        }
        int i = read.read[AudioAttributesImplApi21Parcelizer().getMediaBrowserCompatCustomActionResultReceiver().ordinal()];
        if (i == 1) {
            HomeSharedViewModel homeSharedViewModelAudioAttributesImplApi21Parcelizer3 = AudioAttributesImplApi21Parcelizer();
            maybeSignOut.write writeVar3 = maybeSignOut.read;
            maybeGetTypeVariable maybegettypevariableRequireActivity = requireActivity();
            zabzVar = maybegettypevariableRequireActivity instanceof zabz ? (zabz) maybegettypevariableRequireActivity : null;
            homeSharedViewModelAudioAttributesImplApi21Parcelizer3.RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplBaseParcelizer(maybeSignOut.write.AudioAttributesCompatParcelizer(-(zabzVar != null ? zabzVar.MediaBrowserCompatMediaItem() : 0))));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new RenewEligibleCreator();
            }
            HomeSharedViewModel homeSharedViewModelAudioAttributesImplApi21Parcelizer4 = AudioAttributesImplApi21Parcelizer();
            maybeSignOut.write writeVar4 = maybeSignOut.read;
            maybeGetTypeVariable maybegettypevariableRequireActivity2 = requireActivity();
            zabzVar = maybegettypevariableRequireActivity2 instanceof zabz ? (zabz) maybegettypevariableRequireActivity2 : null;
            homeSharedViewModelAudioAttributesImplApi21Parcelizer4.RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplBaseParcelizer(maybeSignOut.write.IconCompatParcelizer(-(zabzVar != null ? zabzVar.MediaBrowserCompatMediaItem() : 0))));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.AudioAttributesCompatParcelizer = null;
        onPrepareFromSearch();
        RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.setOnScrollChangeListener((NestedScrollView.write) null);
        this.IconCompatParcelizer = null;
    }

    private final void MediaDescriptionCompat() {
        RemoteActionCompatParcelizer().MediaMetadataCompat.setAdapter(this.AudioAttributesImplApi26Parcelizer);
    }

    private final void MediaMetadataCompat() {
        RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.GooglePlayServicesMissingManifestValueException
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                makeGooglePlayServicesAvailable.onFastForward(this.read);
            }
        });
        RemoteActionCompatParcelizer().read.setOnClickListener(new View.OnClickListener() { // from class: o.setDefaultNotificationChannelId
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                makeGooglePlayServicesAvailable.onPlay(this.IconCompatParcelizer);
            }
        });
        RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.isGooglePlayServicesAvailable
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                makeGooglePlayServicesAvailable.onPrepareFromSearch(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFastForward(makeGooglePlayServicesAvailable makegoogleplayservicesavailable) {
        makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.onSeekTo.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlay(makeGooglePlayServicesAvailable makegoogleplayservicesavailable) {
        makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.onSetShuffleMode.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPrepareFromSearch(makeGooglePlayServicesAvailable makegoogleplayservicesavailable) {
        makegoogleplayservicesavailable.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.read(makegoogleplayservicesavailable.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.getChildAt(0).getHeight());
        MaterialCardView materialCardView = makegoogleplayservicesavailable.RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(materialCardView);
        makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer().write(new getContextFeatureId.onPrepareFromUri(true));
    }

    private final void onPlayFromMediaId() {
        getProvider getprovider = getProvider.getInstance(requireContext());
        isCtrlCode isctrlcode = this.MediaBrowserCompatSearchResultReceiver;
        getprovider.registerReceiver(isctrlcode, isctrlcode.AudioAttributesCompatParcelizer());
        getProvider getprovider2 = getProvider.getInstance(requireContext());
        setCaptionMode setcaptionmode = this.AudioAttributesImplBaseParcelizer;
        getprovider2.registerReceiver(setcaptionmode, setcaptionmode.AudioAttributesCompatParcelizer());
        getProvider getprovider3 = getProvider.getInstance(requireContext());
        isRepeatedCommand isrepeatedcommand = this.MediaBrowserCompatCustomActionResultReceiver;
        getprovider3.registerReceiver(isrepeatedcommand, isrepeatedcommand.AudioAttributesCompatParcelizer());
    }

    private final void onPrepareFromSearch() {
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private final void onMediaButtonEvent() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            ConstraintLayout constraintLayout = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, constraintLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer() {
        if (Build.VERSION.SDK_INT >= 33) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            if (CmcdConfigurationRequestConfig.write(contextRequireContext)) {
                return;
            }
            AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.read.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatus = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().read();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.RemoteActionCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Boolean) obj2).booleanValue());
                    }

                    private Object write(boolean z) {
                        Group group = makegoogleplayservicesavailable.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
                        Group group2 = group;
                        RecyclerView recyclerView = makegoogleplayservicesavailable.RemoteActionCompatParcelizer().MediaMetadataCompat;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
                        group2.setVisibility((recyclerView.getVisibility() == 0 && z) ? 0 : 8);
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return makeGooglePlayServicesAvailable.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        makeGooglePlayServicesAvailable makegoogleplayservicesavailable = this;
        setBitrateKbps.read(makegoogleplayservicesavailable, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new RatingCompat(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new MediaBrowserCompatMediaItem(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new MediaBrowserCompatSearchResultReceiver(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new MediaDescriptionCompat(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new MediaMetadataCompat(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new onCommand(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new onCustomAction(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new IconCompatParcelizer(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new MediaBrowserCompatCustomActionResultReceiver(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.read(makegoogleplayservicesavailable, new AudioAttributesImplApi26Parcelizer(null));
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<onDataRangeMoved> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi21Parcelizer().MediaBrowserCompatCustomActionResultReceiver();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.write = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.AudioAttributesImplBaseParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((onDataRangeMoved) obj2);
                    }

                    private Object write(onDataRangeMoved ondatarangemoved) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.write.INSTANCE)) {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.MediaBrowserCompatItemReceiver.INSTANCE);
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.IconCompatParcelizer.INSTANCE)) {
                            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.AudioAttributesCompatParcelizer.INSTANCE) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.RemoteActionCompatParcelizer.INSTANCE) && !(ondatarangemoved instanceof onDataRangeMoved.read)) {
                                throw new RenewEligibleCreator();
                            }
                            return getShowPopup.INSTANCE;
                        }
                        makegoogleplayservicesavailable.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(DataBufferRef.IconCompatParcelizer.INSTANCE);
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
            return makeGooglePlayServicesAvailable.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$RatingCompat$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements getValidationToken {
            private /* synthetic */ makeGooglePlayServicesAvailable AudioAttributesCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return IconCompatParcelizer((addConnectionCallbacks) obj);
            }

            private Object IconCompatParcelizer(addConnectionCallbacks addconnectioncallbacks) {
                this.AudioAttributesCompatParcelizer.onPlay();
                if (addconnectioncallbacks != null) {
                    final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = this.AudioAttributesCompatParcelizer;
                    makegoogleplayservicesavailable.IconCompatParcelizer(addconnectioncallbacks);
                    if (addconnectioncallbacks instanceof addConnectionCallbacks.write) {
                        makegoogleplayservicesavailable.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.GooglePlayServicesNotAvailableException
                            @Override // android.view.View.OnScrollChangeListener
                            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                                makeGooglePlayServicesAvailable.RatingCompat.AnonymousClass2.write(makegoogleplayservicesavailable, i2);
                            }
                        });
                    } else if (addconnectioncallbacks instanceof addConnectionCallbacks.AudioAttributesCompatParcelizer) {
                        makegoogleplayservicesavailable.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.GooglePlayServicesRepairableException
                            @Override // android.view.View.OnScrollChangeListener
                            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                                makeGooglePlayServicesAvailable.RatingCompat.AnonymousClass2.RemoteActionCompatParcelizer(makegoogleplayservicesavailable, i2);
                            }
                        });
                    }
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void write(makeGooglePlayServicesAvailable makegoogleplayservicesavailable, int i) {
                makegoogleplayservicesavailable.read(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void RemoteActionCompatParcelizer(makeGooglePlayServicesAvailable makegoogleplayservicesavailable, int i) {
                makegoogleplayservicesavailable.read(i);
            }

            AnonymousClass2(makeGooglePlayServicesAvailable makegoogleplayservicesavailable) {
                this.AudioAttributesCompatParcelizer = makegoogleplayservicesavailable;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().MediaDescriptionCompat().write(new AnonymousClass2(makeGooglePlayServicesAvailable.this), this) == objIconCompatParcelizer) {
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

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return makeGooglePlayServicesAvailable.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<CourseConfigV2.HomePageItems>> setupdatedstatusAudioAttributesCompatParcelizer = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.MediaBrowserCompatMediaItem.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((List) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(List<? extends CourseConfigV2.HomePageItems> list) {
                        if (list != null) {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(list);
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

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return makeGooglePlayServicesAvailable.this.new MediaBrowserCompatMediaItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<hasApi> setupdatedstatusAudioAttributesImplApi21Parcelizer = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().AudioAttributesImplApi21Parcelizer();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.MediaBrowserCompatSearchResultReceiver.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((hasApi) obj2);
                    }

                    private Object write(hasApi hasapi) {
                        if (hasapi.getIconCompatParcelizer()) {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.write(hasapi);
                        } else {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(hasapi);
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

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return makeGooglePlayServicesAvailable.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class MediaDescriptionCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<isConnectionCallbacksRegistered> setupdatedstatusMediaMetadataCompat = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().MediaMetadataCompat();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.write = 1;
                if (setupdatedstatusMediaMetadataCompat.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.MediaDescriptionCompat.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((isConnectionCallbacksRegistered) obj2);
                    }

                    private Object read(isConnectionCallbacksRegistered isconnectioncallbacksregistered) {
                        if (isconnectioncallbacksregistered.getWrite()) {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.write(isconnectioncallbacksregistered);
                        } else {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(isconnectioncallbacksregistered);
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

        MediaDescriptionCompat(SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return makeGooglePlayServicesAvailable.this.new MediaDescriptionCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaDescriptionCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class MediaMetadataCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<maybeSignIn> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatCustomActionResultReceiver();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.MediaMetadataCompat.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((maybeSignIn) obj2);
                    }

                    private Object IconCompatParcelizer(maybeSignIn maybesignin) {
                        if (maybesignin.getRemoteActionCompatParcelizer().length() == 0) {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(maybesignin);
                        } else {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.write(maybesignin);
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

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return makeGooglePlayServicesAvailable.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class onCommand extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<zap> setupdatedstatusMediaBrowserCompatMediaItem = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatMediaItem();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatMediaItem.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.onCommand.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((zap) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(zap zapVar) {
                        if (zapVar.getRead().length() > 0) {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.write(zapVar);
                        } else {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(zapVar);
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

        onCommand(SampleVideos<? super onCommand> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return makeGooglePlayServicesAvailable.this.new onCommand(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCommand) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class onCustomAction extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<registerConnectionFailedListener> setupdatedstatusMediaBrowserCompatSearchResultReceiver = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatSearchResultReceiver();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatSearchResultReceiver.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.onCustomAction.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((registerConnectionFailedListener) obj2);
                    }

                    private Object write(registerConnectionFailedListener registerconnectionfailedlistener) {
                        if (!registerconnectionfailedlistener.AudioAttributesCompatParcelizer().isEmpty()) {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.write(registerconnectionfailedlistener);
                        } else {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(registerconnectionfailedlistener);
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

        onCustomAction(SampleVideos<? super onCustomAction> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return makeGooglePlayServicesAvailable.this.new onCustomAction(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCustomAction) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<getApiFallbackAttributionTag>> setupdatedstatusIconCompatParcelizer = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.IconCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((List) obj2);
                    }

                    private Object IconCompatParcelizer(List<? extends getApiFallbackAttributionTag> list) {
                        makegoogleplayservicesavailable.RemoteActionCompatParcelizer(list);
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
            return makeGooglePlayServicesAvailable.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<Boolean> setupdatedstatusOnAddQueueItem = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().onAddQueueItem();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusOnAddQueueItem.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.AudioAttributesCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        makegoogleplayservicesavailable.RemoteActionCompatParcelizer(z);
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
            return makeGooglePlayServicesAvailable.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getAllClients> setupdatedstatusMediaBrowserCompatItemReceiver = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatItemReceiver();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.MediaBrowserCompatItemReceiver.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((getAllClients) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(getAllClients getallclients) {
                        if (getallclients.getAudioAttributesCompatParcelizer() == -1) {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(getallclients);
                        } else {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.write(getallclients);
                            makegoogleplayservicesavailable.read(getallclients);
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return makeGooglePlayServicesAvailable.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<clearDefaultAccountAndReconnect> setupdatedstatusAudioAttributesImplApi26Parcelizer = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().AudioAttributesImplApi26Parcelizer();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.MediaBrowserCompatCustomActionResultReceiver.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((clearDefaultAccountAndReconnect) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(clearDefaultAccountAndReconnect cleardefaultaccountandreconnect) {
                        if (cleardefaultaccountandreconnect.getRead()) {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.write(cleardefaultaccountandreconnect);
                        } else {
                            makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(cleardefaultaccountandreconnect);
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

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return makeGooglePlayServicesAvailable.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusRatingCompat = makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().RatingCompat();
                final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = makeGooglePlayServicesAvailable.this;
                this.write = 1;
                if (setupdatedstatusRatingCompat.write(new getValidationToken() { // from class: o.makeGooglePlayServicesAvailable.AudioAttributesImplApi21Parcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Boolean) obj2).booleanValue());
                    }

                    private Object write(boolean z) {
                        if (z) {
                            MaterialCardView materialCardView = makegoogleplayservicesavailable.RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(materialCardView);
                        } else {
                            MaterialCardView materialCardView2 = makegoogleplayservicesavailable.RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(materialCardView2);
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
            return makeGooglePlayServicesAvailable.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX INFO: renamed from: o.makeGooglePlayServicesAvailable$AudioAttributesImplApi26Parcelizer$4, reason: invalid class name */
        static final class AnonymousClass4<T> implements getValidationToken {
            private /* synthetic */ makeGooglePlayServicesAvailable read;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return read((doWrite) obj);
            }

            private Object read(doWrite dowrite) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dowrite, doWrite.read.INSTANCE)) {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dowrite, doWrite.MediaBrowserCompatItemReceiver.INSTANCE)) {
                        this.read.MediaBrowserCompatMediaItem();
                    } else if (dowrite instanceof doWrite.MediaBrowserCompatCustomActionResultReceiver) {
                        doWrite.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (doWrite.MediaBrowserCompatCustomActionResultReceiver) dowrite;
                        this.read.IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(), mediaBrowserCompatCustomActionResultReceiver.write());
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dowrite, doWrite.MediaMetadataCompat.INSTANCE)) {
                        this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dowrite, doWrite.MediaBrowserCompatMediaItem.INSTANCE)) {
                        this.read.onCustomAction();
                    } else if (dowrite instanceof doWrite.MediaDescriptionCompat) {
                        this.read.IconCompatParcelizer(((doWrite.MediaDescriptionCompat) dowrite).RemoteActionCompatParcelizer());
                    } else if (dowrite instanceof doWrite.handleMediaPlayPauseIfPendingOnHandler) {
                        this.read.AudioAttributesCompatParcelizer(((doWrite.handleMediaPlayPauseIfPendingOnHandler) dowrite).IconCompatParcelizer());
                    } else if (dowrite instanceof doWrite.write) {
                        doWrite.write writeVar = (doWrite.write) dowrite;
                        this.read.RemoteActionCompatParcelizer(writeVar.read(), writeVar.RemoteActionCompatParcelizer());
                    } else if (dowrite instanceof doWrite.AudioAttributesImplBaseParcelizer) {
                        doWrite.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (doWrite.AudioAttributesImplBaseParcelizer) dowrite;
                        this.read.IconCompatParcelizer(audioAttributesImplBaseParcelizer.write(), audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
                    } else if (dowrite instanceof doWrite.onCustomAction) {
                        this.read.RemoteActionCompatParcelizer(((doWrite.onCustomAction) dowrite).write());
                    } else if (dowrite instanceof doWrite.AudioAttributesImplApi21Parcelizer) {
                        this.read.read(((doWrite.AudioAttributesImplApi21Parcelizer) dowrite).write());
                    } else if (dowrite instanceof doWrite.RatingCompat) {
                        this.read.write(((doWrite.RatingCompat) dowrite).IconCompatParcelizer());
                    } else if (dowrite instanceof doWrite.AudioAttributesCompatParcelizer) {
                        this.read.write(((doWrite.AudioAttributesCompatParcelizer) dowrite).write());
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dowrite, doWrite.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                        this.read.MediaBrowserCompatSearchResultReceiver();
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dowrite, doWrite.onAddQueueItem.INSTANCE)) {
                        this.read.onCommand();
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dowrite, doWrite.RemoteActionCompatParcelizer.INSTANCE)) {
                        this.read.AudioAttributesCompatParcelizer();
                    } else if (dowrite instanceof doWrite.onCommand) {
                        if (((doWrite.onCommand) dowrite).AudioAttributesCompatParcelizer() && Build.VERSION.SDK_INT >= 33) {
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer((r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String>) this.read.MediaBrowserCompatMediaItem);
                        }
                    } else if (dowrite instanceof doWrite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                        doWrite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (doWrite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) dowrite;
                        if (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer()) {
                            Snackbar snackbarAudioAttributesImplApi21Parcelizer = Snackbar.IconCompatParcelizer(this.read.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer, this.read.read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read()), -1).IconCompatParcelizer(_isNaN.getColor(this.read.requireContext(), R.color.colorPrimary)).AudioAttributesImplBaseParcelizer(_isNaN.getColor(this.read.requireContext(), R.color.go_pro_80bg)).AudioAttributesImplApi21Parcelizer(_isNaN.getColor(this.read.requireContext(), R.color.white));
                            final makeGooglePlayServicesAvailable makegoogleplayservicesavailable = this.read;
                            Snackbar snackbar = snackbarAudioAttributesImplApi21Parcelizer.IconCompatParcelizer(R.string.enable, new View.OnClickListener() { // from class: o.getExpectedVersion
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    makeGooglePlayServicesAvailable.AudioAttributesImplApi26Parcelizer.AnonymousClass4.AudioAttributesCompatParcelizer(makegoogleplayservicesavailable);
                                }
                            }).read(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer());
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(snackbar, "");
                            snackbar.AudioAttributesImplApi21Parcelizer();
                        }
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dowrite, doWrite.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
                        this.read.handleMediaPlayPauseIfPendingOnHandler();
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(dowrite, doWrite.IconCompatParcelizer.INSTANCE)) {
                        this.read.MediaBrowserCompatItemReceiver();
                    } else if (dowrite instanceof doWrite.onFastForward) {
                        this.read.onPlayFromSearch();
                    } else {
                        throw new RenewEligibleCreator();
                    }
                }
                this.read.AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.IconCompatParcelizer.INSTANCE);
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void AudioAttributesCompatParcelizer(makeGooglePlayServicesAvailable makegoogleplayservicesavailable) {
                makegoogleplayservicesavailable.onAddQueueItem();
            }

            AnonymousClass4(makeGooglePlayServicesAvailable makegoogleplayservicesavailable) {
                this.read = makegoogleplayservicesavailable;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (makeGooglePlayServicesAvailable.this.AudioAttributesImplApi26Parcelizer().AudioAttributesImplBaseParcelizer().write(new AnonymousClass4(makeGooglePlayServicesAvailable.this), this) == objIconCompatParcelizer) {
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
            return makeGooglePlayServicesAvailable.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlayFromSearch() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.video_for_paid_user);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.view_plans);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.go_back);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, string, string2, string3, 0, SmsRetrieverStatusCodes.RemoteActionCompatParcelizer, false, false, null, 465).show(getChildFragmentManager(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddQueueItem() {
        AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.RatingCompat.INSTANCE);
        Intent intentPutExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", requireContext().getPackageName());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intentPutExtra, "");
        startActivity(intentPutExtra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String read(boolean p0) {
        if (p0) {
            String string = getString(R.string.enable_notification_permission_in_settings);
            toMagicModuleMetaRepoModel.write((Object) string);
            return string;
        }
        String string2 = getString(R.string.home_general_enable_notification_permission_in_settings);
        toMagicModuleMetaRepoModel.write((Object) string2);
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(final getAllClients p0) {
        if (p0.getWrite()) {
            RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.setOnScrollChangeListener(new NestedScrollView.write() { // from class: o.getApkVersion
                @Override // androidx.core.widget.NestedScrollView.write
                public final void read(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                    makeGooglePlayServicesAvailable.RemoteActionCompatParcelizer(this.IconCompatParcelizer, p0, nestedScrollView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(makeGooglePlayServicesAvailable makegoogleplayservicesavailable, getAllClients getallclients, NestedScrollView nestedScrollView) {
        toMagicModuleMetaRepoModel.write(nestedScrollView, "");
        Integer num = (Integer) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(getallclients));
        if (num != null) {
            int iIntValue = num.intValue();
            RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = makegoogleplayservicesavailable.RemoteActionCompatParcelizer().MediaMetadataCompat.AudioAttributesImplApi21Parcelizer();
            LinearLayoutManager linearLayoutManager = mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer instanceof LinearLayoutManager ? (LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer : null;
            View viewWrite = linearLayoutManager != null ? linearLayoutManager.write(iIntValue) : null;
            if (viewWrite != null) {
                Rect rect = new Rect();
                if (viewWrite.getGlobalVisibleRect(rect) && viewWrite.getHeight() == rect.height()) {
                    makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer().write(new getContextFeatureId.onPrepareFromUri(false));
                    makegoogleplayservicesavailable.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.setOnScrollChangeListener((NestedScrollView.write) null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlay() {
        ConstraintLayout constraintLayout = RemoteActionCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout);
        ComposeView composeView = RemoteActionCompatParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(composeView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(composeView);
        Group group = RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(group);
        Group group2 = RemoteActionCompatParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(group2);
        ProgressBar progressBar = RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
        TextView textView = RemoteActionCompatParcelizer().MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        TextView textView2 = RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView2);
        ConstraintLayout constraintLayoutWrite = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutWrite, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayoutWrite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(addConnectionCallbacks p0) {
        boolean z = p0 instanceof addConnectionCallbacks.AudioAttributesCompatParcelizer;
        AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplApi21Parcelizer(z));
        if (p0 instanceof addConnectionCallbacks.RemoteActionCompatParcelizer) {
            addConnectionCallbacks.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (addConnectionCallbacks.RemoteActionCompatParcelizer) p0;
            CharSequence quantityText = getResources().getQuantityText(R.plurals.module_completed, remoteActionCompatParcelizer.write());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(quantityText, "");
            RemoteActionCompatParcelizer().MediaDescriptionCompat.setText(quantityText);
            RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem.setText(String.valueOf(remoteActionCompatParcelizer.write()));
            ProgressBar progressBar = RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
            TextView textView = RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView);
            TextView textView2 = RemoteActionCompatParcelizer().MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
            Group group = RemoteActionCompatParcelizer().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
            group.setVisibility(remoteActionCompatParcelizer.read() ? 0 : 8);
            Group group2 = RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(group2);
            return;
        }
        if (p0 instanceof addConnectionCallbacks.write) {
            read((addConnectionCallbacks.write) p0);
        } else {
            if (!z) {
                throw new RenewEligibleCreator();
            }
            AudioAttributesCompatParcelizer(((addConnectionCallbacks.AudioAttributesCompatParcelizer) p0).write());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void read(o.addConnectionCallbacks.write r7) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.makeGooglePlayServicesAvailable.read(o.addConnectionCallbacks$write):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayFromSearch(makeGooglePlayServicesAvailable makegoogleplayservicesavailable) {
        makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.onPrepareFromMediaId.INSTANCE);
    }

    private final void AudioAttributesCompatParcelizer(final boolean p0) {
        _verifyEndArrayForSingle _verifyendarrayforsingle;
        maybeGetTypeVariable maybegettypevariableRequireActivity = requireActivity();
        zabz zabzVar = maybegettypevariableRequireActivity instanceof zabz ? (zabz) maybegettypevariableRequireActivity : null;
        final int i = 0;
        int iMediaBrowserCompatMediaItem = zabzVar != null ? zabzVar.MediaBrowserCompatMediaItem() : 0;
        WindowInsetsCompat windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler = InvalidTypeIdException.handleMediaPlayPauseIfPendingOnHandler(RemoteActionCompatParcelizer().IconCompatParcelizer());
        if (windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler != null && (_verifyendarrayforsingle = windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver())) != null) {
            i = _verifyendarrayforsingle.write;
        }
        MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(GoogleApiClientBuilder.AudioAttributesCompatParcelizer.INSTANCE);
        AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplApi21Parcelizer(true));
        HomeSharedViewModel homeSharedViewModelAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        maybeSignOut.write writeVar = maybeSignOut.read;
        homeSharedViewModelAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplBaseParcelizer(maybeSignOut.write.write()));
        ComposeView composeView = RemoteActionCompatParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(composeView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(composeView);
        Pair<Boolean, Integer> pairWrite = setAction.write(Boolean.valueOf(p0), Integer.valueOf(iMediaBrowserCompatMediaItem + i));
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, pairWrite)) {
            return;
        }
        this.AudioAttributesCompatParcelizer = pairWrite;
        RemoteActionCompatParcelizer().write.setContent(multiplyFft.IconCompatParcelizer(1137051700, true, new MagicModuleSubmissionRequestBody() { // from class: o.GoogleApiAvailabilityLight
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return makeGooglePlayServicesAvailable.AudioAttributesCompatParcelizer(p0, this, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final boolean z, final makeGooglePlayServicesAvailable makegoogleplayservicesavailable, final int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1137051700, i2, -1, "com.marrow2.ui.home.HomeFragmentV2.renderNewZenArea.<anonymous> (HomeFragmentV2.kt:767)");
            }
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(-693648716, true, new MagicModuleSubmissionRequestBody() { // from class: o.cancelAvailabilityErrorNotifications
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return makeGooglePlayServicesAvailable.write(z, makegoogleplayservicesavailable, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(boolean z, makeGooglePlayServicesAvailable makegoogleplayservicesavailable, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-693648716, i2, -1, "com.marrow2.ui.home.HomeFragmentV2.renderNewZenArea.<anonymous>.<anonymous> (HomeFragmentV2.kt:768)");
            }
            BatchBuilder.RemoteActionCompatParcelizer(z, makegoogleplayservicesavailable.MediaBrowserCompatCustomActionResultReceiver(), ((bufferMapProperty) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.IconCompatParcelizer())).b_(i), (_handleOddName) null, _handleunrecognizedcharacterescape, 0, 8);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(List<? extends getApiFallbackAttributionTag> p0) {
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(boolean p0) {
        RecyclerView recyclerView = RemoteActionCompatParcelizer().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        recyclerView.setVisibility(!p0 ? 0 : 8);
        ShimmerFrameLayout shimmerFrameLayout = RemoteActionCompatParcelizer().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(shimmerFrameLayout, "");
        shimmerFrameLayout.setVisibility(p0 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(final String p0, final long p1) {
        createClientSettingsBuilder.Companion remoteActionCompatParcelizer = createClientSettingsBuilder.INSTANCE;
        createClientSettingsBuilder createclientsettingsbuilder = createClientSettingsBuilder.Companion.read(p1);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        doRegisterEventListener.IconCompatParcelizer(createclientsettingsbuilder, childFragmentManager, new getCreatedOnDateMs() { // from class: o.isPlayServicesPossiblyUpdating
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return makeGooglePlayServicesAvailable.write(this.IconCompatParcelizer, p0, p1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(makeGooglePlayServicesAvailable makegoogleplayservicesavailable, String str, long j) {
        Toast.makeText(makegoogleplayservicesavailable.requireContext(), makegoogleplayservicesavailable.getString(R.string.label_home_notified), 0).show();
        HomeViewModelV2 homeViewModelV2AudioAttributesImplApi26Parcelizer = makegoogleplayservicesavailable.AudioAttributesImplApi26Parcelizer();
        String string = makegoogleplayservicesavailable.getString(R.string.live_vid_notify_home_tab);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        homeViewModelV2AudioAttributesImplApi26Parcelizer.write(new getContextFeatureId.onPlayFromSearch(str, string, j));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        ConstraintLayout constraintLayout = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.read(constraintLayout, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.isUserResolvableError
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return makeGooglePlayServicesAvailable.onPlayFromUri(this.AudioAttributesCompatParcelizer);
            }
        });
        LinearLayout linearLayout = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.read(linearLayout, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.isUninstalledAppPossiblyUpdating
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return makeGooglePlayServicesAvailable.onPrepare(this.write);
            }
        });
        final List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(Integer.valueOf(RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver.getId()));
        RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.IconCompatParcelizer.postDelayed(new Runnable() { // from class: o.GooglePlayServicesIncorrectManifestValueException
            @Override // java.lang.Runnable
            public final void run() {
                makeGooglePlayServicesAvailable.write(this.AudioAttributesCompatParcelizer, listRemoteActionCompatParcelizer);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromUri(makeGooglePlayServicesAvailable makegoogleplayservicesavailable) {
        makegoogleplayservicesavailable.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.animate().translationY(700.0f).alpha(BitmapDescriptorFactory.HUE_RED).setDuration(100L).start();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepare(makeGooglePlayServicesAvailable makegoogleplayservicesavailable) {
        makegoogleplayservicesavailable.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.IconCompatParcelizer.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(100L).start();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(makeGooglePlayServicesAvailable makegoogleplayservicesavailable, List list) {
        makegoogleplayservicesavailable.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new DataBufferRef.RemoteActionCompatParcelizer(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0, String p1) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(p0));
        intent.addFlags(268435456);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            AudioAttributesImplApi26Parcelizer().write(new getContextFeatureId.onAddQueueItem(p0, p1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0) {
        ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(ResolvableApiException.Companion.read(contextRequireContext, new canceledPendingResult(p0, null, null, 6, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(p0));
            intent.putExtra("force_fullscreen", true);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem() {
        getRemoteCreator.Companion readVar = getRemoteCreator.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(getRemoteCreator.Companion.read(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (getTrackName.write(requireContext())) {
            zzfl.Companion companion = zzfl.INSTANCE;
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            startActivity(zzfl.Companion.AudioAttributesCompatParcelizer(contextRequireContext, ""));
            return;
        }
        makeGooglePlayServicesAvailable makegoogleplayservicesavailable = this;
        String string = getString(R.string.app_error_no_internet);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(makegoogleplayservicesavailable, string, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0, String p1) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.MediaMetadataCompat;
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext, p0, p1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomAction() {
        if (getTrackName.write(requireContext())) {
            SupportStreetViewPanoramaFragmentzzb.Companion iconCompatParcelizer = SupportStreetViewPanoramaFragmentzzb.INSTANCE;
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            startActivity(SupportStreetViewPanoramaFragmentzzb.Companion.read(contextRequireContext));
            return;
        }
        makeGooglePlayServicesAvailable makegoogleplayservicesavailable = this;
        String string = getString(R.string.no_internet_message_share);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(makegoogleplayservicesavailable, string, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0) {
        setTokenBinding.Companion readVar = setTokenBinding.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        this.MediaMetadataCompat.read(setTokenBinding.Companion.IconCompatParcelizer(contextRequireContext, p0, 2, "suggested_home"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(String p0) {
        LessonVideoActivity.Companion companion = LessonVideoActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(LessonVideoActivity.Companion.RemoteActionCompatParcelizer(contextRequireContext, p0, 0, false, 28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String p0) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.MediaMetadataCompat;
        addAllowedCountryCodes.Companion companion = addAllowedCountryCodes.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(addAllowedCountryCodes.Companion.read(contextRequireContext, p0, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(setMapper p0) {
        getMethodTimingTelemetryEnabled.Companion audioAttributesCompatParcelizer = getMethodTimingTelemetryEnabled.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String strWrite = p0.write();
        String strMediaBrowserCompatItemReceiver = p0.MediaBrowserCompatItemReceiver();
        String strRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
        String string = getString(R.string.f_module_info, p0.AudioAttributesImplApi26Parcelizer(), Integer.valueOf(p0.read()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        startActivity(getMethodTimingTelemetryEnabled.Companion.write(contextRequireContext, new getExtraArgs(strMediaBrowserCompatItemReceiver, strWrite, strRemoteActionCompatParcelizer, string, p0.AudioAttributesImplApi21Parcelizer(), p0.IconCompatParcelizer())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatSearchResultReceiver() {
        AudioAttributesImplApi26Parcelizer().write(new getContextFeatureId.onPrepareFromUri(false));
        MaterialCardView materialCardView = RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(materialCardView);
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.MediaMetadataCompat;
        zaac.Companion companion = zaac.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(zaac.Companion.RemoteActionCompatParcelizer(contextRequireContext, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCommand() {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.MediaMetadataCompat;
        UpgradePlanActivity.Companion writeVar = UpgradePlanActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(UpgradePlanActivity.Companion.AudioAttributesCompatParcelizer(contextRequireContext, "home_screen"));
    }

    private final void onFastForward() {
        View view;
        if (!AudioAttributesImplApi21Parcelizer().getAudioAttributesImplApi26Parcelizer() || isHidden() || (view = getView()) == null || view.getVisibility() != 0) {
            return;
        }
        ComposeView composeView = RemoteActionCompatParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(composeView, "");
        final ComposeView composeView2 = composeView;
        childArray.RemoteActionCompatParcelizer(composeView2, new Runnable() { // from class: o.makeGooglePlayServicesAvailable.4
            @Override // java.lang.Runnable
            public final void run() {
                if (this.IconCompatParcelizer != null) {
                    this.AudioAttributesImplBaseParcelizer();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplBaseParcelizer() {
        float fHeight;
        addApi addapi;
        int height = RemoteActionCompatParcelizer().write.getHeight();
        if (RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.getScrollY() == 0) {
            fHeight = 1.0f;
        } else {
            fHeight = (height <= 0 || !RemoteActionCompatParcelizer().write.getGlobalVisibleRect(this.write)) ? 0.0f : this.write.height() / height;
        }
        AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new DataBufferRef.MediaDescriptionCompat(getQues.read((0.5f - fHeight) / 0.25f, BitmapDescriptorFactory.HUE_RED, 1.0f)));
        if (AudioAttributesImplApi21Parcelizer().getMediaBrowserCompatCustomActionResultReceiver() != addApi.write ? fHeight > 0.25f : fHeight > 0.35f) {
            addapi = addApi.read;
        } else {
            addapi = addApi.write;
        }
        if (AudioAttributesImplApi21Parcelizer().getMediaBrowserCompatCustomActionResultReceiver() == addapi) {
            return;
        }
        AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new DataBufferRef.MediaMetadataCompat(addapi));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(int p0) {
        ViewGroup viewGroupWrite;
        String str;
        boolean z = AudioAttributesImplApi26Parcelizer().MediaDescriptionCompat().IconCompatParcelizer() instanceof addConnectionCallbacks.AudioAttributesCompatParcelizer;
        if (z) {
            AudioAttributesImplBaseParcelizer();
            return;
        }
        maybeGetTypeVariable maybegettypevariableRequireActivity = requireActivity();
        zabz zabzVar = maybegettypevariableRequireActivity instanceof zabz ? (zabz) maybegettypevariableRequireActivity : null;
        int i = -(zabzVar != null ? zabzVar.MediaBrowserCompatMediaItem() : 0);
        maybeSignOut.write writeVar = maybeSignOut.read;
        maybeSignOut maybesignoutAudioAttributesCompatParcelizer = maybeSignOut.write.AudioAttributesCompatParcelizer(i);
        maybeSignOut.write writeVar2 = maybeSignOut.read;
        maybeSignOut maybesignoutIconCompatParcelizer = maybeSignOut.write.IconCompatParcelizer(i);
        if (p0 == 0) {
            if (AudioAttributesImplApi21Parcelizer().getMediaBrowserCompatCustomActionResultReceiver() != addApi.read) {
                AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new DataBufferRef.MediaMetadataCompat(addApi.read));
                AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplBaseParcelizer(maybesignoutAudioAttributesCompatParcelizer));
                return;
            }
            return;
        }
        if (z) {
            viewGroupWrite = RemoteActionCompatParcelizer().write;
            str = "ed8Zen";
        } else {
            viewGroupWrite = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
            str = "getRoot(...)";
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewGroupWrite, str);
        int top = viewGroupWrite.getTop();
        Integer numAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi21Parcelizer().getMediaBrowserCompatItemReceiver();
        if (p0 + top >= (numAudioAttributesImplApi26Parcelizer != null ? numAudioAttributesImplApi26Parcelizer.intValue() : 0)) {
            if (AudioAttributesImplApi21Parcelizer().getMediaBrowserCompatCustomActionResultReceiver() != addApi.write) {
                AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new DataBufferRef.MediaMetadataCompat(addApi.write));
                AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplBaseParcelizer(maybesignoutIconCompatParcelizer));
                return;
            }
            return;
        }
        if (AudioAttributesImplApi21Parcelizer().getMediaBrowserCompatCustomActionResultReceiver() != addApi.IconCompatParcelizer) {
            AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new DataBufferRef.MediaMetadataCompat(addApi.IconCompatParcelizer));
        }
    }

    @Override // kotlin.SignInButtonButtonSize
    public final void RemoteActionCompatParcelizer(getContextFeatureId p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesImplApi26Parcelizer().write(p0);
    }

    public final void read() {
        AudioAttributesImplApi26Parcelizer().write(getContextFeatureId.AudioAttributesImplApi26Parcelizer.INSTANCE);
    }
}
