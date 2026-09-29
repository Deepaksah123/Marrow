package kotlin;

import kotlin.Metadata;
import kotlin.switchAndReturnNext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0006*\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\u001c\u0010\u001b\u001a\u00020\u00118\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\r\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020!8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\"R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060#8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\u000f\u0010$\"\u0004\b\u001f\u0010%R/\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010&\u001a\u0004\b\u0019\u0010'\"\u0004\b\u000f\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R+\u0010\u0014\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020,8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b.\u0010/\"\u0004\b\u0019\u00100R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u00101R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u00102R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u00102R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u00106"}, d2 = {"Lo/getClassInfo;", "Lo/getConstructorsWithMode;", "Lo/findDefaultViews;", "p0", "<init>", "(Lo/findDefaultViews;)V", "", "MediaBrowserCompatCustomActionResultReceiver", "()V", "Lo/findSetterInfo;", "", "Lo/switchAndReturnNext;", "p1", "IconCompatParcelizer", "(Lo/findSetterInfo;FLo/switchAndReturnNext;)V", "AudioAttributesCompatParcelizer", "(Lo/findSetterInfo;)V", "", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "Lo/findDefaultViews;", "()Lo/findDefaultViews;", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "read", "(Ljava/lang/String;)V", "write", "", "Z", "Lo/findDefaultConstructor;", "RemoteActionCompatParcelizer", "Lo/findDefaultConstructor;", "Lo/contentsAsInt;", "()I", "Lkotlin/Function0;", "Lo/getCreatedOnDateMs;", "(Lo/getCreatedOnDateMs;)V", "Lo/InputAccessor;", "()Lo/switchAndReturnNext;", "(Lo/switchAndReturnNext;)V", "MediaMetadataCompat", "Lo/switchAndReturnNext;", "AudioAttributesImplApi21Parcelizer", "Lo/calloc;", "MediaBrowserCompatMediaItem", "AudioAttributesImplBaseParcelizer", "()J", "(J)V", "J", "F", "MediaBrowserCompatSearchResultReceiver", "MediaDescriptionCompat", "Lkotlin/Function1;", "Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getClassInfo extends getConstructorsWithMode {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private float MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final findDefaultViews AudioAttributesCompatParcelizer;
    private long AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private float MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final InputAccessor AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private switchAndReturnNext AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final findDefaultConstructor IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<findSetterInfo, getShowPopup> MediaMetadataCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final InputAccessor MediaBrowserCompatItemReceiver;

    public getClassInfo(findDefaultViews finddefaultviews) {
        super(null);
        this.AudioAttributesCompatParcelizer = finddefaultviews;
        finddefaultviews.IconCompatParcelizer(new AnonymousClass4());
        this.write = "";
        this.read = true;
        this.IconCompatParcelizer = new findDefaultConstructor();
        this.MediaBrowserCompatCustomActionResultReceiver = AnonymousClass1.read;
        this.MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.AudioAttributesImplApi26Parcelizer = available.RemoteActionCompatParcelizer$default(calloc.read(calloc.INSTANCE.AudioAttributesCompatParcelizer()), null, 2, null);
        this.AudioAttributesImplBaseParcelizer = calloc.INSTANCE.IconCompatParcelizer();
        this.MediaBrowserCompatSearchResultReceiver = 1.0f;
        this.MediaDescriptionCompat = 1.0f;
        this.MediaMetadataCompat = new AnonymousClass2();
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final findDefaultViews getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.getClassInfo$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getConstructorsWithMode;", "p0", "", "read", "(Lo/getConstructorsWithMode;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<getConstructorsWithMode, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(getConstructorsWithMode getconstructorswithmode) {
            read(getconstructorswithmode);
            return getShowPopup.INSTANCE;
        }

        public final void read(getConstructorsWithMode getconstructorswithmode) {
            getClassInfo.this.MediaBrowserCompatCustomActionResultReceiver();
        }

        AnonymousClass4() {
            super(1);
        }
    }

    public final void read(String str) {
        this.write = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.read = true;
        this.MediaBrowserCompatCustomActionResultReceiver.invoke();
    }

    public final int write() {
        unshare write = this.IconCompatParcelizer.getWrite();
        return write != null ? write.IconCompatParcelizer() : contentsAsInt.INSTANCE.write();
    }

    /* JADX INFO: renamed from: o.getClassInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        public static final AnonymousClass1 read = new AnonymousClass1();

        public final void read() {
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        AnonymousClass1() {
            super(0);
        }
    }

    public final void RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems;
    }

    public final void AudioAttributesCompatParcelizer(switchAndReturnNext switchandreturnnext) {
        this.MediaBrowserCompatItemReceiver.write(switchandreturnnext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final switchAndReturnNext read() {
        return (switchAndReturnNext) this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long AudioAttributesImplBaseParcelizer() {
        return ((calloc) this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer()).getIconCompatParcelizer();
    }

    public final void read(long j) {
        this.AudioAttributesImplApi26Parcelizer.write(calloc.read(j));
    }

    /* JADX INFO: renamed from: o.getClassInfo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/findSetterInfo;", "", "read", "(Lo/findSetterInfo;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<findSetterInfo, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(findSetterInfo findsetterinfo) {
            read(findsetterinfo);
            return getShowPopup.INSTANCE;
        }

        public final void read(findSetterInfo findsetterinfo) {
            findDefaultViews audioAttributesCompatParcelizer = getClassInfo.this.getAudioAttributesCompatParcelizer();
            getClassInfo getclassinfo = getClassInfo.this;
            float f = getclassinfo.MediaBrowserCompatSearchResultReceiver;
            float f2 = getclassinfo.MediaDescriptionCompat;
            long jWrite = getReferencedType.INSTANCE.write();
            findSerializationTyping iconCompatParcelizer = findsetterinfo.getIconCompatParcelizer();
            long jAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
            iconCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer();
            try {
                iconCompatParcelizer.getRemoteActionCompatParcelizer().read(f, f2, jWrite);
                audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(findsetterinfo);
            } finally {
                iconCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
                iconCompatParcelizer.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            }
        }

        AnonymousClass2() {
            super(1);
        }
    }

    public final void IconCompatParcelizer(findSetterInfo findsetterinfo, float f, switchAndReturnNext switchandreturnnext) {
        int iWrite;
        switchAndReturnNext switchandreturnnext2;
        if (this.AudioAttributesCompatParcelizer.getIconCompatParcelizer() && this.AudioAttributesCompatParcelizer.getRead() != 16 && getFactoryMethods.read(read()) && getFactoryMethods.read(switchandreturnnext)) {
            iWrite = contentsAsInt.INSTANCE.IconCompatParcelizer();
        } else {
            iWrite = contentsAsInt.INSTANCE.write();
        }
        int i = iWrite;
        if (this.read || !calloc.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, findsetterinfo.MediaBrowserCompatCustomActionResultReceiver()) || !contentsAsInt.write(i, write())) {
            this.AudioAttributesImplApi21Parcelizer = contentsAsInt.write(i, contentsAsInt.INSTANCE.IconCompatParcelizer()) ? switchAndReturnNext.Companion.IconCompatParcelizer$default(switchAndReturnNext.INSTANCE, getFactoryMethods.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.getRead()), 0, 2, null) : null;
            this.MediaBrowserCompatSearchResultReceiver = Float.intBitsToFloat((int) (findsetterinfo.MediaBrowserCompatCustomActionResultReceiver() >> 32)) / Float.intBitsToFloat((int) (AudioAttributesImplBaseParcelizer() >> 32));
            this.MediaDescriptionCompat = Float.intBitsToFloat((int) findsetterinfo.MediaBrowserCompatCustomActionResultReceiver()) / Float.intBitsToFloat((int) AudioAttributesImplBaseParcelizer());
            long j = -1;
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(i, getKey.read((((long) ((int) Math.ceil(Float.intBitsToFloat((int) (findsetterinfo.MediaBrowserCompatCustomActionResultReceiver() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) findsetterinfo.MediaBrowserCompatCustomActionResultReceiver())))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), findsetterinfo, findsetterinfo.RemoteActionCompatParcelizer(), this.MediaMetadataCompat);
            this.read = false;
            this.AudioAttributesImplBaseParcelizer = findsetterinfo.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (switchandreturnnext != null) {
            switchandreturnnext2 = switchandreturnnext;
        } else if (read() != null) {
            switchandreturnnext2 = read();
        } else {
            switchandreturnnext2 = this.AudioAttributesImplApi21Parcelizer;
        }
        this.IconCompatParcelizer.write(findsetterinfo, f, switchandreturnnext2);
    }

    @Override // kotlin.getConstructorsWithMode
    public final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo) {
        IconCompatParcelizer(findsetterinfo, 1.0f, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.write);
        sb.append("\n\tviewportWidth: ");
        sb.append(Float.intBitsToFloat((int) (AudioAttributesImplBaseParcelizer() >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) AudioAttributesImplBaseParcelizer()));
        sb.append("\n");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}
