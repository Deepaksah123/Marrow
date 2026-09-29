package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class _createConverter implements getSetter {
    private static final collectPropertiesWithBuilder read = new collectPropertiesWithBuilder() { // from class: o._createConverter.1
        @Override // kotlin.collectPropertiesWithBuilder
        public final boolean AudioAttributesCompatParcelizer(Class<?> cls) {
            return false;
        }

        @Override // kotlin.collectPropertiesWithBuilder
        public final _resolveAnnotatedClass RemoteActionCompatParcelizer(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final collectPropertiesWithBuilder IconCompatParcelizer;

    public _createConverter() {
        this(AudioAttributesCompatParcelizer());
    }

    private _createConverter(collectPropertiesWithBuilder collectpropertieswithbuilder) {
        this.IconCompatParcelizer = (collectPropertiesWithBuilder) forDeserialization.read(collectpropertieswithbuilder, "messageInfoFactory");
    }

    @Override // kotlin.getSetter
    public final <T> getPrimaryMember<T> IconCompatParcelizer(Class<T> cls) {
        hasField.read((Class<?>) cls);
        _resolveAnnotatedClass _resolveannotatedclassRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(cls);
        if (_resolveannotatedclassRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
            if (_explicitClassOrOb.class.isAssignableFrom(cls)) {
                return BeanPropertyDefinition.IconCompatParcelizer(hasField.read(), AnnotationCollectorNoAnnotations.RemoteActionCompatParcelizer(), _resolveannotatedclassRemoteActionCompatParcelizer.IconCompatParcelizer());
            }
            return BeanPropertyDefinition.IconCompatParcelizer(hasField.RemoteActionCompatParcelizer(), AnnotationCollectorNoAnnotations.read(), _resolveannotatedclassRemoteActionCompatParcelizer.IconCompatParcelizer());
        }
        return RemoteActionCompatParcelizer(cls, _resolveannotatedclassRemoteActionCompatParcelizer);
    }

    private static <T> getPrimaryMember<T> RemoteActionCompatParcelizer(Class<T> cls, _resolveAnnotatedClass _resolveannotatedclass) {
        if (_explicitClassOrOb.class.isAssignableFrom(cls)) {
            if (RemoteActionCompatParcelizer(_resolveannotatedclass)) {
                return couldSerialize.RemoteActionCompatParcelizer(_resolveannotatedclass, forDeserializationWithBuilder.AudioAttributesCompatParcelizer(), forSerialization.write(), hasField.read(), AnnotationCollectorNoAnnotations.RemoteActionCompatParcelizer(), removeProperty.AudioAttributesCompatParcelizer());
            }
            return couldSerialize.RemoteActionCompatParcelizer(_resolveannotatedclass, forDeserializationWithBuilder.AudioAttributesCompatParcelizer(), forSerialization.write(), hasField.read(), (emptyAnnotations<?>) null, removeProperty.AudioAttributesCompatParcelizer());
        }
        if (RemoteActionCompatParcelizer(_resolveannotatedclass)) {
            return couldSerialize.RemoteActionCompatParcelizer(_resolveannotatedclass, forDeserializationWithBuilder.RemoteActionCompatParcelizer(), forSerialization.RemoteActionCompatParcelizer(), hasField.RemoteActionCompatParcelizer(), AnnotationCollectorNoAnnotations.read(), removeProperty.IconCompatParcelizer());
        }
        return couldSerialize.RemoteActionCompatParcelizer(_resolveannotatedclass, forDeserializationWithBuilder.RemoteActionCompatParcelizer(), forSerialization.RemoteActionCompatParcelizer(), hasField.AudioAttributesCompatParcelizer(), (emptyAnnotations<?>) null, removeProperty.IconCompatParcelizer());
    }

    private static boolean RemoteActionCompatParcelizer(_resolveAnnotatedClass _resolveannotatedclass) {
        return _resolveannotatedclass.RemoteActionCompatParcelizer() == getConstructorParameter.PROTO2;
    }

    private static collectPropertiesWithBuilder AudioAttributesCompatParcelizer() {
        return new read(AnnotationCollectorTwoAnnotations.write(), RemoteActionCompatParcelizer());
    }

    static class read implements collectPropertiesWithBuilder {
        private collectPropertiesWithBuilder[] AudioAttributesCompatParcelizer;

        read(collectPropertiesWithBuilder... collectpropertieswithbuilderArr) {
            this.AudioAttributesCompatParcelizer = collectpropertieswithbuilderArr;
        }

        @Override // kotlin.collectPropertiesWithBuilder
        public final boolean AudioAttributesCompatParcelizer(Class<?> cls) {
            for (collectPropertiesWithBuilder collectpropertieswithbuilder : this.AudioAttributesCompatParcelizer) {
                if (collectpropertieswithbuilder.AudioAttributesCompatParcelizer(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collectPropertiesWithBuilder
        public final _resolveAnnotatedClass RemoteActionCompatParcelizer(Class<?> cls) {
            for (collectPropertiesWithBuilder collectpropertieswithbuilder : this.AudioAttributesCompatParcelizer) {
                if (collectpropertieswithbuilder.AudioAttributesCompatParcelizer(cls)) {
                    return collectpropertieswithbuilder.RemoteActionCompatParcelizer(cls);
                }
            }
            StringBuilder sb = new StringBuilder("No factory is available for message type: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    private static collectPropertiesWithBuilder RemoteActionCompatParcelizer() {
        try {
            return (collectPropertiesWithBuilder) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return read;
        }
    }
}
