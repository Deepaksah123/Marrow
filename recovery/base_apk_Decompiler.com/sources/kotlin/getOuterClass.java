package kotlin;

import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
public class getOuterClass implements isCollectionMapOrArray {
    private final isCollectionMapOrArray AudioAttributesCompatParcelizer;

    public getOuterClass(isCollectionMapOrArray iscollectionmaporarray) {
        this.AudioAttributesCompatParcelizer = iscollectionmaporarray;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.isCollectionMapOrArray
    public long read() {
        return this.AudioAttributesCompatParcelizer.read();
    }

    @Override // kotlin.isCollectionMapOrArray
    public isCollectionMapOrArray.read write(long j) {
        return this.AudioAttributesCompatParcelizer.write(j);
    }
}
