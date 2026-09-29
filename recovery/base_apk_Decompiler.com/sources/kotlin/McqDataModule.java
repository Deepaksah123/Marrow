package kotlin;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.SettingsItem;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010)\n\u0002\b\u0007*\u0001\u0014\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0004[\\]^B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000209H\u0016J!\u0010;\u001a\u0002092\n\u0010<\u001a\u00060=R\u00020\u00002\u0006\u0010>\u001a\u00020\u0010H\u0000¢\u0006\u0002\b?J\u0006\u0010@\u001a\u000209J \u0010A\u001a\b\u0018\u00010=R\u00020\u00002\u0006\u0010B\u001a\u00020(2\b\b\u0002\u0010C\u001a\u00020\u000bH\u0007J\u0006\u0010D\u001a\u000209J\b\u0010E\u001a\u000209H\u0016J\u0017\u0010F\u001a\b\u0018\u00010GR\u00020\u00002\u0006\u0010B\u001a\u00020(H\u0086\u0002J\u0006\u0010H\u001a\u000209J\u0006\u0010I\u001a\u00020\u0010J\b\u0010J\u001a\u00020\u0010H\u0002J\b\u0010K\u001a\u00020%H\u0002J\b\u0010L\u001a\u000209H\u0002J\b\u0010M\u001a\u000209H\u0002J\u0010\u0010N\u001a\u0002092\u0006\u0010O\u001a\u00020(H\u0002J\r\u0010P\u001a\u000209H\u0000¢\u0006\u0002\bQJ\u000e\u0010R\u001a\u00020\u00102\u0006\u0010B\u001a\u00020(J\u0019\u0010S\u001a\u00020\u00102\n\u0010T\u001a\u00060)R\u00020\u0000H\u0000¢\u0006\u0002\bUJ\b\u0010V\u001a\u00020\u0010H\u0002J\u0006\u00105\u001a\u00020\u000bJ\u0010\u0010W\u001a\f\u0012\b\u0012\u00060GR\u00020\u00000XJ\u0006\u0010Y\u001a\u000209J\u0010\u0010Z\u001a\u0002092\u0006\u0010B\u001a\u00020(H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\b\u0012\u00060)R\u00020\u00000'X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R&\u0010\n\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006_"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "directory", "Ljava/io/File;", "appVersion", "", "valueCount", "maxSize", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "civilizedFileSystem", "", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupTask", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getDirectory", "()Ljava/io/File;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "hasJournalErrors", "initialized", "journalFile", "journalFileBackup", "journalFileTmp", "journalWriter", "Lokio/BufferedSink;", "lruEntries", "Ljava/util/LinkedHashMap;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getMaxSize", "()J", "setMaxSize", "(J)V", "mostRecentRebuildFailed", "mostRecentTrimFailed", "nextSequenceNumber", "redundantOpCount", "size", "getValueCount$okhttp", "()I", "checkNotClosed", "", "close", "completeEdit", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "success", "completeEdit$okhttp", "delete", "edit", "key", "expectedSequenceNumber", "evictAll", "flush", "get", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "initialize", "isClosed", "journalRebuildRequired", "newJournalWriter", "processJournal", "readJournal", "readJournalLine", "line", "rebuildJournal", "rebuildJournal$okhttp", "remove", "removeEntry", "entry", "removeEntry$okhttp", "removeOldestEntry", "snapshots", "", "trimToSize", "validateKey", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class McqDataModule implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final SubscriptionDataModule cleanupQueue;
    private final read cleanupTask;
    private boolean closed;
    private final File directory;
    private final OptionItemPlaybackSpeedOptionItem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private LessonCompletedDialogonViewCreatedllm1 journalWriter;
    private final LinkedHashMap<String, IconCompatParcelizer> lruEntries;
    public long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final newYearNameItem LEGAL_KEY_PATTERN = new newYearNameItem("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    public McqDataModule(OptionItemPlaybackSpeedOptionItem optionItemPlaybackSpeedOptionItem, File file, long j, SyncModule syncModule) {
        toMagicModuleMetaRepoModel.write(optionItemPlaybackSpeedOptionItem, "");
        toMagicModuleMetaRepoModel.write(file, "");
        toMagicModuleMetaRepoModel.write(syncModule, "");
        this.fileSystem = optionItemPlaybackSpeedOptionItem;
        this.directory = file;
        this.appVersion = 201105;
        this.valueCount = 2;
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = syncModule.read();
        StringBuilder sb = new StringBuilder();
        sb.append(FirebaseDataModule.AudioAttributesImplApi21Parcelizer);
        sb.append(" Cache");
        this.cleanupTask = new read(sb.toString());
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final OptionItemPlaybackSpeedOptionItem getFileSystem() {
        return this.fileSystem;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final File getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/McqDataModule$read;", "Lo/TableModule;", "", "AudioAttributesCompatParcelizer", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class read extends TableModule {
        read(String str) {
            super(str, false, 2, null);
        }

        @Override // kotlin.TableModule
        public final long AudioAttributesCompatParcelizer() {
            McqDataModule mcqDataModule = McqDataModule.this;
            synchronized (mcqDataModule) {
                if (!mcqDataModule.initialized || mcqDataModule.getClosed()) {
                    return -1L;
                }
                try {
                    mcqDataModule.MediaBrowserCompatItemReceiver();
                } catch (IOException unused) {
                    mcqDataModule.mostRecentTrimFailed = true;
                }
                try {
                    if (mcqDataModule.AudioAttributesImplApi21Parcelizer()) {
                        mcqDataModule.AudioAttributesCompatParcelizer();
                        mcqDataModule.redundantOpCount = 0;
                    }
                } catch (IOException unused2) {
                    mcqDataModule.mostRecentRebuildFailed = true;
                    mcqDataModule.journalWriter = CustomAppBarLayout.read(CustomAppBarLayout.RemoteActionCompatParcelizer());
                }
                return -1L;
            }
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() throws IOException {
        LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = CustomAppBarLayout.AudioAttributesCompatParcelizer(this.fileSystem.AudioAttributesImplBaseParcelizer(this.journalFile));
        try {
            LessonCompletedDialog lessonCompletedDialog = lessonCompletedDialogAudioAttributesCompatParcelizer;
            String strOnMediaButtonEvent = lessonCompletedDialog.onMediaButtonEvent();
            String strOnMediaButtonEvent2 = lessonCompletedDialog.onMediaButtonEvent();
            String strOnMediaButtonEvent3 = lessonCompletedDialog.onMediaButtonEvent();
            String strOnMediaButtonEvent4 = lessonCompletedDialog.onMediaButtonEvent();
            String strOnMediaButtonEvent5 = lessonCompletedDialog.onMediaButtonEvent();
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) MAGIC, (Object) strOnMediaButtonEvent) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) VERSION_1, (Object) strOnMediaButtonEvent2) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) String.valueOf(this.appVersion), (Object) strOnMediaButtonEvent3) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) String.valueOf(this.valueCount), (Object) strOnMediaButtonEvent4) || strOnMediaButtonEvent5.length() > 0) {
                StringBuilder sb = new StringBuilder("unexpected journal header: [");
                sb.append(strOnMediaButtonEvent);
                sb.append(", ");
                sb.append(strOnMediaButtonEvent2);
                sb.append(", ");
                sb.append(strOnMediaButtonEvent4);
                sb.append(", ");
                sb.append(strOnMediaButtonEvent5);
                sb.append(']');
                throw new IOException(sb.toString());
            }
            int i = 0;
            while (true) {
                try {
                    read(lessonCompletedDialog.onMediaButtonEvent());
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (!lessonCompletedDialog.MediaBrowserCompatCustomActionResultReceiver()) {
                        AudioAttributesCompatParcelizer();
                    } else {
                        this.journalWriter = AudioAttributesImplBaseParcelizer();
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    MagicModuleMetaLSModel.IconCompatParcelizer(lessonCompletedDialogAudioAttributesCompatParcelizer, null);
                    return;
                }
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: o.McqDataModule$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "p0", "", "write", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<IOException, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(IOException iOException) {
            write(iOException);
            return getShowPopup.INSTANCE;
        }

        public final void write(IOException iOException) {
            toMagicModuleMetaRepoModel.write(iOException, "");
            boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
            McqDataModule.this.hasJournalErrors = true;
        }

        AnonymousClass5() {
            super(1);
        }
    }

    private final LessonCompletedDialogonViewCreatedllm1 AudioAttributesImplBaseParcelizer() throws FileNotFoundException {
        return CustomAppBarLayout.read(new NetworkModule(this.fileSystem.write(this.journalFile), new AnonymousClass5()));
    }

    private final void read(String str) throws IOException {
        String strSubstring;
        String str2 = str;
        int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) str2, ' ', 0, false, 6);
        if (iIconCompatParcelizer == -1) {
            throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
        }
        int i = iIconCompatParcelizer + 1;
        int iIconCompatParcelizer2 = TestGroupLSModel.IconCompatParcelizer((CharSequence) str2, ' ', i, false, 4);
        if (iIconCompatParcelizer2 == -1) {
            strSubstring = str.substring(i);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            String str3 = REMOVE;
            if (iIconCompatParcelizer == str3.length() && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, str3)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIconCompatParcelizer2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        }
        IconCompatParcelizer iconCompatParcelizer = this.lruEntries.get(strSubstring);
        if (iconCompatParcelizer == null) {
            iconCompatParcelizer = new IconCompatParcelizer(this, strSubstring);
            this.lruEntries.put(strSubstring, iconCompatParcelizer);
        }
        if (iIconCompatParcelizer2 != -1) {
            String str4 = CLEAN;
            if (iIconCompatParcelizer == str4.length() && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, str4)) {
                String strSubstring2 = str.substring(iIconCompatParcelizer2 + 1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
                List<String> listIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer(strSubstring2, new char[]{' '}, false, 0);
                iconCompatParcelizer.AudioAttributesImplBaseParcelizer();
                iconCompatParcelizer.IconCompatParcelizer((RemoteActionCompatParcelizer) null);
                iconCompatParcelizer.read(listIconCompatParcelizer);
                return;
            }
        }
        if (iIconCompatParcelizer2 == -1) {
            String str5 = DIRTY;
            if (iIconCompatParcelizer == str5.length() && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, str5)) {
                iconCompatParcelizer.IconCompatParcelizer(new RemoteActionCompatParcelizer(this, iconCompatParcelizer));
                return;
            }
        }
        if (iIconCompatParcelizer2 == -1) {
            String str6 = READ;
            if (iIconCompatParcelizer == str6.length() && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, str6)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
    }

    private final void AudioAttributesImplApi26Parcelizer() throws IOException {
        this.fileSystem.IconCompatParcelizer(this.journalFileTmp);
        Iterator<IconCompatParcelizer> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            IconCompatParcelizer next = it.next();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
            IconCompatParcelizer iconCompatParcelizer = next;
            int i = 0;
            if (iconCompatParcelizer.getCurrentEditor() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += iconCompatParcelizer.getLengths()[i];
                    i++;
                }
            } else {
                iconCompatParcelizer.IconCompatParcelizer((RemoteActionCompatParcelizer) null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.IconCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer().get(i));
                    this.fileSystem.IconCompatParcelizer(iconCompatParcelizer.write().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void AudioAttributesCompatParcelizer() throws IOException {
        synchronized (this) {
            LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = this.journalWriter;
            if (lessonCompletedDialogonViewCreatedllm1 != null) {
                lessonCompletedDialogonViewCreatedllm1.close();
            }
            LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm12 = CustomAppBarLayout.read(this.fileSystem.AudioAttributesCompatParcelizer(this.journalFileTmp));
            try {
                LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm13 = lessonCompletedDialogonViewCreatedllm12;
                lessonCompletedDialogonViewCreatedllm13.read(MAGIC).read(10);
                lessonCompletedDialogonViewCreatedllm13.read(VERSION_1).read(10);
                lessonCompletedDialogonViewCreatedllm13.MediaBrowserCompatMediaItem(this.appVersion).read(10);
                lessonCompletedDialogonViewCreatedllm13.MediaBrowserCompatMediaItem(this.valueCount).read(10);
                lessonCompletedDialogonViewCreatedllm13.read(10);
                for (IconCompatParcelizer iconCompatParcelizer : this.lruEntries.values()) {
                    if (iconCompatParcelizer.getCurrentEditor() != null) {
                        lessonCompletedDialogonViewCreatedllm13.read(DIRTY).read(32);
                        lessonCompletedDialogonViewCreatedllm13.read(iconCompatParcelizer.getKey());
                        lessonCompletedDialogonViewCreatedllm13.read(10);
                    } else {
                        lessonCompletedDialogonViewCreatedllm13.read(CLEAN).read(32);
                        lessonCompletedDialogonViewCreatedllm13.read(iconCompatParcelizer.getKey());
                        iconCompatParcelizer.write(lessonCompletedDialogonViewCreatedllm13);
                        lessonCompletedDialogonViewCreatedllm13.read(10);
                    }
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(lessonCompletedDialogonViewCreatedllm12, null);
                if (this.fileSystem.read(this.journalFile)) {
                    this.fileSystem.write(this.journalFile, this.journalFileBackup);
                }
                this.fileSystem.write(this.journalFileTmp, this.journalFile);
                this.fileSystem.IconCompatParcelizer(this.journalFileBackup);
                this.journalWriter = AudioAttributesImplBaseParcelizer();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } finally {
            }
        }
    }

    public final AudioAttributesCompatParcelizer write(String str) throws IOException {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(str, "");
            RatingCompat();
            MediaBrowserCompatCustomActionResultReceiver();
            AudioAttributesCompatParcelizer(str);
            IconCompatParcelizer iconCompatParcelizer = this.lruEntries.get(str);
            if (iconCompatParcelizer == null) {
                return null;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerMediaBrowserCompatMediaItem = iconCompatParcelizer.MediaBrowserCompatMediaItem();
            if (audioAttributesCompatParcelizerMediaBrowserCompatMediaItem == null) {
                return null;
            }
            this.redundantOpCount++;
            LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = this.journalWriter;
            toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1);
            lessonCompletedDialogonViewCreatedllm1.read(READ).read(32).read(str).read(10);
            if (AudioAttributesImplApi21Parcelizer()) {
                this.cleanupQueue.RemoteActionCompatParcelizer(this.cleanupTask, 0L);
            }
            return audioAttributesCompatParcelizerMediaBrowserCompatMediaItem;
        }
    }

    public final RemoteActionCompatParcelizer read(String str, long j) throws IOException {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(str, "");
            RatingCompat();
            MediaBrowserCompatCustomActionResultReceiver();
            AudioAttributesCompatParcelizer(str);
            IconCompatParcelizer iconCompatParcelizer = this.lruEntries.get(str);
            if (j != ANY_SEQUENCE_NUMBER && (iconCompatParcelizer == null || iconCompatParcelizer.getSequenceNumber() != j)) {
                return null;
            }
            if ((iconCompatParcelizer != null ? iconCompatParcelizer.getCurrentEditor() : null) != null) {
                return null;
            }
            if (iconCompatParcelizer != null && iconCompatParcelizer.getLockingSourceCount() != 0) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = this.journalWriter;
                toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1);
                lessonCompletedDialogonViewCreatedllm1.read(DIRTY).read(32).read(str).read(10);
                lessonCompletedDialogonViewCreatedllm1.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (iconCompatParcelizer == null) {
                    iconCompatParcelizer = new IconCompatParcelizer(this, str);
                    this.lruEntries.put(str, iconCompatParcelizer);
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this, iconCompatParcelizer);
                iconCompatParcelizer.IconCompatParcelizer(remoteActionCompatParcelizer);
                return remoteActionCompatParcelizer;
            }
            this.cleanupQueue.RemoteActionCompatParcelizer(this.cleanupTask, 0L);
            return null;
        }
    }

    public final void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) throws IOException {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            IconCompatParcelizer entry = remoteActionCompatParcelizer.getEntry();
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(entry.getCurrentEditor(), remoteActionCompatParcelizer)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (z && !entry.getReadable()) {
                int i = this.valueCount;
                for (int i2 = 0; i2 < i; i2++) {
                    boolean[] written = remoteActionCompatParcelizer.getWritten();
                    toMagicModuleMetaRepoModel.write(written);
                    if (!written[i2]) {
                        remoteActionCompatParcelizer.IconCompatParcelizer();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    }
                    if (!this.fileSystem.read(entry.write().get(i2))) {
                        remoteActionCompatParcelizer.IconCompatParcelizer();
                        return;
                    }
                }
            }
            int i3 = this.valueCount;
            for (int i4 = 0; i4 < i3; i4++) {
                File file = entry.write().get(i4);
                if (z && !entry.getZombie()) {
                    if (this.fileSystem.read(file)) {
                        File file2 = entry.AudioAttributesCompatParcelizer().get(i4);
                        this.fileSystem.write(file, file2);
                        long j = entry.getLengths()[i4];
                        long jAudioAttributesImplApi26Parcelizer = this.fileSystem.AudioAttributesImplApi26Parcelizer(file2);
                        entry.getLengths()[i4] = jAudioAttributesImplApi26Parcelizer;
                        this.size = (this.size - j) + jAudioAttributesImplApi26Parcelizer;
                    }
                } else {
                    this.fileSystem.IconCompatParcelizer(file);
                }
            }
            entry.IconCompatParcelizer((RemoteActionCompatParcelizer) null);
            if (entry.getZombie()) {
                IconCompatParcelizer(entry);
                return;
            }
            this.redundantOpCount++;
            LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = this.journalWriter;
            toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1);
            if (entry.getReadable() || z) {
                entry.AudioAttributesImplBaseParcelizer();
                lessonCompletedDialogonViewCreatedllm1.read(CLEAN).read(32);
                lessonCompletedDialogonViewCreatedllm1.read(entry.getKey());
                entry.write(lessonCompletedDialogonViewCreatedllm1);
                lessonCompletedDialogonViewCreatedllm1.read(10);
                if (z) {
                    long j2 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j2;
                    entry.IconCompatParcelizer(j2);
                }
            } else {
                this.lruEntries.remove(entry.getKey());
                lessonCompletedDialogonViewCreatedllm1.read(REMOVE).read(32);
                lessonCompletedDialogonViewCreatedllm1.read(entry.getKey());
                lessonCompletedDialogonViewCreatedllm1.read(10);
            }
            lessonCompletedDialogonViewCreatedllm1.flush();
            if (this.size > this.maxSize || AudioAttributesImplApi21Parcelizer()) {
                this.cleanupQueue.RemoteActionCompatParcelizer(this.cleanupTask, 0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AudioAttributesImplApi21Parcelizer() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    public final boolean RemoteActionCompatParcelizer(String str) throws IOException {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(str, "");
            RatingCompat();
            MediaBrowserCompatCustomActionResultReceiver();
            AudioAttributesCompatParcelizer(str);
            IconCompatParcelizer iconCompatParcelizer = this.lruEntries.get(str);
            if (iconCompatParcelizer == null) {
                return false;
            }
            IconCompatParcelizer(iconCompatParcelizer);
            if (this.size <= this.maxSize) {
                this.mostRecentTrimFailed = false;
            }
            return true;
        }
    }

    public final boolean IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) throws IOException {
        LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1;
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        if (!this.civilizedFileSystem) {
            if (iconCompatParcelizer.getLockingSourceCount() > 0 && (lessonCompletedDialogonViewCreatedllm1 = this.journalWriter) != null) {
                lessonCompletedDialogonViewCreatedllm1.read(DIRTY);
                lessonCompletedDialogonViewCreatedllm1.read(32);
                lessonCompletedDialogonViewCreatedllm1.read(iconCompatParcelizer.getKey());
                lessonCompletedDialogonViewCreatedllm1.read(10);
                lessonCompletedDialogonViewCreatedllm1.flush();
            }
            if (iconCompatParcelizer.getLockingSourceCount() > 0 || iconCompatParcelizer.getCurrentEditor() != null) {
                iconCompatParcelizer.RatingCompat();
                return true;
            }
        }
        RemoteActionCompatParcelizer currentEditor = iconCompatParcelizer.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.write();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.IconCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer().get(i2));
            this.size -= iconCompatParcelizer.getLengths()[i2];
            iconCompatParcelizer.getLengths()[i2] = 0;
        }
        this.redundantOpCount++;
        LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm12 = this.journalWriter;
        if (lessonCompletedDialogonViewCreatedllm12 != null) {
            lessonCompletedDialogonViewCreatedllm12.read(REMOVE);
            lessonCompletedDialogonViewCreatedllm12.read(32);
            lessonCompletedDialogonViewCreatedllm12.read(iconCompatParcelizer.getKey());
            lessonCompletedDialogonViewCreatedllm12.read(10);
        }
        this.lruEntries.remove(iconCompatParcelizer.getKey());
        if (AudioAttributesImplApi21Parcelizer()) {
            this.cleanupQueue.RemoteActionCompatParcelizer(this.cleanupTask, 0L);
        }
        return true;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        synchronized (this) {
            if (this.closed) {
                throw new IllegalStateException("cache is closed".toString());
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        synchronized (this) {
            if (this.initialized) {
                MediaBrowserCompatCustomActionResultReceiver();
                MediaBrowserCompatItemReceiver();
                LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = this.journalWriter;
                toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1);
                lessonCompletedDialogonViewCreatedllm1.flush();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RemoteActionCompatParcelizer currentEditor;
        synchronized (this) {
            if (this.initialized && !this.closed) {
                Collection<IconCompatParcelizer> collectionValues = this.lruEntries.values();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionValues, "");
                for (IconCompatParcelizer iconCompatParcelizer : (IconCompatParcelizer[]) collectionValues.toArray(new IconCompatParcelizer[0])) {
                    if (iconCompatParcelizer.getCurrentEditor() != null && (currentEditor = iconCompatParcelizer.getCurrentEditor()) != null) {
                        currentEditor.write();
                    }
                }
                MediaBrowserCompatItemReceiver();
                LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = this.journalWriter;
                toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1);
                lessonCompletedDialogonViewCreatedllm1.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        }
    }

    public final void MediaBrowserCompatItemReceiver() throws IOException {
        while (this.size > this.maxSize) {
            if (!MediaMetadataCompat()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    private final boolean MediaMetadataCompat() throws IOException {
        for (IconCompatParcelizer iconCompatParcelizer : this.lruEntries.values()) {
            if (!iconCompatParcelizer.getZombie()) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
                IconCompatParcelizer(iconCompatParcelizer);
                return true;
            }
        }
        return false;
    }

    private void MediaDescriptionCompat() throws IOException {
        close();
        this.fileSystem.RemoteActionCompatParcelizer(this.directory);
    }

    private static void AudioAttributesCompatParcelizer(String str) {
        if (LEGAL_KEY_PATTERN.write(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
        sb.append(str);
        sb.append('\"');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final class AudioAttributesCompatParcelizer implements Closeable {
        private final List<setLockedFromSeek> AudioAttributesCompatParcelizer;
        private final long[] IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private /* synthetic */ McqDataModule read;
        private final long write;

        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesCompatParcelizer(McqDataModule mcqDataModule, String str, long j, List<? extends setLockedFromSeek> list, long[] jArr) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(jArr, "");
            this.read = mcqDataModule;
            this.RemoteActionCompatParcelizer = str;
            this.write = j;
            this.AudioAttributesCompatParcelizer = list;
            this.IconCompatParcelizer = jArr;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer() throws IOException {
            return this.read.read(this.RemoteActionCompatParcelizer, this.write);
        }

        public final setLockedFromSeek IconCompatParcelizer(int i) {
            return this.AudioAttributesCompatParcelizer.get(i);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator<setLockedFromSeek> it = this.AudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                FirebaseDataModule.read(it.next());
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00060\u0002R\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/McqDataModule$RemoteActionCompatParcelizer;", "", "Lo/McqDataModule$IconCompatParcelizer;", "Lo/McqDataModule;", "p0", "<init>", "(Lo/McqDataModule;Lo/McqDataModule$IconCompatParcelizer;)V", "", "IconCompatParcelizer", "()V", "AudioAttributesCompatParcelizer", "write", "", "Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "RemoteActionCompatParcelizer", "(I)Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "", "done", "Z", "entry", "Lo/McqDataModule$IconCompatParcelizer;", "()Lo/McqDataModule$IconCompatParcelizer;", "", "written", "[Z", "read", "()[Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class RemoteActionCompatParcelizer {
        private boolean done;
        private final IconCompatParcelizer entry;
        final /* synthetic */ McqDataModule this$0;
        private final boolean[] written;

        public RemoteActionCompatParcelizer(McqDataModule mcqDataModule, IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.this$0 = mcqDataModule;
            this.entry = iconCompatParcelizer;
            this.written = iconCompatParcelizer.getReadable() ? null : new boolean[mcqDataModule.getValueCount()];
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final IconCompatParcelizer getEntry() {
            return this.entry;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        public final void write() throws IOException {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.entry.getCurrentEditor(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.AudioAttributesCompatParcelizer(this, false);
                } else {
                    this.entry.RatingCompat();
                }
            }
        }

        public final setCompoundDrawablesWithIntrinsicBoundsCompatdefault RemoteActionCompatParcelizer(int p0) {
            McqDataModule mcqDataModule = this.this$0;
            synchronized (mcqDataModule) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.entry.getCurrentEditor(), this)) {
                    return CustomAppBarLayout.RemoteActionCompatParcelizer();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    toMagicModuleMetaRepoModel.write(zArr);
                    zArr[p0] = true;
                }
                try {
                    return new NetworkModule(mcqDataModule.getFileSystem().AudioAttributesCompatParcelizer(this.entry.write().get(p0)), new AnonymousClass1(mcqDataModule, this));
                } catch (FileNotFoundException unused) {
                    return CustomAppBarLayout.RemoteActionCompatParcelizer();
                }
            }
        }

        /* JADX INFO: renamed from: o.McqDataModule$RemoteActionCompatParcelizer$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<IOException, getShowPopup> {
            private /* synthetic */ McqDataModule AudioAttributesCompatParcelizer;
            private /* synthetic */ RemoteActionCompatParcelizer write;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(IOException iOException) {
                RemoteActionCompatParcelizer(iOException);
                return getShowPopup.INSTANCE;
            }

            public final void RemoteActionCompatParcelizer(IOException iOException) {
                toMagicModuleMetaRepoModel.write(iOException, "");
                McqDataModule mcqDataModule = this.AudioAttributesCompatParcelizer;
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write;
                synchronized (mcqDataModule) {
                    remoteActionCompatParcelizer.write();
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(McqDataModule mcqDataModule, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                super(1);
                this.AudioAttributesCompatParcelizer = mcqDataModule;
                this.write = remoteActionCompatParcelizer;
            }
        }

        public final void AudioAttributesCompatParcelizer() throws IOException {
            McqDataModule mcqDataModule = this.this$0;
            synchronized (mcqDataModule) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.entry.getCurrentEditor(), this)) {
                    mcqDataModule.AudioAttributesCompatParcelizer(this, true);
                }
                this.done = true;
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }

        public final void IconCompatParcelizer() throws IOException {
            McqDataModule mcqDataModule = this.this$0;
            synchronized (mcqDataModule) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.entry.getCurrentEditor(), this)) {
                    mcqDataModule.AudioAttributesCompatParcelizer(this, false);
                }
                this.done = true;
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0018\u00010\u0011R\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\f\u0010\u001cR(\u0010\u001e\u001a\b\u0018\u00010\u001dR\u00020\u00128\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u000f\u0010 \"\u0004\b!\u0010\"R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0001X\u0081\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001a\u0010$\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&R\u001a\u0010(\u001a\u00020'8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\b\u0010*R\"\u0010+\u001a\u00020\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b!\u0010/R\"\u00101\u001a\u0002008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b!\u0010<R\"\u0010=\u001a\u0002008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b=\u00102\u001a\u0004\b>\u00104\"\u0004\b?\u00106"}, d2 = {"Lo/McqDataModule$IconCompatParcelizer;", "", "", "p0", "<init>", "(Lo/McqDataModule;Ljava/lang/String;)V", "", "", "RemoteActionCompatParcelizer", "(Ljava/util/List;)Ljava/lang/Void;", "", "Lo/setLockedFromSeek;", "AudioAttributesCompatParcelizer", "(I)Lo/setLockedFromSeek;", "", "read", "(Ljava/util/List;)V", "Lo/McqDataModule$AudioAttributesCompatParcelizer;", "Lo/McqDataModule;", "MediaBrowserCompatMediaItem", "()Lo/McqDataModule$AudioAttributesCompatParcelizer;", "Lo/LessonCompletedDialogonViewCreatedllm1;", "write", "(Lo/LessonCompletedDialogonViewCreatedllm1;)V", "", "Ljava/io/File;", "cleanFiles", "Ljava/util/List;", "()Ljava/util/List;", "Lo/McqDataModule$RemoteActionCompatParcelizer;", "currentEditor", "Lo/McqDataModule$RemoteActionCompatParcelizer;", "()Lo/McqDataModule$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "(Lo/McqDataModule$RemoteActionCompatParcelizer;)V", "dirtyFiles", "key", "Ljava/lang/String;", "()Ljava/lang/String;", "", "lengths", "[J", "()[J", "lockingSourceCount", "I", "AudioAttributesImplApi21Parcelizer", "()I", "(I)V", "", "readable", "Z", "AudioAttributesImplApi26Parcelizer", "()Z", "AudioAttributesImplBaseParcelizer", "()V", "", "sequenceNumber", "J", "MediaBrowserCompatItemReceiver", "()J", "(J)V", "zombie", "MediaBrowserCompatCustomActionResultReceiver", "RatingCompat"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class IconCompatParcelizer {
        private final List<File> cleanFiles;
        private RemoteActionCompatParcelizer currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ McqDataModule this$0;
        private boolean zombie;

        public IconCompatParcelizer(McqDataModule mcqDataModule, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.this$0 = mcqDataModule;
            this.key = str;
            this.lengths = new long[mcqDataModule.getValueCount()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount = mcqDataModule.getValueCount();
            for (int i = 0; i < valueCount; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        public final List<File> AudioAttributesCompatParcelizer() {
            return this.cleanFiles;
        }

        public final List<File> write() {
            return this.dirtyFiles;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        public final void AudioAttributesImplBaseParcelizer() {
            this.readable = true;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void RatingCompat() {
            this.zombie = true;
        }

        public final void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.currentEditor = remoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final RemoteActionCompatParcelizer getCurrentEditor() {
            return this.currentEditor;
        }

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        public final void IconCompatParcelizer(int i) {
            this.lockingSourceCount = i;
        }

        public final void IconCompatParcelizer(long j) {
            this.sequenceNumber = j;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        public final void read(List<String> p0) throws IOException {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p0.size() != this.this$0.getValueCount()) {
                RemoteActionCompatParcelizer(p0);
                throw new PlanDetailsCreator();
            }
            try {
                int size = p0.size();
                for (int i = 0; i < size; i++) {
                    this.lengths[i] = Long.parseLong(p0.get(i));
                }
            } catch (NumberFormatException unused) {
                RemoteActionCompatParcelizer(p0);
                throw new PlanDetailsCreator();
            }
        }

        public final void write(LessonCompletedDialogonViewCreatedllm1 p0) throws IOException {
            toMagicModuleMetaRepoModel.write(p0, "");
            for (long j : this.lengths) {
                p0.read(32).MediaBrowserCompatMediaItem(j);
            }
        }

        private static Void RemoteActionCompatParcelizer(List<String> p0) throws IOException {
            throw new IOException("unexpected journal line: ".concat(String.valueOf(p0)));
        }

        private final setLockedFromSeek AudioAttributesCompatParcelizer(int p0) throws FileNotFoundException {
            setLockedFromSeek setlockedfromseekAudioAttributesImplBaseParcelizer = this.this$0.getFileSystem().AudioAttributesImplBaseParcelizer(this.cleanFiles.get(p0));
            if (this.this$0.civilizedFileSystem) {
                return setlockedfromseekAudioAttributesImplBaseParcelizer;
            }
            this.lockingSourceCount++;
            return new read(setlockedfromseekAudioAttributesImplBaseParcelizer, this.this$0, this);
        }

        public static final class read extends setRelatedModuleAdapter {
            private boolean AudioAttributesCompatParcelizer;
            private /* synthetic */ IconCompatParcelizer read;
            private /* synthetic */ McqDataModule write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            read(setLockedFromSeek setlockedfromseek, McqDataModule mcqDataModule, IconCompatParcelizer iconCompatParcelizer) {
                super(setlockedfromseek);
                this.write = mcqDataModule;
                this.read = iconCompatParcelizer;
            }

            @Override // kotlin.setRelatedModuleAdapter, kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                super.close();
                if (this.AudioAttributesCompatParcelizer) {
                    return;
                }
                this.AudioAttributesCompatParcelizer = true;
                McqDataModule mcqDataModule = this.write;
                IconCompatParcelizer iconCompatParcelizer = this.read;
                synchronized (mcqDataModule) {
                    iconCompatParcelizer.IconCompatParcelizer(iconCompatParcelizer.getLockingSourceCount() - 1);
                    if (iconCompatParcelizer.getLockingSourceCount() == 0 && iconCompatParcelizer.getZombie()) {
                        mcqDataModule.IconCompatParcelizer(iconCompatParcelizer);
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            }
        }

        public final AudioAttributesCompatParcelizer MediaBrowserCompatMediaItem() {
            boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = this.this$0.getValueCount();
                for (int i = 0; i < valueCount; i++) {
                    arrayList.add(AudioAttributesCompatParcelizer(i));
                }
                return new AudioAttributesCompatParcelizer(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FirebaseDataModule.read((setLockedFromSeek) it.next());
                }
                try {
                    this.this$0.IconCompatParcelizer(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }
    }

    private void RatingCompat() throws IOException {
        synchronized (this) {
            boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.read(this.journalFileBackup)) {
                if (this.fileSystem.read(this.journalFile)) {
                    this.fileSystem.IconCompatParcelizer(this.journalFileBackup);
                } else {
                    this.fileSystem.write(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = FirebaseDataModule.RemoteActionCompatParcelizer(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.read(this.journalFile)) {
                try {
                    MediaBrowserCompatSearchResultReceiver();
                    AudioAttributesImplApi26Parcelizer();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                    SettingsItem.IconCompatParcelizer.write();
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(this.directory);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    SettingsItem.AudioAttributesCompatParcelizer(sb.toString(), 5, e);
                    try {
                        MediaDescriptionCompat();
                        this.closed = false;
                        AudioAttributesCompatParcelizer();
                        this.initialized = true;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            AudioAttributesCompatParcelizer();
            this.initialized = true;
        }
    }
}
