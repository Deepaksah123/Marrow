package kotlin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.marrow.R;
import com.marrow2.ui.apiblockaction.ApiBlockActionFragmentViewModel;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.sum;
import kotlin.tableExists;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0003R\u001b\u0010\u0011\u001a\u00020\u00168CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\u001a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/sneakyThrow;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer", "write", "Lo/splitCodecs;", "IconCompatParcelizer", "(Lo/splitCodecs;)V", "onDestroyView", "Lcom/marrow2/ui/apiblockaction/ApiBlockActionFragmentViewModel;", "Lo/RenewEligible;", "read", "()Lcom/marrow2/ui/apiblockaction/ApiBlockActionFragmentViewModel;", "Lo/BundledHlsMediaChunkExtractor;", "Lo/BundledHlsMediaChunkExtractor;", "RemoteActionCompatParcelizer", "()Lo/BundledHlsMediaChunkExtractor;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class sneakyThrow extends subtractWithOverflowDefault {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private BundledHlsMediaChunkExtractor read;
    private final RenewEligible write;

    public sneakyThrow() {
        sneakyThrow sneakythrow = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass2(new AnonymousClass1(sneakythrow)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(ApiBlockActionFragmentViewModel.class), new AnonymousClass4(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass3(sneakythrow, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiBlockActionFragmentViewModel read() {
        return (ApiBlockActionFragmentViewModel) this.write.RemoteActionCompatParcelizer();
    }

    private final BundledHlsMediaChunkExtractor RemoteActionCompatParcelizer() {
        BundledHlsMediaChunkExtractor bundledHlsMediaChunkExtractor = this.read;
        toMagicModuleMetaRepoModel.write(bundledHlsMediaChunkExtractor);
        return bundledHlsMediaChunkExtractor;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read = BundledHlsMediaChunkExtractor.AudioAttributesCompatParcelizer(p0, p1);
        ConstraintLayout constraintLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
        AudioAttributesCompatParcelizer();
    }

    private final void AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer().write.setOnClickListener(new View.OnClickListener() { // from class: o.sneakyThrowInternal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sneakyThrow.read(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(sneakyThrow sneakythrow) {
        sneakythrow.read().IconCompatParcelizer(sum.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.sneakyThrow$IconCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<splitCodecs, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ Object IconCompatParcelizer;
            private /* synthetic */ sneakyThrow write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                splitCodecs splitcodecs = (splitCodecs) this.IconCompatParcelizer;
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write.IconCompatParcelizer(splitcodecs);
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(sneakyThrow sneakythrow, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.write = sneakythrow;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.write, sampleVideos);
                anonymousClass3.IconCompatParcelizer = obj;
                return anonymousClass3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(splitCodecs splitcodecs, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(splitcodecs, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (VerifyNewNumberRequest.AudioAttributesCompatParcelizer(sneakyThrow.this.read().IconCompatParcelizer(), new AnonymousClass3(sneakyThrow.this, null), this) == objIconCompatParcelizer) {
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return sneakyThrow.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void write() {
        sneakyThrow sneakythrow = this;
        setBitrateKbps.read(sneakythrow, new IconCompatParcelizer(null));
        setBitrateKbps.read(sneakythrow, new AudioAttributesCompatParcelizer(null));
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<tableExists> newNumberOtpResendRequestAudioAttributesCompatParcelizer = sneakyThrow.this.read().AudioAttributesCompatParcelizer();
                final sneakyThrow sneakythrow = sneakyThrow.this;
                this.IconCompatParcelizer = 1;
                if (newNumberOtpResendRequestAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.sneakyThrow.AudioAttributesCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((tableExists) obj2);
                    }

                    private Object IconCompatParcelizer(tableExists tableexists) {
                        if (!(tableexists instanceof tableExists.write)) {
                            throw new RenewEligibleCreator();
                        }
                        dispatchTouchEvent.AudioAttributesCompatParcelizer(sneakythrow.requireActivity());
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return sneakyThrow.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(splitCodecs p0) {
        String str;
        TextView textView = RemoteActionCompatParcelizer().IconCompatParcelizer;
        String remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer != null) {
            str = remoteActionCompatParcelizer;
        } else {
            String string = getString(R.string.app_version_not_supported_update_app);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            str = string;
        }
        textView.setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.read = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.sneakyThrow$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/sneakyThrow$read;", "", "<init>", "()V", "Lo/scaleLargeTimestamp;", "p0", "Lo/sneakyThrow;", "IconCompatParcelizer", "(Lo/scaleLargeTimestamp;)Lo/sneakyThrow;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static sneakyThrow IconCompatParcelizer(scaleLargeTimestamp p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            sneakyThrow sneakythrow = new sneakyThrow();
            sneakythrow.setArguments(p0.AudioAttributesCompatParcelizer());
            return sneakythrow;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o.sneakyThrow$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.sneakyThrow$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "read", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.sneakyThrow$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.sneakyThrow$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.sneakyThrow$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$read = renewEligible;
        }
    }
}
