package kotlin;

import kotlin.Metadata;
import kotlin.onForceLoad;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\b0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0011J!\u0010\u0013\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R$\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000e\u0010\u0019R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a"}, d2 = {"Lo/removeAnalyticsListener;", "T", "Lo/onForceLoad;", "<init>", "()V", "", "p0", "p1", "", "IconCompatParcelizer", "(ILjava/lang/Object;)V", "Lkotlin/Function1;", "Lo/onForceLoad$write;", "p2", "write", "(IILo/getAnswerMap;)V", "RemoteActionCompatParcelizer", "(I)Lo/onForceLoad$write;", "", "read", "(Lo/onForceLoad$write;I)Z", "Lo/UTF32Reader;", "Lo/UTF32Reader;", "AudioAttributesCompatParcelizer", "I", "()I", "Lo/onForceLoad$write;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class removeAnalyticsListener<T> implements onForceLoad<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private onForceLoad.write<? extends T> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final UTF32Reader<onForceLoad.write<T>> IconCompatParcelizer = new UTF32Reader<>(new onForceLoad.write[16], 0);

    @Override // kotlin.onForceLoad
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    private final onForceLoad.write<T> write(int p0) {
        onForceLoad.write<? extends T> writeVar = this.write;
        if (writeVar != null && read(writeVar, p0)) {
            return writeVar;
        }
        UTF32Reader<onForceLoad.write<T>> uTF32Reader = this.IconCompatParcelizer;
        onForceLoad.write writeVar2 = (onForceLoad.write<? extends T>) uTF32Reader.IconCompatParcelizer[deliverResult.write(uTF32Reader, p0)];
        this.write = writeVar2;
        return writeVar2;
    }

    private final boolean read(onForceLoad.write<? extends T> writeVar, int i) {
        return i < writeVar.getIconCompatParcelizer() + writeVar.getAudioAttributesCompatParcelizer() && writeVar.getIconCompatParcelizer() <= i;
    }

    public final void IconCompatParcelizer(int p0, T p1) {
        if (p0 < 0) {
            getRootStableInsets.RemoteActionCompatParcelizer("size should be >=0");
        }
        if (p0 == 0) {
            return;
        }
        onForceLoad.write<T> writeVar = new onForceLoad.write<>(getRemoteActionCompatParcelizer(), p0, p1);
        this.RemoteActionCompatParcelizer = getRemoteActionCompatParcelizer() + p0;
        this.IconCompatParcelizer.read(writeVar);
    }

    @Override // kotlin.onForceLoad
    public final void write(int p0, int p1, getAnswerMap<? super onForceLoad.write<? extends T>, getShowPopup> p2) {
        if (p0 < 0 || p0 >= getRemoteActionCompatParcelizer()) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(p0);
            sb.append(", size ");
            sb.append(getRemoteActionCompatParcelizer());
            getRootStableInsets.write(sb.toString());
        }
        if (p1 < 0 || p1 >= getRemoteActionCompatParcelizer()) {
            StringBuilder sb2 = new StringBuilder("Index ");
            sb2.append(p1);
            sb2.append(", size ");
            sb2.append(getRemoteActionCompatParcelizer());
            getRootStableInsets.write(sb2.toString());
        }
        if (p1 < p0) {
            StringBuilder sb3 = new StringBuilder("toIndex (");
            sb3.append(p1);
            sb3.append(") should be not smaller than fromIndex (");
            sb3.append(p0);
            sb3.append(')');
            getRootStableInsets.RemoteActionCompatParcelizer(sb3.toString());
        }
        int iWrite = deliverResult.write(this.IconCompatParcelizer, p0);
        int iconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer[iWrite].getIconCompatParcelizer();
        while (iconCompatParcelizer <= p1) {
            onForceLoad.write<T> writeVar = this.IconCompatParcelizer.IconCompatParcelizer[iWrite];
            p2.invoke(writeVar);
            iconCompatParcelizer += writeVar.getAudioAttributesCompatParcelizer();
            iWrite++;
        }
    }

    @Override // kotlin.onForceLoad
    public final onForceLoad.write<T> RemoteActionCompatParcelizer(int p0) {
        if (p0 < 0 || p0 >= getRemoteActionCompatParcelizer()) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(p0);
            sb.append(", size ");
            sb.append(getRemoteActionCompatParcelizer());
            getRootStableInsets.write(sb.toString());
        }
        return write(p0);
    }
}
