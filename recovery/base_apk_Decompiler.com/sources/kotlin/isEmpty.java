package kotlin;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ1\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000e2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000e2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u0010\u0010\u0013J!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000e2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\t\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00180\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u001e\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b"}, d2 = {"Lo/isEmpty;", "", "Lo/_configureGenerator;", "p0", "<init>", "(Lo/_configureGenerator;)V", "", "RemoteActionCompatParcelizer", "()V", "AudioAttributesCompatParcelizer", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/JsonSerializable;", "p1", "", "Lo/JsonSerializerNone;", "p2", "IconCompatParcelizer", "(Lo/_handleOddName$IconCompatParcelizer;Lo/JsonSerializable;Ljava/util/Set;)V", "read", "(Lo/JsonSerializerNone;Lo/JsonSerializable;)V", "Lo/_configureGenerator;", "Lo/UTF32Reader;", "Lo/UTF32Reader;", "write", "Lo/_assertNotNull;", "AudioAttributesImplApi21Parcelizer", "", "Z", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isEmpty {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final _configureGenerator IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<JsonSerializerNone> write = new UTF32Reader<>(new JsonSerializerNone[16], 0);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final UTF32Reader<JsonSerializable<?>> read = new UTF32Reader<>(new JsonSerializable[16], 0);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<_assertNotNull> AudioAttributesCompatParcelizer = new UTF32Reader<>(new _assertNotNull[16], 0);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final UTF32Reader<JsonSerializable<?>> RemoteActionCompatParcelizer = new UTF32Reader<>(new JsonSerializable[16], 0);

    public isEmpty(_configureGenerator _configuregenerator) {
        this.IconCompatParcelizer = _configuregenerator;
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.IconCompatParcelizer.IconCompatParcelizer(new AnonymousClass2());
    }

    /* JADX INFO: renamed from: o.isEmpty$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        public final void write() {
            isEmpty.this.AudioAttributesCompatParcelizer();
        }

        AnonymousClass2() {
            super(0);
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        HashSet hashSet = new HashSet();
        UTF32Reader<_assertNotNull> uTF32Reader = this.AudioAttributesCompatParcelizer;
        _assertNotNull[] _assertnotnullArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            JsonSerializable<?> jsonSerializable = this.RemoteActionCompatParcelizer.IconCompatParcelizer[i];
            if (_assertnotnull.get_init_lambda2().getAudioAttributesImplApi21Parcelizer().getRatingCompat()) {
                IconCompatParcelizer(_assertnotnull.get_init_lambda2().getAudioAttributesImplApi21Parcelizer(), jsonSerializable, hashSet);
            }
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        UTF32Reader<JsonSerializerNone> uTF32Reader2 = this.write;
        JsonSerializerNone[] jsonSerializerNoneArr = uTF32Reader2.IconCompatParcelizer;
        int audioAttributesCompatParcelizer2 = uTF32Reader2.getAudioAttributesCompatParcelizer();
        for (int i2 = 0; i2 < audioAttributesCompatParcelizer2; i2++) {
            JsonSerializerNone jsonSerializerNone = jsonSerializerNoneArr[i2];
            JsonSerializable<?> jsonSerializable2 = this.read.IconCompatParcelizer[i2];
            if (jsonSerializerNone.getRatingCompat()) {
                IconCompatParcelizer(jsonSerializerNone, jsonSerializable2, hashSet);
            }
        }
        this.write.RemoteActionCompatParcelizer();
        this.read.RemoteActionCompatParcelizer();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((JsonSerializerNone) it.next()).onSetRating();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v8 */
    private final void IconCompatParcelizer(_handleOddName.IconCompatParcelizer p0, JsonSerializable<?> p1, Set<JsonSerializerNone> p2) {
        _handleOddName.IconCompatParcelizer iconCompatParcelizer = p0;
        int iWrite = _bind.write(32);
        if (!iconCompatParcelizer.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitSubtreeIf called on an unattached node");
        }
        UTF32Reader uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = iconCompatParcelizer.getRead().getAudioAttributesImplBaseParcelizer();
        if (audioAttributesImplBaseParcelizer == null) {
            collectLongDefaults.read(uTF32Reader, iconCompatParcelizer.getRead(), false);
        } else {
            uTF32Reader.read(audioAttributesImplBaseParcelizer);
        }
        while (uTF32Reader.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizer2 = (_handleOddName.IconCompatParcelizer) uTF32Reader.RemoteActionCompatParcelizer(uTF32Reader.getAudioAttributesCompatParcelizer() - 1);
            if ((iconCompatParcelizer2.getRemoteActionCompatParcelizer() & iWrite) != 0) {
                for (_handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer2 = iconCompatParcelizer2; audioAttributesImplBaseParcelizer2 != null && audioAttributesImplBaseParcelizer2.getRatingCompat(); audioAttributesImplBaseParcelizer2 = audioAttributesImplBaseParcelizer2.getAudioAttributesImplBaseParcelizer()) {
                    if ((audioAttributesImplBaseParcelizer2.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = audioAttributesImplBaseParcelizer2;
                        UTF32Reader uTF32Reader2 = null;
                        while (iconCompatParcelizerWrite != 0) {
                            if (iconCompatParcelizerWrite instanceof JsonSerializer) {
                                JsonSerializer jsonSerializer = (JsonSerializer) iconCompatParcelizerWrite;
                                if (jsonSerializer instanceof JsonSerializerNone) {
                                    JsonSerializerNone jsonSerializerNone = (JsonSerializerNone) jsonSerializer;
                                    if ((jsonSerializerNone.getRead() instanceof serializeWithType) && jsonSerializerNone.MediaMetadataCompat().contains(p1)) {
                                        p2.add(jsonSerializer);
                                    }
                                }
                                if (jsonSerializer.RatingCompat().write(p1)) {
                                    break;
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizer3 = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                int i = 0;
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                while (iconCompatParcelizer3 != null) {
                                    if ((iconCompatParcelizer3.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizer3;
                                        } else {
                                            if (uTF32Reader2 == null) {
                                                uTF32Reader2 = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != 0) {
                                                if (uTF32Reader2 != null) {
                                                    uTF32Reader2.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = 0;
                                            }
                                            if (uTF32Reader2 != null) {
                                                uTF32Reader2.read(iconCompatParcelizer3);
                                            }
                                        }
                                    }
                                    iconCompatParcelizer3 = iconCompatParcelizer3.getAudioAttributesImplBaseParcelizer();
                                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader2);
                        }
                    }
                }
            }
            collectLongDefaults.read(uTF32Reader, iconCompatParcelizer2, false);
        }
    }

    public final void read(JsonSerializerNone p0, JsonSerializable<?> p1) {
        this.write.read(p0);
        this.read.read(p1);
        RemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer(JsonSerializerNone p0, JsonSerializable<?> p1) {
        this.write.read(p0);
        this.read.read(p1);
        RemoteActionCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(JsonSerializerNone p0, JsonSerializable<?> p1) {
        this.AudioAttributesCompatParcelizer.read(collectLongDefaults.AudioAttributesImplApi26Parcelizer(p0));
        this.RemoteActionCompatParcelizer.read(p1);
        RemoteActionCompatParcelizer();
    }
}
