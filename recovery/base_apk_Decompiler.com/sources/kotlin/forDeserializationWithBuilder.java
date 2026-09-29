package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class forDeserializationWithBuilder {
    private static final couldDeserialize write = IconCompatParcelizer();
    private static final couldDeserialize AudioAttributesCompatParcelizer = new forCreation();

    forDeserializationWithBuilder() {
    }

    static couldDeserialize RemoteActionCompatParcelizer() {
        return write;
    }

    static couldDeserialize AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    private static couldDeserialize IconCompatParcelizer() {
        try {
            return (couldDeserialize) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
