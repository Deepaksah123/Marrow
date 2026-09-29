package kotlin;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _getCalendar extends SimpleDeserializers<withLocale, setLenient, parseAsRFC1123> implements parseAsISO8601 {
    private final String AudioAttributesCompatParcelizer;

    protected abstract isLenient read(byte[] bArr, int i, boolean z) throws parseAsRFC1123;

    @Override // kotlin.parseAsISO8601
    public final void write(long j) {
    }

    @Override // kotlin.SimpleDeserializers
    public final /* synthetic */ SimpleModule IconCompatParcelizer(Throwable th) {
        return AudioAttributesCompatParcelizer(th);
    }

    @Override // kotlin.SimpleDeserializers
    public final /* synthetic */ _find RemoteActionCompatParcelizer() {
        return MediaBrowserCompatCustomActionResultReceiver();
    }

    public _getCalendar(String str) {
        super(new withLocale[2], new setLenient[2]);
        this.AudioAttributesCompatParcelizer = str;
        AudioAttributesImplBaseParcelizer();
    }

    private static withLocale MediaBrowserCompatCustomActionResultReceiver() {
        return new withLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.SimpleDeserializers
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public setLenient AudioAttributesImplApi26Parcelizer() {
        return new setLenient() { // from class: o._getCalendar.1
            @Override // kotlin.SimpleAbstractTypeResolver
            public final void MediaBrowserCompatCustomActionResultReceiver() {
                _getCalendar.this.IconCompatParcelizer(this);
            }
        };
    }

    private static parseAsRFC1123 AudioAttributesCompatParcelizer(Throwable th) {
        return new parseAsRFC1123("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.SimpleDeserializers
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public parseAsRFC1123 AudioAttributesCompatParcelizer(withLocale withlocale, setLenient setlenient, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) buildTypeSerializer.IconCompatParcelizer(withlocale.read);
            setlenient.read(withlocale.RemoteActionCompatParcelizer, read(byteBuffer.array(), byteBuffer.limit(), z), withlocale.AudioAttributesImplApi21Parcelizer);
            ((SimpleAbstractTypeResolver) setlenient).AudioAttributesCompatParcelizer = false;
            return null;
        } catch (parseAsRFC1123 e) {
            return e;
        }
    }
}
