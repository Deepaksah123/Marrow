package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow2.ui.feedback.viewmodel.ThankYouForFeedbackViewModel;
import kotlin.ConnectionResult;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.isTabCtrlCode;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0013\u001a\u00020\u00178CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/setAllowableAccountsTypes;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "MediaBrowserCompatCustomActionResultReceiver", "write", "read", "RemoteActionCompatParcelizer", "Lo/buildAndPrepareMainSampleStreamWrapper;", "IconCompatParcelizer", "Lo/buildAndPrepareMainSampleStreamWrapper;", "Lcom/marrow2/ui/feedback/viewmodel/ThankYouForFeedbackViewModel;", "Lo/RenewEligible;", "AudioAttributesCompatParcelizer", "()Lcom/marrow2/ui/feedback/viewmodel/ThankYouForFeedbackViewModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setAllowableAccountsTypes extends onNotificationDismissed {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private buildAndPrepareMainSampleStreamWrapper IconCompatParcelizer;
    private final RenewEligible RemoteActionCompatParcelizer;

    public setAllowableAccountsTypes() {
        setAllowableAccountsTypes setallowableaccountstypes = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass5(setallowableaccountstypes)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(ThankYouForFeedbackViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass2(setallowableaccountstypes, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThankYouForFeedbackViewModel AudioAttributesCompatParcelizer() {
        return (ThankYouForFeedbackViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        buildAndPrepareMainSampleStreamWrapper buildandpreparemainsamplestreamwrapperAudioAttributesCompatParcelizer = buildAndPrepareMainSampleStreamWrapper.AudioAttributesCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(buildandpreparemainsamplestreamwrapperAudioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer = buildandpreparemainsamplestreamwrapperAudioAttributesCompatParcelizer;
        if (buildandpreparemainsamplestreamwrapperAudioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparemainsamplestreamwrapperAudioAttributesCompatParcelizer = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = buildandpreparemainsamplestreamwrapperAudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        MediaBrowserCompatCustomActionResultReceiver();
        write();
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            buildAndPrepareMainSampleStreamWrapper buildandpreparemainsamplestreamwrapper = this.IconCompatParcelizer;
            if (buildandpreparemainsamplestreamwrapper == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                buildandpreparemainsamplestreamwrapper = null;
            }
            ConstraintLayout constraintLayout = buildandpreparemainsamplestreamwrapper.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext, constraintLayout);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getErrorResolutionPendingIntent> setupdatedstatusAudioAttributesCompatParcelizer = setAllowableAccountsTypes.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                final setAllowableAccountsTypes setallowableaccountstypes = setAllowableAccountsTypes.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.setAllowableAccountsTypes.RemoteActionCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((getErrorResolutionPendingIntent) obj2);
                    }

                    private Object write(getErrorResolutionPendingIntent geterrorresolutionpendingintent) {
                        if (geterrorresolutionpendingintent.getWrite()) {
                            setallowableaccountstypes.RemoteActionCompatParcelizer();
                        }
                        if (geterrorresolutionpendingintent.getRemoteActionCompatParcelizer()) {
                            setallowableaccountstypes.read();
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setAllowableAccountsTypes.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void write() {
        setBitrateKbps.read(this, new RemoteActionCompatParcelizer(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read() {
        buildAndPrepareMainSampleStreamWrapper buildandpreparemainsamplestreamwrapper = this.IconCompatParcelizer;
        buildAndPrepareMainSampleStreamWrapper buildandpreparemainsamplestreamwrapper2 = null;
        if (buildandpreparemainsamplestreamwrapper == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparemainsamplestreamwrapper = null;
        }
        onDraw.IconCompatParcelizer((View) buildandpreparemainsamplestreamwrapper.AudioAttributesCompatParcelizer, 0, 300);
        buildAndPrepareMainSampleStreamWrapper buildandpreparemainsamplestreamwrapper3 = this.IconCompatParcelizer;
        if (buildandpreparemainsamplestreamwrapper3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparemainsamplestreamwrapper2 = buildandpreparemainsamplestreamwrapper3;
        }
        buildandpreparemainsamplestreamwrapper2.AudioAttributesCompatParcelizer.postDelayed(new Runnable() { // from class: o.setAllowableAccounts
            @Override // java.lang.Runnable
            public final void run() {
                setAllowableAccountsTypes.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
            }
        }, 900L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(setAllowableAccountsTypes setallowableaccountstypes) {
        getProvider getprovider = getProvider.getInstance(setallowableaccountstypes.requireContext());
        isTabCtrlCode.Companion companion = isTabCtrlCode.INSTANCE;
        getprovider.AudioAttributesCompatParcelizer(isTabCtrlCode.Companion.read());
        setallowableaccountstypes.requireActivity().setResult(-1);
        setallowableaccountstypes.requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer() {
        buildAndPrepareMainSampleStreamWrapper buildandpreparemainsamplestreamwrapper = this.IconCompatParcelizer;
        buildAndPrepareMainSampleStreamWrapper buildandpreparemainsamplestreamwrapper2 = null;
        if (buildandpreparemainsamplestreamwrapper == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparemainsamplestreamwrapper = null;
        }
        buildandpreparemainsamplestreamwrapper.read.setMinProgress(0.05f);
        buildAndPrepareMainSampleStreamWrapper buildandpreparemainsamplestreamwrapper3 = this.IconCompatParcelizer;
        if (buildandpreparemainsamplestreamwrapper3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparemainsamplestreamwrapper3 = null;
        }
        buildandpreparemainsamplestreamwrapper3.read.setMaxProgress(0.5f);
        setForegroundServiceBehavior setforegroundservicebehavior = setForegroundServiceBehavior.INSTANCE;
        buildAndPrepareMainSampleStreamWrapper buildandpreparemainsamplestreamwrapper4 = this.IconCompatParcelizer;
        if (buildandpreparemainsamplestreamwrapper4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            buildandpreparemainsamplestreamwrapper4 = null;
        }
        LottieAnimationView lottieAnimationView = buildandpreparemainsamplestreamwrapper4.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lottieAnimationView, "");
        LottieAnimationView lottieAnimationView2 = lottieAnimationView;
        buildAndPrepareMainSampleStreamWrapper buildandpreparemainsamplestreamwrapper5 = this.IconCompatParcelizer;
        if (buildandpreparemainsamplestreamwrapper5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildandpreparemainsamplestreamwrapper2 = buildandpreparemainsamplestreamwrapper5;
        }
        LottieAnimationView lottieAnimationView3 = buildandpreparemainsamplestreamwrapper2.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lottieAnimationView3, "");
        setForegroundServiceBehavior.read(lottieAnimationView2, lottieAnimationView3, new Runnable() { // from class: o.setOptionsForAddingAccount
            @Override // java.lang.Runnable
            public final void run() {
                setAllowableAccountsTypes.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(setAllowableAccountsTypes setallowableaccountstypes) {
        if (setallowableaccountstypes.requireActivity().isFinishing()) {
            return;
        }
        setallowableaccountstypes.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(ConnectionResult.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: renamed from: o.setAllowableAccountsTypes$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setAllowableAccountsTypes$read;", "", "<init>", "()V", "Lo/setAllowableAccountsTypes;", "write", "()Lo/setAllowableAccountsTypes;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static setAllowableAccountsTypes write() {
            return new setAllowableAccountsTypes();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o.setAllowableAccountsTypes$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.setAllowableAccountsTypes$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.setAllowableAccountsTypes$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setAllowableAccountsTypes$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setAllowableAccountsTypes$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }
}
