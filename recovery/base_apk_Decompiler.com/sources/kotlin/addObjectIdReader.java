package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0007"}, d2 = {"Lo/addObjectIdReader;", "Lo/buildBuilderBasedDeserializer;", "<init>", "()V", "", "p0", "IconCompatParcelizer", "(I)I", "write", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class addObjectIdReader implements buildBuilderBasedDeserializer {
    public abstract int IconCompatParcelizer(int p0);

    public abstract int write(int p0);

    @Override // kotlin.buildBuilderBasedDeserializer
    public int AudioAttributesImplApi26Parcelizer(int p0) {
        return IconCompatParcelizer(p0);
    }

    @Override // kotlin.buildBuilderBasedDeserializer
    public int RemoteActionCompatParcelizer(int p0) {
        int iIconCompatParcelizer = IconCompatParcelizer(p0);
        if (iIconCompatParcelizer == -1 || IconCompatParcelizer(iIconCompatParcelizer) == -1) {
            return -1;
        }
        return iIconCompatParcelizer;
    }

    @Override // kotlin.buildBuilderBasedDeserializer
    public int read(int p0) {
        int iWrite = write(p0);
        if (iWrite == -1 || write(iWrite) == -1) {
            return -1;
        }
        return iWrite;
    }

    @Override // kotlin.buildBuilderBasedDeserializer
    public int AudioAttributesCompatParcelizer(int p0) {
        return write(p0);
    }
}
