package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setStatePercentile {
    public static final <T> void AudioAttributesCompatParcelizer(setStateRank<? super T> setstaterank, setMaxMcqCount setmaxmcqcount) {
        if (!(setstaterank instanceof setStateSolvedCount)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((setStateSolvedCount) setstaterank).write(setmaxmcqcount);
    }

    public static final <T> setStateSolvedCount<T> IconCompatParcelizer(SampleVideos<? super T> sampleVideos) {
        if (!(sampleVideos instanceof setInternetConnected)) {
            return new setStateSolvedCount<>(sampleVideos, 1);
        }
        setStateSolvedCount<T> setstatesolvedcountIconCompatParcelizer = ((setInternetConnected) sampleVideos).IconCompatParcelizer();
        if (setstatesolvedcountIconCompatParcelizer != null) {
            if (!setstatesolvedcountIconCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                setstatesolvedcountIconCompatParcelizer = null;
            }
            if (setstatesolvedcountIconCompatParcelizer != null) {
                return setstatesolvedcountIconCompatParcelizer;
            }
        }
        return new setStateSolvedCount<>(sampleVideos, 2);
    }

    public static final void AudioAttributesCompatParcelizer(setStateRank<?> setstaterank, setYearOfPassout setyearofpassout) {
        AudioAttributesCompatParcelizer(setstaterank, new setCurrentYear(setyearofpassout));
    }
}
