package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bç\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH&J\"\u0010\n\u001a\u00020\u000b*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\"\u0010\u000f\u001a\u00020\u000b*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\"\u0010\u0011\u001a\u00020\u000b*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\"\u0010\u0012\u001a\u00020\u000b*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasurePolicy;", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "minIntrinsicWidth", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicHeight", "width", "maxIntrinsicWidth", "maxIntrinsicHeight", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface withTypeHandler {
    withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j);

    default int write(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new findSuperType(list.get(i2), hasGenericTypes.IconCompatParcelizer, getTypeHandler.read));
        }
        long j = PropertyValueBuffer.read$default(0, 0, 0, i, 7, null);
        return AudioAttributesCompatParcelizer(new isArrayType(getvaluehandler, getvaluehandler.getAudioAttributesCompatParcelizer()), arrayList, j).getWrite();
    }

    default int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new findSuperType(list.get(i2), hasGenericTypes.IconCompatParcelizer, getTypeHandler.IconCompatParcelizer));
        }
        long j = PropertyValueBuffer.read$default(0, i, 0, 0, 13, null);
        return AudioAttributesCompatParcelizer(new isArrayType(getvaluehandler, getvaluehandler.getAudioAttributesCompatParcelizer()), arrayList, j).getAudioAttributesCompatParcelizer();
    }

    default int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new findSuperType(list.get(i2), hasGenericTypes.RemoteActionCompatParcelizer, getTypeHandler.read));
        }
        long j = PropertyValueBuffer.read$default(0, 0, 0, i, 7, null);
        return AudioAttributesCompatParcelizer(new isArrayType(getvaluehandler, getvaluehandler.getAudioAttributesCompatParcelizer()), arrayList, j).getWrite();
    }

    default int read(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new findSuperType(list.get(i2), hasGenericTypes.RemoteActionCompatParcelizer, getTypeHandler.IconCompatParcelizer));
        }
        long j = PropertyValueBuffer.read$default(0, i, 0, 0, 13, null);
        return AudioAttributesCompatParcelizer(new isArrayType(getvaluehandler, getvaluehandler.getAudioAttributesCompatParcelizer()), arrayList, j).getAudioAttributesCompatParcelizer();
    }
}
