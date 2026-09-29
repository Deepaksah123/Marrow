package kotlin;

import kotlin.AsynchronousMediaCodecCallbackExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getLastOutputBufferPresentationTimeUs {

    /* JADX INFO: loaded from: classes5.dex */
    public static abstract class RemoteActionCompatParcelizer {
        public abstract RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(long j);

        public abstract RemoteActionCompatParcelizer read(String str);

        public abstract getLastOutputBufferPresentationTimeUs read();

        public abstract RemoteActionCompatParcelizer write(long j);
    }

    public abstract String AudioAttributesCompatParcelizer();

    public abstract long RemoteActionCompatParcelizer();

    public abstract long write();

    public static RemoteActionCompatParcelizer read() {
        return new AsynchronousMediaCodecCallbackExternalSyntheticLambda0.AudioAttributesCompatParcelizer();
    }
}
