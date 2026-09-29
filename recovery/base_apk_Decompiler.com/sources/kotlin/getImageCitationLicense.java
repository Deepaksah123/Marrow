package kotlin;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getImageCitationLicense {
    public static final List<getAspectRatio> IconCompatParcelizer(Annotation[] annotationArr) {
        toMagicModuleMetaRepoModel.write(annotationArr, "");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new getAspectRatio(annotation));
        }
        return arrayList;
    }

    public static final getAspectRatio RemoteActionCompatParcelizer(Annotation[] annotationArr, getNotesCount getnotescount) {
        Annotation annotation;
        toMagicModuleMetaRepoModel.write(annotationArr, "");
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getFinalImageUrl.AudioAttributesCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(annotation))).AudioAttributesCompatParcelizer(), getnotescount)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new getAspectRatio(annotation);
        }
        return null;
    }
}
