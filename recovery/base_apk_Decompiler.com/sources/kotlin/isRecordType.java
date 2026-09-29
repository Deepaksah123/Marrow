package kotlin;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.findExpectedFormat;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\u0014\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0018\u00010\u000fR\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0007\u001a\u00020\b*\u00020\bH\u0000¢\u0006\u0004\b\u0007\u0010\u0016\u001a1\u0010\u0017\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0001\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0018\u00010\u000fR\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u0014\u001a\u00020\u0019*\u00020\f2\u0006\u0010\u0001\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0018\u00010\u000fR\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u001a\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\n\u0010\u001d\u001a9\u0010\n\u001a\u00020\u0019*\u00020\f2\u0006\u0010\u0001\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0018\u00010\u000fR\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\n\u0010\u001a\u001a9\u0010\u0017\u001a\u00020\u0019*\u00020\f2\u0006\u0010\u0001\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0018\u00010\u000fR\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0017\u0010\u001a\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0004\u0010\u001e"}, d2 = {"", "p0", "Lo/findAutoDetectVisibility;", "p1", "AudioAttributesCompatParcelizer", "(II)I", "Lo/findCreatorBinding;", "IconCompatParcelizer", "Lorg/xmlpull/v1/XmlPullParser;", "", "RemoteActionCompatParcelizer", "(Lorg/xmlpull/v1/XmlPullParser;)Z", "Lo/instantiateBean;", "Landroid/content/res/Resources;", "Landroid/util/AttributeSet;", "Landroid/content/res/Resources$Theme;", "p2", "Lo/findExpectedFormat$IconCompatParcelizer;", "p3", "p4", "write", "(Lo/instantiateBean;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lo/findExpectedFormat$IconCompatParcelizer;I)I", "(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;", "read", "(Lo/instantiateBean;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Lo/findExpectedFormat$IconCompatParcelizer;", "", "(Lo/instantiateBean;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Lo/findExpectedFormat$IconCompatParcelizer;)V", "Lo/_parseLong;", "Lo/Instantiatable;", "(Lo/_parseLong;)Lo/Instantiatable;", "I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class isRecordType {
    private static final int AudioAttributesCompatParcelizer = 0;

    private static final int AudioAttributesCompatParcelizer(int i, int i2) {
        if (i == 0) {
            return findAutoDetectVisibility.INSTANCE.read();
        }
        if (i != 1) {
            return i != 2 ? i2 : findAutoDetectVisibility.INSTANCE.IconCompatParcelizer();
        }
        return findAutoDetectVisibility.INSTANCE.RemoteActionCompatParcelizer();
    }

    private static final int IconCompatParcelizer(int i, int i2) {
        if (i == 0) {
            return findCreatorBinding.INSTANCE.RemoteActionCompatParcelizer();
        }
        if (i != 1) {
            return i != 2 ? i2 : findCreatorBinding.INSTANCE.read();
        }
        return findCreatorBinding.INSTANCE.AudioAttributesCompatParcelizer();
    }

    public static final boolean RemoteActionCompatParcelizer(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() <= 0 && xmlPullParser.getEventType() == 3);
    }

    public static final int write(instantiateBean instantiatebean, Resources resources, AttributeSet attributeSet, Resources.Theme theme, findExpectedFormat.IconCompatParcelizer iconCompatParcelizer, int i) throws XmlPullParserException {
        int eventType = instantiatebean.getIconCompatParcelizer().getEventType();
        if (eventType == 2) {
            String name = instantiatebean.getIconCompatParcelizer().getName();
            if (name == null) {
                return i;
            }
            int iHashCode = name.hashCode();
            if (iHashCode == -1649314686) {
                if (!name.equals("clip-path")) {
                    return i;
                }
                RemoteActionCompatParcelizer(instantiatebean, resources, theme, attributeSet, iconCompatParcelizer);
                return i + 1;
            }
            if (iHashCode == 3433509) {
                if (!name.equals("path")) {
                    return i;
                }
                write(instantiatebean, resources, theme, attributeSet, iconCompatParcelizer);
                return i;
            }
            if (iHashCode != 98629247 || !name.equals("group")) {
                return i;
            }
            read(instantiatebean, resources, theme, attributeSet, iconCompatParcelizer);
            return i;
        }
        if (eventType != 3 || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "group", (Object) instantiatebean.getIconCompatParcelizer().getName())) {
            return i;
        }
        for (int i2 = 0; i2 < i + 1; i2++) {
            iconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        return 0;
    }

    public static final XmlPullParser IconCompatParcelizer(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static final findExpectedFormat.IconCompatParcelizer read(instantiateBean instantiatebean, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jAudioAttributesImplApi21Parcelizer;
        int iOnPlayFromUri;
        ColorStateList colorStateList;
        TypedArray typedArrayAudioAttributesCompatParcelizer = instantiatebean.AudioAttributesCompatParcelizer(resources, theme, attributeSet, hasKnownClassAnnotations.INSTANCE.onSeekTo());
        boolean zWrite = instantiatebean.write(typedArrayAudioAttributesCompatParcelizer, "autoMirrored", hasKnownClassAnnotations.INSTANCE.AudioAttributesCompatParcelizer(), false);
        float fIconCompatParcelizer = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "viewportWidth", hasKnownClassAnnotations.INSTANCE.onRemoveQueueItem(), BitmapDescriptorFactory.HUE_RED);
        float fIconCompatParcelizer2 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "viewportHeight", hasKnownClassAnnotations.INSTANCE.onRemoveQueueItemAt(), BitmapDescriptorFactory.HUE_RED);
        if (fIconCompatParcelizer <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArrayAudioAttributesCompatParcelizer.getPositionDescription());
            sb.append("<VectorGraphic> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        }
        if (fIconCompatParcelizer2 <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(typedArrayAudioAttributesCompatParcelizer.getPositionDescription());
            sb2.append("<VectorGraphic> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb2.toString());
        }
        float f = instantiatebean.read(typedArrayAudioAttributesCompatParcelizer, hasKnownClassAnnotations.INSTANCE.onRewind(), BitmapDescriptorFactory.HUE_RED);
        float f2 = instantiatebean.read(typedArrayAudioAttributesCompatParcelizer, hasKnownClassAnnotations.INSTANCE.MediaDescriptionCompat(), BitmapDescriptorFactory.HUE_RED);
        if (typedArrayAudioAttributesCompatParcelizer.hasValue(hasKnownClassAnnotations.INSTANCE.onPrepare())) {
            TypedValue typedValue = new TypedValue();
            typedArrayAudioAttributesCompatParcelizer.getValue(hasKnownClassAnnotations.INSTANCE.onPrepare(), typedValue);
            if (typedValue.type != 2 && (colorStateList = instantiatebean.read(typedArrayAudioAttributesCompatParcelizer, theme, "tint", hasKnownClassAnnotations.INSTANCE.onPrepare())) != null) {
                jAudioAttributesImplApi21Parcelizer = RequestPayload.AudioAttributesCompatParcelizer(colorStateList.getDefaultColor());
            } else {
                jAudioAttributesImplApi21Parcelizer = switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            jAudioAttributesImplApi21Parcelizer = switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer();
        }
        long j = jAudioAttributesImplApi21Parcelizer;
        int i = instantiatebean.read(typedArrayAudioAttributesCompatParcelizer, hasKnownClassAnnotations.INSTANCE.onPrepareFromUri(), -1);
        if (i == -1) {
            iOnPlayFromUri = createInstance.INSTANCE.onPlayFromUri();
        } else if (i == 3) {
            iOnPlayFromUri = createInstance.INSTANCE.onPrepare();
        } else if (i == 5) {
            iOnPlayFromUri = createInstance.INSTANCE.onPlayFromUri();
        } else if (i == 9) {
            iOnPlayFromUri = createInstance.INSTANCE.onFastForward();
        } else {
            switch (i) {
                case 14:
                    iOnPlayFromUri = createInstance.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    break;
                case 15:
                    iOnPlayFromUri = createInstance.INSTANCE.onPlay();
                    break;
                case 16:
                    iOnPlayFromUri = createInstance.INSTANCE.onCustomAction();
                    break;
                default:
                    iOnPlayFromUri = createInstance.INSTANCE.onPlayFromUri();
                    break;
            }
        }
        int i2 = iOnPlayFromUri;
        float fIconCompatParcelizer3 = assignParameter.IconCompatParcelizer(f / resources.getDisplayMetrics().density);
        float fIconCompatParcelizer4 = assignParameter.IconCompatParcelizer(f2 / resources.getDisplayMetrics().density);
        typedArrayAudioAttributesCompatParcelizer.recycle();
        return new findExpectedFormat.IconCompatParcelizer(null, fIconCompatParcelizer3, fIconCompatParcelizer4, fIconCompatParcelizer, fIconCompatParcelizer2, j, i2, zWrite, 1, null);
    }

    public static final void write(instantiateBean instantiatebean, Resources resources, Resources.Theme theme, AttributeSet attributeSet, findExpectedFormat.IconCompatParcelizer iconCompatParcelizer) throws IllegalArgumentException {
        ArrayList arrayListRemoteActionCompatParcelizer;
        TypedArray typedArrayAudioAttributesCompatParcelizer = instantiatebean.AudioAttributesCompatParcelizer(resources, theme, attributeSet, hasKnownClassAnnotations.INSTANCE.MediaBrowserCompatSearchResultReceiver());
        if (!_parseLongPrimitive.read(instantiatebean.getIconCompatParcelizer(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strAudioAttributesCompatParcelizer = instantiatebean.AudioAttributesCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, hasKnownClassAnnotations.INSTANCE.handleMediaPlayPauseIfPendingOnHandler());
        if (strAudioAttributesCompatParcelizer == null) {
            strAudioAttributesCompatParcelizer = "";
        }
        String str = strAudioAttributesCompatParcelizer;
        String strAudioAttributesCompatParcelizer2 = instantiatebean.AudioAttributesCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, hasKnownClassAnnotations.INSTANCE.onCustomAction());
        if (strAudioAttributesCompatParcelizer2 == null) {
            arrayListRemoteActionCompatParcelizer = getFactoryMethods.AudioAttributesCompatParcelizer();
        } else {
            arrayListRemoteActionCompatParcelizer = findJsonKeyAccessor.RemoteActionCompatParcelizer(instantiatebean.read, strAudioAttributesCompatParcelizer2, null, 2, null);
        }
        List<? extends getBeanClass> list = arrayListRemoteActionCompatParcelizer;
        _parseLong _parselongIconCompatParcelizer = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, theme, "fillColor", hasKnownClassAnnotations.INSTANCE.onAddQueueItem(), 0);
        float fIconCompatParcelizer = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "fillAlpha", hasKnownClassAnnotations.INSTANCE.onCommand(), 1.0f);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(instantiatebean.read(typedArrayAudioAttributesCompatParcelizer, "strokeLineCap", hasKnownClassAnnotations.INSTANCE.onFastForward(), -1), findAutoDetectVisibility.INSTANCE.read());
        int iIconCompatParcelizer = IconCompatParcelizer(instantiatebean.read(typedArrayAudioAttributesCompatParcelizer, "strokeLineJoin", hasKnownClassAnnotations.INSTANCE.onPlayFromMediaId(), -1), findCreatorBinding.INSTANCE.RemoteActionCompatParcelizer());
        float fIconCompatParcelizer2 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "strokeMiterLimit", hasKnownClassAnnotations.INSTANCE.onPlay(), 4.0f);
        _parseLong _parselongIconCompatParcelizer2 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, theme, "strokeColor", hasKnownClassAnnotations.INSTANCE.onMediaButtonEvent(), 0);
        float fIconCompatParcelizer3 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "strokeAlpha", hasKnownClassAnnotations.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), 1.0f);
        float fIconCompatParcelizer4 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "strokeWidth", hasKnownClassAnnotations.INSTANCE.onPause(), 1.0f);
        float fIconCompatParcelizer5 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "trimPathEnd", hasKnownClassAnnotations.INSTANCE.onPlayFromSearch(), 1.0f);
        float fIconCompatParcelizer6 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "trimPathOffset", hasKnownClassAnnotations.INSTANCE.onPrepareFromMediaId(), BitmapDescriptorFactory.HUE_RED);
        float fIconCompatParcelizer7 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "trimPathStart", hasKnownClassAnnotations.INSTANCE.onPlayFromUri(), BitmapDescriptorFactory.HUE_RED);
        int i = instantiatebean.read(typedArrayAudioAttributesCompatParcelizer, "fillType", hasKnownClassAnnotations.INSTANCE.onPrepareFromSearch(), AudioAttributesCompatParcelizer);
        typedArrayAudioAttributesCompatParcelizer.recycle();
        iconCompatParcelizer.IconCompatParcelizer(list, i == 0 ? instance.INSTANCE.RemoteActionCompatParcelizer() : instance.INSTANCE.write(), str, RemoteActionCompatParcelizer(_parselongIconCompatParcelizer), fIconCompatParcelizer, RemoteActionCompatParcelizer(_parselongIconCompatParcelizer2), fIconCompatParcelizer3, fIconCompatParcelizer4, iAudioAttributesCompatParcelizer, iIconCompatParcelizer, fIconCompatParcelizer2, fIconCompatParcelizer7, fIconCompatParcelizer5, fIconCompatParcelizer6);
    }

    private static final Instantiatable RemoteActionCompatParcelizer(_parseLong _parselong) {
        if (!_parselong.RemoteActionCompatParcelizer()) {
            return null;
        }
        Shader shaderWrite = _parselong.write();
        if (shaderWrite != null) {
            return InternCache.IconCompatParcelizer(shaderWrite);
        }
        return new _hasOneOf(RequestPayload.AudioAttributesCompatParcelizer(_parselong.read()), null);
    }

    public static final void RemoteActionCompatParcelizer(instantiateBean instantiatebean, Resources resources, Resources.Theme theme, AttributeSet attributeSet, findExpectedFormat.IconCompatParcelizer iconCompatParcelizer) {
        TypedArray typedArrayAudioAttributesCompatParcelizer = instantiatebean.AudioAttributesCompatParcelizer(resources, theme, attributeSet, hasKnownClassAnnotations.INSTANCE.write());
        String strAudioAttributesCompatParcelizer = instantiatebean.AudioAttributesCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, hasKnownClassAnnotations.INSTANCE.RemoteActionCompatParcelizer());
        if (strAudioAttributesCompatParcelizer == null) {
            strAudioAttributesCompatParcelizer = "";
        }
        String str = strAudioAttributesCompatParcelizer;
        String strAudioAttributesCompatParcelizer2 = instantiatebean.AudioAttributesCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, hasKnownClassAnnotations.INSTANCE.read());
        ArrayList arrayListAudioAttributesCompatParcelizer = strAudioAttributesCompatParcelizer2 == null ? getFactoryMethods.AudioAttributesCompatParcelizer() : findJsonKeyAccessor.RemoteActionCompatParcelizer(instantiatebean.read, strAudioAttributesCompatParcelizer2, null, 2, null);
        typedArrayAudioAttributesCompatParcelizer.recycle();
        findExpectedFormat.IconCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer, str, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, arrayListAudioAttributesCompatParcelizer, 254, null);
    }

    public static final void read(instantiateBean instantiatebean, Resources resources, Resources.Theme theme, AttributeSet attributeSet, findExpectedFormat.IconCompatParcelizer iconCompatParcelizer) {
        TypedArray typedArrayAudioAttributesCompatParcelizer = instantiatebean.AudioAttributesCompatParcelizer(resources, theme, attributeSet, hasKnownClassAnnotations.INSTANCE.IconCompatParcelizer());
        float fIconCompatParcelizer = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "rotation", hasKnownClassAnnotations.INSTANCE.AudioAttributesImplApi26Parcelizer(), BitmapDescriptorFactory.HUE_RED);
        float fIconCompatParcelizer2 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, hasKnownClassAnnotations.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), BitmapDescriptorFactory.HUE_RED);
        float fIconCompatParcelizer3 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, hasKnownClassAnnotations.INSTANCE.AudioAttributesImplApi21Parcelizer(), BitmapDescriptorFactory.HUE_RED);
        float fIconCompatParcelizer4 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "scaleX", hasKnownClassAnnotations.INSTANCE.MediaBrowserCompatItemReceiver(), 1.0f);
        float fIconCompatParcelizer5 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "scaleY", hasKnownClassAnnotations.INSTANCE.MediaBrowserCompatMediaItem(), 1.0f);
        float fIconCompatParcelizer6 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "translateX", hasKnownClassAnnotations.INSTANCE.MediaMetadataCompat(), BitmapDescriptorFactory.HUE_RED);
        float fIconCompatParcelizer7 = instantiatebean.IconCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, "translateY", hasKnownClassAnnotations.INSTANCE.RatingCompat(), BitmapDescriptorFactory.HUE_RED);
        String strAudioAttributesCompatParcelizer = instantiatebean.AudioAttributesCompatParcelizer(typedArrayAudioAttributesCompatParcelizer, hasKnownClassAnnotations.INSTANCE.AudioAttributesImplBaseParcelizer());
        if (strAudioAttributesCompatParcelizer == null) {
            strAudioAttributesCompatParcelizer = "";
        }
        typedArrayAudioAttributesCompatParcelizer.recycle();
        iconCompatParcelizer.read(strAudioAttributesCompatParcelizer, fIconCompatParcelizer, fIconCompatParcelizer2, fIconCompatParcelizer3, fIconCompatParcelizer4, fIconCompatParcelizer5, fIconCompatParcelizer6, fIconCompatParcelizer7, getFactoryMethods.AudioAttributesCompatParcelizer());
    }
}
