package kotlin;

import androidx.media3.common.StreamKey;
import java.util.List;
import kotlin.constructGeneralizedType;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassSerializer implements _isShapeWrittenUsingIndex {
    private final _isShapeWrittenUsingIndex RemoteActionCompatParcelizer;
    private final List<StreamKey> write;

    public ClassSerializer(_isShapeWrittenUsingIndex _isshapewrittenusingindex, List<StreamKey> list) {
        this.RemoteActionCompatParcelizer = _isshapewrittenusingindex;
        this.write = list;
    }

    @Override // kotlin._isShapeWrittenUsingIndex
    public final constructGeneralizedType.IconCompatParcelizer<_asTimestamp> read() {
        return new NumberSerializersDoubleSerializer(this.RemoteActionCompatParcelizer.read(), this.write);
    }

    @Override // kotlin._isShapeWrittenUsingIndex
    public final constructGeneralizedType.IconCompatParcelizer<_asTimestamp> AudioAttributesCompatParcelizer(EnumSerializer enumSerializer, _acceptJsonFormatVisitor _acceptjsonformatvisitor) {
        return new NumberSerializersDoubleSerializer(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(enumSerializer, _acceptjsonformatvisitor), this.write);
    }
}
