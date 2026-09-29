package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getOption3AnsweredCount {
    public static final getOption3AnsweredCount AudioAttributesCompatParcelizer = new getOption3AnsweredCount();

    private getOption3AnsweredCount() {
    }

    public static getAnswerPointer AudioAttributesCompatParcelizer(List<? extends getMagicLine<?>> list, getLink getlink) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        return new isActiveLessonPaid(list, getlink);
    }

    public static /* synthetic */ getMagicLine RemoteActionCompatParcelizer(getOption3AnsweredCount getoption3answeredcount, Object obj) {
        return getoption3answeredcount.write(obj, null);
    }

    public final getMagicLine<?> write(Object obj, getTopSection gettopsection) {
        if (obj instanceof Byte) {
            return new getBookmarkLastUpdated(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new getTotalAnswerCount(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new getOption6AnsweredCount(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new getStatusUpdateStartTimeMs(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new getBookmarkId(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new getOption4AnsweredCount(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new getOption2AnsweredCount(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new getFeedbackStatus(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new getStatusUpdateEndTimeMs((String) obj);
        }
        if (obj instanceof byte[]) {
            return RemoteActionCompatParcelizer(getOrderDetails.AudioAttributesCompatParcelizer((byte[]) obj), gettopsection, getShowNotesWatermark.BYTE);
        }
        if (obj instanceof short[]) {
            return RemoteActionCompatParcelizer(getOrderDetails.write((short[]) obj), gettopsection, getShowNotesWatermark.SHORT);
        }
        if (obj instanceof int[]) {
            return RemoteActionCompatParcelizer(getOrderDetails.AudioAttributesImplApi26Parcelizer((int[]) obj), gettopsection, getShowNotesWatermark.INT);
        }
        if (obj instanceof long[]) {
            return RemoteActionCompatParcelizer(getOrderDetails.write((long[]) obj), gettopsection, getShowNotesWatermark.LONG);
        }
        if (obj instanceof char[]) {
            return RemoteActionCompatParcelizer(getOrderDetails.IconCompatParcelizer((char[]) obj), gettopsection, getShowNotesWatermark.CHAR);
        }
        if (obj instanceof float[]) {
            return RemoteActionCompatParcelizer(getOrderDetails.RemoteActionCompatParcelizer((float[]) obj), gettopsection, getShowNotesWatermark.FLOAT);
        }
        if (obj instanceof double[]) {
            return RemoteActionCompatParcelizer(getOrderDetails.read((double[]) obj), gettopsection, getShowNotesWatermark.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return RemoteActionCompatParcelizer(getOrderDetails.IconCompatParcelizer((boolean[]) obj), gettopsection, getShowNotesWatermark.BOOLEAN);
        }
        if (obj == null) {
            return new getReferences();
        }
        return null;
    }

    private final getAnswerPointer RemoteActionCompatParcelizer(List<?> list, getTopSection gettopsection, getShowNotesWatermark getshownoteswatermark) {
        List listOnPlay = IntermediateLoginResponseBody.onPlay(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listOnPlay.iterator();
        while (it.hasNext()) {
            getMagicLine getmagiclineRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this, it.next());
            if (getmagiclineRemoteActionCompatParcelizer != null) {
                arrayList.add(getmagiclineRemoteActionCompatParcelizer);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (gettopsection != null) {
            getHref gethrefAudioAttributesCompatParcelizer = gettopsection.write().AudioAttributesCompatParcelizer(getshownoteswatermark);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAudioAttributesCompatParcelizer, "");
            return new isActiveLessonPaid(arrayList2, gethrefAudioAttributesCompatParcelizer);
        }
        return new getAnswerPointer(arrayList2, new IconCompatParcelizer(getshownoteswatermark));
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getTopSection, getLink> {
        private /* synthetic */ getShowNotesWatermark write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public getLink invoke(getTopSection gettopsection) {
            toMagicModuleMetaRepoModel.write(gettopsection, "");
            getHref gethrefAudioAttributesCompatParcelizer = gettopsection.write().AudioAttributesCompatParcelizer(this.write);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAudioAttributesCompatParcelizer, "");
            return gethrefAudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(getShowNotesWatermark getshownoteswatermark) {
            super(1);
            this.write = getshownoteswatermark;
        }
    }
}
