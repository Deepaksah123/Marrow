package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J;\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\b\u0010\tJa\u0010\r\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\n2\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u000bH&¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/setReenterTransition;", "", "p0", "p1", "Lkotlin/Function1;", "Lo/performDestroy;", "", "p2", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;Ljava/lang/Object;Lo/getModuleData;)V", "", "Lkotlin/Function2;", "p3", "RemoteActionCompatParcelizer", "(ILo/getAnswerMap;Lo/getAnswerMap;Lo/getMagicModuleStat;)V", "read", "(Ljava/lang/Object;Ljava/lang/Object;Lo/getMagicModuleStat;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface setReenterTransition {
    static /* synthetic */ void AudioAttributesCompatParcelizer$default(setReenterTransition setreentertransition, Object obj, Object obj2, getModuleData getmoduledata, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        setreentertransition.AudioAttributesCompatParcelizer(obj, obj2, getmoduledata);
    }

    default void AudioAttributesCompatParcelizer(Object p0, Object p1, getModuleData<? super performDestroy, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p2) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements getAnswerMap {
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();

        public final Void IconCompatParcelizer(int i) {
            return null;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return IconCompatParcelizer(((Number) obj).intValue());
        }

        RemoteActionCompatParcelizer() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void RemoteActionCompatParcelizer$default(setReenterTransition setreentertransition, int i, getAnswerMap getanswermap, getAnswerMap getanswermap2, getMagicModuleStat getmagicmodulestat, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i2 & 2) != 0) {
            getanswermap = null;
        }
        if ((i2 & 4) != 0) {
            getanswermap2 = RemoteActionCompatParcelizer.IconCompatParcelizer;
        }
        setreentertransition.RemoteActionCompatParcelizer(i, getanswermap, getanswermap2, getmagicmodulestat);
    }

    default void RemoteActionCompatParcelizer(int p0, getAnswerMap<? super Integer, ? extends Object> p1, getAnswerMap<? super Integer, ? extends Object> p2, getMagicModuleStat<? super performDestroy, ? super Integer, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p3) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    static /* synthetic */ void read$default(setReenterTransition setreentertransition, Object obj, Object obj2, getMagicModuleStat getmagicmodulestat, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        setreentertransition.read(obj, obj2, getmagicmodulestat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static getShowPopup AudioAttributesCompatParcelizer(getMagicModuleStat getmagicmodulestat, performDestroy performdestroy, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if ((i & 6) == 0) {
            i |= _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(performdestroy) ? 4 : 2;
        }
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 19) != 18, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1691919627, i, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
            }
            getmagicmodulestat.write(performdestroy, 0, _handleunrecognizedcharacterescape, Integer.valueOf((i & 14) | 48));
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    default void read(Object p0, Object p1, final getMagicModuleStat<? super performDestroy, ? super Integer, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p2) {
        AudioAttributesCompatParcelizer(p0, p1, multiplyFft.IconCompatParcelizer(1691919627, true, new getModuleData() { // from class: o.setMenuVisibility
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return setReenterTransition.AudioAttributesCompatParcelizer(p2, (performDestroy) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
            }
        }));
    }
}
