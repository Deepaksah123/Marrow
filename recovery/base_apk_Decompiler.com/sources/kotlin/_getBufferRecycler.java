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
@Metadata(d1 = {"\u0000Ä\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0085\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0002\u0010$\u001a\u0093\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00101\u001a\u0087\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00102\u001a\u0093\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u0002032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00104\u001a\u0087\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u0002032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00105\u001a\u009a\u0001\u00106\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010(¢\u0006\u0002\b\r2\u0013\u00108\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u00109\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\u0010>\u001a?\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020/2\u0006\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020FH\u0002¢\u0006\u0004\bG\u0010H\u001aW\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020/2\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020/2\u0006\u0010O\u001a\u00020/2\u0006\u0010E\u001a\u00020F2\u0006\u0010P\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002¢\u0006\u0004\bQ\u0010R\u001at\u0010S\u001a\u00020\u0001*\u00020T2\u0006\u0010U\u001a\u00020/2\u0006\u0010V\u001a\u00020/2\u0006\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010Z\u001a\u0004\u0018\u00010X2\b\u0010[\u001a\u0004\u0018\u00010X2\b\u0010\\\u001a\u0004\u0018\u00010X2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010]\u001a\u00020/2\u0006\u0010^\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0006\u0010P\u001a\u00020;H\u0002\u001aZ\u0010_\u001a\u00020\u0001*\u00020T2\u0006\u0010U\u001a\u00020/2\u0006\u0010V\u001a\u00020/2\u0006\u0010`\u001a\u00020X2\b\u0010Z\u001a\u0004\u0018\u00010X2\b\u0010[\u001a\u0004\u0018\u00010X2\b\u0010\\\u001a\u0004\u0018\u00010X2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010P\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002\u001a\u0014\u0010a\u001a\u00020\u0005*\u00020\u00052\u0006\u0010b\u001a\u00020cH\u0000\"\u0016\u0010d\u001a\u00020eX\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bf\u0010g\"\u0016\u0010i\u001a\u00020eX\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bj\u0010g\"\u0016\u0010k\u001a\u00020eX\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bl\u0010g¨\u0006m"}, d2 = {"TextField", "", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "onValueChange", "Lkotlin/Function1;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "constraints", "Landroidx/compose/ui/unit/Constraints;", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "density", "calculateHeight-O3s9Psw", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _getBufferRecycler {
    private static final float IconCompatParcelizer = assignParameter.IconCompatParcelizer(20.0f);
    private static final float RemoteActionCompatParcelizer = assignParameter.IconCompatParcelizer(10.0f);
    private static final float AudioAttributesCompatParcelizer = assignParameter.IconCompatParcelizer(2.0f);

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
    /* JADX WARN: Removed duplicated region for block: B:313:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
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
    public static final void IconCompatParcelizer(final java.lang.String r73, final kotlin.getAnswerMap<? super java.lang.String, kotlin.getShowPopup> r74, kotlin._handleOddName r75, boolean r76, boolean r77, kotlin.deserializeWithObjectId r78, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r79, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r80, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r81, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r82, boolean r83, kotlin.addUnresolvedId r84, kotlin.setKeepContentOnPlayerReset r85, kotlin.setErrorMessageProvider r86, boolean r87, int r88, int r89, kotlin.hashCode r90, kotlin.findAndAddVirtualProperties r91, kotlin.FormatSchema r92, kotlin._handleUnrecognizedCharacterEscape r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instruction units count: 1536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._getBufferRecycler.IconCompatParcelizer(java.lang.String, o.getAnswerMap, o._handleOddName, boolean, boolean, o.deserializeWithObjectId, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, boolean, o.addUnresolvedId, o.setKeepContentOnPlayerReset, o.setErrorMessageProvider, boolean, int, int, o.hashCode, o.findAndAddVirtualProperties, o.FormatSchema, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, boolean z, boolean z2, addUnresolvedId addunresolvedid, hashCode hashcode, boolean z3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, findAndAddVirtualProperties findandaddvirtualproperties, FormatSchema formatSchema, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
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
                _validJsonValueList.AudioAttributesCompatParcelizer(-83351293, i2, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:376)");
            }
            FormatFeature.write.RemoteActionCompatParcelizer(str, magicModuleSubmissionRequestBody5, z, z2, addunresolvedid, hashcode, z3, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, findandaddvirtualproperties, formatSchema, null, _handleunrecognizedcharacterescape, (i2 << 3) & 112, CpioConstants.C_ISBLK, 8192);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
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
    /* JADX WARN: Removed duplicated region for block: B:313:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
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
    public static final void AudioAttributesCompatParcelizer(final kotlin.hasValueTypeDeserializer r73, final kotlin.getAnswerMap<? super kotlin.hasValueTypeDeserializer, kotlin.getShowPopup> r74, kotlin._handleOddName r75, boolean r76, boolean r77, kotlin.deserializeWithObjectId r78, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r79, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r80, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r81, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r82, boolean r83, kotlin.addUnresolvedId r84, kotlin.setKeepContentOnPlayerReset r85, kotlin.setErrorMessageProvider r86, boolean r87, int r88, int r89, kotlin.hashCode r90, kotlin.findAndAddVirtualProperties r91, kotlin.FormatSchema r92, kotlin._handleUnrecognizedCharacterEscape r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instruction units count: 1536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._getBufferRecycler.AudioAttributesCompatParcelizer(o.hasValueTypeDeserializer, o.getAnswerMap, o._handleOddName, boolean, boolean, o.deserializeWithObjectId, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, boolean, o.addUnresolvedId, o.setKeepContentOnPlayerReset, o.setErrorMessageProvider, boolean, int, int, o.hashCode, o.findAndAddVirtualProperties, o.FormatSchema, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(hasValueTypeDeserializer hasvaluetypedeserializer, boolean z, boolean z2, addUnresolvedId addunresolvedid, hashCode hashcode, boolean z3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, findAndAddVirtualProperties findandaddvirtualproperties, FormatSchema formatSchema, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
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
                _validJsonValueList.AudioAttributesCompatParcelizer(1565379926, i2, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:566)");
            }
            FormatFeature.write.RemoteActionCompatParcelizer(hasvaluetypedeserializer.AudioAttributesCompatParcelizer(), magicModuleSubmissionRequestBody5, z, z2, addunresolvedid, hashcode, z3, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, findandaddvirtualproperties, formatSchema, null, _handleunrecognizedcharacterescape, (i2 << 3) & 112, CpioConstants.C_ISBLK, 8192);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static final void RemoteActionCompatParcelizer(final _handleOddName _handleoddname, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody2, final getModuleData<? super _handleOddName, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody3, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody4, final boolean z, final float f, final getReturnTransition getreturntransition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1595074580);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getmoduledata) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getreturntransition) ? 67108864 : 33554432;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((38347923 & i2) != 38347922, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1595074580, i2, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:650)");
            }
            boolean z2 = (3670016 & i2) == 1048576;
            boolean z3 = (29360128 & i2) == 8388608;
            boolean z4 = (234881024 & i2) == 67108864;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z2 | z3 | z4) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new enabledByDefault(z, f, getreturntransition);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            tryToResolveUnresolved trytoresolveunresolved = (tryToResolveUnresolved) _handleunrecognizedcharacterescapeWrite.write(getDefaultNullValueSerializer.RatingCompat());
            enabledByDefault enabledbydefault = (enabledByDefault) objOnPause;
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
            NumberOutput.write(_handleunrecognizedcharacterescape2, enabledbydefault, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            if (magicModuleSubmissionRequestBody3 != null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1444611617);
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
                magicModuleSubmissionRequestBody3.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i2 >> 12) & 14));
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1476701825);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (magicModuleSubmissionRequestBody4 != null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1444322883);
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
                magicModuleSubmissionRequestBody4.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i2 >> 15) & 14));
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1476701825);
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
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1443222972);
                getmoduledata.AudioAttributesCompatParcelizer(isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "Hint").AudioAttributesCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer$default), _handleunrecognizedcharacterescapeWrite, Integer.valueOf((i2 >> 6) & 112));
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1476701825);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            if (magicModuleSubmissionRequestBody2 != null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1443101018);
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer = isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "Label").AudioAttributesCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer$default);
                withTypeHandler withtypehandlerWrite3 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
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
                magicModuleSubmissionRequestBody2.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i2 >> 6) & 14));
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1476701825);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer2 = isEnumType.IconCompatParcelizer(_handleOddName.INSTANCE, "TextField").AudioAttributesCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer$default);
            withTypeHandler withtypehandlerWrite4 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), true);
            int iAudioAttributesCompatParcelizer5 = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler5 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer5 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameAudioAttributesCompatParcelizer2);
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
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i2 >> 3) & 14));
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.getCodec
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return _getBufferRecycler.RemoteActionCompatParcelizer(_handleoddname, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, getmoduledata, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, z, f, getreturntransition, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, long j) {
        return PropertyValueBuffer.IconCompatParcelizer(j, i + Math.max(i3, Math.max(i4, i5)) + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, getReturnTransition getreturntransition) {
        float f2 = AudioAttributesCompatParcelizer;
        float read = getreturntransition.getRead();
        float remoteActionCompatParcelizer = getreturntransition.getRemoteActionCompatParcelizer() * f;
        int iMax = Math.max(i, i5);
        return PropertyValueBuffer.RemoteActionCompatParcelizer(j, Math.max(getOnline.RemoteActionCompatParcelizer(z ? i2 + (f2 * f) + iMax + remoteActionCompatParcelizer : (read * f) + iMax + remoteActionCompatParcelizer), Math.max(i3, i4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(_parser.IconCompatParcelizer iconCompatParcelizer, int i, int i2, _parser _parserVar, _parser _parserVar2, _parser _parserVar3, _parser _parserVar4, _parser _parserVar5, boolean z, int i3, int i4, float f, float f2) {
        int iRemoteActionCompatParcelizer;
        if (_parserVar4 != null) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar4, 0, _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar4.getRemoteActionCompatParcelizer(), i2), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        if (_parserVar5 != null) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar5, i - _parserVar5.getRead(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar5.getRemoteActionCompatParcelizer(), i2), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        if (_parserVar2 != null) {
            if (z) {
                iRemoteActionCompatParcelizer = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar2.getRemoteActionCompatParcelizer(), i2);
            } else {
                iRemoteActionCompatParcelizer = getOnline.RemoteActionCompatParcelizer(JsonFactory.read() * f2);
            }
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar2, JsonFactory.read(_parserVar4), iRemoteActionCompatParcelizer - getOnline.RemoteActionCompatParcelizer((iRemoteActionCompatParcelizer - i3) * f), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, JsonFactory.read(_parserVar4), i4, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        if (_parserVar3 != null) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar3, JsonFactory.read(_parserVar4), i4, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer, int i, int i2, _parser _parserVar, _parser _parserVar2, _parser _parserVar3, _parser _parserVar4, boolean z, float f, getReturnTransition getreturntransition) {
        int iRemoteActionCompatParcelizer = getOnline.RemoteActionCompatParcelizer(getreturntransition.getRead() * f);
        if (_parserVar3 != null) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar3, 0, _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar3.getRemoteActionCompatParcelizer(), i2), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        if (_parserVar4 != null) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar4, i - _parserVar4.getRead(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar4.getRemoteActionCompatParcelizer(), i2), BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar, JsonFactory.read(_parserVar3), z ? _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar.getRemoteActionCompatParcelizer(), i2) : iRemoteActionCompatParcelizer, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        if (_parserVar2 != null) {
            if (z) {
                iRemoteActionCompatParcelizer = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver().read(_parserVar2.getRemoteActionCompatParcelizer(), i2);
            }
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, _parserVar2, JsonFactory.read(_parserVar3), iRemoteActionCompatParcelizer, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        }
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, final setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui) {
        final float iconCompatParcelizer = setuncaughtexceptionhandlerui.getIconCompatParcelizer();
        return WriterBasedJsonGenerator.AudioAttributesCompatParcelizer(_handleoddname, new getAnswerMap() { // from class: o.canHandleBinaryNatively
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return _getBufferRecycler.AudioAttributesCompatParcelizer(iconCompatParcelizer, setuncaughtexceptionhandlerui, (findSerializer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(float f, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, findSerializer findserializer) {
        findserializer.write();
        if (assignParameter.IconCompatParcelizer(f, assignParameter.INSTANCE.IconCompatParcelizer())) {
            return getShowPopup.INSTANCE;
        }
        float fIconCompatParcelizer = f * findserializer.getRead();
        float fIntBitsToFloat = Float.intBitsToFloat((int) findserializer.MediaBrowserCompatCustomActionResultReceiver()) - (fIconCompatParcelizer / 2.0f);
        long j = -1;
        long j2 = -1;
        findSetterInfo.IconCompatParcelizer$default(findserializer, setuncaughtexceptionhandlerui.getWrite(), getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), getReferencedType.AudioAttributesCompatParcelizer((Float.floatToRawIntBits(Float.intBitsToFloat((int) (findserializer.MediaBrowserCompatCustomActionResultReceiver() >> 32))) << 32) | (((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(fIntBitsToFloat)))), fIconCompatParcelizer, 0, (setCurrentLength) null, BitmapDescriptorFactory.HUE_RED, (switchAndReturnNext) null, 0, 496, (Object) null);
        return getShowPopup.INSTANCE;
    }

    public static final float read() {
        return IconCompatParcelizer;
    }

    public static final float IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static final float RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(hasValueTypeDeserializer hasvaluetypedeserializer, getAnswerMap getanswermap, _handleOddName _handleoddname, boolean z, boolean z2, deserializeWithObjectId deserializewithobjectid, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, boolean z3, addUnresolvedId addunresolvedid, setKeepContentOnPlayerReset setkeepcontentonplayerreset, setErrorMessageProvider seterrormessageprovider, boolean z4, int i, int i2, hashCode hashcode, findAndAddVirtualProperties findandaddvirtualproperties, FormatSchema formatSchema, int i3, int i4, int i5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i6) {
        AudioAttributesCompatParcelizer(hasvaluetypedeserializer, getanswermap, _handleoddname, z, z2, deserializewithobjectid, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, z3, addunresolvedid, setkeepcontentonplayerreset, seterrormessageprovider, z4, i, i2, hashcode, findandaddvirtualproperties, formatSchema, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), _appendEscaped.RemoteActionCompatParcelizer(i4), i5);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str, getAnswerMap getanswermap, _handleOddName _handleoddname, boolean z, boolean z2, deserializeWithObjectId deserializewithobjectid, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, boolean z3, addUnresolvedId addunresolvedid, setKeepContentOnPlayerReset setkeepcontentonplayerreset, setErrorMessageProvider seterrormessageprovider, boolean z4, int i, int i2, hashCode hashcode, findAndAddVirtualProperties findandaddvirtualproperties, FormatSchema formatSchema, int i3, int i4, int i5, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i6) {
        IconCompatParcelizer(str, getanswermap, _handleoddname, z, z2, deserializewithobjectid, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, z3, addunresolvedid, setkeepcontentonplayerreset, seterrormessageprovider, z4, i, i2, hashcode, findandaddvirtualproperties, formatSchema, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), _appendEscaped.RemoteActionCompatParcelizer(i4), i5);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, getModuleData getmoduledata, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody4, boolean z, float f, getReturnTransition getreturntransition, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        RemoteActionCompatParcelizer(_handleoddname, magicModuleSubmissionRequestBody, magicModuleSubmissionRequestBody2, getmoduledata, magicModuleSubmissionRequestBody3, magicModuleSubmissionRequestBody4, z, f, getreturntransition, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
