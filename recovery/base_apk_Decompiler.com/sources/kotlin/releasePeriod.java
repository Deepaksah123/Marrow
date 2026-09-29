package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "<init>", "()V", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapPositionalThreshold", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "BeyondViewportPageCount", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class releasePeriod {
    public static final releasePeriod IconCompatParcelizer = new releasePeriod();

    private releasePeriod() {
    }

    public final performClickableSpanAction RemoteActionCompatParcelizer(final ApicFrame apicFrame, PictureFrame pictureFrame, setOnCloseListener<Float> setoncloselistener, setOrientation<Float> setorientation, final float f, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        boolean z = true;
        if ((i2 & 2) != 0) {
            pictureFrame = PictureFrame.INSTANCE.write(1);
        }
        if ((i2 & 4) != 0) {
            setoncloselistener = setTypeface.write(_handleunrecognizedcharacterescape, 0);
        }
        if ((i2 & 8) != 0) {
            setorientation = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, Float.valueOf(setInvalidated.AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda2.INSTANCE)), 1, null);
        }
        if ((i2 & 16) != 0) {
            f = 0.5f;
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1559769181, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:384)");
        }
        if (BitmapDescriptorFactory.HUE_RED > f || f > 1.0f) {
            getRootStableInsets.RemoteActionCompatParcelizer("snapPositionalThreshold should be a number between 0 and 1. You've specified ".concat(String.valueOf(f)));
        }
        bufferMapProperty buffermapproperty = (bufferMapProperty) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.IconCompatParcelizer());
        final tryToResolveUnresolved trytoresolveunresolved = (tryToResolveUnresolved) _handleunrecognizedcharacterescape.write(getDefaultNullValueSerializer.RatingCompat());
        boolean z2 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(apicFrame)) || (i & 6) == 4;
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setoncloselistener);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setorientation);
        if ((((i & 112) ^ 48) <= 32 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(pictureFrame)) && (i & 48) != 32) {
            z = false;
        }
        boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(buffermapproperty);
        boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(trytoresolveunresolved.ordinal());
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer3 | z | z2 | zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zRemoteActionCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = getInsets.IconCompatParcelizer(consumeStableInsets.write(apicFrame, pictureFrame, new getModuleData() { // from class: o.ImageOutput
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return Float.valueOf(releasePeriod.RemoteActionCompatParcelizer(apicFrame, trytoresolveunresolved, f, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue()));
                }
            }), setoncloselistener, setorientation);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        performClickableSpanAction performclickablespanaction = (performClickableSpanAction) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return performclickablespanaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RemoteActionCompatParcelizer(ApicFrame apicFrame, tryToResolveUnresolved trytoresolveunresolved, float f, float f2, float f3, float f4) {
        return consumeStableInsets.IconCompatParcelizer(apicFrame, trytoresolveunresolved, f, f2, f3, f4);
    }

    public final DatabindException read(ApicFrame apicFrame, superDispatchKeyEvent superdispatchkeyevent, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(877583120, i, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:433)");
        }
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(apicFrame)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(superdispatchkeyevent.ordinal())) && (i & 48) != 32) {
            z = false;
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z2 | z) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new setShuffleOrder(apicFrame, superdispatchkeyevent);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        setShuffleOrder setshuffleorder = (setShuffleOrder) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return setshuffleorder;
    }
}
