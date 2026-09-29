package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class removeProperty {
    private static final _findStdJdkCollectionDesc read = RemoteActionCompatParcelizer();
    private static final _findStdJdkCollectionDesc RemoteActionCompatParcelizer = new _findStdTypeDesc();

    removeProperty() {
    }

    static _findStdJdkCollectionDesc IconCompatParcelizer() {
        return read;
    }

    static _findStdJdkCollectionDesc AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    private static _findStdJdkCollectionDesc RemoteActionCompatParcelizer() {
        try {
            return (_findStdJdkCollectionDesc) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
