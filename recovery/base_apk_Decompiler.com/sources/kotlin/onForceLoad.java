package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\fJ\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e\u0082\u0001\u0001\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/onForceLoad;", "T", "", "", "p0", "Lo/onForceLoad$write;", "RemoteActionCompatParcelizer", "(I)Lo/onForceLoad$write;", "p1", "Lkotlin/Function1;", "", "p2", "write", "(IILo/getAnswerMap;)V", "()I", "read", "Lo/removeAnalyticsListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface onForceLoad<T> {
    write<T> RemoteActionCompatParcelizer(int p0);

    int write();

    void write(int p0, int p1, getAnswerMap<? super write<? extends T>, getShowPopup> p2);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00028\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011"}, d2 = {"Lo/onForceLoad$write;", "T", "", "", "p0", "p1", "p2", "<init>", "(IILjava/lang/Object;)V", "RemoteActionCompatParcelizer", "I", "read", "()I", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "Ljava/lang/Object;", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write<T> {
        private final int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final int IconCompatParcelizer;
        private final T write;

        public write(int i, int i2, T t) {
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.write = t;
            if (i < 0) {
                getRootStableInsets.RemoteActionCompatParcelizer("startIndex should be >= 0");
            }
            if (i2 > 0) {
                return;
            }
            getRootStableInsets.RemoteActionCompatParcelizer("size should be > 0");
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final T RemoteActionCompatParcelizer() {
            return this.write;
        }
    }
}
