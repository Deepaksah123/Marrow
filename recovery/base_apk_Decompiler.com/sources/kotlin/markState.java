package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/markState;", "Lo/completeWakefulIntent;", "Lkotlin/Function2;", "Lo/bufferMapProperty;", "Lo/PropertyValueAny;", "Lo/ProcessLifecycleInitializer;", "p0", "<init>", "(Lo/MagicModuleSubmissionRequestBody;)V", "p1", "write", "(Lo/bufferMapProperty;J)Lo/ProcessLifecycleInitializer;", "read", "Lo/MagicModuleSubmissionRequestBody;", "IconCompatParcelizer", "J", "", "AudioAttributesCompatParcelizer", "F", "RemoteActionCompatParcelizer", "Lo/ProcessLifecycleInitializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class markState implements completeWakefulIntent {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private long read = PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null);
    private ProcessLifecycleInitializer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<bufferMapProperty, PropertyValueAny, ProcessLifecycleInitializer> write;

    /* JADX WARN: Multi-variable type inference failed */
    public markState(MagicModuleSubmissionRequestBody<? super bufferMapProperty, ? super PropertyValueAny, ProcessLifecycleInitializer> magicModuleSubmissionRequestBody) {
        this.write = magicModuleSubmissionRequestBody;
    }

    @Override // kotlin.completeWakefulIntent
    public final ProcessLifecycleInitializer write(bufferMapProperty p0, long p1) {
        if (this.RemoteActionCompatParcelizer != null && PropertyValueAny.write(this.read, p1) && this.IconCompatParcelizer == p0.getAudioAttributesCompatParcelizer()) {
            ProcessLifecycleInitializer processLifecycleInitializer = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(processLifecycleInitializer);
            return processLifecycleInitializer;
        }
        this.read = p1;
        this.IconCompatParcelizer = p0.getAudioAttributesCompatParcelizer();
        ProcessLifecycleInitializer processLifecycleInitializerInvoke = this.write.invoke(p0, PropertyValueAny.read(p1));
        this.RemoteActionCompatParcelizer = processLifecycleInitializerInvoke;
        return processLifecycleInitializerInvoke;
    }
}
