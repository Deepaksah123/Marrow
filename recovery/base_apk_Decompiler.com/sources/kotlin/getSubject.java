package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getSubject {
    public static final write AudioAttributesCompatParcelizer = new write(0);
    private static final getSubject IconCompatParcelizer = new getSubject(null, 0 == true ? 1 : 0);
    private final VideoSubModel AudioAttributesImplApi21Parcelizer;
    private final HomeVideoModel RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean write;

    public getSubject(VideoSubModel videoSubModel, HomeVideoModel homeVideoModel, boolean z, boolean z2) {
        this.AudioAttributesImplApi21Parcelizer = videoSubModel;
        this.RemoteActionCompatParcelizer = homeVideoModel;
        this.read = z;
        this.write = z2;
    }

    public /* synthetic */ getSubject(VideoSubModel videoSubModel, boolean z) {
        this(videoSubModel, null, z, false);
    }

    public final VideoSubModel IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final HomeVideoModel AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final boolean read() {
        return this.write;
    }

    public static final class write {
        private write() {
        }

        public static getSubject AudioAttributesCompatParcelizer() {
            return getSubject.IconCompatParcelizer;
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }
}
