package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin.StdKeySerializers;
import kotlin._put;

/* JADX INFO: loaded from: classes2.dex */
final class _pojoEquals {
    public POJONode AudioAttributesCompatParcelizer;
    public final Object AudioAttributesImplApi21Parcelizer;
    private final BasicSerializerFactory AudioAttributesImplApi26Parcelizer;
    public final visitStringFormat[] AudioAttributesImplBaseParcelizer;
    public final StdJdkSerializersAtomicIntegerSerializer IconCompatParcelizer;
    private _pojoEquals MediaBrowserCompatCustomActionResultReceiver;
    private final boolean[] MediaBrowserCompatItemReceiver;
    private final _constructSimple MediaBrowserCompatMediaItem;
    private long MediaBrowserCompatSearchResultReceiver;
    private final buildIterableSerializer[] MediaDescriptionCompat;
    private _writeAsBinary MediaMetadataCompat = _writeAsBinary.read;
    private _findPrimitive RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public boolean read;
    public boolean write;

    interface write {
        _pojoEquals write(POJONode pOJONode, long j);
    }

    public _pojoEquals(buildIterableSerializer[] builditerableserializerArr, long j, _constructSimple _constructsimple, _findWellKnownSimple _findwellknownsimple, BasicSerializerFactory basicSerializerFactory, POJONode pOJONode, _findPrimitive _findprimitive) {
        this.MediaDescriptionCompat = builditerableserializerArr;
        this.MediaBrowserCompatSearchResultReceiver = j;
        this.MediaBrowserCompatMediaItem = _constructsimple;
        this.AudioAttributesImplApi26Parcelizer = basicSerializerFactory;
        this.AudioAttributesImplApi21Parcelizer = pOJONode.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = pOJONode;
        this.RatingCompat = _findprimitive;
        this.AudioAttributesImplBaseParcelizer = new visitStringFormat[builditerableserializerArr.length];
        this.MediaBrowserCompatItemReceiver = new boolean[builditerableserializerArr.length];
        this.IconCompatParcelizer = RemoteActionCompatParcelizer(pOJONode.AudioAttributesCompatParcelizer, basicSerializerFactory, _findwellknownsimple, pOJONode.AudioAttributesImplApi21Parcelizer, pOJONode.RemoteActionCompatParcelizer);
    }

    public final long read(long j) {
        return j + AudioAttributesCompatParcelizer();
    }

    public final long RemoteActionCompatParcelizer(long j) {
        return j - AudioAttributesCompatParcelizer();
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.MediaBrowserCompatSearchResultReceiver = j;
    }

