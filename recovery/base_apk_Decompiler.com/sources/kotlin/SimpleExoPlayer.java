package kotlin;

import android.graphics.Bitmap;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lo/SimpleExoPlayer;", "", "Landroid/graphics/Bitmap;", "p0", "Lo/SimpleExoPlayer$write;", "p1", "", "p2", "", "p3", "<init>", "(Landroid/graphics/Bitmap;Lo/SimpleExoPlayer$write;J[B)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Landroid/graphics/Bitmap;", "write", "()Landroid/graphics/Bitmap;", "read", "Lo/SimpleExoPlayer$write;", "()Lo/SimpleExoPlayer$write;", "AudioAttributesCompatParcelizer", "J", "()J", "[B", "RemoteActionCompatParcelizer", "()[B"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SimpleExoPlayer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Bitmap read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final byte[] IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final write AudioAttributesCompatParcelizer;

    public SimpleExoPlayer(Bitmap bitmap, write writeVar, long j, byte[] bArr) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        this.read = bitmap;
        this.AudioAttributesCompatParcelizer = writeVar;
        this.write = j;
        this.IconCompatParcelizer = bArr;
    }

    public /* synthetic */ SimpleExoPlayer(Bitmap bitmap, write writeVar, long j, byte[] bArr, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(bitmap, writeVar, j, (i & 8) != 0 ? null : bArr);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Bitmap getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final write getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final byte[] getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\nj\u0002\b\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lo/SimpleExoPlayer$write;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "write", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write {
        private static final /* synthetic */ write[] AudioAttributesImplApi26Parcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private final String AudioAttributesCompatParcelizer;
        public static final write RemoteActionCompatParcelizer = new write("NO_IMAGE", 0, "NO_IMAGE");
        public static final write MediaBrowserCompatItemReceiver = new write("SUCCESS", 1, "SUCCESS");
        public static final write AudioAttributesCompatParcelizer = new write("DOWNLOAD_FAILED", 2, "DOWNLOAD_FAILED");
        public static final write write = new write("NO_NETWORK", 3, "NO_NETWORK");
        public static final write IconCompatParcelizer = new write("INIT_ERROR", 4, "INIT_ERROR");
        public static final write AudioAttributesImplApi21Parcelizer = new write("SIZE_LIMIT_EXCEEDED", 5, "SIZE_LIMIT_EXCEEDED");
        public static final write read = new write("GIF_SUCCESS", 6, "GIF_SUCCESS");

        private write(String str, int i, String str2) {
            this.AudioAttributesCompatParcelizer = str2;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        static {
            write[] writeVarArrIconCompatParcelizer = IconCompatParcelizer();
            AudioAttributesImplApi26Parcelizer = writeVarArrIconCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(writeVarArrIconCompatParcelizer);
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) AudioAttributesImplApi26Parcelizer.clone();
        }

        private static final /* synthetic */ write[] IconCompatParcelizer() {
            return new write[]{RemoteActionCompatParcelizer, MediaBrowserCompatItemReceiver, AudioAttributesCompatParcelizer, write, IconCompatParcelizer, AudioAttributesImplApi21Parcelizer, read};
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        toMagicModuleMetaRepoModel.read(p0, "");
        SimpleExoPlayer simpleExoPlayer = (SimpleExoPlayer) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, simpleExoPlayer.read) && this.AudioAttributesCompatParcelizer == simpleExoPlayer.AudioAttributesCompatParcelizer && this.write == simpleExoPlayer.write && Arrays.equals(this.IconCompatParcelizer, simpleExoPlayer.IconCompatParcelizer);
    }

    public final int hashCode() {
        Bitmap bitmap = this.read;
        return ((((((bitmap != null ? bitmap.hashCode() : 0) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Long.hashCode(this.write)) * 31) + Arrays.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleExoPlayer(read=");
        sb.append(this.read);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", IconCompatParcelizer=");
        sb.append(Arrays.toString(this.IconCompatParcelizer));
        sb.append(')');
        return sb.toString();
    }
}
