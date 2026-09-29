package kotlin;

import com.google.android.exoplayer2.C;
import java.util.Arrays;
import kotlin._findWellKnownSimple;

/* JADX INFO: loaded from: classes2.dex */
public final class _resolveSuperInterfaces implements _findWellKnownSimple {
    private int AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int IconCompatParcelizer;
    private final byte[] RemoteActionCompatParcelizer;
    private final int read;
    private _fromArrayType[] write;

    public _resolveSuperInterfaces() {
        this(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    private _resolveSuperInterfaces(boolean z, int i) {
        buildTypeSerializer.IconCompatParcelizer(true);
        buildTypeSerializer.IconCompatParcelizer(true);
        this.AudioAttributesImplApi21Parcelizer = true;
        this.read = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.IconCompatParcelizer = 0;
        this.write = new _fromArrayType[100];
        this.RemoteActionCompatParcelizer = null;
    }

    public final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            if (this.AudioAttributesImplApi21Parcelizer) {
                RemoteActionCompatParcelizer(0);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i) {
        synchronized (this) {
            boolean z = i < this.AudioAttributesImplApi26Parcelizer;
            this.AudioAttributesImplApi26Parcelizer = i;
            if (z) {
                read();
            }
        }
    }

    @Override // kotlin._findWellKnownSimple
    public final _fromArrayType write() {
        _fromArrayType _fromarraytype;
        synchronized (this) {
            this.AudioAttributesCompatParcelizer++;
            int i = this.IconCompatParcelizer;
            if (i > 0) {
                _fromArrayType[] _fromarraytypeArr = this.write;
                int i2 = i - 1;
                this.IconCompatParcelizer = i2;
                _fromarraytype = (_fromArrayType) buildTypeSerializer.IconCompatParcelizer(_fromarraytypeArr[i2]);
                this.write[this.IconCompatParcelizer] = null;
            } else {
                _fromarraytype = new _fromArrayType(new byte[this.read], 0);
                int i3 = this.AudioAttributesCompatParcelizer;
                _fromArrayType[] _fromarraytypeArr2 = this.write;
                if (i3 > _fromarraytypeArr2.length) {
                    this.write = (_fromArrayType[]) Arrays.copyOf(_fromarraytypeArr2, _fromarraytypeArr2.length << 1);
                }
            }
        }
        return _fromarraytype;
    }

    @Override // kotlin._findWellKnownSimple
    public final void write(_fromArrayType _fromarraytype) {
        synchronized (this) {
            _fromArrayType[] _fromarraytypeArr = this.write;
            int i = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i + 1;
            _fromarraytypeArr[i] = _fromarraytype;
            this.AudioAttributesCompatParcelizer--;
            notifyAll();
        }
    }

    @Override // kotlin._findWellKnownSimple
    public final void write(_findWellKnownSimple.read readVar) {
        synchronized (this) {
            while (readVar != null) {
                _fromArrayType[] _fromarraytypeArr = this.write;
                int i = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i + 1;
                _fromarraytypeArr[i] = readVar.read();
                this.AudioAttributesCompatParcelizer--;
                readVar = readVar.write();
            }
            notifyAll();
        }
    }

    @Override // kotlin._findWellKnownSimple
    public final void read() {
        synchronized (this) {
            int i = 0;
            int iMax = Math.max(0, LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, this.read) - this.AudioAttributesCompatParcelizer);
            int i2 = this.IconCompatParcelizer;
            if (iMax >= i2) {
                return;
            }
            if (this.RemoteActionCompatParcelizer != null) {
                loop0: while (true) {
                    i2--;
                    while (i <= i2) {
                        _fromArrayType _fromarraytype = (_fromArrayType) buildTypeSerializer.IconCompatParcelizer(this.write[i]);
                        if (_fromarraytype.read != this.RemoteActionCompatParcelizer) {
                            _fromArrayType _fromarraytype2 = (_fromArrayType) buildTypeSerializer.IconCompatParcelizer(this.write[i2]);
                            if (_fromarraytype2.read != this.RemoteActionCompatParcelizer) {
                                break;
                            }
                            _fromArrayType[] _fromarraytypeArr = this.write;
                            _fromarraytypeArr[i] = _fromarraytype2;
                            _fromarraytypeArr[i2] = _fromarraytype;
                            i2--;
                        }
                        i++;
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.IconCompatParcelizer) {
                    return;
                }
            }
            Arrays.fill(this.write, iMax, this.IconCompatParcelizer, (Object) null);
            this.IconCompatParcelizer = iMax;
        }
    }

    public final int RemoteActionCompatParcelizer() {
        int i;
        int i2;
        synchronized (this) {
            i = this.AudioAttributesCompatParcelizer;
            i2 = this.read;
        }
        return i * i2;
    }

    @Override // kotlin._findWellKnownSimple
    public final int IconCompatParcelizer() {
        return this.read;
    }
}
