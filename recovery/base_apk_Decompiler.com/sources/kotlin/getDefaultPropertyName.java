package kotlin;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin._asSet;
import kotlin._handleApos;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/JsonTypeInfoNone;", "p0", "", "AudioAttributesCompatParcelizer", "(ILo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getDefaultPropertyName {
    public static final String AudioAttributesCompatParcelizer(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        String string;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-726638443, i2, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.read());
        Resources resources = ((Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer())).getResources();
        if (JsonTypeInfoNone.write(i, JsonTypeInfoNone.INSTANCE.AudioAttributesCompatParcelizer())) {
            string = resources.getString(_handleApos.IconCompatParcelizer.navigation_menu);
        } else if (JsonTypeInfoNone.write(i, JsonTypeInfoNone.INSTANCE.RemoteActionCompatParcelizer())) {
            string = resources.getString(_handleApos.IconCompatParcelizer.close_drawer);
        } else if (JsonTypeInfoNone.write(i, JsonTypeInfoNone.INSTANCE.write())) {
            string = resources.getString(_handleApos.IconCompatParcelizer.close_sheet);
        } else if (JsonTypeInfoNone.write(i, JsonTypeInfoNone.INSTANCE.IconCompatParcelizer())) {
            string = resources.getString(_handleApos.IconCompatParcelizer.default_error_message);
        } else if (JsonTypeInfoNone.write(i, JsonTypeInfoNone.INSTANCE.read())) {
            string = resources.getString(_handleApos.IconCompatParcelizer.dropdown_menu);
        } else if (JsonTypeInfoNone.write(i, JsonTypeInfoNone.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            string = resources.getString(_handleApos.IconCompatParcelizer.range_start);
        } else if (JsonTypeInfoNone.write(i, JsonTypeInfoNone.INSTANCE.AudioAttributesImplBaseParcelizer())) {
            string = resources.getString(_handleApos.IconCompatParcelizer.range_end);
        } else {
            string = JsonTypeInfoNone.write(i, JsonTypeInfoNone.INSTANCE.MediaBrowserCompatItemReceiver()) ? resources.getString(_asSet.read.mc2_snackbar_pane_title) : "";
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return string;
    }
}
