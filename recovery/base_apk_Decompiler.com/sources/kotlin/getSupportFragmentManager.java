package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getSupportFragmentManager;", "", "Lo/bufferMapProperty;", "", "p0", "p1", "", "IconCompatParcelizer", "(Lo/bufferMapProperty;II)Ljava/util/List;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getSupportFragmentManager {
    List<Integer> IconCompatParcelizer(bufferMapProperty buffermapproperty, int i, int i2);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011"}, d2 = {"Lo/getSupportFragmentManager$read;", "Lo/getSupportFragmentManager;", "", "p0", "<init>", "(I)V", "Lo/bufferMapProperty;", "p1", "", "IconCompatParcelizer", "(Lo/bufferMapProperty;II)Ljava/util/List;", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements getSupportFragmentManager {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int AudioAttributesCompatParcelizer;

        public read(int i) {
            this.AudioAttributesCompatParcelizer = i;
            if (i > 0) {
                return;
            }
            getRootStableInsets.RemoteActionCompatParcelizer("Provided count should be larger than zero");
        }

        @Override // kotlin.getSupportFragmentManager
        public final List<Integer> IconCompatParcelizer(bufferMapProperty buffermapproperty, int i, int i2) {
            return getSupportLoaderManager.AudioAttributesCompatParcelizer(i, this.AudioAttributesCompatParcelizer, i2);
        }

        public final int hashCode() {
            return -this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            return (p0 instanceof read) && this.AudioAttributesCompatParcelizer == ((read) p0).AudioAttributesCompatParcelizer;
        }
    }
}
