package kotlin;

import android.os.SystemClock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lo/zzhd;", "", "<init>", "()V", "write", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "Lo/zzhd$read;", "Lo/zzhd$write;", "Lo/zzhd$IconCompatParcelizer;", "Lo/zzhd$RemoteActionCompatParcelizer;", "Lo/zzhd$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class zzhd {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzhd$write;", "Lo/zzhd;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends zzhd {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    private zzhd() {
    }

    public static final class IconCompatParcelizer extends zzhd {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public /* synthetic */ zzhd(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer extends zzhd {
        public static int RemoteActionCompatParcelizer;
        public static int write;
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String read() {
            return this.IconCompatParcelizer;
        }

        public static int write() {
            int i = write;
            int i2 = i % 9289604;
            write = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            RemoteActionCompatParcelizer = iUptimeMillis;
            return iUptimeMillis;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/zzhd$AudioAttributesCompatParcelizer;", "Lo/zzhd;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends zzhd {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class read extends zzhd {
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.RemoteActionCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
