package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getAudioUnderrunDurationMs {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> getValidationToken<T> write(getValidationToken<? super T> getvalidationtoken, CurrentQuery currentQuery) {
        return ((getvalidationtoken instanceof getTotalFramesDropped) || (getvalidationtoken instanceof getSpeed)) ? getvalidationtoken : new isNetworkChanged(getvalidationtoken, currentQuery);
    }

    public static final <T, V> Object read(CurrentQuery currentQuery, V v, Object obj, MagicModuleSubmissionRequestBody<? super V, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super T> sampleVideos) {
        Object objRemoteActionCompatParcelizer = getBufferMultiplier.RemoteActionCompatParcelizer(currentQuery, obj);
        try {
            getWvAudioLevel getwvaudiolevel = new getWvAudioLevel(sampleVideos, currentQuery);
            Object objInvoke = !(magicModuleSubmissionRequestBody instanceof getMonthName) ? getYear.read(magicModuleSubmissionRequestBody, v, getwvaudiolevel) : ((MagicModuleSubmissionRequestBody) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, 2)).invoke(v, getwvaudiolevel);
            getBufferMultiplier.AudioAttributesCompatParcelizer(currentQuery, objRemoteActionCompatParcelizer);
            if (objInvoke == getYear.IconCompatParcelizer()) {
                getAnsweredMcqCount.write(sampleVideos);
            }
            return objInvoke;
        } catch (Throwable th) {
            getBufferMultiplier.AudioAttributesCompatParcelizer(currentQuery, objRemoteActionCompatParcelizer);
            throw th;
        }
    }
}
