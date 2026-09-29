package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface PlaybackConfigRootResponseBody<T, V> extends PlaybackConfigRootRequestBody<T, V> {
    void RemoteActionCompatParcelizer(isResolutionNotSupported<?> isresolutionnotsupported, V v);

    @Override // kotlin.PlaybackConfigRootRequestBody
    V read(T t, isResolutionNotSupported<?> isresolutionnotsupported);
}
