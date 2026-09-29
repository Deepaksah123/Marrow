package kotlin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.blockUntilHandlerThreadIsIdle;

/* JADX INFO: loaded from: classes5.dex */
public final class blockUntilHandlerThreadIsIdle {
    private final dequeueOutputBufferIndex<Object> AudioAttributesCompatParcelizer;
    private final Map<Class<?>, dequeueOutputBufferIndex<?>> IconCompatParcelizer;
    private final Map<Class<?>, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<?>> RemoteActionCompatParcelizer;

    blockUntilHandlerThreadIsIdle(Map<Class<?>, dequeueOutputBufferIndex<?>> map, Map<Class<?>, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<?>> map2, dequeueOutputBufferIndex<Object> dequeueoutputbufferindex) {
        this.IconCompatParcelizer = map;
        this.RemoteActionCompatParcelizer = map2;
        this.AudioAttributesCompatParcelizer = dequeueoutputbufferindex;
    }

    private void AudioAttributesCompatParcelizer(Object obj, OutputStream outputStream) throws IOException {
        new doHandleMessage(outputStream, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer(obj);
    }

    public final byte[] write(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AudioAttributesCompatParcelizer(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static IconCompatParcelizer IconCompatParcelizer() {
        return new IconCompatParcelizer();
    }

    public static final class IconCompatParcelizer implements setOnFrameRenderedListener<IconCompatParcelizer> {
        private static final dequeueOutputBufferIndex<Object> IconCompatParcelizer = new dequeueOutputBufferIndex() { // from class: o.doQueueInputBuffer
            @Override // kotlin.createCallbackThreadLabel
            public final void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
                blockUntilHandlerThreadIsIdle.IconCompatParcelizer.write(obj);
            }
        };
        private final Map<Class<?>, dequeueOutputBufferIndex<?>> AudioAttributesCompatParcelizer = new HashMap();
        private final Map<Class<?>, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<?>> read = new HashMap();
        private dequeueOutputBufferIndex<Object> write = IconCompatParcelizer;

        static /* synthetic */ void write(Object obj) throws IOException {
            StringBuilder sb = new StringBuilder("Couldn't find encoder for type ");
            sb.append(obj.getClass().getCanonicalName());
            throw new dequeueInputBufferIndex(sb.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.setOnFrameRenderedListener
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public <U> IconCompatParcelizer RemoteActionCompatParcelizer(Class<U> cls, dequeueOutputBufferIndex<? super U> dequeueoutputbufferindex) {
            this.AudioAttributesCompatParcelizer.put(cls, dequeueoutputbufferindex);
            this.read.remove(cls);
            return this;
        }

        public final IconCompatParcelizer write(AsynchronousMediaCodecAdapterExternalSyntheticLambda0 asynchronousMediaCodecAdapterExternalSyntheticLambda0) {
            asynchronousMediaCodecAdapterExternalSyntheticLambda0.read(this);
            return this;
        }

        public final blockUntilHandlerThreadIsIdle RemoteActionCompatParcelizer() {
            return new blockUntilHandlerThreadIsIdle(new HashMap(this.AudioAttributesCompatParcelizer), new HashMap(this.read), this.write);
        }
    }
}
