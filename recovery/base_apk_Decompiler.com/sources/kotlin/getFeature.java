package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0085\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0002\u0010$\u001a\u0093\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00101\u001a\u0087\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00102\u001a\u0093\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u0002032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00104\u001a\u0087\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u0002032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00105\u001aÁ\u0001\u00106\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\r2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010(¢\u0006\u0002\b\r2\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u00108\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u00109\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010:\u001a\u00020;2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00010(2\u0011\u0010>\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\r2\u0006\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\u0010A\u001aW\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020/2\u0006\u0010G\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020;2\u0006\u0010?\u001a\u00020@H\u0002¢\u0006\u0004\bK\u0010L\u001aW\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020/2\u0006\u0010O\u001a\u00020/2\u0006\u0010P\u001a\u00020/2\u0006\u0010Q\u001a\u00020/2\u0006\u0010R\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020;2\u0006\u0010?\u001a\u00020@H\u0002¢\u0006\u0004\bS\u0010L\u001a|\u0010T\u001a\u00020\u0001*\u00020U2\u0006\u0010V\u001a\u00020/2\u0006\u0010W\u001a\u00020/2\b\u0010X\u001a\u0004\u0018\u00010Y2\b\u0010Z\u001a\u0004\u0018\u00010Y2\u0006\u0010[\u001a\u00020Y2\b\u0010\\\u001a\u0004\u0018\u00010Y2\b\u0010]\u001a\u0004\u0018\u00010Y2\u0006\u0010^\u001a\u00020Y2\u0006\u0010:\u001a\u00020;2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010J\u001a\u00020;2\u0006\u0010_\u001a\u00020`2\u0006\u0010?\u001a\u00020@H\u0002\u001a#\u0010a\u001a\u00020\u0005*\u00020\u00052\u0006\u0010b\u001a\u00020=2\u0006\u0010?\u001a\u00020@H\u0000¢\u0006\u0004\bc\u0010d\"\u0010\u0010e\u001a\u00020fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010g\"\u0016\u0010h\u001a\u00020iX\u0080\u0004¢\u0006\n\n\u0002\u0010l\u001a\u0004\bj\u0010k\"\u000e\u0010m\u001a\u00020&X\u0080T¢\u0006\u0002\n\u0000¨\u0006n"}, d2 = {"OutlinedTextField", "", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "onValueChange", "Lkotlin/Function1;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", "border", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateWidth-O3s9Psw", "(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "calculateHeight-O3s9Psw", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "Landroidx/compose/ui/unit/TextUnit;", "getOutlinedTextFieldTopPadding", "()J", "J", "BorderId", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getFeature {
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(4.0f);
    private static final long IconCompatParcelizer = setResolver.RemoteActionCompatParcelizer(8);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[tryToResolveUnresolved.values().length];
            try {
                iArr[tryToResolveUnresolved.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(final kotlin.hasValueTypeDeserializer r72, final kotlin.getAnswerMap<? super kotlin.hasValueTypeDeserializer, kotlin.getShowPopup> r73, kotlin._handleOddName r74, boolean r75, boolean r76, kotlin.deserializeWithObjectId r77, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r78, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r79, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r80, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r81, boolean r82, kotlin.addUnresolvedId r83, kotlin.setKeepContentOnPlayerReset r84, kotlin.setErrorMessageProvider r85, boolean r86, int r87, int r88, kotlin.hashCode r89, kotlin.findAndAddVirtualProperties r90, kotlin.FormatSchema r91, kotlin._handleUnrecognizedCharacterEscape r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instruction units count: 1605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFeature.RemoteActionCompatParcelizer(o.hasValueTypeDeserializer, o.getAnswerMap, o._handleOddName, boolean, boolean, o.deserializeWithObjectId, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, boolean, o.addUnresolvedId, o.setKeepContentOnPlayerReset, o.setErrorMessageProvider, boolean, int, int, o.hashCode, o.findAndAddVirtualProperties, o.FormatSchema, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getConfigOverride getconfigoverride) {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(hasValueTypeDeserializer hasvaluetypedeserializer, final boolean z, boolean z2, addUnresolvedId addunresolvedid, final hashCode hashcode, final boolean z3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, final findAndAddVirtualProperties findandaddvirtualproperties, final FormatSchema formatSchema, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (_handleunrecognizedcharacterescape.IconCompatParcelizer(magicModuleSubmissionRequestBody5) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1881867558, i2, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:589)");
            }
            FormatFeature.write.RemoteActionCompatParcelizer(hasvaluetypedeserializer.AudioAttributesCompatParcelizer(), magicModuleSubmissionRequestBody5, z, z2, addunresolvedid, hashcode, z3, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, findandaddvirtualproperties, formatSchema, null, multiplyFft.AudioAttributesCompatParcelizer(-185364670, true, new MagicModuleSubmissionRequestBody() { // from class: o.hasLenient
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getFeature.RemoteActionCompatParcelizer(z, z3, hashcode, formatSchema, findandaddvirtualproperties, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, (i2 << 3) & 112, 221184, 8192);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(boolean z, boolean z2, hashCode hashcode, FormatSchema formatSchema, findAndAddVirtualProperties findandaddvirtualproperties, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-185364670, i, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:604)");
            }
            FormatFeature.write.IconCompatParcelizer(z, z2, hashcode, formatSchema, findandaddvirtualproperties, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, _handleunrecognizedcharacterescape, 12582912, 96);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static final void write(final _handleOddName _handleoddname, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final getModuleData<? super _handleOddName, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody3, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody4, final boolean z, final float f, final getAnswerMap<? super calloc, getShowPopup> getanswermap, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody5, final getReturnTransition getreturntransition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(36320288);
        if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getmoduledata) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody5) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getreturntransition) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(36320288, i3, i4, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:685)");
            }
            boolean z2 = (234881024 & i3) == 67108864;
            boolean z3 = (3670016 & i3) == 1048576;
            boolean z4 = (29360128 & i3) == 8388608;
            boolean z5 = (i4 & 14) == 4;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z5 | z4 | z3 | z2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new withLenient(getanswermap, z, f, getreturntransition);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            tryToResolveUnresolved trytoresolveunresolved = (tryToResolveUnresolved) _handleunrecognizedcharacterescapeWrite.write(getDefaultNullValueSerializer.RatingCompat());
            withLenient withlenient = (withLenient) objOnPause;
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withlenient, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            magicModuleSubmissionRequestBody5.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i3 >> 27) & 14));
            if (magicModuleSubmissionRequestBody3 != null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1336978507);
                _handleOddName _handleoddnameIconCompatParcelizer = hasId.IconCompatParcelizer(isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "Leading"));
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
                int iAudioAttributesCompatParcelizer2 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer2);
                } else {
                    _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
                NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape3.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer2))) {
                    _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer2));
                    _handleunrecognizedcharacterescape3.read(Integer.valueOf(iAudioAttributesCompatParcelizer2), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer2);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                magicModuleSubmissionRequestBody3.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i3 >> 12) & 14));
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1302508491);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (magicModuleSubmissionRequestBody4 != null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1337267241);
                _handleOddName _handleoddnameIconCompatParcelizer2 = hasId.IconCompatParcelizer(isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "Trailing"));
                withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
                int iAudioAttributesCompatParcelizer3 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer2);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer3 = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer3);
                } else {
                    _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
                NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer3 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape4.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer3))) {
                    _handleunrecognizedcharacterescape4.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer3));
                    _handleunrecognizedcharacterescape4.read(Integer.valueOf(iAudioAttributesCompatParcelizer3), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer3);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
                magicModuleSubmissionRequestBody4.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i3 >> 15) & 14));
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1302508491);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            float fWrite = getParentFragment.write(getreturntransition, trytoresolveunresolved);
            float fIconCompatParcelizer = getParentFragment.read(getreturntransition, trytoresolveunresolved);
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            if (magicModuleSubmissionRequestBody3 != null) {
                fWrite = assignParameter.IconCompatParcelizer(getQues.read(assignParameter.IconCompatParcelizer(fWrite - JsonFactory.AudioAttributesCompatParcelizer()), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)));
            }
            float f2 = fWrite;
            if (magicModuleSubmissionRequestBody4 != null) {
                fIconCompatParcelizer = assignParameter.IconCompatParcelizer(getQues.read(assignParameter.IconCompatParcelizer(fIconCompatParcelizer - JsonFactory.AudioAttributesCompatParcelizer()), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)));
            }
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(companion, f2, BitmapDescriptorFactory.HUE_RED, fIconCompatParcelizer, BitmapDescriptorFactory.HUE_RED, 10, null);
            if (getmoduledata != null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1338367152);
                getmoduledata.AudioAttributesCompatParcelizer(isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "Hint").AudioAttributesCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer$default), _handleunrecognizedcharacterescapeWrite, Integer.valueOf((i3 >> 3) & 112));
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1302508491);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "TextField").AudioAttributesCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer$default);
            withTypeHandler withtypehandlerWrite3 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), true);
            int iAudioAttributesCompatParcelizer4 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler4 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer4 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer4 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer4);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerWrite3, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler4, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer4 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape5.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer4))) {
                _handleunrecognizedcharacterescape5.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer4));
                _handleunrecognizedcharacterescape5.read(Integer.valueOf(iAudioAttributesCompatParcelizer4), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer4);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer4, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation3 = setDrawerElevation.INSTANCE;
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i3 >> 3) & 14));
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (magicModuleSubmissionRequestBody2 != null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1338685429);
                _handleOddName _handleoddnameIconCompatParcelizer3 = isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "Label");
                withTypeHandler withtypehandlerWrite4 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iAudioAttributesCompatParcelizer5 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler5 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer5 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer3);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer5 = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer5);
                } else {
                    _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
                NumberOutput.write(_handleunrecognizedcharacterescape6, withtypehandlerWrite4, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape6, _getchardescHandleMediaPlayPauseIfPendingOnHandler5, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer5 = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
                if (_handleunrecognizedcharacterescape6.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape6.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer5))) {
                    _handleunrecognizedcharacterescape6.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer5));
                    _handleunrecognizedcharacterescape6.read(Integer.valueOf(iAudioAttributesCompatParcelizer5), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer5);
                }
                NumberOutput.write(_handleunrecognizedcharacterescape6, _handleoddnameRemoteActionCompatParcelizer5, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation4 = setDrawerElevation.INSTANCE;
                magicModuleSubmissionRequestBody2.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i3 >> 9) & 14));
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1302508491);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.hasPattern
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getFeature.write(_handleoddname, magicModuleSubmissionRequestBody, getmoduledata, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, z, f, getanswermap, magicModuleSubmissionRequestBody5, getreturntransition, i, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, getReturnTransition getreturntransition) {
        return PropertyValueBuffer.IconCompatParcelizer(j, Math.max(i + Math.max(i3, Math.max(AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(i4, 0, f), i5)) + i2, getOnline.RemoteActionCompatParcelizer((i4 + (assignParameter.IconCompatParcelizer(getreturntransition.read(tryToResolveUnresolved.write) + getreturntransition.RemoteActionCompatParcelizer(tryToResolveUnresolved.write)) * f2)) * f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, getReturnTransition getreturntransition) {
        int iMax = Math.max(i3, Math.max(i5, AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(i4, 0, f)));
        float read = getreturntransition.getRead() * f2;
        return PropertyValueBuffer.RemoteActionCompatParcelizer(j, Math.max(i, Math.max(i2, getOnline.RemoteActionCompatParcelizer(AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(read, Math.max(read, i4 / 2.0f), f) + iMax + (getreturntransition.getRemoteActionCompatParcelizer() * f2)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer, int i, int i2, _parser _parserVar, _parser _parserVar2, _parser _parserVar3, _parser _parserVar4, _parser _parserVar5, _parser _parserVar6, float f, boolean z, float f2, tryToResolveUnresolved trytoresolveunresolved, getReturnTransition getreturntransition) {
        int iRemoteActionCompatParcelizer = getOnline.RemoteActionCompatParcelizer(getreturntransition.getRead() * f2);
        int iRemoteActionCompatParcelizer2 = getOnline.RemoteActionCompatParcelizer(getParentFragment.write(getreturntransition, trytoresolveunresolved) * f2);
        float fAudioAttributesCompatParcelizer = JsonFactory.AudioAttributesCompatParcelizer();
        if (_parserVar != null) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar.getRemoteActionCompatParcelizer(), i), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        if (_parserVar2 != null) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar2, i2 - _parserVar2.getRead(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar2.getRemoteActionCompatParcelizer(), i), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        if (_parserVar4 != null) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar4, getOnline.RemoteActionCompatParcelizer(_parserVar == null ? BitmapDescriptorFactory.HUE_RED : (JsonFactory.read(_parserVar) - (fAudioAttributesCompatParcelizer * f2)) * (1.0f - f)) + iRemoteActionCompatParcelizer2, AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(z ? _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar4.getRemoteActionCompatParcelizer(), i) : iRemoteActionCompatParcelizer, -(_parserVar4.getRemoteActionCompatParcelizer() / 2), f), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar3, JsonFactory.read(_parserVar), Math.max(z ? _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar3.getRemoteActionCompatParcelizer(), i) : iRemoteActionCompatParcelizer, JsonFactory.RemoteActionCompatParcelizer(_parserVar4) / 2), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        if (_parserVar5 != null) {
            if (z) {
                iRemoteActionCompatParcelizer = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar5.getRemoteActionCompatParcelizer(), i);
            }
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar5, JsonFactory.read(_parserVar), Math.max(iRemoteActionCompatParcelizer, JsonFactory.RemoteActionCompatParcelizer(_parserVar4) / 2), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        _parser.IconCompatParcelizer.write$default(iconCompatParcelizer, _parserVar6, hasReferringProperties.INSTANCE.write(), BitmapDescriptorFactory.HUE_RED, 2, null);
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, final long j, final getReturnTransition getreturntransition) {
        return WriterBasedJsonGenerator.AudioAttributesCompatParcelizer(_handleoddname, new getAnswerMap() { // from class: o.getLocale
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getFeature.IconCompatParcelizer(j, getreturntransition, (findSerializer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(long j, getReturnTransition getreturntransition, findSerializer findserializer) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat2 > BitmapDescriptorFactory.HUE_RED) {
            float fAudioAttributesCompatParcelizer = findserializer.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer);
            float fAudioAttributesCompatParcelizer2 = findserializer.AudioAttributesCompatParcelizer(getreturntransition.read(findserializer.RemoteActionCompatParcelizer())) - fAudioAttributesCompatParcelizer;
            float fIntBitsToFloat3 = fIntBitsToFloat2 + fAudioAttributesCompatParcelizer2 + (fAudioAttributesCompatParcelizer * 2.0f);
            if (WhenMappings.AudioAttributesCompatParcelizer[findserializer.RemoteActionCompatParcelizer().ordinal()] != 1) {
                fIntBitsToFloat = getQues.read(fAudioAttributesCompatParcelizer2, BitmapDescriptorFactory.HUE_RED);
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (findserializer.MediaBrowserCompatCustomActionResultReceiver() >> 32)) - fIntBitsToFloat3;
            }
            float f = fIntBitsToFloat;
            if (WhenMappings.AudioAttributesCompatParcelizer[findserializer.RemoteActionCompatParcelizer().ordinal()] == 1) {
                fIntBitsToFloat3 = Float.intBitsToFloat((int) (findserializer.MediaBrowserCompatCustomActionResultReceiver() >> 32)) - getQues.read(fAudioAttributesCompatParcelizer2, BitmapDescriptorFactory.HUE_RED);
            }
            float f2 = fIntBitsToFloat3;
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) j);
            float f3 = (-fIntBitsToFloat4) / 2.0f;
            float f4 = fIntBitsToFloat4 / 2.0f;
            int iRemoteActionCompatParcelizer = ReadConstrainedTextBuffer.INSTANCE.RemoteActionCompatParcelizer();
            findSerializationTyping iconCompatParcelizer = findserializer.getIconCompatParcelizer();
            long jAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
            iconCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer();
            try {
                iconCompatParcelizer.getRemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(f, f3, f2, f4, iRemoteActionCompatParcelizer);
                findserializer.write();
            } finally {
                iconCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
                iconCompatParcelizer.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            }
        } else {
            findserializer.write();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(hasValueTypeDeserializer hasvaluetypedeserializer, getAnswerMap getanswermap, _handleOddName _handleoddname, boolean z, boolean z2, deserializeWithObjectId deserializewithobjectid, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, boolean z3, addUnresolvedId addunresolvedid, setKeepContentOnPlayerReset setkeepcontentonplayerreset, setErrorMessageProvider seterrormessageprovider, boolean z4, int i, int i2, hashCode hashcode, findAndAddVirtualProperties findandaddvirtualproperties, FormatSchema formatSchema, int i3, int i4, int i5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i6) {
        RemoteActionCompatParcelizer(hasvaluetypedeserializer, getanswermap, _handleoddname, z, z2, deserializewithobjectid, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, z3, addunresolvedid, setkeepcontentonplayerreset, seterrormessageprovider, z4, i, i2, hashcode, findandaddvirtualproperties, formatSchema, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), _appendEscaped.RemoteActionCompatParcelizer(i4), i5);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getModuleData getmoduledata, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, boolean z, float f, getAnswerMap getanswermap, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody5, getReturnTransition getreturntransition, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        write(_handleoddname, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, (getModuleData<? super _handleOddName, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) getmoduledata, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody2, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody3, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody4, z, f, (getAnswerMap<? super calloc, getShowPopup>) getanswermap, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody5, getreturntransition, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2));
        return getShowPopup.INSTANCE;
    }
}
