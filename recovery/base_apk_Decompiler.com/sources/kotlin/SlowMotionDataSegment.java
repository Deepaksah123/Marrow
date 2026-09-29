package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/SlowMotionDataSegment;", "Lo/writerFor;", "Lo/SpliceScheduleCommand;", "Lo/SlowMotionData;", "p0", "<init>", "(Lo/SlowMotionData;)V", "AudioAttributesCompatParcelizer", "()Lo/SpliceScheduleCommand;", "", "read", "(Lo/SpliceScheduleCommand;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "RemoteActionCompatParcelizer", "Lo/SlowMotionData;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SlowMotionDataSegment extends writerFor<SpliceScheduleCommand> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final SlowMotionData write;

    public SlowMotionDataSegment(SlowMotionData slowMotionData) {
        this.write = slowMotionData;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final SpliceScheduleCommand IconCompatParcelizer() {
        return new SpliceScheduleCommand(this.write);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(SpliceScheduleCommand p0) {
        p0.write(this.write);
    }

    public final boolean equals(Object p0) {
        if (this != p0) {
            return (p0 instanceof SlowMotionDataSegment) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, ((SlowMotionDataSegment) p0).write);
        }
        return true;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }
}
