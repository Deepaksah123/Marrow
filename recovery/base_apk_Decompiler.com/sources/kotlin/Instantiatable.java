package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0010\u0011"}, d2 = {"Lo/Instantiatable;", "", "<init>", "()V", "Lo/calloc;", "p0", "Lo/releaseBuffers;", "p1", "", "p2", "", "RemoteActionCompatParcelizer", "(JLo/releaseBuffers;F)V", "IconCompatParcelizer", "J", "write", "Lo/throwInternal;", "Lo/_hasOneOf;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Instantiatable {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    public abstract void RemoteActionCompatParcelizer(long p0, releaseBuffers p1, float p2);

    private Instantiatable() {
        this.write = calloc.INSTANCE.IconCompatParcelizer();
    }

    public /* synthetic */ Instantiatable(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    /* JADX INFO: renamed from: o.Instantiatable$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0010\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0011"}, d2 = {"Lo/Instantiatable$write;", "", "<init>", "()V", "", "Lo/switchToNext;", "p0", "Lo/getReferencedType;", "p1", "p2", "Lo/findContentSerializer;", "p3", "Lo/Instantiatable;", "AudioAttributesCompatParcelizer", "(Ljava/util/List;JJI)Lo/Instantiatable;", "", "write", "(Ljava/util/List;FFI)Lo/Instantiatable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Instantiatable AudioAttributesCompatParcelizer(List<switchToNext> p0, long p1, long p2, int p3) {
            return new contentsAsLong(p0, null, p1, p2, p3, null);
        }

        public static /* synthetic */ Instantiatable write$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = findContentSerializer.INSTANCE.AudioAttributesCompatParcelizer();
            }
            return companion.write(list, f, f2, i);
        }

        public static /* synthetic */ Instantiatable AudioAttributesCompatParcelizer$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = findContentSerializer.INSTANCE.AudioAttributesCompatParcelizer();
            }
            return companion.AudioAttributesCompatParcelizer((List<switchToNext>) list, f, f2, i);
        }

        public final Instantiatable write(List<switchToNext> p0, float p1, float p2, int p3) {
            long j = -1;
            long j2 = -1;
            return AudioAttributesCompatParcelizer(p0, getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(p1)) << 32) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(p2)) << 32) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))))), p3);
        }

        public final Instantiatable AudioAttributesCompatParcelizer(List<switchToNext> p0, float p1, float p2, int p3) {
            long j = -1;
            long j2 = -1;
            return AudioAttributesCompatParcelizer(p0, getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(p1)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(p2)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))))), p3);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
