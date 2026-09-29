package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class NotesSubscriptionResponse {
    public static final write AudioAttributesCompatParcelizer = new write(0);
    private final NotesSubscriptionResponse IconCompatParcelizer;
    private final List<setDefault> RemoteActionCompatParcelizer;
    private final CourseConfigV2VideoProperties read;
    private final Map<getBadgeText, setDefault> write;

    /* JADX WARN: Multi-variable type inference failed */
    private NotesSubscriptionResponse(NotesSubscriptionResponse notesSubscriptionResponse, CourseConfigV2VideoProperties courseConfigV2VideoProperties, List<? extends setDefault> list, Map<getBadgeText, ? extends setDefault> map) {
        this.IconCompatParcelizer = notesSubscriptionResponse;
        this.read = courseConfigV2VideoProperties;
        this.RemoteActionCompatParcelizer = list;
        this.write = map;
    }

    public final CourseConfigV2VideoProperties read() {
        return this.read;
    }

    public final List<setDefault> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setDefault AudioAttributesCompatParcelizer(getPlanAddOns getplanaddons) {
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getplanaddons.RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText) {
            return this.write.get(getquestionlimitRemoteActionCompatParcelizer);
        }
        return null;
    }

    public final boolean RemoteActionCompatParcelizer(CourseConfigV2VideoProperties courseConfigV2VideoProperties) {
        toMagicModuleMetaRepoModel.write(courseConfigV2VideoProperties, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, courseConfigV2VideoProperties)) {
            return true;
        }
        NotesSubscriptionResponse notesSubscriptionResponse = this.IconCompatParcelizer;
        return notesSubscriptionResponse != null && notesSubscriptionResponse.RemoteActionCompatParcelizer(courseConfigV2VideoProperties);
    }

    public static final class write {
        private write() {
        }

        public static NotesSubscriptionResponse RemoteActionCompatParcelizer(NotesSubscriptionResponse notesSubscriptionResponse, CourseConfigV2VideoProperties courseConfigV2VideoProperties, List<? extends setDefault> list) {
            toMagicModuleMetaRepoModel.write(courseConfigV2VideoProperties, "");
            toMagicModuleMetaRepoModel.write(list, "");
            List<getBadgeText> listAudioAttributesCompatParcelizer = courseConfigV2VideoProperties.MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
            List<getBadgeText> list2 = listAudioAttributesCompatParcelizer;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((getBadgeText) it.next()).AudioAttributesImplBaseParcelizer());
            }
            return new NotesSubscriptionResponse(notesSubscriptionResponse, courseConfigV2VideoProperties, list, VideoTimelineResponseBody.read(IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(arrayList, list)), (byte) 0);
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public /* synthetic */ NotesSubscriptionResponse(NotesSubscriptionResponse notesSubscriptionResponse, CourseConfigV2VideoProperties courseConfigV2VideoProperties, List list, Map map, byte b) {
        this(notesSubscriptionResponse, courseConfigV2VideoProperties, list, map);
    }
}
