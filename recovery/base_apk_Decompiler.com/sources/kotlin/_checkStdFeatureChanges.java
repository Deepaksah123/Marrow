package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\r\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\n\u0010\u000e"}, d2 = {"Lo/_checkStdFeatureChanges;", "", "<init>", "()V", "Lo/DefaultDeserializationContext;", "read", "Lo/DefaultDeserializationContext;", "RemoteActionCompatParcelizer", "()Lo/DefaultDeserializationContext;", "IconCompatParcelizer", "write", "Lo/getDataStream;", "Lo/getDataStream;", "AudioAttributesCompatParcelizer", "()Lo/getDataStream;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _checkStdFeatureChanges {
    public static final _checkStdFeatureChanges INSTANCE = new _checkStdFeatureChanges();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final DefaultDeserializationContext IconCompatParcelizer = _reportMissingSetter.INSTANCE.read();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final DefaultDeserializationContext write = _reportMissingSetter.INSTANCE.read();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final getDataStream AudioAttributesCompatParcelizer = getDataStream.INSTANCE.read();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final getDataStream read = getDataStream.INSTANCE.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private static final getDataStream RemoteActionCompatParcelizer = getDataStream.INSTANCE.RemoteActionCompatParcelizer();

    private _checkStdFeatureChanges() {
    }

    public final DefaultDeserializationContext RemoteActionCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public final DefaultDeserializationContext IconCompatParcelizer() {
        return write;
    }

    public final getDataStream AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    public final getDataStream read() {
        return read;
    }

    public final getDataStream write() {
        return RemoteActionCompatParcelizer;
    }
}
