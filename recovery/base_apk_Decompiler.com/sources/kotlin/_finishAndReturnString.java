package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radiusX", "Landroidx/compose/ui/unit/Dp;", "radiusY", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radius", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _finishAndReturnString {
    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, float f, float f2, findAndAddVirtualProperties findandaddvirtualproperties) {
        int iRemoteActionCompatParcelizer;
        boolean z;
        if (findandaddvirtualproperties != null) {
            iRemoteActionCompatParcelizer = findContentSerializer.INSTANCE.AudioAttributesCompatParcelizer();
            z = true;
        } else {
            iRemoteActionCompatParcelizer = findContentSerializer.INSTANCE.RemoteActionCompatParcelizer();
            z = false;
        }
        boolean z2 = z;
        return ((assignParameter.write(f, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)) <= 0 || assignParameter.write(f2, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)) <= 0) && !z2) ? _handleoddname : expand.IconCompatParcelizer(_handleoddname, new AnonymousClass4(f, f2, iRemoteActionCompatParcelizer, findandaddvirtualproperties, z2));
    }

    /* JADX INFO: renamed from: o._finishAndReturnString$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/validateAppend;", "", "IconCompatParcelizer", "(Lo/validateAppend;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<validateAppend, getShowPopup> {
        final /* synthetic */ findAndAddVirtualProperties $AudioAttributesCompatParcelizer;
        final /* synthetic */ float $IconCompatParcelizer;
        final /* synthetic */ float $RemoteActionCompatParcelizer;
        final /* synthetic */ boolean $read;
        final /* synthetic */ int $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(validateAppend validateappend) {
            IconCompatParcelizer(validateappend);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(validateAppend validateappend) {
            float fAudioAttributesCompatParcelizer = validateappend.AudioAttributesCompatParcelizer(this.$IconCompatParcelizer);
            float fAudioAttributesCompatParcelizer2 = validateappend.AudioAttributesCompatParcelizer(this.$RemoteActionCompatParcelizer);
            validateappend.IconCompatParcelizer((fAudioAttributesCompatParcelizer <= BitmapDescriptorFactory.HUE_RED || fAudioAttributesCompatParcelizer2 <= BitmapDescriptorFactory.HUE_RED) ? null : findTypeMapping.read(fAudioAttributesCompatParcelizer, fAudioAttributesCompatParcelizer2, this.$write));
            findAndAddVirtualProperties findandaddvirtualproperties = this.$AudioAttributesCompatParcelizer;
            if (findandaddvirtualproperties == null) {
                findandaddvirtualproperties = parseVersion.read();
            }
            validateappend.write(findandaddvirtualproperties);
            validateappend.IconCompatParcelizer(this.$read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(float f, float f2, int i, findAndAddVirtualProperties findandaddvirtualproperties, boolean z) {
            super(1);
            this.$IconCompatParcelizer = f;
            this.$RemoteActionCompatParcelizer = f2;
            this.$write = i;
            this.$AudioAttributesCompatParcelizer = findandaddvirtualproperties;
            this.$read = z;
        }
    }

    public static /* synthetic */ _handleOddName read(_handleOddName _handleoddname, float f, _decodeCharForError _decodecharforerror, int i, Object obj) {
        if ((i & 2) != 0) {
            _decodecharforerror = _decodeCharForError.RemoteActionCompatParcelizer(_decodeCharForError.INSTANCE.RemoteActionCompatParcelizer());
        }
        return RemoteActionCompatParcelizer(_handleoddname, f, _decodecharforerror.getWrite());
    }

    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, float f, findAndAddVirtualProperties findandaddvirtualproperties) {
        return AudioAttributesCompatParcelizer(_handleoddname, f, f, findandaddvirtualproperties);
    }
}
