package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016JK\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0016JK\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u0016J\r\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001dJ7\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001fH\u0007¢\u0006\u0004\b#\u0010$J\r\u0010)\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001dJ7\u0010)\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001fH\u0007¢\u0006\u0004\b*\u0010$J\r\u0010-\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001dJ7\u0010-\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001fH\u0007¢\u0006\u0004\b.\u0010$J\u0017\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0002\u00105R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0018\u0010%\u001a\u00020\u001c*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010+\u001a\u00020\u001c*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0018\u0010/\u001a\u00020\u001c*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010(¨\u00066"}, d2 = {"Landroidx/compose/material3/CardDefaults;", "", "<init>", "()V", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "elevatedShape", "getElevatedShape", "outlinedShape", "getOutlinedShape", "cardElevation", "Landroidx/compose/material3/CardElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "cardElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardElevation;", "elevatedCardElevation", "elevatedCardElevation-aqJV_2Y", "outlinedCardElevation", "outlinedCardElevation-aqJV_2Y", "cardColors", "Landroidx/compose/material3/CardColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CardColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "cardColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardColors;", "defaultCardColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultCardColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CardColors;", "elevatedCardColors", "elevatedCardColors-ro_MJ88", "defaultElevatedCardColors", "getDefaultElevatedCardColors$material3", "outlinedCardColors", "outlinedCardColors-ro_MJ88", "defaultOutlinedCardColors", "getDefaultOutlinedCardColors$material3", "outlinedCardBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class writeObject {
    public static final writeObject IconCompatParcelizer = new writeObject();
    public static final int RemoteActionCompatParcelizer = 0;

    private writeObject() {
    }

    public final findAndAddVirtualProperties AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1266660211, i, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:370)");
        }
        findAndAddVirtualProperties findandaddvirtualpropertiesIconCompatParcelizer = requiresCustomCodec.IconCompatParcelizer(validateStringLength.INSTANCE.RemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape, 6);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return findandaddvirtualpropertiesIconCompatParcelizer;
    }

    public final writeObjectRef IconCompatParcelizer(float f, float f2, float f3, float f4, float f5, float f6, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = validateStringLength.INSTANCE.read();
        }
        if ((i2 & 2) != 0) {
            f2 = validateStringLength.INSTANCE.AudioAttributesImplBaseParcelizer();
        }
        float f7 = f2;
        if ((i2 & 4) != 0) {
            f3 = validateStringLength.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
        }
        float f8 = f3;
        if ((i2 & 8) != 0) {
            f4 = validateStringLength.INSTANCE.MediaBrowserCompatItemReceiver();
        }
        float f9 = f4;
        if ((i2 & 16) != 0) {
            f5 = validateStringLength.INSTANCE.AudioAttributesImplApi26Parcelizer();
        }
        float f10 = f5;
        if ((i2 & 32) != 0) {
            f6 = validateStringLength.INSTANCE.IconCompatParcelizer();
        }
        float f11 = f6;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-574898487, i, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:400)");
        }
        writeObjectRef writeobjectref = new writeObjectRef(f, f7, f8, f9, f10, f11, null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return writeobjectref;
    }

    public final writeObjectId read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1876034303, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:472)");
        }
        writeObjectId writeobjectid = read(getCurrentName.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6));
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return writeobjectid;
    }

    public final writeObjectId AudioAttributesCompatParcelizer(long j, long j2, long j3, long j4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        long jAudioAttributesImplApi21Parcelizer = (i2 & 1) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j;
        long jRemoteActionCompatParcelizer = (i2 & 2) != 0 ? writeOmittedField.RemoteActionCompatParcelizer(jAudioAttributesImplApi21Parcelizer, _handleunrecognizedcharacterescape, i & 14) : j2;
        long jAudioAttributesImplApi21Parcelizer2 = (i2 & 4) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j3;
        long jAudioAttributesCompatParcelizer$default = (i2 & 8) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(jRemoteActionCompatParcelizer, 0.38f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j4;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1589582123, i, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:490)");
        }
        writeObjectId writeobjectidWrite = read(getCurrentName.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6)).write(jAudioAttributesImplApi21Parcelizer, jRemoteActionCompatParcelizer, jAudioAttributesImplApi21Parcelizer2, jAudioAttributesCompatParcelizer$default);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return writeobjectidWrite;
    }

    public final writeObjectId read(writeStartArray writestartarray) {
        writeObjectId mediaSessionCompatToken = writestartarray.getMediaSessionCompatToken();
        if (mediaSessionCompatToken != null) {
            return mediaSessionCompatToken;
        }
        writeObjectId writeobjectid = new writeObjectId(writeOmittedField.AudioAttributesCompatParcelizer(writestartarray, validateStringLength.INSTANCE.write()), writeOmittedField.IconCompatParcelizer(writestartarray, writeOmittedField.AudioAttributesCompatParcelizer(writestartarray, validateStringLength.INSTANCE.write())), RequestPayload.RemoteActionCompatParcelizer(switchToNext.AudioAttributesCompatParcelizer$default(writeOmittedField.AudioAttributesCompatParcelizer(writestartarray, validateStringLength.INSTANCE.AudioAttributesCompatParcelizer()), validateStringLength.INSTANCE.AudioAttributesImplApi21Parcelizer(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), writeOmittedField.AudioAttributesCompatParcelizer(writestartarray, validateStringLength.INSTANCE.write())), switchToNext.AudioAttributesCompatParcelizer$default(writeOmittedField.IconCompatParcelizer(writestartarray, writeOmittedField.AudioAttributesCompatParcelizer(writestartarray, validateStringLength.INSTANCE.write())), 0.38f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null);
        writestartarray.AudioAttributesCompatParcelizer(writeobjectid);
        return writeobjectid;
    }
}
