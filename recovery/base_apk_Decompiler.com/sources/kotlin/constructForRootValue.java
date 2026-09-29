package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u008f\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00122\u0010\u000f\u001a.\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b\u0012(\u0010\u0011\u001a$\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR@\u0010\u0018\u001a.\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR6\u0010\"\u001a$\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001c"}, d2 = {"Lo/constructForRootValue;", "T", "R", "", "", "Lo/JsonReadContext;", "p0", "Lkotlin/Function1;", "Lo/setCurrentName;", "", "p1", "Lkotlin/Function4;", "Lo/JsonReadFeature;", "Lo/PropertyBasedObjectIdGenerator;", "", "p2", "Lkotlin/Function3;", "p3", "Lo/PropertyBasedCreator;", "p4", "<init>", "(Ljava/util/Set;Lo/getAnswerMap;Lo/getMagicModuleStat;Lo/getModuleData;Lo/PropertyBasedCreator;)V", "write", "()Ljava/util/List;", "read", "(Lo/setCurrentName;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "(Lo/setCurrentName;)V", "Ljava/util/Set;", "MediaBrowserCompatItemReceiver", "Lo/getAnswerMap;", "Lo/getMagicModuleStat;", "RemoteActionCompatParcelizer", "Lo/getModuleData;", "IconCompatParcelizer", "Lo/PropertyBasedCreator;", "", "", "Ljava/util/Map;", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class constructForRootValue<T, R> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getMagicModuleStat<JsonReadFeature, PropertyBasedObjectIdGenerator, List<? extends T>, List<? extends R>, T> read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final PropertyBasedCreator RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getAnswerMap<setCurrentName, getShowPopup> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getModuleData<setCurrentName, T, List<? extends setCurrentName>, R> IconCompatParcelizer;
    private final Set<JsonReadContext> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Map<setCurrentName, List<setCurrentName>> AudioAttributesImplApi21Parcelizer = new LinkedHashMap();

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final Map<setCurrentName, R> AudioAttributesImplApi26Parcelizer = new LinkedHashMap();

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final Set<setCurrentName> MediaBrowserCompatCustomActionResultReceiver = new LinkedHashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public constructForRootValue(Set<? extends JsonReadContext> set, getAnswerMap<? super setCurrentName, getShowPopup> getanswermap, getMagicModuleStat<? super JsonReadFeature, ? super PropertyBasedObjectIdGenerator, ? super List<? extends T>, ? super List<? extends R>, ? extends T> getmagicmodulestat, getModuleData<? super setCurrentName, ? super T, ? super List<? extends setCurrentName>, ? extends R> getmoduledata, PropertyBasedCreator propertyBasedCreator) {
        this.write = set;
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.read = getmagicmodulestat;
        this.IconCompatParcelizer = getmoduledata;
        this.RemoteActionCompatParcelizer = propertyBasedCreator;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            setCurrentName setcurrentnameWrite = clearAndGetParent.write((JsonReadContext) it.next());
            if (setcurrentnameWrite != null) {
                AudioAttributesCompatParcelizer(setcurrentnameWrite);
            }
        }
    }

    public final List<R> write() {
        Set<setCurrentName> set = this.MediaBrowserCompatCustomActionResultReceiver;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            R r = read((setCurrentName) it.next());
            if (r != null) {
                arrayList.add(r);
            }
        }
        return arrayList;
    }

    private final R read(setCurrentName p0) {
        if (this.AudioAttributesImplApi26Parcelizer.containsKey(p0)) {
            return this.AudioAttributesImplApi26Parcelizer.get(p0);
        }
        JsonReadContext jsonReadContextRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
        List<setCurrentName> listRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.get(p0);
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Iterator<setCurrentName> it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            read(it.next());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<setCurrentName> arrayList = new ArrayList();
        for (T t : listRemoteActionCompatParcelizer) {
            if (this.AudioAttributesImplApi26Parcelizer.containsKey((setCurrentName) t)) {
                arrayList.add(t);
            }
        }
        for (setCurrentName setcurrentname : arrayList) {
            JsonReadFeature jsonReadFeatureWrite = setcurrentname.write();
            toMagicModuleMetaRepoModel.write(jsonReadFeatureWrite);
            Object obj = linkedHashMap.get(jsonReadFeatureWrite);
            if (obj == null) {
                obj = (List) new ArrayList();
                linkedHashMap.put(jsonReadFeatureWrite, obj);
            }
            R r = this.AudioAttributesImplApi26Parcelizer.get(setcurrentname);
            toMagicModuleMetaRepoModel.write(r);
            ((List) obj).add(r);
        }
        this.AudioAttributesCompatParcelizer.invoke(p0);
        R rAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0, (T) startBuilding.write(jsonReadContextRemoteActionCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, linkedHashMap), listRemoteActionCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer.put(p0, rAudioAttributesCompatParcelizer);
        return rAudioAttributesCompatParcelizer;
    }

    private final void AudioAttributesCompatParcelizer(setCurrentName p0) {
        setCurrentName setcurrentnameIconCompatParcelizer = p0.IconCompatParcelizer();
        while (setcurrentnameIconCompatParcelizer != null) {
            Map<setCurrentName, List<setCurrentName>> map = this.AudioAttributesImplApi21Parcelizer;
            ArrayList arrayList = map.get(setcurrentnameIconCompatParcelizer);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(setcurrentnameIconCompatParcelizer, arrayList);
            }
            List<setCurrentName> list = arrayList;
            if (list.contains(p0)) {
                return;
            }
            list.add(p0);
            setCurrentName setcurrentname = setcurrentnameIconCompatParcelizer;
            setcurrentnameIconCompatParcelizer = setcurrentnameIconCompatParcelizer.IconCompatParcelizer();
            p0 = setcurrentname;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.add(p0);
    }
}
