package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¿\u0001\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aÓ\u0001\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 \u001a%\u0010$\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010&\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b&\u0010'\"\u0018\u0010\u001f\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lo/_handleOddName;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "Lo/findCreatorAnnotation;", "p10", "Lo/findAndAddVirtualProperties;", "p11", "", "p12", "Lo/parseVersionPart;", "p13", "Lo/switchToNext;", "p14", "p15", "Lo/Separators;", "p16", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;FFFFFFFFFFJLo/findAndAddVirtualProperties;ZLo/parseVersionPart;JJI)Lo/_handleOddName;", "Lo/createInstance;", "p17", "Lo/switchAndReturnNext;", "p18", "write", "(Lo/_handleOddName;FFFFFFFFFFJLo/findAndAddVirtualProperties;ZLo/parseVersionPart;JJIILo/switchAndReturnNext;)Lo/_handleOddName;", "Lkotlin/Function1;", "Lo/validateAppend;", "", "IconCompatParcelizer", "(Lo/_handleOddName;Lo/getAnswerMap;)Lo/_handleOddName;", "read", "(Lo/_handleOddName;)Lo/_handleOddName;", "Lo/resolveAbstractType;", "RemoteActionCompatParcelizer", "Lo/resolveAbstractType;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class expand {
    private static resolveAbstractType RemoteActionCompatParcelizer;

    public static /* synthetic */ _handleOddName AudioAttributesCompatParcelizer$default(_handleOddName _handleoddname, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, findAndAddVirtualProperties findandaddvirtualproperties, boolean z, parseVersionPart parseversionpart, long j2, long j3, int i, int i2, Object obj) {
        float f11 = (i2 & 1) != 0 ? 1.0f : f;
        float f12 = (i2 & 2) != 0 ? 1.0f : f2;
        float f13 = (i2 & 4) == 0 ? f3 : 1.0f;
        int i3 = i2 & 8;
        float f14 = BitmapDescriptorFactory.HUE_RED;
        float f15 = i3 != 0 ? 0.0f : f4;
        float f16 = (i2 & 16) != 0 ? 0.0f : f5;
        float f17 = (i2 & 32) != 0 ? 0.0f : f6;
        float f18 = (i2 & 64) != 0 ? 0.0f : f7;
        float f19 = (i2 & 128) != 0 ? 0.0f : f8;
        if ((i2 & 256) == 0) {
            f14 = f9;
        }
        return AudioAttributesCompatParcelizer(_handleoddname, f11, f12, f13, f15, f16, f17, f18, f19, f14, (i2 & 512) != 0 ? 8.0f : f10, (i2 & 1024) != 0 ? findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer() : j, (i2 & 2048) != 0 ? parseVersion.read() : findandaddvirtualproperties, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? null : parseversionpart, (i2 & 16384) != 0 ? contentsAsArray.AudioAttributesCompatParcelizer() : j2, (i2 & 32768) != 0 ? contentsAsArray.AudioAttributesCompatParcelizer() : j3, (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? Separators.INSTANCE.AudioAttributesCompatParcelizer() : i);
    }

    @getRenewGrpId
    public static final /* synthetic */ _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, findAndAddVirtualProperties findandaddvirtualproperties, boolean z, parseVersionPart parseversionpart, long j2, long j3, int i) {
        return write(_handleoddname, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, findandaddvirtualproperties, z, parseversionpart, j2, j3, i, createInstance.INSTANCE.onPrepare(), null);
    }

    public static /* synthetic */ _handleOddName write$default(_handleOddName _handleoddname, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, findAndAddVirtualProperties findandaddvirtualproperties, boolean z, parseVersionPart parseversionpart, long j2, long j3, int i, int i2, switchAndReturnNext switchandreturnnext, int i3, Object obj) {
        float f11 = (i3 & 1) != 0 ? 1.0f : f;
        float f12 = (i3 & 2) != 0 ? 1.0f : f2;
        float f13 = (i3 & 4) == 0 ? f3 : 1.0f;
        int i4 = i3 & 8;
        float f14 = BitmapDescriptorFactory.HUE_RED;
        float f15 = i4 != 0 ? 0.0f : f4;
        float f16 = (i3 & 16) != 0 ? 0.0f : f5;
        float f17 = (i3 & 32) != 0 ? 0.0f : f6;
        float f18 = (i3 & 64) != 0 ? 0.0f : f7;
        float f19 = (i3 & 128) != 0 ? 0.0f : f8;
        if ((i3 & 256) == 0) {
            f14 = f9;
        }
        return write(_handleoddname, f11, f12, f13, f15, f16, f17, f18, f19, f14, (i3 & 512) != 0 ? 8.0f : f10, (i3 & 1024) != 0 ? findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer() : j, (i3 & 2048) != 0 ? parseVersion.read() : findandaddvirtualproperties, (i3 & 4096) != 0 ? false : z, (i3 & 8192) != 0 ? null : parseversionpart, (i3 & 16384) != 0 ? contentsAsArray.AudioAttributesCompatParcelizer() : j2, (32768 & i3) != 0 ? contentsAsArray.AudioAttributesCompatParcelizer() : j3, (65536 & i3) != 0 ? Separators.INSTANCE.AudioAttributesCompatParcelizer() : i, (i3 & 131072) != 0 ? createInstance.INSTANCE.onPrepare() : i2, (i3 & 262144) == 0 ? switchandreturnnext : null);
    }

    public static final _handleOddName write(_handleOddName _handleoddname, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, findAndAddVirtualProperties findandaddvirtualproperties, boolean z, parseVersionPart parseversionpart, long j2, long j3, int i, int i2, switchAndReturnNext switchandreturnnext) {
        return _handleoddname.AudioAttributesCompatParcelizer(new clearSegments(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, findandaddvirtualproperties, z, parseversionpart, j2, j3, i, i2, switchandreturnnext, null));
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, getAnswerMap<? super validateAppend, getShowPopup> getanswermap) {
        return _handleoddname.AudioAttributesCompatParcelizer(new JacksonFeature(getanswermap));
    }

    public static final _handleOddName read(_handleOddName _handleoddname) {
        return C0214type.AudioAttributesCompatParcelizer() ? _handleoddname.AudioAttributesCompatParcelizer(write$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null)) : _handleoddname;
    }
}
