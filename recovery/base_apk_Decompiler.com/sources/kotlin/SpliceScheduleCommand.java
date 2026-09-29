package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000b\u001a\u00020\u000e8\u0017X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/SpliceScheduleCommand;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/SlowMotionData;", "p0", "<init>", "(Lo/SlowMotionData;)V", "", "c_", "()V", "write", "MediaDescriptionCompat", "read", "Lo/SlowMotionData;", "AudioAttributesCompatParcelizer", "", "Z", "AudioAttributesImplBaseParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpliceScheduleCommand extends _handleOddName.IconCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private SlowMotionData AudioAttributesCompatParcelizer;

    public SpliceScheduleCommand(SlowMotionData slowMotionData) {
        this.AudioAttributesCompatParcelizer = slowMotionData;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        write(this.AudioAttributesCompatParcelizer);
    }

    public final void write(SlowMotionData p0) {
        write();
        if (p0 instanceof MotionPhotoMetadata) {
            ((MotionPhotoMetadata) p0).RemoteActionCompatParcelizer().read(this);
        }
        this.AudioAttributesCompatParcelizer = p0;
    }

    private final void write() {
        SlowMotionData slowMotionData = this.AudioAttributesCompatParcelizer;
        if (slowMotionData instanceof MotionPhotoMetadata) {
            toMagicModuleMetaRepoModel.read(slowMotionData, "");
            ((MotionPhotoMetadata) slowMotionData).RemoteActionCompatParcelizer().IconCompatParcelizer(this);
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        write();
    }
}
