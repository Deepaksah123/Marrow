package kotlin;

import android.text.SegmentFinder;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/_findUnsupportedTypeDeserializer;", "", "<init>", "()V", "Lo/buildBuilderBasedDeserializer;", "Landroid/text/SegmentFinder;", "ch_", "(Lo/buildBuilderBasedDeserializer;)Landroid/text/SegmentFinder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _findUnsupportedTypeDeserializer {
    public static final _findUnsupportedTypeDeserializer INSTANCE = new _findUnsupportedTypeDeserializer();

    private _findUnsupportedTypeDeserializer() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0005"}, d2 = {"Lo/_findUnsupportedTypeDeserializer$write;", "Landroid/text/SegmentFinder;", "", "p0", "previousStartBoundary", "(I)I", "previousEndBoundary", "nextStartBoundary", "nextEndBoundary"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends SegmentFinder {
        final /* synthetic */ buildBuilderBasedDeserializer read;

        write(buildBuilderBasedDeserializer buildbuilderbaseddeserializer) {
            this.read = buildbuilderbaseddeserializer;
        }

        @Override // android.text.SegmentFinder
        public final int previousStartBoundary(int p0) {
            return this.read.AudioAttributesImplApi26Parcelizer(p0);
        }

        @Override // android.text.SegmentFinder
        public final int previousEndBoundary(int p0) {
            return this.read.RemoteActionCompatParcelizer(p0);
        }

        @Override // android.text.SegmentFinder
        public final int nextStartBoundary(int p0) {
            return this.read.read(p0);
        }

        @Override // android.text.SegmentFinder
        public final int nextEndBoundary(int p0) {
            return this.read.AudioAttributesCompatParcelizer(p0);
        }
    }

    public final SegmentFinder ch_(buildBuilderBasedDeserializer buildbuilderbaseddeserializer) {
        return new write(buildbuilderbaseddeserializer);
    }
}
