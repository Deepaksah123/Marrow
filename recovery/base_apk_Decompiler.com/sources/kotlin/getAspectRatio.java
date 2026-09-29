package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.setMsInterimHtmlStartTime;

/* JADX INFO: loaded from: classes4.dex */
public final class getAspectRatio extends hasImageCitation implements RecentUpdatesReferences {
    private final Annotation IconCompatParcelizer;

    @Override // kotlin.RecentUpdatesReferences
    public final boolean read() {
        return false;
    }

    public getAspectRatio(Annotation annotation) {
        toMagicModuleMetaRepoModel.write(annotation, "");
        this.IconCompatParcelizer = annotation;
    }

    public final Annotation RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.RecentUpdatesReferences
    public final Collection<setTagsList> IconCompatParcelizer() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = MagicModuleFeedbackRequestBody.IconCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(this.IconCompatParcelizer)).getDeclaredMethods();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredMethods, "");
        Method[] methodArr = declaredMethods;
        ArrayList arrayList = new ArrayList(methodArr.length);
        for (Method method : methodArr) {
            setMsInterimHtmlStartTime.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = setMsInterimHtmlStartTime.write;
            Object objInvoke = method.invoke(this.IconCompatParcelizer, new Object[0]);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objInvoke, "");
            arrayList.add(setMsInterimHtmlStartTime.AudioAttributesCompatParcelizer.read(objInvoke, getRelatedLessonId.RemoteActionCompatParcelizer(method.getName())));
        }
        return arrayList;
    }

    @Override // kotlin.RecentUpdatesReferences
    public final RevisionSubjectStatusModel write() {
        return getFinalImageUrl.AudioAttributesCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(this.IconCompatParcelizer)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.RecentUpdatesReferences
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public getImageCitation AudioAttributesCompatParcelizer() {
        return new getImageCitation(MagicModuleFeedbackRequestBody.IconCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(this.IconCompatParcelizer)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof getAspectRatio) && this.IconCompatParcelizer == ((getAspectRatio) obj).IconCompatParcelizer;
    }

    public final int hashCode() {
        return System.identityHashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }
}
