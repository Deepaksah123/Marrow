package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0086\u0001\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0086\b\u001a/\u0010%\u001a\u00020&\"\u0004\b\u0000\u0010'*\u0012\u0012\u0004\u0012\u0002H'0(j\b\u0012\u0004\u0012\u0002H'`)2\u0006\u0010*\u001a\u0002H'H\u0002¢\u0006\u0002\u0010+\u001a'\u0010,\u001a\u0002H'\"\u0004\b\u0000\u0010'*\u0012\u0012\u0004\u0012\u0002H'0(j\b\u0012\u0004\u0012\u0002H'`)H\u0002¢\u0006\u0002\u0010-\u001a'\u0010.\u001a\u0002H'\"\u0004\b\u0000\u0010'*\u0012\u0012\u0004\u0012\u0002H'0(j\b\u0012\u0004\u0012\u0002H'`)H\u0002¢\u0006\u0002\u0010-¨\u0006/"}, d2 = {"path", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "name", "", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "pathBuilder", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Lkotlin/ExtensionFunctionType;", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "group", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "block", "push", "", "T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "pop", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "peek", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findInjectables {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean write(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T read(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T AudioAttributesCompatParcelizer(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }
}
