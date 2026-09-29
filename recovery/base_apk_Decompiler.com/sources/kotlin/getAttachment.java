package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionSet;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.AppThemeManager;
import com.marrow2.ui.main.viewmodel.HomeSharedViewModel;
import com.marrow2.ui.practical_corner.PracticalCornerLandingViewModel;
import java.util.List;
import kotlin.ActivityC0259zzaz;
import kotlin.BrowserPublicKeyCredentialCreationOptions;
import kotlin.DataBufferRef;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.getClientDataHash;
import kotlin.getMethodTimingTelemetryEnabled;
import kotlin.getPublicKeyCredentialCreationOptions;
import kotlin.getRequireResidentKey;
import kotlin.maybeSignOut;
import kotlin.onDataRangeMoved;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0013\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u001d\u0010\u001d\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u0003J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020%H\u0002¢\u0006\u0004\b\u001d\u0010&J\u001d\u0010\u0015\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020'0\u001bH\u0002¢\u0006\u0004\b\u0015\u0010\u001eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0014\u0010#\u001a\u00020(8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010*R\u001b\u0010\u0013\u001a\u00020+8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b\u0013\u0010-R\u001b\u00100\u001a\u00020.8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b\u001d\u0010/R\u0018\u0010\u001d\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00102R\u0018\u0010\u0011\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u00104R\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006*\u00020606058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u00107"}, d2 = {"Lo/getAttachment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesImplApi21Parcelizer", "", "AudioAttributesCompatParcelizer", "(Z)V", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "", "(I)V", "onResume", "MediaMetadataCompat", "", "Lo/getApiFallbackAttributionTag;", "write", "(Ljava/util/List;)V", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "", "read", "(Ljava/lang/String;Ljava/lang/String;)V", "Lo/setMapper;", "(Lo/setMapper;)V", "Lo/getPublicKeyCredentialCreationOptions$read;", "Lo/HlsChunkSourceInitializationTrackSelection;", "Lo/HlsChunkSourceInitializationTrackSelection;", "()Lo/HlsChunkSourceInitializationTrackSelection;", "Lcom/marrow2/ui/practical_corner/PracticalCornerLandingViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/practical_corner/PracticalCornerLandingViewModel;", "Lcom/marrow2/ui/main/viewmodel/HomeSharedViewModel;", "()Lcom/marrow2/ui/main/viewmodel/HomeSharedViewModel;", "IconCompatParcelizer", "Lo/getTransports;", "Lo/getTransports;", "Lo/getKeyHandle;", "Lo/getKeyHandle;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getAttachment extends AuthenticatorResponse {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private HlsChunkSourceInitializationTrackSelection RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getTransports write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getKeyHandle AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> MediaBrowserCompatCustomActionResultReceiver;

    public getAttachment() {
        getAttachment getattachment = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass9(new AnonymousClass3(getattachment)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(PracticalCornerLandingViewModel.class), new AnonymousClass10(renewEligibleWrite), new AnonymousClass7(renewEligibleWrite), new AnonymousClass8(getattachment, renewEligibleWrite));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(HomeSharedViewModel.class), new AnonymousClass1(getattachment), new AnonymousClass4(getattachment), new AnonymousClass5(getattachment));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.setRequireResidentKey
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                getAttachment.write(this.IconCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.MediaBrowserCompatCustomActionResultReceiver = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HlsChunkSourceInitializationTrackSelection read() {
        HlsChunkSourceInitializationTrackSelection hlsChunkSourceInitializationTrackSelection = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(hlsChunkSourceInitializationTrackSelection);
        return hlsChunkSourceInitializationTrackSelection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PracticalCornerLandingViewModel AudioAttributesCompatParcelizer() {
        return (PracticalCornerLandingViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeSharedViewModel write() {
        return (HomeSharedViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getAttachment getattachment, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        getattachment.AudioAttributesCompatParcelizer().read(BrowserPublicKeyCredentialCreationOptions.IconCompatParcelizer.INSTANCE);
        getattachment.write().RemoteActionCompatParcelizer(DataBufferRef.write.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = HlsChunkSourceInitializationTrackSelection.RemoteActionCompatParcelizer(p0, p1);
        RemoteActionCompatParcelizer();
        ConstraintLayout constraintLayoutIconCompatParcelizer = read().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        read().IconCompatParcelizer.setOnScrollChangeListener((NestedScrollView.write) null);
        this.RemoteActionCompatParcelizer = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write().RemoteActionCompatParcelizer(new DataBufferRef.MediaBrowserCompatCustomActionResultReceiver(getApiOptions.IconCompatParcelizer));
        HomeSharedViewModel homeSharedViewModelWrite = write();
        maybeSignOut.write writeVar = maybeSignOut.read;
        maybeGetTypeVariable maybegettypevariableRequireActivity = requireActivity();
        zabz zabzVar = maybegettypevariableRequireActivity instanceof zabz ? (zabz) maybegettypevariableRequireActivity : null;
        homeSharedViewModelWrite.RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplBaseParcelizer(maybeSignOut.write.write(-(zabzVar != null ? zabzVar.MediaBrowserCompatMediaItem() : 0))));
        read().RemoteActionCompatParcelizer.setTransitionName("zenContainer");
        childArray.RemoteActionCompatParcelizer(p0, new Runnable() { // from class: o.getAttachment.2
            @Override // java.lang.Runnable
            public final void run() {
                this.startPostponedEnterTransition();
            }
        });
        if (AppThemeManager.write()) {
            read().RemoteActionCompatParcelizer.setBackgroundResource(R.drawable.bg_practical_corner_zen_area_gradient_dark);
            read().RemoteActionCompatParcelizer.setImageResource(R.drawable.ic_practical_corner_zen_are_pattern_dark);
        } else {
            read().RemoteActionCompatParcelizer.setBackgroundResource(R.drawable.bg_practical_corner_zen_area_gradient);
            read().RemoteActionCompatParcelizer.setImageResource(R.drawable.ic_practical_corner_zen_are_pattern);
        }
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplBaseParcelizer();
        read().IconCompatParcelizer.setOnScrollChangeListener(new NestedScrollView.write() { // from class: o.getResidentKeyRequirementAsString
            @Override // androidx.core.widget.NestedScrollView.write
            public final void read(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                getAttachment.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, nestedScrollView, i2);
            }
        });
        AudioAttributesImplApi26Parcelizer();
        MediaMetadataCompat();
        AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: renamed from: o.getAttachment$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "AudioAttributesCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.getAttachment$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "RemoteActionCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(getAttachment getattachment, NestedScrollView nestedScrollView, int i) {
        toMagicModuleMetaRepoModel.write(nestedScrollView, "");
        getattachment.AudioAttributesCompatParcelizer(i);
    }

    /* JADX INFO: renamed from: o.getAttachment$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.getAttachment$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
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

    /* JADX INFO: renamed from: o.getAttachment$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplBaseParcelizer = getAttachment.this.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer();
                final getAttachment getattachment = getAttachment.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.getAttachment.RemoteActionCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Boolean) obj2).booleanValue());
                    }

                    private Object write(boolean z) {
                        getattachment.AudioAttributesCompatParcelizer(z);
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
            return getAttachment.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        getAttachment getattachment = this;
        setBitrateKbps.read(getattachment, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(getattachment, new write(null));
        setBitrateKbps.read(getattachment, new IconCompatParcelizer(null));
        setBitrateKbps.read(getattachment, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(getattachment, new AudioAttributesImplApi26Parcelizer(null));
        setBitrateKbps.read(getattachment, new AudioAttributesImplBaseParcelizer(null));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getClientDataHash> setupdatedstatusAudioAttributesCompatParcelizer = getAttachment.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                final getAttachment getattachment = getAttachment.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.getAttachment.write.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((getClientDataHash) obj2);
                    }

                    private Object write(getClientDataHash getclientdatahash) {
                        if (getclientdatahash instanceof getClientDataHash.RemoteActionCompatParcelizer) {
                            getattachment.write(((getClientDataHash.RemoteActionCompatParcelizer) getclientdatahash).IconCompatParcelizer());
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getclientdatahash, getClientDataHash.read.INSTANCE)) {
                            if (getclientdatahash instanceof getClientDataHash.write) {
                                getClientDataHash.write writeVar = (getClientDataHash.write) getclientdatahash;
                                getattachment.read(writeVar.read(), writeVar.RemoteActionCompatParcelizer());
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getclientdatahash, getClientDataHash.IconCompatParcelizer.INSTANCE)) {
                                getattachment.MediaBrowserCompatCustomActionResultReceiver();
                            } else {
                                throw new RenewEligibleCreator();
                            }
                        }
                        getattachment.AudioAttributesCompatParcelizer().read(BrowserPublicKeyCredentialCreationOptions.write.INSTANCE);
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
            return getAttachment.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<getApiFallbackAttributionTag>> setupdatedstatusIconCompatParcelizer = getAttachment.this.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                final getAttachment getattachment = getAttachment.this;
                this.read = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.getAttachment.IconCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((List) obj2);
                    }

                    private Object read(List<? extends getApiFallbackAttributionTag> list) {
                        getattachment.write(list);
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
            return getAttachment.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<getPublicKeyCredentialCreationOptions.read>> setupdatedstatusAudioAttributesImplApi21Parcelizer = getAttachment.this.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer();
                final getAttachment getattachment = getAttachment.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.getAttachment.AudioAttributesCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((List) obj2);
                    }

                    private Object IconCompatParcelizer(List<getPublicKeyCredentialCreationOptions.read> list) {
                        getattachment.RemoteActionCompatParcelizer(list);
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
            return getAttachment.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Integer> setupdatedstatus = getAttachment.this.AudioAttributesCompatParcelizer().read();
                final getAttachment getattachment = getAttachment.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.getAttachment.AudioAttributesImplApi26Parcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Number) obj2).intValue());
                    }

                    private Object RemoteActionCompatParcelizer(int i2) {
                        TextView textView = getattachment.read().read;
                        CharSequence quantityText = getattachment.getResources().getQuantityText(R.plurals.module_completed, i2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(i2);
                        sb.append(" ");
                        sb.append((Object) quantityText);
                        textView.setText(sb.toString());
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
            return getAttachment.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<onDataRangeMoved> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = getAttachment.this.write().MediaBrowserCompatCustomActionResultReceiver();
                final getAttachment getattachment = getAttachment.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.getAttachment.AudioAttributesImplBaseParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((onDataRangeMoved) obj2);
                    }

                    private Object write(onDataRangeMoved ondatarangemoved) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.AudioAttributesCompatParcelizer.INSTANCE)) {
                            getAttachment getattachment2 = getattachment;
                            getattachment2.AudioAttributesCompatParcelizer(getattachment2.read().IconCompatParcelizer.getScrollY());
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.IconCompatParcelizer.INSTANCE)) {
                            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.write.INSTANCE) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangemoved, onDataRangeMoved.RemoteActionCompatParcelizer.INSTANCE) && !(ondatarangemoved instanceof onDataRangeMoved.read)) {
                                throw new RenewEligibleCreator();
                            }
                            return getShowPopup.INSTANCE;
                        }
                        getattachment.write().RemoteActionCompatParcelizer(DataBufferRef.IconCompatParcelizer.INSTANCE);
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
            return getAttachment.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getAttachment$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$IconCompatParcelizer.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.getAttachment$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$AudioAttributesCompatParcelizer.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.getAttachment$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$AudioAttributesCompatParcelizer.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(boolean p0) {
        RecyclerView recyclerView = read().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        recyclerView.setVisibility(!p0 ? 0 : 8);
        RecyclerView recyclerView2 = read().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
        recyclerView2.setVisibility(p0 ? 8 : 0);
    }

    private final void RemoteActionCompatParcelizer() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.IconCompatParcelizer(new ChangeBounds());
        transitionSet.RemoteActionCompatParcelizer(100L);
        setSharedElementEnterTransition(transitionSet);
        setSharedElementReturnTransition(transitionSet);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            RecyclerView recyclerView = read().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, recyclerView);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            RecyclerView recyclerView2 = read().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext2, recyclerView2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(int p0) {
        zabz zabzVar;
        if (p0 > 200) {
            read().RemoteActionCompatParcelizer.setVisibility(8);
            HomeSharedViewModel homeSharedViewModelWrite = write();
            maybeSignOut.write writeVar = maybeSignOut.read;
            maybeGetTypeVariable maybegettypevariableRequireActivity = requireActivity();
            zabzVar = maybegettypevariableRequireActivity instanceof zabz ? (zabz) maybegettypevariableRequireActivity : null;
            homeSharedViewModelWrite.RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplBaseParcelizer(maybeSignOut.write.RemoteActionCompatParcelizer(-(zabzVar != null ? zabzVar.MediaBrowserCompatMediaItem() : 0))));
            return;
        }
        read().RemoteActionCompatParcelizer.setVisibility(0);
        HomeSharedViewModel homeSharedViewModelWrite2 = write();
        maybeSignOut.write writeVar2 = maybeSignOut.read;
        maybeGetTypeVariable maybegettypevariableRequireActivity2 = requireActivity();
        zabzVar = maybegettypevariableRequireActivity2 instanceof zabz ? (zabz) maybegettypevariableRequireActivity2 : null;
        homeSharedViewModelWrite2.RemoteActionCompatParcelizer(new DataBufferRef.AudioAttributesImplBaseParcelizer(maybeSignOut.write.write(-(zabzVar != null ? zabzVar.MediaBrowserCompatMediaItem() : 0))));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AudioAttributesCompatParcelizer(read().IconCompatParcelizer.getScrollY());
        View view = getView();
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        AudioAttributesImplApi26Parcelizer();
    }

    private final void MediaMetadataCompat() {
        HlsChunkSourceInitializationTrackSelection hlsChunkSourceInitializationTrackSelection = read();
        RecyclerView recyclerView = hlsChunkSourceInitializationTrackSelection.write;
        recyclerView.setTranslationY(400.0f);
        recyclerView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        RecyclerView recyclerView2 = hlsChunkSourceInitializationTrackSelection.AudioAttributesCompatParcelizer;
        recyclerView2.setTranslationX(800.0f);
        recyclerView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        hlsChunkSourceInitializationTrackSelection.write.animate().translationY(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setDuration(200L).start();
        hlsChunkSourceInitializationTrackSelection.AudioAttributesCompatParcelizer.animate().translationX(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setDuration(600L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(List<? extends getApiFallbackAttributionTag> p0) {
        getKeyHandle getkeyhandle = this.AudioAttributesImplApi21Parcelizer;
        if (getkeyhandle != null) {
            getkeyhandle.RemoteActionCompatParcelizer(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("PracticalCornerIntroBottomSheet");
        getRequireResidentKey getrequireresidentkeyWrite = fragmentFindFragmentByTag instanceof getRequireResidentKey ? (getRequireResidentKey) fragmentFindFragmentByTag : null;
        if (getrequireresidentkeyWrite == null) {
            getRequireResidentKey.Companion companion = getRequireResidentKey.INSTANCE;
            getrequireresidentkeyWrite = getRequireResidentKey.Companion.write();
        }
        getrequireresidentkeyWrite.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.AuthenticatorSelectionCriteria
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getAttachment.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
            }
        });
        getrequireresidentkeyWrite.show(getChildFragmentManager(), "PracticalCornerIntroBottomSheet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(getAttachment getattachment) {
        getattachment.AudioAttributesCompatParcelizer().read(BrowserPublicKeyCredentialCreationOptions.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatItemReceiver() {
        getContext();
        read().AudioAttributesCompatParcelizer.setLayoutManager(new LinearLayoutManager(1, false));
        this.write = new getTransports(new getAnswerMap() { // from class: o.setAttachment
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getAttachment.write(this.AudioAttributesCompatParcelizer, (BrowserPublicKeyCredentialCreationOptions) obj);
            }
        });
        read().AudioAttributesCompatParcelizer.setAdapter(this.write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getAttachment getattachment, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        toMagicModuleMetaRepoModel.write(browserPublicKeyCredentialCreationOptions, "");
        getattachment.AudioAttributesCompatParcelizer().read(browserPublicKeyCredentialCreationOptions);
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesImplBaseParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = new getKeyHandle(new getAnswerMap() { // from class: o.setResidentKeyRequirement
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getAttachment.read(this.AudioAttributesCompatParcelizer, (BrowserPublicKeyCredentialCreationOptions) obj);
            }
        });
        read().write.setAdapter(this.AudioAttributesImplApi21Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getAttachment getattachment, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        toMagicModuleMetaRepoModel.write(browserPublicKeyCredentialCreationOptions, "");
        getattachment.AudioAttributesCompatParcelizer().read(browserPublicKeyCredentialCreationOptions);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0, String p1) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.MediaBrowserCompatCustomActionResultReceiver;
        ActivityC0259zzaz.Companion companion = ActivityC0259zzaz.INSTANCE;
        Context context = read().IconCompatParcelizer().getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(ActivityC0259zzaz.Companion.RemoteActionCompatParcelizer(context, new isCompatible(0, p0, p1, Integer.valueOf(RepeatModeUtil.read.getWrite()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(setMapper p0) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.MediaBrowserCompatCustomActionResultReceiver;
        getMethodTimingTelemetryEnabled.Companion companion = getMethodTimingTelemetryEnabled.INSTANCE;
        Context context = read().IconCompatParcelizer().getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        String strWrite = p0.write();
        String strMediaBrowserCompatItemReceiver = p0.MediaBrowserCompatItemReceiver();
        String strRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
        String string = getString(R.string.f_module_info, p0.AudioAttributesImplApi26Parcelizer(), Integer.valueOf(p0.read()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(getMethodTimingTelemetryEnabled.Companion.write(context, new getExtraArgs(strMediaBrowserCompatItemReceiver, strWrite, strRemoteActionCompatParcelizer, string, p0.AudioAttributesImplApi21Parcelizer(), p0.IconCompatParcelizer())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(List<getPublicKeyCredentialCreationOptions.read> p0) {
        getTransports gettransports;
        RecyclerView recyclerView = read().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        List<getPublicKeyCredentialCreationOptions.read> list = p0;
        recyclerView.setVisibility(!list.isEmpty() ? 0 : 8);
        if (list.isEmpty() || (gettransports = this.write) == null) {
            return;
        }
        gettransports.AudioAttributesCompatParcelizer(p0);
    }

    /* JADX INFO: renamed from: o.getAttachment$read, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/getAttachment$read;", "", "<init>", "()V", "Lo/getAttachment;", "read", "()Lo/getAttachment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static getAttachment read() {
            return new getAttachment();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
