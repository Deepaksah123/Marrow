package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import com.marrow.data.models.user.State;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow.ui.views.CustomAppBarLayout;
import com.marrow2.data.test.remote.model.RankPairModel;
import com.marrow2.ui.test.score.TestScoreViewModel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AppMeasurementSdkEventInterceptor;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.createBundleFromClientSettings;
import kotlin.getAutofillClient;
import kotlin.logEventInternalNoInterceptor;
import kotlin.parseNextToken;
import kotlin.setExpandedTitleTextAppearance;
import kotlin.setExpandedTitleTextSize;
import kotlin.setExtraMultilineHeightEnabled;
import kotlin.setForceApplySystemWindowInsetTop;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 d2\u00020\u0001:\u0001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J%\u0010'\u001a\u00020\u001c2\u0010\u0010(\u001a\f\u0012\b\u0012\u00060*j\u0002`+0)2\u0006\u0010,\u001a\u00020$¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0002J\u0010\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u001cH\u0002J\u0010\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020\u001c2\b\b\u0001\u0010;\u001a\u00020&J\u000e\u0010<\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u000e\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020$J\b\u0010?\u001a\u00020\u001cH\u0002J\u0010\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020\u001cH\u0002J\b\u0010D\u001a\u00020\u001cH\u0002J\b\u0010E\u001a\u00020\u001cH\u0002J\b\u0010F\u001a\u00020\u001cH\u0002J\b\u0010G\u001a\u00020\u001cH\u0002J\b\u0010H\u001a\u00020\u001cH\u0002J\b\u0010I\u001a\u00020\u001cH\u0002J\b\u0010J\u001a\u00020\u001cH\u0002J\"\u0010K\u001a\u00020\u001c2\u0006\u0010L\u001a\u00020&2\u0006\u0010M\u001a\u00020&2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020RH\u0002J\u0010\u0010S\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020UH\u0002J\b\u0010V\u001a\u00020\u001cH\u0002J(\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020$2\u0006\u0010Z\u001a\u00020$2\u0006\u0010[\u001a\u00020$2\u0006\u0010\\\u001a\u00020$H\u0002J\u0018\u0010]\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\b\u0010^\u001a\u0004\u0018\u00010$J\u0010\u0010_\u001a\u00020\u001c2\u0006\u0010`\u001a\u00020aH\u0002J\u0018\u0010b\u001a\u00020\u001c2\u0006\u0010Y\u001a\u00020$2\u0006\u0010c\u001a\u00020$H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Lcom/marrow2/ui/test/score/TestScoreFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "testScoreViewModel", "Lcom/marrow2/ui/test/score/TestScoreViewModel;", "getTestScoreViewModel", "()Lcom/marrow2/ui/test/score/TestScoreViewModel;", "testScoreViewModel$delegate", "Lkotlin/Lazy;", "_binding", "Lcom/marrow/databinding/FragmentTestScoreBinding;", "binding", "getBinding", "()Lcom/marrow/databinding/FragmentTestScoreBinding;", "testScoreListAdapter", "Lcom/marrow2/ui/test/score/adapter/TestScoreListAdapter;", "testAnalyticsListAdapter", "Lcom/marrow2/ui/test/analytics/adapter/TestAnalyticsListAdapter;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "setMargins", "applyEdgeToEdgeInsets", "initListener", "openReviewScreen", "testId", "", "filterType", "", "openStateSelectionScreen", "states", "", "Lcom/marrow/data/models/user/State;", "Lcom/marrow2/domain/state/model/StateUCModel;", "selectedStateId", "([Lcom/marrow/data/models/user/State;Ljava/lang/String;)V", "initAdapter", "initObservables", "renderGtAnalyticsCardDelayed", "isResultOut", "", "renderGtAnalyticsCard", NotesDispatchAddressRequestKt.KEY_STATE, "Lcom/marrow2/ui/test/landing/model/GTAnalyticsCardUiModel;", "openGTAnalyticsScreen", "paintUi", "testScoreUiState", "Lcom/marrow2/ui/test/score/model/TestScoreUiState;", "showErrorMessage", "errorMessage", "onShareClicked", CourseConfigKeyConstantsKt.KEY_SHARE, "shareMessage", "disableStateToggleButton", "showReviewAvailableToast", "time", "", "showReviewNotAvailable", "showReviewLockIcon", "hideReviewLockIcon", "showReviewAvailable", "showProDialog", "showGeneralPredictionInfoDialog", "showStatePredictionInfoDialog", "initToolbar", "onActivityResult", "reqCode", "resultCode", "data", "Landroid/content/Intent;", "populateTimeCard", "timerCardUiState", "Lcom/marrow2/ui/test/score/model/TimerCardUiState;", "populateGuessCard", "guessedStat", "Lcom/marrow2/ui/test/score/model/GuessCardUIState;", "populateNoGuessCard", "setGuessCardDescSpannable", "Landroid/text/SpannableString;", "text", "totalGuessedCount", "correctCount", "score", "openTestReview", "subjectId", "populateAnswersChanged", "answerCardUiState", "Lcom/marrow2/ui/test/score/model/AnswerCardUiState;", "setAnswerChangedTitle", "totalChanged", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setHeader extends getImageUri {
    public static final read write = new read(null);
    private final RenewEligible AudioAttributesCompatParcelizer;
    private buildSampleStreamWrapper IconCompatParcelizer;
    private setContentScrimResource RemoteActionCompatParcelizer;
    private AppMeasurementSdkEventInterceptor read;

    public setHeader() {
        setHeader setheader = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass2(setheader)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(TestScoreViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass1(setheader, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TestScoreViewModel RemoteActionCompatParcelizer() {
        return (TestScoreViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final buildSampleStreamWrapper write() {
        buildSampleStreamWrapper buildsamplestreamwrapper = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(buildsamplestreamwrapper);
        return buildsamplestreamwrapper;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(inflater, "");
        this.IconCompatParcelizer = buildSampleStreamWrapper.IconCompatParcelizer(inflater, container);
        CoordinatorLayout coordinatorLayoutIconCompatParcelizer = write().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(coordinatorLayoutIconCompatParcelizer, "");
        return coordinatorLayoutIconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.setHeader$2, reason: invalid class name */
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.IconCompatParcelizer = null;
    }

    /* JADX INFO: renamed from: o.setHeader$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "RemoteActionCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, savedInstanceState);
        AudioAttributesCompatParcelizer();
        isSeekPending isseekpendingIconCompatParcelizer = RtspHeadersBuilder.IconCompatParcelizer();
        String name = getClass().getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
        isseekpendingIconCompatParcelizer.RemoteActionCompatParcelizer("testScore", name, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new updateLoadingFinished[]{updateLoadingFinished.AudioAttributesCompatParcelizer, updateLoadingFinished.RemoteActionCompatParcelizer}));
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplApi21Parcelizer();
        AudioAttributesImplBaseParcelizer();
        AudioAttributesImplApi26Parcelizer();
        RatingCompat();
    }

    /* JADX INFO: renamed from: o.setHeader$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setHeader$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setHeader$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    private final void RatingCompat() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            LinearLayout linearLayout = write().AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        CustomAppBarLayout customAppBarLayout = write().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customAppBarLayout, "");
        getHttpMethodString.read((View) customAppBarLayout, true, false, true, true, 0, 50);
        NestedScrollView nestedScrollView = write().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nestedScrollView, "");
        getHttpMethodString.read((View) nestedScrollView, false, true, true, true, 0, 49);
    }

    private final void AudioAttributesImplBaseParcelizer() {
        write().MediaBrowserCompatItemReceiver.read.setOnClickListener(new View.OnClickListener() { // from class: o.WalletObjectsConstants
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setHeader.MediaDescriptionCompat(this.AudioAttributesCompatParcelizer);
            }
        });
        write().MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.AppBarLayout
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setHeader.onAddQueueItem(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(setHeader setheader) {
        setheader.RemoteActionCompatParcelizer().IconCompatParcelizer(setExpandedTitleTextAppearance.AudioAttributesImplApi21Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAddQueueItem(setHeader setheader) {
        if (setheader.write().MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer.isSelected()) {
            if (!getTrackName.write(setheader.requireContext())) {
                setHeader setheader2 = setheader;
                String string = setheader.getString(R.string.app_error_no_internet);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setheader2, string, 0);
                return;
            }
            setheader.RemoteActionCompatParcelizer().IconCompatParcelizer(setExpandedTitleTextAppearance.MediaBrowserCompatItemReceiver.INSTANCE);
            return;
        }
        setheader.RemoteActionCompatParcelizer().IconCompatParcelizer(setExpandedTitleTextAppearance.AudioAttributesCompatParcelizer.INSTANCE);
        setheader.RemoteActionCompatParcelizer().IconCompatParcelizer(setExpandedTitleTextAppearance.MediaBrowserCompatMediaItem.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(String str, int i) {
        getMediaMimeType getmediamimetype;
        if (i == -5) {
            getmediamimetype = getMediaMimeType.MediaBrowserCompatItemReceiver;
        } else if (i == -4) {
            getmediamimetype = getMediaMimeType.AudioAttributesImplApi26Parcelizer;
        } else if (i == -3) {
            getmediamimetype = getMediaMimeType.MediaMetadataCompat;
        } else {
            getmediamimetype = getMediaMimeType.AudioAttributesImplBaseParcelizer;
        }
        getMediaMimeType getmediamimetype2 = getmediamimetype;
        setForceApplySystemWindowInsetTop.Companion companion = setForceApplySystemWindowInsetTop.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(setForceApplySystemWindowInsetTop.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new setStaticLayoutBuilderConfigurer(str, true, false, false, getmediamimetype2, null, null, 108, null)));
    }

    public final void RemoteActionCompatParcelizer(State[] stateArr, String str) {
        toMagicModuleMetaRepoModel.write(stateArr, "");
        toMagicModuleMetaRepoModel.write(str, "");
        parseNextToken.Companion companion = parseNextToken.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String string = getString(R.string.select_state_default);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        startActivityForResult(parseNextToken.Companion.read(contextRequireContext, stateArr, string, str), 100);
    }

    public static final class write implements setCollapsedTitleTextSize {
        write() {
        }

        @Override // kotlin.setCollapsedTitleTextSize
        public final void write(int i, setExpandedTitleTextSize.IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            setHeader.this.RemoteActionCompatParcelizer().IconCompatParcelizer(new setExpandedTitleTextAppearance.AudioAttributesImplApi26Parcelizer(i, iconCompatParcelizer));
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        this.RemoteActionCompatParcelizer = new setContentScrimResource(new write());
        RecyclerView recyclerView = write().RatingCompat;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        setContentScrimResource setcontentscrimresource = this.RemoteActionCompatParcelizer;
        AppMeasurementSdkEventInterceptor appMeasurementSdkEventInterceptor = null;
        if (setcontentscrimresource == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            setcontentscrimresource = null;
        }
        recyclerView.setAdapter(setcontentscrimresource);
        this.read = new AppMeasurementSdkEventInterceptor(new IconCompatParcelizer());
        RecyclerView recyclerView2 = write().MediaBrowserCompatSearchResultReceiver;
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        AppMeasurementSdkEventInterceptor appMeasurementSdkEventInterceptor2 = this.read;
        if (appMeasurementSdkEventInterceptor2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            appMeasurementSdkEventInterceptor = appMeasurementSdkEventInterceptor2;
        }
        recyclerView2.setAdapter(appMeasurementSdkEventInterceptor);
    }

    public static final class IconCompatParcelizer implements AppMeasurementSdkEventInterceptor.AudioAttributesCompatParcelizer {
        IconCompatParcelizer() {
        }

        @Override // o.AppMeasurementSdkEventInterceptor.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(String str, String str2, int i) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            setHeader.this.RemoteActionCompatParcelizer().IconCompatParcelizer(new setExpandedTitleTextAppearance.write(str2, str, i));
            setHeader.this.RemoteActionCompatParcelizer(str2, str);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<setLineSpacingAdd>> setupdatedstatusMediaBrowserCompatMediaItem = setHeader.this.RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem();
                final setHeader setheader = setHeader.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatMediaItem.write(new getValidationToken() { // from class: o.setHeader.RemoteActionCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object read(DataSourceBitmapLoaderExternalSyntheticLambda0<setLineSpacingAdd> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            ProgressBar progressBar = setheader.write().MediaBrowserCompatCustomActionResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
                            View view = setheader.write().AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                            decodeBitmap decodebitmap = (decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0;
                            boolean z = false;
                            view.setVisibility(((setLineSpacingAdd) decodebitmap.RemoteActionCompatParcelizer()).getRatingCompat() ? 0 : 8);
                            setheader.write((setLineSpacingAdd) decodebitmap.RemoteActionCompatParcelizer());
                            setHeader setheader2 = setheader;
                            if (((setLineSpacingAdd) decodebitmap.RemoteActionCompatParcelizer()).getRemoteActionCompatParcelizer() && ((setLineSpacingAdd) decodebitmap.RemoteActionCompatParcelizer()).getAudioAttributesCompatParcelizer() != -2) {
                                z = true;
                            }
                            setheader2.write(z);
                        } else if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) {
                            ProgressBar progressBar2 = setheader.write().MediaBrowserCompatCustomActionResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar2);
                        } else if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps) {
                            ProgressBar progressBar3 = setheader.write().MediaBrowserCompatCustomActionResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar3, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar3);
                        } else {
                            throw new RenewEligibleCreator();
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
            return setHeader.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        setHeader setheader = this;
        setBitrateKbps.read(setheader, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(setheader, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(setheader, new MediaBrowserCompatCustomActionResultReceiver(null));
        setBitrateKbps.read(setheader, new AudioAttributesImplApi26Parcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(setheader, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(setheader, new MediaDescriptionCompat(null));
        setBitrateKbps.read(setheader, new MediaBrowserCompatSearchResultReceiver(null));
        setBitrateKbps.read(setheader, new RatingCompat(null));
        setBitrateKbps.read(setheader, new MediaMetadataCompat(null));
        setBitrateKbps.read(setheader, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(setheader, new MediaBrowserCompatItemReceiver(null));
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<Pair<Integer, String>> isdarkAudioAttributesCompatParcelizer = setHeader.this.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
                final setHeader setheader = setHeader.this;
                this.write = 1;
                if (isdarkAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.setHeader.AudioAttributesImplApi21Parcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((Pair) obj2);
                    }

                    private Object read(Pair<Integer, String> pair) {
                        TextView textView = setheader.write().MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
                        ProgressBar progressBar = setheader.write().MediaBrowserCompatCustomActionResultReceiver;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
                        if (pair.write().intValue() > 0) {
                            int iIntValue = pair.write().intValue();
                            if (iIntValue == 400 || iIntValue == 502) {
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setheader, pair.IconCompatParcelizer(), 0);
                                setheader.requireActivity().finish();
                            } else if (iIntValue == 1800) {
                                setheader.AudioAttributesCompatParcelizer(R.string.er_code_1800_st_rank_na);
                            } else if (iIntValue != 1801) {
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setheader, pair.IconCompatParcelizer(), 0);
                            } else {
                                setheader.AudioAttributesCompatParcelizer(R.string.er_code_1801_st_rank_na);
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

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setHeader.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<setExpandedTitleTextSize>> setupdatedstatusMediaDescriptionCompat = setHeader.this.RemoteActionCompatParcelizer().MediaDescriptionCompat();
                final setHeader setheader = setHeader.this;
                this.read = 1;
                if (setupdatedstatusMediaDescriptionCompat.write(new getValidationToken() { // from class: o.setHeader.MediaBrowserCompatCustomActionResultReceiver.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((List) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(List<? extends setExpandedTitleTextSize> list) {
                        setContentScrimResource setcontentscrimresource = setheader.RemoteActionCompatParcelizer;
                        if (setcontentscrimresource == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            setcontentscrimresource = null;
                        }
                        setcontentscrimresource.read(list);
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
            return setHeader.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
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
                setUpdatedStatus<setExtraMultilineHeightEnabled> setupdatedstatusAudioAttributesImplApi21Parcelizer = setHeader.this.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer();
                final setHeader setheader = setHeader.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.setHeader.AudioAttributesImplApi26Parcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((setExtraMultilineHeightEnabled) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(setExtraMultilineHeightEnabled setextramultilineheightenabled) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setextramultilineheightenabled, setExtraMultilineHeightEnabled.IconCompatParcelizer.INSTANCE)) {
                            setheader.MediaDescriptionCompat();
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setextramultilineheightenabled, setExtraMultilineHeightEnabled.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
                            setheader.MediaBrowserCompatSearchResultReceiver();
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setextramultilineheightenabled, setExtraMultilineHeightEnabled.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                            setheader.onCustomAction();
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setextramultilineheightenabled, setExtraMultilineHeightEnabled.AudioAttributesCompatParcelizer.INSTANCE)) {
                            if (setextramultilineheightenabled instanceof setExtraMultilineHeightEnabled.read) {
                                if (!getTrackName.write(setheader.requireContext())) {
                                    setHeader setheader2 = setheader;
                                    setHeader setheader3 = setheader2;
                                    String string = setheader2.getString(R.string.app_error_no_internet);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setheader3, string, 0);
                                } else {
                                    logEventInternalNoInterceptor.Companion companion = logEventInternalNoInterceptor.INSTANCE;
                                    Context contextRequireContext = setheader.requireContext();
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                    setExtraMultilineHeightEnabled.read readVar = (setExtraMultilineHeightEnabled.read) setextramultilineheightenabled;
                                    setheader.startActivity(logEventInternalNoInterceptor.Companion.IconCompatParcelizer(contextRequireContext, new onProviderInstallFailed(readVar.read(), readVar.IconCompatParcelizer().read())));
                                }
                            } else if (setextramultilineheightenabled instanceof setExtraMultilineHeightEnabled.write) {
                                setExtraMultilineHeightEnabled.write writeVar = (setExtraMultilineHeightEnabled.write) setextramultilineheightenabled;
                                setheader.AudioAttributesCompatParcelizer(writeVar.write(), writeVar.IconCompatParcelizer());
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setextramultilineheightenabled, setExtraMultilineHeightEnabled.RemoteActionCompatParcelizer.INSTANCE)) {
                                setheader.MediaBrowserCompatMediaItem();
                            } else if (setextramultilineheightenabled instanceof setExtraMultilineHeightEnabled.MediaBrowserCompatItemReceiver) {
                                setheader.AudioAttributesCompatParcelizer(((setExtraMultilineHeightEnabled.MediaBrowserCompatItemReceiver) setextramultilineheightenabled).read());
                            } else {
                                if (!(setextramultilineheightenabled instanceof setExtraMultilineHeightEnabled.AudioAttributesImplApi26Parcelizer)) {
                                    throw new RenewEligibleCreator();
                                }
                                setExtraMultilineHeightEnabled.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = (setExtraMultilineHeightEnabled.AudioAttributesImplApi26Parcelizer) setextramultilineheightenabled;
                                setheader.RemoteActionCompatParcelizer((State[]) audioAttributesImplApi26Parcelizer.write().toArray(new State[0]), audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer());
                            }
                        }
                        setheader.RemoteActionCompatParcelizer().IconCompatParcelizer(setExpandedTitleTextAppearance.IconCompatParcelizer.INSTANCE);
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
            return setHeader.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setExpandedTitleMarginStart> setupdatedstatusRatingCompat = setHeader.this.RemoteActionCompatParcelizer().RatingCompat();
                final setHeader setheader = setHeader.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusRatingCompat.write(new getValidationToken() { // from class: o.setHeader.AudioAttributesImplBaseParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((setExpandedTitleMarginStart) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(setExpandedTitleMarginStart setexpandedtitlemarginstart) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) setexpandedtitlemarginstart.read(), (Object) TestIndex.ALL_INDIA_ID)) {
                            return getShowPopup.INSTANCE;
                        }
                        MaterialButtonToggleGroup materialButtonToggleGroup = setheader.write().MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialButtonToggleGroup, "");
                        bytesRead.AudioAttributesImplApi21Parcelizer(materialButtonToggleGroup);
                        setheader.write().MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer.setText(setexpandedtitlemarginstart.RemoteActionCompatParcelizer());
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
            return setHeader.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaDescriptionCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setExpandedTitleMarginStart> setupdatedstatusAudioAttributesImplApi26Parcelizer = setHeader.this.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer();
                final setHeader setheader = setHeader.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.setHeader.MediaDescriptionCompat.1
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((setExpandedTitleMarginStart) obj2);
                    }

                    private Object IconCompatParcelizer(setExpandedTitleMarginStart setexpandedtitlemarginstart) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) setexpandedtitlemarginstart.read(), (Object) TestIndex.ALL_INDIA_ID)) {
                            setheader.write().MediaBrowserCompatItemReceiver.read.setSelected(true);
                            setheader.write().MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer.setSelected(false);
                            setheader.write().MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer.setIconTint(getDefaultViewModelCreationExtras.IconCompatParcelizer(setheader.requireContext(), R.color.pure_white));
                        } else {
                            setheader.write().MediaBrowserCompatItemReceiver.read.setSelected(false);
                            setheader.write().MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer.setSelected(true);
                            MaterialButton materialButton = setheader.write().MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer;
                            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
                            Context context = setheader.write().IconCompatParcelizer().getContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
                            materialButton.setIconTint(ColorStateList.valueOf(shouldEscapeCharacter.Companion.read(context, R.attr.colorSurfaceVariant14, new TypedValue(), true)));
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
            return setHeader.this.new MediaDescriptionCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaDescriptionCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setLineSpacingMultiplier> setupdatedstatusMediaBrowserCompatSearchResultReceiver = setHeader.this.RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver();
                final setHeader setheader = setHeader.this;
                this.write = 1;
                if (setupdatedstatusMediaBrowserCompatSearchResultReceiver.write(new getValidationToken() { // from class: o.setHeader.MediaBrowserCompatSearchResultReceiver.3
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((setLineSpacingMultiplier) obj2);
                    }

                    private Object IconCompatParcelizer(setLineSpacingMultiplier setlinespacingmultiplier) {
                        if (setlinespacingmultiplier.getIconCompatParcelizer() > 0) {
                            setheader.RemoteActionCompatParcelizer(setlinespacingmultiplier);
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
            return setHeader.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Pair<List<uncaughtException>, List<uncaughtException>>> setupdatedstatusIconCompatParcelizer = setHeader.this.RemoteActionCompatParcelizer().IconCompatParcelizer();
                final setHeader setheader = setHeader.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.setHeader.RatingCompat.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((Pair) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(Pair<? extends List<uncaughtException>, ? extends List<uncaughtException>> pair) {
                        TextView textView = setheader.write().MediaDescriptionCompat;
                        if (pair.write().isEmpty() && pair.IconCompatParcelizer().isEmpty()) {
                            toMagicModuleMetaRepoModel.write(textView);
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
                        } else {
                            toMagicModuleMetaRepoModel.write(textView);
                            bytesRead.AudioAttributesImplApi21Parcelizer(textView);
                        }
                        AppMeasurementSdkEventInterceptor appMeasurementSdkEventInterceptor = setheader.read;
                        if (appMeasurementSdkEventInterceptor == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            appMeasurementSdkEventInterceptor = null;
                        }
                        appMeasurementSdkEventInterceptor.read(pair.write(), pair.IconCompatParcelizer());
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
            return setHeader.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<RankPairModel>> setupdatedstatusMediaBrowserCompatItemReceiver = setHeader.this.RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver();
                final setHeader setheader = setHeader.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.setHeader.MediaMetadataCompat.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((List) obj2);
                    }

                    private Object read(List<RankPairModel> list) {
                        if (!list.isEmpty()) {
                            CardView cardView = setheader.write().onCommand.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(cardView);
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
            return setHeader.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setExpandedTitleMarginBottom> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = setHeader.this.RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
                final setHeader setheader = setHeader.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.setHeader.AudioAttributesCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((setExpandedTitleMarginBottom) obj2);
                    }

                    private Object IconCompatParcelizer(setExpandedTitleMarginBottom setexpandedtitlemarginbottom) {
                        setHeader setheader2 = setheader;
                        if (setexpandedtitlemarginbottom.getWrite() == null) {
                            MaterialCardView materialCardView = setheader2.write().onAddQueueItem.AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(materialCardView);
                        } else {
                            Integer write = setexpandedtitlemarginbottom.getWrite();
                            if (write == null || write.intValue() != 0) {
                                setheader2.RemoteActionCompatParcelizer(setexpandedtitlemarginbottom);
                            } else {
                                setheader2.MediaMetadataCompat();
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
            return setHeader.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setExpandedTitleMargin> setupdatedstatus = setHeader.this.RemoteActionCompatParcelizer().read();
                final setHeader setheader = setHeader.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.setHeader.MediaBrowserCompatItemReceiver.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((setExpandedTitleMargin) obj2);
                    }

                    private Object read(setExpandedTitleMargin setexpandedtitlemargin) {
                        if (setexpandedtitlemargin.getRead() > 0 || setexpandedtitlemargin.getIconCompatParcelizer() > 0 || setexpandedtitlemargin.getWrite() > 0) {
                            setheader.AudioAttributesCompatParcelizer(setexpandedtitlemargin);
                        } else {
                            CardView cardViewIconCompatParcelizer = setheader.write().handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardViewIconCompatParcelizer, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(cardViewIconCompatParcelizer);
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
            return setHeader.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(boolean z) {
        if (!z) {
            ComposeView composeView = write().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(composeView, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(composeView);
            write().read.RemoteActionCompatParcelizer();
            return;
        }
        hasGetter viewLifecycleOwner = getViewLifecycleOwner();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewLifecycleOwner, "");
        C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(viewLifecycleOwner), null, null, new onCustomAction(null), 3);
    }

    static final class onCustomAction extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(300L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            setHeader setheader = setHeader.this;
            setheader.AudioAttributesCompatParcelizer(setheader.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer().IconCompatParcelizer());
            return getShowPopup.INSTANCE;
        }

        onCustomAction(SampleVideos<? super onCustomAction> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setHeader.this.new onCustomAction(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCustomAction) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(final LoyaltyPointsBuilder loyaltyPointsBuilder) {
        if (loyaltyPointsBuilder.getAudioAttributesCompatParcelizer()) {
            ComposeView composeView = write().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(composeView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(composeView);
            write().read.setContent(multiplyFft.IconCompatParcelizer(1298983533, true, new MagicModuleSubmissionRequestBody() { // from class: o.setImageUri
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setHeader.write(loyaltyPointsBuilder, this, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }));
            return;
        }
        ComposeView composeView2 = write().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(composeView2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(composeView2);
        write().read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCommand(setHeader setheader) {
        setheader.RemoteActionCompatParcelizer().IconCompatParcelizer(setExpandedTitleTextAppearance.RemoteActionCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem() {
        createBundleFromClientSettings.Companion companion = createBundleFromClientSettings.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(createBundleFromClientSettings.Companion.read(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(final setLineSpacingAdd setlinespacingadd) {
        ConstraintLayout constraintLayout = write().MediaBrowserCompatItemReceiver.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout);
        if (setlinespacingadd.getAudioAttributesImplApi26Parcelizer()) {
            onCommand();
        } else {
            MediaBrowserCompatItemReceiver();
        }
        if (!setlinespacingadd.getRead() && setlinespacingadd.getIconCompatParcelizer()) {
            CardView cardView = write().MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(cardView);
        } else {
            CardView cardView2 = write().MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView2, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(cardView2);
        }
        if (setlinespacingadd.getRead() || !setlinespacingadd.getRemoteActionCompatParcelizer()) {
            TextView textView = write().MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        }
        String strRemoteActionCompatParcelizer = loadBitmap.RemoteActionCompatParcelizer(setlinespacingadd.getAudioAttributesImplApi21Parcelizer(), "dd MMM yyyy");
        if (setlinespacingadd.getRead()) {
            write().MediaBrowserCompatItemReceiver.RatingCompat.setText(getString(R.string.f_test_discarded_on, strRemoteActionCompatParcelizer));
        } else {
            write().MediaBrowserCompatItemReceiver.RatingCompat.setText(getString(R.string.f_test_taken_on, strRemoteActionCompatParcelizer));
        }
        int audioAttributesCompatParcelizer = setlinespacingadd.getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer == -2) {
            TextView textView2 = write().MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
            write().MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer.setText(getString(R.string.text_rank_list_unavailable));
            TextView textView3 = write().MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView3);
        } else if (audioAttributesCompatParcelizer == -1) {
            write().MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer.setText(getString(R.string.f_test_score_result_on_date, loadBitmap.RemoteActionCompatParcelizer(setlinespacingadd.getMediaBrowserCompatCustomActionResultReceiver(), "dd MMM")));
            TextView textView4 = write().MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView4);
        } else {
            TextView textView5 = write().MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView5);
            TextView textView6 = write().MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer;
            int audioAttributesCompatParcelizer2 = setlinespacingadd.getAudioAttributesCompatParcelizer();
            String strRemoteActionCompatParcelizer2 = CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(setlinespacingadd.getAudioAttributesCompatParcelizer());
            StringBuilder sb = new StringBuilder();
            sb.append(audioAttributesCompatParcelizer2);
            sb.append(strRemoteActionCompatParcelizer2);
            textView6.setText(sb.toString());
            if (setlinespacingadd.getAudioAttributesCompatParcelizer() <= setlinespacingadd.getWrite()) {
                write().MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer.setText(getString(R.string.f_test_rank_out_of, Integer.valueOf(setlinespacingadd.getWrite())));
                TextView textView7 = write().MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView7, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(textView7);
            } else {
                TextView textView8 = write().MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView8, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView8);
            }
        }
        write().MediaMetadataCompat.setText(setlinespacingadd.getAudioAttributesImplBaseParcelizer());
        write().MediaBrowserCompatItemReceiver.MediaMetadataCompat.setOnClickListener(new View.OnClickListener() { // from class: o.setLiftOnScroll
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setHeader.RemoteActionCompatParcelizer(setlinespacingadd, this, setlinespacingadd);
            }
        });
        write().MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setLiftOnScrollTargetView
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setHeader.write(this.read, setlinespacingadd, setlinespacingadd);
            }
        });
        write().write.setOnClickListener(new View.OnClickListener() { // from class: o.setLiftableOverrideEnabled
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setHeader.read(this.AudioAttributesCompatParcelizer, setlinespacingadd);
            }
        });
        if (setlinespacingadd.getRemoteActionCompatParcelizer()) {
            if (setlinespacingadd.getMediaMetadataCompat()) {
                write().MediaBrowserCompatItemReceiver.read.setSelected(setlinespacingadd.getMediaDescriptionCompat());
            } else {
                MaterialButtonToggleGroup materialButtonToggleGroup = write().MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialButtonToggleGroup, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(materialButtonToggleGroup);
            }
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return;
        }
        if (setlinespacingadd.getMediaMetadataCompat()) {
            read();
        } else {
            MaterialButtonToggleGroup materialButtonToggleGroup2 = write().MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialButtonToggleGroup2, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(materialButtonToggleGroup2);
        }
        handleMediaPlayPauseIfPendingOnHandler();
        write().MediaBrowserCompatItemReceiver.MediaBrowserCompatSearchResultReceiver.setText(getString(R.string.f_test_score_result_on_date, loadBitmap.RemoteActionCompatParcelizer(setlinespacingadd.getMediaBrowserCompatCustomActionResultReceiver(), "dd MMM yyyy")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(setLineSpacingAdd setlinespacingadd, setHeader setheader, setLineSpacingAdd setlinespacingadd2) {
        if (setlinespacingadd.getRemoteActionCompatParcelizer()) {
            if (!setlinespacingadd.getAudioAttributesImplApi26Parcelizer()) {
                setheader.RemoteActionCompatParcelizer().IconCompatParcelizer(new setExpandedTitleTextAppearance.read());
                setheader.AudioAttributesCompatParcelizer(setlinespacingadd.getMediaBrowserCompatItemReceiver(), 0);
                return;
            } else {
                setheader.RemoteActionCompatParcelizer().IconCompatParcelizer(setExpandedTitleTextAppearance.MediaBrowserCompatSearchResultReceiver.INSTANCE);
                return;
            }
        }
        setheader.AudioAttributesCompatParcelizer(setlinespacingadd2.getMediaBrowserCompatCustomActionResultReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(setHeader setheader, setLineSpacingAdd setlinespacingadd, setLineSpacingAdd setlinespacingadd2) {
        setheader.RemoteActionCompatParcelizer().IconCompatParcelizer(new setExpandedTitleTextAppearance.MediaBrowserCompatCustomActionResultReceiver(setlinespacingadd.getIconCompatParcelizer(), setlinespacingadd.getMediaDescriptionCompat(), setlinespacingadd2.getMediaBrowserCompatMediaItem()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(setHeader setheader, setLineSpacingAdd setlinespacingadd) {
        FrameLayout frameLayout = setheader.write().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(frameLayout);
        Button button = setheader.write().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(button);
        setheader.write(setlinespacingadd.getMediaBrowserCompatItemReceiver());
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        write().MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer.setText(getString(i, write().MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer.getText()));
        TextView textView = write().MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView);
    }

    private void write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (!getTrackName.write(requireContext())) {
            setHeader setheader = this;
            String string = getString(R.string.app_error_no_internet);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setheader, string, 0);
            return;
        }
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        dispatchTouchEvent.IconCompatParcelizer(contextRequireContext, str, "test", new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), 112);
    }

    public static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends HlsPlaylist<String> {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.HlsPlaylist
        public void IconCompatParcelizer(String str) {
            maybeGetTypeVariable activity = setHeader.this.getActivity();
            if (activity == null || !activity.isFinishing()) {
                if (str != null) {
                    setHeader.this.RemoteActionCompatParcelizer(str);
                } else {
                    setHeader setheader = setHeader.this;
                    setHeader setheader2 = setheader;
                    String string = setheader.getString(R.string.err_share_link_creation_failed);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setheader2, string, 0);
                }
                FrameLayout frameLayout = setHeader.this.write().AudioAttributesImplApi21Parcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(frameLayout);
                Button button = setHeader.this.write().write;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(button);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        scheduleUpdate.write(contextRequireContext, "test", str);
    }

    private final void read() {
        MaterialButtonToggleGroup materialButtonToggleGroup = write().MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialButtonToggleGroup, "");
        Iterator<View> itWrite = getSerializerForJavaNioFilePath.read(materialButtonToggleGroup).write();
        while (itWrite.hasNext()) {
            View next = itWrite.next();
            next.setEnabled(false);
            next.setAlpha(0.9f);
        }
        write().MediaBrowserCompatItemReceiver.read.setSelected(true);
        write().MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver.setAlpha(0.9f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(long j) {
        setHeader setheader = this;
        String string = getString(R.string.toast_rank_list_review_available_on, loadBitmap.RemoteActionCompatParcelizer(j, "dd MMM"));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setheader, string, 0);
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        createSingleVariantMultivariantPlaylist createsinglevariantmultivariantplaylist = write().MediaBrowserCompatItemReceiver;
        TextView textView = createsinglevariantmultivariantplaylist.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        createsinglevariantmultivariantplaylist.write.setAlpha(0.3f);
        TextView textView2 = createsinglevariantmultivariantplaylist.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
        TextView textView3 = createsinglevariantmultivariantplaylist.MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView3);
        createsinglevariantmultivariantplaylist.MediaMetadataCompat.setAlpha(0.5f);
        TextView textView4 = createsinglevariantmultivariantplaylist.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView4);
    }

    private final void onCommand() {
        write().MediaBrowserCompatItemReceiver.MediaMetadataCompat.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, _isNaN.getDrawable(requireContext(), R.drawable.ic_lock2_small_white), (Drawable) null);
    }

    private final void MediaBrowserCompatItemReceiver() {
        write().MediaBrowserCompatItemReceiver.MediaMetadataCompat.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        createSingleVariantMultivariantPlaylist createsinglevariantmultivariantplaylist = write().MediaBrowserCompatItemReceiver;
        createsinglevariantmultivariantplaylist.write.setAlpha(1.0f);
        TextView textView = createsinglevariantmultivariantplaylist.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        TextView textView2 = createsinglevariantmultivariantplaylist.MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView2);
        TextView textView3 = createsinglevariantmultivariantplaylist.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView3);
        createsinglevariantmultivariantplaylist.MediaMetadataCompat.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatSearchResultReceiver() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.text_pro_placeholder_dialog_msg, "test");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.view_plans);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.go_back);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, string, string2, string3, 0, null, false, false, null, 497);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.setLiftOnScrollTargetViewId
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setHeader.handleMediaPlayPauseIfPendingOnHandler(this.RemoteActionCompatParcelizer);
            }
        }, null, 4);
        RemoteActionCompatParcelizer().IconCompatParcelizer(setExpandedTitleTextAppearance.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler(setHeader setheader) {
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        Context contextRequireContext = setheader.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String lowerCase = "PRO_TEST_ACCESSED".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        setheader.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext, "Pro Subscription Dialog", lowerCase));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaDescriptionCompat() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.text_predicted_rank);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.text_predicted_rank_info);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.got_it_cap_g);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, string2, string3, null, 0, null, true, false, null, 440).show(getChildFragmentManager(), "");
        RemoteActionCompatParcelizer().IconCompatParcelizer(setExpandedTitleTextAppearance.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomAction() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.text_predicted_rank);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.state_predicted_rank_info);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.got_it_cap_g);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, string2, string3, null, 0, null, true, false, null, 440).show(getChildFragmentManager(), "");
        RemoteActionCompatParcelizer().IconCompatParcelizer(setExpandedTitleTextAppearance.IconCompatParcelizer.INSTANCE);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        Toolbar toolbar = write().MediaBrowserCompatMediaItem;
        toolbar.setNavigationIcon(_isNaN.getDrawable(requireContext(), R.drawable.ic_arrow_back));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.WalletObjects
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setHeader.onCustomAction(this.write);
            }
        });
        write().IconCompatParcelizer.setStateChangeListener(new MediaBrowserCompatMediaItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCustomAction(setHeader setheader) {
        setheader.requireActivity().onBackPressed();
    }

    public static final class MediaBrowserCompatMediaItem implements CustomAppBarLayout.read {
        MediaBrowserCompatMediaItem() {
        }

        @Override // com.marrow.ui.views.CustomAppBarLayout.read
        public final void IconCompatParcelizer(int i) {
            Window window;
            Window window2;
            if (i == 2) {
                maybeGetTypeVariable activity = setHeader.this.getActivity();
                if (activity == null || (window2 = activity.getWindow()) == null) {
                    return;
                }
                shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
                Context contextRequireContext = setHeader.this.requireContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                window2.setStatusBarColor(shouldEscapeCharacter.Companion.read(contextRequireContext, R.attr.colorSurfaceVariant5, new TypedValue(), true));
                return;
            }
            maybeGetTypeVariable activity2 = setHeader.this.getActivity();
            if (activity2 == null || (window = activity2.getWindow()) == null) {
                return;
            }
            shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
            Context contextRequireContext2 = setHeader.this.requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            window.setStatusBarColor(shouldEscapeCharacter.Companion.read(contextRequireContext2, R.attr.colorSurfaceVariant14, new TypedValue(), true));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int reqCode, int resultCode, Intent data) {
        String stringExtra;
        super.onActivityResult(reqCode, resultCode, data);
        if (data == null || reqCode != 100 || (stringExtra = data.getStringExtra("_id")) == null) {
            return;
        }
        RemoteActionCompatParcelizer().IconCompatParcelizer(new setExpandedTitleTextAppearance.AudioAttributesImplBaseParcelizer(stringExtra));
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setHeader$read;", "", "<init>", "()V", "Lo/setExpandedTitleTypeface;", "p0", "Lo/setHeader;", "AudioAttributesCompatParcelizer", "(Lo/setExpandedTitleTypeface;)Lo/setHeader;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        @getMagicModuleMeta
        public static setHeader AudioAttributesCompatParcelizer(setExpandedTitleTypeface p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            setHeader setheader = new setHeader();
            setheader.setArguments(p0.RemoteActionCompatParcelizer());
            return setheader;
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(setLineSpacingMultiplier setlinespacingmultiplier) {
        copyStreams copystreams = write().RemoteActionCompatParcelizer;
        MaterialCardView materialCardView = copystreams.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(materialCardView);
        copystreams.MediaBrowserCompatCustomActionResultReceiver.setText(loadBitmap.write(setlinespacingmultiplier.getIconCompatParcelizer()));
        if (setlinespacingmultiplier.getAudioAttributesCompatParcelizer() > 0 && setlinespacingmultiplier.getRemoteActionCompatParcelizer() > 0) {
            View view = copystreams.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(view);
        }
        if (setlinespacingmultiplier.getAudioAttributesCompatParcelizer() > 0 || setlinespacingmultiplier.getRemoteActionCompatParcelizer() > 0) {
            View view2 = copystreams.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(view2);
        }
        if (setlinespacingmultiplier.getAudioAttributesCompatParcelizer() > 0) {
            LinearLayout linearLayout = copystreams.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
            copystreams.IconCompatParcelizer.setText(loadBitmap.write(((long) setlinespacingmultiplier.getAudioAttributesCompatParcelizer()) * 1000));
        }
        if (setlinespacingmultiplier.getRemoteActionCompatParcelizer() > 0) {
            LinearLayout linearLayout2 = copystreams.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout2);
            copystreams.RemoteActionCompatParcelizer.setText(loadBitmap.write(((long) setlinespacingmultiplier.getRemoteActionCompatParcelizer()) * 1000));
        }
        if (setlinespacingmultiplier.getRead() > 0) {
            MaterialCardView materialCardView2 = copystreams.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(materialCardView2);
            copystreams.read.setText(getString(R.string.f_test_analytics_average_time, loadBitmap.write(((long) setlinespacingmultiplier.getRead()) * 1000)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(setExpandedTitleMarginBottom setexpandedtitlemarginbottom) {
        HlsMediaPlaylistPlaylistType hlsMediaPlaylistPlaylistType = write().onAddQueueItem;
        MaterialCardView materialCardView = hlsMediaPlaylistPlaylistType.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(materialCardView);
        TextView textView = hlsMediaPlaylistPlaylistType.IconCompatParcelizer;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "%s %d", Arrays.copyOf(new Object[]{setexpandedtitlemarginbottom.getRead() ? "+" : "", Integer.valueOf(setexpandedtitlemarginbottom.getAudioAttributesCompatParcelizer())}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        textView.setText(str);
        if (setexpandedtitlemarginbottom.getRead()) {
            RelativeLayout relativeLayout = hlsMediaPlaylistPlaylistType.AudioAttributesImplBaseParcelizer;
            Context context = hlsMediaPlaylistPlaylistType.AudioAttributesImplBaseParcelizer.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            relativeLayout.setBackgroundTintList(CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(context, R.attr.colorSurfaceVariant15));
            hlsMediaPlaylistPlaylistType.write.setImageDrawable(_isNaN.getDrawable(hlsMediaPlaylistPlaylistType.write.getContext(), R.drawable.ic_guess_correct_bulb));
            ImageView imageView = hlsMediaPlaylistPlaylistType.write;
            Context context2 = hlsMediaPlaylistPlaylistType.write.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
            imageView.setImageTintList(CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(context2, R.attr.onSurfaceGreen3));
            hlsMediaPlaylistPlaylistType.read.setText(getString(R.string.title_guess_correct));
            hlsMediaPlaylistPlaylistType.read.setTextSize(2, 21.0f);
        } else if (setexpandedtitlemarginbottom.getIconCompatParcelizer()) {
            RelativeLayout relativeLayout2 = hlsMediaPlaylistPlaylistType.AudioAttributesImplBaseParcelizer;
            Context context3 = hlsMediaPlaylistPlaylistType.AudioAttributesImplBaseParcelizer.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context3, "");
            relativeLayout2.setBackgroundTintList(CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(context3, R.attr.colorSurfaceVariant16));
            hlsMediaPlaylistPlaylistType.write.setImageDrawable(_isNaN.getDrawable(hlsMediaPlaylistPlaylistType.write.getContext(), R.drawable.ic_guess_correct_bulb));
            ImageView imageView2 = hlsMediaPlaylistPlaylistType.write;
            Context context4 = hlsMediaPlaylistPlaylistType.write.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context4, "");
            imageView2.setImageTintList(CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(context4, R.attr.onSurfaceBlue));
            hlsMediaPlaylistPlaylistType.read.setText(getString(R.string.title_guess_neutral));
            hlsMediaPlaylistPlaylistType.read.setTextSize(2, 18.0f);
        } else {
            RelativeLayout relativeLayout3 = hlsMediaPlaylistPlaylistType.AudioAttributesImplBaseParcelizer;
            Context context5 = hlsMediaPlaylistPlaylistType.AudioAttributesImplBaseParcelizer.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context5, "");
            relativeLayout3.setBackgroundTintList(CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(context5, R.attr.colorSurfaceVariant17));
            hlsMediaPlaylistPlaylistType.write.setImageDrawable(_isNaN.getDrawable(hlsMediaPlaylistPlaylistType.write.getContext(), R.drawable.ic_wrong_bulb));
            ImageView imageView3 = hlsMediaPlaylistPlaylistType.write;
            Context context6 = hlsMediaPlaylistPlaylistType.write.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context6, "");
            imageView3.setImageTintList(CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(context6, R.attr.onSurfaceRed));
            hlsMediaPlaylistPlaylistType.read.setText(getString(R.string.title_guess_wrong));
            hlsMediaPlaylistPlaylistType.read.setTextSize(2, 18.0f);
        }
        TextView textView2 = hlsMediaPlaylistPlaylistType.RemoteActionCompatParcelizer;
        String string = getString(R.string.text_guess_description, setexpandedtitlemarginbottom.getWrite(), Integer.valueOf(setexpandedtitlemarginbottom.getRemoteActionCompatParcelizer()), Integer.valueOf(setexpandedtitlemarginbottom.getAudioAttributesCompatParcelizer()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        textView2.setText(RemoteActionCompatParcelizer(string, String.valueOf(setexpandedtitlemarginbottom.getWrite()), String.valueOf(setexpandedtitlemarginbottom.getRemoteActionCompatParcelizer()), String.valueOf(setexpandedtitlemarginbottom.getAudioAttributesCompatParcelizer())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaMetadataCompat() {
        HlsMediaPlaylistPlaylistType hlsMediaPlaylistPlaylistType = write().onAddQueueItem;
        MaterialCardView materialCardView = hlsMediaPlaylistPlaylistType.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(materialCardView);
        RelativeLayout relativeLayout = hlsMediaPlaylistPlaylistType.AudioAttributesImplBaseParcelizer;
        Context context = hlsMediaPlaylistPlaylistType.AudioAttributesImplBaseParcelizer.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        relativeLayout.setBackgroundTintList(CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(context, R.attr.colorSurfaceVariant3));
        hlsMediaPlaylistPlaylistType.write.setImageDrawable(_isNaN.getDrawable(hlsMediaPlaylistPlaylistType.write.getContext(), R.drawable.ic_no_guess_bulb));
        ImageView imageView = hlsMediaPlaylistPlaylistType.write;
        Context context2 = hlsMediaPlaylistPlaylistType.write.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
        imageView.setImageTintList(CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(context2, R.attr.onBackgroundSurface4));
        hlsMediaPlaylistPlaylistType.read.setTextSize(2, 18.0f);
        hlsMediaPlaylistPlaylistType.read.setText(getString(R.string.title_no_guess));
        hlsMediaPlaylistPlaylistType.RemoteActionCompatParcelizer.setText(getString(R.string.text_no_guess_description));
    }

    private final SpannableString RemoteActionCompatParcelizer(String str, String str2, String str3, String str4) {
        int iRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(write().onAddQueueItem.RemoteActionCompatParcelizer, R.attr.onBackgroundSurface1);
        String str5 = str;
        SpannableString spannableString = new SpannableString(str5);
        int i = TestGroupLSModel.read((CharSequence) str5, str2, 0, false, 6);
        int length = str2.length() + i;
        int i2 = TestGroupLSModel.read((CharSequence) str5, str3, length + 1, false, 4);
        int length2 = str3.length() + i2;
        int i3 = TestGroupLSModel.read((CharSequence) str5, str4, length2 + 1, false, 4);
        int length3 = str4.length() + i3;
        spannableString.setSpan(new StyleSpan(1), i, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(iRemoteActionCompatParcelizer), i, length, 33);
        spannableString.setSpan(new StyleSpan(1), i2, length2, 33);
        spannableString.setSpan(new ForegroundColorSpan(iRemoteActionCompatParcelizer), i2, length2, 33);
        spannableString.setSpan(new StyleSpan(1), i3, length3, 33);
        spannableString.setSpan(new ForegroundColorSpan(iRemoteActionCompatParcelizer), i3, length3, 33);
        return spannableString;
    }

    public final void RemoteActionCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        setForceApplySystemWindowInsetTop.Companion companion = setForceApplySystemWindowInsetTop.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(setForceApplySystemWindowInsetTop.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new setStaticLayoutBuilderConfigurer(str, true, false, false, null, str2, null, 92, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(setExpandedTitleMargin setexpandedtitlemargin) {
        String string;
        if (setexpandedtitlemargin.getMediaDescriptionCompat()) {
            string = getString(R.string.f_test_analytics_changed_answer_desc_all, Integer.valueOf(setexpandedtitlemargin.getRead()), Integer.valueOf(setexpandedtitlemargin.getIconCompatParcelizer()), Integer.valueOf(setexpandedtitlemargin.getAudioAttributesCompatParcelizer()));
            toMagicModuleMetaRepoModel.write((Object) string);
        } else if (setexpandedtitlemargin.getMediaBrowserCompatCustomActionResultReceiver()) {
            string = getString(R.string.f_test_analytics_changed_answer_desc_correct_wrong_alone, Integer.valueOf(setexpandedtitlemargin.getRead()), Integer.valueOf(setexpandedtitlemargin.getIconCompatParcelizer()));
            toMagicModuleMetaRepoModel.write((Object) string);
        } else if (setexpandedtitlemargin.getAudioAttributesImplApi21Parcelizer()) {
            string = getString(R.string.f_test_analytics_changed_answer_desc_correct_skipped_alone, Integer.valueOf(setexpandedtitlemargin.getRead()), Integer.valueOf(setexpandedtitlemargin.getAudioAttributesCompatParcelizer()));
            toMagicModuleMetaRepoModel.write((Object) string);
        } else if (setexpandedtitlemargin.getAudioAttributesImplApi26Parcelizer()) {
            string = getString(R.string.f_test_analytics_changed_answer_desc_wrong_skipped_alone, Integer.valueOf(setexpandedtitlemargin.getIconCompatParcelizer()), Integer.valueOf(setexpandedtitlemargin.getAudioAttributesCompatParcelizer()));
            toMagicModuleMetaRepoModel.write((Object) string);
        } else if (setexpandedtitlemargin.getRemoteActionCompatParcelizer()) {
            string = getString(R.string.f_test_analytics_changed_answer_desc_correct_alone, Integer.valueOf(setexpandedtitlemargin.getRead()));
            toMagicModuleMetaRepoModel.write((Object) string);
        } else if (setexpandedtitlemargin.getMediaBrowserCompatItemReceiver()) {
            string = getString(R.string.f_test_analytics_changed_answer_desc_wrong_alone, Integer.valueOf(setexpandedtitlemargin.getIconCompatParcelizer()));
            toMagicModuleMetaRepoModel.write((Object) string);
        } else {
            string = getString(R.string.f_test_analytics_changed_answer_desc_skipped_alone, Integer.valueOf(setexpandedtitlemargin.getAudioAttributesCompatParcelizer()));
            toMagicModuleMetaRepoModel.write((Object) string);
        }
        String string2 = getString(R.string.f_test_analytics_changed_answer_title, Integer.valueOf(setexpandedtitlemargin.getWrite()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        AudioAttributesCompatParcelizer(string2, String.valueOf(setexpandedtitlemargin.getWrite()));
        write().handleMediaPlayPauseIfPendingOnHandler.write.setText(string);
        CardView cardViewIconCompatParcelizer = write().handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardViewIconCompatParcelizer, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(cardViewIconCompatParcelizer);
    }

    private final void AudioAttributesCompatParcelizer(String str, String str2) {
        int iRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(write().handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer, R.attr.colorOnBackground);
        String str3 = str;
        SpannableString spannableString = new SpannableString(str3);
        int i = TestGroupLSModel.read((CharSequence) str3, str2, 0, false, 6);
        int length = str2.length() + i;
        spannableString.setSpan(1, i, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(iRemoteActionCompatParcelizer), i, length, 33);
        write().handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(LoyaltyPointsBuilder loyaltyPointsBuilder, final setHeader setheader, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1298983533, i, -1, "com.marrow2.ui.test.score.TestScoreFragment.renderGtAnalyticsCard.<anonymous> (TestScoreFragment.kt:392)");
            }
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(16.0f);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(setheader);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.WalletObjectsConstantsState
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setHeader.onCommand(this.write);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            getHexFontColor.write(null, loyaltyPointsBuilder, fIconCompatParcelizer, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 1);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }
}
