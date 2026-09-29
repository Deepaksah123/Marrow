package kotlin;

import kotlin.Metadata;
import kotlin.hexToChar;
import kotlin.tryToParseEightHexDigits;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\r\u0014B3\u0012\"\u0010\u0007\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/square;", "Lo/FastDoubleMath;", "Lo/getTokenColumnNr;", "", "Lo/_leading3;", "Lo/hexToChar;", "Lo/tryToParseEightHexDigits;", "p0", "", "p1", "<init>", "(Lo/tryToParseEightHexDigits;I)V", "T", "write", "(Lo/getTokenColumnNr;)Ljava/lang/Object;", "read", "(Lo/getTokenColumnNr;Lo/_leading3;)Lo/hexToChar;", "Lo/square$write;", "RatingCompat", "()Lo/square$write;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class square extends FastDoubleMath<getTokenColumnNr<Object>, _leading3<Object>> implements hexToChar {
    private static final square MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int RemoteActionCompatParcelizer = 8;

    public square(tryToParseEightHexDigits<getTokenColumnNr<Object>, _leading3<Object>> trytoparseeighthexdigits, int i) {
        super(trytoparseeighthexdigits, i);
    }

    public final _leading3<Object> AudioAttributesCompatParcelizer(getTokenColumnNr<Object> gettokencolumnnr, _leading3<Object> _leading3Var) {
        return (_leading3) super.getOrDefault(gettokencolumnnr, _leading3Var);
    }

    public final boolean AudioAttributesCompatParcelizer(getTokenColumnNr<Object> gettokencolumnnr) {
        return super.containsKey(gettokencolumnnr);
    }

    public final _leading3<Object> IconCompatParcelizer(getTokenColumnNr<Object> gettokencolumnnr) {
        return (_leading3) super.get(gettokencolumnnr);
    }

    public final boolean RemoteActionCompatParcelizer(_leading3<Object> _leading3Var) {
        return super.containsValue(_leading3Var);
    }

    @Override // kotlin.FastDoubleMath, kotlin.setSmallButtonText, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof getTokenColumnNr) {
            return AudioAttributesCompatParcelizer((getTokenColumnNr) obj);
        }
        return false;
    }

    @Override // kotlin.setSmallButtonText, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof _leading3) {
            return RemoteActionCompatParcelizer((_leading3<Object>) obj);
        }
        return false;
    }

    @Override // kotlin.FastDoubleMath, kotlin.setSmallButtonText, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj instanceof getTokenColumnNr) {
            return IconCompatParcelizer((getTokenColumnNr<Object>) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof getTokenColumnNr) ? obj2 : AudioAttributesCompatParcelizer((getTokenColumnNr<Object>) obj, (_leading3<Object>) obj2);
    }

    @Override // kotlin._getCharDesc
    public final <T> T write(getTokenColumnNr<T> p0) {
        return (T) resetInt.read(this, p0);
    }

    @Override // kotlin.hexToChar
    public final hexToChar read(getTokenColumnNr<Object> p0, _leading3<Object> p1) {
        tryToParseEightHexDigits.RemoteActionCompatParcelizer<getTokenColumnNr<Object>, _leading3<Object>> remoteActionCompatParcelizerIconCompatParcelizer = AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(p0.hashCode(), p0, p1, 0);
        return remoteActionCompatParcelizerIconCompatParcelizer == null ? this : new square(remoteActionCompatParcelizerIconCompatParcelizer.write(), size() + remoteActionCompatParcelizerIconCompatParcelizer.getWrite());
    }

    @Override // kotlin.hexToChar
    /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
    public final write IconCompatParcelizer() {
        return new write(this);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00068\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lo/square$write;", "Lo/toBigInteger;", "Lo/getTokenColumnNr;", "", "Lo/_leading3;", "Lo/hexToChar$write;", "Lo/square;", "p0", "<init>", "(Lo/square;)V", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/square;", "write", "Lo/square;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends toBigInteger<getTokenColumnNr<Object>, _leading3<Object>> implements hexToChar.write {
        public square write;

        public final boolean AudioAttributesCompatParcelizer(getTokenColumnNr<Object> gettokencolumnnr) {
            return super.containsKey(gettokencolumnnr);
        }

        public final _leading3<Object> RemoteActionCompatParcelizer(getTokenColumnNr<Object> gettokencolumnnr) {
            return (_leading3) super.remove(gettokencolumnnr);
        }

        @Override // kotlin.toBigInteger, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            if (obj instanceof getTokenColumnNr) {
                return AudioAttributesCompatParcelizer((getTokenColumnNr<Object>) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsValue(Object obj) {
            if (obj instanceof _leading3) {
                return write((_leading3<Object>) obj);
            }
            return false;
        }

        @Override // kotlin.toBigInteger, java.util.AbstractMap, java.util.Map
        public final /* synthetic */ Object get(Object obj) {
            if (obj instanceof getTokenColumnNr) {
                return write((getTokenColumnNr<Object>) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof getTokenColumnNr) ? obj2 : read((getTokenColumnNr) obj, (_leading3) obj2);
        }

        public final _leading3<Object> read(getTokenColumnNr<Object> gettokencolumnnr, _leading3<Object> _leading3Var) {
            return (_leading3) super.getOrDefault(gettokencolumnnr, _leading3Var);
        }

        @Override // kotlin.toBigInteger, java.util.AbstractMap, java.util.Map
        public final /* synthetic */ Object remove(Object obj) {
            if (obj instanceof getTokenColumnNr) {
                return RemoteActionCompatParcelizer((getTokenColumnNr<Object>) obj);
            }
            return null;
        }

        public final _leading3<Object> write(getTokenColumnNr<Object> gettokencolumnnr) {
            return (_leading3) super.get(gettokencolumnnr);
        }

        public final boolean write(_leading3<Object> _leading3Var) {
            return super.containsValue(_leading3Var);
        }

        public write(square squareVar) {
            super(squareVar);
            this.write = squareVar;
        }

        @Override // o.hexToChar.write
        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final square RemoteActionCompatParcelizer() {
            square squareVar;
            if (AudioAttributesImplApi21Parcelizer() == this.write.AudioAttributesImplApi26Parcelizer()) {
                squareVar = this.write;
            } else {
                AudioAttributesCompatParcelizer(new estimateNumBits());
                squareVar = new square(AudioAttributesImplApi21Parcelizer(), size());
            }
            this.write = squareVar;
            return squareVar;
        }
    }

    /* JADX INFO: renamed from: o.square$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/square$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/square;", "MediaBrowserCompatItemReceiver", "Lo/square;", "IconCompatParcelizer", "()Lo/square;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final square IconCompatParcelizer() {
            return square.MediaBrowserCompatItemReceiver;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        tryToParseEightHexDigits trytoparseeighthexdigitsIconCompatParcelizer = tryToParseEightHexDigits.INSTANCE.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.read(trytoparseeighthexdigitsIconCompatParcelizer, "");
        MediaBrowserCompatItemReceiver = new square(trytoparseeighthexdigitsIconCompatParcelizer, 0);
    }
}
