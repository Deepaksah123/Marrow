package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00018\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\u0082\u0001\u0003\u000b\f\r"}, d2 = {"Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "V", "", "p0", "<init>", "(Ljava/lang/Object;)V", "read", "()Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Lo/setTopBitrateKbps;", "Lo/setStreamingFormat;", "Lo/decodeBitmap;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DataSourceBitmapLoaderExternalSyntheticLambda0<V> {
    private final V AudioAttributesCompatParcelizer;

    private DataSourceBitmapLoaderExternalSyntheticLambda0(V v) {
        this.AudioAttributesCompatParcelizer = v;
    }

    public /* synthetic */ DataSourceBitmapLoaderExternalSyntheticLambda0(Object obj, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : obj, null);
    }

    public V RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final V read() throws Exception {
        V vRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (vRemoteActionCompatParcelizer != null) {
            return vRemoteActionCompatParcelizer;
        }
        throw new Exception("ERROR_NO_DATA_FOUND");
    }

    public /* synthetic */ DataSourceBitmapLoaderExternalSyntheticLambda0(Object obj, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(obj);
    }
}
