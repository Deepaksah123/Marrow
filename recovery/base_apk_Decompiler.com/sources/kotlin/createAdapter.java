package kotlin;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class createAdapter implements getOutputBuffer, getInputBuffer {
    private final Map<Class<?>, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<?>> AudioAttributesImplApi21Parcelizer;
    private final Map<Class<?>, dequeueOutputBufferIndex<?>> AudioAttributesImplApi26Parcelizer;
    private final dequeueOutputBufferIndex<Object> IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final JsonWriter read;
    private createAdapter AudioAttributesCompatParcelizer = null;
    private boolean write = true;

    createAdapter(Writer writer, Map<Class<?>, dequeueOutputBufferIndex<?>> map, Map<Class<?>, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<?>> map2, dequeueOutputBufferIndex<Object> dequeueoutputbufferindex, boolean z) {
        this.read = new JsonWriter(writer);
        this.AudioAttributesImplApi26Parcelizer = map;
        this.AudioAttributesImplApi21Parcelizer = map2;
        this.IconCompatParcelizer = dequeueoutputbufferindex;
        this.RemoteActionCompatParcelizer = z;
    }

    private createAdapter read(String str, Object obj) throws IOException {
        if (this.RemoteActionCompatParcelizer) {
            return IconCompatParcelizer(str, obj);
        }
        return AudioAttributesCompatParcelizer(str, obj);
    }

    private createAdapter AudioAttributesCompatParcelizer(String str, double d) throws IOException {
        RemoteActionCompatParcelizer();
        this.read.name(str);
        return RemoteActionCompatParcelizer(d);
    }

    private createAdapter IconCompatParcelizer(String str, int i) throws IOException {
        RemoteActionCompatParcelizer();
        this.read.name(str);
        return read(i);
    }

    private createAdapter read(String str, long j) throws IOException {
        RemoteActionCompatParcelizer();
        this.read.name(str);
        return IconCompatParcelizer(j);
    }

    private createAdapter AudioAttributesCompatParcelizer(String str, boolean z) throws IOException {
        RemoteActionCompatParcelizer();
        this.read.name(str);
        return AudioAttributesCompatParcelizer(z);
    }

    @Override // kotlin.getOutputBuffer
    public final getOutputBuffer read(needsReconfiguration needsreconfiguration, Object obj) throws IOException {
        return read(needsreconfiguration.read(), obj);
    }

    @Override // kotlin.getOutputBuffer
    public final getOutputBuffer AudioAttributesCompatParcelizer(needsReconfiguration needsreconfiguration, double d) throws IOException {
        return AudioAttributesCompatParcelizer(needsreconfiguration.read(), d);
    }

    @Override // kotlin.getOutputBuffer
    public final getOutputBuffer AudioAttributesCompatParcelizer(needsReconfiguration needsreconfiguration, int i) throws IOException {
        return IconCompatParcelizer(needsreconfiguration.read(), i);
    }

    @Override // kotlin.getOutputBuffer
    public final getOutputBuffer RemoteActionCompatParcelizer(needsReconfiguration needsreconfiguration, long j) throws IOException {
        return read(needsreconfiguration.read(), j);
    }

    @Override // kotlin.getOutputBuffer
    public final getOutputBuffer AudioAttributesCompatParcelizer(needsReconfiguration needsreconfiguration, boolean z) throws IOException {
        return AudioAttributesCompatParcelizer(needsreconfiguration.read(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getInputBuffer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public createAdapter AudioAttributesCompatParcelizer(String str) throws IOException {
        RemoteActionCompatParcelizer();
        this.read.value(str);
        return this;
    }

    private createAdapter RemoteActionCompatParcelizer(double d) throws IOException {
        RemoteActionCompatParcelizer();
        this.read.value(d);
        return this;
    }

    private createAdapter read(int i) throws IOException {
        RemoteActionCompatParcelizer();
        this.read.value(i);
        return this;
    }

    private createAdapter IconCompatParcelizer(long j) throws IOException {
        RemoteActionCompatParcelizer();
        this.read.value(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getInputBuffer
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public createAdapter AudioAttributesCompatParcelizer(boolean z) throws IOException {
        RemoteActionCompatParcelizer();
        this.read.value(z);
        return this;
    }

    private createAdapter RemoteActionCompatParcelizer(byte[] bArr) throws IOException {
        RemoteActionCompatParcelizer();
        if (bArr == null) {
            this.read.nullValue();
            return this;
        }
        this.read.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    final createAdapter RemoteActionCompatParcelizer(Object obj) throws IOException {
        if (obj == null) {
            this.read.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.read.value((Number) obj);
            return this;
        }
        int i = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return RemoteActionCompatParcelizer((byte[]) obj);
            }
            this.read.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.read.value(r7[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    IconCompatParcelizer(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.read.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.read.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    RemoteActionCompatParcelizer(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    RemoteActionCompatParcelizer(objArr[i]);
                    i++;
                }
            }
            this.read.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            this.read.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer(it.next());
            }
            this.read.endArray();
            return this;
        }
        if (obj instanceof Map) {
            this.read.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    read((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new dequeueInputBufferIndex(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.read.endObject();
            return this;
        }
        dequeueOutputBufferIndex<?> dequeueoutputbufferindex = this.AudioAttributesImplApi26Parcelizer.get(obj.getClass());
        if (dequeueoutputbufferindex != null) {
            return write(dequeueoutputbufferindex, obj, false);
        }
        lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<?> lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecasynchronousmediacodecadapter = this.AudioAttributesImplApi21Parcelizer.get(obj.getClass());
        if (lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecasynchronousmediacodecadapter != null) {
            lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecasynchronousmediacodecadapter.RemoteActionCompatParcelizer(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            if (obj instanceof AsynchronousMediaCodecAdapterFactory) {
                read(((AsynchronousMediaCodecAdapterFactory) obj).getIconCompatParcelizer());
                return this;
            }
            AudioAttributesCompatParcelizer(((Enum) obj).name());
            return this;
        }
        return write(this.IconCompatParcelizer, obj, false);
    }

    private createAdapter write(dequeueOutputBufferIndex<Object> dequeueoutputbufferindex, Object obj, boolean z) throws IOException {
        this.read.beginObject();
        dequeueoutputbufferindex.RemoteActionCompatParcelizer(obj, this);
        this.read.endObject();
        return this;
    }

    final void IconCompatParcelizer() throws IOException {
        RemoteActionCompatParcelizer();
        this.read.flush();
    }

    private void RemoteActionCompatParcelizer() throws IOException {
        if (!this.write) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    private createAdapter AudioAttributesCompatParcelizer(String str, Object obj) throws IOException, dequeueInputBufferIndex {
        RemoteActionCompatParcelizer();
        this.read.name(str);
        if (obj == null) {
            this.read.nullValue();
            return this;
        }
        return RemoteActionCompatParcelizer(obj);
    }

    private createAdapter IconCompatParcelizer(String str, Object obj) throws IOException, dequeueInputBufferIndex {
        if (obj == null) {
            return this;
        }
        RemoteActionCompatParcelizer();
        this.read.name(str);
        return RemoteActionCompatParcelizer(obj);
    }
}
