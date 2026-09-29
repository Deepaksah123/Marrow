package kotlin;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class _convertNumberToLong implements isLenient {
    private final long[] AudioAttributesCompatParcelizer;
    private final Map<String, String> IconCompatParcelizer;
    private final Map<String, _checkIsNumber> RemoteActionCompatParcelizer;
    private final Map<String, _currentObject> read;
    private final _convertNumberToInt write;

    public _convertNumberToLong(_convertNumberToInt _convertnumbertoint, Map<String, _currentObject> map, Map<String, _checkIsNumber> map2, Map<String, String> map3) {
        this.write = _convertnumbertoint;
        this.RemoteActionCompatParcelizer = map2;
        this.IconCompatParcelizer = map3;
        this.read = Collections.unmodifiableMap(map);
        this.AudioAttributesCompatParcelizer = _convertnumbertoint.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.isLenient
    public final int RemoteActionCompatParcelizer(long j) {
        int i = LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, j, false);
        if (i < this.AudioAttributesCompatParcelizer.length) {
            return i;
        }
        return -1;
    }

    @Override // kotlin.isLenient
    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.length;
    }

    @Override // kotlin.isLenient
    public final long write(int i) {
        return this.AudioAttributesCompatParcelizer[i];
    }

    @Override // kotlin.isLenient
    public final List<getDefaultImpl> read(long j) {
        return this.write.write(j, this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }
}
