package kotlin;

import java.util.Arrays;
import kotlin.JavaBigIntegerFromCharSequence;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BG\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0013J!\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u0012\u0010\u0018R\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0019\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\u001c\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lo/squareInto;", "T", "Lo/JavaDoubleBitsFromCharSequence;", "Lo/allocReadIOBuffer;", "Lo/parseManyDecDigits;", "", "p0", "Lo/JavaBigIntegerFromCharSequence;", "p1", "", "p2", "p3", "", "p4", "<init>", "(Lo/parseManyDecDigits;Lo/JavaBigIntegerFromCharSequence;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "", "AudioAttributesCompatParcelizer", "read", "()V", "", "(Ljava/lang/Object;)Z", "o_", "IconCompatParcelizer", "([Ljava/lang/Object;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Lo/parseManyDecDigits;", "Lo/JavaBigIntegerFromCharSequence;", "write", "Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/Object;", "[Ljava/lang/Object;", "Lo/JavaBigIntegerFromCharSequence$read;", "Lo/JavaBigIntegerFromCharSequence$read;", "AudioAttributesImplApi26Parcelizer", "Lkotlin/Function0;", "AudioAttributesImplApi21Parcelizer", "Lo/getCreatedOnDateMs;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class squareInto<T> implements JavaDoubleBitsFromCharSequence, allocReadIOBuffer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Object[] write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<Object> AudioAttributesImplBaseParcelizer = new getCreatedOnDateMs() { // from class: o.subtract
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return squareInto.IconCompatParcelizer(this.IconCompatParcelizer);
        }
    };

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private JavaBigIntegerFromCharSequence.read AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private T RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private parseManyDecDigits<T, Object> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private JavaBigIntegerFromCharSequence IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    public squareInto(parseManyDecDigits<T, Object> parsemanydecdigits, JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence, String str, T t, Object[] objArr) {
        this.read = parsemanydecdigits;
        this.IconCompatParcelizer = javaBigIntegerFromCharSequence;
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = t;
        this.write = objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(squareInto squareinto) {
        parseManyDecDigits<T, Object> parsemanydecdigits = squareinto.read;
        squareInto squareinto2 = squareinto;
        T t = squareinto.RemoteActionCompatParcelizer;
        if (t != null) {
            return parsemanydecdigits.AudioAttributesCompatParcelizer(squareinto2, t);
        }
        throw new IllegalArgumentException("Value should be initialized".toString());
    }

    public final void AudioAttributesCompatParcelizer(parseManyDecDigits<T, Object> p0, JavaBigIntegerFromCharSequence p1, String p2, T p3, Object[] p4) {
        boolean z;
        boolean z2 = true;
        if (this.IconCompatParcelizer != p1) {
            this.IconCompatParcelizer = p1;
            z = true;
        } else {
            z = false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) p2)) {
            z2 = z;
        } else {
            this.AudioAttributesCompatParcelizer = p2;
        }
        this.read = p0;
        this.RemoteActionCompatParcelizer = p3;
        this.write = p4;
        JavaBigIntegerFromCharSequence.read readVar = this.AudioAttributesImplApi26Parcelizer;
        if (readVar == null || !z2) {
            return;
        }
        if (readVar != null) {
            readVar.RemoteActionCompatParcelizer();
        }
        this.AudioAttributesImplApi26Parcelizer = null;
        read();
    }

    private final void read() {
        JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence = this.IconCompatParcelizer;
        if (this.AudioAttributesImplApi26Parcelizer != null) {
            StringBuilder sb = new StringBuilder("entry(");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            sb.append(") is not null");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (javaBigIntegerFromCharSequence != null) {
            addTimesI.write(javaBigIntegerFromCharSequence, this.AudioAttributesImplBaseParcelizer.invoke());
            this.AudioAttributesImplApi26Parcelizer = javaBigIntegerFromCharSequence.read(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
        }
    }

    @Override // kotlin.JavaDoubleBitsFromCharSequence
    public final boolean AudioAttributesCompatParcelizer(Object p0) {
        JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence = this.IconCompatParcelizer;
        return javaBigIntegerFromCharSequence == null || javaBigIntegerFromCharSequence.AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.allocReadIOBuffer
    public final void o_() {
        read();
    }

    @Override // kotlin.allocReadIOBuffer
    public final void IconCompatParcelizer() {
        JavaBigIntegerFromCharSequence.read readVar = this.AudioAttributesImplApi26Parcelizer;
        if (readVar != null) {
            readVar.RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.allocReadIOBuffer
    public final void AudioAttributesCompatParcelizer() {
        JavaBigIntegerFromCharSequence.read readVar = this.AudioAttributesImplApi26Parcelizer;
        if (readVar != null) {
            readVar.RemoteActionCompatParcelizer();
        }
    }

    public final T read(Object[] p0) {
        if (Arrays.equals(p0, this.write)) {
            return this.RemoteActionCompatParcelizer;
        }
        return null;
    }
}
