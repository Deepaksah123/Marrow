package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%JM\u0010&\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u0005H\u0007¢\u0006\u0004\b+\u0010,J5\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u0005¢\u0006\u0004\b3\u00104J5\u00105\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u0005¢\u0006\u0004\b6\u00104J5\u00107\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u0005¢\u0006\u0004\b8\u00104Já\u0001\u00109\u001a\u00020!2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010@\u001a\u00020;2\b\b\u0002\u0010A\u001a\u00020;2\b\b\u0002\u0010B\u001a\u00020;2\b\b\u0002\u0010C\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007¢\u0006\u0004\bP\u0010QJá\u0001\u0010R\u001a\u00020!2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010S\u001a\u00020;2\b\b\u0002\u0010T\u001a\u00020;2\b\b\u0002\u0010U\u001a\u00020;2\b\b\u0002\u0010V\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007¢\u0006\u0004\bW\u0010QJÌ\u0001\u0010X\u001a\u00020'2\u0006\u0010Y\u001a\u00020Z2\u0011\u0010[\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020`2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0015\b\u0002\u0010a\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010b\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010c\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010d\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010e\u001a\u00020.H\u0007¢\u0006\u0002\u0010fJá\u0001\u0010g\u001a\u00020'2\u0006\u0010Y\u001a\u00020Z2\u0011\u0010[\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020`2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0015\b\u0002\u0010a\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010b\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010c\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010d\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010e\u001a\u00020.2\u0013\b\u0002\u0010h\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]H\u0007¢\u0006\u0002\u0010iJÂ\u0001\u0010X\u001a\u00020'2\u0006\u0010Y\u001a\u00020Z2\u0011\u0010[\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020`2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0015\b\u0002\u0010a\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010b\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010c\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010d\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010e\u001a\u00020.H\u0007¢\u0006\u0002\u0010jJ×\u0001\u0010g\u001a\u00020'2\u0006\u0010Y\u001a\u00020Z2\u0011\u0010[\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020`2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0015\b\u0002\u0010a\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010b\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010c\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010d\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010e\u001a\u00020.2\u0013\b\u0002\u0010h\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]H\u0007¢\u0006\u0002\u0010kR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007R\u0013\u0010\u0015\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0016\u0010\u0007R\u000e\u0010\u0017\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006l"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "<init>", "()V", "MinHeight", "Landroidx/compose/ui/unit/Dp;", "getMinHeight-D9Ej5fM", "()F", "F", "MinWidth", "getMinWidth-D9Ej5fM", "IconOpacity", "", "TextFieldShape", "Landroidx/compose/ui/graphics/Shape;", "getTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "OutlinedTextFieldShape", "getOutlinedTextFieldShape", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "BackgroundOpacity", "UnfocusedIndicatorLineOpacity", "indicatorLine", "Landroidx/compose/ui/Modifier;", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "BorderBox", "", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "textFieldWithLabelPadding", "Landroidx/compose/foundation/layout/PaddingValues;", TtmlNode.START, TtmlNode.END, "top", "bottom", "textFieldWithLabelPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "outlinedTextFieldPadding", "outlinedTextFieldPadding-a9UjIt4", "textFieldColors", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "textFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "outlinedTextFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-dx8h9Zs", "TextFieldDecorationBox", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldDecorationBox", "border", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FormatFeature {
    public static final FormatFeature write = new FormatFeature();
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(56.0f);
    private static final float read = assignParameter.IconCompatParcelizer(280.0f);
    private static final float AudioAttributesCompatParcelizer = assignParameter.IconCompatParcelizer(1.0f);
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(2.0f);

    /* JADX INFO: renamed from: o.FormatFeature$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "AudioAttributesCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ inset $AudioAttributesCompatParcelizer;
        final /* synthetic */ boolean $AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ float $IconCompatParcelizer;
        final /* synthetic */ float $RemoteActionCompatParcelizer;
        final /* synthetic */ FormatSchema $read;
        final /* synthetic */ boolean $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            AudioAttributesCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(as asVar) {
            asVar.write("indicatorLine");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("enabled", Boolean.valueOf(this.$write));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("isError", Boolean.valueOf(this.$AudioAttributesImplApi26Parcelizer));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("interactionSource", this.$AudioAttributesCompatParcelizer);
            asVar.getIconCompatParcelizer().IconCompatParcelizer("colors", this.$read);
            asVar.getIconCompatParcelizer().IconCompatParcelizer("focusedIndicatorLineThickness", assignParameter.read(this.$IconCompatParcelizer));
            asVar.getIconCompatParcelizer().IconCompatParcelizer("unfocusedIndicatorLineThickness", assignParameter.read(this.$RemoteActionCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2, inset insetVar, FormatSchema formatSchema, float f, float f2) {
            super(1);
            this.$write = z;
            this.$AudioAttributesImplApi26Parcelizer = z2;
            this.$AudioAttributesCompatParcelizer = insetVar;
            this.$read = formatSchema;
            this.$IconCompatParcelizer = f;
            this.$RemoteActionCompatParcelizer = f2;
        }
    }

    private FormatFeature() {
    }

    public final float read() {
        return RemoteActionCompatParcelizer;
    }

    public final float IconCompatParcelizer() {
        return read;
    }

    public final findAndAddVirtualProperties AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1117199624, i, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:221)");
        }
        setPlayedColor setplayedcolor = setPlayedColor.read$default(enabled.INSTANCE.read(_handleunrecognizedcharacterescape, 6).getRead(), null, null, LegacyPlayerControlView.RemoteActionCompatParcelizer(), LegacyPlayerControlView.RemoteActionCompatParcelizer(), 3, null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return setplayedcolor;
    }

    public final findAndAddVirtualProperties write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1899109048, i, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:228)");
        }
        setPlayedColor read2 = enabled.INSTANCE.read(_handleunrecognizedcharacterescape, 6).getRead();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return read2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _handleOddName write(boolean z, boolean z2, inset insetVar, FormatSchema formatSchema, float f, float f2, _handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(1398930845);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1398930845, i, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:288)");
        }
        _handleOddName _handleoddnameIconCompatParcelizer = _getBufferRecycler.IconCompatParcelizer(_handleOddName.INSTANCE, (setUncaughtExceptionHandlerui) bits.RemoteActionCompatParcelizer(z, z2, insetVar, formatSchema, f, f2, _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer());
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return _handleoddnameIconCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(final boolean r21, final boolean r22, final kotlin.inset r23, final kotlin.FormatSchema r24, kotlin.findAndAddVirtualProperties r25, float r26, float r27, kotlin._handleUnrecognizedCharacterEscape r28, final int r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.FormatFeature.IconCompatParcelizer(boolean, boolean, o.inset, o.FormatSchema, o.findAndAddVirtualProperties, float, float, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    public static /* synthetic */ getReturnTransition write(FormatFeature formatFeature, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = JsonFactory.read();
        }
        if ((i & 2) != 0) {
            f2 = JsonFactory.read();
        }
        if ((i & 4) != 0) {
            f3 = _getBufferRecycler.read();
        }
        if ((i & 8) != 0) {
            f4 = _getBufferRecycler.IconCompatParcelizer();
        }
        return formatFeature.AudioAttributesCompatParcelizer(f, f2, f3, f4);
    }

    public final getReturnTransition AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4) {
        return getParentFragment.read(f, f3, f2, f4);
    }

    public static /* synthetic */ getReturnTransition IconCompatParcelizer(FormatFeature formatFeature, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = JsonFactory.read();
        }
        if ((i & 2) != 0) {
            f2 = JsonFactory.read();
        }
        if ((i & 4) != 0) {
            f3 = JsonFactory.read();
        }
        if ((i & 8) != 0) {
            f4 = JsonFactory.read();
        }
        return formatFeature.RemoteActionCompatParcelizer(f, f2, f3, f4);
    }

    public final getReturnTransition RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
        return getParentFragment.read(f, f2, f3, f4);
    }

    public static /* synthetic */ getReturnTransition RemoteActionCompatParcelizer(FormatFeature formatFeature, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = JsonFactory.read();
        }
        if ((i & 2) != 0) {
            f2 = JsonFactory.read();
        }
        if ((i & 4) != 0) {
            f3 = JsonFactory.read();
        }
        if ((i & 8) != 0) {
            f4 = JsonFactory.read();
        }
        return formatFeature.write(f, f2, f3, f4);
    }

    public final getReturnTransition write(float f, float f2, float f3, float f4) {
        return getParentFragment.read(f, f2, f3, f4);
    }

    public final FormatSchema read(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2, int i3, int i4) {
        long j22;
        long jAudioAttributesCompatParcelizer$default;
        long j23;
        int i5;
        long jWrite;
        long j24;
        long jAudioAttributesCompatParcelizer$default2;
        long j25;
        long jAudioAttributesCompatParcelizer$default3;
        long j26;
        long jAudioAttributesCompatParcelizer$default4;
        long j27;
        int i6;
        long jWrite2;
        long j28;
        long jAudioAttributesCompatParcelizer$default5;
        long j29;
        long jAudioAttributesCompatParcelizer$default6;
        long j30;
        int i7;
        long jWrite3;
        long j31;
        long j32;
        long jAudioAttributesCompatParcelizer$default7 = (i4 & 1) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(((switchToNext) _handleunrecognizedcharacterescape.write(R.RemoteActionCompatParcelizer())).getIconCompatParcelizer(), ((Number) _handleunrecognizedcharacterescape.write(AccessToken.AudioAttributesCompatParcelizer())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j;
        long jAudioAttributesCompatParcelizer$default8 = (i4 & 2) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default7, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j2;
        long jAudioAttributesCompatParcelizer$default9 = (i4 & 4) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j3;
        long jAudioAttributesImplApi26Parcelizer = (i4 & 8) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).AudioAttributesImplApi26Parcelizer() : j4;
        long jWrite4 = (i4 & 16) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).write() : j5;
        long jAudioAttributesCompatParcelizer$default10 = (i4 & 32) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).AudioAttributesImplApi26Parcelizer(), GraphRequestParcelableResourceWithMimeType.INSTANCE.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j6;
        long jAudioAttributesCompatParcelizer$default11 = (i4 & 64) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), 0.42f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j7;
        if ((i4 & 128) != 0) {
            j22 = jAudioAttributesCompatParcelizer$default9;
            jAudioAttributesCompatParcelizer$default = switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default11, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j22 = jAudioAttributesCompatParcelizer$default9;
            jAudioAttributesCompatParcelizer$default = j8;
        }
        if ((i4 & 256) != 0) {
            j23 = jAudioAttributesCompatParcelizer$default;
            i5 = 6;
            jWrite = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).write();
        } else {
            j23 = jAudioAttributesCompatParcelizer$default;
            i5 = 6;
            jWrite = j9;
        }
        long jAudioAttributesCompatParcelizer$default12 = (i4 & 512) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, i5).MediaBrowserCompatItemReceiver(), 0.54f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            j24 = jAudioAttributesCompatParcelizer$default11;
            jAudioAttributesCompatParcelizer$default2 = switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default12, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j24 = jAudioAttributesCompatParcelizer$default11;
            jAudioAttributesCompatParcelizer$default2 = j11;
        }
        long j33 = (i4 & 2048) != 0 ? jAudioAttributesCompatParcelizer$default12 : j12;
        if ((i4 & 4096) != 0) {
            j25 = jAudioAttributesCompatParcelizer$default2;
            jAudioAttributesCompatParcelizer$default3 = switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), 0.54f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j25 = jAudioAttributesCompatParcelizer$default2;
            jAudioAttributesCompatParcelizer$default3 = j13;
        }
        if ((i4 & 8192) != 0) {
            j26 = jAudioAttributesCompatParcelizer$default12;
            jAudioAttributesCompatParcelizer$default4 = switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default3, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j26 = jAudioAttributesCompatParcelizer$default12;
            jAudioAttributesCompatParcelizer$default4 = j14;
        }
        if ((i4 & 16384) != 0) {
            j27 = jAudioAttributesCompatParcelizer$default4;
            i6 = 6;
            jWrite2 = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).write();
        } else {
            j27 = jAudioAttributesCompatParcelizer$default4;
            i6 = 6;
            jWrite2 = j15;
        }
        long jAudioAttributesCompatParcelizer$default13 = (32768 & i4) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, i6).AudioAttributesImplApi26Parcelizer(), GraphRequestParcelableResourceWithMimeType.INSTANCE.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, i6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j16;
        if ((65536 & i4) != 0) {
            j28 = jAudioAttributesCompatParcelizer$default13;
            jAudioAttributesCompatParcelizer$default5 = switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), GraphRequestParcelableResourceWithMimeType.INSTANCE.read(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j28 = jAudioAttributesCompatParcelizer$default13;
            jAudioAttributesCompatParcelizer$default5 = j17;
        }
        if ((131072 & i4) != 0) {
            j29 = jAudioAttributesCompatParcelizer$default3;
            jAudioAttributesCompatParcelizer$default6 = switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default5, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j29 = jAudioAttributesCompatParcelizer$default3;
            jAudioAttributesCompatParcelizer$default6 = j18;
        }
        if ((262144 & i4) != 0) {
            j30 = jAudioAttributesCompatParcelizer$default6;
            i7 = 6;
            jWrite3 = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).write();
        } else {
            j30 = jAudioAttributesCompatParcelizer$default6;
            i7 = 6;
            jWrite3 = j19;
        }
        long jAudioAttributesCompatParcelizer$default14 = (524288 & i4) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, i7).MediaBrowserCompatItemReceiver(), GraphRequestParcelableResourceWithMimeType.INSTANCE.read(_handleunrecognizedcharacterescape, i7), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j20;
        long jAudioAttributesCompatParcelizer$default15 = (i4 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default14, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j21;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            j31 = jAudioAttributesCompatParcelizer$default15;
            j32 = jAudioAttributesCompatParcelizer$default14;
            _validJsonValueList.AudioAttributesCompatParcelizer(231892599, i, i2, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:397)");
        } else {
            j31 = jAudioAttributesCompatParcelizer$default15;
            j32 = jAudioAttributesCompatParcelizer$default14;
        }
        updateBounds updatebounds = new updateBounds(jAudioAttributesCompatParcelizer$default7, jAudioAttributesCompatParcelizer$default8, jAudioAttributesImplApi26Parcelizer, jWrite4, jAudioAttributesCompatParcelizer$default10, j24, jWrite, j23, j26, j25, j33, j29, j27, jWrite2, j22, j28, jAudioAttributesCompatParcelizer$default5, j30, jWrite3, j32, j31, null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return updatebounds;
    }

    public final FormatSchema IconCompatParcelizer(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2, int i3, int i4) {
        long j22;
        long jAudioAttributesCompatParcelizer$default;
        long j23;
        int i5;
        long jWrite;
        long j24;
        long jAudioAttributesCompatParcelizer$default2;
        long j25;
        long jAudioAttributesCompatParcelizer$default3;
        long j26;
        long jAudioAttributesCompatParcelizer$default4;
        long j27;
        int i6;
        long jWrite2;
        long j28;
        long jAudioAttributesCompatParcelizer$default5;
        long j29;
        long jAudioAttributesCompatParcelizer$default6;
        long j30;
        int i7;
        long jWrite3;
        long j31;
        long j32;
        long jAudioAttributesCompatParcelizer$default7 = (i4 & 1) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(((switchToNext) _handleunrecognizedcharacterescape.write(R.RemoteActionCompatParcelizer())).getIconCompatParcelizer(), ((Number) _handleunrecognizedcharacterescape.write(AccessToken.AudioAttributesCompatParcelizer())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j;
        long jAudioAttributesCompatParcelizer$default8 = (i4 & 2) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default7, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j2;
        long jAudioAttributesImplBaseParcelizer = (i4 & 4) != 0 ? switchToNext.INSTANCE.AudioAttributesImplBaseParcelizer() : j3;
        long jAudioAttributesImplApi26Parcelizer = (i4 & 8) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).AudioAttributesImplApi26Parcelizer() : j4;
        long jWrite4 = (i4 & 16) != 0 ? enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).write() : j5;
        long jAudioAttributesCompatParcelizer$default9 = (i4 & 32) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).AudioAttributesImplApi26Parcelizer(), GraphRequestParcelableResourceWithMimeType.INSTANCE.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j6;
        if ((i4 & 64) != 0) {
            j22 = jAudioAttributesImplBaseParcelizer;
            jAudioAttributesCompatParcelizer$default = switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j22 = jAudioAttributesImplBaseParcelizer;
            jAudioAttributesCompatParcelizer$default = j7;
        }
        long jAudioAttributesCompatParcelizer$default10 = (i4 & 128) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j8;
        if ((i4 & 256) != 0) {
            j23 = jAudioAttributesCompatParcelizer$default10;
            i5 = 6;
            jWrite = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).write();
        } else {
            j23 = jAudioAttributesCompatParcelizer$default10;
            i5 = 6;
            jWrite = j9;
        }
        long jAudioAttributesCompatParcelizer$default11 = (i4 & 512) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, i5).MediaBrowserCompatItemReceiver(), 0.54f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            j24 = jAudioAttributesCompatParcelizer$default;
            jAudioAttributesCompatParcelizer$default2 = switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default11, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j24 = jAudioAttributesCompatParcelizer$default;
            jAudioAttributesCompatParcelizer$default2 = j11;
        }
        long j33 = (i4 & 2048) != 0 ? jAudioAttributesCompatParcelizer$default11 : j12;
        if ((i4 & 4096) != 0) {
            j25 = jAudioAttributesCompatParcelizer$default2;
            jAudioAttributesCompatParcelizer$default3 = switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), 0.54f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j25 = jAudioAttributesCompatParcelizer$default2;
            jAudioAttributesCompatParcelizer$default3 = j13;
        }
        if ((i4 & 8192) != 0) {
            j26 = jAudioAttributesCompatParcelizer$default11;
            jAudioAttributesCompatParcelizer$default4 = switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default3, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j26 = jAudioAttributesCompatParcelizer$default11;
            jAudioAttributesCompatParcelizer$default4 = j14;
        }
        if ((i4 & 16384) != 0) {
            j27 = jAudioAttributesCompatParcelizer$default4;
            i6 = 6;
            jWrite2 = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).write();
        } else {
            j27 = jAudioAttributesCompatParcelizer$default4;
            i6 = 6;
            jWrite2 = j15;
        }
        long jAudioAttributesCompatParcelizer$default12 = (32768 & i4) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, i6).AudioAttributesImplApi26Parcelizer(), GraphRequestParcelableResourceWithMimeType.INSTANCE.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, i6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j16;
        if ((65536 & i4) != 0) {
            j28 = jAudioAttributesCompatParcelizer$default12;
            jAudioAttributesCompatParcelizer$default5 = switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).MediaBrowserCompatItemReceiver(), GraphRequestParcelableResourceWithMimeType.INSTANCE.read(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j28 = jAudioAttributesCompatParcelizer$default12;
            jAudioAttributesCompatParcelizer$default5 = j17;
        }
        if ((131072 & i4) != 0) {
            j29 = jAudioAttributesCompatParcelizer$default3;
            jAudioAttributesCompatParcelizer$default6 = switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default5, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            j29 = jAudioAttributesCompatParcelizer$default3;
            jAudioAttributesCompatParcelizer$default6 = j18;
        }
        if ((262144 & i4) != 0) {
            j30 = jAudioAttributesCompatParcelizer$default6;
            i7 = 6;
            jWrite3 = enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6).write();
        } else {
            j30 = jAudioAttributesCompatParcelizer$default6;
            i7 = 6;
            jWrite3 = j19;
        }
        long jAudioAttributesCompatParcelizer$default13 = (524288 & i4) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, i7).MediaBrowserCompatItemReceiver(), GraphRequestParcelableResourceWithMimeType.INSTANCE.read(_handleunrecognizedcharacterescape, i7), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j20;
        long jAudioAttributesCompatParcelizer$default14 = (i4 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? switchToNext.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default13, GraphRequestParcelableResourceWithMimeType.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j21;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            j31 = jAudioAttributesCompatParcelizer$default14;
            j32 = jAudioAttributesCompatParcelizer$default13;
            _validJsonValueList.AudioAttributesCompatParcelizer(1762667317, i, i2, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:451)");
        } else {
            j31 = jAudioAttributesCompatParcelizer$default14;
            j32 = jAudioAttributesCompatParcelizer$default13;
        }
        updateBounds updatebounds = new updateBounds(jAudioAttributesCompatParcelizer$default7, jAudioAttributesCompatParcelizer$default8, jAudioAttributesImplApi26Parcelizer, jWrite4, jAudioAttributesCompatParcelizer$default9, j24, jWrite, j23, j26, j25, j33, j29, j27, jWrite2, j22, j28, jAudioAttributesCompatParcelizer$default5, j30, jWrite3, j32, j31, null);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return updatebounds;
    }

    public final void RemoteActionCompatParcelizer(final String str, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final boolean z, final boolean z2, final addUnresolvedId addunresolvedid, final inset insetVar, boolean z3, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody4, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody5, findAndAddVirtualProperties findandaddvirtualproperties, FormatSchema formatSchema, getReturnTransition getreturntransition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final boolean z4;
        final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody6;
        final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody7;
        MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody8;
        final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody9;
        final findAndAddVirtualProperties findandaddvirtualproperties2;
        final FormatSchema formatSchema2;
        final getReturnTransition getreturntransition2;
        boolean z5;
        MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody10;
        MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody11;
        MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody12;
        findAndAddVirtualProperties findandaddvirtualproperties3;
        int i6;
        FormatSchema formatSchema3;
        getReturnTransition getreturntransitionWrite;
        int i7;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(2088762355);
        if ((i & 6) == 0) {
            i4 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        int i8 = 1024;
        if ((i & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(addunresolvedid) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(insetVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i10 = i3 & 128;
        if (i10 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 8388608 : 4194304;
        }
        int i11 = i3 & 256;
        if (i11 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody3) ? 67108864 : 33554432;
        }
        int i12 = i3 & 512;
        if (i12 != 0) {
            i4 |= C.ENCODING_PCM_32BIT;
        } else if ((i & C.ENCODING_PCM_32BIT) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody4) ? 536870912 : 268435456;
        }
        int i13 = i3 & 1024;
        if (i13 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody5) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= ((i3 & 2048) == 0 && _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(findandaddvirtualproperties)) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= ((i3 & 4096) == 0 && _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(formatSchema)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8192) == 0 && _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getreturntransition)) {
                i8 = 2048;
            }
            i5 |= i8;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(this) ? 16384 : 8192;
        }
        int i14 = i5;
        if (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(((i4 & 306783379) == 306783378 && (i14 & 9363) == 9362) ? false : true, i4 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepare();
            if ((i & 1) == 0 || _handleunrecognizedcharacterescapeWrite.onFastForward()) {
                z5 = i9 != 0 ? false : z3;
                magicModuleSubmissionRequestBody10 = i10 != 0 ? null : magicModuleSubmissionRequestBody2;
                magicModuleSubmissionRequestBody11 = i11 != 0 ? null : magicModuleSubmissionRequestBody3;
                magicModuleSubmissionRequestBody8 = i12 != 0 ? null : magicModuleSubmissionRequestBody4;
                magicModuleSubmissionRequestBody12 = i13 != 0 ? null : magicModuleSubmissionRequestBody5;
                if ((i3 & 2048) != 0) {
                    findAndAddVirtualProperties findandaddvirtualpropertiesAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, (i14 >> 12) & 14);
                    i14 &= -113;
                    findandaddvirtualproperties3 = findandaddvirtualpropertiesAudioAttributesCompatParcelizer;
                } else {
                    findandaddvirtualproperties3 = findandaddvirtualproperties;
                }
                int i15 = i14;
                if ((i3 & 4096) != 0) {
                    _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                    i6 = i4;
                    formatSchema3 = read(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, _handleunrecognizedcharacterescape2, 0, 0, (i15 >> 9) & 112, 2097151);
                    i15 &= -897;
                } else {
                    i6 = i4;
                    _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                    formatSchema3 = formatSchema;
                }
                if ((i3 & 8192) != 0) {
                    if (magicModuleSubmissionRequestBody10 == null) {
                        getreturntransitionWrite = IconCompatParcelizer(this, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15, (Object) null);
                    } else {
                        getreturntransitionWrite = write(this, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15, (Object) null);
                    }
                    i14 = i15 & (-7169);
                } else {
                    getreturntransitionWrite = getreturntransition;
                    i14 = i15;
                }
            } else {
                _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
                if ((i3 & 2048) != 0) {
                    i14 &= -113;
                }
                if ((i3 & 4096) != 0) {
                    i14 &= -897;
                }
                if ((i3 & 8192) != 0) {
                    i14 &= -7169;
                }
                z5 = z3;
                magicModuleSubmissionRequestBody10 = magicModuleSubmissionRequestBody2;
                magicModuleSubmissionRequestBody11 = magicModuleSubmissionRequestBody3;
                magicModuleSubmissionRequestBody8 = magicModuleSubmissionRequestBody4;
                magicModuleSubmissionRequestBody12 = magicModuleSubmissionRequestBody5;
                findandaddvirtualproperties3 = findandaddvirtualproperties;
                formatSchema3 = formatSchema;
                i6 = i4;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                getreturntransitionWrite = getreturntransition;
            }
            _handleunrecognizedcharacterescape2.IconCompatParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                i7 = i6;
                _validJsonValueList.AudioAttributesCompatParcelizer(2088762355, i7, i14, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:550)");
            } else {
                i7 = i6;
            }
            int i16 = i7 << 3;
            int i17 = i7 >> 9;
            int i18 = i14 << 6;
            JsonFactory.IconCompatParcelizer(_copyCurrentIntValue.read, str, magicModuleSubmissionRequestBody, addunresolvedid, magicModuleSubmissionRequestBody10, magicModuleSubmissionRequestBody11, magicModuleSubmissionRequestBody8, magicModuleSubmissionRequestBody12, z2, z, z5, insetVar, getreturntransitionWrite, findandaddvirtualproperties3, formatSchema3, null, _handleunrecognizedcharacterescape2, (i16 & 112) | 6 | (i16 & 896) | ((i7 >> 3) & 7168) | (57344 & i17) | (458752 & i17) | (i17 & 3670016) | ((i14 << 21) & 29360128) | ((i7 << 15) & 234881024) | ((i7 << 21) & 1879048192), ((i7 >> 18) & 14) | 196608 | ((i7 >> 12) & 112) | ((i14 >> 3) & 896) | (i18 & 7168) | (57344 & i18));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            formatSchema2 = formatSchema3;
            getreturntransition2 = getreturntransitionWrite;
            z4 = z5;
            magicModuleSubmissionRequestBody6 = magicModuleSubmissionRequestBody10;
            magicModuleSubmissionRequestBody7 = magicModuleSubmissionRequestBody11;
            magicModuleSubmissionRequestBody9 = magicModuleSubmissionRequestBody12;
            findandaddvirtualproperties2 = findandaddvirtualproperties3;
        } else {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            z4 = z3;
            magicModuleSubmissionRequestBody6 = magicModuleSubmissionRequestBody2;
            magicModuleSubmissionRequestBody7 = magicModuleSubmissionRequestBody3;
            magicModuleSubmissionRequestBody8 = magicModuleSubmissionRequestBody4;
            magicModuleSubmissionRequestBody9 = magicModuleSubmissionRequestBody5;
            findandaddvirtualproperties2 = findandaddvirtualproperties;
            formatSchema2 = formatSchema;
            getreturntransition2 = getreturntransition;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody13 = magicModuleSubmissionRequestBody8;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getOriginalMessage
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return FormatFeature.write(this.read, str, magicModuleSubmissionRequestBody, z, z2, addunresolvedid, insetVar, z4, magicModuleSubmissionRequestBody6, magicModuleSubmissionRequestBody7, magicModuleSubmissionRequestBody13, magicModuleSubmissionRequestBody9, findandaddvirtualproperties2, formatSchema2, getreturntransition2, i, i2, i3, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(boolean z, boolean z2, inset insetVar, FormatSchema formatSchema, findAndAddVirtualProperties findandaddvirtualproperties, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1212923596, i, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
            }
            write.IconCompatParcelizer(z, z2, insetVar, formatSchema, findandaddvirtualproperties, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape, 12582912, 96);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(final java.lang.String r60, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r61, final boolean r62, final boolean r63, final kotlin.addUnresolvedId r64, final kotlin.inset r65, boolean r66, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r67, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r68, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r69, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r70, kotlin.findAndAddVirtualProperties r71, kotlin.FormatSchema r72, kotlin.getReturnTransition r73, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r74, kotlin._handleUnrecognizedCharacterEscape r75, final int r76, final int r77, final int r78) {
        /*
            Method dump skipped, instruction units count: 975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.FormatFeature.RemoteActionCompatParcelizer(java.lang.String, o.MagicModuleSubmissionRequestBody, boolean, boolean, o.addUnresolvedId, o.inset, boolean, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.findAndAddVirtualProperties, o.FormatSchema, o.getReturnTransition, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    public final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, final boolean z, final boolean z2, final inset insetVar, final FormatSchema formatSchema, final float f, final float f2) {
        return _verifyNLZ2.AudioAttributesCompatParcelizer(_handleoddname, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass2(z, z2, insetVar, formatSchema, f, f2) : C0214type.read(), new getModuleData() { // from class: o.getProcessor
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return FormatFeature.write(z, z2, insetVar, formatSchema, f, f2, (_handleOddName) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(FormatFeature formatFeature, boolean z, boolean z2, inset insetVar, FormatSchema formatSchema, findAndAddVirtualProperties findandaddvirtualproperties, float f, float f2, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        formatFeature.IconCompatParcelizer(z, z2, insetVar, formatSchema, findandaddvirtualproperties, f, f2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(FormatFeature formatFeature, String str, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, boolean z, boolean z2, addUnresolvedId addunresolvedid, inset insetVar, boolean z3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody5, findAndAddVirtualProperties findandaddvirtualproperties, FormatSchema formatSchema, getReturnTransition getreturntransition, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody6, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        formatFeature.RemoteActionCompatParcelizer(str, magicModuleSubmissionRequestBody, z, z2, addunresolvedid, insetVar, z3, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, magicModuleSubmissionRequestBody5, findandaddvirtualproperties, formatSchema, getreturntransition, magicModuleSubmissionRequestBody6, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2), i3);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(FormatFeature formatFeature, String str, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, boolean z, boolean z2, addUnresolvedId addunresolvedid, inset insetVar, boolean z3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody5, findAndAddVirtualProperties findandaddvirtualproperties, FormatSchema formatSchema, getReturnTransition getreturntransition, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        formatFeature.RemoteActionCompatParcelizer(str, magicModuleSubmissionRequestBody, z, z2, addunresolvedid, insetVar, z3, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, magicModuleSubmissionRequestBody5, findandaddvirtualproperties, formatSchema, getreturntransition, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2), i3);
        return getShowPopup.INSTANCE;
    }
}
