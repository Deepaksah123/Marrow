package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/getBase64Variant;", "", "<init>", "()V", "Lo/getAnnotationIntrospector;", "p0", "Lo/handleWeirdKey;", "p1", "Lo/introspectForBuilder;", "RemoteActionCompatParcelizer", "(Lo/getAnnotationIntrospector;Lo/handleWeirdKey;)Lo/introspectForBuilder;", "", "IconCompatParcelizer", "Lo/setPresenter;", "Lo/getBase64Variant$AudioAttributesCompatParcelizer;", "read", "Lo/setPresenter;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getBase64Variant {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setPresenter<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer = new setPresenter<>(0, 1, null);

    public final introspectForBuilder RemoteActionCompatParcelizer(getAnnotationIntrospector p0, handleWeirdKey p1) {
        long read;
        boolean write;
        long jIconCompatParcelizer;
        setPresenter setpresenter = new setPresenter(p0.AudioAttributesCompatParcelizer().size());
        List<findRootValueDeserializer> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
        int size = listAudioAttributesCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            findRootValueDeserializer findrootvaluedeserializer = listAudioAttributesCompatParcelizer.get(i);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(findrootvaluedeserializer.getIconCompatParcelizer());
            if (audioAttributesCompatParcelizerIconCompatParcelizer == null) {
                read = findrootvaluedeserializer.getRead();
                jIconCompatParcelizer = findrootvaluedeserializer.getWrite();
                write = false;
            } else {
                long remoteActionCompatParcelizer = audioAttributesCompatParcelizerIconCompatParcelizer.getRemoteActionCompatParcelizer();
                read = remoteActionCompatParcelizer;
                write = audioAttributesCompatParcelizerIconCompatParcelizer.getWrite();
                jIconCompatParcelizer = p1.IconCompatParcelizer(audioAttributesCompatParcelizerIconCompatParcelizer.getAudioAttributesCompatParcelizer());
            }
            setpresenter.write(findrootvaluedeserializer.getIconCompatParcelizer(), new getArrayBuilders(findrootvaluedeserializer.getIconCompatParcelizer(), findrootvaluedeserializer.getRead(), findrootvaluedeserializer.getWrite(), findrootvaluedeserializer.getAudioAttributesCompatParcelizer(), findrootvaluedeserializer.getMediaBrowserCompatItemReceiver(), read, jIconCompatParcelizer, write, false, findrootvaluedeserializer.getMediaBrowserCompatCustomActionResultReceiver(), findrootvaluedeserializer.AudioAttributesCompatParcelizer(), findrootvaluedeserializer.getAudioAttributesImplApi21Parcelizer(), findrootvaluedeserializer.getMediaBrowserCompatSearchResultReceiver(), null));
            if (findrootvaluedeserializer.getAudioAttributesCompatParcelizer()) {
                this.AudioAttributesCompatParcelizer.write(findrootvaluedeserializer.getIconCompatParcelizer(), new AudioAttributesCompatParcelizer(findrootvaluedeserializer.getRead(), findrootvaluedeserializer.getRemoteActionCompatParcelizer(), findrootvaluedeserializer.getAudioAttributesCompatParcelizer(), null));
            } else {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(findrootvaluedeserializer.getIconCompatParcelizer());
            }
        }
        return new introspectForBuilder(setpresenter, p0);
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/getBase64Variant$AudioAttributesCompatParcelizer;", "", "", "p0", "Lo/getReferencedType;", "p1", "", "p2", "<init>", "(JJZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "J", "AudioAttributesCompatParcelizer", "()J", "RemoteActionCompatParcelizer", "Z", "IconCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final boolean write;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final long AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final long RemoteActionCompatParcelizer;

        private AudioAttributesCompatParcelizer(long j, long j2, boolean z) {
            this.RemoteActionCompatParcelizer = j;
            this.AudioAttributesCompatParcelizer = j2;
            this.write = z;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final long getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final long getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(long j, long j2, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(j, j2, z);
        }
    }
}
