package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00018\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013"}, d2 = {"Lo/setTopBitrateKbps;", "V", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "", "p0", "", "p1", "p2", "<init>", "(ILjava/lang/String;Ljava/lang/Object;)V", "read", "I", "AudioAttributesCompatParcelizer", "()I", "RemoteActionCompatParcelizer", "write", "Ljava/lang/String;", "()Ljava/lang/String;", "Ljava/lang/Object;", "()Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setTopBitrateKbps<V> extends DataSourceBitmapLoaderExternalSyntheticLambda0<V> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final V read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    private final String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTopBitrateKbps(int i, String str, V v) {
        super(null, 1, null);
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = i;
        this.write = str;
        this.read = v;
    }

    public /* synthetic */ setTopBitrateKbps(int i, String str, Object obj, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, str, (i2 & 4) != 0 ? null : obj);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0
    public final V RemoteActionCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getWrite() {
        return this.write;
    }
}
