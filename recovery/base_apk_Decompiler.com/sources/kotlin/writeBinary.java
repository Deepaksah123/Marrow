package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u009f\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0004\b \u0010!\u001a\u0090\u0001\u0010\"\u001a\u00020\u00012\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u001a2\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0002\u0010.\"\u0014\u0010/\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-IlH_yew", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Landroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "DefaultMenuProperties", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/PopupProperties;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class writeBinary {
    private static final withDateFormat AudioAttributesCompatParcelizer = new withDateFormat(true, false, false, false, 14, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(final boolean r37, final kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r38, kotlin._handleOddName r39, long r40, kotlin.setTranslationY r42, kotlin.withDateFormat r43, kotlin.findAndAddVirtualProperties r44, long r45, float r47, float r48, kotlin.setUncaughtExceptionHandlerui r49, final kotlin.getModuleData<? super kotlin.DrawerLayoutLayoutParams, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r50, kotlin._handleUnrecognizedCharacterEscape r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instruction units count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeBinary.RemoteActionCompatParcelizer(boolean, o.getCreatedOnDateMs, o._handleOddName, long, o.setTranslationY, o.withDateFormat, o.findAndAddVirtualProperties, long, float, float, o.setUncaughtExceptionHandlerui, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor, appendReferring appendreferring, appendReferring appendreferring2) {
        inputAccessor.write(findCreatorAnnotation.RemoteActionCompatParcelizer(getDoubleValue.AudioAttributesCompatParcelizer(appendreferring, appendreferring2)));
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ _handleOddName AudioAttributesCompatParcelizer;
        final /* synthetic */ float AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ findAndAddVirtualProperties AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ float AudioAttributesImplBaseParcelizer;
        final /* synthetic */ setCollapseIcon<Boolean> IconCompatParcelizer;
        final /* synthetic */ setTranslationY MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ InputAccessor<findCreatorAnnotation> MediaBrowserCompatItemReceiver;
        final /* synthetic */ getModuleData<DrawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer;
        final /* synthetic */ setUncaughtExceptionHandlerui read;
        final /* synthetic */ long write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) throws Throwable {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) throws Throwable {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
                return;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-917492520, i, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
            }
            getDoubleValue.write(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.write, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer, this.read, this.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescape, (setCollapseIcon.write << 3) | RendererCapabilities.MODE_SUPPORT_MASK);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(_handleOddName _handleoddname, setCollapseIcon<Boolean> setcollapseicon, InputAccessor<findCreatorAnnotation> inputAccessor, setTranslationY settranslationy, findAndAddVirtualProperties findandaddvirtualproperties, long j, float f, float f2, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, getModuleData<? super DrawerLayoutLayoutParams, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata) {
            this.AudioAttributesCompatParcelizer = _handleoddname;
            this.IconCompatParcelizer = setcollapseicon;
            this.MediaBrowserCompatItemReceiver = inputAccessor;
            this.MediaBrowserCompatCustomActionResultReceiver = settranslationy;
            this.AudioAttributesImplApi26Parcelizer = findandaddvirtualproperties;
            this.write = j;
            this.AudioAttributesImplBaseParcelizer = f;
            this.AudioAttributesImplApi21Parcelizer = f2;
            this.read = setuncaughtexceptionhandlerui;
            this.RemoteActionCompatParcelizer = getmoduledata;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write(final kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r24, final kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r25, kotlin._handleOddName r26, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r27, kotlin.MagicModuleSubmissionRequestBody<? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r28, boolean r29, kotlin.getFloatValue r30, kotlin.getReturnTransition r31, kotlin.hashCode r32, kotlin._handleUnrecognizedCharacterEscape r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeBinary.write(o.MagicModuleSubmissionRequestBody, o.getCreatedOnDateMs, o._handleOddName, o.MagicModuleSubmissionRequestBody, o.MagicModuleSubmissionRequestBody, boolean, o.getFloatValue, o.getReturnTransition, o.hashCode, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getCreatedOnDateMs getcreatedondatems, _handleOddName _handleoddname, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody3, boolean z, getFloatValue getfloatvalue, getReturnTransition getreturntransition, hashCode hashcode, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        write(magicModuleSubmissionRequestBody, getcreatedondatems, _handleoddname, magicModuleSubmissionRequestBody2, magicModuleSubmissionRequestBody3, z, getfloatvalue, getreturntransition, hashcode, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(boolean z, getCreatedOnDateMs getcreatedondatems, _handleOddName _handleoddname, long j, setTranslationY settranslationy, withDateFormat withdateformat, findAndAddVirtualProperties findandaddvirtualproperties, long j2, float f, float f2, setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui, getModuleData getmoduledata, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        RemoteActionCompatParcelizer(z, getcreatedondatems, _handleoddname, j, settranslationy, withdateformat, findandaddvirtualproperties, j2, f, f2, setuncaughtexceptionhandlerui, getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2), i3);
        return getShowPopup.INSTANCE;
    }
}
