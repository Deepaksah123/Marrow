package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class DtsReader {
    private parseMediaFormat write;

    public static DtsReader AudioAttributesCompatParcelizer(FirebaseApp firebaseApp, hasSamples hassamples, MotionPhotoMetadata1 motionPhotoMetadata1, onFlushCompleted<DefaultTsPayloadReaderFactoryFlags> onflushcompleted, onFlushCompleted<TrackSampleTable> onflushcompleted2) {
        Context contextAudioAttributesCompatParcelizer = firebaseApp.AudioAttributesCompatParcelizer();
        String packageName = contextAudioAttributesCompatParcelizer.getPackageName();
        DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
        StringBuilder sb = new StringBuilder("Initializing Firebase Crashlytics ");
        sb.append(parseMediaFormat.IconCompatParcelizer());
        sb.append(" for ");
        sb.append(packageName);
        dvbSubtitleReader.write(sb.toString());
        isStartOfTsPacket isstartoftspacket = new isStartOfTsPacket(contextAudioAttributesCompatParcelizer);
        Id3Reader id3Reader = new Id3Reader(firebaseApp);
        parseAudioMuxElement parseaudiomuxelement = new parseAudioMuxElement(contextAudioAttributesCompatParcelizer, packageName, hassamples, id3Reader);
        isSet isset = new isSet(onflushcompleted);
        buildUserDataReader builduserdatareader = new buildUserDataReader(onflushcompleted2);
        ExecutorService executorServiceIconCompatParcelizer = latmGetValue.IconCompatParcelizer("Crashlytics Exception Handler");
        isFirstVclNalUnitOfPicture isfirstvclnalunitofpicture = new isFirstVclNalUnitOfPicture(id3Reader);
        motionPhotoMetadata1.AudioAttributesCompatParcelizer(isfirstvclnalunitofpicture);
        final parseMediaFormat parsemediaformat = new parseMediaFormat(firebaseApp, parseaudiomuxelement, isset, id3Reader, builduserdatareader.AudioAttributesCompatParcelizer(), builduserdatareader.RemoteActionCompatParcelizer(), isstartoftspacket, executorServiceIconCompatParcelizer, isfirstvclnalunitofpicture);
        String strRemoteActionCompatParcelizer = firebaseApp.read().RemoteActionCompatParcelizer();
        String str = putSps.read(contextAudioAttributesCompatParcelizer);
        List<H264ReaderSampleReader> listAudioAttributesCompatParcelizer = putSps.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer);
        DvbSubtitleReader.read().IconCompatParcelizer("Mapping file ID is: ".concat(String.valueOf(str)));
        for (H264ReaderSampleReader h264ReaderSampleReader : listAudioAttributesCompatParcelizer) {
            DvbSubtitleReader.read().IconCompatParcelizer(String.format("Build id for %s on %s: %s", h264ReaderSampleReader.RemoteActionCompatParcelizer(), h264ReaderSampleReader.write(), h264ReaderSampleReader.read()));
        }
        try {
            onDataEnd ondataend = onDataEnd.read(contextAudioAttributesCompatParcelizer, parseaudiomuxelement, strRemoteActionCompatParcelizer, str, listAudioAttributesCompatParcelizer, new parseCsdBuffer(contextAudioAttributesCompatParcelizer));
            DvbSubtitleReader dvbSubtitleReader2 = DvbSubtitleReader.read();
            StringBuilder sb2 = new StringBuilder("Installer package name is: ");
            sb2.append(ondataend.write);
            dvbSubtitleReader2.AudioAttributesCompatParcelizer(sb2.toString());
            ExecutorService executorServiceIconCompatParcelizer2 = latmGetValue.IconCompatParcelizer("com.google.firebase.crashlytics.startup");
            final readSampleData readsampledataWrite = readSampleData.write(contextAudioAttributesCompatParcelizer, strRemoteActionCompatParcelizer, parseaudiomuxelement, new TsPayloadReaderDvbSubtitleInfo(), ondataend.MediaBrowserCompatItemReceiver, ondataend.AudioAttributesImplBaseParcelizer, isstartoftspacket, id3Reader);
            readsampledataWrite.RemoteActionCompatParcelizer(executorServiceIconCompatParcelizer2).continueWith(executorServiceIconCompatParcelizer2, new Continuation<Void, Object>() { // from class: o.DtsReader.2
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task<Void> task) throws Exception {
                    if (task.isSuccessful()) {
                        return null;
                    }
                    DvbSubtitleReader dvbSubtitleReader3 = DvbSubtitleReader.read();
                    task.getException();
                    dvbSubtitleReader3.write();
                    return null;
                }
            });
            final boolean zWrite = parsemediaformat.write(ondataend, readsampledataWrite);
            Tasks.call(executorServiceIconCompatParcelizer2, new Callable<Void>() { // from class: o.DtsReader.5
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public Void call() throws Exception {
                    if (!zWrite) {
                        return null;
                    }
                    parsemediaformat.IconCompatParcelizer(readsampledataWrite);
                    return null;
                }
            });
            return new DtsReader(parsemediaformat);
        } catch (PackageManager.NameNotFoundException unused) {
            DvbSubtitleReader.read().write();
            return null;
        }
    }

    private DtsReader(parseMediaFormat parsemediaformat) {
        this.write = parsemediaformat;
    }

    public static DtsReader RemoteActionCompatParcelizer() {
        DtsReader dtsReader = (DtsReader) FirebaseApp.write().AudioAttributesCompatParcelizer(DtsReader.class);
        if (dtsReader != null) {
            return dtsReader;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void AudioAttributesCompatParcelizer(Throwable th) {
        if (th == null) {
            DvbSubtitleReader.read().read("A null value was passed to recordException. Ignoring.");
        } else {
            this.write.IconCompatParcelizer(th);
        }
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        this.write.IconCompatParcelizer(str);
    }

    public final void write(String str) {
        this.write.AudioAttributesCompatParcelizer(str);
    }

    public final void RemoteActionCompatParcelizer(String str, String str2) {
        this.write.IconCompatParcelizer(str, str2);
    }
}
