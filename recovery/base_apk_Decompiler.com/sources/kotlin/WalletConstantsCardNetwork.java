package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow2.ui.test.landing.HomeTestViewModel;
import java.util.List;
import kotlin.LoyaltyPointsBalanceType;
import kotlin.Metadata;
import kotlin.PaymentAuthorizationResult;
import kotlin.TextModuleData;
import kotlin.VisibilityChecker;
import kotlin.WalletConstantsCardNetwork;
import kotlin.WalletConstantsPaymentMethod;
import kotlin.addAllowedCountryCodes;
import kotlin.createBundleFromClientSettings;
import kotlin.getBody;
import kotlin.getSelectedIndexInTrackGroup;
import kotlin.isSpecialNorthAmericanChar;
import kotlin.setActionUri;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\u0014\u0010'\u001a\u00020\u001c2\n\u0010(\u001a\u00060)j\u0002`*H\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0002J\b\u00100\u001a\u00020\u001cH\u0002J\b\u00101\u001a\u00020\u001cH\u0002J\b\u00102\u001a\u00020\u001cH\u0002J\u0010\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u001cH\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\b\u00108\u001a\u00020\u001cH\u0002J\u0010\u00109\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u0002052\u0006\u0010<\u001a\u000205H\u0002J\u0010\u0010=\u001a\u00020-*\u00060>j\u0002`?H\u0002J\b\u0010@\u001a\u00020\u001cH\u0002J\u0014\u0010A\u001a\u00020\u001c2\n\u0010(\u001a\u00060)j\u0002`*H\u0016J\b\u0010B\u001a\u00020\u001cH\u0016J\u0010\u0010C\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u00020\u001cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/marrow2/ui/test/landing/HomeTestFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/marrow2/ui/test/landing/adapter/TestListAdapter$ItemClickListener;", "<init>", "()V", "binding", "Lcom/marrow/databinding/FragmentHomeTestBinding;", "homeTestViewModel", "Lcom/marrow2/ui/test/landing/HomeTestViewModel;", "getHomeTestViewModel", "()Lcom/marrow2/ui/test/landing/HomeTestViewModel;", "homeTestViewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/marrow2/ui/test/landing/adapter/TestListAdapter;", "stickyHeaderDecoration", "Lcom/marrow2/ui/qbank/lesson_list/adapter/lesson_list/StickyHeaderDecoration;", "eventBroadcastReceiver", "Lcom/marrow/receivers/EventBroadcastReceiver;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "applyEdgeToEdgeInsets", "onStart", "onResume", "onDestroyView", "registerBroadcastReceivers", "unregisterBroadcastReceivers", "observeData", "initRecyclerView", "initTabs", "onTestSelected", "test", "Lcom/marrow2/domain/test/model/TestMiniUCModel;", "Lcom/marrow2/ui/test/landing/model/TestMiniVMModel;", "openIntroPage", "testId", "", "openGTAnalyticsScreen", "initToolbar", "openSearchScreen", "showToolbar", "hideToolbar", "showZeroState", "message", "", "hideZeroState", "showLoading", "hideLoading", "openTestScore", "openPreviousYearTestScreen", "year", "tabIndex", "getTabText", "Lcom/marrow/data/models/common/CourseConfigV2$TestTabItem;", "Lcom/marrow2/domain/courseConfig/model/TestTabItemUCModel;", "setMargins", "onTestClick", "onExpandAllClick", "onPreviousYearClick", "statusHeader", "Lcom/marrow2/ui/test/landing/model/TestListAdapterItemTypeModel$PreviousYearHeaderTypeModel;", "onGtItemDismissed", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WalletConstantsCardNetwork extends WalletConstantsCardClass implements PaymentAuthorizationResult.RemoteActionCompatParcelizer {
    public static final write AudioAttributesCompatParcelizer = new write(null);
    private final PaymentAuthorizationResult IconCompatParcelizer;
    private final getVersionCode MediaBrowserCompatItemReceiver;
    private final RenewEligible RemoteActionCompatParcelizer;
    private final isSpecialNorthAmericanChar read;
    private getNextMediaSequenceAndPartIndex write;

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[CourseConfigV2.TestTabItem.values().length];
            try {
                iArr[CourseConfigV2.TestTabItem.MCQ_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CourseConfigV2.TestTabItem.GRAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CourseConfigV2.TestTabItem.MINI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CourseConfigV2.TestTabItem.SUBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CourseConfigV2.TestTabItem.ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            read = iArr;
        }
    }

    public WalletConstantsCardNetwork() {
        WalletConstantsCardNetwork walletConstantsCardNetwork = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass5(new AnonymousClass2(walletConstantsCardNetwork)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(HomeTestViewModel.class), new AnonymousClass1(renewEligibleWrite), new AnonymousClass3(renewEligibleWrite), new AnonymousClass4(walletConstantsCardNetwork, renewEligibleWrite));
        PaymentAuthorizationResult paymentAuthorizationResult = new PaymentAuthorizationResult(this);
        this.IconCompatParcelizer = paymentAuthorizationResult;
        this.MediaBrowserCompatItemReceiver = new getVersionCode(0, 0, null, paymentAuthorizationResult, 7, null);
        this.read = new RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeTestViewModel read() {
        return (HomeTestViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public static final class RemoteActionCompatParcelizer extends isSpecialNorthAmericanChar {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.isSpecialNorthAmericanChar
        public final void RemoteActionCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            WalletConstantsCardNetwork.this.read().read(new LoyaltyPointsBalanceType.RemoteActionCompatParcelizer(str, str2));
        }

        @Override // kotlin.isSpecialNorthAmericanChar, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(inflater, "");
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindexAudioAttributesCompatParcelizer = getNextMediaSequenceAndPartIndex.AudioAttributesCompatParcelizer(inflater, container);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnextmediasequenceandpartindexAudioAttributesCompatParcelizer, "");
        this.write = getnextmediasequenceandpartindexAudioAttributesCompatParcelizer;
        if (getnextmediasequenceandpartindexAudioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindexAudioAttributesCompatParcelizer = null;
        }
        ConstraintLayout constraintLayoutWrite = getnextmediasequenceandpartindexAudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutWrite, "");
        return constraintLayoutWrite;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, savedInstanceState);
        AudioAttributesCompatParcelizer();
        AudioAttributesImplBaseParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        MediaBrowserCompatSearchResultReceiver();
        MediaDescriptionCompat();
        onCommand();
    }

    private final void AudioAttributesCompatParcelizer() {
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex2 = null;
        if (getnextmediasequenceandpartindex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex = null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = getnextmediasequenceandpartindex.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        getHttpMethodString.read((View) linearLayoutIconCompatParcelizer, true, false, true, true, 0, 50);
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex3 = this.write;
        if (getnextmediasequenceandpartindex3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex3 = null;
        }
        TabLayout tabLayout = getnextmediasequenceandpartindex3.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
        getHttpMethodString.read((View) tabLayout, false, false, true, true, 0, 51);
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex4 = this.write;
        if (getnextmediasequenceandpartindex4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getnextmediasequenceandpartindex2 = getnextmediasequenceandpartindex4;
        }
        CoordinatorLayout coordinatorLayout = getnextmediasequenceandpartindex2.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(coordinatorLayout, "");
        getHttpMethodString.read((View) coordinatorLayout, false, true, true, true, 0, 49);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        read().read(LoyaltyPointsBalanceType.MediaBrowserCompatMediaItem.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (requireActivity() instanceof zaay) {
            maybeGetTypeVariable maybegettypevariableRequireActivity = requireActivity();
            toMagicModuleMetaRepoModel.read(maybegettypevariableRequireActivity, "");
            read().read(new LoyaltyPointsBalanceType.RemoteActionCompatParcelizer("show_gt_nudge", ((zaay) maybegettypevariableRequireActivity).MediaMetadataCompat() ? "false" : "true"));
        }
        getSelectedIndexInTrackGroup.Companion audioAttributesCompatParcelizer = getSelectedIndexInTrackGroup.INSTANCE;
        getSelectedIndexInTrackGroup.Companion.write("test_home");
    }

    /* JADX INFO: renamed from: o.WalletConstantsCardNetwork$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "AudioAttributesCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.WalletConstantsCardNetwork$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "RemoteActionCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    /* JADX INFO: renamed from: o.WalletConstantsCardNetwork$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.WalletConstantsCardNetwork$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $read = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    private final void MediaDescriptionCompat() {
        getProvider getprovider = getProvider.getInstance(requireContext());
        isSpecialNorthAmericanChar isspecialnorthamericanchar = this.read;
        getprovider.registerReceiver(isspecialnorthamericanchar, isspecialnorthamericanchar.AudioAttributesCompatParcelizer());
    }

    /* JADX INFO: renamed from: o.WalletConstantsCardNetwork$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$RemoteActionCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.read);
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = WalletConstantsCardNetwork.this.read().MediaBrowserCompatCustomActionResultReceiver();
                final WalletConstantsCardNetwork walletConstantsCardNetwork = WalletConstantsCardNetwork.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.WalletConstantsCardNetwork.MediaBrowserCompatCustomActionResultReceiver.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object AudioAttributesCompatParcelizer(boolean z) {
                        walletConstantsCardNetwork.IconCompatParcelizer.RemoteActionCompatParcelizer(z);
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
            return WalletConstantsCardNetwork.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        WalletConstantsCardNetwork walletConstantsCardNetwork = this;
        setBitrateKbps.RemoteActionCompatParcelizer(walletConstantsCardNetwork, new MediaBrowserCompatCustomActionResultReceiver(null));
        setBitrateKbps.RemoteActionCompatParcelizer(walletConstantsCardNetwork, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.read(walletConstantsCardNetwork, new RatingCompat(null));
        setBitrateKbps.read(walletConstantsCardNetwork, new MediaMetadataCompat(null));
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
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi26Parcelizer = WalletConstantsCardNetwork.this.read().AudioAttributesImplApi26Parcelizer();
                final WalletConstantsCardNetwork walletConstantsCardNetwork = WalletConstantsCardNetwork.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.WalletConstantsCardNetwork.AudioAttributesImplBaseParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        if (z) {
                            walletConstantsCardNetwork.MediaBrowserCompatMediaItem();
                            walletConstantsCardNetwork.onCustomAction();
                        } else {
                            walletConstantsCardNetwork.AudioAttributesImplApi21Parcelizer();
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
            return WalletConstantsCardNetwork.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<C0178getStartTimestamp>> setupdatedstatusAudioAttributesImplApi21Parcelizer = WalletConstantsCardNetwork.this.read().AudioAttributesImplApi21Parcelizer();
                final WalletConstantsCardNetwork walletConstantsCardNetwork = WalletConstantsCardNetwork.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.WalletConstantsCardNetwork.RatingCompat.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object write(DataSourceBitmapLoaderExternalSyntheticLambda0<C0178getStartTimestamp> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        List<getBody> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            walletConstantsCardNetwork.MediaBrowserCompatItemReceiver();
                            decodeBitmap decodebitmap = (decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0;
                            boolean remoteActionCompatParcelizer = ((C0178getStartTimestamp) decodebitmap.RemoteActionCompatParcelizer()).getRemoteActionCompatParcelizer();
                            if (((C0178getStartTimestamp) decodebitmap.RemoteActionCompatParcelizer()).AudioAttributesCompatParcelizer().isEmpty()) {
                                walletConstantsCardNetwork.read(remoteActionCompatParcelizer ? R.string.text_coming_soon : R.string.text_no_tests_conducted);
                            } else {
                                walletConstantsCardNetwork.AudioAttributesImplApi26Parcelizer();
                                listRemoteActionCompatParcelizer = ((C0178getStartTimestamp) decodebitmap.RemoteActionCompatParcelizer()).AudioAttributesCompatParcelizer();
                            }
                            getProvider getprovider = getProvider.getInstance(walletConstantsCardNetwork.requireContext());
                            isSpecialNorthAmericanChar.Companion companion = isSpecialNorthAmericanChar.INSTANCE;
                            getprovider.AudioAttributesCompatParcelizer(isSpecialNorthAmericanChar.Companion.RemoteActionCompatParcelizer("should_show_gt_nudge", "true"));
                            int read = ((C0178getStartTimestamp) decodebitmap.RemoteActionCompatParcelizer()).getRead();
                            walletConstantsCardNetwork.IconCompatParcelizer.RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer);
                            if (!listRemoteActionCompatParcelizer.isEmpty() && read >= 0) {
                                getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = walletConstantsCardNetwork.write;
                                getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex2 = null;
                                if (getnextmediasequenceandpartindex == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    getnextmediasequenceandpartindex = null;
                                }
                                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = getnextmediasequenceandpartindex.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
                                toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
                                ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).onCommand();
                                getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex3 = walletConstantsCardNetwork.write;
                                if (getnextmediasequenceandpartindex3 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    getnextmediasequenceandpartindex2 = getnextmediasequenceandpartindex3;
                                }
                                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer2 = getnextmediasequenceandpartindex2.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
                                toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer2, "");
                                ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer2).read(read, 100);
                                walletConstantsCardNetwork.read().read(LoyaltyPointsBalanceType.write.INSTANCE);
                            }
                        } else if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) {
                            walletConstantsCardNetwork.handleMediaPlayPauseIfPendingOnHandler();
                        } else {
                            walletConstantsCardNetwork.MediaBrowserCompatItemReceiver();
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

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return WalletConstantsCardNetwork.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaMetadataCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.WalletConstantsCardNetwork$MediaMetadataCompat$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements getValidationToken {
            private /* synthetic */ WalletConstantsCardNetwork AudioAttributesCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return AudioAttributesCompatParcelizer((LoyaltyPointsBuilder) obj);
            }

            private Object AudioAttributesCompatParcelizer(final LoyaltyPointsBuilder loyaltyPointsBuilder) {
                getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.AudioAttributesCompatParcelizer.write;
                getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex2 = null;
                if (getnextmediasequenceandpartindex == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    getnextmediasequenceandpartindex = null;
                }
                ComposeView composeView = getnextmediasequenceandpartindex.write;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(composeView, "");
                composeView.setVisibility(loyaltyPointsBuilder.getAudioAttributesCompatParcelizer() ? 0 : 8);
                if (loyaltyPointsBuilder.getAudioAttributesCompatParcelizer()) {
                    getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex3 = this.AudioAttributesCompatParcelizer.write;
                    if (getnextmediasequenceandpartindex3 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        getnextmediasequenceandpartindex2 = getnextmediasequenceandpartindex3;
                    }
                    ComposeView composeView2 = getnextmediasequenceandpartindex2.write;
                    final WalletConstantsCardNetwork walletConstantsCardNetwork = this.AudioAttributesCompatParcelizer;
                    composeView2.setContent(multiplyFft.IconCompatParcelizer(-1731820462, true, new MagicModuleSubmissionRequestBody() { // from class: o.WalletConstantsTotalPriceStatus
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return WalletConstantsCardNetwork.MediaMetadataCompat.AnonymousClass2.AudioAttributesCompatParcelizer(loyaltyPointsBuilder, walletConstantsCardNetwork, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                        }
                    }));
                } else {
                    getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex4 = this.AudioAttributesCompatParcelizer.write;
                    if (getnextmediasequenceandpartindex4 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        getnextmediasequenceandpartindex2 = getnextmediasequenceandpartindex4;
                    }
                    getnextmediasequenceandpartindex2.write.RemoteActionCompatParcelizer();
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup AudioAttributesCompatParcelizer(LoyaltyPointsBuilder loyaltyPointsBuilder, final WalletConstantsCardNetwork walletConstantsCardNetwork, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
                if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                    _handleunrecognizedcharacterescape.onPrepareFromSearch();
                } else {
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesCompatParcelizer(-1731820462, i, -1, "com.marrow2.ui.test.landing.HomeTestFragment.observeData.<anonymous>.<anonymous>.<anonymous> (HomeTestFragment.kt:195)");
                    }
                    boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(walletConstantsCardNetwork);
                    Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                    if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause = new getCreatedOnDateMs() { // from class: o.onPaymentAuthorized
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return WalletConstantsCardNetwork.MediaMetadataCompat.AnonymousClass2.RemoteActionCompatParcelizer(walletConstantsCardNetwork);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                    }
                    getHexFontColor.write(null, loyaltyPointsBuilder, BitmapDescriptorFactory.HUE_RED, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescape, 0, 5);
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    }
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup RemoteActionCompatParcelizer(WalletConstantsCardNetwork walletConstantsCardNetwork) {
                walletConstantsCardNetwork.read().read(LoyaltyPointsBalanceType.IconCompatParcelizer.INSTANCE);
                return getShowPopup.INSTANCE;
            }

            AnonymousClass2(WalletConstantsCardNetwork walletConstantsCardNetwork) {
                this.AudioAttributesCompatParcelizer = walletConstantsCardNetwork;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (WalletConstantsCardNetwork.this.read().IconCompatParcelizer().write(new AnonymousClass2(WalletConstantsCardNetwork.this), this) == objIconCompatParcelizer) {
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
            return WalletConstantsCardNetwork.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        new StickyHeaderLinearLayoutManager(contextRequireContext, 0, false, 6, null);
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex2 = null;
        if (getnextmediasequenceandpartindex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex = null;
        }
        getnextmediasequenceandpartindex.AudioAttributesImplApi21Parcelizer.setAdapter(this.IconCompatParcelizer);
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex3 = this.write;
        if (getnextmediasequenceandpartindex3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex3 = null;
        }
        getnextmediasequenceandpartindex3.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex4 = this.write;
        if (getnextmediasequenceandpartindex4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getnextmediasequenceandpartindex2 = getnextmediasequenceandpartindex4;
        }
        getnextmediasequenceandpartindex2.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(new IconCompatParcelizer());
    }

    public static final class IconCompatParcelizer extends RecyclerView.MediaBrowserCompatSearchResultReceiver {
        IconCompatParcelizer() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
        public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            toMagicModuleMetaRepoModel.write(recyclerView, "");
            getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = WalletConstantsCardNetwork.this.write;
            if (getnextmediasequenceandpartindex == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getnextmediasequenceandpartindex = null;
            }
            RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = getnextmediasequenceandpartindex.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
            toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
            int iMediaBrowserCompatCustomActionResultReceiver = ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).MediaBrowserCompatCustomActionResultReceiver();
            int itemCount = WalletConstantsCardNetwork.this.IconCompatParcelizer.getItemCount();
            if (iMediaBrowserCompatCustomActionResultReceiver < 0 || iMediaBrowserCompatCustomActionResultReceiver >= itemCount) {
                return;
            }
            WalletConstantsCardNetwork.this.read().read(new LoyaltyPointsBalanceType.MediaMetadataCompat(iMediaBrowserCompatCustomActionResultReceiver));
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
        if (getnextmediasequenceandpartindex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex = null;
        }
        getnextmediasequenceandpartindex.MediaBrowserCompatCustomActionResultReceiver.write((TabLayout.AudioAttributesCompatParcelizer) new DataSourceBitmapLoader(new getAnswerMap() { // from class: o.BasePaymentDataCallbacks
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return WalletConstantsCardNetwork.read(this.read, (TabLayout.MediaBrowserCompatCustomActionResultReceiver) obj);
            }
        }));
        WalletConstantsCardNetwork walletConstantsCardNetwork = this;
        setBitrateKbps.RemoteActionCompatParcelizer(walletConstantsCardNetwork, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(walletConstantsCardNetwork, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.RemoteActionCompatParcelizer(walletConstantsCardNetwork, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(walletConstantsCardNetwork, new AudioAttributesImplApi26Parcelizer(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(WalletConstantsCardNetwork walletConstantsCardNetwork, TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatCustomActionResultReceiver, "");
        walletConstantsCardNetwork.read().read(new LoyaltyPointsBalanceType.AudioAttributesImplApi21Parcelizer(mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer()));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<CourseConfigV2.TestTabItem>> setupdatedstatusAudioAttributesImplBaseParcelizer = WalletConstantsCardNetwork.this.read().AudioAttributesImplBaseParcelizer();
                final WalletConstantsCardNetwork walletConstantsCardNetwork = WalletConstantsCardNetwork.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.WalletConstantsCardNetwork.AudioAttributesCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((List) obj2);
                    }

                    private Object IconCompatParcelizer(List<? extends CourseConfigV2.TestTabItem> list) {
                        WalletConstantsCardNetwork walletConstantsCardNetwork2 = walletConstantsCardNetwork;
                        for (CourseConfigV2.TestTabItem testTabItem : list) {
                            getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = walletConstantsCardNetwork2.write;
                            getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex2 = null;
                            if (getnextmediasequenceandpartindex == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                getnextmediasequenceandpartindex = null;
                            }
                            TabLayout tabLayout = getnextmediasequenceandpartindex.MediaBrowserCompatCustomActionResultReceiver;
                            getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex3 = walletConstantsCardNetwork2.write;
                            if (getnextmediasequenceandpartindex3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                getnextmediasequenceandpartindex2 = getnextmediasequenceandpartindex3;
                            }
                            tabLayout.AudioAttributesCompatParcelizer(getnextmediasequenceandpartindex2.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer().write(walletConstantsCardNetwork2.RemoteActionCompatParcelizer(testTabItem)), false);
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
            return WalletConstantsCardNetwork.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Integer> setupdatedstatusAudioAttributesCompatParcelizer = WalletConstantsCardNetwork.this.read().AudioAttributesCompatParcelizer();
                final WalletConstantsCardNetwork walletConstantsCardNetwork = WalletConstantsCardNetwork.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.WalletConstantsCardNetwork.MediaBrowserCompatItemReceiver.5
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Number) obj2).intValue());
                    }

                    private Object IconCompatParcelizer(int i2) {
                        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = walletConstantsCardNetwork.write;
                        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex2 = null;
                        if (getnextmediasequenceandpartindex == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            getnextmediasequenceandpartindex = null;
                        }
                        TabLayout tabLayout = getnextmediasequenceandpartindex.MediaBrowserCompatCustomActionResultReceiver;
                        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex3 = walletConstantsCardNetwork.write;
                        if (getnextmediasequenceandpartindex3 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            getnextmediasequenceandpartindex2 = getnextmediasequenceandpartindex3;
                        }
                        tabLayout.IconCompatParcelizer(getnextmediasequenceandpartindex2.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(i2));
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
            return WalletConstantsCardNetwork.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
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
                setUpdatedStatus<String> setupdatedstatus = WalletConstantsCardNetwork.this.read().read();
                final WalletConstantsCardNetwork walletConstantsCardNetwork = WalletConstantsCardNetwork.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.WalletConstantsCardNetwork.AudioAttributesImplApi21Parcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((String) obj2);
                    }

                    private Object read(String str) {
                        if (TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
                            return getShowPopup.INSTANCE;
                        }
                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(walletConstantsCardNetwork, str, 0);
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
            return WalletConstantsCardNetwork.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<TextModuleData> setupdatedstatusMediaBrowserCompatItemReceiver = WalletConstantsCardNetwork.this.read().MediaBrowserCompatItemReceiver();
                final WalletConstantsCardNetwork walletConstantsCardNetwork = WalletConstantsCardNetwork.this;
                this.read = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.WalletConstantsCardNetwork.AudioAttributesImplApi26Parcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((TextModuleData) obj2);
                    }

                    private Object IconCompatParcelizer(TextModuleData textModuleData) {
                        if (textModuleData instanceof TextModuleData.RemoteActionCompatParcelizer) {
                            walletConstantsCardNetwork.RemoteActionCompatParcelizer(((TextModuleData.RemoteActionCompatParcelizer) textModuleData).IconCompatParcelizer());
                        } else if (textModuleData instanceof TextModuleData.write) {
                            walletConstantsCardNetwork.write(((TextModuleData.write) textModuleData).read());
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(textModuleData, TextModuleData.AudioAttributesCompatParcelizer.INSTANCE)) {
                            walletConstantsCardNetwork.RatingCompat();
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(textModuleData, TextModuleData.read.INSTANCE)) {
                            throw new RenewEligibleCreator();
                        }
                        walletConstantsCardNetwork.read().read(LoyaltyPointsBalanceType.AudioAttributesImplBaseParcelizer.INSTANCE);
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
            return WalletConstantsCardNetwork.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(getBigEndianInt getbigendianint) {
        read().read(new LoyaltyPointsBalanceType.AudioAttributesImplApi26Parcelizer(getbigendianint));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String str) {
        addAllowedCountryCodes.Companion companion = addAllowedCountryCodes.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(addAllowedCountryCodes.Companion.read(contextRequireContext, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RatingCompat() {
        createBundleFromClientSettings.Companion iconCompatParcelizer = createBundleFromClientSettings.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(createBundleFromClientSettings.Companion.read(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem() {
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex2 = null;
        if (getnextmediasequenceandpartindex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex = null;
        }
        getnextmediasequenceandpartindex.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer.setText(R.string.tab_tests);
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex3 = this.write;
        if (getnextmediasequenceandpartindex3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex3 = null;
        }
        getnextmediasequenceandpartindex3.AudioAttributesImplBaseParcelizer.read.setOnClickListener(new View.OnClickListener() { // from class: o.WalletConstantsPaymentMethodTokenizationType
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WalletConstantsCardNetwork.MediaBrowserCompatMediaItem(this.write);
            }
        });
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex4 = this.write;
        if (getnextmediasequenceandpartindex4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getnextmediasequenceandpartindex2 = getnextmediasequenceandpartindex4;
        }
        getnextmediasequenceandpartindex2.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.WalletObjectsClient
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WalletConstantsCardNetwork.MediaMetadataCompat(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatMediaItem(WalletConstantsCardNetwork walletConstantsCardNetwork) {
        walletConstantsCardNetwork.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaMetadataCompat(WalletConstantsCardNetwork walletConstantsCardNetwork) {
        walletConstantsCardNetwork.MediaMetadataCompat();
    }

    private final void MediaMetadataCompat() {
        startActivity(new Intent(requireContext(), (Class<?>) toInteger.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomAction() {
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
        if (getnextmediasequenceandpartindex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex = null;
        }
        LinearLayout linearLayout = getnextmediasequenceandpartindex.AudioAttributesImplBaseParcelizer.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi21Parcelizer() {
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
        if (getnextmediasequenceandpartindex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex = null;
        }
        LinearLayout linearLayout = getnextmediasequenceandpartindex.AudioAttributesImplBaseParcelizer.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(int i) {
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
        if (getnextmediasequenceandpartindex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex = null;
        }
        maybeSelectNewPrimaryUrl maybeselectnewprimaryurl = getnextmediasequenceandpartindex.AudioAttributesCompatParcelizer;
        LinearLayout linearLayout = maybeselectnewprimaryurl.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
        maybeselectnewprimaryurl.write.setText(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
        if (getnextmediasequenceandpartindex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex = null;
        }
        LinearLayout linearLayout = getnextmediasequenceandpartindex.AudioAttributesCompatParcelizer.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
        if (getnextmediasequenceandpartindex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex = null;
        }
        FrameLayout frameLayout = getnextmediasequenceandpartindex.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
        if (getnextmediasequenceandpartindex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex = null;
        }
        FrameLayout frameLayout = getnextmediasequenceandpartindex.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String str) {
        setActionUri.Companion readVar = setActionUri.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(setActionUri.Companion.read(contextRequireContext, new setExpandedTitleTypeface(str, false)));
    }

    private final void RemoteActionCompatParcelizer(int i, int i2) {
        WalletConstantsPaymentMethod.Companion writeVar = WalletConstantsPaymentMethod.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(WalletConstantsPaymentMethod.Companion.write(contextRequireContext, new setBalance(i, i2, false, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String RemoteActionCompatParcelizer(CourseConfigV2.TestTabItem testTabItem) {
        int i = read.read[testTabItem.ordinal()];
        if (i == 1) {
            String string = getString(R.string.text_test_200_mcq_quest);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }
        if (i == 2) {
            String string2 = getString(R.string.text_test_grand);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            return string2;
        }
        if (i == 3) {
            String string3 = getString(R.string.text_test_mini);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            return string3;
        }
        if (i == 4) {
            String string4 = getString(R.string.text_test_subject_wise);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
            return string4;
        }
        if (i != 5) {
            throw new RenewEligibleCreator();
        }
        String string5 = getString(R.string.text_test_all);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
        return string5;
    }

    private final void onCommand() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
            getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex2 = null;
            if (getnextmediasequenceandpartindex == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getnextmediasequenceandpartindex = null;
            }
            TabLayout tabLayout = getnextmediasequenceandpartindex.MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, tabLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex3 = this.write;
            if (getnextmediasequenceandpartindex3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getnextmediasequenceandpartindex3 = null;
            }
            AppBarLayout appBarLayout = getnextmediasequenceandpartindex3.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(appBarLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext2, appBarLayout);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex4 = this.write;
            if (getnextmediasequenceandpartindex4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                getnextmediasequenceandpartindex2 = getnextmediasequenceandpartindex4;
            }
            RecyclerView recyclerView = getnextmediasequenceandpartindex2.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext3, recyclerView);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/WalletConstantsCardNetwork$write;", "", "<init>", "()V", "Lo/setBalance;", "p0", "Lo/WalletConstantsCardNetwork;", "AudioAttributesCompatParcelizer", "(Lo/setBalance;)Lo/WalletConstantsCardNetwork;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        @getMagicModuleMeta
        public static WalletConstantsCardNetwork AudioAttributesCompatParcelizer(setBalance p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            WalletConstantsCardNetwork walletConstantsCardNetwork = new WalletConstantsCardNetwork();
            walletConstantsCardNetwork.setArguments(p0.write());
            return walletConstantsCardNetwork;
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // o.PaymentAuthorizationResult.RemoteActionCompatParcelizer
    public final void read(getBigEndianInt getbigendianint) {
        toMagicModuleMetaRepoModel.write(getbigendianint, "");
        RemoteActionCompatParcelizer(getbigendianint);
    }

    @Override // o.PaymentAuthorizationResult.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        read().read(LoyaltyPointsBalanceType.AudioAttributesCompatParcelizer.INSTANCE);
    }

    @Override // o.PaymentAuthorizationResult.RemoteActionCompatParcelizer
    public final void read(getBody.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatCustomActionResultReceiver, "");
        read().read(new LoyaltyPointsBalanceType.MediaBrowserCompatItemReceiver(mediaBrowserCompatCustomActionResultReceiver.getRead()));
        int remoteActionCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver.getRemoteActionCompatParcelizer();
        getNextMediaSequenceAndPartIndex getnextmediasequenceandpartindex = this.write;
        if (getnextmediasequenceandpartindex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getnextmediasequenceandpartindex = null;
        }
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer, getnextmediasequenceandpartindex.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer());
    }

    @Override // o.PaymentAuthorizationResult.RemoteActionCompatParcelizer
    public final void write() {
        read().read(LoyaltyPointsBalanceType.read.INSTANCE);
    }
}
