package kotlin;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class queueSecureInputBuffer implements setOnFrameRenderedListener<queueSecureInputBuffer> {
    private static final dequeueOutputBufferIndex<Object> read = new dequeueOutputBufferIndex() { // from class: o.setOutputSurface
        @Override // kotlin.createCallbackThreadLabel
        public final void RemoteActionCompatParcelizer(Object obj, getOutputBuffer getoutputbuffer) throws IOException {
            queueSecureInputBuffer.IconCompatParcelizer(obj);
        }
    };
    private static final lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<String> IconCompatParcelizer = new lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter() { // from class: o.setParameters
        @Override // kotlin.createCallbackThreadLabel
        public final void RemoteActionCompatParcelizer(Object obj, getInputBuffer getinputbuffer) throws IOException {
            getinputbuffer.AudioAttributesCompatParcelizer((String) obj);
        }
    };
    private static final lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<Boolean> RemoteActionCompatParcelizer = new lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter() { // from class: o.AsynchronousMediaCodecAdapterFactoryExternalSyntheticLambda0
        @Override // kotlin.createCallbackThreadLabel
        public final void RemoteActionCompatParcelizer(Object obj, getInputBuffer getinputbuffer) throws IOException {
            getinputbuffer.AudioAttributesCompatParcelizer(((Boolean) obj).booleanValue());
        }
    };
    private static final write AudioAttributesCompatParcelizer = new write(0);
    private final Map<Class<?>, dequeueOutputBufferIndex<?>> AudioAttributesImplApi21Parcelizer = new HashMap();
    private final Map<Class<?>, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<?>> MediaBrowserCompatItemReceiver = new HashMap();
    private dequeueOutputBufferIndex<Object> write = read;
    private boolean AudioAttributesImplBaseParcelizer = false;

    static /* synthetic */ void IconCompatParcelizer(Object obj) throws IOException {
        StringBuilder sb = new StringBuilder("Couldn't find encoder for type ");
        sb.append(obj.getClass().getCanonicalName());
        throw new dequeueInputBufferIndex(sb.toString());
    }

    static final class write implements lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<Date> {
        private static final DateFormat AudioAttributesCompatParcelizer;

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        @Override // kotlin.createCallbackThreadLabel
        public final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(Object obj, getInputBuffer getinputbuffer) throws IOException {
            RemoteActionCompatParcelizer((Date) obj, getinputbuffer);
        }

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            AudioAttributesCompatParcelizer = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private static void RemoteActionCompatParcelizer(Date date, getInputBuffer getinputbuffer) throws IOException {
            getinputbuffer.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer.format(date));
        }
    }

    public queueSecureInputBuffer() {
        RemoteActionCompatParcelizer(String.class, IconCompatParcelizer);
        RemoteActionCompatParcelizer(Boolean.class, RemoteActionCompatParcelizer);
        RemoteActionCompatParcelizer(Date.class, AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setOnFrameRenderedListener
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public <T> queueSecureInputBuffer RemoteActionCompatParcelizer(Class<T> cls, dequeueOutputBufferIndex<? super T> dequeueoutputbufferindex) {
        this.AudioAttributesImplApi21Parcelizer.put(cls, dequeueoutputbufferindex);
        this.MediaBrowserCompatItemReceiver.remove(cls);
        return this;
    }

    private <T> queueSecureInputBuffer RemoteActionCompatParcelizer(Class<T> cls, lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecAsynchronousMediaCodecAdapter<? super T> lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecasynchronousmediacodecadapter) {
        this.MediaBrowserCompatItemReceiver.put(cls, lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecasynchronousmediacodecadapter);
        this.AudioAttributesImplApi21Parcelizer.remove(cls);
        return this;
    }

    public final queueSecureInputBuffer read(AsynchronousMediaCodecAdapterExternalSyntheticLambda0 asynchronousMediaCodecAdapterExternalSyntheticLambda0) {
        asynchronousMediaCodecAdapterExternalSyntheticLambda0.read(this);
        return this;
    }

    public final queueSecureInputBuffer read() {
        this.AudioAttributesImplBaseParcelizer = true;
        return this;
    }

    public final maybeBlockOnQueueing AudioAttributesCompatParcelizer() {
        return new maybeBlockOnQueueing() { // from class: o.queueSecureInputBuffer.2
            @Override // kotlin.maybeBlockOnQueueing
            public final void IconCompatParcelizer(Object obj, Writer writer) throws IOException {
                createAdapter createadapter = new createAdapter(writer, queueSecureInputBuffer.this.AudioAttributesImplApi21Parcelizer, queueSecureInputBuffer.this.MediaBrowserCompatItemReceiver, queueSecureInputBuffer.this.write, queueSecureInputBuffer.this.AudioAttributesImplBaseParcelizer);
                createadapter.RemoteActionCompatParcelizer(obj);
                createadapter.IconCompatParcelizer();
            }

            @Override // kotlin.maybeBlockOnQueueing
            public final String RemoteActionCompatParcelizer(Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    IconCompatParcelizer(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }
}