    public final long read() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer + this.MediaBrowserCompatSearchResultReceiver;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        if (this.write) {
            return !this.RemoteActionCompatParcelizer || this.IconCompatParcelizer.read() == Long.MIN_VALUE;
        }
        return false;
    }

    public final long IconCompatParcelizer() {
        if (!this.write) {
            return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        }
        long j = this.RemoteActionCompatParcelizer ? this.IconCompatParcelizer.read() : Long.MIN_VALUE;
        return j == Long.MIN_VALUE ? this.AudioAttributesCompatParcelizer.read : j;
    }

    public final long write() {
        if (this.write) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        return 0L;
    }

    public final void write(float f, PolymorphicTypeValidator polymorphicTypeValidator) throws addNull {
        this.write = true;
        this.MediaMetadataCompat = this.IconCompatParcelizer.D_();
        _findPrimitive _findprimitiveIconCompatParcelizer = IconCompatParcelizer(f, polymorphicTypeValidator);
        long jMax = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        if (this.AudioAttributesCompatParcelizer.read != C.TIME_UNSET && jMax >= this.AudioAttributesCompatParcelizer.read) {
            jMax = Math.max(0L, this.AudioAttributesCompatParcelizer.read - 1);
        }
        long j = read(_findprimitiveIconCompatParcelizer, jMax);
        this.MediaBrowserCompatSearchResultReceiver += this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer - j;
        this.AudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(j);
    }

    public final void write(long j) {
        buildTypeSerializer.write(MediaBrowserCompatSearchResultReceiver());
        if (this.write) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(j));
        }
    }

    public final void IconCompatParcelizer(long j, float f, long j2) {
        buildTypeSerializer.write(MediaBrowserCompatSearchResultReceiver());
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(new _put.AudioAttributesCompatParcelizer().IconCompatParcelizer(RemoteActionCompatParcelizer(j)).read(f).AudioAttributesCompatParcelizer(j2).write());
    }

    public final _findPrimitive IconCompatParcelizer(float f, PolymorphicTypeValidator polymorphicTypeValidator) throws addNull {
        _findPrimitive _findprimitiveRemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, AudioAttributesImplApi21Parcelizer(), this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, polymorphicTypeValidator);
        for (int i = 0; i < _findprimitiveRemoteActionCompatParcelizer.RemoteActionCompatParcelizer; i++) {
            if (_findprimitiveRemoteActionCompatParcelizer.IconCompatParcelizer(i)) {
                if (_findprimitiveRemoteActionCompatParcelizer.write[i] == null && this.MediaDescriptionCompat[i].MediaBrowserCompatMediaItem() != -2) {
                    z = false;
                }
                buildTypeSerializer.write(z);
            } else {
                buildTypeSerializer.write(_findprimitiveRemoteActionCompatParcelizer.write[i] == null);
            }
        }
        for (_verifyAndResolvePlaceholders _verifyandresolveplaceholders : _findprimitiveRemoteActionCompatParcelizer.write) {
            if (_verifyandresolveplaceholders != null) {
                _verifyandresolveplaceholders.write(f);
            }
        }
        return _findprimitiveRemoteActionCompatParcelizer;
    }

    public final long read(_findPrimitive _findprimitive, long j) {
        return read(_findprimitive, j, false, new boolean[this.MediaDescriptionCompat.length]);
    }

    public final long read(_findPrimitive _findprimitive, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= _findprimitive.RemoteActionCompatParcelizer) {
                break;
            }
            boolean[] zArr2 = this.MediaBrowserCompatItemReceiver;
            if (z || !_findprimitive.AudioAttributesCompatParcelizer(this.RatingCompat, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        read(this.AudioAttributesImplBaseParcelizer);
        MediaBrowserCompatMediaItem();
        this.RatingCompat = _findprimitive;
        MediaMetadataCompat();
        long j2 = this.IconCompatParcelizer.read(_findprimitive.write, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer, zArr, j);
        RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        this.RemoteActionCompatParcelizer = false;
        int i2 = 0;
        while (true) {
            visitStringFormat[] visitstringformatArr = this.AudioAttributesImplBaseParcelizer;
            if (i2 >= visitstringformatArr.length) {
                return j2;
            }
            if (visitstringformatArr[i2] != null) {
                buildTypeSerializer.write(_findprimitive.IconCompatParcelizer(i2));
                if (this.MediaDescriptionCompat[i2].MediaBrowserCompatMediaItem() != -2) {
                    this.RemoteActionCompatParcelizer = true;
                }
            } else {
                buildTypeSerializer.write(_findprimitive.write[i2] == null);
            }
            i2++;
        }
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        MediaBrowserCompatMediaItem();
        read(this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer);
    }

    public final void write(_pojoEquals _pojoequals) {
        if (_pojoequals == this.MediaBrowserCompatCustomActionResultReceiver) {
            return;
        }
        MediaBrowserCompatMediaItem();
        this.MediaBrowserCompatCustomActionResultReceiver = _pojoequals;
        MediaMetadataCompat();
    }

    public final _pojoEquals RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final _writeAsBinary AudioAttributesImplApi21Parcelizer() {
        return this.MediaMetadataCompat;
    }

    public final _findPrimitive AudioAttributesImplBaseParcelizer() {
        return this.RatingCompat;
    }

    public final void MediaDescriptionCompat() {
        if (this.IconCompatParcelizer instanceof NumberSerializersShortSerializer) {
            ((NumberSerializersShortSerializer) this.IconCompatParcelizer).RemoteActionCompatParcelizer(0L, this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer == C.TIME_UNSET ? Long.MIN_VALUE : this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        }
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        try {
            if (!this.write) {
                this.IconCompatParcelizer.write();
            } else {
                for (visitStringFormat visitstringformat : this.AudioAttributesImplBaseParcelizer) {
                    if (visitstringformat != null) {
                        visitstringformat.G_();
                    }
                }
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    private void MediaMetadataCompat() {
        if (MediaBrowserCompatSearchResultReceiver()) {
            for (int i = 0; i < this.RatingCompat.RemoteActionCompatParcelizer; i++) {
                boolean zIconCompatParcelizer = this.RatingCompat.IconCompatParcelizer(i);
                _verifyAndResolvePlaceholders _verifyandresolveplaceholders = this.RatingCompat.write[i];
                if (zIconCompatParcelizer && _verifyandresolveplaceholders != null) {
                    _verifyandresolveplaceholders.IconCompatParcelizer();
                }
            }
        }
    }

    private void MediaBrowserCompatMediaItem() {
        if (MediaBrowserCompatSearchResultReceiver()) {
            for (int i = 0; i < this.RatingCompat.RemoteActionCompatParcelizer; i++) {
                boolean zIconCompatParcelizer = this.RatingCompat.IconCompatParcelizer(i);
                _verifyAndResolvePlaceholders _verifyandresolveplaceholders = this.RatingCompat.write[i];
                if (zIconCompatParcelizer && _verifyandresolveplaceholders != null) {
                    _verifyandresolveplaceholders.RemoteActionCompatParcelizer();
                }
            }
        }
    }

    private void read(visitStringFormat[] visitstringformatArr) {
        int i = 0;
        while (true) {
            buildIterableSerializer[] builditerableserializerArr = this.MediaDescriptionCompat;
            if (i >= builditerableserializerArr.length) {
                return;
            }
            if (builditerableserializerArr[i].MediaBrowserCompatMediaItem() == -2) {
                visitstringformatArr[i] = null;
            }
            i++;
        }
    }

    private void RemoteActionCompatParcelizer(visitStringFormat[] visitstringformatArr) {
        int i = 0;
        while (true) {
            buildIterableSerializer[] builditerableserializerArr = this.MediaDescriptionCompat;
            if (i >= builditerableserializerArr.length) {
                return;
            }
            if (builditerableserializerArr[i].MediaBrowserCompatMediaItem() == -2 && this.RatingCompat.IconCompatParcelizer(i)) {
                visitstringformatArr[i] = new StdArraySerializersIntArraySerializer();
            }
            i++;
        }
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver == null;
    }

    private static StdJdkSerializersAtomicIntegerSerializer RemoteActionCompatParcelizer(StdKeySerializers.write writeVar, BasicSerializerFactory basicSerializerFactory, _findWellKnownSimple _findwellknownsimple, long j, long j2) {
        StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializerRemoteActionCompatParcelizer = basicSerializerFactory.RemoteActionCompatParcelizer(writeVar, _findwellknownsimple, j);
        return j2 != C.TIME_UNSET ? new NumberSerializersShortSerializer(stdJdkSerializersAtomicIntegerSerializerRemoteActionCompatParcelizer, true, 0L, j2) : stdJdkSerializersAtomicIntegerSerializerRemoteActionCompatParcelizer;
    }

    private static void read(BasicSerializerFactory basicSerializerFactory, StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        try {
            if (stdJdkSerializersAtomicIntegerSerializer instanceof NumberSerializersShortSerializer) {
                basicSerializerFactory.write(((NumberSerializersShortSerializer) stdJdkSerializersAtomicIntegerSerializer).write);
            } else {
                basicSerializerFactory.write(stdJdkSerializersAtomicIntegerSerializer);
            }
        } catch (RuntimeException e) {
            prune.read("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final boolean AudioAttributesCompatParcelizer(POJONode pOJONode) {
        return TextNode.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.read, pOJONode.read) && this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer == pOJONode.AudioAttributesImplApi21Parcelizer && this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.equals(pOJONode.AudioAttributesCompatParcelizer);
    }
}
