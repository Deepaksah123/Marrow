package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.shouldIntrospectorImplicitConstructors;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0001\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "p0", "Lo/isAnnotationBundle;", "RemoteActionCompatParcelizer", "(ILo/_handleUnrecognizedCharacterEscape;I)Lo/isAnnotationBundle;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "p1", "p2", "p3", "Lo/findExpectedFormat;", "read", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILo/_handleUnrecognizedCharacterEscape;I)Lo/findExpectedFormat;", "", "Lo/unshare;", "write", "(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)Lo/unshare;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getDefaultSetterInfo {
    public static final isAnnotationBundle RemoteActionCompatParcelizer(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        refineDeserializationType refinedeserializationtype;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(473971343, i2, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
        Resources resources = (Resources) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.AudioAttributesCompatParcelizer());
        TypedValue typedValueWrite = ((ContextAttributes) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.write())).write(resources, i);
        CharSequence charSequence = typedValueWrite.string;
        if (charSequence != null && TestGroupLSModel.read(charSequence, ".xml")) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1771798434);
            getObjectIdInfo getobjectidinfoAudioAttributesCompatParcelizer = getIgnoredPropertyNames.AudioAttributesCompatParcelizer(read(context.getTheme(), resources, i, typedValueWrite.changingConfigurations, _handleunrecognizedcharacterescape, (i2 << 6) & 896), _handleunrecognizedcharacterescape, 0);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            refinedeserializationtype = getobjectidinfoAudioAttributesCompatParcelizer;
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-1771643000);
            Object theme = context.getTheme();
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(charSequence);
            boolean z = (((i2 & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i)) || (i2 & 6) == 4;
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(theme);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer | z) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = write(charSequence, resources, i);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            refineDeserializationType refinedeserializationtype2 = new refineDeserializationType((unshare) objOnPause, 0L, 0L, 6, null);
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            refinedeserializationtype = refinedeserializationtype2;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return refinedeserializationtype;
    }

    private static final findExpectedFormat read(Resources.Theme theme, Resources resources, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) throws XmlPullParserException {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:87)");
        }
        shouldIntrospectorImplicitConstructors shouldintrospectorimplicitconstructors = (shouldIntrospectorImplicitConstructors) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.RemoteActionCompatParcelizer());
        shouldIntrospectorImplicitConstructors.IconCompatParcelizer iconCompatParcelizer = new shouldIntrospectorImplicitConstructors.IconCompatParcelizer(theme, i);
        shouldIntrospectorImplicitConstructors.read readVarAudioAttributesCompatParcelizer = shouldintrospectorimplicitconstructors.AudioAttributesCompatParcelizer(iconCompatParcelizer);
        if (readVarAudioAttributesCompatParcelizer == null) {
            XmlResourceParser xml = resources.getXml(i);
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) isRecordType.IconCompatParcelizer(xml).getName(), (Object) "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            readVarAudioAttributesCompatParcelizer = ConstructorDetectorSingleArgConstructor.RemoteActionCompatParcelizer(theme, resources, xml, i2);
            shouldintrospectorimplicitconstructors.write(iconCompatParcelizer, readVarAudioAttributesCompatParcelizer);
        }
        findExpectedFormat remoteActionCompatParcelizer = readVarAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return remoteActionCompatParcelizer;
    }

    private static final unshare write(CharSequence charSequence, Resources resources, int i) {
        try {
            return getDefaultVisibility.read(unshare.INSTANCE, resources, i);
        } catch (Exception e) {
            throw new singleArgCreatorDefaultsToDelegating("Error attempting to load resource: ".concat(String.valueOf(charSequence)), e);
        }
    }
}
