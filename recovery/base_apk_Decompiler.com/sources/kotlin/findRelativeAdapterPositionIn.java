package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001ao\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/deserializeFromNumber;", "Lo/AbstractDeserializer;", "p0", "Lo/deserializeWithObjectId;", "p1", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p2", "", "p3", "", "p4", "Lo/paramName;", "p5", "Lo/bufferMapProperty;", "p6", "Lo/tryToResolveUnresolved;", "p7", "Lo/_reportMissingSetter$write;", "p8", "Lo/PropertyValueAny;", "p9", "IconCompatParcelizer", "(Lo/deserializeFromNumber;Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Ljava/util/List;IZILo/bufferMapProperty;Lo/tryToResolveUnresolved;Lo/_reportMissingSetter$write;J)Z", "", "read", "(Lo/deserializeFromNumber;I)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findRelativeAdapterPositionIn {
    public static final boolean IconCompatParcelizer(deserializeFromNumber deserializefromnumber, AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, int i, boolean z, int i2, bufferMapProperty buffermapproperty, tryToResolveUnresolved trytoresolveunresolved, _reportMissingSetter.write writeVar, long j) {
        deserializeFromBoolean iconCompatParcelizer = deserializefromnumber.getIconCompatParcelizer();
        if (deserializefromnumber.getWrite().getRead().AudioAttributesCompatParcelizer() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer.getWrite(), abstractDeserializer) || !iconCompatParcelizer.getRead().read(deserializewithobjectid) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), list) || iconCompatParcelizer.getIconCompatParcelizer() != i || iconCompatParcelizer.getRemoteActionCompatParcelizer() != z || !paramName.write(iconCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver(), i2) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer.getAudioAttributesImplBaseParcelizer(), buffermapproperty) || iconCompatParcelizer.getMediaBrowserCompatItemReceiver() != trytoresolveunresolved || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer.getAudioAttributesImplApi21Parcelizer(), writeVar) || PropertyValueAny.MediaBrowserCompatItemReceiver(j) != PropertyValueAny.MediaBrowserCompatItemReceiver(iconCompatParcelizer.getAudioAttributesImplApi26Parcelizer())) {
            return false;
        }
        if (z || paramName.write(i2, paramName.INSTANCE.read())) {
            return PropertyValueAny.AudioAttributesImplBaseParcelizer(j) == PropertyValueAny.AudioAttributesImplBaseParcelizer(iconCompatParcelizer.getAudioAttributesImplApi26Parcelizer()) && PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) == PropertyValueAny.AudioAttributesImplApi21Parcelizer(iconCompatParcelizer.getAudioAttributesImplApi26Parcelizer());
        }
        return true;
    }

    public static final float read(deserializeFromNumber deserializefromnumber, int i) {
        if (i < 0 || deserializefromnumber.getIconCompatParcelizer().getWrite().length() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int iMin = Math.min(deserializefromnumber.getWrite().write(i), Math.min(deserializefromnumber.getWrite().getWrite() - 1, deserializefromnumber.getWrite().getAudioAttributesImplBaseParcelizer() - 1));
        return i > _checkImplicitlyNamedConstructors.IconCompatParcelizer$default(deserializefromnumber.getWrite(), iMin, false, 2, null) ? BitmapDescriptorFactory.HUE_RED : deserializefromnumber.getWrite().AudioAttributesImplApi26Parcelizer(iMin);
    }
}
