package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class readSampleData implements readFormat {
    private final readPcrFromPacket AudioAttributesCompatParcelizer;
    private final numOutputBytesToFrames AudioAttributesImplApi21Parcelizer;
    private final AtomicReference<TaskCompletionSource<readFileType>> AudioAttributesImplApi26Parcelizer;
    private final decodeBlockForChannel AudioAttributesImplBaseParcelizer;
    private final Id3Reader IconCompatParcelizer;
    private final skipToSampleData MediaBrowserCompatItemReceiver;
    private final Context RemoteActionCompatParcelizer;
    private final isVclBodyNalUnit read;
    private final AtomicReference<readFileType> write;

    private readSampleData(Context context, decodeBlockForChannel decodeblockforchannel, isVclBodyNalUnit isvclbodynalunit, skipToSampleData skiptosampledata, readPcrFromPacket readpcrfrompacket, numOutputBytesToFrames numoutputbytestoframes, Id3Reader id3Reader) {
        AtomicReference<readFileType> atomicReference = new AtomicReference<>();
        this.write = atomicReference;
        this.AudioAttributesImplApi26Parcelizer = new AtomicReference<>(new TaskCompletionSource());
        this.RemoteActionCompatParcelizer = context;
        this.AudioAttributesImplBaseParcelizer = decodeblockforchannel;
        this.read = isvclbodynalunit;
        this.MediaBrowserCompatItemReceiver = skiptosampledata;
        this.AudioAttributesCompatParcelizer = readpcrfrompacket;
        this.AudioAttributesImplApi21Parcelizer = numoutputbytestoframes;
        this.IconCompatParcelizer = id3Reader;
        atomicReference.set(readPcrValueFromPcrBytes.AudioAttributesCompatParcelizer(isvclbodynalunit));
    }

    public static readSampleData write(Context context, String str, parseAudioMuxElement parseaudiomuxelement, TsPayloadReaderDvbSubtitleInfo tsPayloadReaderDvbSubtitleInfo, String str2, String str3, isStartOfTsPacket isstartoftspacket, Id3Reader id3Reader) {
        String strWrite = parseaudiomuxelement.write();
        MpegAudioReader mpegAudioReader = new MpegAudioReader();
        return new readSampleData(context, new decodeBlockForChannel(str, parseAudioMuxElement.IconCompatParcelizer(), parseAudioMuxElement.AudioAttributesImplApi21Parcelizer(), parseAudioMuxElement.MediaBrowserCompatItemReceiver(), parseaudiomuxelement, putSps.write(putSps.read(context), str, str3, str2), str3, str2, isPrefixNalUnit.RemoteActionCompatParcelizer(strWrite).IconCompatParcelizer()), mpegAudioReader, new skipToSampleData(mpegAudioReader), new readPcrFromPacket(isstartoftspacket), new WavExtractor(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), tsPayloadReaderDvbSubtitleInfo), id3Reader);
    }

    @Override // kotlin.readFormat
    public final Task<readFileType> read() {
        return this.AudioAttributesImplApi26Parcelizer.get().getTask();
    }

    @Override // kotlin.readFormat
    public final readFileType IconCompatParcelizer() {
        return this.write.get();
    }

    public final Task<Void> RemoteActionCompatParcelizer(Executor executor) {
        return AudioAttributesCompatParcelizer(readRf64SampleDataSize.USE_CACHE, executor);
    }

    private Task<Void> AudioAttributesCompatParcelizer(readRf64SampleDataSize readrf64sampledatasize, Executor executor) throws Throwable {
        readFileType readfiletypeRemoteActionCompatParcelizer;
        if (!write() && (readfiletypeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(readrf64sampledatasize)) != null) {
            this.write.set(readfiletypeRemoteActionCompatParcelizer);
            this.AudioAttributesImplApi26Parcelizer.get().trySetResult(readfiletypeRemoteActionCompatParcelizer);
            return Tasks.forResult(null);
        }
        readFileType readfiletypeRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(readRf64SampleDataSize.IGNORE_CACHE_EXPIRATION);
        if (readfiletypeRemoteActionCompatParcelizer2 != null) {
            this.write.set(readfiletypeRemoteActionCompatParcelizer2);
            this.AudioAttributesImplApi26Parcelizer.get().trySetResult(readfiletypeRemoteActionCompatParcelizer2);
        }
        return this.IconCompatParcelizer.write(executor).onSuccessTask(executor, new SuccessContinuation<Void, Void>() { // from class: o.readSampleData.1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final /* synthetic */ Task<Void> then(Void r1) throws Exception {
                return AudioAttributesCompatParcelizer();
            }

            private Task<Void> AudioAttributesCompatParcelizer() throws Exception {
                JSONObject jSONObjectIconCompatParcelizer = readSampleData.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(readSampleData.this.AudioAttributesImplBaseParcelizer);
                if (jSONObjectIconCompatParcelizer != null) {
                    readFileType readfiletypeAudioAttributesCompatParcelizer = readSampleData.this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(jSONObjectIconCompatParcelizer);
                    readSampleData.this.AudioAttributesCompatParcelizer.write(readfiletypeAudioAttributesCompatParcelizer.IconCompatParcelizer, jSONObjectIconCompatParcelizer);
                    readSampleData.read(jSONObjectIconCompatParcelizer, "Loaded settings: ");
                    readSampleData readsampledata = readSampleData.this;
                    readsampledata.write(readsampledata.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver);
                    readSampleData.this.write.set(readfiletypeAudioAttributesCompatParcelizer);
                    ((TaskCompletionSource) readSampleData.this.AudioAttributesImplApi26Parcelizer.get()).trySetResult(readfiletypeAudioAttributesCompatParcelizer);
                }
                return Tasks.forResult(null);
            }
        });
    }

    private readFileType RemoteActionCompatParcelizer(readRf64SampleDataSize readrf64sampledatasize) throws Throwable {
        readFileType readfiletype = null;
        try {
            if (!readRf64SampleDataSize.SKIP_CACHE_LOOKUP.equals(readrf64sampledatasize)) {
                JSONObject jSONObjectAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
                if (jSONObjectAudioAttributesCompatParcelizer != null) {
                    readFileType readfiletypeAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(jSONObjectAudioAttributesCompatParcelizer);
                    if (readfiletypeAudioAttributesCompatParcelizer != null) {
                        read(jSONObjectAudioAttributesCompatParcelizer, "Loaded cached settings: ");
                        long jRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
                        if (!readRf64SampleDataSize.IGNORE_CACHE_EXPIRATION.equals(readrf64sampledatasize) && readfiletypeAudioAttributesCompatParcelizer.read(jRemoteActionCompatParcelizer)) {
                            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Cached settings have expired.");
                            return null;
                        }
                        try {
                            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Returning cached settings.");
                            return readfiletypeAudioAttributesCompatParcelizer;
                        } catch (Exception unused) {
                            readfiletype = readfiletypeAudioAttributesCompatParcelizer;
                            DvbSubtitleReader.read().write();
                            return readfiletype;
                        }
                    }
                    DvbSubtitleReader.read().write();
                    return null;
                }
                DvbSubtitleReader.read().IconCompatParcelizer("No cached settings data found.");
            }
            return null;
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void read(JSONObject jSONObject, String str) throws JSONException {
        DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jSONObject.toString());
        dvbSubtitleReader.IconCompatParcelizer(sb.toString());
    }

    private String AudioAttributesCompatParcelizer() {
        return putSps.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean write(String str) {
        SharedPreferences.Editor editorEdit = putSps.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    private boolean write() {
        return !AudioAttributesCompatParcelizer().equals(this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver);
    }
}
