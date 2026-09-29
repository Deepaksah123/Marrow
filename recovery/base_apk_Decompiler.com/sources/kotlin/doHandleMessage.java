package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.InterfaceC0165copy;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes5.dex */
final class doHandleMessage implements getOutputBuffer {
    private final Map<Class<?>, dequeueOutputBufferIndex<?>> AudioAttributesImplApi21Parcelizer;
    private final recycleMessageParams AudioAttributesImplApi26Parcelizer = new recycleMessageParams(this);
    private OutputStream AudioAttributesImplBaseParcelizer;
    private final Map<Class<?>, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<?>> MediaBrowserCompatItemReceiver;
    private final dequeueOutputBufferIndex<Object> read;
    private static final Charset IconCompatParcelizer = Charset.forName(CharsetNames.UTF_8);
    private static final needsReconfiguration write = needsReconfiguration.RemoteActionCompatParcelizer("key").AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(1).AudioAttributesCompatParcelizer()).IconCompatParcelizer();
    private static final needsReconfiguration RemoteActionCompatParcelizer = needsReconfiguration.RemoteActionCompatParcelizer(AppMeasurementSdk.ConditionalUserProperty.VALUE).AudioAttributesCompatParcelizer(AsynchronousMediaCodecAdapter1.write().AudioAttributesCompatParcelizer(2).AudioAttributesCompatParcelizer()).IconCompatParcelizer();
    private static final dequeueOutputBufferIndex<Map.Entry<Object, Object>> AudioAttributesCompatParcelizer = new dequeueOutputBufferIndex() { // from class: o.AsynchronousMediaCodecBufferEnqueuer
        @Override // kotlin.createCallbackThreadLabel
        public final void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            doHandleMessage.write((Map.Entry) obj, getoutputbuffer);
        }
    };

    static /* synthetic */ void write(Map.Entry entry, getOutputBuffer getoutputbuffer) throws IOException {
        getoutputbuffer.read(write, entry.getKey());
        getoutputbuffer.read(RemoteActionCompatParcelizer, entry.getValue());
    }

    doHandleMessage(OutputStream outputStream, Map<Class<?>, dequeueOutputBufferIndex<?>> map, Map<Class<?>, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<?>> map2, dequeueOutputBufferIndex<Object> dequeueoutputbufferindex) {
        this.AudioAttributesImplBaseParcelizer = outputStream;
        this.AudioAttributesImplApi21Parcelizer = map;
        this.MediaBrowserCompatItemReceiver = map2;
        this.read = dequeueoutputbufferindex;
    }

    @Override // kotlin.getOutputBuffer
    public final getOutputBuffer read(needsReconfiguration needsreconfiguration, Object obj) throws IOException {
        return read(needsreconfiguration, obj, true);
    }

    final getOutputBuffer read(needsReconfiguration needsreconfiguration, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            AudioAttributesCompatParcelizer((read(needsreconfiguration) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(IconCompatParcelizer);
            AudioAttributesCompatParcelizer(bytes.length);
            this.AudioAttributesImplBaseParcelizer.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                read(needsreconfiguration, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                write(AudioAttributesCompatParcelizer, needsreconfiguration, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return IconCompatParcelizer(needsreconfiguration, ((Double) obj).doubleValue(), z);
        }
        if (obj instanceof Float) {
            return AudioAttributesCompatParcelizer(needsreconfiguration, ((Float) obj).floatValue(), z);
        }
        if (obj instanceof Number) {
            return IconCompatParcelizer(needsreconfiguration, ((Number) obj).longValue(), z);
        }
        if (obj instanceof Boolean) {
            return AudioAttributesCompatParcelizer(needsreconfiguration, ((Boolean) obj).booleanValue(), z);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            AudioAttributesCompatParcelizer((read(needsreconfiguration) << 3) | 2);
            AudioAttributesCompatParcelizer(bArr.length);
            this.AudioAttributesImplBaseParcelizer.write(bArr);
            return this;
        }
        dequeueOutputBufferIndex<?> dequeueoutputbufferindex = this.AudioAttributesImplApi21Parcelizer.get(obj.getClass());
        if (dequeueoutputbufferindex != null) {
            return write(dequeueoutputbufferindex, needsreconfiguration, obj, z);
        }
        lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<?> lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecasynchronousmediacodecadapter = this.MediaBrowserCompatItemReceiver.get(obj.getClass());
        if (lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecasynchronousmediacodecadapter != null) {
            return AudioAttributesCompatParcelizer(lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecasynchronousmediacodecadapter, needsreconfiguration, obj, z);
        }
        if (obj instanceof AsynchronousMediaCodecAdapterFactoryExternalSyntheticLambda1) {
            return AudioAttributesCompatParcelizer(needsreconfiguration, ((AsynchronousMediaCodecAdapterFactoryExternalSyntheticLambda1) obj).RemoteActionCompatParcelizer());
        }
        if (obj instanceof Enum) {
            return AudioAttributesCompatParcelizer(needsreconfiguration, ((Enum) obj).ordinal());
        }
        return write(this.read, needsreconfiguration, obj, z);
    }

    @Override // kotlin.getOutputBuffer
    public final getOutputBuffer AudioAttributesCompatParcelizer(needsReconfiguration needsreconfiguration, double d) throws IOException {
        return IconCompatParcelizer(needsreconfiguration, d, true);
    }

    private getOutputBuffer IconCompatParcelizer(needsReconfiguration needsreconfiguration, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        AudioAttributesCompatParcelizer((read(needsreconfiguration) << 3) | 1);
        this.AudioAttributesImplBaseParcelizer.write(RemoteActionCompatParcelizer(8).putDouble(d).array());
        return this;
    }

    private getOutputBuffer AudioAttributesCompatParcelizer(needsReconfiguration needsreconfiguration, float f, boolean z) throws IOException {
        if (z && f == BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        AudioAttributesCompatParcelizer((read(needsreconfiguration) << 3) | 5);
        this.AudioAttributesImplBaseParcelizer.write(RemoteActionCompatParcelizer(4).putFloat(f).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getOutputBuffer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public doHandleMessage AudioAttributesCompatParcelizer(needsReconfiguration needsreconfiguration, int i) throws IOException {
        return IconCompatParcelizer(needsreconfiguration, i, true);
    }

    /* JADX INFO: renamed from: o.doHandleMessage$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[InterfaceC0165copy.AudioAttributesCompatParcelizer.values().length];
            read = iArr;
            try {
                iArr[InterfaceC0165copy.AudioAttributesCompatParcelizer.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[InterfaceC0165copy.AudioAttributesCompatParcelizer.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[InterfaceC0165copy.AudioAttributesCompatParcelizer.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private doHandleMessage IconCompatParcelizer(needsReconfiguration needsreconfiguration, int i, boolean z) throws IOException {
        if (!z || i != 0) {
            InterfaceC0165copy interfaceC0165copyIconCompatParcelizer = IconCompatParcelizer(needsreconfiguration);
            int i2 = AnonymousClass1.read[interfaceC0165copyIconCompatParcelizer.RemoteActionCompatParcelizer().ordinal()];
            if (i2 == 1) {
                AudioAttributesCompatParcelizer(interfaceC0165copyIconCompatParcelizer.IconCompatParcelizer() << 3);
                AudioAttributesCompatParcelizer(i);
                return this;
            }
            if (i2 == 2) {
                AudioAttributesCompatParcelizer(interfaceC0165copyIconCompatParcelizer.IconCompatParcelizer() << 3);
                AudioAttributesCompatParcelizer((i << 1) ^ (i >> 31));
                return this;
            }
            if (i2 == 3) {
                AudioAttributesCompatParcelizer((interfaceC0165copyIconCompatParcelizer.IconCompatParcelizer() << 3) | 5);
                this.AudioAttributesImplBaseParcelizer.write(RemoteActionCompatParcelizer(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getOutputBuffer
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public doHandleMessage RemoteActionCompatParcelizer(needsReconfiguration needsreconfiguration, long j) throws IOException {
        return IconCompatParcelizer(needsreconfiguration, j, true);
    }

    private doHandleMessage IconCompatParcelizer(needsReconfiguration needsreconfiguration, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            InterfaceC0165copy interfaceC0165copyIconCompatParcelizer = IconCompatParcelizer(needsreconfiguration);
            int i = AnonymousClass1.read[interfaceC0165copyIconCompatParcelizer.RemoteActionCompatParcelizer().ordinal()];
            if (i == 1) {
                AudioAttributesCompatParcelizer(interfaceC0165copyIconCompatParcelizer.IconCompatParcelizer() << 3);
                read(j);
                return this;
            }
            if (i == 2) {
                AudioAttributesCompatParcelizer(interfaceC0165copyIconCompatParcelizer.IconCompatParcelizer() << 3);
                read((j << 1) ^ (j >> 63));
                return this;
            }
            if (i == 3) {
                AudioAttributesCompatParcelizer((interfaceC0165copyIconCompatParcelizer.IconCompatParcelizer() << 3) | 1);
                this.AudioAttributesImplBaseParcelizer.write(RemoteActionCompatParcelizer(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getOutputBuffer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public doHandleMessage AudioAttributesCompatParcelizer(needsReconfiguration needsreconfiguration, boolean z) throws IOException {
        return AudioAttributesCompatParcelizer(needsreconfiguration, z, true);
    }

    final doHandleMessage AudioAttributesCompatParcelizer(needsReconfiguration needsreconfiguration, boolean z, boolean z2) throws IOException {
        return IconCompatParcelizer(needsreconfiguration, z ? 1 : 0, z2);
    }

    final doHandleMessage AudioAttributesCompatParcelizer(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        dequeueOutputBufferIndex<?> dequeueoutputbufferindex = this.AudioAttributesImplApi21Parcelizer.get(obj.getClass());
        if (dequeueoutputbufferindex != null) {
            dequeueoutputbufferindex.RemoteActionCompatParcelizer(obj, this);
            return this;
        }
        StringBuilder sb = new StringBuilder("No encoder for ");
        sb.append(obj.getClass());
        throw new dequeueInputBufferIndex(sb.toString());
    }

    private <T> doHandleMessage write(dequeueOutputBufferIndex<T> dequeueoutputbufferindex, needsReconfiguration needsreconfiguration, T t, boolean z) throws IOException {
        long jIconCompatParcelizer = IconCompatParcelizer(dequeueoutputbufferindex, t);
        if (z && jIconCompatParcelizer == 0) {
            return this;
        }
        AudioAttributesCompatParcelizer((read(needsreconfiguration) << 3) | 2);
        read(jIconCompatParcelizer);
        dequeueoutputbufferindex.RemoteActionCompatParcelizer(t, this);
        return this;
    }

    private <T> long IconCompatParcelizer(dequeueOutputBufferIndex<T> dequeueoutputbufferindex, T t) throws IOException {
        onFrameRendered onframerendered = new onFrameRendered();
        try {
            OutputStream outputStream = this.AudioAttributesImplBaseParcelizer;
            this.AudioAttributesImplBaseParcelizer = onframerendered;
            try {
                dequeueoutputbufferindex.RemoteActionCompatParcelizer(t, this);
                this.AudioAttributesImplBaseParcelizer = outputStream;
                long jWrite = onframerendered.write();
                onframerendered.close();
                return jWrite;
            } catch (Throwable th) {
                this.AudioAttributesImplBaseParcelizer = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                onframerendered.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> doHandleMessage AudioAttributesCompatParcelizer(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<T> lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecasynchronousmediacodecadapter, needsReconfiguration needsreconfiguration, T t, boolean z) throws IOException {
        this.AudioAttributesImplApi26Parcelizer.read(needsreconfiguration, z);
        lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecasynchronousmediacodecadapter.RemoteActionCompatParcelizer(t, this.AudioAttributesImplApi26Parcelizer);
        return this;
    }

    private static ByteBuffer RemoteActionCompatParcelizer(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static int read(needsReconfiguration needsreconfiguration) {
        InterfaceC0165copy interfaceC0165copy = (InterfaceC0165copy) needsreconfiguration.read(InterfaceC0165copy.class);
        if (interfaceC0165copy == null) {
            throw new dequeueInputBufferIndex("Field has no @Protobuf config");
        }
        return interfaceC0165copy.IconCompatParcelizer();
    }

    private static InterfaceC0165copy IconCompatParcelizer(needsReconfiguration needsreconfiguration) {
        InterfaceC0165copy interfaceC0165copy = (InterfaceC0165copy) needsreconfiguration.read(InterfaceC0165copy.class);
        if (interfaceC0165copy != null) {
            return interfaceC0165copy;
        }
        throw new dequeueInputBufferIndex("Field has no @Protobuf config");
    }

    private void AudioAttributesCompatParcelizer(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.AudioAttributesImplBaseParcelizer.write((i & 127) | 128);
            i >>>= 7;
        }
        this.AudioAttributesImplBaseParcelizer.write(i & 127);
    }

    private void read(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.AudioAttributesImplBaseParcelizer.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.AudioAttributesImplBaseParcelizer.write(((int) j) & 127);
    }
}
