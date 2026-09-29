package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000 \u00032\u00020\u0001:\u0002\b\u0003R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/deserializeAndSet;", "", "Lo/getDataStream;", "read", "()Lo/getDataStream;", "IconCompatParcelizer", "Lo/withValueDeserializer;", "()I", "RemoteActionCompatParcelizer", "Lo/DataFormatReaders;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface deserializeAndSet {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.IconCompatParcelizer;

    @getRenewGrpId
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/deserializeAndSet$RemoteActionCompatParcelizer;", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RemoteActionCompatParcelizer {
    }

    int IconCompatParcelizer();

    getDataStream read();

    default int RemoteActionCompatParcelizer() {
        return DataFormatReaders.INSTANCE.IconCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.deserializeAndSet$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/deserializeAndSet$read;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion IconCompatParcelizer = new Companion();

        private Companion() {
        }
    }
}
