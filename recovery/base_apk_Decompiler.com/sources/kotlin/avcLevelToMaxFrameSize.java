package kotlin;

import com.google.firebase.perf.session.PerfSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.getWrappedMetadataFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class avcLevelToMaxFrameSize extends flushOrReleaseCodec implements getDecoderInfo {
    private boolean AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private final WeakReference<getDecoderInfo> AudioAttributesImplApi26Parcelizer;
    private final sortByScore AudioAttributesImplBaseParcelizer;
    private final getWrappedMetadataFormat.RemoteActionCompatParcelizer IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private final List<PerfSession> read;
    private final isAlias write;

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    @Override // kotlin.getDecoderInfo
    public final void write(PerfSession perfSession) {
        if (perfSession == null || !AudioAttributesImplApi21Parcelizer() || AudioAttributesImplBaseParcelizer()) {
            return;
        }
        this.read.add(perfSession);
    }

    public static avcLevelToMaxFrameSize write(sortByScore sortbyscore) {
        return new avcLevelToMaxFrameSize(sortbyscore);
    }

    private avcLevelToMaxFrameSize(sortByScore sortbyscore) {
        this(sortbyscore, getCodecOutputMediaFormat.RemoteActionCompatParcelizer(), isAlias.read());
    }

    private avcLevelToMaxFrameSize(sortByScore sortbyscore, getCodecOutputMediaFormat getcodecoutputmediaformat, isAlias isalias) {
        super(getcodecoutputmediaformat);
        this.IconCompatParcelizer = getWrappedMetadataFormat.RemoteActionCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = new WeakReference<>(this);
        this.AudioAttributesImplBaseParcelizer = sortbyscore;
        this.write = isalias;
        this.read = Collections.synchronizedList(new ArrayList());
        read();
    }

    public final avcLevelToMaxFrameSize IconCompatParcelizer(String str) {
        if (str != null) {
            this.IconCompatParcelizer.write(secureDecodersExplicit.AudioAttributesCompatParcelizer(secureDecodersExplicit.IconCompatParcelizer(str)));
        }
        return this;
    }

    public final avcLevelToMaxFrameSize write(String str) {
        this.AudioAttributesImplApi21Parcelizer = str;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.avcLevelToMaxFrameSize AudioAttributesCompatParcelizer(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.avcLevelToMaxFrameSize.AudioAttributesCompatParcelizer(java.lang.String):o.avcLevelToMaxFrameSize");
    }

    public final avcLevelToMaxFrameSize IconCompatParcelizer(int i) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i);
        return this;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final avcLevelToMaxFrameSize write(long j) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(j);
        return this;
    }

    public final avcLevelToMaxFrameSize AudioAttributesCompatParcelizer(long j) {
        PerfSession perfSessionAudioAttributesCompatParcelizer = getDecoderInfosInternal.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
        getDecoderInfosInternal.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        this.IconCompatParcelizer.write(j);
        write(perfSessionAudioAttributesCompatParcelizer);
        if (perfSessionAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
            this.write.IconCompatParcelizer(perfSessionAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
        }
        return this;
    }

    public final avcLevelToMaxFrameSize IconCompatParcelizer(long j) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(j);
        return this;
    }

    public final avcLevelToMaxFrameSize AudioAttributesImplBaseParcelizer(long j) {
        this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(j);
        return this;
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer.read();
    }

    public final avcLevelToMaxFrameSize RemoteActionCompatParcelizer(long j) {
        this.IconCompatParcelizer.read(j);
        if (getDecoderInfosInternal.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer()) {
            this.write.IconCompatParcelizer(getDecoderInfosInternal.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer());
        }
        return this;
    }

    public final avcLevelToMaxFrameSize read(long j) {
        this.IconCompatParcelizer.IconCompatParcelizer(j);
        return this;
    }

    public final avcLevelToMaxFrameSize read(String str) {
        if (str == null) {
            this.IconCompatParcelizer.IconCompatParcelizer();
            return this;
        }
        if (RemoteActionCompatParcelizer(str)) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(str);
        }
        return this;
    }

    public final avcLevelToMaxFrameSize AudioAttributesImplApi26Parcelizer() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(getWrappedMetadataFormat.read.GENERIC_CLIENT_ERROR);
        return this;
    }

    public final getWrappedMetadataFormat RemoteActionCompatParcelizer() {
        getDecoderInfosInternal.RemoteActionCompatParcelizer().write(this.AudioAttributesImplApi26Parcelizer);
        IconCompatParcelizer();
        MetadataDecoderFactory[] metadataDecoderFactoryArrIconCompatParcelizer = PerfSession.IconCompatParcelizer(MediaDescriptionCompat());
        if (metadataDecoderFactoryArrIconCompatParcelizer != null) {
            this.IconCompatParcelizer.write(Arrays.asList(metadataDecoderFactoryArrIconCompatParcelizer));
        }
        getWrappedMetadataFormat getwrappedmetadataformatMediaBrowserCompatMediaItem = this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
        if (getDecoderInfosSortedByFormatSupport.read(this.AudioAttributesImplApi21Parcelizer) && !this.RemoteActionCompatParcelizer) {
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(getwrappedmetadataformatMediaBrowserCompatMediaItem, write());
            this.RemoteActionCompatParcelizer = true;
        }
        return getwrappedmetadataformatMediaBrowserCompatMediaItem;
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        return this.IconCompatParcelizer.write();
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    private List<PerfSession> MediaDescriptionCompat() {
        List<PerfSession> listUnmodifiableList;
        synchronized (this.read) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession perfSession : this.read) {
                if (perfSession != null) {
                    arrayList.add(perfSession);
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }

    private static boolean RemoteActionCompatParcelizer(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }
}
