package kotlin;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getBodyContents extends hasImageCitation implements setStatus {
    private final getEncryptKey AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final boolean read;
    private final Annotation[] write;

    @Override // kotlin.HomeQbankModel
    public final boolean IconCompatParcelizer() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setStatus
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public getEncryptKey RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setStatus
    public final boolean write() {
        return this.read;
    }

    public getBodyContents(getEncryptKey getencryptkey, Annotation[] annotationArr, String str, boolean z) {
        toMagicModuleMetaRepoModel.write(getencryptkey, "");
        toMagicModuleMetaRepoModel.write(annotationArr, "");
        this.AudioAttributesCompatParcelizer = getencryptkey;
        this.write = annotationArr;
        this.RemoteActionCompatParcelizer = str;
        this.read = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.HomeQbankModel
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public List<getAspectRatio> read() {
        return getImageCitationLicense.IconCompatParcelizer(this.write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.HomeQbankModel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getAspectRatio write(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return getImageCitationLicense.RemoteActionCompatParcelizer(this.write, getnotescount);
    }

    @Override // kotlin.setStatus
    public final getRelatedLessonId AudioAttributesCompatParcelizer() {
        String str = this.RemoteActionCompatParcelizer;
        if (str != null) {
            return getRelatedLessonId.IconCompatParcelizer(str);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(write() ? "vararg " : "");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append(": ");
        sb.append(RemoteActionCompatParcelizer());
        return sb.toString();
    }
}
