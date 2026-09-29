package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalFrame1 implements getSubFrame {
    private final int AudioAttributesCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final ChapterFrame1 write;

    /* synthetic */ InternalFrame1(long j, int i, ChapterFrame1 chapterFrame1, byte b) {
        this(j, i, chapterFrame1);
    }

    private InternalFrame1(long j, int i, ChapterFrame1 chapterFrame1) {
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = i;
        this.write = chapterFrame1;
    }

    @Override // kotlin.getSubFrame
    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static class RemoteActionCompatParcelizer {
        private int IconCompatParcelizer;
        private long RemoteActionCompatParcelizer;
        private ChapterFrame1 read;

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        private RemoteActionCompatParcelizer() {
        }

        public final RemoteActionCompatParcelizer IconCompatParcelizer(long j) {
            this.RemoteActionCompatParcelizer = j;
            return this;
        }

        final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i) {
            this.IconCompatParcelizer = i;
            return this;
        }

        final RemoteActionCompatParcelizer write(ChapterFrame1 chapterFrame1) {
            this.read = chapterFrame1;
            return this;
        }

        public final InternalFrame1 IconCompatParcelizer() {
            return new InternalFrame1(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, (byte) 0);
        }
    }

    static RemoteActionCompatParcelizer write() {
        return new RemoteActionCompatParcelizer((byte) 0);
    }
}
