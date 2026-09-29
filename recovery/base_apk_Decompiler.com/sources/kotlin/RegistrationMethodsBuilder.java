package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.button.MaterialButton;
import com.marrow.R;
import com.marrow2.ui.magic_module.done.MagicModuleDoneViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.RegistrationMethodsBuilder;
import kotlin.StatusCallback;
import kotlin.TaskApiCallBuilder;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.getSenderId;
import kotlin.setForceApplySystemWindowInsetTop;
import kotlin.withFieldVisibility;
import kotlin.zzC;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0011\u0010\u001bJ\u0017\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0011\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0014\u0010%\u001a\u00020!8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001b\u0010\u0018\u001a\u00020&8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b%\u0010(R\u0016\u0010\u001e\u001a\u00020)8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b%\u0010*R\u001e\u0010#\u001a\f\u0012\b\u0012\u0006*\u00020,0,0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-"}, d2 = {"Lo/RegistrationMethodsBuilder;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroy", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "onResume", "MediaBrowserCompatCustomActionResultReceiver", "MediaDescriptionCompat", "RemoteActionCompatParcelizer", "", "", "(Ljava/lang/String;I)V", "(I)I", "", "IconCompatParcelizer", "(FF)V", "AudioAttributesImplApi26Parcelizer", "Lo/updateLiveEdgeTimeUs;", "Lo/updateLiveEdgeTimeUs;", "write", "()Lo/updateLiveEdgeTimeUs;", "AudioAttributesCompatParcelizer", "Lcom/marrow2/ui/magic_module/done/MagicModuleDoneViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/magic_module/done/MagicModuleDoneViewModel;", "Lo/createListenerKey;", "Lo/createListenerKey;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RegistrationMethodsBuilder extends RegistrationMethods {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private createListenerKey IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private updateLiveEdgeTimeUs read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    /* JADX INFO: Access modifiers changed from: private */
    public static int read(int p0) {
        return p0 >= 90 ? R.string.result_percent_text_90 : p0 >= 75 ? R.string.result_percent_text_75 : p0 >= 50 ? R.string.result_percent_text_50 : R.string.result_percent_text_default;
    }

    public RegistrationMethodsBuilder() {
        RegistrationMethodsBuilder registrationMethodsBuilder = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass3(new AnonymousClass4(registrationMethodsBuilder)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(MagicModuleDoneViewModel.class), new AnonymousClass5(renewEligibleWrite), new AnonymousClass2(renewEligibleWrite), new AnonymousClass1(registrationMethodsBuilder, renewEligibleWrite));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.withHolder
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                RegistrationMethodsBuilder.write(this.IconCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.write = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final updateLiveEdgeTimeUs write() {
        updateLiveEdgeTimeUs updateliveedgetimeus = this.read;
        toMagicModuleMetaRepoModel.write(updateliveedgetimeus);
        return updateliveedgetimeus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MagicModuleDoneViewModel AudioAttributesCompatParcelizer() {
        return (MagicModuleDoneViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(RegistrationMethodsBuilder registrationMethodsBuilder, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == -1) {
            registrationMethodsBuilder.AudioAttributesCompatParcelizer().IconCompatParcelizer(TaskApiCallBuilder.write.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read = updateLiveEdgeTimeUs.IconCompatParcelizer(p0, p1);
        FrameLayout frameLayoutIconCompatParcelizer = write().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayoutIconCompatParcelizer, "");
        return frameLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.read = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        PieChart pieChart = write().MediaBrowserCompatMediaItem.write;
        postKeyRequest postkeyrequestOnSetRepeatMode = pieChart.onSetRepeatMode();
        if (postkeyrequestOnSetRepeatMode != null) {
            postkeyrequestOnSetRepeatMode.onPrepareFromUri();
        }
        pieChart.setDrawEntryLabels(false);
        pieChart.onPrepareFromUri().onPrepareFromUri();
        pieChart.setTouchEnabled(false);
        AudioAttributesImplBaseParcelizer();
        AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplApi26Parcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void read() {
        ScrollView scrollView = write().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, true, true, true, true, 0, 48);
    }

    private final void AudioAttributesImplBaseParcelizer() {
        LinearLayout linearLayoutIconCompatParcelizer = write().MediaBrowserCompatMediaItem.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer);
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        this.IconCompatParcelizer = new createListenerKey();
        RecyclerView recyclerView = write().AudioAttributesImplApi21Parcelizer;
        createListenerKey createlistenerkey = this.IconCompatParcelizer;
        if (createlistenerkey == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createlistenerkey = null;
        }
        recyclerView.setAdapter(createlistenerkey);
        RecyclerView recyclerView2 = write().AudioAttributesImplApi21Parcelizer;
        requireActivity();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
    }

    /* JADX INFO: renamed from: o.RegistrationMethodsBuilder$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.RegistrationMethodsBuilder$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "RemoteActionCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            LinearLayout linearLayout = write().AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext, linearLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            LinearLayout linearLayoutIconCompatParcelizer = write().MediaBrowserCompatMediaItem.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext2, linearLayoutIconCompatParcelizer);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            CardView cardView = write().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
            bytesRead.IconCompatParcelizer(contextRequireContext3, cardView);
            Context contextRequireContext4 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext4, "");
            LinearLayout linearLayout2 = write().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.IconCompatParcelizer(contextRequireContext4, linearLayout2);
        }
    }

    /* JADX INFO: renamed from: o.RegistrationMethodsBuilder$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.RegistrationMethodsBuilder$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.RegistrationMethodsBuilder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AudioAttributesCompatParcelizer().IconCompatParcelizer(TaskApiCallBuilder.RemoteActionCompatParcelizer.INSTANCE);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setNoBytesRemainingAndMaybeStoreLength> setupdatedstatusAudioAttributesCompatParcelizer = RegistrationMethodsBuilder.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                final RegistrationMethodsBuilder registrationMethodsBuilder = RegistrationMethodsBuilder.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.RegistrationMethodsBuilder.AudioAttributesCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((setNoBytesRemainingAndMaybeStoreLength) obj2);
                    }

                    private Object read(setNoBytesRemainingAndMaybeStoreLength setnobytesremainingandmaybestorelength) {
                        if (setnobytesremainingandmaybestorelength != null) {
                            RegistrationMethodsBuilder registrationMethodsBuilder2 = registrationMethodsBuilder;
                            List<notifyCacheIgnored> list = setnobytesremainingandmaybestorelength.read();
                            int read = setnobytesremainingandmaybestorelength.getRead();
                            shouldIgnoreCacheForRequest remoteActionCompatParcelizer = setnobytesremainingandmaybestorelength.getRemoteActionCompatParcelizer();
                            if (!list.isEmpty()) {
                                LinearLayout linearLayout = registrationMethodsBuilder2.write().IconCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                                PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
                                createListenerKey createlistenerkey = registrationMethodsBuilder2.IconCompatParcelizer;
                                if (createlistenerkey == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    createlistenerkey = null;
                                }
                                createlistenerkey.read(list, read, remoteActionCompatParcelizer);
                                registrationMethodsBuilder2.write().AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer(list.size() - 1);
                            } else {
                                LinearLayout linearLayout2 = registrationMethodsBuilder2.write().IconCompatParcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout2);
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
            return RegistrationMethodsBuilder.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        RegistrationMethodsBuilder registrationMethodsBuilder = this;
        setBitrateKbps.read(registrationMethodsBuilder, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(registrationMethodsBuilder, new IconCompatParcelizer(null));
        setBitrateKbps.read(registrationMethodsBuilder, new read(null));
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.RegistrationMethodsBuilder$IconCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements getValidationToken {
            private /* synthetic */ RegistrationMethodsBuilder RemoteActionCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return IconCompatParcelizer((StatusCallback) obj);
            }

            private Object IconCompatParcelizer(final StatusCallback statusCallback) {
                if (statusCallback instanceof StatusCallback.AudioAttributesCompatParcelizer) {
                    MaterialButton materialButton = this.RemoteActionCompatParcelizer.write().MediaBrowserCompatItemReceiver;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialButton, "");
                    StatusCallback.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (StatusCallback.AudioAttributesCompatParcelizer) statusCallback;
                    materialButton.setVisibility(!audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() ? 0 : 8);
                    if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() && audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() && audioAttributesCompatParcelizer.write()) {
                        FrameLayout frameLayoutIconCompatParcelizer = this.RemoteActionCompatParcelizer.write().IconCompatParcelizer();
                        final RegistrationMethodsBuilder registrationMethodsBuilder = this.RemoteActionCompatParcelizer;
                        frameLayoutIconCompatParcelizer.postDelayed(new Runnable() { // from class: o.TaskApiCall
                            @Override // java.lang.Runnable
                            public final void run() {
                                RegistrationMethodsBuilder.IconCompatParcelizer.AnonymousClass1.IconCompatParcelizer(registrationMethodsBuilder, statusCallback);
                            }
                        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                    } else if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                        this.RemoteActionCompatParcelizer.write().MediaBrowserCompatItemReceiver.setEnabled(true);
                        this.RemoteActionCompatParcelizer.write().MediaBrowserCompatItemReceiver.setAlpha(1.0f);
                    } else {
                        this.RemoteActionCompatParcelizer.write().MediaBrowserCompatItemReceiver.setEnabled(false);
                        this.RemoteActionCompatParcelizer.write().MediaBrowserCompatItemReceiver.setAlpha(0.5f);
                    }
                    this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().IconCompatParcelizer(TaskApiCallBuilder.IconCompatParcelizer.INSTANCE);
                } else if (statusCallback instanceof StatusCallback.read) {
                    this.RemoteActionCompatParcelizer.MediaDescriptionCompat();
                    this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().IconCompatParcelizer(TaskApiCallBuilder.IconCompatParcelizer.INSTANCE);
                } else if (statusCallback instanceof StatusCallback.RemoteActionCompatParcelizer) {
                    StatusCallback.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (StatusCallback.RemoteActionCompatParcelizer) statusCallback;
                    this.RemoteActionCompatParcelizer.read(remoteActionCompatParcelizer.read(), remoteActionCompatParcelizer.IconCompatParcelizer());
                    this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().IconCompatParcelizer(TaskApiCallBuilder.IconCompatParcelizer.INSTANCE);
                } else if (statusCallback instanceof StatusCallback.write) {
                    RegistrationMethodsBuilder registrationMethodsBuilder2 = this.RemoteActionCompatParcelizer;
                    setForceApplySystemWindowInsetTop.Companion companion = setForceApplySystemWindowInsetTop.INSTANCE;
                    Context contextRequireContext = this.RemoteActionCompatParcelizer.requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                    registrationMethodsBuilder2.startActivity(setForceApplySystemWindowInsetTop.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new setStaticLayoutBuilderConfigurer(((StatusCallback.write) statusCallback).RemoteActionCompatParcelizer(), false, false, true, null, null, null, 118, null)));
                    this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().IconCompatParcelizer(TaskApiCallBuilder.IconCompatParcelizer.INSTANCE);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void IconCompatParcelizer(final RegistrationMethodsBuilder registrationMethodsBuilder, StatusCallback statusCallback) {
                if (!registrationMethodsBuilder.isAdded() || registrationMethodsBuilder.getChildFragmentManager().onPrepareFromSearch()) {
                    return;
                }
                ((StatusCallback.AudioAttributesCompatParcelizer) statusCallback).read();
                zzC.Companion companion = zzC.INSTANCE;
                zzC zzcWrite = zzC.Companion.write();
                zzcWrite.setCancelable(false);
                FragmentManager childFragmentManager = registrationMethodsBuilder.getChildFragmentManager();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
                AccountPickerAccountChooserOptionsBuilder.AudioAttributesCompatParcelizer(zzcWrite, childFragmentManager, (getAnswerMap<? super Integer, getShowPopup>) new getAnswerMap() { // from class: o.shouldAutoResolveMissingFeatures
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return RegistrationMethodsBuilder.IconCompatParcelizer.AnonymousClass1.IconCompatParcelizer(registrationMethodsBuilder, ((Integer) obj).intValue());
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup IconCompatParcelizer(RegistrationMethodsBuilder registrationMethodsBuilder, int i) {
                registrationMethodsBuilder.AudioAttributesCompatParcelizer().IconCompatParcelizer(new TaskApiCallBuilder.AudioAttributesCompatParcelizer(i));
                return getShowPopup.INSTANCE;
            }

            AnonymousClass1(RegistrationMethodsBuilder registrationMethodsBuilder) {
                this.RemoteActionCompatParcelizer = registrationMethodsBuilder;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (RegistrationMethodsBuilder.this.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer().write(new AnonymousClass1(RegistrationMethodsBuilder.this), this) == objIconCompatParcelizer) {
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
            return RegistrationMethodsBuilder.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<TaskUtil> setupdatedstatus = RegistrationMethodsBuilder.this.AudioAttributesCompatParcelizer().read();
                final RegistrationMethodsBuilder registrationMethodsBuilder = RegistrationMethodsBuilder.this;
                this.write = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.RegistrationMethodsBuilder.read.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((TaskUtil) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(TaskUtil taskUtil) {
                        registrationMethodsBuilder.write().MediaBrowserCompatSearchResultReceiver.setText(registrationMethodsBuilder.getString(RegistrationMethodsBuilder.read(taskUtil.getAudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer())));
                        registrationMethodsBuilder.write().MediaMetadataCompat.AudioAttributesCompatParcelizer.setText(registrationMethodsBuilder.getString(R.string.magic_module_result_heading, QBankStatsResponse.RemoteActionCompatParcelizer(taskUtil.getAudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer()), QBankStatsResponse.RemoteActionCompatParcelizer(taskUtil.getAudioAttributesImplApi21Parcelizer().IconCompatParcelizer())));
                        registrationMethodsBuilder.write().MediaMetadataCompat.IconCompatParcelizer.setProgress(taskUtil.getAudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer());
                        TextView textView = registrationMethodsBuilder.write().MediaMetadataCompat.write;
                        int iRemoteActionCompatParcelizer = taskUtil.getAudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
                        StringBuilder sb = new StringBuilder();
                        sb.append(iRemoteActionCompatParcelizer);
                        sb.append("%");
                        textView.setText(sb.toString());
                        TextView textView2 = registrationMethodsBuilder.write().MediaBrowserCompatCustomActionResultReceiver;
                        int iIconCompatParcelizer = taskUtil.getAudioAttributesImplApi21Parcelizer().IconCompatParcelizer();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(iIconCompatParcelizer);
                        sb2.append(" MCQs");
                        textView2.setText(sb2.toString());
                        if (taskUtil.getMediaBrowserCompatCustomActionResultReceiver() != null) {
                            registrationMethodsBuilder.IconCompatParcelizer(r0.AudioAttributesCompatParcelizer(), r0.read());
                        }
                        if (taskUtil.getIconCompatParcelizer()) {
                            registrationMethodsBuilder.write().MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, _isNaN.getDrawable(registrationMethodsBuilder.requireContext(), R.drawable.ic_keyboard_arrow_up), (Drawable) null);
                            LinearLayout linearLayout = registrationMethodsBuilder.write().MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
                            LinearLayout linearLayout2 = registrationMethodsBuilder.write().MediaBrowserCompatMediaItem.IconCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                            PlayerControlViewExternalSyntheticLambda1.write(linearLayout2);
                        } else {
                            registrationMethodsBuilder.write().MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, _isNaN.getDrawable(registrationMethodsBuilder.requireContext(), R.drawable.ic_arrow_down), (Drawable) null);
                            LinearLayout linearLayout3 = registrationMethodsBuilder.write().MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout3);
                            LinearLayout linearLayout4 = registrationMethodsBuilder.write().MediaBrowserCompatMediaItem.IconCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout4, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout4);
                        }
                        TextView textView3 = registrationMethodsBuilder.write().MediaBrowserCompatMediaItem.read;
                        zaau mediaBrowserCompatCustomActionResultReceiver = taskUtil.getMediaBrowserCompatCustomActionResultReceiver();
                        textView3.setText(String.valueOf(mediaBrowserCompatCustomActionResultReceiver != null ? QBankStatsResponse.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.write()) : null));
                        TextView textView4 = registrationMethodsBuilder.write().MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer;
                        zaau mediaBrowserCompatCustomActionResultReceiver2 = taskUtil.getMediaBrowserCompatCustomActionResultReceiver();
                        textView4.setText(String.valueOf(mediaBrowserCompatCustomActionResultReceiver2 != null ? QBankStatsResponse.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver2.AudioAttributesCompatParcelizer()) : null));
                        TextView textView5 = registrationMethodsBuilder.write().MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                        zaau mediaBrowserCompatCustomActionResultReceiver3 = taskUtil.getMediaBrowserCompatCustomActionResultReceiver();
                        textView5.setText(String.valueOf(mediaBrowserCompatCustomActionResultReceiver3 != null ? QBankStatsResponse.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver3.read()) : null));
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
            return RegistrationMethodsBuilder.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaDescriptionCompat() {
        ScrollView scrollView = write().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(scrollView);
        LottieAnimationView lottieAnimationView = write().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lottieAnimationView, "");
        PlayerControlViewExternalSyntheticLambda1.write(lottieAnimationView);
        createEquirectangular.IconCompatParcelizer(write().read);
        write().read.postDelayed(new Runnable() { // from class: o.PendingResultFacade
            @Override // java.lang.Runnable
            public final void run() {
                RegistrationMethodsBuilder.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.write);
            }
        }, 1800L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(RegistrationMethodsBuilder registrationMethodsBuilder) {
        registrationMethodsBuilder.RemoteActionCompatParcelizer();
    }

    private final void RemoteActionCompatParcelizer() {
        if (isAdded()) {
            LottieAnimationView lottieAnimationView = write().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lottieAnimationView, "");
            createEquirectangular.write(lottieAnimationView, new Runnable() { // from class: o.StatusExceptionMapper
                private static final byte[] $$a = {91, -41, -108, -7, 19, 10, 3, -20, 6, -5};
                private static final int $$b = 235;
                private static int write = 0;
                private static int IconCompatParcelizer = 1;

                /* JADX WARN: Removed duplicated region for block: B:73:0x0642  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public static java.lang.Object[] RemoteActionCompatParcelizer(int r35, int r36, int r37) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 2282
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.StatusExceptionMapper.RemoteActionCompatParcelizer(int, int, int):java.lang.Object[]");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
                    /*
                        int r8 = r8 * 3
                        int r0 = 4 - r8
                        int r6 = r6 * 39
                        int r6 = 114 - r6
                        int r7 = r7 + 4
                        byte[] r1 = kotlin.StatusExceptionMapper.$$a
                        byte[] r0 = new byte[r0]
                        int r8 = 3 - r8
                        r2 = 0
                        if (r1 != 0) goto L16
                        r3 = r7
                        r4 = r2
                        goto L2e
                    L16:
                        r3 = r2
                    L17:
                        int r7 = r7 + 1
                        byte r4 = (byte) r6
                        r0[r3] = r4
                        if (r3 != r8) goto L26
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L26:
                        int r3 = r3 + 1
                        r4 = r1[r7]
                        r5 = r3
                        r3 = r7
                        r7 = r4
                        r4 = r5
                    L2e:
                        int r7 = -r7
                        int r6 = r6 + r7
                        int r6 = r6 + 6
                        r7 = r3
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.StatusExceptionMapper.a(byte, byte, int, java.lang.Object[]):void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RegistrationMethodsBuilder.MediaBrowserCompatMediaItem(this.AudioAttributesCompatParcelizer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatMediaItem(RegistrationMethodsBuilder registrationMethodsBuilder) {
        LottieAnimationView lottieAnimationView = registrationMethodsBuilder.write().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lottieAnimationView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(lottieAnimationView);
        ScrollView scrollView = registrationMethodsBuilder.write().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        PlayerControlViewExternalSyntheticLambda1.write(scrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0, int p1) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.write;
        getSenderId.Companion companion = getSenderId.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(getSenderId.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new setTitleOverrideText(null, p0, 0, readBlockToCache.AudioAttributesCompatParcelizer, p1, 5, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(float p0, float p1) {
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
        write().MediaBrowserCompatMediaItem.write.setData(provisionrequired);
        write().MediaBrowserCompatMediaItem.write.invalidate();
        TextView textView = write().MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String string = getString(R.string.total_mcq_attempted);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf((int) (p0 + p1))}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        textView.setText(str);
        TextView textView2 = write().MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String string2 = getString(R.string.revised_count);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf((int) p0)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        textView2.setText(str2);
        TextView textView3 = write().MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String string3 = getString(R.string.need_revision_count);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        String str3 = String.format(string3, Arrays.copyOf(new Object[]{String.valueOf((int) p1)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        textView3.setText(str3);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        write().RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setFeatures
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationMethodsBuilder.RatingCompat(this.write);
            }
        });
        write().MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setMethodKey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationMethodsBuilder.MediaMetadataCompat(this.read);
            }
        });
        write().AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.SignInConnectionListener
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationMethodsBuilder.MediaBrowserCompatSearchResultReceiver(this.write);
            }
        });
        write().MediaBrowserCompatItemReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.RemoteCall
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationMethodsBuilder.MediaDescriptionCompat(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RatingCompat(RegistrationMethodsBuilder registrationMethodsBuilder) {
        registrationMethodsBuilder.requireActivity().finish();
        registrationMethodsBuilder.AudioAttributesCompatParcelizer().IconCompatParcelizer(TaskApiCallBuilder.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaMetadataCompat(RegistrationMethodsBuilder registrationMethodsBuilder) {
        registrationMethodsBuilder.AudioAttributesCompatParcelizer().IconCompatParcelizer(TaskApiCallBuilder.AudioAttributesImplApi21Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatSearchResultReceiver(RegistrationMethodsBuilder registrationMethodsBuilder) {
        registrationMethodsBuilder.AudioAttributesCompatParcelizer().IconCompatParcelizer(TaskApiCallBuilder.AudioAttributesImplBaseParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(RegistrationMethodsBuilder registrationMethodsBuilder) {
        registrationMethodsBuilder.AudioAttributesCompatParcelizer().IconCompatParcelizer(new TaskApiCallBuilder.read());
    }

    /* JADX INFO: renamed from: o.RegistrationMethodsBuilder$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/RegistrationMethodsBuilder$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/RegistrationMethodsBuilder;", "IconCompatParcelizer", "()Lo/RegistrationMethodsBuilder;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static RegistrationMethodsBuilder IconCompatParcelizer() {
            return new RegistrationMethodsBuilder();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
