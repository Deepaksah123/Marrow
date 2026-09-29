package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class getMsg {
    public static final Object IconCompatParcelizer(NewNumberOtpResendRequest<?> newNumberOtpResendRequest, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = newNumberOtpResendRequest.write(getSpeed.INSTANCE, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ NewNumberOtpResendRequest<T> read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (VerifyNewNumberRequest.IconCompatParcelizer((NewNumberOtpResendRequest<?>) this.read, (SampleVideos<? super getShowPopup>) this) == objIconCompatParcelizer) {
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
        IconCompatParcelizer(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = newNumberOtpResendRequest;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final <T> setPassingYear IconCompatParcelizer(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, TopUserCompanion topUserCompanion) {
        return C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new IconCompatParcelizer(newNumberOtpResendRequest, null), 3);
    }

    public static final <T> Object IconCompatParcelizer(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, MagicModuleSubmissionRequestBody<? super T, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = VerifyNewNumberRequest.IconCompatParcelizer((NewNumberOtpResendRequest<?>) VerifyNewNumberRequest.read(VerifyNewNumberRequest.RemoteActionCompatParcelizer(newNumberOtpResendRequest, magicModuleSubmissionRequestBody), 0), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    public static final <T> Object IconCompatParcelizer(getValidationToken<? super T> getvalidationtoken, NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, SampleVideos<? super getShowPopup> sampleVideos) {
        VerifyNewNumberRequest.AudioAttributesCompatParcelizer(getvalidationtoken);
        Object objWrite = newNumberOtpResendRequest.write(getvalidationtoken, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }
}
