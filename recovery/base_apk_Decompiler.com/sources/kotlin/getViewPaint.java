package kotlin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0013\u0010\u001aJ/\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u001dJ/\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\n\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\u0018J\u000f\u0010\"\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u000bJ'\u0010\n\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\n\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(R\u001a\u0010,\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/"}, d2 = {"Lo/getViewPaint;", "Lo/getRelatedModuleAdapter;", "", "", "p0", "", "p1", "<init>", "([[B[I)V", "", "AudioAttributesCompatParcelizer", "()Ljava/lang/String;", "IconCompatParcelizer", "(Ljava/lang/String;)Lo/getRelatedModuleAdapter;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "write", "()I", "hashCode", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "()[B", "", "(I)B", "p2", "p3", "(I[BII)Z", "(ILo/getRelatedModuleAdapter;I)Z", "MediaBrowserCompatMediaItem", "()Lo/getRelatedModuleAdapter;", "MediaBrowserCompatSearchResultReceiver", "onCommand", "toString", "Lo/resetCurrentSelectedPosition;", "", "(Lo/resetCurrentSelectedPosition;II)V", "writeReplace", "()Ljava/lang/Object;", "[I", "MediaMetadataCompat", "()[I", "read", "[[B", "RatingCompat", "()[[B"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class getViewPaint extends getRelatedModuleAdapter {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final transient byte[][] IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final transient int[] read;

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final byte[][] getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int[] getRead() {
        return this.read;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getViewPaint(byte[][] bArr, int[] iArr) {
        super(getRelatedModuleAdapter.EMPTY.getData());
        toMagicModuleMetaRepoModel.write(bArr, "");
        toMagicModuleMetaRepoModel.write(iArr, "");
        this.IconCompatParcelizer = bArr;
        this.read = iArr;
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final String AudioAttributesCompatParcelizer() {
        return onCommand().AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final String RemoteActionCompatParcelizer() {
        return onCommand().RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final getRelatedModuleAdapter MediaBrowserCompatMediaItem() {
        return onCommand().MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final getRelatedModuleAdapter IconCompatParcelizer(String p0) throws NoSuchAlgorithmException {
        toMagicModuleMetaRepoModel.write(p0, "");
        MessageDigest messageDigest = MessageDigest.getInstance(p0);
        int length = getIconCompatParcelizer().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getRead()[length + i];
            int i4 = getRead()[i];
            messageDigest.update(getIconCompatParcelizer()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        toMagicModuleMetaRepoModel.write(bArrDigest);
        return new getRelatedModuleAdapter(bArrDigest);
    }

    private final getRelatedModuleAdapter onCommand() {
        return new getRelatedModuleAdapter(MediaBrowserCompatSearchResultReceiver());
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final byte[] MediaBrowserCompatItemReceiver() {
        return MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final String toString() {
        return onCommand().toString();
    }

    private final Object writeReplace() {
        getRelatedModuleAdapter getrelatedmoduleadapterOnCommand = onCommand();
        toMagicModuleMetaRepoModel.read(getrelatedmoduleadapterOnCommand, "");
        return getrelatedmoduleadapterOnCommand;
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final byte write(int p0) {
        isConciseModeOn.write(getRead()[getIconCompatParcelizer().length - 1], p0, 1L);
        int iAudioAttributesCompatParcelizer = DottedProgressView.AudioAttributesCompatParcelizer(this, p0);
        return getIconCompatParcelizer()[iAudioAttributesCompatParcelizer][(p0 - (iAudioAttributesCompatParcelizer == 0 ? 0 : getRead()[iAudioAttributesCompatParcelizer - 1])) + getRead()[getIconCompatParcelizer().length + iAudioAttributesCompatParcelizer]];
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final int write() {
        return getRead()[getIconCompatParcelizer().length - 1];
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final byte[] MediaBrowserCompatSearchResultReceiver() {
        byte[] bArr = new byte[MediaBrowserCompatCustomActionResultReceiver()];
        int length = getIconCompatParcelizer().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = getRead()[length + i];
            int i5 = getRead()[i];
            int i6 = i5 - i2;
            getOrderDetails.read(getIconCompatParcelizer()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final void AudioAttributesCompatParcelizer(resetCurrentSelectedPosition p0, int p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int iAudioAttributesCompatParcelizer = DottedProgressView.AudioAttributesCompatParcelizer(this, 0);
        while (p1 < p2) {
            int i = iAudioAttributesCompatParcelizer == 0 ? 0 : getRead()[iAudioAttributesCompatParcelizer - 1];
            int i2 = getRead()[iAudioAttributesCompatParcelizer];
            int i3 = getRead()[getIconCompatParcelizer().length + iAudioAttributesCompatParcelizer];
            int iMin = Math.min(p2, (i2 - i) + i) - p1;
            int i4 = i3 + (p1 - i);
            getMarkerPaint getmarkerpaint = new getMarkerPaint(getIconCompatParcelizer()[iAudioAttributesCompatParcelizer], i4, i4 + iMin, true);
            if (p0.head == null) {
                getmarkerpaint.prev = getmarkerpaint;
                getmarkerpaint.next = getmarkerpaint.prev;
                p0.head = getmarkerpaint.next;
            } else {
                getMarkerPaint getmarkerpaint2 = p0.head;
                toMagicModuleMetaRepoModel.write(getmarkerpaint2);
                getMarkerPaint getmarkerpaint3 = getmarkerpaint2.prev;
                toMagicModuleMetaRepoModel.write(getmarkerpaint3);
                getmarkerpaint3.read(getmarkerpaint);
            }
            p1 += iMin;
            iAudioAttributesCompatParcelizer++;
        }
        p0.MediaBrowserCompatItemReceiver(p0.getSize() + ((long) p2));
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final boolean AudioAttributesCompatParcelizer(int i, getRelatedModuleAdapter getrelatedmoduleadapter, int i2) {
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
        if (MediaBrowserCompatCustomActionResultReceiver() - i2 < 0) {
            return false;
        }
        int iAudioAttributesCompatParcelizer = DottedProgressView.AudioAttributesCompatParcelizer(this, 0);
        int i3 = 0;
        while (i < i2) {
            int i4 = iAudioAttributesCompatParcelizer == 0 ? 0 : getRead()[iAudioAttributesCompatParcelizer - 1];
            int i5 = getRead()[iAudioAttributesCompatParcelizer];
            int i6 = getRead()[getIconCompatParcelizer().length + iAudioAttributesCompatParcelizer];
            int iMin = Math.min(i2, (i5 - i4) + i4) - i;
            if (!getrelatedmoduleadapter.write(i3, getIconCompatParcelizer()[iAudioAttributesCompatParcelizer], i6 + (i - i4), iMin)) {
                return false;
            }
            i3 += iMin;
            i += iMin;
            iAudioAttributesCompatParcelizer++;
        }
        return true;
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final boolean write(int p0, byte[] p1, int p2, int p3) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0 < 0 || p0 > MediaBrowserCompatCustomActionResultReceiver() - p3 || p2 < 0 || p2 > p1.length - p3) {
            return false;
        }
        int i = p3 + p0;
        int iAudioAttributesCompatParcelizer = DottedProgressView.AudioAttributesCompatParcelizer(this, p0);
        while (p0 < i) {
            int i2 = iAudioAttributesCompatParcelizer == 0 ? 0 : getRead()[iAudioAttributesCompatParcelizer - 1];
            int i3 = getRead()[iAudioAttributesCompatParcelizer];
            int i4 = getRead()[getIconCompatParcelizer().length + iAudioAttributesCompatParcelizer];
            int iMin = Math.min(i, (i3 - i2) + i2) - p0;
            if (!isConciseModeOn.write(getIconCompatParcelizer()[iAudioAttributesCompatParcelizer], i4 + (p0 - i2), p1, p2, iMin)) {
                return false;
            }
            p2 += iMin;
            p0 += iMin;
            iAudioAttributesCompatParcelizer++;
        }
        return true;
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (p0 instanceof getRelatedModuleAdapter) {
            getRelatedModuleAdapter getrelatedmoduleadapter = (getRelatedModuleAdapter) p0;
            if (getrelatedmoduleadapter.MediaBrowserCompatCustomActionResultReceiver() == MediaBrowserCompatCustomActionResultReceiver() && AudioAttributesCompatParcelizer(0, getrelatedmoduleadapter, MediaBrowserCompatCustomActionResultReceiver())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.getRelatedModuleAdapter
    public final int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getIconCompatParcelizer().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = getRead()[length + i];
            int i5 = getRead()[i];
            byte[] bArr = getIconCompatParcelizer()[i];
            for (int i6 = i4; i6 < (i5 - i3) + i4; i6++) {
                i2 = (i2 * 31) + bArr[i6];
            }
            i++;
            i3 = i5;
        }
        RemoteActionCompatParcelizer(i2);
        return i2;
    }
}
