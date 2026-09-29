package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getSeekCount<T> extends getTotalMcq implements getValidationToken<T> {
    public final int AudioAttributesCompatParcelizer;
    private CurrentQuery IconCompatParcelizer;
    public final CurrentQuery RemoteActionCompatParcelizer;
    private getValidationToken<T> read;
    private SampleVideos<? super getShowPopup> write;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(int i) {
        return i + 1;
    }

    @Override // kotlin.getMonthName, kotlin.getNextQuery
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getSeekCount(getValidationToken<? super T> getvalidationtoken, CurrentQuery currentQuery) {
        super(getRootSessionId.INSTANCE, VideoSessionResponseBody.RemoteActionCompatParcelizer);
        this.read = getvalidationtoken;
        this.RemoteActionCompatParcelizer = currentQuery;
        this.AudioAttributesCompatParcelizer = ((Number) currentQuery.fold(0, new MagicModuleSubmissionRequestBody() { // from class: o.getReBufferDurationMs
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(getSeekCount.IconCompatParcelizer(((Integer) obj).intValue()));
            }
        })).intValue();
    }

    @Override // kotlin.getMonthName, kotlin.getNextQuery
    public final getNextQuery getCallerFrame() {
        SampleVideos<? super getShowPopup> sampleVideos = this.write;
        if (sampleVideos instanceof getNextQuery) {
            return (getNextQuery) sampleVideos;
        }
        return null;
    }

    @Override // kotlin.getTotalMcq, kotlin.SampleVideos
    /* JADX INFO: renamed from: getContext */
    public final CurrentQuery getWrite() {
        CurrentQuery currentQuery = this.IconCompatParcelizer;
        return currentQuery == null ? VideoSessionResponseBody.RemoteActionCompatParcelizer : currentQuery;
    }

    @Override // kotlin.getMonthName
    public final Object invokeSuspend(Object obj) {
        Throwable thIconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer(obj);
        if (thIconCompatParcelizer != null) {
            this.IconCompatParcelizer = new getPlaybackType(thIconCompatParcelizer, getWrite());
        }
        SampleVideos<? super getShowPopup> sampleVideos = this.write;
        if (sampleVideos != null) {
            sampleVideos.resumeWith(obj);
        }
        return getYear.IconCompatParcelizer();
    }

    @Override // kotlin.getTotalMcq, kotlin.getMonthName
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // kotlin.getValidationToken
    public final Object IconCompatParcelizer(T t, SampleVideos<? super getShowPopup> sampleVideos) {
        try {
            Object objWrite = write(sampleVideos, t);
            if (objWrite == getYear.IconCompatParcelizer()) {
                getAnsweredMcqCount.write(sampleVideos);
            }
            return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
        } catch (Throwable th) {
            this.IconCompatParcelizer = new getPlaybackType(th, sampleVideos.getWrite());
            throw th;
        }
    }

    private final Object write(SampleVideos<? super getShowPopup> sampleVideos, T t) {
        CurrentQuery context = sampleVideos.getWrite();
        getUserConfig.read(context);
        CurrentQuery currentQuery = this.IconCompatParcelizer;
        if (currentQuery != context) {
            AudioAttributesCompatParcelizer(context, currentQuery, t);
            this.IconCompatParcelizer = context;
        }
        this.write = sampleVideos;
        getModuleData getmoduledata = isInternetConnected.write;
        getValidationToken<T> getvalidationtoken = this.read;
        toMagicModuleMetaRepoModel.read(getvalidationtoken, "");
        toMagicModuleMetaRepoModel.read(this, "");
        Object objAudioAttributesCompatParcelizer = getmoduledata.AudioAttributesCompatParcelizer(getvalidationtoken, t, this);
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objAudioAttributesCompatParcelizer, getYear.IconCompatParcelizer())) {
            this.write = null;
        }
        return objAudioAttributesCompatParcelizer;
    }

    private final void AudioAttributesCompatParcelizer(CurrentQuery currentQuery, CurrentQuery currentQuery2, T t) {
        if (currentQuery2 instanceof getPlaybackType) {
            write((getPlaybackType) currentQuery2, t);
        }
        getWidevineMode.write((getSeekCount<?>) this, currentQuery);
    }

    private static void write(getPlaybackType getplaybacktype, Object obj) {
        StringBuilder sb = new StringBuilder("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
        sb.append(getplaybacktype.write);
        sb.append(", but then emission attempt of value '");
        sb.append(obj);
        sb.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(TestGroupLSModel.write(sb.toString()).toString());
    }
}
