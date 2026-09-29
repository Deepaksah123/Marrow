package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class isRequiredByNullability {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class IconCompatParcelizer<T> extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<KotlinObjectSingletonDeserializerKt<T>, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ setPassingYear AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<KotlinObjectSingletonDeserializerKt<T>, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private int read;

        /* JADX INFO: renamed from: o.isRequiredByNullability$IconCompatParcelizer$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "p0", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<Throwable, getShowPopup> {
            final /* synthetic */ KotlinObjectSingletonDeserializerKt<T> $write;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(Throwable th) {
                AudioAttributesCompatParcelizer(th);
                return getShowPopup.INSTANCE;
            }

            public final void AudioAttributesCompatParcelizer(Throwable th) {
                this.$write.write((Throwable) null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(KotlinObjectSingletonDeserializerKt<T> kotlinObjectSingletonDeserializerKt) {
                super(1);
                this.$write = kotlinObjectSingletonDeserializerKt;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                KotlinObjectSingletonDeserializerKt<T> kotlinObjectSingletonDeserializerKt = (KotlinObjectSingletonDeserializerKt) this.RemoteActionCompatParcelizer;
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new AnonymousClass3(kotlinObjectSingletonDeserializerKt));
                MagicModuleSubmissionRequestBody<KotlinObjectSingletonDeserializerKt<T>, SampleVideos<? super getShowPopup>, Object> magicModuleSubmissionRequestBody = this.IconCompatParcelizer;
                this.read = 1;
                if (magicModuleSubmissionRequestBody.invoke(kotlinObjectSingletonDeserializerKt, this) == objIconCompatParcelizer) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(setPassingYear setpassingyear, MagicModuleSubmissionRequestBody<? super KotlinObjectSingletonDeserializerKt<T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = setpassingyear;
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
            iconCompatParcelizer.RemoteActionCompatParcelizer = obj;
            return iconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(KotlinObjectSingletonDeserializerKt<T> kotlinObjectSingletonDeserializerKt, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(kotlinObjectSingletonDeserializerKt, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final <T> NewNumberOtpResendRequest<T> AudioAttributesCompatParcelizer(setPassingYear setpassingyear, MagicModuleSubmissionRequestBody<? super KotlinObjectSingletonDeserializerKt<T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(setpassingyear, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        return isPrimaryConstructor.write(new IconCompatParcelizer(setpassingyear, magicModuleSubmissionRequestBody, null));
    }
}
