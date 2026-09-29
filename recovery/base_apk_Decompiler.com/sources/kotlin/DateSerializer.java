package kotlin;

import kotlin.constructGeneralizedType;

/* JADX INFO: loaded from: classes2.dex */
public final class DateSerializer implements _isShapeWrittenUsingIndex {
    @Override // kotlin._isShapeWrittenUsingIndex
    public final constructGeneralizedType.IconCompatParcelizer<_asTimestamp> read() {
        return new _serializeAsString();
    }

    @Override // kotlin._isShapeWrittenUsingIndex
    public final constructGeneralizedType.IconCompatParcelizer<_asTimestamp> AudioAttributesCompatParcelizer(EnumSerializer enumSerializer, _acceptJsonFormatVisitor _acceptjsonformatvisitor) {
        return new _serializeAsString(enumSerializer, _acceptjsonformatvisitor);
    }
}
