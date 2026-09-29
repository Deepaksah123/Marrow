package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\n\u001a)\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\f\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\f\u0010\u0018\u001a/\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\f\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\f\u0010\u001d\u001a\u001b\u0010\u001b\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001f"}, d2 = {"Lo/_handleOddName;", "Lo/setUncaughtExceptionHandlerui;", "p0", "Lo/findAndAddVirtualProperties;", "p1", "write", "(Lo/_handleOddName;Lo/setUncaughtExceptionHandlerui;Lo/findAndAddVirtualProperties;)Lo/_handleOddName;", "Lo/assignParameter;", "Lo/switchToNext;", "p2", "(Lo/_handleOddName;FJLo/findAndAddVirtualProperties;)Lo/_handleOddName;", "Lo/Instantiatable;", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;FLo/Instantiatable;Lo/findAndAddVirtualProperties;)Lo/_handleOddName;", "Lo/_reportInvalidChar;", "Lo/parseMediumName;", "read", "(Lo/_reportInvalidChar;)Lo/parseMediumName;", "Lo/getReferencedType;", "Lo/calloc;", "", "p3", "", "p4", "(Lo/_reportInvalidChar;Lo/Instantiatable;JJZF)Lo/parseMediumName;", "Lo/removeSoftRefsClearedByGc;", "Lo/WritableTypeId;", "RemoteActionCompatParcelizer", "(Lo/removeSoftRefsClearedByGc;Lo/WritableTypeId;FZ)Lo/removeSoftRefsClearedByGc;", "(FLo/WritableTypeId;)Lo/WritableTypeId;", "Lo/TypeReference;", "(JF)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setConfiguration {
    public static final _handleOddName write(_handleOddName _handleoddname, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, findAndAddVirtualProperties findandaddvirtualproperties) {
        return AudioAttributesCompatParcelizer(_handleoddname, setuncaughtexceptionhandlerui.getIconCompatParcelizer(), setuncaughtexceptionhandlerui.getWrite(), findandaddvirtualproperties);
    }

    public static final _handleOddName write(_handleOddName _handleoddname, float f, long j, findAndAddVirtualProperties findandaddvirtualproperties) {
        return AudioAttributesCompatParcelizer(_handleoddname, f, new _hasOneOf(j, null), findandaddvirtualproperties);
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, float f, Instantiatable instantiatable, findAndAddVirtualProperties findandaddvirtualproperties) {
        return _handleoddname.AudioAttributesCompatParcelizer(new setUncaughtExceptionHandler(f, instantiatable, findandaddvirtualproperties, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final parseMediumName read(_reportInvalidChar _reportinvalidchar) {
        return _reportinvalidchar.IconCompatParcelizer(new getAnswerMap() { // from class: o.getUncaughtExceptionHandlerui
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setConfiguration.write((findSerializer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(findSerializer findserializer) {
        findserializer.write();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final parseMediumName AudioAttributesCompatParcelizer(_reportInvalidChar _reportinvalidchar, final Instantiatable instantiatable, long j, long j2, boolean z, float f) {
        final long jWrite = z ? getReferencedType.INSTANCE.write() : j;
        final long jWrite2 = z ? _reportinvalidchar.write() : j2;
        final findViews findvalueinstantiator = z ? findTypeResolver.INSTANCE : new findValueInstantiator(f, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null);
        return _reportinvalidchar.IconCompatParcelizer(new getAnswerMap() { // from class: o.getLastMatrixRecalculationAnimationTimeui
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setConfiguration.write(instantiatable, jWrite, jWrite2, findvalueinstantiator, (findSerializer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(Instantiatable instantiatable, long j, long j2, findViews findviews, findSerializer findserializer) {
        findserializer.write();
        findSetterInfo.write$default(findserializer, instantiatable, j, j2, BitmapDescriptorFactory.HUE_RED, findviews, null, 0, 104, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final removeSoftRefsClearedByGc RemoteActionCompatParcelizer(removeSoftRefsClearedByGc removesoftrefsclearedbygc, WritableTypeId writableTypeId, float f, boolean z) {
        removesoftrefsclearedbygc.AudioAttributesImplApi26Parcelizer();
        removeSoftRefsClearedByGc.RemoteActionCompatParcelizer$default(removesoftrefsclearedbygc, writableTypeId, null, 2, null);
        if (!z) {
            removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = writeIndentation.write();
            removeSoftRefsClearedByGc.RemoteActionCompatParcelizer$default(removesoftrefsclearedbygcWrite, AudioAttributesCompatParcelizer(f, writableTypeId), null, 2, null);
            removesoftrefsclearedbygc.read(removesoftrefsclearedbygc, removesoftrefsclearedbygcWrite, wrapAndTrack.INSTANCE.AudioAttributesCompatParcelizer());
        }
        return removesoftrefsclearedbygc;
    }

    private static final WritableTypeId AudioAttributesCompatParcelizer(float f, WritableTypeId writableTypeId) {
        float fAudioAttributesImplBaseParcelizer = writableTypeId.AudioAttributesImplBaseParcelizer();
        float f2 = writableTypeId.read();
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(writableTypeId.getWrite(), f);
        long jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(writableTypeId.getMediaBrowserCompatItemReceiver(), f);
        long jRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(writableTypeId.getAudioAttributesImplBaseParcelizer(), f);
        return new WritableTypeId(f, f, fAudioAttributesImplBaseParcelizer - f, f2 - f, jRemoteActionCompatParcelizer, jRemoteActionCompatParcelizer2, RemoteActionCompatParcelizer(writableTypeId.getMediaBrowserCompatCustomActionResultReceiver(), f), jRemoteActionCompatParcelizer3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long RemoteActionCompatParcelizer(long j, float f) {
        long j2 = -1;
        return TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (j >> 32)) - f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) j) - f))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }
}
