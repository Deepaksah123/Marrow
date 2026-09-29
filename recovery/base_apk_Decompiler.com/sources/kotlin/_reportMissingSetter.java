package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \t2\u00020\u0001:\u0002\n\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r"}, d2 = {"Lo/_reportMissingSetter;", "", "", "p0", "<init>", "(Z)V", "AudioAttributesImplBaseParcelizer", "Z", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "Lo/_verifySetter;", "Lo/checkUnresolvedObjectId;", "Lo/_verifyAsClass;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class _reportMissingSetter {

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final _verifyAsClass read = new CreatorProperty();
    private static final DefaultDeserializationContext write = new DefaultDeserializationContext(C.SANS_SERIF_NAME, "FontFamily.SansSerif");
    private static final DefaultDeserializationContext AudioAttributesImplApi21Parcelizer = new DefaultDeserializationContext(C.SERIF_NAME, "FontFamily.Serif");
    private static final DefaultDeserializationContext RemoteActionCompatParcelizer = new DefaultDeserializationContext("monospace", "FontFamily.Monospace");
    private static final DefaultDeserializationContext IconCompatParcelizer = new DefaultDeserializationContext("cursive", "FontFamily.Cursive");

    private _reportMissingSetter(boolean z) {
        this.IconCompatParcelizer = z;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0001\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_reportMissingSetter$write;", "", "Lo/_reportMissingSetter;", "p0", "Lo/getDataStream;", "p1", "Lo/withValueDeserializer;", "p2", "Lo/_findFormat;", "p3", "Lo/parseDouble;", "RemoteActionCompatParcelizer", "(Lo/_reportMissingSetter;Lo/getDataStream;II)Lo/parseDouble;", "Lo/getInjectableValueId;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface write {
        parseDouble<Object> RemoteActionCompatParcelizer(_reportMissingSetter p0, getDataStream p1, int p2, int p3);

        static /* synthetic */ parseDouble RemoteActionCompatParcelizer$default(write writeVar, _reportMissingSetter _reportmissingsetter, getDataStream getdatastream, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i3 & 1) != 0) {
                _reportmissingsetter = null;
            }
            if ((i3 & 2) != 0) {
                getdatastream = getDataStream.INSTANCE.RemoteActionCompatParcelizer();
            }
            if ((i3 & 4) != 0) {
                i = withValueDeserializer.INSTANCE.IconCompatParcelizer();
            }
            if ((i3 & 8) != 0) {
                i2 = _findFormat.INSTANCE.RemoteActionCompatParcelizer();
            }
            return writeVar.RemoteActionCompatParcelizer(_reportmissingsetter, getdatastream, i, i2);
        }
    }

    /* JADX INFO: renamed from: o._reportMissingSetter$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0005\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f"}, d2 = {"Lo/_reportMissingSetter$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/_verifyAsClass;", "read", "Lo/_verifyAsClass;", "IconCompatParcelizer", "()Lo/_verifyAsClass;", "AudioAttributesCompatParcelizer", "Lo/DefaultDeserializationContext;", "write", "Lo/DefaultDeserializationContext;", "()Lo/DefaultDeserializationContext;", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final _verifyAsClass IconCompatParcelizer() {
            return _reportMissingSetter.read;
        }

        public final DefaultDeserializationContext read() {
            return _reportMissingSetter.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ _reportMissingSetter(boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z);
    }
}
