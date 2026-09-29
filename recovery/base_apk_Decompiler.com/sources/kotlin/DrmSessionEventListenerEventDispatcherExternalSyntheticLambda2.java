package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public interface DrmSessionEventListenerEventDispatcherExternalSyntheticLambda2 {
    void AudioAttributesCompatParcelizer(long j, boolean z, getAnswerMap<? super switchToNext, switchToNext> getanswermap);

    void AudioAttributesCompatParcelizer(long j, boolean z, boolean z2, getAnswerMap<? super switchToNext, switchToNext> getanswermap);

    void IconCompatParcelizer();

    void read();

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void read(DrmSessionEventListenerEventDispatcherExternalSyntheticLambda2 drmSessionEventListenerEventDispatcherExternalSyntheticLambda2, long j, boolean z, getAnswerMap getanswermap, int i) {
        if ((i & 2) != 0) {
            z = RequestPayload.RemoteActionCompatParcelizer(j) > 0.5f;
        }
        if ((i & 4) != 0) {
            getanswermap = DrmSessionEventListenerEventDispatcherExternalSyntheticLambda3.write;
        }
        drmSessionEventListenerEventDispatcherExternalSyntheticLambda2.AudioAttributesCompatParcelizer(j, z, getanswermap);
    }
}
