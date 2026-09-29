package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 X2\u00020\u0001:\u0004X#\u0016\u000fB3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0013\u0010\u0018J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b\u000f\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010!J\u001d\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\"J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0019J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0000¢\u0006\u0004\b&\u0010\u0012J\r\u0010'\u001a\u00020\u001d¢\u0006\u0004\b'\u0010\u001fR\u0017\u0010(\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u000f\u0010*R\u001e\u0010+\u001a\u0004\u0018\u00010\u00148A@\u0000X\u0081\f¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b#\u0010-R\u001e\u0010.\u001a\u0004\u0018\u00010\u00158\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0016\u00100R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\t038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0011\u0010\u0011\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u000f\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b<\u0010;R*\u0010=\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\b#\u0010\u0010R*\u0010A\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@\"\u0004\b\u0013\u0010\u0010R\u001e\u0010D\u001a\u00060CR\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001e\u0010I\u001a\u00060HR\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001e\u0010N\u001a\u00060MR\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010R\u001a\u00020\r8\u0007@@X\u0087\f¢\u0006\f\n\u0004\bR\u0010>\u001a\u0004\bS\u0010@R*\u0010T\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010>\u001a\u0004\bU\u0010@\"\u0004\b\u0016\u0010\u0010R\u001e\u0010V\u001a\u00060CR\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\bV\u0010E\u001a\u0004\bW\u0010G"}, d2 = {"Lo/setTimelineAdapter;", "", "", "p0", "Lo/BlockingViewModel_HiltModulesKeyModule;", "p1", "", "p2", "p3", "Lo/ShapeKt;", "p4", "<init>", "(ILo/BlockingViewModel_HiltModulesKeyModule;ZZLo/ShapeKt;)V", "", "", "read", "(J)V", "IconCompatParcelizer", "()V", "RemoteActionCompatParcelizer", "Lo/getConnectionMonitor;", "Ljava/io/IOException;", "AudioAttributesCompatParcelizer", "(Lo/getConnectionMonitor;Ljava/io/IOException;)V", "(Lo/getConnectionMonitor;Ljava/io/IOException;)Z", "(Lo/getConnectionMonitor;)V", "Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "AudioAttributesImplApi21Parcelizer", "()Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "Lo/CustomTextView;", "handleMediaPlayPauseIfPendingOnHandler", "()Lo/CustomTextView;", "Lo/LessonCompletedDialog;", "(Lo/LessonCompletedDialog;I)V", "(Lo/ShapeKt;Z)V", "write", "onAddQueueItem", "()Lo/ShapeKt;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onMediaButtonEvent", "connection", "Lo/BlockingViewModel_HiltModulesKeyModule;", "()Lo/BlockingViewModel_HiltModulesKeyModule;", "errorCode", "Lo/getConnectionMonitor;", "()Lo/getConnectionMonitor;", "errorException", "Ljava/io/IOException;", "()Ljava/io/IOException;", "hasResponseHeaders", "Z", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "id", "I", "AudioAttributesImplApi26Parcelizer", "()I", "onCustomAction", "()Z", "onCommand", "readBytesAcknowledged", "J", "AudioAttributesImplBaseParcelizer", "()J", "readBytesTotal", "MediaBrowserCompatItemReceiver", "Lo/setTimelineAdapter$read;", "readTimeout", "Lo/setTimelineAdapter$read;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/setTimelineAdapter$read;", "Lo/setTimelineAdapter$write;", "sink", "Lo/setTimelineAdapter$write;", "MediaMetadataCompat", "()Lo/setTimelineAdapter$write;", "Lo/setTimelineAdapter$AudioAttributesCompatParcelizer;", "source", "Lo/setTimelineAdapter$AudioAttributesCompatParcelizer;", "MediaDescriptionCompat", "()Lo/setTimelineAdapter$AudioAttributesCompatParcelizer;", "writeBytesMaximum", "MediaBrowserCompatMediaItem", "writeBytesTotal", "MediaBrowserCompatSearchResultReceiver", "writeTimeout", "RatingCompat", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class setTimelineAdapter {
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final BlockingViewModel_HiltModulesKeyModule connection;
    private getConnectionMonitor errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<ShapeKt> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final read readTimeout;
    private final write sink;
    private final AudioAttributesCompatParcelizer source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final read writeTimeout;

    public setTimelineAdapter(int i, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, boolean z, boolean z2, ShapeKt shapeKt) {
        toMagicModuleMetaRepoModel.write(blockingViewModel_HiltModulesKeyModule, "");
        this.id = i;
        this.connection = blockingViewModel_HiltModulesKeyModule;
        this.writeBytesMaximum = blockingViewModel_HiltModulesKeyModule.getPeerSettings().RemoteActionCompatParcelizer();
        ArrayDeque<ShapeKt> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new AudioAttributesCompatParcelizer(blockingViewModel_HiltModulesKeyModule.getOkHttpSettings().RemoteActionCompatParcelizer(), z2);
        this.sink = new write(z);
        this.readTimeout = new read();
        this.writeTimeout = new read();
        if (shapeKt != null) {
            if (onCustomAction()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(shapeKt);
        } else if (!onCustomAction()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final BlockingViewModel_HiltModulesKeyModule getConnection() {
        return this.connection;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.readBytesTotal = j;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final void write(long j) {
        this.readBytesAcknowledged = j;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.writeBytesTotal = j;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final AudioAttributesCompatParcelizer getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final write getSink() {
        return this.sink;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final read getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final read getWriteTimeout() {
        return this.writeTimeout;
    }

    public final getConnectionMonitor write() {
        getConnectionMonitor getconnectionmonitor;
        synchronized (this) {
            getconnectionmonitor = this.errorCode;
        }
        return getconnectionmonitor;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    public final boolean onCommand() {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if ((this.source.getFinished() || this.source.getClosed()) && (this.sink.getFinished() || this.sink.getClosed())) {
                if (this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean onCustomAction() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final ShapeKt onAddQueueItem() throws IOException {
        ShapeKt shapeKt;
        synchronized (this) {
            this.readTimeout.MediaBrowserCompatItemReceiver();
            while (this.headersQueue.isEmpty() && this.errorCode == null) {
                try {
                    MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                } catch (Throwable th) {
                    this.readTimeout.write();
                    throw th;
                }
            }
            this.readTimeout.write();
            if (!this.headersQueue.isEmpty()) {
                ShapeKt shapeKtRemoveFirst = this.headersQueue.removeFirst();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(shapeKtRemoveFirst, "");
                shapeKt = shapeKtRemoveFirst;
            } else {
                IOException navKey = this.errorException;
                if (navKey == null) {
                    getConnectionMonitor getconnectionmonitor = this.errorCode;
                    toMagicModuleMetaRepoModel.write(getconnectionmonitor);
                    navKey = new NavKey(getconnectionmonitor);
                }
                throw navKey;
            }
        }
        return shapeKt;
    }

    public final CustomTextView handleMediaPlayPauseIfPendingOnHandler() {
        return this.readTimeout;
    }

    public final CustomTextView onMediaButtonEvent() {
        return this.writeTimeout;
    }

    public final setCompoundDrawablesWithIntrinsicBoundsCompatdefault AudioAttributesImplApi21Parcelizer() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !onCustomAction()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        return this.sink;
    }

    public final void AudioAttributesCompatParcelizer(getConnectionMonitor p0, IOException p1) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (RemoteActionCompatParcelizer(p0, p1)) {
            this.connection.RemoteActionCompatParcelizer(this.id, p0);
        }
    }

    public final void read(getConnectionMonitor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (RemoteActionCompatParcelizer(p0, (IOException) null)) {
            this.connection.AudioAttributesCompatParcelizer(this.id, p0);
        }
    }

    public final void write(getConnectionMonitor p0) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (this.errorCode == null) {
                this.errorCode = p0;
                toMagicModuleMetaRepoModel.read(this, "");
                notifyAll();
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0014R\u001c\u0010\u0015\u001a\u00020\u00048\u0001@\u0000X\u0080\f¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017\"\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001e\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b!\u0010\"\"\u0004\b\u0012\u0010#"}, d2 = {"Lo/setTimelineAdapter$AudioAttributesCompatParcelizer;", "Lo/setLockedFromSeek;", "", "p0", "", "p1", "<init>", "(Lo/setTimelineAdapter;JZ)V", "", "close", "()V", "Lo/resetCurrentSelectedPosition;", "AudioAttributesCompatParcelizer", "(Lo/resetCurrentSelectedPosition;J)J", "Lo/LessonCompletedDialog;", "read", "(Lo/LessonCompletedDialog;J)V", "Lo/CustomTextView;", "RemoteActionCompatParcelizer", "()Lo/CustomTextView;", "(J)V", "closed", "Z", "()Z", "finished", "write", "IconCompatParcelizer", "maxByteCount", "J", "readBuffer", "Lo/resetCurrentSelectedPosition;", "receiveBuffer", "Lo/ShapeKt;", "trailers", "Lo/ShapeKt;", "(Lo/ShapeKt;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class AudioAttributesCompatParcelizer implements setLockedFromSeek {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private ShapeKt trailers;
        private final resetCurrentSelectedPosition receiveBuffer = new resetCurrentSelectedPosition();
        private final resetCurrentSelectedPosition readBuffer = new resetCurrentSelectedPosition();

        public AudioAttributesCompatParcelizer(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        public final void IconCompatParcelizer() {
            this.finished = true;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        public final void RemoteActionCompatParcelizer(ShapeKt shapeKt) {
            this.trailers = shapeKt;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        @Override // kotlin.setLockedFromSeek
        public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition p0, long p1) throws IOException {
            NavKey errorException;
            boolean z;
            long jAudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(p0, "");
            long j = 0;
            if (p1 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(p1)).toString());
            }
            while (true) {
                setTimelineAdapter settimelineadapter = setTimelineAdapter.this;
                synchronized (settimelineadapter) {
                    settimelineadapter.getReadTimeout().MediaBrowserCompatItemReceiver();
                    try {
                        if (settimelineadapter.write() == null || this.finished) {
                            errorException = null;
                        } else {
                            errorException = settimelineadapter.getErrorException();
                            if (errorException == null) {
                                getConnectionMonitor getconnectionmonitorWrite = settimelineadapter.write();
                                toMagicModuleMetaRepoModel.write(getconnectionmonitorWrite);
                                errorException = new NavKey(getconnectionmonitorWrite);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        z = false;
                        if (this.readBuffer.getSize() > j) {
                            resetCurrentSelectedPosition resetcurrentselectedposition = this.readBuffer;
                            jAudioAttributesCompatParcelizer = resetcurrentselectedposition.AudioAttributesCompatParcelizer(p0, Math.min(p1, resetcurrentselectedposition.getSize()));
                            settimelineadapter.RemoteActionCompatParcelizer(settimelineadapter.getReadBytesTotal() + jAudioAttributesCompatParcelizer);
                            long readBytesTotal = settimelineadapter.getReadBytesTotal() - settimelineadapter.getReadBytesAcknowledged();
                            if (errorException == null && readBytesTotal >= settimelineadapter.getConnection().getOkHttpSettings().RemoteActionCompatParcelizer() / 2) {
                                settimelineadapter.getConnection().IconCompatParcelizer(settimelineadapter.getId(), readBytesTotal);
                                settimelineadapter.write(settimelineadapter.getReadBytesTotal());
                            }
                        } else {
                            if (!this.finished && errorException == null) {
                                settimelineadapter.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                                z = true;
                            }
                            jAudioAttributesCompatParcelizer = -1;
                        }
                        settimelineadapter.getReadTimeout().write();
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    } finally {
                    }
                }
                if (!z) {
                    if (jAudioAttributesCompatParcelizer != -1) {
                        return jAudioAttributesCompatParcelizer;
                    }
                    if (errorException == null) {
                        return -1L;
                    }
                    throw errorException;
                }
                j = 0;
            }
        }

        @Override // kotlin.setLockedFromSeek
        public final CustomTextView RemoteActionCompatParcelizer() {
            return setTimelineAdapter.this.getReadTimeout();
        }

        @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long size;
            setTimelineAdapter settimelineadapter = setTimelineAdapter.this;
            synchronized (settimelineadapter) {
                this.closed = true;
                size = this.readBuffer.getSize();
                this.readBuffer.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(settimelineadapter, "");
                settimelineadapter.notifyAll();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            if (size > 0) {
                read(size);
            }
            setTimelineAdapter.this.IconCompatParcelizer();
        }

        private final void read(long p0) {
            boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
            setTimelineAdapter.this.getConnection().RemoteActionCompatParcelizer(p0);
        }

        public final void read(LessonCompletedDialog p0, long p1) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            toMagicModuleMetaRepoModel.write(p0, "");
            boolean z4 = FirebaseDataModule.AudioAttributesCompatParcelizer;
            long j = p1;
            while (j > 0) {
                synchronized (setTimelineAdapter.this) {
                    z = this.finished;
                    z2 = true;
                    z3 = this.readBuffer.getSize() + j > this.maxByteCount;
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
                if (z3) {
                    p0.AudioAttributesImplBaseParcelizer(j);
                    setTimelineAdapter.this.read(getConnectionMonitor.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    p0.AudioAttributesImplBaseParcelizer(j);
                    return;
                }
                long jAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(this.receiveBuffer, j);
                if (jAudioAttributesCompatParcelizer == -1) {
                    throw new EOFException();
                }
                j -= jAudioAttributesCompatParcelizer;
                setTimelineAdapter settimelineadapter = setTimelineAdapter.this;
                synchronized (settimelineadapter) {
                    if (this.closed) {
                        this.receiveBuffer.IconCompatParcelizer();
                    } else {
                        if (this.readBuffer.getSize() != 0) {
                            z2 = false;
                        }
                        this.readBuffer.write((setLockedFromSeek) this.receiveBuffer);
                        if (z2) {
                            toMagicModuleMetaRepoModel.read(settimelineadapter, "");
                            settimelineadapter.notifyAll();
                        }
                    }
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                }
            }
            read(p1);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/setTimelineAdapter$write;", "Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "", "p0", "<init>", "(Lo/setTimelineAdapter;Z)V", "", "close", "()V", "RemoteActionCompatParcelizer", "(Z)V", "flush", "Lo/CustomTextView;", "()Lo/CustomTextView;", "Lo/resetCurrentSelectedPosition;", "", "p1", "IconCompatParcelizer", "(Lo/resetCurrentSelectedPosition;J)V", "closed", "Z", "write", "()Z", "finished", "AudioAttributesCompatParcelizer", "sendBuffer", "Lo/resetCurrentSelectedPosition;", "Lo/ShapeKt;", "trailers", "Lo/ShapeKt;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class write implements setCompoundDrawablesWithIntrinsicBoundsCompatdefault {
        private boolean closed;
        private boolean finished;
        private final resetCurrentSelectedPosition sendBuffer = new resetCurrentSelectedPosition();
        public ShapeKt trailers;

        public write(boolean z) {
            this.finished = z;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        private final void RemoteActionCompatParcelizer(boolean p0) throws IOException {
            long jMin;
            boolean z;
            setTimelineAdapter settimelineadapter = setTimelineAdapter.this;
            synchronized (settimelineadapter) {
                settimelineadapter.getWriteTimeout().MediaBrowserCompatItemReceiver();
                while (settimelineadapter.getWriteBytesTotal() >= settimelineadapter.getWriteBytesMaximum() && !this.finished && !this.closed && settimelineadapter.write() == null) {
                    try {
                        settimelineadapter.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    } finally {
                        settimelineadapter.getWriteTimeout().write();
                    }
                }
                settimelineadapter.getWriteTimeout().write();
                settimelineadapter.RemoteActionCompatParcelizer();
                jMin = Math.min(settimelineadapter.getWriteBytesMaximum() - settimelineadapter.getWriteBytesTotal(), this.sendBuffer.getSize());
                settimelineadapter.AudioAttributesCompatParcelizer(settimelineadapter.getWriteBytesTotal() + jMin);
                z = p0 && jMin == this.sendBuffer.getSize();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            setTimelineAdapter.this.getWriteTimeout().MediaBrowserCompatItemReceiver();
            try {
                setTimelineAdapter.this.getConnection().RemoteActionCompatParcelizer(setTimelineAdapter.this.getId(), z, this.sendBuffer, jMin);
            } finally {
                settimelineadapter = setTimelineAdapter.this;
            }
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
        public final CustomTextView RemoteActionCompatParcelizer() {
            return setTimelineAdapter.this.getWriteTimeout();
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
        public final void IconCompatParcelizer(resetCurrentSelectedPosition p0, long p1) throws IOException {
            toMagicModuleMetaRepoModel.write(p0, "");
            boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
            this.sendBuffer.IconCompatParcelizer(p0, p1);
            while (this.sendBuffer.getSize() >= setTimelineAdapter.EMIT_BUFFER_SIZE) {
                RemoteActionCompatParcelizer(false);
            }
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Flushable
        public final void flush() throws IOException {
            boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
            setTimelineAdapter settimelineadapter = setTimelineAdapter.this;
            synchronized (settimelineadapter) {
                settimelineadapter.RemoteActionCompatParcelizer();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            while (this.sendBuffer.getSize() > 0) {
                RemoteActionCompatParcelizer(false);
                setTimelineAdapter.this.getConnection().write();
            }
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
            setTimelineAdapter settimelineadapter = setTimelineAdapter.this;
            synchronized (settimelineadapter) {
                if (this.closed) {
                    return;
                }
                boolean z2 = settimelineadapter.write() == null;
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                if (!setTimelineAdapter.this.getSink().finished) {
                    boolean z3 = this.sendBuffer.getSize() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.getSize() > 0) {
                            RemoteActionCompatParcelizer(false);
                        }
                        BlockingViewModel_HiltModulesKeyModule connection = setTimelineAdapter.this.getConnection();
                        int id = setTimelineAdapter.this.getId();
                        ShapeKt shapeKt = this.trailers;
                        toMagicModuleMetaRepoModel.write(shapeKt);
                        connection.RemoteActionCompatParcelizer(id, z2, FirebaseDataModule.IconCompatParcelizer(shapeKt));
                    } else if (z3) {
                        while (this.sendBuffer.getSize() > 0) {
                            RemoteActionCompatParcelizer(true);
                        }
                    } else if (z2) {
                        setTimelineAdapter.this.getConnection().RemoteActionCompatParcelizer(setTimelineAdapter.this.getId(), true, null, 0L);
                    }
                }
                synchronized (setTimelineAdapter.this) {
                    this.closed = true;
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                }
                setTimelineAdapter.this.getConnection().write();
                setTimelineAdapter.this.IconCompatParcelizer();
            }
        }
    }

    public final void read(long p0) {
        this.writeBytesMaximum += p0;
        if (p0 > 0) {
            toMagicModuleMetaRepoModel.read(this, "");
            notifyAll();
        }
    }

    public final void RemoteActionCompatParcelizer() throws Throwable {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        getConnectionMonitor getconnectionmonitor = this.errorCode;
        if (getconnectionmonitor != null) {
            Throwable navKey = this.errorException;
            if (navKey == null) {
                toMagicModuleMetaRepoModel.write(getconnectionmonitor);
                navKey = new NavKey(getconnectionmonitor);
            }
            throw navKey;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0005\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0006"}, d2 = {"Lo/setTimelineAdapter$read;", "Lo/setSubscriptionDataProvider;", "<init>", "(Lo/setTimelineAdapter;)V", "", "write", "()V", "Ljava/io/IOException;", "p0", "(Ljava/io/IOException;)Ljava/io/IOException;", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class read extends setSubscriptionDataProvider {
        public read() {
        }

        @Override // kotlin.setSubscriptionDataProvider
        public final void RemoteActionCompatParcelizer() {
            setTimelineAdapter.this.read(getConnectionMonitor.CANCEL);
            setTimelineAdapter.this.getConnection().MediaBrowserCompatSearchResultReceiver();
        }

        @Override // kotlin.setSubscriptionDataProvider
        public final IOException write(IOException p0) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (p0 != null) {
                socketTimeoutException.initCause(p0);
            }
            return socketTimeoutException;
        }

        public final void write() throws IOException {
            if (AudioAttributesImplApi26Parcelizer()) {
                throw write(null);
            }
        }
    }

    private final boolean RemoteActionCompatParcelizer(getConnectionMonitor p0, IOException p1) {
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = p0;
            this.errorException = p1;
            toMagicModuleMetaRepoModel.read(this, "");
            notifyAll();
            if (this.source.getFinished() && this.sink.getFinished()) {
                return false;
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            this.connection.RemoteActionCompatParcelizer(this.id);
            return true;
        }
    }

    public final void RemoteActionCompatParcelizer(LessonCompletedDialog p0, int p1) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        this.source.read(p0, p1);
    }

    public final void AudioAttributesCompatParcelizer(ShapeKt p0, boolean p1) {
        boolean zOnCommand;
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        synchronized (this) {
            if (!this.hasResponseHeaders || !p1) {
                this.hasResponseHeaders = true;
                this.headersQueue.add(p0);
            } else {
                this.source.RemoteActionCompatParcelizer(p0);
            }
            if (p1) {
                this.source.IconCompatParcelizer();
            }
            zOnCommand = onCommand();
            toMagicModuleMetaRepoModel.read(this, "");
            notifyAll();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        if (zOnCommand) {
            return;
        }
        this.connection.RemoteActionCompatParcelizer(this.id);
    }

    public final void IconCompatParcelizer() throws IOException {
        boolean z;
        boolean zOnCommand;
        boolean z2 = FirebaseDataModule.AudioAttributesCompatParcelizer;
        synchronized (this) {
            z = !this.source.getFinished() && this.source.getClosed() && (this.sink.getFinished() || this.sink.getClosed());
            zOnCommand = onCommand();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        if (z) {
            AudioAttributesCompatParcelizer(getConnectionMonitor.CANCEL, (IOException) null);
        } else {
            if (zOnCommand) {
                return;
            }
            this.connection.RemoteActionCompatParcelizer(this.id);
        }
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws InterruptedIOException {
        try {
            toMagicModuleMetaRepoModel.read(this, "");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
