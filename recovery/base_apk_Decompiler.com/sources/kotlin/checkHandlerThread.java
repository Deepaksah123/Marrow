package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow2.ui.notespurchase.NotesPurchaseActivityViewModel;
import com.marrow2.ui.notespurchase.landing.NotesPurchaseLandingFragmentViewModel;
import kotlin.GmsClient;
import kotlin.Metadata;
import kotlin.ServiceSpecificExtraArgsCastExtraArgs;
import kotlin.VisibilityChecker;
import kotlin.checkArgumentInRange;
import kotlin.validateScopes;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0012\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\u001d8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001b\u0010\u0015\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b\u0012\u0010$R\u001b\u0010 \u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b\u001e\u0010&R\u0016\u0010\u0019\u001a\u00020'8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0015\u0010("}, d2 = {"Lo/checkHandlerThread;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "MediaBrowserCompatItemReceiver", "", "RemoteActionCompatParcelizer", "(I)V", "", "IconCompatParcelizer", "(F)V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer", "onDestroyView", "Lo/getMaxMethodInvocationsInBatch;", "(Lo/getMaxMethodInvocationsInBatch;)V", "Lo/getTrackSelection;", "write", "Lo/getTrackSelection;", "read", "()Lo/getTrackSelection;", "Lcom/marrow2/ui/notespurchase/NotesPurchaseActivityViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/notespurchase/NotesPurchaseActivityViewModel;", "Lcom/marrow2/ui/notespurchase/landing/NotesPurchaseLandingFragmentViewModel;", "()Lcom/marrow2/ui/notespurchase/landing/NotesPurchaseLandingFragmentViewModel;", "Lo/Preconditions;", "Lo/Preconditions;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class checkHandlerThread extends PendingResultUtil {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Preconditions AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getTrackSelection RemoteActionCompatParcelizer;

    public checkHandlerThread() {
        checkHandlerThread checkhandlerthread = this;
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(NotesPurchaseActivityViewModel.class), new AnonymousClass5(checkhandlerthread), new AnonymousClass3(checkhandlerthread), new AnonymousClass1(checkhandlerthread));
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass2(new AnonymousClass4(checkhandlerthread)));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(NotesPurchaseLandingFragmentViewModel.class), new AnonymousClass8(renewEligibleWrite), new AnonymousClass7(renewEligibleWrite), new AnonymousClass9(checkhandlerthread, renewEligibleWrite));
    }

    private final getTrackSelection read() {
        getTrackSelection gettrackselection = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(gettrackselection);
        return gettrackselection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotesPurchaseActivityViewModel RemoteActionCompatParcelizer() {
        return (NotesPurchaseActivityViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotesPurchaseLandingFragmentViewModel write() {
        return (NotesPurchaseLandingFragmentViewModel) this.read.RemoteActionCompatParcelizer();
    }

    public static final class MediaBrowserCompatItemReceiver implements View.OnLayoutChangeListener {
        public MediaBrowserCompatItemReceiver() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ScrollView scrollView;
            view.removeOnLayoutChangeListener(this);
            checkHandlerThread checkhandlerthread = checkHandlerThread.this;
            getTrackSelection gettrackselection = checkhandlerthread.RemoteActionCompatParcelizer;
            if (gettrackselection == null || (scrollView = gettrackselection.write) == null) {
                return;
            }
            checkhandlerthread.RemoteActionCompatParcelizer(scrollView.getScrollY());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = getTrackSelection.read(p0, p1);
        ConstraintLayout constraintLayoutIconCompatParcelizer = read().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        RemoteActionCompatParcelizer().IconCompatParcelizer(new validateScopes.IconCompatParcelizer("Buy Notes"));
        MediaBrowserCompatCustomActionResultReceiver();
        this.AudioAttributesCompatParcelizer = new Preconditions(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        ViewPager2 viewPager2 = read().AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        Preconditions preconditions = this.AudioAttributesCompatParcelizer;
        if (preconditions == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            preconditions = null;
        }
        viewPager2.setAdapter(preconditions);
        AudioAttributesImplApi26Parcelizer();
        MediaBrowserCompatItemReceiver();
        AudioAttributesCompatParcelizer();
    }

    private final void MediaBrowserCompatItemReceiver() {
        ScrollView scrollView;
        read().write.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.checkNotGoogleApiHandlerThread
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                checkHandlerThread.write(this.read, i2);
            }
        });
        if (RemoteActionCompatParcelizer().read().IconCompatParcelizer() == null) {
            IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        ScrollView scrollView2 = read().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView2, "");
        ScrollView scrollView3 = scrollView2;
        if (scrollView3.isLaidOut() && !scrollView3.isLayoutRequested()) {
            getTrackSelection gettrackselection = this.RemoteActionCompatParcelizer;
            if (gettrackselection == null || (scrollView = gettrackselection.write) == null) {
                return;
            }
            RemoteActionCompatParcelizer(scrollView.getScrollY());
            return;
        }
        scrollView3.addOnLayoutChangeListener(new MediaBrowserCompatItemReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(checkHandlerThread checkhandlerthread, int i) {
        checkhandlerthread.RemoteActionCompatParcelizer(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(int p0) {
        MediaParserHlsMediaChunkExtractorExternalSyntheticLambda0 mediaParserHlsMediaChunkExtractorExternalSyntheticLambda0;
        ConstraintLayout constraintLayoutIconCompatParcelizer;
        int height;
        getTrackSelection gettrackselection = this.RemoteActionCompatParcelizer;
        if (gettrackselection == null || (mediaParserHlsMediaChunkExtractorExternalSyntheticLambda0 = gettrackselection.read) == null || (constraintLayoutIconCompatParcelizer = mediaParserHlsMediaChunkExtractorExternalSyntheticLambda0.IconCompatParcelizer()) == null || (height = constraintLayoutIconCompatParcelizer.getHeight()) <= 0) {
            return;
        }
        IconCompatParcelizer(((int) (getQues.read(p0 / height, BitmapDescriptorFactory.HUE_RED, 1.0f) * 32.0f)) / 32.0f);
    }

    private final void IconCompatParcelizer(float p0) {
        RemoteActionCompatParcelizer().IconCompatParcelizer(new validateScopes.RemoteActionCompatParcelizer(p0));
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            LinearLayout linearLayoutIconCompatParcelizer = read().AudioAttributesCompatParcelizer.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
            bytesRead.write(contextRequireContext, linearLayoutIconCompatParcelizer);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        final MediaParserHlsMediaChunkExtractor1 mediaParserHlsMediaChunkExtractor1 = read().AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        mediaParserHlsMediaChunkExtractor1.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.checkNotZero
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                checkHandlerThread.write(mediaParserHlsMediaChunkExtractor1);
            }
        });
        mediaParserHlsMediaChunkExtractor1.read.setOnClickListener(new View.OnClickListener() { // from class: o.RootTelemetryConfigManager
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                checkHandlerThread.read(mediaParserHlsMediaChunkExtractor1, this);
            }
        });
        read().IconCompatParcelizer.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getBatchPeriodMillis
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                checkHandlerThread.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        read().RemoteActionCompatParcelizer.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.RootTelemetryConfiguration
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                checkHandlerThread.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(MediaParserHlsMediaChunkExtractor1 mediaParserHlsMediaChunkExtractor1) {
        int i = mediaParserHlsMediaChunkExtractor1.AudioAttributesCompatParcelizer.read();
        if (i > 0) {
            mediaParserHlsMediaChunkExtractor1.AudioAttributesCompatParcelizer.setCurrentItem(i - 1);
        }
    }

    /* JADX INFO: renamed from: o.checkHandlerThread$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(MediaParserHlsMediaChunkExtractor1 mediaParserHlsMediaChunkExtractor1, checkHandlerThread checkhandlerthread) {
        int i = mediaParserHlsMediaChunkExtractor1.AudioAttributesCompatParcelizer.read();
        Preconditions preconditions = checkhandlerthread.AudioAttributesCompatParcelizer;
        if (preconditions == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            preconditions = null;
        }
        if (i < preconditions.getItemCount() - 1) {
            mediaParserHlsMediaChunkExtractor1.AudioAttributesCompatParcelizer.setCurrentItem(i + 1);
        }
    }

    /* JADX INFO: renamed from: o.checkHandlerThread$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "read", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.checkHandlerThread$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(checkHandlerThread checkhandlerthread) {
        checkhandlerthread.write().RemoteActionCompatParcelizer(checkArgumentInRange.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: renamed from: o.checkHandlerThread$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(checkHandlerThread checkhandlerthread) {
        checkhandlerthread.write().RemoteActionCompatParcelizer(checkArgumentInRange.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: renamed from: o.checkHandlerThread$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    public static final class IconCompatParcelizer extends ViewPager2.write {
        IconCompatParcelizer() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.write
        public final void RemoteActionCompatParcelizer(int i) {
            super.RemoteActionCompatParcelizer(i);
            checkHandlerThread.this.IconCompatParcelizer(i);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        read().AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(new IconCompatParcelizer());
        checkHandlerThread checkhandlerthread = this;
        setBitrateKbps.read(checkhandlerthread, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(checkhandlerthread, new write(null));
        setBitrateKbps.read(checkhandlerthread, new RemoteActionCompatParcelizer(null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getMaxMethodInvocationsInBatch> setupdatedstatusAudioAttributesCompatParcelizer = checkHandlerThread.this.write().AudioAttributesCompatParcelizer();
                final checkHandlerThread checkhandlerthread = checkHandlerThread.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.checkHandlerThread.AudioAttributesCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((getMaxMethodInvocationsInBatch) obj2);
                    }

                    private Object IconCompatParcelizer(getMaxMethodInvocationsInBatch getmaxmethodinvocationsinbatch) {
                        Preconditions preconditions = checkhandlerthread.AudioAttributesCompatParcelizer;
                        if (preconditions == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            preconditions = null;
                        }
                        preconditions.RemoteActionCompatParcelizer(getmaxmethodinvocationsinbatch.IconCompatParcelizer());
                        checkhandlerthread.RemoteActionCompatParcelizer(getmaxmethodinvocationsinbatch);
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
            return checkHandlerThread.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<GmsClient> setupdatedstatusAudioAttributesCompatParcelizer = checkHandlerThread.this.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
                final checkHandlerThread checkhandlerthread = checkHandlerThread.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.checkHandlerThread.write.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((GmsClient) obj2);
                    }

                    private Object write(GmsClient gmsClient) {
                        if (gmsClient instanceof GmsClient.read) {
                            checkhandlerthread.write().RemoteActionCompatParcelizer(new checkArgumentInRange.read(((GmsClient.read) gmsClient).IconCompatParcelizer()));
                        } else if (!(gmsClient instanceof GmsClient.write) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(gmsClient, GmsClient.AudioAttributesCompatParcelizer.INSTANCE)) {
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

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return checkHandlerThread.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<ServiceSpecificExtraArgsCastExtraArgs> newNumberOtpResendRequestIconCompatParcelizer = checkHandlerThread.this.write().IconCompatParcelizer();
                final checkHandlerThread checkhandlerthread = checkHandlerThread.this;
                this.IconCompatParcelizer = 1;
                if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken() { // from class: o.checkHandlerThread.RemoteActionCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((ServiceSpecificExtraArgsCastExtraArgs) obj2);
                    }

                    private Object read(ServiceSpecificExtraArgsCastExtraArgs serviceSpecificExtraArgsCastExtraArgs) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(serviceSpecificExtraArgsCastExtraArgs, ServiceSpecificExtraArgsCastExtraArgs.AudioAttributesCompatParcelizer.INSTANCE)) {
                            checkhandlerthread.getParentFragmentManager().IconCompatParcelizer().write(R.id.container, new IAccountAccessor()).read((String) null).write();
                        } else {
                            if (!(serviceSpecificExtraArgsCastExtraArgs instanceof ServiceSpecificExtraArgsCastExtraArgs.IconCompatParcelizer)) {
                                throw new RenewEligibleCreator();
                            }
                            ProjectionDrawMode.AudioAttributesCompatParcelizer(checkhandlerthread, ((ServiceSpecificExtraArgsCastExtraArgs.IconCompatParcelizer) serviceSpecificExtraArgsCastExtraArgs).RemoteActionCompatParcelizer());
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
            return checkHandlerThread.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(int p0) {
        boolean z = p0 == 0;
        Preconditions preconditions = this.AudioAttributesCompatParcelizer;
        if (preconditions == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            preconditions = null;
        }
        boolean z2 = p0 == preconditions.getItemCount() - 1;
        MediaParserHlsMediaChunkExtractor1 mediaParserHlsMediaChunkExtractor1 = read().AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        mediaParserHlsMediaChunkExtractor1.IconCompatParcelizer.setEnabled(!z);
        mediaParserHlsMediaChunkExtractor1.read.setEnabled(!z2);
        mediaParserHlsMediaChunkExtractor1.IconCompatParcelizer.setAlpha(z ? 0.5f : 1.0f);
        mediaParserHlsMediaChunkExtractor1.read.setAlpha(z2 ? 0.5f : 1.0f);
    }

    /* JADX INFO: renamed from: o.checkHandlerThread$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$IconCompatParcelizer.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.checkHandlerThread$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$read.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$read = fragment;
        }
    }

    /* JADX INFO: renamed from: o.checkHandlerThread$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$write.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.RemoteActionCompatParcelizer = null;
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(getMaxMethodInvocationsInBatch p0) {
        boolean write2 = p0.getWrite();
        ConstraintLayout constraintLayoutIconCompatParcelizer = read().IconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        constraintLayoutIconCompatParcelizer.setVisibility(write2 ? 0 : 8);
        ConstraintLayout constraintLayoutIconCompatParcelizer2 = read().RemoteActionCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer2, "");
        constraintLayoutIconCompatParcelizer2.setVisibility(!write2 ? 0 : 8);
        if (write2) {
            read().IconCompatParcelizer.AudioAttributesCompatParcelizer.setText(p0.getRead());
            read().IconCompatParcelizer.AudioAttributesCompatParcelizer.setPaintFlags(read().IconCompatParcelizer.AudioAttributesCompatParcelizer.getPaintFlags() | 16);
            read().IconCompatParcelizer.read.setText(p0.getRemoteActionCompatParcelizer());
        } else {
            read().RemoteActionCompatParcelizer.read.setText(p0.getIconCompatParcelizer());
            Button button = read().RemoteActionCompatParcelizer.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
            button.setVisibility(p0.getMediaBrowserCompatItemReceiver() ? 0 : 8);
            read().RemoteActionCompatParcelizer.read.setTextAlignment(p0.getMediaBrowserCompatItemReceiver() ? 5 : 4);
        }
    }

    /* JADX INFO: renamed from: o.checkHandlerThread$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/checkHandlerThread$read;", "", "<init>", "()V", "Lo/checkHandlerThread;", "write", "()Lo/checkHandlerThread;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static checkHandlerThread write() {
            return new checkHandlerThread();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
