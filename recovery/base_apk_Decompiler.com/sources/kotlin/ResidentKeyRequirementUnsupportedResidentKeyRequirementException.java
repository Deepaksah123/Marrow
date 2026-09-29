package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivity;
import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import com.marrow2.ui.qbank.landing.QBankLandingViewModel;
import java.util.List;
import kotlin.AbstractC0251zzar;
import kotlin.AbstractC0252zzas;
import kotlin.AbstractC0255zzav;
import kotlin.ActivityC0259zzaz;
import kotlin.AuthorizationRequestBuilder;
import kotlin.MediaCodecVideoRendererVideoFrameProcessorManagerExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.ResolvableApiException;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.getUvm;
import kotlin.onSingleTapUp;
import kotlin.setTokenBinding;
import kotlin.withFieldVisibility;
import kotlin.zzel;
import kotlin.zzpk;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u001fH\u0002J\u0018\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020\u001fH\u0002J\u0014\u0010-\u001a\u00020\u001f2\n\u0010.\u001a\u00060/j\u0002`0H\u0002J\b\u00101\u001a\u00020\u001fH\u0002J\b\u00102\u001a\u00020\u001fH\u0002J\u0010\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u001fH\u0002J\b\u00107\u001a\u00020\u001fH\u0002J\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020\u001fH\u0002J\u0010\u0010<\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020>H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/marrow2/ui/qbank/landing/QBankLandingFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/marrow2/ui/qbank/landing/adapter/QBankLandingAdapter$ItemClickListener;", "<init>", "()V", "_binding", "Lcom/marrow/databinding/FragmentQbankLandingBinding;", "binding", "getBinding", "()Lcom/marrow/databinding/FragmentQbankLandingBinding;", "viewModel", "Lcom/marrow2/ui/qbank/landing/QBankLandingViewModel;", "getViewModel", "()Lcom/marrow2/ui/qbank/landing/QBankLandingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "qBankItemsAdapter", "Lcom/marrow2/ui/qbank/landing/adapter/QBankLandingAdapter;", "notifyRefreshLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "onDestroyView", "setAdapter", "setObserver", "paintUIWithProgressBar", "showProgressBar", "", "moveToMarrowthonActivity", "moveToLessonActivity", "subjectId", "", "subjectTitle", "moveToCustomModuleActivity", "moveToActiveCustomModuleActivity", "customModule", "Lcom/marrow2/domain/custom_module/model/CustomModuleUCModel;", "Lcom/marrow2/ui/custom_module/model/CustomModuleVMModel;", "moveToSchemaActivity", "moveToBookmarkActivity", "moveToNextSuggestion", "suggestionData", "Lcom/marrow2/ui/qbank/landing/model/QBankLandingUIModel$QBankSuggestionModel;", "moveToQBankManifesto", "moveToUpgradePlanActivity", "showToast", "message", "", "setMargins", "notifyEvent", "event", "Lcom/marrow2/ui/qbank/landing/model/QBankLandingEvent;", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResidentKeyRequirementUnsupportedResidentKeyRequirementException extends RSAAlgorithm implements getUvm.AudioAttributesCompatParcelizer {
    public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(null);
    private HlsMediaChunk AudioAttributesCompatParcelizer;
    private final RenewEligible IconCompatParcelizer;
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> read;
    private final getUvm write;

    /* JADX WARN: Multi-variable type inference failed */
    public ResidentKeyRequirementUnsupportedResidentKeyRequirementException() {
        ResidentKeyRequirementUnsupportedResidentKeyRequirementException residentKeyRequirementUnsupportedResidentKeyRequirementException = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass2(residentKeyRequirementUnsupportedResidentKeyRequirementException)));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(QBankLandingViewModel.class), new AnonymousClass5(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass3(residentKeyRequirementUnsupportedResidentKeyRequirementException, renewEligibleWrite));
        this.write = new getUvm(this, null, 2, 0 == true ? 1 : 0);
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.ResidentKeyRequirement
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                ResidentKeyRequirementUnsupportedResidentKeyRequirementException.write(this.AudioAttributesCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.read = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    private HlsMediaChunk RatingCompat() {
        HlsMediaChunk hlsMediaChunk = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(hlsMediaChunk);
        return hlsMediaChunk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QBankLandingViewModel write() {
        return (QBankLandingViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(ResidentKeyRequirementUnsupportedResidentKeyRequirementException residentKeyRequirementUnsupportedResidentKeyRequirementException, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        residentKeyRequirementUnsupportedResidentKeyRequirementException.write().IconCompatParcelizer(AbstractC0252zzas.read.INSTANCE);
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ResidentKeyRequirementUnsupportedResidentKeyRequirementException$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(inflater, "");
        this.AudioAttributesCompatParcelizer = HlsMediaChunk.read(inflater, container);
        ConstraintLayout constraintLayout = RatingCompat().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, savedInstanceState);
        AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatSearchResultReceiver();
        AudioAttributesImplBaseParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.AudioAttributesCompatParcelizer = null;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        RatingCompat().write.setAdapter(this.write);
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<AbstractC0251zzar>> setupdatedstatus = ResidentKeyRequirementUnsupportedResidentKeyRequirementException.this.write().read();
                final ResidentKeyRequirementUnsupportedResidentKeyRequirementException residentKeyRequirementUnsupportedResidentKeyRequirementException = ResidentKeyRequirementUnsupportedResidentKeyRequirementException.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.ResidentKeyRequirementUnsupportedResidentKeyRequirementException.read.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((List) obj2);
                    }

                    private Object IconCompatParcelizer(List<? extends AbstractC0251zzar> list) {
                        residentKeyRequirementUnsupportedResidentKeyRequirementException.write.AudioAttributesCompatParcelizer(list);
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
            return ResidentKeyRequirementUnsupportedResidentKeyRequirementException.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        ResidentKeyRequirementUnsupportedResidentKeyRequirementException residentKeyRequirementUnsupportedResidentKeyRequirementException = this;
        setBitrateKbps.read(residentKeyRequirementUnsupportedResidentKeyRequirementException, new read(null));
        setBitrateKbps.read(residentKeyRequirementUnsupportedResidentKeyRequirementException, new write(null));
        setBitrateKbps.read(residentKeyRequirementUnsupportedResidentKeyRequirementException, new IconCompatParcelizer(null));
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
                setUpdatedStatus<Boolean> setupdatedstatusIconCompatParcelizer = ResidentKeyRequirementUnsupportedResidentKeyRequirementException.this.write().IconCompatParcelizer();
                final ResidentKeyRequirementUnsupportedResidentKeyRequirementException residentKeyRequirementUnsupportedResidentKeyRequirementException = ResidentKeyRequirementUnsupportedResidentKeyRequirementException.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.ResidentKeyRequirementUnsupportedResidentKeyRequirementException.write.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        residentKeyRequirementUnsupportedResidentKeyRequirementException.RemoteActionCompatParcelizer(z);
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
            return ResidentKeyRequirementUnsupportedResidentKeyRequirementException.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.ResidentKeyRequirementUnsupportedResidentKeyRequirementException$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.ResidentKeyRequirementUnsupportedResidentKeyRequirementException$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "read", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<AbstractC0255zzav> setupdatedstatusAudioAttributesCompatParcelizer = ResidentKeyRequirementUnsupportedResidentKeyRequirementException.this.write().AudioAttributesCompatParcelizer();
                final ResidentKeyRequirementUnsupportedResidentKeyRequirementException residentKeyRequirementUnsupportedResidentKeyRequirementException = ResidentKeyRequirementUnsupportedResidentKeyRequirementException.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.ResidentKeyRequirementUnsupportedResidentKeyRequirementException.IconCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((AbstractC0255zzav) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(AbstractC0255zzav abstractC0255zzav) {
                        if (abstractC0255zzav instanceof AbstractC0255zzav.read) {
                            residentKeyRequirementUnsupportedResidentKeyRequirementException.read(((AbstractC0255zzav.read) abstractC0255zzav).write());
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0255zzav, AbstractC0255zzav.AudioAttributesCompatParcelizer.INSTANCE)) {
                            residentKeyRequirementUnsupportedResidentKeyRequirementException.AudioAttributesCompatParcelizer();
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0255zzav, AbstractC0255zzav.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                            residentKeyRequirementUnsupportedResidentKeyRequirementException.AudioAttributesImplApi26Parcelizer();
                        } else if (abstractC0255zzav instanceof AbstractC0255zzav.AudioAttributesImplApi26Parcelizer) {
                            residentKeyRequirementUnsupportedResidentKeyRequirementException.AudioAttributesCompatParcelizer(((AbstractC0255zzav.AudioAttributesImplApi26Parcelizer) abstractC0255zzav).write());
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0255zzav, AbstractC0255zzav.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
                            residentKeyRequirementUnsupportedResidentKeyRequirementException.read();
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0255zzav, AbstractC0255zzav.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                            if (abstractC0255zzav instanceof AbstractC0255zzav.MediaMetadataCompat) {
                                residentKeyRequirementUnsupportedResidentKeyRequirementException.write(((AbstractC0255zzav.MediaMetadataCompat) abstractC0255zzav).RemoteActionCompatParcelizer());
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0255zzav, AbstractC0255zzav.MediaBrowserCompatItemReceiver.INSTANCE)) {
                                residentKeyRequirementUnsupportedResidentKeyRequirementException.MediaBrowserCompatCustomActionResultReceiver();
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0255zzav, AbstractC0255zzav.RemoteActionCompatParcelizer.INSTANCE)) {
                                residentKeyRequirementUnsupportedResidentKeyRequirementException.RemoteActionCompatParcelizer();
                            } else if (abstractC0255zzav instanceof AbstractC0255zzav.IconCompatParcelizer) {
                                AbstractC0255zzav.IconCompatParcelizer iconCompatParcelizer = (AbstractC0255zzav.IconCompatParcelizer) abstractC0255zzav;
                                residentKeyRequirementUnsupportedResidentKeyRequirementException.IconCompatParcelizer(iconCompatParcelizer.IconCompatParcelizer(), iconCompatParcelizer.RemoteActionCompatParcelizer());
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0255zzav, AbstractC0255zzav.write.INSTANCE)) {
                                residentKeyRequirementUnsupportedResidentKeyRequirementException.MediaBrowserCompatItemReceiver();
                            } else {
                                throw new RenewEligibleCreator();
                            }
                        }
                        residentKeyRequirementUnsupportedResidentKeyRequirementException.write().IconCompatParcelizer(AbstractC0252zzas.RemoteActionCompatParcelizer.INSTANCE);
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
            return ResidentKeyRequirementUnsupportedResidentKeyRequirementException.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.ResidentKeyRequirementUnsupportedResidentKeyRequirementException$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.ResidentKeyRequirementUnsupportedResidentKeyRequirementException$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
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

    /* JADX INFO: renamed from: o.ResidentKeyRequirementUnsupportedResidentKeyRequirementException$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(boolean z) {
        RecyclerView recyclerView = RatingCompat().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        recyclerView.setVisibility(!z ? 0 : 8);
        ProgressBar progressBar = RatingCompat().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        progressBar.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read() {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.read;
        zzel.Companion readVar = zzel.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(zzel.Companion.write(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String str, String str2) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.read;
        ActivityC0259zzaz.Companion remoteActionCompatParcelizer = ActivityC0259zzaz.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(ActivityC0259zzaz.Companion.RemoteActionCompatParcelizer(contextRequireContext, new isCompatible(0, str, str2, Integer.valueOf(RepeatModeUtil.IconCompatParcelizer.getWrite()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer() {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.read;
        onSingleTapUp.Companion writeVar = onSingleTapUp.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(onSingleTapUp.Companion.RemoteActionCompatParcelizer(contextRequireContext, new WorkAccountClient(0, null, null, null, null, false, null, null, false, 0, null, null, false, 0L, 0L, false, null, 131071, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(CustomModuleUCModel customModuleUCModel) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.read;
        AuthorizationRequestBuilder.Companion companion = AuthorizationRequestBuilder.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(AuthorizationRequestBuilder.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new WorkAccountClient(customModuleUCModel, false), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.read;
        zzpk.Companion writeVar = zzpk.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(zzpk.Companion.read(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer() {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.read;
        MediaCodecVideoRendererVideoFrameProcessorManagerExternalSyntheticLambda0.Companion readVar = MediaCodecVideoRendererVideoFrameProcessorManagerExternalSyntheticLambda0.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(MediaCodecVideoRendererVideoFrameProcessorManagerExternalSyntheticLambda0.Companion.read(contextRequireContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(AbstractC0251zzar.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        setTokenBinding.Companion readVar = setTokenBinding.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        this.read.read(setTokenBinding.Companion.IconCompatParcelizer(contextRequireContext, mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(), 2, "suggested_qb"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String string = getString(R.string.manifesto);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        startActivity(ResolvableApiException.Companion.read(contextRequireContext, new canceledPendingResult("https://marrow.com/how-to-use-qbank-document", string, null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.read;
        UpgradePlanActivity.Companion writeVar = UpgradePlanActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(UpgradePlanActivity.Companion.AudioAttributesCompatParcelizer(contextRequireContext, "qbank_screen"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(int i) {
        Toast.makeText(requireContext(), i, 1).show();
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            RecyclerView recyclerView = RatingCompat().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, recyclerView);
        }
    }

    @Override // o.getUvm.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(AbstractC0252zzas abstractC0252zzas) {
        toMagicModuleMetaRepoModel.write(abstractC0252zzas, "");
        write().IconCompatParcelizer(abstractC0252zzas);
    }
}
