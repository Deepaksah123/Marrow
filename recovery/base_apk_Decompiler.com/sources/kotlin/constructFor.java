package kotlin;

import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
public final class constructFor implements findRawSuperTypes {
    private final findRawSuperTypes AudioAttributesCompatParcelizer;
    private final long RemoteActionCompatParcelizer;

    public constructFor(long j, findRawSuperTypes findrawsupertypes) {
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = findrawsupertypes;
    }

    @Override // kotlin.findRawSuperTypes
    public final nonNullString IconCompatParcelizer(int i, int i2) {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i, i2);
    }

    @Override // kotlin.findRawSuperTypes
    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.findRawSuperTypes
    public final void read(final isCollectionMapOrArray iscollectionmaporarray) {
        this.AudioAttributesCompatParcelizer.read(new getOuterClass(iscollectionmaporarray) { // from class: o.constructFor.3
            @Override // kotlin.getOuterClass, kotlin.isCollectionMapOrArray
            public final isCollectionMapOrArray.read write(long j) {
                isCollectionMapOrArray.read readVarWrite = iscollectionmaporarray.write(j);
                return new isCollectionMapOrArray.read(new isLocalType(readVarWrite.AudioAttributesCompatParcelizer.IconCompatParcelizer, readVarWrite.AudioAttributesCompatParcelizer.write + constructFor.this.RemoteActionCompatParcelizer), new isLocalType(readVarWrite.IconCompatParcelizer.IconCompatParcelizer, readVarWrite.IconCompatParcelizer.write + constructFor.this.RemoteActionCompatParcelizer));
            }
        });
    }
}
