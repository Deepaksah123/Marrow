package kotlin;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
public final class parseStreamMuxConfig {
    private final skipToEndOfCurrentPack AudioAttributesCompatParcelizer;
    private final TsPayloadReaderTrackIdGenerator IconCompatParcelizer;
    private final getFormatId MediaBrowserCompatCustomActionResultReceiver;
    private final peekIntAtPosition RemoteActionCompatParcelizer;
    private final isISlice read;
    private final parseAudioMuxElement write;

    public static parseStreamMuxConfig IconCompatParcelizer(Context context, parseAudioMuxElement parseaudiomuxelement, isStartOfTsPacket isstartoftspacket, onDataEnd ondataend, peekIntAtPosition peekintatposition, skipToEndOfCurrentPack skiptoendofcurrentpack, WavExtractorOutputWriter wavExtractorOutputWriter, readFormat readformat, parseFrameLength parseframelength, isFirstVclNalUnitOfPicture isfirstvclnalunitofpicture) {
        return new parseStreamMuxConfig(new isISlice(context, parseaudiomuxelement, ondataend, wavExtractorOutputWriter, readformat), new TsPayloadReaderTrackIdGenerator(isstartoftspacket, readformat, isfirstvclnalunitofpicture), getFormatId.IconCompatParcelizer(context, readformat, parseframelength), peekintatposition, skiptoendofcurrentpack, parseaudiomuxelement);
    }

    private parseStreamMuxConfig(isISlice isislice, TsPayloadReaderTrackIdGenerator tsPayloadReaderTrackIdGenerator, getFormatId getformatid, peekIntAtPosition peekintatposition, skipToEndOfCurrentPack skiptoendofcurrentpack, parseAudioMuxElement parseaudiomuxelement) {
        this.read = isislice;
        this.IconCompatParcelizer = tsPayloadReaderTrackIdGenerator;
        this.MediaBrowserCompatCustomActionResultReceiver = getformatid;
        this.RemoteActionCompatParcelizer = peekintatposition;
        this.AudioAttributesCompatParcelizer = skiptoendofcurrentpack;
        this.write = parseaudiomuxelement;
    }

    public final void AudioAttributesCompatParcelizer(String str, long j) {
        this.IconCompatParcelizer.write(this.read.RemoteActionCompatParcelizer(str, j));
    }

    public final void RemoteActionCompatParcelizer(Throwable th, Thread thread, String str, long j) {
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Persisting fatal event for session ".concat(String.valueOf(str)));
        read(th, thread, str, AppMeasurement.CRASH_ORIGIN, j, true);
    }

    public final void write(Throwable th, Thread thread, String str, long j) {
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Persisting non-fatal event for session ".concat(String.valueOf(str)));
        read(th, thread, str, "error", j, false);
    }

    public final void read(String str, List<ApplicationExitInfo> list, peekIntAtPosition peekintatposition, skipToEndOfCurrentPack skiptoendofcurrentpack) {
        ApplicationExitInfo applicationExitInfoCO_ = cO_(str, list);
        if (applicationExitInfoCO_ == null) {
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("No relevant ApplicationExitInfo occurred during session: ".concat(String.valueOf(str)));
            return;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read readVarAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(cN_(applicationExitInfoCO_));
        DvbSubtitleReader.read().IconCompatParcelizer("Persisting anr for session ".concat(String.valueOf(str)));
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(readVarAudioAttributesCompatParcelizer, peekintatposition, skiptoendofcurrentpack), str, true);
    }

