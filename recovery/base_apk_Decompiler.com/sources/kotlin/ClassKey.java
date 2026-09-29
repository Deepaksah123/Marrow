package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClassKey extends getSelfReferencedType {
    public final long AudioAttributesCompatParcelizer;
    private LogicalType IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    private int[] write;

    public ClassKey(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, C0170format c0170format, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(_hastyperesolver, subTypeValidator, c0170format, i, obj, j, j2, j5);
        this.AudioAttributesCompatParcelizer = j3;
        this.RemoteActionCompatParcelizer = j4;
    }

    public final void write(LogicalType logicalType) {
        this.IconCompatParcelizer = logicalType;
        this.write = logicalType.AudioAttributesCompatParcelizer();
    }

    public final int IconCompatParcelizer(int i) {
        return ((int[]) buildTypeSerializer.AudioAttributesCompatParcelizer(this.write))[i];
    }

    protected final LogicalType read() {
        return (LogicalType) buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }
}
