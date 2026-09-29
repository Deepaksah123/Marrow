package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010-\u001a\u00020.H\u0007¢\u0006\u0002\u0010/J7\u0010-\u001a\u00020.2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u0002012\b\b\u0002\u00104\u001a\u000201H\u0007¢\u0006\u0004\b5\u00106J\r\u0010;\u001a\u00020.H\u0007¢\u0006\u0002\u0010/J7\u0010;\u001a\u00020.2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u0002012\b\b\u0002\u00104\u001a\u000201H\u0007¢\u0006\u0004\b<\u00106J\r\u0010?\u001a\u00020.H\u0007¢\u0006\u0002\u0010/J7\u0010?\u001a\u00020.2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u0002012\b\b\u0002\u00104\u001a\u000201H\u0007¢\u0006\u0004\b@\u00106J\r\u0010C\u001a\u00020.H\u0007¢\u0006\u0002\u0010/J7\u0010C\u001a\u00020.2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u0002012\b\b\u0002\u00104\u001a\u000201H\u0007¢\u0006\u0004\bD\u00106J\r\u0010G\u001a\u00020.H\u0007¢\u0006\u0002\u0010/J7\u0010G\u001a\u00020.2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u0002012\b\b\u0002\u00104\u001a\u000201H\u0007¢\u0006\u0004\bH\u00106JA\u0010K\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010N\u001a\u00020\u00052\b\b\u0002\u0010O\u001a\u00020\u00052\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020\u0005H\u0007¢\u0006\u0004\bR\u0010SJA\u0010T\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010N\u001a\u00020\u00052\b\b\u0002\u0010O\u001a\u00020\u00052\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020\u0005H\u0007¢\u0006\u0004\bU\u0010SJA\u0010V\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010N\u001a\u00020\u00052\b\b\u0002\u0010O\u001a\u00020\u00052\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020\u0005H\u0007¢\u0006\u0004\bW\u0010SJ\u0017\u0010X\u001a\u00020Y2\b\b\u0002\u0010\\\u001a\u00020]H\u0007¢\u0006\u0002\u0010^R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0010\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0010\u0010\u0015\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0016\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0018\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u001d\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\u001f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b \u0010\u001aR\u0011\u0010!\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010'\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0011\u0010)\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0011\u0010+\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b,\u0010$R\u0018\u00107\u001a\u00020.*\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0018\u0010=\u001a\u00020.*\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0018\u0010A\u001a\u00020.*\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010:R\u0018\u0010E\u001a\u00020.*\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010:R\u0018\u0010I\u001a\u00020.*\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010:R\u0011\u0010X\u001a\u00020Y8G¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006_"}, d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "<init>", "()V", "ButtonLeadingSpace", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonTrailingSpace", "ButtonWithIconStartpadding", "SmallStartPadding", "SmallEndPadding", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ButtonWithIconContentPadding", "getButtonWithIconContentPadding", "TextButtonHorizontalPadding", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonWithIconHorizontalEndPadding", "TextButtonWithIconContentPadding", "getTextButtonWithIconContentPadding", "MinWidth", "getMinWidth-D9Ej5fM", "()F", "MinHeight", "getMinHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "IconSpacing", "getIconSpacing-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "elevatedShape", "getElevatedShape", "filledTonalShape", "getFilledTonalShape", "outlinedShape", "getOutlinedShape", "textShape", "getTextShape", "buttonColors", "Landroidx/compose/material3/ButtonColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "defaultButtonColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultButtonColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ButtonColors;", "elevatedButtonColors", "elevatedButtonColors-ro_MJ88", "defaultElevatedButtonColors", "getDefaultElevatedButtonColors$material3", "filledTonalButtonColors", "filledTonalButtonColors-ro_MJ88", "defaultFilledTonalButtonColors", "getDefaultFilledTonalButtonColors$material3", "outlinedButtonColors", "outlinedButtonColors-ro_MJ88", "defaultOutlinedButtonColors", "getDefaultOutlinedButtonColors$material3", "textButtonColors", "textButtonColors-ro_MJ88", "defaultTextButtonColors", "getDefaultTextButtonColors$material3", "buttonElevation", "Landroidx/compose/material3/ButtonElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "elevatedButtonElevation", "elevatedButtonElevation-R_JCAzs", "filledTonalButtonElevation", "filledTonalButtonElevation-R_JCAzs", "outlinedButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedButtonBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class writeNumber {
    private static final float AudioAttributesCompatParcelizer;
    private static final getReturnTransition AudioAttributesImplApi21Parcelizer;
    private static final float AudioAttributesImplApi26Parcelizer;
    private static final float AudioAttributesImplBaseParcelizer;
    public static final writeNumber IconCompatParcelizer = new writeNumber();
    private static final float MediaBrowserCompatCustomActionResultReceiver;
    private static final getReturnTransition MediaBrowserCompatItemReceiver;
    private static final float MediaBrowserCompatMediaItem;
    private static final float MediaBrowserCompatSearchResultReceiver;
    private static final getReturnTransition MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private static final float MediaDescriptionCompat;
    private static final getReturnTransition MediaMetadataCompat;
    private static final float RatingCompat;
    private static final float RemoteActionCompatParcelizer;
    private static final float handleMediaPlayPauseIfPendingOnHandler;
    private static final float onCommand;
    private static final float read;
    public static final int write = 0;

    private writeNumber() {
    }

    static {
        float fWrite = StreamReadConstraints.INSTANCE.write();
        read = fWrite;
        float f = StreamReadConstraints.INSTANCE.read();
        AudioAttributesCompatParcelizer = f;
        float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(16.0f);
        AudioAttributesImplBaseParcelizer = fIconCompatParcelizer;
        MediaBrowserCompatMediaItem = asQuotedUTF8.INSTANCE.RemoteActionCompatParcelizer();
        MediaBrowserCompatSearchResultReceiver = asQuotedUTF8.INSTANCE.AudioAttributesCompatParcelizer();
        float fIconCompatParcelizer2 = assignParameter.IconCompatParcelizer(8.0f);
        RemoteActionCompatParcelizer = fIconCompatParcelizer2;
        getReturnTransition getreturntransition = getParentFragment.read(fWrite, fIconCompatParcelizer2, f, fIconCompatParcelizer2);
        MediaBrowserCompatItemReceiver = getreturntransition;
        AudioAttributesImplApi21Parcelizer = getParentFragment.read(fIconCompatParcelizer, fIconCompatParcelizer2, f, fIconCompatParcelizer2);
        float fIconCompatParcelizer3 = assignParameter.IconCompatParcelizer(12.0f);
        handleMediaPlayPauseIfPendingOnHandler = fIconCompatParcelizer3;
        MediaMetadataCompat = getParentFragment.read(fIconCompatParcelizer3, getreturntransition.getRead(), fIconCompatParcelizer3, getreturntransition.getRemoteActionCompatParcelizer());
        float fIconCompatParcelizer4 = assignParameter.IconCompatParcelizer(16.0f);
        onCommand = fIconCompatParcelizer4;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getParentFragment.read(fIconCompatParcelizer3, getreturntransition.getRead(), fIconCompatParcelizer4, getreturntransition.getRemoteActionCompatParcelizer());
        RatingCompat = assignParameter.IconCompatParcelizer(58.0f);
        MediaDescriptionCompat = asQuotedUTF8.INSTANCE.IconCompatParcelizer();
        AudioAttributesImplApi26Parcelizer = assignParameter.IconCompatParcelizer(18.0f);
        MediaBrowserCompatCustomActionResultReceiver = asQuotedUTF8.INSTANCE.write();
    }

    public final getReturnTransition read() {
        return MediaBrowserCompatItemReceiver;
    }

    public final float RemoteActionCompatParcelizer() {
        return RatingCompat;
    }

    public final float AudioAttributesCompatParcelizer() {
        return MediaDescriptionCompat;
    }

    public final findAndAddVirtualProperties AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1234923021, i, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:550)");
        }
        findAndAddVirtualProperties findandaddvirtualpropertiesIconCompatParcelizer = requiresCustomCodec.IconCompatParcelizer(asQuotedUTF8.INSTANCE.read(), _handleunrecognizedcharacterescape, 6);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return findandaddvirtualpropertiesIconCompatParcelizer;
    }

    public final writeNull RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1449248637, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:572)");
        }
        writeNull writenull = read(getCurrentName.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6));
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return writenull;
    }

    public final writeNull write(long j, long j2, long j3, long j4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        long jAudioAttributesImplApi21Parcelizer = (i2 & 1) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j;
        long jAudioAttributesImplApi21Parcelizer2 = (i2 & 2) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j2;
        long jAudioAttributesImplApi21Parcelizer3 = (i2 & 4) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j3;
        long jAudioAttributesImplApi21Parcelizer4 = (i2 & 8) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j4;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-339300779, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:590)");
        }
        writeNull writenullRemoteActionCompatParcelizer = read(getCurrentName.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6)).RemoteActionCompatParcelizer(jAudioAttributesImplApi21Parcelizer, jAudioAttributesImplApi21Parcelizer2, jAudioAttributesImplApi21Parcelizer3, jAudioAttributesImplApi21Parcelizer4);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return writenullRemoteActionCompatParcelizer;
    }

    public final writeNull read(writeStartArray writestartarray) {
        writeNull mediaSessionCompatResultReceiverWrapper = writestartarray.getMediaSessionCompatResultReceiverWrapper();
        if (mediaSessionCompatResultReceiverWrapper != null) {
            return mediaSessionCompatResultReceiverWrapper;
        }
        writeNull writenull = new writeNull(writeOmittedField.AudioAttributesCompatParcelizer(writestartarray, TokenStreamFactory.INSTANCE.RemoteActionCompatParcelizer()), writeOmittedField.AudioAttributesCompatParcelizer(writestartarray, TokenStreamFactory.INSTANCE.AudioAttributesImplApi26Parcelizer()), switchToNext.AudioAttributesCompatParcelizer$default(writeOmittedField.AudioAttributesCompatParcelizer(writestartarray, TokenStreamFactory.INSTANCE.read()), TokenStreamFactory.INSTANCE.write(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), switchToNext.AudioAttributesCompatParcelizer$default(writeOmittedField.AudioAttributesCompatParcelizer(writestartarray, TokenStreamFactory.INSTANCE.MediaBrowserCompatItemReceiver()), TokenStreamFactory.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null);
        writestartarray.RemoteActionCompatParcelizer(writenull);
        return writenull;
    }

    public final writeFieldName write(float f, float f2, float f3, float f4, float f5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = TokenStreamFactory.INSTANCE.IconCompatParcelizer();
        }
        if ((i2 & 2) != 0) {
            f2 = TokenStreamFactory.INSTANCE.MediaBrowserCompatSearchResultReceiver();
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = TokenStreamFactory.INSTANCE.AudioAttributesImplBaseParcelizer();
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = TokenStreamFactory.INSTANCE.AudioAttributesImplApi21Parcelizer();
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            f5 = TokenStreamFactory.INSTANCE.AudioAttributesCompatParcelizer();
        }
        float f9 = f5;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1827791191, i, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:811)");
        }
        writeFieldName writefieldname = new writeFieldName(f, f6, f7, f8, f9, null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return writefieldname;
    }
}
