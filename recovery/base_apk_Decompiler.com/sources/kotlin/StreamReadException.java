package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a&\u0010\n\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e\u001a0\u0010\n\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0011\u001a:\u0010\n\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0013\u001aD\u0010\n\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0015\u001a>\u0010\n\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u0017\"\u0004\u0018\u00010\u00102\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0018\u001a6\u0010\u0019\u001a\u00020\u00012'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001e\u001a@\u0010\u0019\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001f\u001aJ\u0010\u0019\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010 \u001aT\u0010\u0019\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010!\u001aN\u0010\u0019\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u0017\"\u0004\u0018\u00010\u00102'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\"\u001a\u0018\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001\u001a#\u0010(\u001a\u00020\u001c2\u0013\b\u0006\u0010)\u001a\r\u0012\u0004\u0012\u00020%0\u0003¢\u0006\u0002\b*H\u0087\b¢\u0006\u0002\u0010+\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"SideEffect", "", "effect", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InternalDisposableEffectScope", "Landroidx/compose/runtime/DisposableEffectScope;", "DisposableEffectNoParamError", "", "LaunchedEffectNoParamError", "DisposableEffect", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key1", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "keys", "", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LaunchedEffect", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "createCompositionCoroutineScope", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "composer", "Landroidx/compose/runtime/Composer;", "rememberCoroutineScope", "getContext", "Landroidx/compose/runtime/DisallowComposableCalls;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlinx/coroutines/CoroutineScope;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StreamReadException {
    private static final StreamConstraintsException AudioAttributesCompatParcelizer = new StreamConstraintsException();

    public static final void write(getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:51)");
        }
        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(getcreatedondatems);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
    }

    public static final void RemoteActionCompatParcelizer(Object obj, getAnswerMap<? super StreamConstraintsException, ? extends _wrapError> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new reportOverflowLong(getanswermap);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
    }

    public static final void RemoteActionCompatParcelizer(Object obj, Object obj2, getAnswerMap<? super StreamConstraintsException, ? extends _wrapError> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:190)");
        }
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj2);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new reportOverflowLong(getanswermap);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
    }

    public static final void read(Object obj, Object obj2, Object obj3, getAnswerMap<? super StreamConstraintsException, ? extends _wrapError> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:228)");
        }
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj2);
        boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj3);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new reportOverflowLong(getanswermap);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
    }

    public static final void read(Object[] objArr, getAnswerMap<? super StreamConstraintsException, ? extends _wrapError> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1307627122, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:264)");
        }
        boolean zAudioAttributesCompatParcelizer = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zAudioAttributesCompatParcelizer |= _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj);
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(new reportOverflowLong(getanswermap));
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
    }

    public static final void IconCompatParcelizer(Object obj, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:333)");
        }
        CurrentQuery currentQueryMediaBrowserCompatMediaItem = _handleunrecognizedcharacterescape.MediaBrowserCompatMediaItem();
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new includeRootValue(currentQueryMediaBrowserCompatMediaItem, magicModuleSubmissionRequestBody);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
    }

    public static final void IconCompatParcelizer(Object obj, Object obj2, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:352)");
        }
        CurrentQuery currentQueryMediaBrowserCompatMediaItem = _handleunrecognizedcharacterescape.MediaBrowserCompatMediaItem();
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj2);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new includeRootValue(currentQueryMediaBrowserCompatMediaItem, magicModuleSubmissionRequestBody);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
    }

    public static final void write(Object obj, Object obj2, Object obj3, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:376)");
        }
        CurrentQuery currentQueryMediaBrowserCompatMediaItem = _handleunrecognizedcharacterescape.MediaBrowserCompatMediaItem();
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj2);
        boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj3);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zAudioAttributesCompatParcelizer3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new includeRootValue(currentQueryMediaBrowserCompatMediaItem, magicModuleSubmissionRequestBody);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
    }

    public static final void AudioAttributesCompatParcelizer(Object[] objArr, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:399)");
        }
        CurrentQuery currentQueryMediaBrowserCompatMediaItem = _handleunrecognizedcharacterescape.MediaBrowserCompatMediaItem();
        boolean zAudioAttributesCompatParcelizer = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zAudioAttributesCompatParcelizer |= _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(obj);
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(new includeRootValue(currentQueryMediaBrowserCompatMediaItem, magicModuleSubmissionRequestBody));
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
    }

    public static final TopUserCompanion RemoteActionCompatParcelizer(CurrentQuery currentQuery, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        if (currentQuery.get(setPassingYear.b_) != null) {
            isMockTest ismocktestRemoteActionCompatParcelizer = getUserConfig.RemoteActionCompatParcelizer((setPassingYear) null);
            ismocktestRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return College.AudioAttributesCompatParcelizer(ismocktestRemoteActionCompatParcelizer);
        }
        return new allocTokenBuffer(_handleunrecognizedcharacterescape.MediaBrowserCompatMediaItem(), currentQuery);
    }
}
