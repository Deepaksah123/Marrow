package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tJ%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/reportInvalid;", "E", "", "Lo/reportUnexpectedEOF;", "", "p0", "p1", "AudioAttributesCompatParcelizer", "(II)Lo/reportInvalid;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface reportInvalid<E> extends List<E>, reportUnexpectedEOF<E> {
    @Override // kotlin.reportInvalid
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    default reportInvalid<E> subList(int p0, int p1) {
        return new RemoteActionCompatParcelizer(this, p0, p1);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u000e\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0014"}, d2 = {"Lo/reportInvalid$RemoteActionCompatParcelizer;", "E", "Lo/reportInvalid;", "Lo/setUrl;", "p0", "", "p1", "p2", "<init>", "(Lo/reportInvalid;II)V", "get", "(I)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "(II)Lo/reportInvalid;", "read", "Lo/reportInvalid;", "write", "I", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer<E> extends setUrl<E> implements reportInvalid<E> {
        private final int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final reportInvalid<E> write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private int IconCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteActionCompatParcelizer(reportInvalid<? extends E> reportinvalid, int i, int i2) {
            this.write = reportinvalid;
            this.AudioAttributesCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = i2;
            fillPowersOfNFloor16Recursive.write(i, i2, reportinvalid.size());
            this.IconCompatParcelizer = i2 - i;
        }

        @Override // kotlin.setUrl, java.util.List
        public final E get(int p0) {
            fillPowersOfNFloor16Recursive.read(p0, this.IconCompatParcelizer);
            return this.write.get(this.AudioAttributesCompatParcelizer + p0);
        }

        @Override // kotlin.setBigButtonText
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final int getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.setUrl, java.util.List, kotlin.reportInvalid
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final reportInvalid<E> subList(int p0, int p1) {
            fillPowersOfNFloor16Recursive.write(p0, p1, this.IconCompatParcelizer);
            reportInvalid<E> reportinvalid = this.write;
            int i = this.AudioAttributesCompatParcelizer;
            return new RemoteActionCompatParcelizer(reportinvalid, p0 + i, i + p1);
        }
    }
}
