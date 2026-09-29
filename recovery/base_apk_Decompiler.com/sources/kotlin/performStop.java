package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/setSharedElementReturnTransition;", "p0", "Lkotlin/Function1;", "Lo/setReenterTransition;", "", "p1", "Lkotlin/Function0;", "Lo/performStart;", "AudioAttributesCompatParcelizer", "(Lo/setSharedElementReturnTransition;Lo/getAnswerMap;Lo/_handleUnrecognizedCharacterEscape;I)Lo/getCreatedOnDateMs;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class performStop {
    public static final getCreatedOnDateMs<performStart> AudioAttributesCompatParcelizer(final setSharedElementReturnTransition setsharedelementreturntransition, getAnswerMap<? super setReenterTransition, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-343736148, i, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:41)");
        }
        final parseDouble parsedouble = _qbuf.read(getanswermap, _handleunrecognizedcharacterescape, (i >> 3) & 14);
        boolean z = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setsharedelementreturntransition)) || (i & 6) == 4;
        r8lambdaUFY5mAmNSw5Bop5Ye76bF6DmHgA r8lambdaufy5mamnsw5bop5ye76bf6dmhgaOnPause = _handleunrecognizedcharacterescape.onPause();
        if (z || r8lambdaufy5mamnsw5bop5ye76bf6dmhgaOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            final performDestroyView performdestroyview = new performDestroyView();
            final parseDouble parsedoubleIconCompatParcelizer = _qbuf.IconCompatParcelizer(_qbuf.read(), new getCreatedOnDateMs() { // from class: o.requireFragmentManager
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return performStop.RemoteActionCompatParcelizer(parsedouble);
                }
            });
            r8lambdaufy5mamnsw5bop5ye76bf6dmhgaOnPause = new r8lambdaUFY5mAmNSw5Bop5Ye76bF6DmHgA(_qbuf.IconCompatParcelizer(_qbuf.read(), new getCreatedOnDateMs() { // from class: o.requireActivity
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return performStop.read(parsedoubleIconCompatParcelizer, setsharedelementreturntransition, performdestroyview);
                }
            })) { // from class: o.performStop.AudioAttributesCompatParcelizer
                @Override // kotlin.r8lambdaUFY5mAmNSw5Bop5Ye76bF6DmHgA, kotlin.ResponseErrorCompanion
                public final Object read() {
                    return ((parseDouble) this.AudioAttributesImplApi26Parcelizer).getRemoteActionCompatParcelizer();
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((Object) r8lambdaufy5mamnsw5bop5ye76bf6dmhgaOnPause);
        }
        ResponseErrorCompanion responseErrorCompanion = (ResponseErrorCompanion) r8lambdaufy5mamnsw5bop5ye76bf6dmhgaOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return responseErrorCompanion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final performMultiWindowModeChanged RemoteActionCompatParcelizer(parseDouble parsedouble) {
        return new performMultiWindowModeChanged((getAnswerMap) parsedouble.getRemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final postponeEnterTransition read(parseDouble parsedouble, setSharedElementReturnTransition setsharedelementreturntransition, performDestroyView performdestroyview) {
        performMultiWindowModeChanged performmultiwindowmodechanged = (performMultiWindowModeChanged) parsedouble.getRemoteActionCompatParcelizer();
        return new postponeEnterTransition(setsharedelementreturntransition, performmultiwindowmodechanged, performdestroyview, new replaceMediaItems(setsharedelementreturntransition.MediaBrowserCompatMediaItem(), performmultiwindowmodechanged));
    }
}
