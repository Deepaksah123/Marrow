package kotlin;

import java.util.Map;
import kotlin.BasicClassIntrospector;

/* JADX INFO: loaded from: classes4.dex */
final class _findStdTypeDesc implements _findStdJdkCollectionDesc {
    _findStdTypeDesc() {
    }

    @Override // kotlin._findStdJdkCollectionDesc
    public final Map<?, ?> RemoteActionCompatParcelizer(Object obj) {
        return (_isStdJDKCollection) obj;
    }

    @Override // kotlin._findStdJdkCollectionDesc
    public final BasicClassIntrospector.AudioAttributesCompatParcelizer<?, ?> write(Object obj) {
        return ((BasicClassIntrospector) obj).read();
    }

    @Override // kotlin._findStdJdkCollectionDesc
    public final Map<?, ?> IconCompatParcelizer(Object obj) {
        return (_isStdJDKCollection) obj;
    }

    @Override // kotlin._findStdJdkCollectionDesc
    public final boolean AudioAttributesCompatParcelizer(Object obj) {
        return !((_isStdJDKCollection) obj).write();
    }

    @Override // kotlin._findStdJdkCollectionDesc
    public final Object read(Object obj) {
        ((_isStdJDKCollection) obj).read();
        return obj;
    }

    @Override // kotlin._findStdJdkCollectionDesc
    public final Object IconCompatParcelizer() {
        return _isStdJDKCollection.IconCompatParcelizer().RemoteActionCompatParcelizer();
    }

    @Override // kotlin._findStdJdkCollectionDesc
    public final Object RemoteActionCompatParcelizer(Object obj, Object obj2) {
        return read(obj, obj2);
    }

    private static <K, V> _isStdJDKCollection<K, V> read(Object obj, Object obj2) {
        _isStdJDKCollection<K, V> _isstdjdkcollectionRemoteActionCompatParcelizer = (_isStdJDKCollection) obj;
        _isStdJDKCollection<K, V> _isstdjdkcollection = (_isStdJDKCollection) obj2;
        if (!_isstdjdkcollection.isEmpty()) {
            if (!_isstdjdkcollectionRemoteActionCompatParcelizer.write()) {
                _isstdjdkcollectionRemoteActionCompatParcelizer = _isstdjdkcollectionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
            _isstdjdkcollectionRemoteActionCompatParcelizer.IconCompatParcelizer(_isstdjdkcollection);
        }
        return _isstdjdkcollectionRemoteActionCompatParcelizer;
    }

    @Override // kotlin._findStdJdkCollectionDesc
    public final int read(int i, Object obj, Object obj2) {
        return write(i, obj, obj2);
    }

    private static <K, V> int write(int i, Object obj, Object obj2) {
        _isStdJDKCollection _isstdjdkcollection = (_isStdJDKCollection) obj;
        BasicClassIntrospector basicClassIntrospector = (BasicClassIntrospector) obj2;
        int iAudioAttributesCompatParcelizer = 0;
        if (_isstdjdkcollection.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : _isstdjdkcollection.entrySet()) {
            iAudioAttributesCompatParcelizer += basicClassIntrospector.AudioAttributesCompatParcelizer(i, entry.getKey(), entry.getValue());
        }
        return iAudioAttributesCompatParcelizer;
    }
}
