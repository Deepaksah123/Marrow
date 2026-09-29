package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000e\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\t\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\t\u0010\u000fJ/\u0010\u0010\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ/\u0010\u0011\u001a\u00020\r*\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00032\u0006\u0010\u0007\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/findBackReference;", "", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "IconCompatParcelizer", "(Lo/getValueHandler;Ljava/util/List;I)I", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface findBackReference {
    withHandlersFrom read(withContentValueHandler withcontentvaluehandler, List<? extends List<? extends isTypeOrSuperTypeOf>> list, long j);

    default int IconCompatParcelizer(getValueHandler getvaluehandler, List<? extends List<? extends hasHandlers>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList2 = arrayList;
            List<? extends hasHandlers> list2 = list.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new findSuperType(list2.get(i3), hasGenericTypes.IconCompatParcelizer, getTypeHandler.read));
            }
            arrayList2.add(arrayList3);
        }
        return read(new isArrayType(getvaluehandler, getvaluehandler.getAudioAttributesCompatParcelizer()), arrayList, PropertyValueBuffer.read$default(0, 0, 0, i, 7, null)).getWrite();
    }

    default int read(getValueHandler getvaluehandler, List<? extends List<? extends hasHandlers>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList2 = arrayList;
            List<? extends hasHandlers> list2 = list.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new findSuperType(list2.get(i3), hasGenericTypes.IconCompatParcelizer, getTypeHandler.IconCompatParcelizer));
            }
            arrayList2.add(arrayList3);
        }
        return read(new isArrayType(getvaluehandler, getvaluehandler.getAudioAttributesCompatParcelizer()), arrayList, PropertyValueBuffer.read$default(0, i, 0, 0, 13, null)).getAudioAttributesCompatParcelizer();
    }

    default int write(getValueHandler getvaluehandler, List<? extends List<? extends hasHandlers>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList2 = arrayList;
            List<? extends hasHandlers> list2 = list.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new findSuperType(list2.get(i3), hasGenericTypes.RemoteActionCompatParcelizer, getTypeHandler.read));
            }
            arrayList2.add(arrayList3);
        }
        return read(new isArrayType(getvaluehandler, getvaluehandler.getAudioAttributesCompatParcelizer()), arrayList, PropertyValueBuffer.read$default(0, 0, 0, i, 7, null)).getWrite();
    }

    default int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends List<? extends hasHandlers>> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList2 = arrayList;
            List<? extends hasHandlers> list2 = list.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new findSuperType(list2.get(i3), hasGenericTypes.RemoteActionCompatParcelizer, getTypeHandler.IconCompatParcelizer));
            }
            arrayList2.add(arrayList3);
        }
        return read(new isArrayType(getvaluehandler, getvaluehandler.getAudioAttributesCompatParcelizer()), arrayList, PropertyValueBuffer.read$default(0, i, 0, 0, 13, null)).getAudioAttributesCompatParcelizer();
    }
}