    public final void IconCompatParcelizer(long j, String str) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(str, j);
    }

    public final SortedSet<String> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.write();
    }

    public final boolean read() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final void write() {
        this.IconCompatParcelizer.IconCompatParcelizer();
    }

    public final Task<Void> AudioAttributesCompatParcelizer(Executor executor) {
        return RemoteActionCompatParcelizer(executor, null);
    }

    public final Task<Void> RemoteActionCompatParcelizer(Executor executor, String str) {
        List<readNalUnitData> listAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        for (readNalUnitData readnalunitdata : listAudioAttributesCompatParcelizer) {
            if (str == null || str.equals(readnalunitdata.IconCompatParcelizer())) {
                arrayList.add(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(readnalunitdata), str != null).continueWith(executor, new Continuation() { // from class: o.resetBufferForSize
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(parseStreamMuxConfig.write((Task<readNalUnitData>) task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }

    private readNalUnitData RemoteActionCompatParcelizer(readNalUnitData readnalunitdata) {
        if (readnalunitdata.RemoteActionCompatParcelizer().IconCompatParcelizer() != null) {
            return readnalunitdata;
        }
        return readNalUnitData.write(readnalunitdata.RemoteActionCompatParcelizer().IconCompatParcelizer(this.write.RemoteActionCompatParcelizer()), readnalunitdata.IconCompatParcelizer(), readnalunitdata.AudioAttributesCompatParcelizer());
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read RemoteActionCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read readVar) {
        return AudioAttributesCompatParcelizer(readVar, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    private static fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read AudioAttributesCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read readVar, peekIntAtPosition peekintatposition, skipToEndOfCurrentPack skiptoendofcurrentpack) {
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0072read abstractC0072readAudioAttributesImplApi26Parcelizer = readVar.AudioAttributesImplApi26Parcelizer();
        String strIconCompatParcelizer = peekintatposition.IconCompatParcelizer();
        if (strIconCompatParcelizer != null) {
            abstractC0072readAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer.write().RemoteActionCompatParcelizer(strIconCompatParcelizer).AudioAttributesCompatParcelizer());
        } else {
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("No log data to include with this event.");
        }
        List<fillBufferWithAtLeastOnePacket.write> listWrite = write(skiptoendofcurrentpack.read());
        List<fillBufferWithAtLeastOnePacket.write> listWrite2 = write(skiptoendofcurrentpack.AudioAttributesCompatParcelizer());
        if (!listWrite.isEmpty() || !listWrite2.isEmpty()) {
            abstractC0072readAudioAttributesImplApi26Parcelizer.IconCompatParcelizer(readVar.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(access102.IconCompatParcelizer(listWrite)).IconCompatParcelizer(access102.IconCompatParcelizer(listWrite2)).RemoteActionCompatParcelizer());
        }
        return abstractC0072readAudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
    }

    private void read(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(this.read.IconCompatParcelizer(th, thread, str2, j, z)), str, str2.equals(AppMeasurement.CRASH_ORIGIN));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean write(Task<readNalUnitData> task) {
        if (task.isSuccessful()) {
            readNalUnitData result = task.getResult();
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("Crashlytics report successfully enqueued to DataTransport: ");
            sb.append(result.IconCompatParcelizer());
            dvbSubtitleReader.IconCompatParcelizer(sb.toString());
            File fileAudioAttributesCompatParcelizer = result.AudioAttributesCompatParcelizer();
            if (fileAudioAttributesCompatParcelizer.delete()) {
                DvbSubtitleReader dvbSubtitleReader2 = DvbSubtitleReader.read();
                StringBuilder sb2 = new StringBuilder("Deleted report file: ");
                sb2.append(fileAudioAttributesCompatParcelizer.getPath());
                dvbSubtitleReader2.IconCompatParcelizer(sb2.toString());
                return true;
            }
            DvbSubtitleReader dvbSubtitleReader3 = DvbSubtitleReader.read();
            StringBuilder sb3 = new StringBuilder("Crashlytics could not delete report file: ");
            sb3.append(fileAudioAttributesCompatParcelizer.getPath());
            dvbSubtitleReader3.read(sb3.toString());
            return true;
        }
        DvbSubtitleReader dvbSubtitleReader4 = DvbSubtitleReader.read();
        task.getException();
        dvbSubtitleReader4.RemoteActionCompatParcelizer();
        return false;
    }

    private static List<fillBufferWithAtLeastOnePacket.write> write(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(fillBufferWithAtLeastOnePacket.write.IconCompatParcelizer().RemoteActionCompatParcelizer(entry.getKey()).AudioAttributesCompatParcelizer(entry.getValue()).RemoteActionCompatParcelizer());
        }
        Collections.sort(arrayList, new Comparator() { // from class: o.findHeader
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((fillBufferWithAtLeastOnePacket.write) obj).RemoteActionCompatParcelizer().compareTo(((fillBufferWithAtLeastOnePacket.write) obj2).RemoteActionCompatParcelizer());
            }
        });
        return arrayList;
    }

    private static fillBufferWithAtLeastOnePacket.IconCompatParcelizer cN_(ApplicationExitInfo applicationExitInfo) {
        String strWrite = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strWrite = write(traceInputStream);
            }
        } catch (IOException e) {
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("Could not get input trace in application exit info: ");
            sb.append(applicationExitInfo.toString());
            sb.append(" Error: ");
            sb.append(e);
            dvbSubtitleReader.read(sb.toString());
        }
        return fillBufferWithAtLeastOnePacket.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(applicationExitInfo.getImportance()).RemoteActionCompatParcelizer(applicationExitInfo.getProcessName()).write(applicationExitInfo.getReason()).AudioAttributesCompatParcelizer(applicationExitInfo.getTimestamp()).AudioAttributesCompatParcelizer(applicationExitInfo.getPid()).IconCompatParcelizer(applicationExitInfo.getPss()).read(applicationExitInfo.getRss()).write(strWrite).RemoteActionCompatParcelizer();
    }

    private static String write(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    private ApplicationExitInfo cO_(String str, List<ApplicationExitInfo> list) {
        long jRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < jRemoteActionCompatParcelizer) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }
}
