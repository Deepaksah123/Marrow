package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/ApicFrame;", "p0", "Lo/checkSelfPermission;", "p1", "Lo/getAudioSessionId;", "read", "(Lo/ApicFrame;Lo/checkSelfPermission;)Lo/getAudioSessionId;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AppInfoTable {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\t\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e"}, d2 = {"Lo/AppInfoTable$write;", "Lo/getAudioSessionId;", "Lo/checkSelfPermission;", "", "p0", "p1", "", "write", "(II)V", "read", "(II)I", "", "IconCompatParcelizer", "(F)F", "()I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements getAudioSessionId {
        final /* synthetic */ ApicFrame IconCompatParcelizer;
        private final /* synthetic */ checkSelfPermission write;

        write(checkSelfPermission checkselfpermission, ApicFrame apicFrame) {
            this.IconCompatParcelizer = apicFrame;
            this.write = checkselfpermission;
        }

        @Override // kotlin.getAudioSessionId
        public final int write() {
            return this.IconCompatParcelizer.getAudioAttributesImplBaseParcelizer();
        }

        @Override // kotlin.getAudioSessionId
        public final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer.getAudioAttributesImplApi21Parcelizer();
        }

        @Override // kotlin.getAudioSessionId
        public final int IconCompatParcelizer() {
            return ((createPeriod) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RatingCompat())).getWrite();
        }

        @Override // kotlin.getAudioSessionId
        public final int AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer.write();
        }

        @Override // kotlin.getAudioSessionId
        public final void write(int p0, int p1) {
            this.IconCompatParcelizer.read(p0, p1 / this.IconCompatParcelizer.onPause(), true);
        }

        @Override // kotlin.getAudioSessionId
        public final int read(int p0, int p1) {
            return (int) (getQues.AudioAttributesCompatParcelizer(EventMessage.AudioAttributesCompatParcelizer(this.IconCompatParcelizer) + ((long) getOnline.RemoteActionCompatParcelizer((((p0 - this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer()) * this.IconCompatParcelizer.onPause()) - (this.IconCompatParcelizer.MediaDescriptionCompat() * this.IconCompatParcelizer.onPause())) + p1)), this.IconCompatParcelizer.getMediaBrowserCompatItemReceiver(), this.IconCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver()) - EventMessage.AudioAttributesCompatParcelizer(this.IconCompatParcelizer));
        }

        @Override // kotlin.checkSelfPermission
        public final float IconCompatParcelizer(float p0) {
            return this.write.IconCompatParcelizer(p0);
        }
    }

    public static final getAudioSessionId read(ApicFrame apicFrame, checkSelfPermission checkselfpermission) {
        return new write(checkselfpermission, apicFrame);
    }
}
