package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import com.marrow2.ui.custom_module.introduction.viewmodel.CustomModuleIntroductionViewModel;
import java.util.Locale;
import kotlin.AuthorizationRequestBuilder;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.filterByAuthorizedAccounts;
import kotlin.filterByHostedDomain;
import kotlin.getAutofillClient;
import kotlin.getRpId;
import kotlin.onSingleTapUp;
import kotlin.setAppId;
import kotlin.setCheckedIconEnabled;
import kotlin.setForceApplySystemWindowInsetTop;
import kotlin.setPasskeysSignInRequestOptions;
import kotlin.setPasswordRequestOptions;
import kotlin.setPreferImmediatelyAvailableCredentials;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u0003J\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001aJ\u0019\u0010\u0011\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0011\u0010\u001aJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020&H\u0002¢\u0006\u0004\b\u0011\u0010'J\u001f\u0010 \u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020&H\u0002¢\u0006\u0004\b \u0010(J5\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020)2\b\u0010\u0007\u001a\u0004\u0018\u00010)2\b\u0010\t\u001a\u0004\u0018\u00010\u00182\b\u0010*\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0016\u0010+J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010\u0003J\u0017\u0010.\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0018H\u0002¢\u0006\u0004\b.\u0010\u001aJ\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020/¢\u0006\u0004\b\u0016\u00100J\u000f\u00101\u001a\u00020\rH\u0016¢\u0006\u0004\b1\u0010\u0003R\u0016\u0010\u0016\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u00103R\u001b\u0010\u001b\u001a\u0002048CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u00105\u001a\u0004\b6\u00107R\u0016\u0010 \u001a\u00020&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u00108"}, d2 = {"Lo/filterByHostedDomain;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "MediaMetadataCompat", "write", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatMediaItem", "MediaDescriptionCompat", "", "read", "(J)V", "", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onAddQueueItem", "AudioAttributesImplApi26Parcelizer", "Lo/setPasskeysSignInRequestOptions;", "IconCompatParcelizer", "(Lo/setPasskeysSignInRequestOptions;)V", "onFastForward", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "onPlay", "", "(I)V", "(Ljava/lang/String;I)V", "Lcom/marrow2/data/custom_module/remote/model/FilterParams;", "p3", "(Lcom/marrow2/data/custom_module/remote/model/FilterParams;Lcom/marrow2/data/custom_module/remote/model/FilterParams;Ljava/lang/String;Ljava/lang/String;)V", "onCommand", "RatingCompat", "AudioAttributesCompatParcelizer", "Lo/WorkAccountClient;", "(Lo/WorkAccountClient;)V", "onDestroyView", "Lo/DefaultHlsDataSourceFactory;", "Lo/DefaultHlsDataSourceFactory;", "Lcom/marrow2/ui/custom_module/introduction/viewmodel/CustomModuleIntroductionViewModel;", "Lo/RenewEligible;", "MediaBrowserCompatCustomActionResultReceiver", "()Lcom/marrow2/ui/custom_module/introduction/viewmodel/CustomModuleIntroductionViewModel;", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class filterByHostedDomain extends setGoogleIdTokenRequestOptions {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private DefaultHlsDataSourceFactory read;

    public filterByHostedDomain() {
        filterByHostedDomain filterbyhosteddomain = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass5(filterbyhosteddomain)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleIntroductionViewModel.class), new AnonymousClass4(renewEligibleWrite), new AnonymousClass2(renewEligibleWrite), new AnonymousClass3(filterbyhosteddomain, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleIntroductionViewModel MediaBrowserCompatCustomActionResultReceiver() {
        return (CustomModuleIntroductionViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactoryAudioAttributesCompatParcelizer = DefaultHlsDataSourceFactory.AudioAttributesCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultHlsDataSourceFactoryAudioAttributesCompatParcelizer, "");
        this.read = defaultHlsDataSourceFactoryAudioAttributesCompatParcelizer;
        if (defaultHlsDataSourceFactoryAudioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactoryAudioAttributesCompatParcelizer = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = defaultHlsDataSourceFactoryAudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
        MediaMetadataCompat();
        MediaBrowserCompatSearchResultReceiver();
    }

    private final void MediaMetadataCompat() {
        getChildFragmentManager().IconCompatParcelizer("CustomModuleJoinByCodeDialogSuccessKey", getViewLifecycleOwner(), new _addFields() { // from class: o.getServerAuthCode
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) throws Exception {
                filterByHostedDomain.read(this.IconCompatParcelizer, str, bundle);
            }
        });
        getChildFragmentManager().IconCompatParcelizer("CustomModuleJoinByCodeDialogDismissKey", getViewLifecycleOwner(), new _addFields() { // from class: o.toGoogleSignInAccount
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                filterByHostedDomain.write(this.write, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(filterByHostedDomain filterbyhosteddomain, String str, Bundle bundle) throws Exception {
        CustomModuleUCModel customModuleUCModel;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (!bundle.containsKey("data") || (customModuleUCModel = (CustomModuleUCModel) StdKeyDeserializerDelegatingKD.IconCompatParcelizer(bundle, "data", CustomModuleUCModel.class)) == null) {
            return;
        }
        filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(new filterByAuthorizedAccounts.MediaMetadataCompat(customModuleUCModel));
    }

    /* JADX INFO: renamed from: o.filterByHostedDomain$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "read", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$read;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$read = fragment;
        }
    }

    /* JADX INFO: renamed from: o.filterByHostedDomain$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$read.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$read = getcreatedondatems;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(filterByHostedDomain filterbyhosteddomain, String str, Bundle bundle) {
        Window window;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        maybeGetTypeVariable activity = filterbyhosteddomain.getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = filterbyhosteddomain.read;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        Context context = defaultHlsDataSourceFactory.IconCompatParcelizer().getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        window.setNavigationBarColor(shouldEscapeCharacter.Companion.read(context, R.attr.colorSurface, new TypedValue(), true));
    }

    /* JADX INFO: renamed from: o.filterByHostedDomain$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.filterByHostedDomain$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    private final void write() {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        Toolbar toolbar = defaultHlsDataSourceFactory.onPlay;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read;
        if (defaultHlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory3 = null;
        }
        ScrollView scrollView = defaultHlsDataSourceFactory3.onFastForward;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, false, true, true, true, 0, 49);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = this.read;
        if (defaultHlsDataSourceFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory4;
        }
        FrameLayout frameLayout = defaultHlsDataSourceFactory2.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        getHttpMethodString.read((View) frameLayout, false, true, true, true, 0, 49);
    }

    /* JADX INFO: renamed from: o.filterByHostedDomain$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        MediaBrowserCompatMediaItem();
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        defaultHlsDataSourceFactory.onPlay.write(R.menu.menu_close);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = this.read;
        if (defaultHlsDataSourceFactory2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory2 = null;
        }
        defaultHlsDataSourceFactory2.onPlay.setNavigationIcon((Drawable) null);
        RatingCompat();
        MediaDescriptionCompat();
    }

    private final void MediaBrowserCompatMediaItem() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
            if (defaultHlsDataSourceFactory == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory = null;
            }
            LinearLayout linearLayout = defaultHlsDataSourceFactory.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<Integer>> setupdatedstatusMediaBrowserCompatSearchResultReceiver = filterByHostedDomain.this.MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatSearchResultReceiver();
                final filterByHostedDomain filterbyhosteddomain = filterByHostedDomain.this;
                this.write = 1;
                if (setupdatedstatusMediaBrowserCompatSearchResultReceiver.write(new getValidationToken() { // from class: o.filterByHostedDomain.IconCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object read(DataSourceBitmapLoaderExternalSyntheticLambda0<Integer> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) && !(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps)) {
                            if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap)) {
                                throw new RenewEligibleCreator();
                            }
                            filterbyhosteddomain.IconCompatParcelizer = ((Number) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer()).intValue();
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
            return filterByHostedDomain.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaDescriptionCompat() {
        filterByHostedDomain filterbyhosteddomain = this;
        setBitrateKbps.read(filterbyhosteddomain, new IconCompatParcelizer(null));
        setBitrateKbps.read(filterbyhosteddomain, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(filterbyhosteddomain, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.read(filterbyhosteddomain, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.read(filterbyhosteddomain, new MediaBrowserCompatCustomActionResultReceiver(null));
        setBitrateKbps.read(filterbyhosteddomain, new AudioAttributesImplApi26Parcelizer(null));
        setBitrateKbps.read(filterbyhosteddomain, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.read(filterbyhosteddomain, new MediaBrowserCompatMediaItem(null));
        setBitrateKbps.read(filterbyhosteddomain, new RatingCompat(null));
        setBitrateKbps.read(filterbyhosteddomain, new read(null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<setPasskeysSignInRequestOptions>> setupdatedstatusIconCompatParcelizer = filterByHostedDomain.this.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer();
                final filterByHostedDomain filterbyhosteddomain = filterByHostedDomain.this;
                this.read = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.filterByHostedDomain.AudioAttributesCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object RemoteActionCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<setPasskeysSignInRequestOptions> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) && !(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps)) {
                            if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                                filterbyhosteddomain.IconCompatParcelizer((setPasskeysSignInRequestOptions) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer());
                            } else {
                                throw new RenewEligibleCreator();
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return filterByHostedDomain.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi21Parcelizer = filterByHostedDomain.this.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi21Parcelizer();
                final filterByHostedDomain filterbyhosteddomain = filterByHostedDomain.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.filterByHostedDomain.MediaBrowserCompatItemReceiver.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        if (z) {
                            filterbyhosteddomain.onFastForward();
                        } else {
                            filterbyhosteddomain.MediaBrowserCompatItemReceiver();
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
            return filterByHostedDomain.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setPreferImmediatelyAvailableCredentials> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = filterByHostedDomain.this.MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatCustomActionResultReceiver();
                final filterByHostedDomain filterbyhosteddomain = filterByHostedDomain.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.filterByHostedDomain.AudioAttributesImplBaseParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((setPreferImmediatelyAvailableCredentials) obj2);
                    }

                    private Object read(setPreferImmediatelyAvailableCredentials setpreferimmediatelyavailablecredentials) throws Exception {
                        if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.handleMediaPlayPauseIfPendingOnHandler) {
                            filterbyhosteddomain.AudioAttributesImplBaseParcelizer(((setPreferImmediatelyAvailableCredentials.handleMediaPlayPauseIfPendingOnHandler) setpreferimmediatelyavailablecredentials).RemoteActionCompatParcelizer());
                        } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.AudioAttributesImplApi26Parcelizer) {
                            filterByHostedDomain filterbyhosteddomain2 = filterbyhosteddomain;
                            PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
                            Context contextRequireContext = filterbyhosteddomain.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            String lowerCase = "PRO_CM_ACCESSED".toLowerCase(Locale.ROOT);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                            filterbyhosteddomain2.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext, "Pro Subscription Dialog", lowerCase));
                            filterbyhosteddomain.requireActivity().finish();
                        } else {
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = null;
                            if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.MediaMetadataCompat) {
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory2 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    defaultHlsDataSourceFactory = defaultHlsDataSourceFactory2;
                                }
                                defaultHlsDataSourceFactory.onPrepare.setText(filterbyhosteddomain.getString(R.string.text_generating_custom_module));
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.MediaBrowserCompatSearchResultReceiver) {
                                if (((setPreferImmediatelyAvailableCredentials.MediaBrowserCompatSearchResultReceiver) setpreferimmediatelyavailablecredentials).write()) {
                                    filterbyhosteddomain.onAddQueueItem();
                                } else {
                                    filterbyhosteddomain.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                                }
                                filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.AudioAttributesImplBaseParcelizer.INSTANCE);
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.MediaBrowserCompatMediaItem) {
                                filterbyhosteddomain.IconCompatParcelizer(((setPreferImmediatelyAvailableCredentials.MediaBrowserCompatMediaItem) setpreferimmediatelyavailablecredentials).read());
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.AudioAttributesCompatParcelizer) {
                                filterbyhosteddomain.requireActivity().finish();
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.onCommand) {
                                filterByHostedDomain filterbyhosteddomain3 = filterbyhosteddomain;
                                onSingleTapUp.Companion companion = onSingleTapUp.INSTANCE;
                                Context contextRequireContext2 = filterbyhosteddomain.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                                filterbyhosteddomain3.startActivity(onSingleTapUp.Companion.RemoteActionCompatParcelizer(contextRequireContext2, new WorkAccountClient(0, null, null, null, null, false, null, null, false, 0, null, null, false, 0L, 0L, false, null, 131071, null)));
                                filterbyhosteddomain.requireActivity().finish();
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.RemoteActionCompatParcelizer) {
                                filterbyhosteddomain.AudioAttributesCompatParcelizer(((setPreferImmediatelyAvailableCredentials.RemoteActionCompatParcelizer) setpreferimmediatelyavailablecredentials).AudioAttributesCompatParcelizer());
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.onMediaButtonEvent) {
                                Context contextRequireContext3 = filterbyhosteddomain.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
                                setPreferImmediatelyAvailableCredentials.onMediaButtonEvent onmediabuttonevent = (setPreferImmediatelyAvailableCredentials.onMediaButtonEvent) setpreferimmediatelyavailablecredentials;
                                scheduleUpdate.write(contextRequireContext3, onmediabuttonevent.RemoteActionCompatParcelizer(), onmediabuttonevent.write());
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.write) {
                                Context contextRequireContext4 = filterbyhosteddomain.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext4, "");
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory3 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    defaultHlsDataSourceFactory = defaultHlsDataSourceFactory3;
                                }
                                dispatchTouchEvent.AudioAttributesCompatParcelizer(contextRequireContext4, defaultHlsDataSourceFactory.onPause.getText().toString(), "Custom Module Share Code");
                                filterByHostedDomain filterbyhosteddomain4 = filterbyhosteddomain;
                                filterByHostedDomain filterbyhosteddomain5 = filterbyhosteddomain4;
                                String string = filterbyhosteddomain4.getString(R.string.toast_copied, "Code");
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                PlayerControlViewExternalSyntheticLambda1.write(filterbyhosteddomain5, string);
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.onAddQueueItem) {
                                filterByHostedDomain filterbyhosteddomain6 = filterbyhosteddomain;
                                filterByHostedDomain filterbyhosteddomain7 = filterbyhosteddomain6;
                                String string2 = filterbyhosteddomain6.getString(R.string.review_after_test_is_ended);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                                PlayerControlViewExternalSyntheticLambda1.write(filterbyhosteddomain7, string2);
                                filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.AudioAttributesImplBaseParcelizer.INSTANCE);
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.RatingCompat) {
                                filterByHostedDomain filterbyhosteddomain8 = filterbyhosteddomain;
                                filterByHostedDomain filterbyhosteddomain9 = filterbyhosteddomain8;
                                String string3 = filterbyhosteddomain8.getString(R.string.expired_test_text);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                                PlayerControlViewExternalSyntheticLambda1.write(filterbyhosteddomain9, string3);
                                filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.AudioAttributesImplBaseParcelizer.INSTANCE);
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.IconCompatParcelizer) {
                                filterbyhosteddomain.RemoteActionCompatParcelizer(((setPreferImmediatelyAvailableCredentials.IconCompatParcelizer) setpreferimmediatelyavailablecredentials).RemoteActionCompatParcelizer());
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.read) {
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory4 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    defaultHlsDataSourceFactory4 = null;
                                }
                                ProgressBar progressBar = defaultHlsDataSourceFactory4.onMediaButtonEvent;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                                bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory5 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory5 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    defaultHlsDataSourceFactory = defaultHlsDataSourceFactory5;
                                }
                                Button button = defaultHlsDataSourceFactory.AudioAttributesCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(button);
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.MediaBrowserCompatItemReceiver) {
                                setForceApplySystemWindowInsetTop.Companion companion2 = setForceApplySystemWindowInsetTop.INSTANCE;
                                Context contextRequireContext5 = filterbyhosteddomain.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext5, "");
                                filterbyhosteddomain.startActivity(setForceApplySystemWindowInsetTop.Companion.AudioAttributesCompatParcelizer(contextRequireContext5, new setStaticLayoutBuilderConfigurer(((setPreferImmediatelyAvailableCredentials.MediaBrowserCompatItemReceiver) setpreferimmediatelyavailablecredentials).AudioAttributesCompatParcelizer(), false, false, true, null, null, null, 118, null)));
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.AudioAttributesImplApi21Parcelizer) {
                                setAppId.Companion companion3 = setAppId.INSTANCE;
                                Context contextRequireContext6 = filterbyhosteddomain.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext6, "");
                                filterbyhosteddomain.startActivity(setAppId.Companion.write(contextRequireContext6, ((setPreferImmediatelyAvailableCredentials.AudioAttributesImplApi21Parcelizer) setpreferimmediatelyavailablecredentials).write(), "", onNewBytesCached.read(TextOutput.AudioAttributesCompatParcelizer), 0, null, 48));
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat) {
                                setCheckedIconEnabled.Companion companion4 = setCheckedIconEnabled.INSTANCE;
                                Context context = filterbyhosteddomain.getContext();
                                if (context != null) {
                                    filterbyhosteddomain.startActivity(setCheckedIconEnabled.Companion.read(context, ((setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat) setpreferimmediatelyavailablecredentials).write(), onNewBytesCached.read(TextOutput.AudioAttributesCompatParcelizer)));
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setpreferimmediatelyavailablecredentials, setPreferImmediatelyAvailableCredentials.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE)) {
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory6 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory6 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    defaultHlsDataSourceFactory6 = null;
                                }
                                if (defaultHlsDataSourceFactory6.AudioAttributesCompatParcelizer.getTag() != null) {
                                    filterByHostedDomain filterbyhosteddomain10 = filterbyhosteddomain;
                                    filterByHostedDomain filterbyhosteddomain11 = filterbyhosteddomain10;
                                    DefaultHlsDataSourceFactory defaultHlsDataSourceFactory7 = filterbyhosteddomain10.read;
                                    if (defaultHlsDataSourceFactory7 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        defaultHlsDataSourceFactory = defaultHlsDataSourceFactory7;
                                    }
                                    PlayerControlViewExternalSyntheticLambda1.write(filterbyhosteddomain11, defaultHlsDataSourceFactory.AudioAttributesCompatParcelizer.getTag().toString());
                                }
                            } else if (setpreferimmediatelyavailablecredentials instanceof setPreferImmediatelyAvailableCredentials.onCustomAction) {
                                AuthorizationRequestBuilder.Companion companion5 = AuthorizationRequestBuilder.INSTANCE;
                                Context contextRequireContext7 = filterbyhosteddomain.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext7, "");
                                Intent intentAudioAttributesCompatParcelizer = AuthorizationRequestBuilder.Companion.AudioAttributesCompatParcelizer(contextRequireContext7, new WorkAccountClient(((setPreferImmediatelyAvailableCredentials.onCustomAction) setpreferimmediatelyavailablecredentials).read(), true), null);
                                filterbyhosteddomain.requireActivity().finish();
                                filterbyhosteddomain.startActivity(intentAudioAttributesCompatParcelizer);
                            }
                        }
                        filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.AudioAttributesImplBaseParcelizer.INSTANCE);
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
            return filterByHostedDomain.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel>> setupdatedstatusMediaBrowserCompatItemReceiver = filterByHostedDomain.this.MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatItemReceiver();
                final filterByHostedDomain filterbyhosteddomain = filterByHostedDomain.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.filterByHostedDomain.MediaBrowserCompatCustomActionResultReceiver.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object IconCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel> dataSourceBitmapLoaderExternalSyntheticLambda0) throws Exception {
                        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = null;
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) {
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory2 = null;
                            }
                            defaultHlsDataSourceFactory2.onRemoveQueueItemAt.setText(dispatchTouchEvent.read(filterbyhosteddomain.getString(R.string.qbank_modules)));
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory3 = null;
                            }
                            defaultHlsDataSourceFactory3.onPrepare.setText("");
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory4 = null;
                            }
                            defaultHlsDataSourceFactory4.onPause.setText("-");
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory5 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory5 = null;
                            }
                            defaultHlsDataSourceFactory5.onPrepareFromSearch.setText(filterbyhosteddomain.getString(R.string.mcqs));
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory6 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory6 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory6 = null;
                            }
                            defaultHlsDataSourceFactory6.onPlayFromMediaId.setText(filterbyhosteddomain.getString(R.string.mcqs));
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory7 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory7 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory7 = null;
                            }
                            defaultHlsDataSourceFactory7.onSeekTo.setText(filterbyhosteddomain.getString(R.string.text_subjects));
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory8 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory8 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory8 = null;
                            }
                            defaultHlsDataSourceFactory8.onRewind.setText(filterbyhosteddomain.getString(R.string.tags));
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory9 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory9 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory9 = null;
                            }
                            defaultHlsDataSourceFactory9.onPrepareFromMediaId.setText(filterbyhosteddomain.getString(R.string.difficulty));
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory10 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory10 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory10 = null;
                            }
                            defaultHlsDataSourceFactory10.onPlayFromSearch.setText(filterbyhosteddomain.getString(R.string.regular_mode));
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory11 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory11 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                defaultHlsDataSourceFactory = defaultHlsDataSourceFactory11;
                            }
                            FrameLayout frameLayout = defaultHlsDataSourceFactory.MediaMetadataCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(frameLayout);
                        } else if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps)) {
                            if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory12 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory12 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    defaultHlsDataSourceFactory12 = null;
                                }
                                FrameLayout frameLayout2 = defaultHlsDataSourceFactory12.MediaMetadataCompat;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout2, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(frameLayout2);
                                CustomModuleUCModel customModuleUCModel = (CustomModuleUCModel) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer();
                                if (customModuleUCModel != null) {
                                    filterByHostedDomain filterbyhosteddomain2 = filterbyhosteddomain;
                                    filterbyhosteddomain2.read(customModuleUCModel.getMediaBrowserCompatSearchResultReceiver(), customModuleUCModel.getMediaDescriptionCompat(), customModuleUCModel.getHandleMediaPlayPauseIfPendingOnHandler(), customModuleUCModel.getRemoteActionCompatParcelizer() > 0 ? loadBitmap.IconCompatParcelizer(customModuleUCModel.getRemoteActionCompatParcelizer()) : null);
                                    if (customModuleUCModel.getAudioAttributesCompatParcelizer() == null) {
                                        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory13 = filterbyhosteddomain2.read;
                                        if (defaultHlsDataSourceFactory13 == null) {
                                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        } else {
                                            defaultHlsDataSourceFactory = defaultHlsDataSourceFactory13;
                                        }
                                        defaultHlsDataSourceFactory.AudioAttributesImplBaseParcelizer.setVisibility(8);
                                    } else {
                                        String audioAttributesCompatParcelizer = customModuleUCModel.getAudioAttributesCompatParcelizer();
                                        toMagicModuleMetaRepoModel.write((Object) audioAttributesCompatParcelizer);
                                        filterbyhosteddomain2.IconCompatParcelizer(audioAttributesCompatParcelizer, customModuleUCModel.getOnAddQueueItem());
                                    }
                                    filterbyhosteddomain2.write(customModuleUCModel.getMediaBrowserCompatCustomActionResultReceiver());
                                    filterbyhosteddomain2.write(customModuleUCModel.getMediaBrowserCompatItemReceiver());
                                    filterbyhosteddomain2.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.MediaBrowserCompatMediaItem.INSTANCE);
                                }
                            } else {
                                throw new RenewEligibleCreator();
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

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return filterByHostedDomain.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi26Parcelizer = filterByHostedDomain.this.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi26Parcelizer();
                final filterByHostedDomain filterbyhosteddomain = filterByHostedDomain.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.filterByHostedDomain.AudioAttributesImplApi26Parcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        if (z) {
                            filterbyhosteddomain.onPlay();
                        } else {
                            filterbyhosteddomain.AudioAttributesImplApi21Parcelizer();
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

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return filterByHostedDomain.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Integer> setupdatedstatus = filterByHostedDomain.this.MediaBrowserCompatCustomActionResultReceiver().read();
                final filterByHostedDomain filterbyhosteddomain = filterByHostedDomain.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.filterByHostedDomain.AudioAttributesImplApi21Parcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Number) obj2).intValue());
                    }

                    private Object write(int i2) throws Exception {
                        if (i2 == 0) {
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory = null;
                            }
                            ProgressBar progressBar = defaultHlsDataSourceFactory.RatingCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory2 = null;
                            }
                            ProgressBar progressBar2 = defaultHlsDataSourceFactory2.onCommand;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar2);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory3 = null;
                            }
                            ProgressBar progressBar3 = defaultHlsDataSourceFactory3.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar3, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar3);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory4 = null;
                            }
                            ProgressBar progressBar4 = defaultHlsDataSourceFactory4.onCustomAction;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar4, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar4);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory5 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory5 = null;
                            }
                            ProgressBar progressBar5 = defaultHlsDataSourceFactory5.handleMediaPlayPauseIfPendingOnHandler;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar5, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar5);
                            C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(filterbyhosteddomain), null, null, new AnonymousClass4(filterbyhosteddomain, null), 3);
                        } else if (i2 == 1) {
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory6 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory6 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory6 = null;
                            }
                            ImageView imageView = defaultHlsDataSourceFactory6.IconCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory7 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory7 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory7 = null;
                            }
                            ProgressBar progressBar6 = defaultHlsDataSourceFactory7.onCommand;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar6, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar6);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory8 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory8 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory8 = null;
                            }
                            ProgressBar progressBar7 = defaultHlsDataSourceFactory8.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar7, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar7);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory9 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory9 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory9 = null;
                            }
                            ProgressBar progressBar8 = defaultHlsDataSourceFactory9.onCustomAction;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar8, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar8);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory10 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory10 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory10 = null;
                            }
                            ProgressBar progressBar9 = defaultHlsDataSourceFactory10.handleMediaPlayPauseIfPendingOnHandler;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar9, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar9);
                            C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(filterbyhosteddomain), null, null, new AnonymousClass1(filterbyhosteddomain, null), 3);
                        } else if (i2 == 2) {
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory11 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory11 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory11 = null;
                            }
                            ImageView imageView2 = defaultHlsDataSourceFactory11.IconCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView2);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory12 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory12 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory12 = null;
                            }
                            ImageView imageView3 = defaultHlsDataSourceFactory12.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView3);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory13 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory13 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory13 = null;
                            }
                            ProgressBar progressBar10 = defaultHlsDataSourceFactory13.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar10, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar10);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory14 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory14 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory14 = null;
                            }
                            ProgressBar progressBar11 = defaultHlsDataSourceFactory14.onCustomAction;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar11, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar11);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory15 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory15 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory15 = null;
                            }
                            ProgressBar progressBar12 = defaultHlsDataSourceFactory15.handleMediaPlayPauseIfPendingOnHandler;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar12, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar12);
                            C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(filterbyhosteddomain), null, null, new AnonymousClass2(filterbyhosteddomain, null), 3);
                        } else if (i2 == 3) {
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory16 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory16 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory16 = null;
                            }
                            ImageView imageView4 = defaultHlsDataSourceFactory16.IconCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView4);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory17 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory17 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory17 = null;
                            }
                            ImageView imageView5 = defaultHlsDataSourceFactory17.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView5, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView5);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory18 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory18 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory18 = null;
                            }
                            ImageView imageView6 = defaultHlsDataSourceFactory18.write;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView6, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView6);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory19 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory19 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory19 = null;
                            }
                            ProgressBar progressBar13 = defaultHlsDataSourceFactory19.onCustomAction;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar13, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar13);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory20 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory20 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory20 = null;
                            }
                            ProgressBar progressBar14 = defaultHlsDataSourceFactory20.handleMediaPlayPauseIfPendingOnHandler;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar14, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar14);
                            C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(filterbyhosteddomain), null, null, new C00845(filterbyhosteddomain, null), 3);
                        } else if (i2 == 4) {
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory21 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory21 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory21 = null;
                            }
                            ImageView imageView7 = defaultHlsDataSourceFactory21.IconCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView7, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView7);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory22 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory22 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory22 = null;
                            }
                            ImageView imageView8 = defaultHlsDataSourceFactory22.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView8, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView8);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory23 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory23 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory23 = null;
                            }
                            ImageView imageView9 = defaultHlsDataSourceFactory23.write;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView9, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView9);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory24 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory24 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory24 = null;
                            }
                            ImageView imageView10 = defaultHlsDataSourceFactory24.AudioAttributesImplApi21Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView10, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView10);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory25 = filterbyhosteddomain.read;
                            if (defaultHlsDataSourceFactory25 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory25 = null;
                            }
                            ProgressBar progressBar15 = defaultHlsDataSourceFactory25.handleMediaPlayPauseIfPendingOnHandler;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar15, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar15);
                            C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(filterbyhosteddomain), null, null, new AnonymousClass3(filterbyhosteddomain, null), 3);
                        } else if (i2 != 5) {
                            filterbyhosteddomain.AudioAttributesImplApi21Parcelizer();
                            getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        } else {
                            filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(new filterByAuthorizedAccounts.read(5));
                            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                        }
                        return getShowPopup.INSTANCE;
                    }

                    /* JADX INFO: renamed from: o.filterByHostedDomain$AudioAttributesImplApi21Parcelizer$5$4, reason: invalid class name */
                    static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                        private /* synthetic */ filterByHostedDomain IconCompatParcelizer;
                        private int RemoteActionCompatParcelizer;

                        @Override // kotlin.getMonthName
                        public final Object invokeSuspend(Object obj) throws Exception {
                            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                            int i = this.RemoteActionCompatParcelizer;
                            if (i == 0) {
                                SdkPayloadData.IconCompatParcelizer(obj);
                                this.RemoteActionCompatParcelizer = 1;
                                if (setCountry.IconCompatParcelizer(500L, this) == objIconCompatParcelizer) {
                                    return objIconCompatParcelizer;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                SdkPayloadData.IconCompatParcelizer(obj);
                            }
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.IconCompatParcelizer.read;
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
                            if (defaultHlsDataSourceFactory == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory = null;
                            }
                            ProgressBar progressBar = defaultHlsDataSourceFactory.RatingCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.IconCompatParcelizer.read;
                            if (defaultHlsDataSourceFactory3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory3;
                            }
                            ImageView imageView = defaultHlsDataSourceFactory2.IconCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
                            this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(new filterByAuthorizedAccounts.read(0));
                            return getShowPopup.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass4(filterByHostedDomain filterbyhosteddomain, SampleVideos<? super AnonymousClass4> sampleVideos) {
                            super(2, sampleVideos);
                            this.IconCompatParcelizer = filterbyhosteddomain;
                        }

                        @Override // kotlin.getMonthName
                        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                            return new AnonymousClass4(this.IconCompatParcelizer, sampleVideos);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                            return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                        }
                    }

                    /* JADX INFO: renamed from: o.filterByHostedDomain$AudioAttributesImplApi21Parcelizer$5$1, reason: invalid class name */
                    static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                        private /* synthetic */ filterByHostedDomain IconCompatParcelizer;
                        private int write;

                        @Override // kotlin.getMonthName
                        public final Object invokeSuspend(Object obj) throws Exception {
                            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                            int i = this.write;
                            if (i == 0) {
                                SdkPayloadData.IconCompatParcelizer(obj);
                                this.write = 1;
                                if (setCountry.IconCompatParcelizer(500L, this) == objIconCompatParcelizer) {
                                    return objIconCompatParcelizer;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                SdkPayloadData.IconCompatParcelizer(obj);
                            }
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.IconCompatParcelizer.read;
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
                            if (defaultHlsDataSourceFactory == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory = null;
                            }
                            ProgressBar progressBar = defaultHlsDataSourceFactory.onCommand;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.IconCompatParcelizer.read;
                            if (defaultHlsDataSourceFactory3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory3;
                            }
                            ImageView imageView = defaultHlsDataSourceFactory2.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
                            this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(new filterByAuthorizedAccounts.read(1));
                            return getShowPopup.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(filterByHostedDomain filterbyhosteddomain, SampleVideos<? super AnonymousClass1> sampleVideos) {
                            super(2, sampleVideos);
                            this.IconCompatParcelizer = filterbyhosteddomain;
                        }

                        @Override // kotlin.getMonthName
                        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                            return new AnonymousClass1(this.IconCompatParcelizer, sampleVideos);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                            return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                        }
                    }

                    /* JADX INFO: renamed from: o.filterByHostedDomain$AudioAttributesImplApi21Parcelizer$5$2, reason: invalid class name */
                    static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                        private int IconCompatParcelizer;
                        private /* synthetic */ filterByHostedDomain RemoteActionCompatParcelizer;

                        @Override // kotlin.getMonthName
                        public final Object invokeSuspend(Object obj) throws Exception {
                            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                            int i = this.IconCompatParcelizer;
                            if (i == 0) {
                                SdkPayloadData.IconCompatParcelizer(obj);
                                this.IconCompatParcelizer = 1;
                                if (setCountry.IconCompatParcelizer(500L, this) == objIconCompatParcelizer) {
                                    return objIconCompatParcelizer;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                SdkPayloadData.IconCompatParcelizer(obj);
                            }
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.RemoteActionCompatParcelizer.read;
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
                            if (defaultHlsDataSourceFactory == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory = null;
                            }
                            ProgressBar progressBar = defaultHlsDataSourceFactory.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.RemoteActionCompatParcelizer.read;
                            if (defaultHlsDataSourceFactory3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory3;
                            }
                            ImageView imageView = defaultHlsDataSourceFactory2.write;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
                            this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(new filterByAuthorizedAccounts.read(2));
                            return getShowPopup.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(filterByHostedDomain filterbyhosteddomain, SampleVideos<? super AnonymousClass2> sampleVideos) {
                            super(2, sampleVideos);
                            this.RemoteActionCompatParcelizer = filterbyhosteddomain;
                        }

                        @Override // kotlin.getMonthName
                        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                            return new AnonymousClass2(this.RemoteActionCompatParcelizer, sampleVideos);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                            return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                        }
                    }

                    /* JADX INFO: renamed from: o.filterByHostedDomain$AudioAttributesImplApi21Parcelizer$5$5, reason: invalid class name and collision with other inner class name */
                    static final class C00845 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                        private int AudioAttributesCompatParcelizer;
                        private /* synthetic */ filterByHostedDomain write;

                        @Override // kotlin.getMonthName
                        public final Object invokeSuspend(Object obj) throws Exception {
                            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                            int i = this.AudioAttributesCompatParcelizer;
                            if (i == 0) {
                                SdkPayloadData.IconCompatParcelizer(obj);
                                this.AudioAttributesCompatParcelizer = 1;
                                if (setCountry.IconCompatParcelizer(500L, this) == objIconCompatParcelizer) {
                                    return objIconCompatParcelizer;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                SdkPayloadData.IconCompatParcelizer(obj);
                            }
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.write.read;
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
                            if (defaultHlsDataSourceFactory == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory = null;
                            }
                            ProgressBar progressBar = defaultHlsDataSourceFactory.onCustomAction;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.write.read;
                            if (defaultHlsDataSourceFactory3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory3;
                            }
                            ImageView imageView = defaultHlsDataSourceFactory2.AudioAttributesImplApi21Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
                            this.write.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(new filterByAuthorizedAccounts.read(3));
                            return getShowPopup.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00845(filterByHostedDomain filterbyhosteddomain, SampleVideos<? super C00845> sampleVideos) {
                            super(2, sampleVideos);
                            this.write = filterbyhosteddomain;
                        }

                        @Override // kotlin.getMonthName
                        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                            return new C00845(this.write, sampleVideos);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                            return ((C00845) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                        }
                    }

                    /* JADX INFO: renamed from: o.filterByHostedDomain$AudioAttributesImplApi21Parcelizer$5$3, reason: invalid class name */
                    static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                        private int IconCompatParcelizer;
                        private /* synthetic */ filterByHostedDomain read;

                        @Override // kotlin.getMonthName
                        public final Object invokeSuspend(Object obj) throws Exception {
                            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                            int i = this.IconCompatParcelizer;
                            if (i == 0) {
                                SdkPayloadData.IconCompatParcelizer(obj);
                                this.IconCompatParcelizer = 1;
                                if (setCountry.IconCompatParcelizer(500L, this) == objIconCompatParcelizer) {
                                    return objIconCompatParcelizer;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                SdkPayloadData.IconCompatParcelizer(obj);
                            }
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read.read;
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
                            if (defaultHlsDataSourceFactory == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                defaultHlsDataSourceFactory = null;
                            }
                            ProgressBar progressBar = defaultHlsDataSourceFactory.handleMediaPlayPauseIfPendingOnHandler;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read.read;
                            if (defaultHlsDataSourceFactory3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory3;
                            }
                            ImageView imageView = defaultHlsDataSourceFactory2.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
                            this.read.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(new filterByAuthorizedAccounts.read(4));
                            return getShowPopup.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(filterByHostedDomain filterbyhosteddomain, SampleVideos<? super AnonymousClass3> sampleVideos) {
                            super(2, sampleVideos);
                            this.read = filterbyhosteddomain;
                        }

                        @Override // kotlin.getMonthName
                        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                            return new AnonymousClass3(this.read, sampleVideos);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                            return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                        }
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
            return filterByHostedDomain.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setPasswordRequestOptions> setupdatedstatusMediaMetadataCompat = filterByHostedDomain.this.MediaBrowserCompatCustomActionResultReceiver().MediaMetadataCompat();
                final filterByHostedDomain filterbyhosteddomain = filterByHostedDomain.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaMetadataCompat.write(new getValidationToken() { // from class: o.filterByHostedDomain.MediaBrowserCompatMediaItem.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((setPasswordRequestOptions) obj2);
                    }

                    private Object write(setPasswordRequestOptions setpasswordrequestoptions) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setpasswordrequestoptions, setPasswordRequestOptions.write.INSTANCE)) {
                            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = null;
                            if (setpasswordrequestoptions instanceof setPasswordRequestOptions.IconCompatParcelizer) {
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory2 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    defaultHlsDataSourceFactory2 = null;
                                }
                                defaultHlsDataSourceFactory2.AudioAttributesCompatParcelizer.setText(filterbyhosteddomain.getString(R.string.btn_solve_custom_module));
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory3 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    defaultHlsDataSourceFactory3 = null;
                                }
                                defaultHlsDataSourceFactory3.RemoteActionCompatParcelizer.setText(filterbyhosteddomain.getString(R.string.solve_now));
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory4 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    defaultHlsDataSourceFactory4 = null;
                                }
                                defaultHlsDataSourceFactory4.onSetRating.setText(filterbyhosteddomain.getString(R.string.cm_intro_heading));
                                setPasswordRequestOptions.IconCompatParcelizer iconCompatParcelizer = (setPasswordRequestOptions.IconCompatParcelizer) setpasswordrequestoptions;
                                if (iconCompatParcelizer.RemoteActionCompatParcelizer()) {
                                    filterbyhosteddomain.AudioAttributesImplBaseParcelizer();
                                } else {
                                    filterbyhosteddomain.AudioAttributesImplApi26Parcelizer();
                                }
                                if (iconCompatParcelizer.RemoteActionCompatParcelizer()) {
                                    String string = filterbyhosteddomain.getString(R.string.expired_test_text);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                    DefaultHlsDataSourceFactory defaultHlsDataSourceFactory5 = filterbyhosteddomain.read;
                                    if (defaultHlsDataSourceFactory5 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        defaultHlsDataSourceFactory = defaultHlsDataSourceFactory5;
                                    }
                                    defaultHlsDataSourceFactory.AudioAttributesCompatParcelizer.setTag(string);
                                    PlayerControlViewExternalSyntheticLambda1.write(filterbyhosteddomain, string);
                                }
                            } else if (setpasswordrequestoptions instanceof setPasswordRequestOptions.AudioAttributesImplBaseParcelizer) {
                                filterbyhosteddomain.AudioAttributesImplBaseParcelizer();
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory6 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory6 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    defaultHlsDataSourceFactory = defaultHlsDataSourceFactory6;
                                }
                                defaultHlsDataSourceFactory.AudioAttributesCompatParcelizer.setText(filterbyhosteddomain.getString(R.string.label_live_in_text, ((setPasswordRequestOptions.AudioAttributesImplBaseParcelizer) setpasswordrequestoptions).IconCompatParcelizer()));
                            } else if (setpasswordrequestoptions instanceof setPasswordRequestOptions.RemoteActionCompatParcelizer) {
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory7 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory7 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    defaultHlsDataSourceFactory7 = null;
                                }
                                defaultHlsDataSourceFactory7.AudioAttributesCompatParcelizer.setText(filterbyhosteddomain.getString(R.string.text_continue_custom_module_card));
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory8 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory8 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    defaultHlsDataSourceFactory8 = null;
                                }
                                defaultHlsDataSourceFactory8.RemoteActionCompatParcelizer.setText(filterbyhosteddomain.getString(R.string.text_continue_custom_module_card));
                                if (((setPasswordRequestOptions.RemoteActionCompatParcelizer) setpasswordrequestoptions).write()) {
                                    filterbyhosteddomain.AudioAttributesImplApi26Parcelizer();
                                } else {
                                    DefaultHlsDataSourceFactory defaultHlsDataSourceFactory9 = filterbyhosteddomain.read;
                                    if (defaultHlsDataSourceFactory9 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                        defaultHlsDataSourceFactory9 = null;
                                    }
                                    Button button = defaultHlsDataSourceFactory9.AudioAttributesCompatParcelizer;
                                    DefaultHlsDataSourceFactory defaultHlsDataSourceFactory10 = filterbyhosteddomain.read;
                                    if (defaultHlsDataSourceFactory10 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        defaultHlsDataSourceFactory = defaultHlsDataSourceFactory10;
                                    }
                                    button.setTag(defaultHlsDataSourceFactory.onPrepare.getText());
                                    filterbyhosteddomain.AudioAttributesImplBaseParcelizer();
                                }
                            } else if (setpasswordrequestoptions instanceof setPasswordRequestOptions.read) {
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory11 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory11 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    defaultHlsDataSourceFactory11 = null;
                                }
                                defaultHlsDataSourceFactory11.AudioAttributesCompatParcelizer.setText(filterbyhosteddomain.getString(R.string.btn_review_custom_module));
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory12 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory12 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    defaultHlsDataSourceFactory12 = null;
                                }
                                defaultHlsDataSourceFactory12.RemoteActionCompatParcelizer.setText(filterbyhosteddomain.getString(R.string.text_review_custom_module_card));
                                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory13 = filterbyhosteddomain.read;
                                if (defaultHlsDataSourceFactory13 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    defaultHlsDataSourceFactory13 = null;
                                }
                                defaultHlsDataSourceFactory13.onSetRating.setText(filterbyhosteddomain.getString(R.string.cm_intro_heading));
                                setPasswordRequestOptions.read readVar = (setPasswordRequestOptions.read) setpasswordrequestoptions;
                                if (readVar.IconCompatParcelizer()) {
                                    filterbyhosteddomain.AudioAttributesImplApi26Parcelizer();
                                } else {
                                    filterbyhosteddomain.AudioAttributesImplBaseParcelizer();
                                }
                                if (!readVar.IconCompatParcelizer()) {
                                    String string2 = filterbyhosteddomain.getString(R.string.review_after_test_is_ended);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                                    DefaultHlsDataSourceFactory defaultHlsDataSourceFactory14 = filterbyhosteddomain.read;
                                    if (defaultHlsDataSourceFactory14 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        defaultHlsDataSourceFactory = defaultHlsDataSourceFactory14;
                                    }
                                    defaultHlsDataSourceFactory.AudioAttributesCompatParcelizer.setTag(string2);
                                    PlayerControlViewExternalSyntheticLambda1.write(filterbyhosteddomain, string2);
                                }
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setpasswordrequestoptions, setPasswordRequestOptions.AudioAttributesCompatParcelizer.INSTANCE)) {
                                filterbyhosteddomain.AudioAttributesImplBaseParcelizer();
                            } else {
                                throw new RenewEligibleCreator();
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

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return filterByHostedDomain.this.new MediaBrowserCompatMediaItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        /* JADX INFO: renamed from: o.filterByHostedDomain$RatingCompat$3, reason: invalid class name */
        static final class AnonymousClass3<T> implements getValidationToken {
            private /* synthetic */ filterByHostedDomain write;

            @Override // kotlin.getValidationToken
            public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return IconCompatParcelizer((String) obj);
            }

            private Object IconCompatParcelizer(String str) throws Exception {
                if (str.length() > 0) {
                    getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
                    String string = this.write.getString(R.string.btn_ok);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(str, null, string, null, 0, null, false, false, null, 442);
                    FragmentManager childFragmentManager = this.write.getChildFragmentManager();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
                    final filterByHostedDomain filterbyhosteddomain = this.write;
                    getBrowserClient.write(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.BeginSignInRequestBuilder
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return filterByHostedDomain.RatingCompat.AnonymousClass3.write(filterbyhosteddomain);
                        }
                    }, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setAutoSelectEnabled
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return filterByHostedDomain.RatingCompat.AnonymousClass3.read();
                        }
                    });
                    this.write.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.AudioAttributesCompatParcelizer.INSTANCE);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup write(filterByHostedDomain filterbyhosteddomain) throws Exception {
                filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.write.INSTANCE);
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup read() {
                return getShowPopup.INSTANCE;
            }

            AnonymousClass3(filterByHostedDomain filterbyhosteddomain) {
                this.write = filterbyhosteddomain;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (filterByHostedDomain.this.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplBaseParcelizer().write(new AnonymousClass3(filterByHostedDomain.this), this) == objIconCompatParcelizer) {
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
            return filterByHostedDomain.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Long> setupdatedstatusAudioAttributesCompatParcelizer = filterByHostedDomain.this.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesCompatParcelizer();
                final filterByHostedDomain filterbyhosteddomain = filterByHostedDomain.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.filterByHostedDomain.read.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write(((Number) obj2).longValue());
                    }

                    private Object write(long j) {
                        filterbyhosteddomain.read(j);
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
            return filterByHostedDomain.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(long p0) {
        String string;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        TextView textView = defaultHlsDataSourceFactory.RemoteActionCompatParcelizer;
        if (p0 > 0) {
            string = getString(R.string.test_time_remaining_specifier, loadBitmap.write(p0));
        } else if (p0 == 0) {
            string = getString(R.string.cm_test_time_over);
        } else {
            string = getString(R.string.solve_now);
        }
        textView.setText(string);
        int i = p0 >= 0 ? R.attr.onSurfaceBlue : R.attr.onBackgroundSurface3;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read;
        if (defaultHlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory3 = null;
        }
        TextView textView2 = defaultHlsDataSourceFactory3.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        bytesRead.read(textView2, R.attr.heading7);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = this.read;
        if (defaultHlsDataSourceFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory4;
        }
        TextView textView3 = defaultHlsDataSourceFactory2.RemoteActionCompatParcelizer;
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        textView3.setTextColor(shouldEscapeCharacter.Companion.read(contextRequireContext, i, new TypedValue(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplBaseParcelizer(String p0) {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.btn_ok);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, p0, string, null, 0, null, false, false, null, 505);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.getAccessToken
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return filterByHostedDomain.onPrepareFromMediaId(this.write);
            }
        }, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromMediaId(filterByHostedDomain filterbyhosteddomain) throws Exception {
        filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0) {
        Window window;
        maybeGetTypeVariable activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
            if (defaultHlsDataSourceFactory == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory = null;
            }
            Context context = defaultHlsDataSourceFactory.IconCompatParcelizer().getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            window.setNavigationBarColor(shouldEscapeCharacter.Companion.read(context, R.attr.backgroundColor, new TypedValue(), true));
        }
        getRpId.Companion companion2 = getRpId.INSTANCE;
        setBitrateKbps.IconCompatParcelizer(this, getRpId.Companion.read(p0), "join_cm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws Exception {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.title_text_abandon_cm_diag_solved);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.body_text_existing_cm_warning_in_prog);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.solve_shared_module);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        String string4 = getString(R.string.go_back_to_my_module);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, string2, string3, string4, R.drawable.ic_prog_gear, null, false, false, null, 480);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.write(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.isAutoSelectEnabled
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return filterByHostedDomain.onPlayFromUri(this.IconCompatParcelizer);
            }
        }, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getGrantedScopes
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return filterByHostedDomain.handleMediaPlayPauseIfPendingOnHandler();
            }
        });
        MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.AudioAttributesImplBaseParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromUri(filterByHostedDomain filterbyhosteddomain) throws Exception {
        filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.AudioAttributesImplApi26Parcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddQueueItem() throws Exception {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.title_text_abandon_cm_diag_solved);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.body_text_existing_cm_warning_solved);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.solve_shared_module);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        String string4 = getString(R.string.text_review_existing_module);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, string2, string3, string4, R.drawable.ic_prog_gear, null, false, false, null, 480);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.write(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.zbb
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return filterByHostedDomain.onPrepare(this.RemoteActionCompatParcelizer);
            }
        }, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getPreferImmediatelyAvailableCredentials
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return filterByHostedDomain.onPlayFromMediaId();
            }
        });
        MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.AudioAttributesImplBaseParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromMediaId() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepare(filterByHostedDomain filterbyhosteddomain) throws Exception {
        filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.AudioAttributesImplApi26Parcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        defaultHlsDataSourceFactory.AudioAttributesCompatParcelizer.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplBaseParcelizer() {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        defaultHlsDataSourceFactory.AudioAttributesCompatParcelizer.setAlpha(0.4f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(setPasskeysSignInRequestOptions p0) {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        TextView textView = defaultHlsDataSourceFactory.onPrepare;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        textView.setTextColor(CmcdConfigurationRequestConfig.read(contextRequireContext, R.attr.onBackgroundSurface3, R.color.n_40));
        if (p0 instanceof setPasskeysSignInRequestOptions.write) {
            setPasskeysSignInRequestOptions.write writeVar = (setPasskeysSignInRequestOptions.write) p0;
            String string = getString(R.string.test_expired_on_at, writeVar.AudioAttributesCompatParcelizer(), writeVar.RemoteActionCompatParcelizer());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read;
            if (defaultHlsDataSourceFactory3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory3 = null;
            }
            defaultHlsDataSourceFactory3.onPrepare.setText(string);
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = this.read;
            if (defaultHlsDataSourceFactory4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory4 = null;
            }
            TextView textView2 = defaultHlsDataSourceFactory4.onPrepare;
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            textView2.setTextColor(CmcdConfigurationRequestConfig.read(contextRequireContext2, R.attr.onSurfaceRed, R.color.red));
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory5 = this.read;
            if (defaultHlsDataSourceFactory5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory5 = null;
            }
            defaultHlsDataSourceFactory5.AudioAttributesCompatParcelizer.setTag(string);
        } else if (p0 instanceof setPasskeysSignInRequestOptions.read) {
            setPasskeysSignInRequestOptions.read readVar = (setPasskeysSignInRequestOptions.read) p0;
            String string2 = getString(R.string.test_will_be_live_on_at_for, readVar.AudioAttributesCompatParcelizer(), readVar.AudioAttributesImplApi21Parcelizer(), readVar.RemoteActionCompatParcelizer());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory6 = this.read;
            if (defaultHlsDataSourceFactory6 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory6 = null;
            }
            defaultHlsDataSourceFactory6.onPrepare.setText(string2);
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory7 = this.read;
            if (defaultHlsDataSourceFactory7 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory7 = null;
            }
            defaultHlsDataSourceFactory7.AudioAttributesCompatParcelizer.setTag(string2);
            PlayerControlViewExternalSyntheticLambda1.write(this, string2);
        } else if (p0 instanceof setPasskeysSignInRequestOptions.IconCompatParcelizer) {
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory8 = this.read;
            if (defaultHlsDataSourceFactory8 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory8 = null;
            }
            defaultHlsDataSourceFactory8.onPrepare.setText(getString(R.string.live_now_until, ((setPasskeysSignInRequestOptions.IconCompatParcelizer) p0).AudioAttributesCompatParcelizer()));
        } else {
            if (!(p0 instanceof setPasskeysSignInRequestOptions.RemoteActionCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory9 = this.read;
            if (defaultHlsDataSourceFactory9 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory9 = null;
            }
            setPasskeysSignInRequestOptions.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setPasskeysSignInRequestOptions.RemoteActionCompatParcelizer) p0;
            defaultHlsDataSourceFactory9.onPrepare.setText(getString(R.string.tv_cm_created_date, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), remoteActionCompatParcelizer.RemoteActionCompatParcelizer()));
        }
        if (2 == p0.getRemoteActionCompatParcelizer()) {
            p0.getWrite();
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory10 = this.read;
            if (defaultHlsDataSourceFactory10 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory10 = null;
            }
            defaultHlsDataSourceFactory10.onPrepareFromUri.setText(getString(R.string.tv_cm_solved_date, p0.getWrite(), p0.getIconCompatParcelizer()));
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory11 = this.read;
            if (defaultHlsDataSourceFactory11 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory11;
            }
            defaultHlsDataSourceFactory2.onPrepareFromUri.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFastForward() {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        ImageView imageView = defaultHlsDataSourceFactory.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read;
        if (defaultHlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory3 = null;
        }
        ImageView imageView2 = defaultHlsDataSourceFactory3.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView2);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = this.read;
        if (defaultHlsDataSourceFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory4 = null;
        }
        ImageView imageView3 = defaultHlsDataSourceFactory4.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView3);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory5 = this.read;
        if (defaultHlsDataSourceFactory5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory5 = null;
        }
        ImageView imageView4 = defaultHlsDataSourceFactory5.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView4);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory6 = this.read;
        if (defaultHlsDataSourceFactory6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory6;
        }
        ImageView imageView5 = defaultHlsDataSourceFactory2.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView5, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        ImageView imageView = defaultHlsDataSourceFactory.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read;
        if (defaultHlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory3 = null;
        }
        ImageView imageView2 = defaultHlsDataSourceFactory3.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView2);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = this.read;
        if (defaultHlsDataSourceFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory4 = null;
        }
        ImageView imageView3 = defaultHlsDataSourceFactory4.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView3);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory5 = this.read;
        if (defaultHlsDataSourceFactory5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory5 = null;
        }
        ImageView imageView4 = defaultHlsDataSourceFactory5.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView4);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory6 = this.read;
        if (defaultHlsDataSourceFactory6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory6;
        }
        ImageView imageView5 = defaultHlsDataSourceFactory2.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView5, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi21Parcelizer() {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        ProgressBar progressBar = defaultHlsDataSourceFactory.RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read;
        if (defaultHlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory3 = null;
        }
        ProgressBar progressBar2 = defaultHlsDataSourceFactory3.onCommand;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar2);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = this.read;
        if (defaultHlsDataSourceFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory4 = null;
        }
        ProgressBar progressBar3 = defaultHlsDataSourceFactory4.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar3, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar3);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory5 = this.read;
        if (defaultHlsDataSourceFactory5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory5 = null;
        }
        ProgressBar progressBar4 = defaultHlsDataSourceFactory5.onCustomAction;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar4, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar4);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory6 = this.read;
        if (defaultHlsDataSourceFactory6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory6;
        }
        ProgressBar progressBar5 = defaultHlsDataSourceFactory2.handleMediaPlayPauseIfPendingOnHandler;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar5, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlay() {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        ProgressBar progressBar = defaultHlsDataSourceFactory.RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read;
        if (defaultHlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory3 = null;
        }
        ProgressBar progressBar2 = defaultHlsDataSourceFactory3.onCommand;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(progressBar2);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = this.read;
        if (defaultHlsDataSourceFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory4 = null;
        }
        ProgressBar progressBar3 = defaultHlsDataSourceFactory4.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar3, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(progressBar3);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory5 = this.read;
        if (defaultHlsDataSourceFactory5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory5 = null;
        }
        ProgressBar progressBar4 = defaultHlsDataSourceFactory5.onCustomAction;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar4, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(progressBar4);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory6 = this.read;
        if (defaultHlsDataSourceFactory6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory6;
        }
        ProgressBar progressBar5 = defaultHlsDataSourceFactory2.handleMediaPlayPauseIfPendingOnHandler;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar5, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(progressBar5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0) {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, p0, "OK", null, 0, null, false, false, null, 505);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.getPasskeysRequestOptions
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return filterByHostedDomain.onPrepareFromSearch(this.RemoteActionCompatParcelizer);
            }
        }, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPrepareFromSearch(filterByHostedDomain filterbyhosteddomain) throws Exception {
        filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.MediaBrowserCompatItemReceiver.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String p0) {
        String str = p0;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = null;
        if (str == null || str.length() == 0) {
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = this.read;
            if (defaultHlsDataSourceFactory2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                defaultHlsDataSourceFactory = defaultHlsDataSourceFactory2;
            }
            LinearLayout linearLayout = defaultHlsDataSourceFactory.MediaBrowserCompatSearchResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
            return;
        }
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read;
        if (defaultHlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory3 = null;
        }
        LinearLayout linearLayout2 = defaultHlsDataSourceFactory3.MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout2);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = this.read;
        if (defaultHlsDataSourceFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsDataSourceFactory = defaultHlsDataSourceFactory4;
        }
        defaultHlsDataSourceFactory.MediaDescriptionCompat.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(int p0) {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        TextView textView = defaultHlsDataSourceFactory.onPlayFromMediaId;
        String string = getString(R.string.f_custom_module_mcq_count, Integer.valueOf(p0));
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("Served");
        textView.setText(sb.toString());
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read;
        if (defaultHlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory3;
        }
        defaultHlsDataSourceFactory2.onPrepareFromSearch.setText(getString(R.string.f_custom_module_mcq_count, Integer.valueOf(p0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0, int p1) {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = null;
        if (p1 == 2) {
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = this.read;
            if (defaultHlsDataSourceFactory2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory2 = null;
            }
            ProgressBar progressBar = defaultHlsDataSourceFactory2.onAddQueueItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read;
            if (defaultHlsDataSourceFactory3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory3 = null;
            }
            LinearLayout linearLayout = defaultHlsDataSourceFactory3.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
        } else if (p1 != 1) {
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = this.read;
            if (defaultHlsDataSourceFactory4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory4 = null;
            }
            ProgressBar progressBar2 = defaultHlsDataSourceFactory4.onAddQueueItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar2);
            DefaultHlsDataSourceFactory defaultHlsDataSourceFactory5 = this.read;
            if (defaultHlsDataSourceFactory5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                defaultHlsDataSourceFactory5 = null;
            }
            LinearLayout linearLayout2 = defaultHlsDataSourceFactory5.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
        }
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory6 = this.read;
        if (defaultHlsDataSourceFactory6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory6 = null;
        }
        LinearLayout linearLayout3 = defaultHlsDataSourceFactory6.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout3);
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory7 = this.read;
        if (defaultHlsDataSourceFactory7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsDataSourceFactory = defaultHlsDataSourceFactory7;
        }
        defaultHlsDataSourceFactory.onPause.setText(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(com.marrow2.data.custom_module.remote.model.FilterParams r8, com.marrow2.data.custom_module.remote.model.FilterParams r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.filterByHostedDomain.read(com.marrow2.data.custom_module.remote.model.FilterParams, com.marrow2.data.custom_module.remote.model.FilterParams, java.lang.String, java.lang.String):void");
    }

    private final void onCommand() throws Exception {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.text_custom_module_delete_confirm);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.btn_cancel);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.yes_discard);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, null, string2, string3, 0, null, false, false, null, 498);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.write(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.AuthorizationResult
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return filterByHostedDomain.onCustomAction();
            }
        }, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getPendingIntent
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return filterByHostedDomain.onPlayFromSearch(this.AudioAttributesCompatParcelizer);
            }
        });
        MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.AudioAttributesImplBaseParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCustomAction() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromSearch(filterByHostedDomain filterbyhosteddomain) throws Exception {
        filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    private final void RatingCompat() {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = this.read;
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory2 = null;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        defaultHlsDataSourceFactory.onPlay.setOnMenuItemClickListener(new Toolbar.IconCompatParcelizer() { // from class: o.setRequestedScopes
            @Override // androidx.appcompat.widget.Toolbar.IconCompatParcelizer
            public final boolean read(MenuItem menuItem) {
                return filterByHostedDomain.read(this.read, menuItem);
            }
        });
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory3 = this.read;
        if (defaultHlsDataSourceFactory3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory3 = null;
        }
        defaultHlsDataSourceFactory3.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.hasResolution
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                filterByHostedDomain.onFastForward(this.write);
            }
        });
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory4 = this.read;
        if (defaultHlsDataSourceFactory4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory4 = null;
        }
        defaultHlsDataSourceFactory4.onPlayFromUri.setOnClickListener(new View.OnClickListener() { // from class: o.BeginSignInRequest
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                filterByHostedDomain.onPlayFromMediaId(this.AudioAttributesCompatParcelizer);
            }
        });
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory5 = this.read;
        if (defaultHlsDataSourceFactory5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory5 = null;
        }
        defaultHlsDataSourceFactory5.MediaBrowserCompatCustomActionResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.getPasswordRequestOptions
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                filterByHostedDomain.onMediaButtonEvent(this.AudioAttributesCompatParcelizer);
            }
        });
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory6 = this.read;
        if (defaultHlsDataSourceFactory6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory6 = null;
        }
        defaultHlsDataSourceFactory6.onPause.setOnClickListener(new View.OnClickListener() { // from class: o.getPasskeyJsonRequestOptions
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                filterByHostedDomain.onPlay(this.read);
            }
        });
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory7 = this.read;
        if (defaultHlsDataSourceFactory7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            defaultHlsDataSourceFactory2 = defaultHlsDataSourceFactory7;
        }
        defaultHlsDataSourceFactory2.onRemoveQueueItem.setOnClickListener(new View.OnClickListener() { // from class: o.getGoogleIdTokenRequestOptions
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                filterByHostedDomain.onPause(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(filterByHostedDomain filterbyhosteddomain, MenuItem menuItem) {
        maybeGetTypeVariable activity;
        Integer numValueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (numValueOf == null || numValueOf.intValue() != R.id.closeFile || (activity = filterbyhosteddomain.getActivity()) == null) {
            return true;
        }
        activity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFastForward(filterByHostedDomain filterbyhosteddomain) throws Exception {
        filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayFromMediaId(filterByHostedDomain filterbyhosteddomain) throws Exception {
        filterbyhosteddomain.onCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMediaButtonEvent(filterByHostedDomain filterbyhosteddomain) throws Exception {
        filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlay(filterByHostedDomain filterbyhosteddomain) throws Exception {
        filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPause(filterByHostedDomain filterbyhosteddomain) throws Exception {
        DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = filterbyhosteddomain.read;
        if (defaultHlsDataSourceFactory == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            defaultHlsDataSourceFactory = null;
        }
        defaultHlsDataSourceFactory.onRemoveQueueItem.setEnabled(false);
        filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(filterByAuthorizedAccounts.MediaDescriptionCompat.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(String p0) {
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        getString(R.string.cm_share_title);
        dispatchTouchEvent.RemoteActionCompatParcelizer(contextRequireContext, p0, "join_custom_module", null, new write(p0));
    }

    public static final class write extends HlsPlaylist<String> {
        private /* synthetic */ String IconCompatParcelizer;

        write(String str) {
            this.IconCompatParcelizer = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.HlsPlaylist
        public void IconCompatParcelizer(String str) throws Exception {
            if (str != null) {
                filterByHostedDomain filterbyhosteddomain = filterByHostedDomain.this;
                String str2 = this.IconCompatParcelizer;
                if (filterbyhosteddomain.requireActivity().isFinishing() || str.length() <= 0) {
                    return;
                }
                DefaultHlsDataSourceFactory defaultHlsDataSourceFactory = filterbyhosteddomain.read;
                if (defaultHlsDataSourceFactory == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    defaultHlsDataSourceFactory = null;
                }
                defaultHlsDataSourceFactory.onRemoveQueueItem.setEnabled(true);
                String string = filterbyhosteddomain.getString(R.string.cm_share_body, str2, str);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                CustomModuleIntroductionViewModel customModuleIntroductionViewModelMediaBrowserCompatCustomActionResultReceiver = filterbyhosteddomain.MediaBrowserCompatCustomActionResultReceiver();
                String string2 = filterbyhosteddomain.getString(R.string.cm_share_title);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                customModuleIntroductionViewModelMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(new filterByAuthorizedAccounts.onCommand(string2, string));
            }
        }
    }

    public final void read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(new filterByAuthorizedAccounts.RatingCompat(p0));
    }

    public final void read(WorkAccountClient p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(new filterByAuthorizedAccounts.handleMediaPlayPauseIfPendingOnHandler(p0));
    }

    /* JADX INFO: renamed from: o.filterByHostedDomain$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/filterByHostedDomain$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/WorkAccountClient;", "p0", "", "p1", "Lo/filterByHostedDomain;", "write", "(Lo/WorkAccountClient;Ljava/lang/String;)Lo/filterByHostedDomain;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static filterByHostedDomain write(WorkAccountClient p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            filterByHostedDomain filterbyhosteddomain = new filterByHostedDomain();
            filterbyhosteddomain.setArguments(p0.RemoteActionCompatParcelizer());
            Bundle arguments = filterbyhosteddomain.getArguments();
            if (arguments != null) {
                arguments.putString("deepLinkInviteCode", p1);
            }
            return filterbyhosteddomain;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        getChildFragmentManager().IconCompatParcelizer("CustomModuleJoinByCodeDialogSuccessKey");
        getChildFragmentManager().IconCompatParcelizer("CustomModuleJoinByCodeDialogDismissKey");
    }
}
