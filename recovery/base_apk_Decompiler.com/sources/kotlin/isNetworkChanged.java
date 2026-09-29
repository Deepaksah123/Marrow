package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class isNetworkChanged<T> implements getValidationToken<T> {
    private final CurrentQuery IconCompatParcelizer;
    private final MagicModuleSubmissionRequestBody<T, SampleVideos<? super getShowPopup>, Object> RemoteActionCompatParcelizer;
    private final Object write;

    public isNetworkChanged(getValidationToken<? super T> getvalidationtoken, CurrentQuery currentQuery) {
        this.IconCompatParcelizer = currentQuery;
        this.write = getBufferMultiplier.RemoteActionCompatParcelizer(currentQuery);
        this.RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer(getvalidationtoken, null);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<T, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ getValidationToken<T> read;
        private /* synthetic */ Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Object obj2 = this.write;
                getValidationToken<T> getvalidationtoken = this.read;
                this.AudioAttributesCompatParcelizer = 1;
                if (getvalidationtoken.IconCompatParcelizer((T) obj2, this) == objIconCompatParcelizer) {
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
        AudioAttributesCompatParcelizer(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = getvalidationtoken;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this.read, sampleVideos);
            audioAttributesCompatParcelizer.write = obj;
            return audioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(T t, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(t, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getValidationToken
    public final Object IconCompatParcelizer(T t, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj = getAudioUnderrunDurationMs.read(this.IconCompatParcelizer, t, this.write, this.RemoteActionCompatParcelizer, sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }
}
