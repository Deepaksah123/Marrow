package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000fJ%\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0014J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0015R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\"\u0010\f\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b\"\u0004\b\u0017\u0010\u001cR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R'\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030!8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\u0016\u0010#R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030$8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0019"}, d2 = {"Lo/get7BitOutputEscapes;", "", "", "Lo/includeProperty;", "p0", "", "p1", "<init>", "(Ljava/util/List;I)V", "AudioAttributesCompatParcelizer", "(ILjava/lang/Object;)Lo/includeProperty;", "", "RemoteActionCompatParcelizer", "(Lo/includeProperty;)Z", "", "(II)V", "p2", "(III)V", "IconCompatParcelizer", "(Lo/includeProperty;I)V", "(II)Z", "(Lo/includeProperty;)I", "write", "read", "Ljava/util/List;", "()Ljava/util/List;", "I", "()I", "(I)V", "AudioAttributesImplBaseParcelizer", "Lo/setProvider;", "Lo/_nextTokenWithBuffering;", "Lo/setProvider;", "Lo/OutputDecorator;", "Lo/RenewEligible;", "()Lo/setKeyListener;", "", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class get7BitOutputEscapes {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final List<includeProperty> read;
    private final setProvider<_nextTokenWithBuffering> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<includeProperty> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    public get7BitOutputEscapes(List<includeProperty> list, int i) {
        this.write = list;
        this.AudioAttributesCompatParcelizer = i;
        if (i < 0) {
            getInputCodeUtf8JsNames.write("Invalid start index");
        }
        this.read = new ArrayList();
        setProvider<_nextTokenWithBuffering> setprovider = new setProvider<>(0, 1, null);
        int size = list.size();
        int remoteActionCompatParcelizer = 0;
        for (int i2 = 0; i2 < size; i2++) {
            includeProperty includeproperty = this.write.get(i2);
            setprovider.write(includeproperty.getRead(), new _nextTokenWithBuffering(i2, remoteActionCompatParcelizer, includeproperty.getRemoteActionCompatParcelizer()));
            remoteActionCompatParcelizer += includeproperty.getRemoteActionCompatParcelizer();
        }
        this.IconCompatParcelizer = setprovider;
        this.AudioAttributesImplBaseParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new IconCompatParcelizer());
    }

    public final List<includeProperty> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements getCreatedOnDateMs<OutputDecorator<Object, includeProperty>> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ OutputDecorator<Object, includeProperty> invoke() {
            return OutputDecorator.RemoteActionCompatParcelizer(IconCompatParcelizer());
        }

        public final setKeyListener<Object, Object> IconCompatParcelizer() {
            setKeyListener<Object, Object> setkeylistenerWrite = convertNumberToBigDecimal.write(get7BitOutputEscapes.this.AudioAttributesCompatParcelizer().size());
            get7BitOutputEscapes get7bitoutputescapes = get7BitOutputEscapes.this;
            int size = get7bitoutputescapes.AudioAttributesCompatParcelizer().size();
            for (int i = 0; i < size; i++) {
                includeProperty includeproperty = get7bitoutputescapes.AudioAttributesCompatParcelizer().get(i);
                OutputDecorator.write(setkeylistenerWrite, convertNumberToBigDecimal.RemoteActionCompatParcelizer(includeproperty), includeproperty);
            }
            return setkeylistenerWrite;
        }

        IconCompatParcelizer() {
        }
    }

    public final setKeyListener<Object, Object> write() {
        return ((OutputDecorator) this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer()).getAudioAttributesCompatParcelizer();
    }

    public final includeProperty AudioAttributesCompatParcelizer(int p0, Object p1) {
        return (includeProperty) OutputDecorator.AudioAttributesCompatParcelizer(write(), p1 != null ? new includeEmptyObject(Integer.valueOf(p0), p1) : Integer.valueOf(p0));
    }

    public final boolean RemoteActionCompatParcelizer(includeProperty p0) {
        return this.read.add(p0);
    }

    public final List<includeProperty> RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final void AudioAttributesCompatParcelizer(int p0, int p1) {
        char c = 7;
        long j = -9187201950435737472L;
        if (p0 > p1) {
            setProvider<_nextTokenWithBuffering> setprovider = this.IconCompatParcelizer;
            Object[] objArr = setprovider.MediaBrowserCompatItemReceiver;
            long[] jArr = setprovider.RemoteActionCompatParcelizer;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j2 = jArr[i];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j2 & 255) < 128) {
                            _nextTokenWithBuffering _nexttokenwithbuffering = (_nextTokenWithBuffering) objArr[(i << 3) + i3];
                            int write = _nexttokenwithbuffering.getWrite();
                            if (write == p0) {
                                _nexttokenwithbuffering.AudioAttributesCompatParcelizer(p1);
                            } else if (p1 <= write && write < p0) {
                                _nexttokenwithbuffering.AudioAttributesCompatParcelizer(write + 1);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        } else {
            if (p1 <= p0) {
                return;
            }
            setProvider<_nextTokenWithBuffering> setprovider2 = this.IconCompatParcelizer;
            Object[] objArr2 = setprovider2.MediaBrowserCompatItemReceiver;
            long[] jArr2 = setprovider2.RemoteActionCompatParcelizer;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j3 = jArr2[i4];
                if ((((~j3) << c) & j3 & j) != j) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j3 & 255) < 128) {
                            _nextTokenWithBuffering _nexttokenwithbuffering2 = (_nextTokenWithBuffering) objArr2[(i4 << 3) + i6];
                            int write2 = _nexttokenwithbuffering2.getWrite();
                            if (write2 == p0) {
                                _nexttokenwithbuffering2.AudioAttributesCompatParcelizer(p1);
                            } else if (p0 + 1 <= write2 && write2 < p1) {
                                _nexttokenwithbuffering2.AudioAttributesCompatParcelizer(write2 - 1);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 == length2) {
                    return;
                }
                i4++;
                c = 7;
                j = -9187201950435737472L;
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(int p0, int p1, int p2) {
        char c = 7;
        long j = -9187201950435737472L;
        if (p0 > p1) {
            setProvider<_nextTokenWithBuffering> setprovider = this.IconCompatParcelizer;
            Object[] objArr = setprovider.MediaBrowserCompatItemReceiver;
            long[] jArr = setprovider.RemoteActionCompatParcelizer;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j2 = jArr[i];
                if ((((~j2) << 7) & j2 & j) != j) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j2 & 255) < 128) {
                            _nextTokenWithBuffering _nexttokenwithbuffering = (_nextTokenWithBuffering) objArr[(i << 3) + i3];
                            int read = _nexttokenwithbuffering.getRead();
                            if (p0 <= read && read < p0 + p2) {
                                _nexttokenwithbuffering.write((read - p0) + p1);
                            } else if (p1 <= read && read < p0) {
                                _nexttokenwithbuffering.write(read + p2);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                }
                i++;
                j = -9187201950435737472L;
            }
        } else {
            if (p1 <= p0) {
                return;
            }
            setProvider<_nextTokenWithBuffering> setprovider2 = this.IconCompatParcelizer;
            Object[] objArr2 = setprovider2.MediaBrowserCompatItemReceiver;
            long[] jArr2 = setprovider2.RemoteActionCompatParcelizer;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j3 = jArr2[i4];
                if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j3 & 255) < 128) {
                            _nextTokenWithBuffering _nexttokenwithbuffering2 = (_nextTokenWithBuffering) objArr2[(i4 << 3) + i6];
                            int read2 = _nexttokenwithbuffering2.getRead();
                            if (p0 <= read2 && read2 < p0 + p2) {
                                _nexttokenwithbuffering2.write((read2 - p0) + p1);
                            } else if (p0 + 1 <= read2 && read2 < p1) {
                                _nexttokenwithbuffering2.write(read2 - p2);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 == length2) {
                    return;
                }
                i4++;
                c = 7;
            }
        }
    }

    public final void IconCompatParcelizer(includeProperty p0, int p1) {
        this.IconCompatParcelizer.write(p0.getRead(), new _nextTokenWithBuffering(-1, p1, 0));
    }

    public final boolean IconCompatParcelizer(int p0, int p1) {
        int read;
        _nextTokenWithBuffering _nexttokenwithbufferingAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        if (_nexttokenwithbufferingAudioAttributesCompatParcelizer == null) {
            return false;
        }
        int read2 = _nexttokenwithbufferingAudioAttributesCompatParcelizer.getRead();
        int audioAttributesCompatParcelizer = p1 - _nexttokenwithbufferingAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        _nexttokenwithbufferingAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p1);
        if (audioAttributesCompatParcelizer == 0) {
            return true;
        }
        setProvider<_nextTokenWithBuffering> setprovider = this.IconCompatParcelizer;
        Object[] objArr = setprovider.MediaBrowserCompatItemReceiver;
        long[] jArr = setprovider.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        _nextTokenWithBuffering _nexttokenwithbuffering = (_nextTokenWithBuffering) objArr[(i << 3) + i3];
                        if (_nexttokenwithbuffering.getRead() >= read2 && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_nexttokenwithbuffering, _nexttokenwithbufferingAudioAttributesCompatParcelizer) && (read = _nexttokenwithbuffering.getRead() + audioAttributesCompatParcelizer) >= 0) {
                            _nexttokenwithbuffering.write(read);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final int AudioAttributesCompatParcelizer(includeProperty p0) {
        _nextTokenWithBuffering _nexttokenwithbufferingAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0.getRead());
        if (_nexttokenwithbufferingAudioAttributesCompatParcelizer != null) {
            return _nexttokenwithbufferingAudioAttributesCompatParcelizer.getWrite();
        }
        return -1;
    }

    public final int write(includeProperty p0) {
        _nextTokenWithBuffering _nexttokenwithbufferingAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0.getRead());
        if (_nexttokenwithbufferingAudioAttributesCompatParcelizer != null) {
            return _nexttokenwithbufferingAudioAttributesCompatParcelizer.getRead();
        }
        return -1;
    }

    public final int read(includeProperty p0) {
        _nextTokenWithBuffering _nexttokenwithbufferingAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0.getRead());
        return _nexttokenwithbufferingAudioAttributesCompatParcelizer != null ? _nexttokenwithbufferingAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() : p0.getRemoteActionCompatParcelizer();
    }
}
