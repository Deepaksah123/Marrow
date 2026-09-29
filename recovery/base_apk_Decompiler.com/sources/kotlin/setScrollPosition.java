package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow.ui.activities.learn.video.LessonVideoActivity;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.main.viewmodel.HomeSharedViewModel;
import com.marrow2.ui.video.landing.VideoLandingViewModel;
import com.marrow2.ui.video.landing.epoxy_rv.VideoSubjectsModelController;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.IntegrityManager;
import kotlin.IntegrityManagerFactory;
import kotlin.Metadata;
import kotlin.ResolvableApiException;
import kotlin.TransformationChildCard;
import kotlin.VisibilityChecker;
import kotlin.ah;
import kotlin.getAutofillClient;
import kotlin.getSubMeshCount;
import kotlin.setCursorVisible;
import kotlin.setExpandedHintEnabled;
import kotlin.setPasswordVisibilityToggleDrawable;
import kotlin.setRatingTags;
import kotlin.setScrollPosition;
import kotlin.setThumbRadius;
import kotlin.shouldEscapeCharacter;
import kotlin.toCueBuilder;
import kotlin.withFieldVisibility;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u0018\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010\u0004J\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020!H\u0002¢\u0006\u0004\b\u001f\u0010\"J\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020#H\u0002¢\u0006\u0004\b\u001e\u0010$J\u0017\u0010\u001e\u001a\u00020%2\u0006\u0010\b\u001a\u00020%H\u0002¢\u0006\u0004\b\u001e\u0010&J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020*H\u0002¢\u0006\u0004\b(\u0010+J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020,H\u0002¢\u0006\u0004\b(\u0010-J\u000f\u0010.\u001a\u00020\u0005H\u0002¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\u0005H\u0002¢\u0006\u0004\b/\u0010\u0004J\u000f\u00100\u001a\u00020\u0005H\u0002¢\u0006\u0004\b0\u0010\u0004J\u001f\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u00101\u001a\u00020\u0005H\u0002¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\u0005H\u0002¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\u0005H\u0002¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\u0005H\u0002¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\u0005H\u0002¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\u0005H\u0002¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\u0005H\u0002¢\u0006\u0004\b7\u0010\u0004J\u000f\u00108\u001a\u00020\u0005H\u0002¢\u0006\u0004\b8\u0010\u0004J\u000f\u00109\u001a\u00020\u0017H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0005H\u0016¢\u0006\u0004\b;\u0010\u0004J\u000f\u0010<\u001a\u00020\u0005H\u0002¢\u0006\u0004\b<\u0010\u0004J\u000f\u0010=\u001a\u00020\u0005H\u0002¢\u0006\u0004\b=\u0010\u0004J\u000f\u0010>\u001a\u00020\u0005H\u0002¢\u0006\u0004\b>\u0010\u0004J\u000f\u0010?\u001a\u00020%H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020%H\u0002¢\u0006\u0004\bA\u0010@J\u000f\u0010(\u001a\u00020\u0005H\u0002¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010B\u001a\u00020\u0005H\u0002¢\u0006\u0004\bB\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010CJ\u000f\u0010D\u001a\u00020\u0005H\u0002¢\u0006\u0004\bD\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0014\u0010EJ\u000f\u0010F\u001a\u00020\u0005H\u0002¢\u0006\u0004\bF\u0010\u0004R\u001b\u0010\u0014\u001a\u00020G8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010JR\u001b\u0010\u0018\u001a\u00020K8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010H\u001a\u0004\bL\u0010MR\u0016\u0010\u001e\u001a\u00020N8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0014\u0010OR\u0016\u0010\u001f\u001a\u00020P8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bL\u0010QR\u0018\u0010(\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010SR\u0018\u0010\u001a\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010UR\u0016\u0010\u0013\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010VR\u0014\u0010L\u001a\u00020W8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010X"}, d2 = {"Lo/setScrollPosition;", "Landroidx/fragment/app/Fragment;", "Lo/toCueBuilder$IconCompatParcelizer;", "<init>", "()V", "", "onResume", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onRewind", "AudioAttributesImplBaseParcelizer", "write", "onPrepareFromSearch", "onPrepare", "", "IconCompatParcelizer", "(I)I", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "", "(Ljava/lang/String;Ljava/lang/String;)V", "read", "RemoteActionCompatParcelizer", "onPrepareFromMediaId", "Lo/IntegrityManagerFactory$IconCompatParcelizer;", "(Lo/IntegrityManagerFactory$IconCompatParcelizer;)V", "Lo/IntegrityManagerFactory$RemoteActionCompatParcelizer;", "(Lo/IntegrityManagerFactory$RemoteActionCompatParcelizer;)V", "", "(Z)Z", "Lo/IntegrityManager$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;", "AudioAttributesCompatParcelizer", "(Lo/IntegrityManager$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V", "Lo/IntegrityManager$MediaMetadataCompat;", "(Lo/IntegrityManager$MediaMetadataCompat;)V", "Lo/IntegrityManager$AudioAttributesImplApi26Parcelizer;", "(Lo/IntegrityManager$AudioAttributesImplApi26Parcelizer;)V", "handleMediaPlayPauseIfPendingOnHandler", "MediaDescriptionCompat", "onCommand", "onFastForward", "onPlayFromSearch", "onMediaButtonEvent", "onSeekTo", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onPlayFromUri", "onCustomAction", "onPrepareFromUri", "AudioAttributesImplApi26Parcelizer", "()I", "onDestroyView", "onAddQueueItem", "onPlay", "onPlayFromMediaId", "RatingCompat", "()Z", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "(Ljava/lang/String;)I", "onRemoveQueueItemAt", "(I)V", "onRemoveQueueItem", "Lcom/marrow2/ui/video/landing/VideoLandingViewModel;", "Lo/RenewEligible;", "MediaBrowserCompatItemReceiver", "()Lcom/marrow2/ui/video/landing/VideoLandingViewModel;", "Lcom/marrow2/ui/main/viewmodel/HomeSharedViewModel;", "MediaBrowserCompatCustomActionResultReceiver", "()Lcom/marrow2/ui/main/viewmodel/HomeSharedViewModel;", "Lo/buildAndPrepareSampleStreamWrappers;", "Lo/buildAndPrepareSampleStreamWrappers;", "Lcom/marrow2/ui/video/landing/epoxy_rv/VideoSubjectsModelController;", "Lcom/marrow2/ui/video/landing/epoxy_rv/VideoSubjectsModelController;", "Lcom/google/android/material/snackbar/Snackbar;", "Lcom/google/android/material/snackbar/Snackbar;", "Lo/setActiveSelection;", "Lo/setActiveSelection;", "Z", "Lo/isCtrlCode;", "Lo/isCtrlCode;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setScrollPosition extends setInlineLabelResource implements toCueBuilder.IconCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final isCtrlCode MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private VideoSubjectsModelController RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private Snackbar AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public setActiveSelection AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private buildAndPrepareSampleStreamWrappers read;

    @Override // o.toCueBuilder.IconCompatParcelizer
    public final int IconCompatParcelizer(int p0) {
        return 1;
    }

    public setScrollPosition() {
        setScrollPosition setscrollposition = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass2(setscrollposition)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(VideoLandingViewModel.class), new AnonymousClass6(renewEligibleWrite), new AnonymousClass7(renewEligibleWrite), new AnonymousClass8(setscrollposition, renewEligibleWrite));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(HomeSharedViewModel.class), new AnonymousClass5(setscrollposition), new AnonymousClass3(setscrollposition), new AnonymousClass4(setscrollposition));
        this.MediaBrowserCompatCustomActionResultReceiver = new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoLandingViewModel MediaBrowserCompatItemReceiver() {
        return (VideoLandingViewModel) this.write.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeSharedViewModel MediaBrowserCompatCustomActionResultReceiver() {
        return (HomeSharedViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.setScrollPosition$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "read", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.setScrollPosition$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "read", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.setScrollPosition$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass6 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.AudioAttributesCompatParcelizer.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: renamed from: o.setScrollPosition$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setScrollPosition$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    public static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends isCtrlCode {
        @Override // kotlin.isCtrlCode
        public final void write(int i) {
        }

        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            super(0, 1, null);
        }

        @Override // kotlin.isCtrlCode
        public final void read(int i) {
            setScrollPosition.this.MediaBrowserCompatItemReceiver().IconCompatParcelizer(new TransformationChildCard.onCommand(i));
        }

        @Override // kotlin.isCtrlCode
        public final void AudioAttributesCompatParcelizer(int i) {
            setScrollPosition.this.MediaBrowserCompatItemReceiver().IconCompatParcelizer(new TransformationChildCard.onCustomAction(i));
        }

        @Override // kotlin.isCtrlCode, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappersAudioAttributesCompatParcelizer = buildAndPrepareSampleStreamWrappers.AudioAttributesCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(buildandpreparesamplestreamwrappersAudioAttributesCompatParcelizer, "");
        this.read = buildandpreparesamplestreamwrappersAudioAttributesCompatParcelizer;
        if (buildandpreparesamplestreamwrappersAudioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappersAudioAttributesCompatParcelizer = null;
        }
        FrameLayout frameLayout = buildandpreparesamplestreamwrappersAudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesImplApi21Parcelizer();
        MediaMetadataCompat();
        MediaBrowserCompatMediaItem();
        onPrepare();
        onPrepareFromSearch();
        onRewind();
        AudioAttributesCompatParcelizer();
    }

    private final void onRewind() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
        new setCircleRadius(constraintLayoutAudioAttributesCompatParcelizer, new getCreatedOnDateMs() { // from class: o.setDropDownBackgroundTintList
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setScrollPosition.getActivityResultRegistry(this.AudioAttributesCompatParcelizer);
            }
        }, new getCreatedOnDateMs() { // from class: o.setSimpleItems
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setScrollPosition.getDefaultViewModelProviderFactory(this.RemoteActionCompatParcelizer);
            }
        }, new getCreatedOnDateMs() { // from class: o.setTextInputLayoutFocusedRectEnabled
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setScrollPosition.getDefaultViewModelCreationExtras(this.write);
            }
        }).IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup getActivityResultRegistry(setScrollPosition setscrollposition) {
        setscrollposition.write();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup getDefaultViewModelProviderFactory(setScrollPosition setscrollposition) {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = setscrollposition.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer().performClick();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup getDefaultViewModelCreationExtras(setScrollPosition setscrollposition) {
        setscrollposition.AudioAttributesImplBaseParcelizer();
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesImplBaseParcelizer() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
        bytesRead.read(constraintLayoutAudioAttributesCompatParcelizer, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setBoxBackgroundColor
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setScrollPosition.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28(setScrollPosition setscrollposition) {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = setscrollposition.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer().animate().translationX(BitmapDescriptorFactory.HUE_RED).setDuration(300L).start();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.setScrollPosition$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$RemoteActionCompatParcelizer.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.setScrollPosition$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$IconCompatParcelizer.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.setScrollPosition$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$RemoteActionCompatParcelizer.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    private final void write() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        final ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer();
        final float width = constraintLayoutAudioAttributesCompatParcelizer.getWidth();
        toMagicModuleMetaRepoModel.write(constraintLayoutAudioAttributesCompatParcelizer);
        bytesRead.read(constraintLayoutAudioAttributesCompatParcelizer, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setDropDownBackgroundTint
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setScrollPosition.write(constraintLayoutAudioAttributesCompatParcelizer, width);
            }
        });
        MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.MediaBrowserCompatMediaItem.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final ConstraintLayout constraintLayout, float f) {
        constraintLayout.animate().translationX(-f).alpha(BitmapDescriptorFactory.HUE_RED).setDuration(2000L).withEndAction(new Runnable() { // from class: o.setBoxBackgroundMode
            @Override // java.lang.Runnable
            public final void run() {
                setScrollPosition.IconCompatParcelizer(constraintLayout);
            }
        }).start();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(ConstraintLayout constraintLayout) {
        toMagicModuleMetaRepoModel.write(constraintLayout);
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
    }

    private final void onPrepareFromSearch() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
            if (buildandpreparesamplestreamwrappers == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers = null;
            }
            ConstraintLayout constraintLayout = buildandpreparesamplestreamwrappers.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, constraintLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
            if (buildandpreparesamplestreamwrappers3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers3 = null;
            }
            ConstraintLayout constraintLayout2 = buildandpreparesamplestreamwrappers3.onMediaButtonEvent;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
            bytesRead.write(contextRequireContext2, constraintLayout2);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = this.read;
            if (buildandpreparesamplestreamwrappers4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers4 = null;
            }
            ConstraintLayout constraintLayout3 = buildandpreparesamplestreamwrappers4.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout3, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext3, constraintLayout3);
            Context contextRequireContext4 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext4, "");
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = this.read;
            if (buildandpreparesamplestreamwrappers5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers5 = null;
            }
            HorizontalScrollView horizontalScrollView = buildandpreparesamplestreamwrappers5.RatingCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(horizontalScrollView, "");
            bytesRead.IconCompatParcelizer(contextRequireContext4, horizontalScrollView);
            Context contextRequireContext5 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext5, "");
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers6 = this.read;
            if (buildandpreparesamplestreamwrappers6 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers6 = null;
            }
            LinearLayout linearLayout = buildandpreparesamplestreamwrappers6.onFastForward;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.IconCompatParcelizer(contextRequireContext5, linearLayout);
            Context contextRequireContext6 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext6, "");
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers7 = this.read;
            if (buildandpreparesamplestreamwrappers7 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers7 = null;
            }
            LinearLayout linearLayout2 = buildandpreparesamplestreamwrappers7.onPause;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.IconCompatParcelizer(contextRequireContext6, linearLayout2);
            Context contextRequireContext7 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext7, "");
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers8 = this.read;
            if (buildandpreparesamplestreamwrappers8 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers8 = null;
            }
            EpoxyRecyclerView epoxyRecyclerView = buildandpreparesamplestreamwrappers8.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(epoxyRecyclerView, "");
            bytesRead.IconCompatParcelizer(contextRequireContext7, epoxyRecyclerView);
            Context contextRequireContext8 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext8, "");
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers9 = this.read;
            if (buildandpreparesamplestreamwrappers9 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers9 = null;
            }
            ConstraintLayout constraintLayoutWrite = buildandpreparesamplestreamwrappers9.onPlayFromMediaId.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutWrite, "");
            bytesRead.IconCompatParcelizer(contextRequireContext8, constraintLayoutWrite);
            Context contextRequireContext9 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext9, "");
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers10 = this.read;
            if (buildandpreparesamplestreamwrappers10 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers10 = null;
            }
            TextView textView = buildandpreparesamplestreamwrappers10.onRewind;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            bytesRead.IconCompatParcelizer(contextRequireContext9, textView);
            Context contextRequireContext10 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext10, "");
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers11 = this.read;
            if (buildandpreparesamplestreamwrappers11 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers11 = null;
            }
            CardView cardView = buildandpreparesamplestreamwrappers11.onPrepareFromUri.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
            bytesRead.IconCompatParcelizer(contextRequireContext10, cardView);
            Context contextRequireContext11 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext11, "");
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers12 = this.read;
            if (buildandpreparesamplestreamwrappers12 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers12;
            }
            ImageView imageView = buildandpreparesamplestreamwrappers2.onPrepareFromUri.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            bytesRead.IconCompatParcelizer(contextRequireContext11, imageView);
        }
    }

    private final void onPrepare() {
        getProvider getprovider = getProvider.getInstance(requireContext());
        isCtrlCode isctrlcode = this.MediaBrowserCompatCustomActionResultReceiver;
        getprovider.registerReceiver(isctrlcode, isctrlcode.AudioAttributesCompatParcelizer());
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        VideoSubjectsModelController videoSubjectsModelController = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        this.AudioAttributesImplApi21Parcelizer = new setActiveSelection(contextRequireContext, RemoteActionCompatParcelizer(buildandpreparesamplestreamwrappers.onPlayFromUri.getText().toString()), new getAnswerMap() { // from class: o.TextInputEditText
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setScrollPosition.IconCompatParcelizer(this.read, ((Integer) obj).intValue());
            }
        }, new getCreatedOnDateMs() { // from class: o.setBoxBackgroundColorResource
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setScrollPosition.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(this.AudioAttributesCompatParcelizer);
            }
        }, null, 16, null);
        this.RemoteActionCompatParcelizer = new VideoSubjectsModelController(new RemoteActionCompatParcelizer());
        final Context context = getContext();
        final int i = DeviceProperties.isTablet(requireContext()) ? 3 : 2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i) { // from class: com.marrow2.ui.video.landing.VideoLandingFragment$initView$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
            public final boolean AudioAttributesImplApi21Parcelizer() {
                return false;
            }
        };
        gridLayoutManager.read(new toCueBuilder(this));
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = this.read;
        if (buildandpreparesamplestreamwrappers2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers2 = null;
        }
        buildandpreparesamplestreamwrappers2.AudioAttributesImplApi26Parcelizer.setLayoutManager(gridLayoutManager);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers3 = null;
        }
        buildandpreparesamplestreamwrappers3.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(new setAnimateOnTouchUp(getResources().getDimensionPixelSize(R.dimen.margin_6dp), getResources().getDimensionPixelSize(R.dimen.margin_4dp)));
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = this.read;
        if (buildandpreparesamplestreamwrappers4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers4 = null;
        }
        EpoxyRecyclerView epoxyRecyclerView = buildandpreparesamplestreamwrappers4.AudioAttributesImplApi26Parcelizer;
        VideoSubjectsModelController videoSubjectsModelController2 = this.RemoteActionCompatParcelizer;
        if (videoSubjectsModelController2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            videoSubjectsModelController = videoSubjectsModelController2;
        }
        epoxyRecyclerView.setController(videoSubjectsModelController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setScrollPosition setscrollposition, int i) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(new TransformationChildCard.onFastForward(i));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onPlay.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    public static final class RemoteActionCompatParcelizer implements setCursorVisible.AudioAttributesCompatParcelizer {
        RemoteActionCompatParcelizer() {
        }

        @Override // o.setCursorVisible.AudioAttributesCompatParcelizer
        public final void read(proceedNonBlocking proceednonblocking) {
            toMagicModuleMetaRepoModel.write(proceednonblocking, "");
            setScrollPosition.this.MediaBrowserCompatItemReceiver().IconCompatParcelizer(new TransformationChildCard.onPrepare(proceednonblocking));
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi26Parcelizer = setScrollPosition.this.MediaBrowserCompatItemReceiver().AudioAttributesImplApi26Parcelizer();
                final setScrollPosition setscrollposition = setScrollPosition.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.setScrollPosition.read.5
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = null;
                        if (z) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers2 = null;
                            }
                            ProgressBar progressBar = buildandpreparesamplestreamwrappers2.onPlay;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers3;
                            }
                            ConstraintLayout constraintLayout = buildandpreparesamplestreamwrappers.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
                        } else {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers4 = null;
                            }
                            ProgressBar progressBar2 = buildandpreparesamplestreamwrappers4.onPlay;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar2);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers5;
                            }
                            ConstraintLayout constraintLayout2 = buildandpreparesamplestreamwrappers.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout2);
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

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setScrollPosition.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        setScrollPosition setscrollposition = this;
        setBitrateKbps.read(setscrollposition, new read(null));
        setBitrateKbps.read(setscrollposition, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.read(setscrollposition, new AudioAttributesImplApi26Parcelizer(null));
        setBitrateKbps.read(setscrollposition, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.read(setscrollposition, new MediaDescriptionCompat(null));
        setBitrateKbps.read(setscrollposition, new RatingCompat(null));
        setBitrateKbps.read(setscrollposition, new MediaBrowserCompatSearchResultReceiver(null));
        setBitrateKbps.read(setscrollposition, new MediaBrowserCompatMediaItem(null));
        setBitrateKbps.read(setscrollposition, new MediaMetadataCompat(null));
        setBitrateKbps.read(setscrollposition, new write(null));
        setBitrateKbps.RemoteActionCompatParcelizer(setscrollposition, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(setscrollposition, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.read(setscrollposition, new MediaBrowserCompatCustomActionResultReceiver(null));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<proceedNonBlocking>> setupdatedstatusMediaBrowserCompatItemReceiver = setScrollPosition.this.MediaBrowserCompatItemReceiver().MediaBrowserCompatItemReceiver();
                final setScrollPosition setscrollposition = setScrollPosition.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.setScrollPosition.AudioAttributesImplApi21Parcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((List) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(List<proceedNonBlocking> list) {
                        VideoSubjectsModelController videoSubjectsModelController = setscrollposition.RemoteActionCompatParcelizer;
                        if (videoSubjectsModelController == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            videoSubjectsModelController = null;
                        }
                        videoSubjectsModelController.setData(list);
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
            return setScrollPosition.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: o.setScrollPosition$AudioAttributesImplApi26Parcelizer$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements getValidationToken {
            private /* synthetic */ setScrollPosition AudioAttributesCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return RemoteActionCompatParcelizer((setErrorIconTintMode) obj);
            }

            private Object RemoteActionCompatParcelizer(final setErrorIconTintMode seterroricontintmode) {
                buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = null;
                if (seterroricontintmode == null) {
                    buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = this.AudioAttributesCompatParcelizer.read;
                    if (buildandpreparesamplestreamwrappers2 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers2;
                    }
                    ComposeView composeView = buildandpreparesamplestreamwrappers.MediaBrowserCompatItemReceiver;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(composeView, "");
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(composeView);
                } else {
                    buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.AudioAttributesCompatParcelizer.read;
                    if (buildandpreparesamplestreamwrappers3 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        buildandpreparesamplestreamwrappers3 = null;
                    }
                    ComposeView composeView2 = buildandpreparesamplestreamwrappers3.MediaBrowserCompatItemReceiver;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(composeView2, "");
                    bytesRead.AudioAttributesImplApi21Parcelizer(composeView2);
                    buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = this.AudioAttributesCompatParcelizer.read;
                    if (buildandpreparesamplestreamwrappers4 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers4;
                    }
                    ComposeView composeView3 = buildandpreparesamplestreamwrappers.MediaBrowserCompatItemReceiver;
                    final setScrollPosition setscrollposition = this.AudioAttributesCompatParcelizer;
                    composeView3.setContent(multiplyFft.IconCompatParcelizer(214713528, true, new MagicModuleSubmissionRequestBody() { // from class: o.setBoxStrokeWidthResource
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return setScrollPosition.AudioAttributesImplApi26Parcelizer.AnonymousClass1.IconCompatParcelizer(seterroricontintmode, setscrollposition, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                        }
                    }));
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup IconCompatParcelizer(final setErrorIconTintMode seterroricontintmode, final setScrollPosition setscrollposition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
                if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                    _handleunrecognizedcharacterescape.onPrepareFromSearch();
                } else {
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesCompatParcelizer(214713528, i, -1, "com.marrow2.ui.video.landing.VideoLandingFragment.observers.<anonymous>.<anonymous>.<anonymous> (VideoLandingFragment.kt:287)");
                    }
                    ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(1102748216, true, new MagicModuleSubmissionRequestBody() { // from class: o.setBoxStrokeWidth
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return setScrollPosition.AudioAttributesImplApi26Parcelizer.AnonymousClass1.AudioAttributesCompatParcelizer(seterroricontintmode, setscrollposition, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                        }
                    }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    }
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup AudioAttributesCompatParcelizer(setErrorIconTintMode seterroricontintmode, final setScrollPosition setscrollposition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
                getCreatedOnDateMs getcreatedondatems;
                if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                    _handleunrecognizedcharacterescape.onPrepareFromSearch();
                } else {
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesCompatParcelizer(1102748216, i, -1, "com.marrow2.ui.video.landing.VideoLandingFragment.observers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VideoLandingFragment.kt:288)");
                    }
                    String strWrite = seterroricontintmode.write();
                    if (seterroricontintmode.IconCompatParcelizer()) {
                        _handleunrecognizedcharacterescape.IconCompatParcelizer(-232562059);
                        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(setscrollposition);
                        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                        if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause = new getCreatedOnDateMs() { // from class: o.setBoxStrokeWidthFocusedResource
                                @Override // kotlin.getCreatedOnDateMs
                                public final Object invoke() {
                                    return setScrollPosition.AudioAttributesImplApi26Parcelizer.AnonymousClass1.write(setscrollposition);
                                }
                            };
                            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                        }
                        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                        getcreatedondatems = (getCreatedOnDateMs) objOnPause;
                    } else {
                        _handleunrecognizedcharacterescape.IconCompatParcelizer(-232410562);
                        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                        getcreatedondatems = null;
                    }
                    setErrorIconTintList.AudioAttributesCompatParcelizer(strWrite, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (_handleOddName) null, _handleunrecognizedcharacterescape, 0, 4);
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    }
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup write(setScrollPosition setscrollposition) {
                setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.read.INSTANCE);
                return getShowPopup.INSTANCE;
            }

            AnonymousClass1(setScrollPosition setscrollposition) {
                this.AudioAttributesCompatParcelizer = setscrollposition;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (setScrollPosition.this.MediaBrowserCompatItemReceiver().IconCompatParcelizer().write(new AnonymousClass1(setScrollPosition.this), this) == objIconCompatParcelizer) {
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
            return setScrollPosition.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<String> setupdatedstatus = setScrollPosition.this.MediaBrowserCompatItemReceiver().read();
                final setScrollPosition setscrollposition = setScrollPosition.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.setScrollPosition.MediaBrowserCompatItemReceiver.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((String) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(String str) {
                        if (str.length() > 0) {
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setscrollposition, str, 0);
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
            return setScrollPosition.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaDescriptionCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.setScrollPosition$MediaDescriptionCompat$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements getValidationToken {
            private /* synthetic */ setScrollPosition IconCompatParcelizer;

            public static /* synthetic */ boolean AudioAttributesCompatParcelizer() {
                return true;
            }

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return read((ExpandableBehavior) obj);
            }

            private Object read(ExpandableBehavior expandableBehavior) {
                buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = null;
                if (!expandableBehavior.getRead()) {
                    buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = this.IconCompatParcelizer.read;
                    if (buildandpreparesamplestreamwrappers2 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        buildandpreparesamplestreamwrappers2 = null;
                    }
                    ConstraintLayout constraintLayoutRemoteActionCompatParcelizer = buildandpreparesamplestreamwrappers2.onPrepareFromUri.IconCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutRemoteActionCompatParcelizer, "");
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayoutRemoteActionCompatParcelizer);
                    buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.IconCompatParcelizer.read;
                    if (buildandpreparesamplestreamwrappers3 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        buildandpreparesamplestreamwrappers3 = null;
                    }
                    buildandpreparesamplestreamwrappers3.onPrepare.setOnTouchListener(null);
                } else {
                    if (expandableBehavior.getWrite()) {
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = this.IconCompatParcelizer.read;
                        if (buildandpreparesamplestreamwrappers4 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            buildandpreparesamplestreamwrappers4 = null;
                        }
                        TextView textView = buildandpreparesamplestreamwrappers4.onPrepareFromUri.RemoteActionCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                        bytesRead.AudioAttributesImplApi21Parcelizer(textView);
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = this.IconCompatParcelizer.read;
                        if (buildandpreparesamplestreamwrappers5 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            buildandpreparesamplestreamwrappers5 = null;
                        }
                        buildandpreparesamplestreamwrappers5.onPrepareFromUri.AudioAttributesImplBaseParcelizer.setText(this.IconCompatParcelizer.getString(R.string.text_concise_tooltip_description_updated));
                    } else {
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers6 = this.IconCompatParcelizer.read;
                        if (buildandpreparesamplestreamwrappers6 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            buildandpreparesamplestreamwrappers6 = null;
                        }
                        TextView textView2 = buildandpreparesamplestreamwrappers6.onPrepareFromUri.RemoteActionCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView2);
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers7 = this.IconCompatParcelizer.read;
                        if (buildandpreparesamplestreamwrappers7 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            buildandpreparesamplestreamwrappers7 = null;
                        }
                        buildandpreparesamplestreamwrappers7.onPrepareFromUri.AudioAttributesImplBaseParcelizer.setText(this.IconCompatParcelizer.getString(R.string.text_concise_tooltip_description));
                    }
                    buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers8 = this.IconCompatParcelizer.read;
                    if (buildandpreparesamplestreamwrappers8 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        buildandpreparesamplestreamwrappers8 = null;
                    }
                    isKeyAllowed.RemoteActionCompatParcelizer(buildandpreparesamplestreamwrappers8.onPrepareFromUri.IconCompatParcelizer());
                    buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers9 = this.IconCompatParcelizer.read;
                    if (buildandpreparesamplestreamwrappers9 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers9;
                    }
                    buildandpreparesamplestreamwrappers.onPrepare.setOnTouchListener(new View.OnTouchListener() { // from class: o.setBoxStrokeWidthFocused
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            return setScrollPosition.MediaDescriptionCompat.AnonymousClass1.AudioAttributesCompatParcelizer();
                        }
                    });
                }
                return getShowPopup.INSTANCE;
            }

            AnonymousClass1(setScrollPosition setscrollposition) {
                this.IconCompatParcelizer = setscrollposition;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setScrollPosition.this.MediaBrowserCompatItemReceiver().MediaBrowserCompatCustomActionResultReceiver().write(new AnonymousClass1(setScrollPosition.this), this) == objIconCompatParcelizer) {
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
            return setScrollPosition.this.new MediaDescriptionCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaDescriptionCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<ExpandableTransformationBehavior> setupdatedstatusAudioAttributesImplApi21Parcelizer = setScrollPosition.this.MediaBrowserCompatItemReceiver().AudioAttributesImplApi21Parcelizer();
                final setScrollPosition setscrollposition = setScrollPosition.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.setScrollPosition.RatingCompat.5
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((ExpandableTransformationBehavior) obj2);
                    }

                    private Object IconCompatParcelizer(ExpandableTransformationBehavior expandableTransformationBehavior) {
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = null;
                        if (expandableTransformationBehavior.getRead()) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers2 = null;
                            }
                            ConstraintLayout constraintLayout = buildandpreparesamplestreamwrappers2.AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers3 = null;
                            }
                            Group group = buildandpreparesamplestreamwrappers3.MediaBrowserCompatSearchResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(group);
                            setscrollposition.requireActivity().getWindow().setFlags(16, 16);
                            if (expandableTransformationBehavior.getIconCompatParcelizer()) {
                                if (expandableTransformationBehavior.getWrite()) {
                                    buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = setscrollposition.read;
                                    if (buildandpreparesamplestreamwrappers4 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers4;
                                    }
                                    buildandpreparesamplestreamwrappers.onRemoveQueueItemAt.setText(setscrollposition.getString(R.string.text_mapping_pyt));
                                } else {
                                    buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = setscrollposition.read;
                                    if (buildandpreparesamplestreamwrappers5 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers5;
                                    }
                                    buildandpreparesamplestreamwrappers.onRemoveQueueItemAt.setText(setscrollposition.getString(R.string.text_turning_off_intern_mode));
                                }
                            } else if (expandableTransformationBehavior.getWrite()) {
                                buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers6 = setscrollposition.read;
                                if (buildandpreparesamplestreamwrappers6 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers6;
                                }
                                buildandpreparesamplestreamwrappers.onRemoveQueueItemAt.setText(setscrollposition.getString(R.string.text_reducing_video_hrs));
                            } else {
                                buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers7 = setscrollposition.read;
                                if (buildandpreparesamplestreamwrappers7 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers7;
                                }
                                buildandpreparesamplestreamwrappers.onRemoveQueueItemAt.setText(setscrollposition.getString(R.string.text_original_video_hrs));
                            }
                        } else {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers8 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers8 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers8 = null;
                            }
                            ConstraintLayout constraintLayout2 = buildandpreparesamplestreamwrappers8.AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout2);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers9 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers9 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers9;
                            }
                            Group group2 = buildandpreparesamplestreamwrappers.MediaBrowserCompatSearchResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(group2);
                            setscrollposition.requireActivity().getWindow().clearFlags(16);
                        }
                        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
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

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setScrollPosition.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<TransformationChildLayout> setupdatedstatusMediaDescriptionCompat = setScrollPosition.this.MediaBrowserCompatItemReceiver().MediaDescriptionCompat();
                final setScrollPosition setscrollposition = setScrollPosition.this;
                this.read = 1;
                if (setupdatedstatusMediaDescriptionCompat.write(new getValidationToken() { // from class: o.setScrollPosition.MediaBrowserCompatSearchResultReceiver.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((TransformationChildLayout) obj2);
                    }

                    private Object write(TransformationChildLayout transformationChildLayout) {
                        String strRemoteActionCompatParcelizer = transformationChildLayout.getWrite();
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = null;
                        if (strRemoteActionCompatParcelizer == null || strRemoteActionCompatParcelizer.length() == 0) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers2 = null;
                            }
                            ConstraintLayout constraintLayout = buildandpreparesamplestreamwrappers2.RemoteActionCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
                        } else {
                            if (DeviceProperties.isTablet(setscrollposition.requireContext())) {
                                Context contextRequireContext = setscrollposition.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = setscrollposition.read;
                                if (buildandpreparesamplestreamwrappers3 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    buildandpreparesamplestreamwrappers3 = null;
                                }
                                ConstraintLayout constraintLayout2 = buildandpreparesamplestreamwrappers3.RemoteActionCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
                                bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, constraintLayout2);
                            }
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers4 = null;
                            }
                            ConstraintLayout constraintLayout3 = buildandpreparesamplestreamwrappers4.RemoteActionCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout3, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout3);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers5 = null;
                            }
                            buildandpreparesamplestreamwrappers5.onSetPlaybackSpeed.setText(transformationChildLayout.getWrite());
                        }
                        if (transformationChildLayout.getRead()) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers6 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers6 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers6 = null;
                            }
                            ConstraintLayout constraintLayout4 = buildandpreparesamplestreamwrappers6.onMediaButtonEvent;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout4, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout4);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers7 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers7 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers7 = null;
                            }
                            View view = buildandpreparesamplestreamwrappers7.MediaDescriptionCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(view);
                            if (transformationChildLayout.getIconCompatParcelizer()) {
                                setscrollposition.onPlayFromMediaId();
                            } else {
                                setscrollposition.onPlay();
                            }
                        } else {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers8 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers8 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers8 = null;
                            }
                            ConstraintLayout constraintLayout5 = buildandpreparesamplestreamwrappers8.onMediaButtonEvent;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout5, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout5);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers9 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers9 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers9 = null;
                            }
                            View view2 = buildandpreparesamplestreamwrappers9.MediaDescriptionCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(view2);
                        }
                        if (transformationChildLayout.getRemoteActionCompatParcelizer()) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers10 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers10 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers10 = null;
                            }
                            ConstraintLayout constraintLayout6 = buildandpreparesamplestreamwrappers10.write;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout6, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout6);
                        } else {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers11 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers11 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers11 = null;
                            }
                            ConstraintLayout constraintLayout7 = buildandpreparesamplestreamwrappers11.write;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout7, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout7);
                        }
                        Context contextRequireContext2 = setscrollposition.requireContext();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                        String strIconCompatParcelizer = DefaultTimeBarExternalSyntheticLambda0.IconCompatParcelizer(contextRequireContext2, transformationChildLayout.getAudioAttributesImplApi26Parcelizer(), new Object[0]);
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers12 = setscrollposition.read;
                        if (buildandpreparesamplestreamwrappers12 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            buildandpreparesamplestreamwrappers12 = null;
                        }
                        if (!buildandpreparesamplestreamwrappers12.onPlayFromUri.getText().equals(strIconCompatParcelizer)) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers13 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers13 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers13;
                            }
                            buildandpreparesamplestreamwrappers.onPlayFromUri.setText(strIconCompatParcelizer);
                        }
                        if (transformationChildLayout.getAudioAttributesCompatParcelizer()) {
                            setscrollposition.onRemoveQueueItemAt();
                        } else {
                            Snackbar snackbar = setscrollposition.AudioAttributesCompatParcelizer;
                            if (snackbar != null) {
                                snackbar.RemoteActionCompatParcelizer();
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
            throw new PlanDetailsCreator();
        }

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setScrollPosition.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<IntegrityManagerFactory> setupdatedstatusMediaMetadataCompat = setScrollPosition.this.MediaBrowserCompatItemReceiver().MediaMetadataCompat();
                final setScrollPosition setscrollposition = setScrollPosition.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusMediaMetadataCompat.write(new getValidationToken() { // from class: o.setScrollPosition.MediaBrowserCompatMediaItem.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((IntegrityManagerFactory) obj2);
                    }

                    private Object write(IntegrityManagerFactory integrityManagerFactory) {
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = null;
                        if (integrityManagerFactory instanceof IntegrityManagerFactory.RemoteActionCompatParcelizer) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers2;
                            }
                            ConstraintLayout constraintLayoutWrite = buildandpreparesamplestreamwrappers.onPlayFromMediaId.IconCompatParcelizer();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutWrite, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayoutWrite);
                            setscrollposition.read((IntegrityManagerFactory.RemoteActionCompatParcelizer) integrityManagerFactory);
                        } else if (integrityManagerFactory instanceof IntegrityManagerFactory.IconCompatParcelizer) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers3 = null;
                            }
                            buildandpreparesamplestreamwrappers3.AudioAttributesCompatParcelizer.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers4;
                            }
                            ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayoutAudioAttributesCompatParcelizer);
                            setscrollposition.RemoteActionCompatParcelizer((IntegrityManagerFactory.IconCompatParcelizer) integrityManagerFactory);
                        } else {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers5 = null;
                            }
                            ConstraintLayout constraintLayoutWrite2 = buildandpreparesamplestreamwrappers5.onPlayFromMediaId.IconCompatParcelizer();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutWrite2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayoutWrite2);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers6 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers6 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers6 = null;
                            }
                            buildandpreparesamplestreamwrappers6.AudioAttributesCompatParcelizer.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers7 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers7 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers7;
                            }
                            ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer2 = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayoutAudioAttributesCompatParcelizer2);
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
            return setScrollPosition.this.new MediaBrowserCompatMediaItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaMetadataCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: o.setScrollPosition$MediaMetadataCompat$5, reason: invalid class name */
        static final class AnonymousClass5<T> implements getValidationToken {
            private /* synthetic */ setScrollPosition IconCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return AudioAttributesCompatParcelizer((List) obj);
            }

            private Object AudioAttributesCompatParcelizer(final List<FabTransformationSheetBehavior> list) {
                buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.IconCompatParcelizer.read;
                if (buildandpreparesamplestreamwrappers == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    buildandpreparesamplestreamwrappers = null;
                }
                ComposeView composeView = buildandpreparesamplestreamwrappers.AudioAttributesImplApi21Parcelizer;
                final setScrollPosition setscrollposition = this.IconCompatParcelizer;
                composeView.setContent(multiplyFft.IconCompatParcelizer(-1308405588, true, new MagicModuleSubmissionRequestBody() { // from class: o.setCounterMaxLength
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return setScrollPosition.MediaMetadataCompat.AnonymousClass5.IconCompatParcelizer(list, setscrollposition, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }));
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup IconCompatParcelizer(List list, final setScrollPosition setscrollposition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
                if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesCompatParcelizer(-1308405588, i, -1, "com.marrow2.ui.video.landing.VideoLandingFragment.observers.<anonymous>.<anonymous>.<anonymous> (VideoLandingFragment.kt:439)");
                    }
                    if (list != null) {
                        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1882593140);
                        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(setscrollposition);
                        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                        if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause = new MagicModuleSubmissionRequestBody() { // from class: o.setCounterEnabled
                                @Override // kotlin.MagicModuleSubmissionRequestBody
                                public final Object invoke(Object obj, Object obj2) {
                                    return setScrollPosition.MediaMetadataCompat.AnonymousClass5.write(setscrollposition, (String) obj, (String) obj2);
                                }
                            };
                            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                        }
                        setStartIconContentDescription.write(null, list, (MagicModuleSubmissionRequestBody) objOnPause, _handleunrecognizedcharacterescape, 0, 1);
                    } else {
                        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1901467242);
                    }
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    }
                } else {
                    _handleunrecognizedcharacterescape.onPrepareFromSearch();
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup write(setScrollPosition setscrollposition, String str, String str2) {
                toMagicModuleMetaRepoModel.write(str, "");
                toMagicModuleMetaRepoModel.write(str2, "");
                setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(new TransformationChildCard.MediaBrowserCompatSearchResultReceiver(str, str2));
                return getShowPopup.INSTANCE;
            }

            AnonymousClass5(setScrollPosition setscrollposition) {
                this.IconCompatParcelizer = setscrollposition;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (setScrollPosition.this.MediaBrowserCompatItemReceiver().MediaBrowserCompatMediaItem().write(new AnonymousClass5(setScrollPosition.this), this) == objIconCompatParcelizer) {
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
            return setScrollPosition.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setMinuteHourDelegate> setupdatedstatusAudioAttributesCompatParcelizer = setScrollPosition.this.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer();
                final setScrollPosition setscrollposition = setScrollPosition.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.setScrollPosition.write.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((setMinuteHourDelegate) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(setMinuteHourDelegate setminutehourdelegate) {
                        String string;
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = null;
                        if (setscrollposition.read(setminutehourdelegate.getRemoteActionCompatParcelizer())) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers2 = null;
                            }
                            LinearLayout linearLayout = buildandpreparesamplestreamwrappers2.onFastForward;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers3 = null;
                            }
                            HorizontalScrollView horizontalScrollView = buildandpreparesamplestreamwrappers3.RatingCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(horizontalScrollView, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(horizontalScrollView);
                        } else {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers4 = null;
                            }
                            LinearLayout linearLayout2 = buildandpreparesamplestreamwrappers4.onFastForward;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout2);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers5 = null;
                            }
                            HorizontalScrollView horizontalScrollView2 = buildandpreparesamplestreamwrappers5.RatingCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(horizontalScrollView2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(horizontalScrollView2);
                        }
                        if (setminutehourdelegate.getAudioAttributesImplApi26Parcelizer()) {
                            setscrollposition.onPlayFromUri();
                            setscrollposition.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                        }
                        setscrollposition.onSeekTo();
                        setscrollposition.onMediaButtonEvent();
                        setscrollposition.onPlayFromSearch();
                        setscrollposition.onFastForward();
                        createStandard createstandardAudioAttributesCompatParcelizer = setminutehourdelegate.getWrite();
                        if (createstandardAudioAttributesCompatParcelizer != null) {
                            setScrollPosition setscrollposition2 = setscrollposition;
                            if (createstandardAudioAttributesCompatParcelizer.getRead() == 0) {
                                string = setscrollposition2.getString(R.string.label_downloaded);
                            } else {
                                string = setscrollposition2.getString(R.string.label_downloaded_count, QBankStatsResponse.RemoteActionCompatParcelizer(createstandardAudioAttributesCompatParcelizer.getRead()));
                            }
                            toMagicModuleMetaRepoModel.write((Object) string);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers6 = setscrollposition2.read;
                            if (buildandpreparesamplestreamwrappers6 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers6 = null;
                            }
                            String str = string;
                            buildandpreparesamplestreamwrappers6.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer.setText(str);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers7 = setscrollposition2.read;
                            if (buildandpreparesamplestreamwrappers7 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers7;
                            }
                            buildandpreparesamplestreamwrappers.MediaBrowserCompatMediaItem.IconCompatParcelizer.setText(str);
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

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setScrollPosition.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusMediaBrowserCompatSearchResultReceiver = setScrollPosition.this.MediaBrowserCompatItemReceiver().MediaBrowserCompatSearchResultReceiver();
                final setScrollPosition setscrollposition = setScrollPosition.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatSearchResultReceiver.write(new getValidationToken() { // from class: o.setScrollPosition.AudioAttributesCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read(((Boolean) obj2).booleanValue());
                    }

                    private Object read(boolean z) {
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = null;
                        if (z) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers2 = null;
                            }
                            View view = buildandpreparesamplestreamwrappers2.onPrepareFromMediaId;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(view);
                            setscrollposition.onPrepareFromUri();
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers3;
                            }
                            buildandpreparesamplestreamwrappers.onPrepare.setEnabled(false);
                        } else {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                buildandpreparesamplestreamwrappers4 = null;
                            }
                            View view2 = buildandpreparesamplestreamwrappers4.onPrepareFromMediaId;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(view2);
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers5;
                            }
                            buildandpreparesamplestreamwrappers.onPrepare.setEnabled(true);
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
            return setScrollPosition.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<IntegrityManager> setupdatedstatusAudioAttributesImplBaseParcelizer = setScrollPosition.this.MediaBrowserCompatItemReceiver().AudioAttributesImplBaseParcelizer();
                final setScrollPosition setscrollposition = setScrollPosition.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.setScrollPosition.AudioAttributesImplBaseParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((IntegrityManager) obj2);
                    }

                    private Object write(IntegrityManager integrityManager) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(integrityManager, IntegrityManager.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                            setscrollposition.onCustomAction();
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (integrityManager instanceof IntegrityManager.AudioAttributesImplBaseParcelizer) {
                            IntegrityManager.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (IntegrityManager.AudioAttributesImplBaseParcelizer) integrityManager;
                            setscrollposition.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer.IconCompatParcelizer(), audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer());
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(integrityManager, IntegrityManager.onCommand.INSTANCE)) {
                            setScrollPosition setscrollposition2 = setscrollposition;
                            setScrollPosition setscrollposition3 = setscrollposition2;
                            String string = setscrollposition2.getString(R.string.toast_no_sample_videos);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setscrollposition3, string, 0);
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(integrityManager, IntegrityManager.MediaBrowserCompatItemReceiver.INSTANCE)) {
                            setscrollposition.onCommand();
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(integrityManager, IntegrityManager.IconCompatParcelizer.INSTANCE)) {
                            setscrollposition.MediaDescriptionCompat();
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(integrityManager, IntegrityManager.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
                            setscrollposition.handleMediaPlayPauseIfPendingOnHandler();
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (integrityManager instanceof IntegrityManager.AudioAttributesImplApi26Parcelizer) {
                            setscrollposition.AudioAttributesCompatParcelizer((IntegrityManager.AudioAttributesImplApi26Parcelizer) integrityManager);
                        } else if (integrityManager instanceof IntegrityManager.MediaMetadataCompat) {
                            setscrollposition.AudioAttributesCompatParcelizer((IntegrityManager.MediaMetadataCompat) integrityManager);
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (integrityManager instanceof IntegrityManager.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                            setscrollposition.AudioAttributesCompatParcelizer((IntegrityManager.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) integrityManager);
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (integrityManager instanceof IntegrityManager.MediaDescriptionCompat) {
                            setscrollposition.write(((IntegrityManager.MediaDescriptionCompat) integrityManager).read());
                        } else if (integrityManager instanceof IntegrityManager.RemoteActionCompatParcelizer) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = null;
                            if (((IntegrityManager.RemoteActionCompatParcelizer) integrityManager).AudioAttributesCompatParcelizer()) {
                                if (setscrollposition.MediaBrowserCompatCustomActionResultReceiver().read().IconCompatParcelizer().booleanValue()) {
                                    buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = setscrollposition.read;
                                    if (buildandpreparesamplestreamwrappers2 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        buildandpreparesamplestreamwrappers2 = null;
                                    }
                                    buildandpreparesamplestreamwrappers2.AudioAttributesCompatParcelizer.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                                    buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = setscrollposition.read;
                                    if (buildandpreparesamplestreamwrappers3 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers3;
                                    }
                                    ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer();
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
                                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayoutAudioAttributesCompatParcelizer);
                                    setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                                } else {
                                    setscrollposition.RemoteActionCompatParcelizer();
                                }
                            } else {
                                buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = setscrollposition.read;
                                if (buildandpreparesamplestreamwrappers4 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers4;
                                }
                                ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer2 = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer2, "");
                                if (constraintLayoutAudioAttributesCompatParcelizer2.getVisibility() == 0) {
                                    setscrollposition.read();
                                }
                            }
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(integrityManager, IntegrityManager.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
                            setscrollposition.onRemoveQueueItem();
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(integrityManager, IntegrityManager.write.INSTANCE)) {
                            setScrollPosition setscrollposition4 = setscrollposition;
                            PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
                            Context contextRequireContext = setscrollposition.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            String lowerCase = "PRO_VIDEO_ACCESSED".toLowerCase(Locale.ROOT);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                            setscrollposition4.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext, "Pro Subscription Dialog", lowerCase));
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(integrityManager, IntegrityManager.RatingCompat.INSTANCE)) {
                            setPasswordVisibilityToggleDrawable.Companion iconCompatParcelizer = setPasswordVisibilityToggleDrawable.INSTANCE;
                            setPasswordVisibilityToggleDrawable.Companion.AudioAttributesCompatParcelizer().show(setscrollposition.getChildFragmentManager(), "cadaveric_videos_intro_bottom_sheet");
                        } else if (integrityManager instanceof IntegrityManager.read) {
                            IntegrityManager.read readVar = (IntegrityManager.read) integrityManager;
                            setscrollposition.IconCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), readVar.IconCompatParcelizer());
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
                        } else if (integrityManager instanceof IntegrityManager.MediaBrowserCompatMediaItem) {
                            setExpandedHintEnabled.Companion audioAttributesCompatParcelizer2 = setExpandedHintEnabled.INSTANCE;
                            setExpandedHintEnabled.Companion.AudioAttributesCompatParcelizer(((IntegrityManager.MediaBrowserCompatMediaItem) integrityManager).write()).show(setscrollposition.getChildFragmentManager(), "announcement_info_dialog");
                            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setScrollPosition.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatus = setScrollPosition.this.MediaBrowserCompatCustomActionResultReceiver().read();
                final setScrollPosition setscrollposition = setScrollPosition.this;
                this.read = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.setScrollPosition.MediaBrowserCompatCustomActionResultReceiver.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Boolean) obj2).booleanValue());
                    }

                    private Object write(boolean z) {
                        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = null;
                        if (z || !(setscrollposition.MediaBrowserCompatItemReceiver().MediaMetadataCompat().IconCompatParcelizer() instanceof IntegrityManagerFactory.RemoteActionCompatParcelizer) || setscrollposition.MediaBrowserCompatItemReceiver().RatingCompat().IconCompatParcelizer() == requestIntegrityToken.IconCompatParcelizer) {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers2;
                            }
                            ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayoutAudioAttributesCompatParcelizer);
                        } else {
                            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = setscrollposition.read;
                            if (buildandpreparesamplestreamwrappers3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers3;
                            }
                            ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer2 = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayoutAudioAttributesCompatParcelizer2);
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
            return setScrollPosition.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0, String p1) {
        Intent intentWrite = joinWithSeparator.write(requireContext(), p0, p1);
        if (intentWrite != null) {
            startActivity(intentWrite);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        final float height = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer().getHeight();
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers3;
        }
        ConstraintLayout constraintLayout = buildandpreparesamplestreamwrappers2.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.read(constraintLayout, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setTabGravity
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setScrollPosition.write(this.write, height);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final setScrollPosition setscrollposition, float f) {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = setscrollposition.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.AudioAttributesCompatParcelizer.animate().translationY(f).setDuration(300L).withEndAction(new Runnable() { // from class: o.setBoxCornerFamily
            @Override // java.lang.Runnable
            public final void run() {
                setScrollPosition.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(this.IconCompatParcelizer);
            }
        }).start();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(setScrollPosition setscrollposition) {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = setscrollposition.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
        bytesRead.MediaBrowserCompatItemReceiver(constraintLayoutAudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        ConstraintLayout constraintLayout = buildandpreparesamplestreamwrappers.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.read(constraintLayout, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setSelectedTabIndicatorHeight
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setScrollPosition.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(final setScrollPosition setscrollposition) {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = setscrollposition.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.AudioAttributesCompatParcelizer.animate().translationY(BitmapDescriptorFactory.HUE_RED).withStartAction(new Runnable() { // from class: o.TextInputLayout
            @Override // java.lang.Runnable
            public final void run() {
                setScrollPosition.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0(this.write);
            }
        }).setDuration(300L).start();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0(setScrollPosition setscrollposition) {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = setscrollposition.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayoutAudioAttributesCompatParcelizer);
    }

    private final void onPrepareFromMediaId() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer().setTranslationX(BitmapDescriptorFactory.HUE_RED);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers3 = null;
        }
        buildandpreparesamplestreamwrappers3.onCommand.IconCompatParcelizer().setTranslationY(BitmapDescriptorFactory.HUE_RED);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = this.read;
        if (buildandpreparesamplestreamwrappers4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers4 = null;
        }
        buildandpreparesamplestreamwrappers4.onCommand.IconCompatParcelizer().setAlpha(1.0f);
        if (MediaBrowserCompatSearchResultReceiver() || !RatingCompat()) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            int i = updateNavigation.read(contextRequireContext);
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = this.read;
            if (buildandpreparesamplestreamwrappers5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers5 = null;
            }
            EpoxyRecyclerView epoxyRecyclerView = buildandpreparesamplestreamwrappers5.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(epoxyRecyclerView, "");
            ViewGroup.LayoutParams layoutParams = epoxyRecyclerView.getLayoutParams();
            int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers6 = this.read;
            if (buildandpreparesamplestreamwrappers6 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers6 = null;
            }
            EpoxyRecyclerView epoxyRecyclerView2 = buildandpreparesamplestreamwrappers6.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(epoxyRecyclerView2, "");
            ViewGroup.LayoutParams layoutParams2 = epoxyRecyclerView2.getLayoutParams();
            int marginEnd = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0;
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers7 = this.read;
            if (buildandpreparesamplestreamwrappers7 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers7 = null;
            }
            EpoxyRecyclerView epoxyRecyclerView3 = buildandpreparesamplestreamwrappers7.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(epoxyRecyclerView3, "");
            ViewGroup.LayoutParams layoutParams3 = epoxyRecyclerView3.getLayoutParams();
            float marginStart2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0;
            float f = i - (marginStart + marginEnd);
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers8 = this.read;
            if (buildandpreparesamplestreamwrappers8 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers8;
            }
            ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = buildandpreparesamplestreamwrappers2.onCommand.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
            ConstraintLayout constraintLayout = constraintLayoutAudioAttributesCompatParcelizer;
            ViewGroup.LayoutParams layoutParams4 = constraintLayout.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            int i2 = (int) (marginStart2 + (f * 0.125f));
            marginLayoutParams2.leftMargin = i2;
            marginLayoutParams2.rightMargin = i2;
            constraintLayout.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(IntegrityManagerFactory.IconCompatParcelizer p0) {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        ConstraintLayout constraintLayoutWrite = buildandpreparesamplestreamwrappers.onPlayFromMediaId.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutWrite, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayoutWrite);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers3;
        }
        maybeSetPrimaryUrl maybesetprimaryurl = buildandpreparesamplestreamwrappers2.onPlayFromMediaId;
        maybesetprimaryurl.RemoteActionCompatParcelizer.setText(p0.getAudioAttributesCompatParcelizer());
        maybesetprimaryurl.IconCompatParcelizer.setText(p0.MediaBrowserCompatItemReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(IntegrityManagerFactory.RemoteActionCompatParcelizer p0) {
        maybeGetTypeVariable activity = getActivity();
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = null;
        zaay zaayVar = activity instanceof zaay ? (zaay) activity : null;
        if ((zaayVar == null || !zaayVar.MediaMetadataCompat()) && MediaBrowserCompatItemReceiver().RatingCompat().IconCompatParcelizer() != requestIntegrityToken.IconCompatParcelizer) {
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = this.read;
            if (buildandpreparesamplestreamwrappers2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers2 = null;
            }
            ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = buildandpreparesamplestreamwrappers2.onCommand.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayoutAudioAttributesCompatParcelizer);
        }
        onPrepareFromMediaId();
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers = buildandpreparesamplestreamwrappers3;
        }
        updateSampleStreams updatesamplestreams = buildandpreparesamplestreamwrappers.onCommand;
        updatesamplestreams.RemoteActionCompatParcelizer.setText(p0.getAudioAttributesCompatParcelizer());
        updatesamplestreams.IconCompatParcelizer.setText(p0.AudioAttributesImplApi26Parcelizer());
        buildDownloadCompletedNotification.write(updatesamplestreams.read, p0.AudioAttributesImplBaseParcelizer());
        ProgressBar progressBar = updatesamplestreams.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        bytesRead.AudioAttributesCompatParcelizer(progressBar, p0.MediaBrowserCompatItemReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean read(boolean p0) {
        if (!p0) {
            return false;
        }
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        int i = updateNavigation.read(contextRequireContext, 180);
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        int i2 = updateNavigation.read(contextRequireContext2, 8);
        int i3 = p0 ? 3 : 2;
        Context contextRequireContext3 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
        return (i * i3) + ((i3 - 1) * i2) > updateNavigation.read(contextRequireContext3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(IntegrityManager.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p0) {
        getSubMeshCount.Companion writeVar = getSubMeshCount.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(getSubMeshCount.Companion.RemoteActionCompatParcelizer(contextRequireContext, new getCameraMotionListener(p0.read(), true, p0.write())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(IntegrityManager.MediaMetadataCompat p0) {
        ResolvableApiException.Companion iconCompatParcelizer = ResolvableApiException.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String str = p0.read();
        String string = getString(R.string.report_copyright);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        startActivity(ResolvableApiException.Companion.read(contextRequireContext, new canceledPendingResult(str, string, null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(IntegrityManager.AudioAttributesImplApi26Parcelizer p0) {
        LessonVideoActivity.Companion companion = LessonVideoActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(LessonVideoActivity.Companion.RemoteActionCompatParcelizer(contextRequireContext, p0.AudioAttributesCompatParcelizer(), 0, false, 28));
        MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        setThumbRadius.Companion remoteActionCompatParcelizer = setThumbRadius.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(setThumbRadius.Companion.RemoteActionCompatParcelizer(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaDescriptionCompat() {
        startActivity(new Intent(requireContext(), (Class<?>) paintPixelDataSubBlocks.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCommand() {
        setRatingTags.Companion readVar = setRatingTags.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(setRatingTags.Companion.write(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0, String p1) {
        ah.Companion iconCompatParcelizer = ah.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(ah.Companion.read(contextRequireContext, new ReviewInfo(p0, p1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFastForward() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.MediaBrowserCompatMediaItem.read.setImageDrawable(_isNaN.getDrawable(requireContext(), R.drawable.ic_video_downloaded));
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers3;
        }
        TextView textView = buildandpreparesamplestreamwrappers2.MediaBrowserCompatMediaItem.IconCompatParcelizer;
        String string = getString(R.string.label_downloaded);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" (0)");
        textView.setText(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlayFromSearch() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write.setImageDrawable(_isNaN.getDrawable(requireContext(), R.drawable.ic_video_downloaded));
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers3;
        }
        TextView textView = buildandpreparesamplestreamwrappers2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer;
        String string = getString(R.string.label_downloaded);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" (0)");
        textView.setText(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaButtonEvent() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.AudioAttributesImplBaseParcelizer.read.setImageDrawable(_isNaN.getDrawable(requireContext(), R.drawable.ic_sample_videos));
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers3;
        }
        buildandpreparesamplestreamwrappers2.AudioAttributesImplBaseParcelizer.IconCompatParcelizer.setText(getString(R.string.title_sample_videos));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSeekTo() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.onCustomAction.write.setImageDrawable(_isNaN.getDrawable(requireContext(), R.drawable.ic_sample_videos));
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers3;
        }
        buildandpreparesamplestreamwrappers2.onCustomAction.IconCompatParcelizer.setText(getString(R.string.title_sample_videos));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        MaterialCardView materialCardViewRemoteActionCompatParcelizer = buildandpreparesamplestreamwrappers.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardViewRemoteActionCompatParcelizer, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(materialCardViewRemoteActionCompatParcelizer);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers3 = null;
        }
        buildandpreparesamplestreamwrappers3.MediaBrowserCompatCustomActionResultReceiver.read.setImageDrawable(_isNaN.getDrawable(requireContext(), R.drawable.ic_bookmarked_videos));
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = this.read;
        if (buildandpreparesamplestreamwrappers4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers4;
        }
        buildandpreparesamplestreamwrappers2.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer.setText(getString(R.string.title_bookmarked_videos));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlayFromUri() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        MaterialCardView materialCardViewRemoteActionCompatParcelizer = buildandpreparesamplestreamwrappers.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardViewRemoteActionCompatParcelizer, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(materialCardViewRemoteActionCompatParcelizer);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers3 = null;
        }
        buildandpreparesamplestreamwrappers3.handleMediaPlayPauseIfPendingOnHandler.write.setImageDrawable(_isNaN.getDrawable(requireContext(), R.drawable.ic_bookmarked_videos));
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = this.read;
        if (buildandpreparesamplestreamwrappers4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers4;
        }
        buildandpreparesamplestreamwrappers2.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer.setText(getString(R.string.title_bookmarked_videos));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomAction() {
        ResolvableApiException.Companion iconCompatParcelizer = ResolvableApiException.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String string = getString(R.string.intern_mode_v2_header);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        startActivity(ResolvableApiException.Companion.read(contextRequireContext, new canceledPendingResult("https://www.marrow.com/blog/intern-mode-pyts/", string, null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrepareFromUri() {
        setActiveSelection setactiveselection = this.AudioAttributesImplApi21Parcelizer;
        if (setactiveselection != null) {
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
            if (buildandpreparesamplestreamwrappers == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers = null;
            }
            TextView textView = buildandpreparesamplestreamwrappers.onPlayFromUri;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            TextView textView2 = textView;
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
            if (buildandpreparesamplestreamwrappers3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers3;
            }
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(buildandpreparesamplestreamwrappers2.onPlayFromUri.getText().toString());
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            setactiveselection.IconCompatParcelizer(textView2, iRemoteActionCompatParcelizer, contextRequireContext, AudioAttributesImplApi26Parcelizer());
        }
    }

    private final int AudioAttributesImplApi26Parcelizer() {
        if (!DeviceProperties.isTablet(requireContext())) {
            return 0;
        }
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        int i = PlayerControlViewExternalSyntheticLambda1.read(contextRequireContext);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        return i - (buildandpreparesamplestreamwrappers.onPlayFromUri.getWidth() << 1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.onCommand.IconCompatParcelizer().clearAnimation();
        super.onDestroyView();
        setActiveSelection setactiveselection = this.AudioAttributesImplApi21Parcelizer;
        if (setactiveselection != null) {
            setactiveselection.dismiss();
        }
        onAddQueueItem();
    }

    private final void onAddQueueItem() {
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlay() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.onPlayFromSearch.setChecked(false);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers3 = null;
        }
        TextView textView = buildandpreparesamplestreamwrappers3.onSeekTo;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String string = getString(R.string.concise_mode);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{"OFF"}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        textView.setText(str);
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        int color = shouldEscapeCharacter.Companion.read(contextRequireContext, R.attr.backgroundColor, new TypedValue(), true);
        if (color == 0) {
            color = _isNaN.getColor(requireContext(), R.color.bg_no_guess);
        }
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = this.read;
        if (buildandpreparesamplestreamwrappers4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers4 = null;
        }
        buildandpreparesamplestreamwrappers4.onMediaButtonEvent.setBackgroundColor(color);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = this.read;
        if (buildandpreparesamplestreamwrappers5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers5 = null;
        }
        SwitchMaterial switchMaterial = buildandpreparesamplestreamwrappers5.onPlayFromSearch;
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        switchMaterial.setTrackTintList(ColorStateList.valueOf(shouldEscapeCharacter.Companion.read(contextRequireContext2, R.attr.onSurfaceBgOutline, new TypedValue(), true)));
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers6 = this.read;
        if (buildandpreparesamplestreamwrappers6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers6;
        }
        SwitchMaterial switchMaterial2 = buildandpreparesamplestreamwrappers2.onPlayFromSearch;
        shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext3 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
        switchMaterial2.setThumbTintList(ColorStateList.valueOf(shouldEscapeCharacter.Companion.read(contextRequireContext3, R.attr.onBackgroundSurface5, new TypedValue(), true)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlayFromMediaId() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.onPlayFromSearch.setChecked(true);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers3 = null;
        }
        TextView textView = buildandpreparesamplestreamwrappers3.onSeekTo;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String string = getString(R.string.concise_mode);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{"ON"}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        textView.setText(str);
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        int color = shouldEscapeCharacter.Companion.read(contextRequireContext, R.attr.colorSurfaceVariant13, new TypedValue(), true);
        if (color == 0) {
            color = _isNaN.getColor(requireContext(), R.color.sepia80);
        }
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = this.read;
        if (buildandpreparesamplestreamwrappers4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers4 = null;
        }
        buildandpreparesamplestreamwrappers4.onMediaButtonEvent.setBackgroundColor(color);
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = this.read;
        if (buildandpreparesamplestreamwrappers5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers5 = null;
        }
        SwitchMaterial switchMaterial = buildandpreparesamplestreamwrappers5.onPlayFromSearch;
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        switchMaterial.setTrackTintList(ColorStateList.valueOf(shouldEscapeCharacter.Companion.read(contextRequireContext2, R.attr.onBackgroundVariant2, new TypedValue(), true)));
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers6 = this.read;
        if (buildandpreparesamplestreamwrappers6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers6;
        }
        SwitchMaterial switchMaterial2 = buildandpreparesamplestreamwrappers2.onPlayFromSearch;
        shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext3 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
        switchMaterial2.setThumbTintList(ColorStateList.valueOf(shouldEscapeCharacter.Companion.read(contextRequireContext3, R.attr.onSurfaceBlue3, new TypedValue(), true)));
    }

    private final boolean RatingCompat() {
        return requireActivity().getResources().getConfiguration().orientation != 2;
    }

    private final boolean MediaBrowserCompatSearchResultReceiver() {
        return DeviceProperties.isTablet(requireContext());
    }

    private final void AudioAttributesCompatParcelizer() {
        getChildFragmentManager().IconCompatParcelizer(SmsRetrieverStatusCodes.RemoteActionCompatParcelizer.getWrite(), getViewLifecycleOwner(), new setTabTextColors(this));
        getChildFragmentManager().IconCompatParcelizer("cadaveric_sheet_dismiss", getViewLifecycleOwner(), new _addFields() { // from class: o.setRawInputType
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                setScrollPosition.IconCompatParcelizer(this.IconCompatParcelizer, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(setScrollPosition setscrollposition, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("positive_key_press")) {
            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.MediaDescriptionCompat.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(setScrollPosition setscrollposition, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("explore_clicked", false)) {
            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.RatingCompat.INSTANCE);
        }
    }

    private final void MediaMetadataCompat() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = null;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.onPrepareFromUri.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setBoxCornerRadii
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition._init_lambda3(this.IconCompatParcelizer);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
        if (buildandpreparesamplestreamwrappers3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers3 = null;
        }
        buildandpreparesamplestreamwrappers3.onRemoveQueueItem.setOnClickListener(new View.OnClickListener() { // from class: o.setTabIndicatorFullWidth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition._init_lambda2(this.read);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers4 = this.read;
        if (buildandpreparesamplestreamwrappers4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers4 = null;
        }
        buildandpreparesamplestreamwrappers4.onSetCaptioningEnabled.setOnClickListener(new View.OnClickListener() { // from class: o.setTabsFromPagerAdapter
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.getOnBackPressedDispatcherannotations(this.write);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers5 = this.read;
        if (buildandpreparesamplestreamwrappers5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers5 = null;
        }
        buildandpreparesamplestreamwrappers5.onPrepareFromUri.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setUnboundedRipple
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.addMenuProvider(this.write);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers6 = this.read;
        if (buildandpreparesamplestreamwrappers6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers6 = null;
        }
        buildandpreparesamplestreamwrappers6.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setupWithViewPager
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.addOnMultiWindowModeChangedListener(this.read);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers7 = this.read;
        if (buildandpreparesamplestreamwrappers7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers7 = null;
        }
        buildandpreparesamplestreamwrappers7.onPlayFromSearch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.MaterialAutoCompleteTextView
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                setScrollPosition.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, z);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers8 = this.read;
        if (buildandpreparesamplestreamwrappers8 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers8 = null;
        }
        buildandpreparesamplestreamwrappers8.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.TabLayoutTabView
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.addOnContextAvailableListener(this.AudioAttributesCompatParcelizer);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers9 = this.read;
        if (buildandpreparesamplestreamwrappers9 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers9 = null;
        }
        buildandpreparesamplestreamwrappers9.MediaMetadataCompat.setOnClickListener(new View.OnClickListener() { // from class: o.setDropDownBackgroundDrawable
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.addOnNewIntentListener(this.IconCompatParcelizer);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers10 = this.read;
        if (buildandpreparesamplestreamwrappers10 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers10 = null;
        }
        buildandpreparesamplestreamwrappers10.onPrepareFromUri.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setSimpleItemSelectedColor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.addOnConfigurationChangedListener(this.write);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers11 = this.read;
        if (buildandpreparesamplestreamwrappers11 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers11 = null;
        }
        buildandpreparesamplestreamwrappers11.onCommand.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.setSimpleItemSelectedRippleColor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.addOnPictureInPictureModeChangedListener(this.IconCompatParcelizer);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers12 = this.read;
        if (buildandpreparesamplestreamwrappers12 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers12 = null;
        }
        buildandpreparesamplestreamwrappers12.onPlayFromMediaId.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.setBoxBackgroundColorStateList
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition._init_lambda5(this.RemoteActionCompatParcelizer);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers13 = this.read;
        if (buildandpreparesamplestreamwrappers13 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers13 = null;
        }
        buildandpreparesamplestreamwrappers13.onCommand.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setBoxStrokeColorStateList
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition._init_lambda4(this.write);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers14 = this.read;
        if (buildandpreparesamplestreamwrappers14 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers14 = null;
        }
        buildandpreparesamplestreamwrappers14.onSetShuffleMode.setOnClickListener(new View.OnClickListener() { // from class: o.setBoxStrokeErrorColor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.accessensureViewModelStore(this.AudioAttributesCompatParcelizer);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers15 = this.read;
        if (buildandpreparesamplestreamwrappers15 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers15 = null;
        }
        buildandpreparesamplestreamwrappers15.onPlayFromUri.setOnClickListener(new View.OnClickListener() { // from class: o.setBoxCornerRadiiResources
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.accessaddObserverForBackInvoker(this.RemoteActionCompatParcelizer);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers16 = this.read;
        if (buildandpreparesamplestreamwrappers16 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers16 = null;
        }
        buildandpreparesamplestreamwrappers16.onAddQueueItem.setOnClickListener(new View.OnClickListener() { // from class: o.setBoxStrokeColor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.accessgetReportFullyDrawnExecutorp(this.RemoteActionCompatParcelizer);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers17 = this.read;
        if (buildandpreparesamplestreamwrappers17 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers17 = null;
        }
        buildandpreparesamplestreamwrappers17.onRewind.setOnClickListener(new View.OnClickListener() { // from class: o.setTabIconTint
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.accessonBackPresseds1027565324(this.AudioAttributesCompatParcelizer);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers18 = this.read;
        if (buildandpreparesamplestreamwrappers18 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers18 = null;
        }
        buildandpreparesamplestreamwrappers18.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.setSelectedTabIndicatorColor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.ensureViewModelStore(this.write);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers19 = this.read;
        if (buildandpreparesamplestreamwrappers19 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers19 = null;
        }
        buildandpreparesamplestreamwrappers19.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.setTabMode
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.createFullyDrawnExecutor(this.RemoteActionCompatParcelizer);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers20 = this.read;
        if (buildandpreparesamplestreamwrappers20 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers20 = null;
        }
        buildandpreparesamplestreamwrappers20.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.setTabRippleColor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.addObserverForBackInvoker(this.read);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers21 = this.read;
        if (buildandpreparesamplestreamwrappers21 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers21 = null;
        }
        buildandpreparesamplestreamwrappers21.MediaBrowserCompatMediaItem.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.setTabIconTintResource
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.addObserverForBackInvokerlambda7(this.AudioAttributesCompatParcelizer);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers22 = this.read;
        if (buildandpreparesamplestreamwrappers22 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers22 = null;
        }
        buildandpreparesamplestreamwrappers22.onCustomAction.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.setTabIndicatorAnimationMode
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.menuHostHelperlambda0(this.read);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers23 = this.read;
        if (buildandpreparesamplestreamwrappers23 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers23 = null;
        }
        buildandpreparesamplestreamwrappers23.AudioAttributesImplBaseParcelizer.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.setUnboundedRippleResource
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setScrollPosition.getSavedStateRegistryControllerannotations(this.write);
            }
        });
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers24 = this.read;
        if (buildandpreparesamplestreamwrappers24 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparesamplestreamwrappers2 = buildandpreparesamplestreamwrappers24;
        }
        buildandpreparesamplestreamwrappers2.onPrepare.post(new Runnable() { // from class: o.setTabRippleColorResource
            @Override // java.lang.Runnable
            public final void run() {
                setScrollPosition.addContentView(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_lambda3(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.AudioAttributesImplApi21Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_lambda2(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.AudioAttributesImplBaseParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnBackPressedDispatcherannotations(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onPrepareFromMediaId.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addMenuProvider(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.AudioAttributesImplApi26Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMultiWindowModeChangedListener(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onPlayFromSearch.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(setScrollPosition setscrollposition, boolean z) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(new TransformationChildCard.MediaBrowserCompatItemReceiver(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnContextAvailableListener(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.write.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnNewIntentListener(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnConfigurationChangedListener(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.AudioAttributesImplApi21Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnPictureInPictureModeChangedListener(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onPrepareFromSearch.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_lambda5(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onPrepareFromSearch.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_lambda4(setScrollPosition setscrollposition) {
        setscrollposition.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void accessensureViewModelStore(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onPause.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void accessaddObserverForBackInvoker(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onPause.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void accessgetReportFullyDrawnExecutorp(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onPause.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void accessonBackPresseds1027565324(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.handleMediaPlayPauseIfPendingOnHandler.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureViewModelStore(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createFullyDrawnExecutor(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onPlayFromMediaId.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvokerlambda7(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onPlayFromMediaId.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuHostHelperlambda0(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onMediaButtonEvent.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSavedStateRegistryControllerannotations(setScrollPosition setscrollposition) {
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.onMediaButtonEvent.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addContentView(final setScrollPosition setscrollposition) {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = setscrollposition.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        buildandpreparesamplestreamwrappers.onPrepare.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.setBoxCollapsedPaddingTop
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                setScrollPosition.write(this.IconCompatParcelizer, i2, i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(setScrollPosition setscrollposition, int i, int i2) {
        if (!setscrollposition.AudioAttributesImplBaseParcelizer) {
            setscrollposition.AudioAttributesImplBaseParcelizer = true;
        } else {
            setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(new TransformationChildCard.MediaMetadataCompat(i, i2));
        }
    }

    private final int RemoteActionCompatParcelizer(String p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) getString(R.string.text_default))) {
            return 0;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) getString(R.string.text_last_opened))) {
            return 1;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) getString(R.string.text_most_completed))) {
            return 2;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) getString(R.string.text_least_completed)) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRemoveQueueItemAt() {
        buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = this.read;
        if (buildandpreparesamplestreamwrappers == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparesamplestreamwrappers = null;
        }
        CoordinatorLayout coordinatorLayout = buildandpreparesamplestreamwrappers.onPrepareFromSearch;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(coordinatorLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(coordinatorLayout);
        Snackbar snackbar = this.AudioAttributesCompatParcelizer;
        if (snackbar == null || !snackbar.write()) {
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers2 = this.read;
            if (buildandpreparesamplestreamwrappers2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers2 = null;
            }
            Snackbar snackbarIconCompatParcelizer = Snackbar.IconCompatParcelizer(buildandpreparesamplestreamwrappers2.onPrepareFromSearch, "", -2);
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers3 = this.read;
            if (buildandpreparesamplestreamwrappers3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers3 = null;
            }
            Snackbar snackbarAudioAttributesImplApi21Parcelizer = snackbarIconCompatParcelizer.IconCompatParcelizer(buildandpreparesamplestreamwrappers3.onPrepareFromSearch).AudioAttributesImplApi21Parcelizer(_isNaN.getColor(requireContext(), R.color.app_bg));
            snackbarAudioAttributesImplApi21Parcelizer.IconCompatParcelizer().setBackground(_isNaN.getDrawable(requireContext(), R.drawable.round_corner_snackbar));
            snackbarAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(new handleMediaPlayPauseIfPendingOnHandler());
            this.AudioAttributesCompatParcelizer = snackbarAudioAttributesImplApi21Parcelizer;
            View viewInflate = getLayoutInflater().inflate(R.layout.layout_snackbar_pyt, (ViewGroup) null);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
            Snackbar snackbar2 = this.AudioAttributesCompatParcelizer;
            View viewIconCompatParcelizer = snackbar2 != null ? snackbar2.IconCompatParcelizer() : null;
            toMagicModuleMetaRepoModel.read(viewIconCompatParcelizer, "");
            Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) viewIconCompatParcelizer;
            snackbarLayout.addView(viewInflate);
            Snackbar snackbar3 = this.AudioAttributesCompatParcelizer;
            if (snackbar3 != null) {
                snackbar3.AudioAttributesImplApi21Parcelizer();
            }
            ((TextView) snackbarLayout.findViewById(R.id.tvGotIt)).setOnClickListener(new View.OnClickListener() { // from class: o.setSelectedTabIndicatorGravity
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setScrollPosition.addOnTrimMemoryListener(this.read);
                }
            });
        }
    }

    public static final class handleMediaPlayPauseIfPendingOnHandler extends Snackbar.AudioAttributesCompatParcelizer {
        handleMediaPlayPauseIfPendingOnHandler() {
        }

        @Override // com.google.android.material.snackbar.Snackbar.AudioAttributesCompatParcelizer, com.google.android.material.snackbar.BaseTransientBottomBar.AudioAttributesCompatParcelizer
        public final /* synthetic */ void write(Snackbar snackbar) {
            RemoteActionCompatParcelizer();
        }

        @Override // com.google.android.material.snackbar.Snackbar.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
            buildAndPrepareSampleStreamWrappers buildandpreparesamplestreamwrappers = setScrollPosition.this.read;
            if (buildandpreparesamplestreamwrappers == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparesamplestreamwrappers = null;
            }
            CoordinatorLayout coordinatorLayout = buildandpreparesamplestreamwrappers.onPrepareFromSearch;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(coordinatorLayout, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(coordinatorLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnTrimMemoryListener(setScrollPosition setscrollposition) {
        Snackbar snackbar = setscrollposition.AudioAttributesCompatParcelizer;
        if (snackbar != null) {
            snackbar.RemoteActionCompatParcelizer();
        }
        setscrollposition.MediaBrowserCompatItemReceiver().IconCompatParcelizer(TransformationChildCard.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(int p0) {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String string = getString(R.string.video_deleted_message);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(p0)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        String string2 = getString(R.string.btn_ok);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        getAutofillClient.Companion.AudioAttributesCompatParcelizer("", str, string2, null, 0, null, false, false, null, TarConstants.SPARSELEN_GNU_SPARSE).show(getChildFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRemoveQueueItem() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.video_for_paid_user);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.view_plans);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.go_back);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, string, string2, string3, 0, SmsRetrieverStatusCodes.RemoteActionCompatParcelizer, false, false, null, 465).show(getChildFragmentManager(), (String) null);
    }
}
