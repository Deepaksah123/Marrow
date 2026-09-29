package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\t\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/findDeserializationContentConverter;", "", "", "p0", "<init>", "([F)V", "AudioAttributesImplBaseParcelizer", "[F", "IconCompatParcelizer", "()[F", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class findDeserializationContentConverter {

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final float[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int RemoteActionCompatParcelizer = 8;
    private static final findDeserializationContentConverter IconCompatParcelizer = new RemoteActionCompatParcelizer(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    private static final findDeserializationContentConverter write = new IconCompatParcelizer(new float[]{0.40024f, -0.2263f, BitmapDescriptorFactory.HUE_RED, 0.7076f, 1.16532f, BitmapDescriptorFactory.HUE_RED, -0.08081f, 0.0457f, 0.91822f});
    private static final findDeserializationContentConverter read = new write(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: o.findDeserializationContentConverter$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lo/findDeserializationContentConverter$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/findDeserializationContentConverter;", "IconCompatParcelizer", "Lo/findDeserializationContentConverter;", "AudioAttributesCompatParcelizer", "()Lo/findDeserializationContentConverter;", "read", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final findDeserializationContentConverter AudioAttributesCompatParcelizer() {
            return findDeserializationContentConverter.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private findDeserializationContentConverter(float[] fArr) {
        this.RemoteActionCompatParcelizer = fArr;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final float[] getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/findDeserializationContentConverter$RemoteActionCompatParcelizer;", "Lo/findDeserializationContentConverter;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends findDeserializationContentConverter {
        RemoteActionCompatParcelizer(float[] fArr) {
            super(fArr, null);
        }

        public final String toString() {
            return "Bradford";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/findDeserializationContentConverter$IconCompatParcelizer;", "Lo/findDeserializationContentConverter;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer extends findDeserializationContentConverter {
        IconCompatParcelizer(float[] fArr) {
            super(fArr, null);
        }

        public final String toString() {
            return "VonKries";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/findDeserializationContentConverter$write;", "Lo/findDeserializationContentConverter;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends findDeserializationContentConverter {
        write(float[] fArr) {
            super(fArr, null);
        }

        public final String toString() {
            return "Ciecat02";
        }
    }

    public /* synthetic */ findDeserializationContentConverter(float[] fArr, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(fArr);
    }
}
