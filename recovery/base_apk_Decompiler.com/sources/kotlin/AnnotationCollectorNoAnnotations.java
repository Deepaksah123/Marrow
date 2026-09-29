package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class AnnotationCollectorNoAnnotations {
    private static final emptyAnnotations<?> write = new AnnotationCollectorEmptyCollector();
    private static final emptyAnnotations<?> IconCompatParcelizer = IconCompatParcelizer();

    AnnotationCollectorNoAnnotations() {
    }

    private static emptyAnnotations<?> IconCompatParcelizer() {
        try {
            return (emptyAnnotations) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static emptyAnnotations<?> RemoteActionCompatParcelizer() {
        return write;
    }

    static emptyAnnotations<?> read() {
        emptyAnnotations<?> emptyannotations = IconCompatParcelizer;
        if (emptyannotations != null) {
            return emptyannotations;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
