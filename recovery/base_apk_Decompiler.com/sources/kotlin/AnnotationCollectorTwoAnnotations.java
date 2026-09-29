package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class AnnotationCollectorTwoAnnotations implements collectPropertiesWithBuilder {
    private static final AnnotationCollectorTwoAnnotations read = new AnnotationCollectorTwoAnnotations();

    private AnnotationCollectorTwoAnnotations() {
    }

    public static AnnotationCollectorTwoAnnotations write() {
        return read;
    }

    @Override // kotlin.collectPropertiesWithBuilder
    public final boolean AudioAttributesCompatParcelizer(Class<?> cls) {
        return _explicitClassOrOb.class.isAssignableFrom(cls);
    }

    @Override // kotlin.collectPropertiesWithBuilder
    public final _resolveAnnotatedClass RemoteActionCompatParcelizer(Class<?> cls) {
        if (!_explicitClassOrOb.class.isAssignableFrom(cls)) {
            StringBuilder sb = new StringBuilder("Unsupported message type: ");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            return (_resolveAnnotatedClass) _explicitClassOrOb.AudioAttributesCompatParcelizer(cls.asSubclass(_explicitClassOrOb.class)).onAddQueueItem();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Unable to get message info for ");
            sb2.append(cls.getName());
            throw new RuntimeException(sb2.toString(), e);
        }
    }
}
