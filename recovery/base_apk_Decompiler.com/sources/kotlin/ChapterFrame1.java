package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class ChapterFrame1 {
    private final long AudioAttributesCompatParcelizer;
    private final long RemoteActionCompatParcelizer;

    /* synthetic */ ChapterFrame1(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private ChapterFrame1(IconCompatParcelizer iconCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer;
    }

    public final long write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long read() {
        return this.RemoteActionCompatParcelizer;
    }

    public static class IconCompatParcelizer {
        private long AudioAttributesCompatParcelizer = 60;
        private long RemoteActionCompatParcelizer = decodeTextInformationFrame.AudioAttributesCompatParcelizer;

        public final IconCompatParcelizer AudioAttributesCompatParcelizer(long j) throws IllegalArgumentException {
            if (j < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
            }
            this.AudioAttributesCompatParcelizer = j;
            return this;
        }

        public final IconCompatParcelizer RemoteActionCompatParcelizer(long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("Minimum interval between fetches has to be a non-negative number. ");
                sb.append(j);
                sb.append(" is an invalid argument");
                throw new IllegalArgumentException(sb.toString());
            }
            this.RemoteActionCompatParcelizer = j;
            return this;
        }

        public final ChapterFrame1 IconCompatParcelizer() {
            return new ChapterFrame1(this, (byte) 0);
        }
    }
}
