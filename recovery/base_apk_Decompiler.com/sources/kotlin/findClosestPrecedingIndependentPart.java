package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/ApicFrame;", "p0", "", "p1", "Lo/getPauseAtEndOfMediaItems;", "IconCompatParcelizer", "(Lo/ApicFrame;Z)Lo/getPauseAtEndOfMediaItems;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findClosestPrecedingIndependentPart {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000bR\u0014\u0010\b\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Lo/findClosestPrecedingIndependentPart$write;", "Lo/getPauseAtEndOfMediaItems;", "", "p0", "", "RemoteActionCompatParcelizer", "(ILo/SampleVideos;)Ljava/lang/Object;", "Lo/deserializerModifiers;", "AudioAttributesCompatParcelizer", "()Lo/deserializerModifiers;", "", "()F", "IconCompatParcelizer", "write", "()I", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements getPauseAtEndOfMediaItems {
        final /* synthetic */ boolean AudioAttributesCompatParcelizer;
        final /* synthetic */ ApicFrame IconCompatParcelizer;

        write(ApicFrame apicFrame, boolean z) {
            this.IconCompatParcelizer = apicFrame;
            this.AudioAttributesCompatParcelizer = z;
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final float RemoteActionCompatParcelizer() {
            return EventMessage.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final float IconCompatParcelizer() {
            return GeobFrame.RemoteActionCompatParcelizer(this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), this.IconCompatParcelizer.write());
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final Object RemoteActionCompatParcelizer(int i, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer$default = ApicFrame.IconCompatParcelizer$default(this.IconCompatParcelizer, i, BitmapDescriptorFactory.HUE_RED, sampleVideos, 2, null);
            return objIconCompatParcelizer$default == getYear.IconCompatParcelizer() ? objIconCompatParcelizer$default : getShowPopup.INSTANCE;
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final deserializerModifiers AudioAttributesCompatParcelizer() {
            if (this.AudioAttributesCompatParcelizer) {
                return new deserializerModifiers(this.IconCompatParcelizer.write(), 1);
            }
            return new deserializerModifiers(1, this.IconCompatParcelizer.write());
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final int write() {
            long jMediaMetadataCompat;
            if (this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getIconCompatParcelizer() == superDispatchKeyEvent.write) {
                long j = -1;
                jMediaMetadataCompat = this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaMetadataCompat() & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            } else {
                jMediaMetadataCompat = this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().MediaMetadataCompat() >> 32;
            }
            return (int) jMediaMetadataCompat;
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final int read() {
            return this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().read() + this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getRead();
        }
    }

    public static final getPauseAtEndOfMediaItems IconCompatParcelizer(ApicFrame apicFrame, boolean z) {
        return new write(apicFrame, z);
    }
}
