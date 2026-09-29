package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface _verifyAndResolvePlaceholders extends _referenceType {

    public interface AudioAttributesCompatParcelizer {
        _verifyAndResolvePlaceholders[] write(write[] writeVarArr, _fromWellKnownInterface _fromwellknowninterface);
    }

    int AudioAttributesCompatParcelizer(long j, List<? extends getSelfReferencedType> list);

    Object AudioAttributesCompatParcelizer();

    default boolean AudioAttributesCompatParcelizer(long j, CollectionLikeType collectionLikeType, List<? extends getSelfReferencedType> list) {
        return false;
    }

    int AudioAttributesImplApi21Parcelizer();

    default long AudioAttributesImplApi26Parcelizer() {
        return -2147483647L;
    }

    void IconCompatParcelizer();

    C0170format MediaBrowserCompatItemReceiver();

    void RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(long j, long j2, long j3, List<? extends getSelfReferencedType> list, ResolvedRecursiveType[] resolvedRecursiveTypeArr);

    boolean RemoteActionCompatParcelizer(int i, long j);

    int read();

    int write();

    void write(float f);

    boolean write(int i, long j);

    public static final class write {
        public final int[] IconCompatParcelizer;
        public final setName read;
        public final int write;

        public write(setName setname, int... iArr) {
            this(setname, iArr, 0);
        }

        public write(setName setname, int[] iArr, int i) {
            if (iArr.length == 0) {
                prune.read("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.read = setname;
            this.IconCompatParcelizer = iArr;
            this.write = i;
        }
    }
}
