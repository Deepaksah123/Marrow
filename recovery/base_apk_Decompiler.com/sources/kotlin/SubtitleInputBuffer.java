package kotlin;

import kotlin.Cea608Decoder;
import kotlin.invokeUpdateOutputInternal;
import kotlin.readFromInput;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SubtitleInputBuffer<V extends invokeUpdateOutputInternal, T> implements Cea608Decoder<V, T> {
    private readFromInput.read<T> IconCompatParcelizer;
    public T[] RemoteActionCompatParcelizer;
    private readFromInput.RemoteActionCompatParcelizer<T> read;
    private Cea608Decoder.write write;

    @Override // kotlin.Cea608Decoder
    public int AudioAttributesCompatParcelizer(int i) {
        return 0;
    }

    protected int[] read(int i) {
        return null;
    }

    @Override // kotlin.Cea608Decoder
    public void RemoteActionCompatParcelizer(final V v, final int i) {
        v.IconCompatParcelizer(i);
        int[] iArr = read(AudioAttributesCompatParcelizer(i));
        if (iArr != null) {
            for (final int i2 : iArr) {
                v.write(i2, new invokeUpdateOutputInternal.RemoteActionCompatParcelizer() { // from class: o.SubtitleOutputBuffer
                    @Override // o.invokeUpdateOutputInternal.RemoteActionCompatParcelizer
                    public final void RemoteActionCompatParcelizer() {
                        SubtitleInputBuffer subtitleInputBuffer = this.AudioAttributesCompatParcelizer;
                        invokeUpdateOutputInternal invokeupdateoutputinternal = v;
                        subtitleInputBuffer.AudioAttributesCompatParcelizer(i2, i);
                    }
                });
            }
        }
    }

    @Override // kotlin.Cea608Decoder
    public int read() {
        T[] tArr = this.RemoteActionCompatParcelizer;
        if (tArr != null) {
            return tArr.length;
        }
        return 0;
    }

    @Override // kotlin.Cea608Decoder
    public final void RemoteActionCompatParcelizer(int i) {
        readFromInput.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer = this.read;
        if (remoteActionCompatParcelizer != null) {
            T[] tArr = this.RemoteActionCompatParcelizer;
            remoteActionCompatParcelizer.read(i, tArr != null ? tArr[i] : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void AudioAttributesCompatParcelizer(int i, int i2) {
        T[] tArr;
        readFromInput.read<T> readVar = this.IconCompatParcelizer;
        if (readVar == null || (tArr = this.RemoteActionCompatParcelizer) == null || tArr.length <= i2) {
            return;
        }
        readVar.IconCompatParcelizer(i, i2, tArr[i2]);
    }

    @Override // kotlin.Cea608Decoder
    public final void AudioAttributesCompatParcelizer(T[] tArr) {
        this.RemoteActionCompatParcelizer = tArr;
        IconCompatParcelizer();
    }

    @Override // kotlin.Cea608Decoder
    public final void write(readFromInput.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        this.read = remoteActionCompatParcelizer;
    }

    @Override // kotlin.Cea608Decoder
    public final void RemoteActionCompatParcelizer(readFromInput.read<T> readVar) {
        this.IconCompatParcelizer = readVar;
    }

    @Override // kotlin.Cea608Decoder
    public final void IconCompatParcelizer(Cea608Decoder.write writeVar) {
        this.write = writeVar;
    }

    public final void IconCompatParcelizer() {
        Cea608Decoder.write writeVar = this.write;
        if (writeVar != null) {
            writeVar.RemoteActionCompatParcelizer();
        }
    }

    public final void d_(int i) {
        Cea608Decoder.write writeVar = this.write;
        if (writeVar != null) {
            writeVar.AudioAttributesCompatParcelizer(i);
        }
    }

    public final void e_(int i) {
        Cea608Decoder.write writeVar = this.write;
        if (writeVar != null) {
            writeVar.read(2, i);
        }
    }
}
