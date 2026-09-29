package kotlin;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.access5500;

/* JADX INFO: loaded from: classes2.dex */
public final class access4400 implements access4500<Bitmap> {
    private final updateWifiLock RemoteActionCompatParcelizer;
    private final PlaylistTimeline1 write;

    public access4400(updateWifiLock updatewifilock, PlaylistTimeline1 playlistTimeline1) {
        toMagicModuleMetaRepoModel.write(updatewifilock, "");
        this.RemoteActionCompatParcelizer = updatewifilock;
        this.write = playlistTimeline1;
    }

    @Override // kotlin.access4500
    public final Pair<Bitmap, File> read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer().read(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.access4500
    public final <A> A IconCompatParcelizer(String str, access5500<A> access5500Var) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(access5500Var, "");
        Pair<Bitmap, File> pair = read(str);
        if (pair == null) {
            return null;
        }
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" data found in image in-memory");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(access5500Var, access5500.write.INSTANCE)) {
            A a = (A) pair.write();
            if (a == null) {
                return null;
            }
            return a;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(access5500Var, access5500.IconCompatParcelizer.INSTANCE)) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(access5500Var, access5500.read.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            A a2 = (A) pair.IconCompatParcelizer();
            if (a2 == null) {
                return null;
            }
            return a2;
        }
        getAnswerMap<Bitmap, byte[]> getanswermapRemoteActionCompatParcelizer = SimpleBasePlayerMediaItemData.RemoteActionCompatParcelizer();
        Bitmap bitmapWrite = pair.write();
        toMagicModuleMetaRepoModel.read(bitmapWrite, "");
        A a3 = (A) getanswermapRemoteActionCompatParcelizer.invoke(bitmapWrite);
        if (a3 == null) {
            return null;
        }
        return a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.access4500
    public final <A> A AudioAttributesCompatParcelizer(String str, access5500<A> access5500Var) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(access5500Var, "");
        A a = (A) RemoteActionCompatParcelizer(str);
        if (a == null) {
            return null;
        }
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" data found in image disk memory");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        A a2 = (A) ((Bitmap) SimpleBasePlayerMediaItemData.IconCompatParcelizer().invoke(a));
        if (a2 != null) {
            RemoteActionCompatParcelizer(str, new Pair<>(a2, a));
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(access5500Var, access5500.write.INSTANCE)) {
            if (a2 instanceof Object) {
                return a2;
            }
            return null;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(access5500Var, access5500.IconCompatParcelizer.INSTANCE)) {
            A a3 = (A) SimpleBasePlayerMediaItemData.write().invoke(a);
            if (a3 == null) {
                return null;
            }
            return a3;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(access5500Var, access5500.read.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        if (a instanceof Object) {
            return a;
        }
        return null;
    }

    @Override // kotlin.access4500
    public final File RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder("IMAGE In-Memory cache miss for ");
            sb.append(str);
            sb.append(" data");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer().write(str);
    }

    @Override // kotlin.access4500
    public final boolean RemoteActionCompatParcelizer(String str, Pair<? extends Bitmap, ? extends File> pair) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(pair, "");
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder("Saving ");
            sb.append(str);
            sb.append(" data in IMAGE in-memory");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer(str, pair);
    }

    @Override // kotlin.access4500
    public final File write(String str, byte[] bArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bArr, "");
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer().write(str, bArr);
    }

    @Override // kotlin.access4500
    public final boolean write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder("If present, will remove ");
            sb.append(str);
            sb.append(" data from IMAGE disk-memory");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(str);
    }

    @Override // kotlin.access4500
    public final Pair<Bitmap, File> IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        PlaylistTimeline1 playlistTimeline1 = this.write;
        if (playlistTimeline1 != null) {
            StringBuilder sb = new StringBuilder("If present, will remove ");
            sb.append(str);
            sb.append(" data from IMAGE in-memory");
            playlistTimeline1.write("FileDownload", sb.toString());
        }
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(str);
    }
}
