package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.BaseActivity;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.SettingsItem;
import kotlin.SubscriptionDataModule;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u0099\u00012\u00020\u0001:\b\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010P\u001a\u00020QJ\b\u0010R\u001a\u00020QH\u0016J'\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010WH\u0000¢\u0006\u0002\bXJ\u0012\u0010Y\u001a\u00020Q2\b\u0010Z\u001a\u0004\u0018\u00010WH\u0002J\u0006\u0010[\u001a\u00020QJ\u0010\u0010\\\u001a\u0004\u0018\u00010B2\u0006\u0010]\u001a\u00020\u0012J\u000e\u0010^\u001a\u00020\t2\u0006\u0010_\u001a\u00020\u0006J&\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tH\u0002J\u001c\u0010`\u001a\u00020B2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tJ\u0006\u0010f\u001a\u00020\u0012J-\u0010g\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u00122\u0006\u0010l\u001a\u00020\tH\u0000¢\u0006\u0002\bmJ+\u0010n\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010l\u001a\u00020\tH\u0000¢\u0006\u0002\boJ#\u0010p\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0cH\u0000¢\u0006\u0002\bqJ\u001d\u0010r\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010s\u001a\u00020TH\u0000¢\u0006\u0002\btJ$\u0010u\u001a\u00020B2\u0006\u0010a\u001a\u00020\u00122\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c2\u0006\u0010e\u001a\u00020\tJ\u0015\u0010v\u001a\u00020\t2\u0006\u0010h\u001a\u00020\u0012H\u0000¢\u0006\u0002\bwJ\u0017\u0010x\u001a\u0004\u0018\u00010B2\u0006\u0010h\u001a\u00020\u0012H\u0000¢\u0006\u0002\byJ\r\u0010z\u001a\u00020QH\u0000¢\u0006\u0002\b{J\u000e\u0010|\u001a\u00020Q2\u0006\u0010}\u001a\u00020&J\u000e\u0010~\u001a\u00020Q2\u0006\u0010\u007f\u001a\u00020TJ\u001e\u0010\u0080\u0001\u001a\u00020Q2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020FH\u0007J\u0018\u0010\u0082\u0001\u001a\u00020Q2\u0007\u0010\u0083\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0003\b\u0084\u0001J,\u0010\u0085\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\t2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0006\u0010k\u001a\u00020\u0006J/\u0010\u0089\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\t2\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020d0cH\u0000¢\u0006\u0003\b\u008b\u0001J\u0007\u0010\u008c\u0001\u001a\u00020QJ\"\u0010\u008c\u0001\u001a\u00020Q2\u0007\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008e\u0001\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020\u0012J\u0007\u0010\u0090\u0001\u001a\u00020QJ\u001f\u0010\u0091\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010\u007f\u001a\u00020TH\u0000¢\u0006\u0003\b\u0092\u0001J\u001f\u0010\u0093\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010s\u001a\u00020TH\u0000¢\u0006\u0003\b\u0094\u0001J \u0010\u0095\u0001\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u00122\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0003\b\u0097\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010(\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001e\u00105\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0015\u00107\u001a\u000608R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u000e\u0010;\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020=X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020B0AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010G\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u001e\u0010I\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u00104R\u0011\u0010K\u001a\u00020L¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u000e\u0010O\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u009c\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "builder", "Lokhttp3/internal/http2/Http2Connection$Builder;", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "awaitPingsSent", "", "awaitPongsReceived", "client", "", "getClient$okhttp", "()Z", "connectionName", "", "getConnectionName$okhttp", "()Ljava/lang/String;", "currentPushRequests", "", "", "degradedPingsSent", "degradedPongDeadlineNs", "degradedPongsReceived", "intervalPingsSent", "intervalPongsReceived", "isShutdown", "lastGoodStreamId", "getLastGoodStreamId$okhttp", "()I", "setLastGoodStreamId$okhttp", "(I)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "(Lokhttp3/internal/http2/Settings;)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "pushQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "<set-?>", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "readBytesTotal", "getReadBytesTotal", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "settingsListenerQueue", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "streams", "", "Lokhttp3/internal/http2/Http2Stream;", "getStreams$okhttp", "()Ljava/util/Map;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "writeBytesMaximum", "getWriteBytesMaximum", "writeBytesTotal", "getWriteBytesTotal", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writerQueue", "awaitPong", "", "close", "connectionCode", "Lokhttp3/internal/http2/ErrorCode;", "streamCode", "cause", "Ljava/io/IOException;", "close$okhttp", "failConnection", "e", "flush", "getStream", "id", "isHealthy", "nowNs", "newStream", "associatedStreamId", "requestHeaders", "", "Lokhttp3/internal/http2/Header;", "out", "openStreamCount", "pushDataLater", "streamId", "source", "Lokio/BufferedSource;", "byteCount", "inFinished", "pushDataLater$okhttp", "pushHeadersLater", "pushHeadersLater$okhttp", "pushRequestLater", "pushRequestLater$okhttp", "pushResetLater", "errorCode", "pushResetLater$okhttp", "pushStream", "pushedStream", "pushedStream$okhttp", "removeStream", "removeStream$okhttp", "sendDegradedPingLater", "sendDegradedPingLater$okhttp", "setSettings", "settings", "shutdown", "statusCode", TtmlNode.START, "sendConnectionPreface", "updateConnectionFlowControl", "read", "updateConnectionFlowControl$okhttp", "writeData", "outFinished", "buffer", "Lokio/Buffer;", "writeHeaders", "alternating", "writeHeaders$okhttp", "writePing", "reply", "payload1", "payload2", "writePingAndAwaitPong", "writeSynReset", "writeSynReset$okhttp", "writeSynResetLater", "writeSynResetLater$okhttp", "writeWindowUpdateLater", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BlockingViewModel_HiltModulesKeyModule implements Closeable {
    public static final int AWAIT_PING = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final getTimelineAdapter DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final IconCompatParcelizer listener;
    private int nextStreamId;
    private final getTimelineAdapter okHttpSettings;
    private getTimelineAdapter peerSettings;
    private final LessonVideoActivityonCreate161 pushObserver;
    private final SubscriptionDataModule pushQueue;
    public long readBytesAcknowledged;
    public long readBytesTotal;
    private final write readerRunnable;
    private final SubscriptionDataModule settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, setTimelineAdapter> streams;
    private final SyncModule taskRunner;
    private long writeBytesMaximum;
    public long writeBytesTotal;
    private final ErrorViewModel_HiltModulesKeyModule writer;
    private final SubscriptionDataModule writerQueue;

    public static boolean IconCompatParcelizer(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public BlockingViewModel_HiltModulesKeyModule(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        boolean zRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        this.client = zRemoteActionCompatParcelizer;
        this.listener = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        this.streams = new LinkedHashMap();
        String str = remoteActionCompatParcelizer.read();
        this.connectionName = str;
        this.nextStreamId = remoteActionCompatParcelizer.RemoteActionCompatParcelizer() ? 3 : 2;
        SyncModule syncModuleAudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        this.taskRunner = syncModuleAudioAttributesImplApi21Parcelizer;
        SubscriptionDataModule subscriptionDataModule = syncModuleAudioAttributesImplApi21Parcelizer.read();
        this.writerQueue = subscriptionDataModule;
        this.pushQueue = syncModuleAudioAttributesImplApi21Parcelizer.read();
        this.settingsListenerQueue = syncModuleAudioAttributesImplApi21Parcelizer.read();
        this.pushObserver = remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
        getTimelineAdapter gettimelineadapter = new getTimelineAdapter();
        if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            gettimelineadapter.read(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = gettimelineadapter;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.RemoteActionCompatParcelizer();
        this.socket = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
        this.writer = new ErrorViewModel_HiltModulesKeyModule(remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), zRemoteActionCompatParcelizer);
        this.readerRunnable = new write(this, new BaseActivity(remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(), zRemoteActionCompatParcelizer));
        this.currentPushRequests = new LinkedHashSet();
        if (remoteActionCompatParcelizer.write() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(remoteActionCompatParcelizer.write());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ping");
            subscriptionDataModule.RemoteActionCompatParcelizer(new AudioAttributesImplApi26Parcelizer(sb.toString(), this, nanos), nanos);
        }
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final IconCompatParcelizer getListener() {
        return this.listener;
    }

    public final Map<Integer, setTimelineAdapter> AudioAttributesImplApi26Parcelizer() {
        return this.streams;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    public final void read(int i) {
        this.lastGoodStreamId = i;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    public static final class AudioAttributesImplApi26Parcelizer extends TableModule {
        private /* synthetic */ long RemoteActionCompatParcelizer;
        private /* synthetic */ BlockingViewModel_HiltModulesKeyModule write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi26Parcelizer(String str, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, long j) {
            super(str, false, 2, null);
            this.write = blockingViewModel_HiltModulesKeyModule;
            this.RemoteActionCompatParcelizer = j;
        }

        @Override // kotlin.TableModule
        public final long AudioAttributesCompatParcelizer() {
            boolean z;
            synchronized (this.write) {
                if (this.write.intervalPongsReceived < this.write.intervalPingsSent) {
                    z = true;
                } else {
                    this.write.intervalPingsSent++;
                    z = false;
                }
            }
            if (z) {
                this.write.write((IOException) null);
                return -1L;
            }
            this.write.RemoteActionCompatParcelizer(false, 1, 0);
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u000b\u0010\u0018J\u0010\u0010\u000b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\u0019J'\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u000b\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\n\u001a\u00020 H\u0016¢\u0006\u0004\b\u0014\u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lo/BlockingViewModel_HiltModulesKeyModule$write;", "Lo/BaseActivity$write;", "Lkotlin/Function0;", "", "Lo/BaseActivity;", "p0", "<init>", "(Lo/BlockingViewModel_HiltModulesKeyModule;Lo/BaseActivity;)V", "", "Lo/getTimelineAdapter;", "p1", "write", "(ZLo/getTimelineAdapter;)V", "", "Lo/LessonCompletedDialog;", "p2", "p3", "(ZILo/LessonCompletedDialog;I)V", "Lo/getConnectionMonitor;", "Lo/getRelatedModuleAdapter;", "RemoteActionCompatParcelizer", "(ILo/getConnectionMonitor;Lo/getRelatedModuleAdapter;)V", "", "Lo/SyncingActivity;", "(ZILjava/util/List;)V", "()V", "read", "(ZII)V", "(ILjava/util/List;)V", "(ILo/getConnectionMonitor;)V", "AudioAttributesCompatParcelizer", "(Lo/getTimelineAdapter;)V", "", "(IJ)V", "reader", "Lo/BaseActivity;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class write implements BaseActivity.write, getCreatedOnDateMs<getShowPopup> {
        private final BaseActivity reader;
        final /* synthetic */ BlockingViewModel_HiltModulesKeyModule this$0;

        public static final class AudioAttributesCompatParcelizer extends TableModule {
            private /* synthetic */ MagicModuleUseCaseImplWhenMappings.write AudioAttributesCompatParcelizer;
            private /* synthetic */ BlockingViewModel_HiltModulesKeyModule RemoteActionCompatParcelizer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AudioAttributesCompatParcelizer(String str, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, MagicModuleUseCaseImplWhenMappings.write writeVar) {
                super(str, true);
                this.RemoteActionCompatParcelizer = blockingViewModel_HiltModulesKeyModule;
                this.AudioAttributesCompatParcelizer = writeVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.TableModule
            public final long AudioAttributesCompatParcelizer() {
                this.RemoteActionCompatParcelizer.getListener().RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (getTimelineAdapter) this.AudioAttributesCompatParcelizer.write);
                return -1L;
            }
        }

        public static final class IconCompatParcelizer extends TableModule {
            private /* synthetic */ int AudioAttributesCompatParcelizer;
            private /* synthetic */ BlockingViewModel_HiltModulesKeyModule IconCompatParcelizer;
            private /* synthetic */ int read;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconCompatParcelizer(String str, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, int i, int i2) {
                super(str, true);
                this.IconCompatParcelizer = blockingViewModel_HiltModulesKeyModule;
                this.AudioAttributesCompatParcelizer = i;
                this.read = i2;
            }

            @Override // kotlin.TableModule
            public final long AudioAttributesCompatParcelizer() {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(true, this.AudioAttributesCompatParcelizer, this.read);
                return -1L;
            }
        }

        public static final class RemoteActionCompatParcelizer extends TableModule {
            private /* synthetic */ getTimelineAdapter IconCompatParcelizer;
            private /* synthetic */ boolean read = false;
            private /* synthetic */ write write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteActionCompatParcelizer(String str, write writeVar, boolean z, getTimelineAdapter gettimelineadapter) {
                super(str, true);
                this.write = writeVar;
                this.IconCompatParcelizer = gettimelineadapter;
            }

            @Override // kotlin.TableModule
            public final long AudioAttributesCompatParcelizer() {
                this.write.write(this.read, this.IconCompatParcelizer);
                return -1L;
            }
        }

        public static final class read extends TableModule {
            private /* synthetic */ setTimelineAdapter IconCompatParcelizer;
            private /* synthetic */ BlockingViewModel_HiltModulesKeyModule read;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public read(String str, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, setTimelineAdapter settimelineadapter) {
                super(str, true);
                this.read = blockingViewModel_HiltModulesKeyModule;
                this.IconCompatParcelizer = settimelineadapter;
            }

            @Override // kotlin.TableModule
            public final long AudioAttributesCompatParcelizer() {
                try {
                    this.read.getListener().RemoteActionCompatParcelizer(this.IconCompatParcelizer);
                    return -1L;
                } catch (IOException e) {
                    SettingsItem.IconCompatParcelizer iconCompatParcelizer = SettingsItem.AudioAttributesCompatParcelizer;
                    SettingsItem.IconCompatParcelizer.write();
                    StringBuilder sb = new StringBuilder("Http2Connection.Listener failure for ");
                    sb.append(this.read.getConnectionName());
                    SettingsItem.AudioAttributesCompatParcelizer(sb.toString(), 4, e);
                    try {
                        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(getConnectionMonitor.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public write(BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, BaseActivity baseActivity) {
            toMagicModuleMetaRepoModel.write(baseActivity, "");
            this.this$0 = blockingViewModel_HiltModulesKeyModule;
            this.reader = baseActivity;
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        private void write() {
            getConnectionMonitor getconnectionmonitor;
            getConnectionMonitor getconnectionmonitor2 = getConnectionMonitor.INTERNAL_ERROR;
            getConnectionMonitor getconnectionmonitor3 = getConnectionMonitor.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.reader.IconCompatParcelizer(this);
                    while (this.reader.read(false, this)) {
                    }
                    getconnectionmonitor2 = getConnectionMonitor.NO_ERROR;
                    getconnectionmonitor = getConnectionMonitor.CANCEL;
                } catch (IOException e2) {
                    e = e2;
                    getconnectionmonitor2 = getConnectionMonitor.PROTOCOL_ERROR;
                    getconnectionmonitor = getConnectionMonitor.PROTOCOL_ERROR;
                }
                this.this$0.read(getconnectionmonitor2, getconnectionmonitor, e);
                FirebaseDataModule.read(this.reader);
            } catch (Throwable th) {
                this.this$0.read(getconnectionmonitor2, getconnectionmonitor3, e);
                FirebaseDataModule.read(this.reader);
                throw th;
            }
        }

        @Override // o.BaseActivity.write
        public final void write(boolean p0, int p1, LessonCompletedDialog p2, int p3) throws IOException {
            toMagicModuleMetaRepoModel.write(p2, "");
            if (BlockingViewModel_HiltModulesKeyModule.IconCompatParcelizer(p1)) {
                this.this$0.write(p1, p2, p3, p0);
                return;
            }
            setTimelineAdapter settimelineadapterAudioAttributesCompatParcelizer = this.this$0.AudioAttributesCompatParcelizer(p1);
            if (settimelineadapterAudioAttributesCompatParcelizer == null) {
                this.this$0.AudioAttributesCompatParcelizer(p1, getConnectionMonitor.PROTOCOL_ERROR);
                long j = p3;
                this.this$0.RemoteActionCompatParcelizer(j);
                p2.AudioAttributesImplBaseParcelizer(j);
                return;
            }
            settimelineadapterAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p2, p3);
            if (p0) {
                settimelineadapterAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(FirebaseDataModule.RemoteActionCompatParcelizer, true);
            }
        }

        @Override // o.BaseActivity.write
        public final void write(boolean z, int i, List<SyncingActivity> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            if (BlockingViewModel_HiltModulesKeyModule.IconCompatParcelizer(i)) {
                this.this$0.RemoteActionCompatParcelizer(i, list, z);
                return;
            }
            BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule = this.this$0;
            synchronized (blockingViewModel_HiltModulesKeyModule) {
                setTimelineAdapter settimelineadapterAudioAttributesCompatParcelizer = blockingViewModel_HiltModulesKeyModule.AudioAttributesCompatParcelizer(i);
                if (settimelineadapterAudioAttributesCompatParcelizer == null) {
                    if (blockingViewModel_HiltModulesKeyModule.isShutdown) {
                        return;
                    }
                    if (i <= blockingViewModel_HiltModulesKeyModule.getLastGoodStreamId()) {
                        return;
                    }
                    if (i % 2 == blockingViewModel_HiltModulesKeyModule.getNextStreamId() % 2) {
                        return;
                    }
                    setTimelineAdapter settimelineadapter = new setTimelineAdapter(i, blockingViewModel_HiltModulesKeyModule, false, z, FirebaseDataModule.RemoteActionCompatParcelizer(list));
                    blockingViewModel_HiltModulesKeyModule.read(i);
                    blockingViewModel_HiltModulesKeyModule.AudioAttributesImplApi26Parcelizer().put(Integer.valueOf(i), settimelineadapter);
                    SubscriptionDataModule subscriptionDataModule = blockingViewModel_HiltModulesKeyModule.taskRunner.read();
                    StringBuilder sb = new StringBuilder();
                    sb.append(blockingViewModel_HiltModulesKeyModule.getConnectionName());
                    sb.append('[');
                    sb.append(i);
                    sb.append("] onStream");
                    subscriptionDataModule.RemoteActionCompatParcelizer(new read(sb.toString(), blockingViewModel_HiltModulesKeyModule, settimelineadapter), 0L);
                    return;
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                settimelineadapterAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(FirebaseDataModule.RemoteActionCompatParcelizer(list), z);
            }
        }

        @Override // o.BaseActivity.write
        public final void write(int p0, getConnectionMonitor p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            if (BlockingViewModel_HiltModulesKeyModule.IconCompatParcelizer(p0)) {
                this.this$0.write(p0, p1);
                return;
            }
            setTimelineAdapter settimelineadapterRemoteActionCompatParcelizer = this.this$0.RemoteActionCompatParcelizer(p0);
            if (settimelineadapterRemoteActionCompatParcelizer != null) {
                settimelineadapterRemoteActionCompatParcelizer.write(p1);
            }
        }

        @Override // o.BaseActivity.write
        public final void AudioAttributesCompatParcelizer(getTimelineAdapter gettimelineadapter) {
            toMagicModuleMetaRepoModel.write(gettimelineadapter, "");
            SubscriptionDataModule subscriptionDataModule = this.this$0.writerQueue;
            StringBuilder sb = new StringBuilder();
            sb.append(this.this$0.getConnectionName());
            sb.append(" applyAndAckSettings");
            subscriptionDataModule.RemoteActionCompatParcelizer(new RemoteActionCompatParcelizer(sb.toString(), this, false, gettimelineadapter), 0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void write(boolean p0, getTimelineAdapter p1) {
            long jRemoteActionCompatParcelizer;
            int i;
            setTimelineAdapter[] settimelineadapterArr;
            toMagicModuleMetaRepoModel.write(p1, "");
            MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
            ErrorViewModel_HiltModulesKeyModule writer = this.this$0.getWriter();
            BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule = this.this$0;
            synchronized (writer) {
                synchronized (blockingViewModel_HiltModulesKeyModule) {
                    getTimelineAdapter peerSettings = blockingViewModel_HiltModulesKeyModule.getPeerSettings();
                    T t = p1;
                    if (!p0) {
                        getTimelineAdapter gettimelineadapter = new getTimelineAdapter();
                        gettimelineadapter.read(peerSettings);
                        gettimelineadapter.read(p1);
                        t = gettimelineadapter;
                    }
                    writeVar.write = t;
                    jRemoteActionCompatParcelizer = ((long) ((getTimelineAdapter) writeVar.write).RemoteActionCompatParcelizer()) - ((long) peerSettings.RemoteActionCompatParcelizer());
                    settimelineadapterArr = (jRemoteActionCompatParcelizer == 0 || blockingViewModel_HiltModulesKeyModule.AudioAttributesImplApi26Parcelizer().isEmpty()) ? null : (setTimelineAdapter[]) blockingViewModel_HiltModulesKeyModule.AudioAttributesImplApi26Parcelizer().values().toArray(new setTimelineAdapter[0]);
                    blockingViewModel_HiltModulesKeyModule.write((getTimelineAdapter) writeVar.write);
                    SubscriptionDataModule subscriptionDataModule = blockingViewModel_HiltModulesKeyModule.settingsListenerQueue;
                    StringBuilder sb = new StringBuilder();
                    sb.append(blockingViewModel_HiltModulesKeyModule.getConnectionName());
                    sb.append(" onSettings");
                    subscriptionDataModule.RemoteActionCompatParcelizer(new AudioAttributesCompatParcelizer(sb.toString(), blockingViewModel_HiltModulesKeyModule, writeVar), 0L);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
                try {
                    blockingViewModel_HiltModulesKeyModule.getWriter().write((getTimelineAdapter) writeVar.write);
                } catch (IOException e) {
                    blockingViewModel_HiltModulesKeyModule.write(e);
                }
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            }
            if (settimelineadapterArr != null) {
                for (setTimelineAdapter settimelineadapter : settimelineadapterArr) {
                    synchronized (settimelineadapter) {
                        settimelineadapter.read(jRemoteActionCompatParcelizer);
                        getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                    }
                }
            }
        }

        @Override // o.BaseActivity.write
        public final void read(boolean p0, int p1, int p2) {
            if (!p0) {
                SubscriptionDataModule subscriptionDataModule = this.this$0.writerQueue;
                StringBuilder sb = new StringBuilder();
                sb.append(this.this$0.getConnectionName());
                sb.append(" ping");
                subscriptionDataModule.RemoteActionCompatParcelizer(new IconCompatParcelizer(sb.toString(), this.this$0, p1, p2), 0L);
                return;
            }
            BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule = this.this$0;
            synchronized (blockingViewModel_HiltModulesKeyModule) {
                if (p1 == 1) {
                    blockingViewModel_HiltModulesKeyModule.intervalPongsReceived++;
                } else if (p1 != 2) {
                    if (p1 == 3) {
                        blockingViewModel_HiltModulesKeyModule.awaitPongsReceived++;
                        toMagicModuleMetaRepoModel.read(blockingViewModel_HiltModulesKeyModule, "");
                        blockingViewModel_HiltModulesKeyModule.notifyAll();
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                } else {
                    blockingViewModel_HiltModulesKeyModule.degradedPongsReceived++;
                }
            }
        }

        @Override // o.BaseActivity.write
        public final void RemoteActionCompatParcelizer(int p0, getConnectionMonitor p1, getRelatedModuleAdapter p2) {
            int i;
            Object[] array;
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            p2.MediaBrowserCompatCustomActionResultReceiver();
            BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule = this.this$0;
            synchronized (blockingViewModel_HiltModulesKeyModule) {
                array = blockingViewModel_HiltModulesKeyModule.AudioAttributesImplApi26Parcelizer().values().toArray(new setTimelineAdapter[0]);
                blockingViewModel_HiltModulesKeyModule.isShutdown = true;
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            for (setTimelineAdapter settimelineadapter : (setTimelineAdapter[]) array) {
                if (settimelineadapter.getId() > p0 && settimelineadapter.onCustomAction()) {
                    settimelineadapter.write(getConnectionMonitor.REFUSED_STREAM);
                    this.this$0.RemoteActionCompatParcelizer(settimelineadapter.getId());
                }
            }
        }

        @Override // o.BaseActivity.write
        public final void RemoteActionCompatParcelizer(int p0, long p1) {
            if (p0 == 0) {
                BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule = this.this$0;
                synchronized (blockingViewModel_HiltModulesKeyModule) {
                    blockingViewModel_HiltModulesKeyModule.writeBytesMaximum = blockingViewModel_HiltModulesKeyModule.getWriteBytesMaximum() + p1;
                    toMagicModuleMetaRepoModel.read(blockingViewModel_HiltModulesKeyModule, "");
                    blockingViewModel_HiltModulesKeyModule.notifyAll();
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
                return;
            }
            setTimelineAdapter settimelineadapterAudioAttributesCompatParcelizer = this.this$0.AudioAttributesCompatParcelizer(p0);
            if (settimelineadapterAudioAttributesCompatParcelizer != null) {
                synchronized (settimelineadapterAudioAttributesCompatParcelizer) {
                    settimelineadapterAudioAttributesCompatParcelizer.read(p1);
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                }
            }
        }

        @Override // o.BaseActivity.write
        public final void read(int i, List<SyncingActivity> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.this$0.AudioAttributesCompatParcelizer(i, list);
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends TableModule {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ List IconCompatParcelizer;
        private /* synthetic */ BlockingViewModel_HiltModulesKeyModule read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(String str, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, int i, List list) {
            super(str, true);
            this.read = blockingViewModel_HiltModulesKeyModule;
            this.AudioAttributesCompatParcelizer = i;
            this.IconCompatParcelizer = list;
        }

        @Override // kotlin.TableModule
        public final long AudioAttributesCompatParcelizer() {
            this.read.pushObserver.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            try {
                this.read.getWriter().AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, getConnectionMonitor.CANCEL);
                synchronized (this.read) {
                    this.read.currentPushRequests.remove(Integer.valueOf(this.AudioAttributesCompatParcelizer));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends TableModule {
        private /* synthetic */ BlockingViewModel_HiltModulesKeyModule RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule) {
            super(str, true);
            this.RemoteActionCompatParcelizer = blockingViewModel_HiltModulesKeyModule;
        }

        @Override // kotlin.TableModule
        public final long AudioAttributesCompatParcelizer() {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(false, 2, 0);
            return -1L;
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends TableModule {
        private /* synthetic */ List AudioAttributesCompatParcelizer;
        private /* synthetic */ BlockingViewModel_HiltModulesKeyModule IconCompatParcelizer;
        private /* synthetic */ boolean read;
        private /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(String str, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, int i, List list, boolean z) {
            super(str, true);
            this.IconCompatParcelizer = blockingViewModel_HiltModulesKeyModule;
            this.write = i;
            this.AudioAttributesCompatParcelizer = list;
            this.read = z;
        }

        @Override // kotlin.TableModule
        public final long AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer.pushObserver.read(this.AudioAttributesCompatParcelizer);
            try {
                this.IconCompatParcelizer.getWriter().AudioAttributesCompatParcelizer(this.write, getConnectionMonitor.CANCEL);
                synchronized (this.IconCompatParcelizer) {
                    this.IconCompatParcelizer.currentPushRequests.remove(Integer.valueOf(this.write));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class MediaBrowserCompatItemReceiver extends TableModule {
        private /* synthetic */ BlockingViewModel_HiltModulesKeyModule RemoteActionCompatParcelizer;
        private /* synthetic */ getConnectionMonitor read;
        private /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(String str, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, int i, getConnectionMonitor getconnectionmonitor) {
            super(str, true);
            this.RemoteActionCompatParcelizer = blockingViewModel_HiltModulesKeyModule;
            this.write = i;
            this.read = getconnectionmonitor;
        }

        @Override // kotlin.TableModule
        public final long AudioAttributesCompatParcelizer() {
            this.RemoteActionCompatParcelizer.pushObserver.AudioAttributesCompatParcelizer(this.read);
            synchronized (this.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer.currentPushRequests.remove(Integer.valueOf(this.write));
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            return -1L;
        }
    }

    public static final class MediaMetadataCompat extends TableModule {
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private /* synthetic */ getConnectionMonitor read;
        private /* synthetic */ BlockingViewModel_HiltModulesKeyModule write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(String str, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, int i, getConnectionMonitor getconnectionmonitor) {
            super(str, true);
            this.write = blockingViewModel_HiltModulesKeyModule;
            this.RemoteActionCompatParcelizer = i;
            this.read = getconnectionmonitor;
        }

        @Override // kotlin.TableModule
        public final long AudioAttributesCompatParcelizer() {
            try {
                this.write.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.read);
                return -1L;
            } catch (IOException e) {
                this.write.write(e);
                return -1L;
            }
        }
    }

    public static final class RatingCompat extends TableModule {
        private /* synthetic */ long AudioAttributesCompatParcelizer;
        private /* synthetic */ BlockingViewModel_HiltModulesKeyModule RemoteActionCompatParcelizer;
        private /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RatingCompat(String str, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, int i, long j) {
            super(str, true);
            this.RemoteActionCompatParcelizer = blockingViewModel_HiltModulesKeyModule;
            this.write = i;
            this.AudioAttributesCompatParcelizer = j;
        }

        @Override // kotlin.TableModule
        public final long AudioAttributesCompatParcelizer() {
            try {
                this.RemoteActionCompatParcelizer.getWriter().read(this.write, this.AudioAttributesCompatParcelizer);
                return -1L;
            } catch (IOException e) {
                this.RemoteActionCompatParcelizer.write(e);
                return -1L;
            }
        }
    }

    public static final class read extends TableModule {
        private /* synthetic */ boolean AudioAttributesCompatParcelizer;
        private /* synthetic */ resetCurrentSelectedPosition IconCompatParcelizer;
        private /* synthetic */ BlockingViewModel_HiltModulesKeyModule RemoteActionCompatParcelizer;
        private /* synthetic */ int read;
        private /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str, BlockingViewModel_HiltModulesKeyModule blockingViewModel_HiltModulesKeyModule, int i, resetCurrentSelectedPosition resetcurrentselectedposition, int i2, boolean z) {
            super(str, true);
            this.RemoteActionCompatParcelizer = blockingViewModel_HiltModulesKeyModule;
            this.write = i;
            this.IconCompatParcelizer = resetcurrentselectedposition;
            this.read = i2;
            this.AudioAttributesCompatParcelizer = z;
        }

        @Override // kotlin.TableModule
        public final long AudioAttributesCompatParcelizer() {
            try {
                this.RemoteActionCompatParcelizer.pushObserver.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.read);
                this.RemoteActionCompatParcelizer.getWriter().AudioAttributesCompatParcelizer(this.write, getConnectionMonitor.CANCEL);
                synchronized (this.RemoteActionCompatParcelizer) {
                    this.RemoteActionCompatParcelizer.currentPushRequests.remove(Integer.valueOf(this.write));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final getTimelineAdapter getOkHttpSettings() {
        return this.okHttpSettings;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final getTimelineAdapter getPeerSettings() {
        return this.peerSettings;
    }

    public final void write(getTimelineAdapter gettimelineadapter) {
        toMagicModuleMetaRepoModel.write(gettimelineadapter, "");
        this.peerSettings = gettimelineadapter;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final ErrorViewModel_HiltModulesKeyModule getWriter() {
        return this.writer;
    }

    public final setTimelineAdapter AudioAttributesCompatParcelizer(int i) {
        setTimelineAdapter settimelineadapter;
        synchronized (this) {
            settimelineadapter = this.streams.get(Integer.valueOf(i));
        }
        return settimelineadapter;
    }

    public final setTimelineAdapter RemoteActionCompatParcelizer(int i) {
        setTimelineAdapter settimelineadapterRemove;
        synchronized (this) {
            settimelineadapterRemove = this.streams.remove(Integer.valueOf(i));
            toMagicModuleMetaRepoModel.read(this, "");
            notifyAll();
        }
        return settimelineadapterRemove;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        synchronized (this) {
            long j2 = this.readBytesTotal + j;
            this.readBytesTotal = j2;
            long j3 = j2 - this.readBytesAcknowledged;
            if (j3 >= this.okHttpSettings.RemoteActionCompatParcelizer() / 2) {
                IconCompatParcelizer(0, j3);
                this.readBytesAcknowledged += j3;
            }
        }
    }

    public final setTimelineAdapter IconCompatParcelizer(List<SyncingActivity> list, boolean z) throws IOException {
        toMagicModuleMetaRepoModel.write(list, "");
        return AudioAttributesCompatParcelizer(list, z);
    }

    private final setTimelineAdapter AudioAttributesCompatParcelizer(List<SyncingActivity> list, boolean z) throws IOException {
        int i;
        setTimelineAdapter settimelineadapter;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.writer) {
            synchronized (this) {
                try {
                    if (this.nextStreamId > 1073741823) {
                        read(getConnectionMonitor.REFUSED_STREAM);
                    }
                    if (this.isShutdown) {
                        throw new UpgradePlanActivityPresenter();
                    }
                    i = this.nextStreamId;
                    this.nextStreamId = i + 2;
                    settimelineadapter = new setTimelineAdapter(i, this, z3, false, null);
                    z2 = !z || this.writeBytesTotal >= this.writeBytesMaximum || settimelineadapter.getWriteBytesTotal() >= settimelineadapter.getWriteBytesMaximum();
                    if (settimelineadapter.onCommand()) {
                        this.streams.put(Integer.valueOf(i), settimelineadapter);
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.writer.IconCompatParcelizer(z3, i, list);
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        }
        if (z2) {
            this.writer.RemoteActionCompatParcelizer();
        }
        return settimelineadapter;
    }

    public final void RemoteActionCompatParcelizer(int i, boolean z, List<SyncingActivity> list) throws IOException {
        toMagicModuleMetaRepoModel.write(list, "");
        this.writer.IconCompatParcelizer(z, i, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.IconCompatParcelizer());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = kotlin.getShowPopup.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(int r9, boolean r10, kotlin.resetCurrentSelectedPosition r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            o.ErrorViewModel_HiltModulesKeyModule r8 = r8.writer
            r8.AudioAttributesCompatParcelizer(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L74
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L3a
            java.util.Map<java.lang.Integer, o.setTimelineAdapter> r2 = r8.streams     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            if (r2 == 0) goto L32
            java.lang.String r2 = ""
            kotlin.toMagicModuleMetaRepoModel.read(r8, r2)     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            r2 = r8
            java.lang.Object r2 = (java.lang.Object) r2     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            r2.wait()     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            goto L12
        L32:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
            throw r9     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L65
        L3a:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L63
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L63
            o.ErrorViewModel_HiltModulesKeyModule r4 = r8.writer     // Catch: java.lang.Throwable -> L63
            int r4 = r4.getMaxFrameSize()     // Catch: java.lang.Throwable -> L63
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L63
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L63
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L63
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L63
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE     // Catch: java.lang.Throwable -> L63
            monitor-exit(r8)
            long r12 = r12 - r6
            o.ErrorViewModel_HiltModulesKeyModule r4 = r8.writer
            if (r10 == 0) goto L5e
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5e
            r5 = 1
            goto L5f
        L5e:
            r5 = r3
        L5f:
            r4.AudioAttributesCompatParcelizer(r5, r9, r11, r2)
            goto Ld
        L63:
            r9 = move-exception
            goto L72
        L65:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L63
            r9.interrupt()     // Catch: java.lang.Throwable -> L63
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L63
            r9.<init>()     // Catch: java.lang.Throwable -> L63
            throw r9     // Catch: java.lang.Throwable -> L63
        L72:
            monitor-exit(r8)
            throw r9
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.BlockingViewModel_HiltModulesKeyModule.RemoteActionCompatParcelizer(int, boolean, o.resetCurrentSelectedPosition, long):void");
    }

    public final void AudioAttributesCompatParcelizer(int i, getConnectionMonitor getconnectionmonitor) {
        toMagicModuleMetaRepoModel.write(getconnectionmonitor, "");
        SubscriptionDataModule subscriptionDataModule = this.writerQueue;
        StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(i);
        sb.append("] writeSynReset");
        subscriptionDataModule.RemoteActionCompatParcelizer(new MediaMetadataCompat(sb.toString(), this, i, getconnectionmonitor), 0L);
    }

    public final void RemoteActionCompatParcelizer(int i, getConnectionMonitor getconnectionmonitor) throws IOException {
        toMagicModuleMetaRepoModel.write(getconnectionmonitor, "");
        this.writer.AudioAttributesCompatParcelizer(i, getconnectionmonitor);
    }

    public final void IconCompatParcelizer(int i, long j) {
        SubscriptionDataModule subscriptionDataModule = this.writerQueue;
        StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(i);
        sb.append("] windowUpdate");
        subscriptionDataModule.RemoteActionCompatParcelizer(new RatingCompat(sb.toString(), this, i, j), 0L);
    }

    public final void RemoteActionCompatParcelizer(boolean z, int i, int i2) {
        try {
            this.writer.IconCompatParcelizer(z, i, i2);
        } catch (IOException e) {
            write(e);
        }
    }

    public final void write() throws IOException {
        this.writer.RemoteActionCompatParcelizer();
    }

    private void read(getConnectionMonitor getconnectionmonitor) throws IOException {
        toMagicModuleMetaRepoModel.write(getconnectionmonitor, "");
        synchronized (this.writer) {
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                iconCompatParcelizer.AudioAttributesCompatParcelizer = this.lastGoodStreamId;
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                this.writer.AudioAttributesCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer, getconnectionmonitor, FirebaseDataModule.write);
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        read(getConnectionMonitor.NO_ERROR, getConnectionMonitor.CANCEL, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(IOException iOException) {
        getConnectionMonitor getconnectionmonitor = getConnectionMonitor.PROTOCOL_ERROR;
        read(getconnectionmonitor, getconnectionmonitor, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(boolean z, SyncModule syncModule) throws IOException {
        toMagicModuleMetaRepoModel.write(syncModule, "");
        this.writer.read();
        this.writer.RemoteActionCompatParcelizer(this.okHttpSettings);
        if (this.okHttpSettings.RemoteActionCompatParcelizer() != 65535) {
            this.writer.read(0, r5 - 65535);
        }
        syncModule.read().RemoteActionCompatParcelizer(new SubscriptionDataModule.write(this.connectionName, this.readerRunnable), 0L);
    }

    public final boolean AudioAttributesCompatParcelizer(long j) {
        synchronized (this) {
            if (this.isShutdown) {
                return false;
            }
            if (this.degradedPongsReceived < this.degradedPingsSent) {
                if (j >= this.degradedPongDeadlineNs) {
                    return false;
                }
            }
            return true;
        }
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + C.NANOS_PER_SECOND;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            SubscriptionDataModule subscriptionDataModule = this.writerQueue;
            StringBuilder sb = new StringBuilder();
            sb.append(this.connectionName);
            sb.append(" ping");
            subscriptionDataModule.RemoteActionCompatParcelizer(new AudioAttributesImplBaseParcelizer(sb.toString(), this), 0L);
        }
    }

    public static final class RemoteActionCompatParcelizer {
        private String AudioAttributesCompatParcelizer;
        private Socket AudioAttributesImplApi26Parcelizer;
        private LessonCompletedDialogonViewCreatedllm1 AudioAttributesImplBaseParcelizer;
        private IconCompatParcelizer IconCompatParcelizer;
        private final SyncModule MediaBrowserCompatCustomActionResultReceiver;
        private LessonCompletedDialog MediaBrowserCompatItemReceiver;
        private boolean RemoteActionCompatParcelizer;
        private LessonVideoActivityonCreate161 read;
        private int write;

        public RemoteActionCompatParcelizer(SyncModule syncModule) {
            toMagicModuleMetaRepoModel.write(syncModule, "");
            this.RemoteActionCompatParcelizer = true;
            this.MediaBrowserCompatCustomActionResultReceiver = syncModule;
            this.IconCompatParcelizer = IconCompatParcelizer.REFUSE_INCOMING_STREAMS;
            this.read = LessonVideoActivityonCreate161.CANCEL;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final SyncModule AudioAttributesImplApi21Parcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        private void read(Socket socket) {
            toMagicModuleMetaRepoModel.write(socket, "");
            this.AudioAttributesImplApi26Parcelizer = socket;
        }

        public final Socket AudioAttributesImplBaseParcelizer() {
            Socket socket = this.AudioAttributesImplApi26Parcelizer;
            if (socket != null) {
                return socket;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        private void IconCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String read() {
            String str = this.AudioAttributesCompatParcelizer;
            if (str != null) {
                return str;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        private void IconCompatParcelizer(LessonCompletedDialog lessonCompletedDialog) {
            toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
            this.MediaBrowserCompatItemReceiver = lessonCompletedDialog;
        }

        public final LessonCompletedDialog AudioAttributesImplApi26Parcelizer() {
            LessonCompletedDialog lessonCompletedDialog = this.MediaBrowserCompatItemReceiver;
            if (lessonCompletedDialog != null) {
                return lessonCompletedDialog;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        private void AudioAttributesCompatParcelizer(LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1) {
            toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1, "");
            this.AudioAttributesImplBaseParcelizer = lessonCompletedDialogonViewCreatedllm1;
        }

        public final LessonCompletedDialogonViewCreatedllm1 MediaBrowserCompatCustomActionResultReceiver() {
            LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = this.AudioAttributesImplBaseParcelizer;
            if (lessonCompletedDialogonViewCreatedllm1 != null) {
                return lessonCompletedDialogonViewCreatedllm1;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final LessonVideoActivityonCreate161 MediaBrowserCompatItemReceiver() {
            return this.read;
        }

        public final int write() {
            return this.write;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(Socket socket, String str, LessonCompletedDialog lessonCompletedDialog, LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1) throws IOException {
            String strConcat;
            toMagicModuleMetaRepoModel.write(socket, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
            toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1, "");
            read(socket);
            if (this.RemoteActionCompatParcelizer) {
                StringBuilder sb = new StringBuilder();
                sb.append(FirebaseDataModule.AudioAttributesImplApi21Parcelizer);
                sb.append(' ');
                sb.append(str);
                strConcat = sb.toString();
            } else {
                strConcat = "MockWebServer ".concat(String.valueOf(str));
            }
            IconCompatParcelizer(strConcat);
            IconCompatParcelizer(lessonCompletedDialog);
            AudioAttributesCompatParcelizer(lessonCompletedDialogonViewCreatedllm1);
            return this;
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.IconCompatParcelizer = iconCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i) {
            this.write = i;
            return this;
        }

        public final BlockingViewModel_HiltModulesKeyModule IconCompatParcelizer() {
            return new BlockingViewModel_HiltModulesKeyModule(this);
        }
    }

    public final void AudioAttributesCompatParcelizer(int i, List<SyncingActivity> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                AudioAttributesCompatParcelizer(i, getConnectionMonitor.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            SubscriptionDataModule subscriptionDataModule = this.pushQueue;
            StringBuilder sb = new StringBuilder();
            sb.append(this.connectionName);
            sb.append('[');
            sb.append(i);
            sb.append("] onRequest");
            subscriptionDataModule.RemoteActionCompatParcelizer(new AudioAttributesImplApi21Parcelizer(sb.toString(), this, i, list), 0L);
        }
    }

    public final void RemoteActionCompatParcelizer(int i, List<SyncingActivity> list, boolean z) {
        toMagicModuleMetaRepoModel.write(list, "");
        SubscriptionDataModule subscriptionDataModule = this.pushQueue;
        StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(i);
        sb.append("] onHeaders");
        subscriptionDataModule.RemoteActionCompatParcelizer(new MediaBrowserCompatCustomActionResultReceiver(sb.toString(), this, i, list, z), 0L);
    }

    public final void write(int i, LessonCompletedDialog lessonCompletedDialog, int i2, boolean z) throws IOException {
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
        long j = i2;
        lessonCompletedDialog.AudioAttributesImplApi26Parcelizer(j);
        lessonCompletedDialog.AudioAttributesCompatParcelizer(resetcurrentselectedposition, j);
        SubscriptionDataModule subscriptionDataModule = this.pushQueue;
        StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(i);
        sb.append("] onData");
        subscriptionDataModule.RemoteActionCompatParcelizer(new read(sb.toString(), this, i, resetcurrentselectedposition, i2, z), 0L);
    }

    public final void write(int i, getConnectionMonitor getconnectionmonitor) {
        toMagicModuleMetaRepoModel.write(getconnectionmonitor, "");
        SubscriptionDataModule subscriptionDataModule = this.pushQueue;
        StringBuilder sb = new StringBuilder();
        sb.append(this.connectionName);
        sb.append('[');
        sb.append(i);
        sb.append("] onReset");
        subscriptionDataModule.RemoteActionCompatParcelizer(new MediaBrowserCompatItemReceiver(sb.toString(), this, i, getconnectionmonitor), 0L);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\f"}, d2 = {"Lo/BlockingViewModel_HiltModulesKeyModule$IconCompatParcelizer;", "", "<init>", "()V", "Lo/BlockingViewModel_HiltModulesKeyModule;", "p0", "Lo/getTimelineAdapter;", "p1", "", "RemoteActionCompatParcelizer", "(Lo/BlockingViewModel_HiltModulesKeyModule;Lo/getTimelineAdapter;)V", "Lo/setTimelineAdapter;", "(Lo/setTimelineAdapter;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class IconCompatParcelizer {
        public static final IconCompatParcelizer REFUSE_INCOMING_STREAMS = new read();

        public abstract void RemoteActionCompatParcelizer(setTimelineAdapter p0) throws IOException;

        public static final class read extends IconCompatParcelizer {
            read() {
            }

            @Override // o.BlockingViewModel_HiltModulesKeyModule.IconCompatParcelizer
            public final void RemoteActionCompatParcelizer(setTimelineAdapter settimelineadapter) throws IOException {
                toMagicModuleMetaRepoModel.write(settimelineadapter, "");
                settimelineadapter.AudioAttributesCompatParcelizer(getConnectionMonitor.REFUSED_STREAM, (IOException) null);
            }
        }

        public void RemoteActionCompatParcelizer(BlockingViewModel_HiltModulesKeyModule p0, getTimelineAdapter p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
        }
    }

    /* JADX INFO: renamed from: o.BlockingViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006"}, d2 = {"Lo/BlockingViewModel_HiltModulesKeyModule$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "AWAIT_PING", "I", "Lo/getTimelineAdapter;", "DEFAULT_SETTINGS", "Lo/getTimelineAdapter;", "AudioAttributesCompatParcelizer", "()Lo/getTimelineAdapter;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getTimelineAdapter AudioAttributesCompatParcelizer() {
            return BlockingViewModel_HiltModulesKeyModule.DEFAULT_SETTINGS;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        getTimelineAdapter gettimelineadapter = new getTimelineAdapter();
        gettimelineadapter.read(7, 65535);
        gettimelineadapter.read(5, 16384);
        DEFAULT_SETTINGS = gettimelineadapter;
    }

    public final void read(getConnectionMonitor getconnectionmonitor, getConnectionMonitor getconnectionmonitor2, IOException iOException) {
        int i;
        Object[] array;
        toMagicModuleMetaRepoModel.write(getconnectionmonitor, "");
        toMagicModuleMetaRepoModel.write(getconnectionmonitor2, "");
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        try {
            read(getconnectionmonitor);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.streams.isEmpty()) {
                array = null;
            } else {
                array = this.streams.values().toArray(new setTimelineAdapter[0]);
                this.streams.clear();
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        setTimelineAdapter[] settimelineadapterArr = (setTimelineAdapter[]) array;
        if (settimelineadapterArr != null) {
            for (setTimelineAdapter settimelineadapter : settimelineadapterArr) {
                try {
                    settimelineadapter.AudioAttributesCompatParcelizer(getconnectionmonitor2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.MediaBrowserCompatItemReceiver();
        this.pushQueue.MediaBrowserCompatItemReceiver();
        this.settingsListenerQueue.MediaBrowserCompatItemReceiver();
    }
}
