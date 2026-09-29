package kotlin;

import com.marrow.data.models.subject.Subject;
import com.marrow.data.models.subject.UpdatedStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class elementSet implements DebugTextViewHelper {
    private final getFirstRepresentation AudioAttributesCompatParcelizer;
    private final getSegmentNum IconCompatParcelizer;
    private final loadInitializationData RemoteActionCompatParcelizer;
    private final getSegmentUrl write;

    @setSdkPayload
    public elementSet(getSegmentUrl getsegmenturl, getSegmentNum getsegmentnum, loadInitializationData loadinitializationdata, getFirstRepresentation getfirstrepresentation) {
        toMagicModuleMetaRepoModel.write(getsegmenturl, "");
        toMagicModuleMetaRepoModel.write(getsegmentnum, "");
        toMagicModuleMetaRepoModel.write(loadinitializationdata, "");
        toMagicModuleMetaRepoModel.write(getfirstrepresentation, "");
        this.write = getsegmenturl;
        this.IconCompatParcelizer = getsegmentnum;
        this.RemoteActionCompatParcelizer = loadinitializationdata;
        this.AudioAttributesCompatParcelizer = getfirstrepresentation;
    }

    @Override // kotlin.DebugTextViewHelper
    public final void read(List<? extends Subject> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write.IconCompatParcelizer((PlayerEmsgHandlerManifestExpiryEventInfo[]) list.toArray(new Subject[0]));
        write(list);
        AudioAttributesCompatParcelizer(list);
        RemoteActionCompatParcelizer(list);
    }

    private final void write(List<? extends Subject> list) {
        List<? extends Subject> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Subject) it.next()).getId());
        }
        this.IconCompatParcelizer.IconCompatParcelizer((List<String>) arrayList);
        MediaBrowserCompatItemReceiver(list);
    }

    private final void MediaBrowserCompatItemReceiver(List<? extends Subject> list) {
        ArrayList arrayList = new ArrayList();
        for (Subject subject : list) {
            Map<String, String> imageAttribution = subject.getImageAttribution();
            if (imageAttribution != null) {
                for (Map.Entry<String, String> entry : imageAttribution.entrySet()) {
                    String id = subject.getId();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
                    String key = entry.getKey();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(key, "");
                    String value = entry.getValue();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(value, "");
                    arrayList.add(new getSegmentCount(id, key, value));
                }
            }
        }
        this.IconCompatParcelizer.IconCompatParcelizer(arrayList.toArray(new getSegmentCount[0]));
    }

    private final void RemoteActionCompatParcelizer(List<? extends Subject> list) {
        getFirstRepresentation getfirstrepresentation = this.AudioAttributesCompatParcelizer;
        List<? extends Subject> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Subject) it.next()).getId());
        }
        getfirstrepresentation.write((List<String>) arrayList);
        IconCompatParcelizer(list);
    }

    private final void IconCompatParcelizer(List<? extends Subject> list) {
        DashUtil dashUtil;
        ArrayList arrayList = new ArrayList();
        for (Subject subject : list) {
            UpdatedStatus updatedStatus = subject.getUpdatedStatus();
            if (updatedStatus != null) {
                String id = subject.getId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
                dashUtil = new DashUtil(id, updatedStatus.getIsActive(), updatedStatus.getExpiresOn(), updatedStatus.getActiveEdition());
            } else {
                dashUtil = null;
            }
            if (dashUtil != null) {
                arrayList.add(dashUtil);
            }
        }
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(arrayList.toArray(new DashUtil[0]));
    }

    private final void AudioAttributesCompatParcelizer(List<? extends Subject> list) {
        loadInitializationData loadinitializationdata = this.RemoteActionCompatParcelizer;
        List<? extends Subject> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Subject) it.next()).getId());
        }
        loadinitializationdata.write((List<String>) arrayList);
        AudioAttributesImplBaseParcelizer(list);
    }

    private final void AudioAttributesImplBaseParcelizer(List<? extends Subject> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (Subject subject : list) {
            List<Map<String, String>> suggestedSubjects = subject.getSuggestedSubjects();
            if (suggestedSubjects != null) {
                Iterator<T> it = suggestedSubjects.iterator();
                while (it.hasNext()) {
                    Map map = (Map) it.next();
                    String str2 = (String) map.get("subject_id");
                    if (str2 != null && (str = (String) map.get(Subject.KEY_SUGGESTED_CRITERION)) != null && str2.length() > 0) {
                        String id = subject.getId();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
                        arrayList.add(new loadFormatWithDrmInitData(id, str2, str));
                    }
                }
            }
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(arrayList.toArray(new loadFormatWithDrmInitData[0]));
    }

    @Override // kotlin.DebugTextViewHelper
    public final void IconCompatParcelizer() {
        this.write.ah_();
        this.IconCompatParcelizer.ah_();
        this.RemoteActionCompatParcelizer.ah_();
        this.AudioAttributesCompatParcelizer.ah_();
    }
}
