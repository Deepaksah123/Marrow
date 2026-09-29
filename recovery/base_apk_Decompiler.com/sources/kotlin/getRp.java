package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.qbank.introduction.QbankIntroductionViewModel;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.PublicKeyCredentialType;
import kotlin.StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.getAutofillClient;
import kotlin.isTransferHdr;
import kotlin.setAppId;
import kotlin.setForceApplySystemWindowInsetTop;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0015\u001a\u00020\u001b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001eR\u001b\u0010\u0011\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0015\u0010!R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006*\u00020#0#0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$"}, d2 = {"Lo/getRp;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "", "read", "(Ljava/lang/String;Ljava/lang/String;)V", "Lo/getIcon;", "write", "(Lo/getIcon;)V", "AudioAttributesImplApi26Parcelizer", "Lo/feedDataToExtractor;", "IconCompatParcelizer", "Lo/feedDataToExtractor;", "()Lo/feedDataToExtractor;", "Lcom/marrow2/ui/qbank/introduction/QbankIntroductionViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/qbank/introduction/QbankIntroductionViewModel;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getRp extends getExcludeList {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private feedDataToExtractor RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    public getRp() {
        getRp getrp = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass2(getrp)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(QbankIntroductionViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass5(getrp, renewEligibleWrite));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.setAuthenticatorSelection
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                getRp.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.write = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final feedDataToExtractor write() {
        feedDataToExtractor feeddatatoextractor = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(feeddatatoextractor);
        return feeddatatoextractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QbankIntroductionViewModel read() {
        return (QbankIntroductionViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(getRp getrp, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        getrp.read().AudioAttributesCompatParcelizer(PublicKeyCredentialType.RemoteActionCompatParcelizer.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = feedDataToExtractor.AudioAttributesCompatParcelizer(p0, p1);
        LinearLayout linearLayoutIconCompatParcelizer = write().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.RemoteActionCompatParcelizer = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        RemoteActionCompatParcelizer();
        AudioAttributesImplApi26Parcelizer();
    }

    private final void AudioAttributesCompatParcelizer() {
        MaterialToolbar materialToolbar = write().handleMediaPlayPauseIfPendingOnHandler;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        ScrollView scrollView = write().onAddQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, false, true, true, true, 0, 49);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        write().handleMediaPlayPauseIfPendingOnHandler.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.setAuthenticationExtensions
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getRp.write(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: renamed from: o.getRp$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getRp getrp) {
        getrp.requireActivity().onBackPressed();
    }

    /* JADX INFO: renamed from: o.getRp$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.getRp$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<getIcon>> setupdatedstatus = getRp.this.read().read();
                final getRp getrp = getRp.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.getRp.read.1
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object IconCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<getIcon> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            LinearLayout linearLayout = getrp.write().MediaMetadataCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
                            getrp.write((getIcon) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer());
                        } else {
                            LinearLayout linearLayout2 = getrp.write().MediaMetadataCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
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

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getRp.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getRp$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
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
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    private final void RemoteActionCompatParcelizer() {
        getRp getrp = this;
        setBitrateKbps.read(getrp, new read(null));
        setBitrateKbps.read(getrp, new IconCompatParcelizer(null));
        setBitrateKbps.read(getrp, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(getrp, new write(null));
    }

    /* JADX INFO: renamed from: o.getRp$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
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
        public AnonymousClass5(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<PublicKeyCredentialType> setupdatedstatusIconCompatParcelizer = getRp.this.read().IconCompatParcelizer();
                final getRp getrp = getRp.this;
                this.read = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.getRp.IconCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((PublicKeyCredentialType) obj2);
                    }

                    private Object read(PublicKeyCredentialType publicKeyCredentialType) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(publicKeyCredentialType, PublicKeyCredentialType.IconCompatParcelizer.INSTANCE)) {
                            Toast.makeText(getrp.requireContext(), R.string.something_went_wrong, 1).show();
                            getrp.requireActivity().finish();
                        } else if (publicKeyCredentialType instanceof PublicKeyCredentialType.AudioAttributesCompatParcelizer) {
                            PublicKeyCredentialType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (PublicKeyCredentialType.AudioAttributesCompatParcelizer) publicKeyCredentialType;
                            getrp.read(audioAttributesCompatParcelizer.IconCompatParcelizer(), audioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
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
            return getRp.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi21Parcelizer = getRp.this.read().AudioAttributesImplApi21Parcelizer();
                final getRp getrp = getRp.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.getRp.RemoteActionCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object AudioAttributesCompatParcelizer(boolean z) {
                        if (z) {
                            ProgressBar progressBar = getrp.write().RatingCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
                        } else {
                            ProgressBar progressBar2 = getrp.write().RatingCompat;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar2);
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
            return getRp.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<String> setupdatedstatusAudioAttributesCompatParcelizer = getRp.this.read().AudioAttributesCompatParcelizer();
                final getRp getrp = getRp.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.getRp.write.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((String) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(String str) {
                        if (str.length() > 0) {
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(getrp, str, 0);
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
            return getRp.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(final String p0, final String p1) {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(read().MediaBrowserCompatItemReceiver() ? R.string.text_pro_lesson_dialog_ar_lesson_msg : R.string.text_pro_lesson_dialog_lesson_msg);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.view_plans);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.go_back);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, string, string2, string3, 0, null, false, false, null, 497);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.setExcludeList
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getRp.write(p0, p1, this);
            }
        }, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, String str2, getRp getrp) {
        StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.RemoteActionCompatParcelizer remoteActionCompatParcelizer = StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.RemoteActionCompatParcelizer.INSTANCE;
        StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5.RemoteActionCompatParcelizer.read(str, str2);
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        Context contextRequireContext = getrp.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String lowerCase = "PRO_QBANK_ACCESSED".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        getrp.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext, "Pro Subscription Dialog", lowerCase));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(final getIcon p0) {
        String string;
        String string2;
        feedDataToExtractor feeddatatoextractorWrite = write();
        feeddatatoextractorWrite.handleMediaPlayPauseIfPendingOnHandler.setTitle(p0.getRemoteActionCompatParcelizer());
        feeddatatoextractorWrite.onSeekTo.setText(p0.getRead());
        feeddatatoextractorWrite.onPlayFromMediaId.setText(p0.getRemoteActionCompatParcelizer());
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String quantityString = getResources().getQuantityString(R.plurals.mcq_count, p0.getMediaBrowserCompatCustomActionResultReceiver());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(quantityString, "");
        String str = String.format(quantityString, Arrays.copyOf(new Object[]{String.valueOf(p0.getMediaBrowserCompatCustomActionResultReceiver())}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        if (!p0.getOnCommand()) {
            TextView textView = feeddatatoextractorWrite.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView);
            TextView textView2 = feeddatatoextractorWrite.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            TextView textView3 = feeddatatoextractorWrite.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            TextView textView4 = feeddatatoextractorWrite.onMediaButtonEvent;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
            MaterialCardView materialCardView = feeddatatoextractorWrite.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
            LinearLayout linearLayout = feeddatatoextractorWrite.onRewind;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.read(textView2, textView3, textView4, materialCardView, linearLayout);
            return;
        }
        TextView textView5 = feeddatatoextractorWrite.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView5);
        if (!p0.getHandleMediaPlayPauseIfPendingOnHandler()) {
            LinearLayout linearLayout2 = feeddatatoextractorWrite.onRewind;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
            MaterialCardView materialCardView2 = feeddatatoextractorWrite.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(materialCardView2);
            feeddatatoextractorWrite.MediaBrowserCompatSearchResultReceiver.setText(str);
            feeddatatoextractorWrite.MediaBrowserCompatMediaItem.setOnClickListener(new View.OnClickListener() { // from class: o.setAttestationConveyancePreference
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getRp.read(this.write, p0);
                }
            });
            return;
        }
        MaterialCardView materialCardView3 = feeddatatoextractorWrite.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView3, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(materialCardView3);
        LinearLayout linearLayout3 = feeddatatoextractorWrite.onRewind;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout3);
        int audioAttributesImplApi26Parcelizer = p0.getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer == 0 || audioAttributesImplApi26Parcelizer == 1) {
            boolean z = p0.getAudioAttributesImplApi21Parcelizer() > 0;
            if (z) {
                TextView textView6 = feeddatatoextractorWrite.onMediaButtonEvent;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
                String string3 = getString(R.string.lesson_completion_info_in_progress);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                String str2 = String.format(string3, Arrays.copyOf(new Object[]{parseEac3SupplementalProperties.write(p0.getAudioAttributesImplApi21Parcelizer(), "dd MMM")}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                textView6.setText(str2);
                TextView textView7 = feeddatatoextractorWrite.onMediaButtonEvent;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView7, "");
                bytesRead.write(textView7, R.drawable.revamp_ic_pause_circle, -1, -1, -1);
            }
            TextView textView8 = feeddatatoextractorWrite.onMediaButtonEvent;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView8, "");
            textView8.setVisibility(z ? 0 : 8);
        } else if (audioAttributesImplApi26Parcelizer == 2) {
            TextView textView9 = feeddatatoextractorWrite.onMediaButtonEvent;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
            String string4 = getString(R.string.lesson_completion_info_completed);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
            String str3 = String.format(string4, Arrays.copyOf(new Object[]{p0.getAudioAttributesImplBaseParcelizer() != 0 ? "on ".concat(String.valueOf(parseEac3SupplementalProperties.write(p0.getAudioAttributesImplBaseParcelizer(), "dd MMM"))) : ""}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
            textView9.setText(str3);
            TextView textView10 = feeddatatoextractorWrite.onMediaButtonEvent;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView10, "");
            bytesRead.write(textView10, R.drawable.revamp_ic_check_circle, -1, -1, -1);
        }
        feeddatatoextractorWrite.onFastForward.setText(str);
        TextView textView11 = feeddatatoextractorWrite.onPause;
        if (p0.getMediaBrowserCompatItemReceiver() == p0.getMediaBrowserCompatCustomActionResultReceiver()) {
            string = getString(R.string.all_completed);
        } else if (p0.getMediaBrowserCompatItemReceiver() < p0.getMediaBrowserCompatCustomActionResultReceiver() && p0.getAudioAttributesImplApi26Parcelizer() == 1) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
            String string5 = getString(R.string.x_completed);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
            String str4 = String.format(string5, Arrays.copyOf(new Object[]{Integer.valueOf(p0.getMediaBrowserCompatItemReceiver())}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
            string = str4;
        } else {
            string = getString(R.string.solve_now);
        }
        textView11.setText(string);
        final boolean z2 = p0.getAudioAttributesImplApi26Parcelizer() == 2 && p0.getMediaBrowserCompatItemReceiver() == p0.getMediaBrowserCompatCustomActionResultReceiver();
        Button button = feeddatatoextractorWrite.write;
        if (z2) {
            string2 = getString(R.string.btn_review_module);
        } else {
            string2 = getString(R.string.btn_solve_module);
        }
        button.setText(string2);
        feeddatatoextractorWrite.write.setOnClickListener(new View.OnClickListener() { // from class: o.PublicKeyCredentialCreationOptionsBuilder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getRp.RemoteActionCompatParcelizer(p0, z2, this);
            }
        });
        TextView textView12 = feeddatatoextractorWrite.onCustomAction;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
        String quantityString2 = getResources().getQuantityString(R.plurals.qbank_plural_bookmark_count, p0.getMediaMetadataCompat());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(quantityString2, "");
        String str5 = String.format(quantityString2, Arrays.copyOf(new Object[]{Integer.valueOf(p0.getMediaMetadataCompat())}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        textView12.setText(str5);
        feeddatatoextractorWrite.onCustomAction.setOnClickListener(new View.OnClickListener() { // from class: o.setRequestId
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getRp.write(this.write, p0);
            }
        });
        if (p0.getRatingCompat() > 0) {
            feeddatatoextractorWrite.RemoteActionCompatParcelizer.setText(getString(R.string.f_mcq_added, Integer.valueOf(p0.getRatingCompat())));
            TextView textView13 = feeddatatoextractorWrite.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView13, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView13);
            TextView textView14 = feeddatatoextractorWrite.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView14, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView14);
            if (p0.getAudioAttributesImplApi26Parcelizer() != 0) {
                TextView textView15 = feeddatatoextractorWrite.onPause;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel6 = toMagicModuleStatusUcModel.INSTANCE;
                String string6 = getString(R.string.x_completed);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string6, "");
                String str6 = String.format(string6, Arrays.copyOf(new Object[]{Integer.valueOf(p0.getMediaBrowserCompatItemReceiver())}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
                textView15.setText(str6);
            }
        } else {
            TextView textView16 = feeddatatoextractorWrite.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView16, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView16);
            TextView textView17 = feeddatatoextractorWrite.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView17, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView17);
        }
        if (p0.getMediaDescriptionCompat() > 0 && p0.getAudioAttributesImplApi26Parcelizer() == 2) {
            feeddatatoextractorWrite.AudioAttributesImplApi26Parcelizer.setText(getString(R.string.f_mcq_updated, Integer.valueOf(p0.getMediaDescriptionCompat())));
            TextView textView18 = feeddatatoextractorWrite.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView18, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView18);
            TextView textView19 = feeddatatoextractorWrite.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView19, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView19);
            TextView textView20 = feeddatatoextractorWrite.onPause;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel7 = toMagicModuleStatusUcModel.INSTANCE;
            String string7 = getString(R.string.x_completed);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string7, "");
            String str7 = String.format(string7, Arrays.copyOf(new Object[]{Integer.valueOf(p0.getMediaBrowserCompatItemReceiver())}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
            textView20.setText(str7);
        } else {
            TextView textView21 = feeddatatoextractorWrite.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView21, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView21);
            TextView textView22 = feeddatatoextractorWrite.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView22, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView22);
        }
        LinearLayout linearLayout4 = feeddatatoextractorWrite.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout4, "");
        linearLayout4.setVisibility(p0.AudioAttributesImplApi26Parcelizer().isEmpty() ? 8 : 0);
        feeddatatoextractorWrite.MediaBrowserCompatCustomActionResultReceiver.removeAllViews();
        int i = 0;
        for (Object obj : IntermediateLoginResponseBody.write((Iterable) p0.AudioAttributesImplApi26Parcelizer(), 50)) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            final PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException = (PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException) obj;
            View viewInflate = getLayoutInflater().inflate(R.layout.view_lesson_schema_group, (ViewGroup) null);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
            TextView textView23 = (TextView) viewInflate.findViewById(R.id.tv_hyt);
            TextView textView24 = (TextView) viewInflate.findViewById(R.id.tv_hyt_count);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.schema_forward_arrow);
            textView23.setText(publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException.AudioAttributesCompatParcelizer());
            if (p0.getAudioAttributesImplApi26Parcelizer() == 2) {
                toMagicModuleMetaRepoModel.write(textView24);
                bytesRead.AudioAttributesImplApi21Parcelizer(textView24);
                toMagicModuleMetaRepoModel.write(imageView);
                bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel8 = toMagicModuleStatusUcModel.INSTANCE;
                String str8 = String.format("%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException.write()), Integer.valueOf(publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException.read())}, 2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str8, "");
                textView24.setText(str8);
            }
            if (z2) {
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: o.setTimeoutSeconds
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        getRp.read(this.read, p0, publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException);
                    }
                });
            }
            feeddatatoextractorWrite.MediaBrowserCompatCustomActionResultReceiver.addView(viewInflate);
            i++;
        }
        PublicKeyCredentialRpEntity mediaBrowserCompatMediaItem = p0.getMediaBrowserCompatMediaItem();
        if (mediaBrowserCompatMediaItem != null) {
            if (p0.getOnCustomAction()) {
                if (mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer() > -1.0f) {
                    feeddatatoextractorWrite.onPlayFromUri.setText(getString(R.string.label_lesson_score));
                    TextView textView25 = feeddatatoextractorWrite.onPrepareFromMediaId;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView25, "");
                    bytesRead.AudioAttributesImplApi21Parcelizer(textView25);
                    TextView textView26 = feeddatatoextractorWrite.onPrepare;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView26, "");
                    bytesRead.AudioAttributesImplApi21Parcelizer(textView26);
                    TextView textView27 = feeddatatoextractorWrite.onPlayFromSearch;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView27, "");
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView27);
                    TextView textView28 = feeddatatoextractorWrite.onPrepareFromMediaId;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView28, "");
                    ProgressBar progressBar = feeddatatoextractorWrite.onCommand;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                    createEquirectangular.RemoteActionCompatParcelizer(textView28, progressBar, mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer());
                    TextView textView29 = feeddatatoextractorWrite.onPrepareFromMediaId;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView29, "");
                    ProgressBar progressBar2 = feeddatatoextractorWrite.onCommand;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                    createEquirectangular.RemoteActionCompatParcelizer(textView29, progressBar2, mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer());
                    feeddatatoextractorWrite.AudioAttributesImplApi21Parcelizer.setImageDrawable(_isNaN.getDrawable(requireContext(), R.drawable.percentile_curve_intro));
                } else {
                    TextView textView30 = feeddatatoextractorWrite.onPlayFromSearch;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView30, "");
                    bytesRead.AudioAttributesImplApi21Parcelizer(textView30);
                    feeddatatoextractorWrite.onCommand.setProgress(0);
                    feeddatatoextractorWrite.onPrepareFromMediaId.setText(getString(R.string.label_performance_lesson_review_NA));
                    feeddatatoextractorWrite.onPlayFromUri.setTextColor(_isNaN.getColor(requireContext(), R.color.steel_grey));
                    feeddatatoextractorWrite.onPrepare.setTextColor(_isNaN.getColor(requireContext(), R.color.steel_grey));
                    feeddatatoextractorWrite.AudioAttributesImplApi21Parcelizer.setImageDrawable(_isNaN.getDrawable(requireContext(), R.drawable.percentile_curve_na_intro));
                    TextView textView31 = feeddatatoextractorWrite.onPrepareFromMediaId;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView31, "");
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView31);
                    TextView textView32 = feeddatatoextractorWrite.onPrepare;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView32, "");
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView32);
                }
                TextView textView33 = feeddatatoextractorWrite.onPrepareFromSearch;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel9 = toMagicModuleStatusUcModel.INSTANCE;
                String string8 = getString(R.string.f_score_screen_number_of_solved_mcqs);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string8, "");
                String str9 = String.format(string8, Arrays.copyOf(new Object[]{Integer.valueOf(mediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver())}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str9, "");
                textView33.setText(str9);
                TextView textView34 = feeddatatoextractorWrite.onPlay;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel10 = toMagicModuleStatusUcModel.INSTANCE;
                String string9 = getString(R.string.qbank_f_score_screen_correct_count);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string9, "");
                String str10 = String.format(string9, Arrays.copyOf(new Object[]{Integer.valueOf(mediaBrowserCompatMediaItem.IconCompatParcelizer()), Double.valueOf(mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer())}, 2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str10, "");
                textView34.setText(str10);
                TextView textView35 = feeddatatoextractorWrite.onRemoveQueueItemAt;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel11 = toMagicModuleStatusUcModel.INSTANCE;
                String string10 = getString(R.string.qbank_f_score_screen_wrong_count);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string10, "");
                String str11 = String.format(string10, Arrays.copyOf(new Object[]{Integer.valueOf(mediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer()), Double.valueOf(mediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer())}, 2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str11, "");
                textView35.setText(str11);
                TextView textView36 = feeddatatoextractorWrite.onRemoveQueueItem;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel12 = toMagicModuleStatusUcModel.INSTANCE;
                String string11 = getString(R.string.qbank_f_score_screen_skipped_count);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string11, "");
                String str12 = String.format(string11, Arrays.copyOf(new Object[]{Integer.valueOf(mediaBrowserCompatMediaItem.write()), Double.valueOf(mediaBrowserCompatMediaItem.read())}, 2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str12, "");
                textView36.setText(str12);
                feeddatatoextractorWrite.MediaDescriptionCompat.setProgress(getOnline.read(mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer()));
                feeddatatoextractorWrite.MediaDescriptionCompat.setSecondaryProgress(getOnline.read(mediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer() + mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer()));
                LinearLayout linearLayout5 = feeddatatoextractorWrite.AudioAttributesImplBaseParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout5, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout5);
                return;
            }
            LinearLayout linearLayout6 = feeddatatoextractorWrite.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout6, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout6);
            return;
        }
        LinearLayout linearLayout7 = feeddatatoextractorWrite.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout7, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(getRp getrp, getIcon geticon) {
        getrp.read().AudioAttributesCompatParcelizer(new PublicKeyCredentialType.AudioAttributesCompatParcelizer(geticon.getWrite(), geticon.getRemoteActionCompatParcelizer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(getIcon geticon, boolean z, getRp getrp) {
        if (geticon.getIconCompatParcelizer().length() <= 0) {
            getrp.read().AudioAttributesCompatParcelizer(PublicKeyCredentialType.IconCompatParcelizer.INSTANCE);
            return;
        }
        if (z) {
            setForceApplySystemWindowInsetTop.Companion companion = setForceApplySystemWindowInsetTop.INSTANCE;
            Context contextRequireContext = getrp.requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            Intent intentAudioAttributesCompatParcelizer = setForceApplySystemWindowInsetTop.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new setStaticLayoutBuilderConfigurer(geticon.getIconCompatParcelizer(), false, true, false, null, null, null, 122, null));
            getrp.read().AudioAttributesCompatParcelizer(PublicKeyCredentialType.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
            getrp.write.read(intentAudioAttributesCompatParcelizer);
            return;
        }
        setAppId.Companion companion2 = setAppId.INSTANCE;
        Context contextRequireContext2 = getrp.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        Intent intentWrite = setAppId.Companion.write(contextRequireContext2, geticon.getIconCompatParcelizer(), geticon.getRemoteActionCompatParcelizer(), getrp.read().MediaBrowserCompatItemReceiver() ? readBlockToCache.write : readBlockToCache.AudioAttributesImplBaseParcelizer, 0, null, 48);
        getrp.read().AudioAttributesCompatParcelizer(PublicKeyCredentialType.AudioAttributesImplApi26Parcelizer.INSTANCE);
        Intent intent = new Intent();
        intent.putExtra("is_mcq_started", true);
        getrp.requireActivity().setResult(-1, intent);
        getrp.write.read(intentWrite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getRp getrp, getIcon geticon) {
        getrp.read().AudioAttributesCompatParcelizer(PublicKeyCredentialType.write.INSTANCE);
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = getrp.write;
        isTransferHdr.Companion companion = isTransferHdr.INSTANCE;
        Context contextRequireContext = getrp.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(isTransferHdr.Companion.IconCompatParcelizer(contextRequireContext, new isoColorPrimariesToColorSpace(geticon.getIconCompatParcelizer(), null, isBufferLate.RemoteActionCompatParcelizer, geticon.getRemoteActionCompatParcelizer(), 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(getRp getrp, getIcon geticon, PublicKeyCredentialTypeUnsupportedPublicKeyCredTypeException publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException) {
        setForceApplySystemWindowInsetTop.Companion companion = setForceApplySystemWindowInsetTop.INSTANCE;
        Context contextRequireContext = getrp.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        getrp.write.read(setForceApplySystemWindowInsetTop.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new setStaticLayoutBuilderConfigurer(geticon.getIconCompatParcelizer(), false, true, false, getMediaMimeType.IconCompatParcelizer, null, publicKeyCredentialTypeUnsupportedPublicKeyCredTypeException.IconCompatParcelizer(), 42, null)));
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            ScrollView scrollView = write().onAddQueueItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, scrollView);
        }
    }

    /* JADX INFO: renamed from: o.getRp$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getRp$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "Lo/getRp;", "write", "(Ljava/lang/String;ILjava/lang/String;)Lo/getRp;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getRp write(String p0, int p1, String p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            getRp getrp = new getRp();
            Bundle bundle = new Bundle();
            bundle.putString("lesson_id", p0);
            bundle.putInt("source", p1);
            bundle.putString("analytics_source", p2);
            getrp.setArguments(bundle);
            return getrp;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
