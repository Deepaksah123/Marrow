package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import com.marrow.ui.activities.learn.video.overlay.VideoTimelineItem;
import com.marrow.ui.activities.learn.video.overlay.timelines.VideoTimelineSideSheetViewModel;
import com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel;
import com.marrow.ui.views.CustomTextView;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.getRoot;
import kotlin.maybeUpdateIsInCaptionService;
import kotlin.setFontFamily;
import kotlin.setTokenBinding;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J!\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u001b\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\"H\u0002¢\u0006\u0004\b!\u0010#J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\u0003R\u0018\u0010\b\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010)\u001a\u00020(8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010+R\u001b\u00100\u001a\u00020,8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b.\u0010/R\u0016\u0010!\u001a\u0002018\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\b\u00102R\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u0006*\u00020404038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u00105"}, d2 = {"Lo/parseVttCueBox;", "Lo/argCount;", "<init>", "()V", "Lo/TtmlRenderUtil;", "MediaBrowserCompatItemReceiver", "()Lo/TtmlRenderUtil;", "", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "", "getTheme", "()I", "Landroid/os/Bundle;", "p0", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "(Landroid/os/Bundle;)Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "read", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesImplBaseParcelizer", "", "(Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;", "(Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;)V", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onDestroyView", "Lo/HlsMediaPeriod1;", "write", "Lo/HlsMediaPeriod1;", "()Lo/HlsMediaPeriod1;", "Lcom/marrow/ui/activities/learn/video/overlay/timelines/VideoTimelineSideSheetViewModel;", "Lo/RenewEligible;", "AudioAttributesImplApi21Parcelizer", "()Lcom/marrow/ui/activities/learn/video/overlay/timelines/VideoTimelineSideSheetViewModel;", "IconCompatParcelizer", "Lo/applyStyleRecord;", "Lo/applyStyleRecord;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class parseVttCueBox extends setFontColor {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private applyStyleRecord RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private HlsMediaPeriod1 AudioAttributesCompatParcelizer;

    @Override // kotlin.argCount
    public final int getTheme() {
        return R.style.AppThemeV2_Dark_Dialog;
    }

    public parseVttCueBox() {
        parseVttCueBox parsevttcuebox = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass3(new AnonymousClass5(parsevttcuebox)));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(VideoTimelineSideSheetViewModel.class), new AnonymousClass2(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass1(parsevttcuebox, renewEligibleWrite));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.Mp4WebvttSubtitle
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                parseVttCueBox.RemoteActionCompatParcelizer(this.write, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.read = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HlsMediaPeriod1 write() {
        HlsMediaPeriod1 hlsMediaPeriod1 = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(hlsMediaPeriod1);
        return hlsMediaPeriod1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoTimelineSideSheetViewModel AudioAttributesImplApi21Parcelizer() {
        return (VideoTimelineSideSheetViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private final TtmlRenderUtil MediaBrowserCompatItemReceiver() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof TtmlRenderUtil) {
            return (TtmlRenderUtil) parentFragment;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer() {
        TtmlRenderUtil ttmlRenderUtilMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (ttmlRenderUtilMediaBrowserCompatItemReceiver != null) {
            ttmlRenderUtilMediaBrowserCompatItemReceiver.write();
        } else {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(parseVttCueBox parsevttcuebox, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == -1) {
            parsevttcuebox.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(getRoot.read.INSTANCE);
            parsevttcuebox.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        withAlwaysAsId.read(this, "refetch_active_recall_qbank_from_video", _getIndexResolver.AudioAttributesCompatParcelizer());
    }

    @Override // kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        Context contextRequireContext;
        Dialog dialog = getDialog();
        if (dialog == null || (contextRequireContext = dialog.getContext()) == null) {
            contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        }
        readMoviChunks readmovichunks = new readMoviChunks(contextRequireContext, getTheme());
        readmovichunks.setCanceledOnTouchOutside(true);
        return readmovichunks;
    }

    @Override // kotlin.setFontColor, kotlin.argCount, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle p0) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(layoutInflaterOnGetLayoutInflater, "");
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(new initializeViewTreeOwners(requireContext(), R.style.AppThemeV2_Dark_Dialog));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(layoutInflaterCloneInContext, "");
        return layoutInflaterCloneInContext;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer = HlsMediaPeriod1.RemoteActionCompatParcelizer(p0, p1);
        NestedScrollView nestedScrollViewIconCompatParcelizer = write().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nestedScrollViewIconCompatParcelizer, "");
        return nestedScrollViewIconCompatParcelizer;
    }

    private final void read() {
        write().write.write.setOnClickListener(new View.OnClickListener() { // from class: o.Tx3gSubtitle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                parseVttCueBox.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(parseVttCueBox parsevttcuebox) {
        parsevttcuebox.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(getRoot.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: renamed from: o.parseVttCueBox$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesImplBaseParcelizer();
        RemoteActionCompatParcelizer();
        read();
    }

    /* JADX INFO: renamed from: o.parseVttCueBox$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$read.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$read = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.parseVttCueBox$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        write().write.read.setText(getString(R.string.title_video_timelines));
        RecyclerView recyclerView = write().IconCompatParcelizer;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.RemoteActionCompatParcelizer = new applyStyleRecord(requireArguments().getBoolean("are_video_bookmarks_enabled"), requireArguments().getBoolean("is_concise_mode_enabled"), new getAnswerMap() { // from class: o.attachFontFamily
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return parseVttCueBox.read(this.write, (VideoTimelineItem) obj);
            }
        }, new getAnswerMap() { // from class: o.Mp4WebvttDecoder
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return parseVttCueBox.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (VideoTimelineItem) obj);
            }
        });
        RecyclerView recyclerView2 = write().IconCompatParcelizer;
        applyStyleRecord applystylerecord = this.RemoteActionCompatParcelizer;
        if (applystylerecord == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            applystylerecord = null;
        }
        recyclerView2.setAdapter(applystylerecord);
        RecyclerView recyclerView3 = write().IconCompatParcelizer;
        Context context = write().IconCompatParcelizer.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        recyclerView3.AudioAttributesCompatParcelizer(new CmcdHeadersFactoryCmcdObject(context, setObjectType.read(16), true));
        write().RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.readSubtitleText
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                parseVttCueBox.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        write().read.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.applySelectorToStyle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                parseVttCueBox.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: renamed from: o.parseVttCueBox$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.parseVttCueBox$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(parseVttCueBox parsevttcuebox, VideoTimelineItem videoTimelineItem) {
        toMagicModuleMetaRepoModel.write(videoTimelineItem, "");
        parsevttcuebox.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new getRoot.AudioAttributesCompatParcelizer(videoTimelineItem));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(parseVttCueBox parsevttcuebox, VideoTimelineItem videoTimelineItem) {
        toMagicModuleMetaRepoModel.write(videoTimelineItem, "");
        parsevttcuebox.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(new getRoot.write(videoTimelineItem));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(parseVttCueBox parsevttcuebox) {
        parsevttcuebox.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(getRoot.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(parseVttCueBox parsevttcuebox) {
        parsevttcuebox.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(getRoot.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0) {
        setTokenBinding.Companion companion = setTokenBinding.INSTANCE;
        Context context = write().IconCompatParcelizer().getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        this.read.read(setTokenBinding.Companion.IconCompatParcelizer(context, p0, 11, "landscape_video_sidepanel"));
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<attachFontFace> setupdatedstatus = parseVttCueBox.this.AudioAttributesImplApi21Parcelizer().read();
                final parseVttCueBox parsevttcuebox = parseVttCueBox.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.parseVttCueBox.write.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((attachFontFace) obj2);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private java.lang.Object write(kotlin.attachFontFace r10) {
                        /*
                            Method dump skipped, instruction units count: 205
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.parseVttCueBox.write.AnonymousClass4.write(o.attachFontFace):java.lang.Object");
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
            return parseVttCueBox.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer() {
        parseVttCueBox parsevttcuebox = this;
        setBitrateKbps.read(parsevttcuebox, new write(null));
        setBitrateKbps.read(parsevttcuebox, new RemoteActionCompatParcelizer(null));
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<setFontFamily> newNumberOtpResendRequestIconCompatParcelizer = parseVttCueBox.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer();
                final parseVttCueBox parsevttcuebox = parseVttCueBox.this;
                this.read = 1;
                if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken() { // from class: o.parseVttCueBox.RemoteActionCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((setFontFamily) obj2);
                    }

                    private Object read(setFontFamily setfontfamily) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setfontfamily, setFontFamily.write.INSTANCE)) {
                            parsevttcuebox.AudioAttributesCompatParcelizer();
                        } else if (setfontfamily instanceof setFontFamily.read) {
                            getProvider getprovider = getProvider.getInstance(parsevttcuebox.requireContext());
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getprovider, "");
                            maybeUpdateIsInCaptionService.Companion companion = maybeUpdateIsInCaptionService.INSTANCE;
                            setFontFamily.read readVar = (setFontFamily.read) setfontfamily;
                            getprovider.AudioAttributesCompatParcelizer(maybeUpdateIsInCaptionService.Companion.AudioAttributesCompatParcelizer(readVar.read(), readVar.IconCompatParcelizer()));
                            withAlwaysAsId.read(parsevttcuebox, "bookmark_action", _getIndexResolver.write(setAction.write("bookmark_id", readVar.read()), setAction.write("bookmark_state", QBankStatsResponse.RemoteActionCompatParcelizer(readVar.IconCompatParcelizer()))));
                        } else if (setfontfamily instanceof setFontFamily.IconCompatParcelizer) {
                            withAlwaysAsId.read(parsevttcuebox, "timeline_selection", _getIndexResolver.write(setAction.write("seek_to", QBankStatsResponse.RemoteActionCompatParcelizer(((setFontFamily.IconCompatParcelizer) setfontfamily).write()))));
                        } else if (setfontfamily instanceof setFontFamily.MediaBrowserCompatCustomActionResultReceiver) {
                            if (!getTrackName.write(parsevttcuebox.requireContext())) {
                                parseVttCueBox parsevttcuebox2 = parsevttcuebox;
                                parseVttCueBox parsevttcuebox3 = parsevttcuebox2;
                                String string = parsevttcuebox2.getString(R.string.app_error_no_internet);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                PlayerControlViewExternalSyntheticLambda1.write(parsevttcuebox3, string);
                            } else {
                                parseVttCueBox parsevttcuebox4 = parsevttcuebox;
                                parseVttCueBox parsevttcuebox5 = parsevttcuebox4;
                                String string2 = parsevttcuebox4.getString(R.string.error_text_general);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                                PlayerControlViewExternalSyntheticLambda1.write(parsevttcuebox5, string2);
                            }
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setfontfamily, setFontFamily.AudioAttributesCompatParcelizer.INSTANCE)) {
                            withAlwaysAsId.read(parsevttcuebox, "timeline_expand_button", _getIndexResolver.write(setAction.write("is_interacted", QBankStatsResponse.AudioAttributesCompatParcelizer(!r5.AudioAttributesImplApi21Parcelizer().read().IconCompatParcelizer().getAudioAttributesCompatParcelizer()))));
                        } else if (setfontfamily instanceof setFontFamily.RemoteActionCompatParcelizer) {
                            parsevttcuebox.read(((setFontFamily.RemoteActionCompatParcelizer) setfontfamily).RemoteActionCompatParcelizer());
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
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return parseVttCueBox.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(ActiveRecallQbankLessonUiModel p0) {
        getMappedTrackOutput getmappedtrackoutput = write().read;
        ConstraintLayout constraintLayoutIconCompatParcelizer = write().read.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayoutIconCompatParcelizer);
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context context = write().read.IconCompatParcelizer().getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        int iWrite = shouldEscapeCharacter.Companion.write(context, R.attr.cardViewStrokeWidth, new TypedValue(), true);
        MaterialCardView materialCardView = getmappedtrackoutput.write;
        if (!p0.getAudioAttributesImplApi21Parcelizer()) {
            iWrite = 0;
        }
        materialCardView.setStrokeWidth(iWrite);
        int i = p0.getAudioAttributesImplApi21Parcelizer() ? R.attr.colorSurfaceVariant18 : R.attr.colorSurface;
        MaterialCardView materialCardView2 = getmappedtrackoutput.write;
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        Context context2 = write().read.IconCompatParcelizer().getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
        materialCardView2.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context2, i, new TypedValue(), true));
        CustomTextView customTextView = getmappedtrackoutput.AudioAttributesImplApi26Parcelizer;
        int read = p0.getRead();
        StringBuilder sb = new StringBuilder();
        sb.append(read);
        sb.append(" MCQs");
        customTextView.setText(sb.toString());
        CustomTextView customTextView2 = getmappedtrackoutput.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
        PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer((TextView) customTextView2, p0.getAudioAttributesImplApi21Parcelizer() ? R.attr.onBackgroundSurface6 : R.attr.colorOnSurface);
        TextView textView = getmappedtrackoutput.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(p0.getAudioAttributesCompatParcelizer())}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        textView.setText(str);
        if (p0.getAudioAttributesImplApi26Parcelizer()) {
            TextView textView2 = getmappedtrackoutput.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView2);
            LinearLayout linearLayout = getmappedtrackoutput.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
            LinearLayout linearLayout2 = getmappedtrackoutput.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout2);
            return;
        }
        if (p0.getAudioAttributesImplApi21Parcelizer()) {
            TextView textView3 = getmappedtrackoutput.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView3);
            LinearLayout linearLayout3 = getmappedtrackoutput.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout3);
            LinearLayout linearLayout4 = getmappedtrackoutput.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout4, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout4);
            PieChart pieChart = getmappedtrackoutput.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pieChart, "");
            dispatchTouchEvent.IconCompatParcelizer(pieChart, p0.getRemoteActionCompatParcelizer());
            TextView textView4 = getmappedtrackoutput.IconCompatParcelizer;
            int remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(remoteActionCompatParcelizer);
            sb2.append("%");
            textView4.setText(sb2.toString());
            return;
        }
        TextView textView5 = getmappedtrackoutput.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView5);
        LinearLayout linearLayout5 = getmappedtrackoutput.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout5, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout5);
        LinearLayout linearLayout6 = getmappedtrackoutput.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout6, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout6);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onConfigurationChanged(p0);
        dismissAllowingStateLoss();
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.AudioAttributesCompatParcelizer = null;
    }

    /* JADX INFO: renamed from: o.parseVttCueBox$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/parseVttCueBox$IconCompatParcelizer;", "", "<init>", "()V", "Lo/setFontSize;", "p0", "", "p1", "", "p2", "p3", "p4", "p5", "Lo/parseVttCueBox;", "AudioAttributesCompatParcelizer", "(Lo/setFontSize;Ljava/lang/String;ZZZZ)Lo/parseVttCueBox;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static parseVttCueBox AudioAttributesCompatParcelizer(setFontSize p0, String p1, boolean p2, boolean p3, boolean p4, boolean p5) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            parseVttCueBox parsevttcuebox = new parseVttCueBox();
            Bundle bundleMediaBrowserCompatItemReceiver = p0.MediaBrowserCompatItemReceiver();
            bundleMediaBrowserCompatItemReceiver.putBoolean("are_video_bookmarks_enabled", p2);
            bundleMediaBrowserCompatItemReceiver.putBoolean("is_concise_mode_enabled", p3);
            bundleMediaBrowserCompatItemReceiver.putString("lesson_title", p1);
            bundleMediaBrowserCompatItemReceiver.putBoolean("should_show_collapsed_timeline", p4);
            bundleMediaBrowserCompatItemReceiver.putBoolean("is_expand_button_intereacted", p5);
            parsevttcuebox.setArguments(bundleMediaBrowserCompatItemReceiver);
            return parsevttcuebox;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final parseVttCueBox read(setFontSize setfontsize, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return Companion.AudioAttributesCompatParcelizer(setfontsize, str, z, z2, z3, z4);
    }
}
