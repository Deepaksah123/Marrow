package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0002¢\u0006\u0004\b\u0005\u0010\u000b"}, d2 = {"Lo/replace;", "p0", "p1", "", "p2", "RemoteActionCompatParcelizer", "(Lo/replace;Lo/replace;F)Lo/replace;", "Lo/switchToNext;", "read", "(JF)J", "Lkotlin/Function0;", "(FLo/getCreatedOnDateMs;)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class isCaseInsensitive {
    public static final replace RemoteActionCompatParcelizer(replace replaceVar, replace replaceVar2, float f) {
        boolean z = replaceVar instanceof _hashCode;
        if (!z && !(replaceVar2 instanceof _hashCode)) {
            return replace.INSTANCE.AudioAttributesCompatParcelizer(RequestPayload.IconCompatParcelizer(replaceVar.getIconCompatParcelizer(), replaceVar2.getIconCompatParcelizer(), f));
        }
        if (z && (replaceVar2 instanceof _hashCode)) {
            _hashCode _hashcode = (_hashCode) replaceVar;
            _hashCode _hashcode2 = (_hashCode) replaceVar2;
            return replace.INSTANCE.RemoteActionCompatParcelizer((Instantiatable) _convertObjectId.IconCompatParcelizer(_hashcode.RemoteActionCompatParcelizer(), _hashcode2.RemoteActionCompatParcelizer(), f), AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(_hashcode.getWrite(), _hashcode2.getWrite(), f));
        }
        return (replace) _convertObjectId.IconCompatParcelizer(replaceVar, replaceVar2, f);
    }

    public static final long read(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : switchToNext.AudioAttributesCompatParcelizer$default(j, switchToNext.RemoteActionCompatParcelizer(j) * f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RemoteActionCompatParcelizer(float f, getCreatedOnDateMs<Float> getcreatedondatems) {
        return Float.isNaN(f) ? getcreatedondatems.invoke().floatValue() : f;
    }
}
