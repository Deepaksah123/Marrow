package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import com.marrow.R;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow2.ui.kyc_device_level.landing.DeviceLevelKycViewModel;
import kotlin.BaseImplementation;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.createFloatList;
import kotlin.onConnected;
import kotlin.withFieldVisibility;
import kotlin.zaJ;
import kotlin.zar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J'\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0015\u001a\u00020\u001a8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0014\u0010\u0013\u001a\u00020\u001e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010 R\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006*\u00020\"0\"0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#"}, d2 = {"Lo/getException;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lo/zaI;", "write", "(Lo/zaI;)V", "Lcom/marrow2/ui/kyc_device_level/landing/DeviceLevelKycViewModel;", "RemoteActionCompatParcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/kyc_device_level/landing/DeviceLevelKycViewModel;", "Lo/FullSegmentEncryptionKeyCache1;", "Lo/FullSegmentEncryptionKeyCache1;", "()Lo/FullSegmentEncryptionKeyCache1;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getException extends DataHolderResult {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private FullSegmentEncryptionKeyCache1 RemoteActionCompatParcelizer;

    public getException() {
        getException getexception = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass2(getexception)));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(DeviceLevelKycViewModel.class), new AnonymousClass5(renewEligibleWrite), new AnonymousClass1(renewEligibleWrite), new AnonymousClass3(getexception, renewEligibleWrite));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.ApiKey
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                getException.IconCompatParcelizer(this.read, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.read = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceLevelKycViewModel write() {
        return (DeviceLevelKycViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private final FullSegmentEncryptionKeyCache1 RemoteActionCompatParcelizer() {
        FullSegmentEncryptionKeyCache1 fullSegmentEncryptionKeyCache1 = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(fullSegmentEncryptionKeyCache1);
        return fullSegmentEncryptionKeyCache1;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = FullSegmentEncryptionKeyCache1.RemoteActionCompatParcelizer(p0, p1);
        FrameLayout frameLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayoutIconCompatParcelizer, "");
        return frameLayoutIconCompatParcelizer;
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
        read();
        AudioAttributesImplApi21Parcelizer();
        AudioAttributesCompatParcelizer();
    }

    private final void read() {
        FrameLayout frameLayout = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        getHttpMethodString.read((View) frameLayout, true, true, true, true, 0, 48);
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        Button button = RemoteActionCompatParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(button, 800L, new getAnswerMap() { // from class: o.getSharedApiKey
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getException.RemoteActionCompatParcelizer(this.write, (View) obj);
            }
        });
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.BackgroundDetector
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getException.write(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getException getexception, View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        getexception.write().read(zaJ.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getException getexception) {
        createFloatList.Companion companion = createFloatList.INSTANCE;
        Context contextRequireContext = getexception.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        Intent intentRemoteActionCompatParcelizer = createFloatList.Companion.RemoteActionCompatParcelizer(contextRequireContext);
        intentRemoteActionCompatParcelizer.setFlags(268468224);
        getexception.startActivity(intentRemoteActionCompatParcelizer);
        getexception.requireActivity().finish();
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<DataSourceBitmapLoaderExternalSyntheticLambda0<zaI>> isdark = getException.this.write().read();
                final getException getexception = getException.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (isdark.write(new getValidationToken() { // from class: o.getException.AudioAttributesCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object AudioAttributesCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<zaI> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            getexception.write((zaI) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer());
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
            return getException.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        getException getexception = this;
        setBitrateKbps.RemoteActionCompatParcelizer(getexception, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(getexception, new read(null));
        setBitrateKbps.read(getexception, new write(null));
    }

    /* JADX INFO: renamed from: o.getException$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "AudioAttributesCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<zaJ> isdarkAudioAttributesCompatParcelizer = getException.this.write().AudioAttributesCompatParcelizer();
                final getException getexception = getException.this;
                this.read = 1;
                if (isdarkAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.getException.read.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((zaJ) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(zaJ zaj) {
                        if (zaj instanceof zaJ.read) {
                            Toast.makeText(getexception.requireContext(), ((zaJ.read) zaj).write(), 1).show();
                            getexception.write().read(zaJ.MediaBrowserCompatItemReceiver.INSTANCE);
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
            return getException.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getException$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "read", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$read.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$read = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.getException$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.getException$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.getException$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
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
                setUpdatedStatus<zar> setupdatedstatusIconCompatParcelizer = getException.this.write().IconCompatParcelizer();
                final getException getexception = getException.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.getException.write.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((zar) obj2);
                    }

                    private Object write(zar zarVar) {
                        if (zarVar instanceof zar.RemoteActionCompatParcelizer) {
                            Toast.makeText(getexception.requireContext(), ((zar.RemoteActionCompatParcelizer) zarVar).IconCompatParcelizer(), 0).show();
                            getexception.write().read(zaJ.MediaBrowserCompatItemReceiver.INSTANCE);
                        } else if (!(zarVar instanceof zar.read)) {
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
            return getException.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getException getexception, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        Intent read2 = activityResult.getRead();
        String stringExtra = read2 != null ? read2.getStringExtra("DkycWebFragmentResultKey") : null;
        if (stringExtra != null) {
            getexception.write().read(new zaJ.RemoteActionCompatParcelizer(stringExtra));
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -1822838969:
                    if (!stringExtra.equals("auto_approved")) {
                    }
                    getexception.write().read(new zaJ.AudioAttributesImplApi21Parcelizer("process_completed"));
                    getexception.requireActivity().finish();
                    BaseImplementation.Companion companion = BaseImplementation.INSTANCE;
                    Context contextRequireContext = getexception.requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                    getexception.startActivity(BaseImplementation.Companion.write(contextRequireContext));
                    break;
                case -1367594983:
                    if (!stringExtra.equals("other_error")) {
                    }
                    DeviceLevelKycViewModel deviceLevelKycViewModelWrite = getexception.write();
                    String string = getexception.getString(R.string.something_went_wrong_relogin_later);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    deviceLevelKycViewModelWrite.read(new zaJ.read(string));
                    getexception.write().read(zaJ.IconCompatParcelizer.INSTANCE);
                    break;
                case 96784904:
                    if (!stringExtra.equals("error")) {
                    }
                    DeviceLevelKycViewModel deviceLevelKycViewModelWrite2 = getexception.write();
                    String string2 = getexception.getString(R.string.something_went_wrong_relogin_later);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                    deviceLevelKycViewModelWrite2.read(new zaJ.read(string2));
                    getexception.write().read(zaJ.IconCompatParcelizer.INSTANCE);
                    break;
                case 1814736698:
                    if (!stringExtra.equals("needs_review")) {
                    }
                    getexception.write().read(new zaJ.AudioAttributesImplApi21Parcelizer("process_completed"));
                    getexception.requireActivity().finish();
                    BaseImplementation.Companion companion2 = BaseImplementation.INSTANCE;
                    Context contextRequireContext2 = getexception.requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                    getexception.startActivity(BaseImplementation.Companion.write(contextRequireContext2));
                    break;
                case 1855079614:
                    if (!stringExtra.equals("auto_declined")) {
                    }
                    getexception.write().read(new zaJ.AudioAttributesImplApi21Parcelizer("process_completed"));
                    getexception.requireActivity().finish();
                    BaseImplementation.Companion companion22 = BaseImplementation.INSTANCE;
                    Context contextRequireContext22 = getexception.requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext22, "");
                    getexception.startActivity(BaseImplementation.Companion.write(contextRequireContext22));
                    break;
                case 2043678173:
                    if (stringExtra.equals("user_cancelled")) {
                        getexception.write().read(zaJ.IconCompatParcelizer.INSTANCE);
                    }
                    break;
            }
        }
    }

    private final void IconCompatParcelizer(String p0, String p1, String p2) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.read;
        onConnected.Companion companion = onConnected.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(onConnected.Companion.write(contextRequireContext, new zaI(p0, p1, p2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(zaI p0) {
        String str;
        String audioAttributesCompatParcelizer = p0.getAudioAttributesCompatParcelizer();
        String write2 = p0.getWrite();
        if (write2.length() == 0) {
            write2 = "digi_ocr_dbCheck_FM";
        }
        String str2 = write2;
        String iconCompatParcelizer = p0.getIconCompatParcelizer();
        if (audioAttributesCompatParcelizer.length() > 0 && (str = iconCompatParcelizer) != null && str.length() != 0) {
            write().read(new zaJ.AudioAttributesImplApi21Parcelizer("kyc_initiated"));
            IconCompatParcelizer(str2, audioAttributesCompatParcelizer, iconCompatParcelizer);
        } else {
            DeviceLevelKycViewModel deviceLevelKycViewModelWrite = write();
            String string = getString(R.string.something_went_wrong_relogin_later);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            deviceLevelKycViewModelWrite.read(new zaJ.read(string));
        }
    }

    /* JADX INFO: renamed from: o.getException$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getException$IconCompatParcelizer;", "", "<init>", "()V", "Lo/zaB;", "p0", "Lo/getException;", "write", "(Lo/zaB;)Lo/getException;", "Landroid/os/Bundle;", "IconCompatParcelizer", "(Lo/zaB;)Landroid/os/Bundle;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getException write(zaB p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            getException getexception = new getException();
            Companion companion = getException.INSTANCE;
            getexception.setArguments(IconCompatParcelizer(p0));
            return getexception;
        }

        private static Bundle IconCompatParcelizer(zaB p0) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("initiate_kyc", p0.getInitiateKyc());
            bundle.putString(LoggedUserResponse.KEY_REFRESH_TOKEN, p0.getRefreshToken());
            bundle.putString(LoggedUserResponse.KEY_TOKEN, p0.getToken());
            bundle.putString("transaction_id", p0.getTransactionId());
            bundle.putString("user_device_kyc_status", p0.getKycStatus());
            bundle.putString("workflow_id", p0.getWorkFlowId());
            bundle.putString("dkyc_token", p0.getDkycToken());
            bundle.putString("_id", p0.getUserId());
            bundle.putInt("current_allowed_devices_count", p0.getDeviceCount());
            return bundle;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
