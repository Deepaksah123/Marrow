package kotlin;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class promptContactVerificationFlow {
    public static final isHdPlaybackError<?> read(deleteOfflineDownloadedFiles deleteofflinedownloadedfiles) {
        isHdPlaybackError<?> ishdplaybackerrorAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(deleteofflinedownloadedfiles, "");
        isApiBlockError isapiblockerror = deleteofflinedownloadedfiles.read();
        if (isapiblockerror == null || (ishdplaybackerrorAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(isapiblockerror)) == null) {
            throw new component28("Cannot calculate JVM erasure for type: ".concat(String.valueOf(deleteofflinedownloadedfiles)));
        }
        return ishdplaybackerrorAudioAttributesCompatParcelizer;
    }

    public static final isHdPlaybackError<?> AudioAttributesCompatParcelizer(isApiBlockError isapiblockerror) {
        Object obj;
        isHdPlaybackError<?> ishdplaybackerror;
        toMagicModuleMetaRepoModel.write(isapiblockerror, "");
        if (isapiblockerror instanceof isHdPlaybackError) {
            return (isHdPlaybackError) isapiblockerror;
        }
        if (isapiblockerror instanceof deleteCourseTables) {
            List<deleteOfflineDownloadedFiles> listRemoteActionCompatParcelizer = ((deleteCourseTables) isapiblockerror).RemoteActionCompatParcelizer();
            Iterator<T> it = listRemoteActionCompatParcelizer.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                deleteOfflineDownloadedFiles deleteofflinedownloadedfiles = (deleteOfflineDownloadedFiles) next;
                toMagicModuleMetaRepoModel.read(deleteofflinedownloadedfiles, "");
                getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = ((component26) deleteofflinedownloadedfiles).AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer : null;
                if (courseConfigV2CustomModuleQuestionSource != null && courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer() != getQuestionSource.INTERFACE && courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer() != getQuestionSource.ANNOTATION_CLASS) {
                    obj = next;
                    break;
                }
            }
            deleteOfflineDownloadedFiles deleteofflinedownloadedfiles2 = (deleteOfflineDownloadedFiles) obj;
            if (deleteofflinedownloadedfiles2 == null) {
                deleteofflinedownloadedfiles2 = (deleteOfflineDownloadedFiles) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) listRemoteActionCompatParcelizer);
            }
            return (deleteofflinedownloadedfiles2 == null || (ishdplaybackerror = read(deleteofflinedownloadedfiles2)) == null) ? toMagicModuleMetaDataUcModel.write(Object.class) : ishdplaybackerror;
        }
        throw new component28("Cannot calculate JVM erasure for type: ".concat(String.valueOf(isapiblockerror)));
    }
}
