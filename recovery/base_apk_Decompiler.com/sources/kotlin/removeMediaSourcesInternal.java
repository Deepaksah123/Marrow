package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class removeMediaSourcesInternal {

    public interface RemoteActionCompatParcelizer<T> {
        T RemoteActionCompatParcelizer();
    }

    public static <T> RemoteActionCompatParcelizer<T> write(final RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        return new RemoteActionCompatParcelizer<T>() { // from class: o.removeMediaSourcesInternal.4
            private volatile T read;

            @Override // o.removeMediaSourcesInternal.RemoteActionCompatParcelizer
            public final T RemoteActionCompatParcelizer() {
                if (this.read == null) {
                    synchronized (this) {
                        if (this.read == null) {
                            this.read = (T) moveMediaSource.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.RemoteActionCompatParcelizer());
                        }
                    }
                }
                return this.read;
            }
        };
    }
}
