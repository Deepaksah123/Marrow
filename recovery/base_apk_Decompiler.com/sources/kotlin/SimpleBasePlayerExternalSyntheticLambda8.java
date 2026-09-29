package kotlin;

import java.io.File;
import kotlin.Metadata;
import kotlin.access5500;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0018J%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ+\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0019R\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda8;", "Lo/access4500;", "", "Lo/updateWifiLock;", "p0", "Lo/PlaylistTimeline1;", "p1", "<init>", "(Lo/updateWifiLock;Lo/PlaylistTimeline1;)V", "", "Lo/getSubscriptionExpiresOn;", "Ljava/io/File;", "read", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "A", "Lo/access5500;", "IconCompatParcelizer", "(Ljava/lang/String;Lo/access5500;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Ljava/io/File;", "write", "(Ljava/lang/String;[B)Ljava/io/File;", "", "(Ljava/lang/String;)Z", "(Ljava/lang/String;Lo/getSubscriptionExpiresOn;)Z", "Lo/updateWifiLock;", "Lo/PlaylistTimeline1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda8 implements access4500<byte[]> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final updateWifiLock read;
    private final PlaylistTimeline1 write;

    public SimpleBasePlayerExternalSyntheticLambda8(updateWifiLock updatewifilock, PlaylistTimeline1 playlistTimeline1) {
        toMagicModuleMetaRepoModel.write(updatewifilock, "");
        this.read = updatewifilock;
        this.write = playlistTimeline1;
    }

    @Override // kotlin.access4500
    public final Pair<byte[], File> read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.read.IconCompatParcelizer().read(p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.access4500
    public final <A> A IconCompatParcelizer(String p0, access5500<A> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Pair<byte[], File> pair = read(p0);
        if (pair == null) {
            return null;
        }
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append(" data found in FILE in-memory");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, access5500.write.INSTANCE)) {
            A a = (A) SimpleBasePlayerMediaItemData.AudioAttributesCompatParcelizer().invoke(pair.write());
            if (a == null) {
                return null;
            }
            return a;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, access5500.IconCompatParcelizer.INSTANCE)) {
            A a2 = (A) pair.write();
            if (a2 == null) {
                return null;
            }
            return a2;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, access5500.read.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        A a3 = (A) pair.IconCompatParcelizer();
        if (a3 == null) {
            return null;
        }
        return a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.access4500
    public final <A> A AudioAttributesCompatParcelizer(String p0, access5500<A> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        A a = (A) RemoteActionCompatParcelizer(p0);
        if (a == null) {
            return null;
        }
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append(" data found in FILE disk memory");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        A a2 = (A) SimpleBasePlayerMediaItemData.write().invoke(a);
        if (a2 != null) {
            RemoteActionCompatParcelizer(p0, new Pair<>(a2, a));
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, access5500.write.INSTANCE)) {
            A a3 = (A) SimpleBasePlayerMediaItemData.IconCompatParcelizer().invoke(a);
            if (a3 == null) {
                return null;
            }
            return a3;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, access5500.IconCompatParcelizer.INSTANCE)) {
            if (a2 instanceof Object) {
                return a2;
            }
            return null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, access5500.read.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        if (a instanceof Object) {
            return a;
        }
        return null;
    }

    @Override // kotlin.access4500
    public final File RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder("FILE In-Memory cache miss for ");
            sb.append(p0);
            sb.append(" data");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        return this.read.AudioAttributesCompatParcelizer().write(p0);
    }

    @Override // kotlin.access4500
    public final File write(String p0, byte[] p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return this.read.AudioAttributesCompatParcelizer().write(p0, p1);
    }

    @Override // kotlin.access4500
    public final boolean write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder("If present, will remove ");
            sb.append(p0);
            sb.append(" data from FILE disk-memory");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        return this.read.AudioAttributesCompatParcelizer().IconCompatParcelizer(p0);
    }

    @Override // kotlin.access4500
    public final Pair<byte[], File> IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder("If present, will remove ");
            sb.append(p0);
            sb.append(" data from FILE in-memory");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        return this.read.IconCompatParcelizer().IconCompatParcelizer(p0);
    }

    @Override // kotlin.access4500
    public final boolean RemoteActionCompatParcelizer(String p0, Pair<? extends byte[], ? extends File> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder("Saving ");
            sb.append(p0);
            sb.append(" data in FILE in-memory");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        return this.read.IconCompatParcelizer().RemoteActionCompatParcelizer(p0, p1);
    }
}
