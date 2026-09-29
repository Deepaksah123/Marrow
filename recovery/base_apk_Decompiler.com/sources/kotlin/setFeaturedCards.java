package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class setFeaturedCards implements getTestModels {
    private final getAnswerMap<getResultTimeStamp, Boolean> AudioAttributesCompatParcelizer;
    private final Map<getRelatedLessonId, List<extract>> AudioAttributesImplBaseParcelizer;
    private final getAnswerMap<extract, Boolean> IconCompatParcelizer;
    private final Map<getRelatedLessonId, getExpiryTimeStamp> RemoteActionCompatParcelizer;
    private final Map<getRelatedLessonId, getStartTimeStamp> read;
    private final isPaused write;

    /* JADX WARN: Multi-variable type inference failed */
    public setFeaturedCards(isPaused ispaused, getAnswerMap<? super getResultTimeStamp, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(ispaused, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.write = ispaused;
        this.AudioAttributesCompatParcelizer = getanswermap;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        this.IconCompatParcelizer = iconCompatParcelizer;
        getTopRankers gettoprankersIconCompatParcelizer = StateResult.IconCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(ispaused.AudioAttributesImplApi26Parcelizer()), (getAnswerMap) iconCompatParcelizer);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itWrite = gettoprankersIconCompatParcelizer.write();
        while (itWrite.hasNext()) {
            Object next = itWrite.next();
            getRelatedLessonId getrelatedlessonidRatingCompat = ((extract) next).RatingCompat();
            Object obj = linkedHashMap.get(getrelatedlessonidRatingCompat);
            if (obj == null) {
                obj = (List) new ArrayList();
                linkedHashMap.put(getrelatedlessonidRatingCompat, obj);
            }
            ((List) obj).add(next);
        }
        this.AudioAttributesImplBaseParcelizer = linkedHashMap;
        getTopRankers gettoprankersIconCompatParcelizer2 = StateResult.IconCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(this.write.MediaBrowserCompatItemReceiver()), (getAnswerMap) this.AudioAttributesCompatParcelizer);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator itWrite2 = gettoprankersIconCompatParcelizer2.write();
        while (itWrite2.hasNext()) {
            Object next2 = itWrite2.next();
            linkedHashMap2.put(((getExpiryTimeStamp) next2).RatingCompat(), next2);
        }
        this.RemoteActionCompatParcelizer = linkedHashMap2;
        Collection<getStartTimeStamp> collectionMediaBrowserCompatMediaItem = this.write.MediaBrowserCompatMediaItem();
        getAnswerMap<getResultTimeStamp, Boolean> getanswermap2 = this.AudioAttributesCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionMediaBrowserCompatMediaItem) {
            if (getanswermap2.invoke((getResultTimeStamp) obj2).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = arrayList;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10)), 16));
        for (Object obj3 : arrayList2) {
            linkedHashMap3.put(((getStartTimeStamp) obj3).RatingCompat(), obj3);
        }
        this.read = linkedHashMap3;
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<extract, Boolean> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(extract extractVar) {
            toMagicModuleMetaRepoModel.write(extractVar, "");
            return Boolean.valueOf(((Boolean) setFeaturedCards.this.AudioAttributesCompatParcelizer.invoke(extractVar)).booleanValue() && !getAvailabilityType.AudioAttributesCompatParcelizer((getResultTimeStamp) extractVar));
        }

        IconCompatParcelizer() {
            super(1);
        }
    }

    @Override // kotlin.getTestModels
    public final Collection<extract> RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        List<extract> list = this.AudioAttributesImplBaseParcelizer.get(getrelatedlessonid);
        return list != null ? list : IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getTestModels
    public final Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
        getTopRankers gettoprankersIconCompatParcelizer = StateResult.IconCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(this.write.AudioAttributesImplApi26Parcelizer()), (getAnswerMap) this.IconCompatParcelizer);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator itWrite = gettoprankersIconCompatParcelizer.write();
        while (itWrite.hasNext()) {
            linkedHashSet.add(((extract) itWrite.next()).RatingCompat());
        }
        return linkedHashSet;
    }

    @Override // kotlin.getTestModels
    public final getExpiryTimeStamp write(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        return this.RemoteActionCompatParcelizer.get(getrelatedlessonid);
    }

    @Override // kotlin.getTestModels
    public final Set<getRelatedLessonId> IconCompatParcelizer() {
        getTopRankers gettoprankersIconCompatParcelizer = StateResult.IconCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(this.write.MediaBrowserCompatItemReceiver()), (getAnswerMap) this.AudioAttributesCompatParcelizer);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator itWrite = gettoprankersIconCompatParcelizer.write();
        while (itWrite.hasNext()) {
            linkedHashSet.add(((getExpiryTimeStamp) itWrite.next()).RatingCompat());
        }
        return linkedHashSet;
    }

    @Override // kotlin.getTestModels
    public final Set<getRelatedLessonId> RemoteActionCompatParcelizer() {
        return this.read.keySet();
    }

    @Override // kotlin.getTestModels
    public final getStartTimeStamp IconCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        return this.read.get(getrelatedlessonid);
    }
}
