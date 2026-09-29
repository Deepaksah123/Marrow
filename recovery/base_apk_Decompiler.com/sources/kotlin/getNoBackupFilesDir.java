package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0010R\u0014\u0010\t\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/getNoBackupFilesDir;", "", "Lo/Flow;", "p0", "Lkotlin/Function2;", "Lo/checkSelfPermission;", "Lo/SampleVideos;", "", "p1", "AudioAttributesCompatParcelizer", "(Lo/Flow;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "", "RemoteActionCompatParcelizer", "(F)F", "", "AudioAttributesImplApi26Parcelizer", "()Z", "write", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getNoBackupFilesDir {
    Object AudioAttributesCompatParcelizer(Flow flow, MagicModuleSubmissionRequestBody<? super checkSelfPermission, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos);

    default boolean AudioAttributesCompatParcelizer() {
        return true;
    }

    boolean AudioAttributesImplApi26Parcelizer();

    float RemoteActionCompatParcelizer(float p0);

    default boolean read() {
        return true;
    }

    static /* synthetic */ Object AudioAttributesCompatParcelizer$default(getNoBackupFilesDir getnobackupfilesdir, Flow flow, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, SampleVideos sampleVideos, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i & 1) != 0) {
            flow = Flow.read;
        }
        return getnobackupfilesdir.AudioAttributesCompatParcelizer(flow, magicModuleSubmissionRequestBody, sampleVideos);
    }
}
