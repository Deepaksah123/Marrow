package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001:\u0002\r\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0010J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0010J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001a\u0010\u0010JG\u0010\u0017\u001a\u00060#R\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\u0017\u0010$J\u001f\u0010\t\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020%H\u0002¢\u0006\u0004\b\t\u0010&JC\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\u0017\u0010'J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\nJ\u0017\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010*J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010+J'\u0010\t\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010,J\u001b\u0010\r\u001a\u00020!2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030-H\u0000¢\u0006\u0004\b\r\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0017\u0010)\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\t\u00104R\u0014\u0010\r\u001a\u0002058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010(\u001a\u0002088\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b\r\u0010:R$\u0010\t\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020%8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b)\u0010<R\u001a\u0010\u0017\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b2\u0010\bR$\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b)\u0010=\u001a\u0004\b(\u0010\bR\u0014\u0010\u0019\u001a\u00020!8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010>R\u0014\u00106\u001a\u00020\u001b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010AR\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010AR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010AR\u001c\u0010\u001a\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010BR\u0018\u0010?\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010D"}, d2 = {"Lo/ObjectReader;", "", "Lo/_assertNotNull;", "p0", "<init>", "(Lo/_assertNotNull;)V", "Lo/_handleOddName$IconCompatParcelizer;", "MediaMetadataCompat", "()Lo/_handleOddName$IconCompatParcelizer;", "IconCompatParcelizer", "(Lo/_handleOddName$IconCompatParcelizer;)Lo/_handleOddName$IconCompatParcelizer;", "Lo/_handleOddName;", "", "write", "(Lo/_handleOddName;)V", "AudioAttributesImplApi26Parcelizer", "()V", "MediaDescriptionCompat", "onCommand", "AudioAttributesImplApi21Parcelizer", "RatingCompat", "", "Lo/getAbsentValue;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatMediaItem", "", "p1", "Lo/UTF32Reader;", "Lo/_handleOddName$RemoteActionCompatParcelizer;", "p2", "p3", "", "p4", "Lo/ObjectReader$write;", "(Lo/_handleOddName$IconCompatParcelizer;ILo/UTF32Reader;Lo/UTF32Reader;Z)Lo/ObjectReader$write;", "Lo/_bindAndClose;", "(Lo/_handleOddName$IconCompatParcelizer;Lo/_bindAndClose;)V", "(ILo/UTF32Reader;Lo/UTF32Reader;Lo/_handleOddName$IconCompatParcelizer;Z)V", "read", "RemoteActionCompatParcelizer", "(Lo/_handleOddName$RemoteActionCompatParcelizer;Lo/_handleOddName$IconCompatParcelizer;)Lo/_handleOddName$IconCompatParcelizer;", "(Lo/_handleOddName$IconCompatParcelizer;Lo/_handleOddName$IconCompatParcelizer;)Lo/_handleOddName$IconCompatParcelizer;", "(Lo/_handleOddName$RemoteActionCompatParcelizer;Lo/_handleOddName$RemoteActionCompatParcelizer;Lo/_handleOddName$IconCompatParcelizer;)V", "Lo/_bind;", "(I)Z", "", "toString", "()Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "Lo/_assertNotNull;", "()Lo/_assertNotNull;", "Lo/ObjectReader$read;", "AudioAttributesImplBaseParcelizer", "Lo/ObjectReader$read;", "Lo/registerSubtypes;", "Lo/registerSubtypes;", "()Lo/registerSubtypes;", "Lo/_bindAndClose;", "()Lo/_bindAndClose;", "Lo/_handleOddName$IconCompatParcelizer;", "()Z", "MediaBrowserCompatSearchResultReceiver", "()I", "Lo/UTF32Reader;", "Lo/ObjectReader$write;", "Lo/ObjectReader$AudioAttributesCompatParcelizer;", "Lo/ObjectReader$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ObjectReader {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private _bindAndClose IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final read write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private write MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final UTF32Reader<_handleOddName> MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final _assertNotNull RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final _handleOddName.IconCompatParcelizer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private _handleOddName.IconCompatParcelizer AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final registerSubtypes read;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u000eJ7\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u0010J'\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/ObjectReader$AudioAttributesCompatParcelizer;", "", "", "p0", "Lo/_handleOddName$RemoteActionCompatParcelizer;", "p1", "p2", "Lo/_handleOddName$IconCompatParcelizer;", "p3", "", "IconCompatParcelizer", "(ILo/_handleOddName$RemoteActionCompatParcelizer;Lo/_handleOddName$RemoteActionCompatParcelizer;Lo/_handleOddName$IconCompatParcelizer;)V", "p4", "write", "(IILo/_handleOddName$RemoteActionCompatParcelizer;Lo/_handleOddName$RemoteActionCompatParcelizer;Lo/_handleOddName$IconCompatParcelizer;)V", "AudioAttributesCompatParcelizer", "(IILo/_handleOddName$RemoteActionCompatParcelizer;Lo/_handleOddName$IconCompatParcelizer;Lo/_handleOddName$IconCompatParcelizer;)V", "read", "(ILo/_handleOddName$RemoteActionCompatParcelizer;Lo/_handleOddName$IconCompatParcelizer;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AudioAttributesCompatParcelizer {
        void AudioAttributesCompatParcelizer(int p0, int p1, _handleOddName.RemoteActionCompatParcelizer p2, _handleOddName.RemoteActionCompatParcelizer p3, _handleOddName.IconCompatParcelizer p4);

        void IconCompatParcelizer(int p0, _handleOddName.RemoteActionCompatParcelizer p1, _handleOddName.RemoteActionCompatParcelizer p2, _handleOddName.IconCompatParcelizer p3);

        void read(int p0, _handleOddName.RemoteActionCompatParcelizer p1, _handleOddName.IconCompatParcelizer p2);

        void write(int p0, int p1, _handleOddName.RemoteActionCompatParcelizer p2, _handleOddName.IconCompatParcelizer p3, _handleOddName.IconCompatParcelizer p4);

        void write(int p0, int p1, _handleOddName.RemoteActionCompatParcelizer p2, _handleOddName.RemoteActionCompatParcelizer p3, _handleOddName.IconCompatParcelizer p4);
    }

    public ObjectReader(_assertNotNull _assertnotnull) {
        this.RemoteActionCompatParcelizer = _assertnotnull;
        read readVar = new read();
        readVar.write(-1);
        this.write = readVar;
        registerSubtypes registersubtypes = new registerSubtypes(_assertnotnull);
        this.read = registersubtypes;
        this.IconCompatParcelizer = registersubtypes;
        withMergeInfo withmergeinfoOnCommand = registersubtypes.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.AudioAttributesCompatParcelizer = withmergeinfoOnCommand;
        this.AudioAttributesImplApi21Parcelizer = withmergeinfoOnCommand;
        this.MediaMetadataCompat = new UTF32Reader<>(new _handleOddName[16], 0);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final _assertNotNull getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/ObjectReader$read;", "Lo/_handleOddName$IconCompatParcelizer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends _handleOddName.IconCompatParcelizer {
        read() {
        }

        public final String toString() {
            return "<Head>";
        }
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final registerSubtypes getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final _bindAndClose getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final _handleOddName.IconCompatParcelizer getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final _handleOddName.IconCompatParcelizer getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.write.getAudioAttributesImplBaseParcelizer() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int MediaBrowserCompatSearchResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer();
    }

    private final _handleOddName.IconCompatParcelizer MediaMetadataCompat() {
        if (this.AudioAttributesImplApi21Parcelizer == this.write) {
            reportWrongTokenException.read("padChain called on already padded chain");
        }
        _handleOddName.IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        iconCompatParcelizer.RemoteActionCompatParcelizer(this.write);
        this.write.AudioAttributesCompatParcelizer(iconCompatParcelizer);
        return this.write;
    }

    private final _handleOddName.IconCompatParcelizer IconCompatParcelizer(_handleOddName.IconCompatParcelizer p0) {
        if (p0 != this.write) {
            reportWrongTokenException.read("trimChain called on already trimmed chain");
        }
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = this.write.getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            audioAttributesImplBaseParcelizer = this.AudioAttributesCompatParcelizer;
        }
        audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer((_handleOddName.IconCompatParcelizer) null);
        this.write.AudioAttributesCompatParcelizer((_handleOddName.IconCompatParcelizer) null);
        this.write.write(-1);
        this.write.RemoteActionCompatParcelizer((_bindAndClose) null);
        if (audioAttributesImplBaseParcelizer == this.write) {
            reportWrongTokenException.read("trimChain did not update the head");
        }
        return audioAttributesImplBaseParcelizer;
    }

    public final void write(_handleOddName p0) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        _handleOddName.IconCompatParcelizer iconCompatParcelizerMediaMetadataCompat = MediaMetadataCompat();
        UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> uTF32Reader = this.AudioAttributesImplApi26Parcelizer;
        int i = 0;
        int iWrite = uTF32Reader != null ? uTF32Reader.getAudioAttributesCompatParcelizer() : 0;
        UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> uTF32Reader2 = this.MediaBrowserCompatItemReceiver;
        if (uTF32Reader2 == null) {
            uTF32Reader2 = new UTF32Reader<>(new _handleOddName.RemoteActionCompatParcelizer[16], 0);
        }
        UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> uTF32Reader3 = _considerFilter.read(p0, uTF32Reader2, this.MediaMetadataCompat);
        UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> uTF32Reader4 = null;
        if (uTF32Reader3.getAudioAttributesCompatParcelizer() == iWrite) {
            _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = iconCompatParcelizerMediaMetadataCompat.getAudioAttributesImplBaseParcelizer();
            int i2 = 0;
            while (true) {
                if (audioAttributesImplBaseParcelizer == null || i2 >= iWrite) {
                    break;
                }
                if (uTF32Reader == null) {
                    reportWrongTokenException.write("expected prior modifier list to be non-empty");
                    throw new PlanDetailsCreator();
                }
                _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = uTF32Reader.IconCompatParcelizer[i2];
                _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = uTF32Reader3.IconCompatParcelizer[i2];
                int i3 = _considerFilter.read(remoteActionCompatParcelizer, remoteActionCompatParcelizer2);
                if (i3 == 0) {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.MediaBrowserCompatSearchResultReceiver;
                    if (audioAttributesCompatParcelizer2 != null) {
                        audioAttributesCompatParcelizer2.IconCompatParcelizer(i2, remoteActionCompatParcelizer, remoteActionCompatParcelizer2, audioAttributesImplBaseParcelizer);
                    }
                    audioAttributesImplBaseParcelizer = audioAttributesImplBaseParcelizer.getMediaBrowserCompatItemReceiver();
                } else {
                    if (i3 == 1) {
                        IconCompatParcelizer(remoteActionCompatParcelizer, remoteActionCompatParcelizer2, audioAttributesImplBaseParcelizer);
                        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = this.MediaBrowserCompatSearchResultReceiver;
                        if (audioAttributesCompatParcelizer3 != null) {
                            audioAttributesCompatParcelizer3.write(i2, i2, remoteActionCompatParcelizer, remoteActionCompatParcelizer2, audioAttributesImplBaseParcelizer);
                        }
                    } else if (i3 == 2 && (audioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver) != null) {
                        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i2, i2, remoteActionCompatParcelizer, remoteActionCompatParcelizer2, audioAttributesImplBaseParcelizer);
                    }
                    audioAttributesImplBaseParcelizer = audioAttributesImplBaseParcelizer.getAudioAttributesImplBaseParcelizer();
                    i2++;
                }
            }
            _handleOddName.IconCompatParcelizer iconCompatParcelizer = audioAttributesImplBaseParcelizer;
            if (i2 < iWrite) {
                if (uTF32Reader == null) {
                    reportWrongTokenException.write("expected prior modifier list to be non-empty");
                    throw new PlanDetailsCreator();
                }
                if (iconCompatParcelizer != null) {
                    AudioAttributesCompatParcelizer(i2, uTF32Reader, uTF32Reader3, iconCompatParcelizer, !this.RemoteActionCompatParcelizer.onPlayFromMediaId());
                    i = 1;
                } else {
                    reportWrongTokenException.write("structuralUpdate requires a non-null tail");
                    throw new PlanDetailsCreator();
                }
            }
        } else {
            if (this.RemoteActionCompatParcelizer.onPlayFromMediaId() && iWrite == 0) {
                _handleOddName.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizerMediaMetadataCompat;
                while (i < uTF32Reader3.getAudioAttributesCompatParcelizer()) {
                    _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = uTF32Reader3.IconCompatParcelizer[i];
                    _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = write(remoteActionCompatParcelizer3, iconCompatParcelizer2);
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer4 = this.MediaBrowserCompatSearchResultReceiver;
                    if (audioAttributesCompatParcelizer4 != null) {
                        audioAttributesCompatParcelizer4.write(0, i, remoteActionCompatParcelizer3, iconCompatParcelizer2, iconCompatParcelizerWrite);
                    }
                    i++;
                    iconCompatParcelizer2 = iconCompatParcelizerWrite;
                }
                onCommand();
            } else if (uTF32Reader3.getAudioAttributesCompatParcelizer() != 0) {
                if (uTF32Reader == null) {
                    uTF32Reader = new UTF32Reader<>(new _handleOddName.RemoteActionCompatParcelizer[16], 0);
                }
                AudioAttributesCompatParcelizer(0, uTF32Reader, uTF32Reader3, iconCompatParcelizerMediaMetadataCompat, !this.RemoteActionCompatParcelizer.onPlayFromMediaId());
            } else if (uTF32Reader != null) {
                _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer2 = iconCompatParcelizerMediaMetadataCompat.getAudioAttributesImplBaseParcelizer();
                for (int i4 = 0; audioAttributesImplBaseParcelizer2 != null && i4 < uTF32Reader.getAudioAttributesCompatParcelizer(); i4++) {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer5 = this.MediaBrowserCompatSearchResultReceiver;
                    if (audioAttributesCompatParcelizer5 != null) {
                        audioAttributesCompatParcelizer5.read(i4, uTF32Reader.IconCompatParcelizer[i4], audioAttributesImplBaseParcelizer2);
                    }
                    audioAttributesImplBaseParcelizer2 = read(audioAttributesImplBaseParcelizer2).getAudioAttributesImplBaseParcelizer();
                }
                registerSubtypes registersubtypes = this.read;
                _assertNotNull _assertnotnull_init_lambda4 = this.RemoteActionCompatParcelizer._init_lambda4();
                registersubtypes.AudioAttributesImplApi26Parcelizer(_assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.onPrepareFromUri() : null);
                this.IconCompatParcelizer = this.read;
            } else {
                reportWrongTokenException.write("expected prior modifier list to be non-empty");
                throw new PlanDetailsCreator();
            }
            i = 1;
        }
        this.AudioAttributesImplApi26Parcelizer = uTF32Reader3;
        if (uTF32Reader != null) {
            uTF32Reader.RemoteActionCompatParcelizer();
            uTF32Reader4 = uTF32Reader;
        }
        this.MediaBrowserCompatItemReceiver = uTF32Reader4;
        this.AudioAttributesImplApi21Parcelizer = IconCompatParcelizer(iconCompatParcelizerMediaMetadataCompat);
        if (i != 0) {
            MediaDescriptionCompat();
        }
    }

    public final void MediaDescriptionCompat() {
        _findRootDeserializer _findrootdeserializer;
        registerSubtypes registersubtypes = this.read;
        for (_handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver(); mediaBrowserCompatItemReceiver != null; mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver()) {
            _initForReading _initforreadingWrite = collectLongDefaults.write(mediaBrowserCompatItemReceiver);
            if (_initforreadingWrite != null) {
                if (mediaBrowserCompatItemReceiver.getAudioAttributesImplApi21Parcelizer() != null) {
                    _bindAndClose audioAttributesImplApi21Parcelizer = mediaBrowserCompatItemReceiver.getAudioAttributesImplApi21Parcelizer();
                    toMagicModuleMetaRepoModel.read(audioAttributesImplApi21Parcelizer, "");
                    _findrootdeserializer = (_findRootDeserializer) audioAttributesImplApi21Parcelizer;
                    _initForReading _initforreadingHandleMediaPlayPauseIfPendingOnHandler = _findrootdeserializer.getWrite();
                    _findrootdeserializer.write(_initforreadingWrite);
                    if (_initforreadingHandleMediaPlayPauseIfPendingOnHandler != mediaBrowserCompatItemReceiver) {
                        _findrootdeserializer.ResultReceiver();
                    }
                } else {
                    _findrootdeserializer = new _findRootDeserializer(this.RemoteActionCompatParcelizer, _initforreadingWrite);
                    mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(_findrootdeserializer);
                }
                _findRootDeserializer _findrootdeserializer2 = _findrootdeserializer;
                registersubtypes.AudioAttributesImplApi26Parcelizer(_findrootdeserializer2);
                _findrootdeserializer.AudioAttributesImplApi21Parcelizer(registersubtypes);
                registersubtypes = _findrootdeserializer2;
            } else {
                mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(registersubtypes);
            }
        }
        _assertNotNull _assertnotnull_init_lambda4 = this.RemoteActionCompatParcelizer._init_lambda4();
        registersubtypes.AudioAttributesImplApi26Parcelizer(_assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.onPrepareFromUri() : null);
        this.IconCompatParcelizer = registersubtypes;
    }

    private final void onCommand() {
        int write2 = 0;
        for (_handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver(); mediaBrowserCompatItemReceiver != null && mediaBrowserCompatItemReceiver != this.write; mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver()) {
            write2 |= mediaBrowserCompatItemReceiver.getWrite();
            mediaBrowserCompatItemReceiver.write(write2);
        }
    }

    public final List<getAbsentValue> AudioAttributesCompatParcelizer() {
        UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> uTF32Reader = this.AudioAttributesImplApi26Parcelizer;
        if (uTF32Reader == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        int i = 0;
        UTF32Reader uTF32Reader2 = new UTF32Reader(new getAbsentValue[uTF32Reader.getAudioAttributesCompatParcelizer()], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer = getAudioAttributesImplApi21Parcelizer();
        while (audioAttributesImplApi21Parcelizer != null && audioAttributesImplApi21Parcelizer != getAudioAttributesCompatParcelizer()) {
            _bindAndClose audioAttributesImplApi21Parcelizer2 = audioAttributesImplApi21Parcelizer.getAudioAttributesImplApi21Parcelizer();
            if (audioAttributesImplApi21Parcelizer2 == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator".toString());
            }
            _reportUnkownFormat _reportunkownformatOnSkipToPrevious = audioAttributesImplApi21Parcelizer2.getMediaSessionCompatResultReceiverWrapper();
            _reportUnkownFormat _reportunkownformatOnSkipToPrevious2 = this.read.getMediaSessionCompatResultReceiverWrapper();
            _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer();
            if (audioAttributesImplBaseParcelizer != this.AudioAttributesCompatParcelizer || audioAttributesImplApi21Parcelizer.getAudioAttributesImplApi21Parcelizer() == audioAttributesImplBaseParcelizer.getAudioAttributesImplApi21Parcelizer()) {
                _reportunkownformatOnSkipToPrevious2 = null;
            }
            if (_reportunkownformatOnSkipToPrevious == null) {
                _reportunkownformatOnSkipToPrevious = _reportunkownformatOnSkipToPrevious2;
            }
            uTF32Reader2.read(new getAbsentValue(uTF32Reader.IconCompatParcelizer[i], audioAttributesImplApi21Parcelizer2, _reportunkownformatOnSkipToPrevious));
            audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer();
            i++;
        }
        return uTF32Reader2.read();
    }

    private final write AudioAttributesCompatParcelizer(_handleOddName.IconCompatParcelizer p0, int p1, UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> p2, UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> p3, boolean p4) {
        write writeVar = this.MediaBrowserCompatMediaItem;
        if (writeVar == null) {
            write writeVar2 = new write(p0, p1, p2, p3, p4);
            this.MediaBrowserCompatMediaItem = writeVar2;
            return writeVar2;
        }
        writeVar.IconCompatParcelizer(p0);
        writeVar.write(p1);
        writeVar.write(p2);
        writeVar.read(p3);
        writeVar.RemoteActionCompatParcelizer(p4);
        return writeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(_handleOddName.IconCompatParcelizer p0, _bindAndClose p1) {
        for (_handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = p0.getMediaBrowserCompatItemReceiver(); mediaBrowserCompatItemReceiver != null; mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver()) {
            if (mediaBrowserCompatItemReceiver == this.write) {
                _assertNotNull _assertnotnull_init_lambda4 = this.RemoteActionCompatParcelizer._init_lambda4();
                p1.AudioAttributesImplApi26Parcelizer(_assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.onPrepareFromUri() : null);
                this.IconCompatParcelizer = p1;
                return;
            } else {
                if ((_bind.write(2) & mediaBrowserCompatItemReceiver.getWrite()) != 0) {
                    return;
                }
                mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(p1);
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0014R\u001c\u0010\u0013\u001a\u00020\u00028\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u00020\u00048\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0018\"\u0004\b\u0019\u0010\u0012R\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u001a\"\u0004\b\u0019\u0010\u001bR\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\"\u0004\b\u0013\u0010\u001bR\u001c\u0010\u0011\u001a\u00020\n8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\"\u0004\b\u000e\u0010\u001e"}, d2 = {"Lo/ObjectReader$write;", "Lo/addBeanDeserializerModifier;", "Lo/_handleOddName$IconCompatParcelizer;", "p0", "", "p1", "Lo/UTF32Reader;", "Lo/_handleOddName$RemoteActionCompatParcelizer;", "p2", "p3", "", "p4", "<init>", "(Lo/ObjectReader;Lo/_handleOddName$IconCompatParcelizer;ILo/UTF32Reader;Lo/UTF32Reader;Z)V", "RemoteActionCompatParcelizer", "(II)Z", "", "AudioAttributesCompatParcelizer", "(I)V", "read", "(II)V", "Lo/_handleOddName$IconCompatParcelizer;", "IconCompatParcelizer", "(Lo/_handleOddName$IconCompatParcelizer;)V", "I", "write", "Lo/UTF32Reader;", "(Lo/UTF32Reader;)V", "MediaBrowserCompatItemReceiver", "Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class write implements addBeanDeserializerModifier {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private _handleOddName.IconCompatParcelizer read;
        private UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> IconCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private boolean AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private int write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer;

        public write(_handleOddName.IconCompatParcelizer iconCompatParcelizer, int i, UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> uTF32Reader, UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> uTF32Reader2, boolean z) {
            this.read = iconCompatParcelizer;
            this.write = i;
            this.IconCompatParcelizer = uTF32Reader;
            this.RemoteActionCompatParcelizer = uTF32Reader2;
            this.AudioAttributesCompatParcelizer = z;
        }

        public final void IconCompatParcelizer(_handleOddName.IconCompatParcelizer iconCompatParcelizer) {
            this.read = iconCompatParcelizer;
        }

        public final void write(int i) {
            this.write = i;
        }

        public final void write(UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> uTF32Reader) {
            this.IconCompatParcelizer = uTF32Reader;
        }

        public final void read(UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> uTF32Reader) {
            this.RemoteActionCompatParcelizer = uTF32Reader;
        }

        public final void RemoteActionCompatParcelizer(boolean z) {
            this.AudioAttributesCompatParcelizer = z;
        }

        @Override // kotlin.addBeanDeserializerModifier
        public final boolean RemoteActionCompatParcelizer(int p0, int p1) {
            return _considerFilter.read(this.IconCompatParcelizer.IconCompatParcelizer[this.write + p0], this.RemoteActionCompatParcelizer.IconCompatParcelizer[this.write + p1]) != 0;
        }

        @Override // kotlin.addBeanDeserializerModifier
        public final void AudioAttributesCompatParcelizer(int p0) {
            int i = this.write + p0;
            _handleOddName.IconCompatParcelizer iconCompatParcelizer = this.read;
            this.read = ObjectReader.this.write(this.RemoteActionCompatParcelizer.IconCompatParcelizer[i], iconCompatParcelizer);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = ObjectReader.this.MediaBrowserCompatSearchResultReceiver;
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.write(i, i, this.RemoteActionCompatParcelizer.IconCompatParcelizer[i], iconCompatParcelizer, this.read);
            }
            if (this.AudioAttributesCompatParcelizer) {
                _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = this.read.getAudioAttributesImplBaseParcelizer();
                toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer);
                _bindAndClose audioAttributesImplApi21Parcelizer = audioAttributesImplBaseParcelizer.getAudioAttributesImplApi21Parcelizer();
                toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer);
                _initForReading _initforreadingWrite = collectLongDefaults.write(this.read);
                if (_initforreadingWrite != null) {
                    _findRootDeserializer _findrootdeserializer = new _findRootDeserializer(ObjectReader.this.getRemoteActionCompatParcelizer(), _initforreadingWrite);
                    _findRootDeserializer _findrootdeserializer2 = _findrootdeserializer;
                    this.read.RemoteActionCompatParcelizer(_findrootdeserializer2);
                    ObjectReader.this.IconCompatParcelizer(this.read, _findrootdeserializer2);
                    _findrootdeserializer.AudioAttributesImplApi26Parcelizer(audioAttributesImplApi21Parcelizer.getAudioAttributesImplApi26Parcelizer());
                    _findrootdeserializer.AudioAttributesImplApi21Parcelizer(audioAttributesImplApi21Parcelizer);
                    audioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer(_findrootdeserializer2);
                } else {
                    this.read.RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer);
                }
                this.read.onPlayFromUri();
                this.read.onRemoveQueueItemAt();
                _findTreeDeserializer.write(this.read);
                return;
            }
            this.read.AudioAttributesImplApi26Parcelizer(true);
        }

        @Override // kotlin.addBeanDeserializerModifier
        public final void read(int p0, int p1) {
            _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = this.read.getAudioAttributesImplBaseParcelizer();
            toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = ObjectReader.this.MediaBrowserCompatSearchResultReceiver;
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.read(p1, this.IconCompatParcelizer.IconCompatParcelizer[this.write + p1], audioAttributesImplBaseParcelizer);
            }
            if ((_bind.write(2) & audioAttributesImplBaseParcelizer.getWrite()) != 0) {
                _bindAndClose audioAttributesImplApi21Parcelizer = audioAttributesImplBaseParcelizer.getAudioAttributesImplApi21Parcelizer();
                toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer);
                _bindAndClose _bindandcloseMediaSessionCompatQueueItem = audioAttributesImplApi21Parcelizer.getAudioAttributesImplApi26Parcelizer();
                _bindAndClose _bindandcloseMediaSessionCompatResultReceiverWrapper = audioAttributesImplApi21Parcelizer.getRead();
                toMagicModuleMetaRepoModel.write(_bindandcloseMediaSessionCompatResultReceiverWrapper);
                if (_bindandcloseMediaSessionCompatQueueItem != null) {
                    _bindandcloseMediaSessionCompatQueueItem.AudioAttributesImplApi21Parcelizer(_bindandcloseMediaSessionCompatResultReceiverWrapper);
                }
                _bindandcloseMediaSessionCompatResultReceiverWrapper.AudioAttributesImplApi26Parcelizer(_bindandcloseMediaSessionCompatQueueItem);
                ObjectReader.this.IconCompatParcelizer(this.read, _bindandcloseMediaSessionCompatResultReceiverWrapper);
            }
            this.read = ObjectReader.this.read(audioAttributesImplBaseParcelizer);
        }

        @Override // kotlin.addBeanDeserializerModifier
        public final void AudioAttributesCompatParcelizer(int p0, int p1) {
            _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = this.read.getAudioAttributesImplBaseParcelizer();
            toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer);
            this.read = audioAttributesImplBaseParcelizer;
            _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer[this.write + p0];
            _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer[this.write + p1];
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, remoteActionCompatParcelizer2)) {
                ObjectReader.this.IconCompatParcelizer(remoteActionCompatParcelizer, remoteActionCompatParcelizer2, this.read);
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = ObjectReader.this.MediaBrowserCompatSearchResultReceiver;
                if (audioAttributesCompatParcelizer != null) {
                    int i = this.write;
                    audioAttributesCompatParcelizer.write(i + p0, i + p1, remoteActionCompatParcelizer, remoteActionCompatParcelizer2, this.read);
                    return;
                }
                return;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = ObjectReader.this.MediaBrowserCompatSearchResultReceiver;
            if (audioAttributesCompatParcelizer2 != null) {
                int i2 = this.write;
                audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer(i2 + p0, i2 + p1, remoteActionCompatParcelizer, remoteActionCompatParcelizer2, this.read);
            }
        }
    }

    private final void AudioAttributesCompatParcelizer(int p0, UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> p1, UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> p2, _handleOddName.IconCompatParcelizer p3, boolean p4) {
        writeValueAsBytes.write(p1.getAudioAttributesCompatParcelizer() - p0, p2.getAudioAttributesCompatParcelizer() - p0, AudioAttributesCompatParcelizer(p3, p0, p1, p2, p4));
        onCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final _handleOddName.IconCompatParcelizer read(_handleOddName.IconCompatParcelizer p0) {
        if (p0.getRatingCompat()) {
            _findTreeDeserializer.RemoteActionCompatParcelizer(p0);
            p0.onPrepareFromUri();
            p0.onPrepare();
        }
        return RemoteActionCompatParcelizer(p0);
    }

    private final _handleOddName.IconCompatParcelizer RemoteActionCompatParcelizer(_handleOddName.IconCompatParcelizer p0) {
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = p0.getAudioAttributesImplBaseParcelizer();
        _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = p0.getMediaBrowserCompatItemReceiver();
        if (audioAttributesImplBaseParcelizer != null) {
            audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver);
            p0.AudioAttributesCompatParcelizer((_handleOddName.IconCompatParcelizer) null);
        }
        if (mediaBrowserCompatItemReceiver != null) {
            mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizer);
            p0.RemoteActionCompatParcelizer((_handleOddName.IconCompatParcelizer) null);
        }
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatItemReceiver);
        return mediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final _handleOddName.IconCompatParcelizer write(_handleOddName.RemoteActionCompatParcelizer p0, _handleOddName.IconCompatParcelizer p1) {
        JsonSerializerNone jsonSerializerNone;
        if (p0 instanceof writerFor) {
            jsonSerializerNone = ((writerFor) p0).IconCompatParcelizer();
            jsonSerializerNone.read(_findTreeDeserializer.IconCompatParcelizer(jsonSerializerNone));
        } else {
            jsonSerializerNone = new JsonSerializerNone(p0);
        }
        if (jsonSerializerNone.getRatingCompat()) {
            reportWrongTokenException.read("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        jsonSerializerNone.AudioAttributesImplApi26Parcelizer(true);
        return AudioAttributesCompatParcelizer(jsonSerializerNone, p1);
    }

    private final _handleOddName.IconCompatParcelizer AudioAttributesCompatParcelizer(_handleOddName.IconCompatParcelizer p0, _handleOddName.IconCompatParcelizer p1) {
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = p1.getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer != null) {
            audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(p0);
            p0.AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizer);
        }
        p1.AudioAttributesCompatParcelizer(p0);
        p0.RemoteActionCompatParcelizer(p1);
        return p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(_handleOddName.RemoteActionCompatParcelizer p0, _handleOddName.RemoteActionCompatParcelizer p1, _handleOddName.IconCompatParcelizer p2) {
        if ((p0 instanceof writerFor) && (p1 instanceof writerFor)) {
            _considerFilter.write((writerFor) p1, p2);
            if (p2.getRatingCompat()) {
                _findTreeDeserializer.AudioAttributesCompatParcelizer(p2);
                return;
            } else {
                p2.AudioAttributesImplApi21Parcelizer(true);
                return;
            }
        }
        if (p2 instanceof JsonSerializerNone) {
            ((JsonSerializerNone) p2).AudioAttributesCompatParcelizer(p1);
            if (p2.getRatingCompat()) {
                _findTreeDeserializer.AudioAttributesCompatParcelizer(p2);
                return;
            } else {
                p2.AudioAttributesImplApi21Parcelizer(true);
                return;
            }
        }
        reportWrongTokenException.read("Unknown Modifier.Node type");
    }

    public final boolean write(int p0) {
        return (MediaBrowserCompatSearchResultReceiver() & p0) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.AudioAttributesImplApi21Parcelizer == this.AudioAttributesCompatParcelizer) {
            sb.append("]");
        } else {
            _handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer = getAudioAttributesImplApi21Parcelizer();
            while (true) {
                if (audioAttributesImplApi21Parcelizer == null || audioAttributesImplApi21Parcelizer == getAudioAttributesCompatParcelizer()) {
                    break;
                }
                sb.append(String.valueOf(audioAttributesImplApi21Parcelizer));
                if (audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer() == this.AudioAttributesCompatParcelizer) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer();
            }
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        for (_handleOddName.IconCompatParcelizer audioAttributesCompatParcelizer = getAudioAttributesCompatParcelizer(); audioAttributesCompatParcelizer != null; audioAttributesCompatParcelizer = audioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver()) {
            if (audioAttributesCompatParcelizer.getRatingCompat()) {
                audioAttributesCompatParcelizer.onPrepareFromSearch();
            }
        }
        MediaBrowserCompatMediaItem();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        for (_handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer = getAudioAttributesImplApi21Parcelizer(); audioAttributesImplApi21Parcelizer != null; audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer()) {
            audioAttributesImplApi21Parcelizer.onPlayFromUri();
        }
    }

    public final void RatingCompat() {
        for (_handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer = getAudioAttributesImplApi21Parcelizer(); audioAttributesImplApi21Parcelizer != null; audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer()) {
            audioAttributesImplApi21Parcelizer.onRemoveQueueItemAt();
            if (audioAttributesImplApi21Parcelizer.getAudioAttributesImplApi26Parcelizer()) {
                _findTreeDeserializer.write(audioAttributesImplApi21Parcelizer);
            }
            if (audioAttributesImplApi21Parcelizer.getMediaDescriptionCompat()) {
                _findTreeDeserializer.AudioAttributesCompatParcelizer(audioAttributesImplApi21Parcelizer);
            }
            audioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer(false);
            audioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer(false);
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        for (_handleOddName.IconCompatParcelizer audioAttributesCompatParcelizer = getAudioAttributesCompatParcelizer(); audioAttributesCompatParcelizer != null; audioAttributesCompatParcelizer = audioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver()) {
            if (audioAttributesCompatParcelizer.getRatingCompat()) {
                audioAttributesCompatParcelizer.onPrepare();
            }
        }
    }

    public final void MediaBrowserCompatMediaItem() {
        for (_handleOddName.IconCompatParcelizer audioAttributesCompatParcelizer = getAudioAttributesCompatParcelizer(); audioAttributesCompatParcelizer != null; audioAttributesCompatParcelizer = audioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver()) {
            if (audioAttributesCompatParcelizer.getRatingCompat()) {
                audioAttributesCompatParcelizer.onPrepareFromUri();
            }
        }
    }
}
