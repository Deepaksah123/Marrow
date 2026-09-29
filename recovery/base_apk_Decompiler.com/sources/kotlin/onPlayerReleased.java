package kotlin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/onPlayerReleased;", "", "Ljava/io/File;", "p0", "", "p1", "Lo/PlaylistTimeline1;", "p2", "Lkotlin/Function1;", "", "p3", "<init>", "(Ljava/io/File;ILo/PlaylistTimeline1;Lo/getAnswerMap;)V", "", "write", "(Ljava/lang/String;[B)Ljava/io/File;", "(Ljava/lang/String;)Ljava/io/File;", "", "IconCompatParcelizer", "(Ljava/lang/String;)Z", "AudioAttributesCompatParcelizer", "Ljava/io/File;", "RemoteActionCompatParcelizer", "I", "Lo/PlaylistTimeline1;", "read", "Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onPlayerReleased {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final PlaylistTimeline1 read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final File RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<String, String> AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private onPlayerReleased(File file, int i, PlaylistTimeline1 playlistTimeline1, getAnswerMap<? super String, String> getanswermap) {
        toMagicModuleMetaRepoModel.write(file, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.RemoteActionCompatParcelizer = file;
        this.write = i;
        this.read = playlistTimeline1;
        this.AudioAttributesCompatParcelizer = getanswermap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ onPlayerReleased(File file, int i, PlaylistTimeline1 playlistTimeline1, getAnswerMap getanswermap, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        playlistTimeline1 = (i2 & 4) != 0 ? null : playlistTimeline1;
        if ((i2 & 8) != 0) {
            lambdanotifySeekStarted2 lambdanotifyseekstarted2 = lambdanotifySeekStarted2.INSTANCE;
            getanswermap = lambdanotifySeekStarted2.IconCompatParcelizer();
        }
        this(file, i, playlistTimeline1, getanswermap);
    }

    public final File write(String p0, byte[] p1) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (onBandwidthEstimate.write(p1) > this.write) {
            IconCompatParcelizer(p0);
            StringBuilder sb = new StringBuilder("File size exceeds the maximum limit of ");
            sb.append(this.write);
            throw new IllegalArgumentException(sb.toString());
        }
        File fileAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
        if (fileAudioAttributesCompatParcelizer.exists()) {
            fileAudioAttributesCompatParcelizer.delete();
        }
        File fileAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(p0);
        PlaylistTimeline1 playlistTimeline1 = this.read;
        if (playlistTimeline1 != null) {
            StringBuilder sb2 = new StringBuilder("mapped file path - ");
            sb2.append(fileAudioAttributesCompatParcelizer2.getAbsoluteFile());
            sb2.append(" to key - ");
            sb2.append(p0);
            playlistTimeline1.write("FileDownload", sb2.toString());
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileAudioAttributesCompatParcelizer2);
        fileOutputStream.write(p1);
        fileOutputStream.close();
        return fileAudioAttributesCompatParcelizer2;
    }

    public final File write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        File fileAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
        if (fileAudioAttributesCompatParcelizer.exists()) {
            return fileAudioAttributesCompatParcelizer;
        }
        return null;
    }

    public final boolean IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        File fileAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
        if (!fileAudioAttributesCompatParcelizer.exists()) {
            return false;
        }
        fileAudioAttributesCompatParcelizer.delete();
        return true;
    }

    private final File AudioAttributesCompatParcelizer(String p0) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("/CT_FILE_");
        sb.append(this.AudioAttributesCompatParcelizer.invoke(p0));
        return new File(sb.toString());
    }
}
