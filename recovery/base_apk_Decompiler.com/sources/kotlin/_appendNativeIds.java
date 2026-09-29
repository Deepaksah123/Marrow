package kotlin;

import android.util.SparseArray;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class _appendNativeIds implements findRawSuperTypes {
    private final withTimeZone.IconCompatParcelizer AudioAttributesCompatParcelizer;
    private final findRawSuperTypes RemoteActionCompatParcelizer;
    private final SparseArray<_copyBufferValue> write = new SparseArray<>();

    public _appendNativeIds(findRawSuperTypes findrawsupertypes, withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
        this.RemoteActionCompatParcelizer = findrawsupertypes;
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer() {
        for (int i = 0; i < this.write.size(); i++) {
            this.write.valueAt(i).write();
        }
    }

    @Override // kotlin.findRawSuperTypes
    public final nonNullString IconCompatParcelizer(int i, int i2) {
        if (i2 != 3) {
            return this.RemoteActionCompatParcelizer.IconCompatParcelizer(i, i2);
        }
        _copyBufferValue _copybuffervalue = this.write.get(i);
        if (_copybuffervalue != null) {
            return _copybuffervalue;
        }
        _copyBufferValue _copybuffervalue2 = new _copyBufferValue(this.RemoteActionCompatParcelizer.IconCompatParcelizer(i, i2), this.AudioAttributesCompatParcelizer);
        this.write.put(i, _copybuffervalue2);
        return _copybuffervalue2;
    }

    @Override // kotlin.findRawSuperTypes
    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.findRawSuperTypes
    public final void read(isCollectionMapOrArray iscollectionmaporarray) {
        this.RemoteActionCompatParcelizer.read(iscollectionmaporarray);
    }
}
