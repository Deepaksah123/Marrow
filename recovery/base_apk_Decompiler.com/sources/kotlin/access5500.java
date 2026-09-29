package kotlin;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n"}, d2 = {"Lo/access5500;", "A", "", "<init>", "()V", "write", "IconCompatParcelizer", "read", "Lo/access5500$write;", "Lo/access5500$IconCompatParcelizer;", "Lo/access5500$read;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class access5500<A> {
    private access5500() {
    }

    public /* synthetic */ access5500(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/access5500$write;", "Lo/access5500;", "Landroid/graphics/Bitmap;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends access5500<Bitmap> {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/access5500$IconCompatParcelizer;", "Lo/access5500;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer extends access5500<byte[]> {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/access5500$read;", "Lo/access5500;", "Ljava/io/File;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends access5500<File> {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }
}
