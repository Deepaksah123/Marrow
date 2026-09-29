package kotlin;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\nH$¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\bJ\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\bJ\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0018H$¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u001c\u0010\u001e\u001a\u00020\u001d8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001c\u0010\f\u001a\u00020\u001d8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u001f\"\u0004\b\u000f\u0010!R\"\u0010\u0013\u001a\u00020\u001d8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b\"\u0010 \"\u0004\b\u0013\u0010!R\u001c\u0010\u000f\u001a\u00020\u001d8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\f\u0010\u001f\"\u0004\b\u001e\u0010!R\u001c\u0010\u0016\u001a\u00020\u001d8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001f\"\u0004\b\f\u0010!R\u001c\u0010\u0007\u001a\u00020\u001d8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\"\u0010\u001f\"\u0004\b\u0019\u0010!R\u0014\u0010\u0015\u001a\u00020\u001d8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010 R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001d8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010 R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t*\u00020\u000e8%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010&\u0082\u0001\u0002()"}, d2 = {"Lo/properties;", "", "Lo/KeyDeserializer;", "p0", "<init>", "(Lo/KeyDeserializer;)V", "", "MediaBrowserCompatCustomActionResultReceiver", "()V", "", "Lo/weirdNumberException;", "", "read", "()Ljava/util/Map;", "Lo/_bindAndClose;", "write", "(Lo/_bindAndClose;Lo/weirdNumberException;)I", "p1", "p2", "RemoteActionCompatParcelizer", "(Lo/weirdNumberException;ILo/_bindAndClose;)V", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/getReferencedType;", "AudioAttributesCompatParcelizer", "(Lo/_bindAndClose;J)J", "Lo/KeyDeserializer;", "()Lo/KeyDeserializer;", "", "IconCompatParcelizer", "Z", "()Z", "(Z)V", "MediaBrowserCompatItemReceiver", "", "Ljava/util/Map;", "MediaBrowserCompatMediaItem", "(Lo/_bindAndClose;)Ljava/util/Map;", "MediaBrowserCompatSearchResultReceiver", "Lo/_writeValueAndClose;", "Lo/defaultClassIntrospector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class properties {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Map<weirdNumberException, Integer> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean read;
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private KeyDeserializer AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final KeyDeserializer AudioAttributesCompatParcelizer;

    protected abstract long AudioAttributesCompatParcelizer(_bindAndClose _bindandclose, long j);

    protected abstract Map<weirdNumberException, Integer> AudioAttributesCompatParcelizer(_bindAndClose _bindandclose);

    protected abstract int write(_bindAndClose _bindandclose, weirdNumberException weirdnumberexception);

    private properties(KeyDeserializer keyDeserializer) {
        this.AudioAttributesCompatParcelizer = keyDeserializer;
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompatMediaItem = new HashMap();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final KeyDeserializer getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void write(boolean z) {
        this.read = z;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.write = z;
    }

    public final void read(boolean z) {
        this.AudioAttributesImplBaseParcelizer = z;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    public final boolean write() {
        return this.read || this.write || this.AudioAttributesImplBaseParcelizer || this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        MediaBrowserCompatCustomActionResultReceiver();
        return this.AudioAttributesImplApi21Parcelizer != null;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        KeyDeserializer keyDeserializer;
        properties propertiesVarIconCompatParcelizer;
        properties propertiesVarIconCompatParcelizer2;
        if (write()) {
            keyDeserializer = this.AudioAttributesCompatParcelizer;
        } else {
            KeyDeserializer keyDeserializerAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            if (keyDeserializerAudioAttributesCompatParcelizer == null) {
                return;
            }
            keyDeserializer = keyDeserializerAudioAttributesCompatParcelizer.getOnPause().AudioAttributesImplApi21Parcelizer;
            if (keyDeserializer == null || !keyDeserializer.getOnPause().write()) {
                KeyDeserializer keyDeserializer2 = this.AudioAttributesImplApi21Parcelizer;
                if (keyDeserializer2 == null || keyDeserializer2.getOnPause().write()) {
                    return;
                }
                KeyDeserializer keyDeserializerAudioAttributesCompatParcelizer2 = keyDeserializer2.AudioAttributesCompatParcelizer();
                if (keyDeserializerAudioAttributesCompatParcelizer2 != null && (propertiesVarIconCompatParcelizer2 = keyDeserializerAudioAttributesCompatParcelizer2.getOnPause()) != null) {
                    propertiesVarIconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver();
                }
                KeyDeserializer keyDeserializerAudioAttributesCompatParcelizer3 = keyDeserializer2.AudioAttributesCompatParcelizer();
                keyDeserializer = (keyDeserializerAudioAttributesCompatParcelizer3 == null || (propertiesVarIconCompatParcelizer = keyDeserializerAudioAttributesCompatParcelizer3.getOnPause()) == null) ? null : propertiesVarIconCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            }
        }
        this.AudioAttributesImplApi21Parcelizer = keyDeserializer;
    }

    public final Map<weirdNumberException, Integer> read() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: o.properties$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/KeyDeserializer;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/KeyDeserializer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<KeyDeserializer, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(KeyDeserializer keyDeserializer) {
            RemoteActionCompatParcelizer(keyDeserializer);
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer(KeyDeserializer keyDeserializer) {
            if (keyDeserializer.getAudioAttributesImplBaseParcelizer() != Integer.MAX_VALUE) {
                if (keyDeserializer.getOnPause().getIconCompatParcelizer()) {
                    keyDeserializer.MediaBrowserCompatCustomActionResultReceiver();
                }
                Map map = keyDeserializer.getOnPause().MediaBrowserCompatMediaItem;
                properties propertiesVar = properties.this;
                for (Map.Entry entry : map.entrySet()) {
                    propertiesVar.RemoteActionCompatParcelizer((weirdNumberException) entry.getKey(), ((Number) entry.getValue()).intValue(), keyDeserializer.write());
                }
                _bindAndClose audioAttributesImplApi26Parcelizer = keyDeserializer.write().getAudioAttributesImplApi26Parcelizer();
                toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer);
                while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer, properties.this.getAudioAttributesCompatParcelizer().write())) {
                    Set<weirdNumberException> setKeySet = properties.this.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer).keySet();
                    properties propertiesVar2 = properties.this;
                    for (weirdNumberException weirdnumberexception : setKeySet) {
                        propertiesVar2.RemoteActionCompatParcelizer(weirdnumberexception, propertiesVar2.write(audioAttributesImplApi26Parcelizer, weirdnumberexception), audioAttributesImplApi26Parcelizer);
                    }
                    audioAttributesImplApi26Parcelizer = audioAttributesImplApi26Parcelizer.getAudioAttributesImplApi26Parcelizer();
                    toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer);
                }
            }
        }

        AnonymousClass1() {
            super(1);
        }
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.MediaBrowserCompatMediaItem.clear();
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(new AnonymousClass1());
        this.MediaBrowserCompatMediaItem.putAll(AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.write()));
        this.IconCompatParcelizer = false;
    }

    public final void AudioAttributesImplBaseParcelizer() {
        this.IconCompatParcelizer = true;
        this.read = false;
        this.write = false;
        this.RemoteActionCompatParcelizer = false;
        this.AudioAttributesImplBaseParcelizer = false;
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.AudioAttributesImplApi21Parcelizer = null;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.IconCompatParcelizer = true;
        KeyDeserializer keyDeserializerAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        if (keyDeserializerAudioAttributesCompatParcelizer == null) {
            return;
        }
        if (this.read) {
            keyDeserializerAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        } else if (this.write || this.RemoteActionCompatParcelizer) {
            keyDeserializerAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }
        if (this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }
        keyDeserializerAudioAttributesCompatParcelizer.getOnPause().AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(weirdNumberException p0, int p1, _bindAndClose p2) {
        float fIntBitsToFloat;
        float f = p1;
        long j = -1;
        long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        _bindAndClose audioAttributesImplApi26Parcelizer = p2;
        while (true) {
            jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer, jAudioAttributesCompatParcelizer);
            audioAttributesImplApi26Parcelizer = audioAttributesImplApi26Parcelizer.getAudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer.write())) {
                break;
            }
            if (AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer).containsKey(p0)) {
                float fWrite = write(audioAttributesImplApi26Parcelizer, p0);
                long j2 = -1;
                jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fWrite)) << 32) | (((long) Float.floatToRawIntBits(fWrite)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
            }
        }
        if (p0 instanceof getInterfaces) {
            fIntBitsToFloat = Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer);
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (jAudioAttributesCompatParcelizer >> 32));
        }
        int iRound = Math.round(fIntBitsToFloat);
        Map<weirdNumberException, Integer> map = this.MediaBrowserCompatMediaItem;
        if (map.containsKey(p0)) {
            iRound = wrongTokenException.write(p0, ((Number) VideoTimelineResponseBody.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem, p0)).intValue(), iRound);
        }
        map.put(p0, Integer.valueOf(iRound));
    }

    public /* synthetic */ properties(KeyDeserializer keyDeserializer, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(keyDeserializer);
    }
}
