package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getEncryptedPlaybackVersion<S, T> extends getDidReBuffer<T> {
    protected final NewNumberOtpResendRequest<S> read;

    protected abstract Object IconCompatParcelizer(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos);

    /* JADX WARN: Multi-variable type inference failed */
    public getEncryptedPlaybackVersion(NewNumberOtpResendRequest<? extends S> newNumberOtpResendRequest, CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        super(currentQuery, i, setaddressline2);
        this.read = newNumberOtpResendRequest;
    }

    private final Object read(getValidationToken<? super T> getvalidationtoken, CurrentQuery currentQuery, SampleVideos<? super getShowPopup> sampleVideos) {
        return getAudioUnderrunDurationMs.read(currentQuery, getAudioUnderrunDurationMs.write(getvalidationtoken, sampleVideos.getWrite()), getBufferMultiplier.RemoteActionCompatParcelizer(currentQuery), new write(this, null), sampleVideos);
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getValidationToken<? super T>, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getEncryptedPlaybackVersion<S, T> AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getValidationToken<? super T> getvalidationtoken = (getValidationToken) this.write;
                this.IconCompatParcelizer = 1;
                if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getvalidationtoken, this) == objIconCompatParcelizer) {
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
        write(getEncryptedPlaybackVersion<S, T> getencryptedplaybackversion, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = getencryptedplaybackversion;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(this.AudioAttributesCompatParcelizer, sampleVideos);
            writeVar.write = obj;
            return writeVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(getvalidationtoken, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static /* synthetic */ <S, T> Object IconCompatParcelizer(getEncryptedPlaybackVersion<S, T> getencryptedplaybackversion, getShowPearlDeletionPopup<? super T> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = getencryptedplaybackversion.IconCompatParcelizer(new getTotalFramesDropped(getshowpearldeletionpopup), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    private static /* synthetic */ <S, T> Object AudioAttributesCompatParcelizer(getEncryptedPlaybackVersion<S, T> getencryptedplaybackversion, getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
        if (getencryptedplaybackversion.IconCompatParcelizer == -3) {
            CurrentQuery write2 = sampleVideos.getWrite();
            CurrentQuery currentQueryIconCompatParcelizer = TestStat.IconCompatParcelizer(write2, getencryptedplaybackversion.RemoteActionCompatParcelizer);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(currentQueryIconCompatParcelizer, write2)) {
                Object objIconCompatParcelizer = getencryptedplaybackversion.IconCompatParcelizer(getvalidationtoken, sampleVideos);
                return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(currentQueryIconCompatParcelizer.get(getPlaybackInterval.INSTANCE), write2.get(getPlaybackInterval.INSTANCE))) {
                Object obj = getencryptedplaybackversion.read(getvalidationtoken, currentQueryIconCompatParcelizer, sampleVideos);
                return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
            }
        }
        Object objWrite = super.write(getvalidationtoken, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    @Override // kotlin.getDidReBuffer
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        sb.append(" -> ");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // kotlin.getDidReBuffer, kotlin.NewNumberOtpResendRequest
    public final Object write(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
        return AudioAttributesCompatParcelizer(this, getvalidationtoken, sampleVideos);
    }

    @Override // kotlin.getDidReBuffer
    protected final Object read(getShowPearlDeletionPopup<? super T> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos) {
        return IconCompatParcelizer(this, getshowpearldeletionpopup, sampleVideos);
    }
}
