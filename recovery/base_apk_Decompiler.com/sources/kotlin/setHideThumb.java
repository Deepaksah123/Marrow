package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0000¢\u0006\u0004\b\u000b\u0010\u0011\"\u001a\u0010\u0015\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014"}, d2 = {"Lo/deserializeWithObjectId;", "p0", "Lo/bufferMapProperty;", "p1", "Lo/_reportMissingSetter$write;", "p2", "", "p3", "", "p4", "Lo/getKey;", "read", "(Lo/deserializeWithObjectId;Lo/bufferMapProperty;Lo/_reportMissingSetter$write;Ljava/lang/String;I)J", "Lo/deserializeFromNumber;", "Lo/isAbstract;", "Lkotlin/Function0;", "Lo/WritableTypeIdInclusion;", "(Lo/deserializeFromNumber;Lo/isAbstract;ILo/getCreatedOnDateMs;)Lo/WritableTypeIdInclusion;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "()Ljava/lang/String;", "write"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setHideThumb {
    private static final String AudioAttributesCompatParcelizer = TestGroupLSModel.read((CharSequence) "H", 10);

    public static final String read() {
        return AudioAttributesCompatParcelizer;
    }

    public static /* synthetic */ long read$default(deserializeWithObjectId deserializewithobjectid, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar, String str, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = AudioAttributesCompatParcelizer;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return read(deserializewithobjectid, buffermapproperty, writeVar, str, i);
    }

    public static final long read(deserializeWithObjectId deserializewithobjectid, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar, String str, int i) {
        _constructDefaultValueInstantiator _constructdefaultvalueinstantiatorIconCompatParcelizer = _findCustomMapLikeDeserializer.IconCompatParcelizer(str, deserializewithobjectid, PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null), buffermapproperty, writeVar, (64 & 32) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), (64 & 64) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i, (64 & 256) != 0 ? paramName.INSTANCE.RemoteActionCompatParcelizer() : paramName.INSTANCE.RemoteActionCompatParcelizer());
        long j = -1;
        return getKey.read((((long) MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(_constructdefaultvalueinstantiatorIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver())) << 32) | (((long) MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(_constructdefaultvalueinstantiatorIconCompatParcelizer.read())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    public static final WritableTypeIdInclusion read(deserializeFromNumber deserializefromnumber, isAbstract isabstract, int i, getCreatedOnDateMs<getKey> getcreatedondatems) {
        WritableTypeIdInclusion writableTypeIdInclusion;
        if (i < deserializefromnumber.getIconCompatParcelizer().getWrite().length()) {
            writableTypeIdInclusion = deserializefromnumber.write(i);
        } else if (i != 0) {
            writableTypeIdInclusion = deserializefromnumber.write(i - 1);
        } else {
            writableTypeIdInclusion = new WritableTypeIdInclusion(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, (int) getcreatedondatems.invoke().getRemoteActionCompatParcelizer());
        }
        long j = -1;
        long jIconCompatParcelizer = isabstract.IconCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(writableTypeIdInclusion.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(writableTypeIdInclusion.getAudioAttributesCompatParcelizer())) << 32)));
        long j2 = -1;
        long j3 = -1;
        return BufferRecycler.read(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jIconCompatParcelizer >> 32)))) << 32) | (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) jIconCompatParcelizer))))), calloc.write((((long) Float.floatToRawIntBits(writableTypeIdInclusion.getWrite() - writableTypeIdInclusion.getAudioAttributesCompatParcelizer())) << 32) | (((long) Float.floatToRawIntBits(writableTypeIdInclusion.getIconCompatParcelizer() - writableTypeIdInclusion.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))))));
    }
}
