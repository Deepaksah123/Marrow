package kotlin;

import com.marrow.data.models.common.CourseConfigV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.addConnectionCallbacks;
import kotlin.findNalUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class enableAutoManage {
    public static final addConnectionCallbacks AudioAttributesCompatParcelizer(findNalUnit findnalunit) {
        toMagicModuleMetaRepoModel.write(findnalunit, "");
        if (findnalunit instanceof findNalUnit.read) {
            findNalUnit.read readVar = (findNalUnit.read) findnalunit;
            return new addConnectionCallbacks.RemoteActionCompatParcelizer(readVar.getAudioAttributesCompatParcelizer(), readVar.getWrite() ? readVar.getRemoteActionCompatParcelizer() : false);
        }
        if (findnalunit instanceof findNalUnit.AudioAttributesCompatParcelizer) {
            findNalUnit.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (findNalUnit.AudioAttributesCompatParcelizer) findnalunit;
            return write(audioAttributesCompatParcelizer.getWrite(), audioAttributesCompatParcelizer.getIconCompatParcelizer(), audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer());
        }
        if (!(findnalunit instanceof findNalUnit.RemoteActionCompatParcelizer)) {
            throw new RenewEligibleCreator();
        }
        return new addConnectionCallbacks.AudioAttributesCompatParcelizer(((findNalUnit.RemoteActionCompatParcelizer) findnalunit).RemoteActionCompatParcelizer());
    }

    private static addConnectionCallbacks.write write(getH265NalUnitType geth265nalunittype, int i, int i2) {
        String strRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(geth265nalunittype, "");
        String strIconCompatParcelizer = geth265nalunittype.IconCompatParcelizer();
        if (strIconCompatParcelizer == null) {
            strIconCompatParcelizer = "";
        }
        addConnectionCallbacks.write.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new addConnectionCallbacks.write.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i, i2, strIconCompatParcelizer);
        boolean z = (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(geth265nalunittype.write(), Boolean.TRUE) || (strRemoteActionCompatParcelizer = geth265nalunittype.RemoteActionCompatParcelizer()) == null || strRemoteActionCompatParcelizer.length() == 0) ? false : true;
        String strRemoteActionCompatParcelizer2 = geth265nalunittype.RemoteActionCompatParcelizer();
        return new addConnectionCallbacks.write(audioAttributesCompatParcelizer, z, new addConnectionCallbacks.write.IconCompatParcelizer.read(strRemoteActionCompatParcelizer2 != null ? strRemoteActionCompatParcelizer2 : ""));
    }

    public static final getH265NalUnitType RemoteActionCompatParcelizer(List<CourseConfigV2.ZenAreaItem> list) {
        Object next;
        Object next2;
        ArrayList arrayListRemoteActionCompatParcelizer;
        Map<String, Object> meta;
        Map<String, Object> meta2;
        Map<String, Object> meta3;
        toMagicModuleMetaRepoModel.write(list, "");
        List<CourseConfigV2.ZenAreaItem> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((CourseConfigV2.ZenAreaItem) next).getType(), (Object) "practical_cta")) {
                break;
            }
        }
        CourseConfigV2.ZenAreaItem zenAreaItem = (CourseConfigV2.ZenAreaItem) next;
        Object obj = (zenAreaItem == null || (meta3 = zenAreaItem.getMeta()) == null) ? null : meta3.get("text");
        String str = obj instanceof String ? (String) obj : null;
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((CourseConfigV2.ZenAreaItem) next2).getType(), (Object) "module_counter_bottom")) {
                break;
            }
        }
        CourseConfigV2.ZenAreaItem zenAreaItem2 = (CourseConfigV2.ZenAreaItem) next2;
        Object obj2 = (zenAreaItem2 == null || (meta2 = zenAreaItem2.getMeta()) == null) ? null : meta2.get("group_id");
        List list3 = obj2 instanceof List ? (List) obj2 : null;
        if (list3 == null) {
            arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list3) {
                Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
                if (num != null) {
                    arrayList.add(num);
                }
            }
            arrayListRemoteActionCompatParcelizer = arrayList;
        }
        Object obj4 = (zenAreaItem2 == null || (meta = zenAreaItem2.getMeta()) == null) ? null : meta.get("text");
        return new getH265NalUnitType(obj4 instanceof String ? (String) obj4 : null, arrayListRemoteActionCompatParcelizer, Boolean.valueOf(PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(str)), str);
    }
}
