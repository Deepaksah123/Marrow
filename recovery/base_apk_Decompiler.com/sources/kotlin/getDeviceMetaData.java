package kotlin;

import com.marrow2.domain.custom_module.model.CustomModuleTopicListModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lo/getDeviceMetaData;", "", "<init>", "()V", "write", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "read", "Lo/getDeviceMetaData$AudioAttributesCompatParcelizer;", "Lo/getDeviceMetaData$read;", "Lo/getDeviceMetaData$write;", "Lo/getDeviceMetaData$IconCompatParcelizer;", "Lo/getDeviceMetaData$RemoteActionCompatParcelizer;", "Lo/getDeviceMetaData$AudioAttributesImplApi21Parcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getDeviceMetaData {
    private getDeviceMetaData() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getDeviceMetaData$write;", "Lo/getDeviceMetaData;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends getDeviceMetaData {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public /* synthetic */ getDeviceMetaData(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getDeviceMetaData$RemoteActionCompatParcelizer;", "Lo/getDeviceMetaData;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends getDeviceMetaData {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getDeviceMetaData$IconCompatParcelizer;", "Lo/getDeviceMetaData;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer extends getDeviceMetaData {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends getDeviceMetaData {
        private final CustomModuleTopicListModel AudioAttributesCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(CustomModuleTopicListModel customModuleTopicListModel, boolean z) {
            super(null);
            toMagicModuleMetaRepoModel.write(customModuleTopicListModel, "");
            this.AudioAttributesCompatParcelizer = customModuleTopicListModel;
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final CustomModuleTopicListModel write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getDeviceMetaData$AudioAttributesCompatParcelizer;", "Lo/getDeviceMetaData;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends getDeviceMetaData {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getDeviceMetaData$read;", "Lo/getDeviceMetaData;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends getDeviceMetaData {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }
}
