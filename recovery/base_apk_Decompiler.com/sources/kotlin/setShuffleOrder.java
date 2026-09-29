package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\t\u0010\u0013J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u000f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0011R\u0011\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0017"}, d2 = {"Lo/setShuffleOrder;", "Lo/DatabindException;", "Lo/ApicFrame;", "p0", "Lo/superDispatchKeyEvent;", "p1", "<init>", "(Lo/ApicFrame;Lo/superDispatchKeyEvent;)V", "Lo/UnsupportedTypeDeserializer;", "IconCompatParcelizer", "(JLo/superDispatchKeyEvent;)J", "Lo/getReferencedType;", "Lo/findCoercionAction;", "read", "(JI)J", "", "AudioAttributesCompatParcelizer", "(J)F", "p2", "(JJI)J", "(JJLo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Lo/ApicFrame;", "Lo/superDispatchKeyEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setShuffleOrder implements DatabindException {
    private final superDispatchKeyEvent IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ApicFrame read;

    public setShuffleOrder(ApicFrame apicFrame, superDispatchKeyEvent superdispatchkeyevent) {
        this.read = apicFrame;
        this.IconCompatParcelizer = superdispatchkeyevent;
    }

    public final long IconCompatParcelizer(long j, superDispatchKeyEvent superdispatchkeyevent) {
        if (superdispatchkeyevent == superDispatchKeyEvent.write) {
            return UnsupportedTypeDeserializer.write$default(j, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);
        }
        return UnsupportedTypeDeserializer.write$default(j, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1, null);
    }

    @Override // kotlin.DatabindException
    public final long read(long p0, int p1) {
        if (findCoercionAction.IconCompatParcelizer(p1, findCoercionAction.INSTANCE.AudioAttributesCompatParcelizer()) && Math.abs(this.read.MediaDescriptionCompat()) > 1.0E-6d && Math.abs(AudioAttributesCompatParcelizer(p0)) > BitmapDescriptorFactory.HUE_RED) {
            float fMediaDescriptionCompat = this.read.MediaDescriptionCompat() * this.read.onFastForward();
            float audioAttributesCompatParcelizer = ((this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getAudioAttributesCompatParcelizer() + this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getRemoteActionCompatParcelizer()) * (-Math.signum(this.read.MediaDescriptionCompat()))) + fMediaDescriptionCompat;
            if (this.read.MediaDescriptionCompat() > BitmapDescriptorFactory.HUE_RED) {
                audioAttributesCompatParcelizer = fMediaDescriptionCompat;
                fMediaDescriptionCompat = audioAttributesCompatParcelizer;
            }
            float fIntBitsToFloat = -this.read.RemoteActionCompatParcelizer(-getQues.read(AudioAttributesCompatParcelizer(p0), fMediaDescriptionCompat, audioAttributesCompatParcelizer));
            float fIntBitsToFloat2 = this.IconCompatParcelizer == superDispatchKeyEvent.AudioAttributesCompatParcelizer ? fIntBitsToFloat : Float.intBitsToFloat((int) (p0 >> 32));
            if (this.IconCompatParcelizer != superDispatchKeyEvent.write) {
                long j = -1;
                fIntBitsToFloat = Float.intBitsToFloat((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & p0));
            }
            return getReferencedType.read(p0, fIntBitsToFloat2, fIntBitsToFloat);
        }
        return getReferencedType.INSTANCE.write();
    }

    private final float AudioAttributesCompatParcelizer(long j) {
        long j2;
        if (this.IconCompatParcelizer == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            j2 = j >> 32;
        } else {
            long j3 = -1;
            j2 = j & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)));
        }
        return Float.intBitsToFloat((int) j2);
    }

    @Override // kotlin.DatabindException
    public final long IconCompatParcelizer(long p0, long p1, int p2) {
        if (findCoercionAction.IconCompatParcelizer(p2, findCoercionAction.INSTANCE.write()) && RemoteActionCompatParcelizer(p1) != BitmapDescriptorFactory.HUE_RED) {
            throw new CancellationException("Scroll cancelled");
        }
        return getReferencedType.INSTANCE.write();
    }

    @Override // kotlin.DatabindException
    public final Object IconCompatParcelizer(long j, long j2, SampleVideos<? super UnsupportedTypeDeserializer> sampleVideos) {
        return UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(IconCompatParcelizer(j2, this.IconCompatParcelizer));
    }

    private final float RemoteActionCompatParcelizer(long j) {
        long j2;
        if (this.IconCompatParcelizer == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            j2 = j >> 32;
        } else {
            long j3 = -1;
            j2 = j & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)));
        }
        return Float.intBitsToFloat((int) j2);
    }
}
