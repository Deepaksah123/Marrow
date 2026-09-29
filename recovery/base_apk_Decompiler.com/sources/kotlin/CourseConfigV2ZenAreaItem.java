package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TaxPercentInfoCompanion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CourseConfigV2ZenAreaItem<Type extends TaxPercentInfoCompanion> {
    public abstract List<Pair<getRelatedLessonId, Type>> AudioAttributesCompatParcelizer();

    private CourseConfigV2ZenAreaItem() {
    }

    public final <Other extends TaxPercentInfoCompanion> CourseConfigV2ZenAreaItem<Other> IconCompatParcelizer(getAnswerMap<? super Type, ? extends Other> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        if (this instanceof CourseConfigV2NavDrawerItemMarrowNotes) {
            CourseConfigV2NavDrawerItemMarrowNotes courseConfigV2NavDrawerItemMarrowNotes = (CourseConfigV2NavDrawerItemMarrowNotes) this;
            return new CourseConfigV2NavDrawerItemMarrowNotes(courseConfigV2NavDrawerItemMarrowNotes.read(), getanswermap.invoke(courseConfigV2NavDrawerItemMarrowNotes.IconCompatParcelizer()));
        }
        if (!(this instanceof getMiddleSection)) {
            throw new RenewEligibleCreator();
        }
        List<Pair<getRelatedLessonId, Type>> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
        Iterator<T> it = listAudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(setAction.write((getRelatedLessonId) pair.RemoteActionCompatParcelizer(), getanswermap.invoke((TaxPercentInfoCompanion) pair.read())));
        }
        return new getMiddleSection(arrayList);
    }

    public /* synthetic */ CourseConfigV2ZenAreaItem(byte b) {
        this();
    }
}
