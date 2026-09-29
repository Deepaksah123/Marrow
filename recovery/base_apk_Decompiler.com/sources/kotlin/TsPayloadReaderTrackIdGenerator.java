package kotlin;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.fillBufferWithAtLeastOnePacket;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
public final class TsPayloadReaderTrackIdGenerator {
    private static final Comparator<? super File> IconCompatParcelizer;
    private static final FilenameFilter RemoteActionCompatParcelizer;
    private static final Charset read = Charset.forName(CharsetNames.UTF_8);
    private static final int write = 15;
    private final AtomicInteger AudioAttributesCompatParcelizer = new AtomicInteger(0);
    private final isStartOfTsPacket AudioAttributesImplApi21Parcelizer;
    private final isFirstVclNalUnitOfPicture AudioAttributesImplApi26Parcelizer;
    private final readFormat MediaBrowserCompatItemReceiver;

    private static long AudioAttributesCompatParcelizer(long j) {
        return j * 1000;
    }

    static {
        new TsExtractor();
        IconCompatParcelizer = new Comparator() { // from class: o.maybeThrowUninitializedError
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            }
        };
        RemoteActionCompatParcelizer = new FilenameFilter() { // from class: o.TsPayloadReaderFlags
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.startsWith("event");
            }
        };
    }

    public TsPayloadReaderTrackIdGenerator(isStartOfTsPacket isstartoftspacket, readFormat readformat, isFirstVclNalUnitOfPicture isfirstvclnalunitofpicture) {
        this.AudioAttributesImplApi21Parcelizer = isstartoftspacket;
        this.MediaBrowserCompatItemReceiver = readformat;
        this.AudioAttributesImplApi26Parcelizer = isfirstvclnalunitofpicture;
    }

    public final void write(fillBufferWithAtLeastOnePacket fillbufferwithatleastonepacket) {
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer = fillbufferwithatleastonepacket.AudioAttributesImplApi26Parcelizer();
        if (remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer == null) {
            DvbSubtitleReader.read().IconCompatParcelizer("Could not get session for report");
            return;
        }
        String strAudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer();
        try {
            read(this.AudioAttributesImplApi21Parcelizer.read(strAudioAttributesImplApi26Parcelizer, "report"), TsExtractor.IconCompatParcelizer(fillbufferwithatleastonepacket));
            IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.read(strAudioAttributesImplApi26Parcelizer, "start-time"), "", remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver());
        } catch (IOException unused) {
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer();
        }
    }

    public final void AudioAttributesCompatParcelizer(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read readVar, String str, boolean z) {
        int i = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        try {
            read(this.AudioAttributesImplApi21Parcelizer.read(str, write(this.AudioAttributesCompatParcelizer.getAndIncrement(), z)), TsExtractor.read(readVar));
            String strAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            if (strAudioAttributesCompatParcelizer == null) {
                DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
                StringBuilder sb = new StringBuilder("Missing AQS session id for Crashlytics session ");
                sb.append(str);
                dvbSubtitleReader.read(sb.toString());
            } else {
                read(this.AudioAttributesImplApi21Parcelizer.read(str, "app-quality-session-id"), strAudioAttributesCompatParcelizer);
            }
        } catch (IOException unused) {
            DvbSubtitleReader.read().RemoteActionCompatParcelizer();
        }
        RemoteActionCompatParcelizer(str, i);
    }

    public final SortedSet<String> write() {
        return new TreeSet(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer()).descendingSet();
    }

    public final long RemoteActionCompatParcelizer(String str) {
        return this.AudioAttributesImplApi21Parcelizer.read(str, "start-time").lastModified();
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.AudioAttributesImplApi21Parcelizer.read().isEmpty() && this.AudioAttributesImplApi21Parcelizer.write().isEmpty() && this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().isEmpty()) ? false : true;
    }

    public final void IconCompatParcelizer() {
        RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.read());
        RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.write());
        RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer());
    }

    private static void RemoteActionCompatParcelizer(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public final void AudioAttributesCompatParcelizer(String str, long j) {
        for (String str2 : write(str)) {
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Finalizing report for session ".concat(String.valueOf(str2)));
            RemoteActionCompatParcelizer(str2, j);
            this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(str2);
        }
        read();
    }

    public final List<readNalUnitData> AudioAttributesCompatParcelizer() {
        List<File> listAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        ArrayList arrayList = new ArrayList();
        for (File file : listAudioAttributesImplApi26Parcelizer) {
            try {
                arrayList.add(readNalUnitData.write(TsExtractor.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(file)), file.getName(), file));
            } catch (IOException unused) {
                DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
                Objects.toString(file);
                dvbSubtitleReader.RemoteActionCompatParcelizer();
                file.delete();
            }
        }
        return arrayList;
    }

    private SortedSet<String> write(String str) {
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        SortedSet<String> sortedSetWrite = write();
        if (str != null) {
            sortedSetWrite.remove(str);
        }
        if (sortedSetWrite.size() > 8) {
            while (sortedSetWrite.size() > 8) {
                String strLast = sortedSetWrite.last();
                DvbSubtitleReader.read().IconCompatParcelizer("Removing session over cap: ".concat(String.valueOf(strLast)));
                this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(strLast);
                sortedSetWrite.remove(strLast);
            }
        }
        return sortedSetWrite;
    }

    private void read() {
        int i = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
        List<File> listAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int size = listAudioAttributesImplApi26Parcelizer.size();
        if (size > i) {
            Iterator<File> it = listAudioAttributesImplApi26Parcelizer.subList(i, size).iterator();
            while (it.hasNext()) {
                it.next().delete();
            }
        }
    }

    private List<File> AudioAttributesImplApi26Parcelizer() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.AudioAttributesImplApi21Parcelizer.write());
        arrayList.addAll(this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer());
        Comparator<? super File> comparator = IconCompatParcelizer;
        Collections.sort(arrayList, comparator);
        List<File> list = this.AudioAttributesImplApi21Parcelizer.read();
        Collections.sort(list, comparator);
        arrayList.addAll(list);
        return arrayList;
    }

    private void RemoteActionCompatParcelizer(String str, long j) {
        boolean z;
        List<File> listAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(str, RemoteActionCompatParcelizer);
        if (listAudioAttributesCompatParcelizer.isEmpty()) {
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("Session ");
            sb.append(str);
            sb.append(" has no events.");
            dvbSubtitleReader.AudioAttributesCompatParcelizer(sb.toString());
            return;
        }
        Collections.sort(listAudioAttributesCompatParcelizer);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : listAudioAttributesCompatParcelizer) {
                try {
                    arrayList.add(TsExtractor.write(RemoteActionCompatParcelizer(file)));
                } catch (IOException unused) {
                    DvbSubtitleReader.read().RemoteActionCompatParcelizer();
                }
                if (z || AudioAttributesImplApi26Parcelizer(file.getName())) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            DvbSubtitleReader.read().read("Could not parse event files for session ".concat(String.valueOf(str)));
            return;
        }
        RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.read(str, "report"), arrayList, j, z, skipToEndOfCurrentPack.write(str, this.AudioAttributesImplApi21Parcelizer), write(this.AudioAttributesImplApi21Parcelizer.read(str, "app-quality-session-id")));
    }

    private void RemoteActionCompatParcelizer(File file, List<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read> list, long j, boolean z, String str, String str2) {
        File fileRemoteActionCompatParcelizer;
        try {
            fillBufferWithAtLeastOnePacket fillbufferwithatleastonepacketWrite = TsExtractor.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(file)).read(j, z, str).read(str2).write(access102.IconCompatParcelizer(list));
            fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer = fillbufferwithatleastonepacketWrite.AudioAttributesImplApi26Parcelizer();
            if (remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer == null) {
                return;
            }
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("appQualitySessionId: ");
            sb.append(str2);
            dvbSubtitleReader.IconCompatParcelizer(sb.toString());
            if (z) {
                fileRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer());
            } else {
                fileRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(remoteActionCompatParcelizerAudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer());
            }
            read(fileRemoteActionCompatParcelizer, TsExtractor.IconCompatParcelizer(fillbufferwithatleastonepacketWrite));
        } catch (IOException unused) {
            DvbSubtitleReader.read().RemoteActionCompatParcelizer();
        }
    }

    private static boolean AudioAttributesImplApi26Parcelizer(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AudioAttributesImplBaseParcelizer(String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    private static String write(int i, boolean z) {
        String str = String.format(Locale.US, "%010d", Integer.valueOf(i));
        String str2 = z ? "_" : "";
        StringBuilder sb = new StringBuilder("event");
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    private int RemoteActionCompatParcelizer(String str, int i) {
        List<File> listAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(str, new FilenameFilter() { // from class: o.TsPayloadReaderFactory
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return TsPayloadReaderTrackIdGenerator.AudioAttributesImplBaseParcelizer(str2);
            }
        });
        Collections.sort(listAudioAttributesCompatParcelizer, new Comparator() { // from class: o.generateNewId
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TsPayloadReaderTrackIdGenerator.RemoteActionCompatParcelizer((File) obj, (File) obj2);
            }
        });
        return RemoteActionCompatParcelizer(listAudioAttributesCompatParcelizer, i);
    }

    private static String read(String str) {
        return str.substring(0, write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int RemoteActionCompatParcelizer(File file, File file2) {
        return read(file.getName()).compareTo(read(file2.getName()));
    }

    private static void read(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), read);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void IconCompatParcelizer(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), read);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(AudioAttributesCompatParcelizer(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String RemoteActionCompatParcelizer(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), read);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private static String write(File file) {
        try {
            return RemoteActionCompatParcelizer(file);
        } catch (IOException unused) {
            return null;
        }
    }

    private static int RemoteActionCompatParcelizer(List<File> list, int i) {
        int size = list.size();
        for (File file : list) {
            if (size <= i) {
                break;
            }
            isStartOfTsPacket.read(file);
            size--;
        }
        return size;
    }
}
