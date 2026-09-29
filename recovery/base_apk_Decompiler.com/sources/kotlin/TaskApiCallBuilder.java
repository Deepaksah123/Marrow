package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lo/TaskApiCallBuilder;", "", "<init>", "()V", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "read", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer", "Lo/TaskApiCallBuilder$IconCompatParcelizer;", "Lo/TaskApiCallBuilder$AudioAttributesCompatParcelizer;", "Lo/TaskApiCallBuilder$read;", "Lo/TaskApiCallBuilder$RemoteActionCompatParcelizer;", "Lo/TaskApiCallBuilder$write;", "Lo/TaskApiCallBuilder$AudioAttributesImplBaseParcelizer;", "Lo/TaskApiCallBuilder$AudioAttributesImplApi21Parcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TaskApiCallBuilder {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/TaskApiCallBuilder$IconCompatParcelizer;", "Lo/TaskApiCallBuilder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends TaskApiCallBuilder {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    private TaskApiCallBuilder() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/TaskApiCallBuilder$AudioAttributesImplApi21Parcelizer;", "Lo/TaskApiCallBuilder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends TaskApiCallBuilder {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    public /* synthetic */ TaskApiCallBuilder(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/TaskApiCallBuilder$AudioAttributesImplBaseParcelizer;", "Lo/TaskApiCallBuilder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplBaseParcelizer extends TaskApiCallBuilder {
        public static final AudioAttributesImplBaseParcelizer INSTANCE = new AudioAttributesImplBaseParcelizer();

        private AudioAttributesImplBaseParcelizer() {
            super(null);
        }
    }

    public static final class read extends TaskApiCallBuilder {
        private final int read;

        public read() {
            super(null);
            this.read = 0;
        }

        public final int IconCompatParcelizer() {
            return this.read;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends TaskApiCallBuilder {
        private final int RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(int i) {
            super(null);
            this.RemoteActionCompatParcelizer = i;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/TaskApiCallBuilder$write;", "Lo/TaskApiCallBuilder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends TaskApiCallBuilder {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/TaskApiCallBuilder$RemoteActionCompatParcelizer;", "Lo/TaskApiCallBuilder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends TaskApiCallBuilder {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }
}
