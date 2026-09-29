package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;
import com.marrow.designsystem.theme.AppThemeManager;
import com.marrow2.ui.magic_module.intro.MagicModuleViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.setAppId;
import kotlin.setCheckedIconEnabled;
import kotlin.setForceApplySystemWindowInsetTop;
import kotlin.withFieldVisibility;
import kotlin.zaai;
import kotlin.zaaj;
import kotlin.zaao;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0013\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0013\u001a\u00020\u001d8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010!R\u001b\u0010%\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b \u0010$R\u0016\u0010\u0011\u001a\u00020&8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u001e\u0010\u001e\u001a\f\u0012\b\u0012\u0006*\u00020)0)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u0018\u0010\u0016\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010,"}, d2 = {"Lo/zaai;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroy", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "onResume", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "", "(FF)V", "MediaBrowserCompatSearchResultReceiver", "onDestroyView", "Lo/createMediaChunkIterators;", "read", "Lo/createMediaChunkIterators;", "write", "()Lo/createMediaChunkIterators;", "Lcom/marrow2/ui/magic_module/intro/MagicModuleViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/magic_module/intro/MagicModuleViewModel;", "IconCompatParcelizer", "Lo/createListenerKey;", "Lo/createListenerKey;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Lo/zaba;", "Lo/zaba;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zaai extends zaab {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private zaba AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private createListenerKey AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private createMediaChunkIterators write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> read;

    public zaai() {
        zaai zaaiVar = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass2(new AnonymousClass4(zaaiVar)));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(MagicModuleViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass1(renewEligibleWrite), new AnonymousClass5(zaaiVar, renewEligibleWrite));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.zaal
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                zaai.RemoteActionCompatParcelizer(this.read, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.read = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final createMediaChunkIterators read() {
        createMediaChunkIterators createmediachunkiterators = this.write;
        toMagicModuleMetaRepoModel.write(createmediachunkiterators);
        return createmediachunkiterators;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MagicModuleViewModel write() {
        return (MagicModuleViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(zaai zaaiVar, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        zaaiVar.write().write(zaao.read.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = createMediaChunkIterators.IconCompatParcelizer(p0, p1);
        LinearLayout linearLayoutIconCompatParcelizer = read().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.write = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesCompatParcelizer();
        read().onMediaButtonEvent.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.zaak
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zaai.RatingCompat(this.AudioAttributesCompatParcelizer);
            }
        });
        PieChart pieChart = read().onPrepareFromMediaId.write;
        postKeyRequest postkeyrequestOnSetRepeatMode = pieChart.onSetRepeatMode();
        if (postkeyrequestOnSetRepeatMode != null) {
            postkeyrequestOnSetRepeatMode.onPrepareFromUri();
        }
        pieChart.setDrawEntryLabels(false);
        pieChart.onPrepareFromUri().onPrepareFromUri();
        pieChart.setTouchEnabled(false);
        MediaBrowserCompatCustomActionResultReceiver();
        RemoteActionCompatParcelizer();
        AudioAttributesImplApi21Parcelizer();
        AudioAttributesImplBaseParcelizer();
        AudioAttributesImplApi26Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RatingCompat(zaai zaaiVar) {
        zaaiVar.write().write(zaao.write.INSTANCE);
        zaaiVar.requireActivity().onBackPressed();
    }

    private final void AudioAttributesCompatParcelizer() {
        LinearLayout linearLayout = read().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, false, true, true, true, 0, 49);
        MaterialToolbar materialToolbar = read().onMediaButtonEvent;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        ProgressBar progressBar = read().onAddQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        getHttpMethodString.read((View) progressBar, true, true, true, true, 0, 48);
        ScrollView scrollView = read().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, true, true, true, true, 0, 48);
    }

    /* JADX INFO: renamed from: o.zaai$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "write", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.zaai$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.zaai$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.zaai$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $read = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        MediaBrowserCompatSearchResultReceiver();
        LinearLayout linearLayoutIconCompatParcelizer = read().onPrepareFromMediaId.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayoutIconCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.zaai$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    private final void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = new createListenerKey();
        RecyclerView recyclerView = read().onCommand;
        createListenerKey createlistenerkey = this.AudioAttributesCompatParcelizer;
        if (createlistenerkey == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createlistenerkey = null;
        }
        recyclerView.setAdapter(createlistenerkey);
        RecyclerView recyclerView2 = read().onCommand;
        requireActivity();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        write().write(zaao.AudioAttributesCompatParcelizer.INSTANCE);
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            bytesRead.IconCompatParcelizer(contextRequireContext, (List<? extends View>) IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new View[]{read().AudioAttributesImplApi21Parcelizer, read().MediaBrowserCompatItemReceiver, read().MediaBrowserCompatCustomActionResultReceiver, read().AudioAttributesImplApi26Parcelizer, read().RatingCompat, read().write, read().RemoteActionCompatParcelizer, read().MediaDescriptionCompat, read().handleMediaPlayPauseIfPendingOnHandler, read().MediaBrowserCompatSearchResultReceiver}));
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        read().IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zaae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zaai.MediaMetadataCompat(this.IconCompatParcelizer);
            }
        });
        read().onPrepareFromMediaId.AudioAttributesImplApi26Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zaah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zaai.MediaBrowserCompatSearchResultReceiver(this.IconCompatParcelizer);
            }
        });
        read().read.setOnClickListener(new View.OnClickListener() { // from class: o.zaaf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zaai.MediaDescriptionCompat(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaMetadataCompat(zaai zaaiVar) {
        zaaiVar.write().write(zaao.MediaBrowserCompatItemReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatSearchResultReceiver(zaai zaaiVar) {
        zaaiVar.write().write(zaao.AudioAttributesImplApi26Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(zaai zaaiVar) {
        zaaiVar.write().write(zaao.AudioAttributesImplApi21Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        LinearLayout linearLayout = read().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
        ScrollView scrollView = read().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(scrollView);
        write().write(zaao.RemoteActionCompatParcelizer.INSTANCE);
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi21Parcelizer = zaai.this.write().AudioAttributesImplApi21Parcelizer();
                final zaai zaaiVar = zaai.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.zaai.read.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        ProgressBar progressBar = zaaiVar.read().onAddQueueItem;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        progressBar.setVisibility(z ? 0 : 8);
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
            return zaai.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        zaai zaaiVar = this;
        setBitrateKbps.RemoteActionCompatParcelizer(zaaiVar, new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(zaaiVar, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(zaaiVar, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(zaaiVar, new write(null));
        setBitrateKbps.read(zaaiVar, new MediaBrowserCompatCustomActionResultReceiver(null));
        setBitrateKbps.RemoteActionCompatParcelizer(zaaiVar, new AudioAttributesImplApi21Parcelizer(null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        /* JADX INFO: renamed from: o.zaai$AudioAttributesCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3<T> implements getValidationToken {
            private /* synthetic */ zaai IconCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return AudioAttributesCompatParcelizer(((Boolean) obj).booleanValue());
            }

            private Object AudioAttributesCompatParcelizer(boolean z) {
                LinearLayout linearLayout = this.IconCompatParcelizer.read().MediaBrowserCompatMediaItem;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                linearLayout.setVisibility(z ? 0 : 8);
                FrameLayout frameLayout = this.IconCompatParcelizer.read().onPlayFromSearch;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
                frameLayout.setVisibility(z ? 8 : 0);
                if (z) {
                    this.IconCompatParcelizer.read().MediaBrowserCompatItemReceiver.setImageResource(AppThemeManager.write() ? R.drawable.magic_module_home_intro_dark : R.drawable.magic_module_home_intro);
                    Button button = this.IconCompatParcelizer.read().RemoteActionCompatParcelizer;
                    final zaai zaaiVar = this.IconCompatParcelizer;
                    button.setOnClickListener(new View.OnClickListener() { // from class: o.zaam
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            zaai.AudioAttributesCompatParcelizer.AnonymousClass3.AudioAttributesCompatParcelizer(zaaiVar);
                        }
                    });
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void AudioAttributesCompatParcelizer(zaai zaaiVar) {
                zaaiVar.MediaBrowserCompatItemReceiver();
            }

            AnonymousClass3(zaai zaaiVar) {
                this.IconCompatParcelizer = zaaiVar;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (zaai.this.write().AudioAttributesImplBaseParcelizer().write(new AnonymousClass3(zaai.this), this) == objIconCompatParcelizer) {
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
            return zaai.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setNoBytesRemainingAndMaybeStoreLength> setupdatedstatus = zaai.this.write().read();
                final zaai zaaiVar = zaai.this;
                this.read = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.zaai.RemoteActionCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((setNoBytesRemainingAndMaybeStoreLength) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(setNoBytesRemainingAndMaybeStoreLength setnobytesremainingandmaybestorelength) {
                        if (setnobytesremainingandmaybestorelength != null) {
                            zaai zaaiVar2 = zaaiVar;
                            List<notifyCacheIgnored> list = setnobytesremainingandmaybestorelength.read();
                            int read = setnobytesremainingandmaybestorelength.getRead();
                            shouldIgnoreCacheForRequest remoteActionCompatParcelizer = setnobytesremainingandmaybestorelength.getRemoteActionCompatParcelizer();
                            if (!list.isEmpty()) {
                                LinearLayout linearLayout = zaaiVar2.read().MediaBrowserCompatSearchResultReceiver;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                                bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
                                createListenerKey createlistenerkey = zaaiVar2.AudioAttributesCompatParcelizer;
                                if (createlistenerkey == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    createlistenerkey = null;
                                }
                                createlistenerkey.read(list, read, remoteActionCompatParcelizer);
                                zaaiVar2.read().onCommand.AudioAttributesImplApi21Parcelizer(list.size() - 1);
                            } else {
                                LinearLayout linearLayout2 = zaaiVar2.read().MediaBrowserCompatSearchResultReceiver;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return zaai.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<zaaj> setupdatedstatusIconCompatParcelizer = zaai.this.write().IconCompatParcelizer();
                final zaai zaaiVar = zaai.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.zaai.write.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((zaaj) obj2);
                    }

                    private Object read(zaaj zaajVar) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zaajVar, zaaj.IconCompatParcelizer.INSTANCE)) {
                            ScrollView scrollView = zaaiVar.read().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(scrollView);
                            LinearLayout linearLayout = zaaiVar.read().MediaMetadataCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
                            zaaiVar.write().write(zaao.write.INSTANCE);
                        } else if (zaajVar instanceof zaaj.write) {
                            setAppId.Companion companion = setAppId.INSTANCE;
                            Context contextRequireContext = zaaiVar.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            zaaiVar.read.read(setAppId.Companion.write(contextRequireContext, ((zaaj.write) zaajVar).write(), "", onNewBytesCached.read(TextOutput.RemoteActionCompatParcelizer), 0, null, 48));
                            zaaiVar.write().write(zaao.write.INSTANCE);
                            zaaiVar.requireActivity().finish();
                        } else if (zaajVar instanceof zaaj.RemoteActionCompatParcelizer) {
                            setCheckedIconEnabled.Companion companion2 = setCheckedIconEnabled.INSTANCE;
                            Context contextRequireContext2 = zaaiVar.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                            zaaiVar.startActivity(setCheckedIconEnabled.Companion.read(contextRequireContext2, ((zaaj.RemoteActionCompatParcelizer) zaajVar).AudioAttributesCompatParcelizer(), onNewBytesCached.read(TextOutput.RemoteActionCompatParcelizer)));
                            zaaiVar.write().write(zaao.write.INSTANCE);
                            zaaiVar.requireActivity().finish();
                        } else if (zaajVar instanceof zaaj.read) {
                            setForceApplySystemWindowInsetTop.Companion companion3 = setForceApplySystemWindowInsetTop.INSTANCE;
                            Context contextRequireContext3 = zaaiVar.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
                            zaaiVar.read.read(setForceApplySystemWindowInsetTop.Companion.AudioAttributesCompatParcelizer(contextRequireContext3, new setStaticLayoutBuilderConfigurer(((zaaj.read) zaajVar).write(), false, false, true, null, null, null, 118, null)));
                            zaaiVar.write().write(zaao.write.INSTANCE);
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
            return zaai.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<zaap> setupdatedstatusAudioAttributesCompatParcelizer = zaai.this.write().AudioAttributesCompatParcelizer();
                final zaai zaaiVar = zaai.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.zaai.MediaBrowserCompatCustomActionResultReceiver.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((zaap) obj2);
                    }

                    private Object write(zaap zaapVar) {
                        if (zaapVar != null) {
                            zaai zaaiVar2 = zaaiVar;
                            ScrollView scrollView = zaaiVar2.read().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(scrollView);
                            zaaiVar2.read().onPlayFromMediaId.setText(zaapVar.getAudioAttributesImplApi21Parcelizer());
                            TextView textView = zaaiVar2.read().onFastForward;
                            int iIconCompatParcelizer = zaapVar.getRead().IconCompatParcelizer();
                            StringBuilder sb = new StringBuilder();
                            sb.append(iIconCompatParcelizer);
                            sb.append(" MCQs");
                            textView.setText(sb.toString());
                            if (zaapVar.getAudioAttributesImplApi26Parcelizer() == readExactly.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) {
                                if (zaapVar.getIconCompatParcelizer() != null) {
                                    ImageView imageView = zaaiVar2.read().AudioAttributesCompatParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                                    bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
                                    zaaiVar2.read().onPlay.setText("You’ve completed this module on ".concat(String.valueOf(loadBitmap.RemoteActionCompatParcelizer(zaapVar.getIconCompatParcelizer().longValue(), "dd MMM, yyyy"))));
                                }
                                ImageView imageView2 = zaaiVar2.read().AudioAttributesImplBaseParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView2);
                                ConstraintLayout constraintLayoutIconCompatParcelizer = zaaiVar2.read().onPrepareFromSearch.IconCompatParcelizer();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
                                bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayoutIconCompatParcelizer);
                                zaaiVar2.read().onPause.setText(zaaiVar2.getString(R.string.all_completed));
                                zaaiVar2.read().IconCompatParcelizer.setText(zaaiVar2.getString(R.string.btn_review_module));
                                zaaiVar2.read().onPrepareFromSearch.AudioAttributesCompatParcelizer.setText(zaaiVar2.getString(R.string.magic_module_result_heading, QBankStatsResponse.RemoteActionCompatParcelizer(zaapVar.getRead().AudioAttributesCompatParcelizer()), QBankStatsResponse.RemoteActionCompatParcelizer(zaapVar.getRead().IconCompatParcelizer())));
                                zaaiVar2.read().onPrepareFromSearch.IconCompatParcelizer.setProgress(zaapVar.getRead().RemoteActionCompatParcelizer());
                                TextView textView2 = zaaiVar2.read().onPrepareFromSearch.write;
                                int iRemoteActionCompatParcelizer = zaapVar.getRead().RemoteActionCompatParcelizer();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(iRemoteActionCompatParcelizer);
                                sb2.append("%");
                                textView2.setText(sb2.toString());
                                if (zaapVar.getAudioAttributesImplBaseParcelizer() != null) {
                                    zaaiVar2.RemoteActionCompatParcelizer(r1.AudioAttributesCompatParcelizer(), r1.read());
                                }
                                if (zaapVar.getRemoteActionCompatParcelizer()) {
                                    zaaiVar2.read().onPrepareFromMediaId.AudioAttributesImplApi26Parcelizer.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, _isNaN.getDrawable(zaaiVar2.requireContext(), R.drawable.ic_keyboard_arrow_up), (Drawable) null);
                                    LinearLayout linearLayout = zaaiVar2.read().onPrepareFromMediaId.AudioAttributesCompatParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                                    bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
                                    LinearLayout linearLayout2 = zaaiVar2.read().onPrepareFromMediaId.IconCompatParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                                    bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout2);
                                } else {
                                    zaaiVar2.read().onPrepareFromMediaId.AudioAttributesImplApi26Parcelizer.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, _isNaN.getDrawable(zaaiVar2.requireContext(), R.drawable.ic_arrow_down), (Drawable) null);
                                    LinearLayout linearLayout3 = zaaiVar2.read().onPrepareFromMediaId.AudioAttributesCompatParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
                                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout3);
                                    LinearLayout linearLayout4 = zaaiVar2.read().onPrepareFromMediaId.IconCompatParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout4, "");
                                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout4);
                                }
                                TextView textView3 = zaaiVar2.read().onPrepareFromMediaId.read;
                                zaau audioAttributesImplBaseParcelizer = zaapVar.getAudioAttributesImplBaseParcelizer();
                                textView3.setText(String.valueOf(audioAttributesImplBaseParcelizer != null ? QBankStatsResponse.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer.write()) : null));
                                TextView textView4 = zaaiVar2.read().onPrepareFromMediaId.AudioAttributesImplApi21Parcelizer;
                                zaau audioAttributesImplBaseParcelizer2 = zaapVar.getAudioAttributesImplBaseParcelizer();
                                textView4.setText(String.valueOf(audioAttributesImplBaseParcelizer2 != null ? QBankStatsResponse.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer2.AudioAttributesCompatParcelizer()) : null));
                                TextView textView5 = zaaiVar2.read().onPrepareFromMediaId.RemoteActionCompatParcelizer;
                                zaau audioAttributesImplBaseParcelizer3 = zaapVar.getAudioAttributesImplBaseParcelizer();
                                textView5.setText(String.valueOf(audioAttributesImplBaseParcelizer3 != null ? QBankStatsResponse.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer3.read()) : null));
                            } else if (zaapVar.getAudioAttributesImplApi26Parcelizer() == readExactly.read.getRemoteActionCompatParcelizer()) {
                                ConstraintLayout constraintLayoutIconCompatParcelizer2 = zaaiVar2.read().onPrepareFromSearch.IconCompatParcelizer();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer2, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayoutIconCompatParcelizer2);
                                LinearLayout linearLayoutIconCompatParcelizer = zaaiVar2.read().onPrepareFromMediaId.IconCompatParcelizer();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayoutIconCompatParcelizer);
                                ImageView imageView3 = zaaiVar2.read().AudioAttributesCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView3);
                                zaaiVar2.read().IconCompatParcelizer.setText(zaaiVar2.getString(R.string.btn_continue));
                                TextView textView6 = zaaiVar2.read().onPause;
                                int mediaBrowserCompatCustomActionResultReceiver = zaapVar.getMediaBrowserCompatCustomActionResultReceiver();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(mediaBrowserCompatCustomActionResultReceiver);
                                sb3.append(" completed");
                                textView6.setText(sb3.toString());
                                if (zaapVar.getIconCompatParcelizer() != null) {
                                    ImageView imageView4 = zaaiVar2.read().AudioAttributesImplBaseParcelizer;
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
                                    bytesRead.AudioAttributesImplApi21Parcelizer(imageView4);
                                    TextView textView7 = zaaiVar2.read().onPlay;
                                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                                    String string = zaaiVar2.getString(R.string.magic_module_paused);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                    String str = String.format(string, Arrays.copyOf(new Object[]{loadBitmap.RemoteActionCompatParcelizer(zaapVar.getIconCompatParcelizer().longValue(), "dd MMM, yyyy")}, 1));
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                                    textView7.setText(str);
                                }
                            } else {
                                ImageView imageView5 = zaaiVar2.read().AudioAttributesImplBaseParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView5, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView5);
                                ImageView imageView6 = zaaiVar2.read().AudioAttributesCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView6, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView6);
                                if (zaapVar.getIconCompatParcelizer() != null) {
                                    TextView textView8 = zaaiVar2.read().onPlay;
                                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
                                    String string2 = zaaiVar2.getString(R.string.magic_module_created_on);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                                    String str2 = String.format(string2, Arrays.copyOf(new Object[]{loadBitmap.RemoteActionCompatParcelizer(zaapVar.getIconCompatParcelizer().longValue(), "dd MMM, yyyy")}, 1));
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                                    textView8.setText(str2);
                                }
                                ConstraintLayout constraintLayoutIconCompatParcelizer3 = zaaiVar2.read().onPrepareFromSearch.IconCompatParcelizer();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer3, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayoutIconCompatParcelizer3);
                                LinearLayout linearLayoutIconCompatParcelizer2 = zaaiVar2.read().onPrepareFromMediaId.IconCompatParcelizer();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer2, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayoutIconCompatParcelizer2);
                                zaaiVar2.read().IconCompatParcelizer.setText(zaaiVar2.getString(R.string.btn_solve_module));
                                zaaiVar2.read().onPause.setText(zaaiVar2.getString(R.string.solve_now));
                            }
                        } else {
                            ScrollView scrollView2 = zaaiVar.read().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(scrollView2);
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
            return zaai.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = zaai.this.write().MediaBrowserCompatCustomActionResultReceiver();
                final zaai zaaiVar = zaai.this;
                this.write = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.zaai.AudioAttributesImplApi21Parcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        int i2;
                        if (!z) {
                            zaba zabaVar = zaaiVar.AudioAttributesImplBaseParcelizer;
                            if (zabaVar != null) {
                                zabaVar.dismiss();
                            }
                            View view = zaaiVar.read().onCustomAction;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(view);
                        } else {
                            Context contextRequireContext = zaaiVar.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            int i3 = -updateNavigation.read(contextRequireContext, TarConstants.PREFIXLEN);
                            if (DeviceProperties.isTablet(zaaiVar.requireContext())) {
                                Context contextRequireContext2 = zaaiVar.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                                i2 = updateNavigation.read(contextRequireContext2, 14);
                            } else {
                                Context contextRequireContext3 = zaaiVar.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
                                i2 = updateNavigation.read(contextRequireContext3, 10);
                            }
                            zaba zabaVar2 = zaaiVar.AudioAttributesImplBaseParcelizer;
                            if (zabaVar2 != null) {
                                ImageView imageView = zaaiVar.read().read;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                                zabaVar2.read(imageView, i3, i2);
                            }
                            View view2 = zaaiVar.read().onCustomAction;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(view2);
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
            return zaai.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(float p0, float p1) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(_isNaN.getColor(requireContext(), R.color.green02)));
        arrayList2.add(Integer.valueOf(_isNaN.getColor(requireContext(), R.color.yellow02)));
        arrayList.add(new PieEntry(p0));
        arrayList.add(new PieEntry(p1));
        DefaultDrmSessionExternalSyntheticLambda3 defaultDrmSessionExternalSyntheticLambda3 = new DefaultDrmSessionExternalSyntheticLambda3(arrayList, null);
        defaultDrmSessionExternalSyntheticLambda3.RemoteActionCompatParcelizer(arrayList2);
        defaultDrmSessionExternalSyntheticLambda3.AudioAttributesCompatParcelizer(false);
        provisionRequired provisionrequired = new provisionRequired(defaultDrmSessionExternalSyntheticLambda3);
        provisionrequired.MediaMetadataCompat();
        read().onPrepareFromMediaId.write.setData(provisionrequired);
        read().onPrepareFromMediaId.write.invalidate();
        TextView textView = read().onPrepareFromMediaId.AudioAttributesImplBaseParcelizer;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String string = getString(R.string.total_mcq_attempted);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf((int) (p0 + p1))}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        textView.setText(str);
        TextView textView2 = read().onPrepareFromMediaId.MediaBrowserCompatItemReceiver;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String string2 = getString(R.string.revised_count);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf((int) p0)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        textView2.setText(str2);
        TextView textView3 = read().onPrepareFromMediaId.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String string3 = getString(R.string.need_revision_count);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        String str3 = String.format(string3, Arrays.copyOf(new Object[]{String.valueOf((int) p1)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        textView3.setText(str3);
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        this.AudioAttributesImplBaseParcelizer = new zaba(contextRequireContext, new getCreatedOnDateMs() { // from class: o.zaag
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return zaai.onAddQueueItem(this.write);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onAddQueueItem(zaai zaaiVar) {
        zaaiVar.write().write(zaao.IconCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        zaba zabaVar = this.AudioAttributesImplBaseParcelizer;
        if (zabaVar != null) {
            zabaVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.zaai$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zaai$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/zaai;", "IconCompatParcelizer", "(Z)Lo/zaai;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static zaai IconCompatParcelizer(boolean p0) {
            zaai zaaiVar = new zaai();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isFromDeeplink", p0);
            zaaiVar.setArguments(bundle);
            return zaaiVar;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
