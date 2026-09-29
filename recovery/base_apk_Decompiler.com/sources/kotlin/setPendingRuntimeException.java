package kotlin;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import kotlin.maybeThrowInternalException;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class setPendingRuntimeException implements AsynchronousMediaCodecCallback, maybeThrowInternalException {
    private final onInputBufferAvailable<EventMessageDecoder> AudioAttributesCompatParcelizer;
    private final Context IconCompatParcelizer;
    private final onInputBufferAvailable<isFlushingOrShutdown> RemoteActionCompatParcelizer;
    private final Executor read;
    private final Set<flushInternal> write;

    public final Task<Void> AudioAttributesImplApi21Parcelizer() {
        if (this.write.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!_findExplicitStringFactoryMethod.read(this.IconCompatParcelizer)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.read, new Callable() { // from class: o.addOutputFormat
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.RemoteActionCompatParcelizer.write();
            }
        });
    }

    final /* synthetic */ Void write() throws Exception {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer(System.currentTimeMillis(), this.AudioAttributesCompatParcelizer.write().IconCompatParcelizer());
        }
        return null;
    }

    @Override // kotlin.AsynchronousMediaCodecCallback
    public final Task<String> RemoteActionCompatParcelizer() {
        if (!_findExplicitStringFactoryMethod.read(this.IconCompatParcelizer)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.read, new Callable() { // from class: o.AsynchronousMediaCodecBufferEnqueuer1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.write.read();
            }
        });
    }

    final /* synthetic */ String read() throws Exception {
        String string;
        synchronized (this) {
            isFlushingOrShutdown isflushingorshutdownWrite = this.RemoteActionCompatParcelizer.write();
            List<maybeThrowMediaCodecException> listIconCompatParcelizer = isflushingorshutdownWrite.IconCompatParcelizer();
            isflushingorshutdownWrite.RemoteActionCompatParcelizer();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < listIconCompatParcelizer.size(); i++) {
                maybeThrowMediaCodecException maybethrowmediacodecexception = listIconCompatParcelizer.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", maybethrowmediacodecexception.RemoteActionCompatParcelizer());
                jSONObject.put("dates", new JSONArray((Collection) maybethrowmediacodecexception.AudioAttributesCompatParcelizer()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes(CharsetNames.UTF_8));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    string = byteArrayOutputStream.toString(CharsetNames.UTF_8);
                } finally {
                }
            } finally {
            }
        }
        return string;
    }

    private setPendingRuntimeException(final Context context, final String str, Set<flushInternal> set, onInputBufferAvailable<EventMessageDecoder> oninputbufferavailable, Executor executor) {
        this((onInputBufferAvailable<isFlushingOrShutdown>) new onInputBufferAvailable() { // from class: o.shutdown
            @Override // kotlin.onInputBufferAvailable
            public final Object write() {
                return setPendingRuntimeException.write(context, str);
            }
        }, set, executor, oninputbufferavailable, context);
    }

    static /* synthetic */ isFlushingOrShutdown write(Context context, String str) {
        return new isFlushingOrShutdown(context, str);
    }

    private setPendingRuntimeException(onInputBufferAvailable<isFlushingOrShutdown> oninputbufferavailable, Set<flushInternal> set, Executor executor, onInputBufferAvailable<EventMessageDecoder> oninputbufferavailable2, Context context) {
        this.RemoteActionCompatParcelizer = oninputbufferavailable;
        this.write = set;
        this.read = executor;
        this.AudioAttributesCompatParcelizer = oninputbufferavailable2;
        this.IconCompatParcelizer = context;
    }

    public static FlacReaderFlacOggSeeker<setPendingRuntimeException> IconCompatParcelizer() {
        final packetFinished packetfinishedRemoteActionCompatParcelizer = packetFinished.RemoteActionCompatParcelizer(FlacReader.class, Executor.class);
        return FlacReaderFlacOggSeeker.RemoteActionCompatParcelizer(setPendingRuntimeException.class, AsynchronousMediaCodecCallback.class, maybeThrowInternalException.class).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) Context.class)).RemoteActionCompatParcelizer(convertGranuleToTime.read((Class<?>) FirebaseApp.class)).RemoteActionCompatParcelizer(convertGranuleToTime.MediaBrowserCompatItemReceiver(flushInternal.class)).RemoteActionCompatParcelizer(convertGranuleToTime.AudioAttributesCompatParcelizer(EventMessageDecoder.class)).RemoteActionCompatParcelizer(convertGranuleToTime.write((packetFinished<?>) packetfinishedRemoteActionCompatParcelizer)).write(new OggPageHeader() { // from class: o.r8lambdaKVEDZ377Zq1ESAwRPuhxvl14BM
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return setPendingRuntimeException.IconCompatParcelizer(packetfinishedRemoteActionCompatParcelizer, oggExtractor);
            }
        }).read();
    }

    static /* synthetic */ setPendingRuntimeException IconCompatParcelizer(packetFinished packetfinished, OggExtractor oggExtractor) {
        return new setPendingRuntimeException((Context) oggExtractor.read(Context.class), ((FirebaseApp) oggExtractor.read(FirebaseApp.class)).MediaBrowserCompatCustomActionResultReceiver(), (Set<flushInternal>) oggExtractor.AudioAttributesCompatParcelizer(flushInternal.class), (onInputBufferAvailable<EventMessageDecoder>) oggExtractor.write(EventMessageDecoder.class), (Executor) oggExtractor.AudioAttributesCompatParcelizer(packetfinished));
    }

    @Override // kotlin.maybeThrowInternalException
    public final maybeThrowInternalException.read AudioAttributesCompatParcelizer() {
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            isFlushingOrShutdown isflushingorshutdownWrite = this.RemoteActionCompatParcelizer.write();
            if (isflushingorshutdownWrite.read(jCurrentTimeMillis)) {
                isflushingorshutdownWrite.AudioAttributesCompatParcelizer();
                return maybeThrowInternalException.read.GLOBAL;
            }
            return maybeThrowInternalException.read.NONE;
        }
    }
}
