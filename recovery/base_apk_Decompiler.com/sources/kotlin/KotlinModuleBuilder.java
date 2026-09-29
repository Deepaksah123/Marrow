package kotlin;

import kotlin.KotlinModuleCompanion;
import kotlin.Metadata;
import kotlin.isMethodParameterRequired;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/KotlinModuleBuilder;", "", "T", "Lo/TopUserCompanion;", "p0", "Lo/accessisKotlinConstructorWithParameters;", "p1", "Lo/isMethodParameterRequired;", "p2", "<init>", "(Lo/TopUserCompanion;Lo/accessisKotlinConstructorWithParameters;Lo/isMethodParameterRequired;)V", "AudioAttributesCompatParcelizer", "()Lo/accessisKotlinConstructorWithParameters;", "", "read", "()Ljava/lang/Object;", "Lo/requireRebox;", "Lo/requireRebox;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/accessisKotlinConstructorWithParameters;", "Lo/TopUserCompanion;", "write", "Lo/isMethodParameterRequired;", "()Lo/isMethodParameterRequired;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class KotlinModuleBuilder<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final TopUserCompanion write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final accessisKotlinConstructorWithParameters<T> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final isMethodParameterRequired AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final requireRebox<T> RemoteActionCompatParcelizer;

    public KotlinModuleBuilder(TopUserCompanion topUserCompanion, accessisKotlinConstructorWithParameters<T> accessiskotlinconstructorwithparameters, isMethodParameterRequired ismethodparameterrequired) {
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        toMagicModuleMetaRepoModel.write(accessiskotlinconstructorwithparameters, "");
        this.write = topUserCompanion;
        this.read = accessiskotlinconstructorwithparameters;
        this.AudioAttributesCompatParcelizer = ismethodparameterrequired;
        this.RemoteActionCompatParcelizer = new requireRebox<>(accessiskotlinconstructorwithparameters.write(), topUserCompanion);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final isMethodParameterRequired getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getValidationToken<? super KotlinModuleCompanion<T>>, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        final /* synthetic */ KotlinModuleBuilder<T> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isMethodParameterRequired audioAttributesCompatParcelizer = this.write.getAudioAttributesCompatParcelizer();
                if (audioAttributesCompatParcelizer != null) {
                    isMethodParameterRequired.read readVar = isMethodParameterRequired.read.PAGE_EVENT_FLOW;
                    this.AudioAttributesCompatParcelizer = 1;
                    if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(KotlinModuleBuilder<T> kotlinModuleBuilder, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.write = kotlinModuleBuilder;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(getValidationToken<? super KotlinModuleCompanion<T>> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(getvalidationtoken, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final accessisKotlinConstructorWithParameters<T> AudioAttributesCompatParcelizer() {
        return new accessisKotlinConstructorWithParameters<>(VerifyNewNumberRequest.write(VerifyNewNumberRequest.read(this.RemoteActionCompatParcelizer.IconCompatParcelizer(), new write(this, null)), new read(this, null)), this.read.getAudioAttributesCompatParcelizer(), this.read.getRead(), new AnonymousClass4(this));
    }

    static final class read extends getMagicModuleStats implements getModuleData<getValidationToken<? super KotlinModuleCompanion<T>>, Throwable, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        final /* synthetic */ KotlinModuleBuilder<T> read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isMethodParameterRequired audioAttributesCompatParcelizer = this.read.getAudioAttributesCompatParcelizer();
                if (audioAttributesCompatParcelizer != null) {
                    isMethodParameterRequired.read readVar = isMethodParameterRequired.read.PAGE_EVENT_FLOW;
                    this.IconCompatParcelizer = 1;
                    if (audioAttributesCompatParcelizer.IconCompatParcelizer() == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(KotlinModuleBuilder<T> kotlinModuleBuilder, SampleVideos<? super read> sampleVideos) {
            super(3, sampleVideos);
            this.read = kotlinModuleBuilder;
        }

        @Override // kotlin.getModuleData
        public final /* synthetic */ Object AudioAttributesCompatParcelizer(Object obj, Throwable th, SampleVideos<? super getShowPopup> sampleVideos) {
            return read(sampleVideos);
        }

        private Object read(SampleVideos<? super getShowPopup> sampleVideos) {
            return new read(this.read, sampleVideos).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.KotlinModuleBuilder$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lo/KotlinModuleCompanion$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/KotlinModuleCompanion$RemoteActionCompatParcelizer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<KotlinModuleCompanion.RemoteActionCompatParcelizer<T>> {
        final /* synthetic */ KotlinModuleBuilder<T> AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final KotlinModuleCompanion.RemoteActionCompatParcelizer<T> invoke() {
            return ((KotlinModuleBuilder) this.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer.write();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(KotlinModuleBuilder<T> kotlinModuleBuilder) {
            super(0);
            this.AudioAttributesCompatParcelizer = kotlinModuleBuilder;
        }
    }

    public final Object read() {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        return getShowPopup.INSTANCE;
    }
}
