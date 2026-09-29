package kotlin;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
class IcyDataSource implements Serializable {
    private LoopingMediaSourceInfinitelyLoopingTimeline RemoteActionCompatParcelizer;

    public static class IconCompatParcelizer {
        private boolean IconCompatParcelizer;
        private LoopingMediaSourceInfinitelyLoopingTimeline RemoteActionCompatParcelizer;

        public final IcyDataSource AudioAttributesCompatParcelizer() {
            return new IcyDataSource(IcyDataSource.IconCompatParcelizer());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HCaptchaInternalConfig.HCaptchaInternalConfigBuilder(htmlProvider$value=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LoopingMediaSourceInfinitelyLoopingTimeline IconCompatParcelizer() {
        return new EmptySampleStream();
    }

    public IcyDataSource(LoopingMediaSourceInfinitelyLoopingTimeline loopingMediaSourceInfinitelyLoopingTimeline) {
        this.RemoteActionCompatParcelizer = loopingMediaSourceInfinitelyLoopingTimeline;
    }

    public static IconCompatParcelizer RemoteActionCompatParcelizer() {
        return new IconCompatParcelizer();
    }

    private static boolean RemoteActionCompatParcelizer(Object obj) {
        return obj instanceof IcyDataSource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IcyDataSource)) {
            return false;
        }
        IcyDataSource icyDataSource = (IcyDataSource) obj;
        if (!RemoteActionCompatParcelizer(this)) {
            return false;
        }
        LoopingMediaSourceInfinitelyLoopingTimeline loopingMediaSourceInfinitelyLoopingTimeline = read();
        LoopingMediaSourceInfinitelyLoopingTimeline loopingMediaSourceInfinitelyLoopingTimeline2 = icyDataSource.read();
        return loopingMediaSourceInfinitelyLoopingTimeline != null ? loopingMediaSourceInfinitelyLoopingTimeline.equals(loopingMediaSourceInfinitelyLoopingTimeline2) : loopingMediaSourceInfinitelyLoopingTimeline2 == null;
    }

    public final LoopingMediaSourceInfinitelyLoopingTimeline read() {
        return this.RemoteActionCompatParcelizer;
    }

    public int hashCode() {
        LoopingMediaSourceInfinitelyLoopingTimeline loopingMediaSourceInfinitelyLoopingTimeline = read();
        return (loopingMediaSourceInfinitelyLoopingTimeline == null ? 43 : loopingMediaSourceInfinitelyLoopingTimeline.hashCode()) + 59;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HCaptchaInternalConfig(htmlProvider=");
        sb.append(read());
        sb.append(")");
        return sb.toString();
    }
}
