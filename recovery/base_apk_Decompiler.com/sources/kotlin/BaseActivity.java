package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.ErrorViewModel;
import kotlin.Metadata;
import kotlin.getConnectionMonitor;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0003%\u0019\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\f\u0010\u0013J/\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\f\u0010\u0018J/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J/\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\f\u0010\u0015J/\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J/\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lo/BaseActivity;", "Ljava/io/Closeable;", "Lo/LessonCompletedDialog;", "p0", "", "p1", "<init>", "(Lo/LessonCompletedDialog;Z)V", "", "close", "()V", "Lo/BaseActivity$write;", "read", "(ZLo/BaseActivity$write;)Z", "IconCompatParcelizer", "(Lo/BaseActivity$write;)V", "", "p2", "p3", "(Lo/BaseActivity$write;III)V", "write", "(Lo/BaseActivity$write;II)V", "", "Lo/SyncingActivity;", "(IIII)Ljava/util/List;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "client", "Z", "Lo/BaseActivity$RemoteActionCompatParcelizer;", "continuation", "Lo/BaseActivity$RemoteActionCompatParcelizer;", "Lo/ErrorViewModel$write;", "hpackReader", "Lo/ErrorViewModel$write;", "source", "Lo/LessonCompletedDialog;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BaseActivity implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final RemoteActionCompatParcelizer continuation;
    private final ErrorViewModel.write hpackReader;
    private final LessonCompletedDialog source;

    public interface write {
        void AudioAttributesCompatParcelizer(getTimelineAdapter gettimelineadapter);

        void RemoteActionCompatParcelizer(int i, long j);

        void RemoteActionCompatParcelizer(int i, getConnectionMonitor getconnectionmonitor, getRelatedModuleAdapter getrelatedmoduleadapter);

        void read(int i, List<SyncingActivity> list) throws IOException;

        void read(boolean z, int i, int i2);

        void write(int i, getConnectionMonitor getconnectionmonitor);

        void write(boolean z, int i, List<SyncingActivity> list);

        void write(boolean z, int i, LessonCompletedDialog lessonCompletedDialog, int i2) throws IOException;
    }

    public BaseActivity(LessonCompletedDialog lessonCompletedDialog, boolean z) {
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        this.source = lessonCompletedDialog;
        this.client = z;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(lessonCompletedDialog);
        this.continuation = remoteActionCompatParcelizer;
        this.hpackReader = new ErrorViewModel.write(remoteActionCompatParcelizer, 4096, 0, 4, null);
    }

    public final void IconCompatParcelizer(write p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.client) {
            if (!read(true, p0)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        getRelatedModuleAdapter getrelatedmoduleadapter = this.source.read(setConnectionMonitor.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            StringBuilder sb = new StringBuilder("<< CONNECTION ");
            sb.append(getrelatedmoduleadapter.RemoteActionCompatParcelizer());
            logger2.fine(FirebaseDataModule.read(sb.toString(), new Object[0]));
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setConnectionMonitor.AudioAttributesCompatParcelizer, getrelatedmoduleadapter)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Expected a connection header but was ");
        sb2.append(getrelatedmoduleadapter.MediaDescriptionCompat());
        throw new IOException(sb2.toString());
    }

    public final boolean read(boolean p0, write p1) throws IOException {
        toMagicModuleMetaRepoModel.write(p1, "");
        try {
            this.source.AudioAttributesImplApi26Parcelizer(9L);
            int iAudioAttributesCompatParcelizer = FirebaseDataModule.AudioAttributesCompatParcelizer(this.source);
            if (iAudioAttributesCompatParcelizer > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: ".concat(String.valueOf(iAudioAttributesCompatParcelizer)));
            }
            int iWrite = FirebaseDataModule.write(this.source.MediaMetadataCompat());
            int iWrite2 = FirebaseDataModule.write(this.source.MediaMetadataCompat());
            int iOnCustomAction = this.source.onCustomAction() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                setConnectionMonitor setconnectionmonitor = setConnectionMonitor.INSTANCE;
                logger2.fine(setConnectionMonitor.AudioAttributesCompatParcelizer(true, iOnCustomAction, iAudioAttributesCompatParcelizer, iWrite, iWrite2));
            }
            if (p0 && iWrite != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                setConnectionMonitor setconnectionmonitor2 = setConnectionMonitor.INSTANCE;
                sb.append(setConnectionMonitor.RemoteActionCompatParcelizer(iWrite));
                throw new IOException(sb.toString());
            }
            switch (iWrite) {
                case 0:
                    read(p1, iAudioAttributesCompatParcelizer, iWrite2, iOnCustomAction);
                    return true;
                case 1:
                    RemoteActionCompatParcelizer(p1, iAudioAttributesCompatParcelizer, iWrite2, iOnCustomAction);
                    return true;
                case 2:
                    read(p1, iAudioAttributesCompatParcelizer, iOnCustomAction);
                    return true;
                case 3:
                    RemoteActionCompatParcelizer(p1, iAudioAttributesCompatParcelizer, iOnCustomAction);
                    return true;
                case 4:
                    AudioAttributesCompatParcelizer(p1, iAudioAttributesCompatParcelizer, iWrite2, iOnCustomAction);
                    return true;
                case 5:
                    write(p1, iAudioAttributesCompatParcelizer, iWrite2, iOnCustomAction);
                    return true;
                case 6:
                    IconCompatParcelizer(p1, iAudioAttributesCompatParcelizer, iWrite2, iOnCustomAction);
                    return true;
                case 7:
                    write(p1, iAudioAttributesCompatParcelizer, iOnCustomAction);
                    return true;
                case 8:
                    IconCompatParcelizer(p1, iAudioAttributesCompatParcelizer, iOnCustomAction);
                    return true;
                default:
                    this.source.AudioAttributesImplBaseParcelizer(iAudioAttributesCompatParcelizer);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    private final void RemoteActionCompatParcelizer(write p0, int p1, int p2, int p3) throws IOException {
        if (p3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (p2 & 1) != 0;
        int iWrite = (p2 & 8) != 0 ? FirebaseDataModule.write(this.source.MediaMetadataCompat()) : 0;
        if ((p2 & 32) != 0) {
            IconCompatParcelizer();
            p1 -= 5;
        }
        p0.write(z, p3, read(Companion.write(p1, p2, iWrite), iWrite, p2, p3));
    }

    private final List<SyncingActivity> read(int p0, int p1, int p2, int p3) throws IOException {
        this.continuation.read(p0);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.continuation;
        remoteActionCompatParcelizer.write(remoteActionCompatParcelizer.getLeft());
        this.continuation.IconCompatParcelizer(p1);
        this.continuation.RemoteActionCompatParcelizer(p2);
        this.continuation.AudioAttributesCompatParcelizer(p3);
        this.hpackReader.IconCompatParcelizer();
        return this.hpackReader.AudioAttributesCompatParcelizer();
    }

    private final void read(write p0, int p1, int p2, int p3) throws IOException {
        if (p3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (p2 & 1) != 0;
        if ((p2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iWrite = (p2 & 8) != 0 ? FirebaseDataModule.write(this.source.MediaMetadataCompat()) : 0;
        p0.write(z, p3, this.source, Companion.write(p1, p2, iWrite));
        this.source.AudioAttributesImplBaseParcelizer(iWrite);
    }

    private final void read(write writeVar, int i, int i2) throws IOException {
        if (i == 5) {
            if (i2 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            IconCompatParcelizer();
        } else {
            StringBuilder sb = new StringBuilder("TYPE_PRIORITY length: ");
            sb.append(i);
            sb.append(" != 5");
            throw new IOException(sb.toString());
        }
    }

    private final void IconCompatParcelizer() throws IOException {
        this.source.onCustomAction();
        FirebaseDataModule.write(this.source.MediaMetadataCompat());
    }

    private final void RemoteActionCompatParcelizer(write writeVar, int i, int i2) throws IOException {
        if (i != 4) {
            StringBuilder sb = new StringBuilder("TYPE_RST_STREAM length: ");
            sb.append(i);
            sb.append(" != 4");
            throw new IOException(sb.toString());
        }
        if (i2 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int iOnCustomAction = this.source.onCustomAction();
        getConnectionMonitor.Companion companion = getConnectionMonitor.INSTANCE;
        getConnectionMonitor getconnectionmonitorRemoteActionCompatParcelizer = getConnectionMonitor.Companion.RemoteActionCompatParcelizer(iOnCustomAction);
        if (getconnectionmonitorRemoteActionCompatParcelizer == null) {
            throw new IOException("TYPE_RST_STREAM unexpected error code: ".concat(String.valueOf(iOnCustomAction)));
        }
        writeVar.write(i2, getconnectionmonitorRemoteActionCompatParcelizer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ".concat(java.lang.String.valueOf(r3)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void AudioAttributesCompatParcelizer(o.BaseActivity.write r7, int r8, int r9, int r10) throws java.io.IOException {
        /*
            r6 = this;
            if (r10 != 0) goto La7
            r10 = 1
            r9 = r9 & r10
            if (r9 == 0) goto L11
            if (r8 != 0) goto L9
            return
        L9:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r6.<init>(r7)
            throw r6
        L11:
            int r9 = r8 % 6
            if (r9 != 0) goto L97
            o.getTimelineAdapter r9 = new o.getTimelineAdapter
            r9.<init>()
            r0 = 0
            o.newEncryptedObject r8 = kotlin.getQues.IconCompatParcelizer(r0, r8)
            o.getDecryptedContent r8 = (kotlin.getDecryptedContent) r8
            r0 = 6
            o.getDecryptedContent r8 = kotlin.getQues.write(r8, r0)
            int r0 = r8.getRead()
            int r1 = r8.getAudioAttributesCompatParcelizer()
            int r8 = r8.getIconCompatParcelizer()
            if (r8 <= 0) goto L36
            if (r0 <= r1) goto L3a
        L36:
            if (r8 >= 0) goto L93
            if (r1 > r0) goto L93
        L3a:
            o.LessonCompletedDialog r2 = r6.source
            short r2 = r2.onAddQueueItem()
            int r2 = kotlin.FirebaseDataModule.write(r2)
            o.LessonCompletedDialog r3 = r6.source
            int r3 = r3.onCustomAction()
            r4 = 2
            if (r2 == r4) goto L7f
            r4 = 3
            r5 = 4
            if (r2 == r4) goto L7d
            if (r2 == r5) goto L71
            r4 = 5
            if (r2 == r4) goto L57
            goto L8c
        L57:
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r3 < r4) goto L61
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            if (r3 > r4) goto L61
            goto L8c
        L61:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r8 = java.lang.String.valueOf(r3)
            java.lang.String r7 = r7.concat(r8)
            r6.<init>(r7)
            throw r6
        L71:
            if (r3 < 0) goto L75
            r2 = 7
            goto L8c
        L75:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r6.<init>(r7)
            throw r6
        L7d:
            r2 = r5
            goto L8c
        L7f:
            if (r3 == 0) goto L8c
            if (r3 != r10) goto L84
            goto L8c
        L84:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r6.<init>(r7)
            throw r6
        L8c:
            r9.read(r2, r3)
            if (r0 == r1) goto L93
            int r0 = r0 + r8
            goto L3a
        L93:
            r7.AudioAttributesCompatParcelizer(r9)
            return
        L97:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r7 = r7.concat(r8)
            r6.<init>(r7)
            throw r6
        La7:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "TYPE_SETTINGS streamId != 0"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.BaseActivity.AudioAttributesCompatParcelizer(o.BaseActivity$write, int, int, int):void");
    }

    private final void write(write p0, int p1, int p2, int p3) throws IOException {
        if (p3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iWrite = (p2 & 8) != 0 ? FirebaseDataModule.write(this.source.MediaMetadataCompat()) : 0;
        p0.read(Integer.MAX_VALUE & this.source.onCustomAction(), read(Companion.write(p1 - 4, p2, iWrite), iWrite, p2, p3));
    }

    private final void IconCompatParcelizer(write p0, int p1, int p2, int p3) throws IOException {
        if (p1 != 8) {
            throw new IOException("TYPE_PING length != 8: ".concat(String.valueOf(p1)));
        }
        if (p3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        p0.read((p2 & 1) != 0, this.source.onCustomAction(), this.source.onCustomAction());
    }

    private final void write(write writeVar, int i, int i2) throws IOException {
        if (i < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: ".concat(String.valueOf(i)));
        }
        if (i2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int iOnCustomAction = this.source.onCustomAction();
        int iOnCustomAction2 = this.source.onCustomAction();
        int i3 = i - 8;
        getConnectionMonitor.Companion companion = getConnectionMonitor.INSTANCE;
        getConnectionMonitor getconnectionmonitorRemoteActionCompatParcelizer = getConnectionMonitor.Companion.RemoteActionCompatParcelizer(iOnCustomAction2);
        if (getconnectionmonitorRemoteActionCompatParcelizer == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: ".concat(String.valueOf(iOnCustomAction2)));
        }
        getRelatedModuleAdapter getrelatedmoduleadapter = getRelatedModuleAdapter.EMPTY;
        if (i3 > 0) {
            getrelatedmoduleadapter = this.source.read(i3);
        }
        writeVar.RemoteActionCompatParcelizer(iOnCustomAction, getconnectionmonitorRemoteActionCompatParcelizer, getrelatedmoduleadapter);
    }

    private final void IconCompatParcelizer(write writeVar, int i, int i2) throws IOException {
        if (i != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: ".concat(String.valueOf(i)));
        }
        long jAudioAttributesCompatParcelizer = FirebaseDataModule.AudioAttributesCompatParcelizer(this.source.onCustomAction());
        if (jAudioAttributesCompatParcelizer == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        writeVar.RemoteActionCompatParcelizer(i2, jAudioAttributesCompatParcelizer);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.source.close();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u00020\u00128\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\"\u0004\b\u0010\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u001a\u001a\u00020\u00128\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0014\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001b\u001a\u00020\u00128\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0014\"\u0004\b\u000e\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u00020\u00128\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u0014\"\u0004\b\f\u0010\u0015"}, d2 = {"Lo/BaseActivity$RemoteActionCompatParcelizer;", "Lo/setLockedFromSeek;", "Lo/LessonCompletedDialog;", "p0", "<init>", "(Lo/LessonCompletedDialog;)V", "", "close", "()V", "Lo/resetCurrentSelectedPosition;", "", "p1", "AudioAttributesCompatParcelizer", "(Lo/resetCurrentSelectedPosition;J)J", "IconCompatParcelizer", "Lo/CustomTextView;", "RemoteActionCompatParcelizer", "()Lo/CustomTextView;", "", "flags", "I", "(I)V", TtmlNode.LEFT, "write", "()I", "read", SessionDescription.ATTR_LENGTH, "padding", "source", "Lo/LessonCompletedDialog;", "streamId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements setLockedFromSeek {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final LessonCompletedDialog source;
        private int streamId;

        @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        public RemoteActionCompatParcelizer(LessonCompletedDialog lessonCompletedDialog) {
            toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
            this.source = lessonCompletedDialog;
        }

        public final void write(int i) {
            this.length = i;
        }

        public final void RemoteActionCompatParcelizer(int i) {
            this.flags = i;
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            this.streamId = i;
        }

        public final void read(int i) {
            this.left = i;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        public final void IconCompatParcelizer(int i) {
            this.padding = i;
        }

        @Override // kotlin.setLockedFromSeek
        public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition p0, long p1) throws IOException {
            toMagicModuleMetaRepoModel.write(p0, "");
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.AudioAttributesImplBaseParcelizer(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    IconCompatParcelizer();
                } else {
                    long jAudioAttributesCompatParcelizer = this.source.AudioAttributesCompatParcelizer(p0, Math.min(p1, i));
                    if (jAudioAttributesCompatParcelizer == -1) {
                        return -1L;
                    }
                    this.left -= (int) jAudioAttributesCompatParcelizer;
                    return jAudioAttributesCompatParcelizer;
                }
            }
        }

        @Override // kotlin.setLockedFromSeek
        public final CustomTextView RemoteActionCompatParcelizer() {
            return this.source.RemoteActionCompatParcelizer();
        }

        private final void IconCompatParcelizer() throws IOException {
            int i = this.streamId;
            int iAudioAttributesCompatParcelizer = FirebaseDataModule.AudioAttributesCompatParcelizer(this.source);
            this.left = iAudioAttributesCompatParcelizer;
            this.length = iAudioAttributesCompatParcelizer;
            int iWrite = FirebaseDataModule.write(this.source.MediaMetadataCompat());
            this.flags = FirebaseDataModule.write(this.source.MediaMetadataCompat());
            Companion companion = BaseActivity.INSTANCE;
            if (Companion.AudioAttributesCompatParcelizer().isLoggable(Level.FINE)) {
                Companion companion2 = BaseActivity.INSTANCE;
                Logger loggerAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer();
                setConnectionMonitor setconnectionmonitor = setConnectionMonitor.INSTANCE;
                loggerAudioAttributesCompatParcelizer.fine(setConnectionMonitor.AudioAttributesCompatParcelizer(true, this.streamId, this.length, iWrite, this.flags));
            }
            int iOnCustomAction = this.source.onCustomAction() & Integer.MAX_VALUE;
            this.streamId = iOnCustomAction;
            if (iWrite == 9) {
                if (iOnCustomAction != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(iWrite);
                sb.append(" != TYPE_CONTINUATION");
                throw new IOException(sb.toString());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lo/BaseActivity$Companion;", "", "<init>", "()V", "", "p0", "p1", "p2", "write", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "AudioAttributesCompatParcelizer", "()Ljava/util/logging/Logger;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Logger AudioAttributesCompatParcelizer() {
            return BaseActivity.logger;
        }

        public static int write(int p0, int p1, int p2) throws IOException {
            if ((p1 & 8) != 0) {
                p0--;
            }
            if (p2 <= p0) {
                return p0 - p2;
            }
            StringBuilder sb = new StringBuilder("PROTOCOL_ERROR padding ");
            sb.append(p2);
            sb.append(" > remaining length ");
            sb.append(p0);
            throw new IOException(sb.toString());
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        Logger logger2 = Logger.getLogger(setConnectionMonitor.class.getName());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(logger2, "");
        logger = logger2;
    }
}
