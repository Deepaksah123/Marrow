package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public interface AsynchronousMediaCodecBufferEnqueuerMessageParams {
    <T> void AudioAttributesCompatParcelizer(Class<T> cls, doQueueSecureInputBuffer<? super T> doqueuesecureinputbuffer);

    <T> void RemoteActionCompatParcelizer(Class<T> cls, Executor executor, doQueueSecureInputBuffer<? super T> doqueuesecureinputbuffer);
}
